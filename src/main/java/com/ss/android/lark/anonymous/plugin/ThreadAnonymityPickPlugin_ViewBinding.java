package com.ss.android.lark.anonymous.plugin;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class ThreadAnonymityPickPlugin_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadAnonymityPickPlugin f72228a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadAnonymityPickPlugin threadAnonymityPickPlugin = this.f72228a;
        if (threadAnonymityPickPlugin != null) {
            this.f72228a = null;
            threadAnonymityPickPlugin.mAnonymityPickRv = null;
            threadAnonymityPickPlugin.mAnonymityPickTitleTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadAnonymityPickPlugin_ViewBinding(ThreadAnonymityPickPlugin threadAnonymityPickPlugin, View view) {
        this.f72228a = threadAnonymityPickPlugin;
        threadAnonymityPickPlugin.mAnonymityPickRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.anonymity_pick_rv, "field 'mAnonymityPickRv'", RecyclerView.class);
        threadAnonymityPickPlugin.mAnonymityPickTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.anonymity_pick_title_tv, "field 'mAnonymityPickTitleTv'", TextView.class);
    }
}
