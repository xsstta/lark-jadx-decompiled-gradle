package com.ss.android.lark.moments.impl.categorydetail;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00172\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "()V", "adminsData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/categorydetail/ICategoryAdminRvData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCategoryAdmins", "admins", "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.a */
public final class CategoryAdminAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    public static final Companion f119115a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<Object> f119116b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminAdapter$Companion;", "", "()V", "CATEGORY_ADMIN_RV_ADMIN", "", "CATEGORY_ADMIN_RV_TITLE", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f119116b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(this.f119116b.get(i) instanceof CategoryAdminTitle) ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo165988a(List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(list, "admins");
        this.f119116b.clear();
        this.f119116b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 0) {
            return CategoryAdminTitleViewHolder.f119120a.mo165993a(viewGroup);
        }
        return CategoryAdminViewHolder.f119121a.mo165995a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (aVar instanceof CategoryAdminViewHolder) {
            Object obj = this.f119116b.get(i);
            if (!(obj instanceof CategoryAdminData)) {
                obj = null;
            }
            CategoryAdminData bVar = (CategoryAdminData) obj;
            if (bVar != null) {
                ((CategoryAdminViewHolder) aVar).mo165944a(bVar);
            }
        } else if (aVar instanceof CategoryAdminTitleViewHolder) {
            ((CategoryAdminTitleViewHolder) aVar).mo165944a(Unit.INSTANCE);
        }
    }
}
