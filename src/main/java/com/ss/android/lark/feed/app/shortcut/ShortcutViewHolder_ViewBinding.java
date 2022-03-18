package com.ss.android.lark.feed.app.shortcut;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.view.ShortCutRecyclerView;

public class ShortcutViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShortcutViewHolder f96991a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShortcutViewHolder shortcutViewHolder = this.f96991a;
        if (shortcutViewHolder != null) {
            this.f96991a = null;
            shortcutViewHolder.mContentView = null;
            shortcutViewHolder.mShortcutRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShortcutViewHolder_ViewBinding(ShortcutViewHolder shortcutViewHolder, View view) {
        this.f96991a = shortcutViewHolder;
        shortcutViewHolder.mContentView = Utils.findRequiredView(view, R.id.content, "field 'mContentView'");
        shortcutViewHolder.mShortcutRV = (ShortCutRecyclerView) Utils.findRequiredViewAsType(view, R.id.shortcut, "field 'mShortcutRV'", ShortCutRecyclerView.class);
    }
}
