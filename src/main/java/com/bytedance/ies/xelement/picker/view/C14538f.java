package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.xelement.picker.p818a.C14495a;
import com.bytedance.ies.xelement.picker.p820c.C14504b;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14512f;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14513g;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.view.f */
public class C14538f {

    /* renamed from: a */
    public List<Integer> f38434a = new ArrayList();

    /* renamed from: b */
    public AbstractC14513g f38435b;

    /* renamed from: c */
    private View f38436c;

    /* renamed from: d */
    private List<WheelView> f38437d = new ArrayList();

    /* renamed from: e */
    private List<List<String>> f38438e;

    /* renamed from: f */
    private C14504b f38439f;

    /* renamed from: a */
    public List<Integer> mo53510a() {
        return new ArrayList(this.f38434a);
    }

    /* renamed from: a */
    public void mo53514a(C14504b bVar) {
        this.f38439f = bVar;
    }

    /* renamed from: a */
    public void mo53515a(AbstractC14513g gVar) {
        this.f38435b = gVar;
    }

    public C14538f(View view) {
        this.f38436c = view;
    }

    /* renamed from: a */
    private WheelView m58778a(Context context) {
        WheelView wheelView = new WheelView(context);
        wheelView.setLocalizeAdapter(this.f38439f.f38304L);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        wheelView.setLayoutParams(layoutParams);
        return wheelView;
    }

    /* renamed from: b */
    public void mo53519b(int i) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setItemsVisibleCount(i);
        }
    }

    /* renamed from: c */
    public void mo53522c(int i) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setDividerColor(i);
        }
    }

    /* renamed from: d */
    public void mo53525d(int i) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setTextColorCenter(i);
        }
    }

    /* renamed from: e */
    public void mo53527e(int i) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setTextColorOut(i);
        }
    }

    /* renamed from: a */
    public void mo53511a(float f) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setLineSpacingMultiplier(f);
        }
    }

    /* renamed from: b */
    public void mo53521b(boolean z) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setAlphaGradient(z);
        }
    }

    /* renamed from: c */
    public void mo53523c(List<String> list) {
        for (WheelView wheelView : this.f38437d) {
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = list.remove(0);
            }
            wheelView.setLabel(str);
        }
    }

    /* renamed from: d */
    public void mo53526d(List<Integer> list) {
        for (WheelView wheelView : this.f38437d) {
            Integer num = null;
            if (list != null && !list.isEmpty()) {
                num = list.remove(0);
            }
            if (num != null) {
                wheelView.setTextXOffset(num.intValue());
            }
        }
    }

    /* renamed from: e */
    public void mo53528e(List<Boolean> list) {
        for (WheelView wheelView : this.f38437d) {
            Boolean bool = null;
            if (list != null && !list.isEmpty()) {
                bool = list.remove(0);
            }
            if (bool != null) {
                wheelView.setCyclic(bool.booleanValue());
            } else {
                wheelView.setCyclic(false);
            }
        }
    }

    /* renamed from: a */
    public void mo53512a(int i) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setTextSize((float) i);
        }
    }

    /* renamed from: c */
    public void mo53524c(boolean z) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.mo53425a(z);
        }
    }

    /* renamed from: a */
    public void mo53513a(Typeface typeface) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setTypeface(typeface);
        }
    }

    /* renamed from: b */
    public void mo53520b(List<Integer> list) {
        if (this.f38438e == null) {
            this.f38434a.clear();
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
            for (int i = 0; i < this.f38438e.size(); i++) {
                list.add(0);
            }
        }
        for (Integer num : list) {
            if (num == null) {
                throw new IllegalArgumentException("index can not be null");
            }
        }
        for (int i2 = 0; i2 < this.f38437d.size(); i2++) {
            WheelView wheelView = this.f38437d.get(i2);
            if (i2 < list.size()) {
                int intValue = list.get(i2).intValue();
                List<List<String>> list2 = this.f38438e;
                if (list2 == null || i2 >= list2.size() || intValue >= this.f38438e.get(i2).size()) {
                    list.set(i2, 0);
                    wheelView.setCurrentIndex(0);
                } else {
                    wheelView.setCurrentIndex(intValue);
                }
            } else {
                wheelView.setCurrentIndex(0);
            }
        }
        this.f38434a.clear();
        this.f38434a.addAll(list);
    }

    /* renamed from: a */
    public void mo53516a(WheelView.DividerType dividerType) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setDividerType(dividerType);
        }
    }

    /* renamed from: a */
    public void mo53517a(List<List<String>> list) {
        if (list == null) {
            this.f38438e = null;
            this.f38437d.clear();
            View view = this.f38436c;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
                return;
            }
            return;
        }
        List<List<String>> list2 = this.f38438e;
        if (list2 == null) {
            this.f38438e = new ArrayList();
        } else {
            list2.clear();
        }
        this.f38438e.addAll(list);
        for (final int i = 0; i < list.size(); i++) {
            List<String> list3 = list.get(i);
            if (list3 != null) {
                while (this.f38437d.size() <= i) {
                    WheelView a = m58778a(this.f38436c.getContext());
                    a.setOnItemSelectedListener(new AbstractC14512f() {
                        /* class com.bytedance.ies.xelement.picker.view.C14538f.C145391 */

                        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
                        /* renamed from: a */
                        public void mo53416a(int i) {
                            C14538f.this.f38434a.set(i, Integer.valueOf(i));
                            ArrayList arrayList = new ArrayList(C14538f.this.f38434a);
                            if (C14538f.this.f38435b != null) {
                                C14538f.this.f38435b.mo53382a(arrayList, i, Integer.valueOf(i));
                            }
                        }
                    });
                    View view2 = this.f38436c;
                    if (view2 instanceof ViewGroup) {
                        ((ViewGroup) view2).addView(a);
                    }
                    this.f38437d.add(a);
                }
                this.f38437d.get(i).setAdapter(new C14495a(list3));
            } else {
                throw new IllegalArgumentException("items can not be null");
            }
        }
        if (this.f38434a.size() != this.f38438e.size()) {
            mo53520b((List<Integer>) null);
        }
    }

    /* renamed from: a */
    public void mo53518a(boolean z) {
        for (WheelView wheelView : this.f38437d) {
            wheelView.setCyclic(z);
        }
    }
}
