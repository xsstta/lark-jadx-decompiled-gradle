package com.ss.android.lark.feed.app.shortcut;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.ss.android.lark.feed.app.view.ShortCutRecyclerView;
import com.ss.android.lark.feed.app.view.ShortcutFeedItemView;

public class ShortcutViewHolder extends RecyclerView.ViewHolder {
    @BindView(6286)
    public View mContentView;
    @BindView(6924)
    public ShortCutRecyclerView mShortcutRV;

    public ShortcutViewHolder(ShortcutFeedItemView shortcutFeedItemView) {
        super(shortcutFeedItemView);
        this.mContentView = shortcutFeedItemView;
        this.mShortcutRV = shortcutFeedItemView.f97427i;
    }
}
