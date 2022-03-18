package com.bytedance.ee.bear.sheet.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SheetDragView extends CommonActionPanelLayout implements C7728a.AbstractC7730a {

    /* renamed from: c */
    private AbstractC11085a f29771c;

    /* renamed from: d */
    private AbstractC11086b f29772d;

    /* renamed from: e */
    private AbstractC11087c f29773e;

    /* renamed from: f */
    private C7728a f29774f;

    /* renamed from: g */
    private float f29775g;

    /* renamed from: h */
    private float f29776h;

    /* renamed from: i */
    private float f29777i;

    /* renamed from: j */
    private C11088a f29778j;

    /* renamed from: k */
    private boolean f29779k;

    /* renamed from: l */
    private String f29780l;

    /* renamed from: m */
    private String f29781m;

    /* renamed from: com.bytedance.ee.bear.sheet.common.SheetDragView$a */
    public interface AbstractC11085a {
        void onDragViewClose();
    }

    /* renamed from: com.bytedance.ee.bear.sheet.common.SheetDragView$b */
    public interface AbstractC11086b {
        /* renamed from: a */
        void mo42252a(int i);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.common.SheetDragView$c */
    public interface AbstractC11087c {
        /* renamed from: a */
        void mo42253a();

        /* renamed from: b */
        void mo42254b();
    }

    /* renamed from: c */
    public boolean mo42245c() {
        return this.f29774f.mo30267m();
    }

    /* renamed from: e */
    private void m46073e() {
        this.f29778j = new C11088a();
        this.f29779k = true;
        this.f29781m = "";
    }

    /* renamed from: a */
    public void mo17963a() {
        this.f29774f.mo30265k();
        this.f29779k = false;
    }

    /* renamed from: b */
    public void mo42244b() {
        this.f29774f.mo30266l();
        this.f29779k = false;
    }

    /* renamed from: d */
    private void m46072d() {
        this.f29775g = BitmapDescriptorFactory.HUE_RED;
        this.f29776h = (float) getContext().getResources().getDimensionPixelSize(R.dimen.sheet_panel_dragview_height);
        this.f29777i = ((float) C13749l.m55748b()) * 0.85f;
        C7728a aVar = new C7728a(getContext(), this, this.f29775g, this.f29776h, this.f29777i);
        this.f29774f = aVar;
        aVar.mo30252a(getTopBar());
        this.f29774f.mo30253a((C7728a.AbstractC7730a) this);
        getDragHandler().setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.common.$$Lambda$SheetDragView$LBlT0dsxLRmdwVbBB_N4Yp4dYsk */

            public final void onClick(View view) {
                SheetDragView.this.m46070a((SheetDragView) view);
            }
        });
    }

    public void setOnCloseListener(AbstractC11085a aVar) {
        this.f29771c = aVar;
    }

    public void setOnHeightChangeListener(AbstractC11086b bVar) {
        this.f29772d = bVar;
    }

    public void setOnPositionChangeListener(AbstractC11087c cVar) {
        this.f29773e = cVar;
    }

    public void setSource(String str) {
        this.f29780l = str;
    }

    public SheetDragView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46070a(View view) {
        this.f29774f.mo30249a(BitmapDescriptorFactory.HUE_RED);
    }

    public void setDocumentUrl(BearUrl bearUrl) {
        this.f29778j.mo42260a(bearUrl);
    }

    @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout
    public void setSlideView(View view) {
        if (view != null) {
            this.f29774f.mo30252a(view);
        }
    }

    /* renamed from: a */
    private void m46071a(String str) {
        if (!this.f29781m.equals(str)) {
            this.f29781m = str;
            if (this.f29779k) {
                this.f29778j.mo42263a(this.f29780l, str);
            } else {
                this.f29779k = true;
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
    public void onHeightChange(int i) {
        AbstractC11086b bVar = this.f29772d;
        if (bVar != null) {
            bVar.mo42252a(i);
        }
        if (i == 0) {
            m46071a("close");
            AbstractC11085a aVar = this.f29771c;
            if (aVar != null) {
                aVar.onDragViewClose();
                return;
            }
            return;
        }
        float f = (float) i;
        if (Math.abs(f - this.f29776h) < 1.0f) {
            m46071a("mid");
            AbstractC11087c cVar = this.f29773e;
            if (cVar != null) {
                cVar.mo42253a();
            }
        } else if (Math.abs(f - this.f29777i) < 1.0f) {
            m46071a("max");
            AbstractC11087c cVar2 = this.f29773e;
            if (cVar2 != null) {
                cVar2.mo42254b();
            }
        }
    }

    public SheetDragView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SheetDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m46072d();
        m46073e();
    }
}
