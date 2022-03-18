package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.b */
public class C54202b extends LanguageSelectAdapter {
    /* renamed from: a */
    public void mo185513a(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        if (UIUtils.isVisible(languageItemViewHolder.mRetryDownloadLayout)) {
            languageItemViewHolder.mRetryDownloadLayout.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m210440d(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        languageItemViewHolder.itemView.setClickable(true);
        Log.m165389i("DynamicLanguageSelectAd", "show retry");
        languageItemViewHolder.mLanguageSelectedRB.setChecked(false);
        m210441e(languageItemViewHolder);
        UIUtils.show(languageItemViewHolder.mRetryDownloadLayout);
    }

    /* renamed from: e */
    private void m210441e(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        if (UIUtils.isVisible(languageItemViewHolder.mLkuiLottieAnimationView)) {
            UIUtils.hide(languageItemViewHolder.mLkuiLottieAnimationView);
            languageItemViewHolder.mLkuiLottieAnimationView.cancelAnimation();
        }
    }

    /* renamed from: g */
    private void m210443g(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        UIUtils.show(languageItemViewHolder.mLkuiLottieAnimationView);
        languageItemViewHolder.mLkuiLottieAnimationView.setAnimation("lottie/loading_B500.json");
        languageItemViewHolder.mLkuiLottieAnimationView.setRepeatCount(-1);
        languageItemViewHolder.mLkuiLottieAnimationView.playAnimation();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo185514b(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        languageItemViewHolder.itemView.setClickable(true);
        Log.m165389i("DynamicLanguageSelectAd", "Show selection box-----------ok");
        m210441e(languageItemViewHolder);
        mo185513a(languageItemViewHolder);
        if (languageItemViewHolder.mLanguageSelectedRB != null) {
            languageItemViewHolder.mLanguageSelectedRB.setChecked(true);
        }
    }

    /* renamed from: f */
    private void m210442f(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        languageItemViewHolder.itemView.setClickable(true);
        Log.m165389i("DynamicLanguageSelectAd", "nothing to show-----------ok");
        m210441e(languageItemViewHolder);
        mo185513a(languageItemViewHolder);
        if (UIUtils.isVisible(languageItemViewHolder.mLanguageSelectedRB)) {
            languageItemViewHolder.mLanguageSelectedRB.setChecked(false);
        }
    }

    /* renamed from: c */
    public void mo185515c(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder) {
        languageItemViewHolder.itemView.setClickable(false);
        Log.m165389i("DynamicLanguageSelectAd", "show loading-----------ok");
        if (!UIUtils.isVisible(languageItemViewHolder.mLkuiLottieAnimationView)) {
            mo185513a(languageItemViewHolder);
            if (languageItemViewHolder.mLanguageSelectedRB != null) {
                languageItemViewHolder.mLanguageSelectedRB.setChecked(false);
            }
            m210443g(languageItemViewHolder);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter
    /* renamed from: a */
    public void mo185472a(int i) {
        List<LanguagePickBean> items = getItems();
        for (LanguagePickBean languagePickBean : items) {
            languagePickBean.mo185464a(2);
        }
        Locale a = ((LanguagePickBean) items.get(i)).mo185463a();
        if (a == null) {
            notifyDataSetChanged();
            return;
        }
        if (this.f134148a.mo185478a(a.getLanguage()) || "en-US".equals(a.toLanguageTag())) {
            ((LanguagePickBean) getItem(i)).mo185464a(1);
        } else {
            ((LanguagePickBean) getItem(i)).mo185464a(3);
        }
        notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter
    /* renamed from: a */
    public void onBindViewHolder(final LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder, final int i) {
        final LanguagePickBean languagePickBean = (LanguagePickBean) getItem(i);
        super.onBindViewHolder(languageItemViewHolder, i);
        languageItemViewHolder.mRetryDownloadLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54202b.View$OnClickListenerC542031 */

            public void onClick(View view) {
                if (C54202b.this.f134148a != null) {
                    C54202b.this.mo185513a(languageItemViewHolder);
                    C54202b.this.mo185472a(i);
                    C54202b.this.f134148a.mo185477a(languagePickBean);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter
    /* renamed from: b */
    public void mo185475b(LanguageSelectAdapter.LanguageItemViewHolder languageItemViewHolder, int i) {
        if (i == 1) {
            mo185514b(languageItemViewHolder);
        } else if (i == 2) {
            m210442f(languageItemViewHolder);
        } else if (i == 3) {
            mo185515c(languageItemViewHolder);
        } else if (i == 4) {
            m210440d(languageItemViewHolder);
        }
    }
}
