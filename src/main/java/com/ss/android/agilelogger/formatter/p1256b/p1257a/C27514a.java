package com.ss.android.agilelogger.formatter.p1256b.p1257a;

import com.ss.android.agilelogger.formatter.FormatException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.agilelogger.formatter.b.a.a */
public class C27514a implements AbstractC27515b {
    /* renamed from: a */
    public String mo98131a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new FormatException("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            throw new FormatException("JSON should start with { or [, but found " + str);
        } catch (Exception e) {
            throw new FormatException("Parse JSON error. JSON string:" + str, e);
        }
    }
}
