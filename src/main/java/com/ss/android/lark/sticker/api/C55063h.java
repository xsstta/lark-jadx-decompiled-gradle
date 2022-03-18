package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PutStickerSetsRequest;
import com.bytedance.lark.pb.im.v1.PutStickerSetsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.h */
public class C55063h {

    /* renamed from: a */
    private List<String> f136030a = new ArrayList();

    /* renamed from: a */
    public void mo187911a(List<String> list) {
        this.f136030a = list;
    }

    /* renamed from: a */
    public void mo187910a(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PUT_STICKER_SETS, new PutStickerSetsRequest.C17979a().mo62482a(this.f136030a), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.sticker.api.C55063h.C550641 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                PutStickerSetsResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
