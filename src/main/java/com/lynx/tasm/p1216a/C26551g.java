package com.lynx.tasm.p1216a;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;

/* renamed from: com.lynx.tasm.a.g */
public class C26551g extends C26547c {
    /* renamed from: a */
    private void m96257a(JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray != null) {
            ArrayList arrayList = new ArrayList();
            if (javaOnlyArray != null) {
                for (int i = 0; i < javaOnlyArray.size(); i++) {
                    JavaOnlyMap map = javaOnlyArray.getMap(i);
                    if (map != null && !map.isEmpty()) {
                        arrayList.add(map);
                    }
                }
            }
            mo94347a("attachedCells", arrayList);
        }
    }

    public C26551g(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public static C26551g m96256a(int i, String str) {
        return new C26551g(i, str);
    }

    /* renamed from: a */
    public void mo94355a(int i, JavaOnlyArray javaOnlyArray) {
        mo94347a("state", Integer.valueOf(i));
        if (javaOnlyArray != null) {
            m96257a(javaOnlyArray);
        }
    }

    /* renamed from: a */
    public void mo94354a(int i, int i2, int i3, int i4, JavaOnlyArray javaOnlyArray) {
        if (DisplayMetricsHolder.m97898a() != null) {
            float f = DisplayMetricsHolder.m97898a().density;
            mo94347a("scrollLeft", Float.valueOf(((float) i) / f));
            mo94347a("scrollTop", Float.valueOf(((float) i2) / f));
            mo94347a("deltaX", Float.valueOf(((float) i3) / f));
            mo94347a("deltaY", Float.valueOf(((float) i4) / f));
            m96257a(javaOnlyArray);
        }
    }
}
