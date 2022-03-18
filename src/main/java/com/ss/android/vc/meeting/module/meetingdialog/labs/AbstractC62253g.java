package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.g */
public abstract class AbstractC62253g extends RecyclerView.Adapter implements AbstractC63598b<EffectModel> {

    /* renamed from: a */
    protected List<EffectModel> f156410a = Collections.emptyList();

    /* renamed from: b */
    protected int f156411b = -1;

    /* renamed from: c */
    protected boolean f156412c = false;

    /* renamed from: d */
    protected AbstractC62302x f156413d;

    /* renamed from: e */
    private boolean f156414e = true;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo215253a(int i, EffectModel effectModel);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo215254a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public int mo215346a() {
        return this.f156411b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f156410a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.g$a */
    public static abstract class AbstractC62254a extends AbstractC62255b {

        /* renamed from: b */
        protected View f156415b;

        /* renamed from: c */
        protected ProgressBar f156416c;

        /* renamed from: d */
        protected TextView f156417d;

        /* renamed from: b */
        public void mo215356b(boolean z) {
            if (this.f156416c != null) {
                m243133c(z);
            }
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215355a(boolean z) {
            super.mo215355a(z);
            TextView textView = this.f156417d;
            if (textView != null) {
                textView.setSelected(z);
            }
        }

        /* renamed from: c */
        private void m243133c(boolean z) {
            int i;
            View view = this.f156415b;
            int i2 = 0;
            if (view != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
            ProgressBar progressBar = this.f156416c;
            if (progressBar != null) {
                if (!z) {
                    i2 = 8;
                }
                progressBar.setVisibility(i2);
            }
        }

        public AbstractC62254a(View view) {
            super(view);
            this.f156415b = view.findViewById(R.id.loading_layout);
            this.f156416c = (ProgressBar) view.findViewById(R.id.effect_loading);
            this.f156417d = (TextView) view.findViewById(R.id.name);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.g$b */
    public static abstract class AbstractC62255b extends RecyclerView.ViewHolder {

        /* renamed from: e */
        protected View f156418e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo215255a(EffectModel effectModel);

        public AbstractC62255b(View view) {
            super(view);
            this.f156418e = view.findViewById(R.id.item);
        }

        /* renamed from: a */
        public void mo215355a(boolean z) {
            int i;
            View view = this.f156418e;
            if (z) {
                i = R.drawable.labs_background_item_selected_bg;
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return mo215253a(i, this.f156410a.get(i));
    }

    @Override // com.ss.android.vc.net.request.AbstractC63598b
    public void onError(C63602e eVar) {
        C60738ac.m236023a((int) R.string.View_VM_UnstableConnectionTryAgain);
        this.f156412c = false;
        mo215348a(this.f156411b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.g$c */
    public static class C62256c extends AbstractC62255b {

        /* renamed from: b */
        protected ImageView f156419b;

        /* renamed from: c */
        protected TextView f156420c;

        public C62256c(View view) {
            super(view);
            this.f156419b = (ImageView) view.findViewById(R.id.icon_desc);
            TextView textView = (TextView) view.findViewById(R.id.name);
            this.f156420c = textView;
            textView.setVisibility(8);
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            if (effectModel.isDisabled) {
                this.f156419b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_ban_outlined));
                this.f156419b.getDrawable().setTint(C60773o.m236126d(R.color.primary_pri_500));
                this.f156419b.setBackgroundResource(R.drawable.labs_background_none_bg);
                return;
            }
            C60700b.m235864f("LabsBaseEffectAdapter", "[onBind]", "bind effect data to PresetViewHolder instance!");
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215355a(boolean z) {
            int i;
            super.mo215355a(z);
            if (z) {
                i = C60773o.m236126d(R.color.primary_pri_500);
            } else {
                i = C60773o.m236126d(R.color.icon_n2);
            }
            if (this.f156419b.getDrawable() != null) {
                this.f156419b.getDrawable().setTint(i);
            }
            this.f156420c.setTextColor(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (this.f156412c && (viewHolder instanceof AbstractC62254a) && viewHolder.getAdapterPosition() == this.f156411b) {
            ((AbstractC62254a) viewHolder).mo215356b(true);
        }
    }

    /* renamed from: a */
    public void mo215347a(int i) {
        C60700b.m235851b("LabsBaseEffectAdapter", "triggerSelect", this.f156412c + ", pos = " + i + " select = " + this.f156411b);
        if (!this.f156412c) {
            mo215353b(i, false);
        }
    }

    /* renamed from: b */
    public void onSuccess(EffectModel effectModel) {
        this.f156412c = false;
        if (this.f156410a != null) {
            String resourceId = effectModel.getResourceId();
            int i = 0;
            while (true) {
                if (i < this.f156410a.size()) {
                    if (!this.f156410a.get(i).isDisabled && resourceId.equals(this.f156410a.get(i).getResourceId())) {
                        mo215348a(i, false);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            mo215349a(effectModel);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215349a(EffectModel effectModel) {
        AbstractC62302x xVar = this.f156413d;
        if (xVar != null) {
            xVar.mo215380a(effectModel, true);
        }
    }

    /* renamed from: a */
    public void mo215350a(AbstractC62302x xVar) {
        this.f156413d = xVar;
    }

    /* renamed from: a */
    public void mo215351a(List<EffectModel> list) {
        this.f156410a = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo215352a(boolean z) {
        this.f156414e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo215254a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo215353b(int i, boolean z) {
        if (i != this.f156411b) {
            C60700b.m235851b("LabsBaseEffectAdapter", "[onItemClicked]", "item changed: [pos]" + i);
            int i2 = this.f156411b;
            if (i2 != -1) {
                notifyItemChanged(i2, Boolean.FALSE);
            }
            this.f156411b = i;
            notifyItemChanged(i, Boolean.TRUE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        EffectModel effectModel = this.f156410a.get(i);
        boolean z2 = true;
        if (viewHolder instanceof C62256c) {
            C62256c cVar = (C62256c) viewHolder;
            cVar.mo215255a(effectModel);
            AbstractC62255b bVar = (AbstractC62255b) viewHolder;
            if (this.f156411b != i) {
                z2 = false;
            }
            bVar.mo215355a(z2);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(cVar, i, effectModel) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$g$WGrrq4Bv9paReZpKi8EQP26o_Q */
                public final /* synthetic */ AbstractC62253g.C62256c f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ EffectModel f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    AbstractC62253g.this.m243121a(this.f$1, this.f$2, this.f$3, view);
                }
            });
            return;
        }
        AbstractC62254a aVar = (AbstractC62254a) viewHolder;
        aVar.mo215255a(effectModel);
        AbstractC62255b bVar2 = (AbstractC62255b) viewHolder;
        if (this.f156411b == i) {
            z = true;
        } else {
            z = false;
        }
        bVar2.mo215355a(z);
        if (!this.f156412c || this.f156411b != i) {
            z2 = false;
        }
        aVar.mo215356b(z2);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener(effectModel, i) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$g$qLGMJFOwgfNmh2cwcEq02ykgs */
            public final /* synthetic */ EffectModel f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                AbstractC62253g.this.m243120a(this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215348a(int i, boolean z) {
        String str;
        if (z) {
            int i2 = this.f156411b;
            if (i != i2) {
                if (i2 != -1) {
                    notifyItemChanged(i2, Boolean.FALSE);
                }
                this.f156411b = i;
                notifyItemChanged(i, Boolean.TRUE);
            } else {
                return;
            }
        }
        if (z) {
            str = "Loading";
        } else {
            str = "Loaded";
        }
        notifyItemChanged(i, str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243120a(EffectModel effectModel, int i, View view) {
        if (this.f156414e && !this.f156412c) {
            if (C62228c.m243014a(effectModel)) {
                mo215353b(i, true);
                mo215349a(effectModel);
            } else if (!C60785x.m236238b()) {
                C60738ac.m236023a((int) R.string.View_G_NoConnection);
            } else {
                this.f156412c = true;
                mo215348a(i, true);
                C62228c.m243009a(effectModel, this);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            C60700b.m235851b("LabsBaseEffectAdapter", "[onBindViewHolder]", "[pos]" + i + "  [payload]empty");
            return;
        }
        for (Object obj : list) {
            C60700b.m235851b("LabsBaseEffectAdapter", "[onBindViewHolder2]", "[pos]" + i + "  [payload]" + obj);
            if (obj instanceof Boolean) {
                ((AbstractC62255b) viewHolder).mo215355a(((Boolean) obj).booleanValue());
            } else if ((obj instanceof String) && (viewHolder instanceof AbstractC62254a)) {
                ((AbstractC62254a) viewHolder).mo215356b("Loading".equals(obj));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243121a(C62256c cVar, int i, EffectModel effectModel, View view) {
        if (this.f156414e && !this.f156412c) {
            cVar.mo215355a(true);
            mo215353b(i, true);
            mo215349a(effectModel);
        }
    }
}
