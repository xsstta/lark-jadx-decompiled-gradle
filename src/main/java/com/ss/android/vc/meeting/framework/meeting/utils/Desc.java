package com.ss.android.vc.meeting.framework.meeting.utils;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.vc.meeting.framework.meeting.Description;
import java.io.Serializable;
import java.lang.reflect.Field;

public class Desc implements Serializable {
    public int code;
    public String description;
    public String name;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name);
        if (!TextUtils.isEmpty(this.description)) {
            stringBuffer.append(" ");
            stringBuffer.append(this.description);
        }
        return stringBuffer.toString();
    }

    public static SparseArray<Desc> parserDesc(Class cls) {
        String str;
        SparseArray<Desc> sparseArray = new SparseArray<>();
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null) {
            for (Field field : declaredFields) {
                try {
                    int i = field.getInt(null);
                    String name2 = field.getName();
                    Description description2 = (Description) field.getAnnotation(Description.class);
                    if (description2 != null) {
                        str = description2.desc();
                    } else {
                        str = "";
                    }
                    sparseArray.put(i, new Desc(i, name2, str));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return sparseArray;
    }

    public Desc(int i, String str, String str2) {
        this.code = i;
        this.name = str;
        this.description = str2;
    }
}
