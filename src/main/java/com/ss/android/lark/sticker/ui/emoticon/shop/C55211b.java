package com.ss.android.lark.sticker.ui.emoticon.shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.b */
public class C55211b extends BaseFragment {

    /* renamed from: a */
    public View f136268a;

    /* renamed from: b */
    private C55218e f136269b;

    /* renamed from: c */
    private StickerSetShopView.AbstractC55206a f136270c = new StickerSetShopView.AbstractC55206a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55211b.C552121 */

        @Override // com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.AbstractC55206a
        /* renamed from: a */
        public void mo188207a() {
            C55211b.this.finish();
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.AbstractC55206a
        /* renamed from: a */
        public void mo188208a(StickerSetShopView stickerSetShopView) {
            ButterKnife.bind(stickerSetShopView, C55211b.this.f136268a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55218e eVar = this.f136269b;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m214191a() {
        C55218e eVar = new C55218e(new StickerSetShopView(getActivity(), this.f136270c));
        this.f136269b = eVar;
        eVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f136268a = layoutInflater.inflate(R.layout.fragment_sticker_set_shop, viewGroup, false);
        m214191a();
        return this.f136268a;
    }
}
