package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "()V", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.a */
public final class BatchDocUserPermissionParser implements NetService.AbstractC5074c<BatchDocUserPermission> {

    /* renamed from: a */
    public static final Companion f26845a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermissionParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public BatchDocUserPermission parse(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject jSONObject = optJSONObject.getJSONObject("perms");
            JSONObject jSONObject2 = optJSONObject.getJSONObject("permissions_v2");
            Object parse = JSON.parse(jSONObject.toString());
            if (parse != null) {
                Map map = (Map) parse;
                Object parse2 = JSON.parse(jSONObject2.toString());
                if (parse2 != null) {
                    return new BatchDocUserPermission(map, (Map) parse2);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        } catch (Exception e) {
            C13479a.m54758a("PublicShareParser", "parser error: " + e);
            return new BatchDocUserPermission(null, null, 3, null);
        }
    }
}
