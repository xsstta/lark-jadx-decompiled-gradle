package com.ss.android.lark.profile.func.profile_setting;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0012H\u0016J$\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\"2\b\b\u0001\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001dH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mDependency", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;)V", "mBlockSwitchListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getMContext", "()Landroid/content/Context;", "getMDependency", "()Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;", "getMRootView", "()Landroid/view/View;", "mViewDelegate", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView$IDelegate;", "create", "", "deleteUserSuccess", "destroy", "initBlock", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/profile_setting/InitViewData;", "initView", "openPhoneQueryAmountEditPage", "userId", "", "openUrl", "url", "resetBlock", "isBlocked", "", "setViewDelegate", "viewDelegate", "showBlockConfirmDialog", "isChecked", "titleId", "", "desId", "showInitData", "showToast", "msg", "Companion", "IProfileSettingDependency", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.profile_setting.f */
public final class ProfileSettingView implements IProfileSettingContract.IView {

    /* renamed from: c */
    public static final Companion f129904c = new Companion(null);

    /* renamed from: a */
    public IProfileSettingContract.IView.IDelegate f129905a;

    /* renamed from: b */
    public CompoundButton.OnCheckedChangeListener f129906b;

    /* renamed from: d */
    private final Context f129907d;

    /* renamed from: e */
    private final View f129908e;

    /* renamed from: f */
    private final IProfileSettingDependency f129909f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;", "", "finish", "", "go2ProfileShare", "content", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "openPhoneQueryAmountEditPage", "userId", "", "openUrl", "url", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$b */
    public interface IProfileSettingDependency {
        /* renamed from: a */
        void mo179447a();

        /* renamed from: a */
        void mo179448a(String str);

