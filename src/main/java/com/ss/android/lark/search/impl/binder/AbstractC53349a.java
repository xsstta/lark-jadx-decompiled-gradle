package com.ss.android.lark.search.impl.binder;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.search.impl.binder.p2597b.AbstractC53354a;
import com.ss.android.lark.search.impl.binder.p2598c.AbstractView$OnHoverListenerC53356b;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.search.impl.binder.a */
public abstract class AbstractC53349a<H extends RecyclerView.ViewHolder, VD extends SearchBaseViewData> extends AbstractC53354a<H, VD> {

    /* renamed from: a */
    protected static final int f131841a = UIHelper.getColor(R.color.lkui_R500);

    /* renamed from: b */
    protected boolean f131842b = true;

    /* renamed from: c */
    protected Context f131843c;

    /* renamed from: a */
    public abstract H mo181985a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo181987a(H h, VD vd, boolean z);

    public AbstractC53349a(Context context) {
        super(context);
        this.f131843c = context;
    }

    /* renamed from: a */
    public void mo181990a(boolean z) {
        this.f131842b = z;
    }

    /* renamed from: a */
    private int m206469a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                return R.drawable.badge_orange_single_count_bg_no_stroke;
            }
            return R.drawable.badge_gray_single_count_bg_stroke;
        } else if (str.length() == 1) {
            if (z) {
                return R.drawable.quick_search_badge_orange_bg_stroke;
            }
            return R.drawable.quick_search_badge_gray_bg_stroke;
        } else if (z) {
            return R.drawable.badge_orange_multi_count_bg_stroke;
        } else {
            return R.drawable.badge_gray_multi_count_bg_stroke;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181988a(LKUIBadgeView lKUIBadgeView, int i, boolean z) {
        String str;
        if (i == 0) {
            lKUIBadgeView.setVisibility(8);
            return;
        }
        lKUIBadgeView.setVisibility(0);
        if (i > 999) {
            str = "...";
        } else {
            str = String.valueOf(i);
        }
        lKUIBadgeView.mo89319a(str).mo89318a(UIHelper.getDrawable(m206469a(str, z))).mo89317a(UIHelper.getColor(R.color.lkui_N00)).mo89316a(11.0f).mo89321b(2.0f).mo89320a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181989a(LKUIRoundedImageView lKUIRoundedImageView, int i, boolean z) {
        String str;
        if (i != 0) {
            lKUIRoundedImageView.setBadgeEnable(true);
            lKUIRoundedImageView.setBadgePosAngle(315);
            if (i > 999) {
                str = "...";
            } else {
                str = String.valueOf(i);
            }
            lKUIRoundedImageView.getBadgeDrawable().mo89406a(str).mo89409b(UIHelper.getDrawable(m206469a(str, z))).mo89403a(UIHelper.getColor(R.color.lkui_N00)).mo89404a(this.f131843c, 11.0f).mo89410b();
        }
    }

    /* renamed from: a */
    public void mo181986a(H h, VD vd, AbstractC53343b bVar, int i) {
        mo181991b(h, vd, bVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo181991b(final H h, final VD vd, final AbstractC53343b bVar, int i) {
        h.itemView.setOnHoverListener(new AbstractView$OnHoverListenerC53356b() {
            /* class com.ss.android.lark.search.impl.binder.AbstractC53349a.C533501 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.search.impl.binder.a */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.search.impl.binder.p2598c.AbstractView$OnHoverListenerC53356b
            /* renamed from: a */
            public void mo181992a(boolean z) {
                AbstractC53349a.this.mo181987a(h, vd, z);
                bVar.mo181982a(vd, z);
            }
        });
    }
}
