package com.emart.gatewayzuul.core.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description: Jwt配置
 **/
@Data
public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.buyer_url:/user/buyer}")
    private String buyer_register;

    @Value("${security.jwt.seller_url:/seller/register}")
    private String seller_register;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;
}
