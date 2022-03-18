package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C1382h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter;
import com.ss.android.lark.setting.page.content.common.impl.translate.adapter.LanguageTagAdapter;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2665a.C54226a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecificDisplaySettingView extends C54279c {

    /* renamed from: a */
    public CheckListAdapter f134333a;

    /* renamed from: f */
    public int f134334f;

    /* renamed from: g */
    private TextView f134335g;

    /* renamed from: h */
    private LanguageTagAdapter f134336h;
    @BindView(7765)
    public TextView mDisplayRuleDescTV;
    @BindView(7769)
    public RecyclerView mLanguageListRV;
    @BindView(7767)
    public View mSpecificDisplayLayout;
    @BindView(7768)
    public RecyclerView mSpecificDisplayRuleRV;
    @BindView(7912)
    public CommonTitleBar mTitleBar;

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m210728g();
        m210729h();
    }

    /* renamed from: g */
    private void m210728g() {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Completed)) {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.SpecificDisplaySettingView.C542701 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                SpecificDisplaySettingView.this.f134351d.mo185797b(SpecificDisplaySettingView.this.f134334f, SpecificDisplaySettingView.this.f134333a.mo185606a());
            }
        });
        this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.SpecificDisplaySettingView.C542712 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                SpecificDisplaySettingView.this.f134350c.mo185591a();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f134335g = rightText;
        rightText.setTextColor(this.f134349b.getResources().getColor(R.color.lkui_B500));
        this.f134335g.setVisibility(8);
    }

    /* renamed from: h */
    private void m210729h() {
        this.mLanguageListRV.setLayoutManager(new LinearLayoutManager(this.f134349b, 1, false));
        CheckListAdapter checkListAdapter = new CheckListAdapter(this.f134349b, R.layout.item_auto_translate_language_layout);
        this.f134333a = checkListAdapter;
        checkListAdapter.mo185610a(false);
        this.f134333a.mo185608a(new CheckListAdapter.AbstractC54227a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$SpecificDisplaySettingView$9jfw36w1cXTnGemZoFj12p_hwkA */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter.AbstractC54227a
            public final void onCheckChanged(Set set) {
                SpecificDisplaySettingView.this.m210727a((SpecificDisplaySettingView) set);
            }
        });
        this.mLanguageListRV.setAdapter(this.f134333a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f134349b, 0, false);
        this.mSpecificDisplayRuleRV.setLayoutManager(linearLayoutManager);
        C1382h hVar = new C1382h(this.f134349b, linearLayoutManager.getOrientation());
        hVar.mo7418a(UIUtils.getDrawable(this.f134349b, R.drawable.item_language_tag_divider));
        this.mSpecificDisplayRuleRV.addItemDecoration(hVar);
        this.mSpecificDisplayRuleRV.setItemAnimator(null);
        LanguageTagAdapter languageTagAdapter = new LanguageTagAdapter(this.f134349b);
        this.f134336h = languageTagAdapter;
        languageTagAdapter.mo185618a(new LanguageTagAdapter.AbstractC54229a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$SpecificDisplaySettingView$085wMEvkGqVV5oiNUDo14YdXQ4 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.adapter.LanguageTagAdapter.AbstractC54229a
            public final void onItemClick(LanguageInfo languageInfo) {
                SpecificDisplaySettingView.this.m210726a((SpecificDisplaySettingView) languageInfo);
            }
        });
        this.mSpecificDisplayRuleRV.setAdapter(this.f134336h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210727a(Set set) {
        this.f134351d.mo185793a(this.f134334f, set);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185765a(boolean z) {
        int i;
        super.mo185765a(z);
        TextView textView = this.f134335g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210726a(LanguageInfo languageInfo) {
        this.f134333a.mo185606a().remove(languageInfo.getKey());
        this.f134351d.mo185793a(this.f134334f, this.f134333a.mo185606a());
    }

    public SpecificDisplaySettingView(Context context, C54279c.AbstractC54280a aVar) {
        super(context, aVar);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185766a(int i, List<LanguageInfo> list) {
        int i2;
        int i3;
        int i4 = 2;
        if (i == 2) {
            i4 = 3;
        }
        this.f134334f = i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (LanguageInfo languageInfo : list) {
            if (!languageInfo.isTargetLanguage()) {
                arrayList2.add(new C54226a(languageInfo.getKey(), languageInfo.getDisplayName()));
                if (languageInfo.getDisplayRule() == this.f134334f) {
                    hashSet.add(languageInfo.getKey());
                    arrayList.add(languageInfo);
                }
            }
        }
        this.f134333a.mo185609a(hashSet);
        if (CollectionUtils.isEmpty(this.f134333a.getItems())) {
            this.f134333a.resetAll(arrayList2);
        } else {
            this.f134333a.notifyDataSetChanged();
        }
        this.f134336h.resetAll(arrayList);
        View view = this.mSpecificDisplayLayout;
        if (CollectionUtils.isEmpty(arrayList)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        TextView textView = this.mDisplayRuleDescTV;
        Context context = this.f134349b;
        if (this.f134334f == 3) {
            i3 = R.string.Lark_Chat_TranslationAndOriginalMessage;
        } else {
            i3 = R.string.Lark_Chat_TranslationOnly;
        }
        textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Chat_AdvancedSettingDescriptionMobile, "translate_effect", UIUtils.getString(context, i3)));
    }
}
