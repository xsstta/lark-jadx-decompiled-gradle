package com.ss.android.lark.moments.impl.personal.follow.viewmodel;

import com.bytedance.lark.pb.moments.v1.MomentUser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "", "user", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onGoing", "", "(Lcom/bytedance/lark/pb/moments/v1/MomentUser;Z)V", "getOnGoing", "()Z", "setOnGoing", "(Z)V", "getUser", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "setUser", "(Lcom/bytedance/lark/pb/moments/v1/MomentUser;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.a */
public final class FollowMomentUser {

    /* renamed from: a */
    private MomentUser f120545a;

    /* renamed from: b */
    private boolean f120546b;

    /* renamed from: a */
    public final MomentUser mo167688a() {
        return this.f120545a;
    }

    /* renamed from: b */
    public final boolean mo167689b() {
        return this.f120546b;
    }

    public FollowMomentUser(MomentUser momentUser, boolean z) {
        Intrinsics.checkParameterIsNotNull(momentUser, "user");
        this.f120545a = momentUser;
        this.f120546b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowMomentUser(MomentUser momentUser, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(momentUser, (i & 2) != 0 ? false : z);
    }
}
