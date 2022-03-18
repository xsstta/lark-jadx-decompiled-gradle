package com.ss.android.lark.favorite.common.post;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class PostMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PostMessageHolder f95471a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PostMessageHolder postMessageHolder = this.f95471a;
        if (postMessageHolder != null) {
            this.f95471a = null;
            postMessageHolder.mSaveBoxPostContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PostMessageHolder_ViewBinding(PostMessageHolder postMessageHolder, View view) {
        this.f95471a = postMessageHolder;
        postMessageHolder.mSaveBoxPostContent = (PostView) Utils.findRequiredViewAsType(view, R.id.savebox_post_content, "field 'mSaveBoxPostContent'", PostView.class);
    }
}
