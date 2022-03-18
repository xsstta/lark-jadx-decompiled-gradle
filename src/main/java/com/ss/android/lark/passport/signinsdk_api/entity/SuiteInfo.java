package com.ss.android.lark.passport.signinsdk_api.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class SuiteInfo implements Serializable {
    public List<ButtonInfo> buttonList;
    @JSONField(name = "subtitle_option")
    public boolean showSubTitleOption;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "title")
    public String title;
}
