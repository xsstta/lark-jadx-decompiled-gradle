package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/DocInfo;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/Result;", "Ljava/io/Serializable;", "()V", "title", "", "editTime", "", "createTime", "editUserName", "createUid", "createUserName", ShareHitPoint.f121869d, "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateTime", "()J", "getCreateUid", "()Ljava/lang/String;", "getCreateUserName", "getEditTime", "getEditUserName", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocInfo extends Result<Serializable> {
    private final long createTime;
    private final String createUid;
    private final String createUserName;
    private final long editTime;
    private final String editUserName;
    private final String title;
    private final String type;

    public static /* synthetic */ DocInfo copy$default(DocInfo docInfo, String str, long j, long j2, String str2, String str3, String str4, String str5, int i, Object obj) {
        return docInfo.copy((i & 1) != 0 ? docInfo.title : str, (i & 2) != 0 ? docInfo.editTime : j, (i & 4) != 0 ? docInfo.createTime : j2, (i & 8) != 0 ? docInfo.editUserName : str2, (i & 16) != 0 ? docInfo.createUid : str3, (i & 32) != 0 ? docInfo.createUserName : str4, (i & 64) != 0 ? docInfo.type : str5);
    }

    public final String component1() {
        return this.title;
    }

    public final long component2() {
        return this.editTime;
    }

    public final long component3() {
        return this.createTime;
    }

    public final String component4() {
        return this.editUserName;
    }

    public final String component5() {
        return this.createUid;
    }

    public final String component6() {
        return this.createUserName;
    }

    public final String component7() {
        return this.type;
    }

    public final DocInfo copy(String str, long j, long j2, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "editUserName");
        Intrinsics.checkParameterIsNotNull(str3, "createUid");
        Intrinsics.checkParameterIsNotNull(str4, "createUserName");
        Intrinsics.checkParameterIsNotNull(str5, ShareHitPoint.f121869d);
        return new DocInfo(str, j, j2, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocInfo) {
                DocInfo docInfo = (DocInfo) obj;
                if (Intrinsics.areEqual(this.title, docInfo.title)) {
                    if (this.editTime == docInfo.editTime) {
                        if (!(this.createTime == docInfo.createTime) || !Intrinsics.areEqual(this.editUserName, docInfo.editUserName) || !Intrinsics.areEqual(this.createUid, docInfo.createUid) || !Intrinsics.areEqual(this.createUserName, docInfo.createUserName) || !Intrinsics.areEqual(this.type, docInfo.type)) {
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
        String str = this.title;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.editTime;
        long j2 = this.createTime;
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.editUserName;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.createUid;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.createUserName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.type;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "DocInfo(title=" + this.title + ", editTime=" + this.editTime + ", createTime=" + this.createTime + ", editUserName=" + this.editUserName + ", createUid=" + this.createUid + ", createUserName=" + this.createUserName + ", type=" + this.type + ")";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCreateUid() {
        return this.createUid;
    }

    public final String getCreateUserName() {
        return this.createUserName;
    }

    public final long getEditTime() {
        return this.editTime;
    }

    public final String getEditUserName() {
        return this.editUserName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public DocInfo() {
        this("", 0, 0, "", "", "", "");
    }

    public DocInfo(String str, long j, long j2, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "editUserName");
        Intrinsics.checkParameterIsNotNull(str3, "createUid");
        Intrinsics.checkParameterIsNotNull(str4, "createUserName");
        Intrinsics.checkParameterIsNotNull(str5, ShareHitPoint.f121869d);
        this.title = str;
        this.editTime = j;
        this.createTime = j2;
        this.editUserName = str2;
        this.createUid = str3;
        this.createUserName = str4;
        this.type = str5;
    }
}
