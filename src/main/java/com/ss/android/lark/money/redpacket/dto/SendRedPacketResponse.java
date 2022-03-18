package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/SendRedPacketResponse;", "", "payUrl", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/money/redpacket/dto/PayURLType;", "(Ljava/lang/String;Lcom/ss/android/lark/money/redpacket/dto/PayURLType;)V", "getPayUrl", "()Ljava/lang/String;", "getType", "()Lcom/ss/android/lark/money/redpacket/dto/PayURLType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.dto.a */
public final class SendRedPacketResponse {

    /* renamed from: a */
    private final String f121118a;

    /* renamed from: b */
    private final PayURLType f121119b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendRedPacketResponse)) {
            return false;
        }
        SendRedPacketResponse aVar = (SendRedPacketResponse) obj;
        return Intrinsics.areEqual(this.f121118a, aVar.f121118a) && Intrinsics.areEqual(this.f121119b, aVar.f121119b);
    }

    public int hashCode() {
        String str = this.f121118a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PayURLType payURLType = this.f121119b;
        if (payURLType != null) {
            i = payURLType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SendRedPacketResponse(payUrl=" + this.f121118a + ", type=" + this.f121119b + ")";
    }

    /* renamed from: a */
    public final String mo168500a() {
        return this.f121118a;
    }

    /* renamed from: b */
    public final PayURLType mo168501b() {
        return this.f121119b;
    }

    public SendRedPacketResponse(String str, PayURLType payURLType) {
        this.f121118a = str;
        this.f121119b = payURLType;
    }
}
