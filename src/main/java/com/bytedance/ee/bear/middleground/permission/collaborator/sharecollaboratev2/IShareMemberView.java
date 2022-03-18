package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2;

import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;", "", "hideLockBanner", "", "hideSkeleton", "setCollaborateEnable", "enable", "", "showCollaborates", "userInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "count", "", "showErrorTips", "throwable", "", "showLockBanner", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.d */
public interface IShareMemberView {
    /* renamed from: a */
    void mo36753a();

    /* renamed from: a */
    void mo36755a(Throwable th);

    /* renamed from: a */
    void mo36756a(ArrayList<UserInfo> arrayList, int i);

    /* renamed from: b */
    void mo36757b();

    void setCollaborateEnable(boolean z);
}
