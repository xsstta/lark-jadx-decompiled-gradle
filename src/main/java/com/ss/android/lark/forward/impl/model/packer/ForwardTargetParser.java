package com.ss.android.lark.forward.impl.model.packer;

import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ThreadTarget;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/forward/impl/model/packer/ForwardTargetParser;", "", "()V", "chat2Target", "Lcom/ss/android/lark/forward/dto/ForwardTarget;", "chat", "Lcom/ss/android/lark/chat/export/entity/chat/OpenChat;", "chatter2Target", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "searchInfo2Target", "searchBaseInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "searchInfo2UncertainTarget", "", "searchInfoList", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.model.b.b */
public final class ForwardTargetParser {

    /* renamed from: a */
    public static final ForwardTargetParser f98812a = new ForwardTargetParser();

    private ForwardTargetParser() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ForwardTarget m151567a(Chatter chatter) {
        return new ForwardTarget(chatter);
    }

    @JvmStatic
    /* renamed from: a */
    public static final ForwardTarget m151568a(OpenChat openChat) {
        return new ForwardTarget(openChat);
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<ForwardTarget> m151570a(List<? extends SearchBaseInfo> list) {
        ForwardTarget forwardTarget;
        Intrinsics.checkParameterIsNotNull(list, "searchInfoList");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if ((t instanceof SearchChatInfo) || (t instanceof SearchChatterInfo)) {
                forwardTarget = new ForwardTarget(t.getId(), t.getTitle(), t.getAvatarKey());
            } else if (t instanceof SearchThreadInfo) {
                T t2 = t;
                Channel channel = t2.getChannel();
                Intrinsics.checkExpressionValueIsNotNull(channel, "searchInfo.channel");
                forwardTarget = new ForwardTarget(channel.getId(), t2.getTitle(), t2.getAvatarKey());
            } else {
                forwardTarget = null;
            }
            if (forwardTarget != null) {
                arrayList.add(forwardTarget);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ForwardTarget m151569a(SearchBaseInfo searchBaseInfo) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "searchBaseInfo");
        ForwardTarget forwardTarget = null;
        if (searchBaseInfo instanceof SearchChatInfo) {
            Chat chat = new Chat();
            SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
            chat.setName(searchChatInfo.getTitle());
            chat.setId(searchChatInfo.getId());
            chat.setAvatarKey(searchChatInfo.getAvatarKey());
            chat.setType(Chat.Type.valueOf(searchChatInfo.getChatType().getNumber()));
            chat.setPublic(searchChatInfo.isPublic());
            chat.setIs_department(searchChatInfo.isDepartment());
            chat.setCrossTenant(searchBaseInfo.isCrossTenant());
            chat.setChatMode(Chat.ChatMode.valueOf(searchChatInfo.getChatMode().getNumber()));
            chat.setUserCount(searchChatInfo.getUserCount());
            chat.setMemberCount(searchChatInfo.getMemberCount());
            chat.setTenant(searchChatInfo.isTenant());
            ForwardTarget a = m151568a(chat);
            List<Tag> tags = searchChatInfo.getTags();
            if (tags != null) {
                z = tags.contains(Tag.BOT);
            } else {
                z = false;
            }
            a.mo140566a(z);
            return a;
        } else if (searchBaseInfo instanceof SearchChatterInfo) {
            Chatter chatter = new Chatter();
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
            chatter.setName(searchChatterInfo.getTitle());
            chatter.setId(searchChatterInfo.getId());
            chatter.setAvatarKey(searchChatterInfo.getAvatarKey());
            chatter.setType(Chatter.ChatterType.valueOf(searchChatterInfo.getChatterType().getNumber()));
            chatter.setDescription(searchChatterInfo.getChatterDescription());
            chatter.setRegistered(searchChatterInfo.isRegistered());
            chatter.setInContacts(searchChatterInfo.isInContacts());
            chatter.setCanJoinGroup(searchChatterInfo.isCanJoinGroup());
            chatter.setTenantId(searchChatterInfo.getTenantId());
            chatter.setZenModeEndTime(searchChatterInfo.getZenModeEndTime());
            ForwardTarget a2 = m151567a(chatter);
            a2.mo140566a(chatter.isBot());
            return a2;
        } else if (!(searchBaseInfo instanceof SearchThreadInfo)) {
            return forwardTarget;
        } else {
            SearchThreadInfo searchThreadInfo = (SearchThreadInfo) searchBaseInfo;
            String id = searchThreadInfo.getId();
            String title = searchThreadInfo.getTitle();
            String avatarKey = searchThreadInfo.getAvatarKey();
            Channel channel = searchThreadInfo.getChannel();
            Intrinsics.checkExpressionValueIsNotNull(channel, "searchBaseInfo.channel");
            return new ForwardTarget(new ThreadTarget(id, title, avatarKey, channel.getId()));
        }
    }
}
