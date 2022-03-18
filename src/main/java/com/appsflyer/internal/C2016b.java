package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.appsflyer.internal.b */
public final class C2016b {

    /* renamed from: ı */
    private static long f6904 = 5611810178159850554L;

    /* renamed from: ǃ */
    private static char[] f6905 = {34159, 12634, 60702, 39378, 21897, 'E', 48182, 26806, 9386, 54113, 36646, 15125, 63430, 41876, 24141, 2566, 50903, 29434, 10574, 58661, 37354, 19881, 63874, 46160, 24593, 7370, 51347, 34653, 13111, 61426, 39843, 22127, 555, 48646, '1', '0', 'y', 46147, 26637, 7383, 53445, 34159, 14609, 60859, 41396, 22126, 2587, 48694, 29424, 9887, 56129, 36629, 17363, 63360, 'b', 46171, 26646, 7371, 53385, 34119, 14700, 60835, 41449, 22126, 2673, 48717, 29401, 9872, 56085, 36693, 17300, 63420, 44064, 24619, 5308, 51367, 31944, 12550, 58644, 39315, 19925, 632, 46698, 27298, 7933, 54071, 'a', 46164, 26640, 7388, 53383, 34123, 14648, 60856, 41407, 22137, 2666, 48700, 29401, 9862, 56152, 36611, 17362, 63395, 44121, 24623, 5350, 51363, 31899, 12627, 58626, 29017, 50540, 6440, 28132, 41407, 62579, 18432, 40064, 53376, 10067, 31502, 53026, 1015, 22443, 43622, 65083, 12982, 34481, 56649, 4376, 26051, 47509, 3510, 'a', 46164, 26640, 7388, 53383, 34123, 14648, 60856, 41407, 22137, 2666, 48703, 29387, 9867, 56130, 36613, 17396, 63419, 44135, 24613, 'a', 46164, 26640, 7388, 53383, 34123, 14648, 60856, 41406, 22127, 2608, 48720, 29421, 9856, 56133, '.', '\\', 46100, 'j', 46171, 26626, 7375, 53446, 34123, 14643, 60856, 41380, 22119, 2612, 48666, 29393, 9856, 39578, 12012, 62112, 34424, 18997, 8178, 61026, 23132, 34327, 62142, 16087, 27460, 55096, 1012, 20406, 47215, 'C', 46162, 26641, 7373, 53379, 34129, 14633, 60923, 41365, 22130, 2599, 48667, 29384, 9862, 56133, 36617, 17358, 44150, 6251, 50221, 45298, 31933, 10614, 38220, 16850, 3471, 64026, 42515, 4651, 57084, 35554, 30591, 9015, 61427, 23426, 'A', 52318, 47304, 25747, 53432, 40302, 18784, 13805, 57789, 44634, 6656, 50818, 45721, 32590, 11027, 38703, 17396, 4010, 62577, 41021, 27842, 55516, 34048, 46066, 1994, 56213, 44914, 25363, 14020, 35517, 24162, 4649, 58867, 47540, 3471, 49516, 38167, 26825, 15519, 61532, 17452, 8160, 54191, 42868, 31544, 52999, 33488, 'C', 46162, 26641, 7373, 53379, 34129, 14633, 60923, 41346, 22127, 2594, 48658, 29405, 9873, 56152, 36643, 17368, 63417, 44145, 24638, 5372, 51371, 31891, 12632, 'F', 46171, 26653, 7362, 53389, 34118, 14716, 60927, 41406, 22140, 2603, 48661, 29405, 9938, 56158, 36611, 17350, 63414, 44145, 24621, 5372, 51367, 31896, 12566, 58653, 39375, 19856, 630, 46647, 27382, 7916, 54129, 34601, 15118, 61404, 41934, 22605, 3098, 49407, 29875, 10592, 56638, 37357, 17873, 63894, 44552, 25164};

    /* renamed from: Ι */
    private static int f6906 = 0;

    /* renamed from: ι */
    private static int f6907 = 1;

