package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import android.view.WindowManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.n */
public class C60410n {

    /* renamed from: a */
    public static byte f150977a = 0;

    /* renamed from: b */
    static final ArrayList<TEFrameSizei> f150978b = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, SmEvents.EVENT_NW), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, CalendarWorkHourUtil.f83805a), new TEFrameSizei(2560, CalendarWorkHourUtil.f83805a), new TEFrameSizei(3840, 2160)));

    /* renamed from: c */
    private static int f150979c = 1920;

    /* renamed from: d */
    private static String f150980d;

    /* renamed from: e */
    private static boolean f150981e = true;

    /* renamed from: f */
    private static String[] f150982f = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* renamed from: g */
    private static String[] f150983g = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* renamed from: h */
    private static boolean f150984h = true;

    /* renamed from: i */
    private static Class f150985i;

    /* renamed from: j */
    private static Field f150986j;

    /* renamed from: k */
    private static Method f150987k;

    /* renamed from: a */
    public static int m234775a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static int[] m234790a(int[] iArr, List<int[]> list) {
        int[] iArr2;
        if (list == null || list.size() <= 0) {
            C60427s.m234842b("TECameraUtils", "supported fpsRange is null,use [7,30]");
            return new int[]{7, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr3 : list) {
            if (iArr[0] > 1000) {
                if (iArr3[1] == 30000) {
                    arrayList.add(iArr3);
                } else {
                    arrayList2.add(iArr3);
                }
            } else if (iArr3[1] == 30) {
                arrayList.add(iArr3);
            } else {
                arrayList2.add(iArr3);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<int[]>() {
                /* class com.ss.android.ttvecamera.C60410n.C604111 */

                /* renamed from: a */
                public int compare(int[] iArr, int[] iArr2) {
                    return iArr2[0] - iArr[0];
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                iArr2 = (int[]) it.next();
                if (iArr2[0] <= iArr[0]) {
                    break;
                }
            }
        }
        iArr2 = null;
        if (iArr2 == null) {
            iArr2 = m234792b(iArr, list);
        }
        C60427s.m234842b("TECameraUtils", "calculate fps range = [" + iArr2[0] + "," + iArr2[1] + "]");
        return iArr2;
    }

    /* renamed from: a */
    public static int[] m234789a(int i, int i2, int[] iArr, List<int[]> list) {
        C60427s.m234842b("TECameraUtils", "requiredFpsRange : [" + iArr[0] + "," + iArr[1] + "]");
        if (i == 1) {
            C60427s.m234842b("TECameraUtils", "fixed framerate for all cameras");
            return m234793c(iArr, list);
        } else if (i == 2) {
            if (i2 == 0) {
                C60427s.m234842b("TECameraUtils", "fixed framerate for rear camera");
                return m234793c(iArr, list);
            }
            C60427s.m234842b("TECameraUtils", "dynamic framerate for front camera");
            return m234790a(iArr, list);
        } else if (i == 3) {
            C60427s.m234842b("TECameraUtils", "dynamic framerate without select");
            return m234792b(iArr, list);
        } else {
            C60427s.m234842b("TECameraUtils", "dynamic framerate");
            return m234790a(iArr, list);
        }
    }

    /* renamed from: a */
    public static void m234784a(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    /* renamed from: a */
    public static boolean m234786a(Object obj) {
        try {
            if (f150985i == null || f150986j == null || f150987k == null) {
                f150985i = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f150986j = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f150985i.getDeclaredMethod("finalize", new Class[0]);
                f150987k = declaredMethod;
                declaredMethod.setAccessible(true);
                f150986j.setAccessible(true);
            }
            f150987k.invoke(f150986j.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            C60427s.m234843c("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (NoSuchMethodException unused2) {
            C60427s.m234843c("TECameraUtils", "finalize method not found");
            return false;
        } catch (NoSuchFieldException unused3) {
            C60427s.m234843c("TECameraUtils", "mResults field not found");
            return false;
        } catch (IllegalAccessException unused4) {
            C60427s.m234843c("TECameraUtils", "illegal access");
            return false;
        } catch (InvocationTargetException unused5) {
            C60427s.m234843c("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C60427s.m234843c("TECameraUtils", "unknown error");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m234787a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m234788a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static {
        int i = 0;
        String a = m234781a();
        if (!TextUtils.isEmpty(a)) {
            a = a.toUpperCase();
            String[] strArr = f150982f;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (a.contains(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
            String[] strArr2 = f150983g;
            int length2 = strArr2.length;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (strArr2[i].equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C60427s.m234839a("TECameraUtils", "cpuHardware: " + a + ", isHighPerformanceCpu: " + f150981e + "model: " + str + ", isInAbortCapturesBlockList: " + f150984h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063 A[SYNTHETIC, Splitter:B:38:0x0063] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m234781a() {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.C60410n.m234781a():java.lang.String");
    }

    /* renamed from: a */
    public static int m234774a(int i) {
        return m234775a(i, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
    }

    /* renamed from: a */
    public static boolean m234785a(Rect rect) {
        if (rect == null || rect.isEmpty() || rect.left < 0 || rect.right < 0 || rect.top < 0 || rect.bottom < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m234776a(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m234783a(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m234782a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
        list.retainAll(list2);
        return list;
    }

    /* renamed from: b */
    public static int[] m234792b(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* class com.ss.android.ttvecamera.C60410n.C604133 */

            /* renamed from: a */
            private int m234796a(int[] iArr) {
                int i;
                int i2;
                int[] iArr2 = iArr;
                if (iArr2[0] > iArr[0]) {
                    i = (iArr2[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr2[0]) * 3;
                }
                if (iArr2[1] > iArr[1]) {
                    i2 = (iArr2[1] - iArr[1]) * 4;
                } else {
                    i2 = (iArr[1] - iArr2[1]) * 1;
                }
                return i + i2;
            }

            /* renamed from: a */
            public int compare(int[] iArr, int[] iArr2) {
                return m234796a(iArr) - m234796a(iArr2);
            }
        });
    }

    /* renamed from: b */
    private static TEFrameSizei m234791b(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (tEFrameSizei3.f150716a > tEFrameSizei.f150716a && tEFrameSizei3.f150717b > tEFrameSizei.f150717b) {
                if (tEFrameSizei2 == null || tEFrameSizei3.f150716a < tEFrameSizei2.f150716a) {
                    tEFrameSizei2 = tEFrameSizei3;
                }
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    /* renamed from: a */
    public static TEFrameSizei m234777a(List<TEFrameSizei> list, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f, ((float) tEFrameSizei.f150716a) / ((float) tEFrameSizei.f150717b)) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = f150978b;
            if (arrayList.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                /* class com.ss.android.ttvecamera.C60410n.C604199 */

                /* renamed from: a */
                public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                    return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
                }
            });
            return (TEFrameSizei) arrayList.get(0);
        }
        ArrayList<TEFrameSizei> arrayList4 = f150978b;
        if (arrayList2.contains(arrayList4.get(14))) {
            return arrayList4.get(14);
        }
        if (arrayList.contains(arrayList4.get(16))) {
            return arrayList4.get(16);
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.C60410n.C604122 */

            /* renamed from: a */
            public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
            }
        });
        return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m234793c(int[] r7, java.util.List<int[]> r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.C60410n.m234793c(int[], java.util.List):int[]");
    }

    /* renamed from: a */
    public static TEFrameSizei m234778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i = tEFrameSizei.f150716a;
        int i2 = tEFrameSizei.f150717b;
        float f = ((float) i) / ((float) i2);
        ArrayList<TEFrameSizei> arrayList = new ArrayList();
        ArrayList<TEFrameSizei> arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f, ((float) tEFrameSizei3.f150716a) / ((float) tEFrameSizei3.f150717b)) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                /* class com.ss.android.ttvecamera.C60410n.C604177 */

                /* renamed from: a */
                public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                    return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
                }
            });
            for (TEFrameSizei tEFrameSizei4 : arrayList) {
                if (tEFrameSizei2 != null) {
                    if (tEFrameSizei4.f150716a == i && tEFrameSizei4.f150717b == i2) {
                        return tEFrameSizei4;
                    }
                    if (tEFrameSizei4.f150716a <= i || tEFrameSizei4.f150716a >= tEFrameSizei2.f150716a) {
                        if (tEFrameSizei4.f150716a < i) {
                            return tEFrameSizei2;
                        }
                    }
                }
                tEFrameSizei2 = tEFrameSizei4;
            }
            return tEFrameSizei2;
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.C60410n.C604188 */

            /* renamed from: a */
            public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
            }
        });
        for (TEFrameSizei tEFrameSizei5 : arrayList2) {
            if (tEFrameSizei2 == null || (tEFrameSizei5.f150716a >= i && tEFrameSizei5.f150717b >= i2)) {
                tEFrameSizei2 = tEFrameSizei5;
            } else if (tEFrameSizei5.f150716a < i && tEFrameSizei5.f150717b < i2) {
                return tEFrameSizei2;
            }
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public static TEFrameSizei m234780a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.mo206545a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.f150716a * tEFrameSizei.f150717b != next.f150717b * tEFrameSizei.f150716a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.C60410n.C604155 */

            /* renamed from: a */
            public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
            }
        });
        TEFrameSizei tEFrameSizei3 = null;
        for (TEFrameSizei tEFrameSizei4 : list) {
            if (tEFrameSizei3 != null) {
                if (tEFrameSizei4.f150716a == tEFrameSizei2.f150716a && tEFrameSizei4.f150717b == tEFrameSizei2.f150717b) {
                    return tEFrameSizei4;
                }
                if (tEFrameSizei4.f150717b <= tEFrameSizei2.f150717b || tEFrameSizei4.f150717b >= tEFrameSizei3.f150717b) {
                    if (tEFrameSizei4.f150717b < tEFrameSizei2.f150717b) {
                        return tEFrameSizei3;
                    }
                }
            }
            tEFrameSizei3 = tEFrameSizei4;
        }
        return tEFrameSizei3;
    }

    /* renamed from: a */
    public static TEFrameSizei m234779a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, int i) {
        TEFrameSizei tEFrameSizei2;
        if (tEFrameSizei != null && tEFrameSizei.mo206545a()) {
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.f150716a * tEFrameSizei.f150717b != next.f150717b * tEFrameSizei.f150716a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.C60410n.C604166 */

            /* renamed from: a */
            public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f150716a * tEFrameSizei2.f150717b) - (tEFrameSizei.f150716a * tEFrameSizei.f150717b);
            }
        });
        TEFrameSizei tEFrameSizei3 = null;
        Iterator<TEFrameSizei> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TEFrameSizei next2 = it2.next();
            if (next2.f150716a <= i && next2.f150716a % 16 == 0 && next2.f150717b % 16 == 0) {
                tEFrameSizei3 = next2;
                break;
            }
        }
        if (tEFrameSizei3 == null) {
            Iterator<TEFrameSizei> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TEFrameSizei next3 = it3.next();
                if (next3.f150716a <= i) {
                    tEFrameSizei3 = next3;
                    break;
                }
            }
        }
        if ((f150977a & 8) == 0 ? (tEFrameSizei3 == null || tEFrameSizei3.f150716a < tEFrameSizei.f150716a || tEFrameSizei3.f150717b < tEFrameSizei.f150717b) && (tEFrameSizei2 = m234791b(list, tEFrameSizei)) != null : (tEFrameSizei3 == null || tEFrameSizei3.f150716a <= tEFrameSizei.f150716a || tEFrameSizei3.f150717b <= tEFrameSizei.f150717b) && (tEFrameSizei2 = m234791b(list, tEFrameSizei)) != null) {
            tEFrameSizei3 = tEFrameSizei2;
        }
        if (tEFrameSizei3 == null) {
            C60427s.m234844d("TECameraUtils", "unsupport high quality~~");
        }
        return tEFrameSizei3;
    }
}
