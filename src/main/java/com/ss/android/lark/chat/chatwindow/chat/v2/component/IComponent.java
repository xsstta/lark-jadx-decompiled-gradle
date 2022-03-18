package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000fJ\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "Landroidx/lifecycle/LifecycleOwner;", "callbacks", "", "getCallbacks", "()Ljava/util/List;", "handleBack", "", "registerCallback", "", "callback", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;)V", "unRegisterCallback", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.f */
public interface IComponent<T extends IComponentCallbacks> extends LifecycleOwner {

    /* renamed from: f */
    public static final Companion f86342f = Companion.f86343a;

    /* renamed from: a */
    List<T> mo121968a();

    /* renamed from: a */
    void mo121971a(T t);

    /* renamed from: h */
    boolean mo121990h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.f$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f86343a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.f$b */
    public static final class C33505b {
        /* renamed from: a */
        public static <T extends IComponentCallbacks> boolean m129843a(IComponent<T> fVar) {
            return false;
        }

        /* renamed from: b */
        private static <T extends IComponentCallbacks> List<T> m129844b(IComponent<T> fVar) {
            return fVar.mo121968a();
        }

        /* renamed from: a */
        public static <T extends IComponentCallbacks> void m129842a(IComponent<T> fVar, T t) {
            Intrinsics.checkParameterIsNotNull(t, "callback");
            m129844b(fVar).add(t);
        }
    }
}
