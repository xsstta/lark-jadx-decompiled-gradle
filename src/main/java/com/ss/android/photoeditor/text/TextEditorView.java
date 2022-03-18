package com.ss.android.photoeditor.text;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.view.ColorChoiceView;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.p3010b.C59611c;
import com.ss.android.photoeditor.text.TextEditorDrawView;
import com.ss.android.photoeditor.text.TextEditorGestureView;
import com.ss.android.photoeditor.text.TextInputView;

public class TextEditorView extends FrameLayout {

    /* renamed from: a */
    public TextEditorDrawView f148602a;

    /* renamed from: b */
    public TextEditorGestureView f148603b;

    /* renamed from: c */
    public TextInputView f148604c;

    /* renamed from: d */
    public AbstractC59637h.AbstractC59638a f148605d;

    /* renamed from: e */
    public AbstractC59794a f148606e;

    /* renamed from: f */
    public ColorChoiceView f148607f;

    /* renamed from: g */
    public boolean f148608g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorView$a */
    public interface AbstractC59794a {
        /* renamed from: a */
        void mo203549a(int i);
    }

    /* renamed from: a */
    public void mo203532a() {
        this.f148602a.mo203477b();
    }

    /* renamed from: b */
    public void mo203535b() {
        this.f148602a.mo203480e();
    }

    /* renamed from: c */
    public void mo203536c() {
        this.f148602a.mo203478c();
    }

    /* renamed from: d */
    public void mo203537d() {
        this.f148602a.mo203482g();
    }

    public RectF getLocation() {
        return this.f148602a.getLocation();
    }

    /* renamed from: e */
    private void m231942e() {
        inflate(getContext(), R.layout.photo_editor_text_layout, this);
        this.f148602a = (TextEditorDrawView) findViewById(R.id.text_editor_show_view);
        this.f148603b = (TextEditorGestureView) findViewById(R.id.text_editor_gesture_view);
        TextInputView textInputView = (TextInputView) findViewById(R.id.text_input_view);
        this.f148604c = textInputView;
        textInputView.setVisibility(8);
        m231943f();
    }

    /* renamed from: f */
    private void m231943f() {
        this.f148603b.setOnEditTextListener(new TextEditorGestureView.AbstractC59788b() {
            /* class com.ss.android.photoeditor.text.TextEditorView.C597891 */

            @Override // com.ss.android.photoeditor.text.TextEditorGestureView.AbstractC59788b
            /* renamed from: a */
            public void mo203531a(C59805a aVar) {
                if (!aVar.f148652d) {
                    TextEditorView.this.f148604c.setText("");
                } else {
                    TextEditorView.this.f148604c.setText(aVar.mo203581b());
                }
                TextEditorView.this.f148604c.setTextColor(aVar.mo203572a());
                TextEditorView.this.f148604c.setVisibility(0);
                TextEditorView.this.f148604c.mo203550a();
                if (TextEditorView.this.f148605d != null) {
                    TextEditorView.this.f148605d.mo203151a().setVisibility(8);
                }
                TextEditorView.this.f148608g = false;
            }
        });
        this.f148604c.setOnInputSaveCallback(new TextInputView.AbstractC59800c() {
            /* class com.ss.android.photoeditor.text.TextEditorView.C597902 */

            @Override // com.ss.android.photoeditor.text.TextInputView.AbstractC59800c
            /* renamed from: a */
            public void mo203546a(String str, int i) {
                if (TextEditorView.this.f148605d != null) {
                    TextEditorView.this.f148605d.mo203151a().setVisibility(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    HitPointHelper.f147964l.mo203049c(true);
                    TextEditorView.this.f148602a.getTextStickerController().mo203502a(str, i).mo203518e();
                    if (TextEditorView.this.f148606e != null) {
                        TextEditorView.this.f148606e.mo203549a(i);
                    }
                }
                TextEditorView.this.f148604c.mo203552b();
                TextEditorView.this.f148604c.setVisibility(8);
                TextEditorView.this.f148607f.setVisibility(0);
                TextEditorView.this.f148608g = true;
            }
        });
        this.f148604c.setBottomColorChoiceChangeCallback(new TextInputView.AbstractC59799b() {
            /* class com.ss.android.photoeditor.text.TextEditorView.C597913 */

            @Override // com.ss.android.photoeditor.text.TextInputView.AbstractC59799b
            /* renamed from: a */
            public void mo203547a() {
                int i;
                ColorChoiceView colorChoiceView = TextEditorView.this.f148607f;
                if (TextEditorView.this.f148608g) {
                    i = 0;
                } else {
                    i = 4;
                }
                colorChoiceView.setVisibility(i);
            }
        });
        this.f148602a.setOnColorChangedListener(new TextEditorDrawView.AbstractC59777a() {
            /* class com.ss.android.photoeditor.text.TextEditorView.C597924 */

            @Override // com.ss.android.photoeditor.text.TextEditorDrawView.AbstractC59777a
            /* renamed from: a */
            public void mo203496a(int i) {
                if (TextEditorView.this.f148606e != null) {
                    TextEditorView.this.f148606e.mo203549a(i);
                }
            }
        });
    }

    public void setBottomColorChoiceView(ColorChoiceView colorChoiceView) {
        this.f148607f = colorChoiceView;
    }

    public void setOnColorChangedListener(AbstractC59794a aVar) {
        this.f148606e = aVar;
    }

    public TextEditorView(Context context) {
        super(context);
        m231942e();
    }

    public void setActivity(Activity activity) {
        this.f148604c.setActivity(activity);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f148602a.setImageBitmap(bitmap);
    }

    public void setPaintColor(int i) {
        this.f148602a.setPaintColor(i);
    }

    public void setPluginContext(AbstractC59637h.AbstractC59638a aVar) {
        this.f148605d = aVar;
        this.f148602a.setPluginContext(aVar);
    }

    public void setToolBarVisiableCallback(TextEditorDrawView.AbstractC59779c cVar) {
        this.f148602a.setToolBarVisibleCallback(cVar);
    }

    /* renamed from: a */
    public void mo203534a(final Runnable runnable) {
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.text.TextEditorView.RunnableC597935 */

            public void run() {
                TextEditorView.this.f148602a.mo203475a((Runnable) null);
                TextEditorView.this.f148603b.setTextEditorView(TextEditorView.this.f148602a.getTextStickerController());
                TextEditorView.this.f148603b.mo203524a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public TextEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m231942e();
    }

    /* renamed from: a */
    public void mo203533a(RectF rectF, boolean z) {
        this.f148602a.mo203470a(rectF, z);
    }

    public TextEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m231942e();
    }
}
