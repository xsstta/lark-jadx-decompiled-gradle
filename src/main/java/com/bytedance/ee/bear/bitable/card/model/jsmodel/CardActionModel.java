package com.bytedance.ee.bear.bitable.card.model.jsmodel;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardsAction;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Map;

public class CardActionModel implements NonProguard {
    public ECardsAction action;
    public DataBean data;
    public long timestamp;
    public String transactionId;

    public static class DataBean implements NonProguard {
        public String baseId;
        @JSONField(name = "fieldId")
        public String focusFieldId;
        public int highLightType;
        public String recordId;
        public String tableId;
        public String topFieldId;
        @JSONField(name = "fields")
        public Map<String, ErrorBean> validateFields;
        public String viewId;

        public @interface HighLightType {
        }
    }

    public static class ErrorBean implements NonProguard {
        public int errorCode;
        public String errorMsg;
    }

    public String toString() {
        return "CardActionModel{action=" + this.action + '}';
    }
}
