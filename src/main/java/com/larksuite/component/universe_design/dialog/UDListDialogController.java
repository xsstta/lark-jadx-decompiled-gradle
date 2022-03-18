package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDividerItemDecoration;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u00016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010'\u001a\u00020(\"\u000e\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0*2\u0006\u0010,\u001a\u00020-H\u0017J\n\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u0012H\u0014J\b\u00101\u001a\u00020\u0012H\u0014J\b\u00102\u001a\u00020\u0012H\u0014J\b\u00103\u001a\u00020\u0012H\u0014J\b\u00104\u001a\u00020\u0012H\u0014J\n\u00105\u001a\u0004\u0018\u00010/H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\u00128\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00067"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDListDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "getMAdapter", "()Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "setMAdapter", "(Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;)V", "mItemClickListener", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "getMItemClickListener", "()Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "setMItemClickListener", "(Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;)V", "mItemHeight", "", "getMItemHeight", "()I", "setMItemHeight", "(I)V", "mItemLayoutRes", "getMItemLayoutRes", "setMItemLayoutRes", "mItemTextColorRes", "getMItemTextColorRes", "setMItemTextColorRes", "mItemTextSize", "getMItemTextSize", "setMItemTextSize", "mItems", "", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItem;", "getMItems", "()Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "getDefaultContentRes", "getDefaultFooterRes", "getDefaultHeaderRes", "getDefaultItemRes", "getDefaultRootRes", "onCreateContent", "OnItemClickListener", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.i */
public class UDListDialogController extends UDDialogController {

    /* renamed from: a */
    private OnItemClickListener f63353a;

    /* renamed from: b */
    private List<UDBaseListDialogBuilder.ListItem> f63354b = new ArrayList();

    /* renamed from: c */
    private int f63355c = -1;

    /* renamed from: d */
    private int f63356d = -1;

    /* renamed from: e */
    private int f63357e = -1;

    /* renamed from: f */
    private int f63358f = -1;

    /* renamed from: g */
    private UDBaseListDialogAdapter f63359g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "", "onItemClick", "", "index", "", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.i$a */
    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo90921b() {
        return R.layout.ud_action_panel_default_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.ud_action_panel_default_content;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultFooterRes() {
        return R.layout.ud_action_panel_default_footer;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultRootRes() {
        return R.layout.ud_action_panel_default_root;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final OnItemClickListener mo90919a() {
        return this.f63353a;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultHeaderRes() {
        setHeaderLayoutDefault$universe_ui_dialog_release(true);
        return R.layout.ud_action_panel_default_header;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        View findViewById;
        View createView = super.createView();
        if (!(isHeaderVisible$universe_ui_dialog_release() || createView == null || (findViewById = createView.findViewById(R.id.ud_action_panel_header_divider)) == null)) {
            findViewById.setVisibility(8);
        }
        return createView;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View finalView = getFinalView(getMContentLayout(), getMContentLayoutRes(), getDefaultContentRes());
        UDBaseListDialogAdapter aVar = null;
        if (finalView == null) {
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) finalView.findViewById(R.id.ud_action_panel_list_rv);
        if (recyclerView != null) {
            UDBaseListDialogAdapter aVar2 = this.f63359g;
            if (aVar2 != null) {
                int i = this.f63358f;
                if (i == -1) {
                    i = mo90921b();
                }
                aVar2.mo90861b(i);
                aVar2.mo90859a(this.f63354b);
                aVar2.mo90858a(new C25753b(this));
                aVar2.mo90864e(this.f63357e);
                aVar2.mo90863d(this.f63356d);
                aVar2.mo90862c(this.f63355c);
                aVar2.mo90860a(!TextUtils.isEmpty(getMTitle()));
                aVar = aVar2;
            }
            recyclerView.setAdapter(aVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            UDDividerItemDecoration gVar = new UDDividerItemDecoration(1);
            gVar.mo91839a(UDIconUtils.getIconDrawable(getContext(), R.drawable.ud_divider_action_panel_item));
            gVar.mo91840a(false);
            recyclerView.addItemDecoration(gVar);
        }
        return finalView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/larksuite/component/universe_design/dialog/UDListDialogController$onCreateContent$1$1$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "universe-ui-dialog_release", "com/larksuite/component/universe_design/dialog/UDListDialogController$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.i$b */
    public static final class C25753b implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ UDListDialogController f63360a;

        C25753b(UDListDialogController iVar) {
            this.f63360a = iVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            UDDialog mDialog;
            if (this.f63360a.getMAutoDismiss() && (mDialog = this.f63360a.getMDialog()) != null) {
                mDialog.dismiss();
            }
            OnItemClickListener a = this.f63360a.mo90919a();
            if (a != null) {
                a.onItemClick(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90920a(OnItemClickListener aVar) {
        this.f63353a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDListDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof UDBaseListDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            UDBaseListDialogBuilder bVar = (UDBaseListDialogBuilder) uDBaseDialogBuilder;
            this.f63353a = bVar.mo90871a();
            this.f63354b = bVar.mo90874b();
            this.f63355c = bVar.mo90875c();
            this.f63356d = bVar.mo90877d();
            this.f63357e = bVar.mo90879e();
            this.f63358f = bVar.mo90880f();
            UDBaseListDialogAdapter g = bVar.mo90881g();
            if (g == null) {
                g = new UDBaseListDialogAdapter(getContext());
            }
            this.f63359g = g;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDBaseListDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
