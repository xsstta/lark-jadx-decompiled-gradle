package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.CreateDraftResponse;
import com.bytedance.lark.pb.im.v1.DeleteDraftRequest;
import com.bytedance.lark.pb.im.v1.GetAllDraftsRequest;
import com.bytedance.lark.pb.im.v1.GetAllDraftsResponse;
import com.bytedance.lark.pb.im.v1.GetDraftsRequest;
import com.bytedance.lark.pb.im.v1.GetDraftsResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.AbstractC34124e;
import com.ss.android.lark.chat.utils.SDKSendUtils;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57319i;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.impl.i */
public class C34218i implements AbstractC34124e {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.i$a */
    public static class C34222a {

        /* renamed from: a */
        static C34218i f88527a = new C34218i();
    }

    private C34218i() {
    }

    /* renamed from: a */
    public static C34218i m132791a() {
        return C34222a.f88527a;
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: a */
    public void mo126554a(String str, String str2) {
        C32821b.m126120a().mo121134b(str, str2);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: a */
    public void mo126555a(String str, String str2, Chat chat, RichText richText, String str3, RichText richText2, boolean z) {
        if (!C29990c.m110930b().mo134586n().mo134685a("messenger.message_inputbox_redesign") || chat == null || chat.isSecret()) {
            m132800b(str, str2, chat, richText, str3, richText2, z);
        } else {
            m132796a(str, str2, chat, str3, richText2, z);
        }
    }

    /* renamed from: b */
    private Map<String, List<Draft>> m132798b() {
        SDKSendUtils.m133260a();
        return (Map) SdkSender.syncSend(Command.GET_ALL_DRAFTS, new GetAllDraftsRequest.C17466a(), new SdkSender.IParser<Map<String, List<Draft>>>() {
            /* class com.ss.android.lark.chat.service.impl.C34218i.C342202 */

            /* renamed from: a */
            public Map<String, List<Draft>> parse(byte[] bArr) throws IOException {
                HashMap hashMap = new HashMap();
                if (!(bArr == null || bArr.length == 0)) {
                    for (Draft draft : C57319i.m222113a(GetAllDraftsResponse.ADAPTER.decode(bArr).entity.drafts).values()) {
                        if (!TextUtils.isEmpty(draft.chatId)) {
                            List list = (List) hashMap.get(draft.chatId);
                            if (list != null) {
                                list.add(draft);
                            } else {
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(draft);
                                hashMap.put(draft.chatId, arrayList);
                            }
                        }
                    }
                }
                return hashMap;
            }
        });
    }

    /* renamed from: c */
    private Map<String, List<Draft>> m132801c() {
        SDKSendUtils.m133260a();
        return (Map) SdkSender.syncSend(Command.GET_ALL_DRAFTS, new GetAllDraftsRequest.C17466a(), new SdkSender.IParser<Map<String, List<Draft>>>() {
            /* class com.ss.android.lark.chat.service.impl.C34218i.C342213 */

            /* renamed from: a */
            public Map<String, List<Draft>> parse(byte[] bArr) throws IOException {
                HashMap hashMap = new HashMap();
                if (!(bArr == null || bArr.length == 0)) {
                    for (Draft draft : C57319i.m222113a(GetAllDraftsResponse.ADAPTER.decode(bArr).entity.drafts).values()) {
                        List list = (List) hashMap.get(draft.messageId);
                        if (list != null) {
                            list.add(draft);
                        } else {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(draft);
                            hashMap.put(draft.messageId, arrayList);
                        }
                    }
                }
                return hashMap;
            }
        });
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: a */
    public Draft mo126552a(String str) {
        return m132797b(str, 0);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: b */
    public Draft mo126556b(String str) {
        return m132797b(str, 3);
    }

    /* renamed from: d */
    public void mo126772d(String str) {
        m132799b(mo126552a(str));
    }

    /* renamed from: e */
    public void mo126773e(String str) {
        m132799b(mo126556b(str));
    }

    /* renamed from: g */
    public void mo126775g(String str) {
        mo126553a(str, 0);
    }

    /* renamed from: h */
    public void mo126776h(String str) {
        mo126553a(str, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m132793a(byte[] bArr) throws IOException {
        return CreateDraftResponse.ADAPTER.decode(bArr).draft_id;
    }

    /* renamed from: b */
    private void m132799b(Draft draft) {
        if (draft != null) {
            mo126774f(draft.id);
        }
    }

    /* renamed from: f */
    public void mo126774f(String str) {
        if (!TextUtils.isEmpty(str)) {
            SdkSender.syncSend(Command.DELETE_DRAFT, new DeleteDraftRequest.C17408a().mo61085a(str), new SdkSender.IParser<JSONObject>() {
                /* class com.ss.android.lark.chat.service.impl.C34218i.C342191 */

                /* renamed from: a */
                public JSONObject parse(byte[] bArr) throws IOException {
                    return new JSONObject();
                }
            });
        }
    }

    /* renamed from: a */
    public Map<String, Draft> mo126768a(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap();
        }
        GetDraftsRequest.C17570a aVar = new GetDraftsRequest.C17570a();
        aVar.mo61491a(list);
        Map<String, Draft> map = (Map) SdkSender.syncSend(Command.GET_DRAFTS, aVar, new SdkSender.IParser(list) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$i$L9L_KYobTm5RsSXitnjOy768h30 */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C34218i.m132795a(this.f$0, bArr);
            }
        });
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: c */
    public Draft mo126557c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mo126768a(Collections.singletonList(str)).get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m132792a(com.ss.android.lark.dto.draft.Draft r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34218i.m132792a(com.ss.android.lark.dto.draft.Draft):java.lang.String");
    }

    /* renamed from: c */
    public void mo126770c(String str, Draft draft) {
        draft.chatId = str;
        draft.type = 0;
        m132792a(draft);
    }

    /* renamed from: d */
    public String mo126771d(String str, Draft draft) {
        draft.chatId = str;
        draft.type = 1;
        return m132792a(draft);
    }

    /* renamed from: a */
    public String mo126767a(String str, Draft draft) {
        draft.messageId = str;
        return m132792a(draft);
    }

    /* renamed from: b */
    private Draft m132797b(String str, int i) {
        Map<String, List<Draft>> c = m132801c();
        if (!CollectionUtils.isNotEmpty(c)) {
            return null;
        }
        for (List<Draft> list : c.values()) {
            Iterator<Draft> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Draft next = it.next();
                    if (next.type == i && TextUtils.equals(next.messageId, str)) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public String mo126769b(String str, Draft draft) {
        draft.type = 3;
        draft.messageId = str;
        return m132792a(draft);
    }

    /* renamed from: a */
    private Map<String, Draft> m132794a(List<String> list, int i) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        Map<String, List<Draft>> b = m132798b();
        if (CollectionUtils.isNotEmpty(b)) {
            for (String str : list) {
                List<Draft> list2 = b.get(str);
                if (list2 != null) {
                    for (Draft draft : list2) {
                        if (!(draft == null || draft.type != i || draft.chatId == null)) {
                            hashMap.put(draft.chatId, draft);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m132795a(List list, byte[] bArr) throws IOException {
        HashMap hashMap = new HashMap();
        GetDraftsResponse decode = GetDraftsResponse.ADAPTER.decode(bArr);
        if (!(decode == null || decode.entity == null)) {
            C14928Entity entity = decode.entity;
            Map<String, Draft> a = C57319i.m222113a(entity.drafts);
            C33982a a2 = C57306b.m222058a(entity, false, "DraftService::getDraftByIds");
            Map<String, Message> b = C57322k.m222132b(entity);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Draft draft = a.get(str);
                String str2 = draft.messageId;
                if (!TextUtils.isEmpty(str2)) {
                    Message message = b.get(str2);
                    draft.message = message;
                    if (message != null) {
                        draft.sender = a2.mo124892a(message.getChatId(), message.getFromId());
                    }
                }
                if (draft != null) {
                    hashMap.put(str, draft);
                }
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34124e
    /* renamed from: a */
    public void mo126553a(String str, int i) {
        Draft draft = m132794a(Collections.singletonList(str), i).get(str);
        if (draft != null) {
            m132799b(draft);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m132796a(java.lang.String r3, java.lang.String r4, com.ss.android.lark.chat.entity.chat.Chat r5, java.lang.String r6, com.ss.android.lark.widget.richtext.RichText r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34218i.m132796a(java.lang.String, java.lang.String, com.ss.android.lark.chat.entity.chat.Chat, java.lang.String, com.ss.android.lark.widget.richtext.RichText, boolean):void");
    }

    /* renamed from: b */
    private void m132800b(String str, String str2, Chat chat, RichText richText, String str3, RichText richText2, boolean z) {
        C32821b a = C32821b.m126120a();
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!C59035h.m229210a(richText)) {
                Draft draft = new Draft();
                draft.contentRichText = richText;
                mo126770c(str2, draft);
            } else if (chat == null) {
                mo126775g(str2);
            } else {
                Log.m165389i("DraftService", "removeChatTextDraft:" + chat.getTextDraftId());
                mo126774f(chat.getTextDraftId());
            }
            if (!TextUtils.isEmpty(str3) || !C59035h.m229210a(richText2)) {
                Draft draft2 = new Draft();
                draft2.title = str3;
                draft2.postRichText = richText2;
                mo126771d(str2, draft2);
            } else if (chat == null) {
                mo126776h(str2);
            } else {
                Log.m165389i("DraftService", "removeChatPostDraft:" + chat.getPostDraftId());
                mo126774f(chat.getPostDraftId());
            }
            a.mo121134b(str2, "");
        } else if (!TextUtils.isEmpty(str)) {
            if (C59035h.m229210a(richText)) {
                mo126772d(str);
                if (z) {
                    a.mo121134b(str2, "");
                }
            } else {
                Draft draft3 = new Draft();
                draft3.contentRichText = richText;
                String a2 = mo126767a(str, draft3);
                if (z) {
                    a.mo121134b(str2, a2);
                }
            }
            if (!TextUtils.isEmpty(str3) || !C59035h.m229210a(richText2)) {
                Draft draft4 = new Draft();
                draft4.postRichText = richText2;
                mo126769b(str, draft4);
                return;
            }
            mo126773e(str);
        }
    }
}
