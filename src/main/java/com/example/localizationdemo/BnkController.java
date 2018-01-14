package com.example.localizationdemo;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class BnkController {
    private MessageSource messageSource;

    public BnkController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/myFavorite-memberOfBNK48")
    public String msg(@RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("myFavorite.memberOfBNK48", null, locale);
    }
}
