package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetStickerSetsByIDRequest;
import com.bytedance.lark.pb.im.v1.GetStickerSetsByIDResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.b */
public class C55054b {

    /* renamed from: a */
    private List<String> f136015a;

    /* renamed from: b */
    private String f136016b;

    /* renamed from: a */
    public String mo187893a() {
        return this.f136016b;
    }

    /* renamed from: a */
    public void mo187894a(IGetDataCallback<C55094b> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_STICKER_SETS_BY_ID, new GetStickerSetsByIDRequest.C17681a().mo61774a(this.f136015a), iGetDataCallback, new SdkSender.IParser<C55094b>() {
            /* class com.ss.android.lark.sticker.api.C55054b.C550551 */

            /* renamed from: a */
            public C55094b parse(byte[] bArr) throws IOException {
                return new C55056c(GetStickerSetsByIDResponse.ADAPTER.decode(bArr)).mo187896a(C55054b.this.mo187893a());
            }
        });
    }

    public C55054b(List<String> list, String str) {
        this.f136015a = list;
        this.f136016b = str;
    }
}
