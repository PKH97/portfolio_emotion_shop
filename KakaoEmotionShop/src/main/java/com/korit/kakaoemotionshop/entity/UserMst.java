package com.korit.kakaoemotionshop.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserMst {

    @ApiModelProperty(hidden = true)
    private int userId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message = "영문,숫자조합으로 5~20 자로 작성해주세요")
    @ApiModelProperty(name = "username", value = "사용자이름", example = "abc", required = true)
    private String username;

    @NotBlank
    @ApiModelProperty(name = "password", value = "비밀번호", example = "1234", required = true)
    private String password;

    @NotBlank
    @ApiModelProperty(name = "repassword", value = "비밀번호 확인", example = "1234", required = true)
    private String repassword;

    @NotBlank
    @Pattern(regexp = "^[가-힇]{2,5}$",message = "2~5자인 한글로 작성해주세요")
    @ApiModelProperty(name = "name", value = "성명", example = "김카카오", required = true)
    private String name;

    @NotBlank
    @Email
    @ApiModelProperty(name = "email", value = "이메일", example = "abc@gmail.com", required = true)
    private String email;

    @ApiModelProperty(name = "provider", value = "OAuth데이터출처", example = "Kakao", required = false)
    private String provider;

    @ApiModelProperty(hidden = true)
    private LocalDateTime createDate;
    @ApiModelProperty(hidden = true)
    private LocalDateTime updateDate;

    @ApiModelProperty(hidden = true)
    private List<RoleDtl> roleDtl;
}