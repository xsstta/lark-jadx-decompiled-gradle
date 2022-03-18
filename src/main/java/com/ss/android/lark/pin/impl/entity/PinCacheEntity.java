package com.ss.android.lark.pin.impl.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/pin/impl/entity/PinCacheEntity;", "", "queryKey", "", "position", "", "infoList", "", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "(Ljava/lang/String;ILjava/util/List;)V", "getInfoList", "()Ljava/util/List;", "getPosition", "()I", "getQueryKey", "()Ljava/lang/String;", "timeStamp", "", "getTimeStamp", "()J", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.entity.a */
public final class PinCacheEntity {

    /* renamed from: a */
    private final long f128185a = System.currentTimeMillis();

    /* renamed from: b */
    private final String f128186b;

    /* renamed from: c */
    private final int f128187c;

    /* renamed from: d */
    private final List<PinInfo> f128188d;

    /* renamed from: a */
    public final long mo177384a() {
        return this.f128185a;
    }

    /* renamed from: b */
    public final String mo177385b() {
        return this.f128186b;
    }

    /* renamed from: c */
    public final int mo177386c() {
        return this.f128187c;
    }

    /* renamed from: d */
    public final List<PinInfo> mo177387d() {
        return this.f128188d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.pin.impl.entity.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public PinCacheEntity(String str, int i, List<? extends PinInfo> list) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        this.f128186b = str;
        this.f128187c = i;
        this.f128188d = list;
    }
}
