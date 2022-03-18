package com.ss.android.lark.pin.impl.statistics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/pin/impl/statistics/PinAppreciableHitPoint;", "", "()V", "CHATTER_COUNT", "", "CHAT_TYPE", "FEED_ID", "GROUP", "", "SINGLE", "TOPIC", GrsBaseInfo.CountryCodeSource.UNKNOWN, "key", "appreciableCostEnd", "", "appreciableError", "chatType", "chatId", "chatterCount", "isNetLoad", "", "errorMsg", "appreciableStart", "firstRenderEnd", "firstRenderStart", "initViewCostEnd", "initViewCostStart", "sdkCostEnd", "sdkCostStart", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.statistics.b */
public final class PinAppreciableHitPoint {

    /* renamed from: a */
    public static final PinAppreciableHitPoint f128210a = new PinAppreciableHitPoint();

    /* renamed from: b */
    private static String f128211b = "";

    private PinAppreciableHitPoint() {
    }

    /* renamed from: a */
    public final void mo177422a() {
        AppreciableKit.f73094h.mo103524a().mo103515a(f128211b);
    }

    /* renamed from: b */
    public final void mo177425b() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f128211b, "sdk_cost");
    }

    /* renamed from: c */
    public final void mo177426c() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f128211b, "sdk_cost");
    }

    /* renamed from: d */
    public final void mo177427d() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f128211b, "init_view_cost");
    }

    /* renamed from: e */
    public final void mo177428e() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f128211b, "init_view_cost");
    }

    /* renamed from: f */
    public final void mo177429f() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f128211b, "first_render_cost");
    }

    /* renamed from: g */
    public final void mo177430g() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f128211b, "first_render_cost");
    }

    /* renamed from: a */
    public final void mo177423a(int i, String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        HashMap hashMap = new HashMap();
        hashMap.put("feed_id", str);
        hashMap.put("chatter_count", Integer.valueOf(i2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("chat_type", Integer.valueOf(i));
        f128211b = AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Chat, Event.enter_pin, "ChatPin", true, null, null, hashMap, hashMap2, 96, null);
    }

    /* renamed from: a */
    public final void mo177424a(int i, String str, int i2, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        HashMap hashMap = new HashMap();
        hashMap.put("feed_id", str);
        hashMap.put("chatter_count", Integer.valueOf(i2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("chat_type", Integer.valueOf(i));
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.enter_pin, ErrorType.SDK, ErrorLevel.Fatal, 0, null, "ChatPin", str2, Boolean.valueOf(z), null, hashMap, hashMap2, 1088, null));
    }
}
