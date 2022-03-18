package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41300b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class ChooseChatPlugin extends OPPlugin {
    public ChooseChatRequest chooseChatRequest;
    public ChooseChatResponse chooseChatResponse;
    public AbstractC25897h<ChooseChatResponse> invokeCallback;
    private AbstractC25905b lkBridgeContext;
    public LKEvent lkEvent;
    private IAppContext mAppContext;
    private long startTime;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class ChooseChat {
        @JSONField(name = "avatarUrls")
        public List<String> mAvatarUrls;
        @JSONField(name = "chatType")
        public int mChatType;
        @JSONField(name = "i18nNames")
        public JSONObject mI18nNames;
        @JSONField(name = "id")
        public String mId;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "userType")
        public int mUserType;

        ChooseChat() {
        }
    }

    /* access modifiers changed from: private */
    public static class ChooseChatResponse extends C25921b {
        private ChooseChatResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class SendMessageCardResponse extends ChooseChatResponse {
        @JSONField(name = "send_preview_card_response")
        public JSONObject mSendMessageCardJs;

        private SendMessageCardResponse() {
            super();
        }
    }

    /* access modifiers changed from: private */
    public static class ChooseChatInfoResponse extends ChooseChatResponse {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public List<Object> mChooseChatResult = new ArrayList();
        @JSONField(name = "message")
        public String mMessage;

        public ChooseChatInfoResponse() {
            super();
        }
    }

    /* access modifiers changed from: private */
    public static class ChooseChatRequest extends C25920a {
        @JSONField(name = "allowCreateGroup")
        public boolean mAllowCreateGroup = true;
        @JSONField(name = "cardJSON")
        public JSONObject mCardJSON;
        @JSONField(name = "confirmDesc")
        public String mConfirmDesc = "";
        @JSONField(name = "confirmTitle")
        public String mConfirmTitle;
        @JSONField(name = "externalChat")
        public boolean mExternalChat = true;
        @JSONField(name = "ignoreBot")
        public boolean mIgnoreBot;
        @JSONField(name = "ignoreSelf")
        public boolean mIgnoreSelf;
        @JSONField(name = "multiSelect")
        public boolean mMultiSelect;
        @JSONField(name = "selectType")
        public int mSelectType;
        @JSONField(name = "showMessageInput")
        public boolean mShowMessageInput;

        private ChooseChatRequest() {
        }
    }

    private void logE(Object... objArr) {
        LKEvent lKEvent = this.lkEvent;
        if (lKEvent != null) {
            lKEvent.mo92134c().mo92190b().mo92223e("ChooseChatPlugin", objArr);
        }
    }

    private void openLarkChooseChat(Activity activity, ChooseChatRequest chooseChatRequest2) {
        Bundle bundle = new Bundle();
        String string = activity.getResources().getString(R.string.lark_brand_choose_chat_confirm);
        try {
            if (TextUtils.isEmpty(chooseChatRequest2.mConfirmTitle)) {
                chooseChatRequest2.mConfirmTitle = string;
            }
            bundle.putBoolean("allowCreateGroup", chooseChatRequest2.mAllowCreateGroup);
            bundle.putBoolean("multiSelect", chooseChatRequest2.mMultiSelect);
            bundle.putBoolean("ignoreSelf", chooseChatRequest2.mIgnoreSelf);
            bundle.putBoolean("ignoreBot", chooseChatRequest2.mIgnoreBot);
            bundle.putBoolean("externalChat", chooseChatRequest2.mExternalChat);
            bundle.putBoolean("showMessageInput", chooseChatRequest2.mShowMessageInput);
            bundle.putInt("selectType", chooseChatRequest2.mSelectType);
            bundle.putString("confirmTitle", chooseChatRequest2.mConfirmTitle);
            bundle.putString("confirmDesc", chooseChatRequest2.mConfirmDesc);
            if (chooseChatRequest2.mCardJSON != null) {
                bundle.putSerializable("cardJSON", chooseChatRequest2.mCardJSON.toJSONString());
                bundle.putString("appId", this.mAppContext.getAppId());
            }
            C41300b.m163749a(bundle, this.mAppContext);
        } catch (Exception e) {
            C13377u.m54424d("fail", System.currentTimeMillis() - this.startTime, e.getMessage(), this.mAppContext);
            fillFailedResponse(this.chooseChatResponse, C25906a.f64080j, e.getMessage());
            this.invokeCallback.callback(this.chooseChatResponse);
            logE("parse params exception", e);
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i == 20009) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("result");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    boolean a = ((AbstractC67734b) this.mAppContext.findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
                        JSONArray optJSONArray = jSONObject.optJSONArray("choose_chat_result");
                        if (optJSONArray != null) {
                            Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest = new Messenger.ChatIdsToOpenChatIdsRequest();
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                Messenger.ChatRequest chatRequest = new Messenger.ChatRequest();
                                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                chatRequest.mChatId = optJSONObject.optString("id");
                                int optInt = optJSONObject.optInt("chatType");
                                boolean optBoolean = optJSONObject.optBoolean("isBot");
                                if (optBoolean) {
                                    optInt = 2;
                                }
                                chatRequest.mIsBot = optBoolean;
                                chatRequest.mType = String.valueOf(optInt);
                                arrayList.add(chatRequest);
                            }
                            chatIdsToOpenChatIdsRequest.mChats = arrayList;
                            if (this.lkBridgeContext != null) {
                                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("send_message_card_result");
                                String str = "";
                                if (jSONObject.has("message")) {
                                    str = jSONObject.optString("message");
                                }
                                sendEvent2ChatIdToOpenChatIds(this.lkBridgeContext, chatIdsToOpenChatIdsRequest, a, getEventContext(this.lkEvent), optJSONObject2, str);
                            }
                            return true;
                        }
                    } catch (JSONException e) {
                        logE("JSONException", e);
                    }
                    logE("result is null");
                    fillFailedResponse(this.chooseChatResponse, C25913h.f64151D, "result is null");
                    this.invokeCallback.callback(this.chooseChatResponse);
                    logE("choose chat result key error");
                }
            } else if (i2 == 0) {
                logE("choose chat user cancel");
                fillFailedResponse(this.chooseChatResponse, C25906a.f64073c, "resultCode = RESULT_CANCELED");
                this.invokeCallback.callback(this.chooseChatResponse);
            } else {
                logE("data is null");
                fillFailedResponse(this.chooseChatResponse, C25913h.f64151D, "data is null");
                this.invokeCallback.callback(this.chooseChatResponse);
            }
        }
        return true;
    }

    @LKPluginFunction(async = true, eventName = {"chooseChat"})
    public void ChooseChat(LKEvent lKEvent, ChooseChatRequest chooseChatRequest2, AbstractC25905b bVar, AbstractC25897h<ChooseChatResponse> hVar) {
        this.mAppContext = getEventContext(lKEvent);
        this.chooseChatResponse = new ChooseChatResponse();
        this.invokeCallback = hVar;
        this.lkEvent = lKEvent;
        this.chooseChatRequest = chooseChatRequest2;
        this.lkBridgeContext = bVar;
        this.startTime = System.currentTimeMillis();
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("ChooseChatPlugin", "AppContextKey:" + this.mAppContext.getAppId());
        boolean a = ((AbstractC67734b) this.mAppContext.findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(lKEvent.mo92146m(), "chatInfo", a, this.mAppContext);
        AppBrandLogger.m52830i("ChooseChatPlugin", "chatInfo permission has granted " + a);
        openLarkChooseChat(this.mAppContext.getCurrentActivity(), chooseChatRequest2);
    }

    private void sendEvent2ChatIdToOpenChatIds(AbstractC25905b bVar, Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest, final boolean z, IAppContext iAppContext, final org.json.JSONObject jSONObject, final String str) {
        if (iAppContext == null) {
            logE("appContext is null");
            fillFailedResponse(this.chooseChatResponse, C25906a.f64080j, "appContext is null");
            this.invokeCallback.callback(this.chooseChatResponse);
            return;
        }
        bVar.mo92211a("chatIdsToOpenChatIds", chatIdsToOpenChatIdsRequest, iAppContext, new AbstractC25897h<Messenger.ChatIdsToOpenChatIdsResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.ChooseChatPlugin.C251291 */

            /* renamed from: a */
            public void callback(Messenger.ChatIdsToOpenChatIdsResponse chatIdsToOpenChatIdsResponse) {
                if (jSONObject == null) {
                    ChooseChatPlugin.this.lkEvent.mo92134c().mo92190b().mo92224i("ChooseChatPlugin", "from chooseChat");
                    if (chatIdsToOpenChatIdsResponse == null || chatIdsToOpenChatIdsResponse.mChatInfos.isEmpty()) {
                        ChooseChatPlugin chooseChatPlugin = ChooseChatPlugin.this;
                        chooseChatPlugin.fillFailedResponse(chooseChatPlugin.chooseChatResponse, C25906a.f64080j, "result is null");
                        ChooseChatPlugin.this.invokeCallback.callback(ChooseChatPlugin.this.chooseChatResponse);
                        ChooseChatPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("ChooseChatPlugin", "result is null");
                        return;
                    }
                    ChooseChatInfoResponse chooseChatInfoResponse = new ChooseChatInfoResponse();
                    for (Messenger.ChatInfo chatInfo : chatIdsToOpenChatIdsResponse.mChatInfos) {
                        ChooseChat chooseChat = new ChooseChat();
                        chooseChat.mId = chatInfo.mId;
                        chooseChat.mChatType = chatInfo.mChatType;
                        chooseChat.mUserType = chatInfo.mUserType;
                        if (z) {
                            chooseChat.mAvatarUrls = chatInfo.mAvatarUrls;
                            chooseChat.mI18nNames = chatInfo.mI18nNames;
                            chooseChat.mName = chatInfo.mName;
                        }
                        if (chooseChat.mChatType != 0) {
                            JSONObject jSONObject = (JSONObject) JSON.toJSON(chooseChat);
                            jSONObject.remove("userType");
                            chooseChatInfoResponse.mChooseChatResult.add(jSONObject);
                        } else {
                            chooseChatInfoResponse.mChooseChatResult.add(chooseChat);
                        }
                    }
                    if (ChooseChatPlugin.this.chooseChatRequest.mShowMessageInput) {
                        chooseChatInfoResponse.mMessage = str;
                    }
                    ChooseChatPlugin.this.invokeCallback.callback(chooseChatInfoResponse);
                    return;
                }
                ChooseChatPlugin.this.lkEvent.mo92134c().mo92190b().mo92224i("ChooseChatPlugin", "from sendMessageCard");
                SendMessageCardResponse sendMessageCardResponse = new SendMessageCardResponse();
                sendMessageCardResponse.mSendMessageCardJs = JSON.parseObject(jSONObject.toString());
                ChooseChatPlugin.this.invokeCallback.callback(sendMessageCardResponse);
            }
        }, Messenger.ChatIdsToOpenChatIdsResponse.class);
    }
}
