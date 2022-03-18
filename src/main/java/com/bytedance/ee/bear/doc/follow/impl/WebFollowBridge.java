package com.bytedance.ee.bear.doc.follow.impl;

import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.doc.follow.AbstractC5426c;
import com.bytedance.ee.bear.doc.follow.FollowInvokeResult;
import com.bytedance.ee.bear.doc.follow.impl.FollowCallbackMapUtil;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J8\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J4\u0010\u001a\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J*\u0010!\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016J$\u0010#\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/doc/follow/impl/WebFollowBridge;", "Lcom/bytedance/ee/bear/doc/follow/impl/IFollowBridge;", "mWeb", "Lcom/bytedance/ee/bear/browser/Web;", "(Lcom/bytedance/ee/bear/browser/Web;)V", "getMWeb", "()Lcom/bytedance/ee/bear/browser/Web;", "setMWeb", "destroy", "", "token", "", "getCallbackMap", "Lcom/bytedance/ee/bear/doc/follow/impl/FollowCallbackMapUtil;", "invoke", "funName", "paramJson", "metaJson", "callback", "Lcom/bytedance/ee/bear/doc/follow/FollowInvokeCallback;", "onEvent", "event", "Lcom/bytedance/ee/bear/doc/follow/impl/rn/RNFollowEvent;", "onInvokeResult", "result", "Lcom/bytedance/ee/bear/doc/follow/FollowInvokeResult;", "registerEventHandler", "module", "eventType", "handler", "Lcom/bytedance/ee/bear/doc/follow/impl/rn/RNEventHandler;", "outer", "", "sendEvent", "dataJson", "unRegisterEventHandler", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.follow.impl.e */
public final class WebFollowBridge implements IFollowBridge {

    /* renamed from: a */
    public static final FollowCallbackMapUtil f15493a = new FollowCallbackMapUtil();

    /* renamed from: b */
    public static final Companion f15494b = new Companion(null);

    /* renamed from: c */
    private AbstractC4931i f15495c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/doc/follow/impl/WebFollowBridge$Companion;", "", "()V", "TAG", "", "callbackMapUtil", "Lcom/bytedance/ee/bear/doc/follow/impl/FollowCallbackMapUtil;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.follow.impl.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public FollowCallbackMapUtil mo21765a() {
        return f15493a;
    }

    public WebFollowBridge(AbstractC4931i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "mWeb");
        this.f15495c = iVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/follow/impl/WebFollowBridge$registerEventHandler$1", "Landroid/webkit/ValueCallback;", "", "onReceiveValue", "", "value", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.follow.impl.e$b */
    public static final class C5439b implements ValueCallback<String> {

        /* renamed from: a */
        final /* synthetic */ String f15496a;

        /* renamed from: b */
        final /* synthetic */ String f15497b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5440a f15498c;

        /* renamed from: a */
        public void onReceiveValue(String str) {
            WebFollowBridge.f15493a.mo21761a(FollowCallbackMapUtil.f15488a.mo21764a(null, this.f15496a, this.f15497b), this.f15498c);
        }

        C5439b(String str, String str2, AbstractC5440a aVar) {
            this.f15496a = str;
            this.f15497b = str2;
            this.f15498c = aVar;
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21767a(FollowInvokeResult followInvokeResult) {
        if (followInvokeResult != null) {
            FollowCallbackMapUtil aVar = f15493a;
            String str = followInvokeResult.callbackId;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.callbackId");
            AbstractC5426c a = aVar.mo21758a(str);
            if (a != null) {
                a.onInvokeResult(followInvokeResult);
            }
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21768a(RNFollowEvent rNFollowEvent) {
        Intrinsics.checkParameterIsNotNull(rNFollowEvent, "event");
        FollowCallbackMapUtil.Companion aVar = FollowCallbackMapUtil.f15488a;
        String str = rNFollowEvent.module;
        String str2 = rNFollowEvent.eventType;
        Intrinsics.checkExpressionValueIsNotNull(str2, "event.eventType");
        AbstractC5440a b = f15493a.mo21762b(aVar.mo21764a(null, str, str2));
        if (b != null) {
            b.onEvent(rNFollowEvent);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21769a(String str) {
        this.f15495c.mo19428a("javascript:lark.biz.vcfollow.destroy", new JSONObject());
        f15493a.mo21760a();
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21770a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "eventType");
        f15493a.mo21763c(FollowCallbackMapUtil.f15488a.mo21764a(null, str2, str3));
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public String mo21766a(String str, String str2, String str3, String str4, AbstractC5426c cVar) {
        Intrinsics.checkParameterIsNotNull(str2, "funName");
        String a = f15493a.mo21759a(cVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("funcName", (Object) str2);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("paramJson", (Object) str3);
        jSONObject.put("metaJson", (Object) str4);
        jSONObject.put("callbackId", (Object) a);
        this.f15495c.mo19428a("javascript:lark.biz.vcfollow.invoke", jSONObject);
        return a;
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21771a(String str, String str2, String str3, AbstractC5440a aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(str3, "eventType");
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", (Object) str3);
        this.f15495c.mo19429a("javascript:lark.biz.vcfollow.registerEventHandler", jSONObject, new C5439b(str2, str3, aVar));
    }
}
