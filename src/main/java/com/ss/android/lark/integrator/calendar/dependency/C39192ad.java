package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ad */
public class C39192ad implements AbstractC30035ae {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: a */
    public void mo108178a(String str, int i) {
        C57744a.m224104a().putInt(str, i);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: a */
    public void mo108179a(String str, String str2) {
        C57744a.m224104a().putString(str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: b */
    public int mo108180b(String str, int i) {
        return C57744a.m224104a().getInt(str, i);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: c */
    public int mo108182c(String str, int i) {
        return UserSP.getInstance().getInt(str, i);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: b */
    public String mo108181b(String str, String str2) {
        return C57744a.m224104a().getString(str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae
    /* renamed from: c */
    public String mo108183c(String str, String str2) {
        return UserSP.getInstance().getString(str, str2);
    }
}
