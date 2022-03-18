package com.bytedance.ee.bear.bitable.pro.member;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment;
import com.bytedance.ee.bear.bitable.pro.BitableProRepository;
import com.bytedance.ee.bear.bitable.pro.BitableProViewModel;
import com.bytedance.ee.bear.bitable.pro.BitableProViewModelFactory;
import com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger;
import com.bytedance.ee.bear.bitable.pro.Role;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberManagerFragment;", "Lcom/bytedance/ee/bear/bitable/pro/BaseBitableProFragment;", "()V", "adapter", "Lcom/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberAdapter;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "token", "", "viewModel", "Lcom/bytedance/ee/bear/bitable/pro/BitableProViewModel;", "getStatusBarColorRes", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "removeMember", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "showRemoveDialog", "triggerToInviteMember", "updateListStatus", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.a.b */
public final class BitableRoleMemberManagerFragment extends BaseBitableProFragment {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f14164b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableRoleMemberManagerFragment.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: f */
    public static final Companion f14165f = new Companion(null);

    /* renamed from: c */
    public Role f14166c = new Role(null, null, null, null, 0, false, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);

    /* renamed from: d */
    public BitableProViewModel f14167d;

    /* renamed from: e */
    public BitableRoleMemberAdapter f14168e;

    /* renamed from: g */
    private String f14169g = "";

    /* renamed from: h */
    private ArrayList<TableSimpleInfo> f14170h = new ArrayList<>();

    /* renamed from: i */
    private final C68289a f14171i = new C68289a();

    /* renamed from: j */
    private final Lazy f14172j = LazyKt.lazy(new C4820b(this));

    /* renamed from: k */
    private HashMap f14173k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$e */
    static final class View$OnClickListenerC4823e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC4823e f14174a = new View$OnClickListenerC4823e();

