package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UserItem implements Serializable {
    public ButtonInfo button;
    @JSONField(name = "tag_desc")
    public String tagDesc;
    @JSONField(name = "toast_desc")
    public String toastDesc;
    public int type;
    public User user;

    @Retention(RetentionPolicy.SOURCE)
    public @interface UserItemType {
    }
}
