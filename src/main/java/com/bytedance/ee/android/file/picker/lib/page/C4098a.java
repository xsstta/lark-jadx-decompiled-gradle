package com.bytedance.ee.android.file.picker.lib.page;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.android.file.picker.lib.page.a */
public class C4098a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public View f12418a;

    /* renamed from: b */
    public CheckBox f12419b;

    /* renamed from: c */
    public View f12420c;

    /* renamed from: d */
    public ImageView f12421d;

    /* renamed from: e */
    public TextView f12422e;

    /* renamed from: f */
    public TextView f12423f;

    /* renamed from: g */
    public TextView f12424g;

    /* renamed from: h */
    public View f12425h;

    public C4098a(View view, LocalFilePickerAdapter.Mode mode) {
        super(view);
        this.f12418a = view.findViewById(R.id.layout_file_select);
        this.f12419b = (CheckBox) view.findViewById(R.id.checkbox_file_select);
        this.f12420c = view.findViewById(R.id.layout_file_icon);
        this.f12421d = (ImageView) view.findViewById(R.id.image_file_icon);
        this.f12422e = (TextView) view.findViewById(R.id.text_file_name);
        this.f12423f = (TextView) view.findViewById(R.id.text_file_size);
        this.f12424g = (TextView) view.findViewById(R.id.text_video_duration);
        this.f12425h = view.findViewById(R.id.right_remove_image_layout);
        if (mode == LocalFilePickerAdapter.Mode.SELECT) {
            this.f12419b.setVisibility(0);
            this.f12425h.setVisibility(4);
        } else if (mode == LocalFilePickerAdapter.Mode.CONFIRM) {
            view.setBackgroundColor(UIHelper.f12487a.mo16123b(view.getContext(), R.color.bg_body));
            this.f12419b.setVisibility(8);
            this.f12425h.setVisibility(0);
        }
    }
}
