package com.ss.android.lark.member_manage.impl.statistics;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0011J\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/AtSelectPerceptionErrorCostTimeHitPoint;", "", "()V", "FIRST_RENDER", "", "INIT_VIEW", "PAGE", "SDK_COST", "TYPE_GROUP", "", "TYPE_SINGLE", "TYPE_THREAD_DETAIL", "TYPE_TOPIC", "TYPE_UNKNOWN", "chatType", "key", "needNet", "", "renderFinish", "firstRenderEnd", "", "firstRenderStart", "getExtraCategory", "", "initViewEnd", "initViewStart", "perceptionCostEnd", "perceptionCostStart", "perceptionLocalError", "perceptionNetError", "recordChatType", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", ShareHitPoint.f121869d, "recordNeedNet", "need", "sdkCostEnd", "sdkCostStart", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.statistics.a */
public final class AtSelectPerceptionErrorCostTimeHitPoint {

    /* renamed from: a */
    public static final AtSelectPerceptionErrorCostTimeHitPoint f114602a = new AtSelectPerceptionErrorCostTimeHitPoint();

    /* renamed from: b */
    private static String f114603b = "";

    /* renamed from: c */
    private static boolean f114604c;

    /* renamed from: d */
    private static int f114605d;

    /* renamed from: e */
    private static boolean f114606e;

    private AtSelectPerceptionErrorCostTimeHitPoint() {
    }

    /* renamed from: d */
    public final void mo159941d() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f114603b, "sdk_cost");
    }

    /* renamed from: e */
    public final void mo159942e() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f114603b, "sdk_cost");
    }

    /* renamed from: f */
    public final void mo159943f() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f114603b, "init_view_cost");
    }

    /* renamed from: g */
    public final void mo159944g() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f114603b, "init_view_cost");
    }

    /* renamed from: h */
    public final void mo159945h() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f114603b, "first_render");
    }

    /* renamed from: c */
    public final void mo159940c() {
        f114603b = AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Chat, Event.at_user_list, "AtSelect", true);
    }

    /* renamed from: i */
    public final void mo159946i() {
        if (!f114604c) {
            AppreciableKit.f73094h.mo103524a().mo103521b(f114603b, "first_render");
            f114604c = true;
        }
    }

    /* renamed from: j */
    public final void mo159947j() {
        AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), f114603b, null, null, null, m179730k(), 14, null);
        f114603b = "";
        f114605d = 0;
        f114604c = false;
    }

    /* renamed from: k */
    private final Map<String, Object> m179730k() {
        int i;
        HashMap hashMap = new HashMap();
        if (f114606e) {
            i = 2;
        } else {
            i = 1;
        }
        hashMap.put("sync_type", Integer.valueOf(i));
        hashMap.put("chat_type", Integer.valueOf(f114605d));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo159936a() {
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.at_user_list, ErrorType.Network, ErrorLevel.Fatal, 2, null, "AtSelect", null, true, null, null, m179730k(), 3392, null));
    }

    /* renamed from: b */
    public final void mo159939b() {
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.at_user_list, ErrorType.SDK, ErrorLevel.Fatal, 1, null, "AtSelect", null, false, null, null, m179730k(), 3392, null));
    }

    /* renamed from: a */
    public final void mo159938a(boolean z) {
        f114606e = z;
    }

    /* renamed from: a */
    public final void mo159937a(Chat chat) {
        if (f114605d == 0 && chat != null) {
            if (chat.isThread()) {
                f114605d = 3;
            } else if (chat.isP2PChat()) {
                f114605d = 1;
            } else if (chat.isGroup()) {
                f114605d = 2;
            }
        }
    }
}
