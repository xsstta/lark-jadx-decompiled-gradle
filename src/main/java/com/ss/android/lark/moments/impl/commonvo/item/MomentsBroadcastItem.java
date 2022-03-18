package com.ss.android.lark.moments.impl.commonvo.item;

import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.ss.android.lark.moments.impl.common.utils.C47280c;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsBroadcastItem;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "broadcastList", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "(Ljava/util/List;)V", "getBroadcastList", "()Ljava/util/List;", "id", "", "getId", "()Ljava/lang/String;", "getItemType", "", "isContentSame", "", "diffable", "isItemSame", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.item.c */
public final class MomentsBroadcastItem implements IMomentsItemBase {

    /* renamed from: a */
    public static final Companion f119476a = new Companion(null);

    /* renamed from: b */
    private final String f119477b = "MomentsBroadcastItem";

    /* renamed from: c */
    private final List<Broadcast> f119478c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsBroadcastItem$Companion;", "", "()V", "ITEM_ID", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.item.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f119477b;
    }

    /* renamed from: b */
    public final List<Broadcast> mo166474b() {
        return this.f119478c;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_FEED_BROADCAST.ordinal();
    }

    public MomentsBroadcastItem(List<Broadcast> list) {
        Intrinsics.checkParameterIsNotNull(list, "broadcastList");
        this.f119478c = list;
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase == null || !(iMomentsItemBase instanceof MomentsBroadcastItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        if (!(iMomentsItemBase instanceof MomentsBroadcastItem)) {
            return false;
        }
        return C47280c.m187231a(this.f119478c, ((MomentsBroadcastItem) iMomentsItemBase).f119478c);
    }
}
