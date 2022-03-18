package com.ss.android.lark.forward.impl.parser;

import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J#\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u0004*\u0002H\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/forward/impl/parser/FeedPreviewParser;", "Lcom/ss/android/lark/forward/impl/parser/IFeedPreviewParser;", "()V", "parseFromFeed", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "feedPreview", "Lcom/ss/android/lark/forward/dto/FeedSourceData;", "addCommonParams", "T", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/forward/dto/FeedSourceData;)Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.b.a */
public final class FeedPreviewParser {
    /* renamed from: a */
    public SearchBaseInfo mo140964a(C38389a aVar) {
        Chatter.ChatterType chatterType;
        if (aVar == null) {
            return null;
        }
        if (aVar.mo140696o()) {
            SearchBaseInfo a = m151529a(new SearchThreadInfo(), aVar);
            SearchThreadInfo searchThreadInfo = (SearchThreadInfo) a;
            searchThreadInfo.setId(aVar.mo140681g());
            searchThreadInfo.setChannel(new Channel(Channel.Type.CHAT, aVar.mo140698q()));
            searchThreadInfo.setSubTitle(aVar.mo140669c());
            return a;
        } else if (aVar.mo140689j() == Chat.Type.P2P) {
            SearchBaseInfo a2 = m151529a(new SearchChatterInfo(), aVar);
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) a2;
            searchChatterInfo.setId(aVar.mo140666b());
            searchChatterInfo.setRegistered(!aVar.mo140700s().contains(Tag.UNACTIVATED));
            searchChatterInfo.setP2pChatId(aVar.mo140681g());
            if (aVar.mo140665a()) {
                chatterType = Chatter.ChatterType.BOT;
            } else {
                chatterType = Chatter.ChatterType.USER;
            }
            searchChatterInfo.setChatterType(chatterType);
            AbstractC38365a a3 = C38364a.m151054a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "ForwardModule.getDependency()");
            searchChatterInfo.zenMode(a3.mo140450l().mo140513a(aVar.mo140695n()));
            searchChatterInfo.setStatusIconKey(aVar.mo140701t());
            return a2;
        } else if (aVar.mo140689j() != Chat.Type.GROUP && aVar.mo140689j() != Chat.Type.TOPIC_GROUP) {
            return null;
        } else {
            SearchBaseInfo a4 = m151529a(new SearchChatInfo(), aVar);
            SearchChatInfo searchChatInfo = (SearchChatInfo) a4;
            searchChatInfo.setId(aVar.mo140681g());
            searchChatInfo.setMember(true);
            searchChatInfo.setChatType(aVar.mo140689j());
            searchChatInfo.setUserCount(aVar.mo140699r());
            searchChatInfo.setChatMode(aVar.mo140691k());
            searchChatInfo.setDepartment(aVar.mo140694m());
            searchChatInfo.setTenant(aVar.mo140693l());
            searchChatInfo.setSecretChat(aVar.mo140674d());
            searchChatInfo.setOfficialOnCall(aVar.mo140697p());
            searchChatInfo.setCrossTenant(aVar.mo140677e());
            searchChatInfo.setTags(aVar.mo140700s());
            searchChatInfo.setCountLightStyle(true);
            return a4;
        }
    }

    /* renamed from: a */
    private final <T extends SearchBaseInfo> T m151529a(T t, C38389a aVar) {
        t.setScene(Scene.Type.TRANSMIT_MESSAGES);
        t.setTitle(aVar.mo140687i());
        t.setAvatarKey(aVar.mo140684h());
        t.setCrossTenant(aVar.mo140677e());
        t.setCrossWithKa(aVar.mo140680f());
        return t;
    }
}
