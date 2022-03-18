package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;

public class DetailSpanMenu extends BaseDialog {

    /* renamed from: a */
    AbstractC31454a f79704a;

    protected static class MenuViewHolder extends RecyclerView.ViewHolder {
        @BindView(9298)
        public View mDivider;
        @BindView(10297)
        public UDCheckBox mMenuCheckbox;
        @BindView(10291)
        public LinearLayout mMenuCheckboxContainer;
        @BindView(10292)
        public TextView mMenuCheckboxDesc;
        @BindView(10293)
        public LinearLayout mMenuContainer;
        @BindView(10295)
        public ImageView mMenuIcon;
        @BindView(10296)
        public TextView mMenuItem;
        @BindView(10298)
        public LinearLayout mMenuItemContainer;
        @BindView(10299)
        public TextView mMenuItemDesc;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.DetailSpanMenu$a */
    public interface AbstractC31454a {
        /* renamed from: a */
        void mo114132a();
    }

    public void onBackPressed() {
        AbstractC31454a aVar = this.f79704a;
        if (aVar != null) {
            aVar.mo114132a();
        }
        super.onBackPressed();
    }

    public class MenuViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MenuViewHolder f79705a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuViewHolder menuViewHolder = this.f79705a;
            if (menuViewHolder != null) {
                this.f79705a = null;
                menuViewHolder.mMenuContainer = null;
                menuViewHolder.mMenuItemContainer = null;
                menuViewHolder.mMenuItem = null;
                menuViewHolder.mMenuIcon = null;
                menuViewHolder.mMenuItemDesc = null;
                menuViewHolder.mMenuCheckboxContainer = null;
                menuViewHolder.mMenuCheckbox = null;
                menuViewHolder.mMenuCheckboxDesc = null;
                menuViewHolder.mDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MenuViewHolder_ViewBinding(MenuViewHolder menuViewHolder, View view) {
            this.f79705a = menuViewHolder;
            menuViewHolder.mMenuContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.menu_container, "field 'mMenuContainer'", LinearLayout.class);
            menuViewHolder.mMenuItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.menu_item_container, "field 'mMenuItemContainer'", LinearLayout.class);
            menuViewHolder.mMenuItem = (TextView) Utils.findRequiredViewAsType(view, R.id.menu_item, "field 'mMenuItem'", TextView.class);
            menuViewHolder.mMenuIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.menu_icon, "field 'mMenuIcon'", ImageView.class);
            menuViewHolder.mMenuItemDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.menu_item_desc, "field 'mMenuItemDesc'", TextView.class);
            menuViewHolder.mMenuCheckboxContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.menu_checkbox_container, "field 'mMenuCheckboxContainer'", LinearLayout.class);
            menuViewHolder.mMenuCheckbox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.menu_item_checkbox, "field 'mMenuCheckbox'", UDCheckBox.class);
            menuViewHolder.mMenuCheckboxDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.menu_checkbox_desc, "field 'mMenuCheckboxDesc'", TextView.class);
            menuViewHolder.mDivider = Utils.findRequiredView(view, R.id.divider, "field 'mDivider'");
        }
    }
}
