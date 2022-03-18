package com.lynx.component.svg.parser;

import com.lynx.component.svg.parser.SVG;

/* renamed from: com.lynx.component.svg.parser.d */
public class C26476d {

    /* renamed from: a */
    PreserveAspectRatio f65432a;

    /* renamed from: b */
    SVG.C26437a f65433b;

    /* renamed from: c */
    private float f65434c = 14.0f;

    /* renamed from: b */
    public float mo93859b() {
        return this.f65434c;
    }

    /* renamed from: a */
    public boolean mo93858a() {
        if (this.f65433b != null) {
            return true;
        }
        return false;
    }

    public C26476d(float f) {
        this.f65434c = f;
    }

    public C26476d(C26476d dVar) {
        if (dVar != null) {
            this.f65432a = dVar.f65432a;
            this.f65433b = dVar.f65433b;
            this.f65434c = dVar.f65434c;
        }
    }

    /* renamed from: a */
    public C26476d mo93857a(float f, float f2, float f3, float f4) {
        this.f65433b = new SVG.C26437a(f, f2, f3, f4);
        return this;
    }
}
