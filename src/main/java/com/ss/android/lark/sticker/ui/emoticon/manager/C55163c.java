package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sticker.ui.C55117e;
import com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.c */
public class C55163c extends BaseFragment {

    /* renamed from: a */
    public View f136197a;

    /* renamed from: b */
    private C55170f f136198b;

    /* renamed from: c */
    private StickerSetManagerView.AbstractC55156a f136199c = new StickerSetManagerView.AbstractC55156a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55163c.C551641 */

        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.AbstractC55156a
        /* renamed from: a */
        public void mo188110a() {
            C55163c.this.finish();
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.AbstractC55156a
        /* renamed from: b */
        public void mo188112b() {
            C55117e.m213925a(C55163c.this.getActivity(), C55163c.this);
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.AbstractC55156a
        /* renamed from: a */
        public void mo188111a(StickerSetManagerView stickerSetManagerView) {
            ButterKnife.bind(stickerSetManagerView, C55163c.this.f136197a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C55170f fVar = this.f136198b;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: a */
    private void m214059a() {
        C55170f fVar = new C55170f(new StickerSetManagerView(getActivity(), this.f136199c));
        this.f136198b = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f136197a = layoutInflater.inflate(R.layout.fragment_sticker_set_manager, viewGroup, false);
        m214059a();
        return this.f136197a;
    }
}
