package com.bytedance.ee.bear.drive.view.preview.notfoundview;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class FileNoFoundView extends SpaceEmptyState {
    public FileNoFoundView(Context context) {
        super(context);
        mo28910a(context);
    }

    /* renamed from: a */
    public void mo28910a(Context context) {
        setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        setImageSizeResource(R.dimen.space_kit_emptystate_image_size_middle);
        setDesc(getContext().getString(R.string.Drive_Drive_DriveFileNotFoundText));
        setBackgroundColor(getResources().getColor(R.color.bg_body));
    }

    public FileNoFoundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo28910a(context);
    }

    public FileNoFoundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo28910a(context);
    }
}
