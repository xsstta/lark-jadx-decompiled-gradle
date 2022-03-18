package com.ss.android.lark.favorite.common.p1839a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.favorite.common.a.a */
public class C37091a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    public final Context f95317a;

    public C37091a(Context context) {
        this.f95317a = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        String str;
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        final C37097b bVar = (C37097b) itemListCommonHolder.mo136774a();
        final Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        final LocationContent locationContent = (LocationContent) sourceMessage.getContent();
        LocationDescription locationDescription = locationContent.getLocationDescription();
        if (TextUtils.isEmpty(locationDescription.getName())) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
        } else {
            str = locationDescription.getName();
        }
        bVar.f95335b.setText(str);
        String description = locationDescription.getDescription();
        if (TextUtils.isEmpty(description)) {
            bVar.f95336c.setVisibility(8);
        } else {
            bVar.f95336c.setVisibility(0);
            bVar.f95336c.setText(description);
        }
        Image image = null;
        if (!(locationContent.getImage() == null || locationContent.getImage().getOrigin() == null)) {
            image = locationContent.getImage().getOrigin();
        }
        bVar.f95338e.setVisibility(0);
        if (image != null) {
            ImageLoader.with(this.f95317a).load(new C38824b(image.getKey())).placeholder(R.drawable.common_chat_window_image_item_holder).error(new ColorDrawable(ContextCompat.getColor(this.f95317a, R.color.ud_N200))).listener(new AbstractC38817h() {
                /* class com.ss.android.lark.favorite.common.p1839a.C37091a.C370921 */

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                    bVar.f95338e.setVisibility(8);
                    bVar.f95337d.setScaleType(ImageView.ScaleType.CENTER);
                    return false;
                }

                @Override // com.ss.android.lark.image.api.AbstractC38817h
                /* renamed from: a */
                public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                    bVar.f95338e.setVisibility(8);
                    bVar.f95337d.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return false;
                }
            }).into(bVar.f95337d);
        }
        View$OnClickListenerC370932 r3 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.p1839a.C37091a.View$OnClickListenerC370932 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC370943 r4 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.p1839a.C37091a.View$OnLongClickListenerC370943 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r3);
            itemListCommonHolder.f95392a.setOnLongClickListener(r4);
            bVar.f95334a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.favorite.common.p1839a.C37091a.View$OnClickListenerC370954 */

                public void onClick(View view) {
                    C29990c.m110930b().mo134508G().mo120951a(C37091a.this.f95317a, sourceMessage, locationContent, favoriteMessageInfo.getId());
                }
            });
            bVar.f95334a.setOnLongClickListener(r4);
        } else if (i == 2) {
            itemListCommonHolder.mContentViewGroup.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.favorite.common.p1839a.C37091a.View$OnClickListenerC370965 */

                public void onClick(View view) {
                    C29990c.m110930b().mo134508G().mo120951a(C37091a.this.f95317a, sourceMessage, locationContent, favoriteMessageInfo.getId());
                }
            });
        }
    }
}
