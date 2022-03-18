package com.ss.android.lark.moments.impl.commonvo;

import android.content.Context;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\b\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "Lcom/larksuite/framework/utils/diff/Diffable;", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "isFollowed", "", "()Z", "isOngoingFollow", "nameIndex", "getNameIndex", "userId", "getUserId", "userName", "getUserName", "userType", "Lcom/bytedance/lark/pb/moments/v1/MomentUser$Type;", "getUserType", "()Lcom/bytedance/lark/pb/moments/v1/MomentUser$Type;", "clickFollowing", "", "clickUser", "context", "Landroid/content/Context;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.c */
public interface IMomentsUser extends AbstractC26248b<IMomentsUser> {
    /* renamed from: a */
    String mo166361a();

    /* renamed from: a */
    void mo166362a(Context context);

    /* renamed from: b */
    String mo166363b();

    /* renamed from: c */
    String mo166364c();

    /* renamed from: d */
    String mo166365d();

    /* renamed from: e */
    boolean mo166366e();

    /* renamed from: f */
    boolean mo166367f();

    /* renamed from: g */
    MomentUser.Type mo166368g();

    /* renamed from: h */
    void mo166369h();
}
