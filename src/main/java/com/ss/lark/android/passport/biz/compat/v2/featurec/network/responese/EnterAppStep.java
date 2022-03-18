package com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import java.util.List;

public class EnterAppStep extends BaseStepInfo {
    @JSONField(name = "toast")
    public String toast;
    @JSONField(name = "user_list")
    public List<ResponseUser> userList;
}
