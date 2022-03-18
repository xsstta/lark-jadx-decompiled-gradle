package com.bytedance.ee.bear.list.dto;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/list/dto/SaveTemplateResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "url", "", "token", "tokenList", "parentToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParentToken", "()Ljava/lang/String;", "setParentToken", "(Ljava/lang/String;)V", "getToken", "setToken", "getTokenList", "setTokenList", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "list-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SaveTemplateResult extends NetService.Result<Serializable> {
    private String parentToken;
    private String token;
    private String tokenList;
    private String url;

    public SaveTemplateResult() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SaveTemplateResult copy$default(SaveTemplateResult saveTemplateResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveTemplateResult.url;
        }
        if ((i & 2) != 0) {
            str2 = saveTemplateResult.token;
        }
        if ((i & 4) != 0) {
            str3 = saveTemplateResult.tokenList;
        }
        if ((i & 8) != 0) {
            str4 = saveTemplateResult.parentToken;
        }
        return saveTemplateResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.token;
    }

    public final String component3() {
        return this.tokenList;
    }

    public final String component4() {
        return this.parentToken;
    }

    public final SaveTemplateResult copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "tokenList");
        Intrinsics.checkParameterIsNotNull(str4, "parentToken");
        return new SaveTemplateResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveTemplateResult)) {
            return false;
        }
        SaveTemplateResult saveTemplateResult = (SaveTemplateResult) obj;
        return Intrinsics.areEqual(this.url, saveTemplateResult.url) && Intrinsics.areEqual(this.token, saveTemplateResult.token) && Intrinsics.areEqual(this.tokenList, saveTemplateResult.tokenList) && Intrinsics.areEqual(this.parentToken, saveTemplateResult.parentToken);
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tokenList;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.parentToken;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "SaveTemplateResult(url=" + this.url + ", token=" + this.token + ", tokenList=" + this.tokenList + ", parentToken=" + this.parentToken + ")";
    }

    public final String getParentToken() {
        return this.parentToken;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenList() {
        return this.tokenList;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setParentToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.parentToken = str;
    }

    public final void setToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.token = str;
    }

    public final void setTokenList(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.tokenList = str;
    }

    public final void setUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }

    public SaveTemplateResult(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "tokenList");
        Intrinsics.checkParameterIsNotNull(str4, "parentToken");
        this.url = str;
        this.token = str2;
        this.tokenList = str3;
        this.parentToken = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveTemplateResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
