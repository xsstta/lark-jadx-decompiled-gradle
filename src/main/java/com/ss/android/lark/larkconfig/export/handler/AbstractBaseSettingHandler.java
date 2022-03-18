package com.ss.android.lark.larkconfig.export.handler;

import android.text.TextUtils;
import com.ss.android.lark.appsetting.api.InternalLocalDefaultConfigStorage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0018\u001a\u00020\b2\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u0002H\u0014J\b\u0010!\u001a\u00020\u0002H&J\b\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020\bH\u0014J\b\u0010%\u001a\u00020\u001cH\u0014J\u0006\u0010&\u001a\u00020\u001cJ \u0010'\u001a\u00020\u001c2\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u001aJ\u0016\u0010(\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0007J\u0016\u0010)\u001a\u00020**\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020*H\u0007J&\u0010+\u001a\n\u0012\u0004\u0012\u0002H-\u0018\u00010,\"\u0004\b\u0000\u0010-*\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/J\u0016\u00100\u001a\u000201*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u000201H\u0007J\u0016\u00102\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0007J\u0016\u00103\u001a\u00020\u001c*\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0002H\u0007J\u0016\u00103\u001a\u00020\u001c*\u00020*2\b\b\u0002\u00104\u001a\u00020\u0002H\u0007J\u0016\u00103\u001a\u00020\u001c*\u0002012\b\b\u0002\u00104\u001a\u00020\u0002H\u0007J\u0016\u00103\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u0002H\u0007J\"\u00103\u001a\u00020\u001c\"\u0004\b\u0000\u0010-*\b\u0012\u0004\u0012\u0002H-0,2\b\b\u0002\u00104\u001a\u00020\u0002H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00067"}, d2 = {"Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/IBaseSettingHandler;", "", "()V", "defaultStrategy", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$Strategy;", "defaultValue", "mIsInitByRemote", "", "mIsLoadFromStatic", "mixedStrategy", "getMixedStrategy", "()Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$Strategy;", "softStrategy", "getSoftStrategy", "strategies", "getStrategies", "setStrategies", "(Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$Strategy;)V", "value", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "checkMap", "settingsMap", "", "checkValue", "", "getLocalValue", "getSP", "Lcom/ss/android/lark/sp/ISharedPreferences;", "getSPKey", "getTag", "isSettingFromLocalEnable", "isSettingFromRemoteEnable", "isSynchronized", "removeSPKey", "setSettingFromLocal", "setSettingFromRemote", "getBoolean", "getInt", "", "getJSONArray", "", "E", "clazz", "Ljava/lang/Class;", "getLong", "", "getString", "put", "key", "Strategy", "UserSPCachedSettingHandler", "larkconfig-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.export.b.a */
public abstract class AbstractBaseSettingHandler implements IBaseSettingHandler<String> {

    /* renamed from: a */
    private String f104930a;

    /* renamed from: b */
    public boolean f104931b;

    /* renamed from: c */
    private String f104932c;

    /* renamed from: d */
    private final Strategy f104933d;

    /* renamed from: e */
    private final Strategy f104934e;

    /* renamed from: f */
    private final Strategy f104935f;

    /* renamed from: g */
    private Strategy f104936g;

    /* renamed from: h */
    private boolean f104937h;

    /* renamed from: c */
    public abstract String mo107774c();

