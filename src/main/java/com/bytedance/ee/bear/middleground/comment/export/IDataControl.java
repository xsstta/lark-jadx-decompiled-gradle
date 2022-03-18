package com.bytedance.ee.bear.middleground.comment.export;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/IDataControl;", "", "addTranslateComments", "", "beginSync", "token", "", "endSync", "filterData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "action", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getDetailReaction", "Lio/reactivex/Flowable;", "referType", "referKey", "setTranslateEnableLang", "translate", "commentId", "replyId", "updateToken", "newToken", "updateType", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.i */
public interface IDataControl {
    /* renamed from: a */
    void mo34705a(String str, Action action);

    /* renamed from: c */
    AbstractC68307f<String> mo34713c(String str, String str2);

    /* renamed from: d */
    AbstractC68307f<String> mo34715d(String str, String str2);

    /* renamed from: d */
    void mo34716d();

    /* renamed from: d */
    void mo34719d(String str);

    /* renamed from: e */
    void mo34717e();
}
