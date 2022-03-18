package com.ss.android.vc.meeting.module.preview.launch;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.launch.C62760a;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.p3069b.C60685h;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;

/* renamed from: com.ss.android.vc.meeting.module.preview.launch.d */
public class C62771d extends AbstractC62715f<C62760a.AbstractC62763b.AbstractC62764a> implements C62760a.AbstractC62763b {

    /* renamed from: Q */
    private View f157909Q;

    @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62763b
    /* renamed from: b */
    public void mo216768b() {
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        this.f157909Q = this.f157822e.findViewById(R.id.title_container);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        m245625D();
        m245624C();
    }

    /* renamed from: D */
    private void m245625D() {
        if (C60685h.f151809a) {
            this.f157824g.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.preview.launch.C62771d.RunnableC627732 */

                public void run() {
                    C62771d.this.mo216543p();
                }
            }, 3000);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62763b
    /* renamed from: a */
    public String mo216765a() {
        String trim = this.f157802F.trim();
        if (this.f157824g.hasFocus()) {
            trim = this.f157824g.getText().toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            return ((C62760a.AbstractC62763b.AbstractC62764a) this.f157821d).mo216769e();
        }
        return trim;
    }

    /* renamed from: C */
    private void m245624C() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f157909Q.getLayoutParams();
        layoutParams.f2831w = UIHelper.dp2px(14.0f);
        layoutParams.f2829u = UIHelper.dp2px(18.0f);
        this.f157909Q.setLayoutParams(layoutParams);
        this.f157824g.setVisibility(0);
        this.f157825h.setVisibility(0);
        if (!DesktopUtil.m144301a((Context) this.f157819b)) {
            mo216690v();
        }
        this.f157824g.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.preview.launch.$$Lambda$d$UBxxX0kqS6oagjZ38kV74QO1lzQ */

            public final void onFocusChange(View view, boolean z) {
                C62771d.this.m245626a((C62771d) view, (View) z);
            }
        });
        this.f157824g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.launch.C62771d.C627721 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MeetingPreEvent.m249851a().mo220326a(C62771d.this.f157820c.mo216603e());
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: p */
    public void mo216543p() {
        String e = this.f157820c.mo216603e();
        int i = 1;
        if (this.f157820c.mo216599a() == 1) {
            i = 0;
        }
        MeetingCheckUtils.meetingCheck(ar.m236694a(), "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, "preview_launch_view_confirm_click", e, Integer.valueOf(i), false).subscribe(new MeetingPreviewLaunchView$3(this, TimeConsumeUtils.m248927a("MeetingPreviewLaunchView@:onConfirmJoinClicked:MeetingCheck"), e));
        MeetingPreEvent.m249851a().mo220340c(this.f157820c.mo216603e(), this.f157805I);
    }

    C62771d(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245626a(View view, boolean z) {
        if (z) {
            this.f157824g.setText(this.f157802F);
            this.f157825h.setBackground(C60773o.m236128f(R.color.primary_pri_500));
            MeetingPreEvent.m249851a().mo220326a(this.f157820c.mo216603e());
            return;
        }
        this.f157802F = this.f157824g.getText().toString();
        this.f157824g.setText(mo216682b(this.f157802F));
        this.f157825h.setBackground(C60773o.m236128f(R.color.line_border_component));
    }
}