    /* renamed from: c */
    public final void mo148409c(String str) {
        m163275a(this, str, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo148413k() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u0003\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006J\u0018\u0010\u0017\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006J\u0018\u0010\u0018\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006J\u0018\u0010\u0019\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u0019\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003HÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u0003HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003HÆ\u0003J\u0006\u0010\"\u001a\u00020\u0000J£\u0001\u0010\"\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00032\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001J#\u0010(\u001a\u00020\u0000\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0\u00032\u0006\u0010*\u001a\u0002H)¢\u0006\u0002\u0010+R!\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R!\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R!\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006,"}, d2 = {"Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$Strategy;", "", "isProcessRemoteSettingStrategies", "", "Lkotlin/Function0;", "", "Lcom/ss/android/lark/larkconfig/export/handler/Continue;", "emptyMapStrategies", "emptyRemoteSettingStrategies", "processRemoteSetting", "Lkotlin/Function1;", "", "", "isProcessLocalSettingStrategies", "processLocalSettingStrategies", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEmptyMapStrategies", "()Ljava/util/List;", "getEmptyRemoteSettingStrategies", "getProcessLocalSettingStrategies", "getProcessRemoteSetting", "appendEmptyMapStrategies", "strategy", "appendEmptyRemoteSettingStrategies", "appendIsProcessLocalSettingStrategies", "appendIsProcessRemoteSettingStrategies", "appendProcessLocalSettingStrategies", "appendProcessRemoteSettingStrategies", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "append", "T", "t", "(Ljava/util/List;Ljava/lang/Object;)Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$Strategy;", "larkconfig-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$a */
    public static final class Strategy {

        /* renamed from: a */
        private final List<Function0<Boolean>> f104938a;

        /* renamed from: b */
        private final List<Function0<Boolean>> f104939b;

        /* renamed from: c */
        private final List<Function0<Boolean>> f104940c;

        /* renamed from: d */
        private final List<Function1<String, Unit>> f104941d;

        /* renamed from: e */
        private final List<Function0<Boolean>> f104942e;

        /* renamed from: f */
        private final List<Function0<Unit>> f104943f;

        public Strategy() {
            this(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Strategy)) {
                return false;
            }
            Strategy aVar = (Strategy) obj;
            return Intrinsics.areEqual(this.f104938a, aVar.f104938a) && Intrinsics.areEqual(this.f104939b, aVar.f104939b) && Intrinsics.areEqual(this.f104940c, aVar.f104940c) && Intrinsics.areEqual(this.f104941d, aVar.f104941d) && Intrinsics.areEqual(this.f104942e, aVar.f104942e) && Intrinsics.areEqual(this.f104943f, aVar.f104943f);
        }

        public int hashCode() {
            List<Function0<Boolean>> list = this.f104938a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<Function0<Boolean>> list2 = this.f104939b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<Function0<Boolean>> list3 = this.f104940c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<Function1<String, Unit>> list4 = this.f104941d;
            int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
            List<Function0<Boolean>> list5 = this.f104942e;
            int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
            List<Function0<Unit>> list6 = this.f104943f;
            if (list6 != null) {
                i = list6.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            return "Strategy(isProcessRemoteSettingStrategies=" + this.f104938a + ", emptyMapStrategies=" + this.f104939b + ", emptyRemoteSettingStrategies=" + this.f104940c + ", processRemoteSetting=" + this.f104941d + ", isProcessLocalSettingStrategies=" + this.f104942e + ", processLocalSettingStrategies=" + this.f104943f + ")";
        }

        /* renamed from: b */
        public final List<Function0<Boolean>> mo148423b() {
            return this.f104938a;
        }

        /* renamed from: c */
        public final List<Function0<Boolean>> mo148425c() {
            return this.f104939b;
        }

        /* renamed from: d */
        public final List<Function0<Boolean>> mo148427d() {
            return this.f104940c;
        }

        /* renamed from: e */
        public final List<Function1<String, Unit>> mo148429e() {
            return this.f104941d;
        }

        /* renamed from: f */
        public final List<Function0<Boolean>> mo148431f() {
            return this.f104942e;
        }

        /* renamed from: g */
        public final List<Function0<Unit>> mo148432g() {
            return this.f104943f;
        }

        /* renamed from: a */
        public final Strategy mo148418a() {
            return new Strategy(new LinkedList(this.f104938a), new LinkedList(this.f104939b), new LinkedList(this.f104940c), new LinkedList(this.f104941d), new LinkedList(this.f104942e), new LinkedList(this.f104943f));
        }

        /* renamed from: b */
        public final Strategy mo148422b(Function0<Boolean> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "strategy");
            return mo148419a(this.f104939b, function0);
        }

        /* renamed from: c */
        public final Strategy mo148424c(Function0<Boolean> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "strategy");
            return mo148419a(this.f104940c, function0);
        }

        /* renamed from: d */
        public final Strategy mo148426d(Function0<Boolean> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "strategy");
            return mo148419a(this.f104942e, function0);
        }

