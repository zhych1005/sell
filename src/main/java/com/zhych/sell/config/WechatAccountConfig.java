package com.zhych.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    //公众号id
    private String mpAppId;

    //公众号的秘钥
    private String mpAppSecret;

    //商户号
    private String mchId;

    //商户号的证书路径
    private String KeyPath;

    //商户号秘钥
    private String mchKey;
}
