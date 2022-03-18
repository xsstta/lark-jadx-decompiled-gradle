package com.ss.android.lark.calendar.impl.features.settings.account;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.component.CompImportGoogle;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageAdapter;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010*\u001a\u00020#2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.H\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020#H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0011*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0011*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;", "realView", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "compImportGoogle", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle;", "getContext", "()Landroid/content/Context;", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter;", "mErrorDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mFragmentContainer", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLlNoContent", "Landroid/widget/LinearLayout;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "mTvBlue", "Landroid/widget/TextView;", "mTvBoth", "mTvContainer", "mTvGrey", "viewDelegate", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "viewRoot", "create", "", "destroy", "getFragmentContainer", "Landroid/view/ViewGroup;", "hideNoAccountNotify", "initView", "setViewDelegate", "showAccountList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "Lkotlin/collections/ArrayList;", "showErrorToast", "resId", "", "showNoAccountNotify", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g */
public final class AccountManageView implements AccountManageContract.IAccountManageView {

    /* renamed from: a */
    public AccountManageContract.IAccountManageView.ViewDelegate f83087a;

    /* renamed from: b */
    public final CompImportGoogle f83088b = new CompImportGoogle();

    /* renamed from: c */
    public final TextView f83089c;

    /* renamed from: d */
    public final TextView f83090d;

    /* renamed from: e */
    public final TextView f83091e;

    /* renamed from: f */
    private final View f83092f;

    /* renamed from: g */
    private final CommonTitleBar f83093g;

    /* renamed from: h */
    private final RecyclerView f83094h;

    /* renamed from: i */
    private final LinearLayout f83095i;

    /* renamed from: j */
    private final FrameLayout f83096j;

    /* renamed from: k */
    private final LinearLayout f83097k;

    /* renamed from: l */
    private AccountManageAdapter f83098l;

    /* renamed from: m */
    private final LinearLayoutManager f83099m;

    /* renamed from: n */
    private RequestLoadingDialog f83100n;

    /* renamed from: o */
    private final Context f83101o;

