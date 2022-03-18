package com.ss.android.lark.widget.richtext2.widget.codeblock;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.entity.DetailCodeBlockParseResult;
import com.ss.android.lark.widget.richtext2.p2969a.p2970a.C59064a;
import com.ss.android.lark.widget.richtext2.widget.selectabletext.SelectableTextView;
import java.lang.ref.WeakReference;

public class CodeBlockDetailView extends NestedScrollView {

    /* renamed from: a */
    public Activity f146501a;

    /* renamed from: b */
    private final CommonLoadingDialog f146502b;

    /* renamed from: c */
    private SelectableTextView f146503c;

    /* renamed from: d */
    private final Runnable f146504d;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m229531c() {
        this.f146502b.show(this.f146501a);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m229529b();
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.richtext2.widget.codeblock.CodeBlockDetailView$a */
    public static class RunnableC59094a implements Runnable {

        /* renamed from: a */
        private final WeakReference<CodeBlockDetailView> f146505a;

        /* renamed from: b */
        private final RichTextElement.CodeBlockProperty f146506b;

        public void run() {
            CodeBlockDetailView codeBlockDetailView = this.f146505a.get();
            if (codeBlockDetailView != null) {
                codeBlockDetailView.mo200759a(new C59064a(codeBlockDetailView.f146501a).mo200658a(this.f146506b));
            }
        }

        private RunnableC59094a(CodeBlockDetailView codeBlockDetailView, RichTextElement.CodeBlockProperty codeBlockProperty) {
            this.f146505a = new WeakReference<>(codeBlockDetailView);
            this.f146506b = codeBlockProperty;
        }
    }

    /* renamed from: b */
    private void m229529b() {
        SelectableTextView selectableTextView = (SelectableTextView) findViewById(R.id.code_block_detail_view);
        this.f146503c = selectableTextView;
        selectableTextView.setCallBack(new SelectableTextView.AbstractC59095a() {
            /* class com.ss.android.lark.widget.richtext2.widget.codeblock.$$Lambda$GDnttuV6_q7jhTj_1839uXkhZAs */

            @Override // com.ss.android.lark.widget.richtext2.widget.selectabletext.SelectableTextView.AbstractC59095a
            public final void onFinish() {
                CodeBlockDetailView.this.mo114050a();
            }
        });
    }

    /* renamed from: a */
    public void mo114050a() {
        if (UIUtils.isActivityRunning(this.f146501a)) {
            this.f146502b.dismiss();
            removeCallbacks(this.f146504d);
            this.f146501a.finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m229530b(DetailCodeBlockParseResult detailCodeBlockParseResult) {
        removeCallbacks(this.f146504d);
        if (detailCodeBlockParseResult != null) {
            this.f146503c.setText(detailCodeBlockParseResult.getSpanBuilder());
            this.f146502b.dismiss();
            return;
        }
        mo114050a();
    }

    /* renamed from: a */
    public void mo200758a(RichTextElement.CodeBlockProperty codeBlockProperty) {
        postDelayed(this.f146504d, 100);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new RunnableC59094a(codeBlockProperty));
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f146503c.getMeasuredHeight() < DeviceUtils.getScreenHeight(this.f146501a)) {
                SelectableTextView selectableTextView = this.f146503c;
                selectableTextView.onClick(selectableTextView);
            }
            performClick();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo200759a(DetailCodeBlockParseResult detailCodeBlockParseResult) {
        if (UIUtils.isActivityRunning(this.f146501a)) {
            UICallbackExecutor.execute(new Runnable(detailCodeBlockParseResult) {
                /* class com.ss.android.lark.widget.richtext2.widget.codeblock.$$Lambda$CodeBlockDetailView$NL_06kiExe4iMOnJwY44bDlSfc */
                public final /* synthetic */ DetailCodeBlockParseResult f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    CodeBlockDetailView.this.m229530b((CodeBlockDetailView) this.f$1);
                }
            });
        }
    }

    public CodeBlockDetailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static CodeBlockDetailView m229528a(Context context, ViewGroup viewGroup, boolean z) {
        return (CodeBlockDetailView) LayoutInflater.from(context).inflate(R.layout.layout_rich_text_code_block_detail_view, viewGroup, z);
    }

    public CodeBlockDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146502b = new CommonLoadingDialog();
        this.f146504d = new Runnable() {
            /* class com.ss.android.lark.widget.richtext2.widget.codeblock.$$Lambda$CodeBlockDetailView$RIyP_ue42JWVdqWo8VfhAOQw7dA */

            public final void run() {
                CodeBlockDetailView.this.m229531c();
            }
        };
        this.f146501a = (Activity) context;
    }
}
