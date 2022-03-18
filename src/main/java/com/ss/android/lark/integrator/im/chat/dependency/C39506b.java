package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.b */
public class C39506b implements AbstractC36473g {
    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: a */
    public String mo134494a() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104067a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: b */
    public int mo134498b() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104075c();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: c */
    public String mo134501c() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104073b();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: a */
    public void mo134496a(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104129a(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: b */
    public void mo134500b(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104130b(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: a */
    public void mo134495a(Context context, String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, (DialogInterface.OnDismissListener) null);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: b */
    public void mo134499b(Context context, String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, (DialogInterface.OnDismissListener) null);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36473g
    /* renamed from: a */
    public boolean mo134497a(String str, boolean z) {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104072a(str, z);
    }
}
