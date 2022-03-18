package com.bytedance.ee.bear.fileselector.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class FilePanelDragView extends CommonActionPanelLayout implements C7728a.AbstractC7730a {

    /* renamed from: c */
    private AbstractC7794a f21082c;

    /* renamed from: d */
    private AbstractC7795b f21083d;

    /* renamed from: e */
    private AbstractC7796c f21084e;

    /* renamed from: f */
    private C7728a f21085f;

    /* renamed from: g */
    private float f21086g;

    /* renamed from: h */
    private float f21087h;

    /* renamed from: i */
    private float f21088i;

    /* renamed from: j */
    private boolean f21089j;

    /* renamed from: k */
    private String f21090k;

    /* renamed from: com.bytedance.ee.bear.fileselector.view.FilePanelDragView$a */
    public interface AbstractC7794a {
        /* renamed from: a */
        void mo30542a();
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.view.FilePanelDragView$b */
    public interface AbstractC7795b {
        /* renamed from: a */
        void mo30427a(int i);
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.view.FilePanelDragView$c */
    public interface AbstractC7796c {
        /* renamed from: a */
        void mo30543a();

        /* renamed from: b */
        void mo30544b();
    }

    /* renamed from: a */
    public void mo17963a() {
        this.f21085f.mo30266l();
        this.f21089j = false;
    }

    /* renamed from: b */
    private void m31239b() {
        this.f21086g = BitmapDescriptorFactory.HUE_RED;
        this.f21087h = (float) getContext().getResources().getDimensionPixelSize(R.dimen.file_panel_dragview_height);
        this.f21088i = ((float) C13749l.m55748b()) * 0.85f;
        C7728a aVar = new C7728a(getContext(), this, this.f21086g, this.f21087h, this.f21088i);
        this.f21085f = aVar;
        aVar.mo30252a(getTopBar());
        this.f21085f.mo30253a((C7728a.AbstractC7730a) this);
        getDragHandler().setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.fileselector.view.$$Lambda$FilePanelDragView$q4Z_rtdpkrNaunMKQWzi__ewf0 */

            public final void onClick(View view) {
                FilePanelDragView.this.m31238a((FilePanelDragView) view);
            }
        });
    }

    public void setOnCloseListener(AbstractC7794a aVar) {
        this.f21082c = aVar;
    }

    public void setOnHeightChangeListener(AbstractC7795b bVar) {
        this.f21083d = bVar;
    }

    public void setOnPositionChangeListener(AbstractC7796c cVar) {
        this.f21084e = cVar;
    }

    public void setSource(String str) {
        this.f21090k = str;
    }

    public FilePanelDragView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m31238a(View view) {
        this.f21085f.mo30249a(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout
    public void setSlideView(View view) {
        if (view != null) {
            this.f21085f.mo30252a(view);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
    public void onHeightChange(int i) {
        AbstractC7796c cVar;
        AbstractC7795b bVar = this.f21083d;
        if (bVar != null) {
            bVar.mo30427a(i);
        }
        if (i == 0) {
            AbstractC7794a aVar = this.f21082c;
            if (aVar != null) {
                aVar.mo30542a();
                return;
            }
            return;
        }
        float f = (float) i;
        if (Math.abs(f - this.f21087h) < 1.0f) {
            AbstractC7796c cVar2 = this.f21084e;
            if (cVar2 != null) {
                cVar2.mo30543a();
            }
        } else if (Math.abs(f - this.f21088i) < 1.0f && (cVar = this.f21084e) != null) {
            cVar.mo30544b();
        }
    }

    public FilePanelDragView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilePanelDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31239b();
    }
}
