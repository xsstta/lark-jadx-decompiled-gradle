package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.InMeetingData;

public class SubtitleStatusBar extends FrameLayout {

    /* renamed from: a */
    public TextView f159067a;

    /* renamed from: b */
    private LottieLoadingView f159068b;

    public static ViewGroup.MarginLayoutParams getLoadingLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo218547a() {
        LottieLoadingView lottieLoadingView = this.f159068b;
        if (lottieLoadingView != null) {
            lottieLoadingView.cancelAnimation();
        }
    }

    /* renamed from: b */
    private void m247185b() {
        LayoutInflater.from(getContext()).inflate(R.layout.subtitle_status_view_bar, (ViewGroup) this, true);
        this.f159067a = (TextView) findViewById(R.id.tv_subtitle_status_text);
        this.f159068b = (LottieLoadingView) findViewById(R.id.subtitle_loading);
    }

    public SubtitleStatusBar(Context context) {
        this(context, null);
    }

    public void setOnHisOpenListener(final View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.SubtitleStatusBar.View$OnClickListenerC631201 */

                public void onClick(View view) {
                    if (SubtitleStatusBar.this.f159067a.getText().equals(C60773o.m236119a((int) R.string.View_G_ListeningEllipsis)) || SubtitleStatusBar.this.f159067a.getText().equals(C60773o.m236119a((int) R.string.View_G_Reconnecting))) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo218551a(boolean z) {
        if (z) {
            findViewById(R.id.subtitle_status_content).setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
        }
    }

    /* renamed from: a */
    public void mo218550a(InMeetingData.SubtitleStatusData.Status status) {
        C60700b.m235851b("SubtitleStatusBar", "[updateHisStatus]", "updateHisStatus " + status);
        if (status == InMeetingData.SubtitleStatusData.Status.EXCEPTION || status == InMeetingData.SubtitleStatusData.Status.OPEN_FAILED) {
            setVisibility(8);
        } else if (status == InMeetingData.SubtitleStatusData.Status.OPEN_SUCCESS) {
            setVisibility(8);
        } else if (status == InMeetingData.SubtitleStatusData.Status.RECOVERABLE_EXCEPTION) {
            setVisibility(0);
            this.f159067a.setText(C60773o.m236119a((int) R.string.View_G_Reconnecting));
        } else if (status == InMeetingData.SubtitleStatusData.Status.SUBTITLE_RECV) {
            setVisibility(8);
        } else if (status == InMeetingData.SubtitleStatusData.Status.RECOVER_SUCCESS) {
            setVisibility(8);
        } else {
            setVisibility(8);
        }
        if (this.f159068b == null) {
            return;
        }
        if (getVisibility() == 0) {
            this.f159068b.setColor(-1);
            if (!this.f159068b.isAnimating()) {
                this.f159068b.playAnimation();
            }
        } else if (this.f159068b.isAnimating()) {
            this.f159068b.pauseAnimation();
        }
    }

    public SubtitleStatusBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo218548a(ViewGroup viewGroup, InMeetingData.SubtitleStatusData.Status status) {
        if (status == InMeetingData.SubtitleStatusData.Status.EXCEPTION || status == InMeetingData.SubtitleStatusData.Status.OPEN_FAILED) {
            C60740ad.m236044a((View) this);
        } else if (status == InMeetingData.SubtitleStatusData.Status.STATUS_UNKNOWN) {
            this.f159067a.setText(C60773o.m236119a((int) R.string.View_G_TurningSubtitlesOn));
            C60740ad.m236045a(this, viewGroup, getLoadingLayoutParams());
        } else if (status == InMeetingData.SubtitleStatusData.Status.OPEN_SUCCESS) {
            this.f159067a.setText(C60773o.m236119a((int) R.string.View_G_ListeningEllipsis));
            C60740ad.m236045a(this, viewGroup, getLoadingLayoutParams());
        } else if (status == InMeetingData.SubtitleStatusData.Status.RECOVERABLE_EXCEPTION) {
            this.f159067a.setText(C60773o.m236119a((int) R.string.View_G_Reconnecting));
            C60740ad.m236045a(this, viewGroup, getLoadingLayoutParams());
        } else if (status == InMeetingData.SubtitleStatusData.Status.RECOVER_SUCCESS) {
            C60740ad.m236044a((View) this);
        } else if (status == InMeetingData.SubtitleStatusData.Status.SUBTITLE_RECV) {
            C60740ad.m236044a((View) this);
        } else {
            C60740ad.m236044a((View) this);
        }
    }

    public SubtitleStatusBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247185b();
    }

    /* renamed from: a */
    public void mo218549a(ViewGroup viewGroup, boolean z, InMeetingData.SubtitleStatusData.Status status) {
        if (z) {
            mo218548a(viewGroup, status);
            if (this.f159068b != null && getVisibility() == 0) {
                this.f159068b.setColor(C60773o.m236126d(R.color.primary_pri_500));
                if (!this.f159068b.isAnimating()) {
                    this.f159068b.playAnimation();
                    return;
                }
                return;
            }
            return;
        }
        C60740ad.m236044a((View) this);
    }
}
