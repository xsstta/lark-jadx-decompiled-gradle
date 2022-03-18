package com.ss.android.vc.meeting.module.livestream;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.meeting.module.livestream.e */
public class C62066e {

    /* renamed from: a */
    public View f155914a;

    /* renamed from: b */
    public SquircleImageView f155915b;

    /* renamed from: c */
    public ImageView f155916c;

    /* renamed from: d */
    public TextView f155917d;

    /* renamed from: a */
    public void mo214806a(View view) {
        this.f155914a = view.findViewById(R.id.function_item);
        this.f155915b = (SquircleImageView) view.findViewById(R.id.function_icon);
        this.f155917d = (TextView) view.findViewById(R.id.function_name);
        this.f155916c = (ImageView) view.findViewById(R.id.function_onboarding);
    }
}
