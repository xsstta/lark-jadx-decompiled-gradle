package com.lark.falcon.engine.bridge;

import java.lang.reflect.Method;

public class MethodDescriptor {

    /* renamed from: a */
    final Method f59290a;

    /* renamed from: b */
    final String f59291b;

    /* renamed from: c */
    final String f59292c;

    /* renamed from: d */
    final String f59293d;

    public Method getMethod() {
        return this.f59290a;
    }

    public String getName() {
        return this.f59292c;
    }

    public String getSignature() {
        return this.f59291b;
    }

    public String getType() {
        return this.f59293d;
    }

    public MethodDescriptor(Method method, String str, String str2, String str3) {
        this.f59290a = method;
        this.f59291b = str;
        this.f59292c = str2;
        this.f59293d = str3;
    }
}
