package com.dreamer.edu.controller;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.filter.predefined.DiffuseRippleFilterFactory;
import org.patchca.filter.predefined.DoubleRippleFilterFactory;
import org.patchca.filter.predefined.MarbleRippleFilterFactory;
import org.patchca.filter.predefined.WobbleRippleFilterFactory;
import org.patchca.font.RandomFontFactory;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.patchca.word.AdaptiveRandomWordFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 验证码控制器
 * @since 2013-10-5 下午10:23:54
 * @author broken_xie
 */
@Controller
public class CaptchaController extends BaseController {
    
    /**
     * 生成验证码
     * @return
     * @throws IOException
     * @author broken_xie
     */
    @RequestMapping("/captcha/{time}")
    @ResponseBody
    public String captcha(@PathVariable(value = "time") String time, HttpServletResponse response) throws IOException {
        ConfigurableCaptchaService captchaService = new ConfigurableCaptchaService();
        AdaptiveRandomWordFactory wordFactory = new AdaptiveRandomWordFactory();
        wordFactory.setCharacters("abcdefghigklmnopqrstuvxyz1234567890@#$%&*=");
        wordFactory.setMinLength(4);
        wordFactory.setMaxLength(4);
        RandomFontFactory fontFactory = new RandomFontFactory();
        fontFactory.setMinSize(20);
        fontFactory.setMaxSize(30);
        captchaService.setWordFactory(wordFactory);
        captchaService.setFontFactory(fontFactory);
        captchaService.setColorFactory(new SingleColorFactory(new Color(0, 0, 255)));
        captchaService.setWidth(200);
        captchaService.setHeight(40);
        int n = new Random().nextInt(5);
        switch (n) {
            case 0:
                captchaService.setFilterFactory(new CurvesRippleFilterFactory(captchaService.getColorFactory()));
                break;
            case 1:
                captchaService.setFilterFactory(new DiffuseRippleFilterFactory());
                break;
            case 2:
                captchaService.setFilterFactory(new DoubleRippleFilterFactory());
                break;
            case 3:
                captchaService.setFilterFactory(new MarbleRippleFilterFactory());
                break;
            case 4:
                captchaService.setFilterFactory(new WobbleRippleFilterFactory());
                break;
        }
        OutputStream os = response.getOutputStream();
        EncoderHelper.getChallangeAndWriteImage(captchaService, "png", os);
        os.flush();
        os.close();
        response.flushBuffer();
        return null;
    }
}
