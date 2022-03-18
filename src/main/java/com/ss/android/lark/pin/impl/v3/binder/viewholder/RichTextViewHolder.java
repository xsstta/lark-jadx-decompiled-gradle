package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.view.PostView;
import com.ss.android.lark.utils.UIHelper;

public class RichTextViewHolder extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public PostView f128418m;
    @BindView(7112)
    public View mDivider;
    @BindView(6621)
    public LKUIRoundedImageView mDocIconIV;
    @BindView(6622)
    public TextView mDocOwnerTV;
    @BindView(6624)
    public TextView mDocTitleTV;
    @BindView(6623)
    public View mDocsLayout;
    @BindView(7596)
    public TextView mUrlDescTV;
    @BindView(7598)
    public LKUIRoundedImageView mUrlIconIV;
    @BindView(7600)
    public View mUrlPreviewLayout;
    @BindView(7601)
    public TextView mUrlTitleTV;

    private RichTextViewHolder(View view) {
        super(view);
        this.f128418m = (PostView) view.findViewById(R.id.post_view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.RichTextViewHolder$a */
    public static final class C51601a {
        /* renamed from: a */
        public static RichTextViewHolder m200238a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            RichTextViewHolder richTextViewHolder = new RichTextViewHolder(layoutInflater.inflate(R.layout.chatpin_item_post2, viewGroup, false));
            if (DesktopUtil.m144307b()) {
                richTextViewHolder.f128418m.getTitleView().setTextSize(14.0f);
                richTextViewHolder.f128418m.getRichTextView().setTextSize(UIHelper.sp2px(14.0f));
                richTextViewHolder.f128418m.getRichTextView().setEnableSelectText(false);
            }
            return richTextViewHolder;
        }
    }
}
