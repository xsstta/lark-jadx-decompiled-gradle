package com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.lunar.entity.YearAndIndex;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a.b */
public class C31102b {

    /* renamed from: a */
    private static long f78544a = -2206396800000L;

    /* renamed from: b */
    private static int f78545b = 348;

    /* renamed from: d */
    private static int f78546d = 43823;

    /* renamed from: e */
    private static int f78547e = 2415051;

    /* renamed from: c */
    private ArrayList<C31105c> f78548c;

    /* renamed from: f */
    private int[] f78549f;

    /* renamed from: g */
    private String[] f78550g;

    /* renamed from: h */
    private String[] f78551h;

    /* renamed from: i */
    private String[] f78552i;

    /* renamed from: j */
    private String[] f78553j;

    /* renamed from: k */
    private Object[][] f78554k;

    /* renamed from: l */
    private String[] f78555l;

    /* renamed from: m */
    private ConcurrentHashMap<YearAndIndex, Integer> f78556m;

    /* renamed from: n */
    private String[] f78557n;

    /* renamed from: o */
    private String[] f78558o;

    /* renamed from: p */
    private String[] f78559p;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a.b$a */
    public static class C31104a {

        /* renamed from: a */
        public static final C31102b f78560a = new C31102b();
    }

    /* renamed from: a */
    public static C31102b m116090a() {
        return C31104a.f78560a;
    }

