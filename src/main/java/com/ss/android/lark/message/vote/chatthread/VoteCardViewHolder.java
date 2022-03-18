package com.ss.android.lark.message.vote.chatthread;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.ss.android.lark.message.vote.AbstractC45384a;

public class VoteCardViewHolder extends RecyclerView.ViewHolder implements AbstractC45384a {

    /* renamed from: a */
    private AbstractC45384a.AbstractC45386b f114979a;
    @BindView(6454)
    TextView mActionBtn;
    @BindView(6469)
    TextView mActualParticipantNumberTv;
    @BindView(7213)
    TextView mNumberOfParticipantsTv;
    @BindView(7231)
    RecyclerView mOptionsRv;
    @BindView(7458)
    TextView mSelectTypeTv;
    @BindView(7628)
    View mTitleLayout;
    @BindView(7632)
    TextView mTitleTv;

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: i */
    public AbstractC45384a.AbstractC45385a mo160240i() {
        return null;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: a */
    public TextView mo160232a() {
        return this.mTitleTv;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: b */
    public TextView mo160233b() {
        return this.mSelectTypeTv;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: c */
    public View mo160234c() {
        return this.mTitleLayout;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: d */
    public RecyclerView mo160235d() {
        return this.mOptionsRv;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: e */
    public TextView mo160236e() {
        return this.mNumberOfParticipantsTv;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: f */
    public TextView mo160237f() {
        return this.mActualParticipantNumberTv;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: g */
    public TextView mo160238g() {
        return this.mActionBtn;
    }

    @Override // com.ss.android.lark.message.vote.AbstractC45384a
    /* renamed from: h */
    public AbstractC45384a.AbstractC45386b mo160239h() {
        return this.f114979a;
    }
}
