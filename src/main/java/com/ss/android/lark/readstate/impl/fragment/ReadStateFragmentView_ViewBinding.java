package com.ss.android.lark.readstate.impl.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class ReadStateFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReadStateFragmentView f131394a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ReadStateFragmentView readStateFragmentView = this.f131394a;
        if (readStateFragmentView != null) {
            this.f131394a = null;
            readStateFragmentView.mPtrLayout = null;
            readStateFragmentView.mRecyclerView = null;
            readStateFragmentView.mEmptyHintImageView = null;
            readStateFragmentView.mEmptyHintTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ReadStateFragmentView_ViewBinding(ReadStateFragmentView readStateFragmentView, View view) {
        this.f131394a = readStateFragmentView;
        readStateFragmentView.mPtrLayout = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_layout, "field 'mPtrLayout'", LKUIPtrClassicFrameLayout.class);
        readStateFragmentView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        readStateFragmentView.mEmptyHintImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.empty_hint_img, "field 'mEmptyHintImageView'", ImageView.class);
        readStateFragmentView.mEmptyHintTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.empty_hint_text, "field 'mEmptyHintTextView'", TextView.class);
    }
}
