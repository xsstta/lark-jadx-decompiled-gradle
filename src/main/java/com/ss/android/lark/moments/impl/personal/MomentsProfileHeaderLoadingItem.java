package com.ss.android.lark.moments.impl.personal;

import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileHeaderLoadingItem;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "()V", "id", "", "getId", "()Ljava/lang/String;", "getItemType", "", "isContentSame", "", "diffable", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.f */
public final class MomentsProfileHeaderLoadingItem implements IMomentsItemBase {

    /* renamed from: a */
    private final String f120525a = "MomentsProfileHeaderLoadingItem";

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        return true;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f120525a;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_HEADER_LOADING.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        return iMomentsItemBase instanceof MomentsProfileHeaderLoadingItem;
    }
}
