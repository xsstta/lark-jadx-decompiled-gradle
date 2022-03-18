package com.bytedance.ee.bear.middleground.permission;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0013J\u0006\u0010\u001f\u001a\u00020\u0013J\u0006\u0010 \u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0013J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010'\u001a\u00020\u0013J\u0006\u0010(\u001a\u00020\u0013J&\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020#2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.J\u0006\u0010/\u001a\u00020\u0013J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u00020\u0013J\u0006\u00104\u001a\u00020\u0013J\u000e\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/PermBitableShareAnalytic;", "", "()V", "BITABLE_FORM_PERM_COMMON_PARAMS", "", "DOC_COMMON_PARAMS", "EVENT_FORM_COLLABORATOR_DELETE_CLICK", "EVENT_FORM_COLLABORATOR_DELETE_VIEW", "EVENT_FORM_LIMIT_SET_CLICK", "EVENT_FORM_LIMIT_SET_VIEW", "EVENT_FORM_PERMISSION_CLICK", "EVENT_FORM_PERMISSION_COLLABORATOR_CLICK", "EVENT_FORM_PERMISSION_COLLABORATOR_VIEW", "EVENT_FORM_PERMISSION_SELECT_CONTACT_CLICK", "EVENT_FORM_PERMISSION_SELECT_CONTACT_VIEW", "NATIVE_PERMISSION_COMMON_PARAMS", "TAG", "TARGET_NONE", "appendCommonParams", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "params", "Lorg/json/JSONObject;", "reportClick", "click", "target", "reportClickLimitSet", "reportClickManageCollaborator", "reportCollaboratorManagerClickBack", "reportCollaboratorManagerClickDelete", "reportCollaboratorManagerClickInvite", "reportCollaboratorManagerView", "reportDeleteCollaboratorTipsClick", "isConfirm", "", "reportDeleteCollaboratorTipsView", "reportEvent", "eventName", "reportInviteCollaborator", "reportInviteManagerClickBack", "reportInviteManagerClickInvite", "sendNotify", "userInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "reportInviteManagerView", "reportLimitSetClick", "linkShareEntity", "", "reportLimitSetClickBack", "reportLimitSetView", "updatePublicPerm", "file_permission", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.a */
public final class PermBitableShareAnalytic {

    /* renamed from: a */
    public static final PermBitableShareAnalytic f25618a = new PermBitableShareAnalytic();

    private PermBitableShareAnalytic() {
    }

    /* renamed from: a */
    public final void mo36523a() {
        m39429a("limit_set", "ccm_bitable_form_limit_set_view");
    }

    /* renamed from: b */
    public final void mo36528b() {
        m39429a("manage_collaborator", "ccm_bitable_form_permission_collaborator_view");
    }

    /* renamed from: c */
    public final void mo36529c() {
        m39429a("invite_collaborator", "ccm_permission_add_collaborator_view");
    }

    /* renamed from: d */
    public final void mo36530d() {
        m39430a("ccm_bitable_form_limit_set_view", new JSONObject());
    }

    /* renamed from: f */
    public final void mo36532f() {
        m39430a("ccm_bitable_form_permission_collaborator_view", new JSONObject());
    }

    /* renamed from: j */
    public final void mo36536j() {
        m39430a("ccm_bitable_form_collaborator_delete_view", new JSONObject());
    }

    /* renamed from: k */
    public final void mo36537k() {
        m39430a("ccm_bitable_form_permission_select_contact_view", new JSONObject());
    }

    /* renamed from: e */
    public final void mo36531e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_limit_set_click", jSONObject);
    }

    /* renamed from: g */
    public final void mo36533g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_permission_collaborator_click", jSONObject);
    }

    /* renamed from: h */
    public final void mo36534h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "delete");
        jSONObject.put("target", "ccm_bitable_form_collaborator_delete_view");
        m39430a("ccm_bitable_form_permission_collaborator_click", jSONObject);
    }

    /* renamed from: i */
    public final void mo36535i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "add_collaborator");
        jSONObject.put("target", "ccm_permission_add_collaborator_view");
        m39430a("ccm_bitable_form_permission_collaborator_click", jSONObject);
    }

    /* renamed from: l */
    public final void mo36538l() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_permission_select_contact_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo36525a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "file_permission");
        C5234y.m21391b().mo21078a("nativePermissionCommonParams", "file_permission", str);
    }

    /* renamed from: a */
    public final void mo36524a(int i) {
        JSONObject jSONObject = new JSONObject();
        String str = "only_collaborator";
        if (i != 0) {
            if (i == 2) {
                str = "organization_edit";
            } else if (i == 4) {
                str = "internet_edit";
            }
        }
        jSONObject.put("click", str);
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_limit_set_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo36526a(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "delete";
        } else {
            str = "cancel";
        }
        jSONObject.put("click", str);
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_collaborator_delete_click", jSONObject);
    }

    /* renamed from: a */
    private final void m39429a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        m39430a("ccm_bitable_form_permission_click", jSONObject);
    }

    /* renamed from: a */
    private final void m39430a(String str, JSONObject jSONObject) {
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "analyticService");
        m39428a(b, jSONObject);
        b.mo21085b(str, jSONObject);
        C13479a.m54772d("PermBitableShareAnalytic", "eventName = " + str + ", params = " + jSONObject);
    }

    /* renamed from: a */
    private final void m39428a(AbstractC5233x xVar, JSONObject jSONObject) {
        HashMap<String, Object> c = xVar.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…DataV2(DOC_COMMON_PARAMS)");
        HashMap<String, Object> c2 = xVar.mo21086c("nativePermissionCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c2, "analyticService.getAllCo…PERMISSION_COMMON_PARAMS)");
        HashMap<String, Object> c3 = xVar.mo21086c("bitableFormPermCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c3, "analyticService.getAllCo…_FORM_PERM_COMMON_PARAMS)");
        Set<Map.Entry<String, Object>> entrySet = c.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "docCommonParams.entries");
        for (T t : entrySet) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        Set<Map.Entry<String, Object>> entrySet2 = c2.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet2, "permCommonParams.entries");
        for (T t2 : entrySet2) {
            jSONObject.put((String) t2.getKey(), t2.getValue());
        }
        Set<Map.Entry<String, Object>> entrySet3 = c3.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet3, "bitableCommonParams.entries");
        for (T t3 : entrySet3) {
            jSONObject.put((String) t3.getKey(), t3.getValue());
        }
    }

    /* renamed from: a */
    public final void mo36527a(boolean z, ArrayList<UserInfo> arrayList) {
        String str;
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "invite");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        jSONObject.put("is_send_notice", str);
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("target", "none");
        m39430a("ccm_bitable_form_permission_select_contact_click", jSONObject);
    }
}
