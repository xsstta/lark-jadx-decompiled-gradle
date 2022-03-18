package com.ss.android.lark.mediapicker.album;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;

/* renamed from: com.ss.android.lark.mediapicker.album.c */
public class C44666c extends AbstractC44634d.AbstractC44638a {

    /* renamed from: a */
    private ImageView f113185a;

    /* renamed from: b */
    private CheckBox f113186b;

    /* renamed from: c */
    private View f113187c;

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: a */
    public ImageView mo158136a() {
        return this.f113185a;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: b */
    public CheckBox mo158137b() {
        return this.f113186b;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
    /* renamed from: c */
    public View mo158138c() {
        return this.f113187c;
    }

    public C44666c(View view) {
        super(view);
        this.f113185a = (ImageView) view.findViewById(R.id.iv_photo);
        this.f113186b = (CheckBox) view.findViewById(R.id.v_selected);
        this.f113187c = view.findViewById(R.id.v_mask);
        view.findViewById(R.id.video_info_container).setVisibility(8);
    }
}
