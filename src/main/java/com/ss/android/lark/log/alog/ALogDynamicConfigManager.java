package com.ss.android.lark.log.alog;

import android.text.TextUtils;
import com.ss.android.lark.log.C41702d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager;", "", "()V", "sInited", "", "sLogConfig", "Lcom/ss/android/lark/log/LogConfig;", "init", "", "logConfig", "updateRuntime", "Companion", "SingletonHolder", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.b */
public final class ALogDynamicConfigManager {

    /* renamed from: a */
    public static final Companion f105877a = new Companion(null);

    /* renamed from: b */
    private volatile boolean f105878b;

    /* renamed from: c */
    private C41702d f105879c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager$Companion;", "", "()V", "getInstance", "Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager;", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ALogDynamicConfigManager mo149940a() {
            return SingletonHolder.f105880a.mo149941a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager$SingletonHolder;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager;", "getINSTANCE", "()Lcom/ss/android/lark/log/alog/ALogDynamicConfigManager;", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.b$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f105880a = new SingletonHolder();

        /* renamed from: b */
        private static final ALogDynamicConfigManager f105881b = new ALogDynamicConfigManager();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final ALogDynamicConfigManager mo149941a() {
            return f105881b;
        }
    }

    /* renamed from: a */
    private final void m165436a() {
        ALogUtils dVar = ALogUtils.f105895a;
        C41702d dVar2 = this.f105879c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
        }
        ProcessItemConfig c = dVar.mo149959c(dVar2);
        ALogDelegate.f105876g.mo149932a(c.getMaxSize() * 1024 * 1024);
        ALogDelegate.f105876g.mo149936b(c.getLevel());
        ALogDelegate.f105876g.mo149935b().clear();
        ALogDelegate.f105876g.mo149935b().addAll(c.getLimitTag());
        if (!TextUtils.isEmpty(c.getLimitMsgRegex())) {
            ALogDelegate.f105876g.mo149934a(new Regex(c.getLimitMsgRegex()));
        } else {
            ALogDelegate.f105876g.mo149934a((Regex) null);
        }
    }

    /* renamed from: a */
    public final void mo149939a(C41702d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        if (!this.f105878b) {
            this.f105879c = dVar;
            m165436a();
            this.f105878b = true;
        }
    }
}
