package com.ss.android.lark.calendar.impl.framework.viewmodel;

import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "T", "", UpdateKey.STATUS, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "error", "", "extra", "(ILjava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "getExtra", "isConsumed", "", "()Z", "setConsumed", "(Z)V", "getStatus", "()I", "isError", "isLoading", "isNone", "isSuccess", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.g */
public final class StatusData<T> {

    /* renamed from: a */
    public static final Companion f83414a = new Companion(null);

    /* renamed from: b */
    private boolean f83415b;

    /* renamed from: c */
    private final int f83416c;

    /* renamed from: d */
    private final T f83417d;

    /* renamed from: e */
    private final Throwable f83418e;

    /* renamed from: f */
    private final Object f83419f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ/\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData$Companion;", "", "()V", "error", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "T", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extra", "(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/Object;)Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "loading", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "none", "success", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> StatusData<T> mo118795a(T t, Object obj) {
            return new StatusData<>(1, t, null, obj);
        }

        /* renamed from: b */
        public final <T> StatusData<T> mo118797b(T t, Object obj) {
            return new StatusData<>(2, t, null, obj);
        }

        /* renamed from: a */
        public final <T> StatusData<T> mo118796a(Throwable th, T t, Object obj) {
            return new StatusData<>(3, t, th, obj);
        }
    }

    /* renamed from: e */
    public final T mo118792e() {
        return this.f83417d;
    }

    /* renamed from: f */
    public final Object mo118793f() {
        return this.f83419f;
    }

    /* renamed from: a */
    public final boolean mo118788a() {
        return this.f83415b;
    }

    /* renamed from: b */
    public final boolean mo118789b() {
        if (this.f83416c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo118790c() {
        if (this.f83416c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo118791d() {
        if (this.f83416c == 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.f83416c;
        if (i == 1) {
            return "Loading {" + ((Object) this.f83417d) + "}, extra={" + this.f83419f + '}';
        } else if (i == 2) {
            return "Ready {" + ((Object) this.f83417d) + "}, extra={" + this.f83419f + '}';
        } else if (i != 3) {
            return "None {" + ((Object) this.f83417d) + "}, extra={" + this.f83419f + '}';
        } else {
            return "Error(" + this.f83418e + ") {" + ((Object) this.f83417d) + "}, extra={" + this.f83419f + '}';
        }
    }

    /* renamed from: a */
    public final void mo118787a(boolean z) {
        this.f83415b = z;
    }

    public StatusData(@DataStatus int i, T t, Throwable th, Object obj) {
        this.f83416c = i;
        this.f83417d = t;
        this.f83418e = th;
        this.f83419f = obj;
    }
}
