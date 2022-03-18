package com.ss.android.lark.search.impl.func.chatinside.view.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SpacePickViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SpacePickViewHolder f132245a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SpacePickViewHolder spacePickViewHolder = this.f132245a;
        if (spacePickViewHolder != null) {
            this.f132245a = null;
            spacePickViewHolder.mSpaceTypeTV = null;
            spacePickViewHolder.mSpaceTypeIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SpacePickViewHolder_ViewBinding(SpacePickViewHolder spacePickViewHolder, View view) {
        this.f132245a = spacePickViewHolder;
        spacePickViewHolder.mSpaceTypeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.space_pick_tv, "field 'mSpaceTypeTV'", TextView.class);
        spacePickViewHolder.mSpaceTypeIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.space_pick_iv, "field 'mSpaceTypeIV'", ImageView.class);
    }
}
