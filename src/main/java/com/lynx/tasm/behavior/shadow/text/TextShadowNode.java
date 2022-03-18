package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.shadow.AbstractC26703d;
import com.lynx.tasm.behavior.shadow.C26704e;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.behavior.shadow.text.TextRenderer;
import com.lynx.tasm.behavior.utils.C26860f;
import com.lynx.tasm.fontface.C26890b;
import com.lynx.tasm.utils.C26957k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TextShadowNode extends BaseTextShadowNode implements AbstractC26703d {

    /* renamed from: a */
    protected TextRenderer f66128a;

    /* renamed from: b */
    protected CharSequence f66129b;

    /* renamed from: c */
    private int f66130c;

    public TextShadowNode() {
        m96833t();
    }

    /* renamed from: t */
    private void m96833t() {
        if (!mo94804g()) {
            mo94785a(this);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: c */
    public void mo94786c() {
        if (!mo94804g()) {
            this.f66128a = null;
            mo94875r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo94874q() {
        if (mo94806i() != 1 || !(mo94802b(0) instanceof RawTextShadowNode) || !C26705f.m96794a(mo67399a().f66149j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C26733n mo94876s() {
        return new C26733n(this.f66128a.mo94872a(), mo67399a().f66153n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo94875r() {
        if (mo94874q()) {
            RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) mo94802b(0);
            String a = rawTextShadowNode.mo67399a();
            if (rawTextShadowNode.mo94869b()) {
                this.f66129b = C26860f.m97634a(a);
            } else {
                this.f66129b = C26860f.m97635b(a);
            }
            if (this.f66129b != null) {
                ArrayList<BaseTextShadowNode.C26711b> arrayList = new ArrayList();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.f66129b);
                mo94830a(0, this.f66129b.length(), arrayList);
                for (BaseTextShadowNode.C26711b bVar : arrayList) {
                    bVar.mo94859a(spannableStringBuilder);
                }
                this.f66129b = spannableStringBuilder;
                return;
            }
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        mo94832a(spannableStringBuilder2, arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            arrayList2.get(size).mo94859a(spannableStringBuilder2);
        }
        this.f66129b = spannableStringBuilder2;
    }

    /* renamed from: h */
    public void mo94873h(String str) {
        LLog.m96429e("lynx_TextShadowNode", "setTextAlign(String) is deprecated.This has no effect.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.TextShadowNode$a */
    public static class C26713a implements C26734o.AbstractC26736b {

        /* renamed from: a */
        private WeakReference<ShadowNode> f66131a;

        C26713a(ShadowNode shadowNode) {
            this.f66131a = new WeakReference<>(shadowNode);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C26734o.AbstractC26736b
        /* renamed from: a */
        public void mo94878a(Typeface typeface, int i) {
            ShadowNode shadowNode = this.f66131a.get();
            if (shadowNode != null) {
                shadowNode.mo94787d();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public void mo94797a(PaintingContext paintingContext) {
        super.mo94797a(paintingContext);
        if (this.f66128a != null) {
            paintingContext.mo94539a(mo94808k(), mo94876s());
        }
    }

    @LynxProp(name = "word-break")
    public void setWordBreakStrategy(int i) {
        if (i == 1) {
            this.f66130c = 1;
        } else if (i == 0) {
            this.f66130c = 2;
        } else {
            this.f66130c = 0;
        }
        mo94787d();
        if (C26957k.m97958a(getClass(), TextShadowNode.class, "setWordBreakStrategy", String.class)) {
            mo94873h(C26957k.m97963f(i));
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: a */
    public void mo94783a(int i, int i2, int i3, int i4) {
        super.mo94783a(i, i2, i3, i4);
        if (this.f66128a == null) {
            mo53284a(this, (float) i3, MeasureMode.EXACTLY, (float) i4, MeasureMode.EXACTLY);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC26703d
    /* renamed from: a */
    public long mo53284a(LayoutNode layoutNode, float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        this.f66128a = null;
        if (measureMode != MeasureMode.UNDEFINED && measureMode2 != MeasureMode.UNDEFINED && f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            return C26704e.m96793a(0, 0);
        }
        CharSequence charSequence = this.f66129b;
        if (charSequence == null) {
            return C26704e.m96793a(0, 0);
        }
        C26722i b = mo67399a().mo94894b();
        C26731m mVar = new C26731m(charSequence, b, measureMode, measureMode2, f, f2, this.f66130c);
        try {
            this.f66128a = C26728l.m96865a().mo94903a(mo94810m(), mVar);
        } catch (TextRenderer.TypefaceNotFoundException unused) {
            C26890b.m97746a().mo95697a(mo94810m(), b.mo94896d(), b.mo94895c(), new C26713a(this));
            mVar.mo94904a().mo94892a((String) null);
            try {
                this.f66128a = C26728l.m96865a().mo94903a(mo94810m(), mVar);
            } catch (TextRenderer.TypefaceNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return C26704e.m96792a((float) this.f66128a.mo94872a().getWidth(), (float) this.f66128a.mo94872a().getHeight());
    }
}
