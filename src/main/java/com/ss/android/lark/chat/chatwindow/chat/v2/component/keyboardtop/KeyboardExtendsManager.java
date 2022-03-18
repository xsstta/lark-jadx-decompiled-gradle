package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\rH\u0002J\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0019J\u0016\u0010'\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\r2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\nH\u0002J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\rJ\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\fX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/widget/FrameLayout;", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "getContext", "()Landroid/content/Context;", "currentTask", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$ShowExtendTask;", "holdingView", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "getListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "setListener", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;)V", "priorities", "", "registeredExtends", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtend;", "getRootView", "()Landroid/widget/FrameLayout;", "waitingTasks", "callWaitingTask", "", "getCurrentExtend", "hideExtend", ShareHitPoint.f121869d, "hideExtendImpl", "isExtendShowing", "", "registerExtend", "extend", "showExtend", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "showExtendImpl", "task", "unRegisterExtend", "updateExtendImpl", "Companion", "OnExtendStatusChangeListener", "ShowExtendTask", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f */
public final class KeyboardExtendsManager {

    /* renamed from: b */
    public static final Companion f86454b = new Companion(null);

    /* renamed from: a */
    public final Map<ExtendType, Integer> f86455a;

    /* renamed from: c */
    private final Map<ExtendType, IKeyboardTopExtend> f86456c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<ExtendType, ShowExtendTask> f86457d = new LinkedHashMap();

    /* renamed from: e */
    private final Map<ExtendType, WeakReference<View>> f86458e = new ConcurrentHashMap();

    /* renamed from: f */
    private OnExtendStatusChangeListener f86459f;

    /* renamed from: g */
    private ShowExtendTask f86460g;

    /* renamed from: h */
    private final Context f86461h;

    /* renamed from: i */
    private final FrameLayout f86462i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "", "onExtendHide", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "onExtendShow", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f$b */
    public interface OnExtendStatusChangeListener {
        /* renamed from: a */
        void mo123160a(ExtendType extendType);

        /* renamed from: b */
        void mo123161b(ExtendType extendType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$ShowExtendTask;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "taskId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;Ljava/lang/String;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;)V", "getData", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "getTaskId", "()Ljava/lang/String;", "getType", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f$c */
    public static final class ShowExtendTask {

        /* renamed from: a */
        public static final Companion f86463a = new Companion(null);

        /* renamed from: b */
        private final ExtendType f86464b;

        /* renamed from: c */
        private final String f86465c;

        /* renamed from: d */
        private final IKeyboardExtendData f86466d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowExtendTask)) {
                return false;
            }
            ShowExtendTask cVar = (ShowExtendTask) obj;
            return Intrinsics.areEqual(this.f86464b, cVar.f86464b) && Intrinsics.areEqual(this.f86465c, cVar.f86465c) && Intrinsics.areEqual(this.f86466d, cVar.f86466d);
        }

        public int hashCode() {
            ExtendType extendType = this.f86464b;
            int i = 0;
            int hashCode = (extendType != null ? extendType.hashCode() : 0) * 31;
            String str = this.f86465c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            IKeyboardExtendData aVar = this.f86466d;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ShowExtendTask(type=" + this.f86464b + ", taskId=" + this.f86465c + ", data=" + this.f86466d + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$ShowExtendTask$Companion;", "", "()V", "create", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$ShowExtendTask;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final ShowExtendTask mo123300a(ExtendType extendType, IKeyboardExtendData aVar) {
                Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
                Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String a = C53234a.m205877a();
                Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
                return new ShowExtendTask(extendType, a, aVar);
            }
        }

        /* renamed from: a */
        public final ExtendType mo123295a() {
            return this.f86464b;
        }

        /* renamed from: b */
        public final IKeyboardExtendData mo123296b() {
            return this.f86466d;
        }

        public ShowExtendTask(ExtendType extendType, String str, IKeyboardExtendData aVar) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str, "taskId");
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f86464b = extendType;
            this.f86465c = str;
            this.f86466d = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo123294b() {
        IKeyboardTopExtend a = mo123289a();
        if (a != null) {
            return a.mo123287c();
        }
        return false;
    }

    /* renamed from: a */
    public final IKeyboardTopExtend mo123289a() {
        ShowExtendTask cVar = this.f86460g;
        if (cVar == null) {
            return null;
        }
        return this.f86456c.get(cVar.mo123295a());
    }

