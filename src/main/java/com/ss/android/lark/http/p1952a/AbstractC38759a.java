package com.ss.android.lark.http.p1952a;

import android.text.TextUtils;
import com.ss.android.lark.http.p1953b.C38760a;
import java.lang.reflect.ParameterizedType;

/* renamed from: com.ss.android.lark.http.a.a */
public abstract class AbstractC38759a<T> {
    /* renamed from: b */
    public T mo107503b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) C38760a.m153056a(str, (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }
}
