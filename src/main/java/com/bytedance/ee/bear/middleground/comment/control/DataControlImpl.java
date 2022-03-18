package com.bytedance.ee.bear.middleground.comment.control;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.rn.RnCommentProtocol;
import com.bytedance.ee.bear.rn.RnReactionProtocol;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u001c\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b2\u0018\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016J&\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010.\u001a\u00020!H\u0016J`\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010.\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0018\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016J\u0012\u00100\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\tH\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020;H\u0016J\u001c\u0010<\u001a\u00020\n2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0>H\u0016J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\nH\u0016J|\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u001c\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b2\u0018\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0016J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010'\u001a\u00020\b2\u0006\u0010.\u001a\u00020!H\u0016J&\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010D\u001a\u00020E2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016J\u001c\u0010F\u001a\u00020\n2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0>H\u0016J\b\u0010G\u001a\u00020\nH\u0016J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0012\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010K\u001a\u00020\n2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\bH\u0016J\u0010\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020QH\u0016R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/DataControlImpl;", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "commentSDK", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol;", "reactionSDK", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol;", "filter", "Lkotlin/Function2;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "", "(Lcom/bytedance/ee/bear/rn/RnCommentProtocol;Lcom/bytedance/ee/bear/rn/RnReactionProtocol;Lkotlin/jvm/functions/Function2;)V", "commentData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "getCommentData", "()Landroidx/lifecycle/MutableLiveData;", "pushListener", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol$CommentDataObserver;", "addReaction", "Lio/reactivex/Flowable;", "replyId", "reactionKey", "addTranslateComments", "beginSync", "token", "createComment", "content", "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "whole", "", "tempId", "quote", "isAudio", "parentType", "parentToken", "commentId", "localCommentId", "position", "bizParams", "", "", "deleteComment", "isWhole", "editComment", "endSync", "filterData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "action", "getComment", "getDataLiveData", "getDetailReaction", "referType", "referKey", "registerReactionObserver", "observer", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol$ReactionDataObserver;", "removePushListener", "listener", "Lkotlin/Function1;", "removeReaction", "removeReactionObserver", "replyComment", "resolveComment", "setDetailPanelStatus", UpdateKey.STATUS, "", "setPushListener", "setTranslateEnableLang", "translate", "updateAppid", "appId", "updateList", "newList", "updateToken", "newToken", "updateType", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.b.d */
public final class DataControlImpl implements DataControl {

    /* renamed from: a */
    private final C1177w<List<CommentBean>> f24477a = new C1177w<>();

    /* renamed from: b */
    private RnCommentProtocol.CommentDataObserver f24478b;

    /* renamed from: c */
    private final RnCommentProtocol f24479c;

    /* renamed from: d */
    private final RnReactionProtocol f24480d;

    /* renamed from: e */
    private final Function2<String, Action, Unit> f24481e;

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: b */
    public C1177w<List<CommentBean>> mo34708b() {
        return this.f24477a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34704a(String str) {
        this.f24479c.mo40325b(str);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34707a(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        C9098a aVar = new C9098a(function1);
        this.f24478b = aVar;
        RnCommentProtocol cVar = this.f24479c;
        if (aVar != null) {
            cVar.mo40324b(aVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.rn.RnCommentProtocol.CommentDataObserver");
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl, com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34705a(String str, Action action) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(action, "action");
        this.f24481e.invoke(str, action);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34706a(List<CommentBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "newList");
        C13479a.m54764b("DataControl", "updateList size = " + String.valueOf(list.size()));
        this.f24477a.mo5929b(list);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34701a() {
        this.f24480d.mo40349a();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl, com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: d */
    public void mo34716d() {
        this.f24479c.mo40328d();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl, com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: e */
    public void mo34717e() {
        this.f24479c.mo40331e();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: c */
    public AbstractC68307f<String> mo34712c() {
        AbstractC68307f<String> c = this.f24479c.mo40326c();
        if (c != null) {
            return c;
        }
        AbstractC68307f<String> a = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/DataControlImpl$setPushListener$1", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol$CommentDataObserver;", "didReceiveCommentData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.d$a */
    public static final class C9098a implements RnCommentProtocol.CommentDataObserver {

        /* renamed from: a */
        final /* synthetic */ Function1 f24482a;

        C9098a(Function1 function1) {
            this.f24482a = function1;
        }

        @Override // com.bytedance.ee.bear.rn.RnCommentProtocol.CommentDataObserver
        /* renamed from: a */
        public void mo34720a(String str) {
            if (str != null) {
                this.f24482a.invoke(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: c */
    public void mo34714c(String str) {
        this.f24479c.mo40329d(str);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34702a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ShareHitPoint.f121869d);
        this.f24479c.mo40318a(aVar);
        this.f24480d.mo40350a(aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: b */
    public void mo34710b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "newToken");
        this.f24479c.mo40327c(str);
        this.f24480d.mo40352a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: d */
    public void mo34719d(String str) {
        this.f24479c.mo40320a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: b */
    public void mo34711b(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        this.f24479c.mo40323b();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public void mo34703a(RnReactionProtocol.ReactionDataObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f24480d.mo40351a(aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34700a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        AbstractC68307f<String> e = this.f24479c.mo40330e(str);
        if (e != null) {
            return e;
        }
        AbstractC68307f<String> a = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: b */
    public AbstractC68307f<String> mo34709b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        AbstractC68307f<String> b = this.f24480d.mo40353b(str, str2);
        if (b != null) {
            return b;
        }
        AbstractC68307f<String> a = AbstractC68307f.m265084a(new Throwable("addReaction RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable… RN SDK get data error\"))");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl, com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: c */
    public AbstractC68307f<String> mo34713c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "referType");
        Intrinsics.checkParameterIsNotNull(str2, "referKey");
        AbstractC68307f<String> c = this.f24480d.mo40354c(str, str2);
        if (c != null) {
            return c;
        }
        AbstractC68307f<String> a = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl, com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: d */
    public AbstractC68307f<String> mo34715d(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        AbstractC68307f<String> a = this.f24479c.mo40312a(str, str2);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a2;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34695a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        AbstractC68307f<String> a = this.f24480d.mo40347a(str, str2);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("addReaction RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable… RN SDK get data error\"))");
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.k<? super java.lang.String, ? super com.bytedance.ee.bear.middleground.comment.export.Action, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public DataControlImpl(RnCommentProtocol cVar, RnReactionProtocol hVar, Function2<? super String, ? super Action, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "commentSDK");
        Intrinsics.checkParameterIsNotNull(hVar, "reactionSDK");
        Intrinsics.checkParameterIsNotNull(kVar, "filter");
        this.f24479c = cVar;
        this.f24480d = hVar;
        this.f24481e = kVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34694a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "referType");
        Intrinsics.checkParameterIsNotNull(str2, "referKey");
        AbstractC68307f<String> a = this.f24480d.mo40348a(str, str2, i);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a2;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34697a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        AbstractC68307f<String> b = this.f24479c.mo40322b(str, str2);
        if (b != null) {
            return b;
        }
        AbstractC68307f<String> a = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34696a(String str, String str2, String str3, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, boolean z2, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        Intrinsics.checkParameterIsNotNull(str3, "content");
        AbstractC68307f<String> a = this.f24479c.mo40313a(str, str2, str3, list, z2, map);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a2;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34698a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, boolean z, String str3, String str4, boolean z2, String str5, String str6, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "tempId");
        Intrinsics.checkParameterIsNotNull(str4, "quote");
        AbstractC68307f<String> a = this.f24479c.mo40314a(str, list, str2, str4, str3, z2, str5, str6, map);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a2;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.DataControl
    /* renamed from: a */
    public AbstractC68307f<String> mo34699a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str2, "tempId");
        Intrinsics.checkParameterIsNotNull(str3, "quote");
        AbstractC68307f<String> a = this.f24479c.mo40315a(str, list, z, str3, str2, z2, str4, str5, str6, str7, str8, str9, map);
        if (a != null) {
            return a;
        }
        AbstractC68307f<String> a2 = AbstractC68307f.m265084a(new Throwable("RN SDK get data error"));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.error(Throwable(\"RN SDK get data error\"))");
        return a2;
    }
}
