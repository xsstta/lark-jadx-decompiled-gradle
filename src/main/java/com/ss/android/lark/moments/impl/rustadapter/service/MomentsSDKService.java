package com.ss.android.lark.moments.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.ConfigTabsRequest;
import com.bytedance.lark.pb.moments.v1.ConfigTabsResponse;
import com.bytedance.lark.pb.moments.v1.CreateCommentRequest;
import com.bytedance.lark.pb.moments.v1.CreateCommentResponse;
import com.bytedance.lark.pb.moments.v1.CreatePostRequest;
import com.bytedance.lark.pb.moments.v1.CreatePostResponse;
import com.bytedance.lark.pb.moments.v1.CreateReactionRequest;
import com.bytedance.lark.pb.moments.v1.CreateReactionResponse;
import com.bytedance.lark.pb.moments.v1.DeleteReactionRequest;
import com.bytedance.lark.pb.moments.v1.DeleteReactionResponse;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.GetCategoryDetailRequest;
import com.bytedance.lark.pb.moments.v1.GetCategoryDetailResponse;
import com.bytedance.lark.pb.moments.v1.GetHashtagDetailRequest;
import com.bytedance.lark.pb.moments.v1.GetHashtagDetailResponse;
import com.bytedance.lark.pb.moments.v1.GetKeyValueRequest;
import com.bytedance.lark.pb.moments.v1.GetKeyValueResponse;
import com.bytedance.lark.pb.moments.v1.GetRecommendAtListRequest;
import com.bytedance.lark.pb.moments.v1.GetRecommendAtListResponse;
import com.bytedance.lark.pb.moments.v1.GetTabFeedRequest;
import com.bytedance.lark.pb.moments.v1.GetTabFeedResponse;
import com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsRequest;
import com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsResponse;
import com.bytedance.lark.pb.moments.v1.GetUserProfileRequest;
import com.bytedance.lark.pb.moments.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.moments.v1.ImageInfo;
import com.bytedance.lark.pb.moments.v1.ListBroadcastsRequest;
import com.bytedance.lark.pb.moments.v1.ListBroadcastsResponse;
import com.bytedance.lark.pb.moments.v1.ListCategoriesRequest;
import com.bytedance.lark.pb.moments.v1.ListCategoriesResponse;
import com.bytedance.lark.pb.moments.v1.ListCommentsRequest;
import com.bytedance.lark.pb.moments.v1.ListCommentsResponse;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsResponse;
import com.bytedance.lark.pb.moments.v1.ListNotificationsRequest;
import com.bytedance.lark.pb.moments.v1.ListNotificationsResponse;
import com.bytedance.lark.pb.moments.v1.ListReactionsRequest;
import com.bytedance.lark.pb.moments.v1.ListReactionsResponse;
import com.bytedance.lark.pb.moments.v1.ListTabsRequest;
import com.bytedance.lark.pb.moments.v1.ListTabsResponse;
import com.bytedance.lark.pb.moments.v1.ListUserFollowersRequest;
import com.bytedance.lark.pb.moments.v1.ListUserFollowersResponse;
import com.bytedance.lark.pb.moments.v1.ListUserFollowingsRequest;
import com.bytedance.lark.pb.moments.v1.ListUserFollowingsResponse;
import com.bytedance.lark.pb.moments.v1.ListUserPostsRequest;
import com.bytedance.lark.pb.moments.v1.ListUserPostsResponse;
import com.bytedance.lark.pb.moments.v1.MediaInfo;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Notification;
import com.bytedance.lark.pb.moments.v1.PatchUserSettingRequest;
import com.bytedance.lark.pb.moments.v1.PatchUserSettingResponse;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.bytedance.lark.pb.moments.v1.RetryCreateCommentRequest;
import com.bytedance.lark.pb.moments.v1.RetryCreateCommentResponse;
import com.bytedance.lark.pb.moments.v1.RetryCreatePostRequest;
import com.bytedance.lark.pb.moments.v1.RetryCreatePostResponse;
import com.bytedance.lark.pb.moments.v1.SetKeyValueRequest;
import com.bytedance.lark.pb.moments.v1.SetKeyValueResponse;
import com.bytedance.lark.pb.moments.v1.SharePostRequest;
import com.bytedance.lark.pb.moments.v1.SharePostResponse;
import com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageRequest;
import com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageResponse;
import com.bytedance.lark.pb.moments.v1.UserSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tH@ø\u0001\u0000¢\u0006\u0002\u0010\nJM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019JQ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\"JA\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\f2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010+J+\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100JA\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\f2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010+J(\u00103\u001a\u0004\u0018\u0001042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u000207J\u0019\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J\u0019\u0010:\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010<J\u001b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010@J\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\f2\u0006\u0010!\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J/\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010EJ!\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\f2\u0006\u0010H\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J\u001b\u0010I\u001a\u0004\u0018\u00010\u00042\u0006\u0010J\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J/\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\f2\u0006\u0010M\u001a\u00020\u00042\u0006\u00106\u001a\u0002072\u0006\u0010N\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0019\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010<JE\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\f2\u0006\u0010T\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u00042\b\b\u0002\u0010U\u001a\u00020\u00182\u0006\u0010V\u001a\u00020W2\u0006\u00106\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u0004\u0018\u00010ZH@ø\u0001\u0000¢\u0006\u0002\u0010<J+\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010M\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010]\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010EJ+\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010M\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010]\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0013\u0010`\u001a\u0004\u0018\u00010aH@ø\u0001\u0000¢\u0006\u0002\u0010<J+\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010M\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010]\u001a\u000207H@ø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010\f2\u0006\u00109\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010gJ3\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010i0\f2\u0006\u0010H\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u00042\u0006\u0010V\u001a\u00020jH@ø\u0001\u0000¢\u0006\u0002\u0010kJ3\u0010l\u001a\u0004\u0018\u00010m2\u0016\u0010n\u001a\u0012\u0012\u0004\u0012\u00020o0\bj\b\u0012\u0004\u0012\u00020o`\t2\u0006\u0010p\u001a\u00020qH@ø\u0001\u0000¢\u0006\u0002\u0010rJ%\u0010s\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010;2\b\u0010u\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010vJ\u001f\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\f2\u0006\u0010-\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J\u001f\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\f2\u0006\u0010\u000e\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100JE\u0010{\u001a\u0004\u0018\u0001H|\"\u0004\b\u0000\u0010|2\u0006\u0010}\u001a\u00020~2\u000f\u0010\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0010\u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001H|0\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010\u0001JJ\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H|0\f\"\u0004\b\u0000\u0010|2\u0006\u0010}\u001a\u00020~2\u000f\u0010\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0010\u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001H|0\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010\u0001J&\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010\u0001J/\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010J\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0003\u0010\u0001JA\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u0002072\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0007\u0010\u0001\u001a\u00020\u00042\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0001J\u001a\u0010\u0001\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u00100J!\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00042\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService;", "", "()V", "LOG_TAG", "", "configTabOrder", "Lcom/bytedance/lark/pb/moments/v1/ConfigTabsResponse;", "ids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createComment", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/CreateCommentResponse;", "postId", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "imageInfo", "Lcom/bytedance/lark/pb/moments/v1/ImageInfo;", "replyComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "originCommentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "isAnonymous", "", "(Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Lcom/bytedance/lark/pb/moments/v1/ImageInfo;Lcom/bytedance/lark/pb/moments/v1/Comment;Lcom/bytedance/lark/pb/moments/v1/CommentSet;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPost", "Lcom/bytedance/lark/pb/moments/v1/CreatePostResponse;", "content", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "", "mediaInfo", "Lcom/bytedance/lark/pb/moments/v1/MediaInfo;", "categoryId", "(Lcom/bytedance/lark/pb/basic/v1/RichText;Ljava/util/List;Lcom/bytedance/lark/pb/moments/v1/MediaInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createReaction", "Lcom/bytedance/lark/pb/moments/v1/CreateReactionResponse;", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "reactionKey", "originReactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/EntityType;Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/ReactionSet;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteComment", "commentId", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/CommentSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteReaction", "Lcom/bytedance/lark/pb/moments/v1/DeleteReactionResponse;", "fetchReaction", "Lcom/bytedance/lark/pb/moments/v1/ListReactionsResponse;", "token", "pageCount", "", "followUser", "userId", "getBroadcastList", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/bytedance/lark/pb/moments/v1/ListCategoriesResponse;", "forceRemote", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoryDetail", "Lcom/bytedance/lark/pb/moments/v1/GetCategoryDetailResponse;", "getCommentsList", "Lcom/bytedance/lark/pb/moments/v1/ListCommentsResponse;", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHashTagDetail", "Lcom/bytedance/lark/pb/moments/v1/GetHashtagDetailResponse;", "hashTagId", "getKeyValue", "key", "getNotificationList", "Lcom/bytedance/lark/pb/moments/v1/ListNotificationsResponse;", "pageToken", "category", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendAtList", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getTabFeed", "Lcom/bytedance/lark/pb/moments/v1/GetTabFeedResponse;", "tabId", "isLocalCache", "order", "Lcom/bytedance/lark/pb/moments/v1/FeedOrder;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/bytedance/lark/pb/moments/v1/FeedOrder;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTabList", "Lcom/bytedance/lark/pb/moments/v1/ListTabsResponse;", "getUserFollowers", "Lcom/bytedance/lark/pb/moments/v1/ListUserFollowersResponse;", "count", "getUserFollowings", "Lcom/bytedance/lark/pb/moments/v1/ListUserFollowingsResponse;", "getUserGlobalConfigAndSettings", "Lcom/bytedance/lark/pb/moments/v1/GetUserGlobalConfigAndSettingsResponse;", "getUserPosts", "Lcom/bytedance/lark/pb/moments/v1/ListUserPostsResponse;", "getUserProfile", "Lcom/bytedance/lark/pb/moments/v1/GetUserProfileResponse;", "useLocal", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listHashTagPosts", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsResponse;", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patchUserSetting", "Lcom/bytedance/lark/pb/moments/v1/PatchUserSettingResponse;", "updateField", "Lcom/bytedance/lark/pb/moments/v1/PatchUserSettingRequest$UpdateField;", "userSetting", "Lcom/bytedance/lark/pb/moments/v1/UserSetting;", "(Ljava/util/ArrayList;Lcom/bytedance/lark/pb/moments/v1/UserSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceBroadcastRequest", "broadcast", "unsetPostId", "(Lcom/bytedance/lark/pb/moments/v1/Broadcast;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendComment", "Lcom/bytedance/lark/pb/moments/v1/RetryCreateCommentResponse;", "resendPost", "Lcom/bytedance/lark/pb/moments/v1/RetryCreatePostResponse;", "sdkRequest", "T", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "builder", "Lcom/squareup/wire/Message$Builder;", "iParser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/ss/android/lark/sdk/SdkSender$IParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdkRequestWithErr", "setDistribution", "id", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setKeyValue", "", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/moments/v1/SetKeyValueRequest$KeyType;", "value", "(Lcom/bytedance/lark/pb/moments/v1/SetKeyValueRequest$KeyType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePost", "totalShareCount", "chatIds", "additionNote", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "unFollowUser", "updateProfileBackground", "backgroundToken", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.b.b */
public final class MomentsSDKService {

    /* renamed from: a */
    public static final MomentsSDKService f120147a = new MomentsSDKService();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"replaceBroadcastRequest", "", "broadcast", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "unsetPostId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {59}, mo239176m = "replaceBroadcastRequest", mo239177n = {"this", "broadcast", "unsetPostId", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ad */
    public static final class C47631ad extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47631ad(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167222a((Broadcast) null, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"setDistribution", "", "id", "", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {81}, mo239176m = "setDistribution", mo239177n = {"this", "id", "distributionType", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$aj */
    public static final class aj extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167226a((String) null, (Post.PostDistributionType) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"unFollowUser", "", "userId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0}, mo239175l = {45}, mo239176m = "unFollowUser", mo239177n = {"this", "userId", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ao */
    public static final class ao extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167243b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH@"}, d2 = {"deleteComment", "", "commentId", "", "postId", "originCommentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0, 0, 0}, mo239175l = {91}, mo239176m = "deleteComment", mo239177n = {"this", "commentId", "postId", "originCommentSet", "builder"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$e */
    public static final class C47640e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47640e(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167229a((String) null, (String) null, (CommentSet) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"deletePost", "", "postId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0}, mo239175l = {52}, mo239176m = "deletePost", mo239177n = {"this", "postId", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$g */
    public static final class C47642g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47642g(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167246c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"followUser", "", "userId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService", mo239173f = "MomentsSDKService.kt", mo239174i = {0, 0, 0}, mo239175l = {38}, mo239176m = "followUser", mo239177n = {"this", "userId", "builder"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$k */
    public static final class C47646k extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsSDKService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47646k(MomentsSDKService bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167232a((String) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getUserProfile$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/GetUserProfileResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$aa */
    public static final class C47628aa implements SdkSender.IParser<GetUserProfileResponse> {
        C47628aa() {
        }

        /* renamed from: a */
        public GetUserProfileResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetUserProfileResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$resendComment$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/RetryCreateCommentResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$af */
    public static final class C47633af implements SdkSender.IParser<RetryCreateCommentResponse> {
        C47633af() {
        }

        /* renamed from: a */
        public RetryCreateCommentResponse parse(byte[] bArr) {
            if (bArr != null) {
                return RetryCreateCommentResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$resendPost$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/RetryCreatePostResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ag */
    public static final class C47634ag implements SdkSender.IParser<RetryCreatePostResponse> {
        C47634ag() {
        }

        /* renamed from: a */
        public RetryCreatePostResponse parse(byte[] bArr) {
            if (bArr != null) {
                return RetryCreatePostResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$createComment$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/CreateCommentResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$b */
    public static final class C47637b implements SdkSender.IParser<CreateCommentResponse> {
        C47637b() {
        }

        /* renamed from: a */
        public CreateCommentResponse parse(byte[] bArr) {
            if (bArr != null) {
                return CreateCommentResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$createPost$4", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/CreatePostResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$c */
    public static final class C47638c implements SdkSender.IParser<CreatePostResponse> {
        C47638c() {
        }

        /* renamed from: a */
        public CreatePostResponse parse(byte[] bArr) {
            if (bArr != null) {
                return CreatePostResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$createReaction$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/CreateReactionResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$d */
    public static final class C47639d implements SdkSender.IParser<CreateReactionResponse> {
        C47639d() {
        }

        /* renamed from: a */
        public CreateReactionResponse parse(byte[] bArr) {
            if (bArr != null) {
                return CreateReactionResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$deleteReaction$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/DeleteReactionResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$i */
    public static final class C47644i implements SdkSender.IParser<DeleteReactionResponse> {
        C47644i() {
        }

        /* renamed from: a */
        public DeleteReactionResponse parse(byte[] bArr) {
            if (bArr != null) {
                return DeleteReactionResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$fetchReaction$1", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListReactionsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$j */
    public static final class C47645j implements SdkSender.IParser<ListReactionsResponse> {
        C47645j() {
        }

        /* renamed from: a */
        public ListReactionsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListReactionsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getBroadcastList$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$m */
    public static final class C47648m implements SdkSender.IParser<List<? extends Broadcast>> {
        C47648m() {
        }

        /* renamed from: a */
        public List<Broadcast> parse(byte[] bArr) {
            if (bArr != null) {
                return ListBroadcastsResponse.ADAPTER.decode(bArr).broadcasts;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getCommentsList$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListCommentsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$p */
    public static final class C47651p implements SdkSender.IParser<ListCommentsResponse> {
        C47651p() {
        }

        /* renamed from: a */
        public ListCommentsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListCommentsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getNotificationList$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListNotificationsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$s */
    public static final class C47654s implements SdkSender.IParser<ListNotificationsResponse> {
        C47654s() {
        }

        /* renamed from: a */
        public ListNotificationsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListNotificationsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getTabFeed$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/GetTabFeedResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$u */
    public static final class C47656u implements SdkSender.IParser<GetTabFeedResponse> {
        C47656u() {
        }

        /* renamed from: a */
        public GetTabFeedResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetTabFeedResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getUserFollowers$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListUserFollowersResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$w */
    public static final class C47658w implements SdkSender.IParser<ListUserFollowersResponse> {
        C47658w() {
        }

        /* renamed from: a */
        public ListUserFollowersResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListUserFollowersResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getUserFollowings$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListUserFollowingsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$x */
    public static final class C47659x implements SdkSender.IParser<ListUserFollowingsResponse> {
        C47659x() {
        }

        /* renamed from: a */
        public ListUserFollowingsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListUserFollowingsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$getUserPosts$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/moments/v1/ListUserPostsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$z */
    public static final class C47661z implements SdkSender.IParser<ListUserPostsResponse> {
        C47661z() {
        }

        /* renamed from: a */
        public ListUserPostsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListUserPostsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    private MomentsSDKService() {
    }

    /* renamed from: a */
    public final Object mo167231a(String str, String str2, boolean z, FeedOrder feedOrder, int i, Continuation<? super SdkResponse<GetTabFeedResponse>> cVar) {
        GetTabFeedRequest.C18392a a = new GetTabFeedRequest.C18392a().mo63602a(C69089a.m265839a(i)).mo63603a(str2).mo63601a(C69089a.m265837a(z)).mo63605b(str).mo63600a(feedOrder);
        Command command = Command.MOMENTS_GET_TAB_FEED;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47656u(), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167232a(java.lang.String r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167232a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo167228a(String str, String str2, int i, Continuation<? super SdkResponse<ListCommentsResponse>> cVar) {
        ListCommentsRequest.C18422a a = new ListCommentsRequest.C18422a().mo63675b(str).mo63673a(str2).mo63672a(C69089a.m265839a(i));
        Command command = Command.MOMENTS_LIST_COMMENTS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47651p(), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167226a(java.lang.String r7, com.bytedance.lark.pb.moments.v1.Post.PostDistributionType r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167226a(java.lang.String, com.bytedance.lark.pb.moments.v1.Post$PostDistributionType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167229a(java.lang.String r7, java.lang.String r8, com.bytedance.lark.pb.moments.v1.CommentSet r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167229a(java.lang.String, java.lang.String, com.bytedance.lark.pb.moments.v1.CommentSet, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo167227a(String str, RichText richText, ImageInfo imageInfo, Comment comment, CommentSet commentSet, boolean z, Continuation<? super SdkResponse<CreateCommentResponse>> cVar) {
        CreateCommentRequest.C18346a a = new CreateCommentRequest.C18346a().mo63483a(str).mo63478a(MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144694a(richText)).mo63481a(imageInfo).mo63479a(comment).mo63482a(C69089a.m265837a(z)).mo63480a(commentSet);
        Command command = Command.MOMENTS_CREATE_COMMENT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47637b(), cVar);
    }

    /* renamed from: a */
    public final Object mo167233a(String str, boolean z, Continuation<? super SdkResponse<GetUserProfileResponse>> cVar) {
        GetUserProfileRequest.C18400a a = new GetUserProfileRequest.C18400a().mo63622a(str).mo63621a(C69089a.m265837a(z));
        Command command = Command.MOMENTS_GET_USER_PROFILE;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47628aa(), cVar);
    }

    /* renamed from: a */
    public final Object mo167236a(Continuation<? super List<MomentUser>> cVar) {
        return mo167220a(Command.MOMENTS_GET_RECOMMEND_AT_LIST, new GetRecommendAtListRequest.C18388a(), C47655t.f120175a, cVar);
    }

    /* renamed from: a */
    public final Object mo167225a(String str, EntityType entityType, String str2, ReactionSet reactionSet, boolean z, Continuation<? super SdkResponse<CreateReactionResponse>> cVar) {
        CreateReactionRequest.C18354a a = new CreateReactionRequest.C18354a().mo63509a(str).mo63506a(entityType).mo63511b(str2).mo63507a(reactionSet).mo63508a(C69089a.m265837a(z));
        Command command = Command.MOMENTS_CREATE_REACTION;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47639d(), cVar);
    }

    /* renamed from: a */
    public final void mo167238a(String str, int i, List<String> list, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(list, "chatIds");
        Intrinsics.checkParameterIsNotNull(str2, "additionNote");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.MOMENTS_SHARE_POST, new SharePostRequest.C18548a().mo63979a(str).mo63980a(list).mo63978a(Integer.valueOf(i)).mo63982b(str2), new am(iGetDataCallback), an.f120163a);
    }

    /* renamed from: a */
    public final void mo167239a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "backgroundToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.MOMENTS_UPDATE_PROFILE_BACKGROUND_IMAGE, new UpdateProfileBackgroundImageRequest.C18556a().mo63999a(str), new aq(iGetDataCallback, str), ar.f120167a);
    }

    /* renamed from: a */
    public final Object mo167235a(ArrayList<String> arrayList, Continuation<? super ConfigTabsResponse> cVar) {
        Command command = Command.MOMENTS_CONFIG_TABS;
        ConfigTabsRequest.C18342a a = new ConfigTabsRequest.C18342a().mo63469a(arrayList);
        Intrinsics.checkExpressionValueIsNotNull(a, "ConfigTabsRequest.Builder().tab_ids(ids)");
        return mo167220a(command, a, C47627a.f120148a, cVar);
    }

    /* renamed from: a */
    public final Object mo167237a(boolean z, Continuation<? super ListCategoriesResponse> cVar) {
        Command command = Command.MOMENTS_LIST_CATEGORIES;
        ListCategoriesRequest.C18418a a = new ListCategoriesRequest.C18418a().mo63663a(C69089a.m265837a(z));
        Intrinsics.checkExpressionValueIsNotNull(a, "ListCategoriesRequest.Bu…force_remote(forceRemote)");
        return mo167220a(command, a, C47649n.f120171a, cVar);
    }

    /* renamed from: a */
    public final Object mo167234a(ArrayList<PatchUserSettingRequest.UpdateField> arrayList, UserSetting userSetting, Continuation<? super PatchUserSettingResponse> cVar) {
        Command command = Command.MOMENTS_PATCH_USER_SETTING;
        PatchUserSettingRequest.C18486a a = new PatchUserSettingRequest.C18486a().mo63836a(arrayList).mo63835a(userSetting);
        Intrinsics.checkExpressionValueIsNotNull(a, "PatchUserSettingRequest.…user_setting(userSetting)");
        return mo167220a(command, a, C47630ac.f120150a, cVar);
    }

    /* renamed from: a */
    public final Object mo167230a(String str, String str2, ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder, Continuation<? super SdkResponse<ListHashtagPostsResponse>> cVar) {
        ListHashtagPostsRequest.C18426a a = new ListHashtagPostsRequest.C18426a().mo63684a(C69089a.m265839a(40)).mo63687b(str).mo63683a(hashtagPostOrder).mo63685a(str2);
        Command command = Command.MOMENTS_LIST_HASHTAG_POSTS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, C47629ab.f120149a, cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$sharePost$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/moments/v1/SharePostResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$am */
    public static final class am implements IGetDataCallback<SharePostResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f120162a;

        am(IGetDataCallback iGetDataCallback) {
            this.f120162a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(SharePostResponse sharePostResponse) {
            Intrinsics.checkParameterIsNotNull(sharePostResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f120162a.onSuccess(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f120162a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/ConfigTabsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$a */
    static final class C47627a<T> implements SdkSender.IParser<ConfigTabsResponse> {

        /* renamed from: a */
        public static final C47627a f120148a = new C47627a();

        C47627a() {
        }

        /* renamed from: a */
        public final ConfigTabsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ConfigTabsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ab */
    public static final class C47629ab<T> implements SdkSender.IParser<ListHashtagPostsResponse> {

        /* renamed from: a */
        public static final C47629ab f120149a = new C47629ab();

        C47629ab() {
        }

        /* renamed from: a */
        public final ListHashtagPostsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListHashtagPostsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/PatchUserSettingResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ac */
    static final class C47630ac<T> implements SdkSender.IParser<PatchUserSettingResponse> {

        /* renamed from: a */
        public static final C47630ac f120150a = new C47630ac();

        C47630ac() {
        }

        /* renamed from: a */
        public final PatchUserSettingResponse parse(byte[] bArr) {
            if (bArr != null) {
                return PatchUserSettingResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ae */
    public static final class C47632ae<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47632ae f120151a = new C47632ae();

        C47632ae() {
        }

        /* renamed from: a */
        public final boolean mo167259a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167259a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$sdkRequest$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ah */
    public static final class C47635ah implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ Continuation f120152a;

        /* renamed from: b */
        final /* synthetic */ Command f120153b;

        /* renamed from: c */
        final /* synthetic */ Message.Builder f120154c;

        /* renamed from: d */
        final /* synthetic */ SdkSender.IParser f120155d;

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            Continuation cVar = this.f120152a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(t));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("MomentsSDKService", this.f120153b + ' ' + errorResult.getDebugMsg());
            Continuation cVar = this.f120152a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(null));
        }

        C47635ah(Continuation cVar, Command command, Message.Builder builder, SdkSender.IParser iParser) {
            this.f120152a = cVar;
            this.f120153b = command;
            this.f120154c = builder;
            this.f120155d = iParser;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ak */
    public static final class ak<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final ak f120160a = new ak();

        ak() {
        }

        /* renamed from: a */
        public final boolean mo167262a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167262a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/SetKeyValueResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$al */
    static final class al<T> implements SdkSender.IParser<SetKeyValueResponse> {

        /* renamed from: a */
        public static final al f120161a = new al();

        al() {
        }

        /* renamed from: a */
        public final SetKeyValueResponse parse(byte[] bArr) {
            if (bArr != null) {
                return SetKeyValueResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/SharePostResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$an */
    public static final class an<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final an f120163a = new an();

        an() {
        }

        /* renamed from: a */
        public final SharePostResponse parse(byte[] bArr) {
            return SharePostResponse.ADAPTER.decode(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ap */
    public static final class ap<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final ap f120164a = new ap();

        ap() {
        }

        /* renamed from: a */
        public final boolean mo167266a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167266a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$updateProfileBackground$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/moments/v1/UpdateProfileBackgroundImageResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$aq */
    public static final class aq implements IGetDataCallback<UpdateProfileBackgroundImageResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f120165a;

        /* renamed from: b */
        final /* synthetic */ String f120166b;

        /* renamed from: a */
        public void onSuccess(UpdateProfileBackgroundImageResponse updateProfileBackgroundImageResponse) {
            Intrinsics.checkParameterIsNotNull(updateProfileBackgroundImageResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f120165a.onSuccess(this.f120166b);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f120165a.onError(errorResult);
        }

        aq(IGetDataCallback iGetDataCallback, String str) {
            this.f120165a = iGetDataCallback;
            this.f120166b = str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/UpdateProfileBackgroundImageResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ar */
    public static final class ar<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final ar f120167a = new ar();

        ar() {
        }

        /* renamed from: a */
        public final UpdateProfileBackgroundImageResponse parse(byte[] bArr) {
            return UpdateProfileBackgroundImageResponse.ADAPTER.decode(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$f */
    public static final class C47641f<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47641f f120168a = new C47641f();

        C47641f() {
        }

        /* renamed from: a */
        public final boolean mo167272a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167272a(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$h */
    public static final class C47643h<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47643h f120169a = new C47643h();

        C47643h() {
        }

        /* renamed from: a */
        public final boolean mo167273a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167273a(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$l */
    public static final class C47647l<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47647l f120170a = new C47647l();

        C47647l() {
        }

        /* renamed from: a */
        public final boolean mo167276a(byte[] bArr) {
            return true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167276a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/ListCategoriesResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$n */
    static final class C47649n<T> implements SdkSender.IParser<ListCategoriesResponse> {

        /* renamed from: a */
        public static final C47649n f120171a = new C47649n();

        C47649n() {
        }

        /* renamed from: a */
        public final ListCategoriesResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListCategoriesResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/GetCategoryDetailResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$o */
    static final class C47650o<T> implements SdkSender.IParser<GetCategoryDetailResponse> {

        /* renamed from: a */
        public static final C47650o f120172a = new C47650o();

        C47650o() {
        }

        /* renamed from: a */
        public final GetCategoryDetailResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetCategoryDetailResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/GetHashtagDetailResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$q */
    static final class C47652q<T> implements SdkSender.IParser<GetHashtagDetailResponse> {

        /* renamed from: a */
        public static final C47652q f120173a = new C47652q();

        C47652q() {
        }

        /* renamed from: a */
        public final GetHashtagDetailResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetHashtagDetailResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$r */
    static final class C47653r<T> implements SdkSender.IParser<String> {

        /* renamed from: a */
        public static final C47653r f120174a = new C47653r();

        C47653r() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            if (bArr != null) {
                return GetKeyValueResponse.ADAPTER.decode(bArr).value;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/ListTabsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$v */
    static final class C47657v<T> implements SdkSender.IParser<ListTabsResponse> {

        /* renamed from: a */
        public static final C47657v f120176a = new C47657v();

        C47657v() {
        }

        /* renamed from: a */
        public final ListTabsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListTabsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/GetUserGlobalConfigAndSettingsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$y */
    static final class C47660y<T> implements SdkSender.IParser<GetUserGlobalConfigAndSettingsResponse> {

        /* renamed from: a */
        public static final C47660y f120177a = new C47660y();

        C47660y() {
        }

        /* renamed from: a */
        public final GetUserGlobalConfigAndSettingsResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetUserGlobalConfigAndSettingsResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/service/MomentsSDKService$sdkRequestWithErr$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$ai */
    public static final class C47636ai implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ Continuation f120156a;

        /* renamed from: b */
        final /* synthetic */ Command f120157b;

        /* renamed from: c */
        final /* synthetic */ Message.Builder f120158c;

        /* renamed from: d */
        final /* synthetic */ SdkSender.IParser f120159d;

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            Continuation cVar = this.f120156a;
            SdkResponse cVar2 = new SdkResponse(t, null);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(cVar2));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("MomentsSDKService", this.f120157b + ' ' + errorResult.getDebugMsg());
            Continuation cVar = this.f120156a;
            SdkResponse cVar2 = new SdkResponse(null, errorResult);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(cVar2));
        }

        C47636ai(Continuation cVar, Command command, Message.Builder builder, SdkSender.IParser iParser) {
            this.f120156a = cVar;
            this.f120157b = command;
            this.f120158c = builder;
            this.f120159d = iParser;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.b.b$t */
    static final class C47655t<T> implements SdkSender.IParser<List<? extends MomentUser>> {

        /* renamed from: a */
        public static final C47655t f120175a = new C47655t();

        C47655t() {
        }

        /* renamed from: a */
        public final ArrayList<MomentUser> parse(byte[] bArr) {
            ArrayList<MomentUser> arrayList = new ArrayList<>();
            if (bArr != null) {
                arrayList.addAll(GetRecommendAtListResponse.ADAPTER.decode(bArr).moment_users);
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public final Object mo167244b(Continuation<? super List<Broadcast>> cVar) {
        return mo167220a(Command.MOMENTS_LIST_BROADCASTS, new ListBroadcastsRequest.C18414a(), new C47648m(), cVar);
    }

    /* renamed from: c */
    public final Object mo167247c(Continuation<? super GetUserGlobalConfigAndSettingsResponse> cVar) {
        return mo167220a(Command.MOMENTS_GET_USER_GLOBAL_CONFIG_AND_SETTINGS, new GetUserGlobalConfigAndSettingsRequest.C18396a(), C47660y.f120177a, cVar);
    }

    /* renamed from: d */
    public final Object mo167250d(Continuation<? super ListTabsResponse> cVar) {
        return mo167220a(Command.MOMENTS_LIST_TABS, new ListTabsRequest.C18438a(), C47657v.f120176a, cVar);
    }

    /* renamed from: d */
    public final Object mo167249d(String str, Continuation<? super SdkResponse<RetryCreatePostResponse>> cVar) {
        RetryCreatePostRequest.C18538a a = new RetryCreatePostRequest.C18538a().mo63952a(str);
        Command command = Command.MOMENTS_RETRY_CREATE_POST;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47634ag(), cVar);
    }

    /* renamed from: e */
    public final Object mo167251e(String str, Continuation<? super SdkResponse<RetryCreateCommentResponse>> cVar) {
        RetryCreateCommentRequest.C18534a a = new RetryCreateCommentRequest.C18534a().mo63943a(str);
        Command command = Command.MOMENTS_RETRY_CREATE_COMMENT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47633af(), cVar);
    }

    /* renamed from: f */
    public final Object mo167252f(String str, Continuation<? super String> cVar) {
        GetKeyValueRequest.C18384a a = new GetKeyValueRequest.C18384a().mo63583a(str);
        Command command = Command.MOMENTS_GET_KEY_VALUE;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167220a(command, a, C47653r.f120174a, cVar);
    }

    /* renamed from: g */
    public final Object mo167253g(String str, Continuation<? super SdkResponse<GetHashtagDetailResponse>> cVar) {
        GetHashtagDetailRequest.C18380a a = new GetHashtagDetailRequest.C18380a().mo63574a(str);
        Command command = Command.MOMENTS_GET_HASHTAG_DETAIL;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, C47652q.f120173a, cVar);
    }

    /* renamed from: h */
    public final Object mo167254h(String str, Continuation<? super SdkResponse<GetCategoryDetailResponse>> cVar) {
        GetCategoryDetailRequest.C18376a a = new GetCategoryDetailRequest.C18376a().mo63565a(str);
        Command command = Command.MOMENTS_GET_CATEGORY_DETAIL;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, C47650o.f120172a, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167246c(java.lang.String r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167246c(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167243b(java.lang.String r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167243b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167222a(com.bytedance.lark.pb.moments.v1.Broadcast r7, java.lang.String r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService.mo167222a(com.bytedance.lark.pb.moments.v1.Broadcast, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final ListReactionsResponse mo167219a(String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        return (ListReactionsResponse) SdkSender.sendRequest(Command.MOMENTS_LIST_REACTIONS, new ListReactionsRequest.C18434a().mo63709b(str).mo63710c(str2).mo63707a(str3).mo63706a(Integer.valueOf(i)), new C47645j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ <T> Object mo167240b(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super SdkResponse<T>> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        C53241h.m205898b("MomentsSDKService", "sdkRequestWithErr " + command);
        SdkSender.asynSendRequestNonWrap(command, builder, new C47636ai(gVar, command, builder, iParser), iParser);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: c */
    public final Object mo167245c(String str, String str2, int i, Continuation<? super ListUserFollowersResponse> cVar) {
        ListUserFollowersRequest.C18442a a = new ListUserFollowersRequest.C18442a().mo63727a(str).mo63729b(str2).mo63726a(C69089a.m265839a(i));
        Command command = Command.MOMENTS_LIST_USER_FOLLOWERS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167220a(command, a, new C47658w(), cVar);
    }

    /* renamed from: d */
    public final Object mo167248d(String str, String str2, int i, Continuation<? super ListUserFollowingsResponse> cVar) {
        ListUserFollowingsRequest.C18446a a = new ListUserFollowingsRequest.C18446a().mo63738a(str).mo63740b(str2).mo63737a(C69089a.m265839a(i));
        Command command = Command.MOMENTS_LIST_USER_FOLLOWINGS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167220a(command, a, new C47659x(), cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ <T> Object mo167220a(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super T> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        C53241h.m205898b("MomentsSDKService", "sdkRequest " + command);
        SdkSender.asynSendRequestNonWrap(command, builder, new C47635ah(gVar, command, builder, iParser), iParser);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: b */
    public final Object mo167242b(String str, String str2, int i, Continuation<? super ListUserPostsResponse> cVar) {
        ListUserPostsRequest.C18450a a = new ListUserPostsRequest.C18450a().mo63749a(str).mo63751b(str2).mo63748a(C69089a.m265839a(i));
        Command command = Command.MOMENTS_LIST_USER_POSTS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167220a(command, a, new C47661z(), cVar);
    }

    /* renamed from: a */
    public final Object mo167223a(SetKeyValueRequest.KeyType keyType, String str, String str2, Continuation<? super Unit> cVar) {
        SetKeyValueRequest.C18544a b = new SetKeyValueRequest.C18544a().mo63967a(keyType).mo63968a(str).mo63970b(str2);
        Command command = Command.MOMENTS_SET_KEY_VALUE;
        Intrinsics.checkExpressionValueIsNotNull(b, "builder");
        Object a = mo167220a(command, b, al.f120161a, cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object mo167224a(String str, int i, int i2, Continuation<? super SdkResponse<ListNotificationsResponse>> cVar) {
        ListNotificationsRequest.C18430a a = new ListNotificationsRequest.C18430a().mo63697a(str).mo63695a(Notification.Category.fromValue(i2)).mo63696a(C69089a.m265839a(i));
        Command command = Command.MOMENTS_LIST_NOTIFICATIONS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47654s(), cVar);
    }

    /* renamed from: b */
    public final Object mo167241b(String str, EntityType entityType, String str2, ReactionSet reactionSet, boolean z, Continuation<? super SdkResponse<DeleteReactionResponse>> cVar) {
        DeleteReactionRequest.C18362a a = new DeleteReactionRequest.C18362a().mo63534a(str).mo63536b(str2).mo63531a(entityType).mo63532a(reactionSet).mo63533a(C69089a.m265837a(z));
        Command command = Command.MOMENTS_DELETE_REACTION;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167240b(command, a, new C47644i(), cVar);
    }

    /* renamed from: a */
    public final Object mo167221a(com.bytedance.lark.pb.basic.v1.RichText richText, List<ImageInfo> list, MediaInfo mediaInfo, List<String> list2, boolean z, Continuation<? super SdkResponse<CreatePostResponse>> cVar) {
        CreatePostRequest.C18350a a = new CreatePostRequest.C18350a().mo63495a("").mo63492a(richText).mo63494a(C69089a.m265837a(z));
        if (list2 == null) {
            list2 = new ArrayList();
        }
        CreatePostRequest.C18350a b = a.mo63498b(list2);
        if (list != null) {
            b.mo63496a(list);
        }
        if (mediaInfo != null) {
            b.mo63493a(mediaInfo);
        }
        Command command = Command.MOMENTS_CREATE_POST;
        Intrinsics.checkExpressionValueIsNotNull(b, "builder");
        return mo167240b(command, b, new C47638c(), cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m188518a(MomentsSDKService bVar, String str, String str2, ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder, Continuation cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return bVar.mo167230a(str, str2, hashtagPostOrder, cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m188519a(MomentsSDKService bVar, String str, String str2, boolean z, FeedOrder feedOrder, int i, Continuation cVar, int i2, Object obj) {
        boolean z2;
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return bVar.mo167231a(str, str2, z2, feedOrder, i, cVar);
    }
}
