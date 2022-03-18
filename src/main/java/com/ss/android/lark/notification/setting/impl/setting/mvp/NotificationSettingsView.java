package com.ss.android.lark.notification.setting.impl.setting.mvp;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.p2379c.C48432a;
import com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a;
import com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView;
import com.ss.android.lark.notification.setting.impl.setting.view.NotifyDetailSettingView;
import com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView;
import com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView;
import com.ss.android.lark.notification.statistics.NotificationSettingHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.switch_button.SwitchButton;
import java.util.HashMap;

public class NotificationSettingsView implements C48616a.AbstractC48619b {

    /* renamed from: a */
    public NewNotificationSettingView f122262a;

    /* renamed from: b */
    public C48616a.AbstractC48619b.AbstractC48620a f122263b;

    /* renamed from: c */
    public final AbstractC48615a f122264c;

    /* renamed from: d */
    public String f122265d;

    /* renamed from: e */
    private final Activity f122266e;
    View mBadgeStyleView;
    TextView mBadgeTip;
    TextView mDesktopTitleBar;
    View mGuidanceEntry;
    View mMeetingUndisturbedView;
    MuteOnPCLoginView mMuteOptionView;
    View mNotificationGuidance;
    FrameLayout mNotificationSettingWrapper;
    TextView mNotificationTip;
    NotifyDetailSettingView mNotifyDetailSettingView;
    SoundsAndVibrationSettingView mSoundAndVibrationSettingView;
    CommonTitleBar mTitleBar;
    SwitchButton mUndisturbedSwitcher;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView$a */
    public interface AbstractC48615a {
        /* renamed from: a */
        void mo169719a();

        /* renamed from: a */
        void mo169720a(Context context);

        /* renamed from: a */
        void mo169721a(NotificationSettingV2 notificationSettingV2);

        /* renamed from: a */
        void mo169722a(NotificationSettingsView notificationSettingsView);

        /* renamed from: a */
        void mo169723a(String str);

        /* renamed from: b */
        void mo169724b(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169728a() {
        this.mMuteOptionView.mo169808a();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: b */
    public void mo169735b() {
        this.mMuteOptionView.mo169810b();
    }

    /* renamed from: g */
    private void m191610g() {
        this.mMuteOptionView.setOnMuteOptionSwitchListener(new MuteOnPCLoginView.AbstractC48644a() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486127 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView.AbstractC48644a
            /* renamed from: a */
            public void mo169758a(boolean z) {
                NotificationSettingHitPoint.f122128a.mo169613a(!z);
                NotificationSettingsView.this.f122263b.mo169781c(z);
            }

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView.AbstractC48644a
            /* renamed from: b */
            public void mo169759b(boolean z) {
                NotificationSettingHitPoint.f122128a.mo169615b(z);
                NotificationSettingsView.this.f122263b.mo169782d(z);
            }
        });
    }

    /* renamed from: h */
    private void m191611h() {
        this.mNotifyDetailSettingView.setOnNotifyDetailSwitchListener(new NotifyDetailSettingView.AbstractC48649a() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486138 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.NotifyDetailSettingView.AbstractC48649a
            /* renamed from: a */
            public void mo169760a(boolean z) {
                NotificationSettingsView.this.f122263b.mo169779a(z);
            }
        });
    }

