package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p818a.C14496b;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14509c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14512f;
import com.bytedance.ies.xelement.picker.view.WheelView;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.view.e */
public class C14534e {

    /* renamed from: o */
    private static List<String> f38415o = Arrays.asList("1", "3", "5", "7", "8", "10", "12");

    /* renamed from: p */
    private static List<String> f38416p = Arrays.asList("4", "6", "9", "11");

    /* renamed from: a */
    public WheelView f38417a;

    /* renamed from: b */
    public WheelView f38418b;

    /* renamed from: c */
    public int f38419c = 1900;

    /* renamed from: d */
    public int f38420d = 2100;

    /* renamed from: e */
    public int f38421e = 1;

    /* renamed from: f */
    public int f38422f = 12;

    /* renamed from: g */
    public int f38423g = 1;

    /* renamed from: h */
    public int f38424h = 31;

    /* renamed from: i */
    public int f38425i;

    /* renamed from: j */
    public int f38426j;

    /* renamed from: k */
    public int f38427k;

    /* renamed from: l */
    public AbstractC14509c f38428l;

    /* renamed from: m */
    private View f38429m;

    /* renamed from: n */
    private WheelView f38430n;

    /* renamed from: a */
    public Calendar mo53492a() {
        Calendar instance = Calendar.getInstance();
        instance.set(this.f38425i, this.f38426j - 1, this.f38427k);
        return instance;
    }

