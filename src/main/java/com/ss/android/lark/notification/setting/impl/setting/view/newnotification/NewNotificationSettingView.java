package com.ss.android.lark.notification.setting.impl.setting.view.newnotification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.setting.impl.setting.C48600a;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class NewNotificationSettingView extends SettingGroupLayout {

    /* renamed from: a */
    public NotificationSettingV2 f122355a;

    /* renamed from: b */
    public AbstractC48664c f122356b;

    /* renamed from: c */
    public boolean f122357c;

    /* renamed from: d */
    private AbstractC48663b f122358d;

    /* renamed from: e */
    private AbstractC48662a f122359e;

    /* renamed from: f */
    private ArrayList<View> f122360f;

    /* renamed from: g */
    private boolean f122361g;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView$a */
    public interface AbstractC48662a {
        /* renamed from: a */
        void mo169756a(NotificationSettingV2 notificationSettingV2);
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView$b */
    public interface AbstractC48663b {
        /* renamed from: a */
        void mo169755a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView$c */
    public interface AbstractC48664c {
        /* renamed from: a */
        void mo169748a(NotificationSettingV2 notificationSettingV2);
    }

    public NotificationSettingV2 getNotificationSettingV2() {
        return this.f122355a;
    }

    /* renamed from: c */
    private void m191797c() {
        post(new Runnable() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.RunnableC486571 */

            public void run() {
                NewNotificationSettingView newNotificationSettingView = NewNotificationSettingView.this;
                newNotificationSettingView.setOption(newNotificationSettingView.f122355a);
                NewNotificationSettingView.this.mo169845a();
                if (NewNotificationSettingView.this.f122355a.isAll()) {
                    NewNotificationSettingView.this.mo169847b(R.id.notification_all);
                } else if (NewNotificationSettingView.this.f122355a.isNone()) {
                    NewNotificationSettingView.this.mo169847b(R.id.notification_none);
                } else {
                    NewNotificationSettingView.this.mo169847b(R.id.notificatiron_specific);
                }
            }
        });
    }

    /* renamed from: e */
    private void m191799e() {
        View a = m191795a(UIHelper.getString(R.string.Lark_NewSettings_MessageNotificationScopeAllMobile), false, R.id.notification_all);
        if (this.f122361g) {
            a.setBackgroundResource(R.drawable.settings_item_bg_desktop_upper_selector);
        }
        this.f122360f.add(a);
    }

    /* renamed from: f */
    private void m191800f() {
        this.f122360f.add(m191795a(UIHelper.getString(R.string.Lark_NewSettings_MessageNotificationScopePartialMobile), true, R.id.notificatiron_specific));
    }

    /* renamed from: g */
    private void m191801g() {
        View a = m191795a(UIHelper.getString(R.string.Lark_NewSettings_MessageNotificationNoneMobile), false, R.id.notification_none);
        if (this.f122361g) {
            a.setBackgroundResource(R.drawable.settings_item_bg_desktop_lower_selector);
        }
        this.f122360f.add(a);
    }

    /* renamed from: b */
    private void m191796b() {
        this.f122360f = new ArrayList<>();
        this.f122355a = NotificationSettingV2.allInstance();
        setOrientation(1);
        this.f122361g = DesktopUtil.m144301a(getContext());
        m191799e();
        m191800f();
        m191801g();
        m191798d();
    }

    /* renamed from: a */
    public void mo169845a() {
        boolean z;
        ImageView imageView = ((C48665d) ((ViewGroup) findViewById(R.id.notificatiron_specific)).getTag()).f122372d;
        if (this.f122355a.isNone() || this.f122355a.isAll()) {
            z = false;
        } else {
            z = true;
        }
        imageView.setEnabled(z);
    }

    /* renamed from: d */
    private void m191798d() {
        boolean z = UserSP.getInstance().getBoolean("mention_key");
        boolean z2 = UserSP.getInstance().getBoolean("user_single_chat_key", true);
        if (z && z2) {
            setOption(this.f122355a.halfOpenNotify().openBuzz().openMention().openUserSingleChat());
        } else if (z) {
            setOption(this.f122355a.halfOpenNotify().openBuzz().openMention());
        } else if (z2) {
            setOption(this.f122355a.halfOpenNotify().openBuzz().openUserSingleChat());
        } else {
            setOption(this.f122355a.halfOpenNotify().openBuzz());
        }
    }

    public void setOnItemChosenListener(AbstractC48662a aVar) {
        this.f122359e = aVar;
    }

    public void setOnItemClickListener(AbstractC48663b bVar) {
        this.f122358d = bVar;
    }

    public void setOptionSelectClickListener(AbstractC48664c cVar) {
        this.f122356b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView$d */
    public class C48665d {

        /* renamed from: a */
        public UDCheckBox f122369a;

        /* renamed from: b */
        public TextView f122370b;

        /* renamed from: c */
        public TextView f122371c;

        /* renamed from: d */
        public ImageView f122372d;

        private C48665d() {
        }
    }

    public NewNotificationSettingView(Context context) {
        super(context);
        m191796b();
    }

    public void setData(NotificationSettingV2 notificationSettingV2) {
        if (!notificationSettingV2.isAll() && !notificationSettingV2.isNone()) {
            UserSP.getInstance().putBoolean("mention_key", notificationSettingV2.isMentionOpen());
            UserSP.getInstance().putBoolean("user_single_chat_key", notificationSettingV2.isUserSingleChatOpen());
        }
        this.f122355a = notificationSettingV2;
        m191797c();
    }

    public void setOption(NotificationSettingV2 notificationSettingV2) {
        if (notificationSettingV2.isBuzzOpen() || notificationSettingV2.isMentionOpen() || notificationSettingV2.isUserSingleChatOpen()) {
            C48665d dVar = (C48665d) ((ViewGroup) findViewById(R.id.notificatiron_specific)).getTag();
            dVar.f122371c.setVisibility(0);
            dVar.f122372d.setVisibility(0);
            dVar.f122371c.setText(C48600a.m191592a(this.f122355a));
        }
    }

    /* renamed from: a */
    public void mo169846a(final int i) {
        if (i == R.id.notification_all && this.f122355a.isAll()) {
            return;
        }
        if (i == R.id.notification_none && this.f122355a.isNone()) {
            return;
        }
        if (i != R.id.notificatiron_specific || this.f122355a.isAll() || this.f122355a.isNone()) {
            if (i == R.id.notification_all) {
                this.f122355a.openNotify();
            } else if (i == R.id.notificatiron_specific) {
                this.f122355a.halfOpenNotify();
            } else if (i == R.id.notification_none) {
                this.f122355a.closeNotify();
            }
            AbstractC48663b bVar = this.f122358d;
            if (bVar != null && !this.f122357c) {
                this.f122357c = true;
                bVar.mo169755a(this.f122355a, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.C486582 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        NewNotificationSettingView.this.post(new Runnable() {
                            /* class com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.C486582.RunnableC486591 */

                            public void run() {
                                NewNotificationSettingView.this.f122357c = false;
                                NewNotificationSettingView.this.mo169847b(i);
                                NewNotificationSettingView.this.mo169845a();
                                LKUIToast.show(NewNotificationSettingView.this.getContext(), (int) R.string.Lark_Settings_BadgeStyleChangeSuccess);
                            }
                        });
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        NewNotificationSettingView.this.f122357c = false;
                        LKUIToast.show(NewNotificationSettingView.this.getContext(), (int) R.string.Lark_Settings_BadgeStyleChangeFail);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public void mo169847b(int i) {
        boolean z;
        ArrayList<View> arrayList = this.f122360f;
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<View> it = this.f122360f.iterator();
            while (it.hasNext()) {
                View next = it.next();
                UDCheckBox uDCheckBox = ((C48665d) next.getTag()).f122369a;
                if (next.getId() == i) {
                    z = true;
                } else {
                    z = false;
                }
                uDCheckBox.setChecked(z);
            }
            AbstractC48662a aVar = this.f122359e;
            if (aVar != null) {
                aVar.mo169756a(this.f122355a);
            }
        }
    }

    public NewNotificationSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191796b();
    }

    /* renamed from: a */
    private View m191795a(String str, boolean z, final int i) {
        C48665d dVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getContext()).inflate(R.layout.notification_item, (ViewGroup) null);
        constraintLayout.setId(i);
        UDCheckBox uDCheckBox = (UDCheckBox) constraintLayout.findViewById(R.id.notification_item_btn);
        uDCheckBox.setClickable(false);
        TextView textView = (TextView) constraintLayout.findViewById(R.id.notification_item_text);
        TextView textView2 = (TextView) constraintLayout.findViewById(R.id.item_option_text);
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.notification_item_option_choose);
        if (constraintLayout.getTag() == null) {
            dVar = new C48665d();
            dVar.f122369a = uDCheckBox;
            dVar.f122370b = textView;
            dVar.f122371c = textView2;
            dVar.f122372d = imageView;
        } else {
            dVar = (C48665d) constraintLayout.getTag();
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.View$OnClickListenerC486603 */

            public void onClick(View view) {
                NewNotificationSettingView.this.mo169846a(i);
            }
        });
        dVar.f122370b.setText(str);
        if (z) {
            dVar.f122372d.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.view.newnotification.NewNotificationSettingView.View$OnClickListenerC486614 */

                public void onClick(View view) {
                    if (NewNotificationSettingView.this.f122356b != null) {
                        NewNotificationSettingView.this.f122356b.mo169748a(NewNotificationSettingView.this.f122355a);
                    }
                }
            });
        } else {
            dVar.f122372d.setVisibility(8);
            dVar.f122371c.setVisibility(8);
        }
        constraintLayout.setTag(dVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.f122361g) {
            layoutParams.leftMargin = UIUtils.dp2px(getContext(), 16.0f);
            layoutParams.rightMargin = UIUtils.dp2px(getContext(), 16.0f);
            textView.setTextSize(14.0f);
            textView2.setTextSize(12.0f);
        }
        addView(constraintLayout, layoutParams);
        return constraintLayout;
    }
}
