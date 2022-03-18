package com.ss.android.lark.auditsdk;

import com.ss.android.lark.auditsdk.authorization.AuthorizationService;
import com.ss.android.lark.auditsdk.authorization.IAuthorizationService;
import com.ss.android.lark.auditsdk.p1379b.C29393b;
import com.ss.android.lark.auditsdk.wrapper.AuditService;

/* renamed from: com.ss.android.lark.auditsdk.a */
public class C29385a {

    /* renamed from: a */
    private static volatile IAuditModuleDependency f73461a;

    /* renamed from: a */
    public static IAuditModuleDependency m108005a() {
        return f73461a;
    }

    /* renamed from: b */
    public void mo104054b() {
        C29393b.m108086a().mo104121b();
    }

    /* renamed from: c */
    public void mo104055c() {
        C29393b.m108086a().mo104124e();
    }

    /* renamed from: d */
    public IAuditService mo104056d() {
        return AuditService.f73498b.mo104137a();
    }

    /* renamed from: e */
    public IAuthorizationService mo104057e() {
        return AuthorizationService.f73471b.mo104081a();
    }

    public C29385a(IAuditModuleDependency bVar) {
        f73461a = bVar;
    }
}
