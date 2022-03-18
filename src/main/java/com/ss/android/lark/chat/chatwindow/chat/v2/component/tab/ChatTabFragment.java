package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.InputModeLifecycleHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188VX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabLazyLoadFragment;", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "contentShowCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "getContentShowCallback", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "setContentShowCallback", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;)V", "dependency", "getDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "setDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;)V", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "inputModeLifecycleHelper", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "getInputModeLifecycleHelper", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "inputModeLifecycleHelper$delegate", "Lkotlin/Lazy;", "onPageSelect", "", "onPageUnSelect", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b */
public abstract class ChatTabFragment<T extends CommonTabDependency> extends TabLazyLoadFragment {

    /* renamed from: b */
    private IChatTabPageSpec.ContentViewCreatedCallback f86765b;

    /* renamed from: c */
    private T f86766c;

    /* renamed from: d */
    private String f86767d;

    /* renamed from: e */
    private final Lazy f86768e = LazyKt.lazy(new C33686a(this));

    /* renamed from: f */
    private HashMap f86769f;

    /* renamed from: c */
    public InputModeLifecycleHelper mo123606c() {
        return (InputModeLifecycleHelper) this.f86768e.getValue();
    }

    /* renamed from: e */
    public void mo123608e() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: f */
    public void mo123585f() {
        HashMap hashMap = this.f86769f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo123585f();
    }

    /* renamed from: a */
    public final IChatTabPageSpec.ContentViewCreatedCallback mo123601a() {
        return this.f86765b;
    }

    /* renamed from: b */
    public final T mo123605b() {
        return this.f86766c;
    }

    /* renamed from: d */
    public void mo123607d() {
        mo123606c().setNewSoftInputMode();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b$a */
    static final class C33686a extends Lambda implements Function0<InputModeLifecycleHelper> {
        final /* synthetic */ ChatTabFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33686a(ChatTabFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputModeLifecycleHelper invoke() {
            Window window;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            return new InputModeLifecycleHelper(window, null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo123602a(T t) {
        this.f86766c = t;
    }

    /* renamed from: a */
    public final void mo123603a(IChatTabPageSpec.ContentViewCreatedCallback aVar) {
        this.f86765b = aVar;
    }

    /* renamed from: a */
    public final void mo123604a(String str) {
        this.f86767d = str;
    }
}
