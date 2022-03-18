package com.lynx.tasm.behavior.ui.text;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26673g;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.background.AbstractC26751a;
import com.lynx.tasm.utils.C26959m;

public class FlattenUIText extends LynxFlattenUI {

    /* renamed from: a */
    private Layout f66572a;

    /* renamed from: b */
    private boolean f66573b;

    /* renamed from: c */
    private AbstractC26751a f66574c;

    /* renamed from: d */
    private Drawable.Callback f66575d = new C26820a();

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
        return mo53301e();
    }

    /* renamed from: e */
    public CharSequence mo53301e() {
        Layout layout = this.f66572a;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    /* renamed from: f */
    private void m97414f() {
        if (this.f66573b && (mo53301e() instanceof Spanned)) {
            Spanned spanned = (Spanned) mo53301e();
            AbstractC26821a[] aVarArr = (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class);
            for (AbstractC26821a aVar : aVarArr) {
                aVar.mo67429b();
                aVar.mo67428a((Drawable.Callback) null);
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FlattenUIText$a */
    private class C26820a implements Drawable.Callback {
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private C26820a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            if (C26959m.m97972a()) {
                FlattenUIText.this.mo95041w();
            }
        }
    }

    public FlattenUIText(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "text-gradient")
    public void setTextGradient(String str) {
        this.f66574c = C26673g.m96601a(str);
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94958a(Object obj) {
        if (obj instanceof C26733n) {
            mo95460a((C26733n) obj);
        }
    }

    /* renamed from: a */
    public void mo95460a(C26733n nVar) {
        m97414f();
        this.f66572a = nVar.mo94910a();
        boolean b = nVar.mo94911b();
        this.f66573b = b;
        if (b && (mo53301e() instanceof Spanned)) {
            AbstractC26821a.m97430a((Spanned) mo53301e(), this.f66575d);
        }
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    /* renamed from: c */
    public void mo95052c(Canvas canvas) {
        super.mo95052c(canvas);
        if (this.f66572a != null) {
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
            AbstractC26751a aVar = this.f66574c;
            if (aVar != null) {
                aVar.setBounds(new Rect(0, 0, this.f66572a.getWidth(), this.f66572a.getHeight()));
                this.f66572a.getPaint().setShader(this.f66574c.mo95160f());
            }
            this.f66572a.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public AbstractC26623a mo94945a(float f, float f2) {
        Layout layout = this.f66572a;
        return C26822b.m97440a(f, f2, this, layout, C26822b.m97438a(layout));
    }
}
