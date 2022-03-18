package com.ss.android.lark.moments.impl.feed.model;

import android.content.Context;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.CreatePostResponse;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.FeedEntry;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.GetTabFeedResponse;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsBroadcastItem;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsFeedNoMoreItem;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.feed.empty.MomentsFeedNoPostItem;
import com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider;
import com.ss.android.lark.moments.impl.feed.model.matcher.HotCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.KeyMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ReplyCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.updater.BroadcastUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.CommentSetUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentDeleteUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostDistributionTypeUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostStatusUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReactionUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplaceUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplyCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ShareCountUpdater;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010@\u001a\u00020\tH\u0001J\b\u0010E\u001a\u00020BH\u0002J\b\u0010F\u001a\u00020\rH\u0016J\u0012\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\tH\u0016J\u0014\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020L0KH\u0016J\u0012\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010I\u001a\u00020\tH\u0016J\u0018\u0010N\u001a\u00020B2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0002J(\u0010R\u001a\u00020B2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\rH\u0002J\u0018\u0010U\u001a\u00020B2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0PH\u0002J \u0010W\u001a\u00020B2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0P2\u0006\u0010S\u001a\u00020\rH\u0002J*\u0010X\u001a\u00020B2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\2\u0006\u0010^\u001a\u00020\tH\u0002J(\u0010_\u001a\u0012\u0012\u0004\u0012\u00020%0`j\b\u0012\u0004\u0012\u00020%`a2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\\H\u0002J\u0006\u0010c\u001a\u00020BJ\b\u0010d\u001a\u00020BH\u0002J\b\u0010e\u001a\u00020BH\u0002J\b\u0010f\u001a\u00020BH\u0016J\b\u0010g\u001a\u00020\rH\u0016J=\u0010h\u001a\u00020B2\u0006\u0010i\u001a\u00020j2\u0006\u0010C\u001a\u00020D2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010l2\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010lH\u0001J\b\u0010n\u001a\u00020BH\u0014J\u0018\u0010o\u001a\u00020B2\u0006\u0010p\u001a\u00020\t2\u0006\u0010q\u001a\u00020\rH\u0016J\u001a\u0010r\u001a\u00020B2\u0006\u0010p\u001a\u00020\t2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\u0018\u0010u\u001a\u00020B2\u0006\u0010p\u001a\u00020\t2\u0006\u0010v\u001a\u00020wH\u0016J\u0018\u0010x\u001a\u00020B2\u0006\u0010y\u001a\u00020\t2\u0006\u0010z\u001a\u00020{H\u0016J\u001c\u0010|\u001a\u00020B2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020L0KH\u0016J\u001a\u0010~\u001a\u00020B2\u0006\u0010p\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u001a\u0010\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010Y\u001a\u00020ZH\u0016J=\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020\t2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\tH\u0016J-\u0010\u0001\u001a\u00020B2\"\u0010\u0001\u001a\u001d\u0012\u0004\u0012\u00020\t\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u00010K\u0018\u00010KH\u0016J4\u0010\u0001\u001a\u00020B2\u0006\u0010I\u001a\u00020\t2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0015\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0016J\u001a\u0010\u0001\u001a\u00020B2\u0006\u0010p\u001a\u00020\t2\u0007\u0010\u0001\u001a\u000208H\u0016J\u001b\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\rH\u0016J\t\u0010\u0001\u001a\u00020BH\u0016J\u0011\u0010\u0001\u001a\u00020B2\u0006\u0010p\u001a\u00020\tH\u0002J,\u0010\u0001\u001a\u00020B2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\t2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\t2\u0007\u0010\u0001\u001a\u00020\tH\u0001J\u0013\u0010\u0001\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010:\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020\rH\u0016J\u0012\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u000208H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u000bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000bR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000bR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002080\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u000bR\u000e\u0010@\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 \u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedViewModel;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "Lcom/ss/android/lark/moments/impl/feed/model/IMomentsFeedViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$IDataProvider;", "Lcom/ss/android/lark/moments/impl/privatechat/IMomentsSecretChatHandler;", "()V", "cannotReadToastStr", "Landroidx/lifecycle/MutableLiveData;", "", "getCannotReadToastStr", "()Landroidx/lifecycle/MutableLiveData;", "completeRefresh", "", "getCompleteRefresh", "feedOrder", "Lcom/bytedance/lark/pb/moments/v1/FeedOrder;", "getFeedOrder", "()Lcom/bytedance/lark/pb/moments/v1/FeedOrder;", "setFeedOrder", "(Lcom/bytedance/lark/pb/moments/v1/FeedOrder;)V", "from", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "hashTagContent", "getHashTagContent", "setHashTagContent", "hashTagOrder", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;", "getHashTagOrder", "()Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;", "setHashTagOrder", "(Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;)V", "isFirstInit", "mBroadcastsItem", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "mIsLoadMore", "mListDataReady", "mPushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "needRefresh", "getNeedRefresh", "outPageApi", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "getOutPageApi", "()Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "setOutPageApi", "(Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;)V", "pageEntityId", "getPageEntityId", "setPageEntityId", "pageLoading", "getPageLoading", "scrollPosition", "", "getScrollPosition", "showCircleLoading", "getShowCircleLoading", "toTimeTab", "getToTimeTab", "toastResId", "getToastResId", "token", "acceptSecretChat", "", "context", "Landroid/content/Context;", "appendBroadcastListIfNeed", "canLoadMore", "getPostById", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "id", "getRelateUserMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getUserById", "handleCategoryListLoadMore", "result", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/GetTabFeedResponse;", "handleCategoryListRefresh", "isRefresh", "isLocal", "handleHashTagListLoadMore", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsResponse;", "handleHashTagListRefresh", "handleListLoadMore", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "entryList", "", "Lcom/bytedance/lark/pb/moments/v1/FeedEntry;", "nextPageToken", "handleNoMoreItem", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "initData", "loadBroadcast", "loadFirstPage", "loadMore", "needShowFrom", "observeRequestResult", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onInputDialogShowListener", "Lkotlin/Function0;", "onInputDialogDismissListener", "onCleared", "onPushBroadcastChanged", "postId", "isBroadcast", "onPushCommentSetChanged", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "onPushDistributionChanged", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushMomentUser", "newUserMap", "onPushNewPostUpdate", "onPushPostEntityChanged", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "onPushPostStatusChanged", "localPostId", "newPost", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "errorMessage", "onPushPreviewChanged", "updateMaps", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "onPushShareCountChanged", "shareCount", "onPushUserFollow", "userId", "isFollow", "refreshList", "removePostFromList", "requestSecretChat", "commentId", "anonymousName", "sendNewPost", "response", "Lcom/bytedance/lark/pb/moments/v1/CreatePostResponse;", "isLoading", "toastString", "resId", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.c */
public final class MomentsFeedViewModel extends MomentsBaseViewModel implements IMomentsSecretChatHandler, MomentsFeedDataProvider.IDataProvider, MomentsPushHandler.IMomentsPushListener {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ MomentsSecretChatHandler $$delegate_0 = new MomentsSecretChatHandler();
    private final C1177w<String> cannotReadToastStr = new C1177w<>();
    private final C1177w<Boolean> completeRefresh = new C1177w<>();
    private FeedOrder feedOrder = FeedOrder.UNSPECIFIED;
    private String from;
    private String hashTagContent = "";
    private ListHashtagPostsRequest.HashtagPostOrder hashTagOrder = ListHashtagPostsRequest.HashtagPostOrder.UNKNOWN;
    private boolean isFirstInit = true;
    public volatile IMomentsItemBase mBroadcastsItem;
    public boolean mIsLoadMore;
    public boolean mListDataReady;
    private final MomentsPushHandler mPushHandler = new MomentsPushHandler(this);
    private final C1177w<Boolean> needRefresh = new C1177w<>();
    private MomentsFeedFragment.OutPageApi outPageApi;
    private String pageEntityId = "";
    private final C1177w<Boolean> pageLoading = new C1177w<>();
    private final C1177w<Integer> scrollPosition = new C1177w<>();
    private final C1177w<Boolean> showCircleLoading = new C1177w<>();
    private final C1177w<Boolean> toTimeTab = new C1177w<>();
    private final C1177w<Integer> toastResId = new C1177w<>();
    public String token = "";

    public void acceptSecretChat(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.$$delegate_0.mo166878a(context, str);
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void observeRequestResult(LifecycleOwner lifecycleOwner, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.$$delegate_0.observeRequestResult(lifecycleOwner, context, function0, function02);
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void requestSecretChat(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
        this.$$delegate_0.requestSecretChat(str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedViewModel$Companion;", "", "()V", "LOG_TAG", "", "MAX_COMPARE_COUNT", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/feed/model/MomentsFeedViewModel$removePostFromList$1", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$g */
    public static final class C47556g implements IMomentsUpdater {
        @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
        /* renamed from: a */
        public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
            Intrinsics.checkParameterIsNotNull(iMomentsItemBase, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return null;
        }

        C47556g() {
        }
    }

    public final C1177w<String> getCannotReadToastStr() {
        return this.cannotReadToastStr;
    }

    public C1177w<Boolean> getCompleteRefresh() {
        return this.completeRefresh;
    }

    public final FeedOrder getFeedOrder() {
        return this.feedOrder;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getHashTagContent() {
        return this.hashTagContent;
    }

    public final ListHashtagPostsRequest.HashtagPostOrder getHashTagOrder() {
        return this.hashTagOrder;
    }

    public final C1177w<Boolean> getNeedRefresh() {
        return this.needRefresh;
    }

    public final MomentsFeedFragment.OutPageApi getOutPageApi() {
        return this.outPageApi;
    }

    public final String getPageEntityId() {
        return this.pageEntityId;
    }

    public final C1177w<Boolean> getPageLoading() {
        return this.pageLoading;
    }

    public C1177w<Integer> getScrollPosition() {
        return this.scrollPosition;
    }

    public C1177w<Boolean> getShowCircleLoading() {
        return this.showCircleLoading;
    }

    public final C1177w<Boolean> getToTimeTab() {
        return this.toTimeTab;
    }

    public C1177w<Integer> getToastResId() {
        return this.toastResId;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider.IDataProvider
    public Map<String, MomentUser> getRelateUserMap() {
        return getUserMap();
    }

    public boolean canLoadMore() {
        if (this.token.length() > 0) {
            return true;
        }
        return false;
    }

    private final void loadFirstPage() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47553d(this, null), 2, null);
    }

    public final void appendBroadcastListIfNeed() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47551b(this, null), 2, null);
    }

    public final void initData() {
        if (this.isFirstInit) {
            this.isFirstInit = false;
            loadFirstPage();
            loadBroadcast();
            this.mPushHandler.mo167187a();
            MomentsFeedDataProvider.f119940a.mo167033a().mo167030a(this);
        }
    }

    public void loadMore() {
        MomentsAppreciableHitPoint.f119684a.mo166772x();
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47554e(this, null), 2, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        super.onCleared();
        this.mPushHandler.mo167188b();
        MomentsFeedDataProvider.f119940a.mo167033a().mo167032b(this);
    }

    public void refreshList() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47555f(this, null), 2, null);
    }

    public final void loadBroadcast() {
        if (!Intrinsics.areEqual(this.pageEntityId, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue()))) {
            this.mBroadcastsItem = null;
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47552c(this, null), 2, null);
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public boolean needShowFrom() {
        if (Intrinsics.areEqual(this.pageEntityId, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue())) || Intrinsics.areEqual(this.pageEntityId, String.valueOf(Tab.FeedTabId.FEED_FOLLOWING.getValue())) || Intrinsics.areEqual(this.from, "value_from_hashtag")) {
            return true;
        }
        return false;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setOutPageApi(MomentsFeedFragment.OutPageApi cVar) {
        this.outPageApi = cVar;
    }

    public final void setFeedOrder(FeedOrder feedOrder2) {
        Intrinsics.checkParameterIsNotNull(feedOrder2, "<set-?>");
        this.feedOrder = feedOrder2;
    }

    public final void setHashTagContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.hashTagContent = str;
    }

    public final void setHashTagOrder(ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder) {
        Intrinsics.checkParameterIsNotNull(hashtagPostOrder, "<set-?>");
        this.hashTagOrder = hashtagPostOrder;
    }

    public final void setPageEntityId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pageEntityId = str;
    }

    public MomentUser getUserById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return getUserMap().get(str);
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void showCircleLoading(boolean z) {
        getShowCircleLoading().mo5926a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void toastString(int i) {
        getToastResId().mo5926a(Integer.valueOf(i));
    }

    private final void removePostFromList(String str) {
        updateDataList(new KeyMatcher(str), new C47556g());
    }

    public void sendNewPost(CreatePostResponse createPostResponse) {
        Intrinsics.checkParameterIsNotNull(createPostResponse, "response");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47557h(this, createPostResponse, null), 2, null);
    }

    private final ArrayList<IMomentsItemBase> handleNoMoreItem(List<? extends IMomentsItemBase> list) {
        ArrayList<IMomentsItemBase> arrayList = new ArrayList<>();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (!canLoadMore() && (!arrayList.isEmpty())) {
            arrayList.add(new MomentsFeedNoMoreItem());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider.IDataProvider
    public IMomentsPost getPostById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        List<IMomentsItemBase> list = (List) getDataList().mo5927b();
        if (list != null) {
            for (IMomentsItemBase iMomentsItemBase : list) {
                if ((iMomentsItemBase instanceof IMomentsPost) && Intrinsics.areEqual(iMomentsItemBase.mo166379a(), str)) {
                    return (IMomentsPost) iMomentsItemBase;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$loadBroadcast$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {0}, mo239175l = {197}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$c */
    public static final class C47552c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47552c(MomentsFeedViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47552c cVar2 = new C47552c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47552c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
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
            List list = (List) obj;
            if (list == null) {
                Log.m165383e("moments_feed", "load broadcast fail");
                return Unit.INSTANCE;
            }
            if (list.isEmpty()) {
                Log.m165389i("moments_feed", "broadcast list is empty");
                if (this.this$0.mBroadcastsItem != null) {
                    this.this$0.mBroadcastsItem = null;
                }
            } else {
                this.this$0.mBroadcastsItem = new MomentsBroadcastItem(list);
            }
            this.this$0.appendBroadcastListIfNeed();
            return Unit.INSTANCE;
        }
    }

    public final void handleCategoryListLoadMore(SdkResponse<GetTabFeedResponse> cVar) {
        if (cVar.mo167292b() != null) {
            Log.m165383e("moments_feed", "category feed list load more failed:" + cVar.mo167292b().getDisplayMsg());
            MomentsAppreciableHitPoint.f119684a.mo166741a(MomentsAppreciableHitPoint.f119684a.mo166746c(), true, ErrorType.SDK, cVar.mo167292b().getErrorCode());
            if (cVar.mo167292b().getErrorCode() == 330503) {
                this.cannotReadToastStr.mo5926a(cVar.mo167292b().getDisplayMsg());
                return;
            }
            return;
        }
        GetTabFeedResponse a = cVar.mo167291a();
        if (a != null) {
            Entities entities = a.entities;
            List<FeedEntry> list = a.entry_list;
            String str = a.next_page_token;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
            handleListLoadMore(entities, list, str);
        }
    }

    public final void handleHashTagListLoadMore(SdkResponse<ListHashtagPostsResponse> cVar) {
        if (cVar.mo167292b() != null) {
            Log.m165383e("moments_feed", "hashtag feed list load more failed:" + cVar.mo167292b().getDisplayMsg());
            MomentsAppreciableHitPoint.f119684a.mo166741a(MomentsAppreciableHitPoint.f119684a.mo166746c(), true, ErrorType.SDK, cVar.mo167292b().getErrorCode());
            if (cVar.mo167292b().getErrorCode() == 330503) {
                this.cannotReadToastStr.mo5926a(cVar.mo167292b().getDisplayMsg());
                return;
            }
            return;
        }
        ListHashtagPostsResponse a = cVar.mo167291a();
        if (a != null) {
            Entities entities = a.entities;
            List<FeedEntry> list = a.entry_list;
            String str = a.next_page_token;
            Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
            handleListLoadMore(entities, list, str);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "newUserMap");
        Log.m165389i("moments_feed", "onPushMomentUser, size is:" + map.size());
        getUserMap().putAll(map);
        for (T t : map.keySet()) {
            MomentUser momentUser = map.get(t);
            StringBuilder sb = new StringBuilder();
            sb.append("onPushMomentsUser, update:");
            sb.append((String) t);
            sb.append("，userName:");
            String str = null;
            sb.append(momentUser != null ? momentUser.name : null);
            sb.append(", avatarKey:");
            if (momentUser != null) {
                str = momentUser.avatar_key;
            }
            sb.append(str);
            Log.m165389i("moments_feed", sb.toString());
            userChanged(t);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Map<String, ? extends UrlPreviewEntity>> entry : map.entrySet()) {
                MomentsFeedViewModel cVar = this;
                updateDataList(new KeyMatcher(entry.getKey()), new PreviewUpdater((Map) entry.getValue(), cVar));
                updateDataList(new HotCommentMatcher(entry.getKey()), new HotCommentPreviewUpdater(entry.getKey(), (Map) entry.getValue(), cVar));
                updateDataList(new ReplyCommentMatcher(entry.getKey()), new ReplyCommentPreviewUpdater((Map) entry.getValue(), this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$appendBroadcastListIfNeed$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$b */
    public static final class C47551b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47551b(MomentsFeedViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47551b bVar = new C47551b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47551b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 148
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel.C47551b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$loadMore$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {0, 1}, mo239175l = {177, 184}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$e */
    public static final class C47554e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47554e(MomentsFeedViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47554e eVar = new C47554e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47554e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MomentsFeedViewModel cVar;
            int i;
            List<FeedEntry> list;
            Integer a;
            Object a2 = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.this$0.mIsLoadMore) {
                    return Unit.INSTANCE;
                }
                this.this$0.mIsLoadMore = true;
                MomentsAppreciableHitPoint.f119684a.mo166773y();
                if (!Intrinsics.areEqual(this.this$0.getFrom(), "value_from_hashtag")) {
                    MomentsSDKService bVar = MomentsSDKService.f120147a;
                    String pageEntityId = this.this$0.getPageEntityId();
                    String str = this.this$0.token;
                    FeedOrder feedOrder = this.this$0.getFeedOrder();
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = bVar.mo167231a(pageEntityId, str, false, feedOrder, 8, (Continuation<? super SdkResponse<GetTabFeedResponse>>) this);
                    if (obj == a2) {
                        return a2;
                    }
                } else {
                    MomentsFeedViewModel cVar2 = this.this$0;
                    MomentsSDKService bVar2 = MomentsSDKService.f120147a;
                    String pageEntityId2 = this.this$0.getPageEntityId();
                    String str2 = this.this$0.token;
                    ListHashtagPostsRequest.HashtagPostOrder hashTagOrder = this.this$0.getHashTagOrder();
                    this.L$0 = ahVar;
                    this.L$1 = cVar2;
                    this.label = 2;
                    obj = bVar2.mo167230a(pageEntityId2, str2, hashTagOrder, this);
                    if (obj == a2) {
                        return a2;
                    }
                    cVar = cVar2;
                    cVar.handleHashTagListLoadMore((SdkResponse) obj);
                    this.this$0.mIsLoadMore = false;
                    this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
                    return Unit.INSTANCE;
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i2 == 2) {
                cVar = (MomentsFeedViewModel) this.L$1;
                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                cVar.handleHashTagListLoadMore((SdkResponse) obj);
                this.this$0.mIsLoadMore = false;
                this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse<GetTabFeedResponse> cVar3 = (SdkResponse) obj;
            MomentsAppreciableHitPoint.f119684a.mo166774z();
            MomentsAppreciableHitPoint aVar = MomentsAppreciableHitPoint.f119684a;
            GetTabFeedResponse a3 = cVar3.mo167291a();
            if (a3 == null || (list = a3.entry_list) == null || (a = C69089a.m265839a(list.size())) == null) {
                i = 0;
            } else {
                i = a.intValue();
            }
            aVar.mo166747c(i);
            this.this$0.handleCategoryListLoadMore(cVar3);
            MomentsAppreciableHitPoint.f119684a.mo166716A();
            this.this$0.mIsLoadMore = false;
            this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$refreshList$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {0, 1}, mo239175l = {259, 266}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$f */
    public static final class C47555f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47555f(MomentsFeedViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47555f fVar = new C47555f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47555f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            List<FeedEntry> list;
            Integer a;
            Object a2 = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.mListDataReady = false;
                MomentsAppreciableHitPoint.f119684a.mo166767s();
                if (!Intrinsics.areEqual(this.this$0.getFrom(), "value_from_hashtag")) {
                    MomentsSDKService bVar = MomentsSDKService.f120147a;
                    String pageEntityId = this.this$0.getPageEntityId();
                    FeedOrder feedOrder = this.this$0.getFeedOrder();
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = MomentsSDKService.m188519a(bVar, pageEntityId, null, false, feedOrder, 8, this, 6, null);
                    if (obj == a2) {
                        return a2;
                    }
                } else {
                    MomentsSDKService bVar2 = MomentsSDKService.f120147a;
                    String pageEntityId2 = this.this$0.getPageEntityId();
                    ListHashtagPostsRequest.HashtagPostOrder hashTagOrder = this.this$0.getHashTagOrder();
                    this.L$0 = ahVar;
                    this.label = 2;
                    obj = MomentsSDKService.m188518a(bVar2, pageEntityId2, (String) null, hashTagOrder, this, 2, (Object) null);
                    if (obj == a2) {
                        return a2;
                    }
                    this.this$0.handleHashTagListRefresh((SdkResponse) obj, true);
                    this.this$0.loadBroadcast();
                    this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
                    return Unit.INSTANCE;
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i2 == 2) {
                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                this.this$0.handleHashTagListRefresh((SdkResponse) obj, true);
                this.this$0.loadBroadcast();
                this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse<GetTabFeedResponse> cVar = (SdkResponse) obj;
            MomentsAppreciableHitPoint.f119684a.mo166768t();
            MomentsAppreciableHitPoint aVar = MomentsAppreciableHitPoint.f119684a;
            GetTabFeedResponse a3 = cVar.mo167291a();
            if (a3 == null || (list = a3.entry_list) == null || (a = C69089a.m265839a(list.size())) == null) {
                i = 0;
            } else {
                i = a.intValue();
            }
            aVar.mo166744b(i);
            this.this$0.handleCategoryListRefresh(cVar, true, false);
            MomentsAppreciableHitPoint.f119684a.mo166769u();
            this.this$0.loadBroadcast();
            this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$sendNewPost$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$h */
    public static final class C47557h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CreatePostResponse $response;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47557h(MomentsFeedViewModel cVar, CreatePostResponse createPostResponse, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$response = createPostResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47557h hVar = new C47557h(this.this$0, this.$response, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47557h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            if (r3 == true) goto L_0x0047;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel.C47557h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel$loadFirstPage$1", mo239173f = "MomentsFeedViewModel.kt", mo239174i = {0, 1, 2}, mo239175l = {139, 146, 154}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.c$d */
    public static final class C47553d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47553d(MomentsFeedViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47553d dVar = new C47553d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47553d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ff A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0111  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 309
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel.C47553d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewCommentUpdate(String str, Entities entities) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188471b(this, str, entities);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushUserFollow(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        updateUserFollowStatus(str, z);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushBroadcastChanged(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        updateDataList(new KeyMatcher(str), new BroadcastUpdater(z, this));
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
    public void onPushEntityDeleted(String str, EntityType entityType) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        if (entityType == EntityType.POST) {
            removePostFromList(str);
        } else if (entityType == EntityType.COMMENT) {
            updateDataList(new HotCommentMatcher(str), new HotCommentDeleteUpdater(str, this));
        }
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
        Map<String, Category> map;
        String str;
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        Map<String, MomentUser> map2 = entities.users;
        Map<String, MomentUser> userMap = getUserMap();
        Intrinsics.checkExpressionValueIsNotNull(map2, "it");
        userMap.putAll(map2);
        Map<String, MomentsCommentVM> parseComment = parseComment(entities.comments, entities);
        List<String> list = post.category_ids;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (map = entities.categories) != null) {
            List<String> list2 = post.category_ids;
            if (list2 != null) {
                str = list2.get(0);
            } else {
                str = null;
            }
            category = map.get(str);
        } else {
            category = null;
        }
        String str2 = post.id;
        Intrinsics.checkExpressionValueIsNotNull(str2, "post.id");
        MomentsPostVM convertToPostVM = convertToPostVM(post, parseComment, category, parserPreviews(str2, post.url_preview_hang_point_map, entities.preview_entities));
        if (convertToPostVM != null) {
            String str3 = post.id;
            Intrinsics.checkExpressionValueIsNotNull(str3, "post.id");
            updateDataList(new KeyMatcher(str3), new ReplaceUpdater(convertToPostVM, false, 2, null));
        }
    }

    public final void handleHashTagListRefresh(SdkResponse<ListHashtagPostsResponse> cVar, boolean z) {
        boolean z2;
        Category category;
        Entities entities;
        Map<String, Category> map;
        List<String> list;
        Map<String, Post> map2;
        Map<String, MomentUser> map3;
        MomentsAppreciableHitPoint.AppreciableKey aVar;
        boolean z3;
        boolean z4;
        if (cVar.mo167292b() != null) {
            Log.m165383e("moments_feed", "load hashtag feed list failed:" + cVar.mo167292b().getDisplayMsg());
            DataCacheLiveData dataList = getDataList();
            ArrayList arrayList = new ArrayList();
            if (!Intrinsics.areEqual(this.from, "value_from_hashtag") || this.hashTagOrder != ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                z4 = false;
            } else {
                z4 = true;
            }
            arrayList.add(new MomentsFeedNoPostItem(true, true, false, z4, this.pageEntityId));
            dataList.mo5926a(arrayList);
            return;
        }
        ListHashtagPostsResponse a = cVar.mo167291a();
        if (a == null) {
            MomentsAppreciableHitPoint aVar2 = MomentsAppreciableHitPoint.f119684a;
            MomentsAppreciableHitPoint aVar3 = MomentsAppreciableHitPoint.f119684a;
            if (z) {
                aVar = aVar3.mo166743b();
            } else {
                aVar = aVar3.mo166739a();
            }
            MomentsAppreciableHitPoint.m187967a(aVar2, aVar, true, ErrorType.SDK, 0, 8, null);
            DataCacheLiveData dataList2 = getDataList();
            ArrayList arrayList2 = new ArrayList();
            if (!Intrinsics.areEqual(this.from, "value_from_hashtag") || this.hashTagOrder != ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                z3 = false;
            } else {
                z3 = true;
            }
            arrayList2.add(new MomentsFeedNoPostItem(true, true, false, z3, this.pageEntityId));
            dataList2.mo5926a(arrayList2);
            return;
        }
        String str = a.next_page_token;
        Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
        this.token = str;
        Entities entities2 = a.entities;
        if (!(entities2 == null || (map3 = entities2.users) == null)) {
            getUserMap().putAll(map3);
        }
        Entities entities3 = a.entities;
        ArrayList arrayList3 = null;
        Map<String, MomentsCommentVM> parseComment = parseComment(entities3 != null ? entities3.comments : null, a.entities);
        List<FeedEntry> list2 = a.entry_list;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (T t : list2) {
                Entities entities4 = a.entities;
                Post post = (entities4 == null || (map2 = entities4.posts) == null) ? null : map2.get(t.post_id);
                List<String> list3 = post != null ? post.category_ids : null;
                if (list3 == null || list3.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || (entities = a.entities) == null || (map = entities.categories) == null) {
                    category = null;
                } else {
                    category = map.get((post == null || (list = post.category_ids) == null) ? null : list.get(0));
                }
                String str2 = t.post_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "entry.post_id");
                Map<String, UrlPreviewHangPoint> map4 = post != null ? post.url_preview_hang_point_map : null;
                Entities entities5 = a.entities;
                MomentsPostVM convertToPostVM = convertToPostVM(post, parseComment, category, parserPreviews(str2, map4, entities5 != null ? entities5.preview_entities : null));
                if (convertToPostVM != null) {
                    arrayList4.add(convertToPostVM);
                }
            }
            arrayList3 = arrayList4;
        }
        ArrayList<IMomentsItemBase> handleNoMoreItem = handleNoMoreItem(arrayList3);
        IMomentsItemBase iMomentsItemBase = this.mBroadcastsItem;
        if (iMomentsItemBase != null) {
            handleNoMoreItem.add(0, iMomentsItemBase);
        }
        if (handleNoMoreItem.isEmpty() && !z && Intrinsics.areEqual(this.from, "value_from_hashtag")) {
            this.toTimeTab.mo5926a((Boolean) true);
        }
        getDataList().mo5926a(new CopyOnWriteArrayList(handleNoMoreItem));
        getScrollPosition().mo5926a((Integer) 0);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (map != null) {
            getUserMap().putAll(map);
        }
        MomentsFeedViewModel cVar = this;
        updateDataList(new KeyMatcher(str), new ReactionUpdater(reactionSet, getUserMap(), cVar));
        updateDataList(new HotCommentMatcher(str), new HotCommentReactionUpdater(str, reactionSet, getUserMap(), cVar));
    }

    private final void handleListLoadMore(Entities entities, List<FeedEntry> list, String str) {
        boolean z;
        Category category;
        Map<String, Category> map;
        List<String> list2;
        Map<String, Post> map2;
        Map<String, MomentUser> map3;
        this.token = str;
        if (!(entities == null || (map3 = entities.users) == null)) {
            getUserMap().putAll(map3);
        }
        ArrayList arrayList = null;
        Map<String, MomentsCommentVM> parseComment = parseComment(entities != null ? entities.comments : null, entities);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                Post post = (entities == null || (map2 = entities.posts) == null) ? null : map2.get(t.post_id);
                List<String> list3 = post != null ? post.category_ids : null;
                if (list3 == null || list3.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || entities == null || (map = entities.categories) == null) {
                    category = null;
                } else {
                    category = map.get((post == null || (list2 = post.category_ids) == null) ? null : list2.get(0));
                }
                String str2 = t.post_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "entry.post_id");
                MomentsPostVM convertToPostVM = convertToPostVM(post, parseComment, category, parserPreviews(str2, post != null ? post.url_preview_hang_point_map : null, entities != null ? entities.preview_entities : null));
                if (convertToPostVM != null) {
                    arrayList2.add(convertToPostVM);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            List list4 = (List) getDataList().mo5927b();
            if (list4 != null) {
                arrayList3.addAll(list4);
            }
            arrayList3.addAll(arrayList);
            getDataList().mo5926a(new CopyOnWriteArrayList(handleNoMoreItem(arrayList3)));
        }
    }

    public final void handleCategoryListRefresh(SdkResponse<GetTabFeedResponse> cVar, boolean z, boolean z2) {
        boolean z3;
        Category category;
        Entities entities;
        Map<String, Category> map;
        List<String> list;
        Map<String, Post> map2;
        Map<String, MomentUser> map3;
        MomentsAppreciableHitPoint.AppreciableKey aVar;
        boolean z4;
        boolean z5;
        MomentsAppreciableHitPoint.AppreciableKey aVar2;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        if (cVar.mo167292b() != null) {
            MomentsAppreciableHitPoint aVar3 = MomentsAppreciableHitPoint.f119684a;
            MomentsAppreciableHitPoint aVar4 = MomentsAppreciableHitPoint.f119684a;
            if (z) {
                aVar2 = aVar4.mo166743b();
            } else {
                aVar2 = aVar4.mo166739a();
            }
            if (!z && z2) {
                z6 = false;
            } else {
                z6 = true;
            }
            aVar3.mo166741a(aVar2, z6, ErrorType.SDK, cVar.mo167292b().getErrorCode());
            Log.m165383e("moments_feed", "load feed list failed:" + cVar.mo167292b().getDisplayMsg());
            if (cVar.mo167292b().getErrorCode() == 330503) {
                this.cannotReadToastStr.mo5926a(cVar.mo167292b().getDisplayMsg());
            }
            if (z2 || !Intrinsics.areEqual(this.pageEntityId, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.ordinal()))) {
                DataCacheLiveData dataList = getDataList();
                ArrayList arrayList = new ArrayList();
                if (!Intrinsics.areEqual(this.from, "value_from_hashtag") || this.hashTagOrder != ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                arrayList.add(new MomentsFeedNoPostItem(true, true, false, z7, this.pageEntityId));
                dataList.mo5926a(arrayList);
                return;
            }
            return;
        }
        GetTabFeedResponse a = cVar.mo167291a();
        if (a == null) {
            MomentsAppreciableHitPoint aVar5 = MomentsAppreciableHitPoint.f119684a;
            MomentsAppreciableHitPoint aVar6 = MomentsAppreciableHitPoint.f119684a;
            if (z) {
                aVar = aVar6.mo166743b();
            } else {
                aVar = aVar6.mo166739a();
            }
            if (!z && z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            MomentsAppreciableHitPoint.m187967a(aVar5, aVar, z4, ErrorType.SDK, 0, 8, null);
            if (z2 || !Intrinsics.areEqual(this.pageEntityId, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.ordinal()))) {
                DataCacheLiveData dataList2 = getDataList();
                ArrayList arrayList2 = new ArrayList();
                if (!Intrinsics.areEqual(this.from, "value_from_hashtag") || this.hashTagOrder != ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                arrayList2.add(new MomentsFeedNoPostItem(true, true, false, z5, this.pageEntityId));
                dataList2.mo5926a(arrayList2);
                return;
            }
            return;
        }
        this.mListDataReady = true;
        String str = a.next_page_token;
        Intrinsics.checkExpressionValueIsNotNull(str, "response.next_page_token");
        this.token = str;
        Entities entities2 = a.entities;
        if (!(entities2 == null || (map3 = entities2.users) == null)) {
            getUserMap().putAll(map3);
        }
        Entities entities3 = a.entities;
        ArrayList arrayList3 = null;
        Map<String, MomentsCommentVM> parseComment = parseComment(entities3 != null ? entities3.comments : null, a.entities);
        List<FeedEntry> list2 = a.entry_list;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (T t : list2) {
                Entities entities4 = a.entities;
                Post post = (entities4 == null || (map2 = entities4.posts) == null) ? null : map2.get(t.post_id);
                List<String> list3 = post != null ? post.category_ids : null;
                if (list3 == null || list3.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || (entities = a.entities) == null || (map = entities.categories) == null) {
                    category = null;
                } else {
                    category = map.get((post == null || (list = post.category_ids) == null) ? null : list.get(0));
                }
                String str2 = t.post_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "entry.post_id");
                Map<String, UrlPreviewHangPoint> map4 = post != null ? post.url_preview_hang_point_map : null;
                Entities entities5 = a.entities;
                MomentsPostVM convertToPostVM = convertToPostVM(post, parseComment, category, parserPreviews(str2, map4, entities5 != null ? entities5.preview_entities : null));
                if (convertToPostVM != null) {
                    arrayList4.add(convertToPostVM);
                }
            }
            arrayList3 = arrayList4;
        }
        if (z || !z2 || !CollectionUtils.isEmpty(arrayList3)) {
            z8 = false;
        }
        if (!z8) {
            ArrayList<IMomentsItemBase> handleNoMoreItem = handleNoMoreItem(arrayList3);
            IMomentsItemBase iMomentsItemBase = this.mBroadcastsItem;
            if (iMomentsItemBase != null) {
                handleNoMoreItem.add(0, iMomentsItemBase);
            }
            getDataList().mo5926a(new CopyOnWriteArrayList(handleNoMoreItem));
            getScrollPosition().mo5926a((Integer) 0);
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
        boolean z;
        Map<String, Category> map;
        Category category;
        Post.PostContent postContent;
        RichText richText;
        String str3;
        RichTextElement.PropertySet propertySet;
        RichTextElement.MentionProperty mentionProperty;
        RichTextElement.MentionItem mentionItem;
        Intrinsics.checkParameterIsNotNull(str, "localPostId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        updateDataList(new KeyMatcher(str), new PostStatusUpdater(post, entities, createStatus, this, str2));
        if (post != null) {
            String str4 = null;
            if (!Intrinsics.areEqual(this.from, "value_from_hashtag")) {
                List<String> list = post.category_ids;
                List<String> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!(entities == null || (map = entities.categories) == null || (category = map.get(list.get(0))) == null)) {
                        str4 = category.category_id;
                    }
                    if (Intrinsics.areEqual(str4, this.pageEntityId) && createStatus == Post.CreateStatus.SUCCESS) {
                        this.needRefresh.mo5926a((Boolean) true);
                    }
                }
            } else if (this.hashTagOrder == ListHashtagPostsRequest.HashtagPostOrder.CREATE_TIME_DESC && (postContent = post.post_content) != null && (richText = postContent.content) != null) {
                Intrinsics.checkExpressionValueIsNotNull(richText, "newPost.post_content?.content ?: return");
                List<String> list3 = richText.mention_ids;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        RichTextElement richTextElement = richText.elements.get(it.next());
                        if (richTextElement == null || (propertySet = richTextElement.property) == null || (mentionProperty = propertySet.mention) == null || (mentionItem = mentionProperty.item) == null) {
                            str3 = null;
                        } else {
                            str3 = mentionItem.id;
                        }
                        if (Intrinsics.areEqual(str3, this.pageEntityId)) {
                            this.needRefresh.mo5926a((Boolean) true);
                        }
                    }
                }
            }
        }
    }
}
