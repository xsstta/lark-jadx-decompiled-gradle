package com.ss.android.lark.contact.impl.contacts_home;

import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class ContactsHomeItemViewHolder extends RecyclerView.ViewHolder {
    @BindView(6944)
    public View btnLayout;
    @BindView(8034)
    public UDCheckBox checkBox;
    @BindView(7049)
    public LKUIRoundedImageView2 contactAvatar;
    @BindView(7052)
    public RelativeLayout contactLayout;
    @BindView(7054)
    public TextView contactNameTV;
    @BindView(7060)
    public TextView contactTenantTV;
    @BindView(7061)
    public UserStatusLinearLayout contactUserStatus;
    @BindView(7116)
    public View deleteBtn;
    @BindView(7538)
    public LinearLayout userInfoLayoutWrapper;

    public ContactsHomeItemViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
        if (DesktopUtil.m144301a(view.getContext())) {
            this.btnLayout.setVisibility(0);
            view.setOnHoverListener(new View.OnHoverListener() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeItemViewHolder.View$OnHoverListenerC356461 */

                public boolean onHover(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 9) {
                        ContactsHomeItemViewHolder.this.deleteBtn.setVisibility(0);
                        return true;
                    } else if (action != 10) {
                        return true;
                    } else {
                        ContactsHomeItemViewHolder.this.deleteBtn.setVisibility(4);
                        return true;
                    }
                }
            });
        }
    }
}
