package com.ss.android.lark.moments.impl.personal.p2361new;

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
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider;
import com.ss.android.lark.moments.impl.feed.model.matcher.HotCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.KeyMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ProfileMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ReplyCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.updater.CommentSetUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentDeleteUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostDistributionTypeUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplaceUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplyCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ShareCountUpdater;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.personal.MomentsProfileEmptyPostItem;
import com.ss.android.lark.moments.impl.personal.MomentsProfileInfoLoadingItem;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileDisableFollowInfo;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfileDisableFollowInfoItem;
import com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfileInfoItem;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
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
import kotlinx.coroutines.ar;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001pB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010#\u001a\u00020\bH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0017H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020)0(H\u0016J\u001a\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\bH\u0002J9\u0010/\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u0016J \u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016J\b\u0010;\u001a\u00020\bH\u0016J\b\u0010<\u001a\u00020+H\u0014J\u001a\u0010=\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0018\u0010@\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020FH\u0016J\u001c\u0010G\u001a\u00020+2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020)0(H\u0016J\u001a\u0010I\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0018\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020N2\u0006\u0010J\u001a\u00020KH\u0016J6\u0010O\u001a\u00020+2\u0006\u0010P\u001a\u00020\u00172\b\u0010Q\u001a\u0004\u0018\u00010N2\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0017H\u0016J*\u0010U\u001a\u00020+2 \u0010V\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020W0(\u0018\u00010(H\u0016J0\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\u00172\b\u0010Z\u001a\u0004\u0018\u00010[2\u0014\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0016J\u0018\u0010]\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0016H\u0016J\u0018\u0010_\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\bH\u0016J\u0010\u0010a\u001a\u00020+2\u0006\u00109\u001a\u00020\u0016H\u0016J\b\u0010b\u001a\u00020+H\u0016J\u0010\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020\bH\u0016J\u0010\u0010e\u001a\u00020+2\u0006\u0010f\u001a\u00020\u0016H\u0016J9\u0010g\u001a\u00020+2\b\u0010h\u001a\u0004\u0018\u00010\u00162\b\u0010i\u001a\u0004\u0018\u00010\u00162\u0016\u0010j\u001a\u0012\u0012\u0004\u0012\u00020l0kj\b\u0012\u0004\u0012\u00020l`mH\u0002¢\u0006\u0002\u0010nJ\u0010\u0010o\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u000e\u0010\u001b\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006q"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileViewModel;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "Lcom/ss/android/lark/moments/impl/personal/IMomentsProfileVM;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$IDataProvider;", "()V", "completeRefresh", "Landroidx/lifecycle/MutableLiveData;", "", "getCompleteRefresh", "()Landroidx/lifecycle/MutableLiveData;", "isSelf", "()Z", "setSelf", "(Z)V", "mIsLoadMore", "mPushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "needRefresh", "getNeedRefresh", "showErrorPage", "Lkotlin/Pair;", "", "", "getShowErrorPage", "toastResId", "getToastResId", "token", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userName", "getUserName", "canLoadMore", "getPostById", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "postId", "getRelateUserMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "handleUserPostsResponse", "", "response", "Lcom/bytedance/lark/pb/moments/v1/ListUserPostsResponse;", "isLoadMore", "handleUserProfileResponse", "r", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/GetUserProfileResponse;", "isLocal", "isInit", "(Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initData", "postCount", "loadMorePostData", "count", "firstTime", "needShowFrom", "onCleared", "onPushCommentSetChanged", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "onPushDistributionChanged", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushMomentUser", "newUserMap", "onPushNewPostUpdate", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "onPushPostEntityChanged", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "onPushPostStatusChanged", "localPostId", "newPost", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "errorMessage", "onPushPreviewChanged", "updateMaps", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "id", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "onPushShareCountChanged", "shareCount", "onPushUserFollow", "isFollow", "refreshData", "reloadProfileData", "showCircleLoading", "isLoading", "toastString", "resId", "updateIndex", "firstIndex", "lastIndex", "finalList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "userChanged", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.b */
public final class MomentsProfileViewModel extends MomentsBaseViewModel implements MomentsFeedDataProvider.IDataProvider, MomentsPushHandler.IMomentsPushListener {
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {182}, mo239176m = "handleUserProfileResponse", mo239177n = {"this", "r", "userId", "isLocal", "isInit", "response", "user", "profile", "headerItem"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "Z$1", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$b */
    public static final class C47899b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47899b(MomentsProfileViewModel bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/MomentsProfileViewModel$Companion;", "", "()V", "DELAY_TIME", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$a */
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

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider.IDataProvider
    public Map<String, MomentUser> getRelateUserMap() {
        return getUserMap();
    }

    public boolean canLoadMore() {
        return !StringsKt.isBlank(this.token);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        super.onCleared();
        this.mPushHandler.mo167188b();
        MomentsFeedDataProvider.f119940a.mo167033a().mo167032b(this);
    }

    public void reloadProfileData() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47904g(this, null), 2, null);
    }

