package com.ss.android.lark.passport.signinsdk_api.idp;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class IdPSettingResponse implements Serializable {
    @JSONField(name = "default_idp_type")
    public String defaultIdpType;
    @JSONField(name = "idp_types")
    public List<String> idpTypes;
}
