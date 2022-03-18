package com.ss.android.lark.moments.impl.detail;

import android.content.Context;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.CreateCommentResponse;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.ImageInfo;
import com.bytedance.lark.pb.moments.v1.ListCommentsResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.bytedance.lark.pb.moments.v1.RetryCreateCommentResponse;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.EncryptImageData;
import com.ss.android.lark.moments.dependency.idependency.IImageDependency;
import com.ss.android.lark.moments.impl.common.MomentsDispatcher;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailCommentLoadingItem;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailHeaderLoadingItem;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailNoCommentItem;
import com.ss.android.lark.moments.impl.draft.MomentsDraft;
import com.ss.android.lark.moments.impl.feed.model.DataCacheLiveData;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import com.ss.android.lark.moments.impl.feed.model.MomentsFeedDataProvider;
import com.ss.android.lark.moments.impl.feed.model.matcher.HotCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.KeyMatcher;
import com.ss.android.lark.moments.impl.feed.model.matcher.ReplyCommentMatcher;
import com.ss.android.lark.moments.impl.feed.model.updater.BroadcastUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.CommentSetUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.CommentStatusUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.CommentUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentDeleteUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.HotCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ItemRemoveUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PostDistributionTypeUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.PreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplyCommentDeleteUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ReplyCommentPreviewUpdater;
import com.ss.android.lark.moments.impl.feed.model.updater.ShareCountUpdater;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ­\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004­\u0001®\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010J\u001a\u00020\u0006H\u0001J*\u0010R\u001a\u00020O2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020U0Tj\b\u0012\u0004\u0012\u00020U`V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0002J \u0010Y\u001a\u00020O2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020U0Tj\b\u0012\u0004\u0012\u00020U`VH\u0002J*\u0010Z\u001a\u00020O2\b\u0010W\u001a\u0004\u0018\u00010X2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020U0Tj\b\u0012\u0004\u0012\u00020U`VH\u0002J\b\u0010[\u001a\u00020\nH\u0016J\u0010\u0010\\\u001a\u00020O2\u0006\u0010]\u001a\u00020\u0006H\u0016J\u0010\u0010^\u001a\u00020O2\u0006\u0010_\u001a\u00020\u0006H\u0016J\u0010\u0010`\u001a\u00020O2\u0006\u0010a\u001a\u00020\nH\u0016J\u0018\u0010b\u001a\u00020O2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u000209H\u0016J\b\u0010e\u001a\u0004\u0018\u00010UJ\n\u0010f\u001a\u0004\u0018\u00010XH\u0002J\u0010\u0010g\u001a\u00020O2\u0006\u0010h\u001a\u00020iH\u0002J\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020U0k2\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010l\u001a\u00020OH\u0002J\b\u0010m\u001a\u00020OH\u0016J&\u0010n\u001a\b\u0012\u0004\u0012\u00020U0k2\b\u0010W\u001a\u0004\u0018\u00010X2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0002J\b\u0010r\u001a\u00020\nH\u0016J=\u0010s\u001a\u00020O2\u0006\u0010t\u001a\u00020u2\u0006\u0010P\u001a\u00020Q2\u0010\b\u0002\u0010v\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010w2\u0010\b\u0002\u0010x\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010wH\u0001J\b\u0010y\u001a\u00020OH\u0014J\u0018\u0010z\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\nH\u0016J\u001a\u0010|\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J>\u0010\u001a\u00020O2\u0007\u0010\u0001\u001a\u00020\u00062\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J\u001b\u0010\u0001\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00020O2\u0007\u0010\u0001\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u0001H\u0016J \u0010\u0001\u001a\u00020O2\u0015\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u001d\u0010\u0001\u001a\u00020O2\u0006\u0010]\u001a\u00020\u00062\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J/\u0010\u0001\u001a\u00020O2$\u0010\u0001\u001a\u001f\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00010\u0001\u0018\u00010\u0001H\u0016J\u001a\u0010\u0001\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u000fH\u0016J\u0019\u0010\u0001\u001a\u0004\u0018\u00010X2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0002J\t\u0010\u0001\u001a\u00020OH\u0002J+\u0010\u0001\u001a\u00020O2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u0001\u001a\u00020\u0006H\u0001J\u0011\u0010\u0001\u001a\u00020O2\u0006\u0010]\u001a\u00020\u0006H\u0016J\u001c\u0010\u0001\u001a\u00020O2\u0006\u0010_\u001a\u00020\u00062\t\u0010\u0001\u001a\u0004\u0018\u00010:H\u0016J\u001f\u0010 \u0001\u001a\u00020O2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J/\u0010¡\u0001\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u00062\u0007\u0010¢\u0001\u001a\u00020:2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u00012\u0007\u0010¥\u0001\u001a\u00020\u0006H\u0016J\u0011\u0010D\u001a\u00020O2\u0007\u0010¦\u0001\u001a\u00020\nH\u0016J\u0012\u0010§\u0001\u001a\u00020O2\u0007\u0010¨\u0001\u001a\u00020\u000fH\u0016J0\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020L0ª\u00012\u0006\u0010P\u001a\u00020Q2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060k2\u0007\u0010¬\u0001\u001a\u00020\nH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\fR(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000604j\b\u0012\u0004\u0012\u00020\u0006`5X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R&\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0\u000e0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\fR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\fR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\fR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\fR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\fR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\fR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\fR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\fR\u000e\u0010J\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R#\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\n0\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\f¨\u0006¯\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "Lcom/ss/android/lark/moments/impl/detail/IMomentsDetailViewModel;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "Lcom/ss/android/lark/moments/impl/privatechat/IMomentsSecretChatHandler;", "postId", "", "(Ljava/lang/String;)V", "anonymousAtError", "Landroidx/lifecycle/MutableLiveData;", "", "getAnonymousAtError", "()Landroidx/lifecycle/MutableLiveData;", "anonymousPostLoading", "Lkotlin/Pair;", "", "getAnonymousPostLoading", "categoryEnableAnonymous", "getCategoryEnableAnonymous", "closePage", "getClosePage", "commentResponse", "Lcom/bytedance/lark/pb/moments/v1/CreateCommentResponse;", "getCommentResponse", "completeRefresh", "getCompleteRefresh", "disableComment", "getDisableComment", "draftIdentity", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getDraftIdentity", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "setDraftIdentity", "(Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;)V", "enableClick", "getEnableClick", "forceDisableAnonymous", "getForceDisableAnonymous", "hasQuota", "getHasQuota", "hitpointIdPair", "getHitpointIdPair", "()Lkotlin/Pair;", "setHitpointIdPair", "(Lkotlin/Pair;)V", "identityType", "getIdentityType", "setIdentityType", "(Landroidx/lifecycle/MutableLiveData;)V", "mPushHandler", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "mSendCommentIdSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPostId", "()Ljava/lang/String;", "resetCallback", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$DraftAction;", "Lcom/ss/android/lark/widget/richtext/RichText;", "getResetCallback", "resetDraftFail", "getResetDraftFail", "scrollInfo", "getScrollInfo", "scrollToComment", "getScrollToComment", "sendHitPointPageView", "getSendHitPointPageView", "showCircleLoading", "getShowCircleLoading", "showUnSupportDialog", "getShowUnSupportDialog", "toastResId", "getToastResId", "token", "uploadImageSuccess", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "getUploadImageSuccess", "acceptSecretChat", "", "context", "Landroid/content/Context;", "appendAllCommentLabelItem", "list", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "Lkotlin/collections/ArrayList;", "postVM", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM;", "appendCommentLoadingItem", "appendPostHeaderItem", "canLoadMore", "deleteComment", "commentId", "deleteDraft", "key", "getAnonymousInfo", "noQuotaLimitation", "getDraft", "id", "action", "getPost", "handleLocalPost", "handlePageError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "handlePostItem", "", "loadFirstPage", "loadMore", "mergeFirstPageData", "commentListRes", "Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/moments/v1/ListCommentsResponse;", "needShowFrom", "observeRequestResult", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onInputDialogShowListener", "Lkotlin/Function0;", "onInputDialogDismissListener", "onCleared", "onPushBroadcastChanged", "isBroadcast", "onPushCommentSetChanged", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "onPushCommentStatusChanged", "localCommentId", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "onPushDistributionChanged", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushMomentUser", "newUserMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onPushNewCommentUpdate", "onPushPreviewChanged", "updateMaps", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushShareCountChanged", "shareCount", "parsePostFromCommentList", "reportPostPageViewHitPoint", "requestSecretChat", "anonymousName", "resendComment", "saveDraft", "value", "saveSendCommentIdIfNeed", "sendComment", "richText", "imageInfo", "Lcom/bytedance/lark/pb/moments/v1/ImageInfo;", "replyCommentId", "isLoading", "toastString", "resId", "uploadImage", "Lio/reactivex/Observable;", "photos", "keepOrigin", "Companion", "DraftAction", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.f */
public final class MomentsDetailViewModel extends MomentsBaseViewModel implements IMomentsSecretChatHandler, MomentsPushHandler.IMomentsPushListener {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ MomentsSecretChatHandler $$delegate_0 = new MomentsSecretChatHandler();
    private final C1177w<Boolean> anonymousAtError;
    private final C1177w<Pair<Integer, String>> anonymousPostLoading;
    private final C1177w<Boolean> categoryEnableAnonymous;
    private final C1177w<Boolean> closePage;
    private final C1177w<CreateCommentResponse> commentResponse;
    private final C1177w<Boolean> completeRefresh;
    private final C1177w<Boolean> disableComment;
    private MomentsPublishViewModel.IdentityType draftIdentity;
    private final C1177w<Boolean> enableClick;
    private final C1177w<Boolean> forceDisableAnonymous;
    private final C1177w<Boolean> hasQuota;
    private Pair<String, String> hitpointIdPair;
    private C1177w<MomentsPublishViewModel.IdentityType> identityType;
    private final MomentsPushHandler mPushHandler;
    public final HashSet<String> mSendCommentIdSet;
    private final String postId;
    private final C1177w<Pair<DraftAction, RichText>> resetCallback;
    private final C1177w<Boolean> resetDraftFail;
    private final C1177w<String> scrollInfo;
    private final C1177w<Boolean> scrollToComment;
    private final C1177w<Boolean> sendHitPointPageView;
    private final C1177w<Boolean> showCircleLoading;
    private final C1177w<Integer> showUnSupportDialog;
    private final C1177w<Integer> toastResId;
    public String token;
    private final C1177w<Pair<IPhotoDependency.Image, Boolean>> uploadImageSuccess;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$DraftAction;", "", "onGetDraft", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$b */
    public interface DraftAction {
        /* renamed from: a */
        void mo166588a(RichText richText);
    }

    public void acceptSecretChat(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.$$delegate_0.mo166878a(context, str);
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public boolean needShowFrom() {
        return true;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$Companion;", "", "()V", "LOG_TAG", "", "PAGE_SIZE", "", "POST_DRAFT_LIST_FILE", "POST_DRAFT_MAX_COUNT", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getAnonymousAtError() {
        return this.anonymousAtError;
    }

    public C1177w<Pair<Integer, String>> getAnonymousPostLoading() {
        return this.anonymousPostLoading;
    }

    public C1177w<Boolean> getCategoryEnableAnonymous() {
        return this.categoryEnableAnonymous;
    }

    public C1177w<Boolean> getClosePage() {
        return this.closePage;
    }

    public C1177w<CreateCommentResponse> getCommentResponse() {
        return this.commentResponse;
    }

    public C1177w<Boolean> getCompleteRefresh() {
        return this.completeRefresh;
    }

    public C1177w<Boolean> getDisableComment() {
        return this.disableComment;
    }

    public final MomentsPublishViewModel.IdentityType getDraftIdentity() {
        return this.draftIdentity;
    }

    public C1177w<Boolean> getEnableClick() {
        return this.enableClick;
    }

    public C1177w<Boolean> getForceDisableAnonymous() {
        return this.forceDisableAnonymous;
    }

    public C1177w<Boolean> getHasQuota() {
        return this.hasQuota;
    }

    public final Pair<String, String> getHitpointIdPair() {
        return this.hitpointIdPair;
    }

    public final C1177w<MomentsPublishViewModel.IdentityType> getIdentityType() {
        return this.identityType;
    }

    public final String getPostId() {
        return this.postId;
    }

    public C1177w<Pair<DraftAction, RichText>> getResetCallback() {
        return this.resetCallback;
    }

    public final C1177w<Boolean> getResetDraftFail() {
        return this.resetDraftFail;
    }

    public C1177w<String> getScrollInfo() {
        return this.scrollInfo;
    }

    public C1177w<Boolean> getScrollToComment() {
        return this.scrollToComment;
    }

    public final C1177w<Boolean> getSendHitPointPageView() {
        return this.sendHitPointPageView;
    }

    public C1177w<Boolean> getShowCircleLoading() {
        return this.showCircleLoading;
    }

    public C1177w<Integer> getShowUnSupportDialog() {
        return this.showUnSupportDialog;
    }

    public C1177w<Integer> getToastResId() {
        return this.toastResId;
    }

    public final C1177w<Pair<IPhotoDependency.Image, Boolean>> getUploadImageSuccess() {
        return this.uploadImageSuccess;
    }

    public boolean canLoadMore() {
        if (this.token.length() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        super.onCleared();
        this.mPushHandler.mo167188b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$appendAllCommentLabelItem$1", "Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;", "providerCurrentCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$c */
    public static final class C47425c implements MomentsDetailLabelItem.ICountProvider {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailViewModel f119661a;

        @Override // com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem.ICountProvider
        /* renamed from: a */
        public int mo166484a() {
            MomentsDetailViewModel fVar = this.f119661a;
            IMomentsItemBase itemById = fVar.getItemById(fVar.getPostId());
            if (itemById instanceof MomentsPostVM) {
                return ((MomentsPostVM) itemById).mo166454m();
            }
            return -1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47425c(MomentsDetailViewModel fVar) {
            this.f119661a = fVar;
        }
    }

    private final void loadFirstPage() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47431i(this, null), 2, null);
    }

    private final void reportPostPageViewHitPoint() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47433k(this, null), 2, null);
    }

    public void loadMore() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47432j(this, null), 2, null);
    }

    public final IMomentsItemBase getPost() {
        List<IMomentsItemBase> list = (List) getDataList().mo5927b();
        if (list != null) {
            for (IMomentsItemBase iMomentsItemBase : list) {
                if (Intrinsics.areEqual(iMomentsItemBase.mo166379a(), this.postId)) {
                    return iMomentsItemBase;
                }
            }
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$handlePostItem$1", "Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;", "providerCurrentCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$h */
    public static final class C47430h implements MomentsDetailLabelItem.ICountProvider {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailViewModel f119662a;

        @Override // com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem.ICountProvider
        /* renamed from: a */
        public int mo166484a() {
            MomentsDetailViewModel fVar = this.f119662a;
            IMomentsItemBase itemById = fVar.getItemById(fVar.getPostId());
            if (itemById instanceof MomentsPostVM) {
                MomentsPostVM fVar2 = (MomentsPostVM) itemById;
                if (fVar2.mo166424I() != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : fVar2.mo166424I()) {
                        if (t.mo166397i()) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList.size();
                }
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47430h(MomentsDetailViewModel fVar) {
            this.f119662a = fVar;
        }
    }

    public final MomentsPostVM handleLocalPost() {
        MomentsFeedDataProvider.MomentDetailInitData a = MomentsFeedDataProvider.f119940a.mo167033a().mo167029a(this.postId);
        Map<String, PreviewHangPoint> map = null;
        if (a == null) {
            return null;
        }
        getUserMap().putAll(a.mo167038b());
        Post a2 = a.mo167037a();
        Map<String, MomentsCommentVM> parseComment = parseComment(a.mo167039c(), null);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, MomentsCommentVM> entry : parseComment.entrySet()) {
            Map<String, Map<String, PreviewHangPoint>> e = a.mo167041e();
            Map<String, PreviewHangPoint> map2 = e != null ? e.get(entry.getKey()) : null;
            if (map2 != null) {
                hashMap.put(entry.getKey(), MomentsCommentVM.m187494a(entry.getValue(), null, null, null, map2, this, false, null, null, null, null, 999, null));
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap2 = hashMap;
        Category d = a.mo167040d();
        Map<String, Map<String, PreviewHangPoint>> e2 = a.mo167041e();
        if (e2 != null) {
            map = e2.get(a2.id);
        }
        return convertToPostVM(a2, hashMap2, d, map);
    }

    public final void setHitpointIdPair(Pair<String, String> pair) {
        this.hitpointIdPair = pair;
    }

    public final void setDraftIdentity(MomentsPublishViewModel.IdentityType identityType2) {
        Intrinsics.checkParameterIsNotNull(identityType2, "<set-?>");
        this.draftIdentity = identityType2;
    }

    public final void setIdentityType(C1177w<MomentsPublishViewModel.IdentityType> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.identityType = wVar;
    }

    public final void appendCommentLoadingItem(ArrayList<IMomentsItemBase> arrayList) {
        arrayList.add(new MomentsDetailCommentLoadingItem());
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void showCircleLoading(boolean z) {
        getShowCircleLoading().mo5926a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel
    public void toastString(int i) {
        getToastResId().mo5926a(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "photoPath", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$o */
    public static final class C47437o<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Context f119663a;

        /* renamed from: b */
        final /* synthetic */ boolean f119664b;

        C47437o(Context context, boolean z) {
            this.f119663a = context;
            this.f119664b = z;
        }

        /* renamed from: a */
        public final Observable<EncryptImageData> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "photoPath");
            return IImageDependency.C47179a.m186950a(MomentsDependencyHolder.f118998b.mo165899a().imageDependency(), this.f119663a, str, this.f119664b, true, null, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/image/entity/Image;", "kotlin.jvm.PlatformType", "encryptImageData", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$p */
    public static final class C47438p<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailViewModel f119665a;

        /* renamed from: b */
        final /* synthetic */ boolean f119666b;

        C47438p(MomentsDetailViewModel fVar, boolean z) {
            this.f119665a = fVar;
            this.f119666b = z;
        }

        /* renamed from: a */
        public final Observable<Image> apply(final EncryptImageData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "encryptImageData");
            return Observable.create(new ObservableOnSubscribe<T>(this) {
                /* class com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel.C47438p.C474391 */

                /* renamed from: a */
                final /* synthetic */ C47438p f119667a;

                {
                    this.f119667a = r1;
                }

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter<Image> observableEmitter) {
                    int i;
                    Intrinsics.checkParameterIsNotNull(observableEmitter, "e");
                    int[] b = C57820d.m224436b(aVar.mo165892a());
                    Image image = new Image();
                    int i2 = 80;
                    if (b[0] <= 0) {
                        i = 80;
                    } else {
                        i = b[0];
                    }
                    image.setWidth(i);
                    if (b[1] > 0) {
                        i2 = b[1];
                    }
                    image.setHeight(i2);
                    image.setToken(aVar.mo165893b());
                    image.setUrls(CollectionsKt.listOf(aVar.mo165892a()));
                    C1177w<Pair<IPhotoDependency.Image, Boolean>> uploadImageSuccess = this.f119667a.f119665a.getUploadImageSuccess();
                    List<String> urls = image.getUrls();
                    Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                    int width = image.getWidth();
                    int height = image.getHeight();
                    String token = image.getToken();
                    Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                    uploadImageSuccess.mo5926a(TuplesKt.to(new IPhotoDependency.Image(urls, width, height, token), Boolean.valueOf(this.f119667a.f119666b)));
                    observableEmitter.onNext(image);
                    observableEmitter.onComplete();
                }
            });
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel, com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel
    public void deleteComment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47426d(this, str, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel, com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel
    public void resendComment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47434l(this, str, null), 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$reportPostPageViewHitPoint$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0}, mo239175l = {156}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$k */
    public static final class C47433k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47433k(MomentsDetailViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47433k kVar = new C47433k(this.this$0, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47433k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                String postId = this.this$0.getPostId();
                this.L$0 = ahVar;
                this.label = 1;
                if (aVar.mo167194a(postId, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "it", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$q */
    public static final class C47440q<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C47440q f119669a = new C47440q();

        C47440q() {
        }

        /* renamed from: a */
        public final IPhotoDependency.Image apply(Image image) {
            Intrinsics.checkParameterIsNotNull(image, "it");
            List<String> urls = image.getUrls();
            Intrinsics.checkExpressionValueIsNotNull(urls, "it.urls");
            int width = image.getWidth();
            int height = image.getHeight();
            String token = image.getToken();
            Intrinsics.checkExpressionValueIsNotNull(token, "it.token");
            return new IPhotoDependency.Image(urls, width, height, token);
        }
    }

    public void deleteDraft(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Job unused = C69553g.m266944a(C69364ai.m266265a(MomentsDispatcher.f119247a.mo166168a()), null, null, new C47427e(str, null), 3, null);
    }

    public void getAnonymousInfo(boolean z) {
        if (z) {
            getHasQuota().mo5926a((Boolean) true);
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47428f(this, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$deleteComment$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0, 0, 0}, mo239175l = {552}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "postItem", "commentSet"}, mo239178s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$d */
    static final class C47426d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $commentId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47426d(MomentsDetailViewModel fVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$commentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47426d dVar = new C47426d(this.this$0, this.$commentId, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47426d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.prepareLoading();
                MomentsDetailViewModel fVar = this.this$0;
                IMomentsItemBase itemById = fVar.getItemById(fVar.getPostId());
                CommentSet commentSet = null;
                if (itemById instanceof MomentsPostVM) {
                    commentSet = ((MomentsPostVM) itemById).mo166421F().comment_set;
                }
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$commentId;
                String postId = this.this$0.getPostId();
                this.L$0 = ahVar;
                this.L$1 = itemById;
                this.L$2 = commentSet;
                this.label = 1;
                obj = bVar.mo167229a(str, postId, commentSet, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CommentSet commentSet2 = (CommentSet) this.L$2;
                IMomentsItemBase iMomentsItemBase = (IMomentsItemBase) this.L$1;
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$getAnonymousInfo$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0}, mo239175l = {738}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$f */
    public static final class C47428f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47428f(MomentsDetailViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47428f fVar = new C47428f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47428f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                String postId = this.this$0.getPostId();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167198b(postId, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!booleanValue && this.this$0.getDraftIdentity() != MomentsPublishViewModel.IdentityType.NORMAL) {
                this.this$0.getResetDraftFail().mo5926a(C69089a.m265837a(true));
            }
            this.this$0.getHasQuota().mo5926a(C69089a.m265837a(booleanValue));
            return Unit.INSTANCE;
        }
    }

    private final void handlePageError(ErrorResult errorResult) {
        Log.m165383e("moments_detail", "handlePageError, errorCode is:" + errorResult.getErrorCode());
        int errorCode = errorResult.getErrorCode();
        if (errorCode == -20000) {
            C1177w<MomentsBaseViewModel.PageErrorInfo> pageErrorLiveData = getPageErrorLiveData();
            String string = UIHelper.getString(R.string.Lark_Community_ThisActivityHasBeenDeleted);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…isActivityHasBeenDeleted)");
            pageErrorLiveData.mo5926a(new MomentsBaseViewModel.PageErrorInfo(R.drawable.illustration_empty_neutral_no_content, string, MomentsBaseViewModel.PageErrorType.REMOVED));
        } else if (errorCode != 330300) {
            getShowUnSupportDialog().mo5926a(Integer.valueOf((int) R.string.Lark_Community_OopsSmthWrong));
        } else {
            C1177w<MomentsBaseViewModel.PageErrorInfo> pageErrorLiveData2 = getPageErrorLiveData();
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Community_NoCommunityPermissionContactAdministratorCustomized, "ExclusiveCommunityName", MomentsAppNameHolder.m188686a());
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…pNameHolder.getTabName())");
            pageErrorLiveData2.mo5926a(new MomentsBaseViewModel.PageErrorInfo(R.drawable.illustration_empty_neutral_no_access, mustacheFormat, MomentsBaseViewModel.PageErrorType.NO_PERMISSION));
        }
    }

    private final List<IMomentsItemBase> handlePostItem(MomentsPostVM fVar) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(fVar);
        List<IMomentsComment> I = fVar.mo166424I();
        if (I != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : I) {
                if (t.mo166397i()) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList2.add(new MomentsDetailLabelItem(0, new C47430h(this)));
            arrayList2.addAll(arrayList4);
        }
        return arrayList2;
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushMomentUser(Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(map, "newUserMap");
        Log.m165389i("moments_detail", "onPushMomentUser, size is:" + map.size());
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
            Log.m165389i("moments_detail", sb.toString());
            userChanged(t);
        }
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Map<String, ? extends UrlPreviewEntity>> entry : map.entrySet()) {
                MomentsDetailViewModel fVar = this;
                updateDataList(new KeyMatcher(entry.getKey()), new PreviewUpdater((Map) entry.getValue(), fVar));
                updateDataList(new HotCommentMatcher(entry.getKey()), new HotCommentPreviewUpdater(entry.getKey(), (Map) entry.getValue(), fVar));
                updateDataList(new ReplyCommentMatcher(entry.getKey()), new ReplyCommentPreviewUpdater((Map) entry.getValue(), this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$deleteDraft$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0, 0, 1, 1, 2, 2}, mo239175l = {677, 687, 688}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "list", "$this$launch", "list", "$this$launch", "list"}, mo239178s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$e */
    public static final class C47427e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47427e(String str, Continuation cVar) {
            super(2, cVar);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47427e eVar = new C47427e(this.$key, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47427e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel.C47427e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$resendComment$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0}, mo239175l = {634}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$l */
    static final class C47434l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $commentId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47434l(MomentsDetailViewModel fVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$commentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47434l lVar = new C47434l(this.this$0, this.$commentId, cVar);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47434l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Comment comment;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.updateDataList(new KeyMatcher(this.$commentId), new CommentStatusUpdater(null, null, Comment.CreateStatus.SENDING, this.this$0, null, 16, null));
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$commentId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167251e(str, this);
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
            RetryCreateCommentResponse retryCreateCommentResponse = (RetryCreateCommentResponse) cVar.mo167291a();
            if (retryCreateCommentResponse != null) {
                comment = retryCreateCommentResponse.comment;
            } else {
                comment = null;
            }
            if (cVar.mo167292b() == null && comment != null) {
                this.this$0.updateDataList(new KeyMatcher(this.$commentId), new CommentUpdater(comment, this.this$0));
            }
            return Unit.INSTANCE;
        }
    }

    public MomentsDetailViewModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        this.postId = str;
        this.token = "";
        this.commentResponse = new C1177w<>();
        this.closePage = new C1177w<>();
        this.scrollToComment = new C1177w<>();
        this.scrollInfo = new C1177w<>();
        this.completeRefresh = new C1177w<>();
        this.toastResId = new C1177w<>();
        this.showCircleLoading = new C1177w<>();
        this.enableClick = new C1177w<>();
        this.resetCallback = new C1177w<>();
        this.showUnSupportDialog = new C1177w<>();
        MomentsPushHandler cVar = new MomentsPushHandler(this);
        this.mPushHandler = cVar;
        this.mSendCommentIdSet = new HashSet<>();
        this.hasQuota = new C1177w<>();
        this.categoryEnableAnonymous = new C1177w<>();
        this.forceDisableAnonymous = new C1177w<>();
        this.disableComment = new C1177w<>();
        this.anonymousAtError = new C1177w<>();
        this.anonymousPostLoading = new C1177w<>();
        C1177w<MomentsPublishViewModel.IdentityType> wVar = new C1177w<>();
        wVar.mo5929b(MomentsPublishViewModel.IdentityType.NORMAL);
        this.identityType = wVar;
        this.resetDraftFail = new C1177w<>();
        this.draftIdentity = MomentsPublishViewModel.IdentityType.NORMAL;
        this.sendHitPointPageView = new C1177w<>();
        loadFirstPage();
        cVar.mo167187a();
        reportPostPageViewHitPoint();
        this.uploadImageSuccess = new C1177w<>();
    }

    public final MomentsPostVM parsePostFromCommentList(SdkResponse<ListCommentsResponse> cVar) {
        Post post;
        Map<String, Comment> map;
        Category category;
        Entities entities;
        Map<String, Category> map2;
        String str;
        Map<String, MomentUser> map3;
        Entities entities2;
        Map<String, Post> map4;
        boolean z = true;
        Map<String, PreviewEntityPair> map5 = null;
        if (cVar.mo167292b() != null) {
            MomentsAppreciableHitPoint.f119684a.mo166741a(MomentsAppreciableHitPoint.f119684a.mo166749d(), true, ErrorType.SDK, cVar.mo167292b().getErrorCode());
            handlePageError(cVar.mo167292b());
            return null;
        }
        ListCommentsResponse a = cVar.mo167291a();
        if (a == null || (entities2 = a.entities) == null || (map4 = entities2.posts) == null) {
            post = null;
        } else {
            post = map4.get(this.postId);
        }
        if (a == null || post == null) {
            getShowUnSupportDialog().mo5926a(Integer.valueOf((int) R.string.Lark_Community_OopsSmthWrong));
            return null;
        }
        Boolean bool = post.is_deleted;
        Intrinsics.checkExpressionValueIsNotNull(bool, "post.is_deleted");
        if (bool.booleanValue()) {
            handlePageError(new ErrorResult(-20000));
            return null;
        }
        Entities entities3 = a.entities;
        if (!(entities3 == null || (map3 = entities3.users) == null)) {
            getUserMap().putAll(map3);
        }
        Entities entities4 = a.entities;
        if (entities4 != null) {
            Log.m165389i("moments_detail", "update post, postId is" + post.id);
            MomentsPush a2 = MomentsPush.f120015o.mo167147a();
            Intrinsics.checkExpressionValueIsNotNull(entities4, "it");
            a2.mo167108a(post, entities4);
        }
        Entities entities5 = a.entities;
        if (entities5 != null) {
            map = entities5.comments;
        } else {
            map = null;
        }
        Map<String, MomentsCommentVM> parseComment = parseComment(map, a.entities);
        List<String> list = post.category_ids;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z || (entities = a.entities) == null || (map2 = entities.categories) == null) {
            category = null;
        } else {
            List<String> list2 = post.category_ids;
            if (list2 != null) {
                str = list2.get(0);
            } else {
                str = null;
            }
            category = map2.get(str);
        }
        String str2 = post.id;
        Intrinsics.checkExpressionValueIsNotNull(str2, "post.id");
        Map<String, UrlPreviewHangPoint> map6 = post.url_preview_hang_point_map;
        Entities entities6 = a.entities;
        if (entities6 != null) {
            map5 = entities6.preview_entities;
        }
        return convertToPostVM(post, parseComment, category, parserPreviews(str2, map6, map5));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$getDraft$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0}, mo239175l = {694}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$g */
    public static final class C47429g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DraftAction $action;
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47429g(MomentsDetailViewModel fVar, String str, DraftAction bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$id = str;
            this.$action = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47429g gVar = new C47429g(this.this$0, this.$id, this.$action, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47429g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsDraft aVar = MomentsDraft.f119064a;
                String str = this.$id;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo165960a(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) obj;
            if (str2 == null) {
                return Unit.INSTANCE;
            }
            Object obj2 = null;
            RichText richText = null;
            MomentsPublishViewModel.IdentityType identityType = MomentsPublishViewModel.IdentityType.NORMAL;
            try {
                HashMap hashMap = (HashMap) JSONObject.parseObject(str2, HashMap.class);
                Intrinsics.checkExpressionValueIsNotNull(hashMap, "draft");
                Object obj3 = hashMap.get("rich_text");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str3 = (String) obj3;
                if (str3 != null) {
                    richText = (RichText) JSONObject.parseObject(str3, RichText.class);
                }
                Object obj4 = hashMap.get("identity");
                if (obj4 instanceof String) {
                    obj2 = obj4;
                }
                String str4 = (String) obj2;
                if (str4 != null) {
                    Object parseObject = JSONObject.parseObject(str4, MomentsPublishViewModel.IdentityType.class);
                    Intrinsics.checkExpressionValueIsNotNull(parseObject, "JSONObject.parseObject(i…IdentityType::class.java)");
                    identityType = (MomentsPublishViewModel.IdentityType) parseObject;
                }
            } catch (Exception e) {
                Log.m165384e("moments_detail", "get comment draft parse fail", e);
            }
            C1177w<Pair<DraftAction, RichText>> resetCallback = this.this$0.getResetCallback();
            DraftAction bVar = this.$action;
            if (richText == null) {
                richText = C59029c.m229161b("");
            }
            resetCallback.mo5926a(TuplesKt.to(bVar, richText));
            if (identityType == MomentsPublishViewModel.IdentityType.NORMAL) {
                return Unit.INSTANCE;
            }
            AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
            if (b != null) {
                boolean areEqual = Intrinsics.areEqual(b.enabled, C69089a.m265837a(true));
                AnonymityPolicy.AnonymousType anonymousType = b.type;
                MomentUser d = UserGlobalConfigAndSettingsManager.f120180a.mo167303d();
                if (!areEqual || !(!Intrinsics.areEqual(this.this$0.getHasQuota().mo5927b(), C69089a.m265837a(true))) || !((anonymousType == AnonymityPolicy.AnonymousType.NICKNAME && identityType == MomentsPublishViewModel.IdentityType.NICKNAME && d != null) || (anonymousType == AnonymityPolicy.AnonymousType.ANONYMOUS && identityType == MomentsPublishViewModel.IdentityType.ANONYMOUS))) {
                    this.this$0.getResetDraftFail().mo5926a(C69089a.m265837a(true));
                    return Unit.INSTANCE;
                }
                this.this$0.setDraftIdentity(identityType);
                this.this$0.getIdentityType().mo5926a(identityType);
                return Unit.INSTANCE;
            }
            this.this$0.getResetDraftFail().mo5926a(C69089a.m265837a(true));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$loadMore$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0}, mo239175l = {402}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$j */
    public static final class C47432j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47432j(MomentsDetailViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47432j jVar = new C47432j(this.this$0, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47432j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Comment> list;
            Entities entities;
            Entities entities2;
            Map<String, MomentUser> map;
            String str;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String postId = this.this$0.getPostId();
                String str2 = this.this$0.token;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167228a(postId, str2, 100, this);
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
            if (cVar == null) {
                Log.m165383e("moments_detail", "load comment failed");
                return Unit.INSTANCE;
            } else if (cVar.mo167292b() != null) {
                Log.m165383e("moments_detail", "load comment error:" + cVar.mo167292b());
                return Unit.INSTANCE;
            } else {
                ListCommentsResponse listCommentsResponse = (ListCommentsResponse) cVar.mo167291a();
                if (!(listCommentsResponse == null || (str = listCommentsResponse.next_page_token) == null)) {
                    this.this$0.token = str;
                }
                ListCommentsResponse listCommentsResponse2 = (ListCommentsResponse) cVar.mo167291a();
                if (!(listCommentsResponse2 == null || (entities2 = listCommentsResponse2.entities) == null || (map = entities2.users) == null)) {
                    this.this$0.getUserMap().putAll(map);
                }
                ArrayList arrayList = new ArrayList();
                MomentsDetailViewModel fVar = this.this$0;
                ListCommentsResponse listCommentsResponse3 = (ListCommentsResponse) cVar.mo167291a();
                Entities entities3 = null;
                Map<String, Comment> map2 = (listCommentsResponse3 == null || (entities = listCommentsResponse3.entities) == null) ? null : entities.comments;
                ListCommentsResponse listCommentsResponse4 = (ListCommentsResponse) cVar.mo167291a();
                if (listCommentsResponse4 != null) {
                    entities3 = listCommentsResponse4.entities;
                }
                Map<String, MomentsCommentVM> parseComment = fVar.parseComment(map2, entities3);
                ListCommentsResponse listCommentsResponse5 = (ListCommentsResponse) cVar.mo167291a();
                if (!(listCommentsResponse5 == null || (list = listCommentsResponse5.comments) == null)) {
                    for (T t : list) {
                        if (!this.this$0.mSendCommentIdSet.contains(t.id)) {
                            MomentsCommentVM eVar = parseComment.get(t.id);
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                        } else {
                            Log.m165389i("moments_detail", "filter send comment, id is:" + t.id);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List list2 = (List) this.this$0.getDataList().mo5927b();
                if (list2 != null) {
                    C69089a.m265837a(arrayList2.addAll(list2));
                }
                arrayList2.addAll(arrayList);
                this.this$0.getDataList().mo5926a(new CopyOnWriteArrayList(arrayList2));
                this.this$0.getCompleteRefresh().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$saveDraft$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3}, mo239175l = {648, 659, 662, 669}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "list", "$this$launch", "list", "needDelete", "$this$launch", "list", "$this$launch", "list", "map", "draftJson"}, mo239178s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$m */
    public static final class C47435m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ RichText $value;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47435m(MomentsDetailViewModel fVar, String str, RichText richText, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$key = str;
            this.$value = richText;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47435m mVar = new C47435m(this.this$0, this.$key, this.$value, cVar);
            mVar.p$ = (CoroutineScope) obj;
            return mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47435m) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0149 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 333
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel.C47435m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$loadFirstPage$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0, 1, 1, 1, 1}, mo239175l = {163, 185}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "policy", "list", "postVM"}, mo239178s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$i */
    public static final class C47431i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47431i(MomentsDetailViewModel fVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47431i iVar = new C47431i(this.this$0, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47431i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 555
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel.C47431i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel$sendComment$1", mo239173f = "MomentsDetailViewModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0}, mo239175l = {482}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "isAnonymous", "replyCommentItem", "replyComment", "originCommentSet", "postVM", "reactionAnonymous"}, mo239178s = {"L$0", "I$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.ss.android.lark.moments.impl.detail.f$n */
    public static final class C47436n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageInfo $imageInfo;
        final /* synthetic */ String $postId;
        final /* synthetic */ String $replyCommentId;
        final /* synthetic */ RichText $richText;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47436n(MomentsDetailViewModel fVar, RichText richText, String str, String str2, ImageInfo imageInfo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = fVar;
            this.$richText = richText;
            this.$replyCommentId = str;
            this.$postId = str2;
            this.$imageInfo = imageInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47436n nVar = new C47436n(this.this$0, this.$richText, this.$replyCommentId, this.$postId, this.$imageInfo, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47436n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            int i;
            Object obj2;
            Map<String, MomentUser> map;
            boolean z;
            boolean z2;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            MomentUser momentUser = null;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.this$0.getIdentityType().mo5927b() == MomentsPublishViewModel.IdentityType.NICKNAME || this.this$0.getIdentityType().mo5927b() == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<String> atIds = this.$richText.getAtIds();
                    if (atIds == null || atIds.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        this.this$0.getAnonymousAtError().mo5926a(C69089a.m265837a(true));
                        return Unit.INSTANCE;
                    }
                    this.this$0.getEnableClick().mo5926a(C69089a.m265837a(false));
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(0), null));
                }
                IMomentsItemBase itemById = this.this$0.getItemById(this.$replyCommentId);
                Comment comment = null;
                if (itemById instanceof MomentsCommentVM) {
                    comment = ((MomentsCommentVM) itemById).mo166412w();
                }
                CommentSet a2 = new CommentSet.C18340a().mo63464a(C69089a.m265839a(0)).build();
                IMomentsItemBase itemById2 = this.this$0.getItemById(this.$postId);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = false;
                if (itemById2 instanceof MomentsPostVM) {
                    MomentsPostVM fVar = (MomentsPostVM) itemById2;
                    if (fVar.mo166421F().comment_set != null) {
                        a2 = fVar.mo166421F().comment_set;
                        booleanRef.element = fVar.mo166450i();
                    }
                }
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                String str = this.$postId;
                RichText richText = this.$richText;
                ImageInfo imageInfo = this.$imageInfo;
                this.L$0 = ahVar;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                this.I$0 = i3;
                this.L$1 = itemById;
                this.L$2 = comment;
                this.L$3 = a2;
                this.L$4 = itemById2;
                this.L$5 = booleanRef;
                this.label = 1;
                obj2 = bVar.mo167227a(str, richText, imageInfo, comment, a2, z, this);
                if (obj2 == a) {
                    return a;
                }
                int i6 = z ? 1 : 0;
                Object[] objArr = z ? 1 : 0;
                Object[] objArr2 = z ? 1 : 0;
                i = i6;
            } else if (i2 == 1) {
                IMomentsItemBase iMomentsItemBase = (IMomentsItemBase) this.L$4;
                CommentSet commentSet = (CommentSet) this.L$3;
                Comment comment2 = (Comment) this.L$2;
                IMomentsItemBase iMomentsItemBase2 = (IMomentsItemBase) this.L$1;
                i = this.I$0;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                booleanRef = (Ref.BooleanRef) this.L$5;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar = (SdkResponse) obj2;
            this.this$0.deleteDraft(this.$postId);
            if (i != 0) {
                if (cVar.mo167291a() != null) {
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(1), null));
                } else {
                    ErrorResult b = cVar.mo167292b();
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(2), b != null ? b.getDisplayMsg() : null));
                }
                this.this$0.getEnableClick().mo5926a(C69089a.m265837a(true));
            }
            CreateCommentResponse createCommentResponse = (CreateCommentResponse) cVar.mo167291a();
            if (createCommentResponse == null) {
                return Unit.INSTANCE;
            }
            Entities entities = createCommentResponse.entities;
            if (!(entities == null || (map = entities.users) == null)) {
                this.this$0.getUserMap().putAll(map);
            }
            Comment comment3 = createCommentResponse.comment;
            if (comment3 != null) {
                Collection collection = (List) this.this$0.getDataList().mo5927b();
                if (collection == null) {
                    collection = new ArrayList();
                }
                ArrayList arrayList = new ArrayList(collection);
                Intrinsics.checkExpressionValueIsNotNull(comment3, "it");
                MomentsDetailViewModel fVar2 = this.this$0;
                String str2 = comment3.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.user_id");
                MomentsCommentVM eVar = new MomentsCommentVM(comment3, fVar2.getUser(str2), new ArrayList(), null, this.this$0, booleanRef.element, null, null, null, null, 960, null);
                IMomentsItemBase itemById3 = this.this$0.getItemById(this.$replyCommentId);
                if (itemById3 instanceof MomentsCommentVM) {
                    MomentsCommentVM eVar2 = (MomentsCommentVM) itemById3;
                    eVar.mo166381a(eVar2.mo166412w());
                    MomentsUserVM x = eVar2.mo166414y();
                    if (x != null) {
                        momentUser = x.mo166471i();
                    }
                    eVar.mo166382a(momentUser);
                    eVar.mo166384a(eVar2.mo166372A());
                }
                arrayList.add(eVar);
                DataCacheLiveData dataList = this.this$0.getDataList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (C69089a.m265837a(!(((IMomentsItemBase) obj3) instanceof MomentsDetailNoCommentItem)).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                }
                dataList.mo5926a(new CopyOnWriteArrayList(arrayList2));
            }
            this.this$0.getCommentResponse().mo5926a(createCommentResponse);
            return Unit.INSTANCE;
        }
    }

    private final void saveSendCommentIdIfNeed(Comment comment, Comment.CreateStatus createStatus) {
        if (comment != null && createStatus == Comment.CreateStatus.SUCCESS) {
            this.mSendCommentIdSet.add(comment.id);
        }
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
    public void onPushUserFollow(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188469a(this, str, z);
    }

    public final void appendAllCommentLabelItem(ArrayList<IMomentsItemBase> arrayList, MomentsPostVM fVar) {
        arrayList.add(new MomentsDetailLabelItem(1, new C47425c(this)));
    }

    public final void appendPostHeaderItem(MomentsPostVM fVar, ArrayList<IMomentsItemBase> arrayList) {
        if (fVar == null) {
            arrayList.add(new MomentsDetailHeaderLoadingItem());
        } else {
            arrayList.addAll(handlePostItem(fVar));
        }
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

    public void getDraft(String str, DraftAction bVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(bVar, "action");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47429g(this, str, bVar, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushNewCommentUpdate(String str, Entities entities) {
        Map<String, Comment> map;
        Comment comment;
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        if (entities != null && (map = entities.comments) != null && (comment = map.get(str)) != null) {
            updateDataList(new KeyMatcher(str), new CommentUpdater(comment, this));
        }
    }

    public void saveDraft(String str, RichText richText) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Job unused = C69553g.m266944a(C69364ai.m266265a(MomentsDispatcher.f119247a.mo166168a()), null, null, new C47435m(this, str, richText, null), 3, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushEntityDeleted(String str, EntityType entityType) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(entityType, "entityType");
        if (entityType == EntityType.POST && Intrinsics.areEqual(str, this.postId)) {
            getClosePage().mo5926a((Boolean) true);
        } else if (entityType == EntityType.COMMENT) {
            updateDataList(new KeyMatcher(str), new ItemRemoveUpdater());
            updateDataList(new ReplyCommentMatcher(str), new ReplyCommentDeleteUpdater(this));
            updateDataList(new HotCommentMatcher(str), new HotCommentDeleteUpdater(str, this));
        }
    }

    public final List<IMomentsItemBase> mergeFirstPageData(MomentsPostVM fVar, SdkResponse<ListCommentsResponse> cVar) {
        Map<String, Comment> map;
        Entities entities;
        List<Comment> list;
        ListCommentsResponse a;
        ListCommentsResponse a2;
        Entities entities2;
        Entities entities3;
        Map<String, MomentUser> map2;
        String str;
        ArrayList<IMomentsItemBase> arrayList = new ArrayList<>();
        if (fVar == null) {
            return arrayList;
        }
        arrayList.addAll(handlePostItem(fVar));
        appendAllCommentLabelItem(arrayList, fVar);
        if (cVar.mo167292b() != null) {
            Log.m165383e("moments_detail", "load comment error:" + cVar.mo167292b());
            return arrayList;
        }
        ListCommentsResponse a3 = cVar.mo167291a();
        if (!(a3 == null || (str = a3.next_page_token) == null)) {
            this.token = str;
        }
        ListCommentsResponse a4 = cVar.mo167291a();
        if (!(a4 == null || (entities3 = a4.entities) == null || (map2 = entities3.users) == null)) {
            getUserMap().putAll(map2);
        }
        List<Comment> list2 = null;
        if (cVar == null || (a2 = cVar.mo167291a()) == null || (entities2 = a2.entities) == null) {
            map = null;
        } else {
            map = entities2.comments;
        }
        if (cVar == null || (a = cVar.mo167291a()) == null) {
            entities = null;
        } else {
            entities = a.entities;
        }
        Map<String, MomentsCommentVM> parseComment = parseComment(map, entities);
        ListCommentsResponse a5 = cVar.mo167291a();
        if (a5 != null) {
            list2 = a5.comments;
        }
        if (CollectionUtils.isEmpty(list2)) {
            arrayList.add(new MomentsDetailNoCommentItem());
        } else {
            ListCommentsResponse a6 = cVar.mo167291a();
            if (!(a6 == null || (list = a6.comments) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    MomentsCommentVM eVar = parseComment.get(it.next().id);
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        MomentsPushHandler.IMomentsPushListener.C47594a.m188468a(this, str, reactionSet, map);
    }

    public Observable<IPhotoDependency.Image> uploadImage(Context context, List<String> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Observable<IPhotoDependency.Image> map = Observable.fromIterable(list).flatMap(new C47437o(context, z)).flatMap(new C47438p(this, z)).subscribeOn(LarkRxSchedulers.io()).map(C47440q.f119669a);
        Intrinsics.checkExpressionValueIsNotNull(map, "Observable.fromIterable(…h, it.height, it.token) }");
        return map;
    }

    public void sendComment(String str, RichText richText, ImageInfo imageInfo, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(str2, "replyCommentId");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47436n(this, richText, str2, str, imageInfo, null), 2, null);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushPostStatusChanged(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPostId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        MomentsPushHandler.IMomentsPushListener.C47594a.m188467a(this, str, post, entities, createStatus, str2);
    }

    @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPushHandler.IMomentsPushListener
    public void onPushCommentStatusChanged(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localCommentId");
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        updateDataList(new KeyMatcher(str), new CommentStatusUpdater(comment, entities, createStatus, this, str2));
        saveSendCommentIdIfNeed(comment, createStatus);
    }
}
