package com.ss.android.lark.log.alog;

import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.ALogConfig;
import com.ss.android.lark.log.C41702d;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0006\u0010\f\u001a\u00020\u0004J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ$\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ+\u0010\u0010\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\"\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\"\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u001d\u001a\u00020\u0004J/\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 ¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010$J\"\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010&\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u001a\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ$\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006)"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogDelegate;", "", "()V", "bundle", "", "priority", "", "tag", "", "Landroid/os/Bundle;", C63690d.f160779a, "msg", "destroy", "e", "tr", "", "filter", "", "level", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z", "flush", "forceLogSharding", "getLogConfig", "Lcom/ss/android/lark/log/LogConfig;", "header", "i", "intent", "Landroid/content/Intent;", "json", "release", "statcktrace", "traceElements", "", "Ljava/lang/StackTraceElement;", "(ILjava/lang/String;[Ljava/lang/StackTraceElement;)V", "thread", "Ljava/lang/Thread;", "throwable", "v", "w", "Companion", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.a */
public final class ALogDelegate {

    /* renamed from: a */
    public static volatile ALogDelegate f105870a;

    /* renamed from: b */
    public static volatile C41702d f105871b;

    /* renamed from: c */
    public static volatile int f105872c = 251658240;

    /* renamed from: d */
    public static volatile int f105873d = 2;

    /* renamed from: e */
    public static volatile List<String> f105874e = new ArrayList();

    /* renamed from: f */
    public static volatile Regex f105875f;

