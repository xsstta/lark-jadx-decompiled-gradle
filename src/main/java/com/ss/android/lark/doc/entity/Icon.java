package com.ss.android.lark.doc.entity;

import com.bytedance.lark.pb.basic.v1.Icon;
import java.io.Serializable;

public class Icon implements Serializable {
    private int type = Icon.Type.UNKNOWN.getValue();
    private String value = "";

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
