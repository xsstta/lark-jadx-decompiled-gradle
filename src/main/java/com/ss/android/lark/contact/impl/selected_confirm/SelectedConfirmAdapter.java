package com.ss.android.lark.contact.impl.selected_confirm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class SelectedConfirmAdapter extends LarkRecyclerViewBaseAdapter<ChatChatterAdapterItemHolder, SelectedData> {

    /* renamed from: a */
    public AbstractC35956a f92973a;

    /* renamed from: b */
    private Context f92974b;

    /* renamed from: com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmAdapter$a */
    public interface AbstractC35956a {
        void onCloseButtonClick(int i);
    }

    public class ChatChatterAdapterItemHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ChatChatterAdapterItemHolder f92978a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ChatChatterAdapterItemHolder chatChatterAdapterItemHolder = this.f92978a;
            if (chatChatterAdapterItemHolder != null) {
                this.f92978a = null;
                chatChatterAdapterItemHolder.checkBox = null;
                chatChatterAdapterItemHolder.selectableRoundedImageView = null;
                chatChatterAdapterItemHolder.peopleName = null;
                chatChatterAdapterItemHolder.peopleDepartment = null;
                chatChatterAdapterItemHolder.imageUnregistered = null;
                chatChatterAdapterItemHolder.imageClose = null;
                chatChatterAdapterItemHolder.userStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ChatChatterAdapterItemHolder_ViewBinding(ChatChatterAdapterItemHolder chatChatterAdapterItemHolder, View view) {
            this.f92978a = chatChatterAdapterItemHolder;
            chatChatterAdapterItemHolder.checkBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.selectbox, "field 'checkBox'", UDCheckBox.class);
            chatChatterAdapterItemHolder.selectableRoundedImageView = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.single_avator, "field 'selectableRoundedImageView'", SelectableRoundedImageView.class);
            chatChatterAdapterItemHolder.peopleName = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'peopleName'", TextView.class);
            chatChatterAdapterItemHolder.peopleDepartment = (TextView) Utils.findRequiredViewAsType(view, R.id.description, "field 'peopleDepartment'", TextView.class);
            chatChatterAdapterItemHolder.imageUnregistered = (TextView) Utils.findRequiredViewAsType(view, R.id.unregister_flag, "field 'imageUnregistered'", TextView.class);
            chatChatterAdapterItemHolder.imageClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_close, "field 'imageClose'", ImageView.class);
            chatChatterAdapterItemHolder.userStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.user_status, "field 'userStatus'", UserStatusLinearLayout.class);
        }
    }

    /* renamed from: a */
    public void mo132296a(AbstractC35956a aVar) {
        this.f92973a = aVar;
    }

    public class ChatChatterAdapterItemHolder extends RecyclerView.ViewHolder {
        @BindView(8041)
        UDCheckBox checkBox;
        @BindView(7383)
        ImageView imageClose;
        @BindView(8392)
        TextView imageUnregistered;
        @BindView(7133)
        TextView peopleDepartment;
        @BindView(7730)
        TextView peopleName;
        @BindView(JosStatusCodes.RTN_CODE_PARAMS_ERROR)
        SelectableRoundedImageView selectableRoundedImageView;
        @BindView(8404)
        UserStatusLinearLayout userStatus;

        ChatChatterAdapterItemHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.checkBox.setVisibility(8);
            this.peopleDepartment.setVisibility(8);
            this.imageClose.setVisibility(0);
        }
    }

    /* renamed from: a */
    public ChatChatterAdapterItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f92974b = context;
        return new ChatChatterAdapterItemHolder(LayoutInflater.from(context).inflate(R.layout.selected_confirm_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final ChatChatterAdapterItemHolder chatChatterAdapterItemHolder, int i) {
        SelectedData selectedData = (SelectedData) getItem(i);
        chatChatterAdapterItemHolder.peopleName.setText(selectedData.name);
        int dp2px = UIHelper.dp2px(40.0f);
        if (selectedData.dataType == SelectedData.DataType.DEPARTAMENT) {
            chatChatterAdapterItemHolder.selectableRoundedImageView.setImageResource(R.drawable.icon_department_department_avatar);
        } else {
            C35358a.m138143a().mo130164i().mo130211a(this.f92974b, selectedData.avatarKey, selectedData.id, chatChatterAdapterItemHolder.selectableRoundedImageView, dp2px, dp2px);
        }
        if (!selectedData.isRegistered) {
            chatChatterAdapterItemHolder.imageUnregistered.setVisibility(0);
        } else {
            chatChatterAdapterItemHolder.imageUnregistered.setVisibility(8);
        }
        if (selectedData.isShowDescription) {
            chatChatterAdapterItemHolder.userStatus.setVisibility(8);
        } else {
            chatChatterAdapterItemHolder.userStatus.setVisibility(0);
            try {
                chatChatterAdapterItemHolder.userStatus.mo201154a(selectedData.description, C57582a.m223614c(this.f92974b, selectedData.descriptionDrawable));
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }
        chatChatterAdapterItemHolder.imageClose.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmAdapter.View$OnClickListenerC359551 */

            public void onClick(View view) {
                SelectedConfirmAdapter.this.f92973a.onCloseButtonClick(chatChatterAdapterItemHolder.getAdapterPosition());
            }
        });
    }
}
