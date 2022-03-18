package com.ss.android.vc.common.widget.actionsheet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetDialogAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0011\u001a\u00020\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\nH\u0014J\b\u0010\u001b\u001a\u00020\nH\u0014J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0014J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter;", "mItemClickListener", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "mItemHeight", "", "mItemLayoutRes", "mItemTextColorRes", "mItemTextSize", "mItems", "", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$ActionSheetData;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "getDefaultContentRes", "getDefaultFooterRes", "getDefaultItemRes", "getDefaultRootRes", "onCreateContent", "OnItemClickListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.a.b */
public final class VCActionSheetController extends UDDialogController {

    /* renamed from: a */
    public OnItemClickListener f152175a;

    /* renamed from: b */
    private List<VCActionSheetDialogAdapter.ActionSheetData> f152176b = new ArrayList();

    /* renamed from: c */
    private int f152177c = -1;

    /* renamed from: d */
    private int f152178d = -1;

    /* renamed from: e */
    private int f152179e = -1;

    /* renamed from: f */
    private int f152180f = -1;

    /* renamed from: g */
    private VCActionSheetDialogAdapter f152181g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "", "onItemClick", "", "index", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.b$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo208588a(int i);
    }

    /* renamed from: a */
    private final int m236427a() {
        return R.layout.vc_action_sheet_item;
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
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        View findViewById;
        View createView = super.createView();
        if (!((!TextUtils.isEmpty(getMTitle())) || createView == null || (findViewById = createView.findViewById(R.id.ud_action_panel_header_divider)) == null)) {
            findViewById.setVisibility(8);
        }
        return createView;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View finalView = getFinalView(getMContentLayout(), getMContentLayoutRes(), getDefaultContentRes());
        VCActionSheetDialogAdapter cVar = null;
        if (finalView == null) {
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) finalView.findViewById(R.id.ud_action_panel_list_rv);
        if (recyclerView != null) {
            VCActionSheetDialogAdapter cVar2 = this.f152181g;
            if (cVar2 != null) {
                int i = this.f152180f;
                if (i == -1) {
                    i = m236427a();
                }
                cVar2.mo208590a(i);
                cVar2.mo208593a(this.f152176b);
                cVar2.mo208591a(new C60826b(this));
                cVar2.mo208596d(this.f152179e);
                cVar2.mo208595c(this.f152178d);
                cVar2.mo208594b(this.f152177c);
                cVar = cVar2;
            }
            recyclerView.setAdapter(cVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            VCDividerItemDecoration dVar = new VCDividerItemDecoration(1);
            dVar.mo208609a(UDIconUtils.getIconDrawable(getContext(), R.drawable.ud_divider_action_panel_item));
            dVar.mo208610a(false);
            dVar.mo208608a(C60773o.m236115a(17.0d));
            recyclerView.addItemDecoration(dVar);
        }
        return finalView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/vc/common/widget/actionsheet/VCActionSheetController$onCreateContent$1$1$1", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "onItemClick", "", "index", "", "lib_vc_suiteRelease", "com/ss/android/vc/common/widget/actionsheet/VCActionSheetController$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.b$b */
    public static final class C60826b implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ VCActionSheetController f152182a;

        C60826b(VCActionSheetController bVar) {
            this.f152182a = bVar;
        }

        @Override // com.ss.android.vc.common.widget.actionsheet.VCActionSheetController.OnItemClickListener
        /* renamed from: a */
        public void mo208588a(int i) {
            UDDialog mDialog;
            if (this.f152182a.getMAutoDismiss() && (mDialog = this.f152182a.getMDialog()) != null) {
                mDialog.dismiss();
            }
            OnItemClickListener aVar = this.f152182a.f152175a;
            if (aVar != null) {
                aVar.mo208588a(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCActionSheetController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof VCActionSheetBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            VCActionSheetBuilder aVar = (VCActionSheetBuilder) uDBaseDialogBuilder;
            this.f152175a = aVar.mo208581a();
            this.f152176b = aVar.mo208582b();
            this.f152177c = aVar.mo208583c();
            this.f152178d = aVar.mo208584d();
            this.f152179e = aVar.mo208585e();
            this.f152180f = aVar.mo208586f();
            VCActionSheetDialogAdapter g = aVar.mo208587g();
            if (g == null) {
                g = new VCActionSheetDialogAdapter(getContext());
            }
            this.f152181g = g;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDBaseListDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
