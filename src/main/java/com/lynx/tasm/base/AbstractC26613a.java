package com.lynx.tasm.base;

import android.util.Log;

/* renamed from: com.lynx.tasm.base.a */
public abstract class AbstractC26613a implements AbstractC26616d {

    /* renamed from: d */
    public int f65882d = 4;

    /* renamed from: a */
    public int mo53791a() {
        return 2;
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: f */
    public void mo53799f(String str, String str2) {
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: b */
    public int mo53794b() {
        return this.f65882d;
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: b */
    public void mo53795b(String str, String str2) {
        m96445a(3, str, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: c */
    public void mo53796c(String str, String str2) {
        m96445a(4, str, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: d */
    public void mo53797d(String str, String str2) {
        m96445a(5, str, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: e */
    public void mo53798e(String str, String str2) {
        m96445a(6, str, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: a */
    public void mo53792a(String str, String str2) {
        m96445a(2, str, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d
    /* renamed from: a */
    public boolean mo53793a(LogSource logSource, int i) {
        if (this.f65882d <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m96445a(int i, String str, String str2) {
        if (str != null && str2 != null) {
            Log.println(i, str, str2);
        }
    }
}
