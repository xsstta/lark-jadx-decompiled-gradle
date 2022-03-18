package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;

public class NoNetworkView extends UDNotice {
    public void setTip(String str) {
        setText(str);
    }

    public NoNetworkView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m30897a(Context context) {
        setType(UDNotice.Type.WARNING);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_warning_colorful);
        setText(context.getString(R.string.Doc_Facade_SyncedNextOnline));
    }

    public NoNetworkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoNetworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30897a(context);
    }
}
