package com.ss.android.lark.mail.impl.view.dialog.action;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.d */
public class C43933d extends RecyclerView.Adapter {

    /* renamed from: a */
    private final String f111473a = "ActionListAdapter";

    /* renamed from: b */
    private Context f111474b;

    /* renamed from: c */
    private final int f111475c = 2020080601;

    /* renamed from: d */
    private final int f111476d = 2020080602;

    /* renamed from: e */
    private List<ActionDialog.ActionItem> f111477e;

    /* renamed from: f */
    private List<ActionDialog.AbstractC43928c> f111478f;

    /* renamed from: g */
    private boolean f111479g;

    /* renamed from: h */
    private ActionDialog f111480h;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i;
        if (CollectionUtils.isEmpty(this.f111477e)) {
            i = 0;
        } else {
            i = this.f111477e.size();
        }
        if (this.f111479g) {
            return i + 1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.d$1 */
    public static /* synthetic */ class C439341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.view.dialog.action.C43933d.C439341.f111481a = r0
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.BOTTOM_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.C43933d.C439341.f111481a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.TOP_CIRCLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.C43933d.C439341.f111481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.SQUARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.C43933d.C439341.f111481a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.view.dialog.action.C43933d.C439341.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m174071a(C43935e eVar) {
        if (eVar != null) {
            eVar.mo156377a(this.f111478f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i != 0 || !this.f111479g) {
            return 2020080601;
        }
        return 2020080602;
    }

    public C43933d(Context context, ActionDialog actionDialog) {
        this.f111474b = context;
        this.f111480h = actionDialog;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156376a(List<ActionDialog.AbstractC43928c> list, List<ActionDialog.ActionItem> list2) {
        this.f111478f = list;
        this.f111477e = list2;
        this.f111479g = CollectionUtils.isNotEmpty(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C43931c) {
            m174070a((C43931c) viewHolder, i);
        } else if (viewHolder instanceof C43935e) {
            m174071a((C43935e) viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 2020080602) {
            View inflate = LayoutInflater.from(this.f111474b).inflate(R.layout.mail_action_dialog_action_item, (ViewGroup) null);
            inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C43931c(this.f111474b, inflate, this.f111480h);
        }
        View inflate2 = LayoutInflater.from(this.f111474b).inflate(R.layout.mail_action_dialog_quick_access_layout, (ViewGroup) null);
        inflate2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C43935e(this.f111474b, inflate2);
    }

    /* renamed from: a */
    private void m174070a(C43931c cVar, int i) {
        List<ActionDialog.ActionItem> list;
        boolean z;
        if (this.f111479g) {
            i--;
        }
        if (cVar != null && (list = this.f111477e) != null && list.size() > i) {
            ActionDialog.ActionItem actionItem = this.f111477e.get(i);
            if (i < this.f111477e.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo156374a(actionItem, z);
            ActionDialog.ActionItem actionItem2 = this.f111477e.get(i);
            int round = Math.round((float) UIHelper.getDimens(R.dimen.mail_action_dialog_action_item_vertical_margin));
            int i2 = C439341.f111481a[actionItem2.getDisplayType().ordinal()];
            if (i2 == 1) {
                cVar.mo156374a(actionItem2, false);
                cVar.itemView.setBackgroundResource(R.drawable.mail_action_dialog_action_item_background_bottom);
                m174069a(0, round, cVar.itemView);
            } else if (i2 == 2) {
                cVar.mo156374a(actionItem2, true);
                cVar.itemView.setBackgroundResource(R.drawable.mail_action_dialog_action_item_background_upper);
                m174069a(round, 0, cVar.itemView);
            } else if (i2 != 3) {
                cVar.mo156374a(actionItem2, false);
                cVar.itemView.setBackgroundResource(R.drawable.mail_action_dialog_action_item_background);
                m174069a(round, round, cVar.itemView);
            } else {
                cVar.mo156374a(actionItem2, true);
                cVar.itemView.setBackgroundResource(R.drawable.mail_action_dialog_action_item_background_square);
                m174069a(0, 0, cVar.itemView);
            }
        }
    }

    /* renamed from: a */
    private void m174069a(int i, int i2, View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(0, i, 0, i2);
        view.requestLayout();
    }
}
