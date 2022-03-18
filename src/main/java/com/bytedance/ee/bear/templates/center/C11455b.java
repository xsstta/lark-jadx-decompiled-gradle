package com.bytedance.ee.bear.templates.center;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.ee.bear.widgets.p568b.C11823a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.C69618b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

/* renamed from: com.bytedance.ee.bear.templates.center.b */
public class C11455b extends AbstractC69621a {

    /* renamed from: b */
    public static int f30804b;

    /* renamed from: a */
    List<Tab2> f30805a;

    /* renamed from: c */
    private MagicIndicator f30806c;

    /* renamed from: d */
    private final int f30807d;

    /* renamed from: e */
    private final int f30808e;

    /* renamed from: f */
    private final int f30809f;

    /* renamed from: g */
    private AbstractC11458a f30810g;

    /* renamed from: com.bytedance.ee.bear.templates.center.b$a */
    public interface AbstractC11458a {
        /* renamed from: a */
        void mo44011a(int i, Tab2 tab2);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public int mo16055a() {
        return this.f30805a.size();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public AbstractC69623c mo16056a(Context context) {
        C114572 r0 = new C11823a(context) {
            /* class com.bytedance.ee.bear.templates.center.C11455b.C114572 */

            @Override // com.bytedance.ee.bear.widgets.p568b.C11823a, net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
            /* renamed from: a */
            public void mo31045a(int i, float f, int i2) {
                super.mo31045a(i, BitmapDescriptorFactory.HUE_RED, i2);
            }
        };
        r0.setMode(1);
        r0.setColors(Integer.valueOf(this.f30809f));
        r0.setLineHeight((float) C13749l.m55738a(2));
        return r0;
    }

    /* renamed from: a */
    public void mo44010a(int i) {
        f30804b = i;
        int i2 = 0;
        this.f30806c.mo243174a(i, BitmapDescriptorFactory.HUE_RED, 0);
        this.f30806c.mo243173a(i);
        if (this.f30810g != null && this.f30805a.size() > 0) {
            List<Tab2> list = this.f30805a;
            if (i < list.size()) {
                i2 = i;
            }
            this.f30810g.mo44011a(i, list.get(i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47677a(int i, View view) {
        mo44010a(i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public AbstractC69624d mo16057a(Context context, int i) {
        C114561 r0 = new C69627a(context) {
            /* class com.bytedance.ee.bear.templates.center.C11455b.C114561 */

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: a */
            public void mo31042a(int i, int i2, float f, boolean z) {
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: b */
            public void mo31044b(int i, int i2, float f, boolean z) {
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: a */
            public void mo31041a(int i, int i2) {
                setTextColor(getSelectedColor());
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
            /* renamed from: b */
            public void mo31043b(int i, int i2) {
                setTextColor(getNormalColor());
            }
        };
        r0.setSelectedColor(this.f30807d);
        r0.setNormalColor(this.f30808e);
        r0.setText(r0.getContext().getString(this.f30805a.get(i).getValue()));
        int a = C69618b.m267418a(context, 4.0d);
        r0.setPadding(a, 0, a, 0);
        r0.setTextSize(14.0f);
        r0.setOnClickListener(new View.OnClickListener(i) {
            /* class com.bytedance.ee.bear.templates.center.$$Lambda$b$TAJ_tpNe5egczkFn_Nyx3JGbc8 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C11455b.m269992lambda$TAJ_tpNe5egczkFn_Nyx3JGbc8(C11455b.this, this.f$1, view);
            }
        });
        return r0;
    }

    public C11455b(Context context, MagicIndicator magicIndicator, List<Tab2> list, AbstractC11458a aVar) {
        this.f30806c = magicIndicator;
        this.f30805a = list;
        this.f30810g = aVar;
        Resources resources = context.getResources();
        this.f30807d = resources.getColor(R.color.primary_pri_500);
        this.f30808e = resources.getColor(R.color.text_caption);
        this.f30809f = resources.getColor(R.color.primary_pri_500);
    }
}
