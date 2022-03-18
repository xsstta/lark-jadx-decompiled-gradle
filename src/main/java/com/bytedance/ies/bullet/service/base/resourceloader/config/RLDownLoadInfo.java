package com.bytedance.ies.bullet.service.base.resourceloader.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/RLDownLoadInfo;", "", "filePath", "", "isCache", "", "(Ljava/lang/String;Z)V", "getFilePath", "()Ljava/lang/String;", "()Z", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.g */
public final class RLDownLoadInfo {

    /* renamed from: a */
    private final String f37928a;

    /* renamed from: b */
    private final boolean f37929b;

    /* renamed from: a */
    public final String mo52734a() {
        return this.f37928a;
    }

    /* renamed from: b */
    public final boolean mo52735b() {
        return this.f37929b;
    }

    public RLDownLoadInfo(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        this.f37928a = str;
        this.f37929b = z;
    }
}
