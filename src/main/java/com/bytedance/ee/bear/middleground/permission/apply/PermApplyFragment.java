package com.bytedance.ee.bear.middleground.permission.apply;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.apply.PermApplyViewModel;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "oriSoftInputMode", "", "Ljava/lang/Integer;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "getParams", "()Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "setParams", "(Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;)V", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "parseArgs", "showActionSheet", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e */
public class PermApplyFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25689a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermApplyFragment.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;"))};

    /* renamed from: d */
    public static final Companion f25690d = new Companion(null);

    /* renamed from: b */
    protected NoPermission f25691b;

    /* renamed from: c */
    public final C68289a f25692c = new C68289a();

    /* renamed from: e */
    private final Lazy f25693e = LazyKt.lazy(new C9572h(this));

    /* renamed from: f */
    private Integer f25694f;

    /* renamed from: g */
    private HashMap f25695g;

    /* renamed from: a */
    public View mo36618a(int i) {
        if (this.f25695g == null) {
            this.f25695g = new HashMap();
        }
        View view = (View) this.f25695g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25695g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final PermApplyViewModel mo36620b() {
        Lazy lazy = this.f25693e;
        KProperty kProperty = f25689a[0];
        return (PermApplyViewModel) lazy.getValue();
    }

    /* renamed from: e */
    public void mo36623e() {
        HashMap hashMap = this.f25695g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo36623e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment$Companion;", "", "()V", "PARAMS", "", "TAG", "newInstance", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final PermApplyFragment mo36624a(NoPermission noPermission) {
            Intrinsics.checkParameterIsNotNull(noPermission, "params");
            PermApplyFragment eVar = new PermApplyFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("Params", noPermission);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$h */
    static final class C9572h extends Lambda implements Function0<PermApplyViewModel> {
        final /* synthetic */ PermApplyFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9572h(PermApplyFragment eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PermApplyViewModel invoke() {
            PermApplyViewModel.Companion aVar = PermApplyViewModel.Companion;
            PermApplyFragment eVar = this.this$0;
            return aVar.mo36604a(eVar, eVar.mo36619a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final NoPermission mo36619a() {
        NoPermission noPermission = this.f25691b;
        if (noPermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return noPermission;
    }

    /* renamed from: f */
    private final void m39512f() {
        Serializable serializable = requireArguments().getSerializable("Params");
        if (serializable != null) {
            this.f25691b = (NoPermission) serializable;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.apply.NoPermission");
    }

    /* renamed from: g */
    private final void m39513g() {
        ((BaseTitleBar) mo36618a(R.id.permission_title_bar)).setLeftClickListener(new View$OnClickListenerC9564b(this));
        ((LinearLayout) mo36618a(R.id.permission_type_choose)).setOnClickListener(new View$OnClickListenerC9565c(this));
        ((TextView) mo36618a(R.id.send_request)).setOnClickListener(new C9566d(this));
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        Window window;
        super.onDestroy();
        Integer num = this.f25694f;
        if (num != null) {
            int intValue = num.intValue();
            FragmentActivity activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setSoftInputMode(intValue);
            }
        }
        this.f25692c.dispose();
    }

    /* renamed from: c */
    public void mo36621c() {
        ((BaseTitleBar) mo36618a(R.id.permission_title_bar)).setDividerVisible(false);
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo36618a(R.id.permission_title_bar);
        NoPermission noPermission = this.f25691b;
        if (noPermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        baseTitleBar.setLeftIconVisibility(noPermission.getBackVisible());
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo36618a(R.id.no_data_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "no_data_empty_state");
        ViewGroup.LayoutParams layoutParams = spaceEmptyState.getLayoutParams();
        layoutParams.width = (int) ((getResources().getDimension(R.dimen.ud_emptystate_padding_horizontal) * ((float) 2)) + getResources().getDimension(R.dimen.space_permission_apply_max_width));
        SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) mo36618a(R.id.no_data_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "no_data_empty_state");
        spaceEmptyState2.setLayoutParams(layoutParams);
        ((SpaceEmptyState) mo36618a(R.id.no_data_empty_state)).setTitle(mo36620b().getTipsText());
        ((SpaceEmptyState) mo36618a(R.id.no_data_empty_state)).setDesc(mo36620b().getOwnerText());
        mo36620b().getPermType().mo5923a(getViewLifecycleOwner(), new C9569e(this));
    }

    /* renamed from: d */
    public final void mo36622d() {
        int i;
        int i2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C11811a a = C11811a.m48976a(activity);
            C11816b.C11818a a2 = C11816b.m49006a().mo45254a(activity.getText(R.string.Doc_Facade_ReadPermission)).mo45253a(new View$OnClickListenerC9570f(this));
            PermApplyViewModel.PermType b = mo36620b().getPermType().mo5927b();
            if (b == null || b.getCode() != 1) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "context");
                i = activity.getResources().getColor(R.color.text_title);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(activity, "context");
                i = activity.getResources().getColor(R.color.primary_pri_500);
            }
            C11811a a3 = a.mo45219a(a2.mo45251a(i).mo45257a());
            C11816b.C11818a a4 = C11816b.m49006a().mo45254a(activity.getText(R.string.Doc_Facade_EditPermission)).mo45253a(new View$OnClickListenerC9571g(this));
            PermApplyViewModel.PermType b2 = mo36620b().getPermType().mo5927b();
            if (b2 == null || b2.getCode() != 4) {
                i2 = activity.getResources().getColor(R.color.text_title);
            } else {
                i2 = activity.getResources().getColor(R.color.primary_pri_500);
            }
            a3.mo45219a(a4.mo45251a(i2).mo45257a()).mo45213a().mo45231c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment$bindListener$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$d */
    public static final class C9566d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25698a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9566d(PermApplyFragment eVar) {
            this.f25698a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$d$a */
        static final class C9567a<T> implements Consumer<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C9566d f25699a;

            /* renamed from: b */
            final /* synthetic */ int f25700b;

            /* renamed from: c */
            final /* synthetic */ String f25701c;

            /* renamed from: d */
            final /* synthetic */ String f25702d;

            C9567a(C9566d dVar, int i, String str, String str2) {
                this.f25699a = dVar;
                this.f25700b = i;
                this.f25701c = str;
                this.f25702d = str2;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                boolean z;
                int i = this.f25700b;
                String token = this.f25699a.f25698a.mo36619a().getToken();
                String str = this.f25701c;
                if (this.f25702d.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                PermissionAnalytic.m39396a(i, token, str, z);
                Toast.showSuccessText(this.f25699a.f25698a.getContext(), this.f25699a.f25698a.getString(R.string.Doc_Facade_SendRequestSuccessfully), 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$d$b */
        static final class C9568b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C9566d f25703a;

            /* renamed from: b */
            final /* synthetic */ int f25704b;

            /* renamed from: c */
            final /* synthetic */ String f25705c;

            /* renamed from: d */
            final /* synthetic */ String f25706d;

            C9568b(C9566d dVar, int i, String str, String str2) {
                this.f25703a = dVar;
                this.f25704b = i;
                this.f25705c = str;
                this.f25706d = str2;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                boolean z;
                C13479a.m54759a("PermApplyFragment", "request perm fail. ", th);
                int i = this.f25704b;
                String token = this.f25703a.f25698a.mo36619a().getToken();
                String str = this.f25705c;
                if (this.f25706d.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                PermissionAnalytic.m39420b(i, token, str, z);
                Context context = this.f25703a.f25698a.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                Intrinsics.checkExpressionValueIsNotNull(th, "e");
                NotNotifyOperator.m41298a(context, th, this.f25703a.f25698a.mo36619a().getOwnerName(), this.f25703a.f25698a.mo36619a().getToken(), this.f25703a.f25698a.mo36619a().getDocumentType());
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            int i;
            String str;
            int i2;
            C10548d.m43697a(this.f25698a.getView());
            SpaceEditText spaceEditText = (SpaceEditText) this.f25698a.mo36618a(R.id.edit_optional);
            Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "edit_optional");
            String valueOf = String.valueOf(spaceEditText.getText());
            Integer intOrNull = StringsKt.toIntOrNull(this.f25698a.mo36619a().getDocumentType());
            if (intOrNull != null) {
                i = intOrNull.intValue();
            } else {
                i = -1;
            }
            if (this.f25698a.mo36620b().getPermType().mo5927b() == PermApplyViewModel.PermType.EDIT) {
                str = "edit";
            } else {
                str = "read";
            }
            Disposable b = this.f25698a.mo36620b().requestPerm(valueOf).mo238001b(new C9567a(this, i, str, valueOf), new C9568b(this, i, str, valueOf));
            String token = this.f25698a.mo36619a().getToken();
            int b2 = C8275a.m34051b(this.f25698a.mo36619a().getDocumentType());
            String subType = this.f25698a.mo36619a().getSubType();
            boolean fromVc = this.f25698a.mo36619a().getFromVc();
            boolean isWiki = this.f25698a.mo36619a().isWiki();
            String module = this.f25698a.mo36619a().getModule();
            String userPerm = this.f25698a.mo36619a().getUserPerm();
            String publicPerm = this.f25698a.mo36619a().getPublicPerm();
            PermApplyViewModel.PermType b3 = this.f25698a.mo36620b().getPermType().mo5927b();
            if (b3 != null) {
                i2 = b3.getCode();
            } else {
                i2 = 1;
            }
            PermissionAnalyticV2.m39620a(token, b2, subType, fromVc, isWiki, module, userPerm, publicPerm, i2, valueOf);
            this.f25698a.f25692c.mo237937a(b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$c */
    public static final class View$OnClickListenerC9565c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25697a;

        View$OnClickListenerC9565c(PermApplyFragment eVar) {
            this.f25697a = eVar;
        }

        public final void onClick(View view) {
            C10548d.m43697a(view);
            this.f25697a.mo36622d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment$showActionSheet$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$f */
    public static final class View$OnClickListenerC9570f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25708a;

        View$OnClickListenerC9570f(PermApplyFragment eVar) {
            this.f25708a = eVar;
        }

        public final void onClick(View view) {
            this.f25708a.mo36620b().setPermType(PermApplyViewModel.PermType.READ);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/middleground/permission/apply/PermApplyFragment$showActionSheet$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$g */
    public static final class View$OnClickListenerC9571g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25709a;

        View$OnClickListenerC9571g(PermApplyFragment eVar) {
            this.f25709a = eVar;
        }

        public final void onClick(View view) {
            this.f25709a.mo36620b().setPermType(PermApplyViewModel.PermType.EDIT);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermApplyViewModel$PermType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$e */
    public static final class C9569e<T> implements AbstractC1178x<PermApplyViewModel.PermType> {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25707a;

        C9569e(PermApplyFragment eVar) {
            this.f25707a = eVar;
        }

        /* renamed from: a */
        public final void onChanged(PermApplyViewModel.PermType permType) {
            TextView textView = (TextView) this.f25707a.mo36618a(R.id.permission_type);
            Intrinsics.checkExpressionValueIsNotNull(textView, "permission_type");
            textView.setText(permType.getText());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        Integer num;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        m39512f();
        FragmentActivity activity = getActivity();
        if (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(attributes.softInputMode);
        }
        this.f25694f = num;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.e$b */
    public static final class View$OnClickListenerC9564b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermApplyFragment f25696a;

        View$OnClickListenerC9564b(PermApplyFragment eVar) {
            this.f25696a = eVar;
        }

        public final void onClick(View view) {
            PermissionAnalyticV2.m39657c(this.f25696a.mo36619a().getToken(), C8275a.m34051b(this.f25696a.mo36619a().getDocumentType()), this.f25696a.mo36619a().getSubType(), this.f25696a.mo36619a().getFromVc(), this.f25696a.mo36619a().isWiki(), this.f25696a.mo36619a().getModule(), this.f25696a.mo36619a().getUserPerm(), this.f25696a.mo36619a().getPublicPerm());
            FragmentActivity activity = this.f25696a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo36621c();
        m39513g();
        NoPermission noPermission = this.f25691b;
        if (noPermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int b = C8275a.m34051b(noPermission.getDocumentType());
        NoPermission noPermission2 = this.f25691b;
        if (noPermission2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = noPermission2.getToken();
        NoPermission noPermission3 = this.f25691b;
        if (noPermission3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = noPermission3.getSubType();
        NoPermission noPermission4 = this.f25691b;
        if (noPermission4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        boolean fromVc = noPermission4.getFromVc();
        NoPermission noPermission5 = this.f25691b;
        if (noPermission5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        boolean isWiki = noPermission5.isWiki();
        NoPermission noPermission6 = this.f25691b;
        if (noPermission6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String module = noPermission6.getModule();
        NoPermission noPermission7 = this.f25691b;
        if (noPermission7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String userPerm = noPermission7.getUserPerm();
        NoPermission noPermission8 = this.f25691b;
        if (noPermission8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        PermissionAnalyticV2.m39619a(token, b, subType, fromVc, isWiki, module, userPerm, noPermission8.getPublicPerm());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_apply, viewGroup, false);
    }
}
