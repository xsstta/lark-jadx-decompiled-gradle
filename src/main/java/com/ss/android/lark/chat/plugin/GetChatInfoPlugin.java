package com.ss.android.lark.chat.plugin;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesResponse;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.C57343d;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class GetChatInfoPlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private Chat getChatById(String str) {
        return C32821b.m126120a().mo120985a(str);
    }

    private int getAtMeCount(String str) {
        GetUnreadAtMessagesRequest.C17743a aVar = new GetUnreadAtMessagesRequest.C17743a();
        aVar.mo61931a(Collections.singletonList(str));
        int intValue = ((Integer) SdkSender.syncSend(Command.GET_UNREAD_AT_MESSAGES, aVar, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.plugin.$$Lambda$GetChatInfoPlugin$MiHLponCosGIkkton7fToQ2xAw */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return GetChatInfoPlugin.this.lambda$getAtMeCount$0$GetChatInfoPlugin(this.f$1, bArr);
            }
        })).intValue();
        Log.m165379d("ChatPlugin", "get AtMe by local is " + intValue);
        return intValue;
    }

    private int getBadge(String str) {
        Chat e = C32821b.m126120a().mo121056e(str);
        if (e == null) {
            Log.m165383e("ChatPlugin", "get chat by local is null");
            return 0;
        } else if (e.isThread()) {
            Log.m165379d("ChatPlugin", "get thread badge by local is " + e.getThreadUnReadBadgeCount());
            return e.getThreadUnReadBadgeCount();
        } else {
            Log.m165379d("ChatPlugin", "get message badge by local is " + e.getUnReadBadgeCount());
            return e.getUnReadBadgeCount();
        }
    }

    public /* synthetic */ Integer lambda$getAtMeCount$0$GetChatInfoPlugin(String str, byte[] bArr) throws IOException {
        return Integer.valueOf(parseUnreadAtMeMessageInfos(str, bArr));
    }

    private int parseUnreadAtMeMessageInfos(String str, byte[] bArr) throws IOException {
        boolean z;
        GetUnreadAtMessagesResponse decode = GetUnreadAtMessagesResponse.ADAPTER.decode(bArr);
        if (decode == null || decode.entity == null || decode.entity.messages == null) {
            Log.m165383e("ChatPlugin", "parse unread AtMe data is null");
            return 0;
        }
        int i = 0;
        for (Message message : decode.entity.messages.values()) {
            if (str.equals(message.chat_id)) {
                com.ss.android.lark.chat.entity.message.Message a = new C57343d().mo120945a(decode.entity, message.id);
                if (a != null) {
                    if (a.isFromMe() || (!a.isAtAll() && !a.isOtherAtMe())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        i++;
                    }
                }
            } else {
                Log.m165383e("ChatPlugin", "chat id is not find,unread AtMe count is 0");
            }
        }
        return i;
    }

    @LKPluginFunction(async = true, eventName = {"getChatInfoByChatId"})
    public void getChatInfoByChatId(AbstractC25897h<Messenger.GetChatInfoByChatIdResponse> hVar, Messenger.GetChatInfoByChatIdRequest getChatInfoByChatIdRequest) {
        Messenger.GetChatInfoByChatIdResponse getChatInfoByChatIdResponse = new Messenger.GetChatInfoByChatIdResponse();
        try {
            HashMap<String, Messenger.GetChatInfo> hashMap = new HashMap<>();
            for (String str : getChatInfoByChatIdRequest.mChatId) {
                Messenger.GetChatInfo getChatInfo = new Messenger.GetChatInfo();
                getChatInfo.mBadge = getBadge(str);
                getChatInfo.mAtCount = getAtMeCount(str);
                getChatInfoByService(str, getChatInfoByChatIdResponse, getChatInfo);
                hashMap.put(str, getChatInfo);
            }
            getChatInfoByChatIdResponse.chatInfos.add(hashMap);
            hVar.callback(getChatInfoByChatIdResponse);
        } catch (Exception e) {
            Log.m165383e("ChatPlugin", "get chat is error " + e.getMessage());
            getChatInfoByChatIdResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
            getChatInfoByChatIdResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            hVar.callback(getChatInfoByChatIdResponse);
        }
    }

    private void getChatInfoByService(String str, Messenger.GetChatInfoByChatIdResponse getChatInfoByChatIdResponse, Messenger.GetChatInfo getChatInfo) {
        Chat chatById = getChatById(str);
        if (chatById != null) {
            AbstractC36474h b = C29990c.m110930b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(b.mo134531a(chatById.getAvatarKey(), Integer.MIN_VALUE, Integer.MIN_VALUE));
            arrayList.add(b.mo134531a(chatById.getAvatarKey(), 240, 240));
            arrayList.add(b.mo134531a(chatById.getAvatarKey(), Integer.MAX_VALUE, Integer.MAX_VALUE));
            getChatInfo.mAvatarUrls = arrayList;
            getChatInfo.mName = chatById.getName();
            Log.m165379d("ChatPlugin", "get chat info by chatId success");
            return;
        }
        Log.m165383e("ChatPlugin", "get chat from service is null");
        getChatInfoByChatIdResponse.mFailChatIds.add(str);
    }
}
