package com.ss.android.lark.searchcommon.dto.info;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchPlaceholderInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "()V", "attachInfo", "getAttachInfo", "()Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "setAttachInfo", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)V", "placeholderType", "Lcom/ss/android/lark/searchcommon/dto/info/SearchPlaceholderInfo$Type;", "getPlaceholderType", "()Lcom/ss/android/lark/searchcommon/dto/info/SearchPlaceholderInfo$Type;", "setPlaceholderType", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchPlaceholderInfo$Type;)V", "equals", "", "other", "", "hashCode", "", "Type", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchPlaceholderInfo extends SearchBaseInfo {
    private SearchBaseInfo attachInfo;
    private Type placeholderType = Type.CARD_HEADER;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchPlaceholderInfo$Type;", "", "(Ljava/lang/String;I)V", "CARD_HEADER", "RECOMMEND_ACTION_HEADER", "RECOMMEND_HISTORY_HEADER", "CARD_RECOMMEND_HEADER", "CARD_FOOTER", "DIVIDER_8DP", "DIVIDER_14DP", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        CARD_HEADER,
        RECOMMEND_ACTION_HEADER,
        RECOMMEND_HISTORY_HEADER,
        CARD_RECOMMEND_HEADER,
        CARD_FOOTER,
        DIVIDER_8DP,
        DIVIDER_14DP
    }

    public final SearchBaseInfo getAttachInfo() {
        return this.attachInfo;
    }

    public final Type getPlaceholderType() {
        return this.placeholderType;
    }

    public SearchPlaceholderInfo() {
        this.type = 100000020;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public int hashCode() {
        return Objects.hash(getId(), Integer.valueOf(this.type), this.placeholderType);
    }

    public final void setAttachInfo(SearchBaseInfo searchBaseInfo) {
        this.attachInfo = searchBaseInfo;
    }

    public final void setPlaceholderType(Type type) {
        Intrinsics.checkParameterIsNotNull(type, "<set-?>");
        this.placeholderType = type;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Type type = null;
            if (!(obj instanceof SearchPlaceholderInfo)) {
                obj = null;
            }
            SearchPlaceholderInfo searchPlaceholderInfo = (SearchPlaceholderInfo) obj;
            if (searchPlaceholderInfo != null) {
                type = searchPlaceholderInfo.placeholderType;
            }
            if (type == this.placeholderType) {
                return true;
            }
        }
        return false;
    }
}
