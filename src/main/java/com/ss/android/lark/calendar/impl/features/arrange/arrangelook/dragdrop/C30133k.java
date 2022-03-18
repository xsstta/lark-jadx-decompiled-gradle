package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.AbstractC26221l;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26203d;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26205f;
import com.larksuite.framework.ui.dragger.C26206g;
import com.larksuite.framework.ui.dragger.C26208i;
import com.larksuite.framework.ui.dragger.C26213k;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.DragTargetOptionBuilder;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.k */
public class C30133k {

    /* renamed from: A */
    private AbstractC26221l<C26206g> f75149A = new AbstractC26221l<C26206g>() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301404 */

        /* renamed from: a */
        public void mo93270a(C26206g gVar) {
            C30133k.this.mo108662a(gVar);
        }
    };

    /* renamed from: B */
    private AbstractC26221l<C26201b> f75150B = new AbstractC26221l<C26201b>() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301415 */

        /* renamed from: a */
        public void mo93270a(C26201b bVar) {
            C30133k.this.mo108658a(bVar);
        }
    };

    /* renamed from: C */
    private AbstractC26221l<C26204e> f75151C = new AbstractC26221l<C26204e>() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301426 */

        /* renamed from: a */
        public void mo93270a(C26204e eVar) {
            C30133k.this.mo108660a(eVar);
        }
    };

    /* renamed from: a */
    public C26213k f75152a;

    /* renamed from: b */
    public EventChipsDragLayer f75153b;

    /* renamed from: c */
    public EventChipsViewLayer f75154c;

    /* renamed from: d */
    public C30132j f75155d;

    /* renamed from: e */
    public C30125c f75156e;

    /* renamed from: f */
    public C30167c f75157f;

    /* renamed from: g */
    public CalendarDaysContract.AbstractC30658d f75158g;

    /* renamed from: h */
    public CalendarDaysContract.AbstractC30656b f75159h;

    /* renamed from: i */
    public CalendarDaysContract.AbstractC30655a f75160i;

    /* renamed from: j */
    private final String f75161j = "EventChipsDragDelegate";

    /* renamed from: k */
    private Context f75162k;

    /* renamed from: l */
    private CalendarDate f75163l;

    /* renamed from: m */
    private CalendarDaysContract.AbstractC30657c f75164m;

    /* renamed from: n */
    private AbstractC30149n f75165n;

    /* renamed from: o */
    private int f75166o;

    /* renamed from: p */
    private AbstractView$OnTouchListenerC31108d f75167p = new AbstractView$OnTouchListenerC31108d() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301341 */

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d
        /* renamed from: b */
        public boolean mo108681b(View view, float f, float f2) {
            if (C30133k.this.f75156e == null && C30133k.this.f75155d == null) {
                return false;
            }
            if (C30133k.this.f75155d != null) {
                C30133k.this.mo108655a();
            }
            if (C30133k.this.f75156e == null) {
                return true;
            }
            C30133k kVar = C30133k.this;
            kVar.mo108665a((C30132j) kVar.f75156e);
            C30133k.this.f75156e = null;
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractView$OnTouchListenerC31108d
        /* renamed from: a */
        public void mo108680a(View view, float f, float f2) {
            Rect b = C30133k.this.f75157f.mo108777b(f, f2);
            b.set(b.left, b.top, b.right, b.top + Math.round(((float) b.height()) * (((float) C30022a.f74884c.mo108456c().getDefaultEventDuration()) / 60.0f)));
            if (!b.isEmpty()) {
                C30133k kVar = C30133k.this;
                kVar.f75156e = kVar.mo108675b(null, b.left, b.top, b.width(), b.height());
                C30133k kVar2 = C30133k.this;
                kVar2.mo108666a(kVar2.f75156e, new AbstractC30146a() {
                    /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301341.C301351 */

                    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AbstractC30146a
                    /* renamed from: a */
                    public void mo108682a() {
                        C30133k.this.f75156e = null;
                    }
                });
                int a = C30133k.this.f75157f.mo108769a(f);
                if (C30133k.this.f75159h != null) {
                    C30133k.this.f75159h.mo108689a(a, b.top, b.bottom);
                }
            }
        }
    };

    /* renamed from: q */
    private CalendarDaysContract.AbstractC30655a f75168q = new CalendarDaysContract.AbstractC30655a() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301448 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: a */
        public void mo108701a() {
            if (C30133k.this.f75160i != null) {
                C30133k.this.f75160i.mo108701a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: b */
        public void mo108703b() {
            if (C30133k.this.f75160i != null) {
                C30133k.this.f75160i.mo108703b();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
        /* renamed from: a */
        public void mo108702a(int i, int i2, int i3) {
            if (C30133k.this.f75160i != null) {
                C30133k.this.f75160i.mo108702a(i, i2, i3);
            }
        }
    };

    /* renamed from: r */
    private AbstractC30153r f75169r = new AbstractC30153r() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301459 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30153r
        /* renamed from: a */
        public void mo108704a(View view, ViewGroup.LayoutParams layoutParams) {
            C30133k.this.mo108657a(view, (FrameLayout.LayoutParams) layoutParams);
        }
    };

    /* renamed from: s */
    private AbstractC30154s f75170s = new AbstractC30154s() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass10 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30154s
        /* renamed from: a */
        public void mo108683a(ViewGroup viewGroup, C30125c cVar) {
            if (viewGroup != C30133k.this.f75153b) {
                if (viewGroup != null) {
                    viewGroup.removeView(cVar);
                    ((EventChipsDragLayer) viewGroup).mo108588a();
                }
                C30133k.this.f75153b.addView(cVar);
                C30133k.this.f75156e = cVar;
                C30133k kVar = C30133k.this;
                kVar.mo108666a(kVar.f75156e, new AbstractC30146a() {
                    /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass10.C301361 */

                    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AbstractC30146a
                    /* renamed from: a */
                    public void mo108682a() {
                        C30133k.this.f75156e = null;
                    }
                });
            }
        }
    };

    /* renamed from: t */
    private AbstractC30156u f75171t = new AbstractC30156u() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass11 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30156u
        /* renamed from: a */
        public void mo108684a(ViewGroup viewGroup, C30132j jVar) {
            if (viewGroup != C30133k.this.f75153b) {
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                    ((EventChipsDragLayer) viewGroup).mo108588a();
                }
                C30133k.this.f75153b.addView(jVar);
                C30133k.this.f75155d = jVar;
                C30133k kVar = C30133k.this;
                kVar.mo108666a(kVar.f75155d, new AbstractC30146a() {
                    /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass11.C301371 */

                    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AbstractC30146a
                    /* renamed from: a */
                    public void mo108682a() {
                        C30133k.this.f75155d = null;
                    }
                });
            }
        }
    };

    /* renamed from: u */
    private AbstractC30155t f75172u = new AbstractC30155t() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass12 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30155t
        /* renamed from: a */
        public void mo108685a(ViewGroup viewGroup, EventChipView eventChipView) {
            if (viewGroup != C30133k.this.f75154c) {
                if (viewGroup != null) {
                    viewGroup.removeView(eventChipView);
                }
                C30133k.this.f75154c.addView(eventChipView);
            }
        }
    };

    /* renamed from: v */
    private AbstractC30152q f75173v = new AbstractC30152q() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass13 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30152q
        /* renamed from: a */
        public boolean mo108687a() {
            if (C30133k.this.f75155d != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30152q
        /* renamed from: a */
        public void mo108686a(C26201b bVar, EventChipView eventChipView) {
            C30133k.this.f75152a.mo93237b(eventChipView);
            C30133k kVar = C30133k.this;
            kVar.f75155d = kVar.mo108653a(eventChipView, eventChipView.getLeft(), eventChipView.getTop(), eventChipView.getWidth(), eventChipView.getHeight());
        }
    };

    /* renamed from: w */
    private CalendarDaysContract.AbstractC30656b f75174w = new CalendarDaysContract.AbstractC30656b() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass14 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108688a() {
            if (C30133k.this.f75159h != null) {
                C30133k.this.f75159h.mo108688a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108689a(int i, int i2, int i3) {
            if (C30133k.this.f75159h != null) {
                C30133k.this.f75159h.mo108689a(i, i2, i3);
            }
        }
    };

    /* renamed from: x */
    private AbstractC30150o f75175x = new AbstractC30150o() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.AnonymousClass15 */

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public int mo108690a() {
            return C30133k.this.f75157f.mo108768a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: b */
        public int mo108693b() {
            return C30133k.this.f75157f.mo108775b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: c */
        public int mo108694c() {
            return C30133k.this.f75157f.mo108778c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public int mo108691a(int i) {
            return C30133k.this.f75157f.mo108769a((float) i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public Rect mo108692a(float f, float f2) {
            return C30133k.this.f75157f.mo108771a(f, f2);
        }
    };

    /* renamed from: y */
    private AbstractC26221l<C26203d> f75176y = new AbstractC26221l<C26203d>() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301382 */

        /* renamed from: a */
        public void mo93270a(C26203d dVar) {
            C30133k.this.mo108659a(dVar);
        }
    };

    /* renamed from: z */
    private AbstractC26221l<C26205f> f75177z = new AbstractC26221l<C26205f>() {
        /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.C301393 */

        /* renamed from: a */
        public void mo93270a(C26205f fVar) {
            C30133k.this.mo108661a(fVar);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.k$a */
    public interface AbstractC30146a {
        /* renamed from: a */
        void mo108682a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo108677c() {
        this.f75155d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractView$OnTouchListenerC31108d mo108679e() {
        return this.f75167p;
    }

    /* renamed from: a */
    public void mo108666a(final C30132j jVar, final AbstractC30146a aVar) {
        jVar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30133k.View$OnClickListenerC301437 */

            public void onClick(View view) {
                Log.m165389i("EventChipsDragDelegate", C32673y.m125369a("oneOrThreeAdd"));
                if (C30133k.this.f75158g != null) {
                    C30133k.this.f75158g.mo108515a(EditActivityEntrance.m118928a(view.getContext(), C30133k.this.mo108674a(jVar.getChipViewLayoutParams())), false);
                    C30133k.this.mo108665a(jVar);
                    AbstractC30146a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo108682a();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public long[] mo108674a(FrameLayout.LayoutParams layoutParams) {
        int julianDay = this.f75163l.getJulianDay() + this.f75157f.mo108769a((float) layoutParams.leftMargin);
        long timeInSeconds = new CalendarDate().setJulianDay(julianDay).moveToDayStart().getTimeInSeconds();
        if (C30022a.f74883b.mo112695c()) {
            timeInSeconds = new CalendarDate(C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).setJulianDay(julianDay).moveThisDateToDayStart().getTimeInSeconds();
        }
        return new long[]{((long) this.f75157f.mo108770a(layoutParams.topMargin)) + timeInSeconds, timeInSeconds + ((long) this.f75157f.mo108770a(layoutParams.topMargin + layoutParams.height))};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108663a(C26213k kVar) {
        this.f75152a = kVar;
        m111598h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108668a(C30167c cVar) {
        this.f75157f = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108671a(CalendarDaysContract.AbstractC30656b bVar) {
        this.f75159h = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108670a(CalendarDaysContract.AbstractC30655a aVar) {
        this.f75160i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108672a(CalendarDaysContract.AbstractC30657c cVar) {
        this.f75164m = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108667a(EventChipsViewLayer eventChipsViewLayer) {
        this.f75154c = eventChipsViewLayer;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108673a(CalendarDaysContract.AbstractC30658d dVar) {
        this.f75158g = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108669a(CalendarDate calendarDate) {
        this.f75163l = calendarDate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108664a(EventChipsDragLayer eventChipsDragLayer) {
        AbstractC30149n nVar;
        C26204e a;
        if (this.f75152a.mo93242d() && (nVar = this.f75165n) != null && (a = ((AbstractC30151p) nVar.mo108603a(AbstractC30151p.class)).mo108714a()) != null) {
            a.mo93195a(eventChipsDragLayer);
            C26208i j = a.mo93203j();
            if (j != null) {
                this.f75153b.removeView(j);
            }
            this.f75165n.mo108612b();
            eventChipsDragLayer.getDragDelegate().mo108654a((AbstractC26202c) a).mo108607a(a);
            m111597g();
        }
    }

    /* renamed from: a */
    public void mo108665a(C30132j jVar) {
        if (jVar != null) {
            this.f75152a.mo93237b(jVar);
            this.f75152a.mo93237b(jVar.getTopDragHandle());
            this.f75152a.mo93237b(jVar.getBottomDragHandle());
            this.f75153b.removeView(jVar);
        }
        CalendarDaysContract.AbstractC30656b bVar = this.f75159h;
        if (bVar != null) {
            bVar.mo108688a();
        }
    }

    /* renamed from: a */
    public void mo108661a(C26205f fVar) {
        if (m111595b(fVar.mo93208b())) {
            this.f75152a.mo93240c((View) null);
            m111594b(fVar);
            mo108654a((AbstractC26202c) fVar).mo108609a(fVar, fVar.mo93202i());
        }
    }

    /* renamed from: a */
    public void mo108662a(C26206g gVar) {
        if (m111595b(gVar.mo93209b())) {
            View i = gVar.mo93202i();
            gVar.mo93195a(this.f75153b);
            this.f75152a.mo93240c(this.f75153b);
            mo108654a((AbstractC26202c) gVar).mo108610a(gVar, i);
            m111591a(i);
            this.f75154c.mo108739a(i);
        }
        CalendarDaysContract.AbstractC30655a aVar = this.f75160i;
        if (aVar != null) {
            aVar.mo108701a();
        }
    }

    /* renamed from: i */
    private boolean m111599i() {
        if (this.f75156e != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo108676b() {
        CalendarDaysContract.AbstractC30656b bVar = this.f75159h;
        if (bVar != null) {
            bVar.mo108688a();
        }
    }

    /* renamed from: g */
    private void m111597g() {
        AbstractC30149n nVar = this.f75165n;
        if (nVar != null) {
            nVar.mo108604a();
            this.f75165n = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo108678d() {
        mo108665a((C30132j) this.f75156e);
        this.f75156e = null;
        if (this.f75155d != null) {
            mo108655a();
        }
    }

    /* renamed from: h */
    private void m111598h() {
        this.f75152a.mo93230a(this.f75153b);
        this.f75152a.mo93232a(C26206g.class, this.f75149A);
        this.f75152a.mo93232a(C26204e.class, this.f75151C);
        this.f75152a.mo93232a(C26203d.class, this.f75176y);
        this.f75152a.mo93232a(C26205f.class, this.f75177z);
        this.f75152a.mo93232a(C26201b.class, this.f75150B);
    }

    /* renamed from: f */
    private void m111596f() {
        this.f75165n.mo108611a(AbstractC30150o.class, this.f75175x);
        this.f75165n.mo108611a(CalendarDaysContract.AbstractC30656b.class, this.f75174w);
        this.f75165n.mo108611a(AbstractC30152q.class, this.f75173v);
        this.f75165n.mo108611a(AbstractC30155t.class, this.f75172u);
        this.f75165n.mo108611a(AbstractC30156u.class, this.f75171t);
        this.f75165n.mo108611a(AbstractC30154s.class, this.f75170s);
        this.f75165n.mo108611a(AbstractC30153r.class, this.f75169r);
        this.f75165n.mo108611a(CalendarDaysContract.AbstractC30655a.class, this.f75168q);
    }

    /* renamed from: a */
    public void mo108655a() {
        EventChipView eventChipView = this.f75155d.getEventChipView();
        FrameLayout.LayoutParams chipViewLayoutParams = this.f75155d.getChipViewLayoutParams();
        eventChipView.setShowDragBorder(false);
        this.f75155d.removeView(eventChipView);
        this.f75154c.addView(eventChipView, chipViewLayoutParams);
        eventChipView.setEnabled(true);
        this.f75152a.mo93231a(eventChipView, DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.LONG_PRESS_NO_DRAG_EXIT_HINT));
        m111593a(eventChipView, chipViewLayoutParams);
        mo108665a(this.f75155d);
        this.f75155d = null;
    }

    /* renamed from: a */
    public void mo108656a(int i) {
        this.f75166o = i;
    }

    /* renamed from: b */
    private boolean m111595b(View view) {
        if (view == null || view != this.f75153b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m111591a(View view) {
        C30125c cVar = this.f75156e;
        if (cVar != null && view != cVar && view != cVar.getBottomDragHandle() && view != this.f75156e.getTopDragHandle()) {
            mo108665a((C30132j) this.f75156e);
            this.f75156e = null;
        }
    }

    /* renamed from: b */
    private void m111594b(AbstractC26202c cVar) {
        if (m111599i()) {
            cVar.mo93195a(this.f75156e);
        } else {
            cVar.mo93195a(this.f75155d);
        }
    }

    /* renamed from: a */
    public AbstractC30149n mo108654a(AbstractC26202c cVar) {
        if (this.f75165n == null) {
            this.f75165n = C30130h.m111575a(cVar);
            m111596f();
        }
        return this.f75165n;
    }

    /* renamed from: a */
    public void mo108658a(C26201b bVar) {
        boolean z;
        if (m111595b(bVar.mo93194b())) {
            m111594b(bVar);
            mo108654a((AbstractC26202c) bVar).mo108605a(bVar, bVar.mo93202i());
        } else {
            if (!(this.f75165n == null || bVar.mo93202i() == null)) {
                this.f75165n.mo108613b(bVar, bVar.mo93202i());
            }
            if (bVar.mo93202i() != null) {
                z = true;
            } else {
                z = false;
            }
            C3474b.m14695a(z);
        }
        CalendarDaysContract.AbstractC30655a aVar = this.f75160i;
        if (aVar != null) {
            aVar.mo108703b();
        }
        m111597g();
        this.f75154c.mo108739a((View) null);
    }

    /* renamed from: a */
    public void mo108659a(C26203d dVar) {
        if (m111595b(dVar.mo93206b())) {
            this.f75152a.mo93240c(this.f75153b);
            m111594b(dVar);
            mo108654a((AbstractC26202c) dVar).mo108606a(dVar, dVar.mo93202i());
        }
    }

    /* renamed from: a */
    public void mo108660a(C26204e eVar) {
        if (m111595b(eVar.mo93207b())) {
            m111594b(eVar);
            mo108654a((AbstractC26202c) eVar).mo108608a(eVar, eVar.mo93202i());
        } else if (this.f75165n != null) {
            m111594b(eVar);
            this.f75165n.mo108614b(eVar, eVar.mo93202i());
        }
    }

    /* renamed from: a */
    public void mo108657a(View view, FrameLayout.LayoutParams layoutParams) {
        m111593a((EventChipView) view, layoutParams);
    }

    /* renamed from: a */
    private void m111592a(C30132j jVar, FrameLayout.LayoutParams layoutParams) {
        if (jVar != null) {
            jVar.setClickable(true);
            this.f75153b.addView(jVar, layoutParams);
            this.f75152a.mo93231a(jVar.getTopDragHandle(), DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
            this.f75152a.mo93231a(jVar.getBottomDragHandle(), DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
            this.f75152a.mo93231a(jVar, DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
        }
    }

    C30133k(Context context, EventChipsDragLayer eventChipsDragLayer) {
        this.f75153b = eventChipsDragLayer;
        this.f75162k = context;
    }

    /* renamed from: a */
    private void m111593a(EventChipView eventChipView, FrameLayout.LayoutParams layoutParams) {
        if (this.f75164m != null) {
            EventChipViewData viewData = eventChipView.getViewData();
            long[] a = mo108674a(layoutParams);
            long durationMinutes = viewData.getDurationMinutes();
            long j = a[1] - a[0];
            if (durationMinutes < 30 && j <= 1800) {
                a[1] = a[0] + (durationMinutes * 60);
            }
            this.f75164m.mo110674a(viewData.getCalendarEventInstance(), a[0], a[1]);
        }
    }

    /* renamed from: a */
    public C30132j mo108653a(EventChipView eventChipView, int i, int i2, int i3, int i4) {
        C30132j jVar = new C30132j(this.f75162k, eventChipView);
        m111592a(jVar, jVar.mo108644a(i3, i4, i, i2));
        return jVar;
    }

    /* renamed from: b */
    public C30125c mo108675b(EventChipView eventChipView, int i, int i2, int i3, int i4) {
        C30125c cVar = new C30125c(this.f75162k, eventChipView, this.f75166o);
        m111592a((C30132j) cVar, cVar.mo108644a(i3, i4, i, i2));
        return cVar;
    }
}
