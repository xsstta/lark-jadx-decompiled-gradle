package com.ss.android.lark.photoeditor.impl.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.photoeditor.impl.ui.C51451d;
import com.ss.android.lark.photoeditor.impl.ui.C51456e;

/* renamed from: com.ss.android.lark.photoeditor.impl.ui.b */
public class C51443b extends BaseFragment {

    /* renamed from: a */
    private View f127985a;

    /* renamed from: b */
    private Activity f127986b;

    /* renamed from: c */
    private String f127987c;

    /* renamed from: d */
    private String f127988d;

    /* renamed from: e */
    private String f127989e;

    /* renamed from: f */
    private boolean f127990f;

    /* renamed from: g */
    private boolean f127991g;

    /* renamed from: h */
    private String f127992h;

    /* renamed from: i */
    private C51451d f127993i;

    /* renamed from: j */
    private C51456e.AbstractC51465a f127994j = new C51456e.AbstractC51465a() {
        /* class com.ss.android.lark.photoeditor.impl.ui.C51443b.C514441 */

        @Override // com.ss.android.lark.photoeditor.impl.ui.C51456e.AbstractC51465a
        /* renamed from: a */
        public void mo177120a() {
            C51443b.this.finish();
        }

        @Override // com.ss.android.lark.photoeditor.impl.ui.C51456e.AbstractC51465a
        /* renamed from: b */
        public boolean mo177121b() {
            return C51443b.this.getActivity() instanceof PhotoEditorActivity;
        }
    };

    /* renamed from: k */
    private C51451d.AbstractC51455a f127995k = new C51451d.AbstractC51455a() {
        /* class com.ss.android.lark.photoeditor.impl.ui.C51443b.C514452 */

        @Override // com.ss.android.lark.photoeditor.impl.ui.C51451d.AbstractC51455a
        /* renamed from: a */
        public void mo177122a(String str) {
            Intent intent = new Intent();
            intent.putExtra("key_result_path", str);
            C51443b.this.setResult(-1, intent);
            C51443b.this.finish();
        }
    };

    /* renamed from: a */
    public void mo177119a() {
        this.f127993i.mo177130b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C51451d dVar = this.f127993i;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    /* renamed from: b */
    private boolean m199405b() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        String string = arguments.getString("key_image_url");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String string2 = arguments.getString("key_result_path");
        String string3 = arguments.getString("key_from", "");
        boolean z = arguments.getBoolean("key_show_save_btn", false);
        boolean z2 = arguments.getBoolean("key_show_forward_btn", false);
        String string4 = arguments.getString("key_file_key", "");
        Log.m165389i("PhotoEditor", "imageUrl = " + string);
        Log.m165389i("PhotoEditor", " saveResultPath = " + string2);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return false;
        }
        this.f127987c = string;
        this.f127988d = string2;
        this.f127989e = string3;
        this.f127990f = z;
        this.f127991g = z2;
        this.f127992h = string4;
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!m199405b()) {
            finish();
            return;
        }
        C51451d dVar = new C51451d(this.f127987c, this.f127988d, this.f127989e, this.f127990f, this.f127991g, this.f127992h, this.f127986b, this.f127985a, this.f127994j, this.f127995k);
        this.f127993i = dVar;
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C51451d dVar = this.f127993i;
        if (dVar != null) {
            dVar.mo177129a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f127985a = layoutInflater.inflate(R.layout.activity_photo_editor, viewGroup, false);
        this.f127986b = getActivity();
        return this.f127985a;
    }
}
