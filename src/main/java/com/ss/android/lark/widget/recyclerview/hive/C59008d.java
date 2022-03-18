package com.ss.android.lark.widget.recyclerview.hive;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: com.ss.android.lark.widget.recyclerview.hive.d */
public class C59008d extends AbstractC59010e {

    /* renamed from: l */
    public SparseArray<AbstractC59010e> f146206l = new SparseArray<>();

    /* renamed from: m */
    public SparseArray<AbstractC59004b> f146207m = new SparseArray<>();

    /* renamed from: a */
    public void mo200143a(SparseArray<AbstractC59004b> sparseArray) {
        this.f146207m = sparseArray;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
    /* renamed from: a */
    public void mo122652a(View view) {
        if (view instanceof ViewGroup) {
            int size = this.f146207m.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f146207m.keyAt(i);
                AbstractC59004b valueAt = this.f146207m.valueAt(i);
                if (!(valueAt instanceof AbstractView$OnClickListenerC59005c)) {
                    View findViewById = view.findViewById(keyAt);
                    AbstractC59010e h = valueAt.mo200137h();
                    h.mo200145a(this.f146210o);
                    if (findViewById instanceof ViewGroup) {
                        View a = m229036a((ViewGroup) findViewById, valueAt);
                        if (a != null) {
                            h.mo200146f(a);
                        } else {
                            h.mo200146f(findViewById);
                        }
                    } else if (findViewById instanceof ViewStub) {
                        ((ViewStub) findViewById).setOnInflateListener(new ViewStub.OnInflateListener() {
                            /* class com.ss.android.lark.widget.recyclerview.hive.C59008d.ViewStub$OnInflateListenerC590091 */

                            public void onInflate(ViewStub viewStub, View view) {
                                view.setId(viewStub.getId());
                            }
                        });
                        h.mo200146f(findViewById);
                    }
                    this.f146206l.put(keyAt, h);
                } else {
                    throw new IllegalStateException("do not support nested group component");
                }
            }
            return;
        }
        throw new IllegalStateException("The layout provided to GroupComponent must be a ViewGroup");
    }

    /* renamed from: a */
    private View m229036a(ViewGroup viewGroup, AbstractC59004b bVar) {
        View a = bVar.mo122823a(viewGroup);
        if (a != null) {
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(a);
            }
            if (layoutParams != null) {
                viewGroup.addView(a, layoutParams);
            } else {
                viewGroup.addView(a);
            }
        }
        return a;
    }
}
