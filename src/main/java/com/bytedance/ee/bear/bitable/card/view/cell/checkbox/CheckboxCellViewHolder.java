package com.bytedance.ee.bear.bitable.card.view.cell.checkbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.checkbox.InterruptCheckableCheckbox;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.C13710a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0005H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0003H\u0014J \u0010\u0017\u001a\u00020\u00122\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0003H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/checkbox/CheckboxCellViewHolder;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellViewHolder;", "", "", "itemView", "Landroid/view/View;", "delegate", "Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "(Landroid/view/View;Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;)V", "checkboxTypeContentView", "Lcom/bytedance/ee/bear/bitable/card/view/cell/checkbox/InterruptCheckableCheckbox;", "debounceFlowableWrapper", "Lcom/bytedance/ee/util/rx/DebounceFlowableWrapper;", "referenceTypeContentView", "Landroid/widget/LinearLayout;", "setCheckedInterceptor", "Lcom/bytedance/ee/bear/bitable/card/view/cell/checkbox/InterruptCheckableCheckbox$SetCheckedInterceptor;", "enterEditMode", "", "exitEditMode", "getContentView", "setCanEnterEditMode", "canEnterEditMode", "setData", "cell", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/STCell;", "submitData", "checked", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.checkbox.a */
public final class CheckboxCellViewHolder extends AbstractC4597b<List<? extends Boolean>, Boolean> {

    /* renamed from: h */
    public static final Companion f13606h = new Companion(null);

    /* renamed from: g */
    public C13710a<Boolean> f13607g;

    /* renamed from: i */
    private final InterruptCheckableCheckbox f13608i;

    /* renamed from: j */
    private final LinearLayout f13609j;

    /* renamed from: k */
    private final InterruptCheckableCheckbox.AbstractC4604a f13610k = new InterruptCheckableCheckbox.AbstractC4604a(this) {
        /* class com.bytedance.ee.bear.bitable.card.view.cell.checkbox.CheckboxCellViewHolder.C46051 */

        /* renamed from: a */
        final /* synthetic */ CheckboxCellViewHolder f13611a;

        {
            this.f13611a = r1;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.checkbox.InterruptCheckableCheckbox.AbstractC4604a
        /* renamed from: a */
        public final boolean mo18126a(boolean z) {
            C13479a.m54772d("CheckboxCellViewHolder", "checked status change: " + z);
            C13710a<Boolean> aVar = this.f13611a.f13607g;
            if (aVar == null) {
                return true;
            }
            aVar.mo50679a(Boolean.valueOf(z));
            return true;
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/checkbox/CheckboxCellViewHolder$Companion;", "", "()V", "DEBOUNCE_INTERVAL", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.checkbox.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        View view;
        if (mo18116e()) {
            view = this.f13609j;
        } else {
            view = this.f13608i;
        }
        return view;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        this.f13608i.setSetCheckedInterceptor(null);
        C13710a<Boolean> aVar = this.f13607g;
        if (aVar != null) {
            aVar.mo50678a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        this.f13607g = new C13710a<>(200, new C4606b(this));
        this.f13608i.setSetCheckedInterceptor(this.f13610k);
        InterruptCheckableCheckbox interruptCheckableCheckbox = this.f13608i;
        interruptCheckableCheckbox.setChecked(!interruptCheckableCheckbox.isChecked());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isChecked", "", "kotlin.jvm.PlatformType", "onSubscribe", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.checkbox.a$b */
    static final class C4606b<V> implements C13710a.AbstractC13714a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CheckboxCellViewHolder f13612a;

        C4606b(CheckboxCellViewHolder aVar) {
            this.f13612a = aVar;
        }

        /* renamed from: a */
        public final void onSubscribe(Boolean bool) {
            if (bool != null) {
                this.f13612a.mo18127c(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo18112a(boolean z) {
        super.mo18112a(z);
        this.f13608i.setEnableUserSetChecked(z);
    }

    /* renamed from: c */
    public final void mo18127c(boolean z) {
        this.f13608i.mo18122a(z);
        mo18110a(Boolean.valueOf(z));
        this.f13588e.mo17864a("checkbox", null);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ee.bear.bitable.card.model.stmodel.cell.a<java.util.List<java.lang.Boolean>>] */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<? extends Boolean>> aVar) {
        int i;
        int i2;
        List<? extends Boolean> c;
        Boolean bool;
        super.mo17993a((C4537a) aVar);
        InterruptCheckableCheckbox interruptCheckableCheckbox = this.f13608i;
        int i3 = 8;
        boolean z = false;
        if (mo18116e()) {
            i = 8;
        } else {
            i = 0;
        }
        interruptCheckableCheckbox.setVisibility(i);
        LinearLayout linearLayout = this.f13609j;
        if (mo18116e()) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        if (!mo18116e()) {
            InterruptCheckableCheckbox interruptCheckableCheckbox2 = this.f13608i;
            if (!(aVar == null || (bool = (Boolean) aVar.mo17830a(Boolean.TYPE)) == null)) {
                z = bool.booleanValue();
            }
            interruptCheckableCheckbox2.mo18122a(z);
            return;
        }
        this.f13609j.removeAllViews();
        if (!(aVar == null || (c = aVar.mo17835c()) == null)) {
            List<? extends Boolean> list = c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                View inflate = LayoutInflater.from(this.f13609j.getContext()).inflate(R.layout.bitable_cell_checkbox_view, (ViewGroup) this.f13609j, false);
                if (inflate != null) {
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) inflate;
                    appCompatCheckBox.setChecked(Intrinsics.areEqual((Object) t, (Object) true));
                    this.f13609j.addView(appCompatCheckBox);
                    arrayList.add(Unit.INSTANCE);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatCheckBox");
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f13609j.getLayoutParams();
        if (this.f13609j.getChildCount() == 0) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        layoutParams.width = i2;
        this.f13609j.setLayoutParams(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxCellViewHolder(View view, AbstractC4712d dVar) {
        super(view, dVar);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(dVar, "delegate");
        View findViewById = view.findViewById(R.id.checkbox_type_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.checkbox_type_content)");
        this.f13608i = (InterruptCheckableCheckbox) findViewById;
        View findViewById2 = view.findViewById(R.id.reference_type_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.reference_type_content)");
        this.f13609j = (LinearLayout) findViewById2;
    }
}
