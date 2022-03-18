package com.larksuite.component.openplatform.core.plugin.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.messenger.LarkBadgeHelper;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper$receiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkBadgeHelper$receiver$1 extends BroadcastReceiver {
    LarkBadgeHelper$receiver$1() {
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (intent == null) {
                Intrinsics.throwNpe();
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Intrinsics.throwNpe();
            }
            Object obj = extras.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (obj != null) {
                JSONObject jSONObject = new JSONObject((String) obj);
                LarkBadgeHelper xVar = LarkBadgeHelper.f61807a;
                for (LarkBadgeHelper.Ids aVar : LarkBadgeHelper.f61808b) {
                    if (Intrinsics.areEqual(aVar.mo88429b(), jSONObject.getString("id"))) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("openChatId", aVar.mo88428a());
                        JSONObject put = jSONObject2.put("badge", jSONObject.getInt("unread_count"));
                        String jSONObject3 = put.toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONObject3, "msgJson.toString()");
                        try {
                            C67706e a = C67706e.C67708a.m263377a("chatBadgeChangeObserved", put).mo235009a();
                            AbstractC67709b.AbstractC67710a b = LarkBadgeHelper.f61807a.mo88427b(aVar.mo88430c());
                            if (b != null) {
                                b.mo235028a(a);
                            }
                        } catch (Throwable unused) {
                            AbstractC67538f a2 = C67432a.m262319a(aVar.mo88430c());
                            Intrinsics.checkExpressionValueIsNotNull(a2, "AppbrandApplication.getInst(ids.appContext)");
                            IJsBridge jsBridge = a2.getJsBridge();
                            if (jsBridge != null) {
                                jsBridge.sendMsgToJsCore("chatBadgeChangeObserved", jSONObject3);
                            }
                        }
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LarkBadgeHelper", "exception " + intent, e);
        }
    }
}
