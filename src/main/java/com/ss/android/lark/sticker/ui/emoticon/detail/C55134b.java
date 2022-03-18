package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.b */
public class C55134b extends BaseFragment {

    /* renamed from: a */
    public View f136151a;

    /* renamed from: b */
    private C55140e f136152b;

    /* renamed from: c */
    private StickerSetDetailView.AbstractC55129a f136153c = new StickerSetDetailView.AbstractC55129a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.detail.C55134b.C551351 */

        @Override // com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.AbstractC55129a
        /* renamed from: a */
        public void mo188064a() {
            C55134b.this.finish();
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.AbstractC55129a
        /* renamed from: a */
        public void mo188065a(StickerSetDetailView stickerSetDetailView) {
            ButterKnife.bind(stickerSetDetailView, C55134b.this.f136151a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C55140e eVar = this.f136152b;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: a */
    private void m213978a() {
        StickerSet stickerSet = (StickerSet) getArguments().getSerializable("sticker_set");
        String string = getArguments().getString("sticker_set_id");
        StickerSetDetailView stickerSetDetailView = new StickerSetDetailView(getActivity(), this.f136153c);
        if (stickerSet != null) {
            this.f136152b = new C55140e(stickerSetDetailView, stickerSet);
        } else if (!TextUtils.isEmpty(string)) {
            this.f136152b = new C55140e(stickerSetDetailView, string);
        } else {
            getActivity().finish();
            return;
        }
        this.f136152b.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f136151a = layoutInflater.inflate(R.layout.fragment_sticker_set_detail, viewGroup, false);
        m213978a();
        return this.f136151a;
    }
}
