package com.lynx.tasm.behavior.ui.text;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26673g;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.background.AbstractC26751a;
import com.lynx.tasm.behavior.ui.text.FiberBaseTextUI;
import com.lynx.tasm.behavior.utils.C26860f;
import com.lynx.tasm.utils.C26959m;
import java.util.ArrayList;

public class FiberFlattenUIText extends LynxFlattenUI {

    /* renamed from: a */
    protected CharSequence f66561a;

    /* renamed from: b */
    private FiberBaseTextUI f66562b;

    /* renamed from: c */
    private Layout f66563c;

    /* renamed from: d */
    private boolean f66564d;

    /* renamed from: e */
    private AbstractC26751a f66565e;

    /* renamed from: f */
    private Drawable.Callback f66566f = new C26818a();

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: O */
    public CharSequence mo94932O() {
        CharSequence O = super.mo94932O();
        if (O != null) {
            return O;
        }
        return mo53304h();
    }

    /* renamed from: h */
    public CharSequence mo53304h() {
        Layout layout = this.f66563c;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo53301e() {
        if (mo94921D().size() != 1 || !C26705f.m96794a(this.f66562b.mo53300d().f66149j)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m97385i() {
        if (this.f66564d && (mo53304h() instanceof Spanned)) {
            Spanned spanned = (Spanned) mo53304h();
            AbstractC26821a[] aVarArr = (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class);
            for (AbstractC26821a aVar : aVarArr) {
                aVar.mo67429b();
                aVar.mo67428a((Drawable.Callback) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo95439f() {
        String str = "FiberFlattenUIText.prepareSpan." + mo94919B();
        TraceEvent.m96443a(str);
        if (this.f66561a != null) {
            TraceEvent.m96444b(str);
        } else if (mo53301e()) {
            FiberRawText fiberRawText = (FiberRawText) mo94921D().get(0);
            String d = fiberRawText.mo53300d();
            if (fiberRawText.mo53301e()) {
                this.f66561a = C26860f.m97634a(d);
            } else {
                this.f66561a = C26860f.m97635b(d);
            }
            if (this.f66561a == null) {
                TraceEvent.m96444b(str);
                return;
            }
            ArrayList<FiberBaseTextUI.C26815b> arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f66561a);
            this.f66562b.mo95425a(0, this.f66561a.length(), arrayList);
            for (FiberBaseTextUI.C26815b bVar : arrayList) {
                bVar.mo95436a(spannableStringBuilder);
            }
            this.f66561a = spannableStringBuilder;
            this.f66562b.mo95428a((CharSequence) spannableStringBuilder);
            TraceEvent.m96444b(str);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            ArrayList arrayList2 = new ArrayList();
            this.f66562b.mo95427a(spannableStringBuilder2, arrayList2);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((FiberBaseTextUI.C26815b) arrayList2.get(size)).mo95436a(spannableStringBuilder2);
            }
            this.f66561a = spannableStringBuilder2;
            this.f66562b.mo95428a((CharSequence) spannableStringBuilder2);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FiberFlattenUIText$a */
    private class C26818a implements Drawable.Callback {
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private C26818a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            if (C26959m.m97972a()) {
                FiberFlattenUIText.this.mo95041w();
            }
        }
    }

    @LynxProp(name = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.f66562b.mo95432b(z);
    }

    @LynxProp(name = "text-maxlength")
    public void setTextMaxLength(String str) {
        this.f66562b.mo95431b(str);
    }

    @LynxProp(name = "text-maxline")
    public void setTextMaxLine(String str) {
        this.f66562b.mo67411a(str);
    }

    @LynxProp(name = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        this.f66562b.mo95429a(z);
    }

    @LynxProp(name = "text-gradient")
    public void setTextGradient(String str) {
        this.f66565e = C26673g.m96601a(str);
        mo95041w();
    }

    public FiberFlattenUIText(AbstractC26684l lVar) {
        super(lVar);
        this.f66562b = new FiberBaseTextUI(lVar, "text");
    }

    /* renamed from: a */
    public void mo95438a(C26733n nVar) {
        m97385i();
        this.f66563c = nVar.mo94910a();
        boolean b = nVar.mo94911b();
        this.f66564d = b;
        if (b && (mo53304h() instanceof Spanned)) {
            AbstractC26821a.m97430a((Spanned) mo53304h(), this.f66566f);
        }
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94958a(Object obj) {
        if (obj instanceof C26733n) {
            mo95438a((C26733n) obj);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    /* renamed from: c */
    public void mo95052c(Canvas canvas) {
        super.mo95052c(canvas);
        if (this.f66563c != null) {
            int i = this.f66245z + this.f66203I;
            int i2 = this.f66195A + this.f66204J;
            int i3 = this.f66196B + this.f66202H;
            int i4 = this.f66197C + this.f66205K;
            canvas.save();
            if (mo94930M() != 0) {
                Rect N = mo94931N();
                if (N != null) {
                    canvas.clipRect(N);
                }
            } else {
                canvas.clipRect(i, i3, mo94937T() - i2, mo94938U() - i4);
            }
            canvas.translate((float) i, (float) i3);
            AbstractC26751a aVar = this.f66565e;
            if (aVar != null) {
                aVar.setBounds(new Rect(0, 0, this.f66563c.getWidth(), this.f66563c.getHeight()));
                this.f66563c.getPaint().setShader(this.f66565e.mo95160f());
            }
            this.f66563c.draw(canvas);
            canvas.restore();
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
                    case -1370507312:
                        if (nextKey.equals("text-gradient")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 125536225:
                        if (nextKey.equals("use-web-line-height")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1629007544:
                        if (nextKey.equals("text-maxline")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2104465578:
                        if (nextKey.equals("text-maxlength")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    setIncludeFontPadding(readableMap.getBoolean(nextKey, false));
                } else if (c == 1) {
                    setTextGradient(readableMap.getString(nextKey));
                } else if (c == 2) {
                    setTextMaxLength(readableMap.getString(nextKey));
                } else if (c == 3) {
                    setTextMaxLine(readableMap.getString(nextKey));
                } else if (c == 4) {
                    setUseWebLineHeight(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo53259a(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public AbstractC26623a mo94945a(float f, float f2) {
        Layout layout = this.f66563c;
        return C26822b.m97440a(f, f2, this, layout, C26822b.m97438a(layout));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94965a(int[] iArr, float[] fArr, String str) {
        this.f66562b.mo94965a(iArr, fArr, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public long mo94944a(float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        mo95439f();
        long b = this.f66562b.mo95430b(f, measureMode, f2, measureMode2);
        this.f66563c = this.f66562b.mo53301e();
        return b;
    }
}
