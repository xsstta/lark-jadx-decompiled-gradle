package com.ss.android.appcenter.business.tab.business.blockit.part;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.TemplateErrorView;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.TemplateSkeletonLoadingView;
import com.ss.android.appcenter.common.util.C28191l;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002=>B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u0019H\u0002J\u000e\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u001dJ\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002J\b\u00109\u001a\u00020-H\u0002J\b\u0010:\u001a\u00020-H\u0002J\u0006\u0010;\u001a\u00020\u0017J\u000e\u0010<\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R#\u0010 \u001a\n !*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R#\u0010&\u001a\n !*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b'\u0010#R#\u0010)\u001a\n !*\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b*\u0010#¨\u0006?"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blockName", "", "getBlockName", "()Ljava/lang/String;", "setBlockName", "(Ljava/lang/String;)V", "containerHeight", "getContainerHeight", "()I", "setContainerHeight", "(I)V", "currentStatus", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$Status;", "inflatedError", "", "inflatedLoading", "inflatedUpgrade", "statusClickListener", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$IStatusViewClickListener;", "vContent", "Landroid/view/View;", "vError", "kotlin.jvm.PlatformType", "getVError", "()Landroid/view/View;", "vError$delegate", "Lkotlin/Lazy;", "vLoading", "getVLoading", "vLoading$delegate", "vUpgrade", "getVUpgrade", "vUpgrade$delegate", "addView", "", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "resetViewByStatus", "setLoading", "show", "setStatusClickListener", "listener", "showContent", "showError", "showLoading", "showUpgrade", UpdateKey.STATUS, "updateStatus", "IStatusViewClickListener", "Status", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockitStatusView extends FrameLayout {

    /* renamed from: a */
    public boolean f69584a;

    /* renamed from: b */
    public boolean f69585b;

    /* renamed from: c */
    public boolean f69586c;

    /* renamed from: d */
    public IStatusViewClickListener f69587d;

    /* renamed from: e */
    private Status f69588e = Status.Unset;

    /* renamed from: f */
    private View f69589f;

    /* renamed from: g */
    private final Lazy f69590g = LazyKt.lazy(new C27841e(this));

    /* renamed from: h */
    private int f69591h;

    /* renamed from: i */
    private String f69592i;

    /* renamed from: j */
    private final Lazy f69593j = LazyKt.lazy(new C27840d(this));

    /* renamed from: k */
    private final Lazy f69594k = LazyKt.lazy(new C27842f(this));

    /* renamed from: l */
    private HashMap f69595l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$Status;", "", "(Ljava/lang/String;I)V", "Loading", "Error", "Content", "Upgrade", "Unset", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status {
        Loading,
        Error,
        Content,
        Upgrade,
        Unset
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$IStatusViewClickListener;", "", "onStatusViewClick", "", "v", "Landroid/view/View;", UpdateKey.STATUS, "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitStatusView$Status;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$a */
    public interface IStatusViewClickListener {
        /* renamed from: a */
        void mo99218a(View view, Status status);
    }

    private final View getVError() {
        return (View) this.f69593j.getValue();
    }

    private final View getVLoading() {
        return (View) this.f69590g.getValue();
    }

    private final View getVUpgrade() {
        return (View) this.f69594k.getValue();
    }

    /* renamed from: a */
    public View mo99323a(int i) {
        if (this.f69595l == null) {
            this.f69595l = new HashMap();
        }
        View view = (View) this.f69595l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f69595l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final Status mo99324a() {
        return this.f69588e;
    }

    public final String getBlockName() {
        return this.f69592i;
    }

    public final int getContainerHeight() {
        return this.f69591h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$d */
    static final class C27840d extends Lambda implements Function0<View> {
        final /* synthetic */ BlockitStatusView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27840d(BlockitStatusView blockitStatusView) {
            super(0);
            this.this$0 = blockitStatusView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            this.this$0.f69585b = true;
            return LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.workplace_blockit_error_view, (ViewGroup) this.this$0, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$e */
    static final class C27841e extends Lambda implements Function0<View> {
        final /* synthetic */ BlockitStatusView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27841e(BlockitStatusView blockitStatusView) {
            super(0);
            this.this$0 = blockitStatusView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            this.this$0.f69584a = true;
            return LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.workplace_blockit_loading_view, (ViewGroup) this.this$0, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$f */
    static final class C27842f extends Lambda implements Function0<View> {
        final /* synthetic */ BlockitStatusView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27842f(BlockitStatusView blockitStatusView) {
            super(0);
            this.this$0 = blockitStatusView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            this.this$0.f69586c = true;
            return LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.workplace_blockit_upgrade_view, (ViewGroup) this.this$0, false);
        }
    }

    /* renamed from: b */
    private final void m101689b() {
        int i = C27843a.f69597a[this.f69588e.ordinal()];
        if (i == 1) {
            m101693f();
        } else if (i == 2) {
            m101692e();
        } else if (i == 3) {
            m101691d();
        } else if (i == 4) {
            m101690c();
        }
    }

    /* renamed from: e */
    private final void m101692e() {
        View view = this.f69589f;
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f69584a) {
            View vLoading = getVLoading();
            Intrinsics.checkExpressionValueIsNotNull(vLoading, "vLoading");
            vLoading.setVisibility(8);
            setLoading(false);
        }
        if (this.f69585b) {
            View vError = getVError();
            Intrinsics.checkExpressionValueIsNotNull(vError, "vError");
            vError.setVisibility(8);
        }
        if (this.f69586c) {
            View vUpgrade = getVUpgrade();
            Intrinsics.checkExpressionValueIsNotNull(vUpgrade, "vUpgrade");
            vUpgrade.setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m101691d() {
        View view = this.f69589f;
        if (view != null) {
            view.setVisibility(8);
        }
        View vError = getVError();
        Intrinsics.checkExpressionValueIsNotNull(vError, "vError");
        if (vError.getParent() == null) {
            addView(getVError());
        }
        View vError2 = getVError();
        Intrinsics.checkExpressionValueIsNotNull(vError2, "vError");
        vError2.setVisibility(0);
        ((TemplateErrorView) mo99323a(R.id.error)).mo99956a(this.f69592i);
        ((TemplateErrorView) mo99323a(R.id.error)).mo99955a(this.f69591h);
        getVError().setOnClickListener(new View$OnClickListenerC27838b(this));
        if (this.f69584a) {
            View vLoading = getVLoading();
            Intrinsics.checkExpressionValueIsNotNull(vLoading, "vLoading");
            vLoading.setVisibility(8);
            setLoading(false);
        }
        if (this.f69586c) {
            View vUpgrade = getVUpgrade();
            Intrinsics.checkExpressionValueIsNotNull(vUpgrade, "vUpgrade");
            vUpgrade.setVisibility(8);
        }
    }

    /* renamed from: f */
    private final void m101693f() {
        View view = this.f69589f;
        if (view != null) {
            view.setVisibility(4);
        }
        View vLoading = getVLoading();
        Intrinsics.checkExpressionValueIsNotNull(vLoading, "vLoading");
        if (vLoading.getParent() == null) {
            addView(getVLoading());
        }
        View vLoading2 = getVLoading();
        Intrinsics.checkExpressionValueIsNotNull(vLoading2, "vLoading");
        vLoading2.setVisibility(0);
        ((TemplateSkeletonLoadingView) mo99323a(R.id.iv_blockit_loading)).setStatusHeight(this.f69591h);
        setLoading(true);
        if (this.f69585b) {
            View vError = getVError();
            Intrinsics.checkExpressionValueIsNotNull(vError, "vError");
            vError.setVisibility(8);
        }
        if (this.f69586c) {
            View vUpgrade = getVUpgrade();
            Intrinsics.checkExpressionValueIsNotNull(vUpgrade, "vUpgrade");
            vUpgrade.setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m101690c() {
        View view = this.f69589f;
        if (view != null) {
            view.setVisibility(8);
        }
        View vUpgrade = getVUpgrade();
        Intrinsics.checkExpressionValueIsNotNull(vUpgrade, "vUpgrade");
        if (vUpgrade.getParent() == null) {
            addView(getVUpgrade());
        }
        View vUpgrade2 = getVUpgrade();
        Intrinsics.checkExpressionValueIsNotNull(vUpgrade2, "vUpgrade");
        vUpgrade2.setVisibility(0);
        View findViewById = getVUpgrade().findViewById(R.id.tv_upgrade);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vUpgrade.findViewById(R.id.tv_upgrade)");
        TextView textView = (TextView) findViewById;
        String string = getContext().getString(R.string.OpenPlatform_AppCenter_UpdtVerMsg);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…orm_AppCenter_UpdtVerMsg)");
        C28191l.m103263a(getContext(), textView, UIHelper.mustacheFormat(string, "App_Display_Name", C28209p.m103297a(getContext(), (int) R.string.Lark_App_Name)), R.color.text_caption, getContext().getString(R.string.OpenPlatform_AppCenter_UpdtVerBttn), R.color.text_link_hover, null);
        C27839c cVar = new C27839c(this);
        textView.setOnClickListener(new View$OnClickListenerC27844b(cVar));
        getVUpgrade().setOnClickListener(new View$OnClickListenerC27844b(cVar));
        if (this.f69585b) {
            View vError = getVError();
            Intrinsics.checkExpressionValueIsNotNull(vError, "vError");
            vError.setVisibility(8);
        }
        if (this.f69584a) {
            View vLoading = getVLoading();
            Intrinsics.checkExpressionValueIsNotNull(vLoading, "vLoading");
            vLoading.setVisibility(8);
            setLoading(false);
        }
    }

    public final void setBlockName(String str) {
        this.f69592i = str;
    }

    public final void setContainerHeight(int i) {
        this.f69591h = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$c */
    public static final class C27839c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ BlockitStatusView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27839c(BlockitStatusView blockitStatusView) {
            super(1);
            this.this$0 = blockitStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            IStatusViewClickListener aVar = this.this$0.f69587d;
            if (aVar != null) {
                aVar.mo99218a(view, Status.Upgrade);
            }
        }
    }

    public final void setStatusClickListener(IStatusViewClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f69587d = aVar;
    }

    /* renamed from: a */
    public final void mo99325a(Status status) {
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        if (this.f69588e != status) {
            this.f69588e = status;
            m101689b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitStatusView$b */
    public static final class View$OnClickListenerC27838b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockitStatusView f69596a;

        View$OnClickListenerC27838b(BlockitStatusView blockitStatusView) {
            this.f69596a = blockitStatusView;
        }

        public final void onClick(View view) {
            IStatusViewClickListener aVar = this.f69596a.f69587d;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                aVar.mo99218a(view, Status.Error);
            }
        }
    }

    private final void setLoading(boolean z) {
        if (z) {
            ((TemplateSkeletonLoadingView) mo99323a(R.id.iv_blockit_loading)).mo99960b();
        } else {
            ((TemplateSkeletonLoadingView) mo99323a(R.id.iv_blockit_loading)).mo99961c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitStatusView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof BlockitSlot) {
            this.f69589f = view;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }
}
