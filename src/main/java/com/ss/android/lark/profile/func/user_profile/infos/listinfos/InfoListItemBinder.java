package com.ss.android.lark.profile.func.user_profile.infos.listinfos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.user_profile.base.IBinderDependency;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0016\b\u0000\u0010\u0001*\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0002*\b\b\u0001\u0010\u0003*\u00020\u00052\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0006\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0017B\r\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014R\u0010\u0010\u0007\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListItemBinder;", "B", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "D", "Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListDataSource;", "itemBinder", "(Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;)V", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListItemBinder$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "setDesktopLayout", "rootView", "lineView", "labelView", "ViewHolder", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.d.d */
public final class InfoListItemBinder<B extends BaseInfoBinder<D, ? extends IBinderDependency>, D extends BaseInfoViewData> extends BaseInfoBinder<InfoListDataSource<D>, IBinderDependency> {

    /* renamed from: a */
    private final B f130287a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListItemBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.d.d$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoListItemBinder(B b) {
        super(b.mo179589a());
        Intrinsics.checkParameterIsNotNull(b, "itemBinder");
        this.f130287a = b;
    }

    /* renamed from: b */
    public ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.info_list_item_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_sub_items);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setAdapter(new InfoListItemAdapter(this.f130287a));
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
        ViewHolder aVar = new ViewHolder(inflate);
        if (DesktopUtil.m144307b()) {
            View view = aVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "vh.itemView");
            View findViewById = aVar.itemView.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "vh.itemView.findViewById(R.id.divider)");
            View findViewById2 = aVar.itemView.findViewById(R.id.tv_type_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vh.itemView.findViewById(R.id.tv_type_name)");
            mo179843a(view, findViewById, findViewById2);
        }
        return aVar;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.base.IProfileBinder
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo179592a(View view, Object obj) {
        mo179882a(view, (InfoListDataSource) ((InfoListDataSource) obj));
    }

    /* renamed from: a */
    public void mo179882a(View view, InfoListDataSource<D> aVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View findViewById = view.findViewById(R.id.tv_type_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_type_name)");
        mo179844a((TextView) findViewById, aVar.mo179856a());
        view.setOnClickListener(null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_sub_items);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        InfoListItemAdapter bVar = (InfoListItemAdapter) recyclerView.getAdapter();
        if (bVar == null) {
            bVar = new InfoListItemAdapter(this.f130287a);
        }
        bVar.mo179879a(aVar.mo179870b());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public void mo179843a(View view, View view2, View view3) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(view2, "lineView");
        Intrinsics.checkParameterIsNotNull(view3, "labelView");
        super.mo179843a(view, view2, view3);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_sub_items);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.rv_sub_items");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
