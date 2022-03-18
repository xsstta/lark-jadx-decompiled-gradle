package com.ss.android.photoeditor.graffiti;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.base.view.ColorChoiceView;
import com.ss.android.photoeditor.graffiti.GraffitiView;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.p3010b.C59613d;

public class GraffitiPhotoEditorPlugin extends RelativeLayout implements AbstractC59637h {

    /* renamed from: a */
    public GraffitiView f148212a;

    /* renamed from: b */
    public ColorChoiceView f148213b;

    /* renamed from: c */
    public AlphaAnimShowHideViewHelper f148214c;

    /* renamed from: d */
    private ShowTipsSeekBarLinearLayout f148215d;

    /* renamed from: e */
    private AbstractC59637h.AbstractC59638a f148216e;

    /* renamed from: f */
    private View f148217f;

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: f */
    public boolean mo203146f() {
        return true;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public View getEditView() {
        return this;
    }

    /* renamed from: g */
    private void m231561g() {
        m231563i();
        m231562h();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: b */
    public void mo203142b() {
        this.f148212a.mo203320h();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: d */
    public void mo203144d() {
        this.f148212a.mo203314c();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: e */
    public void mo203145e() {
        this.f148212a.mo203317f();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public RectF getLocation() {
        return this.f148212a.getLocation();
    }

    /* renamed from: h */
    private void m231562h() {
        this.f148214c = new AlphaAnimShowHideViewHelper(this.f148217f);
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203140a() {
        this.f148216e.mo203153b().setVisibility(0);
        this.f148216e.mo203151a().setVisibility(0);
        this.f148212a.mo203312a(new Runnable() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiPhotoEditorPlugin.RunnableC597084 */

            public void run() {
                GraffitiPhotoEditorPlugin.this.f148213b.mo203192a(ColorChoiceView.ChoiceColor.RED);
                GraffitiPhotoEditorPlugin.this.setPaintSizeSeekBarProgress(50);
                GraffitiPhotoEditorPlugin.this.setPaintSizeByProgress(50);
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: c */
    public void mo203143c() {
        this.f148216e.mo203153b().setVisibility(0);
        this.f148216e.mo203151a().setVisibility(0);
        this.f148214c.mo203075a();
        this.f148212a.mo203313b();
    }

    /* renamed from: i */
    private void m231563i() {
        this.f148212a = (GraffitiView) findViewById(R.id.graffiti_view);
        this.f148217f = findViewById(R.id.rl_graffiti_setting);
        this.f148213b = (ColorChoiceView) findViewById(R.id.ll_paint_color_choice);
        this.f148215d = (ShowTipsSeekBarLinearLayout) findViewById(R.id.show_tips_seek_bar_ll);
        this.f148213b.setOnColorChangedListener(new ColorChoiceView.AbstractC59657a() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiPhotoEditorPlugin.C597051 */

            @Override // com.ss.android.photoeditor.base.view.ColorChoiceView.AbstractC59657a
            /* renamed from: a */
            public void mo203195a(int i, ColorChoiceView.ChoiceColor choiceColor) {
                GraffitiPhotoEditorPlugin.this.f148212a.setPaintColor(i);
                HitPointHelper.f147964l.mo203041a(choiceColor.ID);
            }
        });
        this.f148212a.setMotionEventListener(new GraffitiView.AbstractC59716a() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiPhotoEditorPlugin.C597062 */

            /* renamed from: b */
            private boolean f148220b;

            /* renamed from: c */
            private float f148221c;

            /* renamed from: d */
            private float f148222d;

            /* renamed from: e */
            private boolean f148223e;

            @Override // com.ss.android.photoeditor.graffiti.GraffitiView.AbstractC59716a
            /* renamed from: a */
            public void mo203305a(MotionEvent motionEvent) {
                if (motionEvent.getPointerCount() == 1) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f148220b = false;
                        this.f148223e = false;
                        this.f148221c = motionEvent.getX();
                        this.f148222d = motionEvent.getY();
                    } else if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                this.f148220b = false;
                                GraffitiPhotoEditorPlugin.this.f148214c.mo203075a();
                            }
                        } else if (this.f148223e || C59614a.m231217a(GraffitiPhotoEditorPlugin.this.getContext(), this.f148221c, this.f148222d, motionEvent.getX(), motionEvent.getY())) {
                            this.f148220b = true;
                            this.f148223e = true;
                            GraffitiPhotoEditorPlugin.this.f148214c.mo203076b();
                        }
                    } else if (this.f148220b) {
                        GraffitiPhotoEditorPlugin.this.f148214c.mo203075a();
                        this.f148220b = false;
                    } else {
                        if (GraffitiPhotoEditorPlugin.this.f148214c.mo203077c()) {
                            GraffitiPhotoEditorPlugin.this.f148214c.mo203076b();
                        } else {
                            GraffitiPhotoEditorPlugin.this.f148214c.mo203075a();
                        }
                        C59622e.m231233a().mo203090a(GraffitiPhotoEditorPlugin.this.f148212a.getLocation(), motionEvent.getX(), motionEvent.getY());
                    }
                }
            }
        });
        this.f148215d.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiPhotoEditorPlugin.C597073 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                GraffitiPhotoEditorPlugin.this.setPaintSizeByProgress(i);
                HitPointHelper.f147964l.mo203053e(true);
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148216e = aVar;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setImageBitmap(Bitmap bitmap) {
        this.f148212a.setImageBitmap(bitmap);
    }

    public void setPaintSizeSeekBarProgress(int i) {
        this.f148215d.setProgress(i);
    }

    public GraffitiPhotoEditorPlugin(Context context) {
        super(context);
        inflate(context, R.layout.view_photo_editor_graffiti_plugin, this);
        m231561g();
    }

    public void setPaintSizeByProgress(int i) {
        this.f148212a.setPaintSize(C59613d.m231216a((int) (((((float) i) / 100.0f) * 6.0f) + 2.0f)));
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203141a(RectF rectF, boolean z) {
        this.f148212a.mo203311a(rectF, z);
    }

    public GraffitiPhotoEditorPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.view_photo_editor_graffiti_plugin, this);
        m231561g();
    }
}
