package com.ss.android.lark.dfcore.p1801c;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.morpheus.core.C20208a;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import java.util.Locale;

/* renamed from: com.ss.android.lark.dfcore.c.d */
public class C36606d extends AbstractC36602a implements SplitInstallStateUpdatedListener {
    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: c */
    public void mo135028c() {
        DynamicFeatureUtils.addSplitInstallStateUpdatedListener(this);
    }

    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: d */
    public void mo135029d() {
        DynamicFeatureUtils.removeSplitInstallStateUpdatedListener(this);
    }

    public C36606d(DynamicFeatureTask dynamicFeatureTask) {
        super(dynamicFeatureTask);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m144429b(C20208a aVar) {
        mo135024a(aVar);
    }

    @Override // com.ss.android.lark.dfcore.p1801c.AbstractC36602a
    /* renamed from: a */
    public boolean mo135026a(Activity activity) {
        Locale f;
        if (this.f94177c == null || activity == null || activity.isFinishing() || (f = this.f94177c.mo135056f()) == null) {
            return false;
        }
        try {
            SplitInstallSessionState a = C36607e.m144435a(f.getLanguage());
            if (a != null) {
                return DynamicFeatureUtils.getSplitInstallManager().startConfirmationDialogForResult(a, activity, 8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    public void mo68366a(SplitInstallSessionState splitInstallSessionState) {
        Locale f;
        if (!(splitInstallSessionState.languages().size() <= 0 || this.f94177c == null || (f = this.f94177c.mo135056f()) == null)) {
            for (String str : splitInstallSessionState.languages()) {
                if (TextUtils.equals(new Locale(str).getLanguage(), f.getLanguage())) {
                    C36607e.m144437a(f.getLanguage(), splitInstallSessionState);
                    CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(DynamicFeatureUtils.buildState("com.ss.android.lark.dflanguage", splitInstallSessionState)) {
                        /* class com.ss.android.lark.dfcore.p1801c.$$Lambda$d$Gvs7BRNpXA67TDrE_qhsQcZwvk */
                        public final /* synthetic */ C20208a f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C36606d.this.m144429b(this.f$1);
                        }
                    });
                    return;
                }
            }
        }
    }
}
