package com.bytedance.ee.bear.middleground.permission.widget.editpermdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermAdapter;", "avatarView", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "getContext", "()Landroid/content/Context;", "dialog", "Landroid/app/Dialog;", "memberLabel", "Landroid/widget/TextView;", "memberNameTitle", "Lcom/bytedance/ee/bear/facade/common/widget/CustomTitleView;", "dismiss", "", "initWatermark", "token", "", ShareHitPoint.f121869d, "", "show", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "permItemList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.b */
public final class EditPermDialog {

    /* renamed from: a */
    private final Dialog f27319a;

    /* renamed from: b */
    private final EditPermAdapter f27320b;

    /* renamed from: c */
    private UDAvatar f27321c;

    /* renamed from: d */
    private CustomTitleView f27322d;

    /* renamed from: e */
    private TextView f27323e;

    /* renamed from: f */
    private final Context f27324f;

    /* renamed from: a */
    public final void mo38493a() {
        this.f27319a.dismiss();
    }

    public EditPermDialog(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f27324f = context;
        Dialog dialog = new Dialog(context, R.style.ActionSheetDialogStyle);
        this.f27319a = dialog;
        EditPermAdapter aVar = new EditPermAdapter();
        this.f27320b = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.perm_edit_perm_dialog_layout, (ViewGroup) null);
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setGravity(8388691);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.permContainer);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "contentView.permContainer");
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.permContainer);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "contentView.permContainer");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(context));
        View findViewById = inflate.findViewById(R.id.avatarView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.avatarView)");
        this.f27321c = (UDAvatar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.memberNameTitle);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(R.id.memberNameTitle)");
        this.f27322d = (CustomTitleView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.memberLabel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById(R.id.memberLabel)");
        this.f27323e = (TextView) findViewById3;
    }

    /* renamed from: a */
    private final void m42104a(String str, int i) {
        IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        Window window = this.f27319a.getWindow();
        if (window != null && (window.getDecorView() instanceof FrameLayout)) {
            Window window2 = this.f27319a.getWindow();
            if (window2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(window2, "dialog.window!!");
            View decorView = window2.getDecorView();
            if (decorView != null) {
                aVar.mo40653b((FrameLayout) decorView);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
        }
        aVar.mo40651a(str, String.valueOf(i), this.f27319a);
    }

    /* renamed from: a */
    public final void mo38494a(UserInfo userInfo, String str, int i, ArrayList<EditPermItemModel> arrayList) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(arrayList, "permItemList");
        AvatarLoadHelper.m39732a(this.f27321c, userInfo);
        Locale d = C4484g.m18494b().mo17253d();
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        this.f27322d.setTitle(userInfo.getDisplayName(d));
        CustomTitleView customTitleView = this.f27322d;
        boolean z2 = true;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(f)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        if (!(userInfo.getOwnerType() == 5 || userInfo.getOwnerType() == 11 || userInfo.getOwnerType() == 16 || userInfo.getOwnerType() == 18)) {
            String displayLabel = userInfo.getDisplayLabel();
            if (!(displayLabel == null || displayLabel.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                this.f27323e.setVisibility(0);
                this.f27323e.setText(userInfo.getDisplayLabel());
                this.f27320b.mo70690f(arrayList);
                this.f27319a.show();
                m42104a(str, i);
            }
        }
        this.f27323e.setVisibility(8);
        this.f27320b.mo70690f(arrayList);
        this.f27319a.show();
        m42104a(str, i);
    }
}
