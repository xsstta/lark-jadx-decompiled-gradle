package com.ss.android.lark.moments.impl.feed.model.matcher;

import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/matcher/KeyMatcher;", "Lcom/ss/android/lark/moments/impl/feed/model/matcher/IMomentsMatcher;", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "match", "", "item", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.a.c */
public final class KeyMatcher implements IMomentsMatcher {

    /* renamed from: a */
    private final String f119936a;

    public KeyMatcher(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f119936a = str;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.matcher.IMomentsMatcher
    /* renamed from: a */
    public boolean mo167028a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        return Intrinsics.areEqual(iMomentsItemBase.mo166379a(), this.f119936a);
    }
}
