package com.ss.android.lark.moments.impl.feed.model.matcher;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/matcher/UserMatcher;", "Lcom/ss/android/lark/moments/impl/feed/model/matcher/IMomentsMatcher;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "match", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.a.f */
public final class UserMatcher implements IMomentsMatcher {

    /* renamed from: a */
    private final String f119939a;

    public UserMatcher(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f119939a = str;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.matcher.IMomentsMatcher
    /* renamed from: a */
    public boolean mo167028a(IMomentsItemBase iMomentsItemBase) {
        String str;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (iMomentsItemBase instanceof MomentsPostVM) {
            String str2 = this.f119939a;
            MomentsUserVM G = ((MomentsPostVM) iMomentsItemBase).mo166423H();
            if (G != null) {
                str = G.mo166364c();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
