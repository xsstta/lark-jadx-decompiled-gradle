package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class PolicyDeniedView extends SpaceEmptyState {
    /* renamed from: a */
    private void m30332a() {
        Context context = getContext();
        setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        setImageSizeResource(R.dimen.space_kit_emptystate_image_size_middle);
        setTitle(context.getString(R.string.Drive_Drive_DisableAccessByPolicyTitle));
        setDesc(context.getString(R.string.Drive_Drive_DisableAccessByPolicyText));
        setBackgroundColor(getResources().getColor(R.color.bg_body));
        setFitsSystemWindows(true);
    }

    public PolicyDeniedView(Context context) {
        super(context);
        m30332a();
    }

    public PolicyDeniedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30332a();
    }

    public PolicyDeniedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30332a();
    }
}
