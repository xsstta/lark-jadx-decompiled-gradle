package com.ss.android.lark.team.common.piece;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TitleBarPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "titleResId", "", "iconType", "Lcom/ss/android/lark/team/common/piece/TitleBarPiece$LeftIconType;", "(ILcom/ss/android/lark/team/common/piece/TitleBarPiece$LeftIconType;)V", "getIconType", "()Lcom/ss/android/lark/team/common/piece/TitleBarPiece$LeftIconType;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "getTitleResId", "()I", "setTitleResId", "(I)V", "getActionList", "", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "context", "Landroid/content/Context;", "getLeftClickListener", "Landroid/view/View$OnClickListener;", "getView", "Landroid/view/View;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "realFinish", "", "LeftIconType", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TitleBarPiece extends LifecycleOwnerPiece<TitleBarPiece> {

    /* renamed from: a */
    private int f136801a;

    /* renamed from: b */
    private final LeftIconType f136802b;

    /* renamed from: h */
    protected CommonTitleBar f136803h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TitleBarPiece$LeftIconType;", "", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LeftIconType {
        BACK,
        CLOSE
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final CommonTitleBar mo189052k() {
        CommonTitleBar commonTitleBar = this.f136803h;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return commonTitleBar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TitleBarPiece$a */
    public static final class View$OnClickListenerC55398a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleBarPiece f136804a;

        /* renamed from: b */
        final /* synthetic */ Context f136805b;

        View$OnClickListenerC55398a(TitleBarPiece titleBarPiece, Context context) {
            this.f136804a = titleBarPiece;
            this.f136805b = context;
        }

        public final void onClick(View view) {
            this.f136804a.mo189051d(this.f136805b);
        }
    }

    /* renamed from: a */
    public List<IActionTitlebar.Action> mo188973a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return CollectionsKt.emptyList();
    }

    /* renamed from: b */
    public View.OnClickListener mo188977b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new View$OnClickListenerC55398a(this, context);
    }

    /* renamed from: d */
    public final void mo189051d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (context instanceof Activity) {
            KeyboardUtils.hideKeyboard(context);
            ((Activity) context).finish();
        }
    }

    public TitleBarPiece(int i, LeftIconType leftIconType) {
        Intrinsics.checkParameterIsNotNull(leftIconType, "iconType");
        this.f136801a = i;
        this.f136802b = leftIconType;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        CommonTitleBar commonTitleBar = new CommonTitleBar(context);
        int i = C55402i.f136809a[this.f136802b.ordinal()];
        if (i == 1) {
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        } else if (i == 2) {
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
        commonTitleBar.setTitle(C51468a.m199493c(this.f136801a, context));
        commonTitleBar.setLeftClickListener(mo188977b(context));
        for (IActionTitlebar.Action action : mo188973a(context)) {
            commonTitleBar.addAction(action);
        }
        this.f136803h = commonTitleBar;
        return commonTitleBar;
    }
}
