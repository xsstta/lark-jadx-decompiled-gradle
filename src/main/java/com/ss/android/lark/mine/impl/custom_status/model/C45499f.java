package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"noOpenedUserCustomStatus", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getNoOpenedUserCustomStatus", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "uninitializedUserCustomStatus", "getUninitializedUserCustomStatus", "core_mine_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.f */
public final class C45499f {

    /* renamed from: a */
    private static final UserCustomStatus f115120a;

    /* renamed from: b */
    private static final UserCustomStatus f115121b;

    /* renamed from: a */
    public static final UserCustomStatus m180678a() {
        return f115120a;
    }

    /* renamed from: b */
    public static final UserCustomStatus m180679b() {
        return f115121b;
    }

    static {
        UserCustomStatus a = new UserCustomStatus.C16422a().build();
        Intrinsics.checkExpressionValueIsNotNull(a, "UserCustomStatus.Builder().build()");
        f115120a = a;
        UserCustomStatus a2 = new UserCustomStatus.C16422a().build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UserCustomStatus.Builder().build()");
        f115121b = a2;
    }
}
