package com.ss.android.lark.searchcommon.dto.info;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchCustomizationInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "customizationId", "", "renderContent", "dataSourceId", "templateName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomizationId", "()Ljava/lang/String;", "getDataSourceId", "getRenderContent", "getTemplateName", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchCustomizationInfo extends SearchBaseInfo {
    private final String customizationId;
    private final String dataSourceId;
    private final String renderContent;
    private final String templateName;

    public final String getCustomizationId() {
        return this.customizationId;
    }

    public final String getDataSourceId() {
        return this.dataSourceId;
    }

    public final String getRenderContent() {
        return this.renderContent;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public SearchCustomizationInfo(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "customizationId");
        Intrinsics.checkParameterIsNotNull(str2, "renderContent");
        Intrinsics.checkParameterIsNotNull(str3, "dataSourceId");
        Intrinsics.checkParameterIsNotNull(str4, "templateName");
        this.customizationId = str;
        this.renderContent = str2;
        this.dataSourceId = str3;
        this.templateName = str4;
        this.type = 100000016;
    }
}
