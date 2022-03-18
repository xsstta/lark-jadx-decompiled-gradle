package com.bytedance.ee.bear.rn.middleground.business.comment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.rn.RnCommentProtocol;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol;
import com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u0000 M2\u00020\u0001:\u0001MB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0002J\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\u00032\b\u0010'\u001a\u0004\u0018\u00010\u00032\b\u0010(\u001a\u0004\u0018\u00010\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010\u00032\b\u0010+\u001a\u0004\u0018\u00010\u00032\u0018\u0010,\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016J \u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0016J\u0012\u00100\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u00101\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0016J \u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0003H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0005H\u0002J\u0018\u00109\u001a\u00020:2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002JZ\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010%\u001a\u00020\"2\u0018\u0010,\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u0003H\u0016Jx\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010(\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010+\u001a\u0004\u0018\u00010\u00032\u0018\u0010,\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u00020\u0017H\u0016J+\u0010C\u001a\u00020\u00172\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030E2\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010FJ \u0010G\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0016J\b\u0010H\u001a\u00020\u0017H\u0016J\b\u0010I\u001a\u00020\u0017H\u0016J\u0012\u0010J\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010K\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010L\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentSDK;", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol;", "docToken", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "appId", "getDocToken", "()Ljava/lang/String;", "setDocToken", "(Ljava/lang/String;)V", "getDocumentType", "()Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setDocumentType", "(Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "mCommentDataObserver", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol$CommentDataObserver;", "mMessageObserver", "mRealCommentObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mRealMessageObserver", "addTranslateComments", "", "beginSync", "token", "beginSyncComment", "createComment", "Lio/reactivex/Flowable;", Comment.f24093e, "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "whole", "", "quote", "tempId", "isAudio", "parentType", "parentToken", "commentId", "replyId", "localCommentId", "position", "bizParams", "", "", "deleteComment", "endSync", "endSyncComment", "fetchComment", "fetchMessage", "owner", "options", "getBeginSyncConfig", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", ShareHitPoint.f121869d, "getExtra", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "modifyComment", "registerCommentDataObserver", "observer", "registerMessageDataObserver", "reopenComment", "replyComment", "resolveComment", "setTranslateEnableLang", "solveMessage", "messageIds", "", "([Ljava/lang/String;ZLjava/lang/String;)V", "translate", "unregisterCommentDataObserver", "unregisterMessageObserver", "updateAppId", "updateDocToken", "updateDocumentType", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a */
public final class CommentSDK implements RnCommentProtocol {

    /* renamed from: a */
    public static final Companion f28667a = new Companion(null);

    /* renamed from: b */
    private RnCommentProtocol.CommentDataObserver f28668b;

    /* renamed from: c */
    private RnCommentProtocol.CommentDataObserver f28669c;

    /* renamed from: d */
    private JSDocObserver f28670d;

    /* renamed from: e */
    private JSDocObserver f28671e;

    /* renamed from: f */
    private String f28672f;

    /* renamed from: g */
    private String f28673g;

    /* renamed from: h */
    private C8275a f28674h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$h */
    static final class C10698h<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10698h f28676a = new C10698h();

        C10698h() {
        }

