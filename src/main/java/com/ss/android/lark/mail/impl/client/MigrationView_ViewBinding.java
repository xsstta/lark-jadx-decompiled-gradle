package com.ss.android.lark.mail.impl.client;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class MigrationView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MigrationView f106219a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MigrationView migrationView = this.f106219a;
        if (migrationView != null) {
            this.f106219a = null;
            migrationView.mRecyclerView = null;
            migrationView.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MigrationView_ViewBinding(MigrationView migrationView, View view) {
        this.f106219a = migrationView;
        migrationView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.mail_migration_detail_list, "field 'mRecyclerView'", RecyclerView.class);
        migrationView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
