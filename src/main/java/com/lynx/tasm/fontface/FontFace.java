package com.lynx.tasm.fontface;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FontFace {

    /* renamed from: a */
    private String f66752a;

    /* renamed from: b */
    private List<Pair<TYPE, String>> f66753b = new ArrayList();

    /* renamed from: c */
    private C26902c f66754c;

    public enum TYPE {
        URL,
        LOCAL
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C26902c mo95685a() {
        return this.f66754c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<Pair<TYPE, String>> mo95689b() {
        return this.f66753b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95686a(C26902c cVar) {
        this.f66754c = cVar;
    }

    /* renamed from: a */
    public void mo95687a(String str) {
        this.f66752a = str;
    }

    /* renamed from: b */
    public void mo95690b(String str) {
        this.f66753b.add(new Pair<>(TYPE.URL, str));
    }

    /* renamed from: c */
    public void mo95691c(String str) {
        this.f66753b.add(new Pair<>(TYPE.LOCAL, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo95688a(FontFace fontFace) {
        if (this == fontFace) {
            return true;
        }
        for (Pair<TYPE, String> pair : this.f66753b) {
            Iterator<Pair<TYPE, String>> it = fontFace.f66753b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (pair.equals(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
