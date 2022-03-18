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

/* renamed from: com.ss.android.lark.guide.biz.a.c.a */
public class C38574a implements Component {

    /* renamed from: a */
    public View.OnClickListener f99113a;

    /* renamed from: b */
    private WeakReference<View> f99114b;

    /* renamed from: c */
    private String f99115c;

    /* renamed from: d */
    private String f99116d;

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141300a() {
        return 5;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141303a(LinearLayout linearLayout, Size size, int i) {
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141304b() {
        return 0;
    }

    /* renamed from: a */
    private void m152138a(View view) {
        View view2 = this.f99114b.get();
        if (view2 != null) {
            view.setTranslationY((float) ((view2.getMeasuredHeight() / 2) - (UIUtils.getHeight(view) / 2)));
        }
    }

    /* renamed from: a */
    private void m152139a(LinearLayout linearLayout, final IGuide fVar) {
        ((TextView) linearLayout.findViewById(R.id.tip_content)).setText(this.f99115c);
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_confirm);
        textView.setText(this.f99116d);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38574a.View$OnClickListenerC385751 */

            public void onClick(View view) {
                fVar.mo141708c();
                if (C38574a.this.f99113a != null) {
                    C38574a.this.f99113a.onClick(view);
                }
            }
        });
        m152138a(linearLayout.findViewById(R.id.left_arrow));
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar) {
        LayoutInflater.from(context).inflate(R.layout.guide_tenant_switch, linearLayout);
        m152139a(linearLayout, fVar);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141305b(LinearLayout linearLayout, Size size, Rect rect) {
        View view = this.f99114b.get();
        if (view == null) {
            return 0;
        }
        return (-view.getMeasuredHeight()) / 2;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141301a(LinearLayout linearLayout, Size size, Rect rect) {
        View view = this.f99114b.get();
        if (view == null) {
            return 0;
        }
        return (view.getMeasuredWidth() / 2) - linearLayout.findViewById(R.id.left_arrow).getMeasuredWidth();
    }

    public C38574a(View view, String str, String str2, View.OnClickListener onClickListener) {
        this.f99114b = new WeakReference<>(view);
        this.f99115c = str;
        this.f99116d = str2;
        this.f99113a = onClickListener;
    }
}
