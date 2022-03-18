package com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class AuthTicketData implements Serializable {
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "ticket")
    public String ticket;
}
