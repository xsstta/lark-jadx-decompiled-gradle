package com.ss.android.lark.favorite.common.header;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.joooonho.SelectableRoundedImageView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.AbstractC32819b;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.dependency.an;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.Date;

/* renamed from: com.ss.android.lark.favorite.common.header.a */
public class C37138a {

    /* renamed from: a */
    static AbstractC36510y f95432a = C29990c.m110930b().mo134587o();

    /* renamed from: e */
    private static final int f95433e = UIHelper.dp2px(30.0f);

    /* renamed from: b */
    AbstractC32819b f95434b = C32832c.m126312a();

    /* renamed from: c */
    an f95435c = C29990c.m110930b().mo134524W();

    /* renamed from: d */
    FavoriteItemAdapter.AbstractC37113a f95436d;

    /* renamed from: f */
    private Context f95437f;

    /* renamed from: a */
    public void mo136789a(FavoriteItemAdapter.AbstractC37113a aVar) {
        this.f95436d = aVar;
    }

    public C37138a(Context context) {
        this.f95437f = context;
    }

    /* renamed from: a */
    private String m146387a(Context context, long j) {
        Options aVar = new Options();
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        String d = TimeFormatUtils.m219287d(context, new Date(j), aVar);
        Options aVar2 = new Options();
        aVar2.mo191591a(DatePreciseness.DAY);
        aVar2.mo191592a(DisplayPattern.RELATIVE);
        return TimeFormatUtils.m219289e(context, new Date(j), aVar2) + " " + d;
    }

    /* renamed from: a */
    public void mo136788a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        DetailHeaderHolder detailHeaderHolder = (DetailHeaderHolder) viewHolder;
        Chatter sourceChatter = favoriteMessageInfo.getSourceChatter();
        Chat sourceChat = favoriteMessageInfo.getSourceChat();
        if (sourceChatter != null) {
            Context context = this.f95437f;
            SelectableRoundedImageView selectableRoundedImageView = detailHeaderHolder.mUserAvatarIV;
            String avatarKey = sourceChatter.getAvatarKey();
            String id = sourceChatter.getId();
            int i2 = f95433e;
            C34336c.m133130a(context, selectableRoundedImageView, avatarKey, id, i2, i2, Scene.Favorite);
        }
        if (sourceChat == null || sourceChat.isP2PChat()) {
            detailHeaderHolder.mChatNameTV.setVisibility(8);
        } else {
            detailHeaderHolder.mChatNameTV.setText(sourceChat.getName());
            detailHeaderHolder.mChatNameTV.setVisibility(0);
        }
        detailHeaderHolder.mSaveBoxSaveDateTV.setText(m146387a(this.f95437f, favoriteMessageInfo.getSourceMessage().getCreateTime() * 1000));
        detailHeaderHolder.mSaveBoxUserNameTV.setText(this.f95434b.mo121121a(favoriteMessageInfo.getSourceChatter(), ChatterNameDisplayRule.ALIAS_NICKNAME_NAME));
        detailHeaderHolder.mUserAvatarIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.favorite.common.header.C37138a.C371391 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C37138a.this.f95436d != null) {
                    C37138a.this.f95436d.mo136767a(view, favoriteMessageInfo);
                }
            }
        });
    }
}
