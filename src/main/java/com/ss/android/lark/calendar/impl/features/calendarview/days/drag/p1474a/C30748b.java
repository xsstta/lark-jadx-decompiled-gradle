package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.PiecesDragger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30762c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30775f;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.factory.DragEventHandlerFactory;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30758b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30760d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.event.DayDragEndEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31152l;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.b */
public class C30748b {

    /* renamed from: A */
    private final AbstractC30762c f77199A = new AbstractC30762c() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.C307513 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30762c
        /* renamed from: a */
        public boolean mo111186a() {
            if (C30748b.this.f77203b != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30762c
        /* renamed from: a */
        public void mo111185a(C31133b bVar, View view) {
            C30748b.this.mo111173a(bVar, view);
        }
    };

    /* renamed from: B */
    private final AbstractC30774e f77200B = new AbstractC30774e() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.C307524 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111125a() {
            if (C30748b.this.f77206e != null) {
                C30748b.this.f77206e.mo111125a();
            }
            if (C30748b.this.f77207f != null) {
                C30748b.this.f77207f.mo111115a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111126a(int i, int i2, int i3) {
            if (C30748b.this.f77206e != null) {
                C30748b.this.f77206e.mo111126a(i, i2, i3);
            }
            C30748b.this.mo111176b();
        }
    };

    /* renamed from: C */
    private final AbstractC30756a f77201C = new AbstractC30756a() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.C307535 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a
        /* renamed from: a */
        public int mo111187a() {
            return C30748b.this.f77205d.mo111119a().mo108778c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a
        /* renamed from: b */
        public int mo111190b() {
            return C30748b.this.f77205d.mo111119a().mo108768a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a
        /* renamed from: c */
        public int mo111191c() {
            return C30748b.this.f77205d.mo111119a().mo108775b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a
        /* renamed from: a */
        public int mo111188a(int i) {
            return C30748b.this.f77205d.mo111119a().mo108769a((float) i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a
        /* renamed from: a */
        public Rect mo111189a(float f, float f2) {
            return C30748b.this.f77205d.mo111119a().mo108771a(f, f2);
        }
    };

    /* renamed from: a */
    protected PiecesDragger f77202a;

    /* renamed from: b */
    public C30760d f77203b;

    /* renamed from: c */
    public C30758b f77204c;

    /* renamed from: d */
    public AbstractC30754a f77205d;

    /* renamed from: e */
    public AbstractC30774e f77206e;

    /* renamed from: f */
    public IOnAppendTimeSelected f77207f;

    /* renamed from: g */
    boolean f77208g = false;

    /* renamed from: h */
    boolean f77209h = true;

    /* renamed from: i */
    boolean f77210i = true;

    /* renamed from: j */
    private final String f77211j = "DragDelegate";

    /* renamed from: k */
    private int f77212k;

    /* renamed from: l */
    private final C30745a f77213l;

    /* renamed from: m */
    private final List<DayChipsLayer> f77214m = new ArrayList();

    /* renamed from: n */
    private final Context f77215n;

    /* renamed from: o */
    private int f77216o;

    /* renamed from: p */
    private C30745a.AbstractC30746a f77217p;

    /* renamed from: q */
    private AbstractC30773d f77218q;

    /* renamed from: r */
    private C30745a.AbstractC30747b f77219r;

    /* renamed from: s */
    private AbstractC30766c f77220s;

    /* renamed from: t */
    private int f77221t = 0;

    /* renamed from: u */
    private int f77222u = 0;

    /* renamed from: v */
    private final AbstractC31152l<C31138g> f77223v = new AbstractC31152l() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.$$Lambda$b$9bZ8ule_6cTorDPYi32E0kVNJLc */

        @Override // com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31152l
        public final void onDragEvent(AbstractC31134c cVar) {
            C30748b.lambda$9bZ8ule_6cTorDPYi32E0kVNJLc(C30748b.this, (C31138g) cVar);
        }
    };

    /* renamed from: w */
    private final AbstractC31152l<C31133b> f77224w = new AbstractC31152l() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.$$Lambda$b$YiIvzLax1aX5Uekw8uYyNGuhKDg */

        @Override // com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31152l
        public final void onDragEvent(AbstractC31134c cVar) {
            C30748b.lambda$YiIvzLax1aX5Uekw8uYyNGuhKDg(C30748b.this, (C31133b) cVar);
        }
    };

    /* renamed from: x */
    private final AbstractC31152l<C31136e> f77225x = new AbstractC31152l() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.$$Lambda$b$x6CQSqhS8SUjZEXyRuyHM3Hv7vQ */

        @Override // com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31152l
        public final void onDragEvent(AbstractC31134c cVar) {
            C30748b.lambda$x6CQSqhS8SUjZEXyRuyHM3Hv7vQ(C30748b.this, (C31136e) cVar);
        }
    };

    /* renamed from: y */
    private final View.OnTouchListener f77226y = new DragLayerOnTouchListener() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.C307491 */

        /* renamed from: b */
        private boolean f77229b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.draglayer.DragLayerOnTouchListener
        /* renamed from: a */
        public boolean mo111183a() {
            if (C30748b.this.f77204c == null && C30748b.this.f77203b == null) {
                return false;
            }
            C30748b.this.mo111163a();
            this.f77229b = true;
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.draglayer.DragLayerOnTouchListener
        /* renamed from: a */
        public void mo111182a(float f, float f2) {
            if (this.f77229b) {
                this.f77229b = false;
            } else {
                C30748b.this.mo111164a(f, f2);
            }
        }
    };

    /* renamed from: z */
    private final AbstractC30775f f77227z = new AbstractC30775f() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.C307502 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30775f
        /* renamed from: a */
        public void mo111184a(C31133b bVar, ViewGroup.LayoutParams layoutParams) {
            C30748b.this.mo111174a(bVar, layoutParams);
        }
    };

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.b$a */
    public interface AbstractC30754a {
        /* renamed from: a */
        C30167c mo111119a();
    }

    /* renamed from: c */
    public void mo111178c() {
        this.f77222u = 3;
    }

    /* renamed from: e */
    public View.OnTouchListener mo111181e() {
        return this.f77226y;
    }

    /* renamed from: a */
    public void mo111163a() {
        if (this.f77203b != null) {
            m114542h();
        }
        C30758b bVar = this.f77204c;
        if (bVar != null) {
            m114527a((C30760d) bVar);
            this.f77204c = null;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m114533a(C31138g gVar) {
        this.f77208g = true;
        View k = gVar.mo112759k();
        gVar.mo112752a(this.f77213l);
        this.f77202a.mo112792d(this.f77213l);
        mo111162a((AbstractC31134c) gVar).mo111241a(gVar, k);
        m114537b(k);
        AbstractC30773d dVar = this.f77218q;
        if (dVar != null) {
            dVar.mo111120a();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m114532a(C31136e eVar) {
        if (m114534a(eVar.mo112762d())) {
            m114539b(eVar);
            mo111162a((AbstractC31134c) eVar).mo111238a(eVar, eVar.mo112759k());
        } else if (this.f77220s != null) {
            m114539b(eVar);
            this.f77220s.mo111244b(eVar, eVar.mo112759k());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m114531a(C31133b bVar) {
        this.f77208g = false;
        if (m114534a(bVar.mo112751d())) {
            m114539b(bVar);
            mo111162a((AbstractC31134c) bVar).mo111235a(bVar, bVar.mo112759k());
        } else if (!(this.f77220s == null || bVar.mo112759k() == null)) {
            this.f77220s.mo111243b(bVar, bVar.mo112759k());
        }
        AbstractC30773d dVar = this.f77218q;
        if (dVar != null) {
            dVar.mo111122b();
        }
        m114544j();
    }

    /* renamed from: a */
    public AbstractC30766c mo111162a(AbstractC31134c cVar) {
        if (this.f77220s == null) {
            this.f77220s = DragEventHandlerFactory.f77253a.mo111210a(cVar);
            m114541g();
        }
        return this.f77220s;
    }

    /* renamed from: a */
    public void mo111174a(C31133b bVar, ViewGroup.LayoutParams layoutParams) {
        if (bVar instanceof DayDragEndEvent) {
            Log.m165389i("DragDelegate", C32673y.m125369a("save normal drag"));
            m114525a((DayDragEndEvent) bVar);
            m114538b((EventChipView) bVar.mo112759k(), (FrameLayout.LayoutParams) layoutParams);
            this.f77202a.mo111200b();
        }
    }

    /* renamed from: a */
    public void mo111164a(float f, float f2) {
        Rect b = m114536b(f, f2);
        if (b != null) {
            m114524a(b);
            if (this.f77206e != null) {
                this.f77206e.mo111126a(this.f77205d.mo111119a().mo108769a(f), b.top, b.bottom);
            }
            mo111176b();
        }
    }

    /* renamed from: a */
    public void mo111173a(C31133b bVar, View view) {
        C30758b bVar2;
        FrameLayout.LayoutParams chipViewLayoutParams;
        if (bVar instanceof DayDragEndEvent) {
            DayDragEndEvent aVar = (DayDragEndEvent) bVar;
            this.f77212k = (int) (aVar.mo112753e() / ((float) m114543i()));
            this.f77203b = m114523a(aVar.mo111202a(), this.f77212k);
            this.f77202a.mo112790c(view);
            aVar.mo111204b().getChipsDataHandler().mo111347a(aVar.mo111202a());
            Log.m165389i("DragDelegate", C32673y.m125369a("enter full edit mode"));
            if (this.f77206e != null) {
                this.f77206e.mo111126a(this.f77205d.mo111119a().mo108769a(aVar.mo112755g()), aVar.mo111202a().mo110976i(), aVar.mo111202a().mo110979l());
            }
            if (this.f77207f != null && (bVar2 = this.f77204c) != null && (chipViewLayoutParams = bVar2.getChipViewLayoutParams()) != null) {
                long[] a = m114535a(chipViewLayoutParams, true);
                this.f77207f.mo111116a(a[0], a[1]);
            }
        }
    }

    /* renamed from: a */
    public void mo111165a(int i) {
        if (this.f77208g) {
            C30758b bVar = this.f77204c;
            if (!(bVar == null || i == 0)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.getLayoutParams();
                layoutParams.leftMargin += i;
                this.f77204c.setLayoutParams(layoutParams);
            }
            C30760d dVar = this.f77203b;
            if (dVar != null && i != 0) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
                layoutParams2.leftMargin += i;
                this.f77203b.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: a */
    private long[] m114535a(FrameLayout.LayoutParams layoutParams, boolean z) {
        int i = layoutParams.leftMargin;
        if (!z) {
            i = (this.f77212k * m114543i()) + layoutParams.leftMargin;
        }
        int a = this.f77216o + this.f77205d.mo111119a().mo108769a((float) i);
        CalendarDate moveToDayStart = new CalendarDate().setJulianDay(a).moveToDayStart();
        if (this.f77210i) {
            moveToDayStart = new CalendarDate(C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).setJulianDay(a).moveThisDateToDayStart();
        }
        long timeInSeconds = moveToDayStart.getTimeInSeconds();
        return new long[]{((long) this.f77205d.mo111119a().mo108770a(layoutParams.topMargin)) + timeInSeconds, timeInSeconds + ((long) this.f77205d.mo111119a().mo108770a(layoutParams.topMargin + layoutParams.height))};
    }

    /* renamed from: a */
    public void mo111169a(PiecesDragger bVar) {
        this.f77202a = bVar;
        m114540f();
    }

    /* renamed from: a */
    public void mo111168a(AbstractC30754a aVar) {
        this.f77205d = aVar;
    }

    /* renamed from: a */
    public void mo111172a(AbstractC30774e eVar) {
        this.f77206e = eVar;
    }

    /* renamed from: a */
    public void mo111170a(IOnAppendTimeSelected bVar) {
        this.f77207f = bVar;
    }

    /* renamed from: a */
    public void mo111171a(AbstractC30773d dVar) {
        this.f77218q = dVar;
    }

    /* renamed from: a */
    public void mo111175a(List<DayChipsLayer> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.f77214m.clear();
            this.f77214m.addAll(list);
        }
    }

    /* renamed from: j */
    private void m114544j() {
        AbstractC30766c cVar = this.f77220s;
        if (cVar != null) {
            cVar.mo111240a();
            this.f77220s = null;
        }
    }

    /* renamed from: d */
    public void mo111180d() {
        m114527a((C30760d) this.f77204c);
        this.f77204c = null;
        if (this.f77203b != null) {
            m114542h();
        }
    }

    /* renamed from: f */
    private void m114540f() {
        this.f77202a.mo112788b(this.f77213l);
        this.f77202a.mo112783a(C31138g.class, this.f77223v);
        this.f77202a.mo112783a(C31136e.class, this.f77225x);
        this.f77202a.mo112783a(C31133b.class, this.f77224w);
    }

    /* renamed from: g */
    private void m114541g() {
        this.f77220s.mo111242a(AbstractC30756a.class, this.f77201C);
        this.f77220s.mo111242a(AbstractC30762c.class, this.f77199A);
        this.f77220s.mo111242a(AbstractC30775f.class, this.f77227z);
        this.f77220s.mo111242a(AbstractC30774e.class, this.f77200B);
        this.f77220s.mo111242a(AbstractC30773d.class, this.f77218q);
    }

    /* renamed from: h */
    private void m114542h() {
        EventChipView eventChipView = this.f77203b.getEventChipView();
        FrameLayout.LayoutParams chipViewLayoutParams = this.f77203b.getChipViewLayoutParams();
        Log.m165389i("DragDelegate", C32673y.m125369a("save full drag"));
        m114529a(eventChipView);
        m114530a(eventChipView, chipViewLayoutParams);
        m114538b(eventChipView, chipViewLayoutParams);
        this.f77202a.mo111200b();
    }

    /* renamed from: i */
    private int m114543i() {
        if (this.f77214m.size() <= 0 || this.f77214m.get(0).getWidth() <= 0) {
            return 1;
        }
        return this.f77214m.get(0).getWidth();
    }

    /* renamed from: b */
    public void mo111176b() {
        C30758b bVar;
        FrameLayout.LayoutParams chipViewLayoutParams;
        if (this.f77207f != null && (bVar = this.f77204c) != null && (chipViewLayoutParams = bVar.getChipViewLayoutParams()) != null) {
            long[] a = m114535a(chipViewLayoutParams, true);
            this.f77207f.mo111116a(a[0], a[1]);
        }
    }

    /* renamed from: a */
    public void mo111166a(C30745a.AbstractC30746a aVar) {
        this.f77217p = aVar;
    }

    /* renamed from: b */
    public void mo111177b(int i) {
        this.f77221t = i;
    }

    /* renamed from: a */
    public void mo111167a(C30745a.AbstractC30747b bVar) {
        this.f77219r = bVar;
    }

    /* renamed from: c */
    public void mo111179c(int i) {
        this.f77216o = i;
    }

    /* renamed from: a */
    private boolean m114534a(View view) {
        if (view == null || view != this.f77213l) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m114539b(AbstractC31134c cVar) {
        C30758b bVar = this.f77204c;
        if (bVar != null) {
            cVar.mo112752a(bVar);
        } else {
            cVar.mo112752a(this.f77203b);
        }
    }

    /* renamed from: a */
    private void m114529a(EventChipView eventChipView) {
        eventChipView.setShowDragBorder(false);
        this.f77203b.removeView(eventChipView);
        m114527a(this.f77203b);
        this.f77203b = null;
    }

    /* renamed from: b */
    private void m114537b(View view) {
        C30758b bVar = this.f77204c;
        if (bVar != null && view != bVar && view != bVar.getBottomDragHandle() && view != this.f77204c.getTopDragHandle()) {
            m114527a((C30760d) this.f77204c);
            this.f77204c = null;
        }
    }

    /* renamed from: a */
    private void m114524a(Rect rect) {
        m114527a(this.f77204c);
        C30758b bVar = new C30758b(this.f77215n, this.f77222u);
        FrameLayout.LayoutParams a = bVar.mo111222a(rect.width(), rect.height(), rect.left, rect.top);
        bVar.setOnClickListener(new View.OnClickListener(bVar) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.$$Lambda$b$u4Lf1GLFpCRZmkrsV_S34ATg08 */
            public final /* synthetic */ C30758b f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C30748b.m270302lambda$u4Lf1GLFpCRZmkrsV_S34ATg08(C30748b.this, this.f$1, view);
            }
        });
        m114528a(bVar, a);
        this.f77204c = bVar;
    }

    /* renamed from: a */
    private void m114525a(DayDragEndEvent aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.mo112759k().getLayoutParams();
        int i = layoutParams.leftMargin / m114543i();
        this.f77212k = i;
        if (i < this.f77214m.size()) {
            layoutParams.leftMargin %= m114543i();
            DayChipsLayer b = aVar.mo111204b();
            DayChipsLayer dayChipsLayer = this.f77214m.get(this.f77212k);
            DragDrawChipViewData a = aVar.mo111202a();
            b.getChipsDataHandler().mo111351b(a);
            dayChipsLayer.getChipsDataHandler().mo111348a(a, -1, -1, 0, layoutParams.topMargin);
            aVar.mo111203a(dayChipsLayer);
        }
    }

    /* renamed from: a */
    private void m114527a(C30760d dVar) {
        PiecesDragger bVar;
        if (!(dVar == null || (bVar = this.f77202a) == null)) {
            bVar.mo112790c(dVar);
            this.f77202a.mo112790c(dVar.getTopDragHandle());
            this.f77202a.mo112790c(dVar.getBottomDragHandle());
            this.f77213l.removeView(dVar);
        }
        AbstractC30774e eVar = this.f77206e;
        if (eVar != null) {
            eVar.mo111125a();
        }
        IOnAppendTimeSelected bVar2 = this.f77207f;
        if (bVar2 != null) {
            bVar2.mo111115a();
        }
    }

    /* renamed from: a */
    private C30760d m114523a(DragDrawChipViewData eVar, int i) {
        int k = eVar.mo110978k() - eVar.mo110977j();
        int l = eVar.mo110979l() - eVar.mo110976i();
        int i2 = (i * m114543i()) + eVar.mo110977j();
        int i3 = eVar.mo110976i();
        C30760d dVar = new C30760d(this.f77215n, eVar);
        m114528a(dVar, dVar.mo111222a(k, l, i2, i3));
        Log.m165389i("DragDelegate", C32673y.m125369a("enter normal edit mode"));
        return dVar;
    }

    /* renamed from: b */
    private Rect m114536b(float f, float f2) {
        Rect b = this.f77205d.mo111119a().mo108777b(f, f2);
        b.set(b.left, b.top, b.right, b.top + Math.round(((float) b.height()) * (((float) this.f77221t) / 60.0f)));
        if (b.isEmpty()) {
            return null;
        }
        return b;
    }

    C30748b(Context context, C30745a aVar) {
        this.f77213l = aVar;
        this.f77215n = context;
    }

    /* renamed from: b */
    private void m114538b(EventChipView eventChipView, FrameLayout.LayoutParams layoutParams) {
        if (this.f77219r != null) {
            EventChipViewData viewData = eventChipView.getViewData();
            long[] a = m114535a(layoutParams, false);
            long durationMinutes = viewData.getDurationMinutes();
            long j = a[1] - a[0];
            if (durationMinutes < 30 && j <= 1800) {
                a[1] = a[0] + (durationMinutes * 60);
            }
            this.f77219r.mo111123a(viewData.getCalendarEventInstance(), a[0], a[1]);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m114526a(C30758b bVar, View view) {
        Log.m165389i("DragDelegate", C32673y.m125369a("days add"));
        if (this.f77217p != null) {
            this.f77217p.mo111124a(EditActivityEntrance.m118928a(view.getContext(), m114535a(bVar.getChipViewLayoutParams(), true)));
            if (this.f77209h) {
                m114527a((C30760d) bVar);
                this.f77204c = null;
            }
        }
    }

    /* renamed from: a */
    private void m114528a(C30760d dVar, FrameLayout.LayoutParams layoutParams) {
        if (dVar != null) {
            dVar.setClickable(true);
            this.f77213l.addView(dVar, layoutParams);
            this.f77202a.mo112782a(dVar.getTopDragHandle(), DragTargetOptionBuilder.m114600a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
            this.f77202a.mo112782a(dVar.getBottomDragHandle(), DragTargetOptionBuilder.m114600a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
            this.f77202a.mo112782a(dVar, DragTargetOptionBuilder.m114600a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
        }
    }

    /* renamed from: a */
    private void m114530a(EventChipView eventChipView, FrameLayout.LayoutParams layoutParams) {
        DayChipsLayer dayChipsLayer;
        this.f77212k = layoutParams.leftMargin / m114543i();
        DragDrawChipViewData dayData = eventChipView.getDayData();
        int i = this.f77212k;
        if (i < 0 || i >= this.f77214m.size()) {
            dayChipsLayer = null;
        } else {
            dayChipsLayer = this.f77214m.get(this.f77212k);
            layoutParams.leftMargin %= m114543i();
        }
        if (dayChipsLayer == null) {
            EventBus.getDefault().trigger(new C32493l());
            Log.m165383e("DragDelegate", "leftMargin = " + layoutParams.leftMargin + " mDayChipsWidth = " + m114543i() + " mDayChipsLayerList,size = " + this.f77214m.size());
            return;
        }
        dayChipsLayer.getChipsDataHandler().mo111348a(dayData, layoutParams.width, layoutParams.height, 0, layoutParams.topMargin);
    }
}
