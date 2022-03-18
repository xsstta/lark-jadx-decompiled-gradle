package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;

public class VcTabLoadPage extends FrameLayout {

    /* renamed from: a */
    private ImageView f159688a;

    /* renamed from: b */
    private TextView f159689b;

    /* renamed from: c */
    private LKUIStatus f159690c;

    /* renamed from: d */
    private View f159691d;

    public enum VcTabLoadType {
        LOAD_NO_NET,
        LOAD_ERROR,
        LOAD_LOADING,
        LOAD_SUC
    }

    /* renamed from: a */
    private void m247947a() {
        LayoutInflater.from(getContext()).inflate(R.layout.vc_tab_loading_page, (ViewGroup) this, true);
        this.f159691d = findViewById(R.id.vc_loading_error_container);
        this.f159688a = (ImageView) findViewById(R.id.vc_loading_icon);
        this.f159689b = (TextView) findViewById(R.id.vc_loading_text);
        this.f159690c = new LKUIStatus.C25680a(this).mo89859a();
    }

    public VcTabLoadPage(Context context) {
        this(context, null);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f159691d.setOnClickListener(new View.OnClickListener(onClickListener) {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabLoadPage$JbAyVgFzxfrmYxXwVBjxtCINe3c */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                VcTabLoadPage.lambda$JbAyVgFzxfrmYxXwVBjxtCINe3c(VcTabLoadPage.this, this.f$1, view);
            }
        });
    }

    /* renamed from: a */
    public void mo219055a(VcTabLoadType vcTabLoadType) {
        if (vcTabLoadType == VcTabLoadType.LOAD_ERROR) {
            setVisibility(0);
            this.f159691d.setVisibility(0);
            this.f159690c.mo89848e();
            this.f159689b.setText(R.string.View_G_SomethingWentWrong);
            this.f159688a.setImageResource(R.drawable.illustration_placeholder_common_load_failed);
        } else if (vcTabLoadType == VcTabLoadType.LOAD_NO_NET) {
            setVisibility(0);
            this.f159691d.setVisibility(0);
            this.f159690c.mo89848e();
            this.f159688a.setImageResource(R.drawable.icon_offline);
            this.f159689b.setText(R.string.View_G_ConnectionError);
        } else if (vcTabLoadType == VcTabLoadType.LOAD_LOADING) {
            setVisibility(0);
            this.f159691d.setVisibility(4);
            this.f159690c.mo89837a();
        } else if (vcTabLoadType == VcTabLoadType.LOAD_SUC) {
            setVisibility(4);
            this.f159690c.mo89848e();
        }
    }

    public VcTabLoadPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247948a(View.OnClickListener onClickListener, View view) {
        mo219055a(VcTabLoadType.LOAD_LOADING);
        onClickListener.onClick(view);
    }

    public VcTabLoadPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247947a();
    }
}
