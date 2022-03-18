package com.lynx.tasm.fontface;

import android.util.Pair;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.fontface.a */
public class C26889a {

    /* renamed from: a */
    private List<Pair<C26734o.AbstractC26736b, Integer>> f66755a = new ArrayList();

    /* renamed from: b */
    private Set<FontFace> f66756b = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<FontFace> mo95692a() {
        return this.f66756b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<Pair<C26734o.AbstractC26736b, Integer>> mo95695b() {
        return this.f66755a;
    }

    C26889a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95694a(FontFace fontFace) {
        this.f66756b.add(fontFace);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95693a(Pair<C26734o.AbstractC26736b, Integer> pair) {
        if (pair != null) {
            this.f66755a.add(pair);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo95696b(FontFace fontFace) {
        if (this.f66756b.contains(fontFace)) {
            return true;
        }
        for (FontFace fontFace2 : this.f66756b) {
            if (fontFace2.mo95688a(fontFace)) {
                return true;
            }
        }
        return false;
    }
}
