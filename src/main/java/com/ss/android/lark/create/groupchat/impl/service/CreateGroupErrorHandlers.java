package com.ss.android.lark.create.groupchat.impl.service;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.CreateGroupScene;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupExtraParams;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\\\u0010\u0005\u001aM\u0012I\u0012G\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/service/CreateGroupErrorHandlers;", "", "()V", "ERROR_CHAT_USER_COUNT_GT_LIMIT", "", "errorInterceptors", "", "Lkotlin/reflect/KFunction3;", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "Lkotlin/ParameterName;", "name", "scene", "Landroid/content/Context;", "context", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "err", "", "getErrorInterceptors", "()Ljava/util/List;", "defaultErrorInterceptor", "hitPointInterceptor", "interceptBilling", "interceptGroupMemberLimitManage", "parseTextTypeFromScene", "Lcom/ss/android/lark/create/groupchat/impl/statistics/CreateGroupExtraParams$TextType;", "showGroupMemberLimitDialog", "", "displayMsg", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.a.b */
public final class CreateGroupErrorHandlers {

    /* renamed from: a */
    public static final CreateGroupErrorHandlers f93544a;

    /* renamed from: b */
    private static final List<KFunction<Boolean>> f93545b;

    private CreateGroupErrorHandlers() {
    }

    /* renamed from: a */
    public final List<KFunction<Boolean>> mo133805a() {
        return f93545b;
    }

    static {
        CreateGroupErrorHandlers bVar = new CreateGroupErrorHandlers();
        f93544a = bVar;
        f93545b = CollectionsKt.listOf((Object[]) new KFunction[]{new C36261a(bVar), new C36262b(bVar), new C36263c(bVar), new C36264d(bVar)});
    }

