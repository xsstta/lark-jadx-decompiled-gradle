package com.ss.android.lark.moments.impl.personal;

import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfilePostLoadingItem;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "needTopMargin", "", "(Z)V", "id", "", "getId", "()Ljava/lang/String;", "getNeedTopMargin", "()Z", "getItemType", "", "isContentSame", "diffable", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.j */
public final class MomentsProfilePostLoadingItem implements IMomentsItemBase {

    /* renamed from: a */
    private final String f120573a;

    /* renamed from: b */
    private final boolean f120574b;

    public MomentsProfilePostLoadingItem() {
        this(false, 1, null);
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        return true;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f120573a;
    }

    /* renamed from: b */
    public final boolean mo167717b() {
        return this.f120574b;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_POST_SKELETON.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        return iMomentsItemBase instanceof MomentsProfilePostLoadingItem;
    }

    public MomentsProfilePostLoadingItem(boolean z) {
        this.f120574b = z;
        this.f120573a = "MomentsProfilePostLoadingItem";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsProfilePostLoadingItem(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
