package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0018J \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnReactionProtocol;", "", "addReaction", "Lio/reactivex/Flowable;", "", "replyId", "reactionKey", "getDetailReaction", "referType", "referKey", "registerReactionObserver", "", "observer", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol$ReactionDataObserver;", "removeReaction", "setDetailReaction", UpdateKey.STATUS, "", "unregisterCommentDataObserver", "updateDocToken", "docToken", "updateDocumentType", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "ReactionDataObserver", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.h */
public interface RnReactionProtocol {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnReactionProtocol$ReactionDataObserver;", "", "updateReactionDetail", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.h$a */
    public interface ReactionDataObserver {
        /* renamed from: a */
        void mo34384a(String str);
    }

    /* renamed from: a */
    AbstractC68307f<String> mo40347a(String str, String str2);

    /* renamed from: a */
    AbstractC68307f<String> mo40348a(String str, String str2, int i);

    /* renamed from: a */
    void mo40349a();

    /* renamed from: a */
    void mo40350a(C8275a aVar);

    /* renamed from: a */
    void mo40351a(ReactionDataObserver aVar);

    /* renamed from: a */
    void mo40352a(String str);

    /* renamed from: b */
    AbstractC68307f<String> mo40353b(String str, String str2);

    /* renamed from: c */
    AbstractC68307f<String> mo40354c(String str, String str2);
}