    /* renamed from: k */
    private void m191614k() {
        this.mUndisturbedSwitcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AnonymousClass10 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NotificationSettingsView.this.f122263b.mo169780b(z);
            }
        });
    }

    /* renamed from: m */
    private void m191616m() {
        this.mNotificationGuidance.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (NotificationSettingsView.this.f122265d == null) {
                    C53241h.m205894a("NotificationView", "rom tip is null");
                    return;
                }
                NotificationSettingHitPoint.f122128a.mo169622i();
                NotificationSettingsView.this.f122264c.mo169724b(NotificationSettingsView.this.f122265d);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f122264c.mo169722a(this);
        m191606c();
    }

    /* renamed from: c */
    private void m191606c() {
        m191609f();
        m191610g();
        m191611h();
        m191612i();
        m191607d();
        m191614k();
        m191613j();
        m191615l();
        m191616m();
    }

    /* renamed from: d */
    private void m191607d() {
        m191608e();
        this.mNotificationSettingWrapper.addView(this.f122262a);
        this.mBadgeTip.setVisibility(8);
    }

    /* renamed from: f */
    private void m191609f() {
        this.mBadgeStyleView.findViewById(R.id.undisturbed_style).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.View$OnClickListenerC486116 */

            public void onClick(View view) {
                NotificationSettingsView.this.f122264c.mo169719a();
            }
        });
    }

    /* renamed from: e */
    private void m191608e() {
        NewNotificationSettingView newNotificationSettingView = new NewNotificationSettingView(this.f122266e);
        this.f122262a = newNotificationSettingView;
        newNotificationSettingView.setOptionSelectClickListener(new NewNotificationSettingView.AbstractC48664c() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486061 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.AbstractC48664c
            /* renamed from: a */
            public void mo169748a(NotificationSettingV2 notificationSettingV2) {
                NotificationSettingsView.this.f122264c.mo169721a(NotificationSettingsView.this.f122262a.getNotificationSettingV2());
            }
        });
        this.f122262a.setOnItemClickListener(new NewNotificationSettingView.AbstractC48663b() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486094 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.AbstractC48663b
            /* renamed from: a */
            public void mo169755a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
                NotificationSettingsView.this.mo169739c(notificationSettingV2);
                NotificationSettingsView.this.f122263b.mo169777a(notificationSettingV2, iGetDataCallback);
            }
        });
        this.f122262a.setOnItemChosenListener(new NewNotificationSettingView.AbstractC48662a() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486105 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.AbstractC48662a
            /* renamed from: a */
            public void mo169756a(NotificationSettingV2 notificationSettingV2) {
                if (notificationSettingV2.isAll()) {
                    NotificationSettingsView.this.mBadgeTip.setVisibility(8);
                } else {
                    NotificationSettingsView.this.mBadgeTip.setVisibility(0);
                }
            }
        });
    }

    /* renamed from: i */
    private void m191612i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put(0, "normal_v2");
        hashMap.put(1, "ding_v2");
        hashMap.put(2, "at_v2");
        this.mSoundAndVibrationSettingView.setup(hashMap);
        this.mSoundAndVibrationSettingView.setOnItemSelectListener(new SoundsAndVibrationSettingView.AbstractC48653a() {
            /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486149 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView.AbstractC48653a
            /* renamed from: a */
            public void mo169761a(String str) {
                NotificationSettingsView.this.f122263b.mo169778a(str);
            }
        });
    }

    /* renamed from: j */
    private void m191613j() {
        if (!DesktopUtil.m144301a((Context) this.f122266e)) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        this.mDesktopTitleBar.setText(R.string.Lark_NewSettings_NewMessageNotifications);
    }

    /* renamed from: l */
    private void m191615l() {
        if (DesktopUtil.m144301a((Context) this.f122266e)) {
            int dp2px = UIUtils.dp2px(this.f122266e, 16.0f);
            m191603a(this.mBadgeTip, dp2px, -1);
            this.mBadgeTip.setTextSize(12.0f);
            m191603a(this.mNotificationTip, dp2px, -1);
            this.mNotificationTip.setTextSize(12.0f);
            float f = (float) 16;
            float f2 = (float) 4;
            this.mNotificationTip.setPadding(UIHelper.dp2px(f), 0, 0, UIHelper.dp2px(f2));
            this.mBadgeStyleView.findViewById(R.id.top_divider).setVisibility(8);
            this.mBadgeStyleView.findViewById(R.id.bottom_divider).setVisibility(8);
            View findViewById = this.mBadgeStyleView.findViewById(R.id.undisturbed_style);
            findViewById.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            m191603a(findViewById, dp2px, this.f122266e.getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop));
            ((TextView) this.mBadgeStyleView.findViewById(R.id.undisturbed_style_tv)).setTextSize(14.0f);
            View findViewById2 = this.mMeetingUndisturbedView.findViewById(R.id.meeting_undisturbed_style);
            findViewById2.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            m191603a(findViewById2, dp2px, this.f122266e.getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop));
            ((TextView) this.mMeetingUndisturbedView.findViewById(R.id.meeting_undisturbed_label)).setTextSize(14.0f);
            this.mGuidanceEntry.findViewById(R.id.notification_guidance).setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            m191603a(this.mNotificationGuidance, dp2px, this.f122266e.getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop));
            ((TextView) this.mGuidanceEntry.findViewById(R.id.guidance_text)).setTextSize(14.0f);
            TextView textView = (TextView) this.mGuidanceEntry.findViewById(R.id.notes);
            textView.setTextSize(12.0f);
            textView.setPadding(UIHelper.dp2px(f), 0, 0, UIHelper.dp2px(f2));
            m191603a(this.mMuteOptionView, dp2px, -1);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C48616a.AbstractC48619b.AbstractC48620a aVar) {
        this.f122263b = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: c */
    public void mo169740c(boolean z) {
        this.mMuteOptionView.mo169812c(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: d */
    public void mo169741d(boolean z) {
        this.mMuteOptionView.mo169816g(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: e */
    public void mo169742e(boolean z) {
        this.mMuteOptionView.mo169814e(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: f */
    public void mo169743f(boolean z) {
        this.mMuteOptionView.mo169815f(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: g */
    public void mo169744g(boolean z) {
        this.mMuteOptionView.mo169811b(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: h */
    public void mo169745h(boolean z) {
        this.mMuteOptionView.mo169809a(z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169729a(Context context) {
        this.f122264c.mo169720a(context);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: b */
    public void mo169736b(NotificationSettingV2 notificationSettingV2) {
        this.f122262a.setData(notificationSettingV2);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: i */
    public void mo169746i(boolean z) {
        if (this.mUndisturbedSwitcher.isChecked() != z) {
            this.mUndisturbedSwitcher.setChecked(z);
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: b */
    public void mo169737b(String str) {
        this.f122264c.mo169723a(str);
    }

    /* renamed from: j */
    public void mo169747j(boolean z) {
        View findViewById = this.mMuteOptionView.findViewById(R.id.mute_option);
        View findViewById2 = this.mMuteOptionView.findViewById(R.id.extra_option);
        m191605a(findViewById, z);
        m191605a(findViewById2, z);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: b */
    public void mo169738b(boolean z) {
        this.mMuteOptionView.mo169813d(z);
    }

    /* renamed from: c */
    public void mo169739c(NotificationSettingV2 notificationSettingV2) {
        if (notificationSettingV2.isAll()) {
            NotificationSettingHitPoint.f122128a.mo169610a();
        } else if (notificationSettingV2.isNone()) {
            NotificationSettingHitPoint.f122128a.mo169614b();
        } else {
            NotificationSettingHitPoint.f122128a.mo169611a(notificationSettingV2);
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169730a(C48432a aVar) {
        if (aVar == null) {
            this.mGuidanceEntry.setVisibility(8);
            return;
        }
        NotificationSettingHitPoint.f122128a.mo169621h();
        this.mGuidanceEntry.setVisibility(0);
        this.f122265d = aVar.mo169438b();
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169731a(NotificationSettingV2 notificationSettingV2) {
        this.mSoundAndVibrationSettingView.mo169831a(notificationSettingV2);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169733a(String str) {
        LKUIToast.show(this.f122266e, str);
    }

    @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.C48616a.AbstractC48619b
    /* renamed from: a */
    public void mo169734a(boolean z) {
        this.mNotifyDetailSettingView.mo169829a(z);
    }

    public NotificationSettingsView(Activity activity, AbstractC48615a aVar) {
        this.f122264c = aVar;
        this.f122266e = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m191604a(View view, ValueAnimator valueAnimator) {
        view.getBackground().setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: a */
    private void m191605a(final View view, boolean z) {
        long j;
        if (z) {
            view.getBackground().mutate();
            ValueAnimator ofArgb = ValueAnimator.ofArgb(UIUtils.getColor(view.getContext(), R.color.ud_Y100), UIUtils.getColor(view.getContext(), R.color.bg_body));
            ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.$$Lambda$NotificationSettingsView$0jQU3MVM04iX8iszKwjzhrQpQEc */
                public final /* synthetic */ View f$0;

                {
                    this.f$0 = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    NotificationSettingsView.lambda$0jQU3MVM04iX8iszKwjzhrQpQEc(this.f$0, valueAnimator);
                }
            });
            if (z) {
                j = 3000;
            } else {
                j = 500;
            }
            ofArgb.setDuration(j);
            ofArgb.setInterpolator(new TimeInterpolator() {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486072 */

                public float getInterpolation(float f) {
                    return ((double) f) <= 0.5d ? BitmapDescriptorFactory.HUE_RED : (f * 2.0f) - 1.0f;
                }
            });
            ofArgb.setEvaluator(new ArgbEvaluator());
            ofArgb.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.C486083 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    view.getBackground().setTintList(null);
                }
            });
            ofArgb.start();
        }
    }

    /* renamed from: a */
    private void m191603a(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        if (i2 > 0) {
            marginLayoutParams.height = i2;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
