package com.bytedance.lynx.tasm.ui.imageloader;

import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.text.AbstractC26821a;

/* renamed from: com.bytedance.lynx.tasm.ui.imageloader.b */
public class C19898b extends AbstractC26821a {

    /* renamed from: a */
    C19897a f48628a;

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: b */
    public void mo67429b() {
    }

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: c */
    public void mo67430c() {
    }

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: d */
    public void mo67431d() {
    }

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: e */
    public void mo67432e() {
    }

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: a */
    public Drawable mo67427a() {
        return this.f48628a;
    }

    @Override // com.lynx.tasm.behavior.ui.text.AbstractC26821a
    /* renamed from: a */
    public void mo67428a(Drawable.Callback callback) {
        super.mo67428a(callback);
        this.f48628a.setCallback(callback);
    }

    public C19898b(int i, int i2, int[] iArr) {
        super(i, i2, iArr);
        this.f48628a = new C19897a(i, i2);
    }
}
