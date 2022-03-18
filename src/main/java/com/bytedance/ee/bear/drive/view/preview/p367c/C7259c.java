package com.bytedance.ee.bear.drive.view.preview.p367c;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.bizwidget.deletepage.OwnerDeleteFileView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.c.c */
public class C7259c {

    /* renamed from: a */
    private Context f19463a;

    /* renamed from: a */
    public View mo28361a() {
        OwnerDeleteFileView ownerDeleteFileView = new OwnerDeleteFileView(this.f19463a);
        ownerDeleteFileView.mo19133a(R.string.Drive_Drive_FileDeleted, false);
        return ownerDeleteFileView;
    }

    public C7259c(Context context) {
        this.f19463a = context;
    }
}
