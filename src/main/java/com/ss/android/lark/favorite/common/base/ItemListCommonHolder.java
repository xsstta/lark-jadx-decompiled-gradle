package com.ss.android.lark.favorite.common.base;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ss.android.lark.chatwindow.view.hover.HoverEventDisallowConstraintLayout;

public class ItemListCommonHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public View f95392a;

    /* renamed from: b */
    public FavoriteItemAdapter f95393b;

    /* renamed from: c */
    public AbstractC37119a f95394c;
    @BindView(7290)
    public View mBottomInfoDivider;
    @BindView(7291)
    public View mBottomInfoViewGroup;
    @BindView(7484)
    public FrameLayout mContentViewGroup;
    @BindView(7758)
    public TextView mFromTv;
    @BindView(7826)
    public FavoriteHoverFuncView mHoverFuncZone;
    @BindView(8990)
    public TextView mTimeTv;
    @BindView(8599)
    public HoverEventDisallowConstraintLayout rootView;

    /* renamed from: a */
    public <T extends AbstractC37119a> T mo136774a() {
        return (T) this.f95394c;
    }

    public ItemListCommonHolder(View view, LayoutInflater layoutInflater, FavoriteItemAdapter favoriteItemAdapter, AbstractC37119a aVar) {
        super(view);
        this.f95392a = view;
        this.f95393b = favoriteItemAdapter;
        this.f95394c = aVar;
        ButterKnife.bind(this, view);
        aVar.mo136728a(layoutInflater, this.mContentViewGroup);
    }
}
