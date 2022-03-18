package com.ss.android.lark;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sp.C54930c;
import com.ss.android.lark.sp.p2686a.C54926b;
import com.ss.android.lark.sp.p2686a.C54927c;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.lark.e */
public class C36888e {

    /* renamed from: a */
    private static Context f94819a;

    /* renamed from: b */
    private static AbstractC36891a f94820b;

    /* renamed from: c */
    private static C36420d f94821c;

    /* renamed from: d */
    private static boolean f94822d;

    /* renamed from: e */
    private static CountDownLatch f94823e = new CountDownLatch(1);

    /* renamed from: com.ss.android.lark.e$a */
    public interface AbstractC36891a {
        String getUserId();
    }

    /* renamed from: a */
    public static Context m145598a() {
        return f94819a;
    }

    /* renamed from: b */
    public static AbstractC36891a m145600b() {
        m145601c();
        return f94820b;
    }

    /* renamed from: c */
    private static void m145601c() {
        if (!f94822d) {
            try {
                f94823e.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.lark.e$2 */
    static /* synthetic */ class C368902 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94824a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.C36888e.C368902.f94824a = r0
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.C36888e.C368902.f94824a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.C36888e.C368902.f94824a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.C36888e.C368902.f94824a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.C36888e.C368902.f94824a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.C36888e.C368902.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m145599a(Context context, AbstractC36891a aVar, C36420d dVar) {
        if (context != null) {
            f94819a = context;
            f94821c = dVar;
            f94820b = aVar;
            if (dVar.mo134278a() == 0) {
                Log.m165389i("SpInit", "use sp");
                C54930c.m213003a(new C54926b());
            } else if (f94821c.mo134278a() == 1) {
                Log.m165389i("SpInit", "use mmkv");
                MMKV.initialize(context);
                MMKV.registerHandler(new MMKVHandler() {
                    /* class com.ss.android.lark.C36888e.C368891 */

                    @Override // com.tencent.mmkv.MMKVHandler
                    public boolean wantLogRedirecting() {
                        return true;
                    }

                    @Override // com.tencent.mmkv.MMKVHandler
                    public MMKVRecoverStrategic onMMKVCRCCheckFail(String str) {
                        return MMKVRecoverStrategic.OnErrorDiscard;
                    }

                    @Override // com.tencent.mmkv.MMKVHandler
                    public MMKVRecoverStrategic onMMKVFileLengthError(String str) {
                        return MMKVRecoverStrategic.OnErrorDiscard;
                    }

                    @Override // com.tencent.mmkv.MMKVHandler
                    public void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3) {
                        int i2 = C368902.f94824a[mMKVLogLevel.ordinal()];
                        if (i2 == 1) {
                            Log.m165379d("MMKV", str3);
                        } else if (i2 == 2) {
                            Log.m165389i("MMKV", str3);
                        } else if (i2 == 3) {
                            Log.m165397w("MMKV", str3);
                        } else if (i2 == 4) {
                            Log.m165383e("MMKV", str3);
                        }
                    }
                });
                C54930c.m213003a(new C54927c());
            }
            f94823e.countDown();
            f94822d = true;
            return;
        }
        throw new IllegalArgumentException("context should not be null");
    }
}
