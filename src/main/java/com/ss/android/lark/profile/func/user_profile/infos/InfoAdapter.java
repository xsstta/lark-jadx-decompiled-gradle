package com.ss.android.lark.profile.func.user_profile.infos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.profile.func.user_profile.base.IBinderDependency;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/InfoAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "mContext", "Landroid/content/Context;", "binderPools", "Lcom/ss/android/lark/profile/func/user_profile/infos/BinderPool;", "(Landroid/content/Context;Lcom/ss/android/lark/profile/func/user_profile/infos/BinderPool;)V", BottomDialog.f17198f, "", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setChatterId", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.d */
public final class InfoAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, BaseInfoViewData> {

    /* renamed from: a */
    private String f130278a;

    /* renamed from: b */
    private final Context f130279b;

    /* renamed from: c */
    private final BinderPool f130280c;

    /* renamed from: a */
    public final void mo179877a(String str) {
        this.f130278a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        BaseInfoViewData bVar = (BaseInfoViewData) getItem(i);
        if (bVar != null) {
            return (long) bVar.mo179590d().hashCode();
        }
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        BinderPool cVar = this.f130280c;
        String name = ((BaseInfoViewData) getItem(i)).getClass().getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "getItem(position).javaClass.name");
        return cVar.mo179867a(name);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/InfoAdapter$onCreateViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.d$a */
    public static final class C52633a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ InfoAdapter f130281a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52633a(InfoAdapter dVar, View view) {
            super(view);
            this.f130281a = dVar;
        }
    }

    public InfoAdapter(Context context, BinderPool cVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(cVar, "binderPools");
        this.f130279b = context;
        this.f130280c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseInfoBinder<BaseInfoViewData, IBinderDependency> aVar;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        BaseInfoBinder<BaseInfoViewData, IBinderDependency> a = this.f130280c.mo179868a(getItemViewType(i));
        if (!(a instanceof StatusItemBinder)) {
            aVar = null;
        } else {
            aVar = a;
        }
        StatusItemBinder bVar = (StatusItemBinder) aVar;
        if (bVar != null) {
            bVar.mo179919a(this.f130278a);
        }
        if (a != null) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            Object item = getItem(i);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
            a.mo179592a(view, item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        BaseInfoBinder<BaseInfoViewData, IBinderDependency> a2 = this.f130280c.mo179868a(i);
        if (a2 == null || (a = a2.mo179842a(viewGroup)) == null) {
            return new C52633a(this, new View(this.f130279b));
        }
        return a;
    }
}
