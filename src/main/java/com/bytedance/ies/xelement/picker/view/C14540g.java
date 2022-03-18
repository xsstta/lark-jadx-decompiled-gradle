package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p818a.C14496b;
import com.bytedance.ies.xelement.picker.p818a.C14497c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14509c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14512f;
import com.bytedance.ies.xelement.picker.view.WheelView;
import com.larksuite.suite.R;
import java.util.Calendar;

/* renamed from: com.bytedance.ies.xelement.picker.view.g */
public class C14540g {

    /* renamed from: a */
    public WheelView f38442a;

    /* renamed from: b */
    public WheelView f38443b;

    /* renamed from: c */
    public WheelView f38444c;

    /* renamed from: d */
    public Calendar f38445d = m58799b(0, 0, 0);

    /* renamed from: e */
    public Calendar f38446e = m58801c(Calendar.getInstance());

    /* renamed from: f */
    public AbstractC14509c f38447f;

    /* renamed from: g */
    private View f38448g;

    /* renamed from: h */
    private Calendar f38449h = m58799b(23, 59, 59);

    /* renamed from: i */
    private int f38450i;

    /* renamed from: j */
    private boolean[] f38451j;

    /* renamed from: a */
    public Calendar mo53529a() {
        return this.f38446e;
    }

    /* renamed from: b */
    private void m58800b() {
        this.f38442a.setTextSize((float) this.f38450i);
        this.f38443b.setTextSize((float) this.f38450i);
        this.f38444c.setTextSize((float) this.f38450i);
    }

    /* renamed from: c */
    public static Calendar m58801c(Calendar calendar) {
        calendar.set(2000, 0, 1);
        return calendar;
    }

    /* renamed from: a */
    public void mo53533a(AbstractC14509c cVar) {
        this.f38447f = cVar;
    }

    /* renamed from: d */
    private static Calendar m58802d(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }

    /* renamed from: a */
    public void mo53530a(float f) {
        this.f38442a.setLineSpacingMultiplier(f);
        this.f38443b.setLineSpacingMultiplier(f);
        this.f38444c.setLineSpacingMultiplier(f);
    }

    /* renamed from: c */
    public void mo53542c(int i) {
        this.f38442a.setTextColorOut(i);
        this.f38443b.setTextColorOut(i);
        this.f38444c.setTextColorOut(i);
    }

    /* renamed from: a */
    public void mo53531a(int i) {
        this.f38442a.setDividerColor(i);
        this.f38443b.setDividerColor(i);
        this.f38444c.setDividerColor(i);
    }

    /* renamed from: c */
    public void mo53543c(boolean z) {
        this.f38442a.setAlphaGradient(z);
        this.f38443b.setAlphaGradient(z);
        this.f38444c.setAlphaGradient(z);
    }

    /* renamed from: d */
    public void mo53544d(int i) {
        this.f38442a.setItemsVisibleCount(i);
        this.f38443b.setItemsVisibleCount(i);
        this.f38444c.setItemsVisibleCount(i);
    }

    /* renamed from: b */
    public void mo53539b(int i) {
        this.f38442a.setTextColorCenter(i);
        this.f38443b.setTextColorCenter(i);
        this.f38444c.setTextColorCenter(i);
    }

    /* renamed from: a */
    public void mo53534a(WheelView.DividerType dividerType) {
        this.f38442a.setDividerType(dividerType);
        this.f38443b.setDividerType(dividerType);
        this.f38444c.setDividerType(dividerType);
    }

    /* renamed from: b */
    public void mo53541b(boolean z) {
        this.f38442a.mo53425a(z);
        this.f38443b.mo53425a(z);
        this.f38444c.mo53425a(z);
    }

    /* renamed from: a */
    public void mo53536a(Calendar calendar) {
        if (this.f38445d != null && this.f38449h != null) {
            if (calendar == null) {
                calendar = Calendar.getInstance();
            }
            mo53540b(m58801c(calendar));
        }
    }

    /* renamed from: b */
    public void mo53540b(Calendar calendar) {
        int i;
        int i2;
        if (calendar.getTimeInMillis() < this.f38445d.getTimeInMillis()) {
            calendar = m58802d(this.f38445d);
        } else if (calendar.getTimeInMillis() > this.f38449h.getTimeInMillis()) {
            calendar = m58802d(this.f38449h);
        }
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        int i5 = calendar.get(13);
        int i6 = this.f38445d.get(11);
        int i7 = this.f38445d.get(12);
        int i8 = this.f38445d.get(13);
        int i9 = this.f38449h.get(11);
        int i10 = this.f38449h.get(12);
        int i11 = this.f38449h.get(13);
        if (i6 == i9) {
            this.f38442a.setAdapter(new C14496b(i6, i9));
            i = i3 - i6;
            this.f38443b.setAdapter(new C14496b(i7, i10));
            int i12 = i4 - i7;
            if (i7 == i10) {
                this.f38444c.setAdapter(new C14496b(i8, i11));
            } else if (i4 == i7) {
                this.f38444c.setAdapter(new C14496b(i8, 59));
            } else {
                if (i4 == i10) {
                    this.f38444c.setAdapter(new C14496b(0, i11));
                } else {
                    this.f38444c.setAdapter(new C14496b(0, 59));
                }
                i4 = i12;
            }
            i5 -= i8;
            i4 = i12;
        } else {
            if (i6 < i9) {
                this.f38442a.setAdapter(new C14496b(i6, i9));
                i2 = i3 - i6;
            } else {
                this.f38442a.setAdapter(new C14497c(i6, i9, 24));
                i2 = i3 - i6;
                if (i2 < 0) {
                    i2 += 24;
                }
            }
            if (i3 == i6) {
                this.f38443b.setAdapter(new C14496b(i7, 59));
                int i13 = i4 - i7;
                if (i4 == i7) {
                    this.f38444c.setAdapter(new C14496b(i8, 59));
                    i5 -= i8;
                } else {
                    this.f38444c.setAdapter(new C14496b(0, 59));
                }
                i4 = i13;
            } else if (i3 == i9) {
                this.f38443b.setAdapter(new C14496b(0, i10));
                if (i4 == i10) {
                    this.f38444c.setAdapter(new C14496b(0, i11));
                } else {
                    this.f38444c.setAdapter(new C14496b(0, 59));
                }
            } else {
                this.f38443b.setAdapter(new C14496b(0, 59));
                this.f38444c.setAdapter(new C14496b(0, 59));
            }
            i = i2;
        }
        this.f38446e = calendar;
        this.f38442a.setCurrentIndex(i);
        this.f38443b.setCurrentIndex(i4);
        this.f38444c.setCurrentIndex(i5);
    }

