package com.bytedance.ee.bear.bitable.pro.roledetail;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment;
import com.bytedance.ee.bear.bitable.pro.Role;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/roledetail/BitableProRoleDetailFragment;", "Lcom/bytedance/ee/bear/bitable/pro/BaseBitableProFragment;", "()V", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "getStatusBarColorRes", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.b.a */
public final class BitableProRoleDetailFragment extends BaseBitableProFragment {

    /* renamed from: b */
    public static final Companion f14190b = new Companion(null);

    /* renamed from: c */
    private Role f14191c = new Role(null, null, null, null, 0, false, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);

    /* renamed from: d */
    private HashMap f14192d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b.a$c */
    static final class View$OnClickListenerC4835c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC4835c f14194a = new View$OnClickListenerC4835c();

        View$OnClickListenerC4835c() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public int mo18913a() {
        return R.color.bg_base;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: a */
    public View mo18914a(int i) {
        if (this.f14192d == null) {
            this.f14192d = new HashMap();
        }
        View view = (View) this.f14192d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14192d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment
    /* renamed from: b */
    public void mo18915b() {
        HashMap hashMap = this.f14192d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo18915b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/roledetail/BitableProRoleDetailFragment$Companion;", "", "()V", "EXTRA_ROLE", "", "newInstance", "Landroidx/fragment/app/Fragment;", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo18934a(Role role) {
            Intrinsics.checkParameterIsNotNull(role, "role");
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_role", role);
            BitableProRoleDetailFragment aVar = new BitableProRoleDetailFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/roledetail/BitableProRoleDetailFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b.a$b */
    public static final class C4834b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableProRoleDetailFragment f14193a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4834b(BitableProRoleDetailFragment aVar) {
            this.f14193a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f14193a.getContext() instanceof Activity) {
                Context context = this.f14193a.getContext();
                if (context != null) {
                    ((Activity) context).onBackPressed();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra_role");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f14191c = (Role) serializable;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.Role");
    }

    @Override // com.bytedance.ee.bear.bitable.pro.BaseBitableProFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) mo18914a(R.id.defaultRoleLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "defaultRoleLayout");
        if (this.f14191c.isDefault()) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f14191c.isDefaultTypeEdit()) {
            ((TextView) mo18914a(R.id.defaultRoleTitle)).setText(R.string.Bitable_AdvancedPermission_DefaultEditPermissionTitle);
            ((TextView) mo18914a(R.id.defaultRoleDesc)).setText(R.string.Bitable_AdvancedPermission_DefaultEditPermissionDesc);
        } else if (this.f14191c.isDefaultTypeRead()) {
            ((TextView) mo18914a(R.id.defaultRoleTitle)).setText(R.string.Bitable_AdvancedPermission_DefaultViewPermissionTitle);
            ((TextView) mo18914a(R.id.defaultRoleDesc)).setText(R.string.Bitable_AdvancedPermission_DefaultViewPermissionDesc);
        }
        TextView textView = (TextView) mo18914a(R.id.roleNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "roleNameTv");
        textView.setText(this.f14191c.getName());
        ((BaseTitleBar) mo18914a(R.id.titleBar)).setLeftClickListener(new C4834b(this));
        view.setOnClickListener(View$OnClickListenerC4835c.f14194a);
        RecyclerView recyclerView = (RecyclerView) mo18914a(R.id.tableRoleRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "tableRoleRecycler");
        recyclerView.setAdapter(new BitableRoleTablePermAdapter(this.f14191c.getTableRoleList()));
        RecyclerView recyclerView2 = (RecyclerView) mo18914a(R.id.tableRoleRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "tableRoleRecycler");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(requireContext()));
        RecyclerView recyclerView3 = (RecyclerView) mo18914a(R.id.tableRoleRecycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "tableRoleRecycler");
        SettingGroupHelper.m88816a(recyclerView3, false, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitable_pro_role_detail_layout, viewGroup, false);
    }
}
