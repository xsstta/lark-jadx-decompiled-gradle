package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.AbstractC25634a;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.ui.dialog.a */
public abstract class AbstractC25634a<T extends AbstractC25634a> extends C25639g<T> {

    /* renamed from: a */
    public DialogInterface.OnClickListener f62573a;

    /* renamed from: i */
    private UDActionPanelBuilder f62574i;

    /* renamed from: a */
    public final T mo89211e(int i) {
        return this;
    }

    /* renamed from: a */
    public final T mo89203a(LKUIListDialogItemBinder<? extends LKUIListItemData> mVar) {
        return this;
    }

    /* renamed from: b */
    public final T mo89207b(int i) {
        return this;
    }

    /* renamed from: a */
    public final T mo89202a(DialogInterface.OnClickListener onClickListener) {
        this.f62573a = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final T mo89208b(List<UDBaseListDialogBuilder.ListItem> list) {
        this.f62574i.mo90873b(list);
        return this;
    }

    /* renamed from: c */
    public final T mo89209c(int i) {
        this.f62574i.mo90876c(i);
        return this;
    }

    public AbstractC25634a(Context context) {
        super(context);
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        this.f62574i = aVar;
        mo89231a(aVar);
        mo89232a(new LKUIListDialogControllerCompat(context) {
            /* class com.larksuite.component.ui.dialog.AbstractC25634a.C256351 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m91756a(UDDialog uDDialog, int i) {
                AbstractC25634a.this.f62573a.onClick(uDDialog, i);
            }

            @Override // com.larksuite.component.universe_design.dialog.UDDialogController, com.larksuite.component.universe_design.dialog.UDListDialogController
            public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
                super.apply(uDBaseDialogBuilder, uDDialog);
                if (AbstractC25634a.this.f62573a != null) {
                    mo90920a(new UDListDialogController.OnItemClickListener(uDDialog) {
                        /* class com.larksuite.component.ui.dialog.$$Lambda$a$1$IZt6lcf230IsHUtkbU8qgHVmH9E */
                        public final /* synthetic */ UDDialog f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                        public final void onItemClick(int i) {
                            AbstractC25634a.C256351.lambda$IZt6lcf230IsHUtkbU8qgHVmH9E(AbstractC25634a.C256351.this, this.f$1, i);
                        }
                    });
                }
            }
        });
        this.f62586f = true;
        this.f62585e = true;
    }

    /* renamed from: b */
    private List<LKUIListItemData> m91744b(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(charSequenceArr.length);
        for (CharSequence charSequence : charSequenceArr) {
            LKUIListItemData nVar = new LKUIListItemData();
            nVar.mo89287a(charSequence);
            arrayList.add(nVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final T mo89204a(UDBaseListDialogAdapter aVar) {
        this.f62574i.mo90868a(aVar);
        return this;
    }

    /* renamed from: d */
    public final T mo89210d(int i) {
        this.f62574i.mo90878d(i);
        if (i != -1) {
            this.f62574i.mo90868a(new UDBaseListDialogAdapterWrapper(this.f62583b, i));
        }
        return this;
    }

    /* renamed from: a */
    public final T mo89205a(List<? extends LKUIListItemData> list) {
        ArrayList arrayList = new ArrayList();
        for (LKUIListItemData nVar : list) {
            arrayList.add(new UDBaseListDialogBuilder.ListItemBuilder(nVar.mo89285a()).mo90888b(nVar.mo89288b()).mo90889c());
        }
        this.f62574i.mo90873b(arrayList);
        return this;
    }

    /* renamed from: a */
    public final T mo89206a(CharSequence... charSequenceArr) {
        mo89205a(m91744b(charSequenceArr));
        return this;
    }
}
