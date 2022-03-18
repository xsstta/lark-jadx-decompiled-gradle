package com.ss.android.lark.mm.module.detail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.share.model.ApplyInfo;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;
import com.ss.android.lark.mm.widget.EmptyState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0002Je\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2 \u0010\u000e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00040\u000f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u000fJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0012H\u0002Jm\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2 \u0010\u000e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00040\u000f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u000fJ(\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J:\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/MmDetailErrorFactory;", "", "()V", "animShow", "", "container", "Landroid/widget/FrameLayout;", "visibility", "", "auth", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onAuthDataCallback", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "applyAuth", "", "Lkotlin/ParameterName;", "name", "applyInfo", "checkStateAndSet", "", "tag", "create", "context", "error", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl$DataError;", "deleted", "Landroid/content/Context;", "fromSource", "empty", "fail", "retryAction", "Lkotlin/Function0;", "hide", "resetState", "searchEmpty", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.c */
public final class MmDetailErrorFactory {

    /* renamed from: a */
    public static final MmDetailErrorFactory f115916a = new MmDetailErrorFactory();

    private MmDetailErrorFactory() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$e */
    public static final class RunnableC46008e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115935a;

        RunnableC46008e(FrameLayout frameLayout) {
            this.f115935a = frameLayout;
        }

        public final void run() {
            this.f115935a.removeAllViews();
            Context context = this.f115935a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageSize(Float.valueOf(EmptyState.f118674c.mo165541a()));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_NoTranscript));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f115935a);
            MmDetailErrorFactory.m182258a(MmDetailErrorFactory.f115916a, this.f115935a, 0, 2, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$g */
    static final class RunnableC46011g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115942a;

        RunnableC46011g(FrameLayout frameLayout) {
            this.f115942a = frameLayout;
        }

        public final void run() {
            this.f115942a.removeAllViews();
            Context context = this.f115942a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_NoResultsFound));
            emptyState.setDescTextColor(UIUtils.getColor(this.f115942a.getContext(), R.color.text_caption));
            emptyState.setDescTextSize((float) UIUtils.dp2px(this.f115942a.getContext(), 17.0f));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f115942a);
            MmDetailErrorFactory.m182258a(MmDetailErrorFactory.f115916a, this.f115942a, 0, 2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$c */
    public static final class RunnableC46003c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115921a;

        /* renamed from: b */
        final /* synthetic */ Function1 f115922b;

        /* renamed from: c */
        final /* synthetic */ MmBaseInfo f115923c;

        /* renamed from: d */
        final /* synthetic */ Function1 f115924d;

        /* renamed from: e */
        final /* synthetic */ IMmViewControlContext f115925e;

        RunnableC46003c(FrameLayout frameLayout, Function1 function1, MmBaseInfo mmBaseInfo, Function1 function12, IMmViewControlContext gVar) {
            this.f115921a = frameLayout;
            this.f115922b = function1;
            this.f115923c = mmBaseInfo;
            this.f115924d = function12;
            this.f115925e = gVar;
        }

        public final void run() {
            this.f115921a.removeAllViews();
            Context context = this.f115921a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            final EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_access));
            emptyState.setImageSize(Float.valueOf(EmptyState.f118674c.mo165541a()));
            emptyState.setTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_NoAccessPermission));
            this.f115922b.invoke(new Function1<ApplyInfo, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.MmDetailErrorFactory.RunnableC46003c.C460041 */
                final /* synthetic */ RunnableC46003c this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApplyInfo applyInfo) {
                    invoke(applyInfo);
                    return Unit.INSTANCE;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/MmDetailErrorFactory$auth$1$1$1$1$1", "Lcom/ss/android/lark/mm/widget/EmptyState$OperableTextSpan;", "onClick", "", "widget", "Landroid/view/View;", "mm_release", "com/ss/android/lark/mm/module/detail/MmDetailErrorFactory$auth$1$1$$special$$inlined$let$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mm.module.detail.c$c$1$a */
                public static final class C46005a extends EmptyState.OperableTextSpan {

                    /* renamed from: a */
                    final /* synthetic */ ApplyInfo f115926a;

                    /* renamed from: b */
                    final /* synthetic */ C460041 f115927b;

                    /* renamed from: c */
                    final /* synthetic */ ApplyInfo f115928c;

                    @Override // com.ss.android.lark.mm.widget.EmptyState.OperableTextSpan
                    public void onClick(View view) {
                        Intrinsics.checkParameterIsNotNull(view, "widget");
                        if (this.f115927b.this$0.f115923c == null) {
                            C47083e.m186427a("vc_mm_click_button", C47086i.m186432a().mo165409a("owner_name").mo165413a("page_name", "permission_page").mo165421c());
                            C47083e.m186427a("vc_minutes_permission_click", C47086i.m186432a().mo165422d("owner_name").mo165423e("none").mo165421c());
                        } else {
                            C47083e.m186425a(C47085h.m186430a(this.f115927b.this$0.f115923c), "vc_mm_click_button", C47086i.m186432a().mo165409a("owner_name").mo165413a("page_name", "permission_page").mo165421c());
                            C47083e.m186425a(C47085h.m186430a(this.f115927b.this$0.f115923c), "vc_minutes_permission_click", C47086i.m186432a().mo165422d("owner_name").mo165423e("none").mo165421c());
                        }
                        IMmDepend a = C45899c.m181859a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                        a.getHostDepend().mo144633a(this.f115927b.this$0.f115921a.getContext(), this.f115928c.getOwnerUserId(), BaseUserType.USER);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C46005a(ApplyInfo applyInfo, C460041 r2, ApplyInfo applyInfo2) {
                        super(null, 1, null);
                        this.f115926a = applyInfo;
                        this.f115927b = r2;
                        this.f115928c = applyInfo2;
                    }
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mm/module/detail/MmDetailErrorFactory$auth$1$1$1$2"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mm.module.detail.c$c$1$b */
                public static final class View$OnClickListenerC46006b implements View.OnClickListener {

                    /* renamed from: a */
                    final /* synthetic */ C460041 f115929a;

                    /* renamed from: b */
                    final /* synthetic */ ApplyInfo f115930b;

                    View$OnClickListenerC46006b(C460041 r1, ApplyInfo applyInfo) {
                        this.f115929a = r1;
                        this.f115930b = applyInfo;
                    }

                    public final void onClick(View view) {
                        if (this.f115929a.this$0.f115923c == null) {
                            C47083e.m186427a("vc_mm_click_button", C47086i.m186432a().mo165409a("apply").mo165413a("page_name", "permission_page").mo165421c());
                            C47083e.m186427a("vc_minutes_permission_click", C47086i.m186432a().mo165422d("apply").mo165423e("none").mo165421c());
                        } else {
                            C47083e.m186425a(C47085h.m186430a(this.f115929a.this$0.f115923c), "vc_mm_click_button", C47086i.m186432a().mo165409a("apply").mo165413a("page_name", "permission_page").mo165421c());
                            C47083e.m186425a(C47085h.m186430a(this.f115929a.this$0.f115923c), "vc_minutes_permission_click", C47086i.m186432a().mo165422d("apply").mo165423e("none").mo165421c());
                        }
                        this.f115929a.this$0.f115924d.invoke(emptyState.getRemarkText());
                        SoftKeyboardUtil.f118667a.mo165512a((EditText) emptyState.mo165521a(R.id.remark));
                    }
                }

                public final void invoke(ApplyInfo applyInfo) {
                    boolean z;
                    if (applyInfo != null) {
                        if (Intrinsics.areEqual((Object) applyInfo.getAllowApply(), (Object) true)) {
                            String ownerName = applyInfo.getOwnerName();
                            if (ownerName != null) {
                                String a = new ResString.Editor(R.string.MMWeb_G_RequestPermissionInfo).mo165506a("name", applyInfo.getOwnerName()).mo165505a("permissionType", R.string.MMWeb_G_ViewPermissions).mo165507a();
                                SpannableString spannableString = new SpannableString(a);
                                int indexOf$default = StringsKt.indexOf$default((CharSequence) a, ownerName, 0, false, 6, (Object) null);
                                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) a, ")", indexOf$default, false, 4, (Object) null) + 1;
                                if (indexOf$default2 < 1) {
                                    indexOf$default2 = StringsKt.indexOf$default((CharSequence) a, "）", indexOf$default, false, 4, (Object) null) + 1;
                                }
                                if (indexOf$default2 < 1) {
                                    indexOf$default2 = indexOf$default + ownerName.length();
                                }
                                spannableString.setSpan(new C46005a(applyInfo, this, applyInfo), indexOf$default, indexOf$default2, 33);
                                emptyState.setDesc(spannableString);
                            }
                            emptyState.mo165522a();
                            emptyState.setPrimaryText(ResString.f118656a.mo165504a(R.string.MMWeb_G_SendRequest));
                            emptyState.setPrimaryClickListener(new View$OnClickListenerC46006b(this, applyInfo));
                            SoftKeyboardUtil uVar = SoftKeyboardUtil.f118667a;
                            Context context = this.this$0.f115921a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
                            EmptyState emptyState = emptyState;
                            EmptyState emptyState2 = emptyState;
                            TextView textView = (TextView) emptyState.mo165521a(R.id.btnPrimary);
                            Intrinsics.checkExpressionValueIsNotNull(textView, "emptyState.btnPrimary");
                            uVar.mo165511a(context, emptyState2, textView);
                        } else {
                            String notAllowedTips = applyInfo.getNotAllowedTips();
                            if (notAllowedTips != null) {
                                if (notAllowedTips.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    emptyState.setDesc(applyInfo.getNotAllowedTips());
                                }
                            }
                        }
                    }
                    emptyState.setId(View.generateViewId());
                    emptyState.setContainer(this.this$0.f115921a);
                    MmDetailErrorFactory.m182258a(MmDetailErrorFactory.f115916a, this.this$0.f115921a, 0, 2, (Object) null);
                }
            });
            C47083e.m186425a(C47085h.m186430a(this.f115923c), "vc_mm_page_view", C47086i.m186432a().mo165413a("page_name", "permission_page").mo165413a("from_source", C45950b.m182104a(this.f115925e.mo161232n()).mo161319c()).mo165421c());
            C47083e.m186425a(C47085h.m186430a(this.f115923c), "vc_minutes_permission_view", C47086i.m186432a().mo165421c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$d */
    public static final class RunnableC46007d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115931a;

        /* renamed from: b */
        final /* synthetic */ Context f115932b;

        /* renamed from: c */
        final /* synthetic */ String f115933c;

        /* renamed from: d */
        final /* synthetic */ MmBaseInfo f115934d;

        RunnableC46007d(FrameLayout frameLayout, Context context, String str, MmBaseInfo mmBaseInfo) {
            this.f115931a = frameLayout;
            this.f115932b = context;
            this.f115933c = str;
            this.f115934d = mmBaseInfo;
        }

        public final void run() {
            this.f115931a.removeAllViews();
            Context context = this.f115931a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageSize(Float.valueOf(EmptyState.f118674c.mo165541a()));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_DeletedByOwner));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f115931a);
            MmDetailErrorFactory.m182258a(MmDetailErrorFactory.f115916a, this.f115931a, 0, 2, (Object) null);
            C47083e.m186423a(this.f115932b, "vc_mm_page_view", C47086i.m186432a().mo165413a("page_name", "deleted_page").mo165413a("from_source", this.f115933c).mo165421c());
            C47083e.m186425a(C47085h.m186430a(this.f115934d), "vc_minutes_detail_view", C47086i.m186432a().mo165426h("deleted_page").mo165421c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$f */
    public static final class RunnableC46009f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115936a;

        /* renamed from: b */
        final /* synthetic */ Function0 f115937b;

        /* renamed from: c */
        final /* synthetic */ Context f115938c;

        /* renamed from: d */
        final /* synthetic */ String f115939d;

        /* renamed from: e */
        final /* synthetic */ MmBaseInfo f115940e;

        RunnableC46009f(FrameLayout frameLayout, Function0 function0, Context context, String str, MmBaseInfo mmBaseInfo) {
            this.f115936a = frameLayout;
            this.f115937b = function0;
            this.f115938c = context;
            this.f115939d = str;
            this.f115940e = mmBaseInfo;
        }

        public final void run() {
            this.f115936a.removeAllViews();
            Context context = this.f115936a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
            emptyState.setImageSize(Float.valueOf(EmptyState.f118674c.mo165541a()));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_SomethingWentWrong));
            if (this.f115937b != null) {
                emptyState.setSecondaryText(ResString.f118656a.mo165504a(R.string.MMWeb_G_Reload));
                emptyState.setSecondaryClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.mm.module.detail.MmDetailErrorFactory.RunnableC46009f.View$OnClickListenerC460101 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC46009f f115941a;

                    {
                        this.f115941a = r1;
                    }

                    public final void onClick(View view) {
                        this.f115941a.f115937b.invoke();
                    }
                });
            }
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f115936a);
            MmDetailErrorFactory.m182258a(MmDetailErrorFactory.f115916a, this.f115936a, 0, 2, (Object) null);
            C47083e.m186423a(this.f115938c, "vc_mm_page_view", C47086i.m186432a().mo165413a("page_name", "abnormal_page").mo165413a("from_source", this.f115939d).mo165421c());
            C47083e.m186425a(C47085h.m186430a(this.f115940e), "vc_minutes_detail_view", C47086i.m186432a().mo165426h("abnormal_page").mo165421c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/MmDetailErrorFactory$animShow$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$b */
    public static final class C46002b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115919a;

        /* renamed from: b */
        final /* synthetic */ int f115920b;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f115919a.setVisibility(this.f115920b);
        }

        C46002b(FrameLayout frameLayout, int i) {
            this.f115919a = frameLayout;
            this.f115920b = i;
        }
    }

    /* renamed from: d */
    private final void m182260d(FrameLayout frameLayout) {
        frameLayout.setTag(R.id.EmptyStateState, "");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.c$a */
    public static final class C46001a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f115917a;

        /* renamed from: b */
        final /* synthetic */ int f115918b;

        C46001a(FrameLayout frameLayout, int i) {
            this.f115917a = frameLayout;
            this.f115918b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            FrameLayout frameLayout = this.f115917a;
            if (this.f115918b == 0) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                f = valueAnimator.getAnimatedFraction();
            } else {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                f = ((float) 1) - valueAnimator.getAnimatedFraction();
            }
            frameLayout.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo161622b(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        if (!m182259a(frameLayout, "contentEmpty")) {
            C26171w.m94675a(new RunnableC46008e(frameLayout));
        }
    }

    /* renamed from: c */
    public final void mo161623c(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        m182260d(frameLayout);
        if (frameLayout.getVisibility() == 0) {
            m182256a(frameLayout, 8);
        }
    }

    /* renamed from: a */
    public final void mo161619a(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        if (!m182259a(frameLayout, "search")) {
            C26171w.m94675a(new RunnableC46011g(frameLayout));
        }
    }

    /* renamed from: a */
    private final void m182256a(FrameLayout frameLayout, int i) {
        frameLayout.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new C46001a(frameLayout, i));
        ofFloat.addListener(new C46002b(frameLayout, i));
        ofFloat.start();
    }

    /* renamed from: a */
    private final boolean m182259a(FrameLayout frameLayout, String str) {
        if (frameLayout.getVisibility() == 0 && Intrinsics.areEqual(frameLayout.getTag(R.id.EmptyStateState), str)) {
            return true;
        }
        frameLayout.setTag(R.id.EmptyStateState, str);
        return false;
    }

    /* renamed from: a */
    public final void mo161617a(Context context, String str, FrameLayout frameLayout, MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fromSource");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        if (!m182259a(frameLayout, "deleted")) {
            C26171w.m94675a(new RunnableC46007d(frameLayout, context, str, mmBaseInfo));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m182258a(MmDetailErrorFactory cVar, FrameLayout frameLayout, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        cVar.m182256a(frameLayout, i);
    }

    /* renamed from: a */
    public final void mo161618a(Context context, String str, FrameLayout frameLayout, MmBaseInfo mmBaseInfo, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fromSource");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        if (!m182259a(frameLayout, "fail")) {
            C26171w.m94675a(new RunnableC46009f(frameLayout, function0, context, str, mmBaseInfo));
        }
    }

    /* renamed from: a */
    public final void mo161620a(IMmViewControlContext gVar, FrameLayout frameLayout, MmBaseInfo mmBaseInfo, Function1<? super Function1<? super ApplyInfo, Unit>, Unit> function1, Function1<? super String, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        Intrinsics.checkParameterIsNotNull(function1, "onAuthDataCallback");
        Intrinsics.checkParameterIsNotNull(function12, "applyAuth");
        if (!m182259a(frameLayout, "auth")) {
            C26171w.m94675a(new RunnableC46003c(frameLayout, function1, mmBaseInfo, function12, gVar));
        }
    }

    /* renamed from: a */
    public final void mo161621a(IMmViewControlContext gVar, MmMeetingBaseInfoControl.DataError dataError, FrameLayout frameLayout, MmBaseInfo mmBaseInfo, Function1<? super Function1<? super ApplyInfo, Unit>, Unit> function1, Function1<? super String, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(gVar, "context");
        Intrinsics.checkParameterIsNotNull(dataError, "error");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        Intrinsics.checkParameterIsNotNull(function1, "onAuthDataCallback");
        Intrinsics.checkParameterIsNotNull(function12, "applyAuth");
        int i = C46068d.f116092a[dataError.ordinal()];
        if (i == 1) {
            mo161623c(frameLayout);
        } else if (i == 2) {
            mo161617a(gVar.mo161232n(), C45950b.m182104a(gVar.mo161232n()).mo161319c(), frameLayout, mmBaseInfo);
        } else if (i == 3) {
            mo161620a(gVar, frameLayout, mmBaseInfo, function1, function12);
        } else if (i == 4) {
            m182257a(this, gVar.mo161232n(), C45950b.m182104a(gVar.mo161232n()).mo161319c(), frameLayout, mmBaseInfo, null, 16, null);
        } else if (i == 5) {
            mo161622b(frameLayout);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.mm.module.detail.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m182257a(MmDetailErrorFactory cVar, Context context, String str, FrameLayout frameLayout, MmBaseInfo mmBaseInfo, Function0 function0, int i, Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        cVar.mo161618a(context, str, frameLayout, mmBaseInfo, function0);
    }
}
