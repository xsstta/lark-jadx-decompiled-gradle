package com.bytedance.ee.bear.drive.biz.comment.data;

import com.bytedance.ee.bear.contract.NetService;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.-$$Lambda$twK-Q9kfd6N1RQCqqZAeKMyMtWU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU implements Function {
    public static final /* synthetic */ $$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU INSTANCE = new $$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU();

    private /* synthetic */ $$Lambda$twKQ9kfd6N1RQCqqZAeKMyMtWU() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return (ArrayList) ((NetService.Result) obj).getData();
    }
}
