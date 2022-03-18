package com.bytedance.ee.larkbrand.hostbridge.p655a;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CardJsonToPBRequest;
import com.bytedance.lark.pb.openplatform.v1.CardJsonToPBResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.io.IOException;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.j */
public class C13094j implements AbstractC67728b {
    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "send_card_json_to_pb";
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "send cardjsontopb data is null");
            aVar.mo49530a(null);
            return;
        }
        String b = crossProcessDataEntity.mo234744b("app_id");
        String b2 = crossProcessDataEntity.mo234744b("chat_id");
        String b3 = crossProcessDataEntity.mo234744b("card_json");
        AppBrandLogger.m52830i("GADGET_SENG_MSG", "CARD_JSON_TO_PB appid:" + b + " chatId:" + b2 + "cardJson:" + b3);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            aVar.mo49530a(null);
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.CARD_JSON_TO_PB, new CardJsonToPBRequest.C18639a().mo64192b(b).mo64193c(b2).mo64190a(b3), new IGetDataCallback<CardJsonToPBResponse>() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13094j.C130951 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "CARD_JSON_TO_PB onError" + errorResult);
                aVar.mo49530a(null);
            }

            /* renamed from: a */
            public void onSuccess(CardJsonToPBResponse cardJsonToPBResponse) {
                if (cardJsonToPBResponse == null) {
                    onError(new ErrorResult("response is null"));
                    return;
                }
                AppBrandLogger.m52830i("GADGET_SENG_MSG", "CARD_JSON_TO_PB onSuccess");
                Bundle bundle = new Bundle();
                bundle.putString("send_card_json_to_pb_card_key", cardJsonToPBResponse.card_key);
                bundle.putByteArray("send_card_json_to_pb_card_content_bytes", CardContent.ADAPTER.encode(cardJsonToPBResponse.card_content));
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234758a("send_card_json_to_pb_response", (Parcelable) bundle).mo234763b());
            }
        }, new SdkSender.IParser<CardJsonToPBResponse>() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13094j.C130962 */

            /* renamed from: a */
            public CardJsonToPBResponse parse(byte[] bArr) throws IOException {
                return CardJsonToPBResponse.ADAPTER.decode(bArr);
            }
        });
    }
}
