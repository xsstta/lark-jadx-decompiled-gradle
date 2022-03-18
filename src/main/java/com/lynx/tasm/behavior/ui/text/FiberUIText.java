package com.lynx.tasm.behavior.ui.text;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.text.FiberBaseTextUI;
import com.lynx.tasm.behavior.utils.C26860f;
import java.util.ArrayList;

public class FiberUIText extends LynxUI<AndroidText> {

    /* renamed from: a */
    protected CharSequence f66570a;

    /* renamed from: b */
    private FiberBaseTextUI f66571b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo53300d() {
        if (mo94921D().size() != 0 || !C26705f.m96794a(this.f66571b.mo53300d().f66149j)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        int i = this.f66245z + this.f66203I;
        int i2 = this.f66195A + this.f66204J;
        ((AndroidText) this.f66253Z).setPadding(i, this.f66196B + this.f66202H, i2, this.f66197C + this.f66205K);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo53301e() {
        String str = "FiberUIText.prepareSpan." + mo94919B();
        TraceEvent.m96443a(str);
        if (mo53300d()) {
            FiberRawText fiberRawText = (FiberRawText) mo94921D().get(0);
            String d = fiberRawText.mo53300d();
            if (fiberRawText.mo53301e()) {
                this.f66570a = C26860f.m97634a(d);
            } else {
                this.f66570a = C26860f.m97635b(d);
            }
            if (this.f66570a == null) {
                TraceEvent.m96444b(str);
                return;
            }
            ArrayList<FiberBaseTextUI.C26815b> arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f66570a);
            this.f66571b.mo95425a(0, this.f66570a.length(), arrayList);
            for (FiberBaseTextUI.C26815b bVar : arrayList) {
                bVar.mo95436a(spannableStringBuilder);
            }
            this.f66570a = spannableStringBuilder;
            TraceEvent.m96444b(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        this.f66571b.mo95427a(spannableStringBuilder2, arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((FiberBaseTextUI.C26815b) arrayList2.get(size)).mo95436a(spannableStringBuilder2);
        }
        this.f66570a = spannableStringBuilder2;
        TraceEvent.m96444b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AndroidText mo33942b(Context context) {
        return new AndroidText(context);
    }

    @LynxProp(name = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.f66571b.mo95432b(z);
    }

    @LynxProp(name = "text-maxlength")
    public void setTextMaxLength(String str) {
        this.f66571b.mo95431b(str);
    }

    @LynxProp(name = "text-maxline")
    public void setTextMaxLine(String str) {
        this.f66571b.mo67411a(str);
    }

    @LynxProp(name = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        this.f66571b.mo95429a(z);
    }

    public FiberUIText(AbstractC26684l lVar) {
        super(lVar);
        this.f66571b = new FiberBaseTextUI(lVar, "text");
    }

    @LynxProp(name = "text-gradient")
    public void setTextGradient(String str) {
        ((AndroidText) this.f66253Z).setTextGradient(str);
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "accessibility-label")
    public void setAccessibilityLabel(String str) {
        super.setAccessibilityLabel(str);
        if (this.f66253Z != null) {
            ((AndroidText) this.f66253Z).setFocusable(true);
            ((AndroidText) this.f66253Z).setContentDescription(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94958a(Object obj) {
        if (obj instanceof C26733n) {
            ((AndroidText) this.f66253Z).setTextBundle((C26733n) obj);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
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
        if (this.f66253Z == null) {
            return this;
        }
        return C26822b.m97440a(f, f2, this, ((AndroidText) this.f66253Z).mTextLayout, C26822b.m97439a((AndroidText) this.f66253Z));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94965a(int[] iArr, float[] fArr, String str) {
        this.f66571b.mo94965a(iArr, fArr, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public long mo94944a(float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        mo53301e();
        return this.f66571b.mo95430b(f, measureMode, f2, measureMode2);
    }
}
