package com.bytedance.ee.bear.middleground.permission.sharefolder;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/CollaboratorInfoParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "()V", "generateCollaboratorInfo", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "dataObject", "Lorg/json/JSONObject;", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f.a */
public final class CollaboratorInfoParser implements NetService.AbstractC5074c<ShareUserInfoResult> {

    /* renamed from: a */
    public static final Companion f26812a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/CollaboratorInfoParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public ShareUserInfoResult parse(String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        ShareUserInfoResult shareUserInfoResult = new ShareUserInfoResult();
        shareUserInfoResult.setUserInfoList(new ArrayList<>());
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("CollaboratorInfoParser", "get json is null!");
            return shareUserInfoResult;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                shareUserInfoResult.setHasMore(optJSONObject.optBoolean("has_more"));
                String optString = optJSONObject.optString("last_label");
                if (optString == null) {
                    optString = "";
                }
                shareUserInfoResult.setLastLabel(optString);
                JSONArray optJSONArray = optJSONObject.optJSONArray("collaborators");
                if (optJSONArray != null) {
                    int length = optJSONArray.length() - 1;
                    int i = 0;
                    if (length >= 0) {
                        while (true) {
                            UserInfo userInfo = new UserInfo();
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            if (optJSONObject2 != null) {
                                userInfo.setPermission(optJSONObject2.optInt("perm_role"));
                                userInfo.setExternal(optJSONObject2.optBoolean("is_external"));
                                userInfo.setOwner(optJSONObject2.optBoolean("is_owner"));
                                userInfo.setPermSource(optJSONObject2.optString("perm_source"));
                                userInfo.setCan_modify_perm(optJSONObject2.optBoolean("can_modify_perm"));
                                userInfo.setOwnerType(optJSONObject2.optInt("collaborator_type"));
                                String optString2 = optJSONObject2.optString("avatar_url");
                                if (optString2 == null) {
                                    optString2 = "";
                                }
                                userInfo.setAvatarUrl(optString2);
                                String optString3 = optJSONObject2.optString("collaborator_id");
                                if (optString3 == null) {
                                    optString3 = "";
                                }
                                userInfo.setId(optString3);
                                String optString4 = optJSONObject2.optString("collaborator_name");
                                if (optString4 == null) {
                                    optString4 = "";
                                }
                                userInfo.setName(optString4);
                                String optString5 = optJSONObject2.optString("tenant_name");
                                if (optString5 == null) {
                                    optString5 = "";
                                }
                                userInfo.setTenantName(optString5);
                                int ownerType = userInfo.getOwnerType();
                                if (ownerType == 0 || ownerType == 17) {
                                    m41231a(userInfo, optJSONObject);
                                }
                            }
                            shareUserInfoResult.getUserInfoList().add(userInfo);
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        } catch (Exception e) {
            C13479a.m54759a("CollaboratorInfoParser", "parse Collaborator error with:", e);
        }
        return shareUserInfoResult;
    }

    /* renamed from: a */
    private final void m41231a(UserInfo userInfo, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("entities");
        if (optJSONObject2 != null) {
            jSONObject2 = optJSONObject2.optJSONObject("users");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject(userInfo.getId())) != null) {
            userInfo.setTenantId(optJSONObject.optString("tenant_id"));
            userInfo.setLabel(optJSONObject.optString("department_name"));
            userInfo.setTenant_tag(optJSONObject.optString("tenant_tag"));
            userInfo.setAvatarUrl(optJSONObject.optString("avatar_url"));
        }
    }
}
