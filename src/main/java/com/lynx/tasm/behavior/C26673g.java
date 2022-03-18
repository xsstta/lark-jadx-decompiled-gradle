package com.lynx.tasm.behavior;

import com.lynx.tasm.behavior.ui.background.AbstractC26751a;
import com.lynx.tasm.behavior.ui.background.BackgroundLinearGradientLayer;
import com.lynx.tasm.behavior.ui.background.BackgroundRadialGradientLayer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.g */
public class C26673g {
    /* renamed from: a */
    public static AbstractC26751a m96601a(String str) {
        int i = 16;
        boolean z = false;
        if (str.startsWith("linear-gradient(")) {
            z = true;
        } else if (!str.startsWith("radial-gradient(")) {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (m96600a(str, i, arrayList) == str.length()) {
            return null;
        }
        if (z) {
            return new BackgroundLinearGradientLayer(arrayList);
        }
        return new BackgroundRadialGradientLayer(arrayList);
    }

    /* renamed from: a */
    public static int m96600a(String str, int i, List<String> list) {
        int i2 = i;
        int i3 = 1;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == ')') {
                i3--;
                if (i3 == 0) {
                    if (i > i2) {
                        String trim = str.substring(i2, i).trim();
                        if (!trim.isEmpty()) {
                            list.add(trim);
                        }
                    }
                }
            } else if (charAt == '(') {
                i3++;
            } else if (charAt == ',' && i3 <= 1) {
                if (i > i2) {
                    String trim2 = str.substring(i2, i).trim();
                    if (!trim2.isEmpty()) {
                        list.add(trim2);
                    }
                }
                i2 = i + 1;
            }
            i++;
        }
        return i;
    }
}
