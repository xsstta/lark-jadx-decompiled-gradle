package com.ss.android.lark.favorite.common.p1840b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;

/* renamed from: com.ss.android.lark.favorite.common.b.b */
public class C37106b extends AbstractC37119a {

    /* renamed from: a */
    public View f95368a;

    /* renamed from: b */
    public TextView f95369b;

    /* renamed from: c */
    public TextView f95370c;

    /* renamed from: d */
    public ImageView f95371d;

    /* renamed from: e */
    public TextView f95372e;

    /* renamed from: f */
    public ImageView f95373f;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.thread_merge_forward_content_item, viewGroup, true);
        this.f95368a = inflate.findViewById(R.id.root);
        this.f95369b = (TextView) inflate.findViewById(R.id.merge_forward_title);
        this.f95370c = (TextView) inflate.findViewById(R.id.merge_forward_content);
        this.f95371d = (ImageView) inflate.findViewById(R.id.merge_forward_image);
        this.f95372e = (TextView) inflate.findViewById(R.id.merge_forward_from);
        this.f95373f = (ImageView) inflate.findViewById(R.id.merge_forward_from_iv);
    }
}
