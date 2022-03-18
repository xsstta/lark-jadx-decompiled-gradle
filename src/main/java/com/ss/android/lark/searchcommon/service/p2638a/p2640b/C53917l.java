package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchCryptoP2PChatMeta;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.searchcommon.dto.info.SearchSecretP2PChatInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.l */
public class C53917l extends AbstractC53906a<SearchSecretP2PChatInfo, SearchCryptoP2PChatMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchSecretP2PChatInfo mo184290a() {
        return new SearchSecretP2PChatInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchSecretP2PChatInfo searchSecretP2PChatInfo, SearchCryptoP2PChatMeta searchCryptoP2PChatMeta) {
        searchSecretP2PChatInfo.setChatterType(Chatter.ChatterType.forNumber(searchCryptoP2PChatMeta.type.getValue()));
        searchSecretP2PChatInfo.setChatterDescription(new ChatterDescription(searchCryptoP2PChatMeta.description, ChatterDescription.Type.valueOf(searchCryptoP2PChatMeta.description_flag.getValue())));
        searchSecretP2PChatInfo.setTenantId(searchCryptoP2PChatMeta.tenant_id);
        searchSecretP2PChatInfo.setWithBotTag(searchCryptoP2PChatMeta.with_bot_tag);
        searchSecretP2PChatInfo.setRegistered(searchCryptoP2PChatMeta.is_registered.booleanValue());
        searchSecretP2PChatInfo.setCanJoinGroup(searchCryptoP2PChatMeta.can_join_group.booleanValue());
        searchSecretP2PChatInfo.setInContacts(searchCryptoP2PChatMeta.in_contacts.booleanValue());
        searchSecretP2PChatInfo.setChatterId(searchCryptoP2PChatMeta.chatter_id);
    }
}
