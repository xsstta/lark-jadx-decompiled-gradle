package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "Ljava/io/Serializable;", "categoryId", "", "covers", "", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "(JLjava/util/List;)V", "getCategoryId", "()J", "getCovers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCoverList implements Serializable {
    private final long categoryId;
    private final List<RedPacketCover> covers;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.money.redpacket.dto.RedPacketCoverList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedPacketCoverList copy$default(RedPacketCoverList redPacketCoverList, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = redPacketCoverList.categoryId;
        }
        if ((i & 2) != 0) {
            list = redPacketCoverList.covers;
        }
        return redPacketCoverList.copy(j, list);
    }

    public final long component1() {
        return this.categoryId;
    }

    public final List<RedPacketCover> component2() {
        return this.covers;
    }

    public final RedPacketCoverList copy(long j, List<RedPacketCover> list) {
        Intrinsics.checkParameterIsNotNull(list, "covers");
        return new RedPacketCoverList(j, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketCoverList)) {
            return false;
        }
        RedPacketCoverList redPacketCoverList = (RedPacketCoverList) obj;
        return this.categoryId == redPacketCoverList.categoryId && Intrinsics.areEqual(this.covers, redPacketCoverList.covers);
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.categoryId) * 31;
        List<RedPacketCover> list = this.covers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "RedPacketCoverList(categoryId=" + this.categoryId + ", covers=" + this.covers + ")";
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final List<RedPacketCover> getCovers() {
        return this.covers;
    }

    public RedPacketCoverList(long j, List<RedPacketCover> list) {
        Intrinsics.checkParameterIsNotNull(list, "covers");
        this.categoryId = j;
        this.covers = list;
    }
}
