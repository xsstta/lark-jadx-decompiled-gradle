package com.ss.android.vc.common.widget.actionsheet;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetController;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetDialogAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0012J\u0010\u0010)\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0012J\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010'\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0012J\u0014\u0010,\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006/"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter;", "getMAdapter$lib_vc_suiteRelease", "()Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter;", "setMAdapter$lib_vc_suiteRelease", "(Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter;)V", "mItemClickListener", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "getMItemClickListener$lib_vc_suiteRelease", "()Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "setMItemClickListener$lib_vc_suiteRelease", "(Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;)V", "mItemHeight", "", "getMItemHeight$lib_vc_suiteRelease", "()I", "setMItemHeight$lib_vc_suiteRelease", "(I)V", "mItemLayoutRes", "getMItemLayoutRes$lib_vc_suiteRelease", "setMItemLayoutRes$lib_vc_suiteRelease", "mItemTextColorRes", "getMItemTextColorRes$lib_vc_suiteRelease", "setMItemTextColorRes$lib_vc_suiteRelease", "mItemTextSize", "getMItemTextSize$lib_vc_suiteRelease", "setMItemTextSize$lib_vc_suiteRelease", "mItems", "", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$ActionSheetData;", "getMItems$lib_vc_suiteRelease", "()Ljava/util/List;", "adapter", "itemClickListener", "value", "itemHeight", "itemLayout", "itemTextColor", "itemTextSize", "items", "values", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.a.a */
public final class VCActionSheetBuilder extends UDBaseDialogBuilder<VCActionSheetBuilder> {

    /* renamed from: a */
    private VCActionSheetController.OnItemClickListener f152168a;

    /* renamed from: b */
    private final List<VCActionSheetDialogAdapter.ActionSheetData> f152169b = new ArrayList();

    /* renamed from: c */
    private int f152170c = -1;

    /* renamed from: d */
    private int f152171d = -1;

    /* renamed from: e */
    private int f152172e = -1;

    /* renamed from: f */
    private int f152173f = -1;

    /* renamed from: g */
    private VCActionSheetDialogAdapter f152174g;

    /* renamed from: b */
    public final List<VCActionSheetDialogAdapter.ActionSheetData> mo208582b() {
        return this.f152169b;
    }

    /* renamed from: c */
    public final int mo208583c() {
        return this.f152170c;
    }

    /* renamed from: d */
    public final int mo208584d() {
        return this.f152171d;
    }

    /* renamed from: e */
    public final int mo208585e() {
        return this.f152172e;
    }

    /* renamed from: f */
    public final int mo208586f() {
        return this.f152173f;
    }

    /* renamed from: g */
    public final VCActionSheetDialogAdapter mo208587g() {
        return this.f152174g;
    }

    /* renamed from: a */
    public final VCActionSheetController.OnItemClickListener mo208581a() {
        return this.f152168a;
    }

    /* renamed from: a */
    public final VCActionSheetBuilder mo208579a(VCActionSheetController.OnItemClickListener aVar) {
        this.f152168a = aVar;
        return this;
    }

    /* renamed from: a */
    public final VCActionSheetBuilder mo208580a(List<VCActionSheetDialogAdapter.ActionSheetData> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        this.f152169b.clear();
        this.f152169b.addAll(list);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCActionSheetBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new VCActionSheetController(context));
        marginInDp(12);
        gravity(80);
        width(1.0f);
        animStyle(R.style.UD_BottomDialogAnim);
    }
}
