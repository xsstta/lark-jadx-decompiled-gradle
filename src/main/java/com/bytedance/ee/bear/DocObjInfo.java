package com.bytedance.ee.bear;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/DocObjInfo;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "isPined", "", "isStared", "isSubscribed", "wikiInfo", "Lcom/bytedance/ee/bear/WikiNavInfo;", "(ZZZLcom/bytedance/ee/bear/WikiNavInfo;)V", "()Z", "setPined", "(Z)V", "setStared", "setSubscribed", "getWikiInfo", "()Lcom/bytedance/ee/bear/WikiNavInfo;", "setWikiInfo", "(Lcom/bytedance/ee/bear/WikiNavInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "document-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocObjInfo extends NetService.Result<Serializable> {
    private boolean isPined;
    private boolean isStared;
    private boolean isSubscribed;
    private WikiNavInfo wikiInfo;

    public DocObjInfo() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ DocObjInfo copy$default(DocObjInfo docObjInfo, boolean z, boolean z2, boolean z3, WikiNavInfo wikiNavInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = docObjInfo.isPined;
        }
        if ((i & 2) != 0) {
            z2 = docObjInfo.isStared;
        }
        if ((i & 4) != 0) {
            z3 = docObjInfo.isSubscribed;
        }
        if ((i & 8) != 0) {
            wikiNavInfo = docObjInfo.wikiInfo;
        }
        return docObjInfo.copy(z, z2, z3, wikiNavInfo);
    }

    public final boolean component1() {
        return this.isPined;
    }

    public final boolean component2() {
        return this.isStared;
    }

    public final boolean component3() {
        return this.isSubscribed;
    }

    public final WikiNavInfo component4() {
        return this.wikiInfo;
    }

    public final DocObjInfo copy(boolean z, boolean z2, boolean z3, WikiNavInfo wikiNavInfo) {
        Intrinsics.checkParameterIsNotNull(wikiNavInfo, "wikiInfo");
        return new DocObjInfo(z, z2, z3, wikiNavInfo);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocObjInfo) {
                DocObjInfo docObjInfo = (DocObjInfo) obj;
                if (this.isPined == docObjInfo.isPined) {
                    if (this.isStared == docObjInfo.isStared) {
                        if (!(this.isSubscribed == docObjInfo.isSubscribed) || !Intrinsics.areEqual(this.wikiInfo, docObjInfo.wikiInfo)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.isPined;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isStared;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isSubscribed;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i10 = (i9 + i) * 31;
        WikiNavInfo wikiNavInfo = this.wikiInfo;
        return i10 + (wikiNavInfo != null ? wikiNavInfo.hashCode() : 0);
    }

    public String toString() {
        return "DocObjInfo(isPined=" + this.isPined + ", isStared=" + this.isStared + ", isSubscribed=" + this.isSubscribed + ", wikiInfo=" + this.wikiInfo + ")";
    }

    public final WikiNavInfo getWikiInfo() {
        return this.wikiInfo;
    }

    public final boolean isPined() {
        return this.isPined;
    }

    public final boolean isStared() {
        return this.isStared;
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    public final void setPined(boolean z) {
        this.isPined = z;
    }

    public final void setStared(boolean z) {
        this.isStared = z;
    }

    public final void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public final void setWikiInfo(WikiNavInfo wikiNavInfo) {
        Intrinsics.checkParameterIsNotNull(wikiNavInfo, "<set-?>");
        this.wikiInfo = wikiNavInfo;
    }

    public DocObjInfo(boolean z, boolean z2, boolean z3, WikiNavInfo wikiNavInfo) {
        Intrinsics.checkParameterIsNotNull(wikiNavInfo, "wikiInfo");
        this.isPined = z;
        this.isStared = z2;
        this.isSubscribed = z3;
        this.wikiInfo = wikiNavInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocObjInfo(boolean z, boolean z2, boolean z3, WikiNavInfo wikiNavInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? new WikiNavInfo(false, null, 3, null) : wikiNavInfo);
    }
}
