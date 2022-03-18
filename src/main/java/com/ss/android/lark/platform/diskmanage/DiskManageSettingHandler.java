package com.ss.android.lark.platform.diskmanage;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "getSettingKey", "", "getTag", "Companion", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.h.c */
public final class DiskManageSettingHandler extends AbstractBaseSettingHandler {

    /* renamed from: a */
    public static final Companion f128759a = new Companion(null);

    @JvmStatic
    /* renamed from: d */
    public static final DiskManageSettingHandler m200854d() {
        return f128759a.mo177941a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "global_clean_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "DiskManageSettingHandler";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler$Companion;", "", "()V", "KEY_DISK_MANAGE_SETTING", "", "SETTING_KEY", "TAG", "getInstance", "Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final DiskManageSettingHandler mo177941a() {
            return SingletonHolder.f128760a.mo177942a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler;", "getInstance", "()Lcom/ss/android/lark/platform/diskmanage/DiskManageSettingHandler;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.c$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f128760a = new SingletonHolder();

        /* renamed from: b */
        private static final DiskManageSettingHandler f128761b = new DiskManageSettingHandler();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DiskManageSettingHandler mo177942a() {
            return f128761b;
        }
    }

    public DiskManageSettingHandler() {
        mo148402a(mo148411i().mo148421a(new Function1<String, Unit>(this) {
            /* class com.ss.android.lark.platform.diskmanage.DiskManageSettingHandler.C518111 */
            final /* synthetic */ DiskManageSettingHandler this$0;

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
                    Log.m165389i("DiskManageSettingHandler", "remote setting update: " + str);
                    this.this$0.mo148403a(str, "key_disk_manage_setting");
                }
            }
        }));
    }
}