    /* renamed from: c */
    private final void m130047c() {
        WeakReference<View> weakReference;
        View view;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : MapsKt.toSortedMap(this.f86456c, new C33554d(this)).entrySet()) {
            if (!((IKeyboardTopExtend) entry.getValue()).mo123286b() || !this.f86457d.containsKey(entry.getKey())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List mutableList = CollectionsKt.toMutableList(linkedHashMap.values());
        if (!CollectionUtils.isEmpty(mutableList)) {
            IKeyboardTopExtend dVar = (IKeyboardTopExtend) CollectionsKt.first(mutableList);
            if (dVar.mo123287c()) {
                FrameLayout frameLayout = this.f86462i;
                if (!(frameLayout == null || (weakReference = this.f86458e.get(dVar.mo123282a())) == null || (view = weakReference.get()) == null)) {
                    frameLayout.removeAllViews();
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    }
                    frameLayout.addView(view, view.getLayoutParams());
                }
                this.f86460g = this.f86457d.get(dVar.mo123282a());
                this.f86457d.remove(dVar.mo123282a());
                this.f86458e.remove(dVar.mo123282a());
                OnExtendStatusChangeListener bVar = this.f86459f;
                if (bVar != null) {
                    bVar.mo123160a(dVar.mo123282a());
                    return;
                }
                return;
            }
            ShowExtendTask cVar = this.f86457d.get(dVar.mo123282a());
            if (cVar != null) {
                m130044a(cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo123293a(OnExtendStatusChangeListener bVar) {
        this.f86459f = bVar;
    }

    /* renamed from: a */
    public final void mo123292a(IKeyboardTopExtend dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "extend");
        this.f86456c.put(dVar.mo123282a(), dVar);
    }

    /* renamed from: b */
    private final void m130046b(ShowExtendTask cVar) {
        IKeyboardTopExtend dVar = this.f86456c.get(cVar.mo123295a());
        if (dVar != null && dVar.mo123286b()) {
            dVar.mo123283a(cVar.mo123296b());
            this.f86460g = cVar;
        }
        Log.m165389i("KeyboardExtendsManager", "info: extend type : " + this.f86460g + ".type updated");
    }

    /* renamed from: b */
    private final void m130045b(ExtendType extendType) {
        IKeyboardExtendListener d;
        IKeyboardTopExtend dVar = this.f86456c.get(extendType);
        if (dVar == null || dVar.mo123286b()) {
            FrameLayout frameLayout = this.f86462i;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                Log.m165389i("KeyboardExtendsManager", "info: extend type: " + extendType.getDesc() + " hide success");
                if (dVar != null) {
                    dVar.mo123284a(false);
                }
                if (!(dVar == null || (d = dVar.mo123288d()) == null)) {
                    d.mo123280b();
                }
                this.f86458e.remove(extendType);
                this.f86457d.remove(extendType);
                this.f86460g = null;
                OnExtendStatusChangeListener bVar = this.f86459f;
                if (bVar != null) {
                    bVar.mo123161b(extendType);
                }
            }
            m130047c();
            return;
        }
        Log.m165389i("KeyboardExtendsManager", "info: extend type : " + extendType.getDesc() + " is not enable, hide fail");
    }

    /* renamed from: a */
    public final void mo123290a(ExtendType extendType) {
        ExtendType extendType2;
        Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
        if (!this.f86456c.containsKey(extendType)) {
            Log.m165383e("KeyboardExtendsManager", "fatal: extend type: " + extendType.getDesc() + " not registered!");
            return;
        }
        ShowExtendTask cVar = this.f86460g;
        if (cVar != null) {
            extendType2 = cVar.mo123295a();
        } else {
            extendType2 = null;
        }
        if (extendType == extendType2) {
            m130045b(extendType);
            return;
        }
        this.f86458e.remove(extendType);
        this.f86457d.remove(extendType);
        Log.m165389i("KeyboardExtendsManager", "info: extend type: " + extendType.getDesc() + " cancel success");
    }

    /* renamed from: a */
    private final void m130044a(ShowExtendTask cVar) {
        View view;
        ExtendType a;
        IKeyboardExtendListener d;
        IKeyboardExtendListener d2;
        String str;
        ExtendType a2;
        IKeyboardTopExtend dVar = this.f86456c.get(cVar.mo123295a());
        if (dVar == null || dVar.mo123286b()) {
            IKeyboardTopExtend a3 = mo123289a();
            if (a3 == null || a3.mo123285a(cVar.mo123295a())) {
                FrameLayout frameLayout = this.f86462i;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    if (dVar == null || (view = dVar.mo123281a(this.f86461h, cVar.mo123296b())) == null) {
                        view = null;
                    } else {
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        }
                        frameLayout.addView(view, view.getLayoutParams());
                    }
                    if (dVar != null) {
                        dVar.mo123284a(true);
                    }
                    this.f86458e.put(cVar.mo123295a(), new WeakReference<>(view));
                    Log.m165389i("KeyboardExtendsManager", "info: extend type: " + cVar.mo123295a().getDesc() + " show success");
                    if (!(dVar == null || (d2 = dVar.mo123288d()) == null)) {
                        d2.mo123278a();
                    }
                    ShowExtendTask cVar2 = this.f86460g;
                    if (!(cVar2 == null || (a = cVar2.mo123295a()) == null)) {
                        Map<ExtendType, ShowExtendTask> map = this.f86457d;
                        ShowExtendTask cVar3 = this.f86460g;
                        if (cVar3 == null) {
                            Intrinsics.throwNpe();
                        }
                        map.put(a, cVar3);
                        IKeyboardTopExtend dVar2 = this.f86456c.get(a);
                        if (!(dVar2 == null || (d = dVar2.mo123288d()) == null)) {
                            d.mo123279a(cVar.mo123295a());
                        }
                    }
                    OnExtendStatusChangeListener bVar = this.f86459f;
                    if (bVar != null) {
                        bVar.mo123160a(cVar.mo123295a());
                    }
                }
                this.f86460g = cVar;
                this.f86457d.remove(cVar.mo123295a());
                return;
            }
            this.f86457d.put(cVar.mo123295a(), cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("info: extend type: ");
            sb.append(cVar.mo123295a());
            sb.append(" is intercepted by ");
            ShowExtendTask cVar4 = this.f86460g;
            if (cVar4 == null || (a2 = cVar4.mo123295a()) == null || (str = a2.getDesc()) == null) {
                str = "Unknown";
            }
            sb.append(str);
            sb.append(", show fail");
            Log.m165389i("KeyboardExtendsManager", sb.toString());
            return;
        }
        Log.m165389i("KeyboardExtendsManager", "info: extend type : " + cVar.mo123295a().getDesc() + " is not enable, show fail");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "type1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "kotlin.jvm.PlatformType", "type2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.f$d */
    public static final class C33554d<T> implements Comparator<ExtendType> {

        /* renamed from: a */
        final /* synthetic */ KeyboardExtendsManager f86467a;

        C33554d(KeyboardExtendsManager fVar) {
            this.f86467a = fVar;
        }

        /* renamed from: a */
        public final int compare(ExtendType extendType, ExtendType extendType2) {
            int i;
            int i2;
            Integer num = this.f86467a.f86455a.get(extendType);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Integer num2 = this.f86467a.f86455a.get(extendType2);
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            int i3 = i - i2;
            if (i3 > 0) {
                return 1;
            }
            if (i3 < 0) {
                return -1;
            }
            return 0;
        }
    }

    public KeyboardExtendsManager(Context context, FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f86461h = context;
        this.f86462i = frameLayout;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f86455a = concurrentHashMap;
        concurrentHashMap.put(ExtendType.ON_CALL, 16);
        concurrentHashMap.put(ExtendType.UNKNOWN, 0);
    }

    /* renamed from: a */
    public final void mo123291a(ExtendType extendType, IKeyboardExtendData aVar) {
        ExtendType extendType2;
        Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!this.f86456c.containsKey(extendType)) {
            Log.m165383e("KeyboardExtendsManager", "fatal: extend type: " + extendType.getDesc() + " not registered!");
            return;
        }
        ShowExtendTask a = ShowExtendTask.f86463a.mo123300a(extendType, aVar);
        ShowExtendTask cVar = this.f86460g;
        if (cVar != null) {
            extendType2 = cVar.mo123295a();
        } else {
            extendType2 = null;
        }
        if (extendType == extendType2) {
            m130046b(a);
        } else {
            m130044a(a);
        }
    }
}
