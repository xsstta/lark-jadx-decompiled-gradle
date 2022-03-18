package com.appsflyer.internal;

import com.ss.android.vesdk.C64034n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.i */
public final class C2022i {

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.i$a */
    public enum EnumC2023a {
        NONE,
        FIRST,
        ALL
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.i$b */
    public enum EnumC2024b {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    C2022i() {
    }

    /* renamed from: ı */
    private static List<BigDecimal> m8915(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(1)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(2)).toString())));
        return arrayList2;
    }

    /* renamed from: ǃ */
    public static Map m8916(List<Map<String, Object>> list) {
        boolean z;
        boolean z2;
        EnumC2023a aVar;
        EnumC2023a aVar2;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            if (map.get("sVS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (map.get("sVE") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                aVar = EnumC2023a.ALL;
            } else if (z) {
                aVar = EnumC2023a.FIRST;
            } else {
                aVar = EnumC2023a.NONE;
            }
            if (aVar != EnumC2023a.NONE) {
                Integer num = (Integer) map.get("sT");
                String str = (String) map.get("sN");
                if (str != null) {
                    hashMap2.put(C64034n.f161683a, str);
                } else {
                    hashMap2.put(C64034n.f161683a, "uk");
                }
                EnumC2024b bVar = EnumC2024b.values()[num.intValue()];
                ArrayList arrayList2 = new ArrayList(m8915(map.get("sVS")));
                if (aVar == EnumC2023a.ALL) {
                    arrayList2.addAll(m8915(map.get("sVE")));
                }
                if (bVar == EnumC2024b.MAGNETOMETER) {
                    ArrayList arrayList3 = new ArrayList();
                    aVar2 = aVar;
                    BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat("##.#");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                        DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    aVar2 = aVar;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                        DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                        DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                    DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                    DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(arrayList6);
                    arrayList7.add(arrayList5);
                    arrayList = arrayList7;
                }
                hashMap2.put("v", arrayList);
                hashMap.put(EnumC2025e.values()[num.intValue()].f6960, hashMap2);
                if (aVar2 == EnumC2023a.FIRST) {
                    hashMap.put("er", "no_svs");
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("er", "na");
                return hashMap3;
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.i$e */
    public enum EnumC2025e {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        

        /* renamed from: ı */
        String f6960;

        private EnumC2025e(String str) {
            this.f6960 = str;
        }
    }
}
