package com.tonicartos.superslim;

import android.view.View;
import com.tonicartos.superslim.C65671a;
import com.tonicartos.superslim.LayoutManager;

/* renamed from: com.tonicartos.superslim.b */
public class C65673b extends AbstractC65675d {

    /* renamed from: a */
    public static int f165459a = 1;

    public C65673b(LayoutManager layoutManager) {
        super(layoutManager);
    }

    /* renamed from: a */
    private void m257523a(C65671a.C65672a aVar, C65674c cVar) {
        this.f165472b.measureChildWithMargins(aVar.f165457a, cVar.mo229909a(), 0);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229866a(int i, C65674c cVar, C65671a aVar) {
        int i2 = cVar.f165460a + 1;
        int i3 = 0;
        while (i3 < cVar.f165466g && i2 < i) {
            C65671a.C65672a c = aVar.mo229907c(i2);
            m257523a(c, cVar);
            i3 += this.f165472b.getDecoratedMeasuredHeight(c.f165457a);
            aVar.mo229904a(i2, c.f165457a);
            i2++;
        }
        if (i3 == cVar.f165466g) {
            return 0;
        }
        if (i3 > cVar.f165466g) {
            return 1;
        }
        return -i3;
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229865a(int i, View view, C65674c cVar, C65671a aVar) {
        return mo229863a(i, this.f165472b.getDecoratedBottom(view), this.f165472b.getPosition(view) + 1, cVar, aVar);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: b */
    public int mo229872b(int i, View view, C65674c cVar, C65671a aVar) {
        return mo229871b(i, this.f165472b.getDecoratedTop(view), this.f165472b.getPosition(view) - 1, cVar, aVar);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229863a(int i, int i2, int i3, C65674c cVar, C65671a aVar) {
        int itemCount = aVar.mo229902a().getItemCount();
        int i4 = i2;
        while (true) {
            if (i3 >= itemCount || i4 >= i) {
                break;
            }
            C65671a.C65672a c = aVar.mo229907c(i3);
            if (c.mo229908a().mo229890d() != cVar.f165460a) {
                aVar.mo229904a(i3, c.f165457a);
                break;
            }
            m257523a(c, cVar);
            i4 = m257522a(c, i4, LayoutManager.Direction.END, cVar, aVar);
            mo229912a(c, i3, LayoutManager.Direction.END, aVar);
            i3++;
        }
        return i4;
    }

    /* renamed from: a */
    private int m257522a(C65671a.C65672a aVar, int i, LayoutManager.Direction direction, C65674c cVar, C65671a aVar2) {
        int i2;
        int i3;
        int i4;
        int decoratedMeasuredHeight = this.f165472b.getDecoratedMeasuredHeight(aVar.f165457a);
        int decoratedMeasuredWidth = this.f165472b.getDecoratedMeasuredWidth(aVar.f165457a);
        if (aVar2.f165455c) {
            i2 = cVar.f165468i;
        } else {
            i2 = cVar.f165467h;
        }
        int i5 = i2 + decoratedMeasuredWidth;
        if (direction == LayoutManager.Direction.END) {
            i4 = i;
            i3 = decoratedMeasuredHeight + i;
        } else {
            i3 = i;
            i4 = i - decoratedMeasuredHeight;
        }
        this.f165472b.layoutDecorated(aVar.f165457a, i2, i4, i5, i3);
        if (direction == LayoutManager.Direction.END) {
            return this.f165472b.getDecoratedBottom(aVar.f165457a);
        }
        return this.f165472b.getDecoratedTop(aVar.f165457a);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: b */
    public int mo229871b(int i, int i2, int i3, C65674c cVar, C65671a aVar) {
        boolean z;
        View childAt;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= aVar.mo229902a().getItemCount() || (childAt = this.f165472b.getChildAt(0)) == null) {
                break;
            }
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != cVar.f165460a) {
                z = true;
                break;
            } else if (!layoutParams.f165442a) {
                break;
            } else {
                i5++;
            }
        }
        z = false;
        int i6 = -1;
        if (z) {
            int i7 = i3;
            int i8 = 0;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                C65671a.C65672a c = aVar.mo229907c(i7);
                aVar.mo229904a(i7, c.f165457a);
                LayoutManager.LayoutParams a = c.mo229908a();
                if (a.mo229890d() != cVar.f165460a) {
                    break;
                }
                if (!a.f165442a) {
                    m257523a(c, cVar);
                    i8 += this.f165472b.getDecoratedMeasuredHeight(c.f165457a);
                    if (i8 >= cVar.f165462c) {
                        i6 = i7;
                        break;
                    }
                    i6 = i7;
                }
                i7--;
            }
            if (i8 < cVar.f165462c) {
                i4 = i8 - cVar.f165462c;
                i2 += i4;
            }
        }
        int i9 = i2;
        while (true) {
            if (i3 < 0 || i9 - i4 <= i) {
                break;
            }
            C65671a.C65672a c2 = aVar.mo229907c(i3);
            LayoutManager.LayoutParams a2 = c2.mo229908a();
            if (a2.f165442a) {
                aVar.mo229904a(i3, c2.f165457a);
                break;
            } else if (a2.mo229890d() != cVar.f165460a) {
                aVar.mo229904a(i3, c2.f165457a);
                break;
            } else {
                if (!z || i3 < i6) {
                    m257523a(c2, cVar);
                } else {
                    aVar.mo229903a(i3);
                }
                i9 = m257522a(c2, i9, LayoutManager.Direction.START, cVar, aVar);
                mo229912a(c2, i3, LayoutManager.Direction.START, aVar);
                i3--;
            }
        }
        return i9;
    }
}
