package com.bytedance.ee.larkbrand.hostbridge.p655a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.SendPreviewCardRequest;
import com.bytedance.lark.pb.openplatform.v1.SendPreviewCardResponse;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.k */
public class C13097k implements AbstractC67728b {
    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "send_preview_card";
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "sendpreview data is null");
            aVar.mo49530a(null);
            return;
        }
        final List<String> g = crossProcessDataEntity.mo234750g("chat_ids");
        String b = crossProcessDataEntity.mo234744b("card_key");
        final String b2 = crossProcessDataEntity.mo234744b("leave_message");
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "SEND_PREVIEW_CARD chatIds:" + g + " cardKey:" + b);
        if (g == null || g.isEmpty() || TextUtils.isEmpty(b)) {
            aVar.mo49530a(null);
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.SEND_PREVIEW_CARD, new SendPreviewCardRequest.C18705a().mo64350a(g).mo64349a(b).mo64348a(SendPreviewCardRequest.SendCardVersion.v2), new IGetDataCallback<SendPreviewCardResponse>() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13097k.C130981 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "SEND_PREVIEW_CARD onError" + errorResult);
                aVar.mo49530a(null);
            }

            /* renamed from: a */
            public void onSuccess(SendPreviewCardResponse sendPreviewCardResponse) {
                if (sendPreviewCardResponse == null) {
                    onError(new ErrorResult("response is null"));
                    return;
                }
                Map<String, SendPreviewCardResponse.SendCardInfo> map = sendPreviewCardResponse.send_card_infos;
                if (map == null) {
                    onError(new ErrorResult("status is null"));
                    return;
                }
                List<AbstractC13322k.C13325c> list = null;
                if (!TextUtils.isEmpty(b2)) {
                    list = LarkExtensionManager.getInstance().getExtension().mo49595a(g, b2);
                }
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "SEND_PREVIEW_CARD onSuccess" + map);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("failedChatIds", jSONArray);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONObject.put("sendCardInfo", jSONArray2);
                    for (Map.Entry<String, SendPreviewCardResponse.SendCardInfo> entry : map.entrySet()) {
                        SendPreviewCardResponse.SendCardInfo value = entry.getValue();
                        if (value.status.intValue() < 0) {
                            jSONArray.put(value.open_chat_id);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("openChatId", value.open_chat_id);
                        jSONObject2.put("openMessageId", value.open_message_id);
                        jSONObject2.put(UpdateKey.STATUS, value.status);
                        jSONArray2.put(jSONObject2);
                    }
                    if (!CollectionUtils.isEmpty(list)) {
                        JSONArray jSONArray3 = new JSONArray();
                        JSONArray jSONArray4 = new JSONArray();
                        for (AbstractC13322k.C13325c cVar : list) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(UpdateKey.STATUS, cVar.f35210b);
                            if (cVar.f35210b != 0) {
                                jSONObject3.put(UpdateKey.STATUS, -1);
                                jSONArray4.put(cVar.f35209a);
                            }
                            jSONObject3.put("openChatId", map.get(cVar.f35209a).open_chat_id);
                            jSONObject3.put("additionalMessage", b2);
                            jSONArray3.put(jSONObject3);
                        }
                        jSONObject.put("additionalMessageInfo", jSONArray3);
                        jSONObject.put("failedLeaveMessageChatIds", jSONArray4);
                    }
                    AppBrandLogger.m52828d("GADGET_SENG_MSG", "sendPreviewCardResp to json " + jSONObject.toString());
                    aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234759a("send_preview_card_response", (Serializable) jSONObject.toString()).mo234763b());
                } catch (JSONException e) {
                    AppBrandLogger.eWithThrowable("GADGET_SENG_MSG", "process sendCardInfo", e);
                    onError(new ErrorResult("sendPreviewCardResp to json fail"));
                }
            }
        }, new SdkSender.IParser<SendPreviewCardResponse>() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13097k.C130992 */

            /* renamed from: a */
            public SendPreviewCardResponse parse(byte[] bArr) throws IOException {
                return SendPreviewCardResponse.ADAPTER.decode(bArr);
            }
        });
    }
}
