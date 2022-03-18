package com.ss.android.lark.ug.plugin.base;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.ug.plugin.ContainerServiceProvider;
import com.ss.android.lark.ug.plugin.ReachPoint;
import com.ss.android.lark.ug.plugin.ReachPointFactory;
import com.ss.android.lark.ug.plugin.ReachPointPluginException;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 **\u001c\b\u0000\u0010\u0001*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0002*+B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0004J\u0015\u0010&\u001a\u00020$2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0004R4\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "Lcom/ss/android/lark/ug/plugin/Hideable;", "reachPointId", "", "reachPointType", "(Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/ug/plugin/ContainerServiceProvider;", "containerServiceRef", "getContainerServiceRef", "()Ljava/lang/ref/WeakReference;", "setContainerServiceRef$ug_reach_sdk_release", "(Ljava/lang/ref/WeakReference;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Lcom/squareup/wire/Message;", "setData", "(Lcom/squareup/wire/Message;)V", "Lcom/squareup/wire/Message;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getReachPointId", "()Ljava/lang/String;", "getReachPointType", "decode", "bytes", "", "([B)Lcom/squareup/wire/Message;", "hide", "", "onReady", "onUpdateData", "reportEvent", "event", "Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent;", "Companion", "ReachPointEntry", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.a.a */
public abstract class BaseReachPoint<DATA extends Message<?, ?>> implements ReachPoint<DATA> {

    /* renamed from: e */
    public static final ConcurrentHashMap<Class<? extends ReachPoint<?>>, ReachPointEntry> f141735e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final Companion f141736f = new Companion(null);

    /* renamed from: a */
    private DATA f141737a;

    /* renamed from: b */
    private WeakReference<ContainerServiceProvider> f141738b;

    /* renamed from: c */
    private final String f141739c;

    /* renamed from: g */
    private final String f141740g;

    /* renamed from: b */
    public abstract ProtoAdapter<DATA> mo194540b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0000¢\u0006\u0002\b\u000fJ6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\u00052\u0012\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\u0015R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint$Companion;", "", "()V", "pluginMaps", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint$ReachPointEntry;", "createReachPoint", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "reachPoint", "reachPointId", "", "createReachPoint$ug_reach_sdk_release", "getReachPointType", "getReachPointType$ug_reach_sdk_release", "registerReachPoint", "", "reachPointType", "reachPointClazz", "factory", "Lcom/ss/android/lark/ug/plugin/ReachPointFactory;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo195221a(Class<? extends ReachPoint<?>> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "reachPoint");
            ReachPointEntry bVar = BaseReachPoint.f141735e.get(cls);
            if (bVar != null) {
                return bVar.mo195223a();
            }
            return null;
        }

        /* renamed from: a */
        public final BaseReachPoint<?> mo195220a(Class<? extends ReachPoint<?>> cls, String str) {
            ReachPointFactory<? extends BaseReachPoint<?>> b;
            Intrinsics.checkParameterIsNotNull(cls, "reachPoint");
            Intrinsics.checkParameterIsNotNull(str, "reachPointId");
            ReachPointEntry bVar = BaseReachPoint.f141735e.get(cls);
            if (bVar == null || (b = bVar.mo195224b()) == null) {
                return null;
            }
            return b.mo194547b(str);
        }

        /* renamed from: a */
        public final void mo195222a(String str, Class<? extends BaseReachPoint<?>> cls, ReachPointFactory<? extends BaseReachPoint<?>> fVar) {
            Intrinsics.checkParameterIsNotNull(str, "reachPointType");
            Intrinsics.checkParameterIsNotNull(cls, "reachPointClazz");
            Intrinsics.checkParameterIsNotNull(fVar, "factory");
            BaseReachPoint.f141735e.put(cls, new ReachPointEntry(str, cls, fVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\u0010\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint$ReachPointEntry;", "", "reachPointType", "", "reachPointClazz", "Ljava/lang/Class;", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "factory", "Lcom/ss/android/lark/ug/plugin/ReachPointFactory;", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "(Ljava/lang/String;Ljava/lang/Class;Lcom/ss/android/lark/ug/plugin/ReachPointFactory;)V", "getFactory", "()Lcom/ss/android/lark/ug/plugin/ReachPointFactory;", "getReachPointClazz", "()Ljava/lang/Class;", "getReachPointType", "()Ljava/lang/String;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.a.a$b */
    public static final class ReachPointEntry {

        /* renamed from: a */
        private final String f141741a;

        /* renamed from: b */
        private final Class<? extends ReachPoint<?>> f141742b;

        /* renamed from: c */
        private final ReachPointFactory<? extends BaseReachPoint<?>> f141743c;

        /* renamed from: a */
        public final String mo195223a() {
            return this.f141741a;
        }

        /* renamed from: b */
        public final ReachPointFactory<? extends BaseReachPoint<?>> mo195224b() {
            return this.f141743c;
        }

        public ReachPointEntry(String str, Class<? extends ReachPoint<?>> cls, ReachPointFactory<? extends BaseReachPoint<?>> fVar) {
            Intrinsics.checkParameterIsNotNull(str, "reachPointType");
            Intrinsics.checkParameterIsNotNull(cls, "reachPointClazz");
            Intrinsics.checkParameterIsNotNull(fVar, "factory");
            this.f141741a = str;
            this.f141742b = cls;
            this.f141743c = fVar;
        }
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: h */
    public String mo195214h() {
        return this.f141739c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final DATA mo195215i() {
        return this.f141737a;
    }

    /* renamed from: j */
    public final WeakReference<ContainerServiceProvider> mo195216j() {
        return this.f141738b;
    }

    /* renamed from: m */
    public final String mo195219m() {
        return this.f141740g;
    }

    /* renamed from: k */
    public void mo195217k() {
        ContainerServiceProvider bVar;
        WeakReference<ContainerServiceProvider> weakReference = this.f141738b;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.mo195236a(mo195214h(), this.f141740g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo195218l() {
        ContainerServiceProvider bVar;
        WeakReference<ContainerServiceProvider> weakReference = this.f141738b;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.mo195234a(new ReachPointEvent(mo195214h(), this.f141740g, new ReachPointEvent.Event("onReady", false, 2, null), null, null, 24, null), (IGetDataCallback<Boolean>) null);
        }
    }

    /* renamed from: a */
    public final void mo195213a(WeakReference<ContainerServiceProvider> weakReference) {
        this.f141738b = weakReference;
    }

    /* renamed from: a */
    public void mo194533a(DATA data) {
        Intrinsics.checkParameterIsNotNull(data, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f141737a = data;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo195212a(ReachPointEvent aVar) {
        ContainerServiceProvider bVar;
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        WeakReference<ContainerServiceProvider> weakReference = this.f141738b;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.mo195234a(aVar, (IGetDataCallback<Boolean>) null);
        }
    }

    /* renamed from: a */
    public DATA mo195211a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        try {
            DATA decode = mo194540b().decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "protoAdapter.decode(bytes)");
            return decode;
        } catch (Exception e) {
            throw new ReachPointPluginException("BaseReachPoint decode error", e);
        }
    }

    public BaseReachPoint(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        this.f141739c = str;
        this.f141740g = str2;
    }
}
