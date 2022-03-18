package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.LKFireEvent;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

public class LarkChatBadgeChangePlugin extends OPPlugin {
    public final Map<String, String> WATCH_MAP = new HashMap();

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public int priority() {
        return 1;
    }

    private static class ChatBadgeChangeRequest extends C25920a {
        @JSONField(name = "openChatId")
        @LKRequiredParam
        public String mOpenChatId;

        private ChatBadgeChangeRequest() {
        }
    }

    private static class OnChatBadgeChangeResponse extends C25921b {
        @JSONField(name = "badge")
        public int mBadge;
        @JSONField(name = "openChatId")
        public String mOpenChatId;

        private OnChatBadgeChangeResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class RegisterAndUnRegisterChatBadgeResponse extends C25921b {
        private RegisterAndUnRegisterChatBadgeResponse() {
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("fireEvent");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if (!"fireEvent".equals(lKEvent.mo92146m())) {
            return super.handleEvent(lKEvent);
        }
        AbstractC25905b d = lKEvent.mo92136d();
        ILogger b = lKEvent.mo92134c().mo92190b();
        JSONObject n = lKEvent.mo92147n();
        if (n != null) {
            LKFireEvent.Request request = (LKFireEvent.Request) JSON.parseObject(n.toString(), LKFireEvent.Request.class);
            if ("onChatBadgeChangeWithChatId".equals(request.mAction)) {
                Messenger.ChatBadgeChangeResponse chatBadgeChangeResponse = (Messenger.ChatBadgeChangeResponse) JSON.toJavaObject(request.mData, Messenger.ChatBadgeChangeResponse.class);
                if (chatBadgeChangeResponse != null) {
                    for (String str : this.WATCH_MAP.keySet()) {
                        String str2 = this.WATCH_MAP.get(str);
                        if (str2 == null || !str2.equals(chatBadgeChangeResponse.mChatId)) {
                            b.mo92223e("LarkApiOnChatBadgeChang", "chatId is null");
                        } else {
                            OnChatBadgeChangeResponse onChatBadgeChangeResponse = new OnChatBadgeChangeResponse();
                            onChatBadgeChangeResponse.mBadge = chatBadgeChangeResponse.mBadge;
                            onChatBadgeChangeResponse.mOpenChatId = str;
                            d.mo92214a("chatBadgeChangeObserved", onChatBadgeChangeResponse);
                            return super.handleEvent(lKEvent);
                        }
                    }
                } else {
                    b.mo92223e("LarkApiOnChatBadgeChang", "fire event response is error");
                }
            }
        }
        return lKEvent.mo92155v();
    }

    @LKPluginFunction(async = true, eventName = {"offChatBadgeChange"})
    public void offChatBadgeChange(ChatBadgeChangeRequest chatBadgeChangeRequest, AbstractC25905b bVar, AbstractC25895f fVar, final AbstractC25897h<C25921b> hVar) {
        String str = this.WATCH_MAP.get(chatBadgeChangeRequest.mOpenChatId);
        if (!TextUtils.isEmpty(str)) {
            fVar.mo92190b().mo92224i("LarkApiOnChatBadgeChang", "off chat badge");
            Messenger.ChatBadgeRequest chatBadgeRequest = new Messenger.ChatBadgeRequest();
            chatBadgeRequest.mChatIds.add(str);
            C25921b bVar2 = (C25921b) bVar.mo92209a("internalOffChatBadgeChange", chatBadgeRequest, new AbstractC25897h<C25921b>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkChatBadgeChangePlugin.C250743 */

                /* renamed from: a */
                public void callback(C25921b bVar) {
                    hVar.callback(bVar);
                }
            }, C25921b.class);
            if (!bVar2.isCease()) {
                hVar.callback(bVar2);
            }
        }
    }