        /* renamed from: b */
        void mo179449b(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Context mo179457b() {
        return this.f129907d;
    }

    /* renamed from: c */
    public final View mo179458c() {
        return this.f129908e;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m203251e();
    }

    /* renamed from: d */
    public final IProfileSettingDependency mo179459d() {
        return this.f129909f;
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: a */
    public void mo179430a() {
        this.f129909f.mo179447a();
    }

    /* renamed from: e */
    private final void m203251e() {
        ((CommonTitleBar) this.f129908e.findViewById(R.id.mCommonTitleBar)).setTitle(C57582a.m223604a(this.f129907d, (int) R.string.Lark_NewContacts_SettingsFromProfileMobile));
        ((CommonTitleBar) this.f129908e.findViewById(R.id.mCommonTitleBar)).setLeftClickListener(new View$OnClickListenerC52451d(this));
        ((ConstraintLayout) this.f129908e.findViewById(R.id.mCallSettingLayout)).setOnClickListener(new View$OnClickListenerC52452e(this));
        ((ConstraintLayout) this.f129908e.findViewById(R.id.mReportLayout)).setOnClickListener(new View$OnClickListenerC52453f(this));
        ((TextView) this.f129908e.findViewById(R.id.mDeleteTv)).setOnClickListener(new View$OnClickListenerC52454g(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$d */
    public static final class View$OnClickListenerC52451d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129911a;

        View$OnClickListenerC52451d(ProfileSettingView fVar) {
            this.f129911a = fVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204728h("back");
            this.f129911a.mo179459d().mo179447a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$e */
    public static final class View$OnClickListenerC52452e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129912a;

        View$OnClickListenerC52452e(ProfileSettingView fVar) {
            this.f129912a = fVar;
        }

        public final void onClick(View view) {
            ProfileSettingView.m203249a(this.f129912a).mo179436a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$f */
    public static final class View$OnClickListenerC52453f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129913a;

        View$OnClickListenerC52453f(ProfileSettingView fVar) {
            this.f129913a = fVar;
        }

        public final void onClick(View view) {
            ProfileSettingView.m203249a(this.f129913a).mo179438b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IProfileSettingContract.IView.IDelegate m203249a(ProfileSettingView fVar) {
        IProfileSettingContract.IView.IDelegate aVar = fVar.f129905a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: b */
    public void mo179434b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f129909f.mo179449b(str);
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: c */
    public void mo179435c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        LKUIToast.show(this.f129907d, str);
    }

    /* renamed from: a */
    public void setViewDelegate(IProfileSettingContract.IView.IDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f129905a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$g */
    public static final class View$OnClickListenerC52454g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129914a;

        View$OnClickListenerC52454g(ProfileSettingView fVar) {
            this.f129914a = fVar;
        }

        public final void onClick(View view) {
            new C25639g(this.f129914a.mo179457b()).mo89248g(R.string.Lark_NewContacts_DeleteContactDialogTitle).mo89254m(R.string.Lark_NewContacts_SettingsFromProfileDeletetContactToastMobile).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Delete, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.profile.func.profile_setting.ProfileSettingView.View$OnClickListenerC52454g.DialogInterface$OnClickListenerC524551 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC52454g f129915a;

                {
                    this.f129915a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ProfileSettingView.m203249a(this.f129915a.f129914a).mo179439c();
                }
            }).mo89239c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$j */
    public static final class DialogInterface$OnCancelListenerC52458j implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129920a;

        /* renamed from: b */
        final /* synthetic */ boolean f129921b;

        DialogInterface$OnCancelListenerC52458j(ProfileSettingView fVar, boolean z) {
            this.f129920a = fVar;
            this.f129921b = z;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            ((LKUISwitchButton) this.f129920a.mo179458c().findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(null);
            LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f129920a.mo179458c().findViewById(R.id.mBlockSwitch);
            Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mBlockSwitch");
            lKUISwitchButton.setChecked(!this.f129921b);
            ((LKUISwitchButton) this.f129920a.mo179458c().findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(this.f129920a.f129906b);
        }
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: a */
    public void mo179432a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f129909f.mo179448a(str);
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: a */
    public void mo179433a(boolean z) {
        ((LKUISwitchButton) this.f129908e.findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(null);
        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f129908e.findViewById(R.id.mBlockSwitch);
        Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mBlockSwitch");
        lKUISwitchButton.setChecked(z);
        ((LKUISwitchButton) this.f129908e.findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(this.f129906b);
    }

    /* renamed from: b */
    private final void m203250b(InitViewData bVar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f129908e.findViewById(R.id.mBlockLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mBlockLayout");
        int i = 8;
        if (bVar.mo179440a()) {
            ((ConstraintLayout) this.f129908e.findViewById(R.id.mReportLayout)).setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
            View findViewById = this.f129908e.findViewById(R.id.mReportItemTopLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.mReportItemTopLine");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C57582a.m223601a(this.f129907d, 16.0f));
                View findViewById2 = this.f129908e.findViewById(R.id.mReportItemTopLine);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.mReportItemTopLine");
                findViewById2.setVisibility(0);
                i = 0;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            ((ConstraintLayout) this.f129908e.findViewById(R.id.mReportLayout)).setBackgroundResource(R.drawable.bg_setting_group_item_round);
            View findViewById3 = this.f129908e.findViewById(R.id.mReportItemTopLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.mReportItemTopLine");
            ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(0);
                View findViewById4 = this.f129908e.findViewById(R.id.mReportItemTopLine);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.mReportItemTopLine");
                findViewById4.setVisibility(8);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        constraintLayout.setVisibility(i);
        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f129908e.findViewById(R.id.mBlockSwitch);
        Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mBlockSwitch");
        lKUISwitchButton.setChecked(bVar.mo179441b());
        this.f129906b = new C52450c(this);
        ((LKUISwitchButton) this.f129908e.findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(this.f129906b);
    }

    @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView
    /* renamed from: a */
    public void mo179431a(InitViewData bVar) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m203250b(bVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f129908e.findViewById(R.id.mReportLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView.mReportLayout");
        int i3 = 0;
        if (bVar.mo179442c()) {
            ((ConstraintLayout) this.f129908e.findViewById(R.id.mBlockLayout)).setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
            i = 0;
        } else {
            ((ConstraintLayout) this.f129908e.findViewById(R.id.mBlockLayout)).setBackgroundResource(R.drawable.bg_setting_group_item_round);
            i = 8;
        }
        constraintLayout.setVisibility(i);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f129908e.findViewById(R.id.mCallSettingLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mRootView.mCallSettingLayout");
        if (bVar.mo179443d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        constraintLayout2.setVisibility(i2);
        Group group = (Group) this.f129908e.findViewById(R.id.mDeleteBtnGroup);
        Intrinsics.checkExpressionValueIsNotNull(group, "mRootView.mDeleteBtnGroup");
        if (!bVar.mo179444e()) {
            i3 = 8;
        }
        group.setVisibility(i3);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$i */
    public static final class DialogInterface$OnClickListenerC52457i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129918a;

        /* renamed from: b */
        final /* synthetic */ boolean f129919b;

        DialogInterface$OnClickListenerC52457i(ProfileSettingView fVar, boolean z) {
            this.f129918a = fVar;
            this.f129919b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ProfileSettingView.m203249a(this.f129918a).mo179437a(this.f129919b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$c */
    public static final class C52450c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129910a;

        C52450c(ProfileSettingView fVar) {
            this.f129910a = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C53241h.m205898b("ProfileSettingView", "current status : " + z);
            if (!z) {
                this.f129910a.mo179456a(z, R.string.Lark_NewContacts_UnblockUserDialogTitle, R.string.Lark_NewContacts_UnblockDesc);
            } else {
                this.f129910a.mo179456a(z, R.string.Lark_NewContacts_BlockUserDialogTitle, R.string.Lark_NewContacts_BlockDesc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.f$h */
    public static final class DialogInterface$OnClickListenerC52456h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingView f129916a;

        /* renamed from: b */
        final /* synthetic */ boolean f129917b;

        DialogInterface$OnClickListenerC52456h(ProfileSettingView fVar, boolean z) {
            this.f129916a = fVar;
            this.f129917b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((LKUISwitchButton) this.f129916a.mo179458c().findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(null);
            LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) this.f129916a.mo179458c().findViewById(R.id.mBlockSwitch);
            Intrinsics.checkExpressionValueIsNotNull(lKUISwitchButton, "mRootView.mBlockSwitch");
            lKUISwitchButton.setChecked(!this.f129917b);
            ((LKUISwitchButton) this.f129916a.mo179458c().findViewById(R.id.mBlockSwitch)).setOnCheckedChangeListener(this.f129916a.f129906b);
        }
    }

    public ProfileSettingView(Context context, View view, IProfileSettingDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f129907d = context;
        this.f129908e = view;
        this.f129909f = bVar;
    }

    /* renamed from: a */
    public final void mo179456a(boolean z, int i, int i2) {
        new C25639g(this.f129907d).mo89248g(i).mo89254m(i2).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, new DialogInterface$OnClickListenerC52456h(this, z)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC52457i(this, z)).mo89226a(new DialogInterface$OnCancelListenerC52458j(this, z)).mo89239c();
    }
}
