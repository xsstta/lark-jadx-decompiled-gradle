package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermission;", "()V", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.f */
public final class DocUserPermissionParser implements NetService.AbstractC5074c<DocUserPermission> {

    /* renamed from: a */
    public static final Companion f26867a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public DocUserPermission parse(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            int optInt = optJSONObject.optInt("permissions_v2");
            int optInt2 = optJSONObject.optInt("permission_status_code");
            String jSONObject = optJSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject, "dataObj.toString()");
            return new DocUserPermission(optInt, optInt2, null, jSONObject);
        } catch (Exception e) {
            C13479a.m54758a("DocUserPermissionParser", "parse: " + e);
            return new DocUserPermission(0, 0, null, null, 15, null);
        }
    }
}
