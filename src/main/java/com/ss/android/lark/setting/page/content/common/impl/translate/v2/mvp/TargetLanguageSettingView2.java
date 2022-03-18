package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter.CheckListAdapter2;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54375a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetLanguageSettingView2 extends C54279c {

    /* renamed from: a */
    private CheckListAdapter2 f134527a;
    @BindView(7170)
    public RecyclerView mLanguageRV;
    @BindView(7912)
    public CommonTitleBar mTitleBar;

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m211126i();
        m211124g();
    }

    /* renamed from: h */
    private String m211125h() {
        ArrayList arrayList = new ArrayList(this.f134527a.mo185828a());
        if (!CollectionUtils.isEmpty(arrayList)) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: g */
    private void m211124g() {
        this.mLanguageRV.setLayoutManager(new LinearLayoutManager(this.f134349b, 1, false));
        CheckListAdapter2 checkListAdapter2 = new CheckListAdapter2(this.f134349b);
        this.f134527a = checkListAdapter2;
        checkListAdapter2.mo185832a(true);
        this.f134527a.mo185830a(new CheckListAdapter2.AbstractC54308a() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.$$Lambda$TargetLanguageSettingView2$VtrJD2X3xlyiTsKqn4dwuuL7IQ0 */

            @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.adapter.CheckListAdapter2.AbstractC54308a
            public final void onCheckChanged(Set set) {
                TargetLanguageSettingView2.this.m211123a((TargetLanguageSettingView2) set);
            }
        });
        this.mLanguageRV.setAdapter(this.f134527a);
        SettingGroupHelper.m88812a(this.mLanguageRV);
    }

    /* renamed from: i */
    private void m211126i() {
        this.mTitleBar.setTitle(R.string.Lark_NewSettings_TranslateContentInto);
        this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TargetLanguageSettingView2.C543801 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                TargetLanguageSettingView2.this.f134350c.mo185591a();
            }
        });
        if (DesktopUtil.m144301a(this.f134349b)) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211123a(Set set) {
        ArrayList arrayList = new ArrayList(set);
        if (!CollectionUtils.isEmpty(arrayList)) {
            this.f134351d.mo185794a((String) arrayList.get(0));
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c, com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185782b(List<LanguageInfo> list) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (LanguageInfo languageInfo : list) {
            arrayList.add(new C54375a(languageInfo.getKey(), languageInfo.getDisplayName(), languageInfo.getI18nName()));
            if (languageInfo.isTargetLanguage()) {
                str = languageInfo.getKey();
            }
        }
        if (this.f134527a.getItemCount() == 0 || this.f134527a.getItemCount() != arrayList.size()) {
            HashSet hashSet = new HashSet();
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
            this.f134527a.mo185831a(hashSet);
            this.f134527a.addAll(arrayList);
            return;
        }
        String h = m211125h();
        if (!TextUtils.equals(str, h)) {
            int a = this.f134527a.mo185826a(h);
            int a2 = this.f134527a.mo185826a(str);
            HashSet hashSet2 = new HashSet();
            if (!TextUtils.isEmpty(str)) {
                hashSet2.add(str);
            }
            this.f134527a.mo185831a(hashSet2);
            this.f134527a.notifyItemChanged(a);
            this.f134527a.notifyItemChanged(a2);
        }
    }

    public TargetLanguageSettingView2(Context context, C54279c.AbstractC54280a aVar) {
        super(context, aVar);
    }
}