    @LKPluginFunction(async = true, eventName = {"onChatBadgeChange"})
    public void onChatBadgeChange(ChatBadgeChangeRequest chatBadgeChangeRequest, final AbstractC25905b bVar, final AbstractC25895f fVar, final AbstractC25897h<RegisterAndUnRegisterChatBadgeResponse> hVar) {
        final RegisterAndUnRegisterChatBadgeResponse registerAndUnRegisterChatBadgeResponse = new RegisterAndUnRegisterChatBadgeResponse();
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a("onChatBadgeChange", "chatInfo", a, getAppContext());
        fVar.mo92190b().mo92224i("LarkApiOnChatBadgeChang", "chatInfo permission has granted $hasChatInfoPermission");
        if (a) {
            final String str = chatBadgeChangeRequest.mOpenChatId;
            if (!TextUtils.isEmpty(str)) {
                OPTrace a2 = fVar.mo92188a();
                if (a2 != null) {
                    a2.setRequestId(C12805d.m52897b(getAppContext()));
                }
                IdTransformer.f35273a.mo49669a(str, getAppContext(), a2, "onChatBadgeChange", new Function1<String, Unit>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkChatBadgeChangePlugin.C250711 */

                    /* renamed from: a */
                    public Unit invoke(String str) {
                        try {
                            JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
                            String str2 = "";
                            if (optJSONObject != null) {
                                str2 = optJSONObject.optString(str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                LarkChatBadgeChangePlugin.this.WATCH_MAP.put(str, str2);
                                Messenger.ChatBadgeRequest chatBadgeRequest = new Messenger.ChatBadgeRequest();
                                chatBadgeRequest.mChatIds.add(str2);
                                if (!((C25921b) bVar.mo92209a("internalOnChatBadgeChange", chatBadgeRequest, new AbstractC25897h<C25921b>() {
                                    /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkChatBadgeChangePlugin.C250711.C250721 */

                                    /* renamed from: a */
                                    public void callback(C25921b bVar) {
                                        if (bVar != null && bVar.mErrorCode == Integer.MIN_VALUE) {
                                            registerAndUnRegisterChatBadgeResponse.mErrorCode = bVar.mErrorCode;
                                            registerAndUnRegisterChatBadgeResponse.mErrorMessage = bVar.mErrorMessage;
                                        }
                                        hVar.callback(registerAndUnRegisterChatBadgeResponse);
                                    }
                                }, C25921b.class)).isCease()) {
                                    LarkChatBadgeChangePlugin.this.fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64080j, "do not cease");
                                    hVar.callback(registerAndUnRegisterChatBadgeResponse);
                                } else {
                                    ILogger b = fVar.mo92190b();
                                    b.mo92224i("LarkApiOnChatBadgeChang", "send register chat badge listener. chatId:" + str2);
                                }
                                return Unit.INSTANCE;
                            }
                            LarkChatBadgeChangePlugin.this.fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64080j, "chat id is empty");
                            fVar.mo92190b().mo92223e("LarkApiOnChatBadgeChang", "chat id is empty");
                            hVar.callback(registerAndUnRegisterChatBadgeResponse);
                            return Unit.INSTANCE;
                        } catch (JSONException e) {
                            LarkChatBadgeChangePlugin.this.fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64080j, e.getMessage());
                            fVar.mo92190b().mo92223e("LarkApiOnChatBadgeChang", "JSONException", e);
                        }
                    }
                }, new Function1<Throwable, Unit>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkChatBadgeChangePlugin.C250732 */

                    /* renamed from: a */
                    public Unit invoke(Throwable th) {
                        LarkChatBadgeChangePlugin.this.fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64080j, th.getMessage());
                        hVar.callback(registerAndUnRegisterChatBadgeResponse);
                        return null;
                    }
                });
                return;
            }
            fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64072b, "open chat id is empty");
            hVar.callback(registerAndUnRegisterChatBadgeResponse);
            return;
        }
        fillFailedResponse(registerAndUnRegisterChatBadgeResponse, C25906a.f64072b, "no chatInfo authorization");
        hVar.callback(registerAndUnRegisterChatBadgeResponse);
    }
}
