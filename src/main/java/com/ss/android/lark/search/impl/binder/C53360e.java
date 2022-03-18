package com.ss.android.lark.search.impl.binder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.FeedAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.binder.listeners.OnSearchSingleClickListener;
import com.ss.android.lark.search.impl.binder.viewholder.SearchThreadViewHolder;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchThreadViewData;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.search.impl.binder.e */
public class C53360e extends AbstractC53349a<SearchThreadViewHolder, SearchThreadViewData> {
    public C53360e(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m206525a(SearchThreadViewHolder searchThreadViewHolder) {
        int i;
        ImageView imageView = searchThreadViewHolder.mThreadIcon;
        if (LarkAvatar.m91602c()) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: b */
    public SearchThreadViewHolder mo181985a(ViewGroup viewGroup) {
        View view;
        if (DesktopUtil.m144301a(this.f131843c)) {
            view = LayoutInflater.from(this.f131843c).inflate(R.layout.item_desktop_search_thread, viewGroup, false);
        } else {
            view = LayoutInflater.from(this.f131843c).inflate(R.layout.item_search_thread, viewGroup, false);
        }
        return new SearchThreadViewHolder(view);
    }

    /* renamed from: f */
    private void m206531f(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        int i;
        ImageView imageView = searchThreadViewHolder.mDelayTagIV;
        if (searchThreadViewData.isDelayed()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: b */
    private void m206526b(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        searchThreadViewHolder.mThreadTimeTV.setVisibility(0);
        searchThreadViewHolder.mThreadTimeTV.setText(SearchCommonUtils.m209227a(this.f131843c, searchThreadViewData.getUpdateTime(), this.f131842b));
    }

    /* renamed from: d */
    private void m206529d(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        String title = searchThreadViewData.getTitle();
        if (!TextUtils.isEmpty(title)) {
            searchThreadViewHolder.mThreadNameTV.setText(C57782ag.m224235a(title, searchThreadViewData.getTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
        } else {
            searchThreadViewHolder.mThreadNameTV.setText(UIHelper.getString(R.string.Lark_Legacy_SearchUnknown));
        }
    }

    /* renamed from: e */
    private void m206530e(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        String subTitle = searchThreadViewData.getSubTitle();
        if (!TextUtils.isEmpty(subTitle)) {
            searchThreadViewHolder.mThreadDescTV.setVisibility(0);
            searchThreadViewHolder.mThreadDescTV.setText(C57782ag.m224235a(subTitle, searchThreadViewData.getSubTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
            return;
        }
        searchThreadViewHolder.mThreadDescTV.setVisibility(8);
    }

    /* renamed from: h */
    private void m206533h(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        if (!TextUtils.isEmpty(searchThreadViewData.getSubTitle())) {
            searchThreadViewHolder.mThreadDescTV.setText(C57782ag.m224235a(searchThreadViewData.getSubTitle(), searchThreadViewData.getSubTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
            searchThreadViewHolder.mThreadDescTV.setVisibility(0);
            return;
        }
        searchThreadViewHolder.mThreadDescTV.setVisibility(8);
    }

    /* renamed from: c */
    private void m206528c(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        if (LarkAvatar.m91600a()) {
            FeedAvatarModel gVar = new FeedAvatarModel();
            gVar.mo89008b(searchThreadViewData.getAvatarKey());
            gVar.mo89011c(searchThreadViewData.getChatId());
            gVar.mo89007b(UIHelper.dp2px(40.0f));
            gVar.mo89010c(UIHelper.dp2px(40.0f));
            LarkAvatar.m91597a(this.f131843c).mo89065a(gVar).mo89064a(new MiniIconModel(AvatarType.TOPIC)).mo89066a(searchThreadViewHolder.mThreadAvatarIV);
        } else if (TextUtils.isEmpty(searchThreadViewData.getAvatarKey())) {
            searchThreadViewHolder.mThreadAvatarIV.setImageResource(R.color.lkui_transparent);
        } else {
            C53258a.m205939a().mo181758g().mo181805a(this.f131843c, searchThreadViewData.getAvatarKey(), searchThreadViewHolder.mThreadAvatarIV, searchThreadViewData.getAvatarId(), 40, 40);
        }
    }

    /* renamed from: g */
    private void m206532g(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        if (searchThreadViewData.isSelected()) {
            searchThreadViewHolder.itemView.setBackground(UIHelper.getDrawable(R.drawable.item_desktop_bg_pressed));
            searchThreadViewHolder.mThreadNameTV.setText(searchThreadViewData.getTitle());
            searchThreadViewHolder.mThreadNameTV.setTextColor(UIHelper.getColor(R.color.ud_N00));
            searchThreadViewHolder.mThreadDescTV.setText(searchThreadViewData.getSubTitle());
            searchThreadViewHolder.mThreadDescTV.setTextColor(UIHelper.getColor(R.color.ud_N00));
            if (DesktopUtil.m144301a(this.f131843c)) {
                searchThreadViewHolder.mDelayTagIV.setImageResource(R.drawable.ic_svg_later_selected);
                return;
            }
            return;
        }
        searchThreadViewHolder.itemView.setBackgroundResource(R.drawable.item_bg_selector_c11);
        searchThreadViewHolder.mThreadNameTV.setTextColor(UIHelper.getColor(R.color.ud_N900));
        mo182006a(searchThreadViewHolder, searchThreadViewData);
        searchThreadViewHolder.mThreadDescTV.setTextColor(UIHelper.getColor(R.color.ud_N900));
        m206533h(searchThreadViewHolder, searchThreadViewData);
        if (DesktopUtil.m144301a(this.f131843c)) {
            searchThreadViewHolder.mDelayTagIV.setImageResource(R.drawable.ic_svg_later);
        }
    }

    /* renamed from: a */
    public void mo182006a(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData) {
        if (!TextUtils.isEmpty(searchThreadViewData.getTitle())) {
            searchThreadViewHolder.mThreadNameTV.setText(C57782ag.m224235a(searchThreadViewData.getTitle(), searchThreadViewData.getTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
        } else {
            searchThreadViewHolder.mThreadNameTV.setText(UIHelper.getString(R.string.Lark_Legacy_SearchUnknown));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181987a(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData, boolean z) {
        searchThreadViewData.setSelected(z);
        m206532g(searchThreadViewHolder, searchThreadViewData);
    }

    /* renamed from: b */
    private void m206527b(SearchThreadViewHolder searchThreadViewHolder, final SearchThreadViewData searchThreadViewData, final AbstractC53343b bVar, final int i) {
        searchThreadViewHolder.itemView.setOnClickListener(new OnSearchSingleClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.binder.C53360e.View$OnClickListenerC533611 */

            public void onClick(View view) {
                AbstractC53343b bVar = bVar;
                if (bVar != null) {
                    bVar.mo181980a(searchThreadViewData, i);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo181986a(SearchThreadViewHolder searchThreadViewHolder, SearchThreadViewData searchThreadViewData, AbstractC53343b bVar, int i) {
        super.mo181986a((RecyclerView.ViewHolder) searchThreadViewHolder, (SearchBaseViewData) searchThreadViewData, bVar, i);
        m206528c(searchThreadViewHolder, searchThreadViewData);
        m206529d(searchThreadViewHolder, searchThreadViewData);
        m206530e(searchThreadViewHolder, searchThreadViewData);
        m206525a(searchThreadViewHolder);
        m206526b(searchThreadViewHolder, searchThreadViewData);
        m206532g(searchThreadViewHolder, searchThreadViewData);
        if (DesktopUtil.m144301a(this.f131843c)) {
            m206531f(searchThreadViewHolder, searchThreadViewData);
        }
        m206527b(searchThreadViewHolder, searchThreadViewData, bVar, i);
    }
}
