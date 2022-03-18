package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2665a.C54226a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TranslateDisplaySettingView extends C54279c {

    /* renamed from: a */
    public CheckListAdapter f134340a;
    @BindView(7440)
    public RecyclerView mOptionListRV;
    @BindView(7771)
    public TextView mSpecificLanguageSettingDescView;
    @BindView(7770)
    public View mSpecificLanguageSettingView;
    @BindView(7912)
    public CommonTitleBar mTitlebar;

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m210733g();
    }

    /* renamed from: g */
    private void m210733g() {
        this.mOptionListRV.setLayoutManager(new LinearLayoutManager(this.f134349b, 1, false));
        CheckListAdapter checkListAdapter = new CheckListAdapter(this.f134349b);
        this.f134340a = checkListAdapter;
        checkListAdapter.mo185608a(new CheckListAdapter.AbstractC54227a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.mvp.$$Lambda$TranslateDisplaySettingView$T34dIQgoYSSzWbk6mKqy2m_PnnQ */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.adapter.CheckListAdapter.AbstractC54227a
            public final void onCheckChanged(Set set) {
                TranslateDisplaySettingView.this.m210732a((TranslateDisplaySettingView) set);
            }
        });
        this.mOptionListRV.setAdapter(this.f134340a);
        m210734h();
    }

    /* renamed from: h */
    private void m210734h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C54226a(String.valueOf(2), C57582a.m223604a(this.f134349b, LanguageInfo.getDisplayRuleResId(2))));
        arrayList.add(new C54226a(String.valueOf(3), C57582a.m223604a(this.f134349b, LanguageInfo.getDisplayRuleResId(3))));
        this.f134340a.resetAll(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210732a(Set set) {
        this.f134351d.mo185776a(set);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185768a(String str) {
        super.mo185768a(str);
        this.mTitlebar.setTitle(str);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185767a(int i) {
        super.mo185767a(i);
        HashSet hashSet = new HashSet();
        hashSet.add(String.valueOf(i));
        this.f134340a.mo185609a(hashSet);
        this.f134340a.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: c */
    public void mo185769c(boolean z) {
        int i;
        super.mo185769c(z);
        View view = this.mSpecificLanguageSettingView;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        TextView textView = this.mSpecificLanguageSettingDescView;
        if (!z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public TranslateDisplaySettingView(Context context, C54279c.AbstractC54280a aVar) {
        super(context, aVar);
    }
}
