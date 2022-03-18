package com.bytedance.ee.bear.drive.view.preview.pdf.presentationview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bytedance.ee.bear.drive.common.C6883a;
import com.bytedance.ee.bear.drive.view.preview.pdf.C7414b;
import com.bytedance.ee.bear.drive.view.widget.RecyclingImageView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.Observable;

public class PdfPresentationView extends FrameLayout {

    /* renamed from: a */
    public View f19976a;

    /* renamed from: b */
    public AbstractC7419c f19977b;

    /* renamed from: c */
    public int f19978c;

    /* renamed from: d */
    private TextView f19979d;

    /* renamed from: e */
    private RecyclingImageView f19980e;

    /* renamed from: f */
    private View f19981f;

    /* renamed from: g */
    private GestureDetector f19982g;

    /* renamed from: h */
    private AbstractC7418b f19983h;

    /* renamed from: i */
    private int f19984i;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView$b */
    public interface AbstractC7418b {
        void onBackClick(View view);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView$c */
    public interface AbstractC7419c {
        /* renamed from: a */
        void mo28967a(C7417a aVar);
    }

    /* renamed from: a */
    public Observable<C7417a> mo28961a() {
        return C7421a.m29698a(this);
    }

    /* renamed from: b */
    private void m29692b() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_pdf_presentation_view, this);
        this.f19976a = findViewById(R.id.presentation_nav_bar);
        this.f19980e = (RecyclingImageView) findViewById(R.id.page_view);
        this.f19981f = findViewById(R.id.back_view);
        this.f19979d = (TextView) findViewById(R.id.indicator_view);
        this.f19982g = new GestureDetector(getContext(), new C7420d());
        this.f19981f.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.$$Lambda$PdfPresentationView$upqj1mX_V7N2vGBNKS6X4mwHTfk */

            public final void onClick(View view) {
                PdfPresentationView.this.m29691a(view);
            }
        });
    }

    public void setBackClickListener(AbstractC7418b bVar) {
        this.f19983h = bVar;
    }

    public void setFlingListener(AbstractC7419c cVar) {
        this.f19977b = cVar;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView$a */
    public static final class C7417a {

        /* renamed from: a */
        public final int f19985a;

        /* renamed from: b */
        public final int f19986b;

        /* renamed from: a */
        static C7417a m29695a(int i) {
            return new C7417a(i, 1);
        }

        /* renamed from: b */
        static C7417a m29696b(int i) {
            return new C7417a(i, 0);
        }

        C7417a(int i, int i2) {
            this.f19985a = i;
            this.f19986b = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView$d */
    public class C7420d extends GestureDetector.SimpleOnGestureListener {
        private C7420d() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (PdfPresentationView.this.f19976a.getVisibility() != 0) {
                C6883a.m27200b(PdfPresentationView.this.f19976a);
                return true;
            }
            C6883a.m27202c(PdfPresentationView.this.f19976a);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent.getX() - motionEvent2.getX() > 200.0f || motionEvent.getY() - motionEvent2.getY() > 200.0f) {
                C13479a.m54772d("PdfPresentationView", "next fling. ");
                if (PdfPresentationView.this.f19977b != null) {
                    C6883a.m27202c(PdfPresentationView.this.f19976a);
                    PdfPresentationView.this.f19977b.mo28967a(C7417a.m29695a(PdfPresentationView.this.f19978c));
                }
                return true;
            } else if (motionEvent2.getX() - motionEvent.getX() <= 200.0f && motionEvent2.getY() - motionEvent.getY() <= 200.0f) {
                return false;
            } else {
                C13479a.m54772d("PdfPresentationView", "last fling. ");
                if (PdfPresentationView.this.f19977b != null) {
                    C6883a.m27202c(PdfPresentationView.this.f19976a);
                    PdfPresentationView.this.f19977b.mo28967a(C7417a.m29696b(PdfPresentationView.this.f19978c));
                }
                return true;
            }
        }
    }

    public PdfPresentationView(Context context) {
        super(context);
        m29692b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29691a(View view) {
        AbstractC7418b bVar = this.f19983h;
        if (bVar != null) {
            bVar.onBackClick(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f19982g.onTouchEvent(motionEvent);
        return true;
    }

    public PdfPresentationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29692b();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view != this) {
            return;
        }
        if (i == 0) {
            this.f19976a.setVisibility(4);
        } else {
            C6883a.m27194a(this.f19976a);
        }
    }

    public PdfPresentationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29692b();
    }

    /* renamed from: a */
    public void mo28962a(int i, int i2, C7414b.C7415a aVar, AbstractC2283e eVar) {
        if (aVar.mo28955a()) {
            this.f19984i = i;
            this.f19978c = i2;
            this.f19979d.setText(String.format("%s/%s", Integer.valueOf(i2), Integer.valueOf(i)));
            C13479a.m54764b("PdfPresentationView", "setIndexPage, width: " + aVar.mo28959e() + "height: " + aVar.mo28957c());
            this.f19980e.mo29686a(aVar.mo28956b(), eVar);
        }
    }
}
