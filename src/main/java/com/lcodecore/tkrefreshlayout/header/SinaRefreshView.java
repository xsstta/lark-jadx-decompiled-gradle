package com.lcodecore.tkrefreshlayout.header;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26394b;
import com.lcodecore.tkrefreshlayout.AbstractC26398c;

public class SinaRefreshView extends FrameLayout implements AbstractC26394b {

    /* renamed from: a */
    private ImageView f65158a;

    /* renamed from: b */
    private ImageView f65159b;

    /* renamed from: c */
    private TextView f65160c;

    /* renamed from: d */
    private String f65161d;

    /* renamed from: e */
    private String f65162e;

    /* renamed from: f */
    private String f65163f;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    public View getView() {
        return this;
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93668a() {
        this.f65158a.setVisibility(0);
        this.f65159b.setVisibility(8);
        this.f65160c.setText(this.f65161d);
    }

    /* renamed from: b */
    private void m95650b() {
        View inflate = View.inflate(getContext(), R.layout.view_sinaheader, null);
        this.f65158a = (ImageView) inflate.findViewById(R.id.iv_arrow);
        this.f65160c = (TextView) inflate.findViewById(R.id.tv);
        this.f65159b = (ImageView) inflate.findViewById(R.id.iv_loading);
        addView(inflate);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93671a(AbstractC26398c cVar) {
        cVar.mo93557a();
    }

    public void setPullDownStr(String str) {
        this.f65161d = str;
    }

    public void setRefreshingStr(String str) {
        this.f65163f = str;
    }

    public void setReleaseRefreshStr(String str) {
        this.f65162e = str;
    }

    public SinaRefreshView(Context context) {
        this(context, null);
    }

    public void setArrowResource(int i) {
        this.f65158a.setImageResource(i);
    }

    public void setTextColor(int i) {
        this.f65160c.setTextColor(i);
    }

    public SinaRefreshView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93669a(float f, float f2) {
        this.f65160c.setText(this.f65163f);
        this.f65158a.setVisibility(8);
        this.f65159b.setVisibility(0);
        ((AnimationDrawable) this.f65159b.getDrawable()).start();
    }

    public SinaRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65161d = "下拉刷新";
        this.f65162e = "释放刷新";
        this.f65163f = "正在刷新";
        m95650b();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93670a(float f, float f2, float f3) {
        if (f < 1.0f) {
            this.f65160c.setText(this.f65161d);
        }
        if (f > 1.0f) {
            this.f65160c.setText(this.f65162e);
        }
        this.f65158a.setRotation(((f * f3) / f2) * 180.0f);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: b */
    public void mo93672b(float f, float f2, float f3) {
        if (f < 1.0f) {
            this.f65160c.setText(this.f65161d);
            this.f65158a.setRotation(((f * f3) / f2) * 180.0f);
            if (this.f65158a.getVisibility() == 8) {
                this.f65158a.setVisibility(0);
                this.f65159b.setVisibility(8);
            }
        }
    }
}
