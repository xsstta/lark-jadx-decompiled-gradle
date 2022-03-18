package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43421d;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43422e;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationView implements View.OnClickListener, AbstractC43522a.AbstractC43524b, AbstractC43522a.AbstractC43526c, AbstractC43522a.AbstractC43527d {

    /* renamed from: a */
    private final Activity f110488a;

    /* renamed from: b */
    private AbstractC43520a f110489b;

    /* renamed from: c */
    private AbstractC43522a.AbstractC43524b.AbstractC43525a f110490c;

    /* renamed from: d */
    private final List<C43422e> f110491d = new ArrayList();

    /* renamed from: e */
    private C43421d f110492e;
    @BindView(9415)
    View mBotLayout;
    @BindView(9416)
    UDCheckBox mBotRadio;
    @BindView(8510)
    TextView mBotTv;
    @BindView(9413)
    LinearLayout mNotificationAllSwitchView;
    @BindView(9418)
    View mNotificationChannelLayout;
    @BindView(9426)
    View mNotificationSettingListLayout;
    @BindView(9425)
    LinearLayout mNotificationSettingListView;
    @BindView(9421)
    View mPushLayout;
    @BindView(9422)
    UDCheckBox mPushRadio;
    @BindView(8515)
    TextView mPushTv;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationView$a */
    public interface AbstractC43520a {
        /* renamed from: a */
        void mo155398a(NotificationView notificationView);
    }

    /* renamed from: c */
    public void mo155405c() {
        this.f110488a.finish();
    }

    /* renamed from: d */
    public LifecycleOwner mo155406d() {
        return (ComponentActivity) this.f110488a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110490c = null;
        this.f110489b = null;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43526c
    /* renamed from: a */
    public void mo155400a() {
        for (C43422e eVar : this.f110491d) {
            eVar.mo155203a();
        }
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43527d
    /* renamed from: b */
    public void mo155404b() {
        boolean z;
        boolean z2;
        int i;
        C43421d dVar = this.f110492e;
        int i2 = 0;
        if (dVar == null || !dVar.mo155230j()) {
            z = false;
        } else {
            z = true;
        }
        Iterator<C43422e> it = this.f110491d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo155230j()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        View view = this.mNotificationSettingListLayout;
        if (!z || this.f110491d.size() <= 1) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.mNotificationChannelLayout;
        if (!z || (this.f110491d.size() != 1 && !z2)) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110489b.mo155398a(this);
        String j = C43277a.m171921a().mo154946j();
        this.mNotificationAllSwitchView.removeAllViews();
        C43421d dVar = this.f110492e;
        if (dVar != null) {
            dVar.mo155203a();
        }
        if (j != null) {
            C43421d dVar2 = new C43421d(mo155406d(), new C43418b(j), this);
            this.f110492e = dVar2;
            dVar2.mo155204a(this.f110488a);
            this.mNotificationAllSwitchView.addView(this.f110492e.mo155215g());
            this.mNotificationAllSwitchView.setVisibility(0);
            this.mPushLayout.setOnClickListener(this);
            this.mBotLayout.setOnClickListener(this);
            if (Build.VERSION.SDK_INT < 23) {
                m172764a(this.mPushTv);
                m172764a(this.mBotTv);
                return;
            }
            return;
        }
        this.f110488a.finish();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43522a.AbstractC43524b.AbstractC43525a aVar) {
        this.f110490c = aVar;
    }

    /* renamed from: a */
    private void m172764a(TextView textView) {
        if (textView != null) {
            textView.setText(UIHelper.getString(R.string.Mail_Settings_YouReceivedAnEmailMobile));
            Drawable drawable = UIHelper.getDrawable(R.drawable.mail_setting_notification_illustration_postbox_emoji);
            int dp2px = UIHelper.dp2px(10.0f);
            drawable.setBounds(0, 0, dp2px, dp2px);
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        int id = view.getId();
        boolean isChecked = this.mPushRadio.isChecked();
        boolean isChecked2 = this.mBotRadio.isChecked();
        if (id == R.id.mail_notification_channel_push_layout) {
            isChecked = !isChecked;
        } else if (id == R.id.mail_notification_channel_bot_layout) {
            isChecked2 = !isChecked2;
        }
        if (isChecked2 || isChecked) {
            this.f110490c.mo155418a(m172763a(isChecked, isChecked2));
            if (id == R.id.mail_notification_channel_push_layout) {
                String str3 = C42330c.C42334c.f107675b;
                if (isChecked) {
                    str2 = C42330c.C42339h.f107748A;
                } else {
                    str2 = C42330c.C42339h.f107749B;
                }
                C42330c.m169065b(str3, str2);
            } else if (id == R.id.mail_notification_channel_bot_layout) {
                String str4 = C42330c.C42334c.f107676c;
                if (isChecked2) {
                    str = C42330c.C42339h.f107748A;
                } else {
                    str = C42330c.C42339h.f107749B;
                }
                C42330c.m169065b(str4, str);
            }
        } else {
            UDToast.makeToast(this.f110488a, (int) R.string.Mail_Settings_NotificationFormCantBeEmpty, (int) R.drawable.ud_icon_warning_outlined).show();
        }
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43526c
    /* renamed from: a */
    public void mo155401a(C42088b bVar) {
        List<C42087a> list;
        if (bVar != null) {
            list = bVar.mo151820b();
        } else {
            list = null;
        }
        if (list == null || list.size() < 1) {
            this.f110488a.finish();
            return;
        }
        this.f110491d.clear();
        for (C42087a aVar : list) {
            this.f110491d.add(new C43422e(mo155406d(), new C43418b(aVar.f107024a), this));
        }
        this.mNotificationSettingListView.removeAllViews();
        for (int i = 0; i < this.f110491d.size(); i++) {
            C43422e eVar = this.f110491d.get(i);
            eVar.mo155204a(this.f110488a);
            if (i == 0) {
                eVar.mo155206a(AbsSettingItemViewModel.DividerStyle.Align);
                eVar.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE);
            } else if (i == this.f110491d.size() - 1) {
                eVar.mo155206a(AbsSettingItemViewModel.DividerStyle.None);
                eVar.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
            } else {
                eVar.mo155206a(AbsSettingItemViewModel.DividerStyle.Align);
                eVar.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.SQUARE);
            }
            this.mNotificationSettingListView.addView(eVar.mo155215g());
        }
    }

    /* renamed from: a */
    public void mo155403a(Integer num) {
        boolean z;
        UDCheckBox uDCheckBox = this.mPushRadio;
        boolean z2 = true;
        if (((num.intValue() >> Setting.ChannelPosition.PUSH.getValue()) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        UDCheckBox uDCheckBox2 = this.mBotRadio;
        if (((num.intValue() >> Setting.ChannelPosition.BOT.getValue()) & 1) != 1) {
            z2 = false;
        }
        uDCheckBox2.setChecked(z2);
    }

    public NotificationView(Activity activity, AbstractC43520a aVar) {
        this.f110488a = activity;
        this.f110489b = aVar;
    }

    /* renamed from: a */
    private int m172763a(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + (1 >> Setting.ChannelPosition.PUSH.getValue());
        }
        if (z2) {
            return i + (1 << Setting.ChannelPosition.BOT.getValue());
        }
        return i;
    }
}
