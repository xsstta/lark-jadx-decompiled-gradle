package com.ss.android.lark.setting.page.content.internal.mvp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;

public class MineInternalSettingsView implements AbstractC54538a.AbstractC54541b {

    /* renamed from: a */
    public AbstractC54536a f134828a;

    /* renamed from: b */
    private CommonLoadingDialog f134829b;

    /* renamed from: c */
    private Dialog f134830c;

    /* renamed from: d */
    private AbstractC54538a.AbstractC54541b.AbstractC54542a f134831d;

    /* renamed from: e */
    private final Context f134832e;
    @BindView(6815)
    TextView mDesktopTitleBar;
    @BindView(6949)
    TextView mFetchConfigBT;
    @BindView(7912)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView$a */
    public interface AbstractC54536a {
        /* renamed from: a */
        void mo186374a();

        /* renamed from: a */
        void mo186375a(MineInternalSettingsView mineInternalSettingsView);
    }

    @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54541b
    /* renamed from: b */
    public void mo186371b() {
        m211587f();
        m211584c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134831d = null;
        this.f134828a = null;
    }

    /* renamed from: d */
    private void m211585d() {
        if (this.f134829b == null) {
            this.f134829b = new CommonLoadingDialog();
        }
    }

    /* renamed from: e */
    private void m211586e() {
        m211585d();
        this.f134829b.show(this.f134832e);
    }

    @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54541b
    /* renamed from: a */
    public void mo186369a() {
        m211587f();
        LKUIToast.show(this.f134832e, (int) R.string.Lark_Legacy_RecallMessageErr);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134828a.mo186375a(this);
        m211588g();
    }

    /* access modifiers changed from: package-private */
    @OnClick({6949})
    public void onFetchLatestConfig() {
        if (this.f134831d != null) {
            m211586e();
            this.f134831d.mo186379a();
        }
    }

    /* renamed from: f */
    private void m211587f() {
        Context context = this.f134832e;
        if ((context instanceof Activity) && UIUtils.isActivityRunning((Activity) context)) {
            this.f134829b.dismiss();
        }
    }

    /* renamed from: g */
    private void m211588g() {
        m211589h();
        this.mFetchConfigBT.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_GetLatestConfigurationMobile));
        m211590i();
    }

    /* renamed from: h */
    private void m211589h() {
        if (!DesktopUtil.m144301a(this.f134832e)) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        this.mDesktopTitleBar.setText(R.string.Lark_NewSettings_InternalSettings);
    }

    /* renamed from: c */
    private void m211584c() {
        Dialog dialog = this.f134830c;
        if (dialog == null) {
            DialogC25637f b = new C25639g(this.f134832e).mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_GetConfigurationToastTitle)).mo89254m(R.string.Lark_NewSettings_GetConfigurationToast).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_NewSettings_GetConfigurationToastLater, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_NewSettings_GetConfigurationToastRestart, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView.DialogInterface$OnClickListenerC545351 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    MineInternalSettingsView.this.f134828a.mo186374a();
                }
            }).mo89238b(true).mo89233b();
            this.f134830c = b;
            b.show();
            return;
        }
        dialog.show();
    }

    /* renamed from: i */
    private void m211590i() {
        if (DesktopUtil.m144301a(this.f134832e)) {
            this.mFetchConfigBT.setTextSize(14.0f);
            this.mFetchConfigBT.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mFetchConfigBT.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.height = this.f134832e.getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop);
                marginLayoutParams.leftMargin = this.f134832e.getResources().getDimensionPixelSize(R.dimen.setting_item_text_margin_left);
                marginLayoutParams.rightMargin = this.f134832e.getResources().getDimensionPixelSize(R.dimen.setting_item_text_margin_left);
                this.mFetchConfigBT.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54538a.AbstractC54541b.AbstractC54542a aVar) {
        this.f134831d = aVar;
    }

    public MineInternalSettingsView(Context context, AbstractC54536a aVar) {
        this.f134828a = aVar;
        this.f134832e = context;
    }
}
