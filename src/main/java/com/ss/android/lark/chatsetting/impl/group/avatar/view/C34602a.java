package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.view.a */
public class C34602a extends BaseAdapter {

    /* renamed from: a */
    private int[] f89350a;

    /* renamed from: b */
    private int f89351b = -1;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f89350a.length;
    }

    public C34602a(int[] iArr) {
        this.f89350a = iArr;
    }

    public Object getItem(int i) {
        return Integer.valueOf(this.f89350a[i]);
    }

    /* renamed from: a */
    public int mo127840a(int i) {
        if (i < 0 || i >= getCount()) {
            return 0;
        }
        int i2 = this.f89351b;
        if (i2 == i) {
            return this.f89350a[i2];
        }
        this.f89351b = i;
        notifyDataSetChanged();
        return this.f89350a[this.f89351b];
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_color, (ViewGroup) null);
        CheckImageView checkImageView = (CheckImageView) inflate.findViewById(R.id.img_color);
        checkImageView.setBackground(new C34604c(this.f89350a[i]));
        if (this.f89351b == i) {
            checkImageView.setChecked(true);
        } else {
            checkImageView.setChecked(false);
        }
        return inflate;
    }
}
