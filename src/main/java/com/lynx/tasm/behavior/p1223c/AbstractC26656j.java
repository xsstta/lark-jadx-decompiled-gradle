package com.lynx.tasm.behavior.p1223c;

import android.util.Log;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.C26690o;

/* renamed from: com.lynx.tasm.behavior.c.j */
public abstract class AbstractC26656j {

    /* renamed from: b */
    protected int f65963b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94608a(C26690o oVar);

    protected AbstractC26656j(int i) {
        this.f65963b = i;
    }

    /* renamed from: b */
    public final void mo94634b(C26690o oVar) {
        try {
            mo94608a(oVar);
        } catch (Exception e) {
            LLog.m96425c(LynxKitALogDelegate.f38587a, "UIOperation: " + Log.getStackTraceString(e));
            oVar.mo94761j().mo94207a(e);
        }
    }
}
