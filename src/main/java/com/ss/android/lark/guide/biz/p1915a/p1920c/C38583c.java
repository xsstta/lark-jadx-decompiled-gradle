package com.ss.android.lark.guide.biz.p1915a.p1920c;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.Component;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.guide.biz.a.c.c */
public class C38583c implements Component {

    /* renamed from: a */
    public View.OnClickListener f99131a;

    /* renamed from: b */
    private WeakReference<View> f99132b;

    /* renamed from: c */
    private String f99133c;

    /* renamed from: d */
    private String f99134d;

    /* renamed from: e */
    private Rect f99135e;

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141300a() {
        return 3;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141303a(LinearLayout linearLayout, Size size, int i) {
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141304b() {
        return 16;
    }

    /* renamed from: a */
    private void m152155a(LinearLayout linearLayout, final IGuide fVar) {
        ((TextView) linearLayout.findViewById(R.id.tip_content)).setText(this.f99133c);
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_confirm);
        textView.setText(this.f99134d);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38583c.View$OnClickListenerC385841 */

            public void onClick(View view) {
                fVar.mo141708c();
                if (C38583c.this.f99131a != null) {
                    C38583c.this.f99131a.onClick(view);
                }
            }
        });
        View findViewById = linearLayout.findViewById(R.id.left_arrow);
        findViewById.setTranslationY((float) ((UIUtils.getHeight(linearLayout) / 2) - (findViewById.getMeasuredHeight() / 2)));
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar) {
        LayoutInflater.from(context).inflate(R.layout.guide_tenant_switch, linearLayout);
        m152155a(linearLayout, fVar);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141305b(LinearLayout linearLayout, Size size, Rect rect) {
        return -linearLayout.findViewById(R.id.left_arrow).getMeasuredWidth();
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141301a(LinearLayout linearLayout, Size size, Rect rect) {
        return (((this.f99135e.top + this.f99135e.bottom) / 2) - (linearLayout.getMeasuredHeight() / 2)) - rect.top;
    }

    public C38583c(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener) {
        this.f99132b = new WeakReference<>(view);
        this.f99133c = str;
        this.f99134d = str2;
        this.f99131a = onClickListener;
        this.f99135e = rect;
    }
}
