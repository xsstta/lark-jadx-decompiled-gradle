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
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextViewHolder extends AbstractC51540b.C51541a {
    @BindView(7514)
    public RichTextView mContentTV;
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

    private TextViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.TextViewHolder$a */
    public static final class C51603a {
        /* renamed from: a */
        public static TextViewHolder m200239a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            TextViewHolder textViewHolder = new TextViewHolder(layoutInflater.inflate(R.layout.chatpin_item_text2, viewGroup, false));
            if (DesktopUtil.m144307b()) {
                textViewHolder.mContentTV.setTextSize(UIHelper.sp2px(14.0f));
                textViewHolder.mContentTV.setEnableSelectText(false);
                textViewHolder.mDocTitleTV.setTextSize(14.0f);
                textViewHolder.mDocOwnerTV.setTextSize(12.0f);
            }
            return textViewHolder;
        }
    }
}
