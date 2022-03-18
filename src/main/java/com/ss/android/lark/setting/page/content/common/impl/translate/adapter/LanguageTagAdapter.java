package com.ss.android.lark.setting.page.content.common.impl.translate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;

public class LanguageTagAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, LanguageInfo> {

    /* renamed from: a */
    private final LayoutInflater f134252a;

    /* renamed from: b */
    private AbstractC54229a f134253b;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.adapter.LanguageTagAdapter$a */
    public interface AbstractC54229a {
        void onItemClick(LanguageInfo languageInfo);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f134255a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f134255a;
            if (viewHolder != null) {
                this.f134255a = null;
                viewHolder.mLanguageNameTV = null;
                viewHolder.mDeleteIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f134255a = viewHolder;
            viewHolder.mLanguageNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.language_name, "field 'mLanguageNameTV'", TextView.class);
            viewHolder.mDeleteIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.tag_delete, "field 'mDeleteIV'", ImageView.class);
        }
    }

    /* renamed from: a */
    public void mo185618a(AbstractC54229a aVar) {
        this.f134253b = aVar;
    }

    public LanguageTagAdapter(Context context) {
        this.f134252a = LayoutInflater.from(context);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7830)
        public ImageView mDeleteIV;
        @BindView(7172)
        public TextView mLanguageNameTV;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210615a(LanguageInfo languageInfo, View view) {
        AbstractC54229a aVar = this.f134253b;
        if (aVar != null) {
            aVar.onItemClick(languageInfo);
        }
        remove(languageInfo);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(this.f134252a.inflate(R.layout.item_translate_tag_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        LanguageInfo languageInfo = (LanguageInfo) getItem(i);
        if (languageInfo != null) {
            viewHolder.mLanguageNameTV.setText(languageInfo.getDisplayName());
            viewHolder.mDeleteIV.setOnClickListener(new View.OnClickListener(languageInfo) {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.adapter.$$Lambda$LanguageTagAdapter$5l1dUsHkMdmo3H_I0kpAtEKZhAo */
                public final /* synthetic */ LanguageInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    LanguageTagAdapter.lambda$5l1dUsHkMdmo3H_I0kpAtEKZhAo(LanguageTagAdapter.this, this.f$1, view);
                }
            });
        }
    }
}
