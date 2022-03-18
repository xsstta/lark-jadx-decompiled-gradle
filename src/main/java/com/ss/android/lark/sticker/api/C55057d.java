package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetStickerSetsRequest;
import com.bytedance.lark.pb.im.v1.GetStickerSetsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.d */
public class C55057d {
    /* renamed from: a */
    public void mo187899a(IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_STICKER_SETS, new GetStickerSetsRequest.C17685a(), iGetDataCallback, new SdkSender.IParser<List<StickerSet>>() {
            /* class com.ss.android.lark.sticker.api.C55057d.C550581 */

            /* renamed from: a */
            public List<StickerSet> parse(byte[] bArr) throws IOException {
                C55059e eVar = new C55059e();
                eVar.mo187902a(GetStickerSetsResponse.ADAPTER.decode(bArr));
                return eVar.mo187901a();
            }
        });
    }
}
