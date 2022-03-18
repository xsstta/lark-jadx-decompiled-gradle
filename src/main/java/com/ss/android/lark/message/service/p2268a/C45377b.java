package com.ss.android.lark.message.service.p2268a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PutActionRequest;
import com.bytedance.lark.pb.im.v1.PutActionResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.message.card.C45278a;
import com.ss.android.lark.message.service.dto.C45380a;
import com.ss.android.lark.message.service.dto.C45381b;
import com.ss.android.lark.message.service.dto.CardActionMethodType;
import com.ss.android.lark.message.service.dto.CardActionUrl;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.service.a.b */
public class C45377b {

    /* renamed from: com.ss.android.lark.message.service.a.b$a */
    private static final class C45379a {

        /* renamed from: a */
        public static final C45377b f114938a = new C45377b();
    }

    private C45377b() {
    }

    /* renamed from: a */
    public static C45377b m180213a() {
        return C45379a.f114938a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C45381b m180214a(byte[] bArr) throws IOException {
        CardActionMethodType cardActionMethodType;
        PutActionResponse decode = PutActionResponse.ADAPTER.decode(bArr);
        CardActionUrl a = C45380a.m180218a(decode.open_url);
        if (decode.method != null) {
            cardActionMethodType = CardActionMethodType.forNumber(decode.method.getValue());
        } else {
            cardActionMethodType = CardActionMethodType.UNKNOWN;
        }
        return new C45381b(a, cardActionMethodType);
    }

    /* renamed from: a */
    public void mo160212a(PutActionRequest.C17969a aVar, IGetDataCallback<C45381b> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PUT_ACTION, aVar, iGetDataCallback, $$Lambda$b$MYlCFwFSYVMpl1Fa6xWEx_AH9A.INSTANCE);
    }

    /* renamed from: a */
    public void mo160213a(C45278a.C45285b bVar, IGetDataCallback<C45381b> iGetDataCallback) {
        PutActionRequest.C17969a a = new PutActionRequest.C17969a().mo62455a(bVar.mo159990b()).mo62458b(bVar.mo159989a()).mo62454a(Boolean.valueOf(bVar.mo159991c()));
        if (bVar.mo159992d().size() > 0) {
            a.mo62456a(bVar.mo159992d());
        }
        mo160212a(a, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo160214a(String str, String str2, Map<String, String> map, IGetDataCallback<C45381b> iGetDataCallback) {
        PutActionRequest.C17969a a = new PutActionRequest.C17969a().mo62455a(str).mo62458b(str2).mo62454a((Boolean) false);
        if (map != null && map.size() > 0) {
            a.mo62456a(map);
        }
        mo160212a(a, iGetDataCallback);
    }
}
