package com.ss.android.lark.moments.impl.detail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailCommentLoadingViewHolder;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailCommentViewHolder;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailCountHeaderViewHolder;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailHeaderLoadingViewHolder;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailNoCommentViewHolder;
import com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailPostViewHolder;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.MomentsUnknownViewHolder;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010\u001a\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010\u001d\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eH\u0016J\u001a\u0010!\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "Lcom/ss/android/lark/widget/recyclerview/IAdapterExtension;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "mContext", "Landroid/content/Context;", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getClickListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "firstCommentPosition", "", "firstPostPosition", "getMContext", "()Landroid/content/Context;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getDataList", "", "getItem", "position", "getItemCount", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setData", "list", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.c */
public final class MomentsDetailAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> implements AbstractC58983c<IMomentsItemBase> {

    /* renamed from: a */
    private int f119606a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f119607b = Integer.MAX_VALUE;

    /* renamed from: c */
    private final C1356d<IMomentsItemBase> f119608c = new C1356d<>(this, new C47387a());

    /* renamed from: d */
    private final Context f119609d;

    /* renamed from: e */
    private final IMomentClickListener f119610e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailAdapter$mDiffer$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.c$a */
    public static final class C47387a extends C1374g.AbstractC1378c<IMomentsItemBase> {
        C47387a() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(IMomentsItemBase iMomentsItemBase, IMomentsItemBase iMomentsItemBase2) {
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "oldItem");
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase2, "newItem");
            return iMomentsItemBase.isItemSame(iMomentsItemBase2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(IMomentsItemBase iMomentsItemBase, IMomentsItemBase iMomentsItemBase2) {
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "oldItem");
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase2, "newItem");
            return iMomentsItemBase.isContentSame(iMomentsItemBase2);
        }
    }

    /* renamed from: a */
    public final List<IMomentsItemBase> mo166594a() {
        List<IMomentsItemBase> a = this.f119608c.mo7374a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDiffer.currentList");
        return a;
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f119608c.mo7374a().size();
    }

    /* renamed from: b */
    public IMomentsItemBase mo31276a(int i) {
        IMomentsItemBase iMomentsItemBase = this.f119608c.mo7374a().get(i);
        Intrinsics.checkExpressionValueIsNotNull(iMomentsItemBase, "mDiffer.currentList[position]");
        return iMomentsItemBase;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f119608c.mo7374a().get(i).mo166408t();
    }

    /* renamed from: a */
    public void onViewRecycled(AbstractC58967a<?, View> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onViewRecycled(aVar);
        if (aVar instanceof MomentsDetailCommentLoadingViewHolder) {
            ((MomentsDetailCommentLoadingViewHolder) aVar).mo166508a();
        } else if (aVar instanceof MomentsDetailHeaderLoadingViewHolder) {
            ((MomentsDetailHeaderLoadingViewHolder) aVar).mo166531a();
        } else if (aVar instanceof MomentsDetailCommentViewHolder) {
            ((MomentsDetailCommentViewHolder) aVar).mo166514b();
        }
    }

    /* renamed from: a */
    public final void mo166597a(List<? extends IMomentsItemBase> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (t2.mo166408t() == IMomentsItemBase.ItemType.ITEM_TYPE_POST.ordinal()) {
                this.f119606a = Math.min(i, this.f119606a);
            } else if (t2.mo166408t() == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COMMENT.ordinal()) {
                this.f119607b = Math.min(i, this.f119607b);
            }
            i = i2;
        }
        this.f119608c.mo7376a((List<IMomentsItemBase>) list);
    }

    public MomentsDetailAdapter(Context context, IMomentClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f119609d = context;
        this.f119610e = aVar;
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_POST.ordinal()) {
            return MomentsDetailPostViewHolder.f119559a.mo166556a(viewGroup, this.f119610e);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COUNT_HEAD.ordinal()) {
            return MomentsDetailCountHeaderViewHolder.f119545a.mo166530a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COMMENT.ordinal()) {
            return MomentsDetailCommentViewHolder.f119500b.mo166520a(viewGroup, this.f119610e);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COMMENT_LOADING.ordinal()) {
            return MomentsDetailCommentLoadingViewHolder.f119495c.mo166510a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_ROOT_LOADING.ordinal()) {
            return MomentsDetailHeaderLoadingViewHolder.f119546c.mo166533a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_NO_COMMENT.ordinal()) {
            return MomentsDetailNoCommentViewHolder.f119551a.mo166537a(viewGroup, this.f119610e);
        }
        return MomentsUnknownViewHolder.f119925a.mo166996a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IMomentsItemBase iMomentsItemBase = this.f119608c.mo7374a().get(i);
        if (aVar instanceof MomentsDetailPostViewHolder) {
            if (iMomentsItemBase != null) {
                MomentsDetailPostViewHolder gVar = (MomentsDetailPostViewHolder) aVar;
                gVar.mo165944a((IMomentsPost) iMomentsItemBase);
                if (i == this.f119606a) {
                    gVar.mo166963c();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost");
        } else if (aVar instanceof MomentsDetailCountHeaderViewHolder) {
            if (iMomentsItemBase != null) {
                ((MomentsDetailCountHeaderViewHolder) aVar).mo165944a((MomentsDetailLabelItem) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem");
        } else if (aVar instanceof MomentsDetailCommentViewHolder) {
            if (iMomentsItemBase != null) {
                MomentsDetailCommentViewHolder bVar = (MomentsDetailCommentViewHolder) aVar;
                bVar.mo165944a((IMomentsComment) iMomentsItemBase);
                if (i == this.f119607b) {
                    bVar.mo166512a();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment");
        } else if (aVar instanceof MomentsDetailCommentLoadingViewHolder) {
            ((MomentsDetailCommentLoadingViewHolder) aVar).mo165944a((Unit) null);
        } else if (aVar instanceof MomentsDetailHeaderLoadingViewHolder) {
            ((MomentsDetailHeaderLoadingViewHolder) aVar).mo165944a((Unit) null);
        } else if (aVar instanceof MomentsDetailNoCommentViewHolder) {
            ((MomentsDetailNoCommentViewHolder) aVar).mo165944a((Unit) null);
        }
    }
}
