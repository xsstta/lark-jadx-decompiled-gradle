package com.bytedance.ee.bear.middleground.comment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ee.util.string.StringHelper;

public class CommentTextView extends AppCompatTextView {

    /* renamed from: a */
    public AbstractView$OnAttachStateChangeListenerC9297a f25008a;

    /* renamed from: b */
    public C9299c f25009b;

    /* renamed from: c */
    private String f25010c;

    /* renamed from: e */
    private AbstractC9298b f25011e;

    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.CommentTextView$a */
    public interface AbstractView$OnAttachStateChangeListenerC9297a extends View.OnAttachStateChangeListener {
        /* renamed from: a */
        void mo35499a(TextView textView);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.CommentTextView$b */
    public interface AbstractC9298b {
        /* renamed from: a */
        CharSequence mo35500a(CharSequence charSequence);
    }

    public String getRawString() {
        return this.f25010c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38464a() {
        AbstractView$OnAttachStateChangeListenerC9297a aVar = this.f25008a;
        if (aVar != null) {
            aVar.onViewAttachedToWindow(this);
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.CommentTextView$c */
    private static final class C9299c {

        /* renamed from: a */
        private Runnable f25013a;

        /* renamed from: b */
        private boolean f25014b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo35501a() {
            if (!this.f25014b) {
                this.f25013a.run();
                this.f25014b = true;
            }
        }

        C9299c(Runnable runnable) {
            this.f25013a = runnable;
        }
    }

    public CommentTextView(Context context) {
        super(context);
    }

    public void setParser(AbstractC9298b bVar) {
        this.f25011e = bVar;
    }

    public void setRawString(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = StringHelper.m55640a(str);
        }
        this.f25010c = str2;
        AbstractC9298b bVar = this.f25011e;
        String str3 = str2;
        if (bVar != null) {
            str3 = bVar.mo35500a(str2);
        }
        setText(str3);
        AbstractView$OnAttachStateChangeListenerC9297a aVar = this.f25008a;
        if (aVar != null) {
            aVar.mo35499a(this);
        }
    }

    public void setAfterSetText(AbstractView$OnAttachStateChangeListenerC9297a aVar) {
        this.f25008a = aVar;
        this.f25009b = new C9299c(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.comment.widget.$$Lambda$CommentTextView$OJ6ka3NXLOCLYQdA7qOeNZ9jqE */

            public final void run() {
                CommentTextView.this.m38464a();
            }
        });
        if (isAttachedToWindow()) {
            this.f25009b.mo35501a();
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.bytedance.ee.bear.middleground.comment.widget.CommentTextView.View$OnAttachStateChangeListenerC92961 */

                public void onViewAttachedToWindow(View view) {
                    if (CommentTextView.this.f25009b != null) {
                        CommentTextView.this.f25009b.mo35501a();
                    }
                }

                public void onViewDetachedFromWindow(View view) {
                    if (CommentTextView.this.f25008a != null) {
                        CommentTextView.this.f25008a.onViewDetachedFromWindow(view);
                    }
                    CommentTextView.this.f25009b = null;
                    CommentTextView.this.f25008a = null;
                    CommentTextView.this.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
