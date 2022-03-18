package com.ss.android.lark.platform.diskmanage;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "getSettingKey", "", "getTag", "Companion", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.h.d */
public final class DiskMonitorSettingHandler extends AbstractBaseSettingHandler {

    /* renamed from: a */
    public static final Companion f128762a = new Companion(null);

    @JvmStatic
    /* renamed from: d */
    public static final DiskMonitorSettingHandler m200859d() {
        return f128762a.mo177944a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "storage_monitor_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "DiskMonitorSettingHandler";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler$Companion;", "", "()V", "KEY_STORAGE_MONITOR_SETTING", "", "SETTING_KEY", "TAG", "getInstance", "Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.d$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final DiskMonitorSettingHandler mo177944a() {
            return SingletonHolder.f128763a.mo177945a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler;", "getInstance", "()Lcom/ss/android/lark/platform/diskmanage/DiskMonitorSettingHandler;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.d$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f128763a = new SingletonHolder();

        /* renamed from: b */
        private static final DiskMonitorSettingHandler f128764b = new DiskMonitorSettingHandler();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DiskMonitorSettingHandler mo177945a() {
            return f128764b;
        }
    }

    public DiskMonitorSettingHandler() {
        mo148402a(mo148411i().mo148421a(new Function1<String, Unit>(this) {
            /* class com.ss.android.lark.platform.diskmanage.DiskMonitorSettingHandler.C518121 */
            final /* synthetic */ DiskMonitorSettingHandler this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                if (str != null) {
                    Log.m165389i("DiskMonitorSettingHandler", "remote setting update: " + str);
                    this.this$0.mo148403a(str, "key_storage_monitor_setting");
                }
            }
        }));
    }
}
