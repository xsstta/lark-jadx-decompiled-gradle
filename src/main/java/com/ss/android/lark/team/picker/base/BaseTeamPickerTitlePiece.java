package com.ss.android.lark.team.picker.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/team/picker/base/BaseTeamPickerTitlePiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "()V", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "getAction", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "context", "Landroid/content/Context;", "getLeftClickListener", "Landroid/view/View$OnClickListener;", "getTitleResId", "", "getView", "Landroid/view/View;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "realFinish", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseTeamPickerTitlePiece extends LifecycleOwnerPiece<BaseTeamPickerTitlePiece> {

    /* renamed from: h */
    public CommonTitleBar f137299h;

    /* renamed from: a */
    public abstract int mo189638a();

    /* renamed from: a */
    public IActionTitlebar.Action mo189642a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return null;
    }

    /* renamed from: b */
    public final CommonTitleBar mo189669b() {
        CommonTitleBar commonTitleBar = this.f137299h;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return commonTitleBar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece$a */
    public static final class View$OnClickListenerC55657a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerTitlePiece f137300a;

        /* renamed from: b */
        final /* synthetic */ Context f137301b;

        View$OnClickListenerC55657a(BaseTeamPickerTitlePiece baseTeamPickerTitlePiece, Context context) {
            this.f137300a = baseTeamPickerTitlePiece;
            this.f137301b = context;
        }

        public final void onClick(View view) {
            this.f137300a.mo189670c(this.f137301b);
        }
    }

    /* renamed from: b */
    public View.OnClickListener mo189668b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new View$OnClickListenerC55657a(this, context);
    }

    /* renamed from: c */
    public final void mo189670c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (context instanceof Activity) {
            KeyboardUtils.hideKeyboard(context);
            ((Activity) context).finish();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        CommonTitleBar commonTitleBar = new CommonTitleBar(context);
        commonTitleBar.setTitle(mo189638a());
        commonTitleBar.setMainTitleSize(17.0f);
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        commonTitleBar.addAction(mo189642a(context));
        commonTitleBar.setSubTitleSize(10.0f);
        commonTitleBar.setSubTitleColor(UIUtils.getColor(context, R.color.text_caption));
        commonTitleBar.setLeftClickListener(mo189668b(context));
        this.f137299h = commonTitleBar;
        return commonTitleBar;
    }
}
