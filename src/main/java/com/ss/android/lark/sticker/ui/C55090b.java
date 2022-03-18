package com.ss.android.lark.sticker.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.sticker.ui.C55108d;
import com.ss.android.lark.sticker.ui.p2718c.C55096a;
import com.ss.android.lark.sticker.ui.view.StickerListView;
import com.ss.android.lark.widget.photo_picker.C58557a;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.b */
public class C55090b extends BaseFragment {

    /* renamed from: a */
    public View f136059a;

    /* renamed from: b */
    public Activity f136060b;

    /* renamed from: c */
    C55108d f136061c;

    /* renamed from: d */
    C55108d.AbstractC55111c f136062d = new C55108d.AbstractC55111c() {
        /* class com.ss.android.lark.sticker.ui.C55090b.C550922 */

        @Override // com.ss.android.lark.sticker.ui.C55108d.AbstractC55111c
        /* renamed from: a */
        public void mo188007a(Intent intent) {
            C55090b.this.setResult(-1, intent);
        }
    };

    /* renamed from: e */
    private StickerListView.AbstractC55240a f136063e = new StickerListView.AbstractC55240a() {
        /* class com.ss.android.lark.sticker.ui.C55090b.C550911 */

        @Override // com.ss.android.lark.sticker.ui.view.StickerListView.AbstractC55240a
        /* renamed from: b */
        public void mo188006b() {
            C55090b.this.finish();
        }

        @Override // com.ss.android.lark.sticker.ui.view.StickerListView.AbstractC55240a
        /* renamed from: a */
        public void mo188004a() {
            C58557a.m227127a().mo198526i(false).mo198524g(true).mo198525h(false).mo198531n(false).mo198532o(false).mo198512a(C55090b.this.f136060b, C55090b.this, 233);
        }

        @Override // com.ss.android.lark.sticker.ui.view.StickerListView.AbstractC55240a
        /* renamed from: a */
        public void mo188005a(StickerListView stickerListView) {
            ButterKnife.bind(stickerListView, C55090b.this.f136059a);
        }
    };

    /* renamed from: a */
    public void mo188003a() {
        this.f136061c.mo188032c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f136061c.destroy();
    }

    /* renamed from: b */
    private void m213865b() {
        C55108d dVar = new C55108d(new C55096a(), new StickerListView(this.f136063e, this.f136060b), this.f136062d);
        this.f136061c = dVar;
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m213865b();
    }

    /* renamed from: a */
    private void m213864a(List<String> list, boolean z) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.f136061c.mo188030a(list, z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 233 && intent != null) {
            m213864a(intent.getStringArrayListExtra("SELECTED_PHOTOS"), intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f136059a = layoutInflater.inflate(R.layout.activity_sticker_manager, viewGroup, false);
        this.f136060b = getActivity();
        return this.f136059a;
    }
}
