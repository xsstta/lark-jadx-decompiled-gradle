package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\fJ\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter;", "getMAdapter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter;", "setMAdapter", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter;)V", "mItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "getMItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "setMItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;)V", "mItems", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "getMItems", "()Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "itemClickListener", "listener", "items", "values", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.b */
public final class SpanListDialogBuilder extends UDBaseDialogBuilder<SpanListDialogBuilder> {

    /* renamed from: a */
    private SpanListDialogController.OnItemClickListener f81028a;

    /* renamed from: b */
    private List<SpanMenuItem> f81029b = new ArrayList();

    /* renamed from: c */
    private SpanListDialogAdapter f81030c;

    /* renamed from: a */
    public final SpanListDialogController.OnItemClickListener mo116009a() {
        return this.f81028a;
    }

    /* renamed from: b */
    public final List<SpanMenuItem> mo116010b() {
        return this.f81029b;
    }

    /* renamed from: c */
    public final SpanListDialogAdapter mo116011c() {
        return this.f81030c;
    }

    /* renamed from: a */
    public final SpanListDialogBuilder mo116007a(SpanListDialogController.OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f81028a = aVar;
        return this;
    }

    /* renamed from: a */
    public final SpanListDialogBuilder mo116008a(List<SpanMenuItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        this.f81029b.clear();
        this.f81029b.addAll(list);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanListDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new SpanListDialogController(context));
        this.f81030c = new SpanListDialogAdapter(context);
        gravity(80);
        marginInDp(12);
    }
}
