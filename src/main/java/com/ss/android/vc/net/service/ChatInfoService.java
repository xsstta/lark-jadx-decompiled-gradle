package com.ss.android.vc.net.service;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.net.service.ChatInfoService;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

public class ChatInfoService {
    public static void getChatById(final String str, final GetChatInfoListener getChatInfoListener) {
        AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
        if (chatDependency == null) {
            C60700b.m235864f("ChatInfoService", "[getCHatById]", "dependency is null");
        } else {
            chatDependency.getChatById(str, new XIGetDataCallback<OpenChat>() {
                /* class com.ss.android.vc.net.service.ChatInfoService.C636041 */

                @XMethod
                public void onSuccess(OpenChat openChat) {
                    C26171w.m94675a(new Runnable(getChatInfoListener) {
                        /* class com.ss.android.vc.net.service.$$Lambda$ChatInfoService$1$eeRAPdYGQyc1EGNTM9tAnKkvx4U */
                        public final /* synthetic */ GetChatInfoListener f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            ChatInfoService.C636041.lambda$onSuccess$0(OpenChat.this, this.f$1);
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                @XMethod
                public void onError(ErrorResult errorResult) {
                    C60700b.m235864f("ChatInfoService", "[getChatByIdq]", "error = " + errorResult);
                    ChatInfo chatInfo = new ChatInfo();
                    chatInfo.setId(str);
                    chatInfo.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
                    chatInfo.setAvatarKey("");
                    GetChatInfoListener getChatInfoListener = getChatInfoListener;
                    if (getChatInfoListener != null) {
                        getChatInfoListener.onGetChatInfo(chatInfo);
                    }
                }

                static /* synthetic */ void lambda$onSuccess$0(OpenChat openChat, GetChatInfoListener getChatInfoListener) {
                    ChatInfo chatInfo = new ChatInfo();
                    chatInfo.setId(openChat.getId());
                    chatInfo.setName(openChat.getName());
                    chatInfo.setAvatarKey(openChat.getAvatarKey());
                    if (getChatInfoListener != null) {
                        getChatInfoListener.onGetChatInfo(chatInfo);
                    }
                }
            });
        }
    }
}
