package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class DingUsersShowAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, C36724e> {

    /* renamed from: b */
    private static final int f94339b = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    IDingModuleDependency.AbstractC36625c f94340a = C36618a.m144492a().mo135104i();

    /* renamed from: c */
    private Context f94341c;

    /* renamed from: d */
    private boolean f94342d;

    /* renamed from: e */
    private int f94343e;

    /* renamed from: f */
    private int f94344f;

    /* renamed from: g */
    private int f94345g;

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f94346a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f94346a;
            if (viewHolder != null) {
                this.f94346a = null;
                viewHolder.appChaterNum = null;
                viewHolder.placeHolder = null;
                viewHolder.appNoticeLinearlayout = null;
                viewHolder.appNoticeMessage = null;
                viewHolder.selectedSmsPhoneLine = null;
                viewHolder.smsPhoneChaterNum = null;
                viewHolder.avatarNameLinearlayout = null;
                viewHolder.mSelectableRoundedImageView = null;
                viewHolder.userName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f94346a = viewHolder;
            viewHolder.appChaterNum = (TextView) Utils.findRequiredViewAsType(view, R.id.selected_app_ChatersNum, "field 'appChaterNum'", TextView.class);
            viewHolder.placeHolder = (TextView) Utils.findRequiredViewAsType(view, R.id.place_holder_view, "field 'placeHolder'", TextView.class);
            viewHolder.appNoticeLinearlayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.app_notice_linearlayout, "field 'appNoticeLinearlayout'", LinearLayout.class);
            viewHolder.appNoticeMessage = (TextView) Utils.findRequiredViewAsType(view, R.id.only_app_notice, "field 'appNoticeMessage'", TextView.class);
            viewHolder.selectedSmsPhoneLine = (TextView) Utils.findRequiredViewAsType(view, R.id.selected_sms_phone_line, "field 'selectedSmsPhoneLine'", TextView.class);
            viewHolder.smsPhoneChaterNum = (TextView) Utils.findRequiredViewAsType(view, R.id.selected_sms_phone_ChatersNum, "field 'smsPhoneChaterNum'", TextView.class);
            viewHolder.avatarNameLinearlayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.avatar_name_message_linearlayout, "field 'avatarNameLinearlayout'", LinearLayout.class);
            viewHolder.mSelectableRoundedImageView = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.show_ding_users_avatar, "field 'mSelectableRoundedImageView'", SelectableRoundedImageView.class);
            viewHolder.userName = (TextView) Utils.findRequiredViewAsType(view, R.id.ding_user_name, "field 'userName'", TextView.class);
        }
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(6528)
        TextView appChaterNum;
        @BindView(5915)
        LinearLayout appNoticeLinearlayout;
        @BindView(6391)
        TextView appNoticeMessage;
        @BindView(5934)
        LinearLayout avatarNameLinearlayout;
        @BindView(6551)
        SelectableRoundedImageView mSelectableRoundedImageView;
        @BindView(6411)
        TextView placeHolder;
        @BindView(6530)
        TextView selectedSmsPhoneLine;
        @BindView(6529)
        TextView smsPhoneChaterNum;
        @BindView(6074)
        TextView userName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((C36724e) getItem(i)).mo135378a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        int i2;
        C36724e eVar = (C36724e) getItem(i);
        if (eVar.mo135378a() == 2) {
            i2 = eVar.f94404c.getId().hashCode();
        } else {
            i2 = eVar.f94402a;
        }
        return (long) i2;
    }

    /* renamed from: a */
    public void mo135329a(int i, int i2) {
        this.f94343e = i;
        this.f94344f = i2;
    }

    public DingUsersShowAdapter(List list, boolean z) {
        addAll(list);
        this.f94342d = z;
        this.f94345g = list.size() - 1;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f94341c = viewGroup.getContext();
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.show_ding_users, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int a = ((C36724e) getItem(i)).mo135378a();
        int c = ((C36724e) getItem(i)).mo135381c();
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (a != 1) {
            if (a == 2) {
                Chatter b = ((C36724e) getItem(i)).mo135380b();
                IDingModuleDependency.AbstractC36629f h = C36618a.m144492a().mo135103h();
                Context context = this.f94341c;
                String avatarKey = b.getAvatarKey();
                String id = b.getId();
                SelectableRoundedImageView selectableRoundedImageView = viewHolder2.mSelectableRoundedImageView;
                int i2 = f94339b;
                h.mo135152a(context, avatarKey, id, selectableRoundedImageView, i2, i2);
                viewHolder2.userName.setText(this.f94340a.mo135131a(b));
                viewHolder2.avatarNameLinearlayout.setVisibility(0);
            } else if (a == 3) {
                if (c == 2) {
                    viewHolder2.smsPhoneChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_buzz_AppMessageReceiver, "num", Integer.toString(this.f94343e)));
                } else {
                    viewHolder2.smsPhoneChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_buzz_AppPhoneReceiver, "num", Integer.toString(this.f94343e)));
                }
                viewHolder2.smsPhoneChaterNum.setVisibility(0);
                if (this.f94344f == 0) {
                    viewHolder2.selectedSmsPhoneLine.setVisibility(8);
                } else {
                    viewHolder2.selectedSmsPhoneLine.setVisibility(0);
                }
            }
        } else if (this.f94342d) {
            viewHolder2.appChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DingReceiveList, "receiver_count", "1"));
            viewHolder2.appChaterNum.setVisibility(0);
            viewHolder2.placeHolder.setVisibility(0);
            viewHolder2.appNoticeLinearlayout.setVisibility(8);
        } else if (c == 1) {
            viewHolder2.appChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_buzz_AppReceiver, "num", Integer.toString(this.f94345g)));
            viewHolder2.appChaterNum.setVisibility(0);
            viewHolder2.placeHolder.setVisibility(0);
            viewHolder2.appNoticeLinearlayout.setVisibility(8);
        } else if (c == 2) {
            viewHolder2.appChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_buzz_AppReceiver, "num", Integer.toString(this.f94344f)));
            viewHolder2.appChaterNum.setVisibility(0);
            viewHolder2.placeHolder.setVisibility(8);
            viewHolder2.appNoticeMessage.setText(R.string.Lark_buzz_SomeReceiveMessageBuzz);
            viewHolder2.appNoticeLinearlayout.setVisibility(0);
        } else if (c == 3) {
            viewHolder2.appChaterNum.setText(UIHelper.mustacheFormat((int) R.string.Lark_buzz_AppReceiver, "num", Integer.toString(this.f94344f)));
            viewHolder2.appChaterNum.setVisibility(0);
            viewHolder2.placeHolder.setVisibility(8);
            viewHolder2.appNoticeMessage.setText(R.string.Lark_buzz_SomeReceivePhoneCallBuzz);
            viewHolder2.appNoticeLinearlayout.setVisibility(0);
        }
    }
}
