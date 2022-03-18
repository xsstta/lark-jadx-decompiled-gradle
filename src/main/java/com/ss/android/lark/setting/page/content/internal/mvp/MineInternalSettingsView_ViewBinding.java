package com.ss.android.lark.setting.page.content.internal.mvp;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class MineInternalSettingsView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MineInternalSettingsView f134834a;

    /* renamed from: b */
    private View f134835b;

    @Override // butterknife.Unbinder
    public void unbind() {
        MineInternalSettingsView mineInternalSettingsView = this.f134834a;
        if (mineInternalSettingsView != null) {
            this.f134834a = null;
            mineInternalSettingsView.mTitleBar = null;
            mineInternalSettingsView.mDesktopTitleBar = null;
            mineInternalSettingsView.mFetchConfigBT = null;
            this.f134835b.setOnClickListener(null);
            this.f134835b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MineInternalSettingsView_ViewBinding(final MineInternalSettingsView mineInternalSettingsView, View view) {
        this.f134834a = mineInternalSettingsView;
        mineInternalSettingsView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mineInternalSettingsView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_mine_title, "field 'mDesktopTitleBar'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.fetch_latest_config, "field 'mFetchConfigBT' and method 'onFetchLatestConfig'");
        mineInternalSettingsView.mFetchConfigBT = (TextView) Utils.castView(findRequiredView, R.id.fetch_latest_config, "field 'mFetchConfigBT'", TextView.class);
        this.f134835b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView_ViewBinding.C545371 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                mineInternalSettingsView.onFetchLatestConfig();
            }
        });
    }
}
