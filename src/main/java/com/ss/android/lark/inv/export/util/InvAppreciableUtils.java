package com.ss.android.lark.inv.export.util;

import android.os.SystemClock;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.inv.export.util.c */
public final class InvAppreciableUtils {

    /* renamed from: a */
    public static final InvAppreciableUtils f101934a = new InvAppreciableUtils();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Long> f101935b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, String> f101936c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final BaseAppreciable f101937d = new BaseAppreciable(Scene.Invite);

    /* renamed from: e */
    private static final BaseAppreciable f101938e = new BaseAppreciable(Scene.Contact);

    /* renamed from: f */
    private static final BaseAppreciable f101939f = new BaseAppreciable(Scene.DyResource);

    private InvAppreciableUtils() {
    }

    /* renamed from: a */
    public static final BaseAppreciable m158975a() {
        return f101937d;
    }

    /* renamed from: b */
    public static final BaseAppreciable m158977b() {
        return f101938e;
    }

    /* renamed from: c */
    public static final BaseAppreciable m158979c() {
        return f101939f;
    }

    /* renamed from: com.ss.android.lark.inv.export.util.c$a */
    public static final class BaseAppreciable {

        /* renamed from: a */
        private final Scene f101940a;

        /* renamed from: a */
        public final void mo145663a(Event event) {
            m158993a(this, event, false, 2, null);
        }

        /* renamed from: a */
        public final void mo145665a(Event event, ErrorResult errorResult) {
            m158991a(this, event, errorResult, false, 4, null);
        }

        /* renamed from: b */
        public final void mo145669b(Event event) {
            m158992a(this, event, null, null, null, 14, null);
        }

        public BaseAppreciable(Scene scene) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            this.f101940a = scene;
        }

