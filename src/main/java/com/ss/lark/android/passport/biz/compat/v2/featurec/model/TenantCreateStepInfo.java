package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TenantCreateStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "from_guide")
    public boolean fromGuide;
    public String img;
    @JSONField(name = "industry_type_input")
    public InputInfo industryTypeInput;
    @JSONField(name = "industry_type_list")
    public List<IndustryTypeList> industryTypeList;
    @JSONField(name = "name_input")
    public InputInfo nameInput;
    @JSONField(name = "next_button")
    public NextButtonInfo nextButton;
    @JSONField(name = "staff_size_input")
    public InputInfo staffSizeInput;
    @JSONField(name = "staff_size_list")
    public List<CommonList> staffSizeList;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "tenant_name_input")
    public InputInfo tenantNameInput;
    @JSONField(name = "tenant_type")
    public int tenantType;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "user_id")
    public String userId;
    @JSONField(name = "user_unit")
    public String userUnit;

    public static class CommonList implements Serializable {
        public String code;
        @JSONField(name = "i18n")
        public String commonContent;
    }

    public static class IndustryTypeList implements Serializable {
        @JSONField(name = "children")
        public List<CommonList> childrenList = new ArrayList();
        public String code;
        @JSONField(name = "i18n")
        public String industryInfo;
    }

    public static class InputInfo implements Serializable {
        @JSONField(name = "placeholder")
        public String placeHolder;
    }

    public static class NextButtonInfo implements Serializable {
        @JSONField(name = "icon_url")
        public String iconUrl;
        public String next;
        public String text;
    }
}
