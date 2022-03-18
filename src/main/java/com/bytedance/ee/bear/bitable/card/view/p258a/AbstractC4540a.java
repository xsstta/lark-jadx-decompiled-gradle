package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.C4574a;
import com.bytedance.ee.bear.bitable.card.view.cell.checkbox.CheckboxCellViewHolder;
import com.bytedance.ee.bear.bitable.card.view.cell.number.C4629a;
import com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a;
import com.bytedance.ee.bear.bitable.card.view.cell.p260b.p261a.C4600a;
import com.bytedance.ee.bear.bitable.card.view.cell.p260b.p262b.C4601a;
import com.bytedance.ee.bear.bitable.card.view.cell.p263c.C4603a;
import com.bytedance.ee.bear.bitable.card.view.cell.p264d.C4608a;
import com.bytedance.ee.bear.bitable.card.view.cell.p265e.C4613b;
import com.bytedance.ee.bear.bitable.card.view.cell.p266f.C4627a;
import com.bytedance.ee.bear.bitable.card.view.cell.select.MultiSelectCellViewHolder;
import com.bytedance.ee.bear.bitable.card.view.cell.select.SingleSelectCellViewHolder;
import com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e;
import com.bytedance.ee.bear.bitable.card.view.cell.user.C4710e;
import com.bytedance.ee.bear.bitable.card.view.record.STFocusCellVisibleUpdater;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.a */
public abstract class AbstractC4540a extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements STFocusCellVisibleUpdater.BottomSpaceHeightChangeDelegate {

    /* renamed from: a */
    protected String f13376a = "BaseCellAdapter";

    /* renamed from: b */
    protected final C4547d f13377b;

    /* renamed from: c */
    protected final C4771b f13378c;

    /* renamed from: d */
    protected C4525a f13379d;

    /* renamed from: e */
    protected List<C4537a> f13380e;

    /* renamed from: f */
    protected int f13381f;

