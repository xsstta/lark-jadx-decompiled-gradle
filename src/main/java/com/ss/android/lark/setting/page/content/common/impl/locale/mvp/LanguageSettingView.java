package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog;
import java.util.HashMap;
import java.util.List;

public class LanguageSettingView implements AbstractC54204c.AbstractC54207b {

    /* renamed from: a */
    public AbstractC54189a f134162a;

    /* renamed from: b */
    public AbstractC54204c.AbstractC54207b.AbstractC54208a f134163b;

    /* renamed from: c */
    public LanguageSelectAdapter f134164c;

    /* renamed from: d */
    private final Activity f134165d;

    /* renamed from: e */
    private LoadingDialog f134166e;

    /* renamed from: f */
    private TextView f134167f;
    @BindView(7170)
    RecyclerView mLanguageRV;
    @BindView(7912)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView$a */
    public interface AbstractC54189a {
        /* renamed from: a */
        void mo185486a();

        /* renamed from: a */
        void mo185487a(LanguageSettingView languageSettingView);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: d */
    public boolean mo185500d() {
        return NetworkUtils.m153070c(this.f134165d);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134162a = null;
        this.f134163b = null;
    }

    /* renamed from: f */
    private void m210400f() {
        m210402h();
        m210403i();
        m210401g();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: a */
    public void mo185491a() {
        if (!this.f134166e.mo197790b()) {
            this.f134166e.mo197780a();
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: b */
    public void mo185496b() {
        if (this.f134166e.mo197790b()) {
            this.f134166e.mo197792c();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134162a.mo185487a(this);
        m210400f();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: e */
    public void mo185501e() {
        LKUIToast.show(this.f134165d, (int) R.string.Lark_Legacy_NetUnavailableNow);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: c */
    public void mo185499c() {
        if (this.f134164c != null) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.RunnableC541874 */

                public void run() {
                    Log.m165389i("MineLanguageSettingView", "updating language list");
                    LanguageSettingView.this.f134164c.notifyDataSetChanged();
                }
            });
        } else {
            Log.m165389i("MineLanguageSettingView", "Failed to update language list, mAdapter is empty");
        }
    }

    /* renamed from: i */
    private void m210403i() {
        this.mLanguageRV.setLayoutManager(new LinearLayoutManager(this.f134165d, 1, false));
        if (C57824f.m224469c()) {
            this.f134164c = new C54202b();
        } else {
            this.f134164c = new LanguageSelectAdapter();
        }
        this.f134164c.mo185474a(new LanguageSelectAdapter.AbstractC54180a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.C541863 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter.AbstractC54180a
            /* renamed from: a */
            public boolean mo185478a(String str) {
                return LanguageSettingView.this.mo185498b(str);
            }

            @Override // com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter.AbstractC54180a
            /* renamed from: a */
            public void mo185477a(LanguagePickBean languagePickBean) {
                if (languagePickBean == null) {
                    LanguageSettingView.this.f134163b.mo185536a(null);
                } else {
                    LanguageSettingView.this.f134163b.mo185536a(languagePickBean);
                }
            }
        });
        this.mLanguageRV.setAdapter(this.f134164c);
        SettingGroupHelper.m88812a(this.mLanguageRV);
    }

    /* renamed from: g */
    private void m210401g() {
        this.f134166e = LoadingDialog.m226492a(this.f134165d).mo197784a(LoadingDialog.Style.SPIN_INDETERMINATE).mo197789b(28, 28).mo197785a(this.f134165d.getString(R.string.Lark_Legacy_LanguageChangeLoadingTip)).mo197791c(14.0f).mo197783a(130, 130).mo197787b(5.0f).mo197788b(2).mo197782a(C25653b.m91893a(UIUtils.getColor(this.f134165d, R.color.lkui_N900), 0.8f)).mo197781a(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: h */
    private void m210402h() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Completed)) {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.C541841 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                LanguageSettingView.this.f134163b.mo185535a();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f134167f = rightText;
        rightText.setEnabled(false);
        this.f134167f.setVisibility(8);
        this.f134167f.setTextColor(this.f134165d.getResources().getColor(R.color.text_link_normal));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.View$OnClickListenerC541852 */

            public void onClick(View view) {
                LanguageSettingView.this.f134162a.mo185486a();
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54204c.AbstractC54207b.AbstractC54208a aVar) {
        this.f134163b = aVar;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: a */
    public void mo185494a(List<LanguagePickBean> list) {
        this.f134164c.resetAll(list);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: a */
    public void mo185495a(boolean z) {
        if (z) {
            LKUIToast.show((Context) this.f134165d, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_LanguageChangeSucceeded);
        } else {
            LKUIToast.show(this.f134165d, (int) R.string.Lark_Legacy_LanguageChangeFailed);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: b */
    public void mo185497b(boolean z) {
        if (z) {
            this.f134167f.setTextColor(this.f134165d.getResources().getColor(R.color.lkui_B500));
            this.f134167f.setEnabled(true);
            this.f134167f.setVisibility(0);
            return;
        }
        this.f134167f.setTextColor(this.f134165d.getResources().getColor(R.color.lkui_B500));
        this.f134167f.setEnabled(false);
        this.f134167f.setVisibility(8);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c.AbstractC54207b
    /* renamed from: a */
    public void mo185493a(String str) {
        String str2;
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("language", str);
            hashMap.put("appName", UIUtils.getString(this.f134165d, R.string.Lark_App_Name));
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MineLanguageChangeAndroidNotice_V2, hashMap);
        } else {
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_LanguageChangeFollowSys);
        }
        new C25639g(this.f134165d).mo89237b(str2).mo89238b(true).mo89251j(3).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Settings_DispalySwitchButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.DialogInterface$OnClickListenerC541885 */

            public void onClick(DialogInterface dialogInterface, int i) {
                LanguageSettingView.this.f134163b.mo185537b();
            }
        }).mo89239c();
    }

    /* renamed from: b */
    public boolean mo185498b(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : this.f134163b.mo185538c()) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public LanguageSettingView(Activity activity, AbstractC54189a aVar) {
        this.f134165d = activity;
        this.f134162a = aVar;
    }
}
