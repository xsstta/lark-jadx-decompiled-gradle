package com.bytedance.ee.bear.middleground.permission.permission.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/FolderPublicPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;)V", "getVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.b */
public final class FolderPublicPermissionParser implements NetService.AbstractC5074c<ShareFolderPublicPermission> {

    /* renamed from: a */
    public static final Companion f26835a = new Companion(null);

    /* renamed from: b */
    private final FolderVersion f26836b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/FolderPublicPermissionParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FolderPublicPermissionParser(FolderVersion folderVersion) {
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f26836b = folderVersion;
    }

    /* renamed from: a */
    public ShareFolderPublicPermission parse(String str) {
        JSONException e;
        ShareFolderPublicPermission shareFolderPublicPermission;
        String str2;
        String jSONObject;
        String str3;
        String jSONObject2;
        Intrinsics.checkParameterIsNotNull(str, "json");
        int a = ShareFolderPublicPermission.Companion.mo38735a();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                if (this.f26836b.isShareFolderV1()) {
                    boolean optBoolean = optJSONObject.optBoolean("is_owner", false);
                    boolean optBoolean2 = optJSONObject.optBoolean("admin_allow_cross", false);
                    boolean optBoolean3 = optJSONObject.optBoolean("allow_cross_tenant", false);
                    boolean optBoolean4 = optJSONObject.optBoolean("exist_password", false);
                    String optString = optJSONObject.optString("password", "");
                    Intrinsics.checkExpressionValueIsNotNull(optString, "dataObj.optString(\"password\", \"\")");
                    int optInt = optJSONObject.optInt("link_perm", a);
                    if (optJSONObject == null || (jSONObject2 = optJSONObject.toString()) == null) {
                        str3 = "";
                    } else {
                        str3 = jSONObject2;
                    }
                    shareFolderPublicPermission = new ShareFolderPublicPermission(optBoolean, optBoolean2, optBoolean3, optBoolean4, optString, optInt, false, false, false, false, str3, 960, null);
                } else {
                    boolean optBoolean5 = optJSONObject.optBoolean("is_owner", false);
                    boolean optBoolean6 = optJSONObject.optBoolean("admin_can_cross", false);
                    boolean optBoolean7 = optJSONObject.optBoolean("external_access", false);
                    boolean optBoolean8 = optJSONObject.optBoolean("has_link_password", false);
                    String optString2 = optJSONObject.optString("link_password", "");
                    Intrinsics.checkExpressionValueIsNotNull(optString2, "dataObj.optString(\"link_password\", \"\")");
                    int optInt2 = optJSONObject.optInt("link_share_entity", a);
                    boolean optBoolean9 = optJSONObject.optBoolean("has_link_share", false);
                    boolean optBoolean10 = optJSONObject.optBoolean("is_share_folder", false);
                    boolean optBoolean11 = optJSONObject.optBoolean("lock_state", false);
                    boolean optBoolean12 = optJSONObject.optBoolean("can_unlock", false);
                    if (optJSONObject == null || (jSONObject = optJSONObject.toString()) == null) {
                        str2 = "";
                    } else {
                        str2 = jSONObject;
                    }
                    shareFolderPublicPermission = new ShareFolderPublicPermission(optBoolean5, optBoolean6, optBoolean7, optBoolean8, optString2, optInt2, optBoolean9, optBoolean10, optBoolean11, optBoolean12, str2);
                }
                return shareFolderPublicPermission;
            } catch (JSONException e2) {
                e = e2;
                C13479a.m54759a("FolderPublicPermissionParser", "parse()...json = " + str, e);
                return new ShareFolderPublicPermission(false, false, false, false, null, a, false, false, false, false, null, 2015, null);
            }
        } catch (JSONException e3) {
            e = e3;
            C13479a.m54759a("FolderPublicPermissionParser", "parse()...json = " + str, e);
            return new ShareFolderPublicPermission(false, false, false, false, null, a, false, false, false, false, null, 2015, null);
        }
    }
}
