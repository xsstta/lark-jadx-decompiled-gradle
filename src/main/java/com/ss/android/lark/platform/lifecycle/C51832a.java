package com.ss.android.lark.platform.lifecycle;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a)\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\n\u001a0\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¨\u0006\u0013"}, d2 = {"fetchCurrentAppState", "Lcom/ss/android/lark/biz/core/api/ILifecycleObserver$AppStateInfo;", "context", "Landroid/content/Context;", "mCurrentProcessName", "", "pickTopProcess", "topProcesses", "", "currentProcess", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "removeFirstIf", "", "E", "list", "", "predicate", "Lkotlin/Function1;", "", "core-integrator_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.lifecycle.a */
public final class C51832a {
    /* renamed from: a */
    public static final String m200963a(String[] strArr, String str) {
        boolean z;
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || str == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (Intrinsics.areEqual(str, str2)) {
                return str;
            }
        }
        return strArr[0];
    }

    /* renamed from: a */
    public static final <E> void m200964a(List<E> list, Function1<? super E, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (T t : list) {
            if (function1.invoke(t).booleanValue()) {
                list.remove(t);
                return;
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC29586u.C29587a m200962a(Context context, String str) {
        boolean z;
        long j;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "mCurrentProcessName");
        List<AppLifecycle.ProcessRecord> a = AppLifecycle.LifecycleContentProvider.m200943a(context);
        List<AppLifecycle.ProcessRecord> list = a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            AbstractC29586u.C29587a a2 = AbstractC29586u.C29587a.m109237a(null, null, str, SystemClock.elapsedRealtime());
            Intrinsics.checkExpressionValueIsNotNull(a2, "AppStateInfo.create(null…mClock.elapsedRealtime())");
            return a2;
        }
        List<AppLifecycle.ProcessRecord> list2 = a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f128808a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            AppLifecycle.ProcessRecord processRecord = a.get(0);
            if (processRecord != null) {
                str2 = processRecord.f128809b;
            }
            AppLifecycle.ProcessRecord processRecord2 = a.get(0);
            if (processRecord2 != null) {
                j = processRecord2.f128810c;
            } else {
                j = SystemClock.elapsedRealtime();
            }
            AbstractC29586u.C29587a a3 = AbstractC29586u.C29587a.m109237a(m200963a(strArr, str), str2, str, j);
            Intrinsics.checkExpressionValueIsNotNull(a3, "AppStateInfo.create(pick…ntProcessName, timestamp)");
            return a3;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
