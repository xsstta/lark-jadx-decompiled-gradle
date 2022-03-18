package com.ss.android.lark.threaddetail.view;

import com.ss.android.lark.keyboard.KeyBoard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardPluginController {

    /* renamed from: a */
    static Map<String, Boolean> f137847a = new HashMap();

    /* renamed from: b */
    static Map<String, Boolean> f137848b = new HashMap();

    /* renamed from: c */
    private final KeyBoard f137849c;

    /* renamed from: d */
    private final List<String> f137850d;

    /* renamed from: e */
    private int f137851e;

    /* renamed from: f */
    private boolean f137852f = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface KeyboardType {
    }

    static {
        f137847a.put("at", true);
        f137847a.put("face", true);
        f137847a.put("photo", false);
        f137847a.put("voice", false);
        f137847a.put("file", false);
        f137847a.put("plus", false);
        f137847a.put("screenshot", false);
        f137847a.put("aa_editor", false);
        f137847a.put("uploadLog", true);
        f137848b.put("at", true);
        f137848b.put("face", true);
        f137848b.put("photo", true);
        f137848b.put("voice", false);
        f137848b.put("file", false);
        f137848b.put("plus", false);
        f137848b.put("aa_editor", false);
        f137848b.put("screenshot", false);
        f137848b.put("uploadLog", true);
    }

    public KeyboardPluginController(KeyBoard fVar, List<String> list) {
        this.f137849c = fVar;
        this.f137850d = list;
    }

    /* renamed from: a */
    public void mo190436a(int i, int i2) {
        this.f137851e = i2;
        boolean z = this.f137852f;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        m216697a(i, z, z2);
    }

    /* renamed from: a */
    public void mo190437a(int i, boolean z) {
        this.f137852f = z;
        boolean z2 = true;
        if (this.f137851e != 1) {
            z2 = false;
        }
        m216698b(i, z, z2);
        if (!z) {
            this.f137849c.mo146820c();
        }
    }

    /* renamed from: a */
    private void m216697a(int i, boolean z, boolean z2) {
        Map<String, Boolean> map;
        boolean z3;
        if (i == 0) {
            map = f137847a;
        } else {
            map = f137848b;
        }
        for (String str : this.f137850d) {
            if (f137847a.containsKey(str)) {
                boolean z4 = true;
                if (z2) {
                    z3 = map.get(str).booleanValue();
                } else {
                    z3 = true;
                }
                KeyBoard fVar = this.f137849c;
                if (!z3 || !z) {
                    z4 = false;
                }
                fVar.mo146816b(str, z4);
            }
        }
    }

    /* renamed from: b */
    private void m216698b(int i, boolean z, boolean z2) {
        Map<String, Boolean> map;
        boolean z3;
        if (i == 0) {
            map = f137847a;
        } else {
            map = f137848b;
        }
        for (String str : this.f137850d) {
            if (f137847a.containsKey(str)) {
                boolean z4 = true;
                if (z2) {
                    z3 = map.get(str).booleanValue();
                } else {
                    z3 = true;
                }
                KeyBoard fVar = this.f137849c;
                if (!z3 || !z) {
                    z4 = false;
                }
                fVar.mo146807a(str, z4);
            }
        }
    }
}
