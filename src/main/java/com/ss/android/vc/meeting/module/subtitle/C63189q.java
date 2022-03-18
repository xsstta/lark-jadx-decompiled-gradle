package com.ss.android.vc.meeting.module.subtitle;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.q */
public class C63189q extends FrameLayout {

    /* renamed from: a */
    private FrameLayout f159293a;

    /* renamed from: b */
    private C63187p f159294b;

    /* renamed from: c */
    private boolean f159295c = false;

    /* renamed from: d */
    private AbstractC61429i f159296d;

    /* renamed from: e */
    private boolean f159297e = false;

    /* renamed from: f */
    private TextView f159298f;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public AbstractC61429i getPresent() {
        return this.f159296d;
    }

    public C63187p getSubtitleProvider() {
        return this.f159294b;
    }

    /* renamed from: c */
    public void mo218723c() {
        this.f159294b.mo218705a();
    }

    /* renamed from: b */
    public void mo218722b() {
        this.f159294b.mo218710b();
        this.f159298f.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        C60700b.m235843a("SubtitleView2@", "onAttachedToWindow", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C60700b.m235843a("SubtitleView2@", "onDetachedFromWindow", "onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private void m247464d() {
        LayoutInflater.from(getContext()).inflate(R.layout.subtitle_push_view2, (ViewGroup) this, true);
        this.f159293a = (FrameLayout) findViewById(R.id.subtitle_list);
        this.f159297e = C60776r.m236143a(C60773o.m236124b(this.f159296d.mo212916a()));
        C63187p pVar = new C63187p(getContext(), this, this.f159296d.mo212921f());
        this.f159294b = pVar;
        pVar.mo218708a(this.f159297e);
        this.f159293a.addView(this.f159294b.mo218712c(), new FrameLayout.LayoutParams(-1, -1));
        this.f159298f = (TextView) findViewById(R.id.tv_see_subtitle_history);
        mo218717a();
    }

    /* renamed from: a */
    public void mo218717a() {
        C63187p pVar = this.f159294b;
        if (pVar != null) {
            pVar.mo218711b(this.f159296d.mo212921f().mo212107Y().mo218566e());
            if (CollectionUtils.isNotEmpty(this.f159296d.mo212921f().mo212107Y().mo218566e())) {
                this.f159298f.setVisibility(8);
            } else {
                this.f159298f.setVisibility(0);
            }
        }
        mo218718a(this.f159296d.mo212921f().mo212107Y().mo218564d());
    }

    public void setHisOpenListener(View.OnClickListener onClickListener) {
        this.f159294b.mo218713d().mo218645a(onClickListener);
    }

    public C63189q(AbstractC61429i iVar) {
        super(iVar.mo212916a());
        this.f159296d = iVar;
        m247464d();
        C60700b.m235851b("SubtitleView2@", "[init]", "SubtitleView");
    }

    /* renamed from: a */
    public void mo218718a(InMeetingData.SubtitleStatusData.Status status) {
        if (status == InMeetingData.SubtitleStatusData.Status.STATUS_UNKNOWN || status == InMeetingData.SubtitleStatusData.Status.OPEN_SUCCESS || status == InMeetingData.SubtitleStatusData.Status.OPEN_FAILED || status == InMeetingData.SubtitleStatusData.Status.EXCEPTION) {
            setVisibility(8);
        } else if (status == InMeetingData.SubtitleStatusData.Status.RECOVERABLE_EXCEPTION || status == InMeetingData.SubtitleStatusData.Status.RECOVER_SUCCESS || status == InMeetingData.SubtitleStatusData.Status.SUBTITLE_RECV) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo218719a(MeetingSubtitleData meetingSubtitleData) {
        if (this.f159294b != null) {
            mo218718a(this.f159296d.mo212921f().mo212107Y().mo218564d());
            this.f159294b.mo218706a(meetingSubtitleData);
            if (meetingSubtitleData != null) {
                this.f159298f.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public void mo218720a(boolean z, InMeetingData.SubtitleStatusData.Status status) {
        if (!z) {
            setVisibility(8);
        } else {
            mo218718a(status);
        }
    }

    /* renamed from: a */
    public void mo218721a(boolean z, boolean z2) {
        C63187p pVar;
        C60700b.m235851b("SubtitleView2@", "[onOrientation]", "isLandscape = [" + z + "], isRotate = [" + z2 + "]");
        if (!(this.f159297e == z || !z2 || (pVar = this.f159294b) == null)) {
            pVar.mo218711b(this.f159296d.mo212921f().mo212107Y().mo218566e());
            if (CollectionUtils.isNotEmpty(this.f159296d.mo212921f().mo212107Y().mo218566e())) {
                this.f159298f.setVisibility(8);
            } else {
                this.f159298f.setVisibility(0);
            }
        }
        this.f159297e = z;
        C63187p pVar2 = this.f159294b;
        if (pVar2 != null) {
            pVar2.mo218708a(z);
        }
    }
}
