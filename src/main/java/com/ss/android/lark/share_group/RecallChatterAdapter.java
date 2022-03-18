package com.ss.android.lark.share_group;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.dependency.AbstractC36509x;

public class RecallChatterAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, RecallItemViewData> {

    /* renamed from: a */
    private static int f135284a;

    /* renamed from: b */
    private AbstractC36509x f135285b = C29990c.m110930b().mo134597y();

    /* renamed from: c */
    private Context f135286c;

    /* renamed from: d */
    private AbstractC54796a f135287d;

    /* renamed from: com.ss.android.lark.share_group.RecallChatterAdapter$a */
    public interface AbstractC54796a {
        /* renamed from: a */
        void mo186979a(RecallItemViewData eVar);

        /* renamed from: b */
        void mo186980b(RecallItemViewData eVar);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f135289a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f135289a;
            if (viewHolder != null) {
                this.f135289a = null;
                viewHolder.mChatterAvatarIV = null;
                viewHolder.mChatterNameTV = null;
                viewHolder.mRecallTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f135289a = viewHolder;
            viewHolder.mChatterAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.chatter_avatar, "field 'mChatterAvatarIV'", LKUIRoundedImageView.class);
            viewHolder.mChatterNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chatter_name, "field 'mChatterNameTV'", TextView.class);
            viewHolder.mRecallTV = (TextView) Utils.findRequiredViewAsType(view, R.id.recall_btn, "field 'mRecallTV'", TextView.class);
        }
    }

    /* renamed from: a */
    public void mo186978a(AbstractC54796a aVar) {
        this.f135287d = aVar;
    }

    public RecallChatterAdapter(Context context) {
        this.f135286c = context;
        f135284a = UIUtils.dp2px(context, 48.0f);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m212554a(RecallItemViewData eVar, View view) {
        AbstractC54796a aVar = this.f135287d;
        if (aVar != null) {
            aVar.mo186980b(eVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m212555b(RecallItemViewData eVar, View view) {
        AbstractC54796a aVar = this.f135287d;
        if (aVar != null) {
            aVar.mo186979a(eVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m212556c(RecallItemViewData eVar, View view) {
        AbstractC54796a aVar = this.f135287d;
        if (aVar != null) {
            aVar.mo186979a(eVar);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LKUIRoundedImageView mChatterAvatarIV;
        TextView mChatterNameTV;
        TextView mRecallTV;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            RecallChatterAdapter.this = r1;
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recall_chatter_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        RecallItemViewData eVar = (RecallItemViewData) getItem(i);
        if (eVar != null) {
            if (eVar.mo187038a() == 3) {
                viewHolder.mChatterAvatarIV.setImageResource(eVar.mo187044c());
            } else {
                Context context = this.f135286c;
                LKUIRoundedImageView lKUIRoundedImageView = viewHolder.mChatterAvatarIV;
                String d = eVar.mo187045d();
                String b = eVar.mo187041b();
                int i2 = f135284a;
                C34336c.m133129a(context, lKUIRoundedImageView, d, b, i2, i2);
            }
            viewHolder.mChatterNameTV.setText(eVar.mo187046e());
            viewHolder.mChatterAvatarIV.setOnClickListener(new View.OnClickListener(eVar) {
                /* class com.ss.android.lark.share_group.$$Lambda$RecallChatterAdapter$T7HCsoWZ_xQxwnPib3AYCWTLc0 */
                public final /* synthetic */ RecallItemViewData f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    RecallChatterAdapter.m270983lambda$T7HCsoWZ_xQxwnPib3AYCWTLc0(RecallChatterAdapter.this, this.f$1, view);
                }
            });
            viewHolder.mChatterNameTV.setOnClickListener(new View.OnClickListener(eVar) {
                /* class com.ss.android.lark.share_group.$$Lambda$RecallChatterAdapter$wWWKNAAxAGSarf3Df5C_BJeFv4I */
                public final /* synthetic */ RecallItemViewData f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    RecallChatterAdapter.lambda$wWWKNAAxAGSarf3Df5C_BJeFv4I(RecallChatterAdapter.this, this.f$1, view);
                }
            });
            viewHolder.mRecallTV.setOnClickListener(new View.OnClickListener(eVar) {
                /* class com.ss.android.lark.share_group.$$Lambda$RecallChatterAdapter$0LxOxN5qY_koOByV8qMY0McerEM */
                public final /* synthetic */ RecallItemViewData f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    RecallChatterAdapter.lambda$0LxOxN5qY_koOByV8qMY0McerEM(RecallChatterAdapter.this, this.f$1, view);
                }
            });
        }
    }
}
