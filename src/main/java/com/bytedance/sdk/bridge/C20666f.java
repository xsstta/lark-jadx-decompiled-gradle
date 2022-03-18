package com.bytedance.sdk.bridge;

import com.bytedance.sdk.bridge.annotation.BridgePrivilege;
import com.bytedance.sdk.bridge.annotation.BridgeSyncType;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.bridge.f */
public class C20666f {

    /* renamed from: a */
    private final Method f50426a;

    /* renamed from: b */
    private final String f50427b;
    @BridgePrivilege

    /* renamed from: c */
    private String f50428c;
    @BridgeSyncType

    /* renamed from: d */
    private final String f50429d;

    /* renamed from: e */
    private final C20667g[] f50430e;

    /* renamed from: a */
    public Method mo69562a() {
        return this.f50426a;
    }

    /* renamed from: b */
    public String mo69563b() {
        return this.f50427b;
    }

    /* renamed from: c */
    public String mo69564c() {
        return this.f50429d;
    }

    /* renamed from: d */
    public C20667g[] mo69565d() {
        return this.f50430e;
    }

    public C20666f(Method method, String str, String str2, String str3, C20667g[] gVarArr) {
        this.f50426a = method;
        this.f50427b = str;
        this.f50428c = str2;
        this.f50429d = str3;
        this.f50430e = gVarArr;
    }
}
