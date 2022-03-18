package com.ss.android.lark.mail.impl.message;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.email.client.v1.DocStruct;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43860w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.a */
public class C42827a {

    /* renamed from: a */
    public ArrayList<C42830b> f109021a = new ArrayList<>();

    /* renamed from: b */
    private final String f109022b = "MessageDataHelper";

    /* renamed from: c */
    private final String f109023c = "thread_id";

    /* renamed from: d */
    private final String f109024d = "message_id";

    /* renamed from: e */
    private final String f109025e = "current_label_id";

    /* renamed from: f */
    private final String f109026f = "action_source";

    /* renamed from: g */
    private final String f109027g = "messagelist_menu_more";

    /* renamed from: h */
    private final String f109028h = "chat_group_ids";

    /* renamed from: i */
    private final String f109029i = "fold_click";

    /* renamed from: j */
    private final String f109030j = "fold";

    /* renamed from: k */
    private final String f109031k = "unfold";

    /* renamed from: com.ss.android.lark.mail.impl.message.a$a */
    public interface AbstractC42829a {
        /* renamed from: a */
        void mo153743a(String str);
    }

    /* renamed from: a */
    private void m170652a(DocStruct docStruct) {
        if (docStruct != null) {
            C43860w.m173859a(docStruct.abstract_);
        }
    }

    /* renamed from: a */
    public MailImage mo153733a(MailAttachment mailAttachment) {
        if (mailAttachment == null) {
            return null;
        }
        MailImage mailImage = new MailImage();
        mailImage.mo151473c(mailAttachment.mo151234j());
        mailImage.mo151472b(mailAttachment.mo151229f());
        mailImage.mo151469a(mailAttachment.mo151231h());
        return mailImage;
    }