    public MomentsProfileViewModel() {
        MomentsPushHandler cVar = new MomentsPushHandler(this);
        this.mPushHandler = cVar;
        cVar.mo167187a();
        this.needRefresh = new C1177w<>();
        this.showErrorPage = new C1177w<>();
    }

    public final void setSelf(boolean z) {
        this.isSelf = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/MomentsProfileViewModel$userChanged$1", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$h */
    public static final class C47905h implements IMomentsUpdater {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewModel f120642a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47905h(MomentsProfileViewModel bVar) {
            this.f120642a = bVar;
        }

        @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
        /* renamed from: a */
        public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
            MomentsUserVM user;
            MomentsUserVM user2;
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
            if (iMomentsItemBase instanceof MomentsPostVM) {
                MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
                MomentsProfileViewModel bVar = this.f120642a;
                String str = fVar.mo166421F().user_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "item.post.user_id");
                MomentsUserVM user3 = bVar.getUser(str);
                MomentsProfileViewModel bVar2 = this.f120642a;
                return MomentsPostVM.m187537a(fVar, null, user3, null, null, null, bVar2, null, bVar2.needShowFrom(), null, null, null, 1885, null);
            } else if (iMomentsItemBase instanceof MomentsProfileInfoItem) {
                MomentsProfileInfoItem eVar = (MomentsProfileInfoItem) iMomentsItemBase;
                String str2 = eVar.mo167765b().mo166471i().user_id;
                if (str2 == null || (user2 = this.f120642a.getUser(str2)) == null) {
                    return iMomentsItemBase;
                }
                return new MomentsProfileInfoItem(eVar.mo167769f(), eVar.mo167767d(), eVar.mo167768e(), user2, this.f120642a.isSelf(), eVar.mo167770g());
            } else if (!(iMomentsItemBase instanceof MomentsProfileDisableFollowInfoItem)) {
                return iMomentsItemBase;
            } else {
                MomentsProfileDisableFollowInfoItem cVar = (MomentsProfileDisableFollowInfoItem) iMomentsItemBase;
                String str3 = cVar.mo167762b().mo166471i().user_id;
                if (str3 == null || (user = this.f120642a.getUser(str3)) == null) {
                    return iMomentsItemBase;
                }
                return new MomentsProfileDisableFollowInfoItem(user, cVar.mo167763c(), cVar.mo167764d());
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
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47903f(this, i, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void userChanged(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        updateDataList(new ProfileMatcher(str), new C47905h(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel$onPushReaction$1", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0}, mo239175l = {340}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$e */
    static final class C47902e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47902e(MomentsProfileViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47902e eVar = new C47902e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47902e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (ar.m266295a(1000, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.reloadProfileData();
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider.IDataProvider
    public IMomentsPost getPostById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        List<IMomentsItemBase> b = getDataList().mo5927b();
        if (b != null) {
            for (T t : b) {
                if ((t instanceof IMomentsPost) && Intrinsics.areEqual(t.mo166379a(), str)) {
                    return t;
                }
            }
        }
        return null;
    }

    public final void initData(int i) {
        this.token = "";
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47900c(this, new ArrayList(), i, null), 2, null);
        MomentsFeedDataProvider.f119940a.mo167033a().mo167030a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel$loadMorePostData$1", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0}, mo239175l = {139}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$d */
    public static final class C47901d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        final /* synthetic */ boolean $firstTime;
        final /* synthetic */ boolean $isLoadMore;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47901d(MomentsProfileViewModel bVar, int i, boolean z, boolean z2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$count = i;
            this.$isLoadMore = z;
            this.$firstTime = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47901d dVar = new C47901d(this.this$0, this.$count, this.$isLoadMore, this.$firstTime, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47901d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel$reloadProfileData$1", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0, 1, 1}, mo239175l = {149, 150}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$g */
    public static final class C47904g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47904g(MomentsProfileViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47904g gVar = new C47904g(this.this$0, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47904g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
                MomentsProfileViewModel bVar2 = this.this$0;
                String userId2 = bVar2.getUserId();
                this.L$0 = ahVar;
                this.L$1 = cVar2;
                this.label = 2;
                if (MomentsProfileViewModel.handleUserProfileResponse$default(bVar2, cVar2, userId2, false, false, this, 8, null) == a) {
                    return a;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        MomentUser momentUser;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(map, "newUserMap");
        getUserMap().putAll(map);
        for (T t : map.keySet()) {
            userChanged(t);
            if (!(!Intrinsics.areEqual(t, this.userId) || (momentUser = map.get(t)) == null || (bool = momentUser.is_current_user_following) == null)) {
                MomentsHitHelper.f119719r.mo166792a(Boolean.valueOf(bool.booleanValue()));
            }
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Map<String, ? extends UrlPreviewEntity>> entry : map.entrySet()) {
                MomentsProfileViewModel bVar = this;
                updateDataList(new KeyMatcher(entry.getKey()), new PreviewUpdater((Map) entry.getValue(), bVar));
                updateDataList(new HotCommentMatcher(entry.getKey()), new HotCommentPreviewUpdater(entry.getKey(), (Map) entry.getValue(), bVar));
                updateDataList(new ReplyCommentMatcher(entry.getKey()), new ReplyCommentPreviewUpdater((Map) entry.getValue(), this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel$initData$1", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0, 1, 2, 2, 3}, mo239175l = {98, 108, SmEvents.EVENT_NR, SmEvents.EVENT_NT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$c */
    public static final class C47900c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $list;
        final /* synthetic */ int $postCount;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47900c(MomentsProfileViewModel bVar, ArrayList arrayList, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$list = arrayList;
            this.$postCount = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47900c cVar2 = new C47900c(this.this$0, this.$list, this.$postCount, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47900c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileViewModel.C47900c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.personal.new.MomentsProfileViewModel$refreshData$1", mo239173f = "MomentsProfileViewModel.kt", mo239174i = {0, 1, 1, 2}, mo239175l = {SmActions.ACTION_INIT_EXIT, SmActions.ACTION_CALLING_ENTRY, SmActions.ACTION_RINGING_ENTRY}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.b$f */
    public static final class C47903f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47903f(MomentsProfileViewModel bVar, int i, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$count = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47903f fVar = new C47903f(this.this$0, this.$count, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47903f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileViewModel.C47903f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushBroadcastChanged(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188472b(this, str, z);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewCommentUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188471b(this, str, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushUserFollow(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        reloadProfileData();
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentSetChanged(String str, CommentSet commentSet) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        updateDataList(new KeyMatcher(str), new CommentSetUpdater(commentSet, this));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushDistributionChanged(String str, Post.PostDistributionType postDistributionType) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
        updateDataList(new KeyMatcher(str), new PostDistributionTypeUpdater(postDistributionType, this));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushShareCountChanged(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        updateDataList(new KeyMatcher(str), new ShareCountUpdater(i, this));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewPostUpdate(String str, Entities entities) {
        Map<String, Post> map;
        Post post;
        Intrinsics.checkParameterIsNotNull(str, "postId");
        if (entities != null && (map = entities.posts) != null && (post = map.get(str)) != null) {
            updateDataList(new KeyMatcher(str), new PostUpdater(post, this));
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostEntityChanged(Post post, Entities entities) {
        boolean z;
        Category category;
        ArrayList arrayList;
        List<String> list;
        Map<String, Category> map;
        String str;
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        Map<String, MomentUser> map2 = entities.users;
        Map<String, MomentUser> userMap = getUserMap();
        Intrinsics.checkExpressionValueIsNotNull(map2, "it");
        userMap.putAll(map2);
        Map<String, MomentsCommentVM> parseComment = parseComment(entities.comments, entities);
        List<String> list2 = post.category_ids;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List<ReactionList> list3 = null;
        if (!z && (map = entities.categories) != null) {
            List<String> list4 = post.category_ids;
            if (list4 != null) {
                str = list4.get(0);
            } else {
                str = null;
            }
            category = map.get(str);
        } else {
            category = null;
        }
        String str2 = post.id;
        Intrinsics.checkExpressionValueIsNotNull(str2, "post.id");
        Map<String, PreviewHangPoint> parserPreviews = parserPreviews(str2, post.url_preview_hang_point_map, entities.preview_entities);
        CommentSet commentSet = post.comment_set;
        if (commentSet == null || (list = commentSet.comment_ids) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MomentsCommentVM eVar = parseComment.get(it.next());
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
            }
            arrayList = arrayList2;
        }
        String str3 = post.user_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "post.user_id");
        MomentsUserVM user = getUser(str3);
        ReactionUtils hVar = ReactionUtils.f119254a;
        ReactionSet reactionSet = post.reaction_set;
        if (reactionSet != null) {
            list3 = reactionSet.reactions;
        }
        MomentsPostVM fVar = new MomentsPostVM(post, user, arrayList, hVar.mo166215b(list3, getUserMap()), parserPreviews, this, category, needShowFrom(), null, null, null, 1792, null);
        String str4 = post.id;
        Intrinsics.checkExpressionValueIsNotNull(str4, "post.id");
        updateDataList(new KeyMatcher(str4), new ReplaceUpdater(fVar, true));
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushEntityDeleted(String str, EntityType entityType) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        if (entityType == EntityType.POST) {
            List<IMomentsItemBase> b = getDataList().mo5927b();
            if (b == null) {
                b = new ArrayList<>();
            }
            ArrayList<IMomentsItemBase> arrayList = new ArrayList<>(b);
            Integer num = null;
            T t = null;
            int i = 0;
            boolean z = false;
            Integer num2 = num;
            for (T t2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t3 = t2;
                if (t3 instanceof IMomentsPost) {
                    if (Intrinsics.areEqual(str, t3.mo166379a())) {
                        t = t3;
                    } else {
                        if (num == null) {
                            num = Integer.valueOf(i);
                            Unit unit = Unit.INSTANCE;
                        }
                        num2 = Integer.valueOf(i);
                        z = true;
                    }
                }
                i = i2;
            }
            updateIndex(num, num2, arrayList);
            if (t != null) {
                arrayList.remove(t);
            }
            if (!z) {
                arrayList.add(new MomentsProfileEmptyPostItem(this.isSelf));
                this.token = "";
            }
            IMomentsItemBase iMomentsItemBase = arrayList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(iMomentsItemBase, "finalList[0]");
            IMomentsItemBase iMomentsItemBase2 = iMomentsItemBase;
            if (iMomentsItemBase2 instanceof IMomentsProfileInfo) {
                IMomentsProfileInfo bVar = (IMomentsProfileInfo) iMomentsItemBase2;
                MomentsProfileInfoItem eVar = new MomentsProfileInfoItem(Math.max(bVar.mo167769f() - 1, 0), bVar.mo167767d(), bVar.mo167768e(), bVar.mo167765b(), bVar.mo167766c(), bVar.mo167770g());
                arrayList.remove(0);
                arrayList.add(0, eVar);
            } else if (iMomentsItemBase2 instanceof IMomentsProfileDisableFollowInfo) {
                IMomentsProfileDisableFollowInfo aVar = (IMomentsProfileDisableFollowInfo) iMomentsItemBase2;
                MomentsProfileDisableFollowInfoItem cVar = new MomentsProfileDisableFollowInfoItem(aVar.mo167762b(), Math.max(aVar.mo167763c() - 1, 0), aVar.mo167764d());
                arrayList.remove(0);
                arrayList.add(0, cVar);
            }
            getDataList().mo5926a(new CopyOnWriteArrayList(arrayList));
        } else if (entityType == EntityType.COMMENT) {
            updateDataList(new HotCommentMatcher(str), new HotCommentDeleteUpdater(str, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    public final void handleUserPostsResponse(ListUserPostsResponse listUserPostsResponse, boolean z) {
        ArrayList arrayList;
        boolean z2;
        Category category;
        Map<String, PreviewEntityPair> map;
        List<ReactionList> list;
        Entities entities;
        Map<String, Category> map2;
        List<String> list2;
        Map<String, Post> map3;
        boolean z3;
        ArrayList arrayList2;
        boolean z4;
        Entities entities2;
        Map<String, Category> map4;
        List<String> list3;
        Map<String, Post> map5;
        Map<String, Comment> map6;
        boolean z5;
        Map<String, Post> map7;
        Post post;
        Boolean bool;
        Map<String, MomentUser> map8;
        if (listUserPostsResponse != null) {
            String str = listUserPostsResponse.next_page_token;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
            this.token = str;
            Entities entities3 = listUserPostsResponse.entities;
            if (!(entities3 == null || (map8 = entities3.users) == null)) {
                getUserMap().putAll(map8);
                Unit unit = Unit.INSTANCE;
            }
            HashMap hashMap = new HashMap();
            Entities entities4 = listUserPostsResponse.entities;
            int i = 0;
            ArrayList arrayList3 = null;
            if (!(entities4 == null || (map6 = entities4.comments) == null)) {
                for (Map.Entry<String, Comment> entry : map6.entrySet()) {
                    String str2 = entry.getValue().id;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.value.id");
                    Map<String, UrlPreviewHangPoint> map9 = entry.getValue().url_preview_hang_point_map;
                    Entities entities5 = listUserPostsResponse.entities;
                    Map<String, PreviewHangPoint> parserPreviews = parserPreviews(str2, map9, entities5 != null ? entities5.preview_entities : null);
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
                    List<ReactionDetailViewModel> b = hVar.mo166215b(reactionSet != null ? reactionSet.reactions : null, getUserMap());
                    MomentsProfileViewModel bVar = this;
                    Entities entities6 = listUserPostsResponse.entities;
                    if (entities6 == null || (map7 = entities6.posts) == null || (post = map7.get(entry.getValue().post_id)) == null || (bool = post.is_anonymous) == null) {
                        z5 = false;
                    } else {
                        z5 = bool.booleanValue();
                    }
                    hashMap2.put(key, new MomentsCommentVM(comment, user, b, parserPreviews, bVar, z5, null, null, null, null, 960, null));
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (z) {
                List<IMomentsItemBase> b2 = getDataList().mo5927b();
                if (b2 == null) {
                    b2 = new ArrayList<>();
                }
                ArrayList<IMomentsItemBase> arrayList4 = new ArrayList(b2);
                List<FeedEntry> list4 = listUserPostsResponse.entry_list;
                if (list4 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (T t : list4) {
                        Entities entities7 = listUserPostsResponse.entities;
                        Post post2 = (entities7 == null || (map5 = entities7.posts) == null) ? null : map5.get(t.post_id);
                        if (post2 != null) {
                            arrayList5.add(post2);
                        }
                    }
                    ArrayList<Post> arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                    for (Post post3 : arrayList6) {
                        CommentSet commentSet = post3.comment_set;
                        if (commentSet == null || (list3 = commentSet.comment_ids) == null) {
                            arrayList2 = null;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                MomentsCommentVM eVar = (MomentsCommentVM) hashMap.get(it.next());
                                if (eVar != null) {
                                    arrayList8.add(eVar);
                                }
                            }
                            arrayList2 = arrayList8;
                        }
                        List<String> list5 = post3.category_ids;
                        if (list5 == null || list5.isEmpty()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Category category2 = (z4 || (entities2 = listUserPostsResponse.entities) == null || (map4 = entities2.categories) == null) ? null : map4.get(post3.category_ids.get(i));
                        String str4 = post3.id;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "it.id");
                        Map<String, UrlPreviewHangPoint> map10 = post3.url_preview_hang_point_map;
                        Entities entities8 = listUserPostsResponse.entities;
                        Map<String, PreviewHangPoint> parserPreviews2 = parserPreviews(str4, map10, entities8 != null ? entities8.preview_entities : null);
                        String str5 = post3.user_id;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "it.user_id");
                        MomentsUserVM user2 = getUser(str5);
                        ReactionUtils hVar2 = ReactionUtils.f119254a;
                        ReactionSet reactionSet2 = post3.reaction_set;
                        arrayList7.add(Boolean.valueOf(arrayList4.add(new MomentsPostVM(post3, user2, arrayList2, hVar2.mo166215b(reactionSet2 != null ? reactionSet2.reactions : null, getUserMap()), parserPreviews2, this, category2, needShowFrom(), null, null, null, 1792, null))));
                        i = 0;
                    }
                }
                MomentsPostVM fVar = null;
                boolean z6 = true;
                for (IMomentsItemBase iMomentsItemBase : arrayList4) {
                    if (iMomentsItemBase instanceof MomentsPostVM) {
                        MomentsPostVM fVar2 = (MomentsPostVM) iMomentsItemBase;
                        fVar2.mo166435a(Boolean.valueOf(z6));
                        fVar2.mo166439b((Boolean) false);
                        fVar = fVar2;
                        z6 = false;
                    }
                }
                if (this.token.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && fVar != null) {
                    fVar.mo166439b((Boolean) true);
                }
                getDataList().mo5926a(new CopyOnWriteArrayList(arrayList4));
                return;
            }
            ArrayList<IMomentsItemBase> arrayList9 = new ArrayList();
            List<IMomentsItemBase> b3 = getDataList().mo5927b();
            if (b3 == null) {
                b3 = new ArrayList<>();
            }
            ArrayList arrayList10 = new ArrayList(b3);
            if (arrayList10.size() > 0 && ((arrayList10.get(0) instanceof MomentsProfileInfoItem) || (arrayList10.get(0) instanceof MomentsProfileDisableFollowInfoItem) || (arrayList10.get(0) instanceof MomentsProfileInfoLoadingItem))) {
                arrayList9.add(arrayList10.get(0));
            }
            List<FeedEntry> list6 = listUserPostsResponse.entry_list;
            if (list6 != null) {
                ArrayList arrayList11 = new ArrayList();
                for (T t2 : list6) {
                    Entities entities9 = listUserPostsResponse.entities;
                    Post post4 = (entities9 == null || (map3 = entities9.posts) == null) ? null : map3.get(t2.post_id);
                    if (post4 != null) {
                        arrayList11.add(post4);
                    }
                }
                ArrayList<Post> arrayList12 = arrayList11;
                ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList12, 10));
                for (Post post5 : arrayList12) {
                    CommentSet commentSet2 = post5.comment_set;
                    if (commentSet2 == null || (list2 = commentSet2.comment_ids) == null) {
                        arrayList = arrayList3;
                    } else {
                        ArrayList arrayList14 = new ArrayList();
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            MomentsCommentVM eVar2 = (MomentsCommentVM) hashMap.get(it2.next());
                            if (eVar2 != null) {
                                arrayList14.add(eVar2);
                            }
                        }
                        arrayList = arrayList14;
                    }
                    List<String> list7 = post5.category_ids;
                    if (list7 == null || list7.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || (entities = listUserPostsResponse.entities) == null || (map2 = entities.categories) == null) {
                        category = arrayList3;
                    } else {
                        category = map2.get(post5.category_ids.get(0));
                    }
                    String str6 = post5.id;
                    Intrinsics.checkExpressionValueIsNotNull(str6, "it.id");
                    Map<String, UrlPreviewHangPoint> map11 = post5.url_preview_hang_point_map;
                    Entities entities10 = listUserPostsResponse.entities;
                    if (entities10 != null) {
                        map = entities10.preview_entities;
                    } else {
                        map = arrayList3;
                    }
                    Map<String, PreviewHangPoint> parserPreviews3 = parserPreviews(str6, map11, map);
                    String str7 = post5.user_id;
                    Intrinsics.checkExpressionValueIsNotNull(str7, "it.user_id");
                    MomentsUserVM user3 = getUser(str7);
                    ReactionUtils hVar3 = ReactionUtils.f119254a;
                    ReactionSet reactionSet3 = post5.reaction_set;
                    if (reactionSet3 != null) {
                        list = reactionSet3.reactions;
                    } else {
                        list = arrayList3;
                    }
                    arrayList13.add(Boolean.valueOf(arrayList9.add(new MomentsPostVM(post5, user3, arrayList, hVar3.mo166215b(list, getUserMap()), parserPreviews3, this, category, needShowFrom(), null, null, null, 1792, null))));
                    arrayList3 = null;
                }
            }
            if (listUserPostsResponse.entry_list.isEmpty()) {
                this.token = "";
                arrayList9.add(new MomentsProfileEmptyPostItem(this.isSelf));
            }
            MomentsPostVM fVar3 = null;
            boolean z7 = true;
            for (IMomentsItemBase iMomentsItemBase2 : arrayList9) {
                if (iMomentsItemBase2 instanceof MomentsPostVM) {
                    MomentsPostVM fVar4 = (MomentsPostVM) iMomentsItemBase2;
                    fVar4.mo166435a(Boolean.valueOf(z7));
                    fVar4.mo166439b((Boolean) false);
                    fVar3 = fVar4;
                    z7 = false;
                }
            }
            boolean z8 = false;
            if (this.token.length() == 0) {
                z8 = true;
            }
            if (z8 && fVar3 != null) {
                fVar3.mo166439b((Boolean) true);
            }
            getDataList().mo5926a(new CopyOnWriteArrayList(arrayList9));
        }
    }

    public void loadMorePostData(int i, boolean z, boolean z2) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47901d(this, i, z, z2, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (map != null) {
            getUserMap().putAll(map);
        }
        MomentsProfileViewModel bVar = this;
        updateDataList(new KeyMatcher(str), new ReactionUpdater(reactionSet, getUserMap(), bVar));
        updateDataList(new HotCommentMatcher(str), new HotCommentReactionUpdater(str, reactionSet, getUserMap(), bVar));
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47902e(this, null), 2, null);
    }

    private final void updateIndex(Integer num, Integer num2, ArrayList<IMomentsItemBase> arrayList) {
        IMomentsItemBase iMomentsItemBase;
        if (num != null) {
            int intValue = num.intValue();
            IMomentsItemBase iMomentsItemBase2 = arrayList.get(intValue);
            if (!(iMomentsItemBase2 instanceof MomentsPostVM)) {
                iMomentsItemBase2 = null;
            }
            MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase2;
            if (fVar != null && !Intrinsics.areEqual((Object) fVar.mo166430O(), (Object) true)) {
                arrayList.remove(intValue);
                arrayList.add(intValue, MomentsPostVM.m187537a(fVar, null, null, null, null, null, null, null, false, null, true, null, 1535, null));
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            IMomentsItemBase iMomentsItemBase3 = arrayList.get(intValue2);
            if (!(iMomentsItemBase3 instanceof MomentsPostVM)) {
                iMomentsItemBase = null;
            } else {
                iMomentsItemBase = iMomentsItemBase3;
            }
            MomentsPostVM fVar2 = (MomentsPostVM) iMomentsItemBase;
            if (fVar2 != null && !Intrinsics.areEqual((Object) fVar2.mo166431P(), (Object) true)) {
                arrayList.remove(intValue2);
                arrayList.add(intValue2, MomentsPostVM.m187537a(fVar2, null, null, null, null, null, null, null, false, null, null, true, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null));
            }
        }
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
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object handleUserProfileResponse(com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse<com.bytedance.lark.pb.moments.v1.GetUserProfileResponse> r8, java.lang.String r9, boolean r10, boolean r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.personal.p2361new.MomentsProfileViewModel.handleUserProfileResponse(com.ss.android.lark.moments.impl.g.b.c, java.lang.String, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object handleUserProfileResponse$default(MomentsProfileViewModel bVar, SdkResponse cVar, String str, boolean z, boolean z2, Continuation cVar2, int i, Object obj) {
        boolean z3;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return bVar.handleUserProfileResponse(cVar, str, z, z3, cVar2);
    }
}
