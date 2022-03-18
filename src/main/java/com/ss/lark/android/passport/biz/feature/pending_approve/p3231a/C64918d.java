package com.ss.lark.android.passport.biz.feature.pending_approve.p3231a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.PendingApproveStepInfo;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a;

/* renamed from: com.ss.lark.android.passport.biz.feature.pending_approve.a.d */
public class C64918d extends AbstractC49023c<C64912a.AbstractC64914b.AbstractC64915a> implements C64912a.AbstractC64914b {

    /* renamed from: c */
    private final Activity f163617c;

    /* renamed from: d */
    private C64912a.AbstractC64914b.AbstractC64915a f163618d;

    /* renamed from: e */
    private TextView f163619e;

    /* renamed from: f */
    private TextView f163620f;

    /* renamed from: g */
    private Button f163621g;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163618d = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254934d();
    }

    /* renamed from: d */
    private void m254934d() {
        this.f163619e = (TextView) this.f163617c.findViewById(R.id.proveContentTv);
        this.f163620f = (TextView) this.f163617c.findViewById(R.id.proveTitleTv);
        Button button = (Button) this.f163617c.findViewById(R.id.btn_next);
        this.f163621g = button;
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.$$Lambda$d$wEesrTBcOhE7Jc62HX8BLKNIuI4 */

            public final void onClick(View view) {
                C64918d.this.m254933a((C64918d) view);
            }
        });
    }

    public C64918d(Activity activity) {
        this.f163617c = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m254933a(View view) {
        this.f163618d.mo223924a(view);
    }

    /* renamed from: a */
    public void mo171188a(C64912a.AbstractC64914b.AbstractC64915a aVar) {
        this.f163618d = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a.AbstractC64914b
    /* renamed from: a */
    public void mo223923a(PendingApproveStepInfo pendingApproveStepInfo) {
        if (pendingApproveStepInfo == null) {
            this.f123085b.mo171471d("n_page_pending_approve", "showView stepInfo is null");
            return;
        }
        if (TextUtils.isEmpty(pendingApproveStepInfo.title)) {
            this.f163620f.setVisibility(8);
        } else {
            this.f163620f.setText(pendingApproveStepInfo.title);
            this.f163620f.setVisibility(0);
        }
        if (TextUtils.isEmpty(pendingApproveStepInfo.subtitle)) {
            this.f163619e.setVisibility(8);
        } else {
            this.f163619e.setVisibility(0);
            C49226y.m194061a(this.f163617c, this.f163619e, pendingApproveStepInfo.subtitle, null, this.f123085b);
        }
        if (pendingApproveStepInfo.button != null) {
            this.f163621g.setText(pendingApproveStepInfo.button.text);
            return;
        }
        this.f163621g.setVisibility(8);
        this.f123085b.mo171471d("n_page_pending_approve", "showView stepInfo.nextButton is null");
    }
}