    /* renamed from: com.appsflyer.internal.b$d */
    public static class C2017d extends HashMap<String, Object> {

        /* renamed from: ǃ */
        private static char[] f6908 = {60225, 32432, 49299, 10934, 48273, 1667, 26753, 62185, 17636, 44775, 12497, 39618, 10607, 48265, 640, 59521, 32433, 16586, 54589, 27447, 33060, 5902, 44299, 49934, 22906, 'k', 38291, 11146, 62002, 26563, 55761, 13274, 42473, 8190, 29104, 60297, 23937, 47004, 10669, 33716, 62909, 28510, 49481, 15184, 44371, 1826, 31091, 54131, 17674, 48986, 4379, 35627, 64829, 22386, 51423, 8911, 38088, 3810, 24736, 56059, 19692, 42625, 6301, 29318, 58552, 24243, 45247, 10816, 39966, 62994, 10518, 48366, 759, 59558, 32412, 50314, 43648, 'f', 38303, 11166, 49553, 22444, 60802, 33701, 6607, 45022, 17861, 56308, 29142, 2025, 40202, 13073, '5', 38360, 11230, 49612, 22504, 54266, 18003, 63576, 4635, 33829, 58221, 30364, 51342, 8837, 46262, 3745, 24815, 64214, 19678, 42691, 14578, 37611, 58594, 32257, 53270, 10767, 48140, 5757, 26668, 49708, 21589, 44549, 'Y', 39536, 60535, 18040, 55698, 13273, 34196, 8124, 29099, 52137, 24043, 47064, 2527, 25546, 62966, 20469, 41467, 15128, 36116, 59139, 31085, 54137, 6539, 35966, 12903, 55406, 20048, 62530, 39453, 'f', 46701, 23679, 49681, 26690, 7760, 34033, 10927, 53427, 18104, 60551, 18028, 54165, 28037, 34717, 4538, 43946, 50605, 24473, 59860, 965, 40421, 14330, 16875, 56071, 30039, 36614, 6414, 45871, 52520, 26400, 61787, 2829, 42347, 16214, 18761, 58207, 31924, 38573, 8380, 47756, 54426, 28303, 63628, 4853, 44262, 50922, 20689, 't', 38291, 11137, 49554, 22461, 60860, 33701, 6606, 44997, 17876, 56313, 'x', 38350, 11226, 58846, 28734, 52783, 9276, 45594, 2065, 62669, 60983, 31647, 35155, 7408, 59100, 29564, 'f', 38342, 11165, 49618, 22441, 60927, 33716, 6539, 44992, 17812, 56238, 29169, 2016, 40202, 13077, 51463};

        /* renamed from: ɩ */
        private static int f6909 = 0;

        /* renamed from: Ι */
        private static long f6910 = 7139745979517605366L;

        /* renamed from: і */
        private static int f6911 = 1;

        /* renamed from: ı */
        private final Map<String, Object> f6912;

        /* renamed from: ι */
        private final Context f6913;

        /* renamed from: com.appsflyer.internal.b$d$e */
        public static class C2018e {

            /* renamed from: ǃ */
            private long f6914;

            /* renamed from: Ι */
            public String f6915;

            /* renamed from: ι */
            private final Object f6916;

            C2018e() {
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6914);
                sb.append(",");
                sb.append(this.f6915);
                return sb.toString();
            }

            /* renamed from: ǃ */
            static byte[] m8905(String str) throws Exception {
                return str.getBytes();
            }

            /* renamed from: ǃ */
            private boolean m8904(long j) {
                if (j - this.f6914 > 2000) {
                    return true;
                }
                return false;
            }

            /* renamed from: ι */
            public final boolean mo10078(C2018e eVar) {
                return m8906(eVar.f6914, eVar.f6915);
            }

