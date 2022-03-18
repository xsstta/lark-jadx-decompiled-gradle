package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.behavior.shadow.text.TextRenderer;
import com.lynx.tasm.utils.C26944a;

/* renamed from: com.lynx.tasm.behavior.shadow.text.j */
public class C26723j {
    /* renamed from: a */
    public static TextPaint m96862a(C26722i iVar, Typeface typeface) throws TextRenderer.TypefaceNotFoundException {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(iVar.f66152m);
        textPaint.setColor(iVar.f66142c);
        String str = iVar.f66155p;
        if (!TextUtils.isEmpty(str)) {
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            } else {
                throw new TextRenderer.TypefaceNotFoundException(str);
            }
        } else if (C26944a.m97904a()) {
            textPaint.setTypeface(C26944a.m97905b());
        }
        if (iVar.f66145f == 1) {
            textPaint.setFakeBoldText(true);
        }
        if (iVar.f66146g == 2) {
            textPaint.setTextSkewX(-0.25f);
        }
        if (iVar.f66150k != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(iVar.f66150k / textPaint.getTextSize());
        }
        if ((iVar.f66157r & 1) != 0) {
            textPaint.setUnderlineText(true);
        }
        if ((iVar.f66157r & 2) != 0) {
            textPaint.setStrikeThruText(true);
        }
        if (iVar.f66156q != null) {
            textPaint.setShadowLayer(iVar.f66156q.f66315d, iVar.f66156q.f66313b, iVar.f66156q.f66314c, iVar.f66156q.f66312a);
        }
        return textPaint;
    }

    /* renamed from: a */
    public static Typeface m96861a(AbstractC26684l lVar, C26722i iVar, C26734o.AbstractC26736b bVar) {
        String str = iVar.f66155p;
        if (!TextUtils.isEmpty(str)) {
            return C26734o.m96870a(lVar, str, iVar.mo94891a());
        }
        return null;
    }
}
