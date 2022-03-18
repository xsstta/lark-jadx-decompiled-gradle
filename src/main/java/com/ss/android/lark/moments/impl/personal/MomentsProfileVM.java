package com.ss.android.lark.moments.impl.personal;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.FeedEntry;
import com.bytedance.lark.pb.moments.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.moments.v1.ListUserPostsResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionList;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.bytedance.lark.pb.moments.v1.UserProfile;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import com.ss.android.lark.moments.impl.feed.model.matcher.HotCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.KeyMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ProfileMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ReplyCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentDeleteUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostDistributionTypeUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplyCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\\B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020\u0007H\u0016J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u0007H\u0002J9\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u0015J \u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020$H\u0014J\u0018\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020=H\u0016J\u001c\u0010>\u001a\u00020$2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020A0@H\u0016J6\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020\u00162\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0016H\u0016J*\u0010K\u001a\u00020$2 \u0010L\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020M0@\u0018\u00010@H\u0016J0\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020\u00162\b\u0010P\u001a\u0004\u0018\u00010Q2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020A\u0018\u00010@H\u0016J\u0018\u0010S\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u0007H\u0016J\u0010\u0010U\u001a\u00020$2\u0006\u00102\u001a\u00020\u0015H\u0016J\b\u0010V\u001a\u00020$H\u0016J\u0010\u0010W\u001a\u00020$2\u0006\u0010X\u001a\u00020\u0007H\u0016J\u0010\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020\u0015H\u0016J\u0010\u0010[\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u000e\u0010\u001a\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileVM;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "Lcom/ss/android/lark/moments/impl/personal/IMomentsProfileVM;", "()V", "completeRefresh", "Landroidx/lifecycle/MutableLiveData;", "", "getCompleteRefresh", "()Landroidx/lifecycle/MutableLiveData;", "isSelf", "()Z", "setSelf", "(Z)V", "mIsLoadMore", "mPushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "needRefresh", "getNeedRefresh", "showErrorPage", "Lkotlin/Pair;", "", "", "getShowErrorPage", "toastResId", "getToastResId", "token", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userName", "getUserName", "canLoadMore", "handleUserPostsResponse", "", "response", "Lcom/bytedance/lark/pb/moments/v1/ListUserPostsResponse;", "isLoadMore", "handleUserProfileResponse", "r", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/GetUserProfileResponse;", "isLocal", "isInit", "(Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initData", "postCount", "loadMorePostData", "count", "firstTime", "needShowFrom", "onCleared", "onPushDistributionChanged", "postId", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushMomentUser", "newUserMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onPushPostStatusChanged", "localPostId", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "errorMessage", "onPushPreviewChanged", "updateMaps", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "id", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "onPushUserFollow", "isFollow", "refreshData", "reloadProfileData", "showCircleLoading", "isLoading", "toastString", "resId", "userChanged", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.k */
public final class MomentsProfileVM extends MomentsBaseViewModel implements MomentsPushHandler.IMomentsPushListener {
    public static final Companion Companion = new Companion(null);
    private final C1177w<Boolean> completeRefresh = new C1177w<>();
    private boolean isSelf;
    public boolean mIsLoadMore;
    private final MomentsPushHandler mPushHandler;
    private final C1177w<Boolean> needRefresh;
    private final C1177w<Pair<Integer, String>> showErrorPage;
    private final C1177w<Integer> toastResId = new C1177w<>();
    public String token = "";
    private String userId = "";
    private final C1177w<String> userName = new C1177w<>();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"handleUserProfileResponse", "", "r", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/GetUserProfileResponse;", "userId", "", "isLocal", "", "isInit", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.MomentsProfileVM", mo239173f = "MomentsProfileVM.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {251}, mo239176m = "handleUserProfileResponse", mo239177n = {"this", "r", "userId", "isLocal", "isInit", "response", "user", "profile", "avatarImage"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "Z$1", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$b */
    public static final class C47866b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsProfileVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47866b(MomentsProfileVM kVar, Continuation cVar) {
            super(cVar);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUserProfileResponse(null, null, false, false, this);
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public boolean needShowFrom() {
        return true;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void showCircleLoading(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileVM$Companion;", "", "()V", "LOG_TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1177w<Boolean> getCompleteRefresh() {
        return this.completeRefresh;
    }

    public final C1177w<Boolean> getNeedRefresh() {
        return this.needRefresh;
    }

    public final C1177w<Pair<Integer, String>> getShowErrorPage() {
        return this.showErrorPage;
    }

    public C1177w<Integer> getToastResId() {
        return this.toastResId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public C1177w<String> getUserName() {
        return this.userName;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public boolean canLoadMore() {
        return !StringsKt.isBlank(this.token);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        super.onCleared();
        this.mPushHandler.mo167188b();
    }

    public void reloadProfileData() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47870f(this, null), 2, null);
    }

    public MomentsProfileVM() {
        MomentsPushHandler cVar = new MomentsPushHandler(this);
        this.mPushHandler = cVar;
        cVar.mo167187a();
        this.needRefresh = new C1177w<>();
        this.showErrorPage = new C1177w<>();
    }

    public final void setSelf(boolean z) {
        this.isSelf = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileVM$userChanged$1", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$g */
    public static final class C47871g implements IMomentsUpdater {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileVM f120575a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47871g(MomentsProfileVM kVar) {
            this.f120575a = kVar;
        }

        @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
        /* renamed from: a */
        public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
            MomentsProfileItem iVar;
            MomentsUserVM b;
            MomentUser i;
            String str;
            UserProfile c;
            List<AvatarImage> d;
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
            if (iMomentsItemBase instanceof MomentsPostVM) {
                MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
                MomentsProfileVM kVar = this.f120575a;
                String str2 = fVar.mo166421F().user_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "item.post.user_id");
                MomentsUserVM user = kVar.getUser(str2);
                MomentsProfileVM kVar2 = this.f120575a;
                return MomentsPostVM.m187537a(fVar, null, user, null, null, null, kVar2, null, kVar2.needShowFrom(), null, null, null, 1885, null);
            } else if (!(iMomentsItemBase instanceof MomentsProfileItem) || (b = (iVar = (MomentsProfileItem) iMomentsItemBase).mo167651b()) == null || (i = b.mo166471i()) == null || (str = i.user_id) == null || (c = iVar.mo167652c()) == null || (d = iVar.mo167653d()) == null) {
                return iMomentsItemBase;
            } else {
                return new MomentsProfileItem(this.f120575a.getUser(str), c, d, this.f120575a.isSelf(), iVar.mo167655f());
            }
        }
    }

    public final void setUserId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userId = str;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void toastString(int i) {
        getToastResId().mo5926a(Integer.valueOf(i));
    }

    public void refreshData(int i) {
        this.token = "";
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47869e(this, i, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void userChanged(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        updateDataList(new ProfileMatcher(str), new C47871g(this));
    }

    public final void initData(int i) {
        this.token = "";
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MomentsProfileHeaderLoadingItem());
        arrayList.add(new MomentsPostLoadingItem(false, 1, null));
        getDataList().mo5926a(arrayList);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47867c(this, i, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "newUserMap");
        getUserMap().putAll(map);
        Iterator<T> it = map.keySet().iterator();
        while (it.hasNext()) {
            userChanged(it.next());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.MomentsProfileVM$loadMorePostData$1", mo239173f = "MomentsProfileVM.kt", mo239174i = {0}, mo239175l = {135}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$d */
    public static final class C47868d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        final /* synthetic */ boolean $firstTime;
        final /* synthetic */ boolean $isLoadMore;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47868d(MomentsProfileVM kVar, int i, boolean z, boolean z2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = kVar;
            this.$count = i;
            this.$isLoadMore = z;
            this.$firstTime = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47868d dVar = new C47868d(this.this$0, this.$count, this.$isLoadMore, this.$firstTime, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47868d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.this$0.mIsLoadMore) {
                    return Unit.INSTANCE;
                }
                this.this$0.mIsLoadMore = true;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.this$0.token;
                String userId = this.this$0.getUserId();
                int i2 = this.$count;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167242b(str, userId, i2, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.handleUserPostsResponse((ListUserPostsResponse) obj, this.$isLoadMore);
            this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(this.$firstTime));
            this.this$0.mIsLoadMore = false;
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.MomentsProfileVM$reloadProfileData$1", mo239173f = "MomentsProfileVM.kt", mo239174i = {0, 1, 1}, mo239175l = {SmEvents.EVENT_UA_ERROR, 146}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$f */
    public static final class C47870f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47870f(MomentsProfileVM kVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47870f fVar = new C47870f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47870f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope ahVar;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String userId = this.this$0.getUserId();
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167233a(userId, false, (Continuation<? super SdkResponse<GetUserProfileResponse>>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                SdkResponse cVar = (SdkResponse) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar2 = (SdkResponse) obj;
            if (cVar2 != null) {
                MomentsProfileVM kVar = this.this$0;
                String userId2 = kVar.getUserId();
                this.L$0 = ahVar;
                this.L$1 = cVar2;
                this.label = 2;
                if (MomentsProfileVM.handleUserProfileResponse$default(kVar, cVar2, userId2, false, false, this, 8, null) == a) {
                    return a;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Map<String, ? extends UrlPreviewEntity>> entry : map.entrySet()) {
                MomentsProfileVM kVar = this;
                updateDataList(new KeyMatcher(entry.getKey()), new PreviewUpdater((Map) entry.getValue(), kVar));
                updateDataList(new HotCommentMatcher(entry.getKey()), new HotCommentPreviewUpdater(entry.getKey(), (Map) entry.getValue(), kVar));
                updateDataList(new ReplyCommentMatcher(entry.getKey()), new ReplyCommentPreviewUpdater((Map) entry.getValue(), this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.MomentsProfileVM$refreshData$1", mo239173f = "MomentsProfileVM.kt", mo239174i = {0, 1, 1, 2}, mo239175l = {118, 119, SmActions.ACTION_INIT_ENTRY}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$e */
    public static final class C47869e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47869e(MomentsProfileVM kVar, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = kVar;
            this.$count = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47869e eVar = new C47869e(this.this$0, this.$count, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47869e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.MomentsProfileVM.C47869e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.MomentsProfileVM$initData$1", mo239173f = "MomentsProfileVM.kt", mo239174i = {0, 1, 1, 2, 3, 3, 4}, mo239175l = {97, 98, 101, 103, 106}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.k$c */
    public static final class C47867c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postCount;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileVM this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47867c(MomentsProfileVM kVar, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = kVar;
            this.$postCount = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47867c cVar2 = new C47867c(this.this$0, this.$postCount, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47867c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.MomentsProfileVM.C47867c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushBroadcastChanged(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188472b(this, str, z);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentSetChanged(String str, CommentSet commentSet) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188464a(this, str, commentSet);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewCommentUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188471b(this, str, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewPostUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188465a(this, str, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostEntityChanged(Post post, Entities entities) {
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188461a(this, post, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushShareCountChanged(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188462a(this, str, i);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushUserFollow(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        reloadProfileData();
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushDistributionChanged(String str, Post.PostDistributionType postDistributionType) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
        updateDataList(new KeyMatcher(str), new PostDistributionTypeUpdater(postDistributionType, this));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushEntityDeleted(String str, EntityType entityType) {
        int i;
        UserProfile.C18564a newBuilder;
        UserProfile.C18564a a;
        Integer num;
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        if (entityType == EntityType.POST) {
            List<IMomentsItemBase> b = getDataList().mo5927b();
            if (b == null) {
                b = new ArrayList<>();
            }
            ArrayList<IMomentsItemBase> arrayList = new ArrayList(b);
            UserProfile userProfile = null;
            IMomentsPost bVar = null;
            boolean z = false;
            for (IMomentsItemBase iMomentsItemBase : arrayList) {
                if (iMomentsItemBase instanceof IMomentsPost) {
                    if (Intrinsics.areEqual(str, iMomentsItemBase.mo166379a())) {
                        bVar = (IMomentsPost) iMomentsItemBase;
                    } else {
                        z = true;
                    }
                }
            }
            if (bVar != null) {
                arrayList.remove(bVar);
            }
            if (!z) {
                arrayList.add(new MomentsProfileEmptyPostItem(this.isSelf));
                this.token = "";
            }
            Object obj = arrayList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(obj, "finalList[0]");
            IMomentsItemBase iMomentsItemBase2 = (IMomentsItemBase) obj;
            if (iMomentsItemBase2 instanceof IMomentsProfile) {
                IMomentsProfile aVar = (IMomentsProfile) iMomentsItemBase2;
                UserProfile c = aVar.mo167652c();
                if (c == null || (num = c.posts_count) == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                int i2 = i - 1;
                UserProfile c2 = aVar.mo167652c();
                if (!(c2 == null || (newBuilder = c2.newBuilder()) == null || (a = newBuilder.mo64017a(Integer.valueOf(Math.max(i2, 0)))) == null)) {
                    userProfile = a.build();
                }
                MomentsProfileItem iVar = new MomentsProfileItem(aVar.mo167651b(), userProfile, aVar.mo167653d(), aVar.mo167654e(), aVar.mo167655f());
                arrayList.remove(0);
                arrayList.add(0, iVar);
            }
            getDataList().mo5926a(new CopyOnWriteArrayList(arrayList));
        } else if (entityType == EntityType.COMMENT) {
            updateDataList(new HotCommentMatcher(str), new HotCommentDeleteUpdater(str, this));
        }
    }

    public final void handleUserPostsResponse(ListUserPostsResponse listUserPostsResponse, boolean z) {
        ArrayList arrayList;
        boolean z2;
        Category category;
        Map<String, PreviewEntityPair> map;
        List<ReactionList> list;
        Entities entities;
        Map<String, Category> map2;
        List<String> list2;
        Post post;
        Map<String, Post> map3;
        ArrayList arrayList2;
        boolean z3;
        Category category2;
        Map<String, PreviewEntityPair> map4;
        List<ReactionList> list3;
        Entities entities2;
        Map<String, Category> map5;
        List<String> list4;
        Post post2;
        Map<String, Post> map6;
        Map<String, Comment> map7;
        Map<String, PreviewEntityPair> map8;
        List<ReactionList> list5;
        boolean z4;
        Map<String, Post> map9;
        Post post3;
        Boolean bool;
        Map<String, MomentUser> map10;
        if (listUserPostsResponse == null) {
            MomentsAppreciableHitPoint.m187967a(MomentsAppreciableHitPoint.f119684a, MomentsAppreciableHitPoint.f119684a.mo166751e(), true, ErrorType.SDK, 0, 8, null);
            return;
        }
        String str = listUserPostsResponse.next_page_token;
        Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
        this.token = str;
        Entities entities3 = listUserPostsResponse.entities;
        if (!(entities3 == null || (map10 = entities3.users) == null)) {
            getUserMap().putAll(map10);
            Unit unit = Unit.INSTANCE;
        }
        HashMap hashMap = new HashMap();
        Entities entities4 = listUserPostsResponse.entities;
        int i = 0;
        if (!(entities4 == null || (map7 = entities4.comments) == null)) {
            for (Map.Entry<String, Comment> entry : map7.entrySet()) {
                String str2 = entry.getValue().id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.value.id");
                Map<String, UrlPreviewHangPoint> map11 = entry.getValue().url_preview_hang_point_map;
                Entities entities5 = listUserPostsResponse.entities;
                if (entities5 != null) {
                    map8 = entities5.preview_entities;
                } else {
                    map8 = null;
                }
                Map<String, PreviewHangPoint> parserPreviews = parserPreviews(str2, map11, map8);
                HashMap hashMap2 = hashMap;
                String key = entry.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                Comment value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                Comment comment = value;
                String str3 = entry.getValue().user_id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.value.user_id");
                MomentsUserVM user = getUser(str3);
                ReactionUtils hVar = ReactionUtils.f119254a;
                ReactionSet reactionSet = entry.getValue().reaction_set;
                if (reactionSet != null) {
                    list5 = reactionSet.reactions;
                } else {
                    list5 = null;
                }
                List<ReactionDetailViewModel> b = hVar.mo166215b(list5, getUserMap());
                MomentsProfileVM kVar = this;
                Entities entities6 = listUserPostsResponse.entities;
                if (entities6 == null || (map9 = entities6.posts) == null || (post3 = map9.get(entry.getValue().post_id)) == null || (bool = post3.is_anonymous) == null) {
                    z4 = false;
                } else {
                    z4 = bool.booleanValue();
                }
                hashMap2.put(key, new MomentsCommentVM(comment, user, b, parserPreviews, kVar, z4, null, null, null, null, 960, null));
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (z) {
            List<IMomentsItemBase> b2 = getDataList().mo5927b();
            if (b2 == null) {
                b2 = new ArrayList<>();
            }
            ArrayList arrayList3 = new ArrayList(b2);
            List<FeedEntry> list6 = listUserPostsResponse.entry_list;
            if (list6 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (T t : list6) {
                    Entities entities7 = listUserPostsResponse.entities;
                    if (entities7 == null || (map6 = entities7.posts) == null) {
                        post2 = null;
                    } else {
                        post2 = map6.get(t.post_id);
                    }
                    if (post2 != null) {
                        arrayList4.add(post2);
                    }
                }
                ArrayList<Post> arrayList5 = arrayList4;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                for (Post post4 : arrayList5) {
                    CommentSet commentSet = post4.comment_set;
                    if (commentSet == null || (list4 = commentSet.comment_ids) == null) {
                        arrayList2 = null;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator<T> it = list4.iterator();
                        while (it.hasNext()) {
                            MomentsCommentVM eVar = (MomentsCommentVM) hashMap.get(it.next());
                            if (eVar != null) {
                                arrayList7.add(eVar);
                            }
                        }
                        arrayList2 = arrayList7;
                    }
                    List<String> list7 = post4.category_ids;
                    if (list7 == null || list7.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || (entities2 = listUserPostsResponse.entities) == null || (map5 = entities2.categories) == null) {
                        category2 = null;
                    } else {
                        category2 = map5.get(post4.category_ids.get(0));
                    }
                    String str4 = post4.id;
                    Intrinsics.checkExpressionValueIsNotNull(str4, "it.id");
                    Map<String, UrlPreviewHangPoint> map12 = post4.url_preview_hang_point_map;
                    Entities entities8 = listUserPostsResponse.entities;
                    if (entities8 != null) {
                        map4 = entities8.preview_entities;
                    } else {
                        map4 = null;
                    }
                    Map<String, PreviewHangPoint> parserPreviews2 = parserPreviews(str4, map12, map4);
                    String str5 = post4.user_id;
                    Intrinsics.checkExpressionValueIsNotNull(str5, "it.user_id");
                    MomentsUserVM user2 = getUser(str5);
                    ReactionUtils hVar2 = ReactionUtils.f119254a;
                    ReactionSet reactionSet2 = post4.reaction_set;
                    if (reactionSet2 != null) {
                        list3 = reactionSet2.reactions;
                    } else {
                        list3 = null;
                    }
                    arrayList6.add(Boolean.valueOf(arrayList3.add(new MomentsPostVM(post4, user2, arrayList2, hVar2.mo166215b(list3, getUserMap()), parserPreviews2, this, category2, needShowFrom(), null, null, null, 1792, null))));
                }
            }
            getDataList().mo5926a(new CopyOnWriteArrayList(arrayList3));
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        List<IMomentsItemBase> b3 = getDataList().mo5927b();
        if (b3 == null) {
            b3 = new ArrayList<>();
        }
        ArrayList arrayList9 = new ArrayList(b3);
        if (arrayList9.size() > 0 && ((arrayList9.get(0) instanceof MomentsProfileItem) || (arrayList9.get(0) instanceof MomentsProfileHeaderLoadingItem))) {
            Object obj = arrayList9.get(0);
            if (obj != null) {
                arrayList8.add((MomentsProfileItem) obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.MomentsProfileItem");
            }
        }
        List<FeedEntry> list8 = listUserPostsResponse.entry_list;
        if (list8 != null) {
            ArrayList arrayList10 = new ArrayList();
            for (T t2 : list8) {
                Entities entities9 = listUserPostsResponse.entities;
                if (entities9 == null || (map3 = entities9.posts) == null) {
                    post = null;
                } else {
                    post = map3.get(t2.post_id);
                }
                if (post != null) {
                    arrayList10.add(post);
                }
            }
            ArrayList<Post> arrayList11 = arrayList10;
            ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
            for (Post post5 : arrayList11) {
                CommentSet commentSet2 = post5.comment_set;
                if (commentSet2 == null || (list2 = commentSet2.comment_ids) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        MomentsCommentVM eVar2 = (MomentsCommentVM) hashMap.get(it2.next());
                        if (eVar2 != null) {
                            arrayList13.add(eVar2);
                        }
                    }
                    arrayList = arrayList13;
                }
                List<String> list9 = post5.category_ids;
                if (list9 == null || list9.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || (entities = listUserPostsResponse.entities) == null || (map2 = entities.categories) == null) {
                    category = null;
                } else {
                    category = map2.get(post5.category_ids.get(i));
                }
                String str6 = post5.id;
                Intrinsics.checkExpressionValueIsNotNull(str6, "it.id");
                Map<String, UrlPreviewHangPoint> map13 = post5.url_preview_hang_point_map;
                Entities entities10 = listUserPostsResponse.entities;
                if (entities10 != null) {
                    map = entities10.preview_entities;
                } else {
                    map = null;
                }
                Map<String, PreviewHangPoint> parserPreviews3 = parserPreviews(str6, map13, map);
                String str7 = post5.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str7, "it.user_id");
                MomentsUserVM user3 = getUser(str7);
                ReactionUtils hVar3 = ReactionUtils.f119254a;
                ReactionSet reactionSet3 = post5.reaction_set;
                if (reactionSet3 != null) {
                    list = reactionSet3.reactions;
                } else {
                    list = null;
                }
                arrayList12.add(Boolean.valueOf(arrayList8.add(new MomentsPostVM(post5, user3, arrayList, hVar3.mo166215b(list, getUserMap()), parserPreviews3, this, category, needShowFrom(), null, null, null, 1792, null))));
                i = 0;
            }
        }
        if (listUserPostsResponse.entry_list.isEmpty()) {
            this.token = "";
            arrayList8.add(new MomentsProfileEmptyPostItem(this.isSelf));
        }
        getDataList().mo5926a(new CopyOnWriteArrayList(arrayList8));
    }

    public void loadMorePostData(int i, boolean z, boolean z2) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47868d(this, i, z, z2, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (map != null) {
            getUserMap().putAll(map);
        }
        MomentsProfileVM kVar = this;
        updateDataList(new KeyMatcher(str), new ReactionUpdater(reactionSet, getUserMap(), kVar));
        updateDataList(new HotCommentMatcher(str), new HotCommentReactionUpdater(str, reactionSet, getUserMap(), kVar));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentStatusChanged(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localCommentId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        MomentsPushHandler.IMomentsPushListener.C47594a.m188463a(this, str, comment, entities, createStatus, str2);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostStatusChanged(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPostId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        if (createStatus == Post.CreateStatus.SUCCESS) {
            this.needRefresh.mo5926a((Boolean) true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object handleUserProfileResponse(com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.moments.v1.GetUserProfileResponse> r20, java.lang.String r21, boolean r22, boolean r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.MomentsProfileVM.handleUserProfileResponse(com.ss.android.lark.moments.impl.g.b.c, java.lang.String, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object handleUserProfileResponse$default(MomentsProfileVM kVar, SdkResponse cVar, String str, boolean z, boolean z2, Continuation cVar2, int i, Object obj) {
        boolean z3;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return kVar.handleUserProfileResponse(cVar, str, z, z3, cVar2);
    }
}
