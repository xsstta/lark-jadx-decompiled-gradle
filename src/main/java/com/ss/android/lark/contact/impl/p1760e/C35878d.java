package com.ss.android.lark.contact.impl.p1760e;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.contact.v1.GetContactsCombineChatResponse;
import com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoResponse;
import com.bytedance.lark.pb.contact.v2.GetNamecardListResponse;
import com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsResponse;
import com.bytedance.lark.pb.contact.v2.NamecardMetaInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.C35392a;
import com.ss.android.lark.contact.impl.contacts_email.entity.GetBusinessCardResult;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.e.d */
public class C35878d {

    /* renamed from: a */
    static AbstractC35361b.AbstractC35367f f92801a;

    /* renamed from: b */
    static IChatterParser f92802b;

    /* renamed from: c */
    static IChatParser f92803c = f92801a.mo130194a();

    static {
        AbstractC35361b.AbstractC35367f j = C35358a.m138143a().mo130165j();
        f92801a = j;
        f92802b = j.mo130202b();
    }

    /* renamed from: a */
    public static C35392a m140606a(GetNamecardListResponse getNamecardListResponse) {
        if (getNamecardListResponse == null) {
            Log.m165383e("ModelParserResponse", "response is null");
            return null;
        }
        C35392a aVar = new C35392a();
        aVar.mo130368a(getNamecardListResponse.more.booleanValue());
        aVar.mo130366a(getNamecardListResponse.namecard_id);
        ArrayList arrayList = new ArrayList();
        if (getNamecardListResponse.list == null) {
            return aVar;
        }
        for (int i = 0; i < getNamecardListResponse.list.size(); i++) {
            arrayList.add(m140607a(getNamecardListResponse.list.get(i)));
        }
        aVar.mo130367a(arrayList);
        return aVar;
    }

    /* renamed from: a */
    public static GetBusinessCardResult m140607a(NamecardMetaInfo namecardMetaInfo) {
        GetBusinessCardResult.Phone aVar = null;
        if (namecardMetaInfo == null) {
            Log.m165397w("ModelParserResponse", "parseNamecardMetaInfo failed, namecardMetaInfo is null");
            return null;
        }
        GetBusinessCardResult bVar = new GetBusinessCardResult();
        bVar.mo131010a(namecardMetaInfo.namecard_id);
        bVar.mo131012b(namecardMetaInfo.name);
        bVar.mo131014c(namecardMetaInfo.company_name);
        bVar.mo131016d(namecardMetaInfo.title);
        if (namecardMetaInfo.phone != null) {
            aVar = new GetBusinessCardResult.Phone(namecardMetaInfo.phone.district_number, namecardMetaInfo.phone.phone_number, namecardMetaInfo.phone.region_code);
        }
        bVar.mo131008a(aVar);
        bVar.mo131018e(namecardMetaInfo.email);
        bVar.mo131020f(namecardMetaInfo.group);
        bVar.mo131022g(namecardMetaInfo.extra);
        bVar.mo131024h(namecardMetaInfo.avatar_key);
        bVar.mo131009a(namecardMetaInfo.is_custom_avatar);
        return bVar;
    }

    /* renamed from: a */
    public static AbstractC35936a.C35939c m140609a(GetContactsCombineChatResponse getContactsCombineChatResponse) {
        C14928Entity entity = getContactsCombineChatResponse.entity;
        Map<String, Chat> chatMap = f92803c.getChatMap(entity.chats);
        Map<String, Chatter> chatterMapFromEntity = f92802b.getChatterMapFromEntity(entity);
        Map<String, String> a = C35879e.m140611a(entity.tenants);
        List<ExternalContact> a2 = C35877c.m140604a(getContactsCombineChatResponse.contacts);
        boolean booleanValue = getContactsCombineChatResponse.has_more.booleanValue();
        AbstractC35936a.C35939c cVar = new AbstractC35936a.C35939c();
        cVar.mo132225a(chatMap);
        cVar.mo132229b(chatterMapFromEntity);
        cVar.mo132231c(a);
        cVar.mo132224a(a2);
        if (CollectionUtils.isNotEmpty(getContactsCombineChatResponse.in_chat_chatter_ids)) {
            cVar.mo132226a(new HashSet(getContactsCombineChatResponse.in_chat_chatter_ids));
        }
        cVar.mo132227a(booleanValue);
        if (getContactsCombineChatResponse.auth_result != null) {
            cVar.mo132233d(getContactsCombineChatResponse.auth_result.denied_reasons);
        }
        return cVar;
    }

    /* renamed from: a */
    public static AbstractC35936a.C35939c m140610a(GetExternContactsCombineAuthInfoResponse getExternContactsCombineAuthInfoResponse) {
        C14928Entity entity = getExternContactsCombineAuthInfoResponse.entity;
        Map<String, Chat> chatMap = f92803c.getChatMap(entity.chats);
        Map<String, Chatter> chatterMapFromEntity = f92802b.getChatterMapFromEntity(entity);
        Map<String, String> a = C35879e.m140611a(entity.tenants);
        List<ExternalContact> b = C35877c.m140605b(getExternContactsCombineAuthInfoResponse.contacts);
        boolean booleanValue = getExternContactsCombineAuthInfoResponse.has_more.booleanValue();
        AbstractC35936a.C35939c cVar = new AbstractC35936a.C35939c();
        cVar.mo132225a(chatMap);
        cVar.mo132229b(chatterMapFromEntity);
        cVar.mo132231c(a);
        cVar.mo132224a(b);
        cVar.mo132233d(getExternContactsCombineAuthInfoResponse.id2denied_reason);
        if (CollectionUtils.isNotEmpty(getExternContactsCombineAuthInfoResponse.in_chat_chatter_ids)) {
            cVar.mo132226a(new HashSet(getExternContactsCombineAuthInfoResponse.in_chat_chatter_ids));
        }
        cVar.mo132227a(booleanValue);
        return cVar;
    }

    /* renamed from: a */
    public static GetBusinessCardResult m140608a(String str, GetNamecardsByIDsResponse getNamecardsByIDsResponse) {
        if (getNamecardsByIDsResponse != null && getNamecardsByIDsResponse.namecards != null && !TextUtils.isEmpty(str)) {
            return m140607a(getNamecardsByIDsResponse.namecards.get(str));
        }
        Log.m165383e("ModelParserResponse", "parseGetNamecardsByIDsResponse failed");
        return null;
    }
}
