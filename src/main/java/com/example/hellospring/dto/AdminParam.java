package com.example.hellospring.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * Created by yoogo on 2020-03-10
 */
@Data
public class AdminParam {
    @NotNull
    private String username;

    @URL
    private String icon;

    @NotNull
    @Email
    private String email;

    private String nickName;

    private String note;

    @Range(min=0, max=1)
    private Integer status;
}
