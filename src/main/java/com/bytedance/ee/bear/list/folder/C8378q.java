package com.bytedance.ee.bear.list.folder;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folder.q */
public class C8378q extends C8277e {

    /* renamed from: b */
    private final String f22618b;

    public C8378q(String str) {
        this.f22618b = str;
    }

    /* renamed from: a */
    private HashMap<String, Document> m34709a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("entities");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("nodes");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("offline");
        if (optJSONObject3 == null) {
            C13479a.m54764b("FolderListParser", "parseOfflineList()... offlineNode is null ");
            return null;
        }
        try {
            HashMap<String, Document> hashMap = new HashMap<>();
            Iterator<String> keys = optJSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Document a = mo32561a(optJSONObject2.getJSONObject(optJSONObject3.optString(next)), null, true);
                if (a == null) {
                    C13479a.m54758a("FolderListParser", "parseOfflineList: documentObj is null");
                } else {
                    a.mo32484t(next);
                    hashMap.put(next, a);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            C13479a.m54759a("FolderListParser", "parseOfflineList:", e);
            return null;
        } catch (Exception e2) {
            C13479a.m54759a("FolderListParser", "parseOfflineList: ", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public void mo32562a(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        if (documentListInfo == null || jSONObject == null) {
            C13479a.m54764b("FolderListParser", "parseCustomData()... null");
        } else {
            documentListInfo.setFakeTokenMap(m34709a(jSONObject));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: b */
    public DocumentListInfo mo32564b(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        DocumentListInfo b = super.mo32564b(documentListInfo, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("entities");
        b.setParent(m34708a(optJSONObject.optJSONObject("nodes"), optJSONObject.optJSONObject("users")));
        return b;
    }

    /* renamed from: a */
    private Document m34708a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (TextUtils.isEmpty(this.f22618b) || jSONObject == null) {
            C13479a.m54764b("FolderListParser", "parseParentNode()...null path  or nodes ");
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(this.f22618b);
            if (optJSONObject == null) {
                return null;
            }
            if (jSONObject2 == null) {
                jSONObject3 = null;
            } else {
                jSONObject3 = jSONObject2.optJSONObject(optJSONObject.optString("owner_id"));
            }
            return mo32561a(optJSONObject, jSONObject3, true);
        } catch (Exception e) {
            C13479a.m54759a("FolderListParser", "parseParentNode()... exception: ", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: c */
    public void mo32565c(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        int i;
        super.mo32565c(documentListInfo, jSONObject);
        if (TextUtils.isEmpty(this.f22618b)) {
            if (C13657b.m55421a(documentListInfo.getDocumentList())) {
                i = 0;
            } else {
                i = documentListInfo.getDocumentList().size();
            }
            documentListInfo.setTotal(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public Document mo32561a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Document a = super.mo32561a(jSONObject, jSONObject2, z);
        if (a != null) {
            a.mo32480r(this.f22618b);
        }
        return a;
    }
}
