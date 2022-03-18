package com.ss.lark.android.passport.biz.base.ui;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.util.p2441c.C49170e;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.lark.android.passport.biz.widget.layout.BaseContainerLayout;
import com.ss.lark.android.passport.biz.widget.layout.BlockedNestedScrollView;
import com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout;
import com.ss.lark.android.passport.biz.widget.layout.CommonLayoutUtils;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 S2\u00020\u0001:\u0002RSB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ4\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020'\u0018\u00010,H\u0007J4\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020'\u0018\u00010,H\u0007J4\u0010.\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020'\u0018\u00010,H\u0007J<\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020'\u0018\u00010,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020'H\u0002J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205H\u0016J\u0006\u00106\u001a\u00020'J\b\u00107\u001a\u00020'H\u0002J\u0010\u00108\u001a\u00020'2\b\u00109\u001a\u0004\u0018\u00010:J\u000e\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020=J\u0010\u0010>\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010@J\u0010\u0010A\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010CJ\u0010\u0010A\u001a\u00020\u00002\b\b\u0001\u0010D\u001a\u00020EJ\u0010\u0010F\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010CJ\u0010\u0010F\u001a\u00020\u00002\b\b\u0001\u0010D\u001a\u00020EJ.\u0010F\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0010\u0010P\u001a\u00020\u00002\b\u0010Q\u001a\u0004\u0018\u00010CJ\u0010\u0010P\u001a\u00020\u00002\b\b\u0001\u0010D\u001a\u00020ER\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00190\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\n \u0011*\u0004\u0018\u00010\u001e0\u001e8FX\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u0010\u0010\"\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R#\u0010#\u001a\n \u0011*\u0004\u0018\u00010\u00190\u00198FX\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b$\u0010\u001b¨\u0006T"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer;", "Lcom/ss/lark/android/passport/biz/base/ui/BaseUiContainer;", "activity", "Landroidx/fragment/app/FragmentActivity;", "rootLayout", "Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;", "commonLayout", "Lcom/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout;", "params", "Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;Lcom/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout;Lcom/ss/lark/android/passport/biz/base/ui/UiParams;)V", "contentContainer", "Landroid/widget/LinearLayout;", "contentScrollView", "Lcom/ss/lark/android/passport/biz/widget/layout/BlockedNestedScrollView;", "footerButton", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getFooterButton", "()Landroid/widget/Button;", "footerButton$delegate", "Lkotlin/Lazy;", "footerContainer", "headerContainer", "subTitleView", "Landroid/widget/TextView;", "getSubTitleView", "()Landroid/widget/TextView;", "subTitleView$delegate", "titleBar", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "titleBar$delegate", "titleBarContainer", "titleView", "getTitleView", "titleView$delegate", "addToContent", "", "view", "Landroid/view/View;", "Landroid/widget/LinearLayout$LayoutParams;", "paramsUpdater", "Lkotlin/Function1;", "addToFooter", "addToHeader", "addToParent", "addTo", "Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer$AddTo;", "adjustTitleMarginOnSubTitleVisibilityChanged", "bind", "target", "", "finish", "observeContentScroll", "setFooterButtonClickListener", "listener", "Landroid/view/View$OnClickListener;", "setFooterButtonEnable", "enabled", "", "setupFooterButton", "info", "Lcom/ss/android/lark/passport/signinsdk_api/entity/ButtonInfo;", "showFooterButton", "text", "", "res", "", "showSubTitle", "subTitle", "richText", "", "nextStep", "Lcom/alibaba/fastjson/JSONObject;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "url", "Lcom/ss/android/lark/passport/infra/util/RichTextUtil$InterceptUrl;", "showTitle", "title", "AddTo", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CommonUiContainer extends BaseUiContainer {

    /* renamed from: j */
    public static final Companion f162599j = new Companion(null);

    /* renamed from: d */
    public final LinearLayout f162600d;

    /* renamed from: e */
    public final LinearLayout f162601e;

    /* renamed from: f */
    public final LinearLayout f162602f;

    /* renamed from: g */
    public final LinearLayout f162603g;

    /* renamed from: h */
    public final BlockedNestedScrollView f162604h;

    /* renamed from: i */
    public final CommonContainerLayout f162605i;

    /* renamed from: k */
    private final Lazy f162606k = LazyKt.lazy(new C64352f(this));

    /* renamed from: l */
    private final Lazy f162607l = LazyKt.lazy(new C64350d(this));

    /* renamed from: m */
    private final Lazy f162608m = LazyKt.lazy(new C64348b(this));

    /* renamed from: n */
    private final Lazy f162609n = LazyKt.lazy(new C64351e(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer$AddTo;", "", "(Ljava/lang/String;I)V", "Header", "Content", "Footer", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum AddTo {
        Header,
        Content,
        Footer
    }

    @JvmStatic
    /* renamed from: a */
    public static final CommonUiContainer m252968a(FragmentActivity fragmentActivity, int i, ViewGroup viewGroup, boolean z) {
        return Companion.m252991a(f162599j, fragmentActivity, i, viewGroup, z, null, 16, null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final CommonUiContainer m252970b(FragmentActivity fragmentActivity, int i) {
        return Companion.m252992a(f162599j, fragmentActivity, i, null, 4, null);
    }

    /* renamed from: a */
    public final TextView mo222868a() {
        return (TextView) this.f162606k.getValue();
    }

    /* renamed from: b */
    public final TextView mo222877b() {
        return (TextView) this.f162607l.getValue();
    }

    /* renamed from: c */
    public final Button mo222880c() {
        return (Button) this.f162608m.getValue();
    }

    /* renamed from: d */
    public final CommonTitleBar mo222883d() {
        return (CommonTitleBar) this.f162609n.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer$Companion;", "", "()V", "TITLE_MARGIN_BOTTOM_WHEN_NO_SUB_TITLE", "", "inflatePartialLayout", "Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer;", "activity", "Landroidx/fragment/app/FragmentActivity;", "res", "container", "Landroid/view/ViewGroup;", "attachToRoot", "", "params", "Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CommonUiContainer mo222886a(FragmentActivity fragmentActivity, int i, UiParams cVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(cVar, "params");
            BaseContainerLayout a = CommonLayoutUtils.m256247a(fragmentActivity);
            return new CommonUiContainer(fragmentActivity, a, a.mo224656b(i), cVar);
        }

        @JvmStatic
        /* renamed from: a */
        public final CommonUiContainer mo222885a(FragmentActivity fragmentActivity, int i, ViewGroup viewGroup, boolean z, UiParams cVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(cVar, "params");
            LayoutInflater from = LayoutInflater.from(fragmentActivity);
            Intrinsics.checkExpressionValueIsNotNull(from, "inflater");
            BaseContainerLayout a = CommonLayoutUtils.m256249a(from, viewGroup, z);
            return new CommonUiContainer(fragmentActivity, a, a.mo224656b(i), cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ CommonUiContainer m252992a(Companion aVar, FragmentActivity fragmentActivity, int i, UiParams cVar, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                cVar = UiParams.f162619e.mo222895b();
            }
            return aVar.mo222886a(fragmentActivity, i, cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ CommonUiContainer m252991a(Companion aVar, FragmentActivity fragmentActivity, int i, ViewGroup viewGroup, boolean z, UiParams cVar, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                cVar = UiParams.f162619e.mo222895b();
            }
            return aVar.mo222885a(fragmentActivity, i, viewGroup, z, cVar);
        }
    }

    @Override // com.ss.lark.android.passport.biz.base.ui.BaseUiContainer
    /* renamed from: a */
    public void mo222875a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "target");
        ButterKnife.bind(obj, this.f162605i);
    }

    /* renamed from: a */
    public final void mo222876a(boolean z) {
        Button c = mo222880c();
        if (c != null) {
            c.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo222874a(View view, LinearLayout.LayoutParams layoutParams, Function1<? super LinearLayout.LayoutParams, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m252969a(view, layoutParams, function1, AddTo.Footer);
    }

    /* renamed from: e */
    public final void mo222884e() {
        this.f162612a.finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$b */
    static final class C64348b extends Lambda implements Function0<Button> {
        final /* synthetic */ CommonUiContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64348b(CommonUiContainer commonUiContainer) {
            super(0);
            this.this$0 = commonUiContainer;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Button invoke() {
            return (Button) this.this$0.f162605i.findViewById(R.id.signin_sdk_widget_footer_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$d */
    static final class C64350d extends Lambda implements Function0<TextView> {
        final /* synthetic */ CommonUiContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64350d(CommonUiContainer commonUiContainer) {
            super(0);
            this.this$0 = commonUiContainer;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.f162605i.findViewById(R.id.signin_sdk_widget_sub_title);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$e */
    static final class C64351e extends Lambda implements Function0<CommonTitleBar> {
        final /* synthetic */ CommonUiContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64351e(CommonUiContainer commonUiContainer) {
            super(0);
            this.this$0 = commonUiContainer;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CommonTitleBar invoke() {
            return (CommonTitleBar) this.this$0.f162605i.findViewById(R.id.signin_sdk_widget_title_bar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$f */
    static final class C64352f extends Lambda implements Function0<TextView> {
        final /* synthetic */ CommonUiContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64352f(CommonUiContainer commonUiContainer) {
            super(0);
            this.this$0 = commonUiContainer;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.f162605i.findViewById(R.id.signin_sdk_widget_title);
        }
    }

    /* renamed from: f */
    private final void m252971f() {
        this.f162605i.getTitleBarContainer().setBackgroundResource(R.color.bg_body);
        Drawable mutate = this.f162605i.getTitleBarContainer().getBackground().mutate();
        Intrinsics.checkExpressionValueIsNotNull(mutate, "commonLayout.titleBarContainer.background.mutate()");
        mutate.setAlpha(0);
        this.f162605i.setOnContentScrollListener(new C64349c(this));
    }

    /* renamed from: g */
    private final void m252972g() {
        boolean z;
        TextView b = mo222877b();
        Intrinsics.checkExpressionValueIsNotNull(b, "subTitleView");
        int i = 0;
        if (b.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TextView b2 = mo222877b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "subTitleView");
            i = (int) C28441g.m104234a(b2.getContext(), (float) 32);
        }
        TextView a = mo222868a();
        Intrinsics.checkExpressionValueIsNotNull(a, "titleView");
        TextView textView = a;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.CommonUiContainer$c */
    public static final class C64349c extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ CommonUiContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64349c(CommonUiContainer commonUiContainer) {
            super(1);
            this.this$0 = commonUiContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (this.this$0.f162605i.getTitleBarContainer().getHeight() > 0) {
                Drawable background = this.this$0.f162605i.getTitleBarContainer().getBackground();
                if (i > 0) {
                    CommonTitleBar d = this.this$0.mo222883d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "titleBar");
                    TextView titleView = d.getTitleView();
                    Intrinsics.checkExpressionValueIsNotNull(titleView, "titleBar.titleView");
                    titleView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    Drawable mutate = background.mutate();
                    Intrinsics.checkExpressionValueIsNotNull(mutate, "background.mutate()");
                    mutate.setAlpha(0);
                    return;
                }
                CommonTitleBar d2 = this.this$0.mo222883d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "titleBar");
                TextView titleView2 = d2.getTitleView();
                Intrinsics.checkExpressionValueIsNotNull(titleView2, "titleBar.titleView");
                titleView2.setAlpha(1.0f);
                Drawable mutate2 = background.mutate();
                Intrinsics.checkExpressionValueIsNotNull(mutate2, "background.mutate()");
                mutate2.setAlpha(255);
            }
        }
    }

    /* renamed from: c */
    public final CommonUiContainer mo222881c(int i) {
        return mo222882c(this.f162612a.getString(i));
    }

    /* renamed from: a */
    public final CommonUiContainer mo222869a(int i) {
        return mo222871a((CharSequence) this.f162612a.getString(i));
    }

    /* renamed from: b */
    public final CommonUiContainer mo222878b(int i) {
        return mo222879b(this.f162612a.getString(i));
    }

    /* renamed from: b */
    public final CommonUiContainer mo222879b(CharSequence charSequence) {
        boolean z;
        int i;
        TextView b = mo222877b();
        Intrinsics.checkExpressionValueIsNotNull(b, "subTitleView");
        TextView textView = b;
        boolean z2 = false;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            z2 = true;
        }
        if (!z2) {
            C49226y.m194062a(this.f162612a, mo222877b(), charSequence.toString(), (JSONObject) null, (UniContext) null, PassportLog.f123351c.mo171474a(), (C49226y.AbstractC49228a) null);
        }
        m252972g();
        return this;
    }

    /* renamed from: c */
    public final CommonUiContainer mo222882c(CharSequence charSequence) {
        boolean z;
        int i;
        boolean z2;
        Button c = mo222880c();
        Intrinsics.checkExpressionValueIsNotNull(c, "footerButton");
        Button button = c;
        int i2 = 0;
        boolean z3 = true;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        Button c2 = mo222880c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "footerButton");
        c2.setText(charSequence);
        LinearLayout linearLayout = this.f162603g;
        LinearLayout linearLayout2 = linearLayout;
        Iterator<View> a = C49170e.m193882b(linearLayout).mo4717a();
        while (true) {
            if (!a.hasNext()) {
                z3 = false;
                break;
            }
            if (a.next().getVisibility() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
        }
        if (!z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        return this;
    }

    /* renamed from: a */
    public final CommonUiContainer mo222870a(ButtonInfo buttonInfo) {
        if (buttonInfo != null) {
            mo222882c(buttonInfo.text);
        }
        return this;
    }

    /* renamed from: a */
    public final CommonUiContainer mo222871a(CharSequence charSequence) {
        boolean z;
        TextView a = mo222868a();
        Intrinsics.checkExpressionValueIsNotNull(a, "titleView");
        TextView textView = a;
        int i = 0;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        if (!(true ^ z)) {
            i = 8;
        }
        textView.setVisibility(i);
        TextView a2 = mo222868a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "titleView");
        a2.setText(charSequence);
        mo222883d().setTitleText(charSequence);
        CommonTitleBar d = mo222883d();
        Intrinsics.checkExpressionValueIsNotNull(d, "titleBar");
        TextView titleView = d.getTitleView();
        Intrinsics.checkExpressionValueIsNotNull(titleView, "titleBar.titleView");
        titleView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        m252971f();
        return this;
    }

    /* renamed from: a */
    public final void mo222873a(View.OnClickListener onClickListener) {
        Button c = mo222880c();
        if (c != null) {
            ak.m193850a(c, onClickListener);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonUiContainer(final FragmentActivity fragmentActivity, BaseContainerLayout baseContainerLayout, CommonContainerLayout commonContainerLayout, UiParams cVar) {
        super(fragmentActivity, baseContainerLayout, cVar);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(baseContainerLayout, "rootLayout");
        Intrinsics.checkParameterIsNotNull(commonContainerLayout, "commonLayout");
        Intrinsics.checkParameterIsNotNull(cVar, "params");
        this.f162605i = commonContainerLayout;
        this.f162600d = commonContainerLayout.getTitleBarContainer();
        this.f162601e = commonContainerLayout.getHeaderContainer();
        this.f162602f = commonContainerLayout.getContentContainer();
        this.f162603g = commonContainerLayout.getFooterContainer();
        this.f162604h = commonContainerLayout.getContentScrollView();
        mo222883d().setTitleClickListener(new CommonTitleBar.AbstractC49239c() {
            /* class com.ss.lark.android.passport.biz.base.ui.CommonUiContainer.C643471 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                fragmentActivity.onBackPressed();
            }
        });
    }

    /* renamed from: a */
    private final void m252969a(View view, LinearLayout.LayoutParams layoutParams, Function1<? super LinearLayout.LayoutParams, Unit> function1, AddTo addTo) {
        LinearLayout linearLayout;
        int i = C64355b.f162616a[addTo.ordinal()];
        if (i == 1) {
            linearLayout = this.f162605i.getHeaderContainer();
        } else if (i == 2) {
            linearLayout = this.f162605i.getContentContainer();
        } else if (i == 3) {
            linearLayout = this.f162605i.getFooterContainer();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutParams != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            linearLayout.addView(view);
        }
        if (function1 != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                function1.invoke((LinearLayout.LayoutParams) layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    public final CommonUiContainer mo222872a(String str, JSONObject jSONObject, UniContext uniContext, C49226y.AbstractC49228a aVar) {
        boolean z;
        TextView b = mo222877b();
        Intrinsics.checkExpressionValueIsNotNull(b, "subTitleView");
        TextView textView = b;
        String str2 = str;
        int i = 0;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            i = 8;
        }
        textView.setVisibility(i);
        C49226y.m194062a(this.f162612a, mo222877b(), str, jSONObject, uniContext, PassportLog.f123351c.mo171474a(), aVar);
        m252972g();
        return this;
    }
}
