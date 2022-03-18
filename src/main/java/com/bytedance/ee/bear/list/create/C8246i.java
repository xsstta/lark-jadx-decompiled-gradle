package com.bytedance.ee.bear.list.create;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.create.i */
public class C8246i extends BaseQuickAdapter<SelectCreationMenuItem, C20923c> {
    public C8246i(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        return super.mo32344a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, SelectCreationMenuItem selectCreationMenuItem) {
        float f;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cVar.mo70740b(R.id.list_menu_img);
        appCompatImageView.setImageResource(selectCreationMenuItem.mo32309c());
        float f2 = 1.0f;
        if (selectCreationMenuItem.mo32310d()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        appCompatImageView.setAlpha(f);
        TextView textView = (TextView) cVar.mo70740b(R.id.list_menu_name);
        textView.setText(selectCreationMenuItem.mo32308b());
        if (!selectCreationMenuItem.mo32310d()) {
            f2 = 0.5f;
        }
        textView.setAlpha(f2);
        cVar.itemView.setTag(selectCreationMenuItem.mo32307a().tag);
    }
}