        /* renamed from: e */
        public final Strategy mo148428e(Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "strategy");
            return mo148419a(this.f104943f, function0);
        }

        /* renamed from: a */
        public final Strategy mo148420a(Function0<Boolean> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "strategy");
            return mo148419a(this.f104938a, function0);
        }

        /* renamed from: a */
        public final Strategy mo148421a(Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "strategy");
            return mo148419a(this.f104941d, function1);
        }

        /* renamed from: a */
        public final <T> Strategy mo148419a(List<T> list, T t) {
            Intrinsics.checkParameterIsNotNull(list, "$this$append");
            list.add(t);
            return this;
        }

        public Strategy(List<Function0<Boolean>> list, List<Function0<Boolean>> list2, List<Function0<Boolean>> list3, List<Function1<String, Unit>> list4, List<Function0<Boolean>> list5, List<Function0<Unit>> list6) {
            Intrinsics.checkParameterIsNotNull(list, "isProcessRemoteSettingStrategies");
            Intrinsics.checkParameterIsNotNull(list2, "emptyMapStrategies");
            Intrinsics.checkParameterIsNotNull(list3, "emptyRemoteSettingStrategies");
            Intrinsics.checkParameterIsNotNull(list4, "processRemoteSetting");
            Intrinsics.checkParameterIsNotNull(list5, "isProcessLocalSettingStrategies");
            Intrinsics.checkParameterIsNotNull(list6, "processLocalSettingStrategies");
            this.f104938a = list;
            this.f104939b = list2;
            this.f104940c = list3;
            this.f104941d = list4;
            this.f104942e = list5;
            this.f104943f = list6;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Strategy(List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedList() : list, (i & 2) != 0 ? new LinkedList() : list2, (i & 4) != 0 ? new LinkedList() : list3, (i & 8) != 0 ? new LinkedList() : list4, (i & 16) != 0 ? new LinkedList() : list5, (i & 32) != 0 ? new LinkedList() : list6);
        }
    }

    /* renamed from: i */
    public final Strategy mo148411i() {
        return this.f104933d;
    }

    /* renamed from: j */
    public final Strategy mo148412j() {
        return this.f104934e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$c */
    static final class C41153c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41153c(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.this$0.mo148416n();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$d */
    static final class C41154d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41154d(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.this$0.mo148416n();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$i */
    static final class C41159i extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41159i(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return !this.this$0.f104931b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$UserSPCachedSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "getSP", "Lcom/ss/android/lark/sp/ISharedPreferences;", "larkconfig-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$b */
    public static abstract class UserSPCachedSettingHandler extends AbstractBaseSettingHandler {
        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
        /* renamed from: m */
        public AbstractC54924a mo148415m() {
            UserSP instance = UserSP.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "UserSP.getInstance()");
            return instance;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$f */
    static final class C41156f extends Lambda implements Function0<Unit> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41156f(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AbstractBaseSettingHandler aVar = this.this$0;
            aVar.mo148408b(aVar.mo148417o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AbstractC54924a mo148415m() {
        C57744a a = C57744a.m224104a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GlobalSP.getInstance()");
        return a;
    }

    /* renamed from: n */
    public void mo148416n() {
        mo148415m().remove(mo107773b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$g */
    static final class C41157g extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41157g(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Log.m165397w(this.this$0.mo107774c(), "setting map is null");
            return false;
        }
    }

    /* renamed from: o */
    public final String mo148417o() {
        String b = m163277b(this, mo107773b(), null, 1, null);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return mo148410h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$h */
    static final class C41158h extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41158h(AbstractBaseSettingHandler aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String c = this.this$0.mo107774c();
            Log.m165397w(c, "setting value is empty, key: " + this.this$0.mo107772a());
            return false;
        }
    }

    /* renamed from: d */
    private final boolean mo136183d() {
        boolean z = false;
        for (Function0<Boolean> function0 : this.f104936g.mo148423b()) {
            if (!function0.invoke().booleanValue()) {
                z = true;
            }
        }
        return !z;
    }

    /* renamed from: f */
    private final boolean mo107776f() {
        boolean z = false;
        for (Function0<Boolean> function0 : this.f104936g.mo148431f()) {
            if (!function0.invoke().booleanValue()) {
                z = true;
            }
        }
        return !z;
    }

    /* renamed from: h */
    public final String mo148410h() {
        String str;
        String str2 = this.f104930a;
        if (str2 != null) {
            return str2;
        }
        if (!this.f104937h && this.f104932c == null) {
            this.f104937h = true;
            String a = mo107772a();
            if (a != null) {
                str = InternalLocalDefaultConfigStorage.f73150e.mo103616a().mo103611a(a);
            } else {
                str = null;
            }
            this.f104932c = str;
        }
        return this.f104932c;
    }

    /* renamed from: l */
    public final void mo148414l() {
        if (!mo107776f()) {
            Log.m165379d(mo107774c(), "setting from local not allowed");
            return;
        }
        Iterator<T> it = this.f104936g.mo148432g().iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
    }

    public AbstractBaseSettingHandler() {
        Strategy d = new Strategy(null, null, null, null, null, null, 63, null).mo148422b(new C41157g(this)).mo148424c(new C41158h(this)).mo148426d(new C41159i(this));
        this.f104933d = d;
        Strategy e = d.mo148418a().mo148421a(new C41155e(this)).mo148428e(new C41156f(this));
        this.f104934e = e;
        Strategy c = e.mo148418a().mo148422b(new C41153c(this)).mo148424c(new C41154d(this));
        this.f104935f = c;
        this.f104936g = c;
    }

    /* renamed from: e */
    private final void mo107775e() {
        if (TextUtils.isEmpty(mo148410h())) {
            boolean z = false;
            for (Function0<Boolean> function0 : this.f104936g.mo148427d()) {
                if (!function0.invoke().booleanValue()) {
                    z = true;
                }
            }
            if (z) {
                Log.m165389i(mo107774c(), "value is not valid");
                return;
            }
        }
        if (mo148410h() == null) {
            Log.m165389i(mo107774c(), "value is null");
            return;
        }
        this.f104931b = true;
        for (T t : this.f104936g.mo148429e()) {
            String h = mo148410h();
            if (h != null) {
                t.invoke(h);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo107773b() {
        return mo107774c() + mo107772a();
    }

    /* renamed from: b */
    public final void mo148408b(String str) {
        this.f104930a = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.export.b.a$e */
    static final class C41155e extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ AbstractBaseSettingHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41155e(AbstractBaseSettingHandler aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            AbstractBaseSettingHandler.m163275a(this.this$0, str, (String) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo148402a(Strategy aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f104936g = aVar;
    }

    /* renamed from: b */
    private final boolean m163278b(Map<String, String> map) {
        if (map != null) {
            return true;
        }
        boolean z = false;
        for (Function0<Boolean> function0 : this.f104936g.mo148425c()) {
            if (!function0.invoke().booleanValue()) {
                z = true;
            }
        }
        return !z;
    }

    /* renamed from: a */
    public final void mo148405a(Map<String, String> map) {
        Log.m165379d(mo107774c(), "setting handler start set setting from remote");
        if (!mo136183d()) {
            Log.m165379d(mo107774c(), "setting from remote not allowed");
        } else if (!m163278b(map)) {
            Log.m165389i(mo107774c(), "map is not valid");
        } else if (map == null) {
            Log.m165389i(mo107774c(), "value is null");
        } else {
            this.f104930a = map.get(mo107772a());
            if (mo148413k()) {
                synchronized (this) {
                    mo107775e();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            mo107775e();
        }
    }

    /* renamed from: a */
    public final long mo148399a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "$this$getLong");
        return mo148415m().getLong(str, j);
    }

    /* renamed from: a */
    public final <E> List<E> mo148400a(String str, Class<E> cls) {
        Intrinsics.checkParameterIsNotNull(str, "$this$getJSONArray");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return mo148415m().getJSONArray(str, cls);
    }

    /* renamed from: a */
    public final void mo148401a(long j, String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo148415m().putLong(str, j);
    }

    /* renamed from: b */
    public final String mo148407b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$getString");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        String string = mo148415m().getString(str, str2);
        return string != null ? string : str2;
    }

    /* renamed from: a */
    public final void mo148403a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$put");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        mo148415m().putString(str2, str);
    }

    /* renamed from: a */
    public final <E> void mo148404a(List<? extends E> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "$this$put");
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo148415m().putJSONArray(str, list);
    }

    /* renamed from: a */
    public final void mo148406a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo148415m().putBoolean(str, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m163275a(AbstractBaseSettingHandler aVar, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str2 = aVar.mo107773b();
            }
            aVar.mo148403a(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
    }

    /* renamed from: b */
    public static /* synthetic */ String m163277b(AbstractBaseSettingHandler aVar, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str2 = "";
            }
            return aVar.mo148407b(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
    }

    /* renamed from: a */
    public static /* synthetic */ void m163276a(AbstractBaseSettingHandler aVar, boolean z, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = aVar.mo107773b();
            }
            aVar.mo148406a(z, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
    }
}
