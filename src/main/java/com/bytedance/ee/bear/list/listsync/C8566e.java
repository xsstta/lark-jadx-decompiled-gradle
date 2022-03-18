package com.bytedance.ee.bear.list.listsync;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.listsync.e */
public class C8566e extends RelativeLayout {

    /* renamed from: a */
    private ProgressBar f23235a;

    /* renamed from: b */
    private ImageView f23236b;

    /* renamed from: c */
    public void mo33423c() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo33422b() {
        this.f23235a.setVisibility(0);
        this.f23236b.setVisibility(8);
    }

    /* renamed from: a */
    public void mo33421a() {
        this.f23235a.setVisibility(8);
        this.f23236b.setVisibility(0);
        setVisibility(0);
    }

    /* renamed from: d */
    private void m35737d() {
        LayoutInflater.from(getContext()).inflate(R.layout.list_layout_new_message_tip, this);
        this.f23235a = (ProgressBar) findViewById(R.id.loading);
        this.f23236b = (ImageView) findViewById(R.id.state);
    }

    public C8566e(Context context) {
        super(context);
        m35737d();
    }
}
