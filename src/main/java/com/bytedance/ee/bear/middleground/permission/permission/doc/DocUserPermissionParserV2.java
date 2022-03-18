package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionV2;", "()V", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.g */
public final class DocUserPermissionParserV2 implements NetService.AbstractC5074c<DocUserPermissionV2> {

    /* renamed from: a */
    public static final Companion f26868a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionParserV2$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public DocUserPermissionV2 parse(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("actions");
            int optInt = optJSONObject2.optInt("view");
            int optInt2 = optJSONObject2.optInt("edit");
            int optInt3 = optJSONObject2.optInt(Comment.f24093e);
            int optInt4 = optJSONObject2.optInt("manage_collaborator");
            int optInt5 = optJSONObject2.optInt("manage_meta");
            int optInt6 = optJSONObject2.optInt("create_sub_node");
            DocPermissionAction docPermissionAction = new DocPermissionAction(optInt, optInt2, optInt3, optJSONObject2.optInt("copy"), optJSONObject2.optInt("export"), optInt4, optInt5, optInt6, optJSONObject2.optInt("download"), optJSONObject2.optInt("operate_from_dusbin"), optJSONObject2.optInt("operate_entity"), optJSONObject2.optInt("manage_single_page_collaborator"), optJSONObject2.optInt("manage_single_page_meta"), optJSONObject2.optInt("invite_full_access"), optJSONObject2.optInt("invite_can_edit"), optJSONObject2.optInt("invite_can_view"), optJSONObject2.optInt("invite_single_page_full_access"), optJSONObject2.optInt("invite_single_page_can_edit"), optJSONObject2.optInt("invite_single_page_can_view"), optJSONObject2.optInt("be_moved"), optJSONObject2.optInt("move_from"), optJSONObject2.optInt("move_to"), optJSONObject2.optInt("manage_history_record"), optJSONObject2.optInt("print"), optJSONObject2.optInt("collect"));
            boolean optBoolean = optJSONObject.optBoolean("is_owner");
            int optInt7 = optJSONObject.optInt("permission_status_code");
            String jSONObject = optJSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject, "dataObj.toString()");
            return new DocUserPermissionV2(optBoolean, optInt7, docPermissionAction, null, jSONObject);
        } catch (Exception e) {
            C13479a.m54758a("DocUserPermissionParserV2", "parse: " + e);
            return new DocUserPermissionV2(false, 0, null, null, null, 31, null);
        }
    }
}