    /* renamed from: g */
    private final AbstractC4712d f13382g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo17888a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo17891a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13380e.size() + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.a$2 */
    public static /* synthetic */ class C45422 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a.C45422.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.record.STFocusCellVisibleUpdater.BottomSpaceHeightChangeDelegate
    /* renamed from: b */
    public void mo17896b(int i) {
        if (this.f13381f != i) {
            this.f13381f = i;
            notifyItemChanged(getItemCount() - 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbstractC4597b) {
            ((AbstractC4597b) viewHolder).mo18117f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AbstractC4597b) {
            ((AbstractC4597b) viewHolder).mo18118g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18867b(View view) {
        View findFocus;
        if ((this.f13382g.mo17875h() instanceof ViewGroup) && (findFocus = ((ViewGroup) this.f13382g.mo17875h()).findFocus()) != null) {
            findFocus.clearFocus();
        }
        C10548d.m43697a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo17889a(int i) {
        return Math.min(this.f13380e.size() - 1, i);
    }

    /* renamed from: a */
    public int mo17890a(String str) {
        int i = 0;
        for (C4537a aVar : this.f13380e) {
            if (StringUtils.equal(str, aVar.mo17829a().mo17749g())) {
                return i;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: c */
    public String mo17898c(int i) {
        try {
            List<C4537a> list = this.f13380e;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return this.f13380e.get(i).mo17829a().mo17749g();
        } catch (Exception e) {
            e.printStackTrace();
            C13479a.m54759a(this.f13376a, "cannot find fieldId! ", e);
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        EFieldType g;
        if (i == getItemCount() - 1) {
            return -1;
        }
        C4537a aVar = this.f13380e.get(mo17889a(i));
        EFieldType i2 = aVar.mo17829a().mo17752i();
        if (!i2.isReferenceType() || (g = aVar.mo17840g()) == null) {
            return i2.value;
        }
        return g.value;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17893a(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$a$TrHFwSoFpGyoHYpPXx2TfaXXK0s */

            public final void onClick(View view) {
                AbstractC4540a.this.m18867b((AbstractC4540a) view);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17897b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC4609e) {
            this.f13378c.getLandscape().mo5923a(this.f13382g.mo17874g(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$a$SJIq6xGM2AVN9itG2MdIrQlpZGM */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC4540a.m18866a(RecyclerView.ViewHolder.this, (Boolean) obj);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType < 0) {
            return (long) itemViewType;
        }
        C4537a aVar = this.f13380e.get(mo17889a(i));
        return (long) (aVar.mo17829a().mo17752i() + aVar.mo17829a().mo17749g() + aVar.mo17834b().mo17707b()).hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17894a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC4609e) {
            this.f13378c.getActive().mo5923a(this.f13382g.mo17873f(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$a$LYJs3I8Gqv7cejI6qrpCXhep6L0 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC4540a.m18868b(RecyclerView.ViewHolder.this, (Boolean) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo17895a(C4525a aVar) {
        this.f13379d = aVar;
        this.f13380e.clear();
        if (aVar.mo17714h() != null) {
            this.f13380e.addAll(aVar.mo17714h());
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18866a(RecyclerView.ViewHolder viewHolder, Boolean bool) {
        ((AbstractC4609e) viewHolder).mo18015b(Boolean.TRUE.equals(bool));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m18868b(RecyclerView.ViewHolder viewHolder, Boolean bool) {
        if (Boolean.FALSE.equals(bool)) {
            AbstractC4609e eVar = (AbstractC4609e) viewHolder;
            eVar.mo18114c();
            eVar.mo18016k();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC4609e) {
            AbstractC4609e eVar = (AbstractC4609e) viewHolder;
            final C4537a aVar = this.f13380e.get(mo17889a(i));
            eVar.mo18109a(new AbstractC4609e.AbstractC4610a() {
                /* class com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a.C45411 */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e.AbstractC4610a
                /* renamed from: a */
                public void mo17899a(Object obj) {
                    AbstractC4540a.this.f13378c.editRecord(AbstractC4540a.this.f13379d.mo17705a(), aVar.mo17829a().mo17749g(), aVar.mo17834b().mo17707b(), "cover", obj);
                }

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e.AbstractC4610a
                /* renamed from: a */
                public void mo17900a(Object obj, String str) {
                    AbstractC4540a.this.f13378c.editRecord(AbstractC4540a.this.f13379d.mo17705a(), aVar.mo17829a().mo17749g(), aVar.mo17834b().mo17707b(), str, obj);
                }
            });
            eVar.mo17993a(aVar);
        } else if (viewHolder instanceof PlaceholderViewHolder) {
            ((PlaceholderViewHolder) viewHolder).mo17930a(this.f13381f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        String str = this.f13376a;
        C13479a.m54772d(str, "onCreateViewHolder, viewType = " + i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        RecyclerView.ViewHolder a = mo17891a(from, viewGroup, i);
        PlaceholderViewHolder gVar = a;
        if (a == null) {
            if (i == -1) {
                PlaceholderViewHolder gVar2 = new PlaceholderViewHolder(from.inflate(R.layout.bitable_cell_placeholder_layout, viewGroup, false));
                gVar2.mo17930a(this.f13381f);
                gVar = gVar2;
            } else {
                EFieldType valueOf = EFieldType.valueOf(i);
                View inflate = from.inflate(valueOf.itemLayoutRes, viewGroup, false);
                if (inflate instanceof ViewGroup) {
                    ((ViewGroup) inflate).addView(from.inflate(mo17888a(), viewGroup, false), 0);
                }
                RecyclerView.ViewHolder a2 = mo17892a(valueOf, inflate);
                mo17894a(a2);
                mo17897b(a2);
                gVar = a2;
            }
        }
        mo17893a(gVar.itemView);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RecyclerView.ViewHolder mo17892a(EFieldType eFieldType, View view) {
        switch (C45422.f13385a[eFieldType.ordinal()]) {
            case 1:
                return new C4689e(view, this.f13382g, this.f13377b);
            case 2:
                return new C4629a(view, this.f13382g, this.f13377b);
            case 3:
                return new SingleSelectCellViewHolder(view, this.f13382g, this.f13377b);
            case 4:
                return new MultiSelectCellViewHolder(view, this.f13382g, this.f13377b);
            case 5:
                return new C4570a(view, this.f13382g, this.f13377b);
            case 6:
                return new C4710e(view, this.f13382g, this.f13378c);
            case 7:
                return new C4574a(view, this.f13382g, this.f13377b);
            case 8:
            case 9:
                return new C4613b(view, this.f13382g, this.f13377b);
            case 10:
                return new CheckboxCellViewHolder(view, this.f13382g);
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return new C4608a(view, this.f13382g);
            case 13:
            case 14:
                return new C4603a(view, this.f13382g);
            case 15:
                return new C4601a(view, this.f13382g);
            case 16:
            case 17:
                return new C4600a(view, this.f13382g);
            default:
                return new C4627a(view, this.f13382g);
        }
    }

    public AbstractC4540a(C4771b bVar, AbstractC4712d dVar, RecyclerView recyclerView) {
        C4547d dVar2 = new C4547d();
        this.f13377b = dVar2;
        this.f13380e = new ArrayList();
        this.f13381f = 0;
        this.f13378c = bVar;
        this.f13382g = dVar;
        STFocusCellVisibleUpdater kVar = new STFocusCellVisibleUpdater(recyclerView);
        kVar.mo17941a(this);
        dVar2.mo17909a(kVar);
    }
}
