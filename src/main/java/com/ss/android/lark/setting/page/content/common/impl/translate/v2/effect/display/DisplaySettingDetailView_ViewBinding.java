package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class DisplaySettingDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DisplaySettingDetailView f134468a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DisplaySettingDetailView displaySettingDetailView = this.f134468a;
        if (displaySettingDetailView != null) {
            this.f134468a = null;
            displaySettingDetailView.mTitleBar = null;
            displaySettingDetailView.mDetailItemContainer = null;
            displaySettingDetailView.mDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DisplaySettingDetailView_ViewBinding(DisplaySettingDetailView displaySettingDetailView, View view) {
        this.f134468a = displaySettingDetailView;
        displaySettingDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        displaySettingDetailView.mDetailItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.detail_item_container, "field 'mDetailItemContainer'", LinearLayout.class);
        displaySettingDetailView.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.description, "field 'mDescription'", TextView.class);
    }
}
