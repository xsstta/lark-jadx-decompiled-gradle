package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.app.initiator.k */
public class C28923k implements AbstractC28915e {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72539a = new AppLauncherTaskScheduler();

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
    }

    C28923k() {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        this.f72539a.mo102769a(new InitBaseComponentTask()).mo102769a(new SpInitorTask()).mo102769a(new InitCrashMonitorTask()).mo102770a(context);
    }
}
