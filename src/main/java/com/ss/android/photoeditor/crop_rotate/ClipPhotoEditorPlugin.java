package com.ss.android.photoeditor.crop_rotate;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.crop_rotate.PhotoClipView;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import java.util.Stack;

public class ClipPhotoEditorPlugin extends RelativeLayout implements AbstractC59637h {

    /* renamed from: a */
    public PhotoClipView f148073a;

    /* renamed from: b */
    public AbstractC59637h.AbstractC59638a f148074b;

    /* renamed from: c */
    private TextView f148075c;

    /* renamed from: d */
    private TextView f148076d;

    /* renamed from: e */
    private TextView f148077e;

    /* renamed from: f */
    private TextView f148078f;

    /* renamed from: g */
    private TextView f148079g;

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: e */
    public void mo203145e() {
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: f */
    public boolean mo203146f() {
        return false;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public View getEditView() {
        return this;
    }

    /* renamed from: h */
    private void m231386h() {
        m231387i();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: b */
    public void mo203142b() {
        this.f148073a.mo203214h();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public RectF getLocation() {
        return this.f148073a.getClipRect();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: c */
    public void mo203143c() {
        this.f148074b.mo203151a().setVisibility(8);
        this.f148074b.mo203153b().setVisibility(8);
        this.f148073a.mo203204c();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: d */
    public void mo203144d() {
        if (this.f148074b.mo203157f() != 1) {
            this.f148074b.mo203151a().setVisibility(0);
            this.f148074b.mo203153b().setVisibility(0);
        }
    }

    /* renamed from: g */
    public void mo203196g() {
        C59622e.m231233a().mo203093b(new PhotoClipView.C59671a(this.f148073a.getPhotoImitationRect(), this.f148073a.getClipImitationRect(), this.f148073a.getTotalRotateAngle()));
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203140a() {
        this.f148074b.mo203151a().setVisibility(8);
        this.f148074b.mo203153b().setVisibility(8);
        this.f148073a.mo203201a();
        if (this.f148074b.mo203157f() == 1) {
            this.f148079g.setVisibility(4);
        }
    }

    /* renamed from: i */
    private void m231387i() {
        this.f148073a = (PhotoClipView) findViewById(R.id.photo_clip_view);
        this.f148077e = (TextView) findViewById(R.id.tv_rotate);
        this.f148078f = (TextView) findViewById(R.id.tv_reset);
        this.f148075c = (TextView) findViewById(R.id.tv_cancel);
        this.f148076d = (TextView) findViewById(R.id.tv_finish);
        this.f148079g = (TextView) findViewById(R.id.tv_text_clip);
        this.f148077e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.crop_rotate.ClipPhotoEditorPlugin.View$OnClickListenerC596581 */

            public void onClick(View view) {
                ClipPhotoEditorPlugin.this.f148073a.mo203207f();
            }
        });
        this.f148078f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.crop_rotate.ClipPhotoEditorPlugin.View$OnClickListenerC596592 */

            public void onClick(View view) {
                ClipPhotoEditorPlugin.this.f148073a.mo203208g();
            }
        });
        this.f148075c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.crop_rotate.ClipPhotoEditorPlugin.View$OnClickListenerC596603 */

            public void onClick(View view) {
                if (ClipPhotoEditorPlugin.this.f148074b.mo203157f() == 1) {
                    ClipPhotoEditorPlugin.this.f148074b.mo203156e();
                    return;
                }
                Stack<Class<? extends AbstractC59637h>> c = ClipPhotoEditorPlugin.this.f148074b.mo203154c();
                ClipPhotoEditorPlugin.this.f148074b.mo203152a(c.get(c.size() - 2));
            }
        });
        this.f148076d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.crop_rotate.ClipPhotoEditorPlugin.View$OnClickListenerC596614 */

            public void onClick(View view) {
                ClipPhotoEditorPlugin.this.mo203196g();
                HitPointHelper.f147964l.mo203051d(true);
                if (ClipPhotoEditorPlugin.this.f148074b.mo203157f() == 1) {
                    ClipPhotoEditorPlugin.this.f148074b.mo203155d();
                    return;
                }
                Stack<Class<? extends AbstractC59637h>> c = ClipPhotoEditorPlugin.this.f148074b.mo203154c();
                ClipPhotoEditorPlugin.this.f148074b.mo203152a(c.get(c.size() - 2));
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148074b = aVar;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setImageBitmap(Bitmap bitmap) {
        this.f148073a.setImageBitmap(bitmap);
    }

    public ClipPhotoEditorPlugin(Context context) {
        super(context);
        inflate(context, R.layout.view_photo_editor_clip_plugin, this);
        m231386h();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203141a(RectF rectF, boolean z) {
        this.f148073a.setPreLocation(rectF);
    }

    public ClipPhotoEditorPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_photo_editor_clip_plugin, this);
        m231386h();
    }

    public ClipPhotoEditorPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.view_photo_editor_clip_plugin, this);
        m231386h();
    }
}
