package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.service.impl.C58151d;

public class VoIPFloatIconView extends FrameLayout {

    /* renamed from: a */
    private TextView f142707a;

    /* renamed from: b */
    private TextView f142708b;

    /* renamed from: c */
    private ImageView f142709c;

    public ImageView getAvatar() {
        return this.f142709c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        C58151d.m225578a("ui", "ui", "finish float icon view inflate", "[VoIPFloatIconView] onFinishInflate");
        super.onFinishInflate();
        this.f142707a = (TextView) findViewById(R.id.icon_name);
        this.f142708b = (TextView) findViewById(R.id.icon_status);
        this.f142709c = (ImageView) findViewById(R.id.icon_head);
    }

    public VoIPFloatIconView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo196699a(Context context) {
        this.f142707a.setTextColor(context.getResources().getColor(R.color.text_title));
        this.f142708b.setTextColor(getContext().getResources().getColor(R.color.text_placeholder));
    }

    /* renamed from: b */
    public void mo196701b(String str) {
        C58151d.m225578a("ui", "ui", "update float view status " + str, "[VoIPFloatIconView] updateStatus: status = " + str);
        TextView textView = this.f142708b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo196700a(String str) {
        C58151d.m225578a("ui", "ui", "update float view name " + str, "[VoIPFloatIconView] updateName: name = " + str);
        TextView textView = this.f142707a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public VoIPFloatIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
