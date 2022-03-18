package com.ss.android.lark.favorite.common.image;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.transform.CropTransformation;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.favorite.common.image.a */
public class C37140a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    private Context f95441a;

    public C37140a(Context context) {
        this.f95441a = context;
    }

    /* renamed from: b */
    private int m146392b(int i) {
        if (i == 1) {
            return UIHelper.dp2px(68.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private int m146394d(int i) {
        if (i == 1) {
            return m146393c(i);
        }
        return 0;
    }

    /* renamed from: a */
    private int m146391a(int i) {
        if (i == 1) {
            return UIHelper.dp2px(68.0f);
        }
        return DeviceUtils.getScreenWidth(this.f95441a) - (UIHelper.dp2px(16.0f) * 2);
    }

    /* renamed from: c */
    private int m146393c(int i) {
        if (i == 1) {
            return UIUtils.dp2px(this.f95441a, 68.0f);
        }
        return DeviceUtils.getScreenWidth(this.f95441a) - (UIHelper.dp2px(16.0f) * 2);
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        CropTransformation cropTransformation;
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        ImageMessageHolder imageMessageHolder = (ImageMessageHolder) itemListCommonHolder.mo136774a();
        ImageContent imageContent = (ImageContent) favoriteMessageInfo.getSourceMessage().getContent();
        Image a = C34336c.m133124a(imageContent);
        imageMessageHolder.mImage.mo85893a(8.0f, 8.0f, 8.0f, 8.0f);
        imageMessageHolder.mImage.setBorderWidthDP(BitmapDescriptorFactory.HUE_RED);
        if (a != null) {
            Image origin = imageContent.getImageSet().getOrigin();
            int width = origin.getWidth();
            int height = origin.getHeight();
            int[] a2 = ImageUtils.m224135a(width, height, m146391a(i), m146392b(i), m146393c(i), m146394d(i));
            int i2 = a2[0];
            int i3 = a2[1];
            CropTransformation cropTransformation2 = null;
            if (i == 1) {
                if (width > height) {
                    cropTransformation = new CropTransformation(UIHelper.dp2px(68.0f), i3, CropTransformation.CropType.CENTER);
                } else {
                    if (width < height) {
                        cropTransformation = new CropTransformation(i2, UIHelper.dp2px(68.0f), CropTransformation.CropType.TOP);
                    }
                    imageMessageHolder.mImage.setBorderColor(UIHelper.getColor(R.color.ud_N200));
                }
                cropTransformation2 = cropTransformation;
                imageMessageHolder.mImage.setBorderColor(UIHelper.getColor(R.color.ud_N200));
            } else {
                imageMessageHolder.mImage.setBorderColor(0);
            }
            imageMessageHolder.mImage.setBorderWidthDP(0.5f);
            C34336c.m133133b(this.f95441a, UIHelper.px2dp((float) i2), UIHelper.px2dp((float) i3), imageMessageHolder.mImage);
            GradientDrawable a3 = C34336c.m133122a(this.f95441a, i2, i3, imageMessageHolder.mImage);
            C34336c.m133127a(this.f95441a, imageMessageHolder.mImage, a, new LoadParams().mo105413a(i2).mo105422b(i3).mo105414a(a3).mo105423b(UIHelper.getDrawable(R.drawable.common_failed_chat_picture)).mo105431e(false).mo105418a(cropTransformation2).mo105416a(new ListenerParams.Builder().mo105401a(false).mo105405b(false).mo105396a(Biz.Messenger).mo105397a(Scene.Favorite).mo105398a(ListenerParams.FromType.IMAGE).mo105402a()));
        } else {
            C34336c.m133126a(this.f95441a, imageMessageHolder.mImage);
        }
        imageMessageHolder.mContentFrame.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.favorite.common.image.C37140a.C371411 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FavoriteItemAdapter.AbstractC37114b bVar = itemListCommonHolder.f95393b.f95378a;
                if (bVar != null) {
                    bVar.mo136768a(view, favoriteMessageInfo);
                }
            }
        });
        View$OnClickListenerC371422 r1 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.image.C37140a.View$OnClickListenerC371422 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371433 r2 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.image.C37140a.View$OnLongClickListenerC371433 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r1);
            itemListCommonHolder.f95392a.setOnLongClickListener(r2);
            itemListCommonHolder.mContentViewGroup.setOnClickListener(r1);
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r2);
            imageMessageHolder.mContentFrame.setOnLongClickListener(r2);
        }
    }
}
