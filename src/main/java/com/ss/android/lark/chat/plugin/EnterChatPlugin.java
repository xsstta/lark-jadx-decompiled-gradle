package com.ss.android.lark.chat.plugin;

import android.text.TextUtils;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.optrace.api.ILogger;

public class EnterChatPlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public void gotoChat(ChatBundle chatBundle, AbstractC25905b bVar, AbstractC25897h<Messenger.EnterChatResponse> hVar) {
        C35228b.m137564a().mo121114a(bVar.mo92207a(), chatBundle);
        if (DesktopUtil.m144307b()) {
            AbstractC36504r K = C29990c.m110930b().mo134512K();
            if (!TextUtils.isEmpty(chatBundle.f74027a)) {
                K.mo134694b(chatBundle.f74027a);
            } else if (!TextUtils.isEmpty(chatBundle.f74028b)) {
                K.mo134694b(chatBundle.f74028b);
            }
        }
        hVar.callback(new Messenger.EnterChatResponse());
    }

    @LKPluginFunction(async = true, eventName = {"enterChat"})
    public void enterChat(Messenger.EnterChatRequest enterChatRequest, final AbstractC25905b bVar, AbstractC25895f fVar, final AbstractC25897h<Messenger.EnterChatResponse> hVar) {
        final Messenger.EnterChatResponse enterChatResponse = new Messenger.EnterChatResponse();
        String str = enterChatRequest.mOpenChatId;
        final boolean z = enterChatRequest.mNeedBadge;
        String str2 = enterChatRequest.mOpenId;
        String str3 = enterChatRequest.mChatterId;
        final String str4 = enterChatRequest.mAppIdentify;
        final ILogger b = fVar.mo92190b();
        if (!TextUtils.isEmpty(str2)) {
            b.mo92224i("ChatPlugin", "enter chat by openId");
            Messenger.OpenIdToChatIdRequest openIdToChatIdRequest = new Messenger.OpenIdToChatIdRequest();
            openIdToChatIdRequest.mOpenId = str2;
            bVar.mo92209a("openIdToChatId", openIdToChatIdRequest, new AbstractC25897h<Messenger.OpenIdToChatIdResponse>() {
                /* class com.ss.android.lark.chat.plugin.EnterChatPlugin.C340741 */

                /* renamed from: a */
                public void callback(Messenger.OpenIdToChatIdResponse openIdToChatIdResponse) {
                    if (openIdToChatIdResponse == null) {
                        EnterChatPlugin.this.fillFailedResponse(enterChatResponse, C25906a.f64080j, "openId to ChatId error");
                        hVar.callback(enterChatResponse);
                    } else if (openIdToChatIdResponse.mErrorCode != Integer.MIN_VALUE) {
                        enterChatResponse.mErrorCode = openIdToChatIdResponse.mErrorCode;
                        enterChatResponse.mErrorMessage = openIdToChatIdResponse.mErrorMessage;
                        hVar.callback(enterChatResponse);
                    } else {
                        EnterChatPlugin.this.gotoChat(ChatBundle.m109259a().mo105927a(openIdToChatIdResponse.mChatId).mo105935d(str4).mo105934c(z).mo105929a(), bVar, hVar);
                    }
                }
            }, Messenger.OpenIdToChatIdResponse.class);
        } else if (!TextUtils.isEmpty(str)) {
            b.mo92224i("ChatPlugin", "enter chat by openChatId");
            Messenger.OpenChatIdToChatIdRequest openChatIdToChatIdRequest = new Messenger.OpenChatIdToChatIdRequest();
            openChatIdToChatIdRequest.mOpenChatID = str;
            bVar.mo92209a("openChatIdToChatId", openChatIdToChatIdRequest, new AbstractC25897h<Messenger.OpenChatId2ChatIdResponse>() {
                /* class com.ss.android.lark.chat.plugin.EnterChatPlugin.C340752 */

                /* renamed from: a */
                public void callback(Messenger.OpenChatId2ChatIdResponse openChatId2ChatIdResponse) {
                    if (openChatId2ChatIdResponse == null) {
                        b.mo92224i("ChatPlugin", "result is null");
                        EnterChatPlugin.this.fillFailedResponse(enterChatResponse, C25906a.f64080j, "result is null");
                        hVar.callback(enterChatResponse);
                    } else if (openChatId2ChatIdResponse.mErrorCode != Integer.MIN_VALUE) {
                        ILogger aVar = b;
                        aVar.mo92224i("ChatPlugin", "errorCode:" + openChatId2ChatIdResponse.mErrorCode + " errorMsg:" + openChatId2ChatIdResponse.mErrorMessage);
                        enterChatResponse.mErrorCode = openChatId2ChatIdResponse.mErrorCode;
                        enterChatResponse.mErrorMessage = openChatId2ChatIdResponse.mErrorMessage;
                        hVar.callback(enterChatResponse);
                    } else {
                        EnterChatPlugin.this.gotoChat(ChatBundle.m109259a().mo105927a(openChatId2ChatIdResponse.mChatId).mo105935d(str4).mo105934c(z).mo105923a(ChatBundle.SourceType.PROFILE).mo105929a(), bVar, hVar);
                    }
                }
            }, Messenger.OpenChatId2ChatIdResponse.class);
        } else if (!TextUtils.isEmpty(str3)) {
            b.mo92224i("ChatPlugin", "enter chat by chatterId");
            gotoChat(ChatBundle.m109259a().mo105931b(str3).mo105935d(str4).mo105934c(z).mo105929a(), bVar, hVar);
        } else {
            b.mo92223e("ChatPlugin", "openChatId and openId 、chatterId is empty.");
            fillFailedResponse(enterChatResponse, C25906a.f64080j, "openChatId and openId 、chatterId is empty");
            hVar.callback(enterChatResponse);
        }
    }
}
