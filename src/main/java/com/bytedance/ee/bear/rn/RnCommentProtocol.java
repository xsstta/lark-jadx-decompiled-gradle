package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u00017J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J°\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019H&J \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H&J\u0014\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&J\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0006H&J^\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0006H&J\u0001\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019H&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0006H&J\b\u0010(\u001a\u00020\u0003H&J-\u0010)\u001a\u00020\u00032\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+2\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0002\u0010,J \u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\u0012\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0006H&J\u0010\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0006H&J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u000206H&¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnCommentProtocol;", "", "addTranslateComments", "", "beginSync", "token", "", "createComment", "Lio/reactivex/Flowable;", Comment.f24093e, "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "whole", "", "quote", "tempId", "isAudio", "parentType", "parentToken", "commentId", "replyId", "localCommentId", "position", "bizParams", "", "deleteComment", "endSync", "fetchComment", "fetchMessage", "owner", "options", "modifyComment", "registerCommentDataObserver", "observer", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol$CommentDataObserver;", "registerMessageDataObserver", "reopenComment", "replyComment", "resolveComment", "setTranslateEnableLang", "solveMessage", "messageIds", "", "([Ljava/lang/String;ZLjava/lang/String;)V", "translate", "unregisterCommentDataObserver", "unregisterMessageObserver", "updateAppId", "appId", "updateDocToken", "docToken", "updateDocumentType", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "CommentDataObserver", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.c */
public interface RnCommentProtocol {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnCommentProtocol$CommentDataObserver;", "", "didReceiveCommentData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.c$a */
    public interface CommentDataObserver {
        /* renamed from: a */
        void mo34720a(String str);
    }

    /* renamed from: a */
    AbstractC68307f<String> mo40312a(String str, String str2);

    /* renamed from: a */
    AbstractC68307f<String> mo40313a(String str, String str2, String str3, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo40314a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, boolean z, String str5, String str6, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo40315a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo40316a(boolean z, String str);

    /* renamed from: a */
    void mo40317a();

    /* renamed from: a */
    void mo40318a(C8275a aVar);

    /* renamed from: a */
    void mo40319a(CommentDataObserver aVar);

    /* renamed from: a */
    void mo40320a(String str);

    /* renamed from: a */
    void mo40321a(String[] strArr, boolean z, String str);

    /* renamed from: b */
    AbstractC68307f<String> mo40322b(String str, String str2);

    /* renamed from: b */
    void mo40323b();

    /* renamed from: b */
    void mo40324b(CommentDataObserver aVar);

    /* renamed from: b */
    void mo40325b(String str);

    /* renamed from: c */
    AbstractC68307f<String> mo40326c();

    /* renamed from: c */
    void mo40327c(String str);

    /* renamed from: d */
    void mo40328d();

    /* renamed from: d */
    void mo40329d(String str);

    /* renamed from: e */
    AbstractC68307f<String> mo40330e(String str);

    /* renamed from: e */
    void mo40331e();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.c$b */
    public static final class C10635b {
        /* renamed from: a */
        public static /* synthetic */ void m44206a(RnCommentProtocol cVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                cVar.mo40325b(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endSync");
        }
    }
}
