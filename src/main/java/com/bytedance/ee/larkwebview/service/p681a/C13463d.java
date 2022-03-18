package com.bytedance.ee.larkwebview.service.p681a;

import com.bytedance.ee.larkwebview.service.AbstractC13473h;
import com.bytedance.ee.larkwebview.service.listener.OnViewScrollListener;

/* renamed from: com.bytedance.ee.larkwebview.service.a.d */
public class C13463d implements AbstractC13473h {

    /* renamed from: a */
    private OnViewScrollListener f35504a;

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13473h
    /* renamed from: a */
    public void mo49915a(OnViewScrollListener onViewScrollListener) {
        this.f35504a = onViewScrollListener;
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13473h
    /* renamed from: a */
    public void mo49914a(int i, int i2, int i3, int i4) {
        if (this.f35504a != null) {
            if (i == i3) {
                int i5 = i2 - i4;
                if (Math.abs(i5) >= 3) {
                    if (i2 > i4) {
                        this.f35504a.mo49932a(Math.abs(i5), i2, 0);
                    } else if (i2 < i4) {
                        this.f35504a.mo49932a(Math.abs(i5), i2, 1);
                    }
                    this.f35504a.mo49933a(i, i2, i3, i4);
                }
            }
            if (i2 == i4 && Math.abs(i - i3) >= 3) {
                if (i > i3) {
                    this.f35504a.mo49932a(Math.abs(i2 - i4), i2, 2);
                } else if (i < i3) {
                    this.f35504a.mo49932a(Math.abs(i2 - i4), i2, 3);
                }
            }
            this.f35504a.mo49933a(i, i2, i3, i4);
        }
    }
}
