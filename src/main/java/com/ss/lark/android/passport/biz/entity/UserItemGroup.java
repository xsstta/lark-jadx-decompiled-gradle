package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class UserItemGroup implements Serializable {
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "user_list")
    public List<UserItem> userList;
}
