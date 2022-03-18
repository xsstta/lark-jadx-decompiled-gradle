package com.ss.ugc.effectplatform.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/model/CheckUpdateVersionModel;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "cursor", "sorting_position", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "getSorting_position", "setSorting_position", "getVersion", "setVersion", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CheckUpdateVersionModel {
    private String cursor;
    private String sorting_position;
    private String version;

    public CheckUpdateVersionModel() {
        this(null, null, null, 7, null);
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(String str) {
        this.cursor = str;
    }

    public void setSorting_position(String str) {
        this.sorting_position = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public CheckUpdateVersionModel(String str, String str2, String str3) {
        this.version = str;
        this.cursor = str2;
        this.sorting_position = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
