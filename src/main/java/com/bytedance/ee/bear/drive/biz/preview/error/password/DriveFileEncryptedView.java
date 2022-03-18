package com.bytedance.ee.bear.drive.biz.preview.error.password;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class DriveFileEncryptedView extends FrameLayout {

    /* renamed from: a */
    private SpaceEmptyState f18084a;

    public DriveFileEncryptedView(Context context) {
        super(context);
        m26305a(context);
    }

    public void setBtnOpenExternalVisible(boolean z) {
        this.f18084a.mo90952d(z);
    }

    public void setOnOpenExternalClickListener(View.OnClickListener onClickListener) {
        this.f18084a.setPrimaryClickListener(onClickListener);
    }

    /* renamed from: a */
    private void m26305a(Context context) {
        View.inflate(context, R.layout.drive_file_encrypted_layout, this);
        this.f18084a = (SpaceEmptyState) findViewById(R.id.file_encrypted_state);
        setBtnOpenExternalVisible(false);
    }

    public DriveFileEncryptedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26305a(context);
    }
}
