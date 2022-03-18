package com.ss.android.lark.widget.photo_picker.p2943a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.a.d */
public class C58572d extends BaseAdapter {

    /* renamed from: a */
    public IRequestCreator f144614a;

    /* renamed from: b */
    private List<PhotoDirectory> f144615b = new ArrayList();

    public int getCount() {
        return this.f144615b.size();
    }

    /* renamed from: a */
    public PhotoDirectory getItem(int i) {
        return this.f144615b.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f144615b.get(i).hashCode();
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.a.d$a */
    private class C58573a {

        /* renamed from: a */
        public ImageView f144616a;

        /* renamed from: b */
        public TextView f144617b;

        /* renamed from: c */
        public TextView f144618c;

        /* renamed from: a */
        public void mo198570a(PhotoDirectory photoDirectory) {
            C58572d.this.f144614a.load(photoDirectory.getCoverPath()).thumbnail(0.1f).into(this.f144616a);
            this.f144617b.setText(photoDirectory.getName());
            this.f144618c.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerImageCount, "image_count", Integer.toString(photoDirectory.getPhotos().size())));
        }

        public C58573a(View view) {
            this.f144616a = (ImageView) view.findViewById(R.id.iv_dir_cover);
            this.f144617b = (TextView) view.findViewById(R.id.tv_dir_name);
            this.f144618c = (TextView) view.findViewById(R.id.tv_dir_count);
        }
    }

    public C58572d(IRequestCreator iRequestCreator, List<PhotoDirectory> list) {
        this.f144615b = list;
        this.f144614a = iRequestCreator;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C58573a aVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.__picker_item_directory, viewGroup, false);
            aVar = new C58573a(view);
            view.setTag(aVar);
        } else {
            aVar = (C58573a) view.getTag();
        }
        aVar.mo198570a(this.f144615b.get(i));
        return view;
    }
}
