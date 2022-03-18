package com.bytedance.ee.bear.doc.blockeditpanel.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.b */
public class C5362b {
    /* renamed from: a */
    public static int m21843a(Context context, EMenuItemConfig.C5345b bVar) {
        return C13749l.m55739a(context.getResources().getColor(bVar.f15250a), (double) bVar.f15251b);
    }

    /* renamed from: a */
    public static void m21845a(View view, EMenuItemConfig.C5344a aVar) {
        if (aVar != null) {
            view.setBackgroundTintList(m21844a(view.getContext(), aVar));
        } else {
            view.setBackgroundTintList(null);
        }
    }

    /* renamed from: a */
    public static ColorStateList m21844a(Context context, EMenuItemConfig.C5344a aVar) {
        if (aVar == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{-16842913, 16842919}, new int[]{16842913, -16842919}, new int[]{16842913, 16842919}, new int[]{-16842910}, new int[0]}, new int[]{m21843a(context, aVar.f15245a), m21843a(context, aVar.f15247c), m21843a(context, aVar.f15248d), m21843a(context, aVar.f15246b), m21843a(context, aVar.f15249e)});
    }

    /* renamed from: a */
    public static void m21846a(ImageView imageView, EMenuItemConfig.C5344a aVar) {
        if (aVar != null) {
            imageView.setImageTintList(m21844a(imageView.getContext(), aVar));
        } else {
            imageView.setImageTintList(null);
        }
    }
}
