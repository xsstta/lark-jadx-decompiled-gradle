package com.bytedance.ee.bear.middleground.like.export;

import com.bytedance.ee.bear.middleground.like.export.LikePushBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.like.export.a */
public class C9531a {
    /* renamed from: a */
    public static List<String> m39367a(LikePushBean likePushBean) {
        ArrayList arrayList = new ArrayList();
        if (likePushBean != null && !C13657b.m55421a(likePushBean.getAhead_users())) {
            for (LikePushBean.AheadUsersBean aheadUsersBean : likePushBean.getAhead_users()) {
                arrayList.add(aheadUsersBean.getAvatar_url());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m39369a(LikeUserList likeUserList) {
        if (likeUserList == null || likeUserList.getIds() == null || likeUserList.getLikes() == null || likeUserList.getUsers() == null) {
            C13479a.m54758a("LikeUtils", "likeUserList is null");
            return false;
        } else if (likeUserList.getIds().size() == likeUserList.getUsers().size() && likeUserList.getIds().size() == likeUserList.getLikes().size()) {
            return true;
        } else {
            C13479a.m54758a("LikeUtils", "likeUserList size is not correct");
            return false;
        }
    }

    /* renamed from: b */
    private static String m39370b(LikeUserList likeUserList, int i) {
        UsersBean usersBean;
        LikesBean likesBean = likeUserList.getLikes().get(likeUserList.getIds().get(i));
        if (likesBean == null || (usersBean = likeUserList.getUsers().get(likesBean.getUser_id())) == null) {
            return "";
        }
        return usersBean.getAvatar_url();
    }

    /* renamed from: a */
    public static List<String> m39368a(LikeUserList likeUserList, int i) {
        ArrayList arrayList = new ArrayList();
        if (m39369a(likeUserList)) {
            int min = Math.min(likeUserList.getIds().size(), i);
            for (int i2 = 0; i2 < min; i2++) {
                arrayList.add(m39370b(likeUserList, i2));
            }
        }
        return arrayList;
    }
}
