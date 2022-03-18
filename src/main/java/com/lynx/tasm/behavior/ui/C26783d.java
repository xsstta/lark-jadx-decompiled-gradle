package com.lynx.tasm.behavior.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.lynx.tasm.behavior.ui.d */
public class C26783d {

    /* renamed from: a */
    private final ViewGroup f66409a;

    /* renamed from: b */
    private int f66410b;

    /* renamed from: c */
    private int[] f66411c;

    /* renamed from: a */
    public boolean mo95235a() {
        if (this.f66410b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo95236b() {
        this.f66410b = 0;
        for (int i = 0; i < this.f66409a.getChildCount(); i++) {
            if (UIGroup.m97045a(this.f66409a.getChildAt(i)) != null) {
                this.f66410b++;
            }
        }
        this.f66411c = null;
    }

    public C26783d(ViewGroup viewGroup) {
        this.f66409a = viewGroup;
    }

    /* renamed from: a */
    public void mo95234a(View view) {
        if (UIGroup.m97045a(view) != null) {
            this.f66410b++;
        }
        this.f66411c = null;
    }

    /* renamed from: b */
    public void mo95237b(View view) {
        if (UIGroup.m97045a(view) != null) {
            this.f66410b--;
        }
        this.f66411c = null;
    }

    /* renamed from: a */
    public int mo95233a(int i, int i2) {
        if (this.f66411c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f66409a.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() {
                /* class com.lynx.tasm.behavior.ui.C26783d.C267841 */

                /* renamed from: a */
                public int compare(View view, View view2) {
                    Integer a = UIGroup.m97045a(view);
                    Integer num = 0;
                    if (a == null) {
                        a = num;
                    }
                    Integer a2 = UIGroup.m97045a(view2);
                    if (a2 != null) {
                        num = a2;
                    }
                    return a.intValue() - num.intValue();
                }
            });
            this.f66411c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f66411c[i4] = this.f66409a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f66411c[i2];
    }
}
