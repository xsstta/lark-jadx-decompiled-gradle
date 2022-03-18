package com.bytedance.ee.bear.middleground.comment.uitls;

import com.bytedance.ee.bear.middleground.comment.export.IReactionHelper;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReactionDetailUserInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011J2\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/uitls/ReactionHelper;", "", "()V", "menuItemRes", "Ljava/util/HashMap;", "", "", "sReactionHelper", "Lcom/bytedance/ee/bear/middleground/comment/export/IReactionHelper;", "getInterface", "getMenuIconById", "menuId", "reaction2DetailViewModel", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "reaction", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/Reaction;", "reactions2DetailViewModels", "", "reactions", "resolveReactionData", "", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionList", "", "referType", "referKey", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.g.h */
public final class ReactionHelper {

    /* renamed from: a */
    public static final ReactionHelper f24886a = new ReactionHelper();

    /* renamed from: b */
    private static final HashMap<String, Integer> f24887b;

    /* renamed from: c */
    private static final IReactionHelper f24888c = new C9235a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J4\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u001a"}, d2 = {"com/bytedance/ee/bear/middleground/comment/uitls/ReactionHelper$sReactionHelper$1", "Lcom/bytedance/ee/bear/middleground/comment/export/IReactionHelper;", "getMenuIconById", "", "menuId", "", "reactions2DetailViewModels", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "reactions", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/Reaction;", "reportShowReactionPage", "", "token", "documentType", "isWiki", "", "subFileType", "referKey", "isOwner", "resolveReactionData", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionList", "", "referType", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.g.h$a */
    public static final class C9235a implements IReactionHelper {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "isOwner"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.g.h$a$a */
        static final class C9236a implements AbstractC9234g {

            /* renamed from: a */
            final /* synthetic */ boolean f24889a;

            C9236a(boolean z) {
                this.f24889a = z;
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g
            public final boolean isOwner() {
                return this.f24889a;
            }
        }

        C9235a() {
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.IReactionHelper
        /* renamed from: a */
        public List<ReactionDetailViewModel> mo35288a(List<? extends Reaction> list) {
            return ReactionHelper.f24886a.mo35351a(list);
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.IReactionHelper
        /* renamed from: a */
        public int mo35287a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "menuId");
            return ReactionHelper.f24886a.mo35350a(str);
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.IReactionHelper
        /* renamed from: a */
        public void mo35289a(CommentBean.CommentDetail commentDetail, List<Reaction> list, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
            ReactionHelper.f24886a.mo35352a(commentDetail, list, str, str2);
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.IReactionHelper
        /* renamed from: a */
        public void mo35290a(String str, String str2, boolean z, String str3, String str4, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "documentType");
            Intrinsics.checkParameterIsNotNull(str3, "subFileType");
            Intrinsics.checkParameterIsNotNull(str4, "referKey");
            new C9226a(str, str2, z, str3, true, new C9236a(z2)).mo35303a("show_reaction_page", null, null, str4, true);
        }
    }

    private ReactionHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final IReactionHelper m38334a() {
        return f24888c;
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f24887b = hashMap;
        hashMap.put("COPY", Integer.valueOf((int) R.drawable.ud_icon_copy_outlined));
        hashMap.put("EDIT", Integer.valueOf((int) R.drawable.ud_icon_edit_outlined));
        hashMap.put("DELETE", Integer.valueOf((int) R.drawable.ud_icon_delete_trash_outlined));
        hashMap.put("RESOLVE", Integer.valueOf((int) R.drawable.ud_icon_yes_outlined));
        hashMap.put("TRANSLATE", Integer.valueOf((int) R.drawable.ud_icon_translate_outlined));
        hashMap.put("REPLY", Integer.valueOf((int) R.drawable.ud_icon_reply_cn_outlined));
    }

    /* renamed from: a */
    public final int mo35350a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "menuId");
        HashMap<String, Integer> hashMap = f24887b;
        if (!hashMap.containsKey(str)) {
            return -1;
        }
        Integer num = hashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: a */
    private final ReactionDetailViewModel m38335a(Reaction reaction) {
        ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
        reactionDetailViewModel.setReactionKey(reaction.getReactionKey());
        reactionDetailViewModel.setTotalCount(reaction.getTotalCount());
        reactionDetailViewModel.setUserInfoList(new ArrayList());
        List<ReactionDetailUserInfo> userList = reaction.getUserList();
        if (userList != null) {
            for (T t : userList) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                reactionDetailViewModel.getUserInfoList().add(new DetailUserInfo(t.getAvatarKey(), t.getAvatarUrl(), t.getUserName(), t.getUserId(), t.isRegistered(), t.getDescription(), t.getDescType(), t.getWorkStatusDesc()));
            }
        }
        return reactionDetailViewModel;
    }

    /* renamed from: a */
    public final List<ReactionDetailViewModel> mo35351a(List<? extends Reaction> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f24886a.m38335a((Reaction) it.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo35352a(CommentBean.CommentDetail commentDetail, List<Reaction> list, String str, String str2) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        if (list != null) {
            arrayList = list;
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        commentDetail.setFull(true);
        for (Reaction reaction : CollectionsKt.filterNotNull(arrayList)) {
            C53061a aVar = new C53061a();
            aVar.f131133a = reaction.getReactionKey();
            aVar.f131134b = reaction.getTotalCount();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            List<ReactionDetailUserInfo> userList = reaction.getUserList();
            Intrinsics.checkExpressionValueIsNotNull(userList, "reaction.userList");
            for (ReactionDetailUserInfo reactionDetailUserInfo : CollectionsKt.filterNotNull(userList)) {
                arrayList4.add(new C53062b(reactionDetailUserInfo.getUserId(), reactionDetailUserInfo.getUserName()));
                arrayList5.add(new DetailUserInfo(reactionDetailUserInfo.getAvatarKey(), reactionDetailUserInfo.getAvatarUrl(), reactionDetailUserInfo.getUserName(), reactionDetailUserInfo.getUserId(), reactionDetailUserInfo.isRegistered(), reactionDetailUserInfo.getDescription(), reactionDetailUserInfo.getDescType(), reactionDetailUserInfo.getWorkStatusDesc()));
            }
            aVar.f131135c = arrayList4;
            arrayList2.add(aVar);
            ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
            reactionDetailViewModel.setReactionKey(reaction.getReactionKey());
            reactionDetailViewModel.setTotalCount(reaction.getTotalCount());
            reactionDetailViewModel.setUserInfoList(arrayList5);
            arrayList3.add(reactionDetailViewModel);
            if (reaction.getTotalCount() != reaction.getUserList().size()) {
                commentDetail.setFull(false);
            }
        }
        commentDetail.setReactionFlowData(arrayList2);
        commentDetail.setReactionDetailData(arrayList3);
        commentDetail.setReaction_type(str);
        commentDetail.setReferKey(str2);
        commentDetail.setReaction(list);
    }
}
