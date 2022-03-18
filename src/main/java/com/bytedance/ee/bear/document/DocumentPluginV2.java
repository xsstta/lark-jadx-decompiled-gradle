package com.bytedance.ee.bear.document;

import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.PluginHostAbility;
import com.bytedance.ee.bear.browser.plugin.PluginKotlinExtension;
import com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.IBridge;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class DocumentPluginV2 extends BasePluginV2 implements AbstractC4952a {
    public final void dispatchBridgeMsg(String str) {
        dispatchBridgeMsg$default(this, str, null, null, 6, null);
    }

    public final void dispatchBridgeMsg(String str, Object obj) {
        dispatchBridgeMsg$default(this, str, obj, null, 4, null);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
    }

    public final boolean getRunInNative() {
        return !getRunInWeb();
    }

    public final IBridge getBridge() {
        return getEditorAbility().mo19354a();
    }

    public final DocumentMetadata getDocumentMetadata() {
        return getEditorAbility().mo24602q();
    }

    public final boolean getRunInWeb() {
        if (getWebEditorAbility() != null) {
            return true;
        }
        return false;
    }

    public final WebEditorAbility getWebEditorAbility() {
        PluginKotlinExtension gVar = PluginKotlinExtension.f14516a;
        return (WebEditorAbility) getHost().mo19556c(WebEditorAbility.class);
    }

    public final AbstractC4931i getWebOrNull() {
        WebEditorAbility webEditorAbility = getWebEditorAbility();
        if (webEditorAbility != null) {
            return webEditorAbility.mo22580b();
        }
        return null;
    }

    public final EditorAbility getEditorAbility() {
        PluginKotlinExtension gVar = PluginKotlinExtension.f14516a;
        PluginHostAbility b = getHost().mo19551b(EditorAbility.class);
        Intrinsics.checkExpressionValueIsNotNull(b, "host.getHostAbility(T::class.java)");
        return (EditorAbility) b;
    }

    public final void dispatchBridgeMsg(String str, Object obj, AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        getBridge().mo19350a(str, obj, hVar);
    }

    public static /* synthetic */ void dispatchBridgeMsg$default(DocumentPluginV2 documentPluginV2, String str, Object obj, AbstractC7947h hVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            if ((i & 4) != 0) {
                hVar = null;
            }
            documentPluginV2.dispatchBridgeMsg(str, obj, hVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchBridgeMsg");
    }
}
