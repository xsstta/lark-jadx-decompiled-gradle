package com.ss.android.lark.favorite.common.sticker;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.favorite.common.sticker.a */
public class C37165a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    IStickerDependency f95515a = C29990c.m110930b().mo134502A();

    /* renamed from: b */
    private Context f95516b;

    public C37165a(Context context) {
        this.f95516b = context;
    }

    /* renamed from: b */
    private int m146440b(int i) {
        if (i == 1) {
            return UIHelper.dp2px(68.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private int m146442d(int i) {
        if (i == 1) {
            return m146441c(i);
        }
        return 0;
    }

    /* renamed from: a */
    private int m146439a(int i) {
        if (i == 1) {
            return UIHelper.dp2px(68.0f);
        }
        return UIHelper.getWindowWidth(this.f95516b) - (UIHelper.dp2px(16.0f) * 2);
    }

    /* renamed from: c */
    private int m146441c(int i) {
        if (i == 1) {
            return UIUtils.dp2px(this.f95516b, 68.0f);
        }
        return DeviceUtils.getScreenWidth(this.f95516b) - (UIHelper.dp2px(16.0f) * 2);
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        StickerMessageHolder stickerMessageHolder = (StickerMessageHolder) itemListCommonHolder.mo136774a();
        StickerContent stickerContent = (StickerContent) favoriteMessageInfo.getSourceMessage().getContent();
        C29990c.m110930b().mo134597y();
        if (stickerContent != null) {
            String key = stickerContent.getKey();
            int[] a = ImageUtils.m224135a(stickerContent.getWidth(), stickerContent.getHeight(), m146439a(i), m146440b(i), m146441c(i), m146442d(i));
            int i2 = a[0];
            int i3 = a[1];
            stickerMessageHolder.mImage.setVisibility(8);
            stickerMessageHolder.mSticker.setVisibility(0);
            C34336c.m133133b(this.f95516b, UIHelper.px2dp((float) i2), UIHelper.px2dp((float) i3), stickerMessageHolder.mSticker);
            this.f95515a.mo134379a(this.f95516b, false, i2, i3, key, stickerMessageHolder.mSticker, R.drawable.common_chat_window_image_item_holder, R.drawable.common_failed_chat_picture, stickerContent.getStickerSetId());
        } else {
            stickerMessageHolder.mSticker.setVisibility(8);
            stickerMessageHolder.mImage.setVisibility(0);
            C34336c.m133126a(this.f95516b, stickerMessageHolder.mImage);
        }
        stickerMessageHolder.mContentFrame.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.favorite.common.sticker.C37165a.C371661 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FavoriteItemAdapter.AbstractC37118f fVar = itemListCommonHolder.f95393b.f95379b;
                if (fVar != null) {
                    fVar.mo136773a(view, favoriteMessageInfo);
                }
            }
        });
        View$OnClickListenerC371672 r5 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.sticker.C37165a.View$OnClickListenerC371672 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371683 r7 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.sticker.C37165a.View$OnLongClickListenerC371683 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r5);
            itemListCommonHolder.f95392a.setOnLongClickListener(r7);
            itemListCommonHolder.mContentViewGroup.setOnClickListener(r5);
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r7);
            stickerMessageHolder.mContentFrame.setOnLongClickListener(r7);
        }
    }
}
