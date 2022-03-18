package com.bytedance.ee.bear.bizwidget.deletepage;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class OwnerDeleteFileView extends FrameLayout {

    /* renamed from: a */
    private BaseTitleBar f14362a;

    /* renamed from: b */
    private SpaceEmptyState f14363b;

    public OwnerDeleteFileView(Context context) {
        super(context);
        m20120a(context);
    }

    /* renamed from: a */
    private void m20120a(final Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_file_delete_by_owner_view, this);
        BaseTitleBar baseTitleBar = (BaseTitleBar) findViewById(R.id.titleBar);
        this.f14362a = baseTitleBar;
        baseTitleBar.setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.bizwidget.deletepage.OwnerDeleteFileView.C48791 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Context context = context;
                if (context instanceof Activity) {
                    ((Activity) context).onBackPressed();
                }
            }
        });
        this.f14363b = (SpaceEmptyState) findViewById(R.id.empty_state);
    }

    public OwnerDeleteFileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20120a(context);
    }

    /* renamed from: a */
    public void mo19133a(int i, boolean z) {
        int i2;
        BaseTitleBar baseTitleBar = this.f14362a;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        baseTitleBar.setVisibility(i2);
        this.f14363b.setDesc(getContext().getString(i));
    }

    public OwnerDeleteFileView(Context context, AttributeSet attributeSet, int i) {
        super(context);
        m20120a(context);
    }
}
