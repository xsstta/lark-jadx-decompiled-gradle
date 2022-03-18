package com.ss.android.lark.calendar.impl.framework.viewmodel;

import android.os.Looper;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\u001a;\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000b\u001a;\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000b\u001a;\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"error", "", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extra", "", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/Object;)V", "loading", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;Ljava/lang/Object;)V", "none", "success", "update", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.h */
public final class C32510h {
    /* renamed from: a */
    public static final <T> void m124464a(C1177w<T> wVar, T t) {
        Intrinsics.checkParameterIsNotNull(wVar, "$this$update");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        if (Intrinsics.areEqual(currentThread, mainLooper.getThread())) {
            wVar.mo5929b((Object) t);
        } else {
            wVar.mo5926a((Object) t);
        }
    }

    /* renamed from: b */
    public static final <T> void m124470b(C1177w<StatusData<T>> wVar, T t, Object obj) {
        Intrinsics.checkParameterIsNotNull(wVar, "$this$success");
        m124464a(wVar, StatusData.f83414a.mo118797b(t, obj));
    }

    /* renamed from: a */
    public static final <T> void m124466a(C1177w<StatusData<T>> wVar, T t, Object obj) {
        Intrinsics.checkParameterIsNotNull(wVar, "$this$loading");
        m124464a(wVar, StatusData.f83414a.mo118795a(t, obj));
    }

    /* renamed from: a */
    public static /* synthetic */ void m124465a(C1177w wVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = wVar.mo5927b();
        }
        m124464a(wVar, obj);
    }

    /* renamed from: a */
    public static final <T> void m124468a(C1177w<StatusData<T>> wVar, Throwable th, T t, Object obj) {
        Intrinsics.checkParameterIsNotNull(wVar, "$this$error");
        m124464a(wVar, StatusData.f83414a.mo118796a(th, t, obj));
    }

    /* renamed from: b */
    public static /* synthetic */ void m124471b(C1177w wVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            StatusData gVar = (StatusData) wVar.mo5927b();
            if (gVar != null) {
                obj = gVar.mo118792e();
            } else {
                obj = null;
            }
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        m124470b(wVar, obj, obj2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m124467a(C1177w wVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            StatusData gVar = (StatusData) wVar.mo5927b();
            if (gVar != null) {
                obj = gVar.mo118792e();
            } else {
                obj = null;
            }
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        m124466a(wVar, obj, obj2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m124469a(C1177w wVar, Throwable th, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 2) != 0) {
            StatusData gVar = (StatusData) wVar.mo5927b();
            if (gVar != null) {
                obj = gVar.mo118792e();
            } else {
                obj = null;
            }
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        m124468a(wVar, th, obj, obj2);
    }
}
