package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.DeleteStickerSetsRequest;
import com.bytedance.lark.pb.im.v1.DeleteStickerSetsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.a */
public class C55052a {

    /* renamed from: a */
    private List<String> f136013a;

    /* renamed from: a */
    public void mo187891a(List<String> list) {
        this.f136013a = list;
    }

    /* renamed from: a */
    public void mo187890a(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_STICKER_SETS, new DeleteStickerSetsRequest.C17426a().mo61129a(this.f136013a), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.sticker.api.C55052a.C550531 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                DeleteStickerSetsResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
