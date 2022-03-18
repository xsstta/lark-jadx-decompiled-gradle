package com.ss.android.lark.chatwindow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.abtest.ExperimentConfig;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.desktopmode.p1788b.p1792d.C36548b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.navigation.Navigation;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatwindow/ChatWindowManager;", "", "()V", "mFragmentManager", "Lcom/ss/android/lark/desktopmode/frame/fragment/IFragmentManager;", "mIsEnableFragment", "", "init", "", "dependency", "Lcom/ss/android/lark/desktopmode/frame/fragment/IFragmentManager$IFragmentManagerDependency;", "showActivity", "navigation", "Lcom/ss/android/lark/utils/navigation/Navigation;", "intent", "Landroid/content/Intent;", "transition", "", "showFragment", "showWindow", "unInit", "Companion", "HOLDER", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.d */
public final class ChatWindowManager {

    /* renamed from: a */
    public static final Companion f90998a = new Companion(null);

    /* renamed from: b */
    private boolean f90999b;

    /* renamed from: c */
    private AbstractC36551c f91000c;

    @JvmStatic
    /* renamed from: b */
    public static final ChatWindowManager m137600b() {
        return f90998a.mo129698a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatwindow/ChatWindowManager$Companion;", "", "()V", "CHAT_PAGE_ID", "", "FRAGMENT_TAG", "", "KEY_OPEN_PAGE_ID", "TAG", "instance", "Lcom/ss/android/lark/chatwindow/ChatWindowManager;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.d$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatWindowManager mo129698a() {
            return HOLDER.f91001a.mo129699a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatwindow/ChatWindowManager$HOLDER;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/chatwindow/ChatWindowManager;", "getINSTANCE", "()Lcom/ss/android/lark/chatwindow/ChatWindowManager;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.d$b */
    public static final class HOLDER {

        /* renamed from: a */
        public static final HOLDER f91001a = new HOLDER();

        /* renamed from: b */
        private static final ChatWindowManager f91002b = new ChatWindowManager();

        private HOLDER() {
        }

        /* renamed from: a */
        public final ChatWindowManager mo129699a() {
            return f91002b;
        }
    }

    /* renamed from: a */
    public final void mo129695a() {
        AbstractC36551c cVar = this.f91000c;
        if (cVar != null) {
            cVar.mo134893a();
        }
        this.f91000c = null;
    }

    /* renamed from: a */
    public final void mo129696a(AbstractC36551c.AbstractC36552a aVar) {
        boolean z;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.mo134586n().mo134685a("lark.show.chat.in.fragment") || !ExperimentConfig.f71633b.mo101366d()) {
            z = false;
        } else {
            z = true;
        }
        this.f90999b = z;
        C36548b bVar = new C36548b();
        this.f91000c = bVar;
        if (bVar != null) {
            bVar.mo134894a(aVar);
        }
    }

    /* renamed from: a */
    private final void m137599a(Navigation navigation, Intent intent) {
        intent.setClassName(navigation.getContext(), "com.ss.android.lark.main.app.MainActivity");
        intent.putExtra("open_fragment_id", 4098);
        intent.addFlags(268435456);
        navigation.getContext().startActivity(intent);
    }

    /* renamed from: b */
    private final void m137601b(Navigation navigation, Intent intent, int i) {
        int i2;
        if (navigation.getContext() instanceof Activity) {
            int i3 = 0;
            if (i == 1) {
                i2 = R.anim.chat_activity_fade_in;
            } else if (i == 2) {
                i2 = R.anim.slide_right_in;
            } else {
                i2 = -1;
                i3 = -1;
            }
            navigation.openActivity(intent);
            if (i2 != -1 || i3 != -1) {
                Context context = navigation.getContext();
                if (context != null) {
                    ((Activity) context).overridePendingTransition(i2, i3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            return;
        }
        intent.addFlags(268435456);
        navigation.openActivity(intent);
    }

    /* renamed from: a */
    public final void mo129697a(Navigation navigation, Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(navigation, "navigation");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        boolean booleanExtra = intent.getBooleanExtra("show_single_page", false);
        if (!this.f90999b || booleanExtra) {
            Log.m165389i("ChatWindowManager", "showWindow in activity:" + this.f90999b + '/' + booleanExtra);
            m137601b(navigation, intent, i);
            return;
        }
        Log.m165389i("ChatWindowManager", "showWindow in fragment");
        intent.putExtra("switch_fragment_with_anim", false);
        intent.putExtra("fragment_hide_pre_page", false);
        m137599a(navigation, intent);
    }
}
