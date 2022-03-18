package com.bytedance.ee.bear.bitable.pro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.widgets.C11824c;
import com.larksuite.suite.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0018H\u0016J\u001a\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProFragment;", "Lcom/bytedance/ee/bear/bitable/pro/BaseBitableProFragment;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "()V", "adapter", "Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter;", "getAdapter", "()Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "token", "", "viewModel", "Lcom/bytedance/ee/bear/bitable/pro/BitableProViewModel;", "getStatusBarColorRes", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onMemberChange", "from", "onViewCreated", "view", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.c */
public final class BitableProFragment extends BaseBitableProFragment implements MemberChangeListener {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f14196b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableProFragment.class), "adapter", "getAdapter()Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableProFragment.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: c */
    public static final Companion f14197c = new Companion(null);

    /* renamed from: d */
    private final Lazy f14198d = LazyKt.lazy(new C4836b(this));

    /* renamed from: e */
    private String f14199e = "";

    /* renamed from: f */
    private ArrayList<TableSimpleInfo> f14200f = new ArrayList<>();

    /* renamed from: g */
    private final Lazy f14201g = LazyKt.lazy(new C4837c(this));

    /* renamed from: h */
    private BitableProViewModel f14202h;

    /* renamed from: i */
    private HashMap f14203i;

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public int mo18913a() {
        return R.color.bg_base;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public View mo18914a(int i) {
        if (this.f14203i == null) {
            this.f14203i = new HashMap();
        }
        View view = (View) this.f14203i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14203i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: b */
    public void mo18915b() {
        HashMap hashMap = this.f14203i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public final BitableProAdapter mo18921c() {
        Lazy lazy = this.f14198d;
        KProperty kProperty = f14196b[0];
        return (BitableProAdapter) lazy.getValue();
    }

    /* renamed from: d */
    public final C11824c mo18938d() {
        Lazy lazy = this.f14201g;
        KProperty kProperty = f14196b[1];
        return (C11824c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProFragment$Companion;", "", "()V", "EXTRA_TABLE_LIST", "", "EXTRA_TOKEN", "newInstance", "Landroidx/fragment/app/Fragment;", "token", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo18939a(String str, ArrayList<TableSimpleInfo> arrayList) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(arrayList, "tableList");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putSerializable("extra_table_list", arrayList);
            BitableProFragment cVar = new BitableProFragment();
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.c$c */
    static final class C4837c extends Lambda implements Function0<C11824c> {
        final /* synthetic */ BitableProFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4837c(BitableProFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.getContext());
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
        mo18915b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.c$b */
    static final class C4836b extends Lambda implements Function0<BitableProAdapter> {
        final /* synthetic */ BitableProFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4836b(BitableProFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BitableProAdapter invoke() {
            IBitableProPageTrigger hVar;
            if (this.this$0.getActivity() instanceof IBitableProPageTrigger) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    hVar = (IBitableProPageTrigger) activity;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger");
                }
            } else {
                hVar = null;
            }
            return new BitableProAdapter(hVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        BitableProViewModel eVar = this.f14202h;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.fetchRoleResult();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "Lkotlin/collections/ArrayList;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.c$d */
    static final class C4838d<T> implements AbstractC1178x<ArrayList<Role>> {

        /* renamed from: a */
        final /* synthetic */ BitableProFragment f14204a;

        C4838d(BitableProFragment cVar) {
            this.f14204a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<Role> arrayList) {
            if (arrayList != null) {
                this.f14204a.mo18921c().mo70690f(arrayList);
            }
            this.f14204a.mo18938d().mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (!(arguments == null || (string = arguments.getString("extra_token", str)) == null)) {
            str = string;
        }
        this.f14199e = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("extra_table_list");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            ArrayList<TableSimpleInfo> arrayList = (ArrayList) serializable;
            this.f14200f = arrayList;
            AbstractC1142af a = aj.m5367a(requireActivity(), new BitableProViewModelFactory(new BitableProRepository(this.f14199e, arrayList))).mo6005a(BitableProViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…ProViewModel::class.java)");
            this.f14202h = (BitableProViewModel) a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> /* = java.util.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> */");
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo18914a(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        recyclerView.setAdapter(mo18921c());
        RecyclerView recyclerView2 = (RecyclerView) mo18914a(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recyclerView");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(requireContext()));
        BitableProViewModel eVar = this.f14202h;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.getRoleListLiveData().mo5923a(getViewLifecycleOwner(), new C4838d(this));
        BitableProViewModel eVar2 = this.f14202h;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar2.fetchRoleResult();
        mo18938d().m49046e();
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitable_pro_fragment_layout, viewGroup, false);
    }
}
