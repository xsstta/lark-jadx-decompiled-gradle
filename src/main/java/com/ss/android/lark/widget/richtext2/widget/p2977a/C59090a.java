package com.ss.android.lark.widget.richtext2.widget.p2977a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext2.entity.ChildViewParseResult;
import com.ss.android.lark.widget.richtext2.entity.ImageParseResult;
import com.ss.android.lark.widget.richtext2.widget.C59089a;
import com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.a.a */
public class C59090a extends LinearLayout {

    /* renamed from: a */
    private Context f146500a;

    private C59090a(Context context) {
        super(context);
        this.f146500a = context;
        setOrientation(0);
    }

    /* renamed from: a */
    private void m229513a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(C59089a.m229508a());
        }
        addView(view);
    }

    /* renamed from: a */
    private void m229514a(ChildViewParseResult childViewParseResult) {
        if (childViewParseResult.isInQuote()) {
            View view = new View(this.f146500a);
            view.setBackgroundColor(UIHelper.getColor(R.color.lkui_B500));
            int dimens = UIHelper.getDimens(R.dimen.li_prefix_quote_width);
            int dimens2 = UIHelper.getDimens(R.dimen.li_prefix_quote_right_margin);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens, -1);
            layoutParams.rightMargin = dimens2;
            addView(view, layoutParams);
        }
        TextView textView = new TextView(this.f146500a);
        textView.setTextSize(0, (float) UIHelper.getDimens(R.dimen.local_font_size_default));
        addView(textView, new LinearLayout.LayoutParams(childViewParseResult.getLeftMargin(), -2));
    }

    /* renamed from: a */
    private static int m229511a(ImageParseResult imageParseResult, LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0 || (linearLayout.getChildAt(childCount - 1) instanceof SimpleRichTextView)) {
            return 0;
        }
        return C59089a.m229504a(childCount, imageParseResult.isInQuote(), false);
    }

    /* renamed from: a */
    public static void m229512a(Context context, View view, ChildViewParseResult childViewParseResult, LinearLayout linearLayout) {
        C59090a aVar = new C59090a(context);
        aVar.m229514a(childViewParseResult);
        aVar.m229513a(view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (childViewParseResult instanceof ImageParseResult) {
            layoutParams.topMargin = m229511a((ImageParseResult) childViewParseResult, linearLayout);
        } else {
            layoutParams.topMargin = C59089a.m229504a(linearLayout.getChildCount(), childViewParseResult.isInQuote(), false);
        }
        linearLayout.addView(aVar, layoutParams);
    }
}
