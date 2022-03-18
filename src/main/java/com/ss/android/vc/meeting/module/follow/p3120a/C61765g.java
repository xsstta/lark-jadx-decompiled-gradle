package com.ss.android.vc.meeting.module.follow.p3120a;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.follow.FollowInfo;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.g */
public class C61765g extends RelativeLayout {

    /* renamed from: a */
    private TextView f155005a;

    /* renamed from: b */
    private IconFontView f155006b;

    /* renamed from: c */
    private AbstractC61770m f155007c;

    /* renamed from: d */
    private Context f155008d;

    /* renamed from: e */
    private View f155009e;

    /* renamed from: a */
    private void m241216a(View view) {
        this.f155005a = (TextView) view.findViewById(R.id.follow_support_tip_text);
        IconFontView iconFontView = (IconFontView) view.findViewById(R.id.follow_support_tip_close);
        this.f155006b = iconFontView;
        iconFontView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$g$69ygwtrVUGzwYVR4IsysXFlCfs */

            public final void onClick(View view) {
                C61765g.m271252lambda$69ygwtrVUGzwYVR4IsysXFlCfs(C61765g.this, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241217b(View view) {
        AbstractC61770m mVar = this.f155007c;
        if (mVar != null && mVar.mo213996b() != null && this.f155007c.mo213996b().ab().mo213882h() != null) {
            this.f155009e.setVisibility(8);
            this.f155007c.mo213996b().ab().mo213861a(this.f155007c.mo213996b().ab().mo213882h().getShareId());
        }
    }

    /* renamed from: a */
    public void mo213993a(boolean z) {
        if (this.f155009e != null) {
            FollowInfo h = this.f155007c.mo213996b().ab().mo213882h();
            if (h == null || h.getShareType() != FollowInfo.ShareType.UNIVERSAL || !this.f155007c.mo213996b().ab().mo213872b(h.getShareId())) {
                this.f155009e.setVisibility(8);
                return;
            }
            this.f155009e.setVisibility(0);
            if (z) {
                this.f155005a.setText(R.string.View_VM_OthersCanNotFollowOnThisWebPage);
            } else {
                this.f155005a.setText(R.string.View_VM_CanNotFollowOnThisWebPage);
            }
        }
    }

    public C61765g(Context context, View view, AbstractC61770m mVar) {
        super(context);
        this.f155007c = mVar;
        this.f155008d = context;
        m241216a(view);
        this.f155009e = view;
    }
}
