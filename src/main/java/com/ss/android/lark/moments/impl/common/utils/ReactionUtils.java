package com.ss.android.lark.moments.impl.common.utils;

import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Reaction;
import com.bytedance.lark.pb.moments.v1.ReactionList;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0018\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J(\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/ReactionUtils;", "", "()V", "LOG_TAG", "", "calTotalReactionCount", "", "reactionList", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "convertToReactionFlowLayout", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "hasReaction", "", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "reactionKey", "parseReactionDetailViewModel", "reactions", "Lcom/bytedance/lark/pb/moments/v1/Reaction;", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "Lcom/bytedance/lark/pb/moments/v1/ReactionList;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.h */
public final class ReactionUtils {

    /* renamed from: a */
    public static final ReactionUtils f119254a = new ReactionUtils();

    private ReactionUtils() {
    }

    /* renamed from: a */
    public final List<C53061a> mo166213a(List<? extends ReactionDetailViewModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "reactionList");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            C53061a aVar = new C53061a();
            aVar.f131133a = t.getReactionKey();
            aVar.f131134b = t.getTotalCount();
            ArrayList arrayList2 = new ArrayList();
            List<DetailUserInfo> userInfoList = t.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "it.userInfoList");
            for (T t2 : userInfoList) {
                C53062b bVar = new C53062b();
                Intrinsics.checkExpressionValueIsNotNull(t2, "detailUserInfo");
                bVar.f131136a = t2.getUserId();
                bVar.f131137b = t2.getUserName();
                arrayList2.add(bVar);
            }
            aVar.f131135c = arrayList2;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo166214a(ReactionSet reactionSet, String str) {
        List<ReactionList> list;
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        if (reactionSet == null || (list = reactionSet.reactions) == null) {
            return false;
        }
        for (T t : list) {
            if (Intrinsics.areEqual(t.type, str)) {
                Boolean bool = t.self_involved;
                Intrinsics.checkExpressionValueIsNotNull(bool, "item.self_involved");
                return bool.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final ReactionDetailViewModel mo166212a(List<Reaction> list, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(list, "reactions");
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MomentUser momentUser = map.get(it.next().user_id);
            if (momentUser != null) {
                DetailUserInfo detailUserInfo = new DetailUserInfo();
                detailUserInfo.setUserName(momentUser.name);
                detailUserInfo.setUserId(momentUser.user_id);
                detailUserInfo.setAvatarKey(momentUser.avatar_key);
                arrayList.add(detailUserInfo);
            }
        }
        reactionDetailViewModel.setUserInfoList(arrayList);
        return reactionDetailViewModel;
    }

    /* renamed from: b */
    public final List<ReactionDetailViewModel> mo166215b(List<ReactionList> list, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
                reactionDetailViewModel.setReactionKey(t.type);
                Integer num = t.count;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.count");
                reactionDetailViewModel.setTotalCount(num.intValue());
                Boolean bool = t.self_involved;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.self_involved");
                reactionDetailViewModel.setSelfInvoke(bool.booleanValue());
                ArrayList arrayList2 = new ArrayList();
                List<String> list2 = t.first_page_user_ids;
                Intrinsics.checkExpressionValueIsNotNull(list2, "it.first_page_user_ids");
                for (T t2 : list2) {
                    MomentUser momentUser = map.get(t2);
                    if (momentUser != null) {
                        DetailUserInfo detailUserInfo = new DetailUserInfo();
                        detailUserInfo.setAvatarKey(momentUser.avatar_key);
                        detailUserInfo.setUserId(momentUser.user_id);
                        detailUserInfo.setUserName(momentUser.name);
                        arrayList2.add(detailUserInfo);
                    } else {
                        Log.m165383e("moments_reaction_utils", "Failed to find user in userMap when parsing reaction, userId is:" + ((String) t2));
                    }
                }
                reactionDetailViewModel.setUserInfoList(arrayList2);
                arrayList.add(reactionDetailViewModel);
            }
        }
        return arrayList;
    }
}
