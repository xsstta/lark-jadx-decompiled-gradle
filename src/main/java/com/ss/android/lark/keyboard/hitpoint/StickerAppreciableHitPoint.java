package com.ss.android.lark.keyboard.hitpoint;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/keyboard/hitpoint/StickerAppreciableHitPoint;", "", "()V", "ALL_SUCCESS", "", "END_TYPE", "", "IS_NEED_NET", "LEAVE", "STICKER_DETAIL", "STICKER_PACKAGE_ID", GrsBaseInfo.CountryCodeSource.UNKNOWN, "key", "appreciableEnd", "", "stickerDetail", "", "", "endType", "isPreLoaded", "", "appreciableError", "stickerSetId", "", "appreciableStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.hitpoint.c */
public final class StickerAppreciableHitPoint {

    /* renamed from: a */
    public static final StickerAppreciableHitPoint f103324a = new StickerAppreciableHitPoint();

    /* renamed from: b */
    private static String f103325b = "";

    private StickerAppreciableHitPoint() {
    }

    /* renamed from: a */
    public final void mo146888a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "stickerSetId");
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_package_id", str);
        f103325b = AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Chat, Event.enter_sticker_set, "StickerSet", true, null, null, hashMap, null, 96, null);
    }

    /* renamed from: a */
    public final void mo146889a(String str, List<String> list, int i) {
        Intrinsics.checkParameterIsNotNull(str, "stickerSetId");
        Intrinsics.checkParameterIsNotNull(list, "stickerDetail");
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_package_id", str);
        hashMap.put("sticker_detail", list);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("end_type", Integer.valueOf(i));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("is_need_net", true);
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.enter_sticker_set, ErrorType.SDK, ErrorLevel.Fatal, 0, null, "StickerSet", "", true, hashMap3, hashMap, hashMap2, 64, null));
    }

    /* renamed from: a */
    public final void mo146890a(Map<String, Long> map, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(map, "stickerDetail");
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_detail", map);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("end_type", Integer.valueOf(i));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("is_need_net", true);
        if (z) {
            AppreciableKit.m107389a(AppreciableKit.f73094h.mo103524a(), f103325b, -1, (Map) null, hashMap3, hashMap, hashMap2, 4, (Object) null);
        } else {
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), f103325b, null, hashMap3, hashMap, hashMap2, 2, null);
        }
    }
}
