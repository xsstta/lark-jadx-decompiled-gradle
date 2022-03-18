package com.bytedance.ee.bear.wikiv2.extension;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.wikiv2.WikiActivity;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a4\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\n*\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\t0\u000f¨\u0006\u0010"}, d2 = {"dispatchOnNewIntent", "", "Lcom/bytedance/ee/bear/wikiv2/WikiActivity;", "intent", "Landroid/content/Intent;", "dispatchOnPostCreate", "savedInstanceState", "Landroid/os/Bundle;", "findActivityExtensionToDo", "T", "Lcom/bytedance/ee/bear/facade/common/ActivityExtension;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", ShareHitPoint.f121869d, "Ljava/lang/Class;", "action", "Lcom/bytedance/ee/bear/wikiv2/extension/ExtensionFindAction;", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.extension.d */
public final class C12250d {
    /* renamed from: a */
    public static final void m50992a(WikiActivity wikiActivity, Intent intent) {
        Intrinsics.checkParameterIsNotNull(wikiActivity, "$this$dispatchOnNewIntent");
        List<C7661a> o = wikiActivity.mo30080o();
        if (o != null) {
            for (T t : o) {
                if (t instanceof WikiActivityExtension) {
                    t.mo46799a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m50993a(WikiActivity wikiActivity, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(wikiActivity, "$this$dispatchOnPostCreate");
        List<C7661a> o = wikiActivity.mo30080o();
        if (o != null) {
            for (T t : o) {
                if (t instanceof WikiActivityExtension) {
                    t.mo46808a(bundle);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ee.bear.wikiv2.extension.c<T extends com.bytedance.ee.bear.facade.common.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T extends C7661a> void m50991a(BasePlugin<?> basePlugin, Class<T> cls, ExtensionFindAction<T> cVar) {
        Intrinsics.checkParameterIsNotNull(basePlugin, "$this$findActivityExtensionToDo");
        Intrinsics.checkParameterIsNotNull(cls, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(cVar, "action");
        C4943e host = basePlugin.getHost();
        Intrinsics.checkExpressionValueIsNotNull(host, "host");
        C7661a aVar = (C7661a) AbstractC7710h.C7711a.m30833a(host.mo19564f(), cls);
        if (aVar != null) {
            cVar.mo46699a(aVar);
        }
    }
}
