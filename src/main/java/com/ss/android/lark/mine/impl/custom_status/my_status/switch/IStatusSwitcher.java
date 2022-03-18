package com.ss.android.lark.mine.impl.custom_status.my_status.switch;

import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/IStatusSwitcher;", "", "getModifiedItemMap", "", "", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "map", "metas", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "getOpenId", "getUpdateStatusMetas", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.a */
public interface IStatusSwitcher {
    /* renamed from: a */
    List<UpdateUserCustomStatusMeta> mo160617a();

    /* renamed from: a */
    Map<Long, UserCustomStatus> mo160618a(Map<Long, UserCustomStatus> map, List<UpdateUserCustomStatusMeta> list);

    /* renamed from: b */
    long mo160619b();
}
