package com.bytedance.ee.bear.list;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.e */
public class C8277e implements NetService.AbstractC5074c<DocumentListInfo> {

    /* renamed from: a */
    protected DocumentListInfo f22385a;

    /* renamed from: b */
    private boolean f22386b = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32562a(DocumentListInfo documentListInfo, JSONObject jSONObject) {
    }

    /* renamed from: a */
    private boolean m34063a(JSONObject jSONObject) {
        if (jSONObject == null) {
            C13479a.m54764b("DocumentListParser", "isSuccess()...null");
            return false;
        } else if (jSONObject.optInt("code") == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public DocumentListInfo parse(String str) {
        this.f22385a = new DocumentListInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!m34063a(jSONObject)) {
                C13479a.m54764b("DocumentListParser", "parse()...error code = " + jSONObject.optInt("code"));
                return this.f22385a;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            mo32562a(this.f22385a, optJSONObject);
            mo32564b(this.f22385a, optJSONObject);
            mo32565c(this.f22385a, optJSONObject);
            return this.f22385a;
        } catch (JSONException unused) {
            C13479a.m54758a("DocumentListParser", "new mainObj exception");
        }
    }

    /* renamed from: a */
    private void m34062a(Document document) {
        try {
            JSONObject jSONObject = new JSONObject(document.mo32387H());
            document.mo32432c(jSONObject.optBoolean("is_external"));
            document.mo32487u(jSONObject.optString("subtype"));
            document.mo32376B(jSONObject.optString("space_id"));
            document.mo32435d(jSONObject.optBoolean("is_share_root"));
            document.mo32489v(jSONObject.optString("icon"));
            document.mo32491w(jSONObject.optString("icon_key"));
            document.mo32493x(jSONObject.optString("icon_nonce"));
            document.mo32439f(jSONObject.optInt("icon_encrypted_type"));
            document.mo32441f(jSONObject.optBoolean("copiable"));
            document.mo32452i(jSONObject.optBoolean("is_visited"));
            document.mo32460k(jSONObject.optBoolean("has_perm", true));
            document.mo32392J(jSONObject.optString("app_id"));
            document.mo32458k(jSONObject.optInt("wiki_subtype"));
            document.mo32394K(jSONObject.optString("wiki_version", "1"));
            document.mo32471n(jSONObject.optBoolean("is_share_folder", false));
            document.mo32474o(jSONObject.optBoolean("complaint", false));
            document.mo32396L(jSONObject.optString("description"));
        } catch (JSONException e) {
            C13479a.m54759a("DocumentListParser", "parseExtra:", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32563a(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray != null && jSONObject != null) {
            return false;
        }
        C13479a.m54764b("DocumentListParser", "parseNodes()...null");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public DocumentListInfo mo32564b(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray("node_list");
        JSONObject optJSONObject = jSONObject.optJSONObject("entities");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("nodes");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("users");
        if (mo32563a(optJSONArray, optJSONObject2)) {
            return documentListInfo;
        }
        ArrayList<Document> arrayList = new ArrayList<>();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject(optJSONArray.optString(i));
            if (optJSONObject3 == null) {
                jSONObject2 = null;
            } else {
                jSONObject2 = optJSONObject3.optJSONObject(optJSONObject4.optString("owner_id"));
            }
            Document a = mo32561a(optJSONObject4, jSONObject2, true);
            if (a == null) {
                C13479a.m54764b("DocumentListParser", "parseList()...temp is null");
            } else {
                arrayList.add(a);
            }
        }
        documentListInfo.setDocumentList(arrayList);
        return documentListInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32565c(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        documentListInfo.setHasMore(jSONObject.optBoolean("has_more"));
        documentListInfo.setCheckId(jSONObject.optString("check_id"));
        documentListInfo.setNextId(jSONObject.optString("next_id"));
        int optInt = jSONObject.optInt("total", C13657b.m55424c(documentListInfo.getDocumentList()));
        if (optInt > 0 && C13657b.m55421a(documentListInfo.getDocumentList())) {
            optInt = 0;
        }
        documentListInfo.setTotal(optInt);
        documentListInfo.setLastLabel(jSONObject.optString("last_label"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (jSONObject == null) {
            C13479a.m54764b("DocumentListParser", "parseDoc()...null");
            return null;
        }
        Document document = new Document();
        int optInt = jSONObject.optInt(ShareHitPoint.f121869d, C8275a.f22371d.mo32555b());
        if (!this.f22386b || C8677r.m36258a().mo33682a(optInt)) {
            if (optInt == C8275a.f22370c.mo32555b()) {
                int optInt2 = jSONObject.optInt("owner_type");
                if (!this.f22386b || FolderVersion.acceptOwnerType(optInt2)) {
                    document.mo32461l(optInt2);
                    int optInt3 = jSONObject.optInt("share_version");
                    if (FolderVersion.isNewShareFolder(optInt3) && z) {
                        return null;
                    }
                    document.mo32442g(optInt3);
                } else {
                    C13479a.m54764b("DocumentListParser", "parseDoc()...unknown ownerType!!!, ownerType = " + optInt2);
                    return null;
                }
            }
            document.mo32433d(optInt);
            document.mo32443g(jSONObject.optString("name"));
            document.mo32454j(jSONObject.optString("token"));
            document.mo32451i(jSONObject.optString("obj_token"));
            document.mo32434d(jSONObject.optString("owner_id"));
            document.mo32459k(jSONObject.optString("edit_uid"));
            document.mo32462l(jSONObject.optString("edit_time"));
            document.mo32482s(jSONObject.optString("create_time"));
            document.mo32412a(jSONObject.optBoolean("is_stared"));
            document.mo32467m(jSONObject.optString("url"));
            document.mo32487u(jSONObject.optString("subtype"));
            document.mo32380D(jSONObject.optString("thumbnail"));
            document.mo32438e(jSONObject.optBoolean("is_pined"));
            document.mo32468m(jSONObject.optBoolean("is_subscribed"));
            document.mo32461l(jSONObject.optInt("owner_type"));
            document.mo32466m(jSONObject.optInt("node_type", 0));
            document.mo32495y(jSONObject.optString("extra"));
            document.ag().mo32504a(jSONObject.optString("icon_key"));
            document.ag().mo32503a(jSONObject.optInt("icon_type", -1));
            document.ag().mo32506b(jSONObject.optString("icon_fsunit"));
            if (!TextUtils.isEmpty(document.mo32387H())) {
                m34062a(document);
            }
            String optString = jSONObject.optString("thumbnail_extra");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject3 = new JSONObject(optString);
                    document.mo32386G(jSONObject3.optString("url"));
                    document.mo32388H(jSONObject3.optString("secret"));
                    document.mo32390I(jSONObject3.optString("nonce"));
                    document.mo32453j(jSONObject3.optInt(ShareHitPoint.f121869d));
                } catch (JSONException e) {
                    C13479a.m54759a("DocumentListParser", "parseThumbnailExtra:", e);
                }
            }
            if (jSONObject2 != null) {
                document.mo32470n(jSONObject2.optString("cn_name"));
                document.mo32473o(jSONObject2.optString("en_name"));
                document.mo32378C(jSONObject2.optString("tenant_id"));
            }
            return document;
        }
        C13479a.m54764b("DocumentListParser", "parseDoc()...unknown type!!!, type = " + optInt);
        return null;
    }
}
