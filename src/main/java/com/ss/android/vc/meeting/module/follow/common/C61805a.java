package com.ss.android.vc.meeting.module.follow.common;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.InMeetingControlPopItemLayout;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.common.a */
public class C61805a extends AbstractC63524a<C61805a> {

    /* renamed from: a */
    private Context f155139a;

    /* renamed from: b */
    private AbstractC61769l f155140b;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.follow_action_more_pop_window);
        mo219688a(true);
        mo219695b(false);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        Context context;
        if ((this.f155139a instanceof Activity) && mo219704l() && (context = this.f155139a) != null && UIUtils.isActivityRunning((Activity) context)) {
            super.mo211398c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m241459c(View view) {
        this.f155140b.mo213991n();
        mo211398c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m241460d(View view) {
        this.f155140b.mo213990m();
        mo211398c();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m241461e(View view) {
        this.f155140b.mo213992o();
        mo211398c();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m241462f(View view) {
        this.f155140b.mo213989l();
        mo211398c();
    }

    /* renamed from: a */
    public void mo214103a(View view) {
        int i;
        mo219702j();
        int measuredWidth = mo219703k().getMeasuredWidth();
        mo219703k().getMeasuredHeight();
        mo219703k().findViewById(R.id.container).getMeasuredWidth();
        int a = (-((C60773o.m236115a(4.0d) + mo219703k().findViewById(R.id.container).getMeasuredHeight()) + view.getHeight())) - C60773o.m236115a(4.0d);
        int a2 = C60776r.m236139a();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        int i2 = measuredWidth / 2;
        int i3 = width - i2;
        if (i3 >= 0 && width + i2 <= a2) {
            i = ((view.getWidth() - measuredWidth) / 2) + 0;
        } else if (i3 < 0) {
            i = 0 + (-C60773o.m236115a(8.0d));
        } else {
            i = 0 + (view.getWidth() - measuredWidth) + C60773o.m236115a(8.0d);
        }
        mo219691a(view, i, a, 8388611);
    }

    /* renamed from: a */
    public static C61805a m241458a(Context context, AbstractC61769l lVar) {
        return new C61805a(context, lVar);
    }

    private C61805a(Context context, AbstractC61769l lVar) {
        mo219694b(context);
        this.f155140b = lVar;
        this.f155139a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, C61805a aVar) {
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_follow_action_refresh);
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout2 = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_follow_action_copylink);
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout3 = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_follow_action_takecontrol);
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout4 = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_follow_action_pass_sharing);
        inMeetingControlPopItemLayout.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        inMeetingControlPopItemLayout2.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        inMeetingControlPopItemLayout3.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        inMeetingControlPopItemLayout4.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        List<Participant> e = ParticipantUtil.m248737e(this.f155140b.mo213988k().mo212091I().mo212494b().mo212601f());
        int i = 0;
        if (this.f155140b.mo213988k().ab().mo213889o()) {
            inMeetingControlPopItemLayout3.setVisibility(8);
            if (this.f155140b.mo213981d() || e.size() <= 1) {
                i = 8;
            }
            inMeetingControlPopItemLayout4.setVisibility(i);
        } else {
            inMeetingControlPopItemLayout4.setVisibility(8);
            if (this.f155140b.mo213981d()) {
                inMeetingControlPopItemLayout3.setVisibility(8);
            } else {
                inMeetingControlPopItemLayout3.setVisibility(0);
            }
        }
        inMeetingControlPopItemLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.common.$$Lambda$a$yA0757_b1we55XEWFmmMG0LlI6I */

            public final void onClick(View view) {
                C61805a.this.m241462f(view);
            }
        });
        inMeetingControlPopItemLayout2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.common.$$Lambda$a$ymkdg792gEEmH8CuQCSL7Qab6Ik */

            public final void onClick(View view) {
                C61805a.this.m241461e(view);
            }
        });
        inMeetingControlPopItemLayout3.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.common.$$Lambda$a$wch8WXA6EhGOXNn_3IdMR7DnQs */

            public final void onClick(View view) {
                C61805a.this.m241460d(view);
            }
        });
        inMeetingControlPopItemLayout4.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.common.$$Lambda$a$xKuMPn7ceNWfC239IeRcOMqxDZk */

            public final void onClick(View view) {
                C61805a.this.m241459c((C61805a) view);
            }
        });
    }
}
