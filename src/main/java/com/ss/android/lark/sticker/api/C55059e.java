package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.im.v1.GetStickerSetsResponse;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.p2714a.C55037l;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.e */
public class C55059e {

    /* renamed from: a */
    private List<StickerSet> f136024a;

    /* renamed from: a */
    public List<StickerSet> mo187901a() {
        return this.f136024a;
    }

    /* renamed from: a */
    public void mo187902a(GetStickerSetsResponse getStickerSetsResponse) {
        if (getStickerSetsResponse != null) {
            this.f136024a = C55037l.m213713a(getStickerSetsResponse.sticker_sets);
        }
    }
}
