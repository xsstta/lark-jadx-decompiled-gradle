package com.ss.android.lark.calendar.impl.features.picture;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.calendar.impl.features.picture.a */
public final class C32222a {

    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.a$a */
    public static final class C32223a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $cropToSquare;
        final /* synthetic */ Fragment $this_showPictureSelectOption;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32223a(Fragment fragment, Context context, boolean z) {
            super(0);
            this.$this_showPictureSelectOption = fragment;
            this.$context = context;
            this.$cropToSquare = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (this.$this_showPictureSelectOption.isAdded()) {
                this.$this_showPictureSelectOption.startActivityForResult(SelectOnePictureActivity.f82404b.mo117782a(this.$context, 1, this.$cropToSquare), 2324);
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.a$b */
    public static final class C32224b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $cropToSquare;
        final /* synthetic */ Fragment $this_showPictureSelectOption;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32224b(Fragment fragment, Context context, boolean z) {
            super(0);
            this.$this_showPictureSelectOption = fragment;
            this.$context = context;
            this.$cropToSquare = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (this.$this_showPictureSelectOption.isAdded()) {
                this.$this_showPictureSelectOption.startActivityForResult(SelectOnePictureActivity.f82404b.mo117782a(this.$context, 0, this.$cropToSquare), 2324);
            }
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.a$c */
    public static final class C32225c implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0[] f82415a;

        C32225c(Function0[] function0Arr) {
            this.f82415a = function0Arr;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f82415a[i].invoke();
        }
    }

    /* renamed from: a */
    public static final void m122824a(Fragment fragment, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$showPictureSelectOption");
        Context context = fragment.getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            m122823a(context, new C32223a(fragment, context, z), new C32224b(fragment, context, z));
        }
    }

    /* renamed from: a */
    public static final void m122823a(Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(context, "$this$showPictureSelectOption");
        Intrinsics.checkParameterIsNotNull(function0, "selectCarma");
        Intrinsics.checkParameterIsNotNull(function02, "selectAlbum");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{context.getString(R.string.Calendar_Manage_Camera), context.getString(R.string.Calendar_Manage_ChooseAlbums)}))).mo90869a(new C32225c(new Function0[]{function0, function02}))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public static /* synthetic */ void m122825a(Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        m122824a(fragment, z);
    }
}
