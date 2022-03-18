package com.bytedance.ee.bear.sheet.exportimage.exportshare;

import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ExportShareModel implements NonProguard {
    private String[] types;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExportShareType {
    }

    public String[] getTypes() {
        return this.types;
    }

    public void setTypes(String[] strArr) {
        this.types = strArr;
    }
}
