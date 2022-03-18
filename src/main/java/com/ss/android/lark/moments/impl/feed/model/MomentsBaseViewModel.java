package com.ss.android.lark.moments.impl.feed.model;

import android.content.Context;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.ListReactionsResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.Reaction;
import com.bytedance.lark.pb.moments.v1.ReactionList;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.bytedance.lark.pb.moments.v1.RetryCreatePostResponse;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.broadcast.MomentsBroadcastEditActivity;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel;
import com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsFeedNoMoreItem;
import com.ss.android.lark.moments.impl.feed.model.matcher.IMomentsMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.KeyMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.UserMatcher;
import com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostStatusUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostUpdater;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004mnopB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020%H\u0004JJ\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000200\u0018\u00010+J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020 H\u0016J\u0018\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020 H\u0016J4\u00109\u001a\b\u0012\u0004\u0012\u00020,0\b2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\b2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002J\u0010\u0010<\u001a\u0004\u0018\u00010\t2\u0006\u00105\u001a\u00020 J\u0010\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00108\u001a\u00020 J\u0010\u0010?\u001a\u00020%2\u0006\u00102\u001a\u00020 H\u0016J\b\u0010@\u001a\u00020\u0013H&J&\u0010A\u001a\u00020%2\u0006\u00105\u001a\u00020 2\u0006\u0010B\u001a\u00020 2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002040\bH\u0016J2\u0010D\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,0+2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020F\u0018\u00010+2\b\u0010G\u001a\u0004\u0018\u00010HJH\u0010I\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000200\u0018\u00010+2\u0006\u00105\u001a\u00020 2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020K\u0018\u00010+2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020M\u0018\u00010+J\b\u0010N\u001a\u00020%H\u0004J\u0010\u0010O\u001a\u00020%2\u0006\u00102\u001a\u00020 H\u0016J\u0018\u0010P\u001a\u00020%2\u0006\u00105\u001a\u00020 2\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020\u0013H&J \u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\u0006\u0010(\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0013H\u0016J\u0010\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020\\H&J0\u0010]\u001a\u00020%2\u0006\u00105\u001a\u00020 2\u0006\u0010^\u001a\u00020_2\u0006\u00106\u001a\u00020 2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u0013H\u0016J\u0010\u0010c\u001a\u00020%2\u0006\u00108\u001a\u00020 H\u0016J\u0010\u0010d\u001a\u00020%2\u0006\u00102\u001a\u00020 H\u0016J\u0016\u0010e\u001a\u00020%2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iJ\u0016\u0010j\u001a\u00020%2\u0006\u00108\u001a\u00020 2\u0006\u0010k\u001a\u00020\u0013J\u0010\u0010l\u001a\u00020%2\u0006\u00108\u001a\u00020 H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8TX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006q"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUserModel;", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "()V", "dataList", "Lcom/ss/android/lark/moments/impl/feed/model/DataCacheLiveData;", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "getDataList", "()Lcom/ss/android/lark/moments/impl/feed/model/DataCacheLiveData;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "hasPendingLoading", "", "pageErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorInfo;", "getPageErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "reactionDetailLiveData", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$ReactionInfo;", "getReactionDetailLiveData", "startNickIdentityActivity", "getStartNickIdentityActivity", "userMap", "", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getUserMap", "()Ljava/util/Map;", "cancelLoading", "", "convertToPostVM", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM;", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "commentsMap", "", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsCommentVM;", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "previews", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "deletePost", "postId", "fetchReactionDetail", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "id", "reactionKey", "followUser", "userId", "getCommentList", "commentIds", "commentMap", "getItemById", "getUser", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "highLightPost", "needShowFrom", "openReactionDetail", "selectedReactionKey", "reactions", "parseComment", "comments", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "parserPreviews", "hangPointMap", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "pbPreviewEntities", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "prepareLoading", "resendPost", "setDistribution", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "showCircleLoading", "isLoading", "startBroadcastEditActivity", "context", "Landroid/content/Context;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "isReEdit", "toastString", "resId", "", "triggerReaction", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "originReactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "isAnonymous", "unFollowUser", "unsetBroadcastPost", "updateDataList", "matcher", "Lcom/ss/android/lark/moments/impl/feed/model/matcher/IMomentsMatcher;", "updater", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "updateUserFollowStatus", "isFollow", "userChanged", "Companion", "PageErrorInfo", "PageErrorType", "ReactionInfo", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class MomentsBaseViewModel extends BaseViewModel implements IMomentsCommentModel, IMomentsPostModel, IMomentsUserModel {
    public static final Companion Companion = new Companion(null);
    private final DataCacheLiveData<List<IMomentsItemBase>> dataList = new DataCacheLiveData<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47538e.INSTANCE);
    public volatile boolean hasPendingLoading;
    private final C1177w<PageErrorInfo> pageErrorLiveData = new C1177w<>();
    private final C1177w<ReactionInfo> reactionDetailLiveData = new C1177w<>();
    private final C1177w<Boolean> startNickIdentityActivity = new C1177w<>();
    private final Map<String, MomentUser> userMap = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorType;", "", "(Ljava/lang/String;I)V", "REMOVED", "NO_PERMISSION", GrsBaseInfo.CountryCodeSource.UNKNOWN, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PageErrorType {
        REMOVED,
        NO_PERMISSION,
        UNKNOWN
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public void highLightPost(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
    }

    public abstract boolean needShowFrom();

    public abstract void showCircleLoading(boolean z);

    public abstract void toastString(int i);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$Companion;", "", "()V", "LOG_TAG", "", "REACTION_COUNT", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorInfo;", "", "resId", "", "msg", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorType;", "(ILjava/lang/String;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorType;)V", "getMsg", "()Ljava/lang/String;", "getResId", "()I", "getType", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$b */
    public static final class PageErrorInfo {

        /* renamed from: a */
        private final int f119926a;

        /* renamed from: b */
        private final String f119927b;

        /* renamed from: c */
        private final PageErrorType f119928c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageErrorInfo)) {
                return false;
            }
            PageErrorInfo bVar = (PageErrorInfo) obj;
            return this.f119926a == bVar.f119926a && Intrinsics.areEqual(this.f119927b, bVar.f119927b) && Intrinsics.areEqual(this.f119928c, bVar.f119928c);
        }

        public int hashCode() {
            int i = this.f119926a * 31;
            String str = this.f119927b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            PageErrorType pageErrorType = this.f119928c;
            if (pageErrorType != null) {
                i2 = pageErrorType.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "PageErrorInfo(resId=" + this.f119926a + ", msg=" + this.f119927b + ", type=" + this.f119928c + ")";
        }

        /* renamed from: a */
        public final int mo167013a() {
            return this.f119926a;
        }

        /* renamed from: b */
        public final String mo167014b() {
            return this.f119927b;
        }

        /* renamed from: c */
        public final PageErrorType mo167015c() {
            return this.f119928c;
        }

        public PageErrorInfo(int i, String str, PageErrorType pageErrorType) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            Intrinsics.checkParameterIsNotNull(pageErrorType, ShareHitPoint.f121869d);
            this.f119926a = i;
            this.f119927b = str;
            this.f119928c = pageErrorType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$ReactionInfo;", "", "reactionList", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "selectedReactionKey", "", "entityId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "getReactionList", "()Ljava/util/List;", "getSelectedReactionKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$c */
    public static final class ReactionInfo {

        /* renamed from: a */
        private final List<ReactionDetailViewModel> f119929a;

        /* renamed from: b */
        private final String f119930b;

        /* renamed from: c */
        private final String f119931c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionInfo)) {
                return false;
            }
            ReactionInfo cVar = (ReactionInfo) obj;
            return Intrinsics.areEqual(this.f119929a, cVar.f119929a) && Intrinsics.areEqual(this.f119930b, cVar.f119930b) && Intrinsics.areEqual(this.f119931c, cVar.f119931c);
        }

        public int hashCode() {
            List<ReactionDetailViewModel> list = this.f119929a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f119930b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f119931c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ReactionInfo(reactionList=" + this.f119929a + ", selectedReactionKey=" + this.f119930b + ", entityId=" + this.f119931c + ")";
        }

        /* renamed from: a */
        public final List<ReactionDetailViewModel> mo167019a() {
            return this.f119929a;
        }

        /* renamed from: b */
        public final String mo167020b() {
            return this.f119930b;
        }

        /* renamed from: c */
        public final String mo167021c() {
            return this.f119931c;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel> */
        /* JADX WARN: Multi-variable type inference failed */
        public ReactionInfo(List<? extends ReactionDetailViewModel> list, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(list, "reactionList");
            Intrinsics.checkParameterIsNotNull(str, "selectedReactionKey");
            Intrinsics.checkParameterIsNotNull(str2, "entityId");
            this.f119929a = list;
            this.f119930b = str;
            this.f119931c = str2;
        }
    }

    public final DataCacheLiveData<List<IMomentsItemBase>> getDataList() {
        return this.dataList;
    }

    public final C1177w<PageErrorInfo> getPageErrorLiveData() {
        return this.pageErrorLiveData;
    }

    public final C1177w<ReactionInfo> getReactionDetailLiveData() {
        return this.reactionDetailLiveData;
    }

    public final C1177w<Boolean> getStartNickIdentityActivity() {
        return this.startNickIdentityActivity;
    }

    public final Map<String, MomentUser> getUserMap() {
        return this.userMap;
    }

    public final void cancelLoading() {
        this.hasPendingLoading = false;
        showCircleLoading(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$g */
    public static final class RunnableC47540g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsBaseViewModel f119932a;

        RunnableC47540g(MomentsBaseViewModel momentsBaseViewModel) {
            this.f119932a = momentsBaseViewModel;
        }

        public final void run() {
            if (this.f119932a.hasPendingLoading) {
                this.f119932a.showCircleLoading(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$e */
    static final class C47538e extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47538e INSTANCE = new C47538e();

        C47538e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-feed");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…eadPool(\"lk-moment-feed\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void prepareLoading() {
        this.hasPendingLoading = true;
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getScheduleThreadPool().schedule(new RunnableC47540g(this), 1, TimeUnit.MILLISECONDS);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$userChanged$1", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$o */
    public static final class C47550o implements IMomentsUpdater {

        /* renamed from: a */
        final /* synthetic */ MomentsBaseViewModel f119933a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47550o(MomentsBaseViewModel momentsBaseViewModel) {
            this.f119933a = momentsBaseViewModel;
        }

        @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
        /* renamed from: a */
        public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
            if (!(iMomentsItemBase instanceof MomentsPostVM)) {
                return iMomentsItemBase;
            }
            MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
            MomentsBaseViewModel momentsBaseViewModel = this.f119933a;
            String str = fVar.mo166421F().user_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "item.post.user_id");
            MomentsUserVM user = momentsBaseViewModel.getUser(str);
            MomentsBaseViewModel momentsBaseViewModel2 = this.f119933a;
            return MomentsPostVM.m187537a(fVar, null, user, null, null, null, momentsBaseViewModel2, null, momentsBaseViewModel2.needShowFrom(), null, null, null, 1885, null);
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel
    public void deleteComment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        IMomentsCommentModel.C47331a.m187482a(this, str);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel
    public void resendComment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        IMomentsCommentModel.C47331a.m187483b(this, str);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void deletePost(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47537d(this, str, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel
    public void followUser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47539f(this, str, null), 2, null);
    }

    public final MomentsUserVM getUser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        MomentUser momentUser = this.userMap.get(str);
        if (momentUser != null) {
            return new MomentsUserVM(momentUser, this);
        }
        return null;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void resendPost(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47541h(this, str, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsUserModel
    public void unFollowUser(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47547l(this, str, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void unsetBroadcastPost(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47548m(this, str, null), 2, null);
    }

    public void userChanged(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        updateDataList(new UserMatcher(str), new C47550o(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$startBroadcastEditActivity$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {317}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$j */
    static final class C47543j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isReEdit;
        final /* synthetic */ CommonLoadingDialog $loadingDialog;
        final /* synthetic */ IMomentsPost $post;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47543j(MomentsBaseViewModel momentsBaseViewModel, CommonLoadingDialog commonLoadingDialog, boolean z, IMomentsPost bVar, Context context, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$loadingDialog = commonLoadingDialog;
            this.$isReEdit = z;
            this.$post = bVar;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47543j jVar = new C47543j(this.this$0, this.$loadingDialog, this.$isReEdit, this.$post, this.$context, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47543j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$startBroadcastEditActivity$1$broadcastList$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {317}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$j$a */
        public static final class C47544a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Broadcast>>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;

            C47544a(Continuation cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C47544a aVar = new C47544a(cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super List<? extends Broadcast>> cVar) {
                return ((C47544a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    MomentsSDKService bVar = MomentsSDKService.f120147a;
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = bVar.mo167244b(this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = C69388e.m266829a(this.this$0.getDispatcher(), new C47544a(null), this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<Broadcast> list = (List) obj;
            this.$loadingDialog.dismiss();
            if (this.$isReEdit) {
                Broadcast broadcast = null;
                if (list != null) {
                    for (T t : list) {
                        if (Intrinsics.areEqual(t.post_id, this.$post.mo166379a())) {
                            broadcast = t;
                        }
                    }
                }
                MomentsBroadcastEditActivity.Companion.m187006a(MomentsBroadcastEditActivity.f119007e, this.$context, this.$post.mo166379a(), broadcast, null, 8, null);
            } else if (list == null || list.size() < 3) {
                MomentsBroadcastEditActivity.Companion.m187006a(MomentsBroadcastEditActivity.f119007e, this.$context, this.$post.mo166379a(), null, null, 12, null);
            } else {
                MomentsBroadcastEditActivity.f119007e.mo165926a(this.$context, this.$post.mo166379a(), list);
            }
            return Unit.INSTANCE;
        }
    }

    public final IMomentsItemBase getItemById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        List<IMomentsItemBase> b = this.dataList.mo5927b();
        if (b != null) {
            for (T t : b) {
                if (Intrinsics.areEqual(t.mo166379a(), str)) {
                    return t;
                }
            }
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$deletePost$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {137}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$d */
    static final class C47537d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $postId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47537d(MomentsBaseViewModel momentsBaseViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$postId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47537d dVar = new C47537d(this.this$0, this.$postId, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47537d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.prepareLoading();
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$postId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167246c(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.toastString(R.string.Lark_Community_DeleteFailed);
            }
            this.this$0.cancelLoading();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$followUser$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {78}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$f */
    static final class C47539f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47539f(MomentsBaseViewModel momentsBaseViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47539f fVar = new C47539f(this.this$0, this.$userId, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47539f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$userId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167232a(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.this$0.updateUserFollowStatus(this.$userId, true);
            } else {
                this.this$0.toastString(R.string.Lark_Community_FollowFailed);
                this.this$0.updateUserFollowStatus(this.$userId, false);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$setDistribution$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {304}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$i */
    static final class C47542i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Post.PostDistributionType $distributionType;
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47542i(MomentsBaseViewModel momentsBaseViewModel, String str, Post.PostDistributionType postDistributionType, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$id = str;
            this.$distributionType = postDistributionType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47542i iVar = new C47542i(this.this$0, this.$id, this.$distributionType, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47542i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.prepareLoading();
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$id;
                Post.PostDistributionType postDistributionType = this.$distributionType;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167226a(str, postDistributionType, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.toastString(R.string.Lark_Community_SetFailed);
            } else {
                this.this$0.toastString(R.string.Lark_Community_OnlyAuthorViewSuccessfully);
            }
            this.this$0.cancelLoading();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$unFollowUser$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {89}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$l */
    static final class C47547l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47547l(MomentsBaseViewModel momentsBaseViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47547l lVar = new C47547l(this.this$0, this.$userId, cVar);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47547l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$userId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167243b(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.this$0.updateUserFollowStatus(this.$userId, false);
            } else {
                this.this$0.toastString(R.string.Lark_Community_FailedToUnfollow);
                this.this$0.updateUserFollowStatus(this.$userId, true);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$unsetBroadcastPost$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {150}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$m */
    static final class C47548m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $postId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47548m(MomentsBaseViewModel momentsBaseViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$postId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47548m mVar = new C47548m(this.this$0, this.$postId, cVar);
            mVar.p$ = (CoroutineScope) obj;
            return mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47548m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.prepareLoading();
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$postId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167222a((Broadcast) null, str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.toastString(R.string.Lark_Moments_RemoveFromTrendingFailedTryAgain_Toast);
            } else {
                this.this$0.toastString(R.string.Lark_Moments_RemovedFromTrendingRefresh_Toast);
            }
            this.this$0.cancelLoading();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$resendPost$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0}, mo239175l = {228}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$h */
    static final class C47541h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $postId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47541h(MomentsBaseViewModel momentsBaseViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$postId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47541h hVar = new C47541h(this.this$0, this.$postId, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47541h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Post post;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.updateDataList(new KeyMatcher(this.$postId), new PostStatusUpdater(null, null, Post.CreateStatus.SENDING, this.this$0, null, 16, null));
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$postId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167249d(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar = (SdkResponse) obj;
            RetryCreatePostResponse retryCreatePostResponse = (RetryCreatePostResponse) cVar.mo167291a();
            if (retryCreatePostResponse != null) {
                post = retryCreatePostResponse.post;
            } else {
                post = null;
            }
            if (cVar.mo167292b() == null && post != null) {
                this.this$0.updateDataList(new KeyMatcher(this.$postId), new PostUpdater(post, this.this$0));
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$updateDataList$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$n */
    public static final class C47549n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IMomentsMatcher $matcher;
        final /* synthetic */ IMomentsUpdater $updater;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47549n(MomentsBaseViewModel momentsBaseViewModel, IMomentsMatcher bVar, IMomentsUpdater hVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$matcher = bVar;
            this.$updater = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47549n nVar = new C47549n(this.this$0, this.$matcher, this.$updater, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47549n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                List<IMomentsItemBase> b = this.this$0.getDataList().mo5927b();
                if (b == null) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    if (this.$matcher.mo167028a(t)) {
                        t = this.$updater.mo167027a(t);
                    }
                    if (t != null) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2.size() != 1 || !(arrayList2.get(0) instanceof MomentsFeedNoMoreItem)) {
                    this.this$0.getDataList().mo5926a(new CopyOnWriteArrayList(arrayList2));
                } else {
                    this.this$0.getDataList().mo5926a(new CopyOnWriteArrayList());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$triggerReaction$1", mo239173f = "MomentsBaseViewModel.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1}, mo239175l = {185, 196}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "isDelete", "userMap", "reactionSet", "$this$launch", "isDelete", "userMap", "reactionSet"}, mo239178s = {"L$0", "Z$0", "L$1", "L$2", "L$0", "Z$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel$k */
    static final class C47545k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EntityType $entityType;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isAnonymous;
        final /* synthetic */ ReactionSet $originReactionSet;
        final /* synthetic */ String $reactionKey;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsBaseViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47545k(MomentsBaseViewModel momentsBaseViewModel, ReactionSet reactionSet, String str, boolean z, String str2, EntityType entityType, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsBaseViewModel;
            this.$originReactionSet = reactionSet;
            this.$reactionKey = str;
            this.$isAnonymous = z;
            this.$id = str2;
            this.$entityType = entityType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47545k kVar = new C47545k(this.this$0, this.$originReactionSet, this.$reactionKey, this.$isAnonymous, this.$id, this.$entityType, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47545k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
            // Method dump skipped, instructions count: 535
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel.C47545k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final ReactionDetailViewModel fetchReactionDetail(String str, String str2) {
        Entities entities;
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        ListReactionsResponse a = MomentsSDKService.f120147a.mo167219a(str, str2, "", LocationRequest.PRIORITY_HD_ACCURACY);
        if (a == null || (entities = a.entities) == null) {
            return null;
        }
        ReactionUtils hVar = ReactionUtils.f119254a;
        List<Reaction> list = a.reactions;
        Intrinsics.checkExpressionValueIsNotNull(list, "response.reactions");
        Map<String, MomentUser> map = entities.users;
        Intrinsics.checkExpressionValueIsNotNull(map, "it.users");
        return hVar.mo166212a(list, map);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void setDistribution(String str, Post.PostDistributionType postDistributionType) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47542i(this, str, postDistributionType, null), 2, null);
    }

    public final void updateDataList(IMomentsMatcher bVar, IMomentsUpdater hVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "matcher");
        Intrinsics.checkParameterIsNotNull(hVar, "updater");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47549n(this, bVar, hVar, null), 2, null);
    }

    public final void updateUserFollowStatus(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        MomentUser momentUser = this.userMap.get(str);
        if (momentUser != null) {
            Map<String, MomentUser> map = this.userMap;
            MomentUser a = momentUser.newBuilder().mo63791a(Boolean.valueOf(z)).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.newBuilder().is_curre…llowing(isFollow).build()");
            map.put(str, a);
            userChanged(str);
        }
    }

    private final List<MomentsCommentVM> getCommentList(List<String> list, Map<String, MomentsCommentVM> map) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                MomentsCommentVM eVar = map != null ? map.get(t) : null;
                if (eVar != null) {
                    arrayList3.add(eVar);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (!((MomentsCommentVM) obj).mo166402n()) {
                    arrayList4.add(obj);
                }
            }
            arrayList2 = arrayList4;
        }
        ArrayList arrayList5 = arrayList2;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            z = false;
        }
        if (!z) {
            arrayList.addAll(arrayList5);
        }
        return arrayList;
    }

    public final Map<String, MomentsCommentVM> parseComment(Map<String, Comment> map, Entities entities) {
        boolean z;
        Map<String, Post> map2;
        Post post;
        Boolean bool;
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Comment> entry : map.entrySet()) {
                Comment comment = map.get(entry.getValue().reply_comment_id);
                MomentUser momentUser = this.userMap.get(entry.getValue().reply_comment_user_id);
                String str = entry.getValue().reply_comment_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.value.reply_comment_id");
                List<ReactionList> list = null;
                Map<String, PreviewHangPoint> parserPreviews = parserPreviews(str, comment != null ? comment.url_preview_hang_point_map : null, entities != null ? entities.preview_entities : null);
                String str2 = entry.getValue().id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.value.id");
                Map<String, PreviewHangPoint> parserPreviews2 = parserPreviews(str2, entry.getValue().url_preview_hang_point_map, entities != null ? entities.preview_entities : null);
                Comment value = entry.getValue();
                String str3 = entry.getValue().user_id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.value.user_id");
                MomentsUserVM user = getUser(str3);
                ReactionUtils hVar = ReactionUtils.f119254a;
                ReactionSet reactionSet = entry.getValue().reaction_set;
                if (reactionSet != null) {
                    list = reactionSet.reactions;
                }
                List<ReactionDetailViewModel> b = hVar.mo166215b(list, this.userMap);
                MomentsBaseViewModel momentsBaseViewModel = this;
                if (entities == null || (map2 = entities.posts) == null || (post = map2.get(entry.getValue().post_id)) == null || (bool = post.is_anonymous) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                hashMap.put(entry.getKey(), new MomentsCommentVM(value, user, b, parserPreviews2, momentsBaseViewModel, z, momentUser, comment, parserPreviews, null, MediaPlayer.MEDIA_PLAYER_OPTION_APPID, null));
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel, com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void openReactionDetail(String str, String str2, List<? extends ReactionDetailViewModel> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "selectedReactionKey");
        Intrinsics.checkParameterIsNotNull(list, "reactions");
        this.reactionDetailLiveData.mo5926a(new ReactionInfo(list, str2, str));
    }

    public final Map<String, PreviewHangPoint> parserPreviews(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144697a(str, map, map2);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void startBroadcastEditActivity(Context context, IMomentsPost bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "post");
        CommonLoadingDialog commonLoadingDialog = new CommonLoadingDialog();
        commonLoadingDialog.show(context);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47543j(this, commonLoadingDialog, z, bVar, context, null), 3, null);
    }

    public final MomentsPostVM convertToPostVM(Post post, Map<String, MomentsCommentVM> map, Category category, Map<String, PreviewHangPoint> map2) {
        Map<String, MomentsCommentVM> map3;
        List<String> list;
        List<ReactionList> list2 = null;
        if (post == null) {
            return null;
        }
        String str = post.user_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "it.user_id");
        MomentsUserVM user = getUser(str);
        CommentSet commentSet = post.comment_set;
        if (commentSet != null) {
            list = commentSet.comment_ids;
            map3 = map;
        } else {
            map3 = map;
            list = null;
        }
        List<MomentsCommentVM> commentList = getCommentList(list, map3);
        ReactionUtils hVar = ReactionUtils.f119254a;
        ReactionSet reactionSet = post.reaction_set;
        if (reactionSet != null) {
            list2 = reactionSet.reactions;
        }
        return new MomentsPostVM(post, user, commentList, hVar.mo166215b(list2, this.userMap), map2, this, category, needShowFrom(), null, null, null, 1792, null);
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel, com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel
    public void triggerReaction(String str, EntityType entityType, String str2, ReactionSet reactionSet, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        Intrinsics.checkParameterIsNotNull(reactionSet, "originReactionSet");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47545k(this, reactionSet, str2, z, str, entityType, null), 2, null);
    }

    public static /* synthetic */ MomentsPostVM convertToPostVM$default(MomentsBaseViewModel momentsBaseViewModel, Post post, Map map, Category category, Map map2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                category = null;
            }
            return momentsBaseViewModel.convertToPostVM(post, map, category, map2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToPostVM");
    }
}
