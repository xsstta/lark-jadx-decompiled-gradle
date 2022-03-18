package com.ss.android.lark.sticker.p2715b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sticker.dto.C55076b;
import com.ss.android.lark.sticker.dto.C55078d;
import com.ss.android.lark.sticker.dto.StickerFileInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.b.d */
public interface AbstractC55068d {
    /* renamed from: a */
    Sticker mo187845a(String str);

    /* renamed from: a */
    C55076b mo187846a(int i, int i2);

    /* renamed from: a */
    void mo187849a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo187850a(List<Sticker> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo187851a(List<String> list, boolean z, IGetDataCallback<C55078d> iGetDataCallback);

    /* renamed from: b */
    StickerFileInfo mo187852b(String str);

    /* renamed from: b */
    List<Sticker> mo187853b();
}
