package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0014¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SingleSelectCellViewHolder;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/BaseSelectCellViewHolder;", "", "itemView", "Landroid/view/View;", "delegate", "Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "editPanelVisibleListener", "Lcom/bytedance/ee/bear/bitable/card/view/record/IEditPanelVisibleListener;", "(Landroid/view/View;Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;Lcom/bytedance/ee/bear/bitable/card/view/record/IEditPanelVisibleListener;)V", "createPendingSelectNewOptionTask", "", "newOptionId", "getFieldType", "Lcom/bytedance/ee/bear/bitable/card/model/enums/EFieldType;", "getValueAfterSelectNewOption", "", "updateSelectEditPanelData", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.l */
public final class SingleSelectCellViewHolder extends AbstractC4638a<String> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a
    /* renamed from: m */
    public EFieldType mo18255m() {
        return EFieldType.SINGLE_SELECT;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a
    /* renamed from: l */
    public void mo18017l() {
        C4533g gVar;
        SelectEditPanel iVar = this.f13711i;
        if (iVar != null) {
            C4537a aVar = this.f13709g;
            String str = null;
            if (aVar != null) {
                gVar = aVar.mo17829a();
            } else {
                gVar = null;
            }
            if (!(gVar instanceof C4530e)) {
                gVar = null;
            }
            C4530e eVar = (C4530e) gVar;
            C4537a aVar2 = this.f13709g;
            if (aVar2 != null) {
                str = (String) aVar2.mo17830a(String.class);
            }
            iVar.mo18308a(eVar, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.l$a */
    static final class RunnableC4677a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SingleSelectCellViewHolder f13807a;

        /* renamed from: b */
        final /* synthetic */ String f13808b;

        RunnableC4677a(SingleSelectCellViewHolder lVar, String str) {
            this.f13807a = lVar;
            this.f13808b = str;
        }

        public final void run() {
            int i;
            List<C4530e.C4531a> a;
            C4537a aVar = this.f13807a.f13709g;
            C4533g a2 = aVar != null ? aVar.mo17829a() : null;
            if (!(a2 instanceof C4530e)) {
                a2 = null;
            }
            C4530e eVar = (C4530e) a2;
            if (eVar == null || (a = eVar.mo17727a()) == null) {
                i = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t : a) {
                    T t2 = t;
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    if (TextUtils.equals(t2.mo17731a(), this.f13808b)) {
                        arrayList.add(t);
                    }
                }
                i = arrayList.size();
            }
            if (i > 0) {
                C4537a aVar2 = this.f13807a.f13709g;
                if (aVar2 != null) {
                    aVar2.mo17833a(this.f13807a.mo18253c(this.f13808b));
                }
                this.f13807a.mo18110a((Object) this.f13808b);
                this.f13807a.f13714l = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a
    /* renamed from: b */
    public void mo18252b(String str) {
        this.f13714l = new RunnableC4677a(this, str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4638a
    /* renamed from: c */
    public List<String> mo18253c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public SingleSelectCellViewHolder(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar, eVar);
    }
}
