package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a;

import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.preload.C7115c;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.c */
public class C6991c implements AbstractC6995f<DriveCache, C7086a> {

    /* renamed from: a */
    private C7115c f18906a = new C7115c();

    /* renamed from: b */
    private final String f18907b;

    public C6991c(String str) {
        this.f18907b = str;
    }

    /* renamed from: a */
    public C7086a apply(DriveCache driveCache) {
        return C6880a.m27066a(driveCache.mo20337g(), driveCache, this.f18907b);
    }

    /* renamed from: a */
    public C7086a mo27525b(String str, String str2) {
        return this.f18906a.mo27845b(str, str2);
    }
}
