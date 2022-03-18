package com.ss.android.lark.forward.impl.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.utils.UIHelper;

public class ForwardSendDialogAdapter extends LarkRecyclerViewBaseAdapter<PickedChatViewHolder, SearchBaseInfo> {

    /* renamed from: a */
    private Context f98869a;

    public class PickedChatViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private PickedChatViewHolder f98870a;

        @Override // butterknife.Unbinder
        public void unbind() {
            PickedChatViewHolder pickedChatViewHolder = this.f98870a;
            if (pickedChatViewHolder != null) {
                this.f98870a = null;
                pickedChatViewHolder.mAvatar = null;
                pickedChatViewHolder.mThreadIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public PickedChatViewHolder_ViewBinding(PickedChatViewHolder pickedChatViewHolder, View view) {
            this.f98870a = pickedChatViewHolder;
            pickedChatViewHolder.mAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.preview_avatar, "field 'mAvatar'", ImageView.class);
            pickedChatViewHolder.mThreadIcon = Utils.findRequiredView(view, R.id.feed_thread_icon, "field 'mThreadIcon'");
        }
    }

    public static class PickedChatViewHolder extends RecyclerView.ViewHolder {
        @BindView(7351)
        public ImageView mAvatar;
        @BindView(6838)
        public View mThreadIcon;

        public PickedChatViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public PickedChatViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f98869a = viewGroup.getContext();
        return new PickedChatViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_avatar_40, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(PickedChatViewHolder pickedChatViewHolder, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        boolean z = searchBaseInfo instanceof SearchThreadInfo;
        if (z) {
            str = ((SearchThreadInfo) searchBaseInfo).getChannel().getId();
        } else {
            str = searchBaseInfo.getId();
        }
        C38364a.m151054a().mo140444f().mo140505a(this.f98869a, searchBaseInfo.getAvatarKey(), str, pickedChatViewHolder.mAvatar, UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f));
        View view = pickedChatViewHolder.mThreadIcon;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        int i6 = i % 5;
        if (i6 == 0) {
            i3 = UIUtils.dp2px(this.f98869a, 8.0f);
            i5 = UIUtils.dp2px(this.f98869a, 8.0f);
            i4 = 8388611;
        } else if (i6 == 4) {
            i3 = UIUtils.dp2px(this.f98869a, 8.0f);
            i5 = UIUtils.dp2px(this.f98869a, 8.0f);
            i4 = 8388613;
        } else {
            i3 = UIUtils.dp2px(this.f98869a, 8.0f);
            i5 = UIUtils.dp2px(this.f98869a, 8.0f);
            i4 = 1;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pickedChatViewHolder.mAvatar.getLayoutParams();
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i5;
        layoutParams.gravity = i4;
        if (z) {
            ((FrameLayout.LayoutParams) pickedChatViewHolder.mThreadIcon.getLayoutParams()).rightMargin = i5;
        }
    }
}
