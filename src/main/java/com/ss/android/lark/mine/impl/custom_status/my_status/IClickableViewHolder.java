package com.ss.android.lark.mine.impl.custom_status.my_status;

import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/IClickableViewHolder;", "", "clickOnCustomTime", "", "item", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "customTime", "", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Ljava/lang/Long;)V", "clickOnDuration", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "clickOnHeader", "clickOnMoreSetting", "clickOnPullIcon", "newPullId", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a */
public interface IClickableViewHolder {
    /* renamed from: a */
    void mo160612a(long j);

    /* renamed from: a */
    void mo160613a(UserCustomStatus userCustomStatus);

    /* renamed from: a */
    void mo160614a(UserCustomStatus userCustomStatus, UserCustomStatusDuration userCustomStatusDuration);

    /* renamed from: a */
    void mo160615a(UserCustomStatus userCustomStatus, Long l);

    /* renamed from: b */
    void mo160616b(UserCustomStatus userCustomStatus);
}
