package com.bytedance.ee.bear.bitable.card.model.jsmodel;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class TableDataModel implements NonProguard {
    public List<RecordsBean> records;
    public long timestamp;
    public String transactionId;

    public static class RecordsBean implements NonProguard {
        public boolean deletable;
        public boolean editable;
        public List<ContentBean> fields;
        public String headerBarColor;
        public boolean isFiltered;
        public String recordId;
        public boolean visible;

        public static class ContentBean implements NonProguard {
            public boolean editable;
            @JSONField(name = "id")
            public String fieldId;
            public Object fieldValue;
            public int type;
            public EFieldUneditableReason uneditableReason;
        }

        public String toString() {
            return "recordId= " + this.recordId;
        }
    }

    public String toString() {
        return "TableDataModel{, records=" + this.records + '}';
    }
}
