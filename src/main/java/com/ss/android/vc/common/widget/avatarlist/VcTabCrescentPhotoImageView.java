package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.suite.R;
import com.ss.android.shapeimage.p3023b.AbstractC59984a;
import com.ss.android.vc.common.widget.avatarlist.VcCrescentPhotoImageView;

public class VcTabCrescentPhotoImageView extends VcCrescentPhotoImageView {
    @Override // com.ss.android.shapeimage.ShaderImageView, com.ss.android.vc.common.widget.avatarlist.VcCrescentPhotoImageView
    /* renamed from: a */
    public AbstractC59984a mo126280a() {
        return new VcCrescentPhotoImageView.C60830a(R.raw.vc_tab_detail_avatar_list_item_shape);
    }

    public VcTabCrescentPhotoImageView(Context context) {
        super(context);
    }

    public VcTabCrescentPhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcTabCrescentPhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
