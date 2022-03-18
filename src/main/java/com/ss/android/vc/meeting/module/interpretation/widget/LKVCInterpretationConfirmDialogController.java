package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.module.interpretation.widget.C61992a;
import com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u000e\u001a\u00020\u000f\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/interpretation/widget/LKVCInterpretationConfirmDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "customMessage", "", "isGlobalShow", "", "Ljava/lang/Boolean;", "left", "Lcom/ss/android/vc/entity/LanguageType;", "mContext", "right", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultContentRes", "", "onCreateContent", "Landroid/view/View;", "setCustomMessage", "txtMsg", "Landroid/widget/TextView;", "setLanguage", "item", "Lcom/ss/android/vc/meeting/module/interpretation/widget/LanguageSelectItem;", "language", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.b */
public final class LKVCInterpretationConfirmDialogController extends UDDialogController {

    /* renamed from: a */
    private LanguageType f155764a;

    /* renamed from: b */
    private LanguageType f155765b;

    /* renamed from: c */
    private String f155766c;

    /* renamed from: d */
    private Boolean f155767d;

    /* renamed from: e */
    private Context f155768e;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultContentRes() {
        return R.layout.vc_lkui_dialog_content_interpretation_language_layout;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        View finalView = getFinalView(getMContentLayout(), getMContentLayoutRes(), getDefaultContentRes());
        if (finalView == null) {
            return null;
        }
        m242192a((TextView) finalView.findViewById(R.id.txt_message));
        m242193a((LanguageSelectItem) finalView.findViewById(R.id.item_left), this.f155764a);
        m242193a((LanguageSelectItem) finalView.findViewById(R.id.item_right), this.f155765b);
        return finalView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKVCInterpretationConfirmDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m242192a(TextView textView) {
        if (textView != null) {
            textView.setText(this.f155766c);
        }
    }

    /* renamed from: a */
    private final void m242193a(LanguageSelectItem languageSelectItem, LanguageType languageType) {
        if (languageSelectItem != null && languageType != null) {
            languageSelectItem.setStyle(LanguageSelectItem.Style.Selected);
            languageSelectItem.setLanguage(languageType);
            languageSelectItem.setArrowVisibility(8);
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C61992a.C61993a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C61992a.C61993a aVar = (C61992a.C61993a) uDBaseDialogBuilder;
            this.f155764a = aVar.f155759a;
            this.f155765b = aVar.f155760b;
            this.f155766c = aVar.f155761c;
            this.f155767d = aVar.f155762d;
            this.f155768e = aVar.f155763e;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDVCInterpretationConfirmDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