        View$OnClickListenerC4823e() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public int mo18913a() {
        return R.color.bg_body;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public View mo18914a(int i) {
        if (this.f14173k == null) {
            this.f14173k = new HashMap();
        }
        View view = (View) this.f14173k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14173k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: b */
    public void mo18915b() {
        HashMap hashMap = this.f14173k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public final C11824c mo18921c() {
        Lazy lazy = this.f14172j;
        KProperty kProperty = f14164b[0];
        return (C11824c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberManagerFragment$Companion;", "", "()V", "EXTRA_ROLE", "", "EXTRA_TABLE_LIST", "EXTRA_TOKEN", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "token", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo18924a(String str, ArrayList<TableSimpleInfo> arrayList, Role role) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(arrayList, "tableList");
            Intrinsics.checkParameterIsNotNull(role, "role");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putSerializable("extra_table_list", arrayList);
            bundle.putSerializable("extra_role", role);
            BitableRoleMemberManagerFragment bVar = new BitableRoleMemberManagerFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$b */
    static final class C4820b extends Lambda implements Function0<C11824c> {
        final /* synthetic */ BitableRoleMemberManagerFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4820b(BitableRoleMemberManagerFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.getContext());
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f14171i.mo237935a();
        mo18915b();
    }

    /* renamed from: d */
    public final void mo18922d() {
        if (getActivity() instanceof IBitableProPageTrigger) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((IBitableProPageTrigger) activity).mo18864b(this.f14166c);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.IBitableProPageTrigger");
        }
    }

    /* renamed from: e */
    public final void mo18923e() {
        if (this.f14166c.getMembers().isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) mo18914a(R.id.memberRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "memberRecycler");
            recyclerView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo18914a(R.id.emptyLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "emptyLayout");
            linearLayout.setVisibility(0);
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) mo18914a(R.id.memberRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "memberRecycler");
        recyclerView2.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo18914a(R.id.emptyLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "emptyLayout");
        linearLayout2.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$c */
    static final class C4821c extends Lambda implements Function1<UserInfo, Unit> {
        public static final C4821c INSTANCE = new C4821c();

        C4821c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
            invoke(userInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "it");
            AbstractC5586d dVar = (AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null);
            String id = userInfo.getId();
            if (id == null) {
                id = "";
            }
            dVar.mo22257a(id, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$d */
    static final class C4822d extends Lambda implements Function1<UserInfo, Unit> {
        final /* synthetic */ BitableRoleMemberManagerFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4822d(BitableRoleMemberManagerFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
            invoke(userInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "it");
            if (this.this$0.f14166c.isDefault()) {
                Toast.showText(this.this$0.getContext(), (int) R.string.Bitable_AdvancedPermission_DefaultRoleCantRemoveCollaborator);
            } else {
                this.this$0.mo18919a(userInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberManagerFragment$onViewCreated$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$g */
    public static final class C4825g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14176a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4825g(BitableRoleMemberManagerFragment bVar) {
            this.f14176a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            FragmentActivity activity = this.f14176a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberManagerFragment$onViewCreated$5", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$i */
    public static final class C4827i extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14178a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4827i(BitableRoleMemberManagerFragment bVar) {
            this.f14178a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f14178a.mo18922d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberManagerFragment$onViewCreated$2", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$f */
    public static final class C4824f extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14175a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f14175a.mo18922d();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4824f(BitableRoleMemberManagerFragment bVar, Drawable drawable) {
            super(drawable);
            this.f14175a = bVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BitableRoleMemberAdapter m19927a(BitableRoleMemberManagerFragment bVar) {
        BitableRoleMemberAdapter aVar = bVar.f14168e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ BitableProViewModel m19928b(BitableRoleMemberManagerFragment bVar) {
        BitableProViewModel eVar = bVar.f14167d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$k */
    public static final class C4829k<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14180a;

        C4829k(BitableRoleMemberManagerFragment bVar) {
            this.f14180a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BitableRoleMemberManagerFragment", "removeMember()...error", th);
            Toast.showFailureText(this.f14180a.getActivity(), (int) R.string.Doc_Share_EditFailed);
            this.f14180a.mo18921c().mo45303c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$j */
    public static final class C4828j<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14179a;

        C4828j(BitableRoleMemberManagerFragment bVar) {
            this.f14179a = bVar;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            BitableRoleMemberManagerFragment.m19928b(this.f14179a).fetchRoleResult();
            Toast.showSuccessText(this.f14179a.getActivity(), (int) R.string.Doc_Facade_Success);
            this.f14179a.mo18921c().mo45303c();
        }
    }

    /* renamed from: b */
    public final void mo18920b(UserInfo userInfo) {
        mo18921c().mo45304d();
        BitableProViewModel eVar = this.f14167d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        this.f14171i.mo237937a(eVar.removeMember(this.f14166c, userInfo).mo238001b(new C4828j(this), new C4829k(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "Lkotlin/collections/ArrayList;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$h */
    static final class C4826h<T> implements AbstractC1178x<ArrayList<Role>> {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14177a;

        C4826h(BitableRoleMemberManagerFragment bVar) {
            this.f14177a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<Role> arrayList) {
            T t;
            if (arrayList != null) {
                BitableRoleMemberManagerFragment bVar = this.f14177a;
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getRoleId(), this.f14177a.f14166c.getRoleId())) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    t2 = this.f14177a.f14166c;
                }
                bVar.f14166c = t2;
                BitableRoleMemberManagerFragment.m19927a(this.f14177a).mo70690f(this.f14177a.f14166c.getMembers());
                this.f14177a.mo18923e();
            }
        }
    }

    /* renamed from: a */
    public final void mo18919a(UserInfo userInfo) {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        new BearUDDialogBuilder(requireContext).mo45344a(R.string.Bitable_AdvancedPermission_MoveCollaboratorTitle).mo45362d(R.string.Bitable_AdvancedPermission_MoveCollaboratorDesc).mo45345a(R.id.ud_dialog_btn_primary, R.string.Bitable_Form_Remove, R.color.function_danger_500, new DialogInterface$OnClickListenerC4830l(this, userInfo)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45359b();
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
        this.f14169g = str;
        Bundle arguments2 = getArguments();
        Serializable serializable2 = null;
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("extra_table_list");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f14170h = (ArrayList) serializable;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                serializable2 = arguments3.getSerializable("extra_role");
            }
            if (serializable2 != null) {
                this.f14166c = (Role) serializable2;
                AbstractC1142af a = aj.m5367a(requireActivity(), new BitableProViewModelFactory(new BitableProRepository(this.f14169g, this.f14170h))).mo6005a(BitableProViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…ProViewModel::class.java)");
                this.f14167d = (BitableProViewModel) a;
                this.f14168e = new BitableRoleMemberAdapter(this.f14166c, C4821c.INSTANCE, new C4822d(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.Role");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> /* = java.util.ArrayList<com.bytedance.ee.bear.TableSimpleInfo> */");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.b$l */
    public static final class DialogInterface$OnClickListenerC4830l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberManagerFragment f14181a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f14182b;

        DialogInterface$OnClickListenerC4830l(BitableRoleMemberManagerFragment bVar, UserInfo userInfo) {
            this.f14181a = bVar;
            this.f14182b = userInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f14181a.mo18920b(this.f14182b);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(View$OnClickListenerC4823e.f14174a);
        ((BaseTitleBar) mo18914a(R.id.titleBar)).setActionIconTint(R.color.icon_n1);
        ((BaseTitleBar) mo18914a(R.id.titleBar)).mo45070a(new C4824f(this, C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_member_add_outlined, (int) R.color.facade_selector_icon_n1)));
        ((BaseTitleBar) mo18914a(R.id.titleBar)).setLeftClickListener(new C4825g(this));
        RecyclerView recyclerView = (RecyclerView) mo18914a(R.id.memberRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "memberRecycler");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo18914a(R.id.memberRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "memberRecycler");
        BitableRoleMemberAdapter aVar = this.f14168e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(aVar);
        BitableProViewModel eVar = this.f14167d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.getRoleListLiveData().mo5923a(getViewLifecycleOwner(), new C4826h(this));
        ((SpaceEmptyState) mo18914a(R.id.emptyStateView)).setPrimaryClickListener(new C4827i(this));
        mo18923e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitable_role_member_manager_layout, viewGroup, false);
    }
}
