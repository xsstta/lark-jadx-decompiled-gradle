package com.bytedance.sdk.bytebridge.base.model;

import com.bytedance.sdk.bridge.annotation.BridgePrivilege;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.bytebridge.base.model.c */
public class C20685c {

    /* renamed from: a */
    private final Method f50612a;

    /* renamed from: b */
    private final String f50613b;
    @BridgePrivilege

    /* renamed from: c */
    private String f50614c;

    /* renamed from: d */
    private final BridgeSyncTypeEnum f50615d;

    /* renamed from: e */
    private final C20686e[] f50616e;

    /* renamed from: a */
    public Method mo69837a() {
        return this.f50612a;
    }

    /* renamed from: b */
    public String mo69838b() {
        return this.f50613b;
    }

    /* renamed from: c */
    public BridgeSyncTypeEnum mo69839c() {
        return this.f50615d;
    }

    /* renamed from: d */
    public C20686e[] mo69840d() {
        return this.f50616e;
    }

    public C20685c(Method method, String str, String str2, BridgeSyncTypeEnum bridgeSyncTypeEnum, C20686e[] eVarArr) {
        this.f50612a = method;
        this.f50613b = str;
        this.f50614c = str2;
        this.f50615d = bridgeSyncTypeEnum;
        this.f50616e = eVarArr;
    }
}
