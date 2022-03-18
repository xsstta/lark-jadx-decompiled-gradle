package com.bytedance.ee.bear.document.documentinfo;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.util.io.NonProguard;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003JO\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0013\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\u0006\u00102\u001a\u00020\tJ\u0006\u00103\u001a\u00020\tJ\u0006\u00104\u001a\u00020\tJ\u0006\u00105\u001a\u00020\tJ\u0006\u00106\u001a\u00020\tJ\u0006\u00107\u001a\u00020\tJ\u0006\u00108\u001a\u00020\tJ\u0006\u00109\u001a\u00020\tJ\u0006\u0010:\u001a\u00020\tJ\t\u0010;\u001a\u00020\fHÖ\u0001J\u0006\u0010<\u001a\u00020$J\u0006\u0010=\u001a\u00020$J\u0006\u0010>\u001a\u00020$J\u0006\u0010?\u001a\u00020$J\u000e\u0010@\u001a\u00020A2\u0006\u0010=\u001a\u00020$J\u000e\u0010B\u001a\u00020A2\u0006\u0010>\u001a\u00020$J\u000e\u0010C\u001a\u00020A2\u0006\u0010?\u001a\u00020$J\u0010\u0010D\u001a\u00020A2\b\u0010E\u001a\u0004\u0018\u00010\tJ\t\u0010F\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006G"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "Lcom/bytedance/ee/util/io/NonProguard;", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "url", "", "objToken", ShareHitPoint.f121869d, "", "spaceId", "(Lcom/bytedance/ee/bear/DocMetaInfo;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;Lcom/bytedance/ee/bear/list/dto/DocVersion;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDocMetaInfo", "()Lcom/bytedance/ee/bear/DocMetaInfo;", "docObjInfo", "Lcom/bytedance/ee/bear/DocObjInfo;", "getDocObjInfo", "()Lcom/bytedance/ee/bear/DocObjInfo;", "setDocObjInfo", "(Lcom/bytedance/ee/bear/DocObjInfo;)V", "getDocPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "getObjToken", "()Ljava/lang/String;", "getSpaceId", "setSpaceId", "(Ljava/lang/String;)V", "getType", "()I", "getUrl", "getVersion", "()Lcom/bytedance/ee/bear/list/dto/DocVersion;", "canCopy", "", "canEdit", "canRead", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getAppId", "getCreateTime", "getCreatorName", "getCreatorTenantId", "getCreatorUid", "getIcon", "getOwnerUid", "getSubType", "getTitle", "hashCode", "isOwner", "isPined", "isStared", "isSubscribe", "setPined", "", "setStared", "setSubscribe", "setTitle", "newTitle", "toString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocumentInfo implements NonProguard {
    private final DocMetaInfo docMetaInfo;
    private DocObjInfo docObjInfo;
    private final DocPermission docPermission;
    private final String objToken;
    private String spaceId;
    private final int type;
    private final String url;
    private final DocVersion version;

    public static /* synthetic */ DocumentInfo copy$default(DocumentInfo documentInfo, DocMetaInfo docMetaInfo2, DocPermission docPermission2, DocVersion docVersion, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            docMetaInfo2 = documentInfo.docMetaInfo;
        }
        if ((i2 & 2) != 0) {
            docPermission2 = documentInfo.docPermission;
        }
        if ((i2 & 4) != 0) {
            docVersion = documentInfo.version;
        }
        if ((i2 & 8) != 0) {
            str = documentInfo.url;
        }
        if ((i2 & 16) != 0) {
            str2 = documentInfo.objToken;
        }
        if ((i2 & 32) != 0) {
            i = documentInfo.type;
        }
        if ((i2 & 64) != 0) {
            str3 = documentInfo.spaceId;
        }
        return documentInfo.copy(docMetaInfo2, docPermission2, docVersion, str, str2, i, str3);
    }

    public final DocMetaInfo component1() {
        return this.docMetaInfo;
    }

    public final DocPermission component2() {
        return this.docPermission;
    }

    public final DocVersion component3() {
        return this.version;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.objToken;
    }

    public final int component6() {
        return this.type;
    }

    public final String component7() {
        return this.spaceId;
    }

    public final DocumentInfo copy(DocMetaInfo docMetaInfo2, DocPermission docPermission2, DocVersion docVersion, String str, String str2, int i, String str3) {
        Intrinsics.checkParameterIsNotNull(docMetaInfo2, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docPermission2, "docPermission");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "objToken");
        Intrinsics.checkParameterIsNotNull(str3, "spaceId");
        return new DocumentInfo(docMetaInfo2, docPermission2, docVersion, str, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocumentInfo) {
                DocumentInfo documentInfo = (DocumentInfo) obj;
                if (Intrinsics.areEqual(this.docMetaInfo, documentInfo.docMetaInfo) && Intrinsics.areEqual(this.docPermission, documentInfo.docPermission) && Intrinsics.areEqual(this.version, documentInfo.version) && Intrinsics.areEqual(this.url, documentInfo.url) && Intrinsics.areEqual(this.objToken, documentInfo.objToken)) {
                    if (!(this.type == documentInfo.type) || !Intrinsics.areEqual(this.spaceId, documentInfo.spaceId)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        DocMetaInfo docMetaInfo2 = this.docMetaInfo;
        int i = 0;
        int hashCode = (docMetaInfo2 != null ? docMetaInfo2.hashCode() : 0) * 31;
        DocPermission docPermission2 = this.docPermission;
        int hashCode2 = (hashCode + (docPermission2 != null ? docPermission2.hashCode() : 0)) * 31;
        DocVersion docVersion = this.version;
        int hashCode3 = (hashCode2 + (docVersion != null ? docVersion.hashCode() : 0)) * 31;
        String str = this.url;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.objToken;
        int hashCode5 = (((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type) * 31;
        String str3 = this.spaceId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "DocumentInfo(docMetaInfo=" + this.docMetaInfo + ", docPermission=" + this.docPermission + ", version=" + this.version + ", url=" + this.url + ", objToken=" + this.objToken + ", type=" + this.type + ", spaceId=" + this.spaceId + ")";
    }

    public final DocMetaInfo getDocMetaInfo() {
        return this.docMetaInfo;
    }

    public final DocObjInfo getDocObjInfo() {
        return this.docObjInfo;
    }

    public final DocPermission getDocPermission() {
        return this.docPermission;
    }

    public final String getObjToken() {
        return this.objToken;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final DocVersion getVersion() {
        return this.version;
    }

    public final String getAppId() {
        return this.docMetaInfo.getAppId();
    }

    public final String getCreateTime() {
        return this.docMetaInfo.getCreateTime();
    }

    public final String getCreatorName() {
        return this.docMetaInfo.getCreatorName();
    }

    public final String getCreatorTenantId() {
        return this.docMetaInfo.getCreatorTenantId();
    }

    public final String getCreatorUid() {
        return this.docMetaInfo.getCreatorUid();
    }

    public final String getIcon() {
        return this.docMetaInfo.getIcon();
    }

    public final String getOwnerUid() {
        return this.docMetaInfo.getOwnerUid();
    }

    public final String getSubType() {
        return this.docMetaInfo.getSubType();
    }

    public final String getTitle() {
        return this.docMetaInfo.getTitle();
    }

    public final boolean isPined() {
        return this.docMetaInfo.isPined();
    }

    public final boolean isStared() {
        return this.docMetaInfo.isStared();
    }

    public final boolean isSubscribe() {
        return this.docObjInfo.isSubscribed();
    }

    public final boolean canCopy() {
        return this.docPermission.mo38591a().canCopy();
    }

    public final boolean canEdit() {
        return this.docPermission.mo38591a().canEdit();
    }

    public final boolean canRead() {
        return this.docPermission.mo38591a().canRead();
    }

    public final boolean isOwner() {
        return this.docPermission.mo38594b().isOwner();
    }

    public final void setDocObjInfo(DocObjInfo docObjInfo2) {
        Intrinsics.checkParameterIsNotNull(docObjInfo2, "<set-?>");
        this.docObjInfo = docObjInfo2;
    }

    public final void setPined(boolean z) {
        this.docMetaInfo.setPined(z);
    }

    public final void setSpaceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.spaceId = str;
    }

    public final void setStared(boolean z) {
        this.docMetaInfo.setStared(z);
    }

    public final void setSubscribe(boolean z) {
        this.docObjInfo.setSubscribed(z);
    }

    public final void setTitle(String str) {
        DocMetaInfo docMetaInfo2 = this.docMetaInfo;
        if (str == null) {
            str = "";
        }
        docMetaInfo2.setTitle(str);
    }

    public DocumentInfo(DocMetaInfo docMetaInfo2, DocPermission docPermission2, DocVersion docVersion, String str, String str2, int i, String str3) {
        Intrinsics.checkParameterIsNotNull(docMetaInfo2, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docPermission2, "docPermission");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "objToken");
        Intrinsics.checkParameterIsNotNull(str3, "spaceId");
        this.docMetaInfo = docMetaInfo2;
        this.docPermission = docPermission2;
        this.version = docVersion;
        this.url = str;
        this.objToken = str2;
        this.type = i;
        this.spaceId = str3;
        this.docObjInfo = new DocObjInfo(false, false, false, null, 15, null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocumentInfo(com.bytedance.ee.bear.DocMetaInfo r11, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission r12, com.bytedance.ee.bear.list.dto.DocVersion r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r6 = r1
            goto L_0x0009
        L_0x0008:
            r6 = r14
        L_0x0009:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x000f
            r7 = r1
            goto L_0x0010
        L_0x000f:
            r7 = r15
        L_0x0010:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r8 = 0
            goto L_0x0019
        L_0x0017:
            r8 = r16
        L_0x0019:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x001f
            r9 = r1
            goto L_0x0021
        L_0x001f:
            r9 = r17
        L_0x0021:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.documentinfo.DocumentInfo.<init>(com.bytedance.ee.bear.DocMetaInfo, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission, com.bytedance.ee.bear.list.dto.DocVersion, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
