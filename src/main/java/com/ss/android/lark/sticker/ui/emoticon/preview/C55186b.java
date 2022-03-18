package com.ss.android.lark.sticker.ui.emoticon.preview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.b */
public class C55186b extends BaseFragment {

    /* renamed from: a */
    public View f136227a;

    /* renamed from: b */
    private C55192e f136228b;

    /* renamed from: c */
    private StickerPreviewView.AbstractC55181a f136229c = new StickerPreviewView.AbstractC55181a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.preview.C55186b.C551871 */

        @Override // com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.AbstractC55181a
        /* renamed from: a */
        public void mo188150a() {
            C55186b.this.finish();
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.AbstractC55181a
        /* renamed from: a */
        public void mo188151a(StickerPreviewView stickerPreviewView) {
            ButterKnife.bind(stickerPreviewView, C55186b.this.f136227a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C55192e eVar = this.f136228b;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: a */
    private void m214120a() {
        StickerSetInfo stickerSetInfo = (StickerSetInfo) getArguments().getSerializable("key_sticker_set_info");
        if (stickerSetInfo == null) {
            finish();
            return;
        }
        C55192e eVar = new C55192e(new StickerPreviewView(getActivity(), this.f136229c), stickerSetInfo);
        this.f136228b = eVar;
        eVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f136227a = layoutInflater.inflate(R.layout.fragment_sticker_preview, viewGroup, false);
        m214120a();
        return this.f136227a;
    }
}
