package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PatchStickerSetsRequest;
import com.bytedance.lark.pb.im.v1.PatchStickerSetsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.g */
public class C55061g {

    /* renamed from: a */
    private List<String> f136028a;

    /* renamed from: a */
    public void mo187908a(List<String> list) {
        this.f136028a = list;
    }

    /* renamed from: a */
    public void mo187907a(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PATCH_STICKER_SETS, new PatchStickerSetsRequest.C17837a().mo62166a(new PatchStickerSetsRequest.Rank(this.f136028a)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.sticker.api.C55061g.C550621 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                PatchStickerSetsResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
