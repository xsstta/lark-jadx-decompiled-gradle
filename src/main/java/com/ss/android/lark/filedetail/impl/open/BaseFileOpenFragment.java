package com.ss.android.lark.filedetail.impl.open;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;

public abstract class BaseFileOpenFragment extends BaseFragment {

    /* renamed from: a */
    public View f98286a;
    @BindView(7956)
    protected FrameLayout mContentContainer;
    @BindView(9075)
    protected CommonTitleBar mTitleBar;

    /* renamed from: a */
    public abstract int mo140011a();

    /* renamed from: a */
    public abstract void mo140012a(View view);

    /* renamed from: b */
    private void m150642b() {
        this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.titlebar_more_bg_selector) {
            /* class com.ss.android.lark.filedetail.impl.open.BaseFileOpenFragment.C382771 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                BaseFileOpenFragment.this.mo140012a(view);
            }
        });
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m150642b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_base_file_browser, viewGroup, false);
        this.f98286a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.content_container);
        frameLayout.addView(layoutInflater.inflate(mo140011a(), (ViewGroup) frameLayout, false), 0, new FrameLayout.LayoutParams(-1, -1));
        this.mBkUnbinder = ButterKnife.bind(this, this.f98286a);
        return this.f98286a;
    }
}