    /* renamed from: g */
    public static final Companion f105876g = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\""}, d2 = {"Lcom/ss/android/lark/log/alog/ALogDelegate$Companion;", "", "()V", "PER_SIZE", "", "sALogDelegate", "Lcom/ss/android/lark/log/alog/ALogDelegate;", "sLimitMsgRegex", "Lkotlin/text/Regex;", "getSLimitMsgRegex", "()Lkotlin/text/Regex;", "setSLimitMsgRegex", "(Lkotlin/text/Regex;)V", "sLimitTag", "", "", "getSLimitTag", "()Ljava/util/List;", "setSLimitTag", "(Ljava/util/List;)V", "sLogConfig", "Lcom/ss/android/lark/log/LogConfig;", "sMaxDirSize", "getSMaxDirSize", "()I", "setSMaxDirSize", "(I)V", "sMinLevel", "getSMinLevel", "setSMinLevel", "get", "init", "", "logConfig", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo149931a() {
            return ALogDelegate.f105872c;
        }

        /* renamed from: b */
        public final List<String> mo149935b() {
            return ALogDelegate.f105874e;
        }

        @JvmStatic
        /* renamed from: c */
        public final ALogDelegate mo149937c() {
            return ALogDelegate.f105870a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo149932a(int i) {
            ALogDelegate.f105872c = i;
        }

        /* renamed from: b */
        public final void mo149936b(int i) {
            ALogDelegate.f105873d = i;
        }

        /* renamed from: a */
        public final void mo149934a(Regex regex) {
            ALogDelegate.f105875f = regex;
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized void mo149933a(C41702d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
            if (ALogDelegate.f105870a == null) {
                ALogDelegate.f105870a = new ALogDelegate();
                ALogDelegate.f105871b = dVar;
                boolean z = dVar.f105911h;
                if (!z) {
                    ALogDynamicConfigManager.f105877a.mo149940a().mo149939a(dVar);
                    ALogReporter.f105882b.mo149948a().mo149943a(dVar);
                }
                ALogConfig a = new ALogConfig.C27504a(dVar.f105904a).mo98124a(ALogUtils.f105895a.mo149958b(dVar)).mo98123a(mo149931a()).mo98127b(2097152).mo98125a(true).mo98128b(true).mo98126a();
                ALog.setDebug(z);
                ALog.init(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/log/alog/ALogDelegate$d$1", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "onSplit", "", "tag", "", "msg", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$b */
    public static final class C41688b implements ISplitCallback {
        C41688b() {
        }

        @Override // com.ss.android.lark.log.alog.ISplitCallback
        /* renamed from: a */
        public void mo149938a(String str, String str2) {
            ALog.m100416d(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/log/alog/ALogDelegate$e$1", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "onSplit", "", "tag", "", "msg", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$c */
    public static final class C41689c implements ISplitCallback {
        C41689c() {
        }

        @Override // com.ss.android.lark.log.alog.ISplitCallback
        /* renamed from: a */
        public void mo149938a(String str, String str2) {
            ALog.m100417e(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/log/alog/ALogDelegate$i$1", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "onSplit", "", "tag", "", "msg", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$d */
    public static final class C41690d implements ISplitCallback {
        C41690d() {
        }

        @Override // com.ss.android.lark.log.alog.ISplitCallback
        /* renamed from: a */
        public void mo149938a(String str, String str2) {
            ALog.m100420i(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/log/alog/ALogDelegate$v$1", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "onSplit", "", "tag", "", "msg", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$e */
    public static final class C41691e implements ISplitCallback {
        C41691e() {
        }

        @Override // com.ss.android.lark.log.alog.ISplitCallback
        /* renamed from: a */
        public void mo149938a(String str, String str2) {
            ALog.m100421v(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/log/alog/ALogDelegate$w$1", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "onSplit", "", "tag", "", "msg", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.a$f */
    public static final class C41692f implements ISplitCallback {
        C41692f() {
        }

        @Override // com.ss.android.lark.log.alog.ISplitCallback
        /* renamed from: a */
        public void mo149938a(String str, String str2) {
            ALog.m100422w(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo149926b(String str, String str2) {
        if (m165416a(str, str2, (Integer) 3)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            if (ALogReporter.f105882b.mo149948a().mo149947b(str2)) {
                ALogReporter.f105882b.mo149948a().mo149946a(str, str2, new C41688b());
            } else {
                ALog.m100416d(str, str2);
            }
        }
    }

    /* renamed from: c */
    public final void mo149928c(String str, String str2) {
        if (m165416a(str, str2, (Integer) 4)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            if (ALogReporter.f105882b.mo149948a().mo149947b(str2)) {
                ALogReporter.f105882b.mo149948a().mo149946a(str, str2, new C41690d());
            } else {
                ALog.m100420i(str, str2);
            }
        }
    }

    /* renamed from: d */
    public final void mo149929d(String str, String str2) {
        if (m165416a(str, str2, (Integer) 5)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            if (ALogReporter.f105882b.mo149948a().mo149947b(str2)) {
                ALogReporter.f105882b.mo149948a().mo149946a(str, str2, new C41692f());
            } else {
                ALog.m100422w(str, str2);
            }
        }
    }

    /* renamed from: e */
    public final void mo149930e(String str, String str2) {
        if (m165416a(str, str2, (Integer) 6)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            if (ALogReporter.f105882b.mo149948a().mo149947b(str2)) {
                ALogReporter.f105882b.mo149948a().mo149946a(str, str2, new C41689c());
            } else {
                ALog.m100417e(str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo149924a(String str, String str2) {
        if (m165416a(str, str2, (Integer) 2)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            if (ALogReporter.f105882b.mo149948a().mo149947b(str2)) {
                ALogReporter.f105882b.mo149948a().mo149946a(str, str2, new C41691e());
            } else {
                ALog.m100421v(str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo149925a(String str, String str2, Throwable th) {
        if (m165416a(str, str2, (Integer) 5)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            ALog.m100423w(str, str2, th);
        }
    }

    /* renamed from: b */
    public final void mo149927b(String str, String str2, Throwable th) {
        if (m165416a(str, str2, (Integer) 6)) {
            ALogReporter.f105882b.mo149948a().mo149945a(str, str2);
            ALog.m100418e(str, str2, th);
        }
    }

    /* renamed from: a */
    private final boolean m165416a(String str, String str2, Integer num) {
        Regex regex;
        if (!(str == null || str2 == null || (num != null && num.intValue() < f105873d))) {
            if (f105874e.size() == 0 || !f105874e.contains(str)) {
                return true;
            }
            if (!f105874e.contains(str) || ((regex = f105875f) != null && regex.containsMatchIn(str2))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
