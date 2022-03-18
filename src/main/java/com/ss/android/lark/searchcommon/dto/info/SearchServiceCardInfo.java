package com.ss.android.lark.searchcommon.dto.info;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchServiceCardInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "cardId", "", "renderContent", "(Ljava/lang/String;Ljava/lang/String;)V", "getRenderContent", "()Ljava/lang/String;", "getResultTypeForReport", "getTagForReport", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchServiceCardInfo extends SearchBaseInfo {
    private final String renderContent;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "service_card";
    }

    public final String getRenderContent() {
        return this.renderContent;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getTagForReport() {
        return super.getTagForReport() + "fuzzy_kg_staff_service_card,";
    }

    public SearchServiceCardInfo(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cardId");
        Intrinsics.checkParameterIsNotNull(str2, "renderContent");
        this.renderContent = str2;
        setId(str);
        this.type = 100000014;
    }
}
