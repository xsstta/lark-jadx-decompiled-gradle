package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.io.Serializable;
import java.util.List;

public class UserGroup extends BaseStepInfo implements Serializable {
    @JSONField(name = "subtitle")
    public String subTitle;
    public String title;
    @JSONField(name = "users")
    public List<User> userList;
}
