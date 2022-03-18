package com.bytedance.ee.bear.slide.common.export;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.slide.common.export.p551a.C11395b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.File;
import java.util.List;

public class SlideExportView extends RelativeLayout implements AbstractC11403b {

    /* renamed from: a */
    public AbstractC11392a f30601a;

    /* renamed from: b */
    private BaseTitleBar f30602b;

    /* renamed from: c */
    private AppCompatImageView f30603c;

    /* renamed from: d */
    private TextView f30604d;

    /* renamed from: e */
    private ImageView f30605e;

    /* renamed from: f */
    private ImageView f30606f;

    /* renamed from: g */
    private LinearLayout f30607g;

    /* renamed from: h */
    private LinearLayout f30608h;

    /* renamed from: i */
    private ImageView f30609i;

    /* renamed from: j */
    private RecyclerView f30610j;

    /* renamed from: k */
    private SmartRefreshLayout f30611k;

    /* renamed from: l */
    private ProgressBar f30612l;

    /* renamed from: m */
    private C11395b f30613m;

    /* renamed from: n */
    private Context f30614n;

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: d */
    public void mo43620d() {
        this.f30612l.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: a */
    public void mo43616a() {
        this.f30601a.mo43629a();
        this.f30612l.setVisibility(0);
    }

    /* renamed from: f */
    private void m47303f() {
        this.f30602b.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportView$8sO12bC50J1IpQR_E4FXKSbjs */

            public final void onClick(View view) {
                SlideExportView.m269973lambda$8sO12bC50J1IpQR_E4FXKSbjs(SlideExportView.this, view);
            }
        });
        this.f30605e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportView$qSll7_v88tWn2B3wY8dYhPYvaGg */

            public final void onClick(View view) {
                SlideExportView.lambda$qSll7_v88tWn2B3wY8dYhPYvaGg(SlideExportView.this, view);
            }
        });
        this.f30606f.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportView$KBDddt_3eOvfz6cI990H8UWeLQ */

            public final void onClick(View view) {
                SlideExportView.m269974lambda$KBDddt_3eOvfz6cI990H8UWeLQ(SlideExportView.this, view);
            }
        });
    }

    /* renamed from: g */
    private void m47304g() {
        clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f30614n, R.anim.translate_from_bottom_in);
        setAnimation(loadAnimation);
        loadAnimation.setDuration(500);
        loadAnimation.start();
    }

    /* renamed from: h */
    private void m47305h() {
        clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f30614n, R.anim.translate_top_to_bottom);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.bytedance.ee.bear.slide.common.export.SlideExportView.animationAnimation$AnimationListenerC113911 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                if (SlideExportView.this.f30601a != null) {
                    SlideExportView.this.f30601a.mo43633e();
                }
            }
        });
        setAnimation(loadAnimation);
        loadAnimation.start();
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: b */
    public void mo43618b() {
        Toast.showFailureText(this.f30614n, getResources().getString(R.string.Doc_Doc_ShotOpertUnsupport), 0);
        AbstractC11392a aVar = this.f30601a;
        if (aVar != null) {
            aVar.mo43632d();
            m47305h();
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: c */
    public boolean mo43619c() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: e */
    public void mo43621e() {
        this.f30609i.setVisibility(0);
        this.f30612l.setVisibility(8);
        this.f30604d.setText(getResources().getString(R.string.Slide_Slide_Export_Failed));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30614n = C13615c.f35773a;
        BaseTitleBar baseTitleBar = (BaseTitleBar) findViewById(R.id.slide_export_title);
        this.f30602b = baseTitleBar;
        baseTitleBar.setTitle(this.f30614n.getString(R.string.Slide_Slide_Export));
        this.f30602b.getLeftImage().setVisibility(8);
        this.f30602b.setMainTitleSize(17.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.space_kit_len_12), 0, 0, 0);
        this.f30602b.mo45080a(this.f30614n.getString(R.string.Slide_Slide_Cancel), layoutParams);
        this.f30603c = (AppCompatImageView) findViewById(R.id.slide_preview_image);
        this.f30604d = (TextView) findViewById(R.id.slide_export_progress_text);
        this.f30612l = (ProgressBar) findViewById(R.id.slide_export_progressbar);
        this.f30609i = (ImageView) findViewById(R.id.slide_export_error_icon);
        this.f30611k = (SmartRefreshLayout) findViewById(R.id.slide_export_long_picture_container);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.slide_bitmaps_recycler_view);
        this.f30610j = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f30610j.setHasFixedSize(true);
        C11395b bVar = new C11395b(this.f30614n);
        this.f30613m = bVar;
        this.f30610j.setAdapter(bVar);
        this.f30607g = (LinearLayout) findViewById(R.id.slide_export_loading_container);
        this.f30608h = (LinearLayout) findViewById(R.id.slide_export_share_and_download_container);
        this.f30605e = (ImageView) findViewById(R.id.slide_export_share_image_view);
        this.f30606f = (ImageView) findViewById(R.id.slide_export_download_image_view);
        int e = C13749l.m55760e(getContext()) - C13749l.m55738a((int) SmEvents.EVENT_RS);
        this.f30603c.setLayoutParams(new FrameLayout.LayoutParams(e, (int) (((double) e) * 0.5652d)));
        ((RelativeLayout.LayoutParams) this.f30607g.getLayoutParams()).setMargins(0, ((int) (((double) (C13749l.m55762f(getContext()) - C13746i.m55722a(getContext()))) * 0.3d)) - (this.f30603c.getHeight() / 2), 0, 0);
        m47303f();
    }

    /* renamed from: a */
    private void m47299a(Context context) {
        this.f30614n = context;
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    public void setPresenter(C11410f fVar) {
        this.f30601a = fVar;
    }

    public SlideExportView(Context context) {
        super(context);
        m47299a(context);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47300a(View view) {
        AbstractC11392a aVar = this.f30601a;
        if (aVar != null) {
            aVar.mo43631c();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m47301b(View view) {
        AbstractC11392a aVar = this.f30601a;
        if (aVar != null) {
            aVar.mo43630b();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m47302c(View view) {
        AbstractC11392a aVar = this.f30601a;
        if (aVar != null) {
            aVar.mo43632d();
            m47305h();
        }
    }

    private void setImageBitmap(List<Bitmap> list) {
        this.f30613m.mo43641a();
        this.f30613m.mo43643a(list);
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    public void setPreviewImage(String str) {
        ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(new C13664a(str)).mo10399a((ImageView) this.f30603c);
    }

    public SlideExportView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.ee.bear.slide.common.export.AbstractC11403b
    /* renamed from: a */
    public void mo43617a(File file, List<Bitmap> list) {
        if (file == null || list == null) {
            C13479a.m54764b("SlideExportView", "onExportFail()...");
            mo43621e();
            return;
        }
        C13479a.m54764b("SlideExportView", "onExportLongPictureSuccess()... success");
        this.f30607g.setVisibility(8);
        this.f30608h.setVisibility(0);
        this.f30602b.getLeftText().setVisibility(8);
        this.f30602b.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        this.f30602b.getLeftImage().setVisibility(0);
        this.f30611k.setVisibility(0);
        setImageBitmap(list);
        m47304g();
    }

    public SlideExportView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
