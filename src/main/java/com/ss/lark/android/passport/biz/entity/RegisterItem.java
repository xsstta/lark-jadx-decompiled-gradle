package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import java.io.Serializable;
import java.util.List;

public class RegisterItem implements Serializable {
    @JSONField(name = "dispatch_list")
    public List<MenuInfo> dispatchList;
    public String title;
}
