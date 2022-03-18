package com.bytedance.ee.bear.rn.middleground.business.commonpush;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.rn.AbstractC10636d;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.commonpush.CommonPushProtocol;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.middleground.common.ReferenceCounter;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/commonpush/CommonPushSDK;", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol;", "docToken", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "operation", "(Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;Ljava/lang/String;)V", "mAreaCommentObserver", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol$PushObserver;", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mReferenceCounter", "Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "beginSync", "", "endSync", "registerPushObserver", "observer", "unregisterPushObserver", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.b */
public class CommonPushSDK implements AbstractC10636d {

    /* renamed from: a */
    public final String f28625a;

    /* renamed from: b */
    public final C8275a f28626b;

    /* renamed from: c */
    public final String f28627c;

    /* renamed from: d */
    private AbstractC10636d.AbstractC10637a f28628d;

    /* renamed from: e */
    private JSDocObserver f28629e;

    /* renamed from: f */
    private final ReferenceCounter f28630f;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.b$a */
    public static final class C10671a extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10671a(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.b$b */
    public static final class C10672b extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10672b(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.rn.AbstractC10636d
    /* renamed from: a */
    public void mo40332a() {
        if (this.f28630f.mo40557b() == 0) {
            m44327c();
        }
        this.f28628d = null;
        JSDocObserver aVar = this.f28629e;
        this.f28629e = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    /* renamed from: b */
    private final void m44326b() {
        CommonPushProtocol.BeginSync aVar = new CommonPushProtocol.BeginSync();
        aVar.mo40561a(new Protocol.Entity.Identifier(this.f28626b.mo32555b(), this.f28625a, false, null, 12, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10671a(aVar.mo40413a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: c */
    private final void m44327c() {
        CommonPushProtocol.EndSync bVar = new CommonPushProtocol.EndSync();
        bVar.mo40561a(new Protocol.Entity.Identifier(this.f28626b.mo32555b(), this.f28625a, false, null, 12, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10672b(bVar.mo40414a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.AbstractC10636d
    /* renamed from: a */
    public void mo40333a(AbstractC10636d.AbstractC10637a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (this.f28630f.mo40556a() <= 1) {
            m44326b();
        }
        this.f28628d = aVar;
        C10673c cVar = new C10673c(this, aVar);
        this.f28629e = cVar;
        RnSyncManager.f28587a.mo40380a(cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/commonpush/CommonPushSDK$registerPushObserver$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.a.b$c */
    public static final class C10673c implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ CommonPushSDK f28631a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10636d.AbstractC10637a f28632b;

        C10673c(CommonPushSDK bVar, AbstractC10636d.AbstractC10637a aVar) {
            this.f28631a = bVar;
            this.f28632b = aVar;
        }

        @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver
        /* renamed from: a */
        public void mo40267a(C10626c cVar, JSONObject jSONObject) {
            String str;
            String str2;
            Integer num;
            String str3;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            String str4 = null;
            if (cVar != null) {
                str = cVar.mo40279c();
            } else {
                str = null;
            }
            if (str != null) {
                if (jSONObject != null) {
                    str2 = jSONObject.getString("business");
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual("common", str2)) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("identifier")) == null) {
                        num = null;
                    } else {
                        num = jSONObject3.getInteger(ShareHitPoint.f121869d);
                    }
                    int b = this.f28631a.f28626b.mo32555b();
                    if (num != null && num.intValue() == b) {
                        JSONObject jSONObject5 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("identifier")) == null) {
                            str3 = null;
                        } else {
                            str3 = jSONObject2.getString("token");
                        }
                        if (Intrinsics.areEqual(str3, this.f28631a.f28625a)) {
                            JSONObject jSONObject6 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            if (jSONObject6 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (Intrinsics.areEqual(jSONObject6.getString("operation"), this.f28631a.f28627c)) {
                                AbstractC10636d.AbstractC10637a aVar = this.f28632b;
                                JSONObject jSONObject7 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                if (jSONObject7 != null) {
                                    str4 = jSONObject7.getString("body");
                                }
                                aVar.didReceivePush(str4);
                            }
                        }
                    }
                }
            }
        }
    }

    public CommonPushSDK(String str, C8275a aVar, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        Intrinsics.checkParameterIsNotNull(str2, "operation");
        this.f28625a = str;
        this.f28626b = aVar;
        this.f28627c = str2;
        this.f28630f = new ReferenceCounter("common:" + str + ':' + aVar.mo32555b() + ':' + aVar.mo32553a());
    }
}
