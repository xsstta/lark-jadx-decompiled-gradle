package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0003J\b\u0010\u000f\u001a\u00020\u000bH\u0003J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u000bH\u0003J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/ChatTabFgUtil;", "", "()V", "featureGatingDependency", "Lcom/ss/android/lark/dependency/IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "getFeatureGatingDependency", "()Lcom/ss/android/lark/dependency/IFeatureGatingDependency;", "featureGatingDependency$delegate", "Lkotlin/Lazy;", "isAddDocTabEnable", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isAddDocTabFgEnable", "isChatTabFgEnable", "isSingleDocTabEnable", "isSingleDocTabFgEnable", "isTFeature", "isTabFgEnable", "isSecretChat", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.a */
public final class ChatTabFgUtil {

    /* renamed from: a */
    public static final ChatTabFgUtil f86815a = new ChatTabFgUtil();

    /* renamed from: b */
    private static final Lazy f86816b = LazyKt.lazy(C33697a.INSTANCE);

    /* renamed from: a */
    private final AbstractC36503q m130691a() {
        return (AbstractC36503q) f86816b.getValue();
    }

    private ChatTabFgUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.a$a */
    static final class C33697a extends Lambda implements Function0<AbstractC36503q> {
        public static final C33697a INSTANCE = new C33697a();

        C33697a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36503q invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134586n();
        }
    }

    @JvmStatic
    /* renamed from: b */
    private static final boolean m130692b() {
        if (f86815a.m130691a().mo134685a("im.chat.titlebar.tabs.202105")) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!DesktopUtil.m144301a(b.mo134528a())) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: c */
    private static final boolean m130693c() {
        if (f86815a.m130691a().mo134685a("im.chat.titlebar.add.doc.202105")) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!DesktopUtil.m144301a(b.mo134528a())) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    private static final boolean m130694d() {
        if (f86815a.m130691a().mo134685a("im.chat.titlebar.single.doc.202105")) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!DesktopUtil.m144301a(b.mo134528a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m130695d(Chat chat) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.an().mo134467a() || !chat.isTeam()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo123638a(boolean z) {
        if (!m130692b() || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo123637a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!m130692b() || chat.isSecret() || chat.isOnCall() || !m130695d(chat)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo123639b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!mo123638a(chat.isSecret()) || chat.isOnCall() || !m130693c() || !m130695d(chat)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo123640c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!mo123638a(chat.isSecret()) || chat.isOnCall() || !m130694d() || !m130695d(chat)) {
            return false;
        }
        return true;
    }
}
