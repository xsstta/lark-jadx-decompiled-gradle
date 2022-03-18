package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter;", "mItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "mItems", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "getDefaultContentRes", "", "getDefaultFooterRes", "getDefaultRootRes", "onCreateContent", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.c */
public final class SpanListDialogController extends UDDialogController {

    /* renamed from: a */
    public OnItemClickListener f81031a;

    /* renamed from: b */
    private List<SpanMenuItem> f81032b = new ArrayList();

    /* renamed from: c */
    private SpanListDialogAdapter f81033c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.c$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo109576a(CalendarEvent.Span span, boolean z);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.calendar_event_span_dialog_content;
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
        if (!(createView == null || (findViewById = createView.findViewById(R.id.ud_action_panel_header_divider)) == null)) {
            findViewById.setVisibility(8);
        }
        return createView;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View finalView = getFinalView(getMContentLayout(), getMContentLayoutRes(), getDefaultContentRes());
        SpanListDialogAdapter aVar = null;
        if (finalView == null) {
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) finalView.findViewById(R.id.span_items);
        if (recyclerView != null) {
            SpanListDialogAdapter aVar2 = this.f81033c;
            if (aVar2 != null) {
                aVar2.mo115996a(this.f81032b);
                aVar2.mo115995a(new C31818b(this));
                aVar = aVar2;
            }
            recyclerView.setAdapter(aVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        return finalView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$onCreateContent$1$1$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.c$b */
    public static final class C31818b implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SpanListDialogController f81034a;

        C31818b(SpanListDialogController cVar) {
            this.f81034a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            UDDialog mDialog;
            if (this.f81034a.getMAutoDismiss() && (mDialog = this.f81034a.getMDialog()) != null) {
                mDialog.dismiss();
            }
            OnItemClickListener aVar = this.f81034a.f81031a;
            if (aVar != null) {
                aVar.mo109576a(span, z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanListDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof SpanListDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            SpanListDialogBuilder bVar = (SpanListDialogBuilder) uDBaseDialogBuilder;
            this.f81031a = bVar.mo116009a();
            this.f81032b = bVar.mo116010b();
            SpanListDialogAdapter c = bVar.mo116011c();
            if (c == null) {
                c = new SpanListDialogAdapter(getContext());
            }
            this.f81033c = c;
            return;
        }
        throw new IllegalArgumentException(("builder should be SpanListDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
