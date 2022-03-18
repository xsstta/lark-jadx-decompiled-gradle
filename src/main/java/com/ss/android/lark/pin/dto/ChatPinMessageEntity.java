package com.ss.android.lark.pin.dto;

import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "", "pinInfos", "", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "hasMore", "", "totalCount", "", "lastReadTimeStamp", "", "(Ljava/util/List;ZIJ)V", "getHasMore", "()Z", "getLastReadTimeStamp", "()J", "latestTimeStamp", "getLatestTimeStamp", "nextTimeStamp", "getNextTimeStamp", "getPinInfos", "()Ljava/util/List;", "searchKey", "", "getSearchKey", "()Ljava/lang/String;", "setSearchKey", "(Ljava/lang/String;)V", "getTotalCount", "()I", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.dto.a */
public final class ChatPinMessageEntity {

    /* renamed from: a */
    private final long f128096a;

    /* renamed from: b */
    private final long f128097b;

    /* renamed from: c */
    private String f128098c = "";

    /* renamed from: d */
    private final List<PinInfo> f128099d;

    /* renamed from: e */
    private final boolean f128100e;

    /* renamed from: f */
    private final int f128101f;

    /* renamed from: g */
    private final long f128102g;

    /* renamed from: a */
    public final long mo177258a() {
        return this.f128096a;
    }

    /* renamed from: b */
    public final long mo177260b() {
        return this.f128097b;
    }

    /* renamed from: c */
    public final String mo177261c() {
        return this.f128098c;
    }

    /* renamed from: d */
    public final List<PinInfo> mo177262d() {
        return this.f128099d;
    }

    /* renamed from: e */
    public final boolean mo177263e() {
        return this.f128100e;
    }

    /* renamed from: f */
    public final long mo177264f() {
        return this.f128102g;
    }

    /* renamed from: a */
    public final void mo177259a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128098c = str;
    }

    /* renamed from: a */
    private final long m199663a(List<? extends PinInfo> list) {
        Pin h;
        if (!list.isEmpty() && (h = ((PinInfo) list.get(list.size() - 1)).mo177397h()) != null) {
            return h.getTimeStamp();
        }
        return 0;
    }

    /* renamed from: b */
    private final long m199664b(List<? extends PinInfo> list) {
        Pin h;
        if (!list.isEmpty() && (h = ((PinInfo) list.get(0)).mo177397h()) != null) {
            return h.getTimeStamp();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.pin.impl.entity.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatPinMessageEntity(List<? extends PinInfo> list, boolean z, int i, long j) {
        Intrinsics.checkParameterIsNotNull(list, "pinInfos");
        this.f128099d = list;
        this.f128100e = z;
        this.f128101f = i;
        this.f128102g = j;
        this.f128096a = m199663a(list);
        this.f128097b = m199664b(list);
    }
}
