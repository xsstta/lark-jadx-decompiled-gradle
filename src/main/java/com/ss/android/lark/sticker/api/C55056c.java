package com.ss.android.lark.sticker.api;

import com.bytedance.lark.pb.im.v1.GetStickerSetsByIDResponse;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sticker.p2714a.C55037l;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.sticker.api.c */
public class C55056c {

    /* renamed from: a */
    private Map<String, StickerSet> f136018a = new HashMap();

    /* renamed from: b */
    private Map<String, Boolean> f136019b = new HashMap();

    public C55056c(GetStickerSetsByIDResponse getStickerSetsByIDResponse) {
        m213749a(getStickerSetsByIDResponse);
    }

    /* renamed from: a */
    public C55094b mo187896a(String str) {
        boolean z;
        C55094b bVar = new C55094b();
        bVar.mo188012a(this.f136018a.get(str));
        if (this.f136019b.get(str) == null) {
            z = false;
        } else {
            z = this.f136019b.get(str).booleanValue();
        }
        bVar.mo188013a(z);
        return bVar;
    }

    /* renamed from: a */
    private void m213749a(GetStickerSetsByIDResponse getStickerSetsByIDResponse) {
        if (getStickerSetsByIDResponse == null) {
            C53241h.m205894a("GetStickerSetsByIDResponse", "converter called. responsePb is null");
            return;
        }
        if (getStickerSetsByIDResponse.visibility != null) {
            this.f136019b.putAll(getStickerSetsByIDResponse.visibility);
        }
        Map<String, com.bytedance.lark.pb.im.v1.StickerSet> map = getStickerSetsByIDResponse.sticker_sets;
        if (map == null) {
            C53241h.m205894a("GetStickerSetsByIDResponse", "converter called. responsePb.sticker_sets is null");
            return;
        }
        for (Map.Entry<String, com.bytedance.lark.pb.im.v1.StickerSet> entry : map.entrySet()) {
            this.f136018a.put(entry.getKey(), C55037l.m213711a(entry.getValue()));
        }
    }
}
