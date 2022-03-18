package com.ss.android.lark.mine.impl.index.v2.bottom;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45424b;
import com.ss.android.lark.mine.impl.index.v2.C45654a;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0016J&\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "context", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;", "viewDependency", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView$IViewDependency;", "(Landroid/app/Activity;Landroid/view/View;Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView$IViewDependency;)V", "getContext", "()Landroid/app/Activity;", "mOnCallAvatarIV", "Landroid/widget/ImageView;", "getMOnCallAvatarIV", "()Landroid/widget/ImageView;", "setMOnCallAvatarIV", "(Landroid/widget/ImageView;)V", "mOnCallNameTV", "Landroid/widget/TextView;", "getMOnCallNameTV", "()Landroid/widget/TextView;", "setMOnCallNameTV", "(Landroid/widget/TextView;)V", "getRootView", "()Landroid/view/View;", "hideOnCallEntrance", "", "initView", "onCreate", "showOnCallEntrance", "onCallId", "", "avatarKey", "name", "showSOSCallPhone", "phoneNum", "IViewDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BottomView extends Widget {

    /* renamed from: a */
    public final IViewDependency f115306a;

    /* renamed from: b */
    private final Activity f115307b;

    /* renamed from: c */
    private final View f115308c;

    /* renamed from: d */
    private final BottomViewModel f115309d;
    @BindView(7488)
    public ImageView mOnCallAvatarIV;
    @BindView(7489)
    public TextView mOnCallNameTV;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomView$IViewDependency;", "", "gotoOnCallChat", "", "chatId", "", "makePhoneCall", "phoneNum", "onClickOnCall", "onCallId", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomView$a */
    public interface IViewDependency {
        /* renamed from: a */
        void mo160780a(String str);

        /* renamed from: b */
        void mo160781b(String str);

        /* renamed from: c */
        void mo160782c(String str);
    }

    /* renamed from: a */
    public final void mo160791a() {
        this.f115308c.setVisibility(8);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        ButterKnife.bind(this, this.f115308c);
        m181061b();
    }

    /* renamed from: b */
    private final void m181061b() {
        BottomView bottomView = this;
        C45654a.m181034a(this.f115309d.getOnCallInfo(), bottomView, new C45664b(this));
        this.f115309d.getOnCallChatId().mo5923a(bottomView, new C45665c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomView$c */
    public static final class C45665c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ BottomView f115311a;

        C45665c(BottomView bottomView) {
            this.f115311a = bottomView;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            this.f115311a.f115306a.mo160782c(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomView$d */
    public static final class View$OnClickListenerC45666d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomView f115312a;

        /* renamed from: b */
        final /* synthetic */ String f115313b;

        View$OnClickListenerC45666d(BottomView bottomView, String str) {
            this.f115312a = bottomView;
            this.f115313b = str;
        }

        public final void onClick(View view) {
            this.f115312a.f115306a.mo160780a(this.f115313b);
            MineHitPoint.m181467a("sos");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/dto/HomeOnCall;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomView$b */
    public static final class C45664b<T> implements AbstractC1178x<C45424b> {

        /* renamed from: a */
        final /* synthetic */ BottomView f115310a;

        C45664b(BottomView bottomView) {
            this.f115310a = bottomView;
        }

        /* renamed from: a */
        public final void onChanged(C45424b bVar) {
            if (bVar == null) {
                this.f115310a.mo160791a();
            } else {
                this.f115310a.mo160793a(bVar.f115004a, bVar.f115005b, bVar.f115006c);
            }
        }
    }

    /* renamed from: a */
    public final void mo160792a(String str) {
        new C25639g(this.f115307b).mo89242c(str).mo89255n(14).mo89256o(R.color.lkui_N600).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Legacy_Cancel), (DialogInterface.OnClickListener) null).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_LarkCall), new DialogInterface$OnClickListenerC45667e(this, str)).mo89246d(false).mo89239c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomView$e */
    static final class DialogInterface$OnClickListenerC45667e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomView f115314a;

        /* renamed from: b */
        final /* synthetic */ String f115315b;

        DialogInterface$OnClickListenerC45667e(BottomView bottomView, String str) {
            this.f115314a = bottomView;
            this.f115315b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f115314a.f115306a.mo160781b(this.f115315b);
        }
    }

    /* renamed from: a */
    public final void mo160793a(String str, String str2, String str3) {
        this.f115308c.setVisibility(0);
        TextView textView = this.mOnCallNameTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnCallNameTV");
        }
        textView.setText(str3);
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45414o p = a.mo133457p();
        ImageView imageView = this.mOnCallAvatarIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnCallAvatarIV");
        }
        p.mo133497a(str, str2, str, imageView, UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f));
        this.f115308c.setOnClickListener(new View$OnClickListenerC45666d(this, str));
    }

    public BottomView(Activity activity, View view, BottomViewModel aVar, IViewDependency aVar2) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(aVar2, "viewDependency");
        this.f115307b = activity;
        this.f115308c = view;
        this.f115309d = aVar;
        this.f115306a = aVar2;
    }
}
