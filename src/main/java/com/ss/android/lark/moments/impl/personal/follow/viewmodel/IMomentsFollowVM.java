package com.ss.android.lark.moments.impl.personal.follow.viewmodel;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/IMomentsFollowVM;", "", "toastResId", "Landroidx/lifecycle/LiveData;", "", "getToastResId", "()Landroidx/lifecycle/LiveData;", "userList", "", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "getUserList", "changeFollowState", "", "user", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "userId", "", "count", "hasNextUserPage", "", "refreshUserList", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.a.b */
public interface IMomentsFollowVM {
    void changeFollowState(MomentUser momentUser);

    LiveData<Integer> getToastResId();

    LiveData<List<FollowMomentUser>> getUserList();

    void getUserList(String str, int i);

    boolean hasNextUserPage();

    void refreshUserList(String str, int i);
}
