package com.ss.android.lark.moments.impl.notice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.notice.holder.MomentsNotificationEmptyHolder;
import com.ss.android.lark.moments.impl.notice.holder.MomentsNotificationHolder;
import com.ss.android.lark.moments.impl.notice.holder.MomentsNotificationUnknownHolder;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0016J\"\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "firstNotificationPosition", "", "getMContext", "()Landroid/content/Context;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "getDataList", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.a */
public final class MomentsNotificationAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private int f120381a = Integer.MAX_VALUE;

    /* renamed from: b */
    private final C1356d<IMomentsNotificationBaseVM> f120382b = new C1356d<>(this, new C47786a());

    /* renamed from: c */
    private final Context f120383c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/notice/MomentsNotificationAdapter$mDiffer$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a$a */
    public static final class C47786a extends C1374g.AbstractC1378c<IMomentsNotificationBaseVM> {
        C47786a() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM, IMomentsNotificationBaseVM iMomentsNotificationBaseVM2) {
            Intrinsics.checkParameterIsNotNull(iMomentsNotificationBaseVM, "oldItem");
            Intrinsics.checkParameterIsNotNull(iMomentsNotificationBaseVM2, "newItem");
            return iMomentsNotificationBaseVM.isItemSame(iMomentsNotificationBaseVM2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM, IMomentsNotificationBaseVM iMomentsNotificationBaseVM2) {
            Intrinsics.checkParameterIsNotNull(iMomentsNotificationBaseVM, "oldItem");
            Intrinsics.checkParameterIsNotNull(iMomentsNotificationBaseVM2, "newItem");
            return iMomentsNotificationBaseVM.isContentSame(iMomentsNotificationBaseVM2);
        }
    }

    /* renamed from: a */
    public final List<IMomentsNotificationBaseVM> mo167520a() {
        List<IMomentsNotificationBaseVM> a = this.f120382b.mo7374a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDiffer.currentList");
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120382b.mo7374a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f120382b.mo7374a().get(i).mo167583a();
    }

    public MomentsNotificationAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f120383c = context;
    }

    /* renamed from: a */
    public final void mo167522a(List<? extends IMomentsNotificationBaseVM> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        MomentsNotificationAdapter aVar = this;
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
            if (next.mo167583a() == IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_NOTIFICATION.ordinal()) {
                aVar.f120381a = i;
                break;
            }
            i = i2;
        }
        this.f120382b.mo7376a((List<IMomentsNotificationBaseVM>) list);
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_UNKNOWN.ordinal()) {
            return MomentsNotificationUnknownHolder.f120402a.mo167533a(viewGroup);
        }
        if (i == IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_FOOTER.ordinal()) {
            return MomentsNotificationEmptyHolder.f120384a.mo167525a(viewGroup);
        }
        return MomentsNotificationHolder.f120387e.mo167530a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IMomentsNotificationBaseVM iMomentsNotificationBaseVM = this.f120382b.mo7374a().get(i);
        if (aVar instanceof MomentsNotificationHolder) {
            if (!(iMomentsNotificationBaseVM instanceof IMomentsNotificationVM)) {
                iMomentsNotificationBaseVM = null;
            }
            IMomentsNotificationVM bVar = (IMomentsNotificationVM) iMomentsNotificationBaseVM;
            if (bVar != null) {
                MomentsNotificationHolder bVar2 = (MomentsNotificationHolder) aVar;
                bVar2.mo165944a(bVar);
                if (i == this.f120381a) {
                    bVar2.mo167526a();
                }
            }
        }
    }
}
