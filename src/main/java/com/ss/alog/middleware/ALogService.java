package com.ss.alog.middleware;

import android.content.Intent;
import android.os.Bundle;

public abstract class ALogService implements AbstractC27214a {
    public static ALogService sInstance;
    protected static volatile boolean sIsStrickMode;

    protected ALogService() {
        sInstance = this;
    }

    public static boolean debugSafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            return aLogService.mo97053a(3);
        }
        if (!sIsStrickMode) {
            return false;
        }
        throw new RuntimeException("implement AlogService and set sInstance first");
    }

    public static void destroySafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97061c();
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void flushSafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97063d();
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void forceLogShardingSafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97054b();
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void initSafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97042a();
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void releaseSafely() {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97065e();
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void setAlogService(ALogService aLogService) {
        sInstance = aLogService;
    }

    public static void changeLevelSafely(int i) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97055b(i);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static boolean isBlackTagSafely(String str) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            return aLogService.mo97060b(str);
        }
        if (!sIsStrickMode) {
            return false;
        }
        throw new RuntimeException("implement AlogService and set sInstance first");
    }

    public static void initSafely(String str) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97049a(str);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void dSafely(String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97057b(str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void eSafely(String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97066e(str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void iSafely(String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97062c(str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void vSafely(String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97050a(str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void wSafely(String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97064d(str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void eSafely(String str, Throwable th) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97059b(str, th);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void wSafely(String str, Throwable th) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97052a(str, th);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void bundleSafely(int i, String str, Bundle bundle) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97044a(i, str, bundle);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void headerSafely(int i, String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97045a(i, str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void intentSafely(int i, String str, Intent intent) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97043a(i, str, intent);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void jsonSafely(int i, String str, String str2) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97056b(i, str, str2);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void statcktraceSafely(int i, String str, StackTraceElement[] stackTraceElementArr) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97048a(i, str, stackTraceElementArr);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void threadSafely(int i, String str, Thread thread) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97046a(i, str, thread);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void throwableSafely(int i, String str, Throwable th) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97047a(i, str, th);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void eSafely(String str, String str2, Throwable th) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97058b(str, str2, th);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void wSafely(String str, String str2, Throwable th) {
        ALogService aLogService = sInstance;
        if (aLogService != null) {
            aLogService.mo97051a(str, str2, th);
        } else if (sIsStrickMode) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }
}
