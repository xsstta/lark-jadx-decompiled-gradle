package com.lynx.tasm.behavior.shadow.text;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.C26748b;
import com.lynx.tasm.behavior.utils.C26860f;
import com.lynx.tasm.utils.C26955i;
import com.lynx.tasm.utils.C26957k;
import java.text.Bidi;
import java.util.List;

public class BaseTextShadowNode extends ShadowNode {

    /* renamed from: a */
    private C26722i f66108a = new C26722i();

    /* renamed from: b */
    private boolean f66109b;

    /* renamed from: c */
    private boolean f66110c;

    /* renamed from: f */
    private float f66111f = 1.0E21f;

    /* renamed from: f */
    public void mo94838f(String str) {
    }

    /* renamed from: a */
    public C26722i mo67399a() {
        return this.f66108a;
    }

    /* renamed from: b */
    public int mo94833b() {
        return this.f66108a.mo94891a();
    }

    /* renamed from: c */
    public void mo94835c(String str) {
        LLog.m96429e("lynx_BaseTextShadowNode", "setTextOverflow(String) is deprecated.This has no effect.");
    }

    /* renamed from: d */
    public void mo94836d(String str) {
        LLog.m96429e("lynx_BaseTextShadowNode", "setFontWeight(String) is deprecated.This has no effect.");
    }

    /* renamed from: e */
    public void mo94837e(String str) {
        LLog.m96429e("lynx_BaseTextShadowNode", "setFontStyle(String) is deprecated.This has no effect.");
    }

    /* renamed from: g */
    public void mo94839g(String str) {
        LLog.m96429e("lynx_BaseTextShadowNode", "setTextAlign(String) is deprecated.This has no effect.");
    }

    @LynxProp(defaultInt = -16777216, name = "color")
    public void setColor(int i) {
        this.f66108a.f66142c = i;
        mo94787d();
    }

    @LynxProp(name = "enable-font-scaling")
    public void setEnableFontScaling(String str) {
        m96805a(Boolean.parseBoolean(str));
    }

    @LynxProp(defaultFloat = 1.0E21f, name = "letter-spacing")
    public void setLetterSpacing(float f) {
        this.f66108a.f66150k = f;
        mo94787d();
    }

    /* renamed from: b */
    public void mo94834b(String str) {
        LLog.m96429e("lynx_BaseTextShadowNode", "setWhiteSpace(String) is deprecated.This has no effect.");
    }

    @LynxProp(name = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.f66108a.mo94893a(z);
        mo94787d();
    }

    @LynxProp(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "line-spacing")
    public void setLineSpacing(float f) {
        this.f66108a.f66151l = C26955i.m97954c(f);
        mo94787d();
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$b */
    public static class C26711b {

        /* renamed from: a */
        protected int f66113a;

        /* renamed from: b */
        protected int f66114b;

        /* renamed from: c */
        protected Object f66115c;

        /* renamed from: a */
        public void mo94859a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            int i2 = this.f66113a;
            if (i2 == 0) {
                i = 18;
            } else {
                i = 34;
            }
            spannableStringBuilder.setSpan(this.f66115c, i2, this.f66114b, i);
        }

        public C26711b(int i, int i2, Object obj) {
            this.f66113a = i;
            this.f66114b = i2;
            this.f66115c = obj;
        }
    }

    @LynxProp(name = "text-shadow")
    public void setTextShadow(ReadableArray readableArray) {
        this.f66108a.f66156q = null;
        if (readableArray != null) {
            List<C26748b> a = C26748b.m97118a(readableArray);
            if (a.size() != 0) {
                this.f66108a.f66156q = a.get(0);
            }
        }
    }

    @LynxProp(name = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        if (this.f66110c != z) {
            this.f66110c = z;
            float f = this.f66111f;
            if (f != 1.0E21f) {
                setLineHeight(f);
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$a */
    public static class C26710a extends C26711b {

        /* renamed from: d */
        private final Layout.Alignment f66112d;

        @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.C26711b
        /* renamed from: a */
        public void mo94859a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            if (this.f66113a == 0) {
                i = 18;
            } else {
                i = 34;
            }
            Bidi bidi = new Bidi(spannableStringBuilder.subSequence(this.f66113a, this.f66114b).toString(), -2);
            Layout.Alignment alignment = this.f66112d;
            if (!bidi.baseIsLeftToRight()) {
                if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            spannableStringBuilder.setSpan(new LynxStandardAlignmentSpan(alignment), this.f66113a, this.f66114b, i);
        }

        public C26710a(int i, int i2, Layout.Alignment alignment) {
            super(i, i2, null);
            this.f66112d = alignment;
        }
    }

    /* renamed from: a */
    private void m96805a(boolean z) {
        this.f66109b = z;
        setFontSize(this.f66108a.f66152m);
        for (int i = 0; i < mo94806i(); i++) {
            ShadowNode b = mo94802b(i);
            if (b instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) b).m96805a(this.f66109b);
            }
        }
    }

    @LynxProp(name = "font-family")
    public void setFontFamily(String str) {
        if (str == null && !TextUtils.isEmpty(this.f66108a.f66155p)) {
            this.f66108a.f66155p = null;
            mo94787d();
        } else if (str != null && !str.equals(this.f66108a.f66155p)) {
            this.f66108a.f66155p = str;
            mo94787d();
        }
    }

    @LynxProp(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            f = (float) Math.round(f);
        }
        if (this.f66109b) {
            f = C26955i.m97953b(C26955i.m97954c(f)) * this.f66092d.mo94680e().getResources().getConfiguration().fontScale;
        }
        float f2 = (float) ((int) f);
        if (this.f66108a.f66152m != f2) {
            this.f66108a.f66152m = f2;
        }
        mo94787d();
    }

