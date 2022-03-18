package com.bytedance.ee.bear.list.folderselect;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folderselect.g */
public class C8411g extends C8277e {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: b */
    public DocumentListInfo mo32564b(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        JSONObject optJSONObject = jSONObject.optJSONObject("entities");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("nodes");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("users");
        if (mo32563a(optJSONArray, optJSONObject2)) {
            return documentListInfo;
        }
        ArrayList<Document> arrayList = new ArrayList<>();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject(optJSONArray2.optString(optJSONArray2.length() - 1));
            if (optJSONObject3 == null) {
                jSONObject2 = null;
            } else {
                jSONObject2 = optJSONObject3.optJSONObject(optJSONObject4.optString("owner_id"));
            }
            Document a = mo32561a(optJSONObject4, jSONObject2, true);
            if (a == null || a.mo32483t() != C8275a.f22370c.mo32555b()) {
                C13479a.m54764b("DocumentListParser", "parseList()...temp is null or type != folder");
            } else {
                arrayList.add(a);
            }
        }
        documentListInfo.setDocumentList(arrayList);
        return documentListInfo;
    }
}
