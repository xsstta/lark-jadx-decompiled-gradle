package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.view.cell.select.C4655h;
import com.github.p964a.p965a.C21285b;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.h */
public class C4655h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public boolean f13752a;

    /* renamed from: b */
    private EFieldType f13753b;

    /* renamed from: c */
    private List<C4658c> f13754c = new ArrayList();

    /* renamed from: d */
    private int f13755d = -1;

    /* renamed from: e */
    private List<Integer> f13756e;

    /* renamed from: f */
    private AbstractC4656a f13757f;

    /* renamed from: g */
    private String f13758g;

    /* renamed from: h */
    private int f13759h = -1;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.h$a */
    public interface AbstractC4656a {
        /* renamed from: a */
        void mo18302a(C4530e.C4531a aVar);

        /* renamed from: a */
        void mo18303a(String str, boolean z);

        /* renamed from: a */
        void mo18304a(boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i;
        List<C4658c> list = this.f13754c;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        return i + 1;
    }

    /* renamed from: a */
    public void mo18298a(AbstractC4656a aVar) {
        this.f13757f = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.h$b */
    public class C4657b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        UDCheckBox f13760a;

        /* renamed from: b */
        SelectTextView f13761b = ((SelectTextView) this.itemView.findViewById(R.id.option_item));

        /* renamed from: c */
        AppCompatImageView f13762c;

        /* renamed from: d */
        View f13763d = this.itemView.findViewById(R.id.divider);

        /* renamed from: a */
        public void mo18306a(UDCheckBox.CheckBoxType checkBoxType) {
            this.f13760a.setType(checkBoxType);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19359a(ViewGroup.MarginLayoutParams marginLayoutParams, boolean z) {
            int i;
            if (z) {
                i = 0;
            } else {
                i = this.f13760a.getMeasuredWidth();
            }
            marginLayoutParams.setMarginStart(i);
            this.f13763d.setLayoutParams(marginLayoutParams);
        }

        C4657b(View view) {
            super(view);
            UDCheckBox uDCheckBox = (UDCheckBox) this.itemView.findViewById(R.id.check_box);
            this.f13760a = uDCheckBox;
            int i = 0;
            uDCheckBox.setClickable(false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.more_operation_icon);
            this.f13762c = appCompatImageView;
            appCompatImageView.setVisibility(!C4655h.this.f13752a ? 8 : i);
        }

        /* renamed from: a */
        public void mo18305a(C4658c cVar, boolean z, boolean z2) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (cVar.f13765a) {
                this.itemView.setVisibility(0);
                layoutParams.height = -2;
                layoutParams.width = -1;
                this.itemView.setLayoutParams(layoutParams);
                this.f13761b.setData(cVar);
                this.f13760a.setChecked(z);
                this.f13760a.post(new Runnable((ViewGroup.MarginLayoutParams) this.f13763d.getLayoutParams(), z2) {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$h$b$5Ku9tLXEdTaYENIzbsdqrtoUME */
                    public final /* synthetic */ ViewGroup.MarginLayoutParams f$1;
                    public final /* synthetic */ boolean f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C4655h.C4657b.m269124lambda$5Ku9tLXEdTaYENIzbsdqrtoUME(C4655h.C4657b.this, this.f$1, this.f$2);
                    }
                });
                return;
            }
            this.itemView.setVisibility(8);
            layoutParams.height = 0;
            layoutParams.width = 0;
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return -1;
        }
        return super.getItemViewType(i);
    }

    public C4655h(boolean z) {
        this.f13752a = z;
    }

    /* renamed from: a */
    private void m19350a(List<C4530e.C4531a> list) {
        this.f13754c.clear();
        if (list != null && !list.isEmpty()) {
            for (C4530e.C4531a aVar : list) {
                this.f13754c.add(new C4658c(aVar));
            }
            this.f13759h = list.size() - 1;
        }
        if (!TextUtils.isEmpty(this.f13758g)) {
            mo18299a(this.f13758g);
        }
    }

    /* renamed from: a */
    public void mo18299a(String str) {
        this.f13758g = str;
        this.f13759h = -1;
        boolean z = false;
        for (int i = 0; i < this.f13754c.size(); i++) {
            this.f13754c.get(i).f13765a = m19351a(this.f13754c.get(i).mo17734b(), this.f13758g);
            if (this.f13754c.get(i).f13765a) {
                this.f13759h = i;
            }
        }
        notifyDataSetChanged();
        AbstractC4656a aVar = this.f13757f;
        if (aVar != null) {
            if (this.f13759h == -1) {
                z = true;
            }
            aVar.mo18304a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19347a(int i, View view) {
        this.f13757f.mo18302a(this.f13754c.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.h$c */
    public class C4658c extends C4530e.C4531a {

        /* renamed from: a */
        boolean f13765a = true;

        public C4658c(C4530e.C4531a aVar) {
            super(aVar.mo17731a(), aVar.mo17734b(), aVar.mo17736c(), aVar.mo17738d(), aVar.mo17739e());
        }
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.h$d */
    public class C4659d extends RecyclerView.ViewHolder {
        public C4659d(View view) {
            super(view);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_18)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -1) {
            return new C4659d(new View(viewGroup.getContext()));
        }
        return new C4657b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_card_select_edit_option_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        if (i >= 0 && i < getItemCount() && (viewHolder instanceof C4657b)) {
            C4657b bVar = (C4657b) viewHolder;
            boolean z2 = true;
            if (this.f13753b == EFieldType.SINGLE_SELECT) {
                bVar.mo18306a(UDCheckBox.CheckBoxType.RADIO);
                if (i == this.f13755d) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                bVar.mo18306a(UDCheckBox.CheckBoxType.CHECK_BOX);
                z = this.f13756e.contains(Integer.valueOf(i));
            }
            C4658c cVar = this.f13754c.get(i);
            if (i != this.f13759h) {
                z2 = false;
            }
            bVar.mo18305a(cVar, z, z2);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(bVar, i) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$h$8fzy8XjsclKHeZzDGspdTd5f6ow */
                public final /* synthetic */ C4655h.C4657b f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C4655h.lambda$8fzy8XjsclKHeZzDGspdTd5f6ow(C4655h.this, this.f$1, this.f$2, view);
                }
            });
            if (this.f13752a && this.f13757f != null) {
                bVar.f13762c.setOnClickListener(new View.OnClickListener(i) {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.select.$$Lambda$h$bQG5tF2AyaEqI9TPaau4gjm12dU */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C4655h.lambda$bQG5tF2AyaEqI9TPaau4gjm12dU(C4655h.this, this.f$1, view);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private boolean m19351a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!str.toLowerCase().contains(str2.toLowerCase()) && !C21285b.m77123a(str, "").toLowerCase().contains(str2.toLowerCase())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo18300a(List<C4530e.C4531a> list, int i) {
        m19350a(list);
        this.f13753b = EFieldType.SINGLE_SELECT;
        this.f13755d = i;
    }

    /* renamed from: a */
    public void mo18301a(List<C4530e.C4531a> list, List<Integer> list2) {
        m19350a(list);
        this.f13753b = EFieldType.MULTI_SELECT;
        this.f13756e = list2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19349a(C4657b bVar, int i, View view) {
        boolean z = !bVar.f13760a.isChecked();
        bVar.f13760a.setChecked(z);
        m19348a(view, i, this.f13754c.get(i).mo17731a(), z);
    }

    /* renamed from: a */
    private void m19348a(View view, int i, String str, boolean z) {
        if (this.f13753b == EFieldType.SINGLE_SELECT && z) {
            int i2 = this.f13755d;
            this.f13755d = i;
            notifyItemChanged(i2);
        }
        AbstractC4656a aVar = this.f13757f;
        if (aVar != null) {
            aVar.mo18303a(str, z);
        }
    }
}
