package com.bef.effectsdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bef.effectsdk.b */
public class C2079b {

    /* renamed from: a */
    private static int f7173a;

    /* renamed from: b */
    private static int f7174b;

    /* renamed from: c */
    private static int f7175c;

    /* renamed from: d */
    private static int f7176d;

    /* renamed from: e */
    private static int f7177e;

    /* renamed from: f */
    private static int f7178f;

    /* renamed from: g */
    private static int f7179g;

    /* renamed from: h */
    private static int f7180h;

    /* renamed from: i */
    private static int f7181i;

    /* renamed from: a */
    public static List<String> m9045a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        if (f7179g == 1 || f7178f == 1) {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
        }
        if (f7178f == 1) {
            arrayList.add("ttffmpeg");
        }
        if (f7173a == 1) {
            arrayList.add("iesapplogger");
        }
        arrayList.add("bytenn");
        if (f7174b == 1) {
            arrayList.add("audioeffect");
        }
        if (f7175c == 1 || f7176d == 1) {
            arrayList.add("speechsdk");
        }
        arrayList.add("gaia_lib");
        arrayList.add("AGFX");
        if (f7177e == 1) {
            arrayList.add("lens");
        }
        if (f7180h == 1) {
            arrayList.add("jazz");
        }
        if (f7181i == 1) {
            arrayList.add("bytevc0");
        }
        arrayList.add("effect");
        return arrayList;
    }
}
