package com.tt.miniapp.titlemenu.p3332a;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.tt.miniapphost.util.C67590h;
import java.util.List;

/* renamed from: com.tt.miniapp.titlemenu.a.b */
public class C66900b extends RelativeLayout {

    /* renamed from: a */
    private List<C66899a> f168755a;

    /* renamed from: b */
    private int f168756b;

    /* renamed from: c */
    private boolean f168757c;

    /* renamed from: d */
    private Context f168758d;

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = (int) C67590h.m263065a(getContext(), 24.0f);
        int a2 = (int) C67590h.m263065a(getContext(), 12.0f);
        int a3 = C13264d.m54034a(getContext(), 12.0f);
        int i3 = 0;
        int itemHeight = this.f168755a.get(0).getItemHeight();
        int measuredWidth = (getMeasuredWidth() - (a3 * 2)) / this.f168756b;
        while (i3 < this.f168756b && i3 < this.f168755a.size()) {
            C66899a aVar = (C66899a) getChildAt(i3);
            aVar.setLabelWidth(measuredWidth);
            aVar.mo232913a(measuredWidth);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = a;
            if (i3 == 0) {
                layoutParams.leftMargin = a3;
            } else {
                layoutParams.leftMargin = (measuredWidth * i3) + a3;
            }
            aVar.setLayoutParams(layoutParams);
            i3++;
        }
        if (this.f168757c) {
            int i4 = this.f168756b;
            while (i4 < this.f168756b * 2 && i4 < this.f168755a.size()) {
                C66899a aVar2 = this.f168755a.get(i4);
                aVar2.setLabelWidth(measuredWidth);
                aVar2.mo232913a(measuredWidth);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = a + itemHeight + a2;
                int i5 = this.f168756b;
                if (i4 == i5) {
                    layoutParams2.leftMargin = a3;
                } else {
                    layoutParams2.leftMargin = ((i4 - i5) * measuredWidth) + a3;
                }
                aVar2.setLayoutParams(layoutParams2);
                i4++;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66900b(android.content.Context r2, java.util.List<com.tt.miniapp.titlemenu.p3332a.C66899a> r3, int r4) {
        /*
            r1 = this;
            int r0 = r3.size()
            if (r0 <= r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.titlemenu.p3332a.C66900b.<init>(android.content.Context, java.util.List, int):void");
    }

    public C66900b(Context context, List<C66899a> list, int i, boolean z) {
        super(context);
        this.f168758d = context;
        this.f168755a = list;
        this.f168756b = i;
        this.f168757c = z;
        for (C66899a aVar : list) {
            addView(aVar);
        }
    }
}
