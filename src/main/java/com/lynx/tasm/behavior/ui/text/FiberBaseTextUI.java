package com.lynx.tasm.behavior.ui.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.C26704e;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.text.C26714a;
import com.lynx.tasm.behavior.shadow.text.C26715b;
import com.lynx.tasm.behavior.shadow.text.C26716c;
import com.lynx.tasm.behavior.shadow.text.C26718e;
import com.lynx.tasm.behavior.shadow.text.C26720g;
import com.lynx.tasm.behavior.shadow.text.C26722i;
import com.lynx.tasm.behavior.shadow.text.C26728l;
import com.lynx.tasm.behavior.shadow.text.C26731m;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.behavior.shadow.text.LynxStandardAlignmentSpan;
import com.lynx.tasm.behavior.shadow.text.LynxStrikethroughSpan;
import com.lynx.tasm.behavior.shadow.text.LynxUnderlineSpan;
import com.lynx.tasm.behavior.shadow.text.TextRenderer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.C26860f;
import com.lynx.tasm.fontface.C26890b;
import com.lynx.tasm.utils.C26955i;
import java.lang.ref.WeakReference;
import java.text.Bidi;
import java.util.List;

public class FiberBaseTextUI extends LynxBaseUI {

    /* renamed from: a */
    protected TextRenderer f66544a;

    /* renamed from: b */
    protected CharSequence f66545b;

    /* renamed from: c */
    protected C26733n f66546c;

    /* renamed from: d */
    AbstractC26684l f66547d;

    /* renamed from: e */
    String f66548e;

    /* renamed from: f */
    private C26722i f66549f = new C26722i();

    /* renamed from: g */
    private boolean f66550g;

    /* renamed from: h */
    private boolean f66551h;

    /* renamed from: i */
    private float f66552i = 1.0E21f;

    /* renamed from: j */
    private String f66553j;

    /* renamed from: k */
    private boolean f66554k;

    /* renamed from: l */
    private int f66555l;

    /* renamed from: d */
    public C26722i mo53300d() {
        return this.f66549f;
    }

