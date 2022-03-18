package com.ss.android.lark.money.redpacket.dto;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverTheme;", "Ljava/io/Serializable;", "id", "", "name", "", "order", "", "(JLjava/lang/String;I)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getOrder", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCoverTheme implements Serializable {
    private final long id;
    private final String name;
    private final int order;

    public static /* synthetic */ RedPacketCoverTheme copy$default(RedPacketCoverTheme redPacketCoverTheme, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = redPacketCoverTheme.id;
        }
        if ((i2 & 2) != 0) {
            str = redPacketCoverTheme.name;
        }
        if ((i2 & 4) != 0) {
            i = redPacketCoverTheme.order;
        }
        return redPacketCoverTheme.copy(j, str, i);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.order;
    }

    public final RedPacketCoverTheme copy(long j, String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return new RedPacketCoverTheme(j, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketCoverTheme)) {
            return false;
        }
        RedPacketCoverTheme redPacketCoverTheme = (RedPacketCoverTheme) obj;
        return this.id == redPacketCoverTheme.id && Intrinsics.areEqual(this.name, redPacketCoverTheme.name) && this.order == redPacketCoverTheme.order;
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.id) * 31;
        String str = this.name;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.order;
    }

    public String toString() {
        return "RedPacketCoverTheme(id=" + this.id + ", name=" + this.name + ", order=" + this.order + ")";
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public RedPacketCoverTheme(long j, String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.id = j;
        this.name = str;
        this.order = i;
    }
}
