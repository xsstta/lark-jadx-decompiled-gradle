package com.bytedance.ee.bear.bitable.card.model.jsmodel;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class TableMetaModel implements NonProguard {
    public ECardType bizType;
    public List<ColorsMap> colors;
    public String currentViewName;
    public Map<String, FieldBean> fields;
    public boolean isPro;
    public String primaryFieldId;
    public boolean recordAddable;
    public String tableName;
    public long timestamp;
    public String transactionId;
    public EViewType viewType;

    public static class ColorsMap implements NonProguard {
        public String color;
        public String id;
        public String textColor;
    }

    public static class FieldBean implements NonProguard {
        public String id;
        public String name;
        public PropertyBean property;
        public boolean required;
        public String title;
        public int type;

        public static class PropertyBean implements NonProguard {
            public boolean autoFill;
            public String baseId;
            public List<String> capture;
            public String dateFormat;
            public Map<String, FieldBean> fields;
            public String formatter;
            public String formula;
            public boolean multiple;
            public List<OptionInfo> options;
            public String primaryFieldId;
            public FieldBean proxyFieldMeta;
            public String tableId;
            public boolean tableVisible = true;
            public String timeFormat;
            public String viewId;

            public static class OptionInfo implements NonProguard {
                public String id;
                @JSONField(name = "color")
                public int index;
                public String name;
            }
        }

        public String getFieldName() {
            String str = this.title;
            if (str != null) {
                return str;
            }
            return this.name;
        }
    }
}
