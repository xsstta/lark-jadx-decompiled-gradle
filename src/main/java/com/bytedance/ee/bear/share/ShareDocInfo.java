package com.bytedance.ee.bear.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\b\u0010&\u001a\u00020\u001bH\u0016J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\t\u00102\u001a\u00020\u0004HÖ\u0001J\b\u00103\u001a\u00020\u001bH\u0016J\b\u00104\u001a\u00020\u001bH\u0016J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020\u001bH\u0016J\b\u00107\u001a\u00020\u001bH\u0016J\b\u00108\u001a\u00020\u001bH\u0016J\b\u00109\u001a\u00020\u001bH\u0016J\b\u0010:\u001a\u00020\u001bH\u0016J\t\u0010;\u001a\u00020\u0006HÖ\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006A"}, d2 = {"Lcom/bytedance/ee/bear/share/ShareDocInfo;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/bear/share/IShareInfo;", ShareHitPoint.f121869d, "", "docUrl", "", "token", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "(ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocVersion;Lcom/bytedance/ee/bear/DocMetaInfo;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;)V", "getDocMetaInfo", "()Lcom/bytedance/ee/bear/DocMetaInfo;", "getDocPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "getDocUrl", "()Ljava/lang/String;", "getToken", "getType", "()I", "getVersion", "()Lcom/bytedance/ee/bear/list/dto/DocVersion;", "adminCanCross", "", "canExport", "canShare", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "enablePermSet", "equals", "other", "", "externalAccess", "getCreateTimeStr", "getCreatorTenantId", "getCreatorUid", "getDocType", "getObjToken", "getRequestToken", "getUserPerm", "hashCode", "isContainerPermType", "isLinkShareAnyoneEdit", "isLinkShareAnyoneRead", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isOwner", "isSingleContainer", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareDocInfo implements Parcelable, IShareInfo {
    public static final Parcelable.Creator CREATOR = new C10965a();

    /* renamed from: a */
    private final int f29517a;

    /* renamed from: b */
    private final String f29518b;

    /* renamed from: c */
    private final String f29519c;

    /* renamed from: d */
    private final DocVersion f29520d;

    /* renamed from: e */
    private final DocMetaInfo f29521e;

    /* renamed from: f */
    private final DocPermission f29522f;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.ShareDocInfo$a */
    public static class C10965a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ShareDocInfo(parcel.readInt(), parcel.readString(), parcel.readString(), (DocVersion) parcel.readSerializable(), (DocMetaInfo) parcel.readSerializable(), (DocPermission) parcel.readParcelable(ShareDocInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareDocInfo[i];
        }
    }

    public ShareDocInfo() {
        this(0, null, null, null, null, null, 63, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareDocInfo) {
                ShareDocInfo shareDocInfo = (ShareDocInfo) obj;
                if (!(this.f29517a == shareDocInfo.f29517a) || !Intrinsics.areEqual(this.f29518b, shareDocInfo.f29518b) || !Intrinsics.areEqual(this.f29519c, shareDocInfo.f29519c) || !Intrinsics.areEqual(this.f29520d, shareDocInfo.f29520d) || !Intrinsics.areEqual(this.f29521e, shareDocInfo.f29521e) || !Intrinsics.areEqual(this.f29522f, shareDocInfo.f29522f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f29517a * 31;
        String str = this.f29518b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29519c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DocVersion docVersion = this.f29520d;
        int hashCode3 = (hashCode2 + (docVersion != null ? docVersion.hashCode() : 0)) * 31;
        DocMetaInfo docMetaInfo = this.f29521e;
        int hashCode4 = (hashCode3 + (docMetaInfo != null ? docMetaInfo.hashCode() : 0)) * 31;
        DocPermission docPermission = this.f29522f;
        if (docPermission != null) {
            i2 = docPermission.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "ShareDocInfo(type=" + this.f29517a + ", docUrl=" + this.f29518b + ", token=" + this.f29519c + ", version=" + this.f29520d + ", docMetaInfo=" + this.f29521e + ", docPermission=" + this.f29522f + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f29517a);
        parcel.writeString(this.f29518b);
        parcel.writeString(this.f29519c);
        parcel.writeSerializable(this.f29520d);
        parcel.writeSerializable(this.f29521e);
        parcel.writeParcelable(this.f29522f, i);
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: d */
    public int mo41657d() {
        return this.f29517a;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: e */
    public String mo41659e() {
        return this.f29519c;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: i */
    public String mo41665i() {
        return this.f29519c;
    }

    /* renamed from: s */
    public final int mo41675s() {
        return this.f29517a;
    }

    /* renamed from: t */
    public final String mo41676t() {
        return this.f29518b;
    }

    /* renamed from: u */
    public final String mo41678u() {
        return this.f29519c;
    }

    /* renamed from: v */
    public final DocVersion mo41679v() {
        return this.f29520d;
    }

    /* renamed from: w */
    public final DocMetaInfo mo41680w() {
        return this.f29521e;
    }

    /* renamed from: x */
    public final DocPermission mo41682x() {
        return this.f29522f;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: a */
    public String mo41654a() {
        return this.f29521e.getCreateTime();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: b */
    public String mo41655b() {
        return this.f29521e.getCreatorUid();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: f */
    public String mo41661f() {
        return this.f29521e.getCreatorTenantId();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: h */
    public boolean mo41663h() {
        return this.f29520d.isDocV2();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: c */
    public boolean mo41656c() {
        return this.f29522f.mo38594b().isOwner();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: g */
    public boolean mo41662g() {
        return this.f29522f.mo38594b().adminCanCross();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: k */
    public boolean mo41667k() {
        return this.f29522f.mo38594b().externalAccess();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: m */
    public boolean mo41669m() {
        return this.f29522f.mo38591a().canManageCollaborator();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: n */
    public boolean mo41670n() {
        return this.f29522f.mo38594b().isLinkShareInternalRead();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: o */
    public boolean mo41671o() {
        return this.f29522f.mo38594b().isLinkShareInternalEdit();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: p */
    public boolean mo41672p() {
        return this.f29522f.mo38594b().isLinkShareAnyoneRead();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: q */
    public boolean mo41673q() {
        return this.f29522f.mo38594b().isLinkShareAnyoneEdit();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: r */
    public boolean mo41674r() {
        return this.f29522f.mo38591a().canManageContainerPermissionMeta();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: j */
    public boolean mo41666j() {
        if (mo41656c() || this.f29522f.mo38591a().canManagePermissionMeta()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: l */
    public boolean mo41668l() {
        boolean c = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36544c(this.f29517a, this.f29519c);
        boolean canExport = this.f29522f.mo38591a().canExport();
        if (!c || !canExport) {
            return false;
        }
        return true;
    }

    public ShareDocInfo(int i, String str, String str2, DocVersion docVersion, DocMetaInfo docMetaInfo, DocPermission docPermission) {
        Intrinsics.checkParameterIsNotNull(str, "docUrl");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(docMetaInfo, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
        this.f29517a = i;
        this.f29518b = str;
        this.f29519c = str2;
        this.f29520d = docVersion;
        this.f29521e = docMetaInfo;
        this.f29522f = docPermission;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareDocInfo(int r25, java.lang.String r26, java.lang.String r27, com.bytedance.ee.bear.list.dto.DocVersion r28, com.bytedance.ee.bear.DocMetaInfo r29, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.share.ShareDocInfo.<init>(int, java.lang.String, java.lang.String, com.bytedance.ee.bear.list.dto.DocVersion, com.bytedance.ee.bear.DocMetaInfo, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
