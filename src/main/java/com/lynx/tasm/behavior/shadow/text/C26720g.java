package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.lynx.tasm.behavior.ui.C26748b;

/* renamed from: com.lynx.tasm.behavior.shadow.text.g */
public class C26720g extends CharacterStyle {

    /* renamed from: a */
    private final C26748b f66139a;

    public C26720g(C26748b bVar) {
        this.f66139a = bVar;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f66139a.f66315d, this.f66139a.f66313b, this.f66139a.f66314c, this.f66139a.f66312a);
    }
}
