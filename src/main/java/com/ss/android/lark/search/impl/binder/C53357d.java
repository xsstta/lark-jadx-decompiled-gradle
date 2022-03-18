package com.ss.android.lark.search.impl.binder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.binder.chattag.SearchTagProvider;
import com.ss.android.lark.search.impl.binder.listeners.OnSearchSingleClickListener;
import com.ss.android.lark.search.impl.binder.viewholder.SearchChatterViewHolder;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchChatterViewData;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;

/* renamed from: com.ss.android.lark.search.impl.binder.d */
public class C53357d extends AbstractC53349a<SearchChatterViewHolder, SearchChatterViewData> {

    /* renamed from: d */
    private ISearchModuleDependency.ISettingServiceDependency f131870d = C53258a.m205939a().mo181764m();

    /* renamed from: e */
    private ISearchModuleDependency.AbstractC53328n f131871e = C53258a.m205939a().mo181761j();

    /* renamed from: a */
    private boolean m206502a(SearchChatterViewData searchChatterViewData) {
        return searchChatterViewData.isShowBotTag();
    }

    public C53357d(Context context) {
        super(context);
    }

    /* renamed from: c */
    private boolean m206507c(SearchChatterViewData searchChatterViewData) {
        if (!searchChatterViewData.isShowTag() || !searchChatterViewData.isCrossTenant() || this.f131871e.mo181818d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m206505b(SearchChatterViewData searchChatterViewData) {
        ChatterDescription chatterDescription = searchChatterViewData.getChatterDescription();
        if (chatterDescription == null) {
            return true;
        }
        if (TextUtils.isEmpty(chatterDescription.description) && chatterDescription.type == ChatterDescription.Type.DEFAULT) {
            return true;
        }
        if (!m206502a(searchChatterViewData) || DesktopUtil.m144301a(this.f131843c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public SearchChatterViewHolder mo181985a(ViewGroup viewGroup) {
        View view;
        if (DesktopUtil.m144301a(this.f131843c)) {
            view = LayoutInflater.from(this.f131843c).inflate(R.layout.item_desktop_search_chatter, viewGroup, false);
        } else {
            view = LayoutInflater.from(this.f131843c).inflate(R.layout.item_search_chatter, viewGroup, false);
        }
        return new SearchChatterViewHolder(view);
    }

    /* renamed from: b */
    private void m206503b(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        int i;
        ImageView imageView = searchChatterViewHolder.mDelayTag;
        if (searchChatterViewData.isDelayed()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: d */
    private void m206508d(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        int i;
        ImageView imageView = searchChatterViewHolder.mSecretChatTagIV;
        if (searchChatterViewData.isSecretP2PChat()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: g */
    private void m206511g(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        if (searchChatterViewData.isRegistered() || searchChatterViewData.getType() == Chatter.ChatterType.BOT) {
            searchChatterViewHolder.mUnRegisteredFlagTV.setVisibility(8);
        } else {
            searchChatterViewHolder.mUnRegisteredFlagTV.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m206513i(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        C53258a.m205939a().mo181758g().mo181805a(this.f131843c, searchChatterViewData.getAvatarKey(), searchChatterViewHolder.mSingleAvatarIV, searchChatterViewData.getAvatarId(), 40, 40);
    }

    /* renamed from: k */
    private void m206515k(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        int i;
        boolean a = this.f131870d.mo181820a(searchChatterViewData.getZenModeEndTime());
        View view = searchChatterViewHolder.mDoNotDisturbTag;
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: c */
    private void m206506c(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        int i;
        TextView textView = searchChatterViewHolder.mBotTagTV;
        if (m206502a(searchChatterViewData)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LarkNameTag.m92203a(this.f131843c).mo90012b(SearchTagProvider.f131848a).mo90036g(m206502a(searchChatterViewData)).mo90027e().mo90003a((View) searchChatterViewHolder.mBotTagTV);
    }

    /* renamed from: e */
    private void m206509e(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        if (WorkStatus.isInvalid(searchChatterViewData.getWorkStatus()) || m206502a(searchChatterViewData)) {
            searchChatterViewHolder.mWorkStatusTV.setVisibility(8);
            return;
        }
        searchChatterViewHolder.mWorkStatusTV.setVisibility(0);
        searchChatterViewHolder.mWorkStatusTV.setText(searchChatterViewData.getWorkStatus().getDisplayTextNoDuration(this.f131843c));
    }

    /* renamed from: f */
    private void m206510f(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        ChatterDescription chatterDescription = searchChatterViewData.getChatterDescription();
        if (m206505b(searchChatterViewData)) {
            searchChatterViewHolder.mUserStatus.setVisibility(8);
            return;
        }
        searchChatterViewHolder.mUserStatus.setVisibility(0);
        searchChatterViewHolder.mUserStatus.mo201154a(chatterDescription.description, UIUtils.getDrawable(this.f131843c, UserStatusHelper.m224138a().mo195998a(chatterDescription.type.getNumber())));
    }

    /* renamed from: h */
    private void m206512h(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        String str;
        if (TextUtils.isEmpty(searchChatterViewData.getSubTitle())) {
            str = "";
        } else {
            str = searchChatterViewData.getSubTitle();
        }
        if (!TextUtils.isEmpty(str)) {
            searchChatterViewHolder.mDescriptionTV.setVisibility(0);
            searchChatterViewHolder.mDescriptionTV.setText(str);
            return;
        }
        searchChatterViewHolder.mDescriptionTV.setVisibility(8);
    }

    /* renamed from: j */
    private void m206514j(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        int i;
        TextView textView = searchChatterViewHolder.mTagTV;
        if (m206507c(searchChatterViewData)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LarkNameTag.m92203a(this.f131843c).mo90012b(SearchTagProvider.f131848a).mo90037h(m206507c(searchChatterViewData)).mo90027e().mo90003a((View) searchChatterViewHolder.mTagTV);
    }

    /* renamed from: l */
    private void m206516l(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        String title = searchChatterViewData.getTitle();
        if (!TextUtils.isEmpty(title)) {
            searchChatterViewHolder.mNameTV.setText(C57782ag.m224235a(title, searchChatterViewData.getTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
        } else {
            searchChatterViewHolder.mNameTV.setText(UIHelper.getString(R.string.Lark_Legacy_SearchUnknown));
        }
    }

    /* renamed from: m */
    private void m206517m(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        String extraTitle = searchChatterViewData.getExtraTitle();
        if (!TextUtils.isEmpty(extraTitle)) {
            searchChatterViewHolder.mMailTv.setText(C57782ag.m224235a(extraTitle, searchChatterViewData.getExtraTitleHitTerms(), UIHelper.getColor(R.color.ud_B500)));
            searchChatterViewHolder.mMailTv.setVisibility(0);
            return;
        }
        searchChatterViewHolder.mMailTv.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182000a(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData) {
        if (DesktopUtil.m144301a(this.f131843c)) {
            searchChatterViewHolder.mBotTagTV.setSelected(searchChatterViewData.isSelected());
        }
        if (searchChatterViewData.isSelected()) {
            searchChatterViewHolder.itemView.setBackground(UIHelper.getDrawable(R.drawable.item_desktop_bg_pressed));
            searchChatterViewHolder.mNameTV.setText(searchChatterViewData.getTitle());
            searchChatterViewHolder.mNameTV.setTextColor(UIHelper.getColor(R.color.ud_N00));
            searchChatterViewHolder.mMailTv.setText(searchChatterViewData.getExtraTitle());
            searchChatterViewHolder.mMailTv.setTextColor(UIHelper.getColor(R.color.ud_N00));
            searchChatterViewHolder.mUserStatus.setTextColor(UIHelper.getColor(R.color.ud_N00));
            searchChatterViewHolder.mDescriptionTV.setTextColor(UIHelper.getColor(R.color.ud_N00));
            if (DesktopUtil.m144301a(this.f131843c)) {
                searchChatterViewHolder.mDelayTag.setImageResource(R.drawable.ic_svg_later_selected);
                return;
            }
            return;
        }
        searchChatterViewHolder.itemView.setBackgroundResource(R.drawable.item_bg_selector_c11);
        searchChatterViewHolder.mNameTV.setTextColor(UIHelper.getColor(R.color.ud_N900));
        m206516l(searchChatterViewHolder, searchChatterViewData);
        searchChatterViewHolder.mMailTv.setTextColor(UIHelper.getColor(R.color.ud_N500));
        m206517m(searchChatterViewHolder, searchChatterViewData);
        searchChatterViewHolder.mUserStatus.setTextColor(UIHelper.getColor(R.color.ud_N500));
        searchChatterViewHolder.mDescriptionTV.setTextColor(UIHelper.getColor(R.color.ud_N500));
        if (DesktopUtil.m144301a(this.f131843c)) {
            searchChatterViewHolder.mDelayTag.setImageResource(R.drawable.ic_svg_later);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181987a(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData, boolean z) {
        searchChatterViewData.setSelected(z);
        mo182000a(searchChatterViewHolder, searchChatterViewData);
    }

    /* renamed from: a */
    private void m206501a(SearchChatterViewHolder searchChatterViewHolder, final SearchChatterViewData searchChatterViewData, final int i, final AbstractC53343b bVar) {
        searchChatterViewHolder.mPersonalCardIV.setVisibility(0);
        searchChatterViewHolder.mPersonalCardIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.binder.C53357d.View$OnClickListenerC533592 */

            public void onClick(View view) {
                AbstractC53343b bVar = bVar;
                if (bVar != null) {
                    bVar.mo181981a(searchChatterViewData, i, "chatter_partial_click/open_contact_profile");
                }
            }
        });
    }

    /* renamed from: b */
    private void m206504b(SearchChatterViewHolder searchChatterViewHolder, final SearchChatterViewData searchChatterViewData, final AbstractC53343b bVar, final int i) {
        searchChatterViewHolder.itemView.setOnClickListener(new OnSearchSingleClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.binder.C53357d.View$OnClickListenerC533581 */

            public void onClick(View view) {
                AbstractC53343b bVar = bVar;
                if (bVar != null) {
                    bVar.mo181980a(searchChatterViewData, i);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo181986a(SearchChatterViewHolder searchChatterViewHolder, SearchChatterViewData searchChatterViewData, AbstractC53343b bVar, int i) {
        super.mo181986a((RecyclerView.ViewHolder) searchChatterViewHolder, (SearchBaseViewData) searchChatterViewData, bVar, i);
        m206516l(searchChatterViewHolder, searchChatterViewData);
        m206513i(searchChatterViewHolder, searchChatterViewData);
        m206512h(searchChatterViewHolder, searchChatterViewData);
        m206508d(searchChatterViewHolder, searchChatterViewData);
        m206506c(searchChatterViewHolder, searchChatterViewData);
        m206510f(searchChatterViewHolder, searchChatterViewData);
        m206509e(searchChatterViewHolder, searchChatterViewData);
        m206514j(searchChatterViewHolder, searchChatterViewData);
        m206515k(searchChatterViewHolder, searchChatterViewData);
        m206511g(searchChatterViewHolder, searchChatterViewData);
        m206501a(searchChatterViewHolder, searchChatterViewData, i, bVar);
        m206517m(searchChatterViewHolder, searchChatterViewData);
        mo182000a(searchChatterViewHolder, searchChatterViewData);
        m206504b(searchChatterViewHolder, searchChatterViewData, bVar, i);
        if (DesktopUtil.m144301a(this.f131843c)) {
            m206503b(searchChatterViewHolder, searchChatterViewData);
        }
        if (DesktopUtil.m144301a(this.f131843c)) {
            searchChatterViewHolder.mPersonalCardIV.setVisibility(8);
            if (searchChatterViewHolder.mBadge != null) {
                mo181988a(searchChatterViewHolder.mBadge, searchChatterViewData.getNewMsgCount(), searchChatterViewData.isRemind());
            } else {
                mo181989a(searchChatterViewHolder.mSingleAvatarIV, searchChatterViewData.getNewMsgCount(), searchChatterViewData.isRemind());
            }
        }
    }
}