    @LynxProp(defaultInt = 0, name = "font-style")
    public void setFontStyle(int i) {
        if (i == 0 && this.f66108a.f66146g != 0) {
            this.f66108a.f66146g = 0;
            mo94787d();
        }
        if ((i == 2 || i == 3) && this.f66108a.f66146g != 2) {
            this.f66108a.f66146g = 2;
            mo94787d();
        }
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setFontStyle", String.class)) {
            mo94837e(C26957k.m97961d(i));
        }
    }

    @LynxProp(defaultInt = 0, name = "text-align")
    public void setTextAlign(int i) {
        if (i == 3) {
            this.f66108a.f66143d = 0;
        } else {
            this.f66108a.f66143d = i;
        }
        mo94787d();
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setTextAlign", String.class)) {
            mo94839g(C26957k.m97962e(i));
        }
    }

    @LynxProp(defaultInt = 0, name = "text-decoration")
    public void setTextDecoration(int i) {
        this.f66108a.f66157r = i;
        mo94787d();
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setTextDecoration", String.class)) {
            mo94838f(C26957k.m97964g(i));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r2.f66108a.f66141b < 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2.f66108a.f66141b = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2.f66108a.f66141b = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.LynxProp(name = "text-maxlength")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLength(java.lang.String r3) {
        /*
            r2 = this;
            r0 = -1
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a     // Catch:{ all -> 0x0017 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0017 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0017 }
            r1.f66141b = r3     // Catch:{ all -> 0x0017 }
            r2.mo94787d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            int r3 = r3.f66141b
            if (r3 >= 0) goto L_0x0025
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a     // Catch:{ all -> 0x0026 }
            r3.f66141b = r0     // Catch:{ all -> 0x0026 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            int r3 = r3.f66141b
            if (r3 >= 0) goto L_0x0025
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            r3.f66141b = r0
        L_0x0025:
            return
        L_0x0026:
            r3 = move-exception
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a
            int r1 = r1.f66141b
            if (r1 >= 0) goto L_0x0031
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a
            r1.f66141b = r0
        L_0x0031:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLength(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r2.f66108a.f66140a < 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2.f66108a.f66140a = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2.f66108a.f66140a = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.LynxProp(name = "text-maxline")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLine(java.lang.String r3) {
        /*
            r2 = this;
            r0 = -1
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a     // Catch:{ all -> 0x0017 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0017 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0017 }
            r1.f66140a = r3     // Catch:{ all -> 0x0017 }
            r2.mo94787d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            int r3 = r3.f66140a
            if (r3 >= 0) goto L_0x0025
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a     // Catch:{ all -> 0x0026 }
            r3.f66140a = r0     // Catch:{ all -> 0x0026 }
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            int r3 = r3.f66140a
            if (r3 >= 0) goto L_0x0025
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.i r3 = r2.f66108a
            r3.f66140a = r0
        L_0x0025:
            return
        L_0x0026:
            r3 = move-exception
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a
            int r1 = r1.f66140a
            if (r1 >= 0) goto L_0x0031
            com.lynx.tasm.behavior.shadow.text.i r1 = r2.f66108a
            r1.f66140a = r0
        L_0x0031:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLine(java.lang.String):void");
    }

    @LynxProp(defaultInt = 0, name = "text-overflow")
    public void setTextOverflow(int i) {
        this.f66108a.f66148i = i;
        mo94787d();
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setTextOverflow", String.class)) {
            mo94835c(C26957k.m97959b(i));
        }
    }

    @LynxProp(name = "text-vertical-align")
    public void setTextVerticalAlign(String str) {
        if ("top".equals(str)) {
            this.f66108a.f66144e = 0;
        } else if ("center".equals(str)) {
            this.f66108a.f66144e = 1;
        } else if ("bottom".equals(str)) {
            this.f66108a.f66144e = 2;
        }
        mo94787d();
    }

    @LynxProp(defaultInt = 0, name = "white-space")
    public void setWhiteSpace(int i) {
        this.f66108a.f66147h = i;
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setWhiteSpace", String.class)) {
            mo94834b(C26957k.m97957a(i));
        }
        mo94787d();
    }

    @LynxProp(defaultInt = 0, name = "font-weight")
    public void setFontWeight(int i) {
        int i2;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 0;
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 1;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i2 != this.f66108a.f66145f) {
            this.f66108a.f66145f = i2;
            mo94787d();
        }
        if (C26957k.m97958a(getClass(), BaseTextShadowNode.class, "setFontWeight", String.class)) {
            mo94836d(C26957k.m97960c(i));
        }
    }

    @LynxProp(defaultFloat = 1.0E21f, name = "line-height")
    public void setLineHeight(float f) {
        this.f66111f = f;
        if (this.f66110c && f != 1.0E21f) {
            f = C26955i.m97952a((float) ((int) C26955i.m97954c(f)));
        } else if (this.f66109b) {
            f = C26955i.m97953b(C26955i.m97954c(f)) * this.f66092d.mo94680e().getResources().getConfiguration().fontScale;
        }
        if (this.f66108a.f66149j != f) {
            this.f66108a.f66149j = f;
            mo94787d();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public void mo94800a(ShadowNode shadowNode, int i) {
        super.mo94800a(shadowNode, i);
        if (shadowNode instanceof BaseTextShadowNode) {
            ((BaseTextShadowNode) shadowNode).m96805a(this.f66109b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94831a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        if (rawTextShadowNode.mo94869b()) {
            spannableStringBuilder.append((CharSequence) C26860f.m97634a(rawTextShadowNode.mo67399a()));
        } else {
            spannableStringBuilder.append((CharSequence) C26860f.m97635b(rawTextShadowNode.mo67399a()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94832a(SpannableStringBuilder spannableStringBuilder, List<C26711b> list) {
        int length = spannableStringBuilder.length();
        int i = mo94806i();
        for (int i2 = 0; i2 < i; i2++) {
            ShadowNode b = mo94802b(i2);
            if (b instanceof RawTextShadowNode) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) b;
                if (rawTextShadowNode.mo67399a() != null) {
                    mo94831a(spannableStringBuilder, rawTextShadowNode);
                }
            } else if (b instanceof BaseTextShadowNode) {
                BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) b;
                baseTextShadowNode.mo94832a(spannableStringBuilder, list);
                C26722i iVar = this.f66108a;
                iVar.f66153n = baseTextShadowNode.f66108a.f66153n | iVar.f66153n;
            } else if (b instanceof AbsInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                ((AbsInlineImageShadowNode) b).mo94825a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), list);
                this.f66108a.f66153n = true;
            } else {
                throw new RuntimeException("Unexpected view type nested under text node: " + b.getClass());
            }
        }
        int length2 = spannableStringBuilder.length();
        if (length2 > length) {
            mo94830a(length, length2, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94830a(int i, int i2, List<C26711b> list) {
        if ((this.f66108a.f66157r & 2) != 0) {
            list.add(new C26711b(i, i2, new LynxStrikethroughSpan()));
        }
        if ((this.f66108a.f66157r & 1) != 0) {
            list.add(new C26711b(i, i2, new LynxUnderlineSpan()));
        }
        if (this.f66108a.f66143d == 2) {
            list.add(new C26710a(i, i2, Layout.Alignment.ALIGN_OPPOSITE));
        } else if (this.f66108a.f66143d == 0) {
            list.add(new C26710a(i, i2, Layout.Alignment.ALIGN_NORMAL));
        } else if (this.f66108a.f66143d == 1) {
            list.add(new C26711b(i, i2, new LynxStandardAlignmentSpan(Layout.Alignment.ALIGN_CENTER)));
        }
        if (this.f66108a.f66144e != -1 && Build.VERSION.SDK_INT > 25) {
            list.add(new C26711b(i, i2, new C26714a(this.f66108a.f66144e)));
        }
        if (!C26705f.m96794a(this.f66108a.f66149j)) {
            list.add(new C26711b(i, i2, new C26716c(this.f66108a.f66149j)));
        }
        if (this.f66108a.f66156q != null) {
            list.add(new C26711b(i, i2, new C26720g(this.f66108a.f66156q)));
        }
        if (mo67399a().f66150k != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            list.add(new C26711b(i, i2, new C26715b(mo67399a().f66150k)));
        }
    }
}
