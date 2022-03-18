package com.ss.android.lark.favorite.common.base;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.FavoritesType;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.AbstractC32819b;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.common.base.d */
public class C37122d {

    /* renamed from: a */
    static AbstractC36510y f95400a = C29990c.m110930b().mo134587o();

    /* renamed from: b */
    static AbstractC32819b f95401b = C32832c.m126312a();

    /* renamed from: c */
    private static Map<Integer, AbstractC37127a> f95402c;

    /* renamed from: com.ss.android.lark.favorite.common.base.d$a */
    public interface AbstractC37127a {
        /* renamed from: a */
        void mo136778a(Context context, RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo);
    }

    static {
        HashMap hashMap = new HashMap();
        f95402c = hashMap;
        hashMap.put(1, new AbstractC37127a() {
            /* class com.ss.android.lark.favorite.common.base.C37122d.C371231 */

            @Override // com.ss.android.lark.favorite.common.base.C37122d.AbstractC37127a
            /* renamed from: a */
            public void mo136778a(Context context, RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo) {
                ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
                itemListCommonHolder.mTimeTv.setText(C37122d.m146369a(context, favoriteMessageInfo.getCreateTime()));
                itemListCommonHolder.mTimeTv.setVisibility(0);
                Chat sourceChat = favoriteMessageInfo.getSourceChat();
                Chatter sourceChatter = favoriteMessageInfo.getSourceChatter();
                String str = "";
                if (favoriteMessageInfo.getType() == FavoritesType.FAVORITES_MESSAGE) {
                    if (!(sourceChat == null || sourceChatter == null)) {
                        if (favoriteMessageInfo.getSourceChat().isP2PChat()) {
                            str = C37122d.f95401b.mo121121a(sourceChatter, ChatterNameDisplayRule.ALIAS_NAME);
                        } else {
                            str = C37122d.f95401b.mo121121a(sourceChatter, ChatterNameDisplayRule.ALIAS_NAME) + " " + UIUtils.getString(context, R.string.Lark_Legacy_FavoriteFrom).trim() + " " + favoriteMessageInfo.getSourceChat().getName();
                        }
                    }
                    C37122d.m146371a(context, itemListCommonHolder);
                } else if (!(favoriteMessageInfo.getType() != FavoritesType.FAVORITES_MERGE_FAVORITE || sourceChat == null || sourceChatter == null)) {
                    if (sourceChat.isP2PChat()) {
                        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
                        if (sourceMessage.getType() == Message.Type.MERGE_FORWARD) {
                            str = ((MergeForwardContent) sourceMessage.getContent()).getP2pPartnerName();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = C37122d.f95401b.mo121121a(sourceChatter, ChatterNameDisplayRule.ALIAS_NAME);
                        }
                    } else {
                        str = sourceChat.getName();
                    }
                }
                itemListCommonHolder.mFromTv.setText(str);
                C37122d.m146372a(context, itemListCommonHolder, favoriteMessageInfo);
            }
        });
        f95402c.put(2, new AbstractC37127a() {
            /* class com.ss.android.lark.favorite.common.base.C37122d.C371242 */

            @Override // com.ss.android.lark.favorite.common.base.C37122d.AbstractC37127a
            /* renamed from: a */
            public void mo136778a(Context context, RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo) {
                ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
                itemListCommonHolder.mBottomInfoViewGroup.setVisibility(8);
                ((ConstraintLayout) itemListCommonHolder.f95392a).setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
            }
        });
    }

    /* renamed from: a */
    public static void m146371a(Context context, ItemListCommonHolder itemListCommonHolder) {
        if (DesktopUtil.m144307b()) {
            int dp2px = UIUtils.dp2px(context, 16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) itemListCommonHolder.mBottomInfoDivider.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = dp2px;
                marginLayoutParams.rightMargin = dp2px;
                itemListCommonHolder.mBottomInfoDivider.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    public static String m146369a(Context context, long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(context, new Date(j), aVar);
    }

    /* renamed from: b */
    public static void m146374b(View view, ItemListCommonHolder itemListCommonHolder, FavoriteMessageInfo favoriteMessageInfo) {
        View.OnClickListener b;
        if (itemListCommonHolder.f95393b != null && (b = itemListCommonHolder.f95393b.mo136764b()) != null) {
            view.setTag(favoriteMessageInfo);
            b.onClick(view);
        }
    }

    /* renamed from: a */
    public static void m146372a(Context context, final ItemListCommonHolder itemListCommonHolder, final FavoriteMessageInfo favoriteMessageInfo) {
        if (DesktopUtil.m144301a(context)) {
            itemListCommonHolder.mHoverFuncZone.setFuncItemClickListener(new FavoriteHoverFuncView.AbstractC37109a() {
                /* class com.ss.android.lark.favorite.common.base.C37122d.C371253 */

                @Override // com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView.AbstractC37109a
                /* renamed from: a */
                public void mo136755a(View view) {
                    if (itemListCommonHolder.f95393b != null) {
                        itemListCommonHolder.f95393b.f95380c.mo136770a(view, favoriteMessageInfo);
                    }
                }

                @Override // com.ss.android.lark.favorite.common.base.FavoriteHoverFuncView.AbstractC37109a
                /* renamed from: b */
                public void mo136756b(View view) {
                    if (itemListCommonHolder.f95393b != null) {
                        itemListCommonHolder.f95393b.f95380c.mo136771b(view, favoriteMessageInfo);
                    }
                }
            });
            itemListCommonHolder.itemView.setOnHoverListener(new View.OnHoverListener() {
                /* class com.ss.android.lark.favorite.common.base.C37122d.View$OnHoverListenerC371264 */

                public boolean onHover(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 9) {
                        itemListCommonHolder.mTimeTv.setVisibility(8);
                        itemListCommonHolder.mHoverFuncZone.setVisibility(0);
                    } else if (motionEvent.getAction() == 10) {
                        itemListCommonHolder.mTimeTv.setVisibility(0);
                        itemListCommonHolder.mHoverFuncZone.setVisibility(8);
                    }
                    itemListCommonHolder.mHoverFuncZone.mo136751a(motionEvent);
                    return true;
                }
            });
            return;
        }
        itemListCommonHolder.mTimeTv.setVisibility(0);
        itemListCommonHolder.mHoverFuncZone.setVisibility(8);
    }

    /* renamed from: a */
    public static boolean m146373a(View view, ItemListCommonHolder itemListCommonHolder, FavoriteMessageInfo favoriteMessageInfo) {
        View.OnLongClickListener a;
        if (itemListCommonHolder.f95393b == null || (a = itemListCommonHolder.f95393b.mo136757a()) == null) {
            return true;
        }
        view.setTag(favoriteMessageInfo);
        return a.onLongClick(view);
    }

    /* renamed from: a */
    public static void m146370a(Context context, RecyclerView.ViewHolder viewHolder, FavoriteMessageInfo favoriteMessageInfo, int i) {
        f95402c.get(Integer.valueOf(i)).mo136778a(context, viewHolder, favoriteMessageInfo);
    }
}
