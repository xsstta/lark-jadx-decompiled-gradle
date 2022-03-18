package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.C26277g;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragEndEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragMoveEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragStartEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31140i;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31141j;
import com.ss.android.lark.calendar.impl.utils.am;
import com.ss.android.lark.calendar.impl.utils.ao;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.a.d */
public abstract class AbstractC30767d<T extends View> extends C30764a<T> {

    /* renamed from: a */
    protected ViewGroup f77277a;

    /* renamed from: b */
    protected C31140i f77278b;

    /* renamed from: c */
    protected C31136e f77279c;

    /* renamed from: d */
    private AbstractC30767d<T>.C30768a f77280d = new C30768a();

    /* renamed from: e */
    private boolean f77281e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111251a(T t, C31133b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111252a(T t, C31138g gVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111253a(C31133b bVar, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111255a(AbstractC31134c cVar, T t, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo111262b(C31133b bVar, T t) {
    }

    /* renamed from: a */
    public void mo111241a(C31138g gVar, T t) {
        Bitmap bitmap;
        super.mo111241a(gVar, (Object) t);
        this.f77277a = (ViewGroup) gVar.mo112760l();
        this.f77280d.mo111267a(gVar.mo112755g(), gVar.mo112756h());
        am.m125208a(t.getContext(), 80);
        if (gVar instanceof DayDragStartEvent) {
            DayDragStartEvent cVar = (DayDragStartEvent) gVar;
            if (cVar.mo111207a() != null) {
                bitmap = cVar.mo111207a().mo110980m();
                Point a = mo111249a((int) gVar.mo112753e(), (int) gVar.mo112754f());
                C31140i iVar = new C31140i(this.f77277a, bitmap, gVar.mo112757i(), gVar.mo112758j());
                this.f77278b = iVar;
                iVar.mo112772a((float) a.x, (float) a.y);
                mo111252a(t, gVar);
            }
        }
        bitmap = C31141j.m116253a(gVar.mo112759k(), 0);
        Point a2 = mo111249a((int) gVar.mo112753e(), (int) gVar.mo112754f());
        C31140i iVar2 = new C31140i(this.f77277a, bitmap, gVar.mo112757i(), gVar.mo112758j());
        this.f77278b = iVar2;
        iVar2.mo112772a((float) a2.x, (float) a2.y);
        mo111252a(t, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.a.d$a */
    public class C30768a {

        /* renamed from: b */
        private Rect f77283b = new Rect();

        /* renamed from: a */
        public boolean mo111268a() {
            int a = ao.m125215a();
            if (this.f77283b.width() >= a || this.f77283b.height() >= a) {
                return false;
            }
            return true;
        }

        public C30768a() {
        }

        /* renamed from: b */
        public void mo111269b(float f, float f2) {
            m114685d(f, f2);
        }

        /* renamed from: c */
        public void mo111270c(float f, float f2) {
            m114685d(f, f2);
        }

        /* renamed from: a */
        public void mo111267a(float f, float f2) {
            this.f77283b.setEmpty();
            int i = (int) f;
            int i2 = (int) f2;
            this.f77283b.set(i, i2, i, i2);
        }

        /* renamed from: d */
        private void m114685d(float f, float f2) {
            Rect rect = this.f77283b;
            int i = (int) f2;
            rect.top = Math.min(rect.top, i);
            Rect rect2 = this.f77283b;
            rect2.bottom = Math.max(rect2.bottom, i);
            Rect rect3 = this.f77283b;
            int i2 = (int) f;
            rect3.left = Math.min(rect3.left, i2);
            Rect rect4 = this.f77283b;
            rect4.right = Math.max(rect4.right, i2);
        }
    }

    /* renamed from: c */
    private void m114661c() {
        C31140i iVar = this.f77278b;
        if (iVar != null) {
            this.f77277a.removeView(iVar);
            this.f77278b.mo112771a();
            this.f77278b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Rect mo111261b() {
        ViewGroup viewGroup;
        if (this.f77281e) {
            return C26277g.m95142a(this.f77278b, this.f77277a);
        }
        Point point = new Point();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) point.x, (float) point.y};
        View view = this.f77278b;
        while (true) {
            viewGroup = this.f77277a;
            if (view == viewGroup || view == null) {
                arrayList.add(viewGroup);
                int size = arrayList.size();
            } else {
                arrayList.add(view);
                view = (View) view.getParent();
            }
        }
        arrayList.add(viewGroup);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            View view2 = (View) arrayList.get(i);
            if (view2 != null) {
                if (view2 != this.f77278b) {
                    fArr[0] = fArr[0] - ((float) view2.getScrollX());
                    fArr[1] = fArr[1] - ((float) view2.getScrollY());
                }
                Matrix matrix = view2.getMatrix();
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
            }
        }
        point.x = Math.round(fArr[0]);
        point.y = Math.round(fArr[1]);
        return new Rect(point.x, point.y, point.x + this.f77278b.getWidth(), point.y + this.f77278b.getHeight());
    }

    public AbstractC30767d(boolean z) {
        this.f77281e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111254a(AbstractC31134c cVar) {
        AbstractC30773d dVar = (AbstractC30773d) mo111239a(AbstractC30773d.class);
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        if (dVar != null && aVar != null) {
            dVar.mo111121a(aVar.mo111188a((int) cVar.mo112753e()), (int) cVar.mo112755g(), (int) cVar.mo112756h());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111256a(C31136e eVar) {
        DragDrawChipViewData eVar2;
        int i;
        int i2;
        if (eVar instanceof DayDragMoveEvent) {
            eVar2 = ((DayDragMoveEvent) eVar).mo111205a();
        } else {
            eVar2 = null;
        }
        if (eVar2 == null) {
            i2 = eVar.mo112759k().getHeight();
            i = eVar.mo112759k().getWidth();
        } else {
            int l = eVar2.mo110979l() - eVar2.mo110976i();
            i = eVar2.mo110978k() - eVar2.mo110977j();
            i2 = l;
        }
        int b = mo111260b(i, (int) eVar.mo112753e());
        this.f77278b.mo112773a(b, mo111264c(i2, (int) eVar.mo112754f()));
        mo111257a(eVar, b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Point mo111249a(int i, int i2) {
        Point point = new Point(i, i2);
        ViewGroup viewGroup = this.f77277a;
        mo111250a(viewGroup, ((Activity) viewGroup.getContext()).getWindow().getDecorView(), point);
        return point;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo111260b(int i, int i2) {
        int width = this.f77277a.getWidth();
        int left = this.f77277a.getLeft();
        int right = this.f77277a.getRight();
        int offsetX = this.f77278b.getOffsetX();
        if (this.f77281e) {
            if (i2 - offsetX <= 0) {
                return left + offsetX;
            }
            int i3 = i - offsetX;
            if (i2 + i3 >= width) {
                return right - i3;
            }
            return i2;
        } else if (i2 - offsetX <= (-i) / 2) {
            return left - (i - offsetX);
        } else {
            int i4 = i - offsetX;
            if (i2 + i4 >= right) {
                return right - i4;
            }
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo111264c(int i, int i2) {
        int height = this.f77277a.getHeight();
        int top = this.f77277a.getTop();
        int offsetY = this.f77278b.getOffsetY();
        if (this.f77281e) {
            if (i2 - offsetY <= 0) {
                return top + offsetY;
            }
            int i3 = i - offsetY;
            if (i2 + i3 >= height) {
                return height - i3;
            }
            return i2;
        } else if (i2 - offsetY <= 0) {
            return offsetY;
        } else {
            int i4 = i - offsetY;
            if (i2 + i4 >= height) {
                return height - i4;
            }
            return i2;
        }
    }

    /* renamed from: c */
    public void mo111235a(C31133b bVar, T t) {
        super.mo111235a(bVar, (Object) t);
        if (this.f77278b != null) {
            this.f77280d.mo111270c(bVar.mo112755g(), bVar.mo112756h());
            if (!this.f77280d.mo111268a()) {
                mo111253a(bVar, (View) t);
            } else {
                mo111262b(bVar, (View) t);
            }
            mo111251a(t, bVar);
            m114661c();
        }
    }

    /* renamed from: d */
    public void mo111243b(C31133b bVar, T t) {
        if (bVar instanceof DayDragEndEvent) {
            DayDragEndEvent aVar = (DayDragEndEvent) bVar;
            if (this.f77278b != null && this.f77279c != null) {
                Point a = mo111249a((int) aVar.mo112755g(), (int) aVar.mo112756h());
                a.y = mo111264c(t.getHeight(), (int) this.f77279c.mo112754f());
                mo111253a((C31133b) new DayDragEndEvent((float) a.x, (float) a.y, aVar.mo112755g(), aVar.mo112756h(), aVar.mo112757i(), aVar.mo112758j(), aVar.mo112759k(), aVar.mo111202a(), aVar.mo111204b(), this.f77278b, aVar.mo112751d()), (View) t);
                mo111251a(t, aVar);
                m114661c();
            }
        }
    }

    /* renamed from: b */
    public void mo111244b(C31136e eVar, T t) {
        DayChipsLayer dayChipsLayer;
        DragDrawChipViewData eVar2;
        if (this.f77278b != null && this.f77279c != null) {
            Point a = mo111249a((int) eVar.mo112755g(), (int) eVar.mo112756h());
            if (this.f77281e) {
                a.x = mo111260b(t.getHeight(), a.x);
                a.y = mo111264c(t.getHeight(), (int) this.f77279c.mo112754f());
                this.f77278b.mo112773a(a.x, a.y);
                mo111255a(eVar, t, mo111261b().top);
                return;
            }
            if (eVar instanceof DayDragMoveEvent) {
                DayDragMoveEvent bVar = (DayDragMoveEvent) eVar;
                DragDrawChipViewData a2 = bVar.mo111205a();
                dayChipsLayer = bVar.mo111206b();
                eVar2 = a2;
            } else {
                eVar2 = null;
                dayChipsLayer = null;
            }
            DayDragMoveEvent bVar2 = new DayDragMoveEvent((float) a.x, (float) a.y, eVar.mo112755g(), eVar.mo112756h(), eVar.mo112757i(), eVar.mo112758j(), eVar.mo112759k(), eVar2, dayChipsLayer, this.f77278b, eVar.mo112762d());
            mo111256a((C31136e) bVar2);
            mo111255a(bVar2, t, mo111261b().top);
            mo111254a((AbstractC31134c) bVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111257a(C31136e eVar, int i) {
        DayChipsLayer dayChipsLayer;
        DragDrawChipViewData eVar2;
        if (eVar instanceof DayDragMoveEvent) {
            DayDragMoveEvent bVar = (DayDragMoveEvent) eVar;
            DragDrawChipViewData a = bVar.mo111205a();
            dayChipsLayer = bVar.mo111206b();
            eVar2 = a;
        } else {
            eVar2 = null;
            dayChipsLayer = null;
        }
        this.f77279c = new DayDragMoveEvent(eVar.mo112753e(), eVar.mo112754f(), (float) i, eVar.mo112756h(), eVar.mo112757i(), eVar.mo112758j(), eVar.mo112759k(), eVar2, dayChipsLayer, this.f77278b, eVar.mo112762d());
    }

    /* renamed from: a */
    public void mo111238a(C31136e eVar, T t) {
        this.f77280d.mo111269b(eVar.mo112755g(), eVar.mo112756h());
        if (this.f77278b != null) {
            mo111256a(eVar);
            mo111255a(eVar, t, mo111261b().top);
            mo111254a((AbstractC31134c) eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111250a(View view, View view2, Point point) {
        View view3;
        if (this.f77281e) {
            C26277g.m95143b(view, view2, point);
            return;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = {(float) point.x, (float) point.y};
        while (view != view2) {
            arrayList.add(view);
            view = (View) view.getParent();
        }
        arrayList.add(view2);
        Matrix matrix = new Matrix();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            View view4 = (View) arrayList.get(size);
            if (size > 0) {
                view3 = (View) arrayList.get(size - 1);
            } else {
                view3 = null;
            }
            fArr[0] = fArr[0] + ((float) view4.getScrollX());
            fArr[1] = fArr[1] + ((float) view4.getScrollY());
            if (view3 != null) {
                fArr[0] = fArr[0] - ((float) view3.getLeft());
                fArr[1] = fArr[1] - ((float) view3.getTop());
                view3.getMatrix().invert(matrix);
                matrix.mapPoints(fArr);
            }
        }
        point.x = Math.round(fArr[0]);
        point.y = Math.round(fArr[1]);
    }
}
