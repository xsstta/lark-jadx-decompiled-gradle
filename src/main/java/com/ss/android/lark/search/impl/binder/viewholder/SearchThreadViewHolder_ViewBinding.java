package com.ss.android.lark.search.impl.binder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;

public class SearchThreadViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchThreadViewHolder f131885a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SearchThreadViewHolder searchThreadViewHolder = this.f131885a;
        if (searchThreadViewHolder != null) {
            this.f131885a = null;
            searchThreadViewHolder.mThreadAvatarIV = null;
            searchThreadViewHolder.mThreadNameTV = null;
            searchThreadViewHolder.mThreadIcon = null;
            searchThreadViewHolder.mThreadDescTV = null;
            searchThreadViewHolder.mThreadTimeTV = null;
            searchThreadViewHolder.mDelayTagIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchThreadViewHolder_ViewBinding(SearchThreadViewHolder searchThreadViewHolder, View view) {
        this.f131885a = searchThreadViewHolder;
        searchThreadViewHolder.mThreadAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.thread_avatar, "field 'mThreadAvatarIV'", ImageView.class);
        searchThreadViewHolder.mThreadNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.thread_name, "field 'mThreadNameTV'", TextView.class);
        searchThreadViewHolder.mThreadIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.feed_thread_icon, "field 'mThreadIcon'", ImageView.class);
        searchThreadViewHolder.mThreadDescTV = (EllipsizedEmojiconTextView) Utils.findRequiredViewAsType(view, R.id.thread_description, "field 'mThreadDescTV'", EllipsizedEmojiconTextView.class);
        searchThreadViewHolder.mThreadTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.thread_time, "field 'mThreadTimeTV'", TextView.class);
        searchThreadViewHolder.mDelayTagIV = (ImageView) Utils.findOptionalViewAsType(view, R.id.delay_tag, "field 'mDelayTagIV'", ImageView.class);
    }
}
