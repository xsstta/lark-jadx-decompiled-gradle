package com.ss.android.lark.widget.richtext2.widget.codeblock;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.entity.SimpleCodeBlockParseResult;
import com.ss.android.lark.widget.richtext2.ui.CodeBlockDetailActivity;
import com.ss.android.lark.widget.richtext2.widget.C59089a;

public class CodeBlockSimpleView extends RelativeLayout {

    /* renamed from: a */
    private Context f146507a;

    /* renamed from: b */
    private TextView f146508b;

    /* renamed from: c */
    private TextView f146509c;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m229536a();
        m229538b();
    }

    /* renamed from: a */
    private void m229536a() {
        TextView textView = (TextView) findViewById(R.id.simple_code_view);
        this.f146508b = textView;
        textView.setMaxLines(10);
    }

    /* renamed from: b */
    private void m229538b() {
        TextView textView = (TextView) findViewById(R.id.simple_button_button);
        this.f146509c = textView;
        textView.setVisibility(8);
        m229540c();
    }

    /* renamed from: c */
    private void m229540c() {
        int color = UIHelper.getColor(R.color.lkui_N100);
        int color2 = UIHelper.getColor(R.color.code_block_bg_press_color);
        float dimens = (float) UIHelper.getDimens(R.dimen.code_block_bg_radius);
        this.f146509c.setBackground(C59089a.m229507a(color, color2, new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimens, dimens, dimens, dimens}, UIHelper.getDimens(R.dimen.code_block_border_width), UIHelper.getColor(R.color.code_block_border_color)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m229539b(SimpleCodeBlockParseResult simpleCodeBlockParseResult) {
        if (this.f146508b.getLineCount() >= 10) {
            this.f146509c.setVisibility(0);
            this.f146509c.setOnClickListener(new View.OnClickListener(simpleCodeBlockParseResult) {
                /* class com.ss.android.lark.widget.richtext2.widget.codeblock.$$Lambda$CodeBlockSimpleView$K9_H4G5rkUy43l6Fu968LQOTk4U */
                public final /* synthetic */ SimpleCodeBlockParseResult f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CodeBlockSimpleView.this.m229537a(this.f$1, view);
                }
            });
            return;
        }
        this.f146509c.setVisibility(8);
    }

    /* renamed from: a */
    public void mo200763a(SimpleCodeBlockParseResult simpleCodeBlockParseResult) {
        this.f146508b.setText(simpleCodeBlockParseResult.getSpanBuilder());
        this.f146508b.post(new Runnable(simpleCodeBlockParseResult) {
            /* class com.ss.android.lark.widget.richtext2.widget.codeblock.$$Lambda$CodeBlockSimpleView$GnbtIlpiZTL4k4GDEjPq7rBQcY4 */
            public final /* synthetic */ SimpleCodeBlockParseResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CodeBlockSimpleView.this.m229539b(this.f$1);
            }
        });
    }

    public CodeBlockSimpleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m229537a(SimpleCodeBlockParseResult simpleCodeBlockParseResult, View view) {
        RichTextElement.CodeBlockProperty property = simpleCodeBlockParseResult.getProperty();
        if (property != null) {
            CodeBlockDetailActivity.m229468a((Activity) this.f146507a, property);
        }
    }

    public CodeBlockSimpleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146507a = context;
    }

    /* renamed from: a */
    public static CodeBlockSimpleView m229535a(Context context, ViewGroup viewGroup, boolean z) {
        return (CodeBlockSimpleView) LayoutInflater.from(context).inflate(R.layout.layout_rich_text_code_block_simple_view, viewGroup, z);
    }
}
