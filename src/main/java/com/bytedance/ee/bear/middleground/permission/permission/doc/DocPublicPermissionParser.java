package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermission;", "()V", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.d */
public final class DocPublicPermissionParser implements NetService.AbstractC5074c<DocPublicPermission> {

    /* renamed from: a */
    public static final Companion f26865a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public DocPublicPermission parse(String str) {
        PermissionConstraints permissionConstraints;
        PermissionConstraintsValue permissionConstraintsValue;
        String str2;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("constraint");
            if (optJSONObject2 == null) {
                permissionConstraints = new PermissionConstraints(0, 0, 0, 7, null);
            } else {
                permissionConstraints = new PermissionConstraints(optJSONObject2.optInt("security"), optJSONObject2.optInt(Comment.f24093e), 0, 4, null);
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("constraint_value");
            if (optJSONObject3 == null) {
                permissionConstraintsValue = new PermissionConstraintsValue(0, 0);
            } else {
                permissionConstraintsValue = new PermissionConstraintsValue(optJSONObject3.optInt("security"), optJSONObject3.optInt(Comment.f24093e));
            }
            int optInt = optJSONObject.optInt("link_share_entity");
            int optInt2 = optJSONObject.optInt("comment_entity");
            int optInt3 = optJSONObject.optInt("share_entity");
            int optInt4 = optJSONObject.optInt("security_entity");
            boolean optBoolean = optJSONObject.optBoolean("is_owner");
            boolean optBoolean2 = optJSONObject.optBoolean("admin_can_cross");
            boolean optBoolean3 = optJSONObject.optBoolean("invite_external");
            boolean optBoolean4 = optJSONObject.optBoolean("external_access");
            boolean optBoolean5 = optJSONObject.optBoolean("has_link_password");
            String optString = optJSONObject.optString("link_password");
            Intrinsics.checkExpressionValueIsNotNull(optString, "dataObj.optString(\"link_password\")");
            boolean optBoolean6 = optJSONObject.optBoolean("anonymous_verify");
            boolean optBoolean7 = optJSONObject.optBoolean("lock_state");
            boolean optBoolean8 = optJSONObject.optBoolean("can_unlock");
            if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                str2 = "";
            }
            return new DocPublicPermission(optInt, optInt2, optInt3, optInt4, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optString, optBoolean6, optBoolean7, optBoolean8, str2, permissionConstraints, permissionConstraintsValue);
        } catch (Exception e) {
            C13479a.m54759a("DocPublicPermissionParser", "parse: ", e);
            return new DocPublicPermission(0, 0, 0, 0, false, false, false, false, false, null, false, false, false, null, null, null, 65535, null);
        }
    }
}
