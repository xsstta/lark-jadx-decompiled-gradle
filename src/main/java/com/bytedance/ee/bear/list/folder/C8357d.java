package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folder.d */
public class C8357d extends C8277e {
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: a */
    public final DocumentListInfo parse(String str) {
        this.f22385a = new DocumentListInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code");
            this.f22385a.setCode(optInt);
            if (optInt == 0 || optInt == 4) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject == null) {
                    C13479a.m54764b("FolderDeleteParser", "parse()...data is null");
                    return this.f22385a;
                }
                mo32562a(this.f22385a, optJSONObject);
                mo32564b(this.f22385a, optJSONObject);
                mo32565c(this.f22385a, optJSONObject);
                return this.f22385a;
            }
            C13479a.m54764b("FolderDeleteParser", "parse()...error code = " + optInt);
            return this.f22385a;
        } catch (JSONException unused) {
            C13479a.m54758a("FolderDeleteParser", "new mainObj exception");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.C8277e
    /* renamed from: b */
    public DocumentListInfo mo32564b(DocumentListInfo documentListInfo, JSONObject jSONObject) {
        if (jSONObject.optJSONArray("node_list") == null) {
            return documentListInfo;
        }
        return super.mo32564b(documentListInfo, jSONObject);
    }
}
