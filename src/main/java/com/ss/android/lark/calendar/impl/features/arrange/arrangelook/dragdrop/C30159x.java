package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26206g;
import com.larksuite.framework.ui.dragger.C26208i;
import com.larksuite.framework.ui.dragger.C26212j;
import com.larksuite.framework.utils.C26277g;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.utils.am;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.x */
public class C30159x<T extends View> extends C30123a<T> {

    /* renamed from: a */
    protected ViewGroup f75200a;

    /* renamed from: b */
    public C26204e f75201b;

    /* renamed from: c */
    private C26208i f75202c;

    /* renamed from: d */
    private C30147l f75203d = new C30147l();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108635a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108624a(C26201b bVar, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108637a(AbstractC26202c cVar, T t, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108640b(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108641b(C26201b bVar, T t) {
    }

    /* renamed from: a */
    public void mo108610a(C26206g gVar, T t) {
        super.mo108610a(gVar, (Object) t);
        this.f75200a = (ViewGroup) gVar.mo93204k();
        this.f75203d.mo108705a(gVar.mo93198e(), gVar.mo93199f());
        am.m125208a(t.getContext(), 80);
        m111710a(gVar);
        mo108640b(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Rect mo108722c() {
        return C26277g.m95142a(this.f75202c, this.f75200a);
    }

    public C30159x() {
        mo108611a(AbstractC30151p.class, new AbstractC30151p() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30159x.C301601 */

            @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30151p
            /* renamed from: a */
            public C26204e mo108714a() {
                return C30159x.this.f75201b;
            }
        });
    }

    /* renamed from: d */
    private void m111714d() {
        C26208i iVar = this.f75202c;
        if (iVar != null) {
            this.f75200a.removeView(iVar);
            this.f75202c.mo93218a();
            this.f75202c = null;
        }
    }

    /* renamed from: a */
    private void m111710a(C26206g gVar) {
        Bitmap a = C26212j.m94807a(gVar.mo93202i(), 0);
        Point a2 = m111708a((int) gVar.mo93196c(), (int) gVar.mo93197d());
        C26208i iVar = new C26208i(this.f75200a, a, gVar.mo93200g(), gVar.mo93201h());
        this.f75202c = iVar;
        iVar.mo93219a((float) a2.x, (float) a2.y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108718a(AbstractC26202c cVar) {
        CalendarDaysContract.AbstractC30655a aVar = (CalendarDaysContract.AbstractC30655a) mo108603a(CalendarDaysContract.AbstractC30655a.class);
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (aVar != null && oVar != null) {
            aVar.mo108702a(oVar.mo108691a((int) cVar.mo93196c()), (int) cVar.mo93198e(), (int) cVar.mo93199f());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30123a, com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108607a(C26204e eVar) {
        this.f75200a = (ViewGroup) eVar.mo93204k();
        C26208i j = eVar.mo93203j();
        this.f75202c = j;
        this.f75200a.addView(j);
        this.f75202c.mo93220a((int) eVar.mo93198e(), m111708a((int) eVar.mo93198e(), (int) eVar.mo93199f()).y);
        m111709a(eVar, (int) eVar.mo93198e());
    }

    /* renamed from: a */
    private Point m111708a(int i, int i2) {
        Point point = new Point(i, i2);
        ViewGroup viewGroup = this.f75200a;
        C26277g.m95143b(viewGroup, ((Activity) viewGroup.getContext()).getWindow().getDecorView(), point);
        return point;
    }

    /* renamed from: a */
    private void m111709a(C26204e eVar, int i) {
        this.f75201b = new C26204e(eVar.mo93196c(), eVar.mo93197d(), (float) i, eVar.mo93199f(), eVar.mo93200g(), eVar.mo93201h(), eVar.mo93202i(), this.f75202c, eVar.mo93207b());
    }

    /* renamed from: b */
    private int m111711b(int i, int i2) {
        int width = this.f75200a.getWidth();
        int left = this.f75200a.getLeft();
        int right = this.f75200a.getRight();
        int offsetX = this.f75202c.getOffsetX();
        if (i2 - offsetX <= 0) {
            return left + offsetX;
        }
        int i3 = i - offsetX;
        if (i2 + i3 >= width) {
            return right - i3;
        }
        return i2;
    }

    /* renamed from: c */
    private int m111712c(int i, int i2) {
        int height = this.f75200a.getHeight();
        int top = this.f75200a.getTop();
        int offsetY = this.f75202c.getOffsetY();
        if (i2 - offsetY <= 0) {
            return top + offsetY;
        }
        int i3 = i - offsetY;
        if (i2 + i3 >= height) {
            return height - i3;
        }
        return i2;
    }

    /* renamed from: c */
    private void m111713c(C26204e eVar, View view) {
        int c = m111712c(view.getHeight(), (int) eVar.mo93197d());
        int b = m111711b(view.getWidth(), (int) eVar.mo93196c());
        this.f75202c.mo93220a(b, c);
        m111709a(eVar, b);
    }

    /* renamed from: b */
    public void mo108614b(C26204e eVar, T t) {
        if (this.f75202c != null && this.f75201b != null) {
            Point a = m111708a((int) eVar.mo93198e(), (int) eVar.mo93199f());
            a.x = m111711b(t.getHeight(), a.x);
            a.y = m111712c(t.getHeight(), (int) this.f75201b.mo93197d());
            this.f75202c.mo93220a(a.x, a.y);
            mo108637a(eVar, t, mo108722c().top);
        }
    }

    /* renamed from: d */
    public void mo108613b(C26201b bVar, T t) {
        boolean z;
        if (!(this.f75202c == null || this.f75201b == null)) {
            Point a = m111708a((int) bVar.mo93198e(), (int) bVar.mo93199f());
            a.y = m111712c(t.getHeight(), (int) this.f75201b.mo93197d());
            mo108624a(new C26201b((float) a.x, (float) a.y, bVar.mo93198e(), bVar.mo93199f(), bVar.mo93200g(), bVar.mo93201h(), bVar.mo93202i(), this.f75202c, bVar.mo93194b()), (View) t);
            mo108635a(t);
            m111714d();
        }
        if (this.f75201b != null) {
            z = true;
        } else {
            z = false;
        }
        C3474b.m14695a(z);
    }

    /* renamed from: c */
    public void mo108605a(C26201b bVar, T t) {
        super.mo108605a(bVar, (Object) t);
        if (this.f75202c != null) {
            this.f75203d.mo108708c(bVar.mo93198e(), bVar.mo93199f());
            if (!this.f75203d.mo108706a()) {
                mo108624a(bVar, (View) t);
            } else {
                mo108641b(bVar, (View) t);
            }
            mo108635a(t);
            m111714d();
        }
    }

    /* renamed from: a */
    public void mo108608a(C26204e eVar, T t) {
        this.f75203d.mo108707b(eVar.mo93198e(), eVar.mo93199f());
        if (this.f75202c != null) {
            m111713c(eVar, t);
            mo108637a(eVar, t, mo108722c().top);
            mo108718a((AbstractC26202c) eVar);
        }
    }
}
