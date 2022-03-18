package com.ss.lark.android.passport.biz.feature.session;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001H\u0002J>\u0010\u0019\u001a\u00020\r26\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R~\u0010\u0005\u001ar\u00124\u00122\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00070\u0006j8\u00124\u00122\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/BitFlagHelper;", "", "()V", "flag", "", "flagStatusChangeListeners", "Ljava/util/LinkedHashSet;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "flagOn", "key", "", "Lkotlin/collections/LinkedHashSet;", "isFlagOn", "()Z", "maskProvider", "registeredKeys", "", "bitOff", "bitOn", "openKeys", "", "registerKeyIfNeeded", "registerOnStatusChangeListener", "receiver", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.session.a */
public final class BitFlagHelper {

    /* renamed from: a */
    public static final Companion f163651a = new Companion(null);

    /* renamed from: b */
    private volatile int f163652b;

    /* renamed from: c */
    private volatile int f163653c;

    /* renamed from: d */
    private final Map<Object, Integer> f163654d = new LinkedHashMap();

    /* renamed from: e */
    private final LinkedHashSet<Function2<Boolean, Object, Unit>> f163655e = new LinkedHashSet<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/BitFlagHelper$Companion;", "", "()V", "FLAG_BASE", "", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo223960a() {
        boolean z;
        if (this.f163652b != 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private final Collection<Object> m255004b() {
        boolean z;
        if (!mo223960a()) {
            return CollectionsKt.emptyList();
        }
        Map<Object, Integer> map = this.f163654d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, Integer> entry : map.entrySet()) {
            if ((this.f163652b & entry.getValue().intValue()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    /* renamed from: a */
    public final void mo223959a(Function2<? super Boolean, Object, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "receiver");
        this.f163655e.add(kVar);
    }

    /* renamed from: c */
    private final int m255005c(Object obj) {
        Map<Object, Integer> map = this.f163654d;
        Integer num = map.get(obj);
        if (num == null) {
            this.f163653c++;
            num = Integer.valueOf(1 << this.f163653c);
            map.put(obj, num);
        }
        int intValue = num.intValue();
        if (this.f163653c >= 32) {
            PassportLog.f123351c.mo171474a().mo171471d("BitFlagHelper", "register too many mask, registered: " + this.f163654d.keySet());
        }
        return intValue;
    }

    /* renamed from: a */
    public final synchronized boolean mo223961a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        boolean a = mo223960a();
        this.f163652b = m255005c(obj) | this.f163652b;
        Log.m165389i("BitFlagHelper", "flag on, key: " + obj + ", bits: " + m255004b());
        if (a != mo223960a()) {
            Iterator<T> it = this.f163655e.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.valueOf(mo223960a()), obj);
            }
        }
        return mo223960a();
    }

    /* renamed from: b */
    public final synchronized boolean mo223962b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        boolean a = mo223960a();
        int c = m255005c(obj);
        this.f163652b = (~c) & this.f163652b;
        Log.m165389i("BitFlagHelper", "flag off, clazz: " + obj + ", bits: " + m255004b());
        if (a != mo223960a()) {
            Iterator<T> it = this.f163655e.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.valueOf(mo223960a()), obj);
            }
        }
        return mo223960a();
    }
}
