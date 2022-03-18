package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.graffiti.ShowTipsSeekBarLinearLayout;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.MosaicView;
import com.ss.android.photoeditor.p3010b.C59613d;
import java.util.HashMap;
import java.util.Map;

public class MosaicPhotoEditorPlugin extends RelativeLayout implements AbstractC59637h {

    /* renamed from: e */
    private static final int f148296e = C59613d.m231216a(2);

    /* renamed from: f */
    private static final int f148297f = C59613d.m231216a(10);

    /* renamed from: a */
    public ImageView f148298a;

    /* renamed from: b */
    public MosaicView f148299b;

    /* renamed from: c */
    public ShowTipsSeekBarLinearLayout f148300c;

    /* renamed from: d */
    public AlphaAnimShowHideViewHelper f148301d;

    /* renamed from: g */
    private ImageView f148302g;

    /* renamed from: h */
    private View f148303h;

    /* renamed from: i */
    private Map<ImageView, AbstractMosaicStrategy> f148304i;

    /* renamed from: j */
    private int f148305j;

    /* renamed from: k */
    private AbstractMosaicStrategy f148306k;

    /* renamed from: l */
    private AbstractC59637h.AbstractC59638a f148307l;

    /* renamed from: m */
    private View.OnClickListener f148308m = new View.OnClickListener() {
        /* class com.ss.android.photoeditor.mosaic.MosaicPhotoEditorPlugin.View$OnClickListenerC597231 */

        public void onClick(View view) {
            MosaicPhotoEditorPlugin.this.setMosaicType((ImageView) view);
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
    /* renamed from: b */
    public void mo203142b() {
        MosaicView mosaicView = this.f148299b;
        if (mosaicView != null) {
            mosaicView.mo203377e();
        }
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: d */
    public void mo203144d() {
        this.f148299b.mo203375c();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: e */
    public void mo203145e() {
        this.f148299b.mo203376d();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public RectF getLocation() {
        return this.f148299b.getLocation();
    }

    /* renamed from: g */
    private void m231634g() {
        m231637j();
        m231636i();
        m231635h();
    }

    /* renamed from: h */
    private void m231635h() {
        this.f148301d = new AlphaAnimShowHideViewHelper(this.f148303h);
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203140a() {
        this.f148307l.mo203151a().setVisibility(0);
        this.f148307l.mo203153b().setVisibility(0);
        this.f148299b.mo203373a(new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.MosaicPhotoEditorPlugin.RunnableC597242 */

            public void run() {
                MosaicPhotoEditorPlugin mosaicPhotoEditorPlugin = MosaicPhotoEditorPlugin.this;
                mosaicPhotoEditorPlugin.setMosaicType(mosaicPhotoEditorPlugin.f148298a);
                MosaicPhotoEditorPlugin.this.f148300c.setProgress(50);
                MosaicPhotoEditorPlugin.this.setPaintSizeByProgress(50);
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: c */
    public void mo203143c() {
        this.f148307l.mo203153b().setVisibility(0);
        this.f148307l.mo203151a().setVisibility(0);
        this.f148301d.mo203075a();
        this.f148299b.mo203370a();
    }

    /* renamed from: i */
    private void m231636i() {
        HashMap hashMap = new HashMap();
        this.f148304i = hashMap;
        hashMap.put(this.f148298a, new C59743e(getContext()));
        this.f148304i.put(this.f148302g, new C59734a(getContext()));
    }

    /* renamed from: j */
    private void m231637j() {
        this.f148298a = (ImageView) findViewById(R.id.iv_normal_mosaic);
        this.f148302g = (ImageView) findViewById(R.id.iv_brush_mosaic);
        this.f148299b = (MosaicView) findViewById(R.id.mosaic_vew);
        this.f148303h = findViewById(R.id.rl_mosaic_select);
        ShowTipsSeekBarLinearLayout showTipsSeekBarLinearLayout = (ShowTipsSeekBarLinearLayout) findViewById(R.id.show_tips_seek_bar_ll);
        this.f148300c = showTipsSeekBarLinearLayout;
        showTipsSeekBarLinearLayout.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.photoeditor.mosaic.MosaicPhotoEditorPlugin.C597253 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                MosaicPhotoEditorPlugin.this.setPaintSizeByProgress(i);
                HitPointHelper.f147964l.mo203055f(true);
            }
        });
        this.f148299b.setMotionEventListener(new MosaicView.AbstractC59733a() {
            /* class com.ss.android.photoeditor.mosaic.MosaicPhotoEditorPlugin.C597264 */

            /* renamed from: b */
            private boolean f148313b;

            /* renamed from: c */
            private float f148314c;

            /* renamed from: d */
            private float f148315d;

            /* renamed from: e */
            private boolean f148316e;

            @Override // com.ss.android.photoeditor.mosaic.MosaicView.AbstractC59733a
            /* renamed from: a */
            public void mo203369a(MotionEvent motionEvent) {
                if (motionEvent.getPointerCount() == 1) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f148313b = false;
                        this.f148316e = false;
                        this.f148314c = motionEvent.getX();
                        this.f148315d = motionEvent.getY();
                    } else if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                this.f148313b = false;
                                MosaicPhotoEditorPlugin.this.f148301d.mo203075a();
                            }
                        } else if (this.f148316e || C59614a.m231217a(MosaicPhotoEditorPlugin.this.getContext(), this.f148314c, this.f148315d, motionEvent.getX(), motionEvent.getY())) {
                            this.f148316e = true;
                            this.f148313b = true;
                            MosaicPhotoEditorPlugin.this.f148301d.mo203076b();
                        }
                    } else if (this.f148313b) {
                        MosaicPhotoEditorPlugin.this.f148301d.mo203075a();
                        this.f148313b = false;
                    } else {
                        if (MosaicPhotoEditorPlugin.this.f148301d.mo203077c()) {
                            MosaicPhotoEditorPlugin.this.f148301d.mo203076b();
                        } else {
                            MosaicPhotoEditorPlugin.this.f148301d.mo203075a();
                        }
                        C59622e.m231233a().mo203090a(MosaicPhotoEditorPlugin.this.f148299b.getLocation(), motionEvent.getX(), motionEvent.getY());
                    }
                }
            }
        });
        this.f148298a.setOnClickListener(this.f148308m);
        this.f148302g.setOnClickListener(this.f148308m);
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148307l = aVar;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setImageBitmap(Bitmap bitmap) {
        this.f148299b.setImageBitmap(bitmap);
    }

    public MosaicPhotoEditorPlugin(Context context) {
        super(context);
        inflate(context, R.layout.view_photo_editor_mosaic_plugin, this);
        m231634g();
    }

    public void setPaintSizeByProgress(int i) {
        int i2 = f148297f;
        int i3 = f148296e;
        int i4 = (int) (((((float) i) / 100.0f) * ((float) (i2 - i3))) + ((float) i3));
        this.f148305j = i4;
        this.f148299b.setPaintSize(i4);
    }

    public void setMosaicType(ImageView imageView) {
        for (ImageView imageView2 : this.f148304i.keySet()) {
            imageView2.setSelected(false);
        }
        imageView.setSelected(true);
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148304i.get(imageView);
        this.f148306k = abstractMosaicStrategy;
        this.f148299b.setStrategy(abstractMosaicStrategy);
        if (this.f148306k instanceof C59743e) {
            HitPointHelper.f147964l.mo203045b(1);
        } else {
            HitPointHelper.f147964l.mo203045b(2);
        }
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203141a(RectF rectF, boolean z) {
        this.f148299b.mo203372a(rectF, z);
    }

    public MosaicPhotoEditorPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.view_photo_editor_mosaic_plugin, this);
        m231634g();
    }
}
