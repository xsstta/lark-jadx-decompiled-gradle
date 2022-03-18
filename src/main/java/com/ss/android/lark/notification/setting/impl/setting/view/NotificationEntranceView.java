package com.ss.android.lark.notification.setting.impl.setting.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.p2379c.C48432a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.setting.AbstractC54113a;
import com.ss.android.lark.utils.UIHelper;

public class NotificationEntranceView extends ConstraintLayout implements AbstractC54113a {

    /* renamed from: a */
    public boolean f122325a = true;

    /* renamed from: b */
    public C48432a f122326b;

    /* renamed from: c */
    public AbstractC48647a f122327c;

    /* renamed from: d */
    protected boolean f122328d;
    @BindView(7661)
    TextView mDescView;
    @BindView(6828)
    TextView mEntranceText;
    @BindView(7257)
    View mNextDivider;
    @BindView(7662)
    View mNotificationCloseTipView;
    @BindView(7733)
    TextView mNotificationTipText;
    @BindView(7291)
    View mNotifyTipEntranceView;
    @BindView(7564)
    View mSettingEntranceView;
    @BindView(7632)
    TextView mStatusView;
    @BindView(7766)
    View mTopDivider;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView$a */
    public interface AbstractC48647a {
        /* renamed from: a */
        void mo169668a();

        /* renamed from: a */
        void mo169669a(String str);

        /* renamed from: b */
        void mo169670b();
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: d */
    public void mo169825d(boolean z) {
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: a */
    public boolean mo169821a() {
        if (this.mTopDivider.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: b */
    public boolean mo169823b() {
        if (this.mNextDivider.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m191760c() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_setting_notification_entrance2, this));
        this.mStatusView.setText(R.string.Lark_NewSettings_NewMessageNotificationGoToEnableMobile);
        m191761d();
        this.mSettingEntranceView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView.View$OnClickListenerC486451 */

            public void onClick(View view) {
                if (NotificationEntranceView.this.f122327c == null) {
                    return;
                }
                if (NotificationEntranceView.this.f122325a) {
                    NotificationEntranceView.this.f122327c.mo169670b();
                } else {
                    NotificationEntranceView.this.f122327c.mo169668a();
                }
            }
        });
        if (DesktopUtil.m144301a(getContext())) {
            ViewGroup.LayoutParams layoutParams = this.mSettingEntranceView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop);
                this.mSettingEntranceView.setLayoutParams(layoutParams);
            }
            this.mEntranceText.setTextSize(14.0f);
            this.mNotificationTipText.setTextSize(14.0f);
            ViewGroup.LayoutParams layoutParams2 = this.mTopDivider.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = 0;
                this.mTopDivider.setLayoutParams(layoutParams2);
            }
        }
        this.mNotifyTipEntranceView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView.View$OnClickListenerC486462 */

            public void onClick(View view) {
                if (NotificationEntranceView.this.f122327c == null) {
                    return;
                }
                if (NotificationEntranceView.this.f122326b == null || TextUtils.isEmpty(NotificationEntranceView.this.f122326b.mo169438b())) {
                    C53241h.m205894a("NotificationEntrance", "rom info is null or rom tip is null");
                } else {
                    NotificationEntranceView.this.f122327c.mo169669a(NotificationEntranceView.this.f122326b.mo169438b());
                }
            }
        });
    }

    /* renamed from: d */
    private void m191761d() {
        int i;
        int i2 = 8;
        if (this.f122326b == null) {
            this.mNotifyTipEntranceView.setVisibility(8);
        } else {
            this.mNotifyTipEntranceView.setVisibility(0);
            this.mNotificationTipText.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_NewMessageNotificationSettingsGoToHCMobile, "notify_tip", this.f122326b.mo169437a()));
        }
        View view = this.mNotificationCloseTipView;
        if (this.f122325a) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        TextView textView = this.mDescView;
        if (!this.f122325a) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(UIUtils.getColorStateList(getContext(), R.color.bg_color_setting_item));
        this.mSettingEntranceView.setBackground(gradientDrawable);
        mo169824c(true);
    }

    public void setOnEntranceClickListener(AbstractC48647a aVar) {
        this.f122327c = aVar;
    }

    /* renamed from: a */
    public void mo169819a(C48432a aVar) {
        this.f122326b = aVar;
        m191761d();
    }

    public NotificationEntranceView(Context context) {
        super(context);
        m191760c();
    }

    /* renamed from: a */
    public void mo169820a(boolean z) {
        this.f122325a = z;
        m191761d();
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: b */
    public void mo169822b(boolean z) {
        if (z) {
            this.mTopDivider.setVisibility(8);
        } else {
            this.mNextDivider.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: c */
    public void mo169824c(boolean z) {
        int i;
        this.f122328d = z;
        if (this.mSettingEntranceView.getBackground() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.mSettingEntranceView.getBackground();
            int dp2px = UIUtils.dp2px(getContext(), 10.0f);
            boolean z2 = this.f122328d;
            if (z2) {
                i = dp2px;
            } else {
                i = 0;
            }
            if (!z2) {
                dp2px = 0;
            }
            float f = (float) i;
            float f2 = (float) dp2px;
            float f3 = (float) 0;
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f3, f3});
            this.mSettingEntranceView.invalidate();
        }
    }

    public NotificationEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191760c();
    }

    public NotificationEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191760c();
    }
}
