package com.ss.android.lark.search.impl.p2592b.p2595c;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.search.impl.b.c.a */
public class C53344a {
    /* renamed from: a */
    public static PickChatViewData m206459a(Chat chat) {
        PickChatViewData pickChatViewData = new PickChatViewData();
        pickChatViewData.setId(chat.getId());
        pickChatViewData.setP2pChatterId(chat.getP2pChatterId());
        pickChatViewData.setBusinessId(chat.getId());
        pickChatViewData.setImageKey(chat.getAvatarKey());
        pickChatViewData.setName(chat.getName());
        pickChatViewData.setDescription(chat.getDescription());
        pickChatViewData.setNameHighLights(new ArrayList());
        pickChatViewData.setDescHighLights(new ArrayList());
        pickChatViewData.setChatType(chat.getType());
        int userCount = chat.getUserCount();
        if (userCount <= 0) {
            userCount = chat.getMemberCount();
        }
        pickChatViewData.setChatCount(userCount);
        pickChatViewData.setCrossTenant(chat.isCrossTenant());
        pickChatViewData.setCrossWithKa(chat.isCrossWithKa());
        pickChatViewData.setDepartment(chat.is_department());
        pickChatViewData.setTenant(chat.isTenant());
        return pickChatViewData;
    }

    /* renamed from: a */
    public static PickChatterViewData m206460a(Chatter chatter, String str, String str2, String str3) {
        PickChatterViewData pickChatterViewData = new PickChatterViewData();
        pickChatterViewData.setId(chatter.getId());
        pickChatterViewData.setBusinessId(str);
        pickChatterViewData.setP2pChatId(str);
        pickChatterViewData.setChatterDescription(chatter.getDescription());
        pickChatterViewData.setChatterType(chatter.getType());
        pickChatterViewData.setRegistered(chatter.getRegistered());
        pickChatterViewData.setImageKey(chatter.getAvatarKey());
        pickChatterViewData.setCrossTenant(!TextUtils.equals(chatter.getTenantId(), str2));
        pickChatterViewData.setName(str3);
        pickChatterViewData.setSelected(true);
        return pickChatterViewData;
    }
}
