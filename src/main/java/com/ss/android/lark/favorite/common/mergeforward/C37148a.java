package com.ss.android.lark.favorite.common.mergeforward;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.api.service.AbstractC32902e;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.favorite.common.mergeforward.a */
public class C37148a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    static AbstractC32902e f95463a = C34232o.m132851a();

    /* renamed from: b */
    private Context f95464b;

    public C37148a(Context context) {
        this.f95464b = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        MergeForwardMessageHolder mergeForwardMessageHolder = (MergeForwardMessageHolder) itemListCommonHolder.mo136774a();
        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        MergeForwardContent mergeForwardContent = (MergeForwardContent) sourceMessage.getContent();
        mergeForwardContent.setMessageId(sourceMessage.getId());
        mergeForwardMessageHolder.mTitleTV.setMaxLines(2);
        DesktopUtil.m144299a(mergeForwardMessageHolder.mTitleTV);
        if (mergeForwardContent != null) {
            C29597a a = f95463a.mo121388a(mergeForwardContent);
            mergeForwardMessageHolder.mTitleTV.setText(a.f74159a);
            mergeForwardMessageHolder.mContentTV.setMaxLines(4);
            mergeForwardMessageHolder.mContentTV.setEllipsize(TextUtils.TruncateAt.END);
            mergeForwardMessageHolder.mContentTV.setTextColor(mergeForwardMessageHolder.mContentTV.getContext().getResources().getColor(R.color.text_caption));
            mergeForwardMessageHolder.mContentTV.setTextSize((int) UIHelper.sp2px(14.0f));
            mergeForwardMessageHolder.mContentTV.setContentText(a.f74160b);
        }
        View$OnClickListenerC371491 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.mergeforward.C37148a.View$OnClickListenerC371491 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371502 r2 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.mergeforward.C37148a.View$OnLongClickListenerC371502 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r0);
            itemListCommonHolder.f95392a.setOnLongClickListener(r2);
            itemListCommonHolder.mContentViewGroup.setOnClickListener(r0);
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r2);
        }
    }
}
