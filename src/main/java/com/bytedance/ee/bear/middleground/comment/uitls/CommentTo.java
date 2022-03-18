package com.bytedance.ee.bear.middleground.comment.uitls;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00172\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentTo;", "", "()V", "TAG", "", "dataToCommentBeans", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "action", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getAtRichText", "Lio/reactivex/disposables/Disposable;", "at", "Lcom/bytedance/ee/bear/widget/AtEditText;", "text", "Lkotlin/Function1;", "", "getPublishEntity", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/DataEntity$Entity$BodyEntity$PublishEntity;", "getResultBean", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/DataEntity$Entity$BodyEntity;", "getResultBody", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "getResultEntity", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/DataEntity$Entity$BodyEntity$ResultEntity;", "resolveReactionData", "commentBeans", "trimAll", "content", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.g.d */
public final class CommentTo {

    /* renamed from: a */
    public static final CommentTo f24850a = new CommentTo();

    private CommentTo() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.g.d$b */
    public static final class C9231b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9231b f24852a = new C9231b();

        C9231b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("CommentTo", "get edit rich text error", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.g.d$a */
    public static final class C9230a<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f24851a;

        C9230a(Function1 function1) {
            this.f24851a = function1;
        }

        /* renamed from: a */
        public final void accept(String str) {
            Function1 function1 = this.f24851a;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            function1.invoke(str);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m38286e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        return StringsKt.trim(StringsKt.trim((CharSequence) str).toString(), '\n');
    }

    @JvmStatic
    /* renamed from: b */
    public static final JSONObject m38284b(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            return JSONObject.parseObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body");
        } catch (Throwable th) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", th);
            return jSONObject;
        }
    }

    /* renamed from: a */
    public final DataEntity.C9219Entity.BodyEntity mo35310a(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            DataEntity dataEntity = (DataEntity) JSON.parseObject(str, DataEntity.class);
            Intrinsics.checkExpressionValueIsNotNull(dataEntity, "result");
            DataEntity.C9219Entity data = dataEntity.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "result.data");
            return data.getBody();
        } catch (Exception unused) {
            C13479a.m54758a("CommentTo", "data format error: " + str);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<CommentBean> m38283a(List<CommentBean> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<CommentBean.CommentDetail> comment_list = it.next().getComment_list();
            Intrinsics.checkExpressionValueIsNotNull(comment_list, "commentBean.comment_list");
            for (T t : comment_list) {
                ReactionHelper hVar = ReactionHelper.f24886a;
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                hVar.mo35352a(t, t.getReaction(), t.getReaction_type(), t.getReferKey());
            }
        }
        return list;
    }

    @JvmStatic
    /* renamed from: d */
    public static final DataEntity.C9219Entity.BodyEntity.PublishEntity m38285d(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            DataEntity dataEntity = (DataEntity) JSON.parseObject(str, DataEntity.class);
            Intrinsics.checkExpressionValueIsNotNull(dataEntity, "result");
            DataEntity.C9219Entity data = dataEntity.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "result.data");
            DataEntity.C9219Entity.BodyEntity body = data.getBody();
            Intrinsics.checkExpressionValueIsNotNull(body, "result.data.body");
            return (DataEntity.C9219Entity.BodyEntity.PublishEntity) JSON.parseObject(body.getData(), DataEntity.C9219Entity.BodyEntity.PublishEntity.class);
        } catch (Exception unused) {
            C13479a.m54758a("CommentTo", "data format error: " + str);
            return null;
        }
    }

    /* renamed from: c */
    public final DataEntity.C9219Entity.BodyEntity.ResultEntity mo35312c(String str) {
        String str2;
        DataEntity.C9219Entity data;
        DataEntity.C9219Entity.BodyEntity body;
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            DataEntity dataEntity = (DataEntity) JSON.parseObject(str, DataEntity.class);
            if (dataEntity == null || (data = dataEntity.getData()) == null || (body = data.getBody()) == null || (str2 = body.getData()) == null) {
                str2 = "";
            }
            return (DataEntity.C9219Entity.BodyEntity.ResultEntity) JSON.parseObject(str2, DataEntity.C9219Entity.BodyEntity.ResultEntity.class);
        } catch (Exception unused) {
            C13479a.m54758a("CommentTo", "data format error: " + str);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<CommentBean> m38282a(String str, Action action) {
        List<CommentBean> list;
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(action, "action");
        try {
            Object parseObject = JSON.parseObject(str, DataEntity.class);
            Intrinsics.checkExpressionValueIsNotNull(parseObject, "JSON.parseObject(data, DataEntity::class.java)");
            DataEntity.C9219Entity data = ((DataEntity) parseObject).getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "JSON.parseObject(data, D…aEntity::class.java).data");
            DataEntity.C9219Entity.BodyEntity body = data.getBody();
            Intrinsics.checkExpressionValueIsNotNull(body, "JSON.parseObject(data, D…ty::class.java).data.body");
            String data2 = body.getData();
            if (action == Action.CHANGE) {
                Object parseObject2 = JSON.parseObject(data2, DataEntity.C9219Entity.BodyEntity.ResultEntity.class);
                Intrinsics.checkExpressionValueIsNotNull(parseObject2, "JSON.parseObject(result, ResultEntity::class.java)");
                DataEntity.C9219Entity.BodyEntity.ResultEntity.Comments allComments = ((DataEntity.C9219Entity.BodyEntity.ResultEntity) parseObject2).getAllComments();
                Intrinsics.checkExpressionValueIsNotNull(allComments, "JSON.parseObject(result,…::class.java).allComments");
                list = allComments.getComments();
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "card");
                    List<CommentBean.CommentDetail> comment_list = t.getComment_list();
                    Intrinsics.checkExpressionValueIsNotNull(comment_list, "card.comment_list");
                    for (T t2 : comment_list) {
                        Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                        t2.setComment_id(t.getComment_id());
                    }
                }
            } else if (action == Action.FETCH) {
                Object parseObject3 = JSON.parseObject(data2, DataEntity.C9219Entity.BodyEntity.ResultEntity.Comments.class);
                Intrinsics.checkExpressionValueIsNotNull(parseObject3, "JSON.parseObject(result, Comments::class.java)");
                list = ((DataEntity.C9219Entity.BodyEntity.ResultEntity.Comments) parseObject3).getComments();
                for (T t3 : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t3, "card");
                    List<CommentBean.CommentDetail> comment_list2 = t3.getComment_list();
                    Intrinsics.checkExpressionValueIsNotNull(comment_list2, "card.comment_list");
                    for (T t4 : comment_list2) {
                        Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                        t4.setComment_id(t3.getComment_id());
                    }
                }
            } else {
                Object parseObject4 = JSON.parseObject(data2, DataEntity.C9219Entity.BodyEntity.ResultEntity.class);
                Intrinsics.checkExpressionValueIsNotNull(parseObject4, "JSON.parseObject(result, ResultEntity::class.java)");
                list = CollectionsKt.mutableListOf(((DataEntity.C9219Entity.BodyEntity.ResultEntity) parseObject4).getComment());
            }
            return m38283a(list);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final Disposable mo35311a(AtEditText atEditText, Function1<? super String, Unit> function1) {
        Single<String> richText;
        Single<String> subscribeOn;
        Single<String> observeOn;
        Intrinsics.checkParameterIsNotNull(function1, "text");
        if (atEditText == null || (richText = atEditText.getRichText()) == null || (subscribeOn = richText.subscribeOn(C11678b.m48480d())) == null || (observeOn = subscribeOn.observeOn(C11678b.m48481e())) == null) {
            return null;
        }
        return observeOn.subscribe(new C9230a(function1), C9231b.f24852a);
    }
}
