package com.ss.android.lark.passport.ka.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class ExtraIdentify implements Serializable {
    @JSONField(name = "external_token")
    public String externalToken;
    @JSONField(name = "open_id")
    public String openId;
    @JSONField(name = "refresh_token")
    public String refreshToken;
    @JSONField(name = "refresh_token_expires")
    public String refreshTokenExpires;
    @JSONField(name = "token_expires")
    public String tokenExpires;
}
