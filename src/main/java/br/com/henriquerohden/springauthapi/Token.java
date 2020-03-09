package br.com.henriquerohden.springauthapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Token {

    private String type;
    private String key;
}