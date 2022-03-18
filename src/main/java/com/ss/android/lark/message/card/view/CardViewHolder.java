package com.ss.android.lark.message.card.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.yoga.android.YogaLayout;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.framework.flyfish.FlyFishView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

public class CardViewHolder extends RecyclerView.ViewHolder implements AbstractC45339h {

    /* renamed from: a */
    public YogaLayout f114723a;

    /* renamed from: b */
    public TextView f114724b;

    /* renamed from: c */
    public FlyFishView f114725c;
    @BindView(6597)
    public FrameLayout mCardContentLayout;
    @BindView(6868)
    public FrameLayout mHeaderContainer;
    @BindView(7365)
    public LKUIRoundLinearLayout mRootLayout;

    /* renamed from: a */
    public FrameLayout mo160062a() {
        return this.mHeaderContainer;
    }

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public FrameLayout getContentLayout() {
        return this.mCardContentLayout;
    }

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public LKUIRoundLinearLayout getRootLayout() {
        return this.mRootLayout;
    }

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public YogaLayout getYogaLayout() {
        return this.f114723a;
    }

    /* renamed from: a */
    public static CardViewHolder m179942a(View view) {
        return (CardViewHolder) view.getTag();
    }

    /* renamed from: a */
    public static boolean m179943a(CardViewHolder cardViewHolder) {
        if (cardViewHolder == null || cardViewHolder.mRootLayout == null || cardViewHolder.f114723a == null) {
            return false;
        }
        return true;
    }

    public CardViewHolder(View view, boolean z) {
        super(view);
        ButterKnife.bind(this, view);
        this.f114723a = new YogaLayout(view.getContext());
        Log.m165389i("FlyFish", "enable = " + z);
        if (z) {
            FlyFishView flyFishView = new FlyFishView(view.getContext());
            this.f114725c = flyFishView;
            this.mCardContentLayout.addView(flyFishView);
        }
    }

    /* renamed from: a */
    public static CardViewHolder m179941a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.text_card_content_item, viewGroup, false);
        CardViewHolder cardViewHolder = new CardViewHolder(inflate, z);
        inflate.setTag(cardViewHolder);
        return cardViewHolder;
    }
}