    /* renamed from: a */
    public List<String> mo153737a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("messageIds");
            if (optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165384e("MessageDataHelper", "parseMessageIDList", e);
            return null;
        }
    }

    /* renamed from: b */
    public String mo153741b(List<C42097j> list) {
        String str;
        if (CollectionUtils.isNotEmpty(list)) {
            str = list.get(0).mo151964g().mo151604g();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return C43819s.m173684a((int) R.string.Mail_ThreadList_NoName);
        }
        return str;
    }

    /* renamed from: b */
    private ArrayList<String> m170653b(JSONObject jSONObject) {
        Log.m165389i("MessageDataHelper", "processDocLinks");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("urls");
            if (optJSONObject == null) {
                Log.m165383e("MessageDataHelper", "processDocLinks empty urls");
                return null;
            }
            Iterator<String> keys = optJSONObject.keys();
            if (keys == null) {
                Log.m165383e("MessageDataHelper", "processDocLinks empty url key");
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            while (keys.hasNext()) {
                String next = keys.next();
                if (TextUtils.isEmpty(next)) {
                    Log.m165383e("MessageDataHelper", "processDocLinks empty message id");
                } else {
                    C42830b bVar = new C42830b(next);
                    this.f109021a.add(bVar);
                    JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        if (optJSONArray.length() != 0) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String string = optJSONArray.getString(i);
                                bVar.f109035b.add(string);
                                arrayList.add(string);
                            }
                        }
                    }
                    Log.m165383e("MessageDataHelper", "processDocLinks empty doc link array");
                }
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165384e("MessageDataHelper", "processDocLinks", e);
            return null;
        }
    }

    /* renamed from: b */
    private JSONObject m170654b(DocStruct docStruct) {
        DocStruct.Type type;
        if (docStruct == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", docStruct.key);
            jSONObject.put("url", docStruct.url);
            if (docStruct.type == null) {
                type = DocStruct.Type.UNKNOWN;
            } else {
                type = docStruct.type;
            }
            jSONObject.put(ShareHitPoint.f121869d, type.getValue());
            jSONObject.put("name", docStruct.name);
            jSONObject.put("iconKey", docStruct.icon_key);
            jSONObject.put("abstract", docStruct.abstract_);
            jSONObject.put("createTime", docStruct.create_time);
            jSONObject.put("updateTime", docStruct.update_time);
            jSONObject.put("ownerName", docStruct.owner_name);
            jSONObject.put("ownerID", docStruct.owner_id);
            return jSONObject;
        } catch (Exception e) {
            Log.m165384e("MessageDataHelper", "assembleDocInfoJsonObject", e);
            return null;
        }
    }

    /* renamed from: a */
    public String mo153734a(Map<String, DocStruct> map) {
        if (CollectionUtils.isEmpty(map)) {
            Log.m165383e("MessageDataHelper", "packPreviewDocInfo empty map");
            return null;
        } else if (CollectionUtils.isEmpty(this.f109021a)) {
            Log.m165383e("MessageDataHelper", "packPreviewDocInfo empty list");
            return null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < this.f109021a.size(); i++) {
                    C42830b bVar = this.f109021a.get(i);
                    if (bVar != null && !TextUtils.isEmpty(bVar.f109034a)) {
                        if (!CollectionUtils.isEmpty(bVar.f109035b)) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i2 = 0; i2 < bVar.f109035b.size(); i2++) {
                                String str = bVar.f109035b.get(i2);
                                if (!TextUtils.isEmpty(str)) {
                                    DocStruct docStruct = map.get(str);
                                    m170652a(docStruct);
                                    JSONObject b = m170654b(docStruct);
                                    if (b != null) {
                                        jSONArray.put(b);
                                    }
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put(bVar.f109034a, jSONArray);
                            }
                        }
                    }
                    Log.m165389i("MessageDataHelper", "packPreviewDocInfo invalid message item");
                }
                return jSONObject.toString();
            } catch (Exception e) {
                Log.m165384e("MessageDataHelper", "packPreviewDocInfo", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public ArrayList<MailImage> mo153735a(C42097j jVar) {
        if (jVar == null || jVar.mo151964g() == null || CollectionUtils.isEmpty(jVar.mo151964g().mo151610j())) {
            return null;
        }
        ArrayList<MailImage> arrayList = new ArrayList<>();
        List<MailAttachment> j = jVar.mo151964g().mo151610j();
        for (int i = 0; i < j.size(); i++) {
            MailAttachment mailAttachment = j.get(i);
            if (C26311p.m95292l(C26311p.m95283c(mailAttachment.mo151229f()))) {
                arrayList.add(mo153733a(mailAttachment));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public ArrayList<String> mo153736a(List<C42097j> list) {
        Log.m165389i("MessageDataHelper", "extractMessageIDList");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("MessageDataHelper", "extractMessageIDList empty list");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (C42097j jVar : list) {
            if (jVar == null || jVar.mo151964g() == null || TextUtils.isEmpty(jVar.mo151964g().mo151581b())) {
                Log.m165383e("MessageDataHelper", "extractMessageIDList invalid message");
            } else {
                arrayList.add(jVar.mo151964g().mo151581b());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.a$b */
    public class C42830b {

        /* renamed from: a */
        String f109034a;

        /* renamed from: b */
        ArrayList<String> f109035b = new ArrayList<>();

        C42830b(String str) {
            this.f109034a = str;
        }
    }

    /* renamed from: a */
    public Pair<C42097j, MailAttachment> mo153732a(List<C42097j> list, String str) {
        if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                C42097j jVar = list.get(i);
                List<MailAttachment> j = jVar.mo151964g().mo151610j();
                if (!CollectionUtils.isEmpty(j)) {
                    for (int i2 = 0; i2 < j.size(); i2++) {
                        MailAttachment mailAttachment = j.get(i2);
                        if (mailAttachment.mo151234j().equals(str)) {
                            return new Pair<>(jVar, mailAttachment);
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Object mo153740b(List<C42097j> list, String str) {
        if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
            for (C42097j jVar : list) {
                if (!(jVar == null || jVar.mo151964g() == null)) {
                    List<MailAttachment> j = jVar.mo151964g().mo151610j();
                    if (CollectionUtils.isNotEmpty(j)) {
                        for (MailAttachment mailAttachment : j) {
                            if (mailAttachment != null && str.equals(mailAttachment.mo151234j())) {
                                return mailAttachment;
                            }
                        }
                    }
                    List<MailImage> k = jVar.mo151964g().mo151611k();
                    if (CollectionUtils.isNotEmpty(k)) {
                        for (MailImage mailImage : k) {
                            if (mailImage != null && str.equals(mailImage.mo151480f())) {
                                return mailImage;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo153738a(String str, boolean z) {
        String str2;
        Log.m165389i("MessageDataHelper", "reportForwardToChatFoldingOperation");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("MessageDataHelper", "reportForwardToChatFoldingOperation invalid card id");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message_card_id", str);
            if (z) {
                str2 = "fold";
            } else {
                str2 = "unfold";
            }
            jSONObject.put("fold_click", str2);
            C41816b.m166115a().mo150114D().mo150182b("email_send2chat_foldunfold", jSONObject);
        } catch (Exception e) {
            Log.m165384e("MessageDataHelper", "reportForwardToChatFoldingOperation", e);
        }
    }

    /* renamed from: a */
    public void mo153739a(JSONObject jSONObject, final AbstractC42829a aVar) {
        if (jSONObject == null) {
            Log.m165383e("MessageDataHelper", "processDocLinkPreview empty json");
            return;
        }
        ArrayList<String> b = m170653b(jSONObject);
        if (CollectionUtils.isEmpty(b)) {
            Log.m165383e("MessageDataHelper", "processDocLinkPreview no doc link");
            return;
        }
        C42176e.m168344a().mo152223a(b, new IGetDataCallback<MailGetDocsByUrlsResponse>() {
            /* class com.ss.android.lark.mail.impl.message.C42827a.C428281 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MessageDataHelper", "fetchDocInfo onError");
                C42827a.this.f109021a.clear();
            }

            /* renamed from: a */
            public void onSuccess(MailGetDocsByUrlsResponse mailGetDocsByUrlsResponse) {
                Log.m165389i("MessageDataHelper", "fetchDocInfo onSuccess");
                if (mailGetDocsByUrlsResponse == null || !CollectionUtils.isNotEmpty(mailGetDocsByUrlsResponse.docs)) {
                    Log.m165383e("MessageDataHelper", "fetchDocInfo onSuccess but no data");
                    C42827a.this.f109021a.clear();
                    return;
                }
                AbstractC42829a aVar = aVar;
                if (aVar != null) {
                    aVar.mo153743a(C42827a.this.mo153734a(mailGetDocsByUrlsResponse.docs));
                }
            }
        });
    }
}
