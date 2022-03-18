package com.bytedance.ee.bear.middleground.permission.setting.permselect;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "()V", "location", "", "permType", "", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;", "willLock", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "setSelected", "isContainerSelected", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a */
public final class SelectPermTypeFragment extends C4860a {

    /* renamed from: f */
    public static final Companion f26874f = new Companion(null);

    /* renamed from: c */
    public boolean f26875c;

    /* renamed from: d */
    public String f26876d = "";

    /* renamed from: e */
    public int f26877e;

    /* renamed from: g */
    private SelectPermTypeViewModel f26878g;

    /* renamed from: h */
    private HashMap f26879h;

    @JvmStatic
    /* renamed from: a */
    public static final DialogInterface$OnCancelListenerC1021b m41375a(FragmentActivity fragmentActivity, boolean z, String str) {
        return f26874f.mo38118a(fragmentActivity, z, str);
    }

    /* renamed from: f */
    public void mo38117f() {
        HashMap hashMap = this.f26879h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo38117f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$Companion;", "", "()V", "EXTRA_LOCATION", "", "EXTRA_WILL_LOCK", "TAG", "show", "Landroidx/fragment/app/DialogFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "willLock", "", "location", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DialogInterface$OnCancelListenerC1021b mo38118a(FragmentActivity fragmentActivity, boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "location");
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_will_lock", z);
            bundle.putString("extra_location", str);
            String name = SelectPermTypeFragment.class.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "SelectPermTypeFragment::class.java.name");
            Fragment instantiate = Fragment.instantiate(fragmentActivity, name, bundle);
            if (instantiate != null) {
                DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) instantiate;
                bVar.mo5511a(fragmentActivity.getSupportFragmentManager(), name);
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SelectPermTypeViewModel bVar = this.f26878g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.reset();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$b */
    public static final class C9940b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectPermTypeFragment f26880a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9940b(SelectPermTypeFragment aVar) {
            this.f26880a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26880a.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$onViewCreated$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$c */
    public static final class C9941c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectPermTypeFragment f26881a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9941c(SelectPermTypeFragment aVar) {
            this.f26881a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26881a.mo38116c(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$onViewCreated$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$d */
    public static final class C9942d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectPermTypeFragment f26882a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9942d(SelectPermTypeFragment aVar) {
            this.f26882a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26882a.mo38116c(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$onViewCreated$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$e */
    public static final class C9943e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectPermTypeFragment f26883a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9943e(SelectPermTypeFragment aVar) {
            this.f26883a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            PermissionAnalyticV2.f25731a.mo36684a(false, this.f26883a.f26876d, this.f26883a.f26875c);
            this.f26883a.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeFragment$onViewCreated$5", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.a$f */
    public static final class C9944f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SelectPermTypeFragment f26884a;

        /* renamed from: b */
        final /* synthetic */ View f26885b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            int i = 1;
            PermissionAnalyticV2.f25731a.mo36684a(true, this.f26884a.f26876d, this.f26884a.f26875c);
            SelectPermTypeFragment aVar = this.f26884a;
            SelectItemView selectItemView = (SelectItemView) this.f26885b.findViewById(R.id.containerItem);
            Intrinsics.checkExpressionValueIsNotNull(selectItemView, "view.containerItem");
            if (!selectItemView.isSelected()) {
                i = 2;
            }
            aVar.f26877e = i;
            this.f26884a.mo5513b();
        }

        C9944f(SelectPermTypeFragment aVar, View view) {
            this.f26884a = aVar;
            this.f26885b = view;
        }
    }

    /* renamed from: c */
    public final void mo38116c(boolean z) {
        SelectItemView selectItemView;
        SelectItemView selectItemView2;
        View view = getView();
        if (!(view == null || (selectItemView2 = (SelectItemView) view.findViewById(R.id.singePageItem)) == null)) {
            selectItemView2.setSelected(!z);
        }
        View view2 = getView();
        if (view2 != null && (selectItemView = (SelectItemView) view2.findViewById(R.id.containerItem)) != null) {
            selectItemView.mo38108a(z, this.f26875c);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        SelectPermTypeViewModel bVar = this.f26878g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.setPermType(this.f26877e);
        SelectPermTypeViewModel bVar2 = this.f26878g;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar2.setDismiss(true);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(SelectPermTypeViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…ypeViewModel::class.java)");
        this.f26878g = (SelectPermTypeViewModel) a;
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("extra_will_lock", false);
        }
        this.f26875c = z;
        Bundle arguments2 = getArguments();
        String str = "";
        if (!(arguments2 == null || (string = arguments2.getString("extra_location", str)) == null)) {
            str = string;
        }
        this.f26876d = str;
        C13479a.m54764b("SelectPermTypeFragment", "will lock = " + this.f26875c);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        PermissionAnalyticV2.f25731a.mo36683N();
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setLeftClickListener(new C9940b(this));
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setMainTitleSize(17.0f);
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setTitle(R.string.CreationMobile_Wiki_PermChange_title);
        mo38116c(false);
        ((SelectItemView) view.findViewById(R.id.singePageItem)).setOnClickListener(new C9941c(this));
        ((SelectItemView) view.findViewById(R.id.containerItem)).setOnClickListener(new C9942d(this));
        if (this.f26875c) {
            ((SelectItemView) view.findViewById(R.id.containerItem)).setDescription(view.getContext().getString(R.string.CreationMobile_Wiki_Perm_ExternalShare_Current_notice));
        }
        ((UDButton) view.findViewById(R.id.cancelBtn)).setOnClickListener(new C9943e(this));
        ((UDButton) view.findViewById(R.id.confirmBtn)).setOnClickListener(new C9944f(this, view));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_select_perm_type_fragment, viewGroup, false);
    }
}
