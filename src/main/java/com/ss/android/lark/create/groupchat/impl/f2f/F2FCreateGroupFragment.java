package com.ss.android.lark.create.groupchat.impl.f2f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract;
import com.ss.android.lark.create.groupchat.impl.f2f.model.F2FCreateGroupModel;
import com.ss.android.lark.create.groupchat.impl.f2f.view.F2FCreateGroupView;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0003J\b\u0010\u001e\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/F2FCreateGroupFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDependency;", "()V", "presenter", "Lcom/ss/android/lark/create/groupchat/impl/f2f/F2FCreateGroupPresenter;", "rootView", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "currentActivity", "Landroid/app/Activity;", "finishSelf", "", "getRootView", "getSourceType", "", "hasLocationPermissions", "", "initMVPIfNeed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "requestPermissions", "showRequestPermissionDialog", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a */
public final class F2FCreateGroupFragment extends BaseFragment implements IF2FCreateGroupContract.IView.ViewDependency {

    /* renamed from: a */
    private F2FCreateGroupPresenter f93573a;

    /* renamed from: b */
    private ViewGroup f93574b;

    /* renamed from: c */
    private HashMap f93575c;

    /* renamed from: g */
    public void mo133852g() {
        HashMap hashMap = this.f93575c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDependency
    /* renamed from: b */
    public ViewGroup mo133847b() {
        return this.f93574b;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDependency
    /* renamed from: d */
    public void mo133849d() {
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        mo133846a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDependency
    /* renamed from: c */
    public Context mo133848c() {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        return requireContext;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDependency
    /* renamed from: e */
    public int mo133850e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("source_type");
        }
        return 2;
    }

    /* renamed from: h */
    private final boolean m142854h() {
        if (ActivityCompat.checkSelfPermission(mo133848c(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ActivityCompat.checkSelfPermission(mo133848c(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        F2FCreateGroupPresenter cVar = this.f93573a;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f93573a = null;
        mo133852g();
    }

    /* renamed from: i */
    private final void m142855i() {
        new C51331a(requireActivity()).mo176924c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").subscribe(new C36278a(this));
    }

    /* renamed from: a */
    public final void mo133846a() {
        if (!m142854h()) {
            m142855i();
            return;
        }
        F2FCreateGroupPresenter cVar = this.f93573a;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo133901a()) {
                return;
            }
        }
        F2FCreateGroupPresenter cVar2 = new F2FCreateGroupPresenter(new F2FCreateGroupView(this), new F2FCreateGroupModel(mo133848c()));
        this.f93573a = cVar2;
        if (cVar2 != null) {
            cVar2.create();
        }
    }

    /* renamed from: f */
    public final void mo133851f() {
        new C25639g(getContext()).mo89248g(R.string.Lark_Chat_MessageLocationPermissionBanTitle).mo89238b(true).mo89249h(17).mo89250i(R.color.text_title).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_NearbyGroup_AuthorizationContentLocationFailAndroid, "APP_DISPLAY_NAME", UIHelper.getAppName())).mo89256o(R.color.text_placeholder).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_MessageLocationPermissionBanCancelButton, new DialogInterface$OnClickListenerC36279b(this)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Chat_MessageLocationPermissionBanSettingButton, new DialogInterface$OnClickListenerC36280c(this)).mo89239c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "grant", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a$a */
    public static final class C36278a<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupFragment f93576a;

        C36278a(F2FCreateGroupFragment aVar) {
            this.f93576a = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f93576a.mo133851f();
            } else {
                this.f93576a.mo133846a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a$b */
    public static final class DialogInterface$OnClickListenerC36279b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupFragment f93577a;

        DialogInterface$OnClickListenerC36279b(F2FCreateGroupFragment aVar) {
            this.f93577a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93577a.mo133849d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a$c */
    public static final class DialogInterface$OnClickListenerC36280c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupFragment f93578a;

        DialogInterface$OnClickListenerC36280c(F2FCreateGroupFragment aVar) {
            this.f93578a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("package:%1$s", Arrays.copyOf(new Object[]{this.f93578a.mo133848c().getPackageName()}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            this.f93578a.mo133848c().startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_join_f2f_group, viewGroup, false);
        if (inflate != null) {
            this.f93574b = (ViewGroup) inflate;
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
