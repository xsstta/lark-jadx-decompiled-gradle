package com.ss.android.lark.money.redpacket.dto;

import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "Ljava/io/Serializable;", "()V", "categoryList", "", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverTheme;", "covers", "", "", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "recommendedCovers", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "getCategoryList", "()Ljava/util/List;", "getCovers", "()Ljava/util/Map;", "getRecommendedCovers", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCoverListResponse implements Serializable {
    private final List<RedPacketCoverTheme> categoryList;
    private final Map<Long, RedPacketCoverList> covers;
    private final List<RedPacketCover> recommendedCovers;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedPacketCoverListResponse copy$default(RedPacketCoverListResponse redPacketCoverListResponse, List list, Map map, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = redPacketCoverListResponse.categoryList;
        }
        if ((i & 2) != 0) {
            map = redPacketCoverListResponse.covers;
        }
        if ((i & 4) != 0) {
            list2 = redPacketCoverListResponse.recommendedCovers;
        }
        return redPacketCoverListResponse.copy(list, map, list2);
    }

    public final List<RedPacketCoverTheme> component1() {
        return this.categoryList;
    }

    public final Map<Long, RedPacketCoverList> component2() {
        return this.covers;
    }

    public final List<RedPacketCover> component3() {
        return this.recommendedCovers;
    }

    public final RedPacketCoverListResponse copy(List<RedPacketCoverTheme> list, Map<Long, RedPacketCoverList> map, List<RedPacketCover> list2) {
        Intrinsics.checkParameterIsNotNull(list, "categoryList");
        Intrinsics.checkParameterIsNotNull(map, "covers");
        return new RedPacketCoverListResponse(list, map, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketCoverListResponse)) {
            return false;
        }
        RedPacketCoverListResponse redPacketCoverListResponse = (RedPacketCoverListResponse) obj;
        return Intrinsics.areEqual(this.categoryList, redPacketCoverListResponse.categoryList) && Intrinsics.areEqual(this.covers, redPacketCoverListResponse.covers) && Intrinsics.areEqual(this.recommendedCovers, redPacketCoverListResponse.recommendedCovers);
    }

    public int hashCode() {
        List<RedPacketCoverTheme> list = this.categoryList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map<Long, RedPacketCoverList> map = this.covers;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<RedPacketCover> list2 = this.recommendedCovers;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "RedPacketCoverListResponse(categoryList=" + this.categoryList + ", covers=" + this.covers + ", recommendedCovers=" + this.recommendedCovers + ")";
    }

    public final List<RedPacketCoverTheme> getCategoryList() {
        return this.categoryList;
    }

    public final Map<Long, RedPacketCoverList> getCovers() {
        return this.covers;
    }

    public final List<RedPacketCover> getRecommendedCovers() {
        return this.recommendedCovers;
    }

    public RedPacketCoverListResponse() {
        this(CollectionsKt.emptyList(), MapsKt.emptyMap(), CollectionsKt.emptyList());
    }

    public RedPacketCoverListResponse(List<RedPacketCoverTheme> list, Map<Long, RedPacketCoverList> map, List<RedPacketCover> list2) {
        Intrinsics.checkParameterIsNotNull(list, "categoryList");
        Intrinsics.checkParameterIsNotNull(map, "covers");
        this.categoryList = list;
        this.covers = map;
        this.recommendedCovers = list2;
    }
}
