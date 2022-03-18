package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.lynx.tasm.behavior.AbstractC26684l;

public class TextRenderer {

    /* renamed from: c */
    private static final BoringLayout.Metrics f66120c = new BoringLayout.Metrics();

    /* renamed from: a */
    final C26731m f66121a;

    /* renamed from: b */
    boolean f66122b;

    /* renamed from: d */
    private Layout f66123d;

    /* renamed from: e */
    private Typeface f66124e;

    /* renamed from: f */
    private float f66125f = -1.0f;

    /* renamed from: g */
    private int f66126g = -1;

    /* renamed from: h */
    private int f66127h = -1;

    /* renamed from: a */
    public Layout mo94872a() {
        return this.f66123d;
    }

    public static class TypefaceNotFoundException extends Exception {
        private String fontFamily;

        public TypefaceNotFoundException(String str) {
            this.fontFamily = str;
        }
    }

    /* renamed from: b */
    private TextPaint m96831b(AbstractC26684l lVar) throws TypefaceNotFoundException {
        this.f66124e = C26723j.m96861a(lVar, this.f66121a.mo94904a(), null);
        return C26723j.m96862a(this.f66121a.mo94904a(), this.f66124e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0357 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0249  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m96830a(com.lynx.tasm.behavior.AbstractC26684l r29) throws com.lynx.tasm.behavior.shadow.text.TextRenderer.TypefaceNotFoundException {
        /*
        // Method dump skipped, instructions count: 1026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.TextRenderer.m96830a(com.lynx.tasm.behavior.l):void");
    }

    TextRenderer(AbstractC26684l lVar, C26731m mVar) throws TypefaceNotFoundException {
        this.f66121a = mVar;
        m96830a(lVar);
    }

    /* renamed from: a */
    private StaticLayout.Builder m96829a(CharSequence charSequence, Layout.Alignment alignment, TextPaint textPaint, float f) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.floor((double) f));
        obtain.setAlignment(alignment);
        obtain.setLineSpacing(this.f66121a.mo94904a().f66151l, 1.0f);
        obtain.setIncludePad(this.f66121a.mo94904a().f66154o);
        obtain.setBreakStrategy(this.f66121a.f66168f);
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        return obtain;
    }
}
