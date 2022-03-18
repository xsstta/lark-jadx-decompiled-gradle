package com.ss.android.lark.ug.apm;

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
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002Jj\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nJ§\u0001\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0001\u0010#\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGAppreciable;", "", "()V", "bizError", "", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "errorCode", "", "errorMessage", "", "extra", "", "extraMetric", "extraCategory", "end", "key", "error", "errorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorLevel", "Lcom/ss/android/lark/appreciablelib/ErrorLevel;", "userAction", "page", "needNet", "", "(Lcom/ss/android/lark/appreciablelib/Event;Lcom/ss/android/lark/appreciablelib/ErrorType;Lcom/ss/android/lark/appreciablelib/ErrorLevel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getBiz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getScene", "Lcom/ss/android/lark/appreciablelib/Scene;", "netError", "errCode", ApiHandler.API_CALLBACK_ERRMSG, "netStart", "start", "latencyDetail", "NetPoint", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.a.c */
public abstract class UGAppreciable {
    /* renamed from: a */
    public abstract Biz mo194461a();

    /* renamed from: b */
    public abstract Scene mo194464b();

    /* renamed from: a */
    public final void mo194483a(Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        Intrinsics.checkParameterIsNotNull(errorLevel, "errorLevel");
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(mo194461a(), mo194464b(), event, errorType, errorLevel, i, str, str2, str3, bool, map, map2, map3));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGAppreciable$NetPoint;", "", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "ugAppreciable", "Lcom/ss/android/lark/ug/apm/UGAppreciable;", "(Lcom/ss/android/lark/appreciablelib/Event;Lcom/ss/android/lark/ug/apm/UGAppreciable;)V", "getEvent", "()Lcom/ss/android/lark/appreciablelib/Event;", "key", "", "end", "", "error", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "start", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.a.c$a */
    public static final class NetPoint {

        /* renamed from: a */
        private String f141200a;

        /* renamed from: b */
        private final Event f141201b;

        /* renamed from: c */
        private final UGAppreciable f141202c;

        /* renamed from: a */
        public final void mo194485a() {
            this.f141200a = this.f141202c.mo194479a(this.f141201b);
        }

        /* renamed from: b */
        public final void mo194487b() {
            String str = this.f141200a;
            if (str != null) {
                this.f141202c.mo194484a(str);
            }
        }

        /* renamed from: a */
        public final void mo194486a(int i, String str) {
            this.f141202c.mo194481a(this.f141201b, i, str);
        }

        public NetPoint(Event event, UGAppreciable cVar) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            Intrinsics.checkParameterIsNotNull(cVar, "ugAppreciable");
            this.f141201b = event;
            this.f141202c = cVar;
        }
    }

    /* renamed from: a */
    public final void mo194484a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AppreciableKit.f73094h.mo103524a().mo103515a(str);
    }

    /* renamed from: a */
    public final String mo194479a(Event event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        return m222294a(this, event, true, null, null, null, null, null, SmActions.ACTION_CALLING_EXIT, null);
    }

    /* renamed from: a */
    public final void mo194481a(Event event, int i, String str) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        m222296a(this, event, ErrorType.Network, ErrorLevel.Exception, i, null, null, str, true, null, null, null, 1840, null);
    }

    /* renamed from: a */
    public final void mo194482a(Event event, int i, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        m222296a(this, event, ErrorType.Other, ErrorLevel.Exception, i, null, null, str, false, map, map2, map3, 48, null);
    }

    /* renamed from: a */
    public final String mo194480a(Event event, boolean z, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        return AppreciableKit.f73094h.mo103524a().mo103510a(mo194461a(), mo194464b(), event, str, z, map, map2, map3, map4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m222295a(UGAppreciable cVar, Event event, int i, String str, Map map, Map map2, Map map3, int i2, Object obj) {
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
            cVar.mo194482a(event, i, str2, map4, map5, map6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bizError");
    }

    /* renamed from: a */
    public static /* synthetic */ String m222294a(UGAppreciable cVar, Event event, boolean z, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
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
            return cVar.mo194480a(event, z, str2, map5, map6, map7, map8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    /* renamed from: a */
    public static /* synthetic */ void m222296a(UGAppreciable cVar, Event event, ErrorType errorType, ErrorLevel errorLevel, int i, String str, String str2, String str3, Boolean bool, Map map, Map map2, Map map3, int i2, Object obj) {
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
            cVar.mo194483a(event2, errorType, errorLevel, i, str4, str5, str6, bool2, map4, map5, map6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
    }
}