    /* renamed from: e */
    public Layout mo53301e() {
        TextRenderer textRenderer = this.f66544a;
        if (textRenderer != null) {
            return textRenderer.mo94872a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C26733n mo95435f() {
        return new C26733n(this.f66544a.mo94872a(), mo53300d().f66153n);
    }

    /* renamed from: a */
    public void mo95428a(CharSequence charSequence) {
        this.f66545b = charSequence;
    }

    /* renamed from: b */
    public void mo95432b(boolean z) {
        this.f66549f.mo94893a(z);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FiberBaseTextUI$c */
    public static class C26816c implements C26734o.AbstractC26736b {

        /* renamed from: a */
        private WeakReference<FiberBaseTextUI> f66560a;

        C26816c(FiberBaseTextUI fiberBaseTextUI) {
            this.f66560a = new WeakReference<>(fiberBaseTextUI);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C26734o.AbstractC26736b
        /* renamed from: a */
        public void mo94878a(Typeface typeface, int i) {
            if (this.f66560a.get() == null) {
            }
        }
    }

    /* renamed from: c */
    public void mo95434c(boolean z) {
        this.f66550g = z;
        setFontSize(this.f66549f.f66152m);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FiberBaseTextUI$b */
    public static class C26815b {

        /* renamed from: a */
        protected int f66557a;

        /* renamed from: b */
        protected int f66558b;

        /* renamed from: c */
        protected Object f66559c;

        /* renamed from: a */
        public void mo95436a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            int i2 = this.f66557a;
            if (i2 == 0) {
                i = 18;
            } else {
                i = 34;
            }
            spannableStringBuilder.setSpan(this.f66559c, i2, this.f66558b, i);
        }

        public C26815b(int i, int i2, Object obj) {
            this.f66557a = i;
            this.f66558b = i2;
            this.f66559c = obj;
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FiberBaseTextUI$a */
    public static class C26814a extends C26815b {

        /* renamed from: d */
        private final Layout.Alignment f66556d;

        @Override // com.lynx.tasm.behavior.ui.text.FiberBaseTextUI.C26815b
        /* renamed from: a */
        public void mo95436a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            if (this.f66557a == 0) {
                i = 18;
            } else {
                i = 34;
            }
            Bidi bidi = new Bidi(spannableStringBuilder.subSequence(this.f66557a, this.f66558b).toString(), -2);
            Layout.Alignment alignment = this.f66556d;
            if (!bidi.baseIsLeftToRight()) {
                if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            spannableStringBuilder.setSpan(new LynxStandardAlignmentSpan(alignment), this.f66557a, this.f66558b, i);
        }

        public C26814a(int i, int i2, Layout.Alignment alignment) {
            super(i, i2, null);
            this.f66556d = alignment;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r2.f66549f.f66140a < 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2.f66549f.f66140a = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2.f66549f.f66140a = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67411a(java.lang.String r3) {
        /*
            r2 = this;
            r0 = -1
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f     // Catch:{ all -> 0x0014 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0014 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0014 }
            r1.f66140a = r3     // Catch:{ all -> 0x0014 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            int r3 = r3.f66140a
            if (r3 >= 0) goto L_0x0022
            goto L_0x001e
        L_0x0014:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f     // Catch:{ all -> 0x0023 }
            r3.f66140a = r0     // Catch:{ all -> 0x0023 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            int r3 = r3.f66140a
            if (r3 >= 0) goto L_0x0022
        L_0x001e:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            r3.f66140a = r0
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f
            int r1 = r1.f66140a
            if (r1 >= 0) goto L_0x002e
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f
            r1.f66140a = r0
        L_0x002e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.text.FiberBaseTextUI.mo67411a(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r2.f66549f.f66141b < 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2.f66549f.f66141b = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2.f66549f.f66141b = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95431b(java.lang.String r3) {
        /*
            r2 = this;
            r0 = -1
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f     // Catch:{ all -> 0x0014 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0014 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0014 }
            r1.f66141b = r3     // Catch:{ all -> 0x0014 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            int r3 = r3.f66141b
            if (r3 >= 0) goto L_0x0022
            goto L_0x001e
        L_0x0014:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f     // Catch:{ all -> 0x0023 }
            r3.f66141b = r0     // Catch:{ all -> 0x0023 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            int r3 = r3.f66141b
            if (r3 >= 0) goto L_0x0022
        L_0x001e:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66549f
            r3.f66141b = r0
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f
            int r1 = r1.f66141b
            if (r1 >= 0) goto L_0x002e
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66549f
            r1.f66141b = r0
        L_0x002e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.text.FiberBaseTextUI.mo95431b(java.lang.String):void");
    }

    /* renamed from: c */
    public void mo95433c(float f) {
        this.f66552i = f;
        if (this.f66551h && f != 1.0E21f) {
            f = C26955i.m97952a((float) ((int) C26955i.m97954c(f)));
        } else if (this.f66550g) {
            f = C26955i.m97953b(C26955i.m97954c(f));
        }
        if (this.f66549f.f66149j != f) {
            this.f66549f.f66149j = f;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            f = (float) Math.round(f);
        }
        if (this.f66550g) {
            f = C26955i.m97953b(C26955i.m97954c(f));
        }
        float f2 = (float) ((int) f);
        if (this.f66549f.f66152m != f2) {
            this.f66549f.f66152m = f2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            char c = 65535;
            try {
                switch (nextKey.hashCode()) {
                    case -2137322088:
                        if (nextKey.equals("include-font-padding")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 125536225:
                        if (nextKey.equals("use-web-line-height")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1629007544:
                        if (nextKey.equals("text-maxline")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 2104465578:
                        if (nextKey.equals("text-maxlength")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    mo95432b(readableMap.getBoolean(nextKey, false));
                } else if (c == 1) {
                    mo95431b(readableMap.getString(nextKey));
                } else if (c == 2) {
                    mo67411a(readableMap.getString(nextKey));
                } else if (c == 3) {
                    mo95429a(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo53259a(sVar);
    }

    /* renamed from: a */
    public void mo95429a(boolean z) {
        if (this.f66551h != z) {
            this.f66551h = z;
            float f = this.f66552i;
            if (f != 1.0E21f) {
                mo95433c(f);
            }
        }
    }

    public FiberBaseTextUI(AbstractC26684l lVar, String str) {
        super(lVar);
        this.f66547d = lVar;
        this.f66548e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95426a(SpannableStringBuilder spannableStringBuilder, String str) {
        if (this.f66554k) {
            spannableStringBuilder.append((CharSequence) C26860f.m97634a(str));
        } else {
            spannableStringBuilder.append((CharSequence) C26860f.m97635b(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95427a(SpannableStringBuilder spannableStringBuilder, List<C26815b> list) {
        int length = spannableStringBuilder.length();
        int size = mo94921D().size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI = mo94921D().get(i);
            mo95426a(spannableStringBuilder, this.f66553j);
            if (lynxBaseUI instanceof FiberBaseTextUI) {
                FiberBaseTextUI fiberBaseTextUI = (FiberBaseTextUI) lynxBaseUI;
                fiberBaseTextUI.mo95427a(spannableStringBuilder, list);
                C26722i iVar = this.f66549f;
                iVar.f66153n = fiberBaseTextUI.f66549f.f66153n | iVar.f66153n;
            } else if (lynxBaseUI instanceof FiberAbsInlineImageUI) {
                spannableStringBuilder.append("I");
                ((FiberAbsInlineImageUI) lynxBaseUI).mo95421a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), list);
                this.f66549f.f66153n = true;
            } else {
                throw new RuntimeException("Unexpected view type nested under text node: " + lynxBaseUI.getClass());
            }
        }
        int length2 = spannableStringBuilder.length();
        if (length2 > length) {
            mo95425a(length, length2, list);
        }
    }

    /* renamed from: b */
    private void m97364b(int[] iArr, float[] fArr) {
        boolean z;
        int length = iArr.length;
        for (int i = 0; i < length; i = i + 2 + 1) {
            switch (iArr[i]) {
                case 1:
                    setFontSize(fArr[i]);
                    break;
                case 2:
                    this.f66549f.f66142c = (int) fArr[i];
                    break;
                case 3:
                    this.f66549f.f66147h = (int) fArr[i];
                    break;
                case 4:
                    this.f66549f.f66148i = (int) fArr[i];
                    break;
                case 5:
                    this.f66549f.f66145f = (int) fArr[i];
                    break;
                case 6:
                    this.f66549f.f66146g = (int) fArr[i];
                    break;
                case 8:
                    mo95433c(fArr[i]);
                    break;
                case 9:
                    if (((int) fArr[i]) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    mo95434c(z);
                    break;
                case 10:
                    this.f66549f.f66150k = fArr[i];
                    break;
                case 11:
                    this.f66549f.f66151l = fArr[i];
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    this.f66549f.f66143d = (int) fArr[i];
                    break;
                case 13:
                    int i2 = (int) fArr[i];
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.f66555l = 1;
                            break;
                        } else {
                            this.f66555l = 0;
                            break;
                        }
                    } else {
                        this.f66555l = 2;
                        break;
                    }
                case 14:
                    if (((int) fArr[i]) == 0) {
                        this.f66549f.f66157r &= -2;
                        break;
                    } else {
                        this.f66549f.f66157r |= 1;
                        break;
                    }
                case 15:
                    if (((int) fArr[i]) == 0) {
                        this.f66549f.f66157r &= -3;
                        break;
                    } else {
                        C26722i iVar = this.f66549f;
                        iVar.f66157r = 2 | iVar.f66157r;
                        break;
                    }
                case 17:
                    this.f66549f.mo94897e();
                    this.f66549f.f66156q.f66313b = fArr[i];
                    break;
                case 18:
                    this.f66549f.mo94897e();
                    this.f66549f.f66156q.f66314c = fArr[i];
                    break;
                case 19:
                    this.f66549f.mo94897e();
                    this.f66549f.f66156q.f66315d = fArr[i];
                    break;
                case 20:
                    this.f66549f.mo94897e();
                    this.f66549f.f66156q.f66312a = (int) fArr[i];
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95425a(int i, int i2, List<C26815b> list) {
        list.add(new C26815b(i, i2, new C26718e(mo94576q())));
        if ((this.f66549f.f66157r & 2) != 0) {
            list.add(new C26815b(i, i2, new LynxStrikethroughSpan()));
        }
        if ((this.f66549f.f66157r & 1) != 0) {
            list.add(new C26815b(i, i2, new LynxUnderlineSpan()));
        }
        if (this.f66549f.f66143d == 2) {
            list.add(new C26814a(i, i2, Layout.Alignment.ALIGN_OPPOSITE));
        } else if (this.f66549f.f66143d == 0) {
            list.add(new C26814a(i, i2, Layout.Alignment.ALIGN_NORMAL));
        } else if (this.f66549f.f66143d == 1) {
            list.add(new C26815b(i, i2, new LynxStandardAlignmentSpan(Layout.Alignment.ALIGN_CENTER)));
        }
        if (this.f66549f.f66144e != -1 && Build.VERSION.SDK_INT > 25) {
            list.add(new C26815b(i, i2, new C26714a(this.f66549f.f66144e)));
        }
        if (!C26705f.m96794a(this.f66549f.f66149j)) {
            list.add(new C26815b(i, i2, new C26716c(this.f66549f.f66149j)));
        }
        if (this.f66549f.f66156q != null) {
            if (!(this.f66549f.f66156q.f66313b == BitmapDescriptorFactory.HUE_RED && this.f66549f.f66156q.f66314c == BitmapDescriptorFactory.HUE_RED && this.f66549f.f66156q.f66315d == BitmapDescriptorFactory.HUE_RED)) {
                list.add(new C26815b(i, i2, new C26720g(this.f66549f.f66156q)));
            }
            if (mo53300d().f66150k != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
                list.add(new C26815b(i, i2, new C26715b(mo53300d().f66150k)));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94965a(int[] iArr, float[] fArr, String str) {
        String str2 = "FiberBaseText.setTextStyleData." + mo94919B();
        TraceEvent.m96443a(str2);
        if (str != null) {
            this.f66549f.f66155p = str;
        }
        m97364b(iArr, fArr);
        TraceEvent.m96444b(str2);
    }

    /* renamed from: b */
    public long mo95430b(float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        String str = "FiberBaseText.doMeasureText." + mo94919B();
        TraceEvent.m96443a(str);
        this.f66544a = null;
        if (measureMode != MeasureMode.UNDEFINED) {
            if (measureMode2 != MeasureMode.UNDEFINED && f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
                TraceEvent.m96444b(str);
                return C26704e.m96793a(0, 0);
            }
        }
        CharSequence charSequence = this.f66545b;
        if (charSequence == null) {
            TraceEvent.m96444b(str);
            return C26704e.m96793a(0, 0);
        }
        C26722i b = mo53300d().mo94894b();
        C26731m mVar = new C26731m(charSequence, b, measureMode, measureMode2, f, f2, this.f66555l);
        try {
            this.f66544a = C26728l.m96865a().mo94903a(this.f66547d, mVar);
        } catch (TextRenderer.TypefaceNotFoundException unused) {
            C26890b.m97746a().mo95697a(this.f66547d, b.mo94896d(), b.mo94895c(), new C26816c(this));
            mVar.mo94904a().mo94892a((String) null);
            try {
                this.f66544a = C26728l.m96865a().mo94903a(this.f66547d, mVar);
            } catch (TextRenderer.TypefaceNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        float width = (float) this.f66544a.mo94872a().getWidth();
        this.f66546c = mo95435f();
        TraceEvent.m96444b(str);
        return C26704e.m96792a(width, (float) this.f66544a.mo94872a().getHeight());
    }
}