    private C31102b() {
        this.f78548c = new ArrayList<>(20);
        this.f78549f = new int[]{19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 23232, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};
        this.f78550g = new String[]{"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        this.f78551h = new String[]{"正月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "冬月", "腊月"};
        this.f78552i = new String[]{"初", "十", "廿", "卅", "　"};
        this.f78553j = new String[]{"日", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
        this.f78554k = new Object[][]{new Object[]{1, 1, "春节"}, new Object[]{1, 15, "元宵"}, new Object[]{2, 2, "龙头"}, new Object[]{5, 5, "端午"}, new Object[]{7, 7, "七夕"}, new Object[]{7, 15, "中元"}, new Object[]{8, 15, "中秋"}, new Object[]{9, 9, "重阳"}, new Object[]{12, 8, "腊八"}};
        this.f78555l = new String[]{"小寒", "大寒", "立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至"};
        this.f78556m = new ConcurrentHashMap<>();
        this.f78557n = new String[]{"9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa", "9778397bd19801ec9210c965cc920e", "97b6b97bd19801ec95f8c965cc920f", "97bd09801d98082c95f8e1cfcc920f", "97bd097bd097c36b0b6fc9210c8dc2", "9778397bd197c36c9210c9274c91aa", "97b6b97bd19801ec95f8c965cc920e", "97bd09801d98082c95f8e1cfcc920f", "97bd097bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c91aa", "97b6b97bd19801ec95f8c965cc920e", "97bcf97c3598082c95f8e1cfcc920f", "97bd097bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd097bd07f595b0b6fc920fb0722", "9778397bd097c36b0b6fc9210c8dc2", "9778397bd19801ec9210c9274c920e", "97b6b97bd19801ec95f8c965cc920f", "97bd07f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c920e", "97b6b97bd19801ec95f8c965cc920f", "97bd07f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bd07f1487f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c9274c920e", "97bcf7f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c91aa", "97b6b97bd197c36c9210c9274c920e", "97bcf7f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c920e", "97b6b7f0e47f531b0723b0b6fb0722", "7f0e37f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36b0b70c9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e37f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc9210c8dc2", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0787b0721", "7f0e27f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c91aa", "97b6b7f0e47f149b0723b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c8dc2", "977837f0e37f149b0723b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e37f5307f595b0b0bc920fb0722", "7f0e397bd097c35b0b6fc9210c8dc2", "977837f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e37f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc9210c8dc2", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f149b0723b0787b0721", "7f0e27f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14998082b0723b06bd", "7f07e7f0e37f149b0723b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e37f1487f595b0b0bb0b6fb0722", "7f0e37f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e37f1487f531b0b0bb0b6fb0722", "7f0e37f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e37f1487f531b0b0bb0b6fb0722", "7f0e37f0e37f14898082b072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e37f14898082b072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f149b0723b0787b0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0723b06bd", "7f07e7f0e47f149b0723b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0723b06bd", "7f07e7f0e37f14998083b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14898082b0723b02d5", "7f07e7f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e36665b66aa89801e9808297c35", "665f67f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e36665b66a449801e9808297c35", "665f67f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e36665b66a449801e9808297c35", "665f67f0e37f14898082b072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e26665b66a449801e9808297c35", "665f67f0e37f1489801eb072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722"};
        this.f78558o = new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
        this.f78559p = new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        this.f78548c.add(m116091a(2020, f78546d));
    }

    /* renamed from: a */
    private int m116089a(String str) {
        return Integer.parseInt(str, 16);
    }

    /* renamed from: b */
    private C31105c m116095b(int i) {
        C31105c cVar;
        int size = this.f78548c.size();
        C31105c cVar2 = this.f78548c.get(0);
        int i2 = size - 1;
        C31105c cVar3 = this.f78548c.get(i2);
        if (cVar3 == null) {
            return null;
        }
        if (i < cVar2.f78562b || i >= cVar3.f78563c) {
            synchronized (this) {
                if (i < this.f78548c.get(0).f78562b) {
                    C31105c cVar4 = this.f78548c.get(0);
                    this.f78548c.add(0, m116096b(cVar4.f78561a - 1, cVar4.f78562b));
                    return null;
                }
                ArrayList<C31105c> arrayList = this.f78548c;
                if (arrayList.get(arrayList.size() - 1).f78563c > i) {
                    return null;
                }
                ArrayList<C31105c> arrayList2 = this.f78548c;
                C31105c cVar5 = arrayList2.get(arrayList2.size() - 1);
                this.f78548c.add(m116091a(cVar5.f78561a + 1, cVar5.f78563c));
                return null;
            }
        }
        int min = Math.min((i - cVar2.f78562b) / f78545b, i2);
        C31105c cVar6 = this.f78548c.get(min);
        while (true) {
            cVar = cVar6;
            if (i < cVar.f78562b && min > 0) {
                min--;
                cVar6 = this.f78548c.get(min);
            }
        }
        if (i >= cVar.f78563c || i < cVar.f78562b) {
            return null;
        }
        return cVar;
    }

    /* renamed from: a */
    private int[] m116094a(int i) {
        int i2;
        int i3;
        C31105c b = m116095b(i);
        while (b == null) {
            b = m116095b(i);
        }
        int[] iArr = new int[4];
        iArr[0] = b.f78561a;
        int i4 = (i - b.f78562b) / 30;
        int i5 = b.f78564d[i4];
        if (b.f78565e > 0) {
            i2 = 12;
        } else {
            i2 = 11;
        }
        while (true) {
            int i6 = -1;
            if (i5 > i) {
                if (b.f78565e <= 0 || b.f78565e >= i4) {
                    i3 = i4;
                } else {
                    i3 = i4 - 1;
                }
                iArr[1] = i3;
                iArr[2] = (i - b.f78564d[i4 - 1]) + 1;
                if (b.f78565e > 0 && i4 == b.f78565e + 1) {
                    i6 = 1;
                }
                iArr[3] = i6;
                return iArr;
            } else if (i4 == i2) {
                iArr[1] = 12;
                iArr[2] = (i - i5) + 1;
                if (b.f78565e == 12) {
                    i6 = 1;
                }
                iArr[3] = i6;
                return iArr;
            } else {
                i4++;
                i5 = b.f78564d[i4];
            }
        }
    }

    /* renamed from: c */
    private int m116098c(int i, int i2) {
        if ((this.f78549f[i - 1900] & (65536 >> i2)) > 0) {
            return 30;
        }
        return 29;
    }

    /* renamed from: a */
    private C31105c m116091a(int i, int i2) {
        C31105c cVar = new C31105c();
        cVar.f78561a = i;
        cVar.f78562b = i2;
        int i3 = this.f78549f[i - 1900];
        cVar.f78565e = i3 & 15;
        int i4 = 32768;
        int i5 = 1;
        while (i4 > 8) {
            cVar.f78564d[i5 - 1] = i2;
            int i6 = 30;
            if (cVar.f78565e <= 0 || i5 != cVar.f78565e + 1) {
                if ((i3 & i4) <= 0) {
                    i6 = 29;
                }
                i2 += i6;
                i4 >>= 1;
            } else {
                if ((65536 & i3) <= 0) {
                    i6 = 29;
                }
                i2 += i6;
            }
            i5++;
        }
        cVar.f78563c = i2;
        return cVar;
    }

    /* renamed from: b */
    private C31105c m116096b(int i, int i2) {
        int i3;
        C31105c cVar = new C31105c();
        cVar.f78561a = i;
        cVar.f78563c = i2;
        int i4 = this.f78549f[i - 1900];
        cVar.f78565e = i4 & 15;
        if (cVar.f78565e > 0) {
            i3 = 13;
        } else {
            i3 = 12;
        }
        int i5 = 16;
        while (i5 < 65536) {
            int i6 = 30;
            if (cVar.f78565e <= 0 || i3 != cVar.f78565e + 1) {
                if ((i4 & i5) <= 0) {
                    i6 = 29;
                }
                i2 -= i6;
                i5 <<= 1;
            } else {
                if ((65536 & i4) <= 0) {
                    i6 = 29;
                }
                i2 -= i6;
            }
            cVar.f78564d[i3 - 1] = i2;
            i3--;
        }
        cVar.f78562b = i2;
        return cVar;
    }

    /* renamed from: d */
    private int m116099d(int i, int i2) {
        YearAndIndex aVar = new YearAndIndex(i, i2);
        Integer num = this.f78556m.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        String str = this.f78557n[i - 1900];
        String[] strArr = {str.substring(0, 5), str.substring(5, 10), str.substring(10, 15), str.substring(15, 20), str.substring(20, 25), str.substring(25, 30)};
        for (int i3 = 0; i3 < 6; i3++) {
            strArr[i3] = String.valueOf(m116089a(strArr[i3]));
        }
        String str2 = strArr[i2 / 4];
        int parseInt = Integer.parseInt(new String[]{str2.substring(0, 1), str2.substring(1, 3), str2.substring(3, 4), str2.substring(4, 6)}[i2 % 4]);
        this.f78556m.put(aVar, Integer.valueOf(parseInt));
        return parseInt;
    }

    /* renamed from: b */
    private String m116097b(int i, int i2, int i3) {
        int i4 = i2 * 2;
        int d = m116099d(i, i4);
        int i5 = i4 + 1;
        int d2 = m116099d(i, i5);
        if (i3 == d) {
            return this.f78555l[i4];
        }
        if (i3 == d2) {
            return this.f78555l[i5];
        }
        return "";
    }

    /* renamed from: a */
    private String m116092a(int i, int i2, int i3) {
        Object[][] objArr = this.f78554k;
        for (Object[] objArr2 : objArr) {
            if (((Integer) objArr2[0]).intValue() == i2 && ((Integer) objArr2[1]).intValue() == i3) {
                return (String) objArr2[2];
            }
        }
        if (i2 == 12 && i3 == m116098c(i, i2)) {
            return "除夕";
        }
        return "";
    }

    /* renamed from: a */
    private String m116093a(int i, int i2, boolean z) {
        if (i2 == 1) {
            String str = this.f78551h[i - 1];
            if (!z) {
                return str;
            }
            return "闰" + str;
        } else if (i2 == 10) {
            return "初十";
        } else {
            if (i2 == 20) {
                return "二十";
            }
            if (i2 == 30) {
                return "三十";
            }
            String str2 = this.f78552i[i2 / 10];
            return str2 + this.f78553j[i2 % 10];
        }
    }

    /* renamed from: a */
    public String mo112670a(int i, int i2, int i3, int i4) {
        int[] a = m116094a(i - f78547e);
        boolean z = false;
        String a2 = m116092a(a[0], a[1], a[2]);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String b = m116097b(i2, i3 - 1, i4);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        int i5 = a[1];
        int i6 = a[2];
        if (a[3] > 0) {
            z = true;
        }
        return m116093a(i5, i6, z);
    }
}
