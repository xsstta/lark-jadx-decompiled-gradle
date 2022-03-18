package com.ss.android.lark.search.impl.binder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class SearchChatterViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchChatterViewHolder f131884a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SearchChatterViewHolder searchChatterViewHolder = this.f131884a;
        if (searchChatterViewHolder != null) {
            this.f131884a = null;
            searchChatterViewHolder.mSingleAvatarIV = null;
            searchChatterViewHolder.mBadge = null;
            searchChatterViewHolder.mNameTV = null;
            searchChatterViewHolder.mMailTv = null;
            searchChatterViewHolder.mTagTV = null;
            searchChatterViewHolder.mDoNotDisturbTag = null;
            searchChatterViewHolder.mDescriptionTV = null;
            searchChatterViewHolder.mBotTagTV = null;
            searchChatterViewHolder.mUnRegisteredFlagTV = null;
            searchChatterViewHolder.mUserStatus = null;
            searchChatterViewHolder.mWorkStatusTV = null;
            searchChatterViewHolder.mSecretChatTagIV = null;
            searchChatterViewHolder.mPersonalCardIV = null;
            searchChatterViewHolder.mDelayTag = null;
            searchChatterViewHolder.mAtAvatarIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchChatterViewHolder_ViewBinding(SearchChatterViewHolder searchChatterViewHolder, View view) {
        this.f131884a = searchChatterViewHolder;
        searchChatterViewHolder.mSingleAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mSingleAvatarIV'", LKUIRoundedImageView.class);
        searchChatterViewHolder.mBadge = (LKUIBadgeView) Utils.findOptionalViewAsType(view, R.id.group_message_badge, "field 'mBadge'", LKUIBadgeView.class);
        searchChatterViewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name, "field 'mNameTV'", TextView.class);
        searchChatterViewHolder.mMailTv = (TextView) Utils.findRequiredViewAsType(view, R.id.group_mail, "field 'mMailTv'", TextView.class);
        searchChatterViewHolder.mTagTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_tag, "field 'mTagTV'", TextView.class);
        searchChatterViewHolder.mDoNotDisturbTag = Utils.findRequiredView(view, R.id.do_not_disturb_tag, "field 'mDoNotDisturbTag'");
        searchChatterViewHolder.mDescriptionTV = (EllipsizedEmojiconTextView) Utils.findRequiredViewAsType(view, R.id.group_description, "field 'mDescriptionTV'", EllipsizedEmojiconTextView.class);
        searchChatterViewHolder.mBotTagTV = (TextView) Utils.findRequiredViewAsType(view, R.id.bot_tag, "field 'mBotTagTV'", TextView.class);
        searchChatterViewHolder.mUnRegisteredFlagTV = Utils.findRequiredView(view, R.id.unregister_flag, "field 'mUnRegisteredFlagTV'");
        searchChatterViewHolder.mUserStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.user_status, "field 'mUserStatus'", UserStatusLinearLayout.class);
        searchChatterViewHolder.mWorkStatusTV = (TextView) Utils.findRequiredViewAsType(view, R.id.workday_leave, "field 'mWorkStatusTV'", TextView.class);
        searchChatterViewHolder.mSecretChatTagIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.secret_chat_tag, "field 'mSecretChatTagIV'", ImageView.class);
        searchChatterViewHolder.mPersonalCardIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.personal_card, "field 'mPersonalCardIV'", ImageView.class);
        searchChatterViewHolder.mDelayTag = (ImageView) Utils.findOptionalViewAsType(view, R.id.delay_tag, "field 'mDelayTag'", ImageView.class);
        searchChatterViewHolder.mAtAvatarIV = (LKUIRoundedImageView) Utils.findOptionalViewAsType(view, R.id.chatter_at_avatar, "field 'mAtAvatarIV'", LKUIRoundedImageView.class);
    }
}
