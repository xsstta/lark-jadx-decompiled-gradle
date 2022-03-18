package com.lynx.component.svg;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.component.svg.C26428c;
import com.lynx.component.svg.parser.C26476d;
import com.lynx.component.svg.parser.SVG;
import com.lynx.component.svg.parser.SVGParseException;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.core.C26880a;
import com.lynx.tasm.utils.C26959m;

public class UISvg extends LynxUI<C26427b> {

    /* renamed from: a */
    public C26428c f65262a;

    /* renamed from: b */
    public C26476d f65263b;

    /* renamed from: c */
    public SVG f65264c;

    /* renamed from: d */
    private String f65265d;

    /* renamed from: e */
    private String f65266e;

    /* renamed from: d */
    private void m95725d() {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.RunnableC264254 */

            public void run() {
                if (UISvg.this.f65264c != null) {
                    ((C26427b) UISvg.this.f66253Z).setImageDrawable(new C26426a(UISvg.this.f65264c, UISvg.this.f65263b, UISvg.this.f65262a));
                    UISvg.this.mo95041w();
                }
            }
        });
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void T_() {
        super.T_();
        this.f65262a.mo93806a();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        this.f65263b.mo93857a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) mo94937T(), (float) mo94938U());
        if (this.f65264c != null) {
            m95725d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26427b mo33942b(Context context) {
        return new C26427b(context);
    }

    /* renamed from: a */
    public void mo93795a(final SVG svg) {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.RunnableC264243 */

            public void run() {
                UISvg.this.f65264c = svg;
                ((C26427b) UISvg.this.f66253Z).setImageDrawable(new C26426a(svg, UISvg.this.f65263b, UISvg.this.f65262a));
                UISvg.this.mo95041w();
            }
        });
    }

    public UISvg(AbstractC26684l lVar) {
        super(lVar);
        this.f65263b = new C26476d(lVar.mo94692n().ad());
        this.f65262a = new C26428c(lVar);
    }

    @LynxProp(name = "content")
    public void setContent(final String str) {
        if (TextUtils.isEmpty(str)) {
            ((C26427b) this.f66253Z).setImageDrawable(null);
        } else if (!str.equals(this.f65266e)) {
            this.f65266e = str;
            C26880a.m97713a().execute(new Runnable() {
                /* class com.lynx.component.svg.UISvg.RunnableC264232 */

                public void run() {
                    try {
                        UISvg.this.mo93795a(SVG.m95751a(str));
                    } catch (SVGParseException e) {
                        LLog.m96429e("lynx_UISvg", e.toString());
                    }
                }
            });
        }
    }

    @LynxProp(name = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f65265d = null;
            ((C26427b) this.f66253Z).setImageDrawable(null);
        } else if (!str.equals(this.f65265d)) {
            this.f65265d = str;
            this.f65262a.mo93808a(str, new C26428c.AbstractC26435d() {
                /* class com.lynx.component.svg.UISvg.C264221 */

                @Override // com.lynx.component.svg.C26428c.AbstractC26435d
                /* renamed from: a */
                public void mo93798a() {
                }

                @Override // com.lynx.component.svg.C26428c.AbstractC26435d
                /* renamed from: a */
                public void mo93799a(SVG svg) {
                    UISvg.this.mo93795a(svg);
                }

                @Override // com.lynx.component.svg.C26428c.AbstractC26435d
                /* renamed from: a */
                public void mo93800a(String str) {
                    LLog.m96429e("lynx_UISvg", str);
                }
            });
        }
    }
}