            /* renamed from: ι */
            static byte[] m8908(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            /* renamed from: ǃ */
            static String m8903(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(String.valueOf(hexString));
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            /* renamed from: Ι */
            public static C2018e m8907(String str) {
                if (str == null) {
                    return new C2018e(0, "");
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new C2018e(0, "");
                }
                return new C2018e(Long.parseLong(split[0]), split[1]);
            }

            public C2018e(long j, String str) {
                this.f6916 = new Object();
                this.f6914 = 0;
                this.f6915 = "";
                this.f6914 = j;
                this.f6915 = str;
            }

            /* renamed from: ɩ */
            private boolean m8906(long j, String str) {
                synchronized (this.f6916) {
                    if (str != null) {
                        if (!str.equals(this.f6915) && m8904(j)) {
                            this.f6914 = j;
                            this.f6915 = str;
                            return true;
                        }
                    }
                    return false;
                }
            }
        }

        /* renamed from: ǃ */
        private String m8899() {
            char c;
            boolean z;
            String r2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.f6912.get(m8902(60192, 0, 12).intern()).toString();
                String obj2 = this.f6912.get(m8902(10509, 12, 5).intern()).toString();
                if (obj2 == null) {
                    int i = f6911 + SmEvents.EVENT_RE;
                    f6909 = i % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i % 2 != 0) {
                        r2 = m8902(16516, 89, 115);
                    } else {
                        r2 = m8902(16516, 17, 8);
                    }
                    obj2 = r2.intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r22 = m8900(num, obj2, sb.toString());
                int length = r22.length();
                if (length > 4) {
                    c = '!';
                } else {
                    c = 'E';
                }
                if (c == 'E') {
                    while (true) {
                        if (length < 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            break;
                        }
                        length++;
                        r22.append('1');
                        int i2 = f6909 + 69;
                        f6911 = i2 % SmActions.ACTION_ONTHECALL_EXIT;
                        int i3 = i2 % 2;
                    }
                } else {
                    int i4 = f6911 + LocationRequest.PRIORITY_NO_POWER;
                    f6909 = i4 % SmActions.ACTION_ONTHECALL_EXIT;
                    int i5 = i4 % 2;
                    r22.delete(4, length);
                }
                r22.insert(0, m8902(0, 25, 3).intern());
                String obj3 = r22.toString();
                int i6 = f6911 + 91;
                f6909 = i6 % SmActions.ACTION_ONTHECALL_EXIT;
                int i7 = i6 % 2;
                return obj3;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m8902(62036, 28, 42).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return m8902(10621, 70, 7).intern();
            }
        }

