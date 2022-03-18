package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.im.v1.GetStickerSetsStoreResponse;
import com.google.gson.Gson;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.p2714a.C55037l;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.api.f */
public class C55060f {

    /* renamed from: a */
    private List<StickerSet> f136025a;

    /* renamed from: b */
    private boolean f136026b;

    /* renamed from: c */
    private int f136027c;

    /* renamed from: a */
    public List<StickerSet> mo187903a() {
        return this.f136025a;
    }

    /* renamed from: b */
    public boolean mo187904b() {
        return this.f136026b;
    }

    /* renamed from: c */
    public int mo187905c() {
        return this.f136027c;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    public C55060f(GetStickerSetsStoreResponse getStickerSetsStoreResponse) {
        m213757a(getStickerSetsStoreResponse);
    }

    /* renamed from: a */
    private void m213757a(GetStickerSetsStoreResponse getStickerSetsStoreResponse) {
        if (getStickerSetsStoreResponse != null) {
            this.f136025a = C55037l.m213713a(getStickerSetsStoreResponse.sticker_sets);
            this.f136026b = getStickerSetsStoreResponse.has_more.booleanValue();
            this.f136027c = getStickerSetsStoreResponse.position.intValue();
        }
    }
}
