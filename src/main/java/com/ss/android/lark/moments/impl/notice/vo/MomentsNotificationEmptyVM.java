package com.ss.android.lark.moments.impl.notice.vo;

import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/vo/MomentsNotificationEmptyVM;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationEmptyVM;", "()V", "getItemType", "", "isContentSame", "", "diffable", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationBaseVM;", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.vo.c */
public final class MomentsNotificationEmptyVM implements IMomentsNotificationEmptyVM {
    @Override // com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationBaseVM
    /* renamed from: a */
    public int mo167583a() {
        return IMomentsNotificationBaseVM.ItemType.ITEM_TYPE_FOOTER.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM) {
        return iMomentsNotificationBaseVM instanceof MomentsNotificationEmptyVM;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsNotificationBaseVM iMomentsNotificationBaseVM) {
        return iMomentsNotificationBaseVM instanceof MomentsNotificationEmptyVM;
    }
}
