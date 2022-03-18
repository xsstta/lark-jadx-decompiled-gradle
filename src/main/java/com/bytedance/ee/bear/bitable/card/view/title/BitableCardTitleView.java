package com.bytedance.ee.bear.bitable.card.view.title;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class BitableCardTitleView extends FrameLayout {

    /* renamed from: a */
    private AbstractC4712d f13994a;

    /* renamed from: b */
    private AbstractC4597b f13995b;

    /* renamed from: c */
    private SparseArray<AbstractC4597b> f13996c;

    /* renamed from: d */
    private boolean f13997d;

    /* renamed from: e */
    private String f13998e;

    /* renamed from: f */
    private Float f13999f;

    /* renamed from: g */
    private int f14000g;

    /* renamed from: h */
    private Typeface f14001h;

    /* renamed from: a */
    private void m19635a() {
        AbstractC4597b bVar = this.f13995b;
        if (bVar != null) {
            removeView(bVar.itemView);
        }
        this.f13995b = null;
    }

    /* renamed from: b */
    private void m19637b() {
        if (this.f13995b != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            addView(this.f13995b.itemView, layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView$1 */
    public static /* synthetic */ class C47431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14002a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType[] r0 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.f14002a = r0
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.f14002a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.TEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.f14002a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.NUMBER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.f14002a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.DATE_TIME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.f14002a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.bitable.card.model.enums.EFieldType r1 = com.bytedance.ee.bear.bitable.card.model.enums.EFieldType.FORMULA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView.C47431.<clinit>():void");
        }
    }

    public void setBitableCardDelegate(AbstractC4712d dVar) {
        this.f13994a = dVar;
    }

    public void setDefaultTitle(String str) {
        this.f13998e = str;
    }

    public void setShouldFormatRichText(boolean z) {
        this.f13997d = z;
    }

    public void setTitleColor(int i) {
        this.f14000g = i;
    }

    public void setTypeface(Typeface typeface) {
        this.f14001h = typeface;
    }

    public void setData(C4537a aVar) {
        if (aVar != null) {
            m19636a(aVar);
        }
    }

    public void setTitleSize(float f) {
        this.f13999f = Float.valueOf(f);
    }

    public BitableCardTitleView(Context context) {
        super(context);
        this.f13996c = new SparseArray<>(4);
        this.f13997d = true;
        this.f13998e = "";
    }

    /* renamed from: a */
    private void m19636a(C4537a aVar) {
        EFieldType i = aVar.mo17829a().mo17752i();
        AbstractC4597b bVar = this.f13996c.get(i.value);
        AbstractC4597b bVar2 = this.f13995b;
        if (bVar2 == null || bVar != bVar2) {
            if (bVar2 != null) {
                m19635a();
            }
            if (bVar != null) {
                this.f13995b = bVar;
                m19637b();
                this.f13995b.mo17993a(aVar);
                return;
            }
            try {
                int i2 = C47431.f14002a[i.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    this.f13995b = new C4748e(LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_title_text_item, (ViewGroup) this, false), this.f13994a, null);
                } else if (i2 == 3) {
                    this.f13995b = new C4747d(LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_title_number_item, (ViewGroup) this, false), this.f13994a, null);
                } else if (i2 == 4) {
                    this.f13995b = new C4744a(LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_title_date_item, (ViewGroup) this, false), this.f13994a, null);
                } else if (i2 != 5) {
                    C13479a.m54758a("BitableCardTitleView", "switchFieldTypeView: unknown field type");
                } else {
                    this.f13995b = new C4745b(LayoutInflater.from(getContext()).inflate(R.layout.bitable_card_title_text_item, (ViewGroup) this, false), this.f13994a);
                }
                AbstractC4597b bVar3 = this.f13995b;
                if (bVar3 != null) {
                    if (bVar3 instanceof AbstractC4746c) {
                        ((AbstractC4746c) bVar3).mo18492a(this.f13998e);
                        ((AbstractC4746c) this.f13995b).a_(this.f13997d);
                        TextView l = ((AbstractC4746c) this.f13995b).mo18017l();
                        Float f = this.f13999f;
                        if (f != null) {
                            l.setTextSize(0, f.floatValue());
                        }
                        int i3 = this.f14000g;
                        if (i3 != 0) {
                            l.setTextColor(i3);
                        }
                        Typeface typeface = this.f14001h;
                        if (typeface != null) {
                            l.setTypeface(typeface);
                        }
                    }
                    m19637b();
                    this.f13995b.mo17993a(aVar);
                    this.f13996c.put(i.value, this.f13995b);
                }
            } catch (Exception e) {
                C13479a.m54759a("BitableCardTitleView", "switchFieldTypeView: ", e);
            }
        } else {
            bVar2.mo17993a(aVar);
        }
    }

    public BitableCardTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BitableCardTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13996c = new SparseArray<>(4);
        this.f13997d = true;
        this.f13998e = "";
    }
}
