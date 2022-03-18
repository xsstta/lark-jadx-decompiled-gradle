package com.ss.android.lark.filedetail.impl.open.textfile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment;
import com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView;

/* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.b */
public class C38328b extends BaseFileOpenFragment {

    /* renamed from: b */
    private C38331d f98408b;

    /* renamed from: c */
    private OpenTextFileView.AbstractC38322a f98409c = new OpenTextFileView.AbstractC38322a() {
        /* class com.ss.android.lark.filedetail.impl.open.textfile.C38328b.C383291 */

        @Override // com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView.AbstractC38322a
        /* renamed from: a */
        public void mo140123a() {
            C38328b.this.finish();
        }

        @Override // com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileView.AbstractC38322a
        /* renamed from: a */
        public void mo140124a(OpenTextFileView openTextFileView) {
            ButterKnife.bind(openTextFileView, C38328b.this.f98286a);
        }
    };

    @Override // com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment
    /* renamed from: a */
    public int mo140011a() {
        return R.layout.fragment_text_file_browser_content;
    }

    /* renamed from: b */
    private void m150790b() {
        C38331d dVar = new C38331d(new C38330c(), new OpenTextFileView(this.f98409c, getActivity()), getArguments());
        this.f98408b = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment
    /* renamed from: a */
    public void mo140012a(View view) {
        this.f98408b.mo140127a(view);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m150790b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment, com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
