package com.ss.android.lark.moments.impl.publish.hashtag;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\n2\u0010\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\"\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ChatTypeStateKeeper.f135670e, "", "(Lkotlin/jvm/functions/Function1;)V", "association", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAssociations", "list", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.a */
public final class AssociationListAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private final ArrayList<MomentsPublishViewModel.AssociationItem> f120795a = new ArrayList<>();

    /* renamed from: b */
    private final Function1<String, Unit> f120796b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120795a.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AssociationListAdapter(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        this.f120796b = function1;
    }

    /* renamed from: a */
    public final void mo168101a(List<MomentsPublishViewModel.AssociationItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f120795a.clear();
        this.f120795a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return AssociationViewHolder.f120797a.mo168104a(viewGroup, this.f120796b);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        MomentsPublishViewModel.AssociationItem bVar = this.f120795a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bVar, "association[position]");
        ((AssociationViewHolder) aVar).mo165944a(bVar);
    }
}