    /* renamed from: c */
    public final Context mo118470c() {
        return this.f83101o;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f83088b.mo109610d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageView$initView$3", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageAdapter$OnItemClickListener;", "onBindGoogleCalendarClickListener", "", "view", "Landroid/view/View;", "onImportExchangeCalendarClick", "onImportLocalCalendarClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$c */
    public static final class C32422c implements AccountManageAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83104a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo118421a() {
            AccountManageView.m123760a(this.f83104a).mo118433b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageAdapter.OnItemClickListener
        /* renamed from: b */
        public void mo118423b() {
            AccountManageView.m123760a(this.f83104a).mo118434c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32422c(AccountManageView gVar) {
            this.f83104a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo118422a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f83104a.f83088b.mo109605a(view);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView
    /* renamed from: b */
    public ViewGroup mo118430b() {
        FrameLayout frameLayout = this.f83096j;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mFragmentContainer");
        return frameLayout;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m123761d();
        this.f83088b.mo109609c();
    }

    /* renamed from: e */
    private final void m123762e() {
        ImageView imageView = (ImageView) this.f83092f.findViewById(R.id.noAccountIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.noAccountIv");
        imageView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) this.f83092f.findViewById(R.id.tvContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "viewRoot.tvContainer");
        linearLayout.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$f */
    static final class RunnableC32425f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83107a;

        RunnableC32425f(AccountManageView gVar) {
            this.f83107a = gVar;
        }

        public final void run() {
            TextView textView = this.f83107a.f83089c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTvGrey");
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f83107a.f83090d;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mTvBlue");
            int lineCount2 = lineCount + textView2.getLineCount();
            TextView textView3 = this.f83107a.f83091e;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mTvBoth");
            if (lineCount2 == textView3.getLineCount()) {
                TextView textView4 = this.f83107a.f83091e;
                Intrinsics.checkExpressionValueIsNotNull(textView4, "mTvBoth");
                textView4.setVisibility(8);
                TextView textView5 = this.f83107a.f83089c;
                Intrinsics.checkExpressionValueIsNotNull(textView5, "mTvGrey");
                textView5.setVisibility(0);
                TextView textView6 = this.f83107a.f83090d;
                Intrinsics.checkExpressionValueIsNotNull(textView6, "mTvBlue");
                textView6.setVisibility(0);
                return;
            }
            TextView textView7 = this.f83107a.f83091e;
            Intrinsics.checkExpressionValueIsNotNull(textView7, "mTvBoth");
            textView7.setVisibility(0);
            TextView textView8 = this.f83107a.f83089c;
            Intrinsics.checkExpressionValueIsNotNull(textView8, "mTvGrey");
            textView8.setVisibility(8);
            TextView textView9 = this.f83107a.f83090d;
            Intrinsics.checkExpressionValueIsNotNull(textView9, "mTvBlue");
            textView9.setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m123761d() {
        this.f83093g.setLeftClickListener(new View$OnClickListenerC32420a(this));
        this.f83093g.setTitle(C32634ae.m125182b(R.string.Calendar_NewSettings_CalendarThirdPartyAccount));
        this.f83093g.setMainTitleTextStyle(1);
        this.f83093g.setLeftClickListener(new View$OnClickListenerC32421b(this));
        AccountManageContract.IAccountManageView.ViewDelegate aVar = this.f83087a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        AccountManageAdapter bVar = new AccountManageAdapter(aVar);
        this.f83098l = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        bVar.mo118413a(new C32422c(this));
        m123762e();
        RecyclerView recyclerView = this.f83094h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecyclerView");
        recyclerView.setLayoutManager(this.f83099m);
        RecyclerView recyclerView2 = this.f83094h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRecyclerView");
        AccountManageAdapter bVar2 = this.f83098l;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(bVar2);
        Context context = this.f83101o;
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f83100n = requestLoadingDialog;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112590b();
            }
            GeneralHitPoint.f83331a.mo118728w();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView
    /* renamed from: a */
    public void mo118428a() {
        this.f83093g.removeAllActions();
        LinearLayout linearLayout = this.f83095i;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mLlNoContent");
        linearLayout.setVisibility(0);
        ImageView imageView = (ImageView) this.f83092f.findViewById(R.id.noAccountIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.noAccountIv");
        imageView.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f83092f.findViewById(R.id.tvContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "viewRoot.tvContainer");
        linearLayout2.setVisibility(0);
        RecyclerView recyclerView = this.f83094h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecyclerView");
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = this.f83095i;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "mLlNoContent");
        ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(this.f83101o) + UIUtils.dp2px(this.f83101o, 44.0f);
            this.f83090d.setOnClickListener(new View$OnClickListenerC32423d(this));
            String b = C32634ae.m125182b(R.string.Calendar_GoogleCal_NoCalendars);
            String b2 = C32634ae.m125182b(R.string.Calendar_GoogleCal_MayImportOtherCal);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C32634ae.m125178a(R.color.text_placeholder));
            spannableStringBuilder.append((CharSequence) (b + b2));
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, b.length(), 33);
            spannableStringBuilder.setSpan(new C32424e(this), b.length(), b.length() + b2.length(), 33);
            TextView textView = this.f83091e;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTvBoth");
            textView.setText(spannableStringBuilder);
            TextView textView2 = this.f83091e;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mTvBoth");
            textView2.setHighlightColor(C32634ae.m125178a(R.color.lkui_transparent));
            TextView textView3 = this.f83091e;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mTvBoth");
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            this.f83097k.post(new RunnableC32425f(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageView$showNoAccountNotify$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$e */
    public static final class C32424e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83106a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32424e(AccountManageView gVar) {
            this.f83106a = gVar;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            AccountManageView.m123760a(this.f83106a).mo118431a();
            GeneralHitPoint.f83331a.mo118729x();
            GeneralHitPoint.m124279w("account_management");
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(C32634ae.m125178a(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AccountManageContract.IAccountManageView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f83087a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$d */
    static final class View$OnClickListenerC32423d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83105a;

        View$OnClickListenerC32423d(AccountManageView gVar) {
            this.f83105a = gVar;
        }

        public final void onClick(View view) {
            AccountManageView.m123760a(this.f83105a).mo118431a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AccountManageContract.IAccountManageView.ViewDelegate m123760a(AccountManageView gVar) {
        AccountManageContract.IAccountManageView.ViewDelegate aVar = gVar.f83087a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$a */
    public static final class View$OnClickListenerC32420a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83102a;

        View$OnClickListenerC32420a(AccountManageView gVar) {
            this.f83102a = gVar;
        }

        public final void onClick(View view) {
            Context c = this.f83102a.mo118470c();
            if (c != null) {
                ((Activity) c).finish();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.g$b */
    public static final class View$OnClickListenerC32421b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountManageView f83103a;

        View$OnClickListenerC32421b(AccountManageView gVar) {
            this.f83103a = gVar;
        }

        public final void onClick(View view) {
            Context c = this.f83103a.mo118470c();
            if (c != null) {
                ((Activity) c).finish();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView
    /* renamed from: a */
    public void mo118429a(ArrayList<AccountDataListItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        AccountManageAdapter bVar = this.f83098l;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        bVar.mo118414a(arrayList);
        RecyclerView recyclerView = this.f83094h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecyclerView");
        recyclerView.setVisibility(0);
        LinearLayout linearLayout = this.f83095i;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mLlNoContent");
        linearLayout.setVisibility(8);
    }

    public AccountManageView(View view, Context context) {
        Intrinsics.checkParameterIsNotNull(view, "realView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f83101o = context;
        this.f83092f = view;
        this.f83093g = (CommonTitleBar) view.findViewById(R.id.titleBar);
        this.f83094h = (RecyclerView) view.findViewById(R.id.rvCalendarsContainer);
        this.f83095i = (LinearLayout) view.findViewById(R.id.llNoContent);
        this.f83096j = (FrameLayout) view.findViewById(R.id.fragmentContainer);
        this.f83097k = (LinearLayout) view.findViewById(R.id.tvContainer);
        this.f83089c = (TextView) view.findViewById(R.id.tvGrey);
        this.f83090d = (TextView) view.findViewById(R.id.tvBlue);
        this.f83091e = (TextView) view.findViewById(R.id.tvBoth);
        this.f83099m = new LinearLayoutManager(context);
    }
}
