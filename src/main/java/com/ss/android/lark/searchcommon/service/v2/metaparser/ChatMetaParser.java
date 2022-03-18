package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.search.v2.ChatMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/ChatMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/ChatMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.d */
public final class ChatMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184323a(ChatMeta chatMeta) {
        SearchChatInfo searchChatInfo;
        if (chatMeta != null) {
            searchChatInfo = new SearchChatInfo();
            Chat.Type type = chatMeta.type;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            searchChatInfo.setChatType(Chat.Type.forNumber(type.getValue()));
            Chat.ChatMode chatMode = chatMeta.mode;
            Intrinsics.checkExpressionValueIsNotNull(chatMode, "it.mode");
            searchChatInfo.setChatMode(Chat.ChatMode.forNumber(chatMode.getValue()));
            Integer num = chatMeta.user_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.user_count");
            searchChatInfo.setUserCount(num.intValue());
            Boolean bool = chatMeta.is_remind;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_remind");
            searchChatInfo.setRemind(bool.booleanValue());
            Boolean bool2 = chatMeta.is_department;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "it.is_department");
            searchChatInfo.setDepartment(bool2.booleanValue());
            Boolean bool3 = chatMeta.is_tenant;
            Intrinsics.checkExpressionValueIsNotNull(bool3, "it.is_tenant");
            searchChatInfo.setTenant(bool3.booleanValue());
            Boolean bool4 = chatMeta.is_delayed;
            Intrinsics.checkExpressionValueIsNotNull(bool4, "it.is_delayed");
            searchChatInfo.setDelayed(bool4.booleanValue());
            Boolean bool5 = chatMeta.is_cross_tenant;
            Intrinsics.checkExpressionValueIsNotNull(bool5, "it.is_cross_tenant");
            searchChatInfo.setCrossTenant(bool5.booleanValue());
            Boolean bool6 = chatMeta.is_crypto;
            Intrinsics.checkExpressionValueIsNotNull(bool6, "it.is_crypto");
            searchChatInfo.setSecretChat(bool6.booleanValue());
            Boolean bool7 = chatMeta.is_public_v2;
            Intrinsics.checkExpressionValueIsNotNull(bool7, "it.is_public_v2");
            searchChatInfo.setPublic(bool7.booleanValue());
            Boolean bool8 = chatMeta.is_member;
            Intrinsics.checkExpressionValueIsNotNull(bool8, "it.is_member");
            searchChatInfo.setMember(bool8.booleanValue());
            Boolean bool9 = chatMeta.is_official_oncall;
            Intrinsics.checkExpressionValueIsNotNull(bool9, "it.is_official_oncall");
            searchChatInfo.setOfficialOnCall(bool9.booleanValue());
            List<Tag> list = chatMeta.tags;
            Intrinsics.checkExpressionValueIsNotNull(list, "it.tags");
            searchChatInfo.setTags(CollectionsKt.toMutableList((Collection) list));
            Boolean bool10 = chatMeta.is_meeting;
            Intrinsics.checkExpressionValueIsNotNull(bool10, "it.is_meeting");
            searchChatInfo.setIsMeeting(bool10.booleanValue());
            Boolean bool11 = chatMeta.is_cross_with_ka;
            Intrinsics.checkExpressionValueIsNotNull(bool11, "it.is_cross_with_ka");
            searchChatInfo.setCrossWithKa(bool11.booleanValue());
            Boolean bool12 = chatMeta.enabled_email;
            Intrinsics.checkExpressionValueIsNotNull(bool12, "it.enabled_email");
            searchChatInfo.setEnabledEmail(bool12.booleanValue());
        } else {
            searchChatInfo = null;
        }
        return searchChatInfo;
    }
}