        /* renamed from: a */
        public final void accept(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$j */
    static final class C10700j<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10700j f28677a = new C10700j();

        C10700j() {
        }

        /* renamed from: a */
        public final void accept(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$l */
    static final class C10702l<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10702l f28678a = new C10702l();

        C10702l() {
        }

        /* renamed from: a */
        public final void accept(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$p */
    static final class C10706p<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10706p f28683a = new C10706p();

        C10706p() {
        }

        /* renamed from: a */
        public final void accept(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$t */
    static final class C10710t<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10710t f28684a = new C10710t();

        C10710t() {
        }

        /* renamed from: a */
        public final void accept(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentSDK$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final String mo40515f() {
        return this.f28673g;
    }

    /* renamed from: g */
    public final C8275a mo40516g() {
        return this.f28674h;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public void mo40321a(String[] strArr, boolean z, String str) {
        AbstractC68307f<String> b;
        Intrinsics.checkParameterIsNotNull(strArr, "messageIds");
        Intrinsics.checkParameterIsNotNull(str, "options");
        String a = C10732b.m44452a();
        CommentProtocol.SolveMessage jVar = new CommentProtocol.SolveMessage();
        jVar.mo40560a(new Protocol.Entity.Header(a));
        jVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, z, null, 8, null));
        jVar.mo40559a(new CommentProtocol.Body.Solve(strArr, 1, str));
        AbstractC68307f<String> a2 = C10732b.m44451a(new C10709s(jVar.mo40513a(), a));
        if (a2 != null && (b = a2.mo238005b(C10710t.f28684a)) != null) {
            b.mo238036k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$b */
    static final class C10691b extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10691b(String str) {
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
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$c */
    public static final class C10692c extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10692c(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$e */
    static final class C10695e extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10695e(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$f */
    public static final class C10696f extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10696f(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$g */
    static final class C10697g extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10697g(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$i */
    static final class C10699i extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10699i(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$k */
    static final class C10701k extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10701k(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$o */
    static final class C10705o extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10705o(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$q */
    static final class C10707q extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ Ref.ObjectRef $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10707q(Ref.ObjectRef objectRef, String str) {
            super(0);
            this.$jsonString = objectRef;
            this.$requestId = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a((String) this.$jsonString.element, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$r */
    static final class C10708r extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10708r(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$s */
    static final class C10709s extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10709s(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$d */
    static final class C10693d extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10693d(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C106941.f28675a);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$u */
    static final class C10711u extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;
        final /* synthetic */ String $requestId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10711u(String str, String str2) {
            super(0);
            this.$jsonString = str;
            this.$requestId = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            AbstractC68307f<String> a = RnSyncManager.f28587a.mo40374a(this.$jsonString, this.$requestId);
            if (a != null) {
                return a.mo238005b(C107121.f28685a);
            }
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public void mo40317a() {
        C13479a.m54764b("CommentSDK", "unregisterMessageObserver");
        this.f28669c = null;
        JSDocObserver aVar = this.f28671e;
        this.f28671e = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: b */
    public void mo40323b() {
        C13479a.m54764b("CommentSDK", "unregisterCommentDataObserver");
        RnCommentProtocol.C10635b.m44206a(this, null, 1, null);
        this.f28668b = null;
        JSDocObserver aVar = this.f28670d;
        this.f28670d = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: c */
    public AbstractC68307f<String> mo40326c() {
        String a = C10732b.m44452a();
        CommentProtocol.Fetch fVar = new CommentProtocol.Fetch();
        fVar.mo40560a(new Protocol.Entity.Header(a));
        fVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, this.f28672f, 4, null));
        fVar.mo40559a(new Protocol.Body.Empty());
        AbstractC68307f<String> a2 = C10732b.m44451a(new C10697g(fVar.mo40509a(), a));
        if (a2 != null) {
            return a2.mo238005b(C10698h.f28676a);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: d */
    public void mo40328d() {
        C13479a.m54764b("CommentSDK", "addTranslateComments");
        CommentProtocol.AddTranslateComments aVar = new CommentProtocol.AddTranslateComments();
        aVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, null, 12, null));
        aVar.mo40559a(new Protocol.Body.Empty());
        AbstractC68307f<String> a = C10732b.m44451a(new C10691b(aVar.mo40504a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: e */
    public void mo40331e() {
        C13479a.m54764b("CommentSDK", "setTranslateEnableLang");
        CommentProtocol.SetTranslateEnableLang iVar = new CommentProtocol.SetTranslateEnableLang();
        iVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, null, 12, null));
        iVar.mo40559a(new Protocol.Body.Empty());
        AbstractC68307f<String> a = C10732b.m44451a(new C10708r(iVar.mo40512a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: d */
    public void mo40329d(String str) {
        this.f28672f = str;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public void mo40318a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        this.f28674h = aVar;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: c */
    public void mo40327c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        this.f28673g = str;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public void mo40320a(String str) {
        m44389f(str);
        C13479a.m54764b("CommentSDK", "beginSync");
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: b */
    public void mo40325b(String str) {
        m44390g(str);
        C13479a.m54764b("CommentSDK", "endSync");
    }

    /* renamed from: b */
    private final BaseProtocol.Body.Config m44388b(C8275a aVar) {
        int b = aVar.mo32555b();
        C8275a aVar2 = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
        if (b == aVar2.mo32555b()) {
            return BaseProtocol.Body.Config.Companion.mo40418a();
        }
        return BaseProtocol.Body.Config.Companion.mo40419b();
    }

    /* renamed from: g */
    private final void m44390g(String str) {
        CommentProtocol.EndSync eVar = new CommentProtocol.EndSync();
        int b = this.f28674h.mo32555b();
        if (str == null) {
            str = this.f28673g;
        }
        eVar.mo40561a(new Protocol.Entity.Identifier(b, str, false, this.f28672f, 4, null));
        eVar.mo40559a(new Protocol.Body.Empty());
        AbstractC68307f<String> a = C10732b.m44451a(new C10696f(eVar.mo40508a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public void mo40319a(RnCommentProtocol.CommentDataObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f28669c = aVar;
        C10704n nVar = new C10704n(this, aVar);
        this.f28671e = nVar;
        RnSyncManager.f28587a.mo40380a(nVar);
    }

    /* renamed from: a */
    private final CommentProtocol.Body.Extra m44387a(List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && (!list.isEmpty())) {
            for (T t : list) {
                String token = t.getToken();
                String uuid = t.getUuid();
                String src = t.getSrc();
                Intrinsics.checkExpressionValueIsNotNull(src, "entity.src");
                arrayList.add(new CommentProtocol.Body.Extra.CommentImageItem(token, uuid, src, t.getOriginalSrc()));
            }
        }
        return new CommentProtocol.Body.Extra(null, null, arrayList);
    }

    /* renamed from: f */
    private final void m44389f(String str) {
        CommentProtocol.BeginSync bVar = new CommentProtocol.BeginSync();
        int b = this.f28674h.mo32555b();
        if (str == null) {
            str = this.f28673g;
        }
        bVar.mo40561a(new Protocol.Entity.Identifier(b, str, false, this.f28672f, 4, null));
        bVar.mo40559a(new BaseProtocol.Body.BeginSync(m44388b(this.f28674h), null, 2, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10692c(bVar.mo40505a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: e */
    public AbstractC68307f<String> mo40330e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        String a = C10732b.m44452a();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CommentProtocol.Update update = new CommentProtocol.Update();
        update.mo40560a(new Protocol.Entity.Header(a));
        update.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, this.f28672f, 4, null));
        update.mo40559a(new CommentProtocol.Body.UpdateComment(str, CommentProtocol.Update.UPDATE.RESOLVE.type()));
        objectRef.element = (T) update.mo40502a();
        return C10732b.m44451a(new C10707q(objectRef, a));
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: b */
    public void mo40324b(RnCommentProtocol.CommentDataObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f28668b = aVar;
        C10703m mVar = new C10703m(this, aVar);
        this.f28670d = mVar;
        RnSyncManager.f28587a.mo40380a(mVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/comment/CommentSDK$registerCommentDataObserver$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$m */
    public static final class C10703m implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ CommentSDK f28679a;

        /* renamed from: b */
        final /* synthetic */ RnCommentProtocol.CommentDataObserver f28680b;

        C10703m(CommentSDK aVar, RnCommentProtocol.CommentDataObserver aVar2) {
            this.f28679a = aVar;
            this.f28680b = aVar2;
        }

        @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver
        /* renamed from: a */
        public void mo40267a(C10626c cVar, JSONObject jSONObject) {
            String str;
            if (cVar != null) {
                str = cVar.mo40279c();
            } else {
                str = null;
            }
            if (str != null && jSONObject != null && Intrinsics.areEqual(Comment.f24093e, jSONObject.getString("business")) && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("operation"), "sendCommentsData") && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("identifier").getString("token"), this.f28679a.mo40515f())) {
                this.f28680b.mo34720a(JSON.toJSONString((Object) jSONObject, true));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/comment/CommentSDK$registerMessageDataObserver$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.a$n */
    public static final class C10704n implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ CommentSDK f28681a;

        /* renamed from: b */
        final /* synthetic */ RnCommentProtocol.CommentDataObserver f28682b;

        C10704n(CommentSDK aVar, RnCommentProtocol.CommentDataObserver aVar2) {
            this.f28681a = aVar;
            this.f28682b = aVar2;
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
                if (Intrinsics.areEqual(Comment.f24093e, str2) && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("operation"), "updateMessage")) {
                    Integer integer = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("identifier").getInteger(ShareHitPoint.f121869d);
                    int b = this.f28681a.mo40516g().mo32555b();
                    if (integer != null && integer.intValue() == b && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("identifier").getString("token"), this.f28681a.mo40515f())) {
                        this.f28682b.mo34720a(JSON.toJSONString((Object) jSONObject, true));
                    }
                }
            }
        }
    }

    public CommentSDK(String str, C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        this.f28673g = str;
        this.f28674h = aVar;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: b */
    public AbstractC68307f<String> mo40322b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        String a = C10732b.m44452a();
        CommentProtocol.Delete cVar = new CommentProtocol.Delete();
        cVar.mo40560a(new Protocol.Entity.Header(a));
        cVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, this.f28672f, 4, null));
        cVar.mo40559a(new CommentProtocol.Body.DeleteComment(str, str2));
        return C10732b.m44451a(new C10695e(cVar.mo40506a(), a));
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40312a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        C13479a.m54764b("CommentSDK", "translate");
        String a = C10732b.m44452a();
        CommentProtocol.Translate kVar = new CommentProtocol.Translate();
        kVar.mo40560a(new Protocol.Entity.Header(a));
        kVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, null, 12, null));
        kVar.mo40559a(new CommentProtocol.Body.Translate(str, str2));
        return C10732b.m44451a(new C10711u(kVar.mo40514a(), a));
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40316a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "options");
        String a = C10732b.m44452a();
        CommentProtocol.FetchMessage gVar = new CommentProtocol.FetchMessage();
        gVar.mo40560a(new Protocol.Entity.Header(a));
        gVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, z, null, 8, null));
        gVar.mo40559a(new Protocol.Body.Empty());
        AbstractC68307f<String> a2 = C10732b.m44451a(new C10699i(gVar.mo40510a(), a));
        if (a2 != null) {
            return a2.mo238005b(C10700j.f28677a);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40313a(String str, String str2, String str3, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        Intrinsics.checkParameterIsNotNull(str3, Comment.f24093e);
        String a = C10732b.m44452a();
        CommentProtocol.Body.Extra a2 = m44387a(list);
        CommentProtocol.Edit dVar = new CommentProtocol.Edit();
        dVar.mo40560a(new Protocol.Entity.Header(a));
        dVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, this.f28672f, 4, null));
        CommentProtocol.Body.EditComment editComment = new CommentProtocol.Body.EditComment(str, str2, str3, a2, map);
        editComment.set_audio(Boolean.valueOf(z));
        dVar.mo40559a(editComment);
        AbstractC68307f<String> a3 = C10732b.m44451a(new C10701k(dVar.mo40507a(), a));
        if (a3 != null) {
            return a3.mo238005b(C10702l.f28678a);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40314a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, boolean z, String str5, String str6, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str4, "tempId");
        String a = C10732b.m44452a();
        CommentProtocol.Body.Extra a2 = m44387a(list);
        CommentProtocol.Publish hVar = new CommentProtocol.Publish();
        hVar.mo40560a(new Protocol.Entity.Header(a));
        hVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, null, 12, null));
        CommentProtocol.Body.PublishComment publishComment = new CommentProtocol.Body.PublishComment(str3, str, str2, a2, str4, null, null, str5, Integer.valueOf(CommentProtocol.Body.PublishType.f28664a.mo40501b()), null, str6, map);
        publishComment.set_whole(false);
        publishComment.set_audio(Boolean.valueOf(z));
        hVar.mo40559a(publishComment);
        AbstractC68307f<String> a3 = C10732b.m44451a(new C10705o(hVar.mo40511a(), a));
        if (a3 != null) {
            return a3.mo238005b(C10706p.f28683a);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.rn.RnCommentProtocol
    /* renamed from: a */
    public AbstractC68307f<String> mo40315a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(str2, "quote");
        Intrinsics.checkParameterIsNotNull(str3, "tempId");
        CommentProtocol.Body.Extra a = m44387a(list);
        String a2 = C10732b.m44452a();
        CommentProtocol.Publish hVar = new CommentProtocol.Publish();
        hVar.mo40560a(new Protocol.Entity.Header(a2));
        hVar.mo40561a(new Protocol.Entity.Identifier(this.f28674h.mo32555b(), this.f28673g, false, this.f28672f, 4, null));
        CommentProtocol.Body.PublishComment publishComment = new CommentProtocol.Body.PublishComment(str2, str, str6, a, str3, str4, str5, str7, Integer.valueOf(CommentProtocol.Body.PublishType.f28664a.mo40500a()), str8, str9, map);
        publishComment.set_whole(Boolean.valueOf(z));
        publishComment.set_audio(Boolean.valueOf(z2));
        hVar.mo40559a(publishComment);
        return C10732b.m44451a(new C10693d(hVar.mo40511a(), a2));
    }
}
