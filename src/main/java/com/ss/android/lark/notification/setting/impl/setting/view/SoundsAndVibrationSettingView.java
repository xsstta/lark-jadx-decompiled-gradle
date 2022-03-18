package com.ss.android.lark.notification.setting.impl.setting.view;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import java.util.HashMap;
import java.util.Map;

public class SoundsAndVibrationSettingView extends ConstraintLayout {

    /* renamed from: a */
    Map<Integer, String> f122336a = new HashMap(3);

    /* renamed from: b */
    public AbstractC48653a f122337b;

    /* renamed from: c */
    private final AbstractC48407a.AbstractC48427o f122338c = C48398a.m190922a().mo169341d();

    /* renamed from: d */
    private boolean f122339d = false;
    @BindView(6771)
    View mDingOffWarnView;
    @BindView(6769)
    View mDingSettingView;
    @BindView(7193)
    View mMentionOffWarnView;
    @BindView(7191)
    View mMentionSettingView;
    @BindView(7432)
    View mRegularOffWarnView;
    @BindView(7431)
    View mRegularSettingView;

    public @interface CHANNEL_TYPE {
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView$a */
    public interface AbstractC48653a {
        /* renamed from: a */
        void mo169761a(String str);
    }

    /* renamed from: a */
    private void m191777a() {
        int i;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (DesktopUtil.m144301a(getContext())) {
            i = R.layout.view_setting_sounds_and_viberation_notification_desktop;
        } else {
            i = R.layout.view_setting_sounds_and_viberation_notification;
        }
        ButterKnife.bind(this, from.inflate(i, this));
        ((TextView) this.mMentionOffWarnView.findViewById(R.id.status)).setText(R.string.Lark_Legacy_MineMessageSettingClose);
        ((TextView) this.mRegularOffWarnView.findViewById(R.id.status)).setText(R.string.Lark_Legacy_MineMessageSettingClose);
        ((TextView) this.mDingSettingView.findViewById(R.id.status)).setText(R.string.Lark_Legacy_MineMessageSettingClose);
    }

    public void setOnItemSelectListener(AbstractC48653a aVar) {
        this.f122337b = aVar;
    }

    public SoundsAndVibrationSettingView(Context context) {
        super(context);
        m191777a();
    }

    /* renamed from: a */
    private void m191778a(boolean z) {
        int i = 8;
        if (!z) {
            this.mMentionOffWarnView.setVisibility(8);
            return;
        }
        String str = this.f122336a.get(2);
        if (!TextUtils.isEmpty(str)) {
            View view = this.mMentionOffWarnView;
            if (!m191779a(str)) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m191780b(boolean z) {
        int i = 8;
        if (!z) {
            this.mRegularOffWarnView.setVisibility(8);
            return;
        }
        String str = this.f122336a.get(0);
        if (!TextUtils.isEmpty(str)) {
            View view = this.mRegularOffWarnView;
            if (!m191779a(str)) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    private void m191781c(boolean z) {
        int i = 8;
        if (!z) {
            this.mDingOffWarnView.setVisibility(8);
            return;
        }
        String str = this.f122336a.get(1);
        if (!TextUtils.isEmpty(str)) {
            View view = this.mDingOffWarnView;
            if (!m191779a(str)) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void setup(Map<Integer, String> map) {
        this.f122336a.clear();
        this.f122336a.putAll(map);
        this.f122339d = true;
        if (this.f122336a.get(1) != null) {
            this.mDingSettingView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView.View$OnClickListenerC486501 */

                public void onClick(View view) {
                    if (SoundsAndVibrationSettingView.this.f122337b != null) {
                        SoundsAndVibrationSettingView.this.f122337b.mo169761a(SoundsAndVibrationSettingView.this.f122336a.get(1));
                    }
                }
            });
        }
        if (this.f122336a.get(2) != null) {
            this.mMentionSettingView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView.View$OnClickListenerC486512 */

                public void onClick(View view) {
                    if (SoundsAndVibrationSettingView.this.f122337b != null) {
                        SoundsAndVibrationSettingView.this.f122337b.mo169761a(SoundsAndVibrationSettingView.this.f122336a.get(2));
                    }
                }
            });
        }
        if (this.f122336a.get(0) != null) {
            this.mRegularSettingView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.view.SoundsAndVibrationSettingView.View$OnClickListenerC486523 */

                public void onClick(View view) {
                    if (SoundsAndVibrationSettingView.this.f122337b != null) {
                        SoundsAndVibrationSettingView.this.f122337b.mo169761a(SoundsAndVibrationSettingView.this.f122336a.get(0));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m191779a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            NotificationSettingItem a = this.f122338c.mo169400a(str);
            if (a == null) {
                a = new NotificationSettingItem();
            }
            return a.isNotificationOn();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            NotificationManager notificationManager = (NotificationManager) getContext().getSystemService("notification");
            if (notificationManager.getNotificationChannel(str).getImportance() == 0 || !notificationManager.areNotificationsEnabled()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo169831a(NotificationSettingV2 notificationSettingV2) {
        if (!this.f122339d) {
            Log.m165383e("SoundsAndVibration", "view is not initialed");
            return;
        }
        NotificationSettingV2.MineChatMsgSettingState chatMsgState = notificationSettingV2.getChatMsgState();
        if (chatMsgState == NotificationSettingV2.MineChatMsgSettingState.CLOSED) {
            m191778a(false);
            m191780b(false);
            m191781c(false);
        } else if (chatMsgState == NotificationSettingV2.MineChatMsgSettingState.OPEN) {
            m191778a(true);
            m191780b(true);
            m191781c(true);
        } else if (chatMsgState == NotificationSettingV2.MineChatMsgSettingState.HALF_OPEN) {
            m191780b(false);
            m191781c(true);
            m191778a(notificationSettingV2.isMentionOpen());
        }
    }

    public SoundsAndVibrationSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191777a();
    }

    public SoundsAndVibrationSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191777a();
    }
}
