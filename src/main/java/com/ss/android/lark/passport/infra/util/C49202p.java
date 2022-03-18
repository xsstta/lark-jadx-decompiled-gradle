package com.ss.android.lark.passport.infra.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.util.p */
public class C49202p {

    /* renamed from: a */
    private static final PassportLog f123501a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static <T> String m193970a(Collection<T> collection) {
        if (collection == null) {
            return "[]";
        }
        return JSON.toJSONString(collection);
    }

    /* renamed from: a */
    public static <T> T m193967a(JSON json, Class<T> cls) {
        if (json == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(json.toJSONString(), cls);
        } catch (Throwable th) {
            PassportLog passportLog = f123501a;
            passportLog.mo171462a("JsonUtils", "parseObject failed, from JSON to Class:" + cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static <T> List<T> m193971b(String str, Class<T> cls) {
        List<T> list = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                list = JSON.parseArray(str, cls);
            }
        } catch (Throwable th) {
            PassportLog passportLog = f123501a;
            passportLog.mo171471d("JsonUtils", "parseArray error=" + th.toString());
        }
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: a */
    public static <T> T m193968a(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Throwable th) {
            PassportLog passportLog = f123501a;
            passportLog.mo171462a("JsonUtils", "parseObject failed, from JSON to Class:" + cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m193969a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, type, new Feature[0]);
        } catch (Throwable th) {
            PassportLog passportLog = f123501a;
            passportLog.mo171462a("JsonUtils", "parseObject failed, from String to Type:" + type, th);
            return null;
        }
    }
}
