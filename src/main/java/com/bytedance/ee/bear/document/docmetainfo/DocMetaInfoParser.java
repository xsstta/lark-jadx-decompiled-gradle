package com.bytedance.ee.bear.document.docmetainfo;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/document/docmetainfo/DocMetaInfoParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/DocMetaInfo;", "()V", "parse", "json", "", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.a.b */
public final class DocMetaInfoParser implements NetService.AbstractC5074c<DocMetaInfo> {

    /* renamed from: a */
    public static final Companion f15946a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/docmetainfo/DocMetaInfoParser$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public DocMetaInfo parse(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String optString = optJSONObject.optString("create_uid");
            String optString2 = optJSONObject.optString("owner_id");
            Intrinsics.checkExpressionValueIsNotNull(optString, "creatorUid");
            boolean z4 = true;
            if (optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Intrinsics.checkExpressionValueIsNotNull(optString2, "ownerUid");
                if (optString2.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    optString = "";
                } else {
                    optString = optString2;
                }
            }
            Intrinsics.checkExpressionValueIsNotNull(optString2, "ownerUid");
            if (optString2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (optString.length() != 0) {
                    z4 = false;
                }
                if (z4) {
                    optString2 = "";
                } else {
                    optString2 = optString;
                }
            }
            String optString3 = optJSONObject.optString("title");
            Intrinsics.checkExpressionValueIsNotNull(optString3, "dataObj.optString(\"title\")");
            String optString4 = optJSONObject.optString("create_user_name");
            Intrinsics.checkExpressionValueIsNotNull(optString4, "dataObj.optString(\"create_user_name\")");
            String optString5 = optJSONObject.optString("tenant_id");
            Intrinsics.checkExpressionValueIsNotNull(optString5, "dataObj.optString(\"tenant_id\")");
            String optString6 = optJSONObject.optString("owner_user_name");
            Intrinsics.checkExpressionValueIsNotNull(optString6, "dataObj.optString(\"owner_user_name\")");
            String optString7 = optJSONObject.optString("create_time");
            Intrinsics.checkExpressionValueIsNotNull(optString7, "dataObj.optString(\"create_time\")");
            String optString8 = optJSONObject.optString("sub_type");
            Intrinsics.checkExpressionValueIsNotNull(optString8, "dataObj.optString(\"sub_type\")");
            boolean optBoolean = optJSONObject.optBoolean("is_pined");
            boolean optBoolean2 = optJSONObject.optBoolean("is_stared");
            String optString9 = optJSONObject.optString("app_id");
            Intrinsics.checkExpressionValueIsNotNull(optString9, "dataObj.optString(\"app_id\")");
            String optString10 = optJSONObject.optString("app_link");
            Intrinsics.checkExpressionValueIsNotNull(optString10, "dataObj.optString(\"app_link\")");
            boolean optBoolean3 = optJSONObject.optBoolean("support_mobile");
            String optString11 = optJSONObject.optString("icon");
            Intrinsics.checkExpressionValueIsNotNull(optString11, "dataObj.optString(\"icon\")");
            return new DocMetaInfo(optString3, optString, optString4, optString5, optString2, optString6, optString7, optString8, optBoolean, optBoolean2, optString9, optString10, optBoolean3, optString11, optJSONObject.optInt(ShareHitPoint.f121869d));
        } catch (Exception e) {
            C13479a.m54758a("DocMetaInfoParser", "parse: " + e);
            return new DocMetaInfo(null, null, null, null, null, null, null, null, false, false, null, null, false, null, 0, 32767, null);
        }
    }
}
