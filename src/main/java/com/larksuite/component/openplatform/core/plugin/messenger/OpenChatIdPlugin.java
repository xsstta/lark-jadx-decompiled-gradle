package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.common.service.net.C67852a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OpenChatIdPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin$a */
    public interface AbstractC25082a {
        /* renamed from: a */
        void mo88190a(int i, String str);

        /* renamed from: a */
        void mo88191a(List<Messenger.ChatInfo> list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin$b */
    public interface AbstractC25083b {
        /* renamed from: a */
        void mo88185a(int i, String str);

        /* renamed from: a */
        void mo88186a(String str);

        /* renamed from: a */
        void mo88187a(Map<String, String> map, List<String> list);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"chatIdsToOpenChatIds"})
    public void chatIds2OpenChatIds(final AbstractC25897h<Messenger.ChatIdsToOpenChatIdsResponse> hVar, Messenger.ChatIdsToOpenChatIdsRequest chatIdsToOpenChatIdsRequest, final LKEvent lKEvent) {
        final Messenger.ChatIdsToOpenChatIdsResponse chatIdsToOpenChatIdsResponse = new Messenger.ChatIdsToOpenChatIdsResponse();
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        HashMap<String, String> hashMap = new HashMap<>();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        OPTrace a2 = lKEvent.mo92134c().mo92188a();
        if (a2 != null) {
            a2.setRequestId(C12805d.m52897b(getEventContext(lKEvent)));
        }
        chatIds2OpenChatIds(hashMap, chatIdsToOpenChatIdsRequest.mChats, new AbstractC25082a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250795 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25082a
            /* renamed from: a */
            public void mo88191a(List<Messenger.ChatInfo> list) {
                if (list == null) {
                    chatIdsToOpenChatIdsResponse.mErrorMessage = "invalid params";
                    chatIdsToOpenChatIdsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    hVar.callback(chatIdsToOpenChatIdsResponse);
                    lKEvent.mo92134c().mo92190b().mo92223e("OpenChatIdPlugin", "invalid params");
                    return;
                }
                chatIdsToOpenChatIdsResponse.mChatInfos = list;
                hVar.callback(chatIdsToOpenChatIdsResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25082a
            /* renamed from: a */
            public void mo88190a(int i, String str) {
                chatIdsToOpenChatIdsResponse.mErrorMessage = str;
                chatIdsToOpenChatIdsResponse.mErrorCode = i;
                hVar.callback(chatIdsToOpenChatIdsResponse);
                lKEvent.mo92134c().mo92190b().mo92223e("OpenChatIdPlugin", str);
            }
        }, getEventContext(lKEvent), a2, lKEvent.mo92146m());
    }

    @LKPluginFunction(async = true, eventName = {"openChatIdToChatId"})
    public void openChatId2ChatId(final AbstractC25897h<Messenger.OpenChatId2ChatIdResponse> hVar, Messenger.OpenChatIdToChatIdRequest openChatIdToChatIdRequest, LKEvent lKEvent, AbstractC25895f fVar) {
        final Messenger.OpenChatId2ChatIdResponse openChatId2ChatIdResponse = new Messenger.OpenChatId2ChatIdResponse();
        final String str = openChatIdToChatIdRequest.mOpenChatID;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "openChatId is empty!");
            openChatId2ChatIdResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            openChatId2ChatIdResponse.mErrorMessage = "invalid params";
            hVar.callback(openChatId2ChatIdResponse);
            return;
        }
        OPTrace a = fVar.mo92188a();
        if (a != null) {
            a.setRequestId(C12805d.m52897b(getEventContext(lKEvent)));
        }
        openChatIds2ChatIds(Arrays.asList(str), new AbstractC25083b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250751 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88186a(String str) {
                AppBrandLogger.m52829e("OpenChatIdPlugin", "onError:" + str);
                openChatId2ChatIdResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                openChatId2ChatIdResponse.mErrorMessage = str;
                hVar.callback(openChatId2ChatIdResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88185a(int i, String str) {
                openChatId2ChatIdResponse.mErrorCode = i;
                openChatId2ChatIdResponse.mErrorMessage = str;
                hVar.callback(openChatId2ChatIdResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88187a(Map<String, String> map, List<String> list) {
                if (map == null && list == null) {
                    openChatId2ChatIdResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    openChatId2ChatIdResponse.mErrorMessage = "invalid params";
                    hVar.callback(openChatId2ChatIdResponse);
                    return;
                }
                if (map == null || !map.containsKey(str)) {
                    openChatId2ChatIdResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    openChatId2ChatIdResponse.mErrorMessage = "request error";
                } else {
                    openChatId2ChatIdResponse.mChatId = map.get(str);
                }
                hVar.callback(openChatId2ChatIdResponse);
            }
        }, getEventContext(lKEvent), a, lKEvent.mo92146m());
    }

    @LKPluginFunction(async = true, eventName = {"openChatIdsToChatIds"})
    public void openChatIds2ChatIds(final AbstractC25897h<Messenger.OpenChatIds2ChatIdsResponse> hVar, final Messenger.OpenChatIdsToChatIdsRequest openChatIdsToChatIdsRequest, LKEvent lKEvent, AbstractC25895f fVar) {
        final Messenger.OpenChatIds2ChatIdsResponse openChatIds2ChatIdsResponse = new Messenger.OpenChatIds2ChatIdsResponse();
        if (openChatIdsToChatIdsRequest.mOpenChatIds == null || openChatIdsToChatIdsRequest.mOpenChatIds.isEmpty()) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "openChatIds is empty!");
            openChatIds2ChatIdsResponse.mErrorMessage = "openChatIds empty.";
            hVar.callback(openChatIds2ChatIdsResponse);
            return;
        }
        OPTrace a = fVar.mo92188a();
        if (a != null) {
            a.setRequestId(C12805d.m52897b(getEventContext(lKEvent)));
        }
        openChatIds2ChatIds(openChatIdsToChatIdsRequest.mOpenChatIds, new AbstractC25083b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250762 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88186a(String str) {
                openChatIds2ChatIdsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                openChatIds2ChatIdsResponse.mErrorMessage = str;
                hVar.callback(openChatIds2ChatIdsResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88185a(int i, String str) {
                openChatIds2ChatIdsResponse.mErrorMessage = str;
                openChatIds2ChatIdsResponse.mErrorCode = i;
                hVar.callback(openChatIds2ChatIdsResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.AbstractC25083b
            /* renamed from: a */
            public void mo88187a(Map<String, String> map, List<String> list) {
                if (map == null && list == null) {
                    openChatIds2ChatIdsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    openChatIds2ChatIdsResponse.mErrorMessage = "invalid params";
                    hVar.callback(openChatIds2ChatIdsResponse);
                    return;
                }
                for (String str : openChatIdsToChatIdsRequest.mOpenChatIds) {
                    if (map == null) {
                        openChatIds2ChatIdsResponse.mFailedOpenChatIds.add(str);
                    } else {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            openChatIds2ChatIdsResponse.mFailedOpenChatIds.add(str);
                        } else {
                            openChatIds2ChatIdsResponse.mChatIds.add(str2);
                        }
                    }
                }
                hVar.callback(openChatIds2ChatIdsResponse);
            }
        }, getEventContext(lKEvent), a, lKEvent.mo92146m());
    }

    private void openChatIds2ChatIds(final List<String> list, final AbstractC25083b bVar, IAppContext iAppContext, OPTrace oPTrace, String str) {
        if (bVar == null) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "callback is null");
        } else if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "chatIds is null");
            bVar.mo88187a((Map<String, String>) null, (List<String>) null);
        } else {
            IdTransformer.f35273a.mo49672a(list, iAppContext, oPTrace, str, new Function1<String, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250773 */

                /* renamed from: a */
                public Unit invoke(String str) {
                    try {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
                        if (optJSONObject == null) {
                            AppBrandLogger.m52829e("OpenChatIdPlugin", "jsonObject is null: " + str);
                            bVar.mo88186a("request service error, chatIds is empty.");
                            return Unit.INSTANCE;
                        }
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : list) {
                            String string = optJSONObject.getString(str2);
                            if (TextUtils.isEmpty(string)) {
                                arrayList.add(str2);
                            } else {
                                hashMap.put(str2, string);
                            }
                        }
                        bVar.mo88187a(hashMap, arrayList);
                        return Unit.INSTANCE;
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("OpenChatIdPlugin", "JSONException", e);
                        bVar.mo88185a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg());
                    }
                }
            }, new Function1<Throwable, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250784 */

                /* renamed from: a */
                public Unit invoke(Throwable th) {
                    AppBrandLogger.m52829e("OpenChatIdPlugin", "request error", th);
                    bVar.mo88186a("server error");
                    return null;
                }
            });
        }
    }

    private void chatIds2OpenChatIds(HashMap<String, String> hashMap, List<Messenger.ChatRequest> list, final AbstractC25082a aVar, IAppContext iAppContext, TracingCoreSpan tracingCoreSpan, String str) {
        if (aVar == null) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "callback is null");
        } else if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e("OpenChatIdPlugin", "chats is null");
            aVar.mo88191a(null);
        } else {
            final HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Messenger.ChatRequest chatRequest = list.get(i);
                String str2 = chatRequest.mChatId;
                String str3 = chatRequest.mType;
                if (chatRequest.mIsBot) {
                    str3 = "2";
                }
                chatRequest.mType = str3;
                hashMap2.put(str2, chatRequest);
                arrayList.add(chatRequest);
            }
            IdTransformer.f35273a.mo49670a(hashMap, arrayList, new Function1<String, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250806 */

                /* renamed from: a */
                public Unit invoke(String str) {
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("openchatids");
                        Iterator<String> keys = jSONObject.keys();
                        ArrayList arrayList = new ArrayList();
                        while (keys.hasNext()) {
                            Messenger.ChatInfo chatInfo = new Messenger.ChatInfo();
                            String next = keys.next();
                            JSONObject optJSONObject = jSONObject.optJSONObject(next);
                            String optString = optJSONObject.optString("open_chat_id");
                            String optString2 = optJSONObject.optString("chat_name");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("chat_i18n_names");
                            JSONArray optJSONArray = optJSONObject.optJSONArray("chat_avatar_urls");
                            Messenger.ChatRequest chatRequest = (Messenger.ChatRequest) hashMap2.get(next);
                            if (chatRequest != null) {
                                String str2 = chatRequest.mType;
                                boolean z = chatRequest.mIsBot;
                                chatInfo.mName = optString2;
                                if (optJSONObject2 != null) {
                                    chatInfo.mI18nNames = JSON.parseObject(optJSONObject2.toString());
                                }
                                if (optJSONArray != null) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        chatInfo.mAvatarUrls.add(optJSONArray.getString(i));
                                    }
                                }
                                chatInfo.mId = optString;
                                if (String.valueOf(0).equals(str2)) {
                                    chatInfo.mChatType = 0;
                                    chatInfo.mUserType = 0;
                                } else if (String.valueOf(1).equals(str2)) {
                                    chatInfo.mChatType = 1;
                                } else if (String.valueOf(2).equals(str2)) {
                                    chatInfo.mChatType = 0;
                                    chatInfo.mUserType = 1;
                                }
                                arrayList.add(chatInfo);
                            } else {
                                AppBrandLogger.m52829e("OpenChatIdPlugin", "can not find item");
                            }
                        }
                        aVar.mo88191a(arrayList);
                    } catch (Exception unused) {
                        aVar.mo88190a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg());
                        AppBrandLogger.m52829e("OpenChatIdPlugin", SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg());
                    }
                    return Unit.INSTANCE;
                }
            }, new Function1<Throwable, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenChatIdPlugin.C250817 */

                /* renamed from: a */
                public Unit invoke(Throwable th) {
                    AppBrandLogger.m52829e("OpenChatIdPlugin", "request error", th);
                    aVar.mo88190a(ApiCode.GENERAL_UNKONW_ERROR.code, "server error");
                    return null;
                }
            }, iAppContext, new C67852a(), tracingCoreSpan, str);
        }
    }
}
