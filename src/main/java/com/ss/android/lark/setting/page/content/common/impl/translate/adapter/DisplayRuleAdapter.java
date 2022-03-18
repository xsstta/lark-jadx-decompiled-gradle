package com.ss.android.lark.setting.page.content.common.impl.translate.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;

public class DisplayRuleAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, LanguageInfo> {

    /* renamed from: a */
    private final LayoutInflater f134248a;

    /* renamed from: b */
    private AbstractC54228a f134249b;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.adapter.DisplayRuleAdapter$a */
    public interface AbstractC54228a {
        /* renamed from: a */
        void mo185615a(LanguageInfo languageInfo);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f134251a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f134251a;
            if (viewHolder != null) {
                this.f134251a = null;
                viewHolder.mLanguageNameTV = null;
                viewHolder.mDisplayRuleTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f134251a = viewHolder;
            viewHolder.mLanguageNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.language_name, "field 'mLanguageNameTV'", TextView.class);
            viewHolder.mDisplayRuleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.display_rule, "field 'mDisplayRuleTV'", TextView.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210611a(LanguageInfo languageInfo, View view) {
        AbstractC54228a aVar = this.f134249b;
        if (aVar != null) {
            aVar.mo185615a(languageInfo);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(6850)
        public TextView mDisplayRuleTV;
        @BindView(7172)
        public TextView mLanguageNameTV;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(this.f134248a.inflate(R.layout.item_translate_display_rule_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        LanguageInfo languageInfo = (LanguageInfo) getItem(i);
        if (languageInfo != null) {
            viewHolder.mLanguageNameTV.setText(languageInfo.getDisplayName());
            viewHolder.mDisplayRuleTV.setText(languageInfo.getDisplayRuleResId());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(languageInfo) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.adapter.$$Lambda$DisplayRuleAdapter$XcyirJkccksxethxVyFA3MO9ZKs */
                public final /* synthetic */ LanguageInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DisplayRuleAdapter.lambda$XcyirJkccksxethxVyFA3MO9ZKs(DisplayRuleAdapter.this, this.f$1, view);
                }
            });
        }
    }
}
