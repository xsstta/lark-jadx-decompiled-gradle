package com.ss.android.lark.sticker;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.AbstractC55075a;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.p2714a.C55013i;
import com.ss.android.lark.sticker.p2714a.C55020j;
import com.ss.android.lark.sticker.p2714a.C55027k;
import com.ss.android.lark.sticker.p2714a.C55038m;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.p2715b.AbstractC55066b;
import com.ss.android.lark.sticker.p2715b.AbstractC55068d;
import com.ss.android.lark.sticker.p2715b.AbstractC55069e;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55136c;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55165d;
import com.ss.android.lark.sticker.ui.emoticon.preview.C55188c;
import com.ss.android.lark.sticker.ui.emoticon.shop.C55213c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.sticker.a */
public class C54996a {

    /* renamed from: a */
    private static volatile IStickerModuleDependency f135931a;

    /* renamed from: b */
    private static Map<Object, C55013i.AbstractC55018a> f135932b = new ConcurrentHashMap();

    /* renamed from: a */
    public static IStickerModuleDependency m213619a() {
        return f135931a;
    }

    /* renamed from: b */
    public AbstractC55068d mo187810b() {
        return C55027k.m213686a();
    }

    /* renamed from: c */
    public AbstractC55069e mo187815c() {
        return C55044n.m213720a();
    }

    /* renamed from: d */
    public AbstractC55066b mo187816d() {
        return C55004f.m213654a();
    }

    /* renamed from: b */
    public void mo187811b(Activity activity) {
        C55165d.m214063a(activity);
    }

    public C54996a(IStickerModuleDependency iStickerModuleDependency) {
        f135931a = iStickerModuleDependency;
    }

    /* renamed from: a */
    public void mo187804a(Activity activity) {
        C55213c.m214194a(activity);
    }

    /* renamed from: b */
    public void mo187812b(C55013i.AbstractC55018a aVar) {
        C55013i.m213673a().mo187839b(aVar);
    }

    /* renamed from: b */
    public void mo187813b(C55020j.AbstractC55025a aVar) {
        C55020j.m213679a().mo187843b(aVar);
    }

    /* renamed from: a */
    public void mo187807a(C55013i.AbstractC55018a aVar) {
        C55013i.m213673a().mo187837a(aVar);
    }

    /* renamed from: b */
    public void mo187814b(AbstractC55075a aVar) {
        C55038m.m213715a().mo187868b(aVar);
    }

    /* renamed from: a */
    public void mo187808a(C55020j.AbstractC55025a aVar) {
        C55020j.m213679a().mo187841a(aVar);
    }

    /* renamed from: a */
    public void mo187809a(AbstractC55075a aVar) {
        C55038m.m213715a().mo187866a(aVar);
    }

    /* renamed from: a */
    public void mo187805a(Context context, StickerSetInfo stickerSetInfo) {
        C55188c.m214123a(context, stickerSetInfo);
    }

    /* renamed from: a */
    public void mo187806a(Context context, String str) {
        C55136c.m213982a(context, str);
    }
}
