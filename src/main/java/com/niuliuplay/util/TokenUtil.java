package com.niuliuplay.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * @Author liuhuihai
 * @Description
 * @Date :Created in 23:01 2018-05-04
 */
public class TokenUtil {
    private final static String base64Secret = "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=";
    private final static int expiresSecond = 172800000;
    public static final String TOKEN_KEY_NUM = "_TOKEN_NUM";

    /**
     * 验证token是否正确
     * @param req
     * @return
     */
    public static boolean authTokenIsOk(HttpServletRequest req, String token){

        if(StringUtils.isBlank(token)){
            return false;
        }

        HttpSession session = req.getSession();
        String sessionToken = (String)session.getAttribute("token");
        if(StringUtils.equals(sessionToken, token)){
            return true;
        }
        return false;
    }

    /**
     * 验证token是否正确
     * @param req
     * @return
     */
    public static boolean authTokenNumIsOk(HttpServletRequest req, String token){

        if(StringUtils.isBlank(token)){
            return false;
        }
        HttpSession session = req.getSession();
        //记录下验证的次数
        Integer num = (Integer)session.getAttribute("token" + TOKEN_KEY_NUM);
        if(num < 5){
            session.setAttribute("token" + TOKEN_KEY_NUM, num+1);
            return true;
        }
        return false;
    }


    public static Claims parseJWT(String jsonWebToken) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Secret))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        } catch (Exception ex) {
            return null;
        }
    }

    public static String createJWT(String username, String id) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(base64Secret);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("token", "JWT")
                .claim("userName", username)
                .claim("id", id)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token过期时间
        if (expiresSecond >= 0) {
            long expMillis = nowMillis + expiresSecond;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }

        //生成JWT
        return builder.compact();
    }

//    public static void main(String[] args) {
//        String str = createJWT("liu","admim");
//        System.out.println("createJWT:"+str);
//        Claims s = parseJWT(str);
//        System.out.println("parseJWT:"+parseJWT(str));
//        System.out.println(s.get("id"));
//        System.out.println(s.get("userName"));
//    }


}