    /* renamed from: b */
    private void m58755b() {
        this.f38430n.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14534e.C145351 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                int i2;
                int currentItem = C14534e.this.f38417a.getCurrentItem();
                int i3 = i + C14534e.this.f38419c;
                C14534e.this.f38425i = i3;
                int i4 = 12;
                if (C14534e.this.f38419c == C14534e.this.f38420d) {
                    i2 = C14534e.this.f38421e;
                    i4 = C14534e.this.f38422f;
                } else if (i3 == C14534e.this.f38419c) {
                    i2 = C14534e.this.f38421e;
                } else {
                    if (i3 == C14534e.this.f38420d) {
                        i4 = C14534e.this.f38422f;
                    }
                    i2 = 1;
                }
                C14534e.this.f38417a.setAdapter(new C14496b(i2, i4));
                int a = C14534e.this.f38417a.getAdapter().mo53384a() - 1;
                if (currentItem > a) {
                    C14534e.this.f38417a.setCurrentIndex(a);
                    currentItem = a;
                }
                int i5 = i2 + currentItem;
                C14534e.this.f38426j = i5;
                C14534e eVar = C14534e.this;
                eVar.mo53501a(false, i3, i5, eVar.f38427k);
                if (C14534e.this.f38428l != null) {
                    C14534e.this.f38428l.mo53413a();
                }
            }
        });
        this.f38417a.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14534e.C145362 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                int i2;
                int i3 = C14534e.this.f38425i;
                int i4 = 1;
                if (i3 == C14534e.this.f38419c) {
                    i2 = C14534e.this.f38421e;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i;
                C14534e.this.f38426j = i5;
                C14534e eVar = C14534e.this;
                eVar.mo53501a(false, i3, i5, eVar.f38427k);
                int i6 = 31;
                if (C14534e.this.f38419c == C14534e.this.f38420d && C14534e.this.f38421e == C14534e.this.f38422f) {
                    i4 = C14534e.this.f38423g;
                    i6 = C14534e.this.f38424h;
                } else if (i3 == C14534e.this.f38419c && i5 == C14534e.this.f38421e) {
                    i4 = C14534e.this.f38423g;
                } else if (i3 == C14534e.this.f38420d && i5 == C14534e.this.f38422f) {
                    i6 = C14534e.this.f38424h;
                }
                int b = C14534e.this.mo53502b(i3, i5, i6);
                C14534e eVar2 = C14534e.this;
                eVar2.mo53505b(false, eVar2.f38418b.getCurrentItem(), i4, b);
                if (C14534e.this.f38428l != null) {
                    C14534e.this.f38428l.mo53413a();
                }
            }
        });
        this.f38418b.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14534e.C145373 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                if (C14534e.this.f38425i == C14534e.this.f38419c && C14534e.this.f38426j == C14534e.this.f38421e) {
                    C14534e eVar = C14534e.this;
                    eVar.f38427k = i + eVar.f38423g;
                } else {
                    C14534e.this.f38427k = i + 1;
                }
                if (C14534e.this.f38428l != null) {
                    C14534e.this.f38428l.mo53413a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo53496a(AbstractC14509c cVar) {
        this.f38428l = cVar;
    }

    /* renamed from: b */
    public void mo53503b(int i) {
        this.f38418b.setTextColorCenter(i);
        this.f38417a.setTextColorCenter(i);
        this.f38430n.setTextColorCenter(i);
    }

    /* renamed from: c */
    public void mo53506c(int i) {
        this.f38418b.setTextColorOut(i);
        this.f38417a.setTextColorOut(i);
        this.f38430n.setTextColorOut(i);
    }

    /* renamed from: d */
    public void mo53509d(int i) {
        this.f38418b.setItemsVisibleCount(i);
        this.f38417a.setItemsVisibleCount(i);
        this.f38430n.setItemsVisibleCount(i);
    }

    /* renamed from: a */
    public void mo53493a(float f) {
        this.f38418b.setLineSpacingMultiplier(f);
        this.f38417a.setLineSpacingMultiplier(f);
        this.f38430n.setLineSpacingMultiplier(f);
    }

    /* renamed from: a */
    public void mo53494a(int i) {
        this.f38418b.setDividerColor(i);
        this.f38417a.setDividerColor(i);
        this.f38430n.setDividerColor(i);
    }

    /* renamed from: b */
    public void mo53504b(boolean z) {
        this.f38418b.mo53425a(z);
        this.f38417a.mo53425a(z);
        this.f38430n.mo53425a(z);
    }

    /* renamed from: c */
    public void mo53508c(boolean z) {
        this.f38418b.setAlphaGradient(z);
        this.f38417a.setAlphaGradient(z);
        this.f38430n.setAlphaGradient(z);
    }

    /* renamed from: a */
    public void mo53497a(WheelView.DividerType dividerType) {
        this.f38418b.setDividerType(dividerType);
        this.f38417a.setDividerType(dividerType);
        this.f38430n.setDividerType(dividerType);
    }

    /* renamed from: a */
    public void mo53500a(boolean z) {
        this.f38430n.setCyclic(z);
        this.f38417a.setCyclic(z);
        this.f38418b.setCyclic(z);
    }

    /* renamed from: a */
    public void mo53499a(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i = calendar2.get(1);
            int i2 = calendar2.get(2) + 1;
            int i3 = calendar2.get(5);
            int i4 = this.f38419c;
            if (i > i4) {
                this.f38420d = i;
                this.f38422f = i2;
                this.f38424h = i3;
            } else if (i == i4) {
                int i5 = this.f38421e;
                if (i2 > i5) {
                    this.f38420d = i;
                    this.f38422f = i2;
                    this.f38424h = i3;
                } else if (i2 == i5 && i3 > this.f38423g) {
                    this.f38420d = i;
                    this.f38422f = i2;
                    this.f38424h = i3;
                }
            }
        } else if (calendar != null && calendar2 == null) {
            int i6 = calendar.get(1);
            int i7 = calendar.get(2) + 1;
            int i8 = calendar.get(5);
            int i9 = this.f38420d;
            if (i6 < i9) {
                this.f38421e = i7;
                this.f38423g = i8;
                this.f38419c = i6;
            } else if (i6 == i9) {
                int i10 = this.f38422f;
                if (i7 < i10) {
                    this.f38421e = i7;
                    this.f38423g = i8;
                    this.f38419c = i6;
                } else if (i7 == i10 && i8 < this.f38424h) {
                    this.f38421e = i7;
                    this.f38423g = i8;
                    this.f38419c = i6;
                }
            }
        } else if (calendar != null && calendar2 != null) {
            this.f38419c = calendar.get(1);
            this.f38420d = calendar2.get(1);
            this.f38421e = calendar.get(2) + 1;
            this.f38422f = calendar2.get(2) + 1;
            this.f38423g = calendar.get(5);
            this.f38424h = calendar2.get(5);
        }
    }

    /* renamed from: a */
    public void mo53495a(int i, int i2, int i3) {
        m58756d(i, i2, i3);
    }

    /* renamed from: c */
    public void mo53507c(int i, int i2, int i3) {
        this.f38430n.setTextXOffset(i);
        this.f38417a.setTextXOffset(i2);
        this.f38418b.setTextXOffset(i3);
    }

    /* renamed from: d */
    private void m58756d(int i, int i2, int i3) {
        int i4;
        this.f38425i = i;
        this.f38426j = i2;
        this.f38427k = i3;
        this.f38430n.setAdapter(new C14496b(this.f38419c, this.f38420d));
        this.f38430n.setCurrentIndex(i - this.f38419c);
        int i5 = this.f38419c;
        int i6 = this.f38420d;
        int i7 = 12;
        if (i5 == i6) {
            i4 = this.f38421e;
            i7 = this.f38422f;
        } else if (i == i5) {
            i4 = this.f38421e;
        } else {
            if (i == i6) {
                i7 = this.f38422f;
            }
            i4 = 1;
        }
        this.f38417a.setAdapter(new C14496b(i4, i7));
        this.f38417a.setCurrentIndex(i2 - i4);
        mo53501a(true, i, i2, i3);
    }

    /* renamed from: b */
    public int mo53502b(int i, int i2, int i3) {
        boolean z;
        if (f38415o.contains(String.valueOf(i2))) {
            return Math.min(i3, 31);
        }
        if (f38416p.contains(String.valueOf(i2))) {
            return Math.min(i3, 30);
        }
        if (i % 4 != 0 || i % 100 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.min(i3, 29);
        }
        return Math.min(i3, 28);
    }

    /* renamed from: a */
    public void mo53498a(String str, String str2, String str3) {
        if (str != null) {
            this.f38430n.setLabel(str);
        }
        if (str2 != null) {
            this.f38417a.setLabel(str2);
        }
        if (str3 != null) {
            this.f38418b.setLabel(str3);
        }
    }

    /* renamed from: b */
    public void mo53505b(boolean z, int i, int i2, int i3) {
        this.f38418b.setAdapter(new C14496b(i2, i3));
        if (z) {
            this.f38418b.setCurrentIndex(i);
        } else if (i > this.f38418b.getAdapter().mo53384a() - 1) {
            i = this.f38418b.getAdapter().mo53384a() - 1;
            this.f38418b.setCurrentIndex(i);
        }
        this.f38427k = i + i2;
    }

    /* renamed from: a */
    public void mo53501a(boolean z, int i, int i2, int i3) {
        int i4;
        int i5 = this.f38419c;
        int i6 = this.f38420d;
        int i7 = 31;
        int i8 = 1;
        if (i5 == i6 && this.f38421e == this.f38422f) {
            i8 = this.f38423g;
            i7 = this.f38424h;
        } else if (i == i5 && i2 == this.f38421e) {
            i8 = this.f38423g;
        } else if (i == i6 && i2 == this.f38422f) {
            i7 = this.f38424h;
        }
        int b = mo53502b(i, i2, i7);
        if (z) {
            i4 = i3 - i8;
        } else {
            i4 = this.f38418b.getCurrentItem();
        }
        mo53505b(z, i4, i8, b);
    }

    public C14534e(View view, boolean[] zArr, int i, int i2, LocalizeAdapter aVar) {
        int i3;
        int i4;
        this.f38429m = view;
        this.f38430n = (WheelView) view.findViewById(R.id.year);
        this.f38417a = (WheelView) view.findViewById(R.id.month);
        this.f38418b = (WheelView) view.findViewById(R.id.day);
        this.f38430n.setLocalizeAdapter(aVar);
        this.f38417a.setLocalizeAdapter(aVar);
        this.f38418b.setLocalizeAdapter(aVar);
        if (zArr.length == 3) {
            WheelView wheelView = this.f38430n;
            int i5 = 0;
            if (zArr[0]) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            wheelView.setVisibility(i3);
            WheelView wheelView2 = this.f38417a;
            if (zArr[1]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView2.setVisibility(i4);
            this.f38418b.setVisibility(!zArr[2] ? 8 : i5);
            this.f38430n.setGravity(i);
            this.f38417a.setGravity(i);
            this.f38418b.setGravity(i);
            float f = (float) i2;
            this.f38418b.setTextSize(f);
            this.f38417a.setTextSize(f);
            this.f38430n.setTextSize(f);
            m58755b();
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
