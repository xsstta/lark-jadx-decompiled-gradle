package com.ss.android.lark.setting.page.content.common.impl.locale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class LanguageSelectAdapter extends LarkRecyclerViewBaseAdapter<LanguageItemViewHolder, LanguagePickBean> {

    /* renamed from: a */
    public AbstractC54180a f134148a;

    /* renamed from: b */
    private Context f134149b;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter$a */
    public interface AbstractC54180a {
        /* renamed from: a */
        void mo185477a(LanguagePickBean languagePickBean);

        /* renamed from: a */
        boolean mo185478a(String str);
    }

    public class LanguageItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private LanguageItemViewHolder f134153a;

        @Override // butterknife.Unbinder
        public void unbind() {
            LanguageItemViewHolder languageItemViewHolder = this.f134153a;
            if (languageItemViewHolder != null) {
                this.f134153a = null;
                languageItemViewHolder.mLanguageLayout = null;
                languageItemViewHolder.mLanguageName = null;
                languageItemViewHolder.mLanguageSelectedRB = null;
                languageItemViewHolder.mLkuiLottieAnimationView = null;
                languageItemViewHolder.mRetryDownloadLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public LanguageItemViewHolder_ViewBinding(LanguageItemViewHolder languageItemViewHolder, View view) {
            this.f134153a = languageItemViewHolder;
            languageItemViewHolder.mLanguageLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.language_layout, "field 'mLanguageLayout'", RelativeLayout.class);
            languageItemViewHolder.mLanguageName = (TextView) Utils.findRequiredViewAsType(view, R.id.language_name, "field 'mLanguageName'", TextView.class);
            languageItemViewHolder.mLanguageSelectedRB = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.language_selected_image, "field 'mLanguageSelectedRB'", UDCheckBox.class);
            languageItemViewHolder.mLkuiLottieAnimationView = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.language_loading_lottie, "field 'mLkuiLottieAnimationView'", LKUILottieAnimationView.class);
            languageItemViewHolder.mRetryDownloadLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.rl_retry_download, "field 'mRetryDownloadLayout'", RelativeLayout.class);
        }
    }

    /* renamed from: a */
    public void mo185474a(AbstractC54180a aVar) {
        this.f134148a = aVar;
    }

    public static class LanguageItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(7169)
        public RelativeLayout mLanguageLayout;
        @BindView(7172)
        public TextView mLanguageName;
        @BindView(7173)
        public UDCheckBox mLanguageSelectedRB;
        @BindView(7171)
        public LKUILottieAnimationView mLkuiLottieAnimationView;
        @BindView(7580)
        public RelativeLayout mRetryDownloadLayout;

        public LanguageItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) ((LanguagePickBean) getItem(i)).mo185468b().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo185472a(int i) {
        List<LanguagePickBean> items = getItems();
        for (LanguagePickBean languagePickBean : items) {
            languagePickBean.mo185464a(2);
        }
        ((LanguagePickBean) items.get(i)).mo185464a(1);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo185475b(LanguageItemViewHolder languageItemViewHolder, int i) {
        if (i == 1) {
            languageItemViewHolder.mLanguageSelectedRB.setChecked(true);
        } else {
            languageItemViewHolder.mLanguageSelectedRB.setChecked(false);
        }
    }

    /* renamed from: a */
    public LanguageItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f134149b = context;
        LanguageItemViewHolder languageItemViewHolder = new LanguageItemViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_mine_setting_language_item, viewGroup, false));
        DesktopUtil.m144299a(languageItemViewHolder.mLanguageName);
        DesktopUtil.m144298a(languageItemViewHolder.mLanguageLayout);
        return languageItemViewHolder;
    }

    /* renamed from: a */
    public void onBindViewHolder(LanguageItemViewHolder languageItemViewHolder, final int i) {
        final LanguagePickBean languagePickBean = (LanguagePickBean) getItem(i);
        String b = languagePickBean.mo185468b();
        boolean d = languagePickBean.mo185470d();
        int c = languagePickBean.mo185469c();
        if (!d) {
            languageItemViewHolder.mLanguageName.setText(b);
        } else {
            languageItemViewHolder.mLanguageName.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_LanguageSystem, "language", b));
        }
        languageItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSelectAdapter.View$OnClickListenerC541791 */

            public void onClick(View view) {
                if (LanguageSelectAdapter.this.f134148a != null) {
                    Log.m165389i("LanguageSelectAdapter", "clicked language: " + ((LanguagePickBean) LanguageSelectAdapter.this.getItem(i)).mo185463a().toLanguageTag());
                    LanguageSelectAdapter.this.mo185472a(i);
                    if (languagePickBean.mo185470d()) {
                        LanguageSelectAdapter.this.f134148a.mo185477a((LanguagePickBean) null);
                    } else {
                        LanguageSelectAdapter.this.f134148a.mo185477a(languagePickBean);
                    }
                }
            }
        });
        mo185475b(languageItemViewHolder, c);
    }
}
