package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class PDFThumbnailSlider extends FrameLayout {

    /* renamed from: a */
    public static final int f20075a = C13749l.m55738a(8);

    /* renamed from: b */
    public PDFVerticalSliderBar f20076b;

    /* renamed from: c */
    public FrameLayout f20077c;

    /* renamed from: d */
    public ImageView f20078d;

    /* renamed from: e */
    public TextView f20079e;

    /* renamed from: f */
    public int f20080f;

    /* renamed from: g */
    public IPDFPageLoader f20081g;

    /* renamed from: h */
    public int f20082h = -1;

    /* renamed from: i */
    public AbstractC7457a f20083i;

    /* renamed from: j */
    private FrameLayout f20084j;

    /* renamed from: k */
    private SizeF f20085k;

    /* renamed from: l */
    private final int f20086l = C7473f.m29883a();

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider$a */
    public interface AbstractC7457a {
        /* renamed from: a */
        void mo29054a();

        /* renamed from: a */
        void mo29055a(int i);

        /* renamed from: b */
        void mo29056b(int i);
    }

    public void setViewDelegate(AbstractC7457a aVar) {
        this.f20083i = aVar;
    }

    public void setCurrentIndicator(int i) {
        PDFVerticalSliderBar pDFVerticalSliderBar = this.f20076b;
        if (pDFVerticalSliderBar != null && pDFVerticalSliderBar.getCurrentIndicatorPage() != i) {
            this.f20076b.setCurrentIndicatorPage(i);
        }
    }

    /* renamed from: a */
    public void mo29067a(int i) {
        C7473f.m29885a(this.f20084j, this.f20086l);
        SizeF sizeF = this.f20085k;
        if (sizeF != null) {
            SizeF a = C7473f.m29884a(this.f20084j, sizeF);
            this.f20081g.mo29109a(this.f20078d, new IPDFPageLoader.LoadConfig(i, (int) a.getWidth(), (int) a.getHeight(), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), false, false));
        }
    }

    /* renamed from: b */
    public void mo29071b(boolean z) {
        C13479a.m54764b("PDFThumbnailSlider", "slider hide, isAnimate=" + z);
        clearAnimation();
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.drive_thumbslider_slide_out_bottom);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.animationAnimation$AnimationListenerC74563 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    PDFThumbnailSlider.this.setVisibility(8);
                    C13479a.m54764b("PDFThumbnailSlider", "slider hide, anim end setVisibility gone");
                }
            });
            startAnimation(loadAnimation);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: a */
    private void m29796a(Context context) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.controls_thumbnail_slider_thumbview);
        this.f20077c = frameLayout;
        this.f20078d = (ImageView) frameLayout.findViewById(R.id.drive_controls_thumbnail_slider_thumbview_thumb);
        this.f20084j = (FrameLayout) this.f20077c.findViewById(R.id.thumbview_thumb_layout);
        this.f20079e = (TextView) this.f20077c.findViewById(R.id.drive_controls_thumbnail_slider_thumbview_pagenumber);
        PDFVerticalSliderBar pDFVerticalSliderBar = (PDFVerticalSliderBar) findViewById(R.id.drive_pdf_indicator_slider);
        this.f20076b = pDFVerticalSliderBar;
        pDFVerticalSliderBar.setMaxPageCount(this.f20080f);
        this.f20076b.setSeekListener(new PDFVerticalSliderBar.AbstractC7461a() {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.C74541 */

            /* renamed from: a */
            int f20087a;

            /* renamed from: b */
            boolean f20088b;

            /* renamed from: c */
            boolean f20089c;

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar.AbstractC7461a
            /* renamed from: b */
            public void mo29077b() {
                m29802c();
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar.AbstractC7461a
            /* renamed from: a */
            public void mo29074a() {
                C13479a.m54764b("PDFThumbnailSlider", "onStartTrackingTouch() mCurrentPage=" + PDFThumbnailSlider.this.f20082h);
                this.f20089c = false;
            }

            /* renamed from: c */
            private void m29802c() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PDFThumbnailSlider.this.f20077c.getLayoutParams();
                layoutParams.topMargin = (int) (PDFThumbnailSlider.this.f20076b.getIndicatorPercent() * ((float) PDFThumbnailSlider.this.getHeight()));
                int height = (int) (((float) (PDFThumbnailSlider.this.f20077c.getHeight() - PDFThumbnailSlider.this.f20078d.getHeight())) / 2.0f);
                layoutParams.topMargin = (int) ((((float) layoutParams.topMargin) - (((float) PDFThumbnailSlider.this.f20077c.getHeight()) / 2.0f)) + (((float) PDFThumbnailSlider.this.f20076b.getIndicatorHeight()) / 2.0f));
                int i = -height;
                if (layoutParams.topMargin < i) {
                    layoutParams.topMargin = i;
                } else if (layoutParams.topMargin >= (PDFThumbnailSlider.this.getHeight() - PDFThumbnailSlider.this.f20077c.getHeight()) + height) {
                    layoutParams.topMargin = (PDFThumbnailSlider.this.getHeight() - PDFThumbnailSlider.this.f20077c.getHeight()) + height;
                }
                PDFThumbnailSlider.this.f20077c.setLayoutParams(layoutParams);
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar.AbstractC7461a
            /* renamed from: a */
            public void mo29075a(int i) {
                PDFThumbnailSlider.this.f20082h = i;
                C13479a.m54764b("PDFThumbnailSlider", "onStopTrackingTouch() mCurrentPage=" + PDFThumbnailSlider.this.f20082h);
                this.f20089c = true;
                PDFThumbnailSlider.this.f20077c.setVisibility(8);
                PDFThumbnailSlider.this.f20081g.mo29111c();
                if (PDFThumbnailSlider.this.f20083i != null) {
                    PDFThumbnailSlider.this.f20083i.mo29055a(PDFThumbnailSlider.this.f20082h);
                }
                PDFThumbnailSlider.this.setBackgroundDrawable(null);
                this.f20088b = false;
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar.AbstractC7461a
            /* renamed from: a */
            public void mo29076a(int i, int i2, boolean z) {
                C13479a.m54764b("PDFThumbnailSlider", "onProgressChanged() currentIndicator=" + i2 + ", fromUser=" + z + ", dy=" + i);
                int i3 = PDFThumbnailSlider.this.f20082h;
                PDFThumbnailSlider.this.f20082h = i2;
                TextView textView = PDFThumbnailSlider.this.f20079e;
                textView.setText((i2 + 1) + "/" + PDFThumbnailSlider.this.f20080f);
                if (i3 != PDFThumbnailSlider.this.f20082h) {
                    PDFThumbnailSlider pDFThumbnailSlider = PDFThumbnailSlider.this;
                    pDFThumbnailSlider.mo29067a(pDFThumbnailSlider.f20082h);
                }
                if (z && ((PDFThumbnailSlider.this.f20082h != this.f20087a || Math.abs(i) > PDFThumbnailSlider.f20075a) && !this.f20088b && !this.f20089c)) {
                    C13479a.m54764b("PDFThumbnailSlider", "onProgressChanged() show alpha bg.");
                    PDFThumbnailSlider.this.f20077c.setVisibility(0);
                    if (PDFThumbnailSlider.this.f20083i != null) {
                        PDFThumbnailSlider.this.f20083i.mo29054a();
                    }
                    PDFThumbnailSlider.this.setBackgroundColor(C25653b.m91893a(PDFThumbnailSlider.this.getResources().getColor(R.color.space_kit_n1000), 0.3f));
                    m29802c();
                    this.f20088b = true;
                } else if (PDFThumbnailSlider.this.f20083i != null) {
                    PDFThumbnailSlider.this.f20083i.mo29056b(PDFThumbnailSlider.this.f20082h);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo29069a(boolean z) {
        C13479a.m54764b("PDFThumbnailSlider", "slider show, isAnimate=" + z);
        clearAnimation();
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.drive_thumbslider_slide_in_bottom);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailSlider.animationAnimation$AnimationListenerC74552 */

                public void onAnimationEnd(Animation animation) {
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                    PDFThumbnailSlider.this.setVisibility(0);
                    C13479a.m54764b("PDFThumbnailSlider", "slider show, anim end setVisibility VISIBLE");
                }
            });
            setVisibility(4);
            startAnimation(loadAnimation);
            return;
        }
        setVisibility(0);
    }

    public PDFThumbnailSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.drive_controls_thumbnail_slider, this);
    }

    /* renamed from: a */
    public void mo29070a(boolean z, boolean z2) {
        if (z) {
            mo29069a(z2);
        } else {
            mo29071b(z2);
        }
    }

    /* renamed from: a */
    public void mo29068a(int i, SizeF sizeF, IPDFPageLoader aVar) {
        this.f20080f = i;
        this.f20085k = sizeF;
        this.f20081g = aVar;
        m29796a(getContext());
    }
}
