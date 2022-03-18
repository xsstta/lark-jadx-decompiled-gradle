package com.ss.android.photoeditor.text;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper;
import com.ss.android.photoeditor.base.view.ColorChoiceView;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.text.TextEditorDrawView;
import com.ss.android.photoeditor.text.TextEditorView;

public class TextPhotoEditorPlugin extends RelativeLayout implements AbstractC59637h {

    /* renamed from: a */
    public TextEditorView f148629a;

    /* renamed from: b */
    public ColorChoiceView f148630b;

    /* renamed from: c */
    public AlphaAnimShowHideViewHelper f148631c;

    /* renamed from: d */
    private AbstractC59637h.AbstractC59638a f148632d;

    /* renamed from: e */
    private View f148633e;

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
    private void m231965g() {
        m231966h();
        m231967i();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: b */
    public void mo203142b() {
        this.f148629a.mo203537d();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: d */
    public void mo203144d() {
        this.f148629a.mo203535b();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: e */
    public void mo203145e() {
        this.f148629a.mo203536c();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public RectF getLocation() {
        return this.f148629a.getLocation();
    }

    /* renamed from: i */
    private void m231967i() {
        this.f148631c = new AlphaAnimShowHideViewHelper(this.f148633e);
        this.f148629a.setToolBarVisiableCallback(new TextEditorDrawView.AbstractC59779c() {
            /* class com.ss.android.photoeditor.text.TextPhotoEditorPlugin.C598033 */

            @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59779c
            /* renamed from: a */
            public boolean mo203520a() {
                return TextPhotoEditorPlugin.this.f148631c.mo203077c();
            }

            @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59779c
            /* renamed from: a */
            public void mo203519a(boolean z) {
                if (z) {
                    TextPhotoEditorPlugin.this.f148631c.mo203075a();
                } else {
                    TextPhotoEditorPlugin.this.f148631c.mo203076b();
                }
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203140a() {
        this.f148632d.mo203153b().setVisibility(0);
        this.f148632d.mo203151a().setVisibility(0);
        this.f148629a.mo203534a(new Runnable() {
            /* class com.ss.android.photoeditor.text.TextPhotoEditorPlugin.RunnableC598044 */

            public void run() {
                TextPhotoEditorPlugin.this.f148630b.mo203192a(ColorChoiceView.ChoiceColor.RED);
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: c */
    public void mo203143c() {
        this.f148632d.mo203153b().setVisibility(0);
        this.f148632d.mo203151a().setVisibility(0);
        this.f148631c.mo203075a();
        this.f148629a.mo203532a();
    }

    /* renamed from: h */
    private void m231966h() {
        TextEditorView textEditorView = (TextEditorView) findViewById(R.id.text_editor_view);
        this.f148629a = textEditorView;
        textEditorView.setActivity((Activity) getContext());
        this.f148630b = (ColorChoiceView) findViewById(R.id.color_choice_view);
        this.f148633e = findViewById(R.id.ll_paint_color_choice);
        final C598011 r0 = new ColorChoiceView.AbstractC59657a() {
            /* class com.ss.android.photoeditor.text.TextPhotoEditorPlugin.C598011 */

            @Override // com.ss.android.photoeditor.base.view.ColorChoiceView.AbstractC59657a
            /* renamed from: a */
            public void mo203195a(int i, ColorChoiceView.ChoiceColor choiceColor) {
                TextPhotoEditorPlugin.this.f148629a.setPaintColor(i);
                HitPointHelper.f147964l.mo203048c(choiceColor.ID);
            }
        };
        this.f148630b.setOnColorChangedListener(r0);
        this.f148629a.setBottomColorChoiceView(this.f148630b);
        this.f148629a.setOnColorChangedListener(new TextEditorView.AbstractC59794a() {
            /* class com.ss.android.photoeditor.text.TextPhotoEditorPlugin.C598022 */

            @Override // com.ss.android.photoeditor.text.TextEditorView.AbstractC59794a
            /* renamed from: a */
            public void mo203549a(int i) {
                TextPhotoEditorPlugin.this.f148630b.setOnColorChangedListener(null);
                TextPhotoEditorPlugin.this.f148630b.mo203190a(i);
                TextPhotoEditorPlugin.this.f148630b.setOnColorChangedListener(r0);
            }
        });
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setImageBitmap(Bitmap bitmap) {
        this.f148629a.setImageBitmap(bitmap);
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148632d = aVar;
        this.f148629a.setPluginContext(aVar);
    }

    public TextPhotoEditorPlugin(Context context) {
        super(context);
        inflate(context, R.layout.view_photo_editor_text_plugin, this);
        m231965g();
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59637h
    /* renamed from: a */
    public void mo203141a(RectF rectF, boolean z) {
        this.f148629a.mo203533a(rectF, z);
    }

    public TextPhotoEditorPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_photo_editor_text_plugin, this);
        m231965g();
    }

    public TextPhotoEditorPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.view_photo_editor_text_plugin, this);
        m231965g();
    }
}
