package com.prolificinteractive.materialcalendarview.p1228a;

/* renamed from: com.prolificinteractive.materialcalendarview.a.a */
public class C26984a implements AbstractC26991h {

    /* renamed from: b */
    private final CharSequence[] f67012b;

    @Override // com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h
    /* renamed from: a */
    public CharSequence mo96013a(int i) {
        return this.f67012b[i - 1];
    }

    public C26984a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        } else if (charSequenceArr.length == 7) {
            this.f67012b = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
    }
}
