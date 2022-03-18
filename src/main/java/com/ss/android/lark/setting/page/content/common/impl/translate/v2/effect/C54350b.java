package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.b */
public class C54350b<H> extends RecyclerView.Adapter {

    /* renamed from: a */
    public final AbstractC54353b f134453a;

    /* renamed from: b */
    private List<AbstractC54376b<H>> f134454b = Collections.emptyList();

    /* renamed from: c */
    private final Context f134455c;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.b$b */
    public interface AbstractC54353b {
        /* renamed from: a */
        void mo185844a(AbstractC54376b bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f134454b.size();
    }

    /* renamed from: a */
    public void mo185900a(List<AbstractC54376b<H>> list) {
        if (list == null) {
            Log.m165383e("LanguageEffectSettingAdapter", "set empty data");
            this.f134454b = Collections.emptyList();
        } else {
            this.f134454b = list;
        }
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.b$a */
    private static class C54352a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f134457a;

        /* renamed from: b */
        private final TextView f134458b;

        /* renamed from: c */
        private final TextView f134459c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo185902a(AbstractC54376b bVar) {
            String str;
            this.f134457a.setText(bVar.mo185943b());
            this.f134458b.setText(bVar.mo185945c());
            TextView textView = this.f134459c;
            if (bVar.mo185947d() == null) {
                str = "";
            } else {
                str = bVar.toString();
            }
            textView.setText(str);
            this.itemView.setTag(bVar);
        }

        public C54352a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.language_effect_setting_item_title);
            this.f134457a = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.language_effect_setting_item_description);
            this.f134458b = textView2;
            TextView textView3 = (TextView) view.findViewById(R.id.language_effect_setting_item_value);
            this.f134459c = textView3;
            textView2.setVisibility(8);
            DesktopUtil.m144299a(textView);
            DesktopUtil.m144306b(textView2, textView3);
            if (DesktopUtil.m144307b()) {
                ((ConstraintLayout) view.findViewById(R.id.language_effect_setting_cl)).setMinHeight(UIHelper.dp2px(48.0f));
            }
        }
    }

    /* renamed from: a */
    private AbstractC54376b m210990a(int i) {
        if (this.f134454b.isEmpty()) {
            return null;
        }
        if (this.f134454b.size() > i) {
            return this.f134454b.get(i);
        }
        Log.m165383e("LanguageEffectSettingAdapter", "illegal position, position=" + i);
        return null;
    }

    public C54350b(Context context, AbstractC54353b bVar) {
        this.f134453a = bVar;
        this.f134455c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC54376b a = m210990a(i);
        if ((viewHolder instanceof C54352a) && a != null) {
            ((C54352a) viewHolder).mo185902a(a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C54352a aVar = new C54352a(LayoutInflater.from(this.f134455c).inflate(R.layout.language_effect_setting_item_view, viewGroup, false));
        aVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.C54350b.View$OnClickListenerC543511 */

            public void onClick(View view) {
                Object tag = view.getTag();
                if (tag instanceof AbstractC54376b) {
                    AbstractC54376b bVar = (AbstractC54376b) tag;
                    C54350b.this.f134453a.mo185844a(bVar);
                    Log.m165389i("LanguageEffectSettingAdapter", "on click item, key=" + bVar.mo185939a());
                    return;
                }
                Log.m165383e("LanguageEffectSettingAdapter", "please check LanguageEffectSettingView's tag, it's not ILanguageSettingInfo,which will lose the click effect");
            }
        });
        return aVar;
    }
}