        /* renamed from: a */
        public final void mo145668a(Event event, boolean z) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            String a = AppreciableKit.f73094h.mo103524a().mo103508a(Biz.UserGrowth, this.f101940a, event, "", z);
            InvAppreciableUtils cVar = InvAppreciableUtils.f101934a;
            InvAppreciableUtils.f101936c.put(event.name(), a);
            InvAppreciableUtils cVar2 = InvAppreciableUtils.f101934a;
            InvAppreciableUtils.f101935b.put(event.name(), Long.valueOf(SystemClock.uptimeMillis()));
        }

        /* renamed from: a */
        public final void mo145666a(Event event, ErrorResult errorResult, boolean z) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.UserGrowth, this.f101940a, event, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), "", "", errorResult.getMessage(), Boolean.valueOf(z), null, null, null, 7168, null));
        }

        /* renamed from: a */
        public final void mo145664a(Event event, int i, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.UserGrowth, this.f101940a, event, ErrorType.SDK, ErrorLevel.Fatal, i, "", "", str, Boolean.valueOf(z), null, null, null, 7168, null));
        }

        /* renamed from: a */
        public final void mo145667a(Event event, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            InvAppreciableUtils cVar = InvAppreciableUtils.f101934a;
            String str = (String) InvAppreciableUtils.f101936c.get(event.name());
            if (str != null) {
                InvAppreciableUtils cVar2 = InvAppreciableUtils.f101934a;
                InvAppreciableUtils.f101936c.remove(event.name());
                InvAppreciableUtils.f101934a.mo145653a(event.name());
                AppreciableKit.f73094h.mo103524a().mo103523c(str, null, map, map2, map3);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m158993a(BaseAppreciable aVar, Event event, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.mo145668a(event, z);
        }

        /* renamed from: a */
        public static /* synthetic */ void m158991a(BaseAppreciable aVar, Event event, ErrorResult errorResult, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            aVar.mo145666a(event, errorResult, z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.inv.export.util.c$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m158992a(BaseAppreciable aVar, Event event, Map map, Map map2, Map map3, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                map2 = null;
            }
            if ((i & 8) != 0) {
                map3 = null;
            }
            aVar.mo145667a(event, map, map2, map3);
        }
    }

    /* renamed from: e */
    private final String m158980e(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContactExternalView");
        if (z) {
            str = "V2";
        } else {
            str = "V1";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo145653a(String str) {
        ConcurrentHashMap<String, Long> concurrentHashMap = f101935b;
        Long l = concurrentHashMap.get(str);
        if (l == null) {
            return 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(l, "PAGE_MILLIS_MAP[key] ?: return 0");
        long longValue = l.longValue();
        concurrentHashMap.remove(str);
        return SystemClock.uptimeMillis() - longValue;
    }

    /* renamed from: a */
    public final void mo145654a(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.add_contacts, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), "GET_CONTACT_TOKEN_V2", "InviteExternalView", errorResult.getMessage(), true, null, null, null, 7168, null));
    }

    /* renamed from: b */
    public final void mo145658b(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.show_invite_member, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), "GET_USER_PROFILE", "InviteMemberChannelView", errorResult.getMessage(), true, null, null, null, 7168, null));
    }

    /* renamed from: c */
    public final void mo145660c(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.show_address_book, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), "GET_ADDRESS_BOOK_CONTACT_LIST", "InviteExternalContactView", errorResult.getMessage(), true, null, null, MapsKt.mapOf(TuplesKt.to("source_type", 1)), 3072, null));
    }

    /* renamed from: b */
    public final void mo145659b(boolean z) {
        if (z) {
            f101936c.put("InviteMemberChannelView", AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Contact, Event.show_invite_member, "InviteMemberChannelView", true));
            f101935b.put("InviteMemberChannelView", Long.valueOf(SystemClock.uptimeMillis()));
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f101936c;
        String str = concurrentHashMap.get("InviteMemberChannelView");
        if (str != null) {
            concurrentHashMap.remove("InviteMemberChannelView");
            long a = mo145653a("InviteMemberChannelView");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("sdk_cost", Long.valueOf(a)), TuplesKt.to("init_view_cost", Long.valueOf(a)), TuplesKt.to("first_render", Long.valueOf(a))), null, null, null, 28, null);
        }
    }

    /* renamed from: c */
    public final void mo145661c(boolean z) {
        if (z) {
            f101936c.put("InviteMemberContactView", AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Contact, Event.show_address_book, "InviteMemberContactView", false));
            f101935b.put("InviteMemberContactView", Long.valueOf(SystemClock.uptimeMillis()));
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f101936c;
        String str = concurrentHashMap.get("InviteMemberContactView");
        if (str != null) {
            concurrentHashMap.remove("InviteMemberContactView");
            long a = mo145653a("InviteMemberContactView");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("sdk_cost", 0), TuplesKt.to("init_view_cost", Long.valueOf(a)), TuplesKt.to("first_render", Long.valueOf(a))), null, null, MapsKt.mapOf(TuplesKt.to("source_type", 2)), 12, null);
        }
    }

    /* renamed from: d */
    public final void mo145662d(boolean z) {
        if (z) {
            f101936c.put("InviteExternalContactView", AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Contact, Event.show_address_book, "InviteExternalContactView", true));
            f101935b.put("InviteExternalContactView", Long.valueOf(SystemClock.uptimeMillis()));
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f101936c;
        String str = concurrentHashMap.get("InviteExternalContactView");
        if (str != null) {
            concurrentHashMap.remove("InviteExternalContactView");
            long a = mo145653a("InviteExternalContactView");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("sdk_cost", 0), TuplesKt.to("init_view_cost", Long.valueOf(a)), TuplesKt.to("first_render", Long.valueOf(a))), null, null, MapsKt.mapOf(TuplesKt.to("source_type", 1)), 12, null);
        }
    }

    /* renamed from: a */
    public final void mo145656a(boolean z) {
        if (z) {
            f101936c.put("InviteExternalView", AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Contact, Event.add_contacts, "InviteExternalView", true));
            f101935b.put("InviteExternalView", Long.valueOf(SystemClock.uptimeMillis()));
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f101936c;
        String str = concurrentHashMap.get("InviteExternalView");
        if (str != null) {
            concurrentHashMap.remove("InviteExternalView");
            long a = mo145653a("InviteExternalView");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("link_cost", Long.valueOf(a)), TuplesKt.to("qrcode_cost", Long.valueOf(a)), TuplesKt.to("init_view_cost", Long.valueOf(a)), TuplesKt.to("first_render", Long.valueOf(a))), null, null, null, 28, null);
        }
    }

    /* renamed from: a */
    public final void mo145655a(ErrorResult errorResult, boolean z) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.show_external_contacts, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), "show_contact_external", m158980e(z), errorResult.getMessage(), true, null, null, null, 7168, null));
    }

    /* renamed from: a */
    public final void mo145657a(boolean z, boolean z2) {
        String e = m158980e(z2);
        if (z) {
            f101936c.put(e, AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Contact, Event.show_external_contacts, e, true, null, null, MapsKt.mapOf(TuplesKt.to("member_count", "0")), null, 352, null));
            f101935b.put(e, Long.valueOf(SystemClock.uptimeMillis()));
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f101936c;
        String str = concurrentHashMap.get(e);
        if (str != null) {
            concurrentHashMap.remove(e);
            long a = mo145653a(e);
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, MapsKt.mapOf(TuplesKt.to("sdk_cost", 0), TuplesKt.to("init_view_cost", Long.valueOf(a)), TuplesKt.to("first_render", Long.valueOf(a))), null, null, null, 28, null);
        }
    }
}