    /* renamed from: a */
    public final CreateGroupExtraParams.TextType mo133804a(CreateGroupScene createGroupScene) {
        int i = C36266c.f93547a[createGroupScene.ordinal()];
        if (i == 1) {
            return CreateGroupExtraParams.TextType.PLUS;
        }
        if (i == 2) {
            return CreateGroupExtraParams.TextType.FROM_P2P;
        }
        if (i == 3) {
            return CreateGroupExtraParams.TextType.FROM_INNER_GROUP;
        }
        if (i == 4) {
            return CreateGroupExtraParams.TextType.FROM_FORWARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.b$e */
    public static final class DialogInterface$OnClickListenerC36265e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupScene f93546a;

        DialogInterface$OnClickListenerC36265e(CreateGroupScene createGroupScene) {
            this.f93546a = createGroupScene;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
            dialogInterface.dismiss();
            CreateGroupExtraParams.Click click = CreateGroupExtraParams.Click.CONFIRM;
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            CreateGroupHitPointNew.f93887a.mo134201c(click.plus(eVar).plus(CreateGroupErrorHandlers.f93544a.mo133804a(this.f93546a)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "Lkotlin/ParameterName;", "name", "scene", "p2", "Landroid/content/Context;", "context", "p3", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "err", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.b$a */
    static final /* synthetic */ class C36261a extends FunctionReference implements Function3<CreateGroupScene, Context, ErrorResult, Boolean> {
        C36261a(CreateGroupErrorHandlers bVar) {
            super(3, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "hitPointInterceptor";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CreateGroupErrorHandlers.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "hitPointInterceptor(Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;Landroid/content/Context;Lcom/larksuite/framework/callback/Entity/ErrorResult;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            return Boolean.valueOf(invoke(createGroupScene, context, errorResult));
        }

        public final boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(createGroupScene, "p1");
            Intrinsics.checkParameterIsNotNull(context, "p2");
            Intrinsics.checkParameterIsNotNull(errorResult, "p3");
            return ((CreateGroupErrorHandlers) this.receiver).mo133807a(createGroupScene, context, errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "Lkotlin/ParameterName;", "name", "scene", "p2", "Landroid/content/Context;", "context", "p3", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "err", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.b$b */
    static final /* synthetic */ class C36262b extends FunctionReference implements Function3<CreateGroupScene, Context, ErrorResult, Boolean> {
        C36262b(CreateGroupErrorHandlers bVar) {
            super(3, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "interceptGroupMemberLimitManage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CreateGroupErrorHandlers.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "interceptGroupMemberLimitManage(Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;Landroid/content/Context;Lcom/larksuite/framework/callback/Entity/ErrorResult;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            return Boolean.valueOf(invoke(createGroupScene, context, errorResult));
        }

        public final boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(createGroupScene, "p1");
            Intrinsics.checkParameterIsNotNull(context, "p2");
            Intrinsics.checkParameterIsNotNull(errorResult, "p3");
            return ((CreateGroupErrorHandlers) this.receiver).mo133810d(createGroupScene, context, errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "Lkotlin/ParameterName;", "name", "scene", "p2", "Landroid/content/Context;", "context", "p3", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "err", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.b$c */
    static final /* synthetic */ class C36263c extends FunctionReference implements Function3<CreateGroupScene, Context, ErrorResult, Boolean> {
        C36263c(CreateGroupErrorHandlers bVar) {
            super(3, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "interceptBilling";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CreateGroupErrorHandlers.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "interceptBilling(Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;Landroid/content/Context;Lcom/larksuite/framework/callback/Entity/ErrorResult;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            return Boolean.valueOf(invoke(createGroupScene, context, errorResult));
        }

        public final boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(createGroupScene, "p1");
            Intrinsics.checkParameterIsNotNull(context, "p2");
            Intrinsics.checkParameterIsNotNull(errorResult, "p3");
            return ((CreateGroupErrorHandlers) this.receiver).mo133809c(createGroupScene, context, errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;", "Lkotlin/ParameterName;", "name", "scene", "p2", "Landroid/content/Context;", "context", "p3", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "err", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.a.b$d */
    static final /* synthetic */ class C36264d extends FunctionReference implements Function3<CreateGroupScene, Context, ErrorResult, Boolean> {
        C36264d(CreateGroupErrorHandlers bVar) {
            super(3, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "defaultErrorInterceptor";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CreateGroupErrorHandlers.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "defaultErrorInterceptor(Lcom/ss/android/lark/create/groupchat/dto/CreateGroupScene;Landroid/content/Context;Lcom/larksuite/framework/callback/Entity/ErrorResult;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            return Boolean.valueOf(invoke(createGroupScene, context, errorResult));
        }

        public final boolean invoke(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(createGroupScene, "p1");
            Intrinsics.checkParameterIsNotNull(context, "p2");
            Intrinsics.checkParameterIsNotNull(errorResult, "p3");
            return ((CreateGroupErrorHandlers) this.receiver).mo133808b(createGroupScene, context, errorResult);
        }
    }

    /* renamed from: a */
    public final boolean mo133807a(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
        CreateGroupHitPointNew.f93887a.mo134200b(mo133804a(createGroupScene));
        return false;
    }

    /* renamed from: b */
    public final boolean mo133808b(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
        LKUIToast.show(context, errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_P2pChatSettingCreategroupFail)));
        return true;
    }

    /* renamed from: c */
    public final boolean mo133809c(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
        if (!BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
            return false;
        }
        BillingTipsDialog.m226151a(context, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_CREATE_GROUP_NUMBER_LIMIT);
        return true;
    }

    /* renamed from: d */
    public final boolean mo133810d(CreateGroupScene createGroupScene, Context context, ErrorResult errorResult) {
        if (errorResult.getErrorCode() != 4013) {
            return false;
        }
        String displayMsg = errorResult.getDisplayMsg(context.getString(R.string.Lark_Legacy_ErrorMessageTip));
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "displayMsg");
        mo133806a(context, displayMsg, createGroupScene);
        return true;
    }

    /* renamed from: a */
    public final void mo133806a(Context context, String str, CreateGroupScene createGroupScene) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "displayMsg");
        Intrinsics.checkParameterIsNotNull(createGroupScene, "scene");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Lark_GroupLimit_GroupSizeExceedLimit_PopupTitle)).titleBold(true)).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_GroupLimit_GroupSizeExceedLimit_OKButton, new DialogInterface$OnClickListenerC36265e(createGroupScene))).show();
    }
}
