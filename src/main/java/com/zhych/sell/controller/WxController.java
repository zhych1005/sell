package com.zhych.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WxController {

    @GetMapping("/auth")
    public void auth(String code) {
        log.info("code={}", code);

       /* String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx3faf890bc4bb25a3&secret=2e08a4c297757c74df7bf60856a500bf&code=" + code + "&grant_type=authorization_code";
        */RestTemplate restTemplate = new RestTemplate();
       /* String template = restTemplate.getForObject(url, String.class);*/
        /*log.info("template={}", template);*/
        String uri = "https://api.weixin.qq.com/sns/userinfo?access_token=28_FV0k38BPFeQrCImFM8xHCA1RAi3Bd5bLWnhapHkUlwjaQn9Nw8BG7XD5YfR8jt5T7juzD-SR81LVvxklpNj0BmTLSvyWsqDdVcAFZhEM-38&openid=orgxK6J7CGpj951ccGPeCBENOWrM&lang=zh_CN";
        String template1 = restTemplate.getForObject(uri, String.class);
        log.info("template1={}", template1);
    }
}
