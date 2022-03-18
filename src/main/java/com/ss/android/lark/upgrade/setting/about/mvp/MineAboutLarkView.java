package com.ss.android.lark.upgrade.setting.about.mvp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.setting.about.AboutFragment;
import com.ss.android.lark.upgrade.setting.about.PermissionDetailFragment;
import com.ss.android.lark.upgrade.setting.about.mvp.IView;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58543d;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 82\u00020\u0001:\u00018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016J\b\u0010*\u001a\u00020 H\u0003J\b\u0010+\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0010H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u001aH\u0016J\b\u00100\u001a\u00020 H\u0016J\b\u00101\u001a\u00020 H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020 H\u0016J\u0010\u00105\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0010H\u0016J\u0010\u00106\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0010H\u0016J\u0010\u00107\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0010H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/MineAboutLarkView;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView;", "fragment", "Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;", "context", "Landroid/content/Context;", "(Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;Landroid/content/Context;)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "getContext", "()Landroid/content/Context;", "getFragment", "()Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;", "setFragment", "(Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;)V", "mApplicationPermissionDescUrl", "", "mBrowserModule", "Lcom/ss/android/lark/upgrade/dependency/IUpgradeModuleDependency$IBrowserDependency;", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "mSecurityWhitePaperUrl", "mThirdPartyListUrl", "mUpdateNowClickListener", "Landroid/view/View$OnClickListener;", "mViewDelegate", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView$Delegate;", "updateTag", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "updateTagDrawable", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "create", "", "destroy", "displayUpgradeView", "visible", "", "generateDetailedDebugInfo", "hideApplicationPermissionDesc", "hideLoading", "hideSecurityWhitePaper", "hideThirdPartySDKList", "init", "initUpdateShow", "openUrl", "url", "setViewDelegate", "viewDelegate", "showCheckVersionLoading", "showLoading", "showToast", "content", "showVersionName", "updateApplicationPermissionDescUrl", "updateSecurityWhitePaperUrl", "updateThirdPartySDKListUrl", "Companion", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b.e */
public final class MineAboutLarkView implements IView {

    /* renamed from: f */
    public static final Companion f142159f = new Companion(null);

    /* renamed from: a */
    public IView.Delegate f142160a;

    /* renamed from: b */
    public final FragmentActivity f142161b;

    /* renamed from: c */
    public String f142162c;

    /* renamed from: d */
    public String f142163d;

    /* renamed from: e */
    public String f142164e;

    /* renamed from: g */
    private View.OnClickListener f142165g;

    /* renamed from: h */
    private CommonLoadingDialog f142166h = new CommonLoadingDialog();

    /* renamed from: i */
    private AbstractC57608a.AbstractC57610b f142167i;

    /* renamed from: j */
    private final UDTagsDrawable.TagModel f142168j;

    /* renamed from: k */
    private final UDTagsDrawable f142169k;

    /* renamed from: l */
    private AboutFragment f142170l;

