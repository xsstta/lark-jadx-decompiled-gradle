package com.bytedance.ee.bear.lark.p416d;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.ee.bear.list.homepage.tab.C8493c;
import com.bytedance.ee.bear.widgets.p568b.C11823a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

/* renamed from: com.bytedance.ee.bear.lark.d.a */
public class C8028a extends AbstractC69621a {

    /* renamed from: a */
    private final int f21515a;

    /* renamed from: b */
    private final int f21516b;

    /* renamed from: c */
    private final int f21517c;

    /* renamed from: d */
    private final List<C8493c> f21518d;

    /* renamed from: e */
    private final MagicIndicator f21519e;

    /* renamed from: f */
    private final AbstractC8031a f21520f;

    /* renamed from: com.bytedance.ee.bear.lark.d.a$a */
    public interface AbstractC8031a {
        /* renamed from: a */
        void mo30976a(int i, C8493c cVar);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public int mo16055a() {
        return this.f21518d.size();
    }

    /* renamed from: a */
    private void m32079a(int i) {
        this.f21519e.mo243174a(i, BitmapDescriptorFactory.HUE_RED, 0);
        this.f21519e.mo243173a(i);
        if (this.f21520f != null) {
            this.f21520f.mo30976a(i, (C8493c) C13657b.m55419a(this.f21518d, i));
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public AbstractC69623c mo16056a(Context context) {
        C80302 r0 = new C11823a(context) {
            /* class com.bytedance.ee.bear.lark.p416d.C8028a.C80302 */

            @Override // com.bytedance.ee.bear.widgets.p568b.C11823a, net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
            /* renamed from: a */
            public void mo31045a(int i, float f, int i2) {
                super.mo31045a(i, BitmapDescriptorFactory.HUE_RED, i2);
            }
        };
        r0.setMode(1);
        r0.setColors(Integer.valueOf(this.f21517c));
        r0.setLineHeight((float) C13749l.m55738a(2));
        return r0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32080a(int i, View view) {
        m32079a(i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
    /* renamed from: a */
    public AbstractC69624d mo16057a(Context context, int i) {
        C80291 r0 = new C69627a(context) {
            /* class com.bytedance.ee.bear.lark.p416d.C8028a.C80291 */

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
        r0.setSelectedColor(this.f21515a);
        r0.setNormalColor(this.f21516b);
        r0.setText(r0.getContext().getString(this.f21518d.get(i).mo33171b()));
        r0.setTextSize(14.0f);
        r0.setMaxLines(1);
        r0.setOnClickListener(new View.OnClickListener(i) {
            /* class com.bytedance.ee.bear.lark.p416d.$$Lambda$a$TLXtj0wDO61iDcvu1GDSpvARt8 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C8028a.this.m32080a((C8028a) this.f$1, (int) view);
            }
        });
        return r0;
    }

    public C8028a(Context context, MagicIndicator magicIndicator, List<C8493c> list, AbstractC8031a aVar) {
        this.f21518d = list;
        this.f21519e = magicIndicator;
        this.f21520f = aVar;
        Resources resources = context.getResources();
        this.f21515a = resources.getColor(R.color.primary_pri_500);
        this.f21516b = resources.getColor(R.color.text_caption);
        this.f21517c = resources.getColor(R.color.primary_pri_500);
    }
}
