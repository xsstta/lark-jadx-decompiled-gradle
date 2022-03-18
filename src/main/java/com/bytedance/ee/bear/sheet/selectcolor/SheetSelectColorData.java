package com.bytedance.ee.bear.sheet.selectcolor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class SheetSelectColorData implements NonProguard {
    private ColorScheme[] colorSchemeList;
    private String selectedColor;
    private String title;

    public static class ColorScheme implements NonProguard {
        private String[] colorList;
        private String defaultColor;
        private String topicColor;

        public ColorScheme() {
        }

        public String[] getColorList() {
            return this.colorList;
        }

        public String getDefaultColor() {
            return this.defaultColor;
        }

        public String getTopicColor() {
            return this.topicColor;
        }

        public void setColorList(String[] strArr) {
            this.colorList = strArr;
        }

        public void setDefaultColor(String str) {
            this.defaultColor = str;
        }

        public void setTopicColor(String str) {
            this.topicColor = str;
        }

        public ColorScheme(String str, String str2, String[] strArr) {
            this.topicColor = str;
            this.defaultColor = str2;
            this.colorList = strArr;
        }
    }

    public ColorScheme[] getColorSchemeList() {
        return this.colorSchemeList;
    }

    public String getSelectedColor() {
        return this.selectedColor;
    }

    public String getTitle() {
        return this.title;
    }

    public void setColorSchemeList(ColorScheme[] colorSchemeArr) {
        this.colorSchemeList = colorSchemeArr;
    }

    public void setSelectedColor(String str) {
        this.selectedColor = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    private ColorScheme[] parseColorScheme(String[] strArr) {
        ColorScheme colorScheme;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ColorScheme[] colorSchemeArr = new ColorScheme[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                colorScheme = (ColorScheme) JSON.parseObject(strArr[i], ColorScheme.class);
            } catch (Throwable th) {
                C13479a.m54758a("SheetSelectColorData", "parse ColorScheme error : " + th);
                colorScheme = new ColorScheme();
            }
            colorSchemeArr[i] = colorScheme;
        }
        return colorSchemeArr;
    }

    public static String findDefaultColor(ColorScheme[] colorSchemeArr, String str) {
        if (colorSchemeArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (ColorScheme colorScheme : colorSchemeArr) {
            if (str.equalsIgnoreCase(colorScheme.getTopicColor())) {
                return colorScheme.getDefaultColor();
            }
        }
        return null;
    }

    public SheetSelectColorData(String str, String str2, ColorScheme[] colorSchemeArr) {
        this.title = str;
        this.selectedColor = str2;
        this.colorSchemeList = colorSchemeArr;
    }

    public SheetSelectColorData(String str, String str2, String[] strArr) {
        this.title = str;
        this.selectedColor = str2;
        this.colorSchemeList = parseColorScheme(strArr);
    }
}
