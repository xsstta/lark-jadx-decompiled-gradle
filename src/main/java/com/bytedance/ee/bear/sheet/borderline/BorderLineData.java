package com.bytedance.ee.bear.sheet.borderline;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class BorderLineData implements NonProguard {
    private BorderLineParam borderLineParam;
    private String id;
    private String title;

    public static class BorderLineParam implements NonProguard {
        private String[] border;
        private SheetSelectColorData.ColorScheme[] color;
        private DefaultValue defaultValue;

        public String[] getBorder() {
            return this.border;
        }

        public SheetSelectColorData.ColorScheme[] getColor() {
            return this.color;
        }

        public DefaultValue getDefaultValue() {
            return this.defaultValue;
        }

        public void setBorder(String[] strArr) {
            this.border = strArr;
        }

        public void setColor(SheetSelectColorData.ColorScheme[] colorSchemeArr) {
            this.color = colorSchemeArr;
        }

        public void setDefaultValue(DefaultValue defaultValue2) {
            this.defaultValue = defaultValue2;
        }
    }

    public static class DefaultValue implements NonProguard {
        private String border;
        private String color;

        public DefaultValue() {
        }

        public String getBorder() {
            return this.border;
        }

        public String getColor() {
            return this.color;
        }

        public void setBorder(String str) {
            this.border = str;
        }

        public void setColor(String str) {
            this.color = str;
        }

        public DefaultValue(String str, String str2) {
            this.border = str;
            this.color = str2;
        }
    }

    public BorderLineParam getBorderLineParam() {
        return this.borderLineParam;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBorderLineParam(BorderLineParam borderLineParam2) {
        this.borderLineParam = borderLineParam2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public BorderLineParam parseBorderLineParam(String str) {
        try {
            return (BorderLineParam) JSON.parseObject(str, BorderLineParam.class);
        } catch (Throwable th) {
            C13479a.m54758a("BorderLineData", "parse BorderLineData error : " + th);
            return new BorderLineParam();
        }
    }

    public BorderLineData(String str, String str2, BorderLineParam borderLineParam2) {
        this.id = str;
        this.title = str2;
        this.borderLineParam = borderLineParam2;
    }

    public BorderLineData(String str, String str2, String str3) {
        this.id = str;
        this.title = str2;
        this.borderLineParam = parseBorderLineParam(str3);
    }
}
