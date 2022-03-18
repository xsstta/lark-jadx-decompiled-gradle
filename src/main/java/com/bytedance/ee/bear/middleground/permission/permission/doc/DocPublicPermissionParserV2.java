package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J4\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionV2;", "()V", "parse", "json", "", "parseBlockOptionElement", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "blockOptionsObj", "Lorg/json/JSONObject;", "elementName", "parseBlockOptions", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BlockOptions;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.e */
public final class DocPublicPermissionParserV2 implements NetService.AbstractC5074c<DocPublicPermissionV2> {

    /* renamed from: a */
    public static final Companion f26866a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPublicPermissionParserV2$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final BlockOptions m41367a(JSONObject jSONObject) {
        return new BlockOptions(m41368a(jSONObject, "security"), m41368a(jSONObject, Comment.f24093e), m41368a(jSONObject, "external_access_switch"), m41368a(jSONObject, "link_share_entity"));
    }

    /* renamed from: a */
    public DocPublicPermissionV2 parse(String str) {
        Exception e;
        String str2;
        PermissionConstraints permissionConstraints;
        PermissionConstraintsValue permissionConstraintsValue;
        BlockOptions blockOptions;
        PermType permType;
        String str3;
        try {
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            JSONObject optJSONObject = new JSONObject(str2).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("perm_public");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("constraint");
            if (optJSONObject3 == null) {
                permissionConstraints = new PermissionConstraints(0, 0, 0, 7, null);
            } else {
                permissionConstraints = new PermissionConstraints(optJSONObject3.optInt("security"), optJSONObject3.optInt(Comment.f24093e), optJSONObject3.optInt("link_share_entity"));
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("constraint_value");
            if (optJSONObject4 == null) {
                permissionConstraintsValue = new PermissionConstraintsValue(1, 1);
            } else {
                permissionConstraintsValue = new PermissionConstraintsValue(optJSONObject4.optInt("security"), optJSONObject4.optInt(Comment.f24093e));
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("block_options");
            if (optJSONObject5 == null) {
                blockOptions = null;
            } else {
                try {
                    blockOptions = m41367a(optJSONObject5);
                } catch (Exception e2) {
                    e = e2;
                    C13479a.m54759a("DocPublicPermissionParserV2", "parse: ", e);
                    return new DocPublicPermissionV2(0, 0, 0, 0, 0, 0, false, false, null, false, false, false, false, false, null, null, null, null, null, 524287, null);
                }
            }
            JSONObject optJSONObject6 = optJSONObject2.optJSONObject("perm_type");
            if (optJSONObject6 == null) {
                permType = new PermType(0, 0, 3, null);
            } else {
                permType = new PermType(optJSONObject6.optInt("external_access_switch"), optJSONObject6.optInt("link_share_entity"));
            }
            int optInt = optJSONObject2.optInt("share_external_entity");
            int optInt2 = optJSONObject2.optInt("link_share_entity");
            int optInt3 = optJSONObject2.optInt("comment_entity");
            int optInt4 = optJSONObject2.optInt("share_entity");
            int optInt5 = optJSONObject2.optInt("manage_collaborator_entity");
            int optInt6 = optJSONObject2.optInt("security_entity");
            boolean optBoolean = optJSONObject2.optBoolean("external_access_switch");
            boolean optBoolean2 = optJSONObject2.optBoolean("link_password_switch");
            String optString = optJSONObject2.optString("link_password", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "permPublicObj.optString(\"link_password\", \"\")");
            boolean optBoolean3 = optJSONObject.optBoolean("is_owner");
            boolean optBoolean4 = optJSONObject.optBoolean("admin_can_cross");
            boolean optBoolean5 = optJSONObject.optBoolean("anonymous_verify");
            boolean optBoolean6 = optJSONObject2.optBoolean("lock_switch");
            boolean optBoolean7 = optJSONObject.optBoolean("can_unlock");
            String jSONObject = optJSONObject.toString();
            if (jSONObject != null) {
                str3 = jSONObject;
            } else {
                str3 = "";
            }
            return new DocPublicPermissionV2(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optBoolean, optBoolean2, optString, optBoolean3, optBoolean4, optBoolean5, optBoolean6, optBoolean7, str3, permissionConstraints, permissionConstraintsValue, permType, blockOptions);
        } catch (Exception e3) {
            e = e3;
            C13479a.m54759a("DocPublicPermissionParserV2", "parse: ", e);
            return new DocPublicPermissionV2(0, 0, 0, 0, 0, 0, false, false, null, false, false, false, false, false, null, null, null, null, null, 524287, null);
        }
    }

    /* renamed from: a */
    private final HashMap<Integer, Integer> m41368a(JSONObject jSONObject, String str) {
        int i;
        int i2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        int length = optJSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            if (optJSONObject != null) {
                i = optJSONObject.optInt("value");
            } else {
                i = 0;
            }
            if (optJSONObject != null) {
                i2 = optJSONObject.optInt("block_type");
            } else {
                i2 = 0;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return hashMap;
    }
}