    /* renamed from: a */
    public void mo53538a(boolean z) {
        this.f38442a.setCyclic(z);
        this.f38443b.setCyclic(z);
        this.f38444c.setCyclic(z);
    }

    /* renamed from: a */
    public void mo53537a(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        if (calendar2 == null) {
            calendar2 = Calendar.getInstance();
        }
        Calendar c = m58801c(calendar);
        Calendar c2 = m58801c(calendar2);
        if (c.getTimeInMillis() > c2.getTimeInMillis()) {
            c2.add(5, 1);
        }
        this.f38442a.setAdapter(new C14497c(c.get(11), c2.get(11), 24));
        this.f38443b.setAdapter(new C14496b(0, 59));
        this.f38444c.setAdapter(new C14496b(0, 59));
        this.f38445d = c;
        this.f38449h = c2;
        this.f38442a.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14540g.C145411 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                Calendar c = C14540g.m58801c(C14540g.this.f38446e);
                int currentItem = C14540g.this.f38445d.get(11) + C14540g.this.f38442a.getCurrentItem();
                if (currentItem >= 24) {
                    c.set(11, currentItem - 24);
                    c.add(5, 1);
                } else {
                    c.set(11, currentItem);
                }
                C14540g.this.mo53540b(c);
                if (C14540g.this.f38447f != null) {
                    C14540g.this.f38447f.mo53413a();
                }
            }
        });
        this.f38443b.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14540g.C145422 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                Calendar calendar = C14540g.this.f38446e;
                int i2 = calendar.get(11);
                int i3 = C14540g.this.f38445d.get(11);
                int i4 = C14540g.this.f38445d.get(12);
                if (i3 == i2) {
                    calendar.set(12, i4 + C14540g.this.f38443b.getCurrentItem());
                } else {
                    calendar.set(12, C14540g.this.f38443b.getCurrentItem());
                }
                C14540g.this.mo53540b(calendar);
                if (C14540g.this.f38447f != null) {
                    C14540g.this.f38447f.mo53413a();
                }
            }
        });
        this.f38444c.setOnItemSelectedListener(new AbstractC14512f() {
            /* class com.bytedance.ies.xelement.picker.view.C14540g.C145433 */

            @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14512f
            /* renamed from: a */
            public void mo53416a(int i) {
                Calendar calendar = C14540g.this.f38446e;
                int i2 = calendar.get(11);
                int i3 = calendar.get(12);
                int i4 = C14540g.this.f38445d.get(11);
                int i5 = C14540g.this.f38445d.get(12);
                int i6 = C14540g.this.f38445d.get(13);
                if (i4 == i2 && i3 == i5) {
                    calendar.set(13, i6 + C14540g.this.f38444c.getCurrentItem());
                } else {
                    calendar.set(13, C14540g.this.f38444c.getCurrentItem());
                }
                C14540g.this.mo53540b(calendar);
                if (C14540g.this.f38447f != null) {
                    C14540g.this.f38447f.mo53413a();
                }
            }
        });
    }

    /* renamed from: b */
    private static Calendar m58799b(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(2000, 0, 1, i, i2, i3);
        return instance;
    }

    /* renamed from: a */
    public void mo53532a(int i, int i2, int i3) {
        this.f38442a.setTextXOffset(i);
        this.f38443b.setTextXOffset(i2);
        this.f38444c.setTextXOffset(i3);
    }

    /* renamed from: a */
    public void mo53535a(String str, String str2, String str3) {
        if (str != null) {
            this.f38442a.setLabel(str);
        }
        if (str2 != null) {
            this.f38443b.setLabel(str2);
        }
        if (str3 != null) {
            this.f38444c.setLabel(str3);
        }
    }

    public C14540g(View view, boolean[] zArr, int i, int i2, LocalizeAdapter aVar) {
        int i3;
        int i4;
        int i5 = 0;
        this.f38448g = view;
        this.f38450i = i2;
        this.f38442a = (WheelView) view.findViewById(R.id.hour);
        this.f38443b = (WheelView) view.findViewById(R.id.min);
        this.f38444c = (WheelView) view.findViewById(R.id.second);
        this.f38442a.setLocalizeAdapter(aVar);
        this.f38443b.setLocalizeAdapter(aVar);
        this.f38444c.setLocalizeAdapter(aVar);
        this.f38442a.setGravity(i);
        this.f38443b.setGravity(i);
        this.f38444c.setGravity(i);
        if (zArr.length == 3) {
            this.f38451j = zArr;
            WheelView wheelView = this.f38442a;
            if (zArr[0]) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            wheelView.setVisibility(i3);
            WheelView wheelView2 = this.f38443b;
            if (zArr[1]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView2.setVisibility(i4);
            this.f38444c.setVisibility(!zArr[2] ? 8 : i5);
            m58800b();
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
