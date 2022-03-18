package com.ss.android.lark.setting.page.v1.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.setting.SettingDividerView;
import com.ss.android.lark.setting.page.v1.p2672a.C54554a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

public class NotificationEntranceView extends ConstraintLayout {

    /* renamed from: a */
    public boolean f134901a = true;

    /* renamed from: b */
    public C54554a f134902b;

    /* renamed from: c */
    public AbstractC54587a f134903c;
    @BindView(6645)
    SettingDividerView mBottomDivider;
    @BindView(7819)
    TextView mDescView;
    @BindView(6926)
    TextView mEntranceText;
    @BindView(7398)
    View mNextDivider;
    @BindView(7399)
    View mNextHolder;
    @BindView(7820)
    View mNotificationCloseTipView;
    @BindView(7899)
    TextView mNotificationTipText;
    @BindView(7420)
    View mNotifyTipEntranceView;
    @BindView(7693)
    View mSettingEntranceView;
    @BindView(7795)
    TextView mStatusView;
    @BindView(7932)
    View mTopDivider;

    /* renamed from: com.ss.android.lark.setting.page.v1.view.NotificationEntranceView$a */
    public interface AbstractC54587a {
        /* renamed from: a */
        void mo186442a();

        /* renamed from: a */
        void mo186443a(String str);

        /* renamed from: b */
        void mo186444b();
    }

    /* renamed from: a */
    private void m211757a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_setting_notification_entrance, this));
        this.mStatusView.setText(R.string.Lark_NewSettings_NewMessageNotificationGoToEnableMobile);
        m211758b();
        this.mSettingEntranceView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.v1.view.NotificationEntranceView.View$OnClickListenerC545851 */

            public void onClick(View view) {
                if (NotificationEntranceView.this.f134903c == null) {
                    return;
                }
                if (NotificationEntranceView.this.f134901a) {
                    NotificationEntranceView.this.f134903c.mo186444b();
                } else {
                    NotificationEntranceView.this.f134903c.mo186442a();
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
            this.mDescView.setTextSize(12.0f);
            this.mStatusView.setTextSize(12.0f);
            ViewGroup.LayoutParams layoutParams2 = this.mTopDivider.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = 0;
                this.mTopDivider.setLayoutParams(layoutParams2);
            }
        }
        this.mNotifyTipEntranceView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.v1.view.NotificationEntranceView.View$OnClickListenerC545862 */

            public void onClick(View view) {
                if (NotificationEntranceView.this.f134903c == null) {
                    return;
                }
                if (NotificationEntranceView.this.f134902b == null || TextUtils.isEmpty(NotificationEntranceView.this.f134902b.mo186424b())) {
                    C53241h.m205894a("NotificationEntrance", "rom info is null or rom tip is null");
                } else {
                    NotificationEntranceView.this.f134903c.mo186443a(NotificationEntranceView.this.f134902b.mo186424b());
                }
            }
        });
    }

    /* renamed from: b */
    private void m211758b() {
        int i;
        int i2;
        if (this.f134902b == null) {
            this.mNotifyTipEntranceView.setVisibility(8);
        } else {
            this.mNotifyTipEntranceView.setVisibility(0);
            this.mNotificationTipText.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_NewMessageNotificationSettingsGoToHCMobile, "notify_tip", this.f134902b.mo186423a()));
        }
        View view = this.mNotificationCloseTipView;
        if (this.f134901a) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        TextView textView = this.mDescView;
        if (this.f134901a) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (this.f134901a && this.f134902b == null) {
            this.mBottomDivider.setLeftBlankWidth((float) C57582a.m223601a(getContext(), 16.0f));
            this.mNextDivider.setVisibility(8);
            this.mNextHolder.setVisibility(8);
        } else if (!DesktopUtil.m144301a(getContext())) {
            this.mBottomDivider.setLeftBlankWidth(BitmapDescriptorFactory.HUE_RED);
            this.mNextDivider.setVisibility(0);
            this.mNextHolder.setVisibility(0);
        } else {
            this.mBottomDivider.setVisibility(8);
            this.mNextDivider.setVisibility(8);
            this.mNextHolder.setVisibility(0);
        }
    }

    public void setOnEntranceClickListener(AbstractC54587a aVar) {
        this.f134903c = aVar;
    }

    /* renamed from: a */
    public void mo186482a(C54554a aVar) {
        this.f134902b = aVar;
        m211758b();
    }

    public NotificationEntranceView(Context context) {
        super(context);
        m211757a();
    }

    /* renamed from: a */
    public void mo186483a(boolean z) {
        this.f134901a = z;
        m211758b();
    }

    public NotificationEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m211757a();
    }

    public NotificationEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m211757a();
    }
}
