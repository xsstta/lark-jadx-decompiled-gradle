package com.ss.android.lark.favorite.common.p1839a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;

/* renamed from: com.ss.android.lark.favorite.common.a.b */
public class C37097b extends AbstractC37119a {

    /* renamed from: a */
    public View f95334a;

    /* renamed from: b */
    public TextView f95335b;

    /* renamed from: c */
    public TextView f95336c;

    /* renamed from: d */
    public ImageView f95337d;

    /* renamed from: e */
    public View f95338e;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.save_item_location_layout, viewGroup, true);
        this.f95334a = inflate.findViewById(R.id.favorite_location_bubble);
        this.f95335b = (TextView) inflate.findViewById(R.id.favorite_location_title);
        this.f95336c = (TextView) inflate.findViewById(R.id.favorite_location_desc);
        this.f95337d = (ImageView) inflate.findViewById(R.id.favorite_location_image);
        this.f95338e = inflate.findViewById(R.id.favorite_location_image_loading);
    }
}
