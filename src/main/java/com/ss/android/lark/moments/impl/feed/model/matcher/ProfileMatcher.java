package com.ss.android.lark.moments.impl.feed.model.matcher;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/matcher/ProfileMatcher;", "Lcom/ss/android/lark/moments/impl/feed/model/matcher/IMomentsMatcher;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "match", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.a.d */
public final class ProfileMatcher implements IMomentsMatcher {

    /* renamed from: a */
    private final String f119937a;

    public ProfileMatcher(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f119937a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r2) == false) goto L_0x0021;
     */
    @Override // com.ss.android.lark.moments.impl.feed.model.matcher.IMomentsMatcher
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo167028a(com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            boolean r0 = r4 instanceof com.ss.android.lark.moments.impl.personal.MomentsProfileItem
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r3.f119937a
            r2 = r4
            com.ss.android.lark.moments.impl.personal.i r2 = (com.ss.android.lark.moments.impl.personal.MomentsProfileItem) r2
            com.ss.android.lark.moments.impl.commonvo.g r2 = r2.mo167651b()
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r2.mo166364c()
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L_0x0039
        L_0x0021:
            boolean r0 = r4 instanceof com.ss.android.lark.moments.impl.commonvo.MomentsPostVM
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.f119937a
            com.ss.android.lark.moments.impl.commonvo.f r4 = (com.ss.android.lark.moments.impl.commonvo.MomentsPostVM) r4
            com.ss.android.lark.moments.impl.commonvo.g r4 = r4.mo166423H()
            if (r4 == 0) goto L_0x0033
            java.lang.String r1 = r4.mo166364c()
        L_0x0033:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.model.matcher.ProfileMatcher.mo167028a(com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase):boolean");
    }
}