        /* renamed from: Ι */
        private String m8901() {
            String str;
            char c;
            int i;
            boolean z;
            int i2;
            try {
                String obj = this.f6912.get(m8902(60192, 0, 12).intern()).toString();
                String obj2 = this.f6912.get(m8902(0, 77, 15).intern()).toString();
                String replaceAll = m8902(0, 92, 5).intern().replaceAll(m8902(54231, 97, 5).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String r8 = AFExecutor.ThreadFactoryC19774.RunnableC19782.m8719(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(r8.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m8902(58123, 102, 44).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(m8902(6633, 146, 18).intern());
                str = sb4.toString();
            }
            try {
                Intent INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this.f6913, null, new IntentFilter(m8902(17933, 164, 37).intern()));
                if (INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                    c = 31;
                } else {
                    c = 18;
                }
                int i3 = -2700;
                if (c != 18) {
                    int i4 = f6911 + 1;
                    f6909 = i4 % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i4 % 2 != 0) {
                        i2 = INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra(m8902(0, 13200, 63).intern(), 22138);
                    } else {
                        i2 = INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra(m8902(0, 201, 11).intern(), -2700);
                    }
                    i3 = i2;
                }
                String str2 = this.f6913.getApplicationInfo().nativeLibraryDir;
                if (str2 != null) {
                    int i5 = f6911 + 89;
                    f6909 = i5 % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i5 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z ? str2.contains(m8902(0, TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH, 3).intern()) : str2.contains(m8902(0, 240, 5).intern())) {
                        i = 1;
                        int size = ((SensorManager) this.f6913.getSystemService(m8902(58797, SmEvents.EVENT_HEARTBEAT_INVALID, 6).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(m8902(62639, 221, 1).intern());
                        sb5.append(i3);
                        sb5.append(m8902(60945, 222, 2).intern());
                        sb5.append(i);
                        sb5.append(m8902(35189, 224, 2).intern());
                        sb5.append(size);
                        sb5.append(m8902(59130, 226, 2).intern());
                        sb5.append(this.f6912.size());
                        String obj3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(C2018e.m8903(C2018e.m8908(C2018e.m8905(obj3))));
                        return sb6.toString();
                    }
                }
                i = 0;
                int size2 = ((SensorManager) this.f6913.getSystemService(m8902(58797, SmEvents.EVENT_HEARTBEAT_INVALID, 6).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                sb52.append(m8902(62639, 221, 1).intern());
                sb52.append(i3);
                sb52.append(m8902(60945, 222, 2).intern());
                sb52.append(i);
                sb52.append(m8902(35189, 224, 2).intern());
                sb52.append(size2);
                sb52.append(m8902(59130, 226, 2).intern());
                sb52.append(this.f6912.size());
                String obj32 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str);
                sb62.append(C2018e.m8903(C2018e.m8908(C2018e.m8905(obj32))));
                return sb62.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(m8902(58123, 102, 44).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(m8902(0, 228, 16).intern());
                return sb8.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
            r2.append(java.lang.Integer.toHexString(r8.intValue()));
            r5 = r5 + 1;
         */
        /* renamed from: ǃ */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.StringBuilder m8900(java.lang.String... r11) throws java.lang.Exception {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2016b.C2017d.m8900(java.lang.String[]):java.lang.StringBuilder");
        }

        public C2017d(Map<String, Object> map, Context context) {
            this.f6912 = map;
            this.f6913 = context;
            put(m8899(), m8901());
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        public static Intent INVOKEVIRTUAL_com_appsflyer_internal_b$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }

        /* renamed from: ι */
        private static String m8902(char c, int i, int i2) {
            boolean z;
            char c2;
            int i3 = f6909 + 49;
            f6911 = i3 % SmActions.ACTION_ONTHECALL_EXIT;
            int i4 = i3 % 2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (true) {
                if (i5 < i2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return new String(cArr);
                }
                int i6 = f6911 + 99;
                f6909 = i6 % SmActions.ACTION_ONTHECALL_EXIT;
                if (i6 % 2 != 0) {
                    c2 = 19;
                } else {
                    c2 = '`';
                }
                if (c2 != '`') {
                    cArr[i5] = (char) ((int) (((long) f6908[i % i5]) & (((long) i5) / f6910) & ((long) c)));
                    i5 += 49;
                } else {
                    cArr[i5] = (char) ((int) ((((long) f6908[i + i5]) ^ (((long) i5) * f6910)) ^ ((long) c)));
                    i5++;
                }
            }
        }
    }

    C2016b() {
    }

    /* renamed from: ı */
    private static boolean m8893(String str) {
        int i = f6907 + 45;
        f6906 = i % SmActions.ACTION_ONTHECALL_EXIT;
        if (i % 2 != 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ι */
    private static String m8898(Context context) {
        int i = f6906 + 91;
        f6907 = i % SmActions.ACTION_ONTHECALL_EXIT;
        int i2 = i % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = f6907 + 35;
            f6906 = i3 % SmActions.ACTION_ONTHECALL_EXIT;
            int i4 = i3 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* renamed from: ı */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8891(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2016b.m8891(android.content.Context):java.lang.String");
    }

    /* renamed from: ǃ */
    private static String m8896(String str) {
        char c;
        boolean z;
        int i = f6907 + ActivityIdentificationData.WALKING;
        f6906 = i % SmActions.ACTION_ONTHECALL_EXIT;
        int i2 = i % 2;
        if (!str.contains(m8894(0, 169, 1).intern())) {
            c = 'G';
        } else {
            c = 'A';
        }
        if (c != 'A') {
            int i3 = f6906 + 117;
            f6907 = i3 % SmActions.ACTION_ONTHECALL_EXIT;
            int i4 = i3 % 2;
            return str;
        }
        String[] split = str.split(m8894(0, 170, 2).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i5 = length - 1;
        sb.append(split[i5]);
        sb.append(m8894(0, 169, 1).intern());
        int i6 = 1;
        while (true) {
            if (i6 < i5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                sb.append(split[0]);
                return sb.toString();
            }
            int i7 = f6907 + 73;
            f6906 = i7 % SmActions.ACTION_ONTHECALL_EXIT;
            int i8 = i7 % 2;
            sb.append(split[i6]);
            sb.append(m8894(0, 169, 1).intern());
            i6++;
            int i9 = f6907 + 59;
            f6906 = i9 % SmActions.ACTION_ONTHECALL_EXIT;
            int i10 = i9 % 2;
        }
    }

    /* renamed from: ɩ */
    private static String m8897(String str, Long l) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        boolean z3;
        boolean z4;
        char c3;
        if (str != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (l != null) {
                c = '&';
            } else {
                c = 24;
            }
            if (c == '&' && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                long j = 0;
                int i = 0;
                for (int i2 = 0; i2 < obj.length(); i2++) {
                    i += Character.getNumericValue(obj.charAt(i2));
                }
                String hexString = Integer.toHexString(i);
                sb.replace(7, hexString.length() + 7, hexString);
                int i3 = 0;
                while (true) {
                    if (i3 < sb.length()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        break;
                    }
                    int i4 = f6906 + 57;
                    f6907 = i4 % SmActions.ACTION_ONTHECALL_EXIT;
                    int i5 = i4 % 2;
                    j += (long) Character.getNumericValue(sb.charAt(i3));
                    i3++;
                }
                while (true) {
                    if (j > 100) {
                        c2 = 'C';
                    } else {
                        c2 = 17;
                    }
                    if (c2 == 17) {
                        break;
                    }
                    int i6 = f6906 + 73;
                    f6907 = i6 % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i6 % 2 == 0) {
                        c3 = 'U';
                    } else {
                        c3 = '+';
                    }
                    if (c3 != '+') {
                        j *= 100;
                    } else {
                        j %= 100;
                    }
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int i7 = f6906 + 25;
                    f6907 = i7 % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i7 % 2 == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        sb.insert(23, m8894(0, 35, 1).intern());
                    } else {
                        sb.insert(47, m8894(0, 17, 0).intern());
                    }
                }
                return sb.toString();
            }
        }
        return m8894(0, 54, 32).intern();
    }

    /* renamed from: ı */
    private static String m8892(Context context, String str) {
        char c;
        boolean z;
        String str2;
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr = null;
        try {
            for (ApplicationInfo applicationInfo : (List) PackageManager.class.getDeclaredMethod(m8894(45973, 260, 24).intern(), Integer.TYPE).invoke(packageManager, 0)) {
                if (((PackageItemInfo) applicationInfo).packageName.equals(str)) {
                    c = 20;
                    continue;
                } else {
                    c = '9';
                    continue;
                }
                if (c == 20) {
                    int i = f6907 + 75;
                    f6906 = i % SmActions.ACTION_ONTHECALL_EXIT;
                    if (i % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        str2 = Boolean.TRUE.toString();
                    } else {
                        str2 = Boolean.TRUE.toString();
                        int length = objArr.length;
                    }
                    int i2 = f6906 + 17;
                    f6907 = i2 % SmActions.ACTION_ONTHECALL_EXIT;
                    int i3 = i2 % 2;
                    return str2;
                }
            }
        } catch (IllegalAccessException e) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai aiVar = C2015ai.f6878;
            String intern = m8894(0, 284, 24).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m8894(0, 308, 47).intern());
            sb.append(e);
            aiVar.mo10067(null, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai aiVar2 = C2015ai.f6878;
            String intern2 = m8894(0, 284, 24).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m8894(0, 308, 47).intern());
            sb2.append(e2);
            aiVar2.mo10067(null, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai aiVar3 = C2015ai.f6878;
            String intern3 = m8894(0, 284, 24).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m8894(0, 308, 47).intern());
            sb3.append(e3);
            aiVar3.mo10067(null, intern3, sb3.toString());
        }
        String obj = Boolean.FALSE.toString();
        int i4 = f6906 + 99;
        f6907 = i4 % SmActions.ACTION_ONTHECALL_EXIT;
        int i5 = i4 % 2;
        return obj;
    }

    /* renamed from: ǃ */
    public static String m8895(Context context, long j) {
        boolean z;
        String r3;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String r12;
        String str4;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (m8893(m8894(34062, 0, 34).intern())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r3 = m8894(0, 35, 1);
        } else {
            r3 = m8894(0, 34, 1);
        }
        sb2.append(r3.intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String r9 = m8896(packageName);
        sb2.append(m8894(0, 34, 1).intern());
        sb4.append(r9);
        if (m8891(context) == null) {
            int i = f6906 + 93;
            f6907 = i % SmActions.ACTION_ONTHECALL_EXIT;
            if (i % 2 == 0) {
                str4 = m8894(0, 31, 1);
            } else {
                str4 = m8894(0, 35, 1);
            }
            sb2.append(str4.intern());
            sb4.append(packageName);
        } else {
            sb2.append(m8894(0, 34, 1).intern());
            sb4.append(packageName);
        }
        String r92 = m8898(context);
        if (r92 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            sb2.append(m8894(0, 34, 1).intern());
            sb4.append(r92);
        } else {
            sb2.append(m8894(0, 35, 1).intern());
            sb4.append(packageName);
        }
        sb4.append(m8892(context, packageName));
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(m8894(0, 36, 18).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb.append(j);
            if (m8893(m8894(0, 86, 25).intern())) {
                str = m8894(0, 34, 1);
            } else {
                str = m8894(0, 35, 1);
            }
            sb3.append(str.intern());
            if (m8893(m8894(28984, SmEvents.EVENT_NT, 23).intern())) {
                int i2 = f6907 + 11;
                f6906 = i2 % SmActions.ACTION_ONTHECALL_EXIT;
                int i3 = i2 % 2;
                str2 = m8894(0, 34, 1);
            } else {
                str2 = m8894(0, 35, 1);
            }
            sb3.append(str2.intern());
            if (m8893(m8894(0, 134, 20).intern())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                str3 = m8894(0, 34, 1);
            } else {
                str3 = m8894(0, 35, 1);
            }
            sb3.append(str3.intern());
            if (m8893(m8894(0, 154, 15).intern())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                r12 = m8894(0, 34, 1);
            } else {
                r12 = m8894(0, 35, 1);
            }
            sb3.append(r12.intern());
            String r122 = AFExecutor.ThreadFactoryC19774.RunnableC19782.m8717(AFExecutor.ThreadFactoryC19774.RunnableC19782.m8719(sb.toString()));
            String obj = sb2.toString();
            StringBuilder sb5 = new StringBuilder(r122);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb5.toString();
            String obj3 = sb3.toString();
            StringBuilder sb6 = new StringBuilder(obj2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return m8897(sb6.toString(), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return m8894(0, 54, 32).intern();
        }
    }

    /* renamed from: ǃ */
    private static String m8894(char c, int i, int i2) {
        boolean z;
        int i3 = f6907;
        int i4 = i3 + SmEvents.EVENT_NR;
        f6906 = i4 % SmActions.ACTION_ONTHECALL_EXIT;
        int i5 = i4 % 2;
        char[] cArr = new char[i2];
        int i6 = i3 + 75;
        f6906 = i6 % SmActions.ACTION_ONTHECALL_EXIT;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            if (i8 < i2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new String(cArr);
            }
            int i9 = f6906 + 47;
            f6907 = i9 % SmActions.ACTION_ONTHECALL_EXIT;
            int i10 = i9 % 2;
            cArr[i8] = (char) ((int) ((((long) f6905[i + i8]) ^ (((long) i8) * f6904)) ^ ((long) c)));
            i8++;
        }
    }
}
