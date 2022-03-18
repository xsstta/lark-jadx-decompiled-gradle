package com.ss.android.vc.meeting.module.prompt;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event2.MeetingCalEvent;

public class CalendarPromptView extends FrameLayout {

    /* renamed from: a */
    private Context f157929a;

    /* renamed from: b */
    private UDShadowLayout f157930b;

    /* renamed from: c */
    private TextView f157931c;

    /* renamed from: d */
    private TextView f157932d;

    /* renamed from: e */
    private TextView f157933e;

    /* renamed from: f */
    private TextView f157934f;

    /* renamed from: g */
    private View f157935g;

    /* renamed from: h */
    private TextView f157936h;

    /* renamed from: i */
    private String f157937i;

    /* renamed from: j */
    private VideoChatPrompt.CalendarStartPrompt f157938j;

    /* renamed from: k */
    private AbstractC62778a f157939k;

    /* renamed from: l */
    private boolean f157940l;

    /* renamed from: m */
    private TextView f157941m;

    /* renamed from: n */
    private LKUILottieAnimationView f157942n;

    /* renamed from: o */
    private LinearLayout f157943o;

    /* renamed from: com.ss.android.vc.meeting.module.prompt.CalendarPromptView$a */
    public interface AbstractC62778a {
        void onClick(String str, boolean z);
    }

    /* renamed from: lambda$i9ra1n5PsynicS__E-75eQmIBxA */
    public static /* synthetic */ void m271391lambda$i9ra1n5PsynicS__E75eQmIBxA(CalendarPromptView calendarPromptView, Activity activity) {
        calendarPromptView.m245663c(activity);
    }

    public String getPromptId() {
        return this.f157937i;
    }

    public String getMeetingId() {
        VideoChatPrompt.CalendarStartPrompt calendarStartPrompt = this.f157938j;
        if (calendarStartPrompt != null) {
            return calendarStartPrompt.meetingId;
        }
        return null;
    }

    /* renamed from: c */
    private boolean m245664c() {
        ViewGroup viewGroup;
        if (getParent() == null || !(getParent() instanceof ViewGroup) || (viewGroup = (ViewGroup) getParent()) == null) {
            return false;
        }
        viewGroup.removeView(this);
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m245666e() {
        if (this.f157942n.isAnimating()) {
            this.f157942n.cancelAnimation();
        }
        if (!m245664c()) {
            setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo216808a() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptView$K72W4WcPxUdgpCR1RHf4_bPli4 */

            public final void run() {
                CalendarPromptView.m271389lambda$K72W4WcPxUdgpCR1RHf4_bPli4(CalendarPromptView.this);
            }
        });
    }

