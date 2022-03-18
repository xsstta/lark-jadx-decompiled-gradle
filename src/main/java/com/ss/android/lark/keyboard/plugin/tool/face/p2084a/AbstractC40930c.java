package com.ss.android.lark.keyboard.plugin.tool.face.p2084a;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.C40966m;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.c */
public interface AbstractC40930c {
    /* renamed from: a */
    C40964l mo147534a(String str, int i, int i2);

    /* renamed from: a */
    List<Sticker> mo147535a();

    /* renamed from: a */
    void mo147536a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);

    /* renamed from: a */
    void mo147537a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h hVar);

    /* renamed from: a */
    void mo147538a(IPushStickerListener hVar);

    /* renamed from: a */
    void mo147539a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback);

    /* renamed from: b */
    List<Sticker> mo147540b();

    /* renamed from: b */
    void mo147541b(IPushStickerListener hVar);
}
