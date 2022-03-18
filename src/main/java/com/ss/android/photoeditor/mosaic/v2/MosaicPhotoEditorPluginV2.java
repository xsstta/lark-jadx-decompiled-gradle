package com.ss.android.photoeditor.mosaic.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.graffiti.ShowTipsSeekBarLinearLayout;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import com.ss.android.photoeditor.mosaic.p3011a.C59739b;
import com.ss.android.photoeditor.mosaic.v2.MosaicViewV2;
import com.ss.android.photoeditor.p3010b.C59613d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class MosaicPhotoEditorPluginV2 extends RelativeLayout implements AbstractC59637h {

    /* renamed from: g */
    private static final int f148409g = C59613d.m231216a(2);

    /* renamed from: h */
    private static final int f148410h = C59613d.m231216a(10);

    /* renamed from: a */
    public ImageView f148411a;

    /* renamed from: b */
    public RadioGroup f148412b;

    /* renamed from: c */
    public MosaicViewV2 f148413c;

    /* renamed from: d */
    public ShowTipsSeekBarLinearLayout f148414d;

    /* renamed from: e */
    public AbstractMosaicStrategy f148415e;

    /* renamed from: f */
    public AlphaAnimShowHideViewHelper f148416f;

    /* renamed from: i */
    private ImageView f148417i;

    /* renamed from: j */
    private RadioButton f148418j;

    /* renamed from: k */
    private RadioButton f148419k;

    /* renamed from: l */
    private View f148420l;

    /* renamed from: m */
    private Map<ImageView, AbstractMosaicStrategy> f148421m;

    /* renamed from: n */
    private int f148422n;

    /* renamed from: o */
    private AbstractC59637h.AbstractC59638a f148423o;

    /* renamed from: p */
    private C59764d f148424p;

    /* renamed from: q */
    private View.OnClickListener f148425q = new View.OnClickListener() {
        /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.View$OnClickListenerC597451 */

        public void onClick(View view) {
            MosaicPhotoEditorPluginV2.this.setMosaicType((ImageView) view);
        }
    };

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: f */
    public boolean mo203146f() {
        return true;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public View getEditView() {
        return this;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: d */
    public void mo203144d() {
        this.f148413c.mo203427d();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: e */
    public void mo203145e() {
        this.f148413c.mo203428e();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public RectF getLocation() {
        return this.f148413c.getLocation();
    }

    /* renamed from: l */
    private void m231734l() {
        this.f148416f = new AlphaAnimShowHideViewHelper(this.f148420l);
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: b */
    public void mo203142b() {
        MosaicViewV2 mosaicViewV2 = this.f148413c;
        if (mosaicViewV2 != null) {
            mosaicViewV2.mo203429f();
        }
        C59764d dVar = this.f148424p;
        if (dVar != null) {
            dVar.mo203457d();
        }
    }

    /* renamed from: j */
    public void mo203408j() {
        LKUIToast.show(getContext(), (int) R.string.Lark_ASL_OCRFail);
        this.f148424p.mo203457d();
    }

    /* renamed from: k */
    private void m231733k() {
        m231736n();
        m231735m();
        m231734l();
        this.f148424p = new C59764d(getContext());
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203140a() {
        this.f148423o.mo203151a().setVisibility(0);
        this.f148423o.mo203153b().setVisibility(0);
        this.f148413c.mo203423a(new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.RunnableC597462 */

            public void run() {
                MosaicPhotoEditorPluginV2 mosaicPhotoEditorPluginV2 = MosaicPhotoEditorPluginV2.this;
                mosaicPhotoEditorPluginV2.setMosaicType(mosaicPhotoEditorPluginV2.f148411a);
                MosaicPhotoEditorPluginV2.this.f148414d.setProgress(50);
                MosaicPhotoEditorPluginV2.this.setPaintSizeByProgress(50);
                if (!MosaicPhotoEditorPluginV2.this.mo203405g()) {
                    MosaicPhotoEditorPluginV2.this.f148412b.setVisibility(8);
                }
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: c */
    public void mo203143c() {
        this.f148423o.mo203153b().setVisibility(0);
        this.f148423o.mo203151a().setVisibility(0);
        this.f148416f.mo203075a();
        this.f148413c.mo203419a();
    }

    /* renamed from: g */
    public boolean mo203405g() {
        AbstractC59737a h;
        AbstractC59637h.AbstractC59638a aVar = this.f148423o;
        if (aVar == null || (h = aVar.mo203159h()) == null || !h.mo177142a()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo203406h() {
        AbstractC59737a h;
        AbstractC59637h.AbstractC59638a aVar = this.f148423o;
        if (aVar != null && (h = aVar.mo203159h()) != null && h.mo177142a()) {
            h.mo177141a(this.f148419k, null, null);
        }
    }

    /* renamed from: m */
    private void m231735m() {
        HashMap hashMap = new HashMap();
        this.f148421m = hashMap;
        hashMap.put(this.f148411a, new C59762c(getContext()));
        this.f148421m.put(this.f148417i, new C59762c(getContext(), AbstractMosaicStrategy.Effect.GAUSSIAN_BLUR));
    }

    /* renamed from: i */
    public void mo203407i() {
        AbstractC59737a h;
        AbstractC59637h.AbstractC59638a aVar = this.f148423o;
        if (aVar != null && (h = aVar.mo203159h()) != null && h.mo177142a()) {
            Bitmap g = this.f148423o.mo203158g();
            if (g == null) {
                Log.e("MosaicPhotoEditorPlugin", "originBitmap is null");
                return;
            }
            this.f148424p.mo203451a();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            h.mo177140a(g, new AbstractC59737a.AbstractC59738a() {
                /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.C597506 */

                @Override // com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a.AbstractC59738a
                /* renamed from: a */
                public void mo203389a() {
                    if (atomicBoolean.compareAndSet(true, false)) {
                        MosaicPhotoEditorPluginV2.this.mo203408j();
                    }
                }

                @Override // com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a.AbstractC59738a
                /* renamed from: a */
                public void mo203390a(List<C59739b> list) {
                    atomicBoolean.set(false);
                    MosaicPhotoEditorPluginV2.this.mo203404a(list);
                }
            });
            postDelayed(new Runnable() {
                /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.RunnableC597517 */

                public void run() {
                    if (atomicBoolean.compareAndSet(true, false)) {
                        MosaicPhotoEditorPluginV2.this.mo203408j();
                    }
                }
            }, 3000);
        }
    }

    /* renamed from: n */
    private void m231736n() {
        this.f148411a = (ImageView) findViewById(R.id.iv_normal_mosaic);
        this.f148417i = (ImageView) findViewById(R.id.iv_brush_mosaic);
        this.f148413c = (MosaicViewV2) findViewById(R.id.mosaic_vew);
        this.f148420l = findViewById(R.id.rl_mosaic_select);
        this.f148414d = (ShowTipsSeekBarLinearLayout) findViewById(R.id.show_tips_seek_bar_ll);
        this.f148418j = (RadioButton) findViewById(R.id.path_radioBtn);
        this.f148419k = (RadioButton) findViewById(R.id.rect_radioBtn);
        this.f148412b = (RadioGroup) findViewById(R.id.selection_group);
        this.f148414d.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.C597473 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                MosaicPhotoEditorPluginV2.this.setPaintSizeByProgress(i);
                HitPointHelper.f147964l.mo203055f(true);
            }
        });
        this.f148413c.setMotionEventListener(new MosaicViewV2.AbstractC59758a() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.C597484 */

            /* renamed from: b */
            private boolean f148430b;

            /* renamed from: c */
            private float f148431c;

            /* renamed from: d */
            private float f148432d;

            /* renamed from: e */
            private boolean f148433e;

            @Override // com.ss.android.photoeditor.mosaic.v2.MosaicViewV2.AbstractC59758a
            /* renamed from: a */
            public void mo203416a(MotionEvent motionEvent) {
                if (motionEvent.getPointerCount() == 1) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f148430b = false;
                        this.f148433e = false;
                        this.f148431c = motionEvent.getX();
                        this.f148432d = motionEvent.getY();
                    } else if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                this.f148430b = false;
                                MosaicPhotoEditorPluginV2.this.f148416f.mo203075a();
                            }
                        } else if (this.f148433e || C59614a.m231217a(MosaicPhotoEditorPluginV2.this.getContext(), this.f148431c, this.f148432d, motionEvent.getX(), motionEvent.getY())) {
                            this.f148433e = true;
                            this.f148430b = true;
                            MosaicPhotoEditorPluginV2.this.f148416f.mo203076b();
                        }
                    } else if (this.f148430b) {
                        MosaicPhotoEditorPluginV2.this.f148416f.mo203075a();
                        this.f148430b = false;
                    } else {
                        if (MosaicPhotoEditorPluginV2.this.f148416f.mo203077c()) {
                            MosaicPhotoEditorPluginV2.this.f148416f.mo203076b();
                        } else {
                            MosaicPhotoEditorPluginV2.this.f148416f.mo203075a();
                        }
                        C59622e.m231233a().mo203090a(MosaicPhotoEditorPluginV2.this.f148413c.getLocation(), motionEvent.getX(), motionEvent.getY());
                    }
                }
            }
        });
        this.f148411a.setOnClickListener(this.f148425q);
        this.f148417i.setOnClickListener(this.f148425q);
        this.f148412b.check(R.id.path_radioBtn);
        this.f148412b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /* class com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2.C597495 */

            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                MosaicPhotoEditorPluginV2.this.mo203403a(i);
                if (i == R.id.rect_radioBtn) {
                    if (!MosaicPhotoEditorPluginV2.this.f148415e.mo203355b()) {
                        MosaicPhotoEditorPluginV2.this.mo203407i();
                    }
                    MosaicPhotoEditorPluginV2.this.mo203406h();
                }
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148423o = aVar;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setImageBitmap(Bitmap bitmap) {
        this.f148413c.setImageBitmap(bitmap);
    }

    public MosaicPhotoEditorPluginV2(Context context) {
        super(context);
        inflate(context, R.layout.view_photo_editor_mosaic_plugin_v2, this);
        m231733k();
    }

    public void setPaintSizeByProgress(int i) {
        int i2 = f148410h;
        int i3 = f148409g;
        int i4 = (int) (((((float) i) / 100.0f) * ((float) (i2 - i3))) + ((float) i3));
        this.f148422n = i4;
        this.f148413c.setPaintSize(i4);
    }

    /* renamed from: a */
    public void mo203403a(int i) {
        if (i == R.id.path_radioBtn) {
            this.f148415e.mo203350a(AbstractMosaicStrategy.SelectionMode.PATH);
        } else if (i == R.id.rect_radioBtn) {
            this.f148415e.mo203350a(AbstractMosaicStrategy.SelectionMode.RECT);
        }
    }

    /* renamed from: a */
    public void mo203404a(List<C59739b> list) {
        if (list == null || list.isEmpty()) {
            LKUIToast.show(getContext(), (int) R.string.Lark_ASL_NoTextOrPhotoRecognized);
        }
        for (AbstractMosaicStrategy abstractMosaicStrategy : this.f148421m.values()) {
            abstractMosaicStrategy.mo203353a(list);
        }
        this.f148424p.mo203457d();
    }

    public void setMosaicType(ImageView imageView) {
        for (ImageView imageView2 : this.f148421m.keySet()) {
            imageView2.setSelected(false);
        }
        imageView.setSelected(true);
        this.f148415e = this.f148421m.get(imageView);
        mo203403a(this.f148412b.getCheckedRadioButtonId());
        this.f148413c.setStrategy(this.f148415e);
        if (this.f148415e.mo203345a() == AbstractMosaicStrategy.SelectionMode.PATH) {
            HitPointHelper.f147964l.mo203045b(1);
        } else {
            HitPointHelper.f147964l.mo203045b(2);
        }
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203141a(RectF rectF, boolean z) {
        this.f148413c.mo203421a(rectF, z);
    }

    public MosaicPhotoEditorPluginV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.view_photo_editor_mosaic_plugin_v2, this);
        m231733k();
    }
}
