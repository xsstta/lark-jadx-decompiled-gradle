package com.ss.android.lark.calendar.impl.features.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32654h;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.Arrays;
import java.util.List;

public class CalendarSettingView implements AbstractC32460d.AbstractC32463b {

    /* renamed from: a */
    public AbstractC32460d.AbstractC32463b.AbstractC32464a f82944a;

    /* renamed from: b */
    private AbstractC32381a f82945b;

    /* renamed from: c */
    private Context f82946c;

    /* renamed from: d */
    private boolean f82947d;

    /* renamed from: e */
    private List<String> f82948e = Arrays.asList(C32634ae.m125183c(R.array.calendar_alternate_setting));
    ViewGroup mAccountManager;
    TextView mAllDayAlertTv;
    ViewGroup mAllDayReminderContainer;
    LinearLayout mAlternateCalendarContainer;
    TextView mAlternateCalendarTV;
    TextView mAlternateCalendarTv;
    TextView mDefaultDurationTv;
    ViewGroup mEventColorMode;
    TextView mEventColorTv;
    ViewGroup mEventDuration;
    ViewGroup mFirstDayOfWeek;
    TextView mFirstDayTv;
    FrameLayout mFragmentContainer;
    TextView mNormalAlertTv;
    ViewGroup mReminderContainer;
    UDSwitch mSwitchDeclineInvitationReminder;
    UDSwitch mSwitchViewOnlyAcceptReminder;
    UDSwitch mSwitchViewShowPastMask;
    UDSwitch mSwitchViewShowRejectEvents;
    CommonTitleBar mTitleBar;
    TextView mTvAccountManager;
    TextView mTvAllDayReminderTime;
    TextView mTvEnableWorkHour;
    TextView mTvEventColorMode;
    TextView mTvEventDuration;
    TextView mTvFirstDayOfWeek;
    TextView mTvGoSettingPage;
    TextView mTvReminderTime;
    TextView mTvTimeZone;
    ViewGroup mWorkHourSetting;
    TextView mWorkHourTv;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView$a */
    public interface AbstractC32381a {
        /* renamed from: a */
        void mo118283a();

