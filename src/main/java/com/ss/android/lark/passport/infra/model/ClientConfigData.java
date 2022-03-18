package com.ss.android.lark.passport.infra.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class ClientConfigData implements Serializable {
    @JSONField(name = "disable_rust_get_did")
    public boolean disableRustGetDid;
}
