package com.ss.android.lark.dfcore.p1801c;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.morpheus.core.C20208a;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.p1799a.C36596a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36599a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36600b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36601c;
import com.ss.android.lark.dfcore.p1802d.C36612a;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.PermissionConfirmBlankActivity;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.dfcore.c.a */
public abstract class AbstractC36602a {

    /* renamed from: a */
    protected volatile int f94175a;

    /* renamed from: b */
    protected volatile C20208a f94176b;

    /* renamed from: c */
    protected DynamicFeatureTask f94177c;

    /* renamed from: a */
    public abstract boolean mo135026a(Activity activity);

    /* renamed from: c */
    public abstract void mo135028c();

    /* renamed from: d */
    public abstract void mo135029d();

    /* renamed from: a */
    public DynamicFeatureTask mo135023a() {
        return this.f94177c;
    }

    /* renamed from: b */
    public C20208a mo135027b() {
        return this.f94176b;
    }

    /* renamed from: f */
    private void m144409f() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.dfcore.p1801c.$$Lambda$a$pdajd9BPAvJ3AXBj_v5LcvI3ZgM */

            public final void run() {
                AbstractC36602a.this.m144410g();
            }
        });
    }

    /* renamed from: e */
    private void m144408e() {
        Log.m165389i("DFCore", "onCurrentTaskFinished ");
        C36596a a = C36596a.m144376a();
        a.mo135013c();
        a.mo135011b();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m144410g() {
        Activity a;
        DynamicFeatureCore.AbstractC36595a dependency = DynamicFeatureCore.getDependency();
        if (dependency != null && (a = dependency.mo103168a()) != null) {
            Intent intent = new Intent(a, PermissionConfirmBlankActivity.class);
            intent.putExtra("module_name", this.f94177c.mo135040a());
            a.startActivity(intent);
            a.overridePendingTransition(0, 0);
        }
    }

    public AbstractC36602a(DynamicFeatureTask dynamicFeatureTask) {
        this.f94177c = dynamicFeatureTask;
    }

    /* renamed from: a */
    public void mo135025a(DynamicFeatureTask dynamicFeatureTask) {
        DynamicFeatureTask dynamicFeatureTask2 = this.f94177c;
        if (dynamicFeatureTask2 != null && dynamicFeatureTask != null) {
            dynamicFeatureTask2.mo135047a(dynamicFeatureTask);
        }
    }

    /* renamed from: a */
    public synchronized void mo135024a(C20208a aVar) {
        DynamicFeatureTask dynamicFeatureTask = this.f94177c;
        if (dynamicFeatureTask != null) {
            C36612a.m144444a(dynamicFeatureTask, aVar);
            this.f94176b = aVar;
            AbstractC36600b c = this.f94177c.mo135051c();
            AbstractC36599a d = this.f94177c.mo135052d();
            AbstractC36601c e = this.f94177c.mo135054e();
            C36596a.m144376a();
            switch (aVar.mo68385c()) {
                case 0:
                    Log.m165389i("DFCore", "UNKNOWN: " + this.f94177c.mo135040a());
                    this.f94175a = 0;
                    break;
                case 1:
                    Log.m165389i("DFCore", "PENDING: " + this.f94177c.mo135040a());
                    this.f94175a = 1;
                    break;
                case 2:
                    Log.m165389i("DFCore", "DOWNLOADING: " + this.f94177c.mo135040a());
                    if (d != null) {
                        d.mo135016a(this.f94177c, aVar.mo68389f(), aVar.mo68388e());
                    }
                    this.f94175a = 2;
                    break;
                case 3:
                    Log.m165389i("DFCore", "DOWNLOADED: " + this.f94177c.mo135040a());
                    this.f94175a = 3;
                    break;
                case 4:
                    Log.m165389i("DFCore", "INSTALLING: " + this.f94177c.mo135040a());
                    if (d != null) {
                        d.mo135016a(this.f94177c, aVar.mo68389f(), aVar.mo68388e());
                    }
                    this.f94175a = 4;
                    break;
                case 5:
                    Log.m165389i("DFCore", "INSTALLED: " + this.f94177c.mo135040a());
                    m144408e();
                    DynamicFeatureCore.invalideSplitInstallAssetCaches();
                    if (!(this.f94175a == 5 || c == null)) {
                        c.mo135017a(this.f94177c);
                    }
                    this.f94175a = 5;
                    C36605c.m144424a().mo135031a(this.f94177c.mo135040a());
                    break;
                case 6:
                    Log.m165383e("DFCore", "FAILED: " + this.f94177c.mo135040a());
                    Log.m165383e("DFCore", "ErrorCode: " + aVar.mo68390g() + ", module: " + this.f94177c.mo135040a());
                    m144408e();
                    if (!(this.f94175a == 6 || c == null)) {
                        c.mo135018a(this.f94177c, aVar.mo68390g());
                    }
                    this.f94175a = 6;
                    C36605c.m144424a().mo135031a(this.f94177c.mo135040a());
                    break;
                case 7:
                    Log.m165389i("DFCore", "CANCELED: " + this.f94177c.mo135040a());
                    m144408e();
                    if (!(this.f94175a == 7 || c == null)) {
                        c.mo135019b(this.f94177c);
                    }
                    this.f94175a = 7;
                    C36605c.m144424a().mo135031a(this.f94177c.mo135040a());
                    break;
                case 8:
                    Log.m165389i("DFCore", "REQUIRES_USER_CONFIRMATION: " + this.f94177c.mo135040a());
                    m144409f();
                    this.f94175a = 8;
                    break;
                case 9:
                    Log.m165389i("DFCore", "CANCELING: " + this.f94177c.mo135040a());
                    this.f94175a = 9;
                    break;
            }
            if (e != null) {
                e.mo68394a(aVar);
            }
        }
    }
}
