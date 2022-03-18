package com.ss.android.lark.banner.statistics;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.banner.h.d */
public abstract class UGAppreciable {
    /* renamed from: a */
    public abstract Biz mo104464a();

    /* renamed from: b */
    public abstract Scene mo104466b();

    /* renamed from: com.ss.android.lark.banner.h.d$a */
    public static final class NetPoint {

        /* renamed from: a */
        private String f73692a;

        /* renamed from: b */
        private final Event f73693b;

        /* renamed from: c */
        private final UGAppreciable f73694c;

        /* renamed from: a */
        public final void mo104478a() {
            this.f73692a = this.f73694c.mo104472a(this.f73693b);
        }

        /* renamed from: b */
        public final void mo104480b() {
            String str = this.f73692a;
            if (str != null) {
                this.f73694c.mo104477b(str);
            }
        }

        /* renamed from: a */
        public final void mo104479a(int i, String str) {
            this.f73694c.mo104474a(this.f73693b, i, str);
        }

        public NetPoint(Event event, UGAppreciable dVar) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            Intrinsics.checkParameterIsNotNull(dVar, "ugAppreciable");
            this.f73693b = event;
            this.f73694c = dVar;
        }
    }

    /* renamed from: a */
    public final String mo104472a(Event event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        return m108613a(this, event, true, null, null, null, null, null, SmActions.ACTION_CALLING_EXIT, null);
    }

    /* renamed from: b */
    public final void mo104477b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, null, null, null, null, 30, null);
    }

    /* renamed from: a */
    public final void mo104474a(Event event, int i, String str) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        m108615a(this, event, ErrorType.Network, ErrorLevel.Exception, i, null, null, str, true, null, null, null, 1840, null);
    }

    /* renamed from: a */
    public final void mo104475a(Event event, int i, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        m108615a(this, event, ErrorType.Other, ErrorLevel.Exception, i, null, null, str, false, map, map2, map3, 48, null);
    }

    /* renamed from: a */
    public final String mo104473a(Event event, boolean z, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        return AppreciableKit.f73094h.mo103524a().mo103510a(mo104464a(), mo104466b(), event, str, z, map, map2, map3, map4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m108614a(UGAppreciable dVar, Event event, int i, String str, Map map, Map map2, Map map3, int i2, Object obj) {
        String str2;
        Map map4;
        Map map5;
        Map map6;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i2 & 8) != 0) {
                map4 = null;
            } else {
                map4 = map;
            }
            if ((i2 & 16) != 0) {
                map5 = null;
            } else {
                map5 = map2;
            }
            if ((i2 & 32) != 0) {
                map6 = null;
            } else {
                map6 = map3;
            }
            dVar.mo104475a(event, i, str2, map4, map5, map6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bizError");
    }

    /* renamed from: a */
    public static /* synthetic */ String m108613a(UGAppreciable dVar, Event event, boolean z, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        String str2;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        if (obj == null) {
            if ((i & 4) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i & 8) != 0) {
                map5 = null;
            } else {
                map5 = map;
            }
            if ((i & 16) != 0) {
                map6 = null;
            } else {
                map6 = map2;
            }
            if ((i & 32) != 0) {
                map7 = null;
            } else {
                map7 = map3;
            }
            if ((i & 64) != 0) {
                map8 = null;
            } else {
                map8 = map4;
            }
            return dVar.mo104473a(event, z, str2, map5, map6, map7, map8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    /* renamed from: a */
    public final void mo104476a(Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        Intrinsics.checkParameterIsNotNull(errorLevel, "errorLevel");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(mo104464a(), mo104466b(), event, errorType, errorLevel, i, str, str2, str3, bool, map, map2, map3));
    }

    /* renamed from: a */
    public static /* synthetic */ void m108615a(UGAppreciable dVar, Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, Map map, Map map2, Map map3, int i2, Object obj) {
        Event event2;
        String str4;
        String str5;
        String str6;
        Boolean bool2;
        Map map4;
        Map map5;
        Map map6;
        if (obj == null) {
            if ((i2 & 1) != 0) {
                event2 = null;
            } else {
                event2 = event;
            }
            if ((i2 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i2 & 32) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i2 & 64) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            if ((i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i2 & DynamicModule.f58006b) != 0) {
                map4 = null;
            } else {
                map4 = map;
            }
            if ((i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
                map5 = null;
            } else {
                map5 = map2;
            }
            if ((i2 & 1024) != 0) {
                map6 = null;
            } else {
                map6 = map3;
            }
            dVar.mo104476a(event2, errorType, errorLevel, i, str4, str5, str6, bool2, map4, map5, map6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
    }
}
