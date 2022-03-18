package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH&J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH&J\u0012\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\fH&J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\fH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeed;", "", "messageConfig", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;", "getMessageConfig", "()Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;", "setMessageConfig", "(Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;)V", "destroy", "", "hide", "isShowing", "", "pullData", "Lio/reactivex/Flowable;", "", "isOwner", "options", "readMessage", "messageIds", "", "removeDoc", "token", "show", "fromLarkFeed", "toComment", "enter", "updateBadge", "badge", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "updateDataToUI", "messageResultBean", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageResultBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-feed-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.export.bean.d */
public interface IFeed {
    /* renamed from: a */
    AbstractC68307f<String> mo35878a(boolean z, String str);

    /* renamed from: a */
    void mo35879a();

    /* renamed from: a */
    void mo35880a(MessageConfig messageConfig);

    /* renamed from: a */
    void mo35881a(MessageResultBean messageResultBean);

    /* renamed from: a */
    void mo35882a(String str);

    /* renamed from: a */
    void mo35883a(List<String> list);

    /* renamed from: a */
    void mo35884a(boolean z);

    /* renamed from: b */
    void mo35885b(String str);

    /* renamed from: b */
    void mo35886b(boolean z);

    /* renamed from: b */
    boolean mo35887b();

    /* renamed from: c */
    MessageConfig mo35888c();

    /* renamed from: d */
    void mo35889d();
}
