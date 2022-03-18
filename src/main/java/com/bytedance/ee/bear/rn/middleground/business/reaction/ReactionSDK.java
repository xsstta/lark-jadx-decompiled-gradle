package com.bytedance.ee.bear.rn.middleground.business.reaction;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.rn.RnReactionProtocol;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.middleground.common.ReferenceCounter;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0010H\u0016J \u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J(\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionSDK;", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol;", "docToken", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "getDocToken", "()Ljava/lang/String;", "setDocToken", "(Ljava/lang/String;)V", "getDocumentType", "()Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setDocumentType", "(Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "mReactionDataObserver", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol$ReactionDataObserver;", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mReferenceCounter", "Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "addReaction", "Lio/reactivex/Flowable;", "replyId", "reactionKey", "beginSyncReaction", "", "endSyncReaction", "getDetailReaction", "referType", "referKey", "registerReactionObserver", "observer", "removeReaction", "setDetailReaction", UpdateKey.STATUS, "", "unregisterCommentDataObserver", "updateDocToken", "updateDocumentType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a */
public final class ReactionSDK implements RnReactionProtocol {

    /* renamed from: a */
    private final ReferenceCounter f28693a = new ReferenceCounter("common:" + this.f28696d + ':' + this.f28697e.mo32555b() + ':' + this.f28697e.mo32553a());

    /* renamed from: b */
    private RnReactionProtocol.ReactionDataObserver f28694b;

    /* renamed from: c */
    private JSDocObserver f28695c;

    /* renamed from: d */
    private String f28696d;

    /* renamed from: e */
    private C8275a f28697e;

    /* renamed from: b */
    public final String mo40550b() {
        return this.f28696d;
    }

    /* renamed from: c */
    public final C8275a mo40551c() {
        return this.f28697e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$b */
    public static final class C10723b extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10723b(String str) {
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
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$c */
    public static final class C10724c extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10724c(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$a */
    static final class C10721a extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10721a(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C107221.f28698a);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$d */
    static final class C10725d extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10725d(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C107261.f28699a);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$f */
    static final class C10728f extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10728f(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C107291.f28702a);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$g */
    static final class C10730g extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10730g(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C107311.f28703a);
            }
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public void mo40349a() {
        if (this.f28693a.mo40557b() == 0) {
            m44433e();
        }
        this.f28694b = null;
        JSDocObserver aVar = this.f28695c;
        this.f28695c = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    /* renamed from: d */
    private final void m44432d() {
        ReactionProtocol.BeginSync bVar = new ReactionProtocol.BeginSync();
        bVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10723b(bVar.mo40545a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: e */
    private final void m44433e() {
        ReactionProtocol.EndSync dVar = new ReactionProtocol.EndSync();
        dVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10724c(dVar.mo40547a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public void mo40350a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        this.f28697e = aVar;
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public void mo40352a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        this.f28696d = str;
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public void mo40351a(RnReactionProtocol.ReactionDataObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (this.f28693a.mo40556a() <= 1) {
            m44432d();
        }
        JSDocObserver aVar2 = this.f28695c;
        if (aVar2 != null) {
            RnSyncManager.f28587a.mo40386b(aVar2);
        }
        this.f28694b = aVar;
        C10727e eVar = new C10727e(this, aVar);
        this.f28695c = eVar;
        RnSyncManager.f28587a.mo40380a(eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/reaction/ReactionSDK$registerReactionObserver$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.a$e */
    public static final class C10727e implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ ReactionSDK f28700a;

        /* renamed from: b */
        final /* synthetic */ RnReactionProtocol.ReactionDataObserver f28701b;

        C10727e(ReactionSDK aVar, RnReactionProtocol.ReactionDataObserver aVar2) {
            this.f28700a = aVar;
            this.f28701b = aVar2;
        }

        @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver
        /* renamed from: a */
        public void mo40267a(C10626c cVar, JSONObject jSONObject) {
            String str;
            String str2 = null;
            if (cVar != null) {
                str = cVar.mo40279c();
            } else {
                str = null;
            }
            if (str != null) {
                if (jSONObject != null) {
                    str2 = jSONObject.getString("business");
                }
                if (Intrinsics.areEqual(Comment.f24093e, str2)) {
                    Integer integer = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("identifier").getInteger(ShareHitPoint.f121869d);
                    int b = this.f28700a.mo40551c().mo32555b();
                    if (integer != null && integer.intValue() == b && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("identifier").getString("token"), this.f28700a.mo40550b()) && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("operation"), "updateReactionDetail")) {
                        this.f28701b.mo34384a(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("body"));
                    }
                }
            }
        }
    }

    public ReactionSDK(String str, C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        this.f28696d = str;
        this.f28697e = aVar;
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40347a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        String a = C10732b.m44452a();
        ReactionProtocol.AddReaction aVar = new ReactionProtocol.AddReaction();
        aVar.mo40560a(new Protocol.Entity.Header(a));
        aVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        aVar.mo40559a(new ReactionProtocol.Body.AddReaction(str, str2));
        return C10732b.m44451a(new C10721a(aVar.mo40544a(), a));
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: b */
    public AbstractC68307f<String> mo40353b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        String a = C10732b.m44452a();
        ReactionProtocol.RemoveReaction fVar = new ReactionProtocol.RemoveReaction();
        fVar.mo40560a(new Protocol.Entity.Header(a));
        fVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        fVar.mo40559a(new ReactionProtocol.Body.RemoveReaction(str, str2));
        return C10732b.m44451a(new C10728f(fVar.mo40549a(), a));
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: c */
    public AbstractC68307f<String> mo40354c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "referType");
        Intrinsics.checkParameterIsNotNull(str2, "referKey");
        String a = C10732b.m44452a();
        ReactionProtocol.ReactionDetail eVar = new ReactionProtocol.ReactionDetail();
        eVar.mo40560a(new Protocol.Entity.Header(a));
        eVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        eVar.mo40559a(new ReactionProtocol.Body.GetReactionDetail(str, str2));
        return C10732b.m44451a(new C10725d(eVar.mo40548a(), a));
    }

    @Override // com.bytedance.ee.bear.rn.RnReactionProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40348a(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "referType");
        Intrinsics.checkParameterIsNotNull(str2, "referKey");
        String a = C10732b.m44452a();
        ReactionProtocol.DetailPanelStatus cVar = new ReactionProtocol.DetailPanelStatus();
        cVar.mo40560a(new Protocol.Entity.Header(a));
        cVar.mo40561a(new Protocol.Entity.Identifier(this.f28697e.mo32555b(), this.f28696d, false, null, 12, null));
        cVar.mo40559a(new ReactionProtocol.Body.DetailPanelStatus(str, str2, i));
        return C10732b.m44451a(new C10730g(cVar.mo40546a(), a));
    }
}
