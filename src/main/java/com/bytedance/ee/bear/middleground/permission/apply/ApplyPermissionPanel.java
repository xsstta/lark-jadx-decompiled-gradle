package com.bytedance.ee.bear.middleground.permission.apply;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.apply.ApplyDocPermPuller;
import com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyPermissionPanel;", "Landroidx/fragment/app/DialogFragment;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "hasSendRequest", "", "module", "", "ownerId", "ownerName", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "token", ShareHitPoint.f121869d, "", "addWatermark", "", "initData", "initView", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "sendRequest", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a */
public final class ApplyPermissionPanel extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f25640c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ApplyPermissionPanel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: j */
    public static final Companion f25641j = new Companion(null);

    /* renamed from: d */
    public int f25642d;

    /* renamed from: e */
    public String f25643e;

    /* renamed from: f */
    public String f25644f;

    /* renamed from: g */
    public String f25645g;

    /* renamed from: h */
    public String f25646h;

    /* renamed from: i */
    public boolean f25647i;

    /* renamed from: k */
    private final Lazy f25648k = LazyKt.lazy(C9559h.INSTANCE);

    /* renamed from: l */
    private C68289a f25649l = new C68289a();

    /* renamed from: m */
    private HashMap f25650m;

    @JvmStatic
    /* renamed from: a */
    public static final void m39480a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, String str4) {
        f25641j.mo36609a(fragmentActivity, str, i, str2, str3, str4);
    }

    /* renamed from: a */
    public View mo36606a(int i) {
        if (this.f25650m == null) {
            this.f25650m = new HashMap();
        }
        View view = (View) this.f25650m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25650m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo36608g() {
        HashMap hashMap = this.f25650m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyPermissionPanel$Companion;", "", "()V", "EXTRA_MODULE", "", "EXTRA_OWNER_ID", "EXTRA_OWNER_NAME", "EXTRA_TOKEN", "EXTRA_TYPE", "TAG", "showPanel", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "token", ShareHitPoint.f121869d, "", "ownerId", "ownerName", "module", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo36609a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "ownerId");
            Intrinsics.checkParameterIsNotNull(str3, "ownerName");
            Intrinsics.checkParameterIsNotNull(str4, "module");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putInt("extra_type", i);
            bundle.putString("extra_owner_id", str2);
            bundle.putString("extra_owner_name", str3);
            bundle.putString("extra_module", str4);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, ApplyPermissionPanel.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), ApplyPermissionPanel.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$h */
    static final class C9559h extends Lambda implements Function0<C10917c> {
        public static final C9559h INSTANCE = new C9559h();

        C9559h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25649l.dispose();
        mo36608g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/permission/apply/ApplyPermissionPanel$initView$3", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftIcon", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$d */
    public static final class C9555d extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25653a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: d */
        public void mo18838d() {
            C13479a.m54764b("ApplyPermissionPanel", "onClickLeftIcon()...");
            if (C13726a.m55676b(this.f25653a.getActivity())) {
                this.f25653a.mo5513b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9555d(ApplyPermissionPanel aVar) {
            this.f25653a = aVar;
        }
    }

    public ApplyPermissionPanel() {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        this.f25642d = aVar.mo32555b();
    }

    /* renamed from: i */
    private final void m39485i() {
        IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        String str = this.f25643e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        aVar.mo40651a(str, String.valueOf(this.f25642d), v_());
    }

    /* renamed from: h */
    private final void m39484h() {
        String str;
        int i;
        String str2;
        String str3;
        String string;
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str = arguments.getString("extra_token", str4)) == null) {
            str = str4;
        }
        this.f25643e = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("extra_type", this.f25642d);
        } else {
            i = this.f25642d;
        }
        this.f25642d = i;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("extra_owner_id", str4)) == null) {
            str2 = str4;
        }
        this.f25645g = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("extra_owner_name", str4)) == null) {
            str3 = str4;
        }
        this.f25646h = str3;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("extra_module", str4)) == null)) {
            str4 = string;
        }
        this.f25644f = str4;
    }

    /* renamed from: f */
    public final void mo36607f() {
        String str;
        C13479a.m54764b("ApplyPermissionPanel", "sendRequest()...");
        this.f25647i = true;
        SpaceEditText spaceEditText = (SpaceEditText) mo36606a(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "notesInput");
        Editable text = spaceEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        ApplyDocPermPuller applyDocPermPuller = new ApplyDocPermPuller((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
        String str2 = this.f25643e;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        this.f25649l.mo237937a(applyDocPermPuller.mo36701a(new ApplyDocPermPuller.Params(str2, String.valueOf(this.f25642d), str, String.valueOf(PermApplyViewModel.PermType.EDIT.getCode()))).mo238001b(new C9557f(this, str), new C9558g(this, str)));
        PermissionAnalyticV2.m39655c(str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (!(v_ == null || (window = v_.getWindow()) == null)) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.softInputMode = 16;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            window.setDimAmount(0.2f);
            window.setWindowAnimations(R.style.ActionSheetAnimation);
            window.setBackgroundDrawableResource(17170445);
        }
        Dialog v_2 = v_();
        if (v_2 != null) {
            v_2.setOnCancelListener(new DialogInterface$OnCancelListenerC9556e(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/apply/ApplyPermissionPanel$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$c */
    public static final class C9554c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25652a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9554c(ApplyPermissionPanel aVar) {
            this.f25652a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f25652a.mo36607f();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39484h();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m39478a(ApplyPermissionPanel aVar) {
        String str = aVar.f25645g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerId");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m39481b(ApplyPermissionPanel aVar) {
        String str = aVar.f25643e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m39482c(ApplyPermissionPanel aVar) {
        String str = aVar.f25646h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ String m39483d(ApplyPermissionPanel aVar) {
        String str = aVar.f25644f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$b */
    public static final class C9553b implements C10074o.AbstractView$OnClickListenerC10075a {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25651a;

        C9553b(ApplyPermissionPanel aVar) {
            this.f25651a = aVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o.AbstractView$OnClickListenerC10075a
        /* renamed from: a */
        public /* synthetic */ boolean mo36610a(TextPaint textPaint) {
            return C10074o.AbstractView$OnClickListenerC10075a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(ApplyPermissionPanel.m39478a(this.f25651a), "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$e */
    static final class DialogInterface$OnCancelListenerC9556e implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25654a;

        DialogInterface$OnCancelListenerC9556e(ApplyPermissionPanel aVar) {
            this.f25654a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            String obj;
            if (!this.f25654a.f25647i) {
                SpaceEditText spaceEditText = (SpaceEditText) this.f25654a.mo36606a(R.id.notesInput);
                Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "notesInput");
                Editable text = spaceEditText.getText();
                boolean z = false;
                if (!(text == null || (obj = text.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                PermissionAnalytic.m39426c(this.f25654a.f25642d, ApplyPermissionPanel.m39481b(this.f25654a), "edit", z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Result;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$f */
    public static final class C9557f<T> implements Consumer<ApplyDocPermPuller.Result> {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25655a;

        /* renamed from: b */
        final /* synthetic */ String f25656b;

        C9557f(ApplyPermissionPanel aVar, String str) {
            this.f25655a = aVar;
            this.f25656b = str;
        }

        /* renamed from: a */
        public final void accept(ApplyDocPermPuller.Result result) {
            boolean z;
            C13479a.m54764b("ApplyPermissionPanel", "sendRequest()...succeed");
            Toast.showSuccessText(this.f25655a.getContext(), (int) R.string.Doc_Facade_SendRequestSuccessfully);
            int i = this.f25655a.f25642d;
            String b = ApplyPermissionPanel.m39481b(this.f25655a);
            if (this.f25656b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            PermissionAnalytic.m39396a(i, b, "edit", z);
            this.f25655a.mo5513b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.a$g */
    public static final class C9558g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ ApplyPermissionPanel f25657a;

        /* renamed from: b */
        final /* synthetic */ String f25658b;

        C9558g(ApplyPermissionPanel aVar, String str) {
            this.f25657a = aVar;
            this.f25658b = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            boolean z;
            C13479a.m54759a("ApplyPermissionPanel", "request perm fail. ", th);
            Context requireContext = this.f25657a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            NotNotifyOperator.m41298a(requireContext, th, ApplyPermissionPanel.m39482c(this.f25657a), ApplyPermissionPanel.m39481b(this.f25657a), ApplyPermissionPanel.m39483d(this.f25657a));
            int i = this.f25657a.f25642d;
            String b = ApplyPermissionPanel.m39481b(this.f25657a);
            if (this.f25658b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            PermissionAnalytic.m39420b(i, b, "edit", z);
        }
    }

    /* renamed from: a */
    private final void m39479a(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        String str = this.f25646h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        }
        sb.append(str);
        String sb2 = sb.toString();
        String a = C10539a.m43639a(getContext(), R.string.Doc_Permission_ApplyEditPermDesc, "owner_name", sb2);
        Intrinsics.checkExpressionValueIsNotNull(a, "tips");
        String str2 = a;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, sb2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new C10074o(getContext(), new C9553b(this)), indexOf$default, sb2.length() + indexOf$default, 33);
        TextView textView = (TextView) view.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.tips");
        textView.setText(spannableString);
        TextView textView2 = (TextView) view.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.tips");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) view.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.tips");
        textView3.setHighlightColor(0);
        ((Button) view.findViewById(R.id.sendRequestBtn)).setOnClickListener(new C9554c(this));
        ((CommonActionPanelLayout) view.findViewById(R.id.title_panel)).setOnActionListener(new C9555d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m39479a(view);
        m39485i();
        PermissionAnalyticV2.m39584F();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.apply_permission_panel_layout, viewGroup, false);
    }
}
