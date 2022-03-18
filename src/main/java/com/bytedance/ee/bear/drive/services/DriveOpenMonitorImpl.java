package com.bytedance.ee.bear.drive.services;

import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006R'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/services/DriveOpenMonitorImpl;", "", "()V", "driveOpenMonitors", "", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ee/bear/drive/services/DriveService$IDriveOpenMonitor;", "getDriveOpenMonitors", "()Ljava/util/List;", "driveOpenMonitors$delegate", "Lkotlin/Lazy;", "notifyOpenFinish", "", "registerOpenMonitor", "driveOpenMonitor", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.services.k */
public final class DriveOpenMonitorImpl {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f19301a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DriveOpenMonitorImpl.class), "driveOpenMonitors", "getDriveOpenMonitors()Ljava/util/List;"))};

    /* renamed from: b */
    public static final DriveOpenMonitorImpl f19302b = new DriveOpenMonitorImpl();

    /* renamed from: c */
    private static final Lazy f19303c = LazyKt.lazy(C7183a.INSTANCE);

    /* renamed from: b */
    private final List<WeakReference<AbstractC7184l.AbstractC7187c>> m28795b() {
        Lazy lazy = f19303c;
        KProperty kProperty = f19301a[0];
        return (List) lazy.getValue();
    }

    private DriveOpenMonitorImpl() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ee/bear/drive/services/DriveService$IDriveOpenMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.services.k$a */
    static final class C7183a extends Lambda implements Function0<List<WeakReference<AbstractC7184l.AbstractC7187c>>> {
        public static final C7183a INSTANCE = new C7183a();

        C7183a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<WeakReference<AbstractC7184l.AbstractC7187c>> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final void mo28169a() {
        Iterator<T> it = m28795b().iterator();
        while (it.hasNext()) {
            AbstractC7184l.AbstractC7187c cVar = (AbstractC7184l.AbstractC7187c) it.next().get();
            if (cVar != null) {
                cVar.onOpenFinish();
            }
        }
    }

    /* renamed from: a */
    public final void mo28170a(AbstractC7184l.AbstractC7187c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "driveOpenMonitor");
        m28795b().add(new WeakReference<>(cVar));
    }
}
