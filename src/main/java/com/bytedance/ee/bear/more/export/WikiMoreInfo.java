package com.bytedance.ee.bear.more.export;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/more/export/WikiMoreInfo;", "Lcom/bytedance/ee/bear/more/export/DocMoreInfo;", ShareHitPoint.f121869d, "", "url", "", "token", "parentToken", "isFeedShortcut", "", "isManualOffline", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", "docObjInfo", "Lcom/bytedance/ee/bear/DocObjInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "wikiToken", "isAtVC", "isWikiV2", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/bytedance/ee/bear/DocMetaInfo;Lcom/bytedance/ee/bear/DocObjInfo;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;Lcom/bytedance/ee/bear/list/dto/DocVersion;Ljava/lang/String;ZZ)V", "getWikiToken", "()Ljava/lang/String;", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.export.f */
public final class WikiMoreInfo extends DocMoreInfo {

    /* renamed from: a */
    private final String f27595a;

    /* renamed from: O */
    public final String mo39091O() {
        return this.f27595a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiMoreInfo(int i, String str, String str2, String str3, boolean z, boolean z2, DocMetaInfo docMetaInfo, DocObjInfo docObjInfo, DocPermission docPermission, DocVersion docVersion, String str4, boolean z3, boolean z4) {
        super(i, str, str2, str3, z, z2, docMetaInfo, docObjInfo, docPermission, docVersion, z3, z4);
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "parentToken");
        Intrinsics.checkParameterIsNotNull(docMetaInfo, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docObjInfo, "docObjInfo");
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str4, "wikiToken");
        this.f27595a = str4;
    }
}