    /* renamed from: d */
    private void m245665d() {
        if (this.f157941m != null) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
            if (kVar == null || kVar.mo212056e() == null || kVar.mo212056e().getVideoChatSettings() == null || kVar.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
                this.f157941m.setText(UIHelper.getString(R.string.View_G_IfAcceptCurrentCallEnds));
            } else {
                this.f157941m.setText(UIHelper.getString(R.string.View_G_SharingWillEndIfJoinMeeting));
            }
        }
    }

    /* renamed from: b */
    private void m245661b() {
        LayoutInflater.from(getContext()).inflate(R.layout.vc_calendar_prompt_layout, (ViewGroup) this, true);
        this.f157930b = (UDShadowLayout) findViewById(R.id.calendar_prompt_shadow_layout);
        this.f157931c = (TextView) findViewById(R.id.tv_cancel_meeting);
        this.f157936h = (TextView) findViewById(R.id.layout_join_meeting);
        this.f157932d = (TextView) findViewById(R.id.tv_meeting_header);
        this.f157933e = (TextView) findViewById(R.id.tv_prompt_name);
        this.f157934f = (TextView) findViewById(R.id.tv_prompt_head);
        this.f157935g = findViewById(R.id.warning_layout);
        this.f157941m = (TextView) findViewById(R.id.tv_hang_up_warn);
        this.f157942n = (LKUILottieAnimationView) findViewById(R.id.prompt_meeting_icon);
        this.f157943o = (LinearLayout) findViewById(R.id.calendar_prompt_content_layout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f157930b.getLayoutParams();
        measure(0, 0);
        int measuredWidth = this.f157943o.getMeasuredWidth();
        int measuredWidth2 = this.f157930b.getMeasuredWidth();
        if (measuredWidth > 0 && measuredWidth2 > 0) {
            int i = (measuredWidth2 - measuredWidth) / 2;
            marginLayoutParams.leftMargin = UIHelper.dp2px(12.0f) - i;
            marginLayoutParams.rightMargin = UIHelper.dp2px(12.0f) - i;
        }
        marginLayoutParams.topMargin = StatusBarUtil.getStatusBarHeight(this.f157929a) + marginLayoutParams.topMargin;
        this.f157930b.setLayoutParams(marginLayoutParams);
        this.f157934f.setText(UIHelper.mustacheFormat((int) R.string.View_M_StartedMeetingNameBraces, "name", ""));
        setClickable(true);
        this.f157931c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptView$ZFwnmreqXnbPmzYsZjaQMKHYY */

            public final void onClick(View view) {
                CalendarPromptView.m271390lambda$ZFwnmreqXnbPmzYsZjaQMKHYY(CalendarPromptView.this, view);
            }
        });
        this.f157936h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptView$zVAFiXvExEFJ4muYF64MVjPvC7I */

            public final void onClick(View view) {
                CalendarPromptView.this.m245658a((CalendarPromptView) view);
            }
        });
        if (DesktopUtil.m144307b()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f157930b.getLayoutParams();
            marginLayoutParams2.width = UIHelper.dp2px(360.0f);
            this.f157930b.setLayoutParams(marginLayoutParams2);
        }
    }

    public CalendarPromptView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private /* synthetic */ void m245663c(Activity activity) {
        m245659a(m245660b(activity));
    }

    /* renamed from: a */
    private /* synthetic */ void m245658a(View view) {
        mo216808a();
        this.f157939k.onClick(this.f157937i, true);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m245662b(View view) {
        mo216808a();
        this.f157939k.onClick(this.f157937i, false);
    }

    /* renamed from: b */
    private FrameLayout m245660b(Activity activity) {
        if (activity == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if (frameLayout != null) {
            return frameLayout;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo216809a(Activity activity) {
        UICallbackExecutor.execute(new Runnable(activity) {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptView$i9ra1n5PsynicS__E75eQmIBxA */
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CalendarPromptView.m271391lambda$i9ra1n5PsynicS__E75eQmIBxA(CalendarPromptView.this, this.f$1);
            }
        });
        MeetingCalEvent.m249778b().mo220268a();
    }

    /* renamed from: a */
    private void m245659a(FrameLayout frameLayout) {
        if (frameLayout != null) {
            m245664c();
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            C60700b.m235851b("PromptLog_CalendarPromptView", "[attach]", "container.locationOnScreen = " + iArr[0] + ", " + iArr[1]);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = -iArr[1];
            frameLayout.addView(this, layoutParams);
        }
    }

    /* renamed from: a */
    public void mo216811a(boolean z) {
        this.f157940l = z;
        if (!z) {
            this.f157935g.setVisibility(8);
            return;
        }
        m245665d();
        this.f157935g.setVisibility(0);
    }

    public CalendarPromptView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarPromptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f157929a = context;
        m245661b();
    }

    /* renamed from: a */
    public void mo216810a(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt, AbstractC62778a aVar) {
        this.f157937i = str;
        this.f157938j = calendarStartPrompt;
        this.f157939k = aVar;
        this.f157932d.setText(calendarStartPrompt.eventTitle);
        this.f157933e.setText(this.f157938j.videoChatUser.getName());
    }
}
