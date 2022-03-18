package com.ss.android.lark.piece.data;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0016J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0019J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u001cJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010 J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u001fJ \u0010!\u001a\u0004\u0018\u0001H\"\"\u0006\b\u0000\u0010\"\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\b¢\u0006\u0002\u0010#J)\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0%¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010)J\u0016\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020(J\u0010\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u000f\u001a\u00020\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020+J \u0010,\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00012\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\nH\u0007J\u001a\u0010/\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00012\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0007J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0007J\u001a\u00101\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00012\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0007J \u00104\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00012\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\nH\u0007R\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n0\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/piece/data/SharedData;", "", "()V", "dataMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "dataObserver", "", "", "Lcom/ss/android/lark/piece/data/DataObserver;", "handler", "Landroid/os/Handler;", "getBoolean", "", "key", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "defaultValue", "getByte", "", "(Ljava/lang/Object;)Ljava/lang/Byte;", "getDouble", "", "(Ljava/lang/Object;)Ljava/lang/Double;", "getFloat", "", "(Ljava/lang/Object;)Ljava/lang/Float;", "getInt", "", "(Ljava/lang/Object;)Ljava/lang/Integer;", "getLong", "", "(Ljava/lang/Object;)Ljava/lang/Long;", "getObject", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "getShort", "", "(Ljava/lang/Object;)Ljava/lang/Short;", "getString", "", "observe", "", "observer", "postData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "putData", "bundle", "Landroid/os/Bundle;", "removeObserver", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.a.c */
public final class SharedData {

    /* renamed from: a */
    private final ConcurrentHashMap<Object, Object> f128042a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final Map<Object, List<DataObserver<? extends Object>>> f128043b = new LinkedHashMap();

    /* renamed from: c */
    private final Handler f128044c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final ConcurrentHashMap<Object, Object> mo177165a() {
        return this.f128042a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.a.c$a */
    static final class RunnableC51467a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SharedData f128045a;

        /* renamed from: b */
        final /* synthetic */ Object f128046b;

        /* renamed from: c */
        final /* synthetic */ Object f128047c;

        RunnableC51467a(SharedData cVar, Object obj, Object obj2) {
            this.f128045a = cVar;
            this.f128046b = obj;
            this.f128047c = obj2;
        }

        public final void run() {
            this.f128045a.mo177168a(this.f128046b, this.f128047c);
        }
    }

    /* renamed from: a */
    public final String mo177164a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Object obj2 = this.f128042a.get(obj);
        if (obj2 == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(obj2, "dataMap[key] ?: return null");
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo177166a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        for (String str : bundle.keySet()) {
            Intrinsics.checkExpressionValueIsNotNull(str, "key");
            mo177168a(str, bundle.get(str));
        }
    }

    /* renamed from: b */
    public final void mo177170b(Object obj, DataObserver<? extends Object> aVar) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        List<DataObserver<? extends Object>> list = this.f128043b.get(obj);
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* renamed from: b */
    public final void mo177171b(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        this.f128044c.post(new RunnableC51467a(this, obj, obj2));
    }

    /* renamed from: a */
    public final void mo177167a(Object obj, DataObserver<? extends Object> aVar) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        ArrayList arrayList = this.f128043b.get(obj);
        if (arrayList == null || !arrayList.contains(aVar)) {
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f128043b.put(obj, arrayList);
            }
            arrayList.add(aVar);
            if (this.f128042a.containsKey(obj) && aVar.mo177156a()) {
                aVar.mo177157b(this.f128042a.get(obj));
            }
        }
    }

    /* renamed from: a */
    public final void mo177168a(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        this.f128042a.put(obj, obj2);
        List<DataObserver<? extends Object>> list = this.f128043b.get(obj);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo177157b(obj2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo177169a(Object obj, boolean z) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Object obj2 = this.f128042a.get(obj);
        if (obj2 == null) {
            return z;
        }
        Intrinsics.checkExpressionValueIsNotNull(obj2, "dataMap[key] ?: return defaultValue");
        if (obj2 instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        return z;
    }
}
