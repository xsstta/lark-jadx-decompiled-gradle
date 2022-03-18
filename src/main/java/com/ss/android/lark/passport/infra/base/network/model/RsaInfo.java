package com.ss.android.lark.passport.infra.base.network.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class RsaInfo implements Serializable {
    @JSONField(name = "public_key")
    public String publicKey;
    @JSONField(name = "rsa_token")
    public String rsaToken;
}