        /* renamed from: a */
        void mo118284a(AbstractC32460d.AbstractC32463b bVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b
    /* renamed from: b */
    public int mo118269b() {
        return this.mFragmentContainer.getId();
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m123594f() {
        C32654h.m125317a().mo120350a(this.mTvAccountManager, 9);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b
    /* renamed from: a */
    public void mo118265a() {
        this.f82945b.mo118283a();
        this.f82944a.mo118571h();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC32381a aVar = this.f82945b;
        if (aVar != null) {
            aVar.mo118284a(this);
        }
        m123591c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mTvAccountManager.post(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.settings.$$Lambda$CalendarSettingView$u_bQQotl7BG2DA2sKxWwRo5mFCE */

            public final void run() {
                CalendarSettingView.lambda$u_bQQotl7BG2DA2sKxWwRo5mFCE(CalendarSettingView.this);
            }
        });
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView$7 */
    public static /* synthetic */ class C323787 {

        /* renamed from: a */
        static final /* synthetic */ int[] f82961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.AlternateCalendar.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323787.f82961a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.AlternateCalendar.NONE_CALENDAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323787.f82961a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.AlternateCalendar.CHINESE_LUNAR_CALENDAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323787.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m123592d() {
        int screenWidth = (int) (((double) DeviceUtils.getScreenWidth(this.mNormalAlertTv.getContext())) * 0.6d);
        this.mNormalAlertTv.setMaxWidth(screenWidth);
        this.mAllDayAlertTv.setMaxWidth(screenWidth);
        this.mDefaultDurationTv.setMaxWidth(screenWidth);
        this.mFirstDayTv.setMaxWidth(screenWidth);
        this.mWorkHourTv.setMaxWidth(screenWidth);
        this.mEventColorTv.setMaxWidth(screenWidth);
        this.mAlternateCalendarTv.setMaxWidth(screenWidth);
    }

    /* renamed from: e */
    private void m123593e() {
        this.mTitleBar.setVisibility(0);
        this.mTitleBar.setTitle(R.string.Calendar_NewSettings_Calendar);
        this.mTitleBar.setMainTitleTextStyle(1);
        this.mTitleBar.setLeftVisible(true);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.View$OnClickListenerC323776 */

            public void onClick(View view) {
                CalendarSettingView.this.mo118265a();
            }
        });
        if (!this.f82947d) {
            this.mTitleBar.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        }
    }

    /* renamed from: c */
    private void m123591c() {
        m123593e();
        m123592d();
        this.mReminderContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.View$OnClickListenerC323721 */

            public void onClick(View view) {
                CalendarSettingView.this.f82944a.mo118560a();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mAllDayReminderContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.View$OnClickListenerC323798 */

            public void onClick(View view) {
                CalendarSettingView.this.f82944a.mo118562b();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mEventDuration.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.View$OnClickListenerC323809 */

            public void onClick(View view) {
                CalendarSettingView.this.f82944a.mo118564c();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mFirstDayOfWeek.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass10 */

            public void onClick(View view) {
                CalendarHitPoint.m124167z();
                CalendarSettingView.this.f82944a.mo118566d();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mWorkHourSetting.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass11 */

            public void onClick(View view) {
                CalendarHitPoint.m124109K();
                CalendarSettingView.this.f82944a.mo118568e();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mEventColorMode.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass12 */

            public void onClick(View view) {
                CalendarSettingView.this.f82944a.mo118569f();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        this.mAlternateCalendarContainer.setVisibility(0);
        this.mAlternateCalendarContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass13 */

            public void onClick(View view) {
                CalendarSettingView.this.f82944a.mo118570g();
                CalendarSettingView.this.mFragmentContainer.setVisibility(0);
            }
        });
        Context context = this.f82946c;
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, UDColorUtils.getColor(context, R.color.ud_B500));
        int dp2px = UIUtils.dp2px(this.mTvGoSettingPage.getContext(), 12.0f);
        iconDrawable.setBounds(0, 0, dp2px, dp2px);
        this.mTvGoSettingPage.setCompoundDrawables(null, null, iconDrawable, null);
        this.mTvGoSettingPage.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass14 */

            public void onClick(View view) {
                GeneralHitPoint.m124239d();
                CalendarSettingView.this.f82944a.mo118572i();
            }
        });
        this.mSwitchViewShowPastMask.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AnonymousClass15 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    CalendarSettingView.this.f82944a.mo118561a(true);
                } else {
                    CalendarSettingView.this.f82944a.mo118561a(false);
                }
                CalendarSettingHitPoint.m124371b("lower_ended_event_brightness");
            }
        });
        this.mSwitchViewShowRejectEvents.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323732 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    CalendarSettingView.this.f82944a.mo118563b(true);
                } else {
                    CalendarSettingView.this.f82944a.mo118563b(false);
                }
                CalendarSettingHitPoint.m124371b("show_rejected_event");
            }
        });
        this.mSwitchViewOnlyAcceptReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323743 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    CalendarSettingView.this.f82944a.mo118565c(true);
                    GeneralHitPoint.m124256k("on");
                } else {
                    CalendarSettingView.this.f82944a.mo118565c(false);
                }
                CalendarSettingHitPoint.m124371b("only_notify_accepted_event");
            }
        });
        this.mSwitchDeclineInvitationReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323754 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    CalendarSettingView.this.f82944a.mo118567d(true);
                } else {
                    CalendarSettingView.this.f82944a.mo118567d(false);
                }
                CalendarSettingHitPoint.m124371b("remind_me_of_event_rejection");
            }
        });
        this.mAccountManager.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
            /* class com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.C323765 */

            @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
            /* renamed from: a */
            public void mo108751a(View view) {
                CalendarSettingView.this.f82944a.mo118573j();
                CalendarSettingHitPoint.m124371b("calendar_tripartite_manage");
            }
        });
        C32654h.m125317a().mo120351a(this.mTvAccountManager, RedDotUiItem.ItemName.UI_ITEM_CAL_IMPORT);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC32460d.AbstractC32463b.AbstractC32464a aVar) {
        this.f82944a = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b
    /* renamed from: a */
    public void mo118268a(String str) {
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f82946c, str);
        }
    }

    /* renamed from: a */
    private String m123590a(CalendarSetting.AlternateCalendar alternateCalendar) {
        int i = C323787.f82961a[alternateCalendar.ordinal()];
        if (i == 1) {
            return this.f82948e.get(0);
        }
        if (i != 2) {
            return this.f82948e.get(0);
        }
        return this.f82948e.get(1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b
    /* renamed from: a */
    public void mo118266a(CalendarSettingViewData calendarSettingViewData) {
        this.mTvReminderTime.setText(calendarSettingViewData.getReminder());
        this.mTvAllDayReminderTime.setText(calendarSettingViewData.getAllDayReminder());
        this.mTvEventDuration.setText(calendarSettingViewData.getEventDuration());
        this.mTvFirstDayOfWeek.setText(calendarSettingViewData.getFirstDayOfWeek());
        this.mTvTimeZone.setText(calendarSettingViewData.getTimeZone());
        this.mTvEventColorMode.setText(calendarSettingViewData.getSkinTypeStringId());
        this.mSwitchViewShowPastMask.setChecked(calendarSettingViewData.isShowPastEventsMask());
        this.mSwitchViewShowRejectEvents.setChecked(calendarSettingViewData.isShowRejectEvent());
        this.mSwitchViewOnlyAcceptReminder.setChecked(calendarSettingViewData.isOnlyAcceptReminder());
        this.mSwitchDeclineInvitationReminder.setChecked(calendarSettingViewData.isDeclineInvitationReminder());
        this.mTvEnableWorkHour.setText(calendarSettingViewData.getEnableWorkHourStr());
        this.mAlternateCalendarTV.setText(m123590a(calendarSettingViewData.getDisplayAlternateCalendar()));
    }

    public CalendarSettingView(Context context, AbstractC32381a aVar, boolean z) {
        this.f82946c = context;
        this.f82945b = aVar;
        this.f82947d = z;
    }
}
