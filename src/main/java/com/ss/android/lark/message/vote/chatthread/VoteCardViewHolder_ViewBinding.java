package com.ss.android.lark.message.vote.chatthread;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class VoteCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VoteCardViewHolder f114980a;

    @Override // butterknife.Unbinder
    public void unbind() {
        VoteCardViewHolder voteCardViewHolder = this.f114980a;
        if (voteCardViewHolder != null) {
            this.f114980a = null;
            voteCardViewHolder.mTitleLayout = null;
            voteCardViewHolder.mTitleTv = null;
            voteCardViewHolder.mSelectTypeTv = null;
            voteCardViewHolder.mOptionsRv = null;
            voteCardViewHolder.mNumberOfParticipantsTv = null;
            voteCardViewHolder.mActualParticipantNumberTv = null;
            voteCardViewHolder.mActionBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VoteCardViewHolder_ViewBinding(VoteCardViewHolder voteCardViewHolder, View view) {
        this.f114980a = voteCardViewHolder;
        voteCardViewHolder.mTitleLayout = Utils.findRequiredView(view, R.id.title_layout, "field 'mTitleLayout'");
        voteCardViewHolder.mTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.title_tv, "field 'mTitleTv'", TextView.class);
        voteCardViewHolder.mSelectTypeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.select_type_tv, "field 'mSelectTypeTv'", TextView.class);
        voteCardViewHolder.mOptionsRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.options_rv, "field 'mOptionsRv'", RecyclerView.class);
        voteCardViewHolder.mNumberOfParticipantsTv = (TextView) Utils.findRequiredViewAsType(view, R.id.number_of_participants_tv, "field 'mNumberOfParticipantsTv'", TextView.class);
        voteCardViewHolder.mActualParticipantNumberTv = (TextView) Utils.findRequiredViewAsType(view, R.id.actual_participant_number_tv, "field 'mActualParticipantNumberTv'", TextView.class);
        voteCardViewHolder.mActionBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.action_btn, "field 'mActionBtn'", TextView.class);
    }
}
