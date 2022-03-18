package com.ss.android.lark.chat.preview.actions;

import android.view.View;
import com.larksuite.component.universe_design.button.UDButton;
import com.ss.android.lark.chat.entity.preview.Parameters;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewAction;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\b\b\u0000\u0010\r*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/preview/actions/ActionCreator;", "", "()V", "TAG", "", "sChatPreviewDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "getSChatPreviewDependency", "()Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "sChatPreviewDependency$delegate", "Lkotlin/Lazy;", "createAction", "Lcom/ss/android/lark/tangram/base/action/Action;", "T", "Landroid/view/View;", "actionId", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "previewAction", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "onActionTriggered", "", "action", "view", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.a.a */
public final class ActionCreator {

    /* renamed from: a */
    public static final ActionCreator f88088a = new ActionCreator();

    /* renamed from: b */
    private static final Lazy f88089b = LazyKt.lazy(C34078b.INSTANCE);

    /* renamed from: a */
    private final ChatPreviewInit.IChatPreviewModuleDependency m132243a() {
        return (ChatPreviewInit.IChatPreviewModuleDependency) f88089b.getValue();
    }

    private ActionCreator() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.a.a$b */
    static final class C34078b extends Lambda implements Function0<ChatPreviewInit.IChatPreviewModuleDependency> {
        public static final C34078b INSTANCE = new C34078b();

        C34078b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatPreviewInit.IChatPreviewModuleDependency invoke() {
            return ChatPreviewInit.f88086a.mo126246a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/preview/actions/ActionCreator$createAction$1", "Lcom/ss/android/lark/tangram/base/action/Action;", "onClick", "", "view", "(Landroid/view/View;)V", "onLongClick", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.a.a$a */
    public static final class C34077a implements Action<T> {

        /* renamed from: a */
        final /* synthetic */ UrlPreviewAction f88090a;

        /* renamed from: b */
        final /* synthetic */ String f88091b;

        /* renamed from: c */
        final /* synthetic */ View.OnLongClickListener f88092c;

        @Override // com.ss.android.lark.tangram.base.action.Action
        /* renamed from: a */
        public void mo126248a(T t) {
            if (this.f88090a != null) {
                ActionCreator.f88088a.mo126247a(this.f88091b, this.f88090a, t);
            }
        }

        C34077a(UrlPreviewAction urlPreviewAction, String str, View.OnLongClickListener onLongClickListener) {
            this.f88090a = urlPreviewAction;
            this.f88091b = str;
            this.f88092c = onLongClickListener;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T extends View> Action<T> m132244a(UrlPreviewAction urlPreviewAction, String str, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkParameterIsNotNull(str, "previewAction");
        return new C34077a(urlPreviewAction, str, onLongClickListener);
    }

    /* renamed from: a */
    public final void mo126247a(String str, UrlPreviewAction urlPreviewAction, View view) {
        String str2;
        ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b;
        ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b2;
        String str3;
        String str4;
        ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b3;
        ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b4;
        ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency b5;
        int i = C34079b.f88093a[urlPreviewAction.getMethod().ordinal()];
        String str5 = "button";
        boolean z = true;
        String str6 = null;
        if (i == 1) {
            Url openUrl = urlPreviewAction.getOpenUrl();
            if (openUrl != null) {
                str2 = openUrl.getAndroidUrl();
            } else {
                str2 = null;
            }
            String str7 = str2;
            if (!(str7 == null || str7.length() == 0)) {
                z = false;
            }
            if (z) {
                Url openUrl2 = urlPreviewAction.getOpenUrl();
                if (openUrl2 != null) {
                    str4 = openUrl2.getUrl();
                } else {
                    str4 = null;
                }
                ChatPreviewInit.IChatPreviewModuleDependency a = m132243a();
                if (!(a == null || (b3 = a.mo102702b()) == null)) {
                    b3.mo102704a(str4);
                }
            } else {
                ChatPreviewInit.IChatPreviewModuleDependency a2 = m132243a();
                if (!(a2 == null || (b2 = a2.mo102702b()) == null)) {
                    Url openUrl3 = urlPreviewAction.getOpenUrl();
                    if (openUrl3 != null) {
                        str3 = openUrl3.getAndroidUrl();
                    } else {
                        str3 = null;
                    }
                    b2.mo102704a(str3);
                }
            }
            ChatPreviewInit.IChatPreviewModuleDependency a3 = m132243a();
            if (a3 != null && (b = a3.mo102702b()) != null) {
                String url = urlPreviewAction.getUrl();
                Parameters parameters = urlPreviewAction.getParameters();
                if (parameters != null) {
                    str6 = parameters.getPreviewId();
                }
                if (!(view instanceof UDButton)) {
                    str5 = "page_click";
                }
                b.mo102705a(url, str6, str5);
            }
        } else if (i != 2) {
            Log.m165389i("ActionCreator", "action method:" + urlPreviewAction.getMethod());
        } else {
            Parameters parameters2 = urlPreviewAction.getParameters();
            ChatPreviewInit.IChatPreviewModuleDependency a4 = m132243a();
            if (!(a4 == null || (b5 = a4.mo102702b()) == null)) {
                b5.mo102703a(parameters2, str);
            }
            ChatPreviewInit.IChatPreviewModuleDependency a5 = m132243a();
            if (a5 != null && (b4 = a5.mo102702b()) != null) {
                String url2 = urlPreviewAction.getUrl();
                Parameters parameters3 = urlPreviewAction.getParameters();
                if (parameters3 != null) {
                    str6 = parameters3.getPreviewId();
                }
                if (!(view instanceof UDButton)) {
                    str5 = "page_click";
                }
                b4.mo102705a(url2, str6, str5);
            }
        }
    }
}