    /* renamed from: m */
    private final Context f142171m;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/MineAboutLarkView$Companion;", "", "()V", "KEY_USER_AGREEMENT_UPDATE", "", "KEY_USER_PRIVACY_UPDATE", "LOADING_DIALOG_SIZE", "", "VERSION_PI_TEXT", "underline", "", "Landroid/widget/TextView;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m224015l();
    }

    /* renamed from: j */
    public final AboutFragment mo195838j() {
        return this.f142170l;
    }

    /* renamed from: k */
    public final Context mo195839k() {
        return this.f142171m;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: b */
    public void mo195825b() {
        if (UIUtils.isActivityRunning(this.f142161b)) {
            this.f142166h.dismiss();
        }
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: e */
    public void mo195831e() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f142170l.mo195772a(R.id.application_permission_desc);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "fragment.application_permission_desc");
        constraintLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: f */
    public void mo195833f() {
        LinearLayout linearLayout = (LinearLayout) this.f142170l.mo195772a(R.id.third_party_sdk);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "fragment.third_party_sdk");
        linearLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: g */
    public void mo195834g() {
        LKUIToast.showLoading(this.f142161b, UIHelper.getString(R.string.Lark_NewSettings_SoftwareUpdateCheckingUpdatesNow));
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: a */
    public void mo195822a() {
        this.f142166h.setLabel(UIHelper.getString(R.string.Lark_Legacy_ZipLogIng));
        this.f142166h.setDialogSize(SmEvents.EVENT_NW);
        if (UIUtils.isActivityRunning(this.f142161b)) {
            this.f142166h.show(this.f142161b);
        }
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: c */
    public void mo195827c() {
        String a = C57824f.m224459a(this.f142161b);
        TextView textView = (TextView) this.f142170l.mo195772a(R.id.current_version_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "fragment.current_version_tv");
        textView.setText('V' + a);
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: d */
    public void mo195829d() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f142170l.mo195772a(R.id.security_white_paper);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "fragment.security_white_paper");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f142170l.mo195772a(R.id.passed_information_security_certification);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "fragment.passed_information_security_certification");
        constraintLayout2.setVisibility(8);
    }

    /* renamed from: i */
    public final String mo195837i() {
        String a = C57824f.m224459a(this.f142171m);
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        AbstractC57608a a2 = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDependency()");
        AbstractC57608a a3 = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "UpgradeModule.getDependency()");
        String format = String.format("%s %s\nUID: %s\nDID:%s\nOS: Android %s", Arrays.copyOf(new Object[]{UIHelper.getString(R.string.Lark_NewSettings_AboutFeishuCurrentVersionMobile), a, a2.mo177710d(), a3.mo177709c(), Build.VERSION.RELEASE}, 5));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: h */
    public void mo195835h() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        if (a.mo177725s().mo177731a("user_agreement_update_tip")) {
            UDTagsDrawable uDTagsDrawable = this.f142169k;
            if (uDTagsDrawable != null) {
                TextView textView = (TextView) this.f142170l.mo195772a(R.id.user_agreement_update);
                Intrinsics.checkExpressionValueIsNotNull(textView, "fragment.user_agreement_update");
                uDTagsDrawable.mo91369a(textView);
            }
            AbstractC57608a a2 = C57607a.m223662a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDependency()");
            a2.mo177725s().mo177732b("user_agreement_update_tip");
        } else {
            TextView textView2 = (TextView) this.f142170l.mo195772a(R.id.user_agreement_update);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "fragment.user_agreement_update");
            textView2.setVisibility(8);
        }
        AbstractC57608a a3 = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "UpgradeModule.getDependency()");
        if (a3.mo177725s().mo177731a("user_privacy_update_tip")) {
            UDTagsDrawable uDTagsDrawable2 = this.f142169k;
            if (uDTagsDrawable2 != null) {
                TextView textView3 = (TextView) this.f142170l.mo195772a(R.id.user_privacy_update);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "fragment.user_privacy_update");
                uDTagsDrawable2.mo91369a(textView3);
            }
            AbstractC57608a a4 = C57607a.m223662a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "UpgradeModule.getDependency()");
            a4.mo177725s().mo177732b("user_privacy_update_tip");
            return;
        }
        TextView textView4 = (TextView) this.f142170l.mo195772a(R.id.user_privacy_update);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "fragment.user_privacy_update");
        textView4.setVisibility(8);
    }

    /* renamed from: l */
    private final void m224015l() {
        int i = 0;
        if (DesktopUtil.m144307b()) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.f142170l.mo195772a(R.id.titlebar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "fragment.titlebar");
            commonTitleBar.setVisibility(8);
            TextView textView = (TextView) this.f142170l.mo195772a(R.id.desktop_mine_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "fragment.desktop_mine_title");
            textView.setVisibility(0);
            TextView textView2 = (TextView) this.f142170l.mo195772a(R.id.desktop_mine_title);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "fragment.desktop_mine_title");
            textView2.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_AboutFeishuMobile));
        } else {
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f142170l.mo195772a(R.id.titlebar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "fragment.titlebar");
            commonTitleBar2.setVisibility(0);
            TextView textView3 = (TextView) this.f142170l.mo195772a(R.id.desktop_mine_title);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "fragment.desktop_mine_title");
            textView3.setVisibility(8);
            ((CommonTitleBar) this.f142170l.mo195772a(R.id.titlebar)).setTitle(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_AboutFeishuMobile));
        }
        ((LinearLayout) this.f142170l.mo195772a(R.id.release_notes_ll)).setOnClickListener(new View$OnClickListenerC57691c(this));
        ((LinearLayout) this.f142170l.mo195772a(R.id.lark_best_practice_ll)).setOnClickListener(new View$OnClickListenerC57695g(this));
        ((LinearLayout) this.f142170l.mo195772a(R.id.lark_special_function_ll)).setOnClickListener(new View$OnClickListenerC57696h(this));
        ((ConstraintLayout) this.f142170l.mo195772a(R.id.user_agreement)).setOnClickListener(new View$OnClickListenerC57697i(this));
        ((ConstraintLayout) this.f142170l.mo195772a(R.id.privacy_policy)).setOnClickListener(new View$OnClickListenerC57698j(this));
        ((ConstraintLayout) this.f142170l.mo195772a(R.id.security_white_paper)).setOnClickListener(new View$OnClickListenerC57699k(this));
        ((ConstraintLayout) this.f142170l.mo195772a(R.id.application_permission_desc)).setOnClickListener(new View$OnClickListenerC57700l(this));
        ((LinearLayout) this.f142170l.mo195772a(R.id.third_party_sdk)).setOnClickListener(new View$OnClickListenerC57701m(this));
        ((LinearLayout) this.f142170l.mo195772a(R.id.permission_detail)).setOnClickListener(new View$OnClickListenerC57702n(this));
        ((LinearLayout) this.f142170l.mo195772a(R.id.lark_logo_ll)).setOnClickListener(new C57692d(this));
        this.f142165g = new View$OnClickListenerC57693e(this);
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57613e o = a.mo177721o();
        if (!o.mo177747a()) {
            LinearLayout linearLayout = (LinearLayout) this.f142170l.mo195772a(R.id.lark_best_practice_ll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "fragment.lark_best_practice_ll");
            linearLayout.setVisibility(8);
        }
        if (!o.mo177748b()) {
            LinearLayout linearLayout2 = (LinearLayout) this.f142170l.mo195772a(R.id.lark_special_function_ll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "fragment.lark_special_function_ll");
            linearLayout2.setVisibility(8);
        }
        if (!o.mo177749c()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f142170l.mo195772a(R.id.security_white_paper);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "fragment.security_white_paper");
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f142170l.mo195772a(R.id.passed_information_security_certification);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "fragment.passed_information_security_certification");
            constraintLayout2.setVisibility(8);
        }
        if (!o.mo177750d()) {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f142170l.mo195772a(R.id.application_permission_desc);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "fragment.application_permission_desc");
            constraintLayout3.setVisibility(8);
        }
        if (!o.mo177751e()) {
            LinearLayout linearLayout3 = (LinearLayout) this.f142170l.mo195772a(R.id.third_party_sdk);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "fragment.third_party_sdk");
            linearLayout3.setVisibility(8);
        }
        if (!o.mo177752f()) {
            LinearLayout linearLayout4 = (LinearLayout) this.f142170l.mo195772a(R.id.update_now_ll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "fragment.update_now_ll");
            linearLayout4.setVisibility(8);
        }
        if (!o.mo177753g()) {
            LinearLayout linearLayout5 = (LinearLayout) this.f142170l.mo195772a(R.id.release_notes_ll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "fragment.release_notes_ll");
            linearLayout5.setVisibility(8);
        }
        if (!o.mo177754h()) {
            ConstraintLayout constraintLayout4 = (ConstraintLayout) this.f142170l.mo195772a(R.id.user_agreement);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout4, "fragment.user_agreement");
            constraintLayout4.setVisibility(8);
        }
        if (!o.mo177755i()) {
            ConstraintLayout constraintLayout5 = (ConstraintLayout) this.f142170l.mo195772a(R.id.privacy_policy);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout5, "fragment.privacy_policy");
            constraintLayout5.setVisibility(8);
        }
        if (!C57607a.m223662a().mo177706a("lark.core.anquan.xitongquanxian")) {
            LinearLayout linearLayout6 = (LinearLayout) this.f142170l.mo195772a(R.id.permission_detail);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "fragment.permission_detail");
            linearLayout6.setVisibility(8);
        }
        TextView textView4 = (TextView) this.f142170l.mo195772a(R.id.copy_right_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "fragment.copy_right_tv");
        if (!o.mo177756j()) {
            i = 8;
        }
        textView4.setVisibility(i);
        AbstractC57608a a2 = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDependency()");
        if (a2.mo177708b()) {
            TextView textView5 = (TextView) this.f142170l.mo195772a(R.id.copy_right_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "fragment.copy_right_tv");
            textView5.setText(UIHelper.getString(R.string.Lark_Core_LarkCopyright));
        }
        ((ConstraintLayout) this.f142170l.mo195772a(R.id.lark_version_info)).setOnLongClickListener(new View$OnLongClickListenerC57694f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/MineAboutLarkView$init$10", "Lcom/ss/android/lark/widget/listener/OnMultiClickListener;", "onMultiClick", "", "v", "Landroid/view/View;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$d */
    public static final class C57692d extends AbstractView$OnClickListenerC58543d {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142174a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57692d(MineAboutLarkView eVar) {
            this.f142174a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58543d
        /* renamed from: a */
        public void mo195842a(View view) {
            MineAboutLarkView.m224011a(this.f142174a).mo195818g();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f142160a = aVar;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: c */
    public void mo195828c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f142162c = str;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: d */
    public void mo195830d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f142163d = str;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: e */
    public void mo195832e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f142164e = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$c */
    public static final class View$OnClickListenerC57691c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142173a;

        View$OnClickListenerC57691c(MineAboutLarkView eVar) {
            this.f142173a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView.m224011a(this.f142173a).mo195813b();
            UpgradeHitPoint.f141994a.mo195634f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$g */
    public static final class View$OnClickListenerC57695g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142177a;

        View$OnClickListenerC57695g(MineAboutLarkView eVar) {
            this.f142177a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView.m224011a(this.f142177a).mo195814c();
            UpgradeHitPoint.f141994a.mo195636h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$h */
    public static final class View$OnClickListenerC57696h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142178a;

        View$OnClickListenerC57696h(MineAboutLarkView eVar) {
            this.f142178a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView.m224011a(this.f142178a).mo195815d();
            UpgradeHitPoint.f141994a.mo195635g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$i */
    public static final class View$OnClickListenerC57697i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142179a;

        View$OnClickListenerC57697i(MineAboutLarkView eVar) {
            this.f142179a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView.m224011a(this.f142179a).mo195816e();
            UpgradeHitPoint.f141994a.mo195637i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$j */
    public static final class View$OnClickListenerC57698j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142180a;

        View$OnClickListenerC57698j(MineAboutLarkView eVar) {
            this.f142180a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView.m224011a(this.f142180a).mo195817f();
            UpgradeHitPoint.f141994a.mo195638j();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$k */
    public static final class View$OnClickListenerC57699k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142181a;

        View$OnClickListenerC57699k(MineAboutLarkView eVar) {
            this.f142181a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView eVar = this.f142181a;
            eVar.mo195826b(MineAboutLarkView.m224012b(eVar));
            UpgradeHitPoint.f141994a.mo195640l();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$l */
    public static final class View$OnClickListenerC57700l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142182a;

        View$OnClickListenerC57700l(MineAboutLarkView eVar) {
            this.f142182a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView eVar = this.f142182a;
            eVar.mo195826b(MineAboutLarkView.m224013c(eVar));
            UpgradeHitPoint.f141994a.mo195641m();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$m */
    public static final class View$OnClickListenerC57701m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142183a;

        View$OnClickListenerC57701m(MineAboutLarkView eVar) {
            this.f142183a = eVar;
        }

        public final void onClick(View view) {
            MineAboutLarkView eVar = this.f142183a;
            eVar.mo195826b(MineAboutLarkView.m224014d(eVar));
            UpgradeHitPoint.f141994a.mo195639k();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IView.Delegate m224011a(MineAboutLarkView eVar) {
        IView.Delegate aVar = eVar.f142160a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m224012b(MineAboutLarkView eVar) {
        String str = eVar.f142162c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSecurityWhitePaperUrl");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m224013c(MineAboutLarkView eVar) {
        String str = eVar.f142163d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplicationPermissionDescUrl");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ String m224014d(MineAboutLarkView eVar) {
        String str = eVar.f142164e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyListUrl");
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$n */
    public static final class View$OnClickListenerC57702n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142184a;

        View$OnClickListenerC57702n(MineAboutLarkView eVar) {
            this.f142184a = eVar;
        }

        public final void onClick(View view) {
            this.f142184a.mo195838j().getParentFragmentManager().beginTransaction().add(16908290, new PermissionDetailFragment()).commit();
        }
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: a */
    public void mo195823a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        LKUIToast.show(this.f142161b, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$b */
    static final class View$OnClickListenerC57690b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142172a;

        View$OnClickListenerC57690b(MineAboutLarkView eVar) {
            this.f142172a = eVar;
        }

        public final void onClick(View view) {
            LinearLayout linearLayout = (LinearLayout) this.f142172a.mo195838j().mo195772a(R.id.update_now_ll);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "fragment.update_now_ll");
            linearLayout.setClickable(false);
            MineAboutLarkView.m224011a(this.f142172a).mo195809a();
            UpgradeHitPoint.f141994a.mo195632d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$e */
    public static final class View$OnClickListenerC57693e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142175a;

        View$OnClickListenerC57693e(MineAboutLarkView eVar) {
            this.f142175a = eVar;
        }

        public final void onClick(View view) {
            if (UIUtils.isActivityRunning(this.f142175a.f142161b)) {
                IView.Delegate a = MineAboutLarkView.m224011a(this.f142175a);
                FragmentActivity fragmentActivity = this.f142175a.f142161b;
                if (fragmentActivity != null) {
                    a.mo195810a(fragmentActivity);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            UpgradeHitPoint.f141994a.mo195633e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.e$f */
    public static final class View$OnLongClickListenerC57694f implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MineAboutLarkView f142176a;

        View$OnLongClickListenerC57694f(MineAboutLarkView eVar) {
            this.f142176a = eVar;
        }

        public final boolean onLongClick(View view) {
            Object systemService = this.f142176a.mo195839k().getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            if (clipboardManager == null) {
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Debug info", this.f142176a.mo195837i()));
            UDToast.makeToast(this.f142176a.mo195839k(), (int) R.string.Lark_Legacy_Copied).show();
            return true;
        }
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: b */
    public void mo195826b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        C57607a.m223662a().mo177714h();
        AbstractC57608a.AbstractC57610b bVar = this.f142167i;
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        bVar.mo177739a(a.mo177704a(), str, true);
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView
    /* renamed from: a */
    public void mo195824a(boolean z) {
        LinearLayout linearLayout = (LinearLayout) this.f142170l.mo195772a(R.id.update_now_ll);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "fragment.update_now_ll");
        linearLayout.setClickable(true);
        if (z) {
            TextView textView = (TextView) this.f142170l.mo195772a(R.id.app_version_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "fragment.app_version_tv");
            textView.setText(UIHelper.getString(R.string.Lark_Legacy_FindNewVersion));
            LinearLayout linearLayout2 = (LinearLayout) this.f142170l.mo195772a(R.id.update_now_ll);
            View.OnClickListener onClickListener = this.f142165g;
            if (onClickListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUpdateNowClickListener");
            }
            linearLayout2.setOnClickListener(onClickListener);
            View a = this.f142170l.mo195772a(R.id.new_version_icon_tv);
            Intrinsics.checkExpressionValueIsNotNull(a, "fragment.new_version_icon_tv");
            a.setVisibility(0);
            LKUIToast.cancelLoading();
            return;
        }
        TextView textView2 = (TextView) this.f142170l.mo195772a(R.id.app_version_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "fragment.app_version_tv");
        textView2.setText(UIHelper.getString(R.string.Lark_NewSettings_SoftwareUpdateCheckUpdatesButton));
        ((LinearLayout) this.f142170l.mo195772a(R.id.update_now_ll)).setOnClickListener(new View$OnClickListenerC57690b(this));
        View a2 = this.f142170l.mo195772a(R.id.new_version_icon_tv);
        Intrinsics.checkExpressionValueIsNotNull(a2, "fragment.new_version_icon_tv");
        a2.setVisibility(8);
        LKUIToast.loadSuccess(this.f142161b, UIHelper.getString(R.string.Lark_NewSettings_SoftwareUpdateUpToDateToast));
        UpgradeHitPoint.f141994a.mo195629b();
    }

    public MineAboutLarkView(AboutFragment aVar, Context context) {
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f142170l = aVar;
        this.f142171m = context;
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57610b l = a.mo177718l();
        Intrinsics.checkExpressionValueIsNotNull(l, "UpgradeModule.getDependency().browserDependency");
        this.f142167i = l;
        this.f142161b = this.f142170l.getActivity();
        UDTagsDrawable.TagModel g = new UDTagsDrawable.TagModel.Builder(context).mo91418a(UIHelper.getString(R.string.Lark_Core_UpdatesFound)).mo91419b(UDColorUtils.getColor(context, R.color.udtoken_tag_bg_red)).mo91422c(UDColorUtils.getColor(context, R.color.udtoken_tag_text_s_red)).mo91427g();
        this.f142168j = g;
        this.f142169k = new UDTagsDrawable.Builder(context).mo91384a(g).mo91398i();
    }
}
