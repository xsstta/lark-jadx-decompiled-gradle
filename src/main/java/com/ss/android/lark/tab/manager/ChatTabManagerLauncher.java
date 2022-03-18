package com.ss.android.lark.tab.manager;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.aj;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.tab.manager.dialog.TabOrderManagerDialogBuilder;
import com.ss.android.lark.tab.manager.dialog.TabOrderManagerDialogController;
import com.ss.android.lark.tab.manager.dialog.TabOrderManagerView;
import com.ss.android.lark.tab.manager.entity.ChatTabOrderData;
import com.ss.android.lark.tab.manager.utils.IconProvider;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/tab/manager/ChatTabManagerLauncher;", "", "()V", "showChatTabManagerDialog", "", "context", "Landroidx/fragment/app/FragmentActivity;", "chatId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.a */
public final class ChatTabManagerLauncher {

    /* renamed from: a */
    public static final ChatTabManagerLauncher f136356a = new ChatTabManagerLauncher();

    private ChatTabManagerLauncher() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/ss/android/lark/tab/manager/ChatTabManagerLauncher$showChatTabManagerDialog$viewModelProvider$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.a$c */
    public static final class C55258c implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        final /* synthetic */ String f136366a;

        C55258c(String str) {
            this.f136366a = str;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            return new ChatTabOrderManagerViewModel(this.f136366a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.a$a */
    public static final class C55253a<T> implements AbstractC1178x<List<? extends ChatTab>> {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f136357a;

        /* renamed from: b */
        final /* synthetic */ UDDialog f136358b;

        /* renamed from: c */
        final /* synthetic */ TabOrderManagerView f136359c;

        C55253a(FragmentActivity fragmentActivity, UDDialog uDDialog, TabOrderManagerView tabOrderManagerView) {
            this.f136357a = fragmentActivity;
            this.f136358b = uDDialog;
            this.f136359c = tabOrderManagerView;
        }

        /* renamed from: a */
        public final void onChanged(final List<ChatTab> list) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new Runnable(this) {
                /* class com.ss.android.lark.tab.manager.ChatTabManagerLauncher.C55253a.RunnableC552541 */

                /* renamed from: a */
                final /* synthetic */ C55253a f136360a;

                {
                    this.f136360a = r1;
                }

                public final void run() {
                    C55255a aVar = new C55255a(this);
                    if (this.f136360a.f136358b.isShowing()) {
                        TabOrderManagerView tabOrderManagerView = this.f136360a.f136359c;
                        List list = list;
                        Intrinsics.checkExpressionValueIsNotNull(list, "it");
                        List<T> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (T t : list2) {
                            arrayList.add(aVar.invoke((Object) t));
                        }
                        tabOrderManagerView.mo188315a(CollectionsKt.toMutableList((Collection) arrayList));
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/manager/entity/ChatTabOrderData;", "chatTab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.tab.manager.a$a$1$a */
                static final class C55255a extends Lambda implements Function1<ChatTab, ChatTabOrderData> {
                    final /* synthetic */ RunnableC552541 this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C55255a(RunnableC552541 r1) {
                        super(1);
                        this.this$0 = r1;
                    }

                    public final ChatTabOrderData invoke(ChatTab chatTab) {
                        boolean z;
                        boolean z2;
                        Intrinsics.checkParameterIsNotNull(chatTab, "chatTab");
                        long serverId = chatTab.getServerId();
                        String name = chatTab.getName();
                        Drawable a = IconProvider.m214316a(this.this$0.f136360a.f136357a, chatTab);
                        boolean z3 = true;
                        if (chatTab.getType() == ChatTab.ChatTabType.MESSAGE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (chatTab.getType() == ChatTab.ChatTabType.MESSAGE || chatTab.getType() == ChatTab.ChatTabType.DOC_SPACE) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (list.indexOf(chatTab) != list.size() - 1) {
                            z3 = false;
                        }
                        return new ChatTabOrderData(serverId, name, a, z, z2, z3, chatTab.getId());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.a$b */
    public static final class C55256b<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ UDDialog f136362a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f136363b;

        C55256b(UDDialog uDDialog, FragmentActivity fragmentActivity) {
            this.f136362a = uDDialog;
            this.f136363b = fragmentActivity;
        }

        /* renamed from: a */
        public final void onChanged(final ErrorResult errorResult) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new Runnable(this) {
                /* class com.ss.android.lark.tab.manager.ChatTabManagerLauncher.C55256b.RunnableC552571 */

                /* renamed from: a */
                final /* synthetic */ C55256b f136364a;

                {
                    this.f136364a = r1;
                }

                public final void run() {
                    if (this.f136364a.f136362a.isShowing()) {
                        ErrorResult errorResult = errorResult;
                        Intrinsics.checkExpressionValueIsNotNull(errorResult, "it");
                        String displayMsg = errorResult.getDisplayMsg();
                        if (displayMsg != null) {
                            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "this");
                            UDToast.show(this.f136364a.f136363b, displayMsg);
                        }
                    }
                }
            });
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m214313a(FragmentActivity fragmentActivity, String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        if (fragmentActivity != null) {
            C1144ai a = aj.m5367a(fragmentActivity, new C55258c(str));
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(co…\n            }\n        })");
            AbstractC1142af a2 = a.mo6005a(ChatTabOrderManagerViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a2, "viewModelProvider.get(Ch…gerViewModel::class.java)");
            ChatTabOrderManagerViewModel bVar = (ChatTabOrderManagerViewModel) a2;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            TabOrderManagerView tabOrderManagerView = new TabOrderManagerView(fragmentActivity2, null, 0, 6, null);
            UDDialog build = ((TabOrderManagerDialogBuilder) ((TabOrderManagerDialogBuilder) new TabOrderManagerDialogBuilder(fragmentActivity2).rootLayout(tabOrderManagerView)).controller(new TabOrderManagerDialogController(fragmentActivity2))).mo188334a(bVar).build();
            build.show();
            ChatTabHitPoint.f136619a.mo188726c();
            FragmentActivity fragmentActivity3 = fragmentActivity;
            bVar.getChatTabListLiveData().mo5923a(fragmentActivity3, new C55253a(fragmentActivity, build, tabOrderManagerView));
            bVar.getErrorResultLiveData().mo5923a(fragmentActivity3, new C55256b(build, fragmentActivity));
        }
    }
}
