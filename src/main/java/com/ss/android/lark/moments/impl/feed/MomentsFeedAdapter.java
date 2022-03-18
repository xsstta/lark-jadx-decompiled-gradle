package com.ss.android.lark.moments.impl.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.broadcast.MomentsFeedBroadcastViewHolder;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsBroadcastItem;
import com.ss.android.lark.moments.impl.feed.empty.IMomentsNoPost;
import com.ss.android.lark.moments.impl.feed.empty.MomentsNoPostViewHolder;
import com.ss.android.lark.moments.impl.personal.IMomentsProfile;
import com.ss.android.lark.moments.impl.personal.MomentsProfileEmptyPostViewHolder;
import com.ss.android.lark.moments.impl.personal.MomentsProfileHeaderLoadingViewHolder;
import com.ss.android.lark.moments.impl.personal.MomentsProfileViewHolder;
import com.ss.android.lark.moments.impl.personal.MomentsSkeletonViewHolder;
import com.ss.android.lark.moments.impl.personal.follow.IMomentsProfileEmpty;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileDisableFollowInfo;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfileDisableFollowInfoViewHolder;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfileInfoViewHolder;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfilePostViewHolder;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\"\u0010\u001a\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0019\u001a\u00020\nH\u0016J\"\u0010\u001d\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\u001a\u0010!\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "firstPostPosition", "", "getMContext", "()Landroid/content/Context;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "zooView", "getZooView", "()Landroid/view/View;", "setZooView", "(Landroid/view/View;)V", "getDataList", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setData", "list", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.b */
public final class MomentsFeedAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private View f119808a;

    /* renamed from: b */
    private int f119809b = Integer.MAX_VALUE;

    /* renamed from: c */
    private final C1356d<IMomentsItemBase> f119810c = new C1356d<>(this, new C47493a());

    /* renamed from: d */
    private final Context f119811d;

    /* renamed from: e */
    private final IMomentClickListener f119812e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsFeedAdapter$mDiffer$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.b$a */
    public static final class C47493a extends C1374g.AbstractC1378c<IMomentsItemBase> {
        C47493a() {
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
    public final View mo166941a() {
        return this.f119808a;
    }

    /* renamed from: b */
    public final List<IMomentsItemBase> mo166946b() {
        List<IMomentsItemBase> a = this.f119810c.mo7374a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDiffer.currentList");
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f119810c.mo7374a().size();
    }

    /* renamed from: a */
    public void onViewRecycled(AbstractC58967a<?, View> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onViewRecycled(aVar);
        if (aVar instanceof MomentsProfileHeaderLoadingViewHolder) {
            ((MomentsProfileHeaderLoadingViewHolder) aVar).mo167708a();
        } else if (aVar instanceof MomentsSkeletonViewHolder) {
            ((MomentsSkeletonViewHolder) aVar).mo167741a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f119810c.mo7374a().get(i).mo166408t();
    }

    /* renamed from: a */
    public final void mo166945a(List<? extends IMomentsItemBase> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        MomentsFeedAdapter bVar = this;
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (next.mo166408t() == IMomentsItemBase.ItemType.ITEM_TYPE_POST.ordinal()) {
                bVar.f119809b = i;
                break;
            }
            i = i2;
        }
        this.f119810c.mo7376a((List<IMomentsItemBase>) list);
    }

    public MomentsFeedAdapter(Context context, IMomentClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f119811d = context;
        this.f119812e = aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IMomentsItemBase iMomentsItemBase = this.f119810c.mo7374a().get(i);
        if (aVar instanceof MomentsPostViewHolder) {
            if (iMomentsItemBase != null) {
                MomentsPostViewHolder dVar = (MomentsPostViewHolder) aVar;
                dVar.mo165944a((IMomentsPost) iMomentsItemBase);
                if (i == this.f119809b) {
                    dVar.mo166963c();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost");
        } else if (aVar instanceof MomentsUnknownViewHolder) {
            ((MomentsUnknownViewHolder) aVar).mo165944a(iMomentsItemBase);
        } else if (aVar instanceof MomentsProfileViewHolder) {
            MomentsProfileViewHolder lVar = (MomentsProfileViewHolder) aVar;
            if (iMomentsItemBase != null) {
                lVar.mo165944a((IMomentsProfile) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.IMomentsProfile");
        } else if (aVar instanceof MomentsProfileEmptyPostViewHolder) {
            MomentsProfileEmptyPostViewHolder eVar = (MomentsProfileEmptyPostViewHolder) aVar;
            if (iMomentsItemBase != null) {
                eVar.mo165944a((IMomentsProfileEmpty) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.follow.IMomentsProfileEmpty");
        } else if (aVar instanceof MomentsFeedBroadcastViewHolder) {
            MomentsFeedBroadcastViewHolder dVar2 = (MomentsFeedBroadcastViewHolder) aVar;
            if (iMomentsItemBase != null) {
                dVar2.mo165944a((MomentsBroadcastItem) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.MomentsBroadcastItem");
        } else if (aVar instanceof MomentsProfileHeaderLoadingViewHolder) {
            ((MomentsProfileHeaderLoadingViewHolder) aVar).mo165944a((Unit) null);
        } else if (aVar instanceof MomentsSkeletonViewHolder) {
            MomentsSkeletonViewHolder mVar = (MomentsSkeletonViewHolder) aVar;
            if (iMomentsItemBase != null) {
                mVar.mo165944a(iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase");
        } else if (aVar instanceof MomentsNoPostViewHolder) {
            MomentsNoPostViewHolder cVar = (MomentsNoPostViewHolder) aVar;
            if (iMomentsItemBase != null) {
                cVar.mo165944a((IMomentsNoPost) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.feed.empty.IMomentsNoPost");
        } else if (aVar instanceof MomentsProfileInfoViewHolder) {
            MomentsProfileInfoViewHolder fVar = (MomentsProfileInfoViewHolder) aVar;
            if (iMomentsItemBase != null) {
                fVar.mo165944a((IMomentsProfileInfo) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.new.viewholder.IMomentsProfileInfo");
        } else if (aVar instanceof MomentsProfileDisableFollowInfoViewHolder) {
            MomentsProfileDisableFollowInfoViewHolder dVar3 = (MomentsProfileDisableFollowInfoViewHolder) aVar;
            if (iMomentsItemBase != null) {
                dVar3.mo165944a((IMomentsProfileDisableFollowInfo) iMomentsItemBase);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.new.viewholder.IMomentsProfileDisableFollowInfo");
        }
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_POST.ordinal()) {
            return MomentsPostViewHolder.f119829d.mo166973a(viewGroup, this.f119812e);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST.ordinal()) {
            return MomentsProfilePostViewHolder.f120641a.mo167781a(viewGroup, this.f119812e);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_FEED_NO_MORE.ordinal()) {
            return MomentsFeedNoMoreViewHolder.f119828a.mo166957a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_FEED_NO_POST.ordinal()) {
            return MomentsNoPostViewHolder.f119801a.mo166938a(viewGroup, this.f119812e);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_UNKNOWN.ordinal()) {
            return MomentsUnknownViewHolder.f119925a.mo166996a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_FEED_BROADCAST.ordinal()) {
            return MomentsFeedBroadcastViewHolder.f119057b.mo165957a(viewGroup);
        }
        if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_HEADER.ordinal()) {
            MomentsProfileViewHolder a = MomentsProfileViewHolder.f120577c.mo167738a(viewGroup, this.f119812e);
            View view = a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "this.itemView");
            this.f119808a = (FrameLayout) view.findViewById(R.id.profileBackground);
            return a;
        } else if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_INFO.ordinal()) {
            return MomentsProfileInfoViewHolder.f120633b.mo167779a(viewGroup, this.f119812e);
        } else {
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_DISABLE_FOLLOW_INFO.ordinal()) {
                return MomentsProfileDisableFollowInfoViewHolder.f120624a.mo167774a(viewGroup);
            }
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST_EMPTY.ordinal()) {
                return MomentsProfileEmptyPostViewHolder.f120517a.mo167664a(viewGroup, this.f119812e);
            }
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_HEADER_LOADING.ordinal()) {
                return MomentsProfileHeaderLoadingViewHolder.f120561c.mo167710a(viewGroup);
            }
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST_LOADING.ordinal()) {
                return MomentsSkeletonViewHolder.f120592d.mo167743a(viewGroup);
            }
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_INFO_SKELETON.ordinal()) {
                return MomentsSkeletonViewHolder.f120592d.mo167744b(viewGroup);
            }
            if (i == IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST_SKELETON.ordinal()) {
                return MomentsSkeletonViewHolder.f120592d.mo167745c(viewGroup);
            }
            return MomentsUnknownViewHolder.f119925a.mo166996a(viewGroup);
        }
    }
}
