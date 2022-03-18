package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\b\u0010\f\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/HitPointEvent;", "", "eventName", "", "(Ljava/lang/String;)V", "params", "Lorg/json/JSONObject;", "calendarId", "chatId", "click", "eventId", "eventStartTime", "param", "put", "key", "value", "send", "", "target", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.k */
public final class HitPointEvent {

    /* renamed from: a */
    public static final Companion f83368a = new Companion(null);

    /* renamed from: b */
    private JSONObject f83369b;

    /* renamed from: c */
    private final String f83370c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0002\b\u0011H\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/HitPointEvent$Companion;", "", "()V", "CALENDAR_ID", "", "CHAT_ID", "CLICK", "EVENT_ID", "EVENT_START_TIME", "NONE", "TARGET", "autoSend", "", "eventName", "build", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/HitPointEvent;", "Lkotlin/ExtensionFunctionType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final JSONObject m124388b() {
        JSONObject jSONObject = this.f83369b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f83369b = jSONObject2;
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo118759a() {
        try {
            if (this.f83369b == null) {
                C30022a.f74882a.statisticsDependency().mo108185a(this.f83370c);
            } else {
                C30022a.f74882a.statisticsDependency().mo108186a(this.f83370c, this.f83369b);
            }
            Log.m165379d("HitPointEvent", "send " + this.f83370c + ": " + this.f83369b);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public final HitPointEvent mo118757a(String str) {
        return mo118758a("click", str);
    }

    /* renamed from: b */
    public final HitPointEvent mo118760b(String str) {
        return mo118758a("target", str);
    }

    /* renamed from: c */
    public final HitPointEvent mo118761c(String str) {
        return mo118758a("event_id", str);
    }

    /* renamed from: d */
    public final HitPointEvent mo118762d(String str) {
        return mo118758a("event_start_time", str);
    }

    /* renamed from: e */
    public final HitPointEvent mo118763e(String str) {
        return mo118758a("chat_id", str);
    }

    /* renamed from: f */
    public final HitPointEvent mo118764f(String str) {
        return mo118758a("calendar_id", str);
    }

    public HitPointEvent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        this.f83370c = str;
    }

    /* renamed from: a */
    public final HitPointEvent mo118758a(String str, String str2) {
        boolean z;
        String str3 = str;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                m124388b().put(str, str2);
            }
        }
        return this;
    }
}
