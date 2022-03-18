package com.bytedance.ee.bear;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/WikiNavInfo;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "isWiki", "", "wikiToken", "", "(ZLjava/lang/String;)V", "()Z", "setWiki", "(Z)V", "getWikiToken", "()Ljava/lang/String;", "setWikiToken", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "document-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiNavInfo extends NetService.Result<Serializable> {
    private boolean isWiki;
    private String wikiToken;

    public WikiNavInfo() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ WikiNavInfo copy$default(WikiNavInfo wikiNavInfo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wikiNavInfo.isWiki;
        }
        if ((i & 2) != 0) {
            str = wikiNavInfo.wikiToken;
        }
        return wikiNavInfo.copy(z, str);
    }

    public final boolean component1() {
        return this.isWiki;
    }

    public final String component2() {
        return this.wikiToken;
    }

    public final WikiNavInfo copy(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        return new WikiNavInfo(z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WikiNavInfo) {
                WikiNavInfo wikiNavInfo = (WikiNavInfo) obj;
                if (!(this.isWiki == wikiNavInfo.isWiki) || !Intrinsics.areEqual(this.wikiToken, wikiNavInfo.wikiToken)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.isWiki;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.wikiToken;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WikiNavInfo(isWiki=" + this.isWiki + ", wikiToken=" + this.wikiToken + ")";
    }

    public final String getWikiToken() {
        return this.wikiToken;
    }

    public final boolean isWiki() {
        return this.isWiki;
    }

    public final void setWiki(boolean z) {
        this.isWiki = z;
    }

    public final void setWikiToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.wikiToken = str;
    }

    public WikiNavInfo(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        this.isWiki = z;
        this.wikiToken = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WikiNavInfo(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
