package com.ss.android.lark.meego.wrapper;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.meego.wrapper.common.FeatureGatingConfig;
import com.ss.android.lark.meego.wrapper.debug.C44864a;
import com.ss.android.lark.meego.wrapper.debug.MeegoDebugPage;
import com.ss.android.lark.meego.wrapper.dependency.IMeegoModuleDependency;
import com.ss.android.lark.meego.wrapper.impl.handler.OpenMeegoAppLinkHandler;
import com.ss.android.lark.meego.wrapper.p2246a.C44859a;
import com.ss.android.lark.meego.wrapper.p2249d.C44863a;
import com.ss.android.lark.meego.wrapper.p2251f.C44869a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\fJ\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/MeegoModule;", "", "()V", "createProject", "", "from", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "messageJson", "Lorg/json/JSONArray;", "getAppLinkHandlers", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "context", "Landroid/content/Context;", "getFeatureGatingMap", "", "getProjectKbPlusItem", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "initData", "isMeegoEnable", "openDebugPage", "openMeegoActivity", "route", "params", "Ljava/util/HashMap;", "setDevEnv", "ttFeatureEnv", "rpcPersistDyecpFd", "Companion", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.a */
public final class MeegoModule {

    /* renamed from: a */
    public static final Companion f113628a = new Companion(null);

    @JvmStatic
    /* renamed from: d */
    public static final IMeegoModuleDependency m177824d() {
        return f113628a.mo158735a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/MeegoModule$Companion;", "", "()V", "getDependency", "Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency;", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IMeegoModuleDependency mo158735a() {
            Object api = ApiUtils.getApi(IMeegoModuleDependency.class);
            if (api == null) {
                Intrinsics.throwNpe();
            }
            return (IMeegoModuleDependency) api;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo158732b() {
        C44869a.m177889a().mo158762c();
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo158728a() {
        return FeatureGatingConfig.f113629a.mo158736a();
    }

    /* renamed from: c */
    public final boolean mo158734c() {
        C44869a a = C44869a.m177889a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeegoService.inst()");
        return a.mo158763d();
    }

    /* renamed from: a */
    public final IPlusItem mo158727a(Chat chat) {
        return new C44863a(chat);
    }

    /* renamed from: b */
    public final void mo158733b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        MeegoDebugPage.m177862a(context);
    }

    /* renamed from: a */
    public final Map<String, AbstractC29186b> mo158729a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/meego/open", new OpenMeegoAppLinkHandler());
        return hashMap;
    }

    /* renamed from: a */
    public final void mo158731a(String str, String str2) {
        C44864a.m177875e().f113642a = str;
        C44864a.m177875e().f113643b = str2;
    }

    /* renamed from: a */
    public final void mo158730a(String str, Chat chat, JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        JSONObject a = C44859a.m177834a(str, chat, jSONArray);
        if (a != null) {
            C44859a.m177835a(str, a);
        }
    }
}
