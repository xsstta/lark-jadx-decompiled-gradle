package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.dialog.C43939b;
import com.ss.android.lark.mail.impl.view.dialog.C43943c;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.b.a */
public class C42784a extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: d */
    static final /* synthetic */ boolean f108954d = true;

    /* renamed from: c */
    public C42787b f108955c;

    /* renamed from: e */
    private FragmentActivity f108956e;

    /* renamed from: f */
    private C42815b f108957f;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m170563f() {
        this.f108957f.onShowKeyboardPanel(this.f108956e);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.$$Lambda$a$2HMA9vyhanTxstG6tWp4cncKXmU */

            public final void run() {
                C42784a.lambda$2HMA9vyhanTxstG6tWp4cncKXmU(C42784a.this);
            }
        }, 50);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (f108954d || activity != null) {
            this.f108956e = activity;
            this.f108957f = (C42815b) aj.m5366a(activity).mo6005a(C42815b.class);
            this.f108955c = (C42787b) aj.m5366a(activity).mo6005a(C42787b.class);
            ArrayList arrayList = new ArrayList();
            List<MailEntSignature> currentUsableSignatureList = this.f108955c.getCurrentUsableSignatureList();
            String currentSignatureId = this.f108955c.getCurrentSignatureId();
            if (!this.f108955c.isCurrentForceApply()) {
                arrayList.add(new C43943c.C43945a(C43819s.m173684a((int) R.string.Mail_BusinessSignature_NoUse), new Runnable() {
                    /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42784a.RunnableC427851 */

                    public void run() {
                        C42784a.this.f108955c.removeEditorSignature();
                    }
                }, "0".equals(currentSignatureId)));
            }
            if (CollectionUtils.isNotEmpty(currentUsableSignatureList)) {
                for (final MailEntSignature mailEntSignature : currentUsableSignatureList) {
                    if (mailEntSignature != null) {
                        arrayList.add(new C43943c.C43945a(mailEntSignature.mo151386b(), new Runnable() {
                            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42784a.RunnableC427862 */

                            public void run() {
                                C42784a.this.f108955c.setEditorSignature(mailEntSignature.mo151380a());
                            }
                        }, mailEntSignature.mo151380a().equals(currentSignatureId)));
                    }
                }
            }
            return C43939b.m174080a(new C43939b.C43942a(getContext()).mo156385a(arrayList).mo156384a(UIHelper.getString(R.string.Mail_BusinessSignature_SelectSignature)));
        }
        throw new AssertionError();
    }
}
