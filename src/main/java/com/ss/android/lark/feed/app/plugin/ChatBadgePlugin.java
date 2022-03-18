package com.ss.android.lark.feed.app.plugin;

import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.biz.im.api.AbstractC29616i;
import com.ss.android.lark.biz.im.api.C29608b;
import com.ss.android.lark.feed.app.model.C37668a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatBadgePlugin extends AbstractC25889a {
    public Map<String, Integer> mBadgeCountCache = new ConcurrentHashMap();
    private Map<String, AbstractC29616i> mBadgeWatchMap = new ConcurrentHashMap();

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        for (String str : this.mBadgeWatchMap.keySet()) {
            unRegisterChatBadge(str, null);
        }
        this.mBadgeWatchMap.clear();
        this.mBadgeCountCache.clear();
    }

    private void unRegisterChatBadge(String str, AbstractC25895f fVar) {
        AbstractC29616i remove = this.mBadgeWatchMap.remove(str);
        if (remove != null) {
            if (fVar != null) {
                ILogger b = fVar.mo92190b();
                b.mo92224i("ChatBadgePlugin", "success unRegister:" + str);
            } else {
                Log.m165389i("ChatBadgePlugin", "unRegister:" + str);
            }
            C37668a.m148111a().mo138104b(str, remove);
        }
    }

    private void registerChatBadge(String str, final AbstractC25905b bVar, final AbstractC25895f fVar) {
        if (!this.mBadgeWatchMap.containsKey(str)) {
            C377991 r0 = new AbstractC29616i() {
                /* class com.ss.android.lark.feed.app.plugin.ChatBadgePlugin.C377991 */

                @Override // com.ss.android.lark.biz.im.api.AbstractC29616i
                /* renamed from: a */
                public void mo106724a(String str, C29608b bVar) {
                    Integer num = ChatBadgePlugin.this.mBadgeCountCache.get(str);
                    if (num == null || num.intValue() != bVar.mo106690b()) {
                        ILogger b = fVar.mo92190b();
                        b.mo92224i("ChatBadgePlugin", "feedId:" + str + " badge:" + bVar.toString());
                        Messenger.ChatBadgeChangeResponse chatBadgeChangeResponse = new Messenger.ChatBadgeChangeResponse();
                        chatBadgeChangeResponse.mChatId = str;
                        chatBadgeChangeResponse.mBadge = bVar.mo106690b();
                        chatBadgeChangeResponse.mIsRemind = bVar.mo106689a();
                        bVar.mo92214a("onChatBadgeChangeWithChatId", chatBadgeChangeResponse);
                    }
                    ChatBadgePlugin.this.mBadgeCountCache.put(str, Integer.valueOf(bVar.mo106690b()));
                }
            };
            C37668a.m148111a().mo138102a(str, r0);
            this.mBadgeWatchMap.put(str, r0);
        }
    }

    @LKPluginFunction(async = true, eventName = {"internalOffChatBadgeChange"})
    public void unRegisterChatBadgeListener(Messenger.ChatBadgeRequest chatBadgeRequest, AbstractC25895f fVar, AbstractC25897h<Messenger.ChatBadgeResponse> hVar) {
        Messenger.ChatBadgeResponse chatBadgeResponse = new Messenger.ChatBadgeResponse();
        ILogger b = fVar.mo92190b();
        b.mo92224i("ChatBadgePlugin", "unRegister chatId:" + chatBadgeRequest.mChatIds.toString());
        for (String str : chatBadgeRequest.mChatIds) {
            unRegisterChatBadge(str, fVar);
        }
        hVar.callback(chatBadgeResponse);
    }

    @LKPluginFunction(async = true, eventName = {"internalOnChatBadgeChange"})
    public void registerChatBadgeListener(Messenger.ChatBadgeRequest chatBadgeRequest, AbstractC25905b bVar, AbstractC25895f fVar, AbstractC25897h<Messenger.ChatBadgeResponse> hVar) {
        Messenger.ChatBadgeResponse chatBadgeResponse = new Messenger.ChatBadgeResponse();
        ILogger b = fVar.mo92190b();
        b.mo92224i("ChatBadgePlugin", "register chatId:" + chatBadgeRequest.mChatIds.toString());
        for (String str : chatBadgeRequest.mChatIds) {
            registerChatBadge(str, bVar, fVar);
        }
        hVar.callback(chatBadgeResponse);
    }
}
