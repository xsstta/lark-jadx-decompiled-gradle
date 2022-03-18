package com.ss.android.lark.mediapicker.album;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;

/* renamed from: com.ss.android.lark.mediapicker.album.d */
public class C44667d extends AbstractC44634d.AbstractC44638a {

    /* renamed from: a */
    public TextView f113188a;

    /* renamed from: b */
    private ImageView f113189b;

    /* renamed from: c */
    private CheckBox f113190c;

    /* renamed from: d */
    private View f113191d;

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: a */
    public ImageView mo158136a() {
        return this.f113189b;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: b */
    public CheckBox mo158137b() {
        return this.f113190c;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: c */
    public View mo158138c() {
        return this.f113191d;
    }

    /* renamed from: d */
    public TextView mo158251d() {
        return this.f113188a;
    }

    public C44667d(View view) {
        super(view);
        this.f113189b = (ImageView) view.findViewById(R.id.iv_photo);
        this.f113190c = (CheckBox) view.findViewById(R.id.v_selected);
        this.f113191d = view.findViewById(R.id.v_mask);
        this.f113188a = (TextView) view.findViewById(R.id.tv_duration);
        view.findViewById(R.id.video_info_container).setVisibility(0);
    }
}
