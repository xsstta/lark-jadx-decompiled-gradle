package com.bytedance.ies.bullet.service.base.api;

import android.util.Log;
import com.bytedance.ies.bullet.service.base.ILoggerService;
import kotlin.C69097g;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.bullet.service.base.api.f */
public interface ILoggable {

    /* renamed from: c */
    public static final Companion f37867c = Companion.f37868a;

    LoggerWrapper getLoggerWrapper();

    void printLog(String str, LogLevel logLevel, String str2);

    void printReject(Throwable th, String str);

    /* renamed from: com.bytedance.ies.bullet.service.base.api.f$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f37868a = new Companion();

        private Companion() {
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.api.f$b */
    public static final class C14411b {
        /* renamed from: a */
        public static void m58026a(ILoggable fVar, Throwable th, String str) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(th, "e");
            Intrinsics.checkParameterIsNotNull(str, "extraMsg");
            try {
                Result.Companion aVar = Result.Companion;
                ILoggerService a = fVar.getLoggerWrapper().mo52660a();
                if (a == null) {
                    obj = Integer.valueOf(Log.e("bullet", "onReject: " + th.getMessage()));
                } else {
                    a.mo33920a(th, str);
                    obj = Unit.INSTANCE;
                }
                Result.m271569constructorimpl(obj);
            } catch (Throwable th2) {
                Result.Companion aVar2 = Result.Companion;
                Result.m271569constructorimpl(C69097g.m265890a(th2));
            }
        }

        /* renamed from: a */
        public static void m58024a(ILoggable fVar, String str, LogLevel logLevel, String str2) {
            boolean z;
            Object obj;
            int i;
            Intrinsics.checkParameterIsNotNull(str, "msg");
            Intrinsics.checkParameterIsNotNull(logLevel, "logLevel");
            Intrinsics.checkParameterIsNotNull(str2, "subModule");
            try {
                Result.Companion aVar = Result.Companion;
                ILoggerService a = fVar.getLoggerWrapper().mo52660a();
                String b = fVar.getLoggerWrapper().mo52661b();
                boolean z2 = false;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = '[' + str2 + "] " + str;
                } else {
                    if (b.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        str = '[' + b + "] " + str;
                    }
                }
                if (a == null) {
                    int i2 = C14412g.f37869a[logLevel.ordinal()];
                    if (i2 == 1) {
                        i = Log.d("bullet", "onLog: " + str);
                    } else if (i2 == 2) {
                        i = Log.e("bullet", "onLog: " + str);
                    } else if (i2 != 3) {
                        i = Log.i("bullet", "onLog: " + str);
                    } else {
                        i = Log.w("bullet", "onLog: " + str);
                    }
                    obj = Integer.valueOf(i);
                } else {
                    a.mo33919a(str, logLevel);
                    obj = Unit.INSTANCE;
                }
                Result.m271569constructorimpl(obj);
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                Result.m271569constructorimpl(C69097g.m265890a(th));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m58027a(ILoggable fVar, Throwable th, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                fVar.printReject(th, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printReject");
        }

        /* renamed from: a */
        public static /* synthetic */ void m58025a(ILoggable fVar, String str, LogLevel logLevel, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    logLevel = LogLevel.I;
                }
                if ((i & 4) != 0) {
                    str2 = "";
                }
                fVar.printLog(str, logLevel, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printLog");
        }
    }
}
