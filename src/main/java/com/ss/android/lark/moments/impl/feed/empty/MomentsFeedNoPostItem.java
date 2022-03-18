package com.ss.android.lark.moments.impl.feed.empty;

import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/empty/MomentsFeedNoPostItem;", "Lcom/ss/android/lark/moments/impl/feed/empty/IMomentsNoPost;", "isError", "", "enableCreatePost", "fromCategoryDetail", "isHotHashTagPage", "tabId", "", "(ZZZZLjava/lang/String;)V", "getEnableCreatePost", "()Z", "getFromCategoryDetail", "id", "getId", "()Ljava/lang/String;", "getTabId", "getItemType", "", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.a.b */
public final class MomentsFeedNoPostItem implements IMomentsNoPost {

    /* renamed from: a */
    public static final Companion f119795a = new Companion(null);

    /* renamed from: b */
    private final boolean f119796b;

    /* renamed from: c */
    private final boolean f119797c;

    /* renamed from: d */
    private final boolean f119798d;

    /* renamed from: e */
    private final boolean f119799e;

    /* renamed from: f */
    private final String f119800f;

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return "MomentsFeedNoPostItem";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/empty/MomentsFeedNoPostItem$Companion;", "", "()V", "ITEM_ID", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.empty.IMomentsNoPost
    /* renamed from: b */
    public boolean mo166932b() {
        return this.f119796b;
    }

    @Override // com.ss.android.lark.moments.impl.feed.empty.IMomentsNoPost
    /* renamed from: c */
    public String mo166933c() {
        return this.f119800f;
    }

    @Override // com.ss.android.lark.moments.impl.feed.empty.IMomentsNoPost
    /* renamed from: d */
    public boolean mo166934d() {
        return this.f119799e;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_FEED_NO_POST.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        return iMomentsItemBase instanceof IMomentsNoPost;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase instanceof IMomentsNoPost) {
            IMomentsNoPost aVar = (IMomentsNoPost) iMomentsItemBase;
            if (mo166932b() != aVar.mo166932b() || !Intrinsics.areEqual(mo166933c(), aVar.mo166933c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public MomentsFeedNoPostItem(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabId");
        this.f119796b = z;
        this.f119797c = z2;
        this.f119798d = z3;
        this.f119799e = z4;
        this.f119800f = str;
    }
}
