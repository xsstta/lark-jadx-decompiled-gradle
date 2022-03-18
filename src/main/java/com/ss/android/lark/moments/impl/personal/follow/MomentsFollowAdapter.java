package com.ss.android.lark.moments.impl.personal.follow;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.FollowMomentUser;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "getMContext", "()Landroid/content/Context;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.c */
public final class MomentsFollowAdapter extends RecyclerView.Adapter<AbstractC58967a<FollowMomentUser, View>> {

    /* renamed from: a */
    private final C1356d<FollowMomentUser> f120547a = new C1356d<>(this, new C47860a());

    /* renamed from: b */
    private final Context f120548b;

    /* renamed from: c */
    private final IMomentsFollowClickListener f120549c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowAdapter$mDiffer$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.c$a */
    public static final class C47860a extends C1374g.AbstractC1378c<FollowMomentUser> {
        C47860a() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(FollowMomentUser aVar, FollowMomentUser aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
            return Intrinsics.areEqual(aVar.mo167688a().user_id, aVar2.mo167688a().user_id);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(FollowMomentUser aVar, FollowMomentUser aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
            if (!Intrinsics.areEqual(aVar.mo167688a().avatar_key, aVar2.mo167688a().avatar_key) || !Intrinsics.areEqual(aVar.mo167688a().name, aVar2.mo167688a().name) || !Intrinsics.areEqual(aVar.mo167688a().is_current_user_following, aVar2.mo167688a().is_current_user_following) || aVar.mo167689b() != aVar2.mo167689b()) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120547a.mo7374a().size();
    }

    /* renamed from: a */
    public final void mo167701a(List<FollowMomentUser> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f120547a.mo7376a(list);
    }

    /* renamed from: a */
    public AbstractC58967a<FollowMomentUser, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return MomentsFollowViewHolder.f120550b.mo167706a(viewGroup, this.f120549c);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<FollowMomentUser, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        FollowMomentUser aVar2 = this.f120547a.mo7374a().get(i);
        if (aVar2 != null) {
            aVar.mo165944a(aVar2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.follow.viewmodel.FollowMomentUser");
    }

    public MomentsFollowAdapter(Context context, IMomentsFollowClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120548b = context;
        this.f120549c = aVar;
    }
}
