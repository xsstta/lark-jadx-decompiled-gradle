package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class GetChatInfoPlugin extends OPPlugin {
    private IAppContext appContext;
    private AbstractC25905b bridgeContext;
    private Messenger.GetChatInfoRequest getChatInfoRequest;
    public Messenger.GetChatInfoResponse getChatInfoResponse;
    public AbstractC25897h<Messenger.GetChatInfoResponse> invokeCallback;
    public LKEvent lkEvent;
    public ILogger logger;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private void sendEvent2OpenChatIdToChatId(final boolean z) {
        Messenger.OpenChatIdsToChatIdsRequest openChatIdsToChatIdsRequest = new Messenger.OpenChatIdsToChatIdsRequest();
        openChatIdsToChatIdsRequest.mOpenChatIds = Arrays.asList(this.getChatInfoRequest.mOpenChatId);
        this.bridgeContext.mo92211a("openChatIdsToChatIds", openChatIdsToChatIdsRequest, this.appContext, new AbstractC25897h<Messenger.OpenChatIds2ChatIdsResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.GetChatInfoPlugin.C251301 */

            /* renamed from: a */
            public void callback(Messenger.OpenChatIds2ChatIdsResponse openChatIds2ChatIdsResponse) {
                if (openChatIds2ChatIdsResponse == null || openChatIds2ChatIdsResponse.mChatIds.isEmpty()) {
                    GetChatInfoPlugin getChatInfoPlugin = GetChatInfoPlugin.this;
                    getChatInfoPlugin.fillFailedResponse(getChatInfoPlugin.getChatInfoResponse, C25913h.f64150C, "result is null");
                    GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                    GetChatInfoPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("GetChatInfoPlugin", "OPEN_CHAT_IDS_TO_CHAT_IDS plugin result is null");
                    return;
                }
                String str = openChatIds2ChatIdsResponse.mChatIds.get(0);
                if (!TextUtils.isEmpty(str)) {
                    GetChatInfoPlugin.this.logger.mo92222d("GetChatInfoPlugin", "do GetChatInfoByChatId");
                    GetChatInfoPlugin.this.sendEvent2GetChatInfoByChatId(str, z);
                    return;
                }
                GetChatInfoPlugin getChatInfoPlugin2 = GetChatInfoPlugin.this;
                getChatInfoPlugin2.fillFailedResponse(getChatInfoPlugin2.getChatInfoResponse, C25913h.f64150C, "chatId is null");
                GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                GetChatInfoPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("GetChatInfoPlugin", "OPEN_CHAT_IDS_TO_CHAT_IDS plugin chatId is null");
            }
        }, Messenger.OpenChatIds2ChatIdsResponse.class);
    }

    public void sendEvent2GetChatInfoByChatId(final String str, final boolean z) {
        Messenger.GetChatInfoByChatIdRequest getChatInfoByChatIdRequest = new Messenger.GetChatInfoByChatIdRequest();
        getChatInfoByChatIdRequest.mChatId = Collections.singletonList(str);
        this.bridgeContext.mo92211a("getChatInfoByChatId", getChatInfoByChatIdRequest, this.appContext, new AbstractC25897h<Messenger.GetChatInfoByChatIdResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.GetChatInfoPlugin.C251312 */

            /* renamed from: a */
            public void callback(Messenger.GetChatInfoByChatIdResponse getChatInfoByChatIdResponse) {
                GetChatInfoPlugin.this.logger.mo92222d("GetChatInfoPlugin", "do ChatIdToOpenChatIds");
                GetChatInfoPlugin.this.sendEvent2ChatIdToOpenChatIds(getChatInfoByChatIdResponse, str, z);
            }
        }, Messenger.GetChatInfoByChatIdResponse.class);
    }

    public void sendEvent2ChatIdToOpenChatIds(final Messenger.GetChatInfoByChatIdResponse getChatInfoByChatIdResponse, final String str, final boolean z) {
        boolean z2 = true;
        if (this.getChatInfoRequest.mUserType != 1) {
            z2 = false;
        }
        Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest = new Messenger.ChatIdsToOpenChatIdsRequest();
        Messenger.ChatRequest chatRequest = new Messenger.ChatRequest();
        chatRequest.mType = String.valueOf(this.getChatInfoRequest.mChatType);
        chatRequest.mChatId = str;
        chatRequest.mIsBot = z2;
        chatIdsToOpenChatIdsRequest.mChats = Collections.singletonList(chatRequest);
        this.bridgeContext.mo92211a("chatIdsToOpenChatIds", chatIdsToOpenChatIdsRequest, this.appContext, new AbstractC25897h<Messenger.ChatIdsToOpenChatIdsResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.GetChatInfoPlugin.C251323 */

            /* renamed from: a */
            public void callback(Messenger.ChatIdsToOpenChatIdsResponse chatIdsToOpenChatIdsResponse) {
                if (chatIdsToOpenChatIdsResponse == null || chatIdsToOpenChatIdsResponse.mChatInfos.isEmpty()) {
                    GetChatInfoPlugin getChatInfoPlugin = GetChatInfoPlugin.this;
                    getChatInfoPlugin.fillFailedResponse(getChatInfoPlugin.getChatInfoResponse, C25913h.f64150C, "result is null");
                    GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                    GetChatInfoPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("GetChatInfoPlugin", "OPEN_CHAT_IDS_TO_CHAT_IDS plugin result is null");
                    return;
                }
                Messenger.ChatInfo chatInfo = chatIdsToOpenChatIdsResponse.mChatInfos.get(0);
                Messenger.GetChatInfoByChatIdResponse getChatInfoByChatIdResponse = getChatInfoByChatIdResponse;
                if (getChatInfoByChatIdResponse != null || !getChatInfoByChatIdResponse.chatInfos.isEmpty()) {
                    HashMap<String, Messenger.GetChatInfo> hashMap = getChatInfoByChatIdResponse.chatInfos.get(0);
                    if (hashMap == null || hashMap.get(str) == null) {
                        GetChatInfoPlugin getChatInfoPlugin2 = GetChatInfoPlugin.this;
                        getChatInfoPlugin2.fillFailedResponse(getChatInfoPlugin2.getChatInfoResponse, C25913h.f64150C, "chatId in null");
                        GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                        GetChatInfoPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("GetChatInfoPlugin", "get chat info by chat id result is null");
                        return;
                    }
                    Messenger.GetChatInfo getChatInfo = hashMap.get(str);
                    GetChatInfoPlugin.this.getChatInfoResponse.mBadge = getChatInfo.mBadge;
                    GetChatInfoPlugin.this.getChatInfoResponse.mAtCount = getChatInfo.mAtCount;
                    if (z) {
                        GetChatInfoPlugin.this.getChatInfoResponse.mAvatarUrls = chatInfo.mAvatarUrls;
                        GetChatInfoPlugin.this.getChatInfoResponse.mName = chatInfo.mName;
                        GetChatInfoPlugin.this.getChatInfoResponse.mI18nNames = chatInfo.mI18nNames;
                    }
                    GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                    return;
                }
                GetChatInfoPlugin getChatInfoPlugin3 = GetChatInfoPlugin.this;
                getChatInfoPlugin3.fillFailedResponse(getChatInfoPlugin3.getChatInfoResponse, C25913h.f64150C, "get chat info by chat id response is null");
                GetChatInfoPlugin.this.invokeCallback.callback(GetChatInfoPlugin.this.getChatInfoResponse);
                GetChatInfoPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("GetChatInfoPlugin", "get chat info by chat id response is null");
            }
        }, Messenger.ChatIdsToOpenChatIdsResponse.class);
    }

    @LKPluginFunction(async = true, eventName = {"getChatInfo"})
    public void getChatInfo(AbstractC25897h<Messenger.GetChatInfoResponse> hVar, Messenger.GetChatInfoRequest getChatInfoRequest2, LKEvent lKEvent) {
        IAppContext eventContext = getEventContext(lKEvent);
        this.getChatInfoResponse = new Messenger.GetChatInfoResponse();
        ILogger b = lKEvent.mo92134c().mo92190b();
        this.logger = b;
        if (eventContext == null) {
            b.mo92223e("GetChatInfoPlugin", "appContext is null");
            fillFailedResponse(this.getChatInfoResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(this.getChatInfoResponse);
            return;
        }
        this.invokeCallback = hVar;
        this.appContext = eventContext;
        this.getChatInfoRequest = getChatInfoRequest2;
        this.lkEvent = lKEvent;
        boolean a = ((AbstractC67734b) eventContext.findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(lKEvent.mo92146m(), "chatInfo", a, getAppContext());
        if (getChatInfoRequest2 == null || TextUtils.isEmpty(getChatInfoRequest2.mOpenChatId) || getChatInfoRequest2.mChatType == -1) {
            this.logger.mo92223e("GetChatInfoPlugin", "params empty");
            fillFailedResponse(this.getChatInfoResponse, C25906a.f64072b, "params invalid");
            hVar.callback(this.getChatInfoResponse);
            return;
        }
        ILogger aVar = this.logger;
        aVar.mo92224i("GetChatInfoPlugin", "params: " + getChatInfoRequest2.toString());
        AbstractC25905b d = lKEvent.mo92136d();
        this.bridgeContext = d;
        if (d == null) {
            this.logger.mo92223e("GetChatInfoPlugin", "bridgeContext is null");
            fillFailedResponse(this.getChatInfoResponse, C25906a.f64080j, "bridgeContext is null");
            hVar.callback(this.getChatInfoResponse);
            return;
        }
        try {
            this.logger.mo92222d("GetChatInfoPlugin", "do openChatIdToChatId");
            sendEvent2OpenChatIdToChatId(a);
        } catch (Exception e) {
            fillFailedResponse(this.getChatInfoResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(this.getChatInfoResponse);
            ILogger b2 = lKEvent.mo92134c().mo92190b();
            b2.mo92223e("GetChatInfoPlugin", "OPEN_CHAT_IDS_TO_CHAT_IDS plugin " + e.getMessage());
        }
    }
}
