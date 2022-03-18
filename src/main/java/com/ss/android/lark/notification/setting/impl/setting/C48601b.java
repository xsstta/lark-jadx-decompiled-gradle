package com.ss.android.lark.notification.setting.impl.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.C48405b;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.setting.impl.setting.mvp.C48621b;
import com.ss.android.lark.notification.setting.impl.setting.mvp.C48628c;
import com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView;
import com.ss.android.lark.notification.setting.impl.setting.notification_item.NotificationSettingsItemActivity;
import com.ss.android.lark.notification.statistics.NotificationSettingHitPoint;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.b */
public class C48601b extends BaseFragment {

    /* renamed from: a */
    public View f122253a;

    /* renamed from: b */
    public Activity f122254b;

    /* renamed from: c */
    public boolean f122255c;

    /* renamed from: d */
    private C48628c f122256d;

    /* renamed from: e */
    private final NotificationSettingsView.AbstractC48615a f122257e = new NotificationSettingsView.AbstractC48615a() {
        /* class com.ss.android.lark.notification.setting.impl.setting.C48601b.C486021 */

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: a */
        public void mo169719a() {
            C48405b.m190970b(C48601b.this.f122254b);
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: b */
        public void mo169724b(String str) {
            C48405b.m190968a(C48601b.this.f122254b, str);
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: a */
        public void mo169720a(Context context) {
            if (DesktopUtil.m144301a(context)) {
                C26323w.m95329b(context, 268435456);
            } else {
                C26323w.m95328b(context);
            }
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: a */
        public void mo169721a(NotificationSettingV2 notificationSettingV2) {
            NotificationSettingHitPoint.f122128a.mo169616c();
            C48405b.m190966a(C48601b.this.f122254b, C48601b.this, notificationSettingV2);
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: a */
        public void mo169722a(NotificationSettingsView notificationSettingsView) {
            ButterKnife.bind(notificationSettingsView, C48601b.this.f122253a);
        }

        @Override // com.ss.android.lark.notification.setting.impl.setting.mvp.NotificationSettingsView.AbstractC48615a
        /* renamed from: a */
        public void mo169723a(String str) {
            if (Build.VERSION.SDK_INT < 26) {
                Intent intent = new Intent(C48601b.this.f122254b, NotificationSettingsItemActivity.class);
                intent.putExtra("key_message_channel", str);
                if (DesktopUtil.m144301a((Context) C48601b.this.f122254b)) {
                    intent.addFlags(268435456);
                }
                C48601b.this.startActivity(intent);
                return;
            }
            try {
                Intent intent2 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                if (DesktopUtil.m144301a((Context) C48601b.this.f122254b)) {
                    intent2.addFlags(268435456);
                }
                intent2.putExtra("android.provider.extra.APP_PACKAGE", C48601b.this.f122254b.getPackageName());
                intent2.putExtra("android.provider.extra.CHANNEL_ID", str);
                C48601b.this.startActivity(intent2);
            } catch (Exception e) {
                e.printStackTrace();
                Intent intent3 = new Intent();
                intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                if (DesktopUtil.m144301a((Context) C48601b.this.f122254b)) {
                    intent3.addFlags(268435456);
                }
                intent3.setData(Uri.fromParts("package", C48601b.this.f122254b.getPackageName(), null));
                C48601b.this.startActivity(intent3);
            }
        }
    };

    /* renamed from: f */
    private IGetDataCallback<Boolean> f122258f = new IGetDataCallback<Boolean>() {
        /* class com.ss.android.lark.notification.setting.impl.setting.C48601b.C486032 */

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            C48601b.this.f122255c = false;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            LKUIToast.show(C48601b.this.getContext(), (int) R.string.Lark_Settings_BadgeStyleChangeFail);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C48628c cVar = this.f122256d;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f122255c) {
            this.f122256d.mo169788b();
        }
    }

    /* renamed from: a */
    private void m191593a() {
        C48621b bVar = new C48621b();
        NotificationSettingsView notificationSettingsView = new NotificationSettingsView(this.f122254b, this.f122257e);
        C48628c cVar = new C48628c(this.f122254b, bVar, notificationSettingsView, this.mCallbackManager);
        this.f122256d = cVar;
        cVar.create();
        Bundle arguments = getArguments();
        if (arguments != null) {
            notificationSettingsView.mo169747j(arguments.getBoolean("highLight", false));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f122254b) && !DesktopUtil.m144301a((Context) this.f122254b)) {
            this.f122254b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m191593a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 249 && i == 233) {
            this.f122255c = true;
            this.f122256d.mo169787a((NotificationSettingV2) intent.getSerializableExtra("option_result_v2"), this.f122258f);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122253a = layoutInflater.inflate(R.layout.activity_setting_notification, viewGroup, false);
        this.f122254b = getActivity();
        return this.f122253a;
    }
}
