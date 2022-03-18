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

public class AutoTranslateSettingView extends C54279c {

    /* renamed from: a */
    public CheckListAdapter f134327a;

    /* renamed from: f */
    private TextView f134328f;

    /* renamed from: g */
    private LanguageTagAdapter f134329g;
    @BindView(6840)
    public View mDisAutoLanguageLayout;
    @BindView(6841)
    public RecyclerView mDisAutoLanguageRV;
    @BindView(7170)
    public RecyclerView mLanguageRV;
    @BindView(7912)
    public CommonTitleBar mTitleBar;

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185763a() {
        super.mo185763a();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m210722h();
        m210721g();
    }

    /* renamed from: h */
    private void m210722h() {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Completed)) {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AutoTranslateSettingView.C542681 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                AutoTranslateSettingView.this.f134351d.mo185775a(new ArrayList(AutoTranslateSettingView.this.f134327a.mo185606a()));
            }
        });
        this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AutoTranslateSettingView.C542692 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                AutoTranslateSettingView.this.f134350c.mo185591a();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f134328f = rightText;
        rightText.setTextColor(this.f134349b.getResources().getColor(R.color.lkui_B500));
        this.f134328f.setVisibility(8);
    }

    /* renamed from: g */
    private void m210721g() {
        this.mLanguageRV.setLayoutManager(new LinearLayoutManager(this.f134349b, 1, false));
        CheckListAdapter checkListAdapter = new CheckListAdapter(this.f134349b, R.layout.item_auto_translate_language_layout);
        this.f134327a = checkListAdapter;
        checkListAdapter.mo185610a(false);
        this.f134327a.mo185608a(new CheckListAdapter.AbstractC54227a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$AutoTranslateSettingView$2mKBDYi7EZYSx9ZlDKyYYrQgVI8 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter.AbstractC54227a
            public final void onCheckChanged(Set set) {
                AutoTranslateSettingView.this.m210720a((AutoTranslateSettingView) set);
            }
        });
        this.mLanguageRV.setAdapter(this.f134327a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f134349b, 0, false);
        this.mDisAutoLanguageRV.setLayoutManager(linearLayoutManager);
        C1382h hVar = new C1382h(this.f134349b, linearLayoutManager.getOrientation());
        hVar.mo7418a(UIUtils.getDrawable(this.f134349b, R.drawable.item_language_tag_divider));
        this.mDisAutoLanguageRV.addItemDecoration(hVar);
        this.mDisAutoLanguageRV.setItemAnimator(null);
        LanguageTagAdapter languageTagAdapter = new LanguageTagAdapter(this.f134349b);
        this.f134329g = languageTagAdapter;
        languageTagAdapter.mo185618a(new LanguageTagAdapter.AbstractC54229a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$AutoTranslateSettingView$POF7fMNE3CqTldZ6X55bfvMvtYE */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.adapter.LanguageTagAdapter.AbstractC54229a
            public final void onItemClick(LanguageInfo languageInfo) {
                AutoTranslateSettingView.this.m210719a((AutoTranslateSettingView) languageInfo);
            }
        });
        this.mDisAutoLanguageRV.setAdapter(this.f134329g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210720a(Set set) {
        this.f134351d.mo185776a(set);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185765a(boolean z) {
        int i;
        super.mo185765a(z);
        TextView textView = this.f134328f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210719a(LanguageInfo languageInfo) {
        this.f134327a.mo185606a().remove(languageInfo.getKey());
        this.f134351d.mo185776a(this.f134327a.mo185606a());
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185764a(List<LanguageInfo> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (LanguageInfo languageInfo : list) {
            if (!languageInfo.isTargetLanguage()) {
                arrayList2.add(new C54226a(languageInfo.getKey(), languageInfo.getDisplayName()));
                if (languageInfo.isDisAutoTranslate()) {
                    hashSet.add(languageInfo.getKey());
                    arrayList.add(languageInfo);
                }
            }
        }
        this.f134327a.mo185609a(hashSet);
        if (CollectionUtils.isEmpty(this.f134327a.getItems())) {
            this.f134327a.resetAll(arrayList2);
        } else {
            this.f134327a.notifyDataSetChanged();
        }
        this.f134329g.resetAll(arrayList);
        View view = this.mDisAutoLanguageLayout;
        if (CollectionUtils.isEmpty(arrayList)) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public AutoTranslateSettingView(Context context, C54279c.AbstractC54280a aVar) {
        super(context, aVar);
    }
}
