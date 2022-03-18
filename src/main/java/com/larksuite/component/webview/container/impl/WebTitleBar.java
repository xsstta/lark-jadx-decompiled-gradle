package com.larksuite.component.webview.container.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.C57580a;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.ArrayList;
import java.util.List;

public class WebTitleBar extends LinearLayout implements View.OnClickListener, IActionTitlebar {

    /* renamed from: a */
    TextView f63924a;

    /* renamed from: b */
    TextView f63925b;

    /* renamed from: c */
    private final List<IActionTitlebar.Action> f63926c = new ArrayList();

    /* renamed from: d */
    private LinearLayout f63927d;

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void removeAllActions() {
        this.f63927d.removeAllViews();
        this.f63926c.clear();
    }

    /* renamed from: a */
    private void m93491a() {
        LayoutInflater.from(getContext()).inflate(R.layout.activity_nonaction_title, (ViewGroup) this, true);
        this.f63924a = (TextView) getRootView().findViewById(R.id.main_title);
        this.f63925b = (TextView) getRootView().findViewById(R.id.back_title);
        this.f63927d = (LinearLayout) findViewById(R.id.web_title_right_acion_container);
        setRate(BitmapDescriptorFactory.HUE_RED);
    }

    public WebTitleBar(Context context) {
        super(context);
        m93491a();
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public View addAction(IActionTitlebar.Action action) {
        return m93490a(action, this.f63927d.getChildCount());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof IActionTitlebar.Action) {
            ((IActionTitlebar.Action) tag).performAction(view);
        }
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void setTitle(CharSequence charSequence) {
        this.f63925b.setText(charSequence);
        this.f63924a.setText(charSequence);
    }

    public void setRate(float f) {
        if (f <= 0.6f) {
            this.f63925b.setVisibility(8);
            this.f63924a.setVisibility(0);
            this.f63924a.setAlpha(1.0f - (f / 0.6f));
        } else if (f <= 0.6f || f > 0.7f) {
            this.f63925b.setVisibility(0);
            this.f63924a.setVisibility(8);
            this.f63925b.setAlpha((f - 0.7f) / 0.3f);
        } else {
            this.f63925b.setVisibility(8);
            this.f63924a.setVisibility(8);
        }
    }

    public WebTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93491a();
    }

    /* renamed from: a */
    private View m93490a(IActionTitlebar.Action action, int i) {
        if (action == null) {
            return null;
        }
        this.f63926c.add(action);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        View a = C57580a.m223596a(getContext(), action);
        a.setTag(action);
        a.setOnClickListener(this);
        this.f63927d.addView(a, i, layoutParams);
        return a;
    }

    public WebTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93491a();
    }
}
