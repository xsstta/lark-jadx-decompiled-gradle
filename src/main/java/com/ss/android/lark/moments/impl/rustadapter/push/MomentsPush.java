package com.ss.android.lark.moments.impl.rustadapter.push;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.LarkError;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.PushCommentCreateStatusChangeLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushCommentSetLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushEntityDeletedLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushMomentUsersLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushNewCommentUpdatedNotification;
import com.bytedance.lark.pb.moments.v1.PushNewPostUpdatedNotification;
import com.bytedance.lark.pb.moments.v1.PushPostCreateStatusChangeLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushPostDistributionLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushPostIsBroadcastLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushReactionSetLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushShareCountLocalNotification;
import com.bytedance.lark.pb.moments.v1.PushUserFollowingChangeLocalNotification;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.utils.LarkContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\u0018\u0000 S2\u00020\u0001:\u000fSTUVWXYZ[\\]^_`aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\tJ\u000e\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\rJ\u000e\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011J\u000e\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aJ\u000e\u0010,\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eJ\u0016\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J(\u00103\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010;\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010<\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010=\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010>\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010?\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010@\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010A\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010B\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010C\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010D\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J(\u0010E\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J\u000e\u0010F\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010G\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010H\u001a\u00020 2\u0006\u0010!\u001a\u00020\tJ\u000e\u0010I\u001a\u00020 2\u0006\u0010!\u001a\u00020\rJ\u000e\u0010J\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011J\u000e\u0010L\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010M\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010N\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010O\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010P\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aJ\u000e\u0010Q\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010R\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush;", "", "()V", "mPushBroadcastListeners", "", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushBroadcastChangeListener;", "mPushCommentSetListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentSetChangeListener;", "mPushCommentStatusChangeListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentStatusChangeListener;", "mPushDistributionListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushDistributionChangeListener;", "mPushEntityDeletedListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushEntityDeletedListener;", "mPushMomentsUserListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushMomentUserListener;", "mPushNewCommentUpdateListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewCommentUpdateListener;", "mPushNewPostUpdateListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewPostUpdateListener;", "mPushPostEntityListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostEntityListener;", "mPushPostStatusChangeListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostStatusChangeListener;", "mPushReactionListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushReactionListener;", "mPushShareCountListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushShareCountChangeListener;", "mPushUserFollowChangeListeners", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushUserFollowChangeListener;", "addPushBroadcastChangeListener", "", "listener", "addPushCommentSetChangeListener", "addPushCommentStatusChangeListener", "addPushEntityDeletedListener", "addPushMomentUserListener", "addPushNewCommentUpdateListener", "addPushNewPostUpdateListener", "addPushPostDistributionChangeListener", "addPushPostEntityChangeListener", "addPushPostStatusChangeListener", "addPushReactionListener", "addPushShareCountChangeListener", "addPushUserFollowChangeListener", "notifyPostEntityEvent", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "onPushBroadcastChange", "request", "", "sid", "", "isFromPipe", "", "offlinePush", "onPushCommentSetChange", "onPushCommentStatusChange", "onPushEntityDeleted", "onPushMomentUser", "onPushNewCommentUpdate", "onPushNewPostUpdate", "onPushPostDistributionChange", "onPushPostStatusChange", "onPushReaction", "onPushShareCountChange", "onPushUserFollow", "removePushBroadcastChangeListener", "removePushCommentSetChangeListener", "removePushCommentStatusChangeListener", "removePushEntityDeletedListener", "removePushMomentUserListener", "removePushNewCommentUpdateListener", "removePushNewPostUpdateListener", "removePushPostDistributionChangeListener", "removePushPostEntityChangeListener", "removePushPostStatusChangeListener", "removePushReactionListener", "removePushShareCountChangeListener", "removePushUserFollowChangeListener", "Companion", "IPushBroadcastChangeListener", "IPushCommentSetChangeListener", "IPushCommentStatusChangeListener", "IPushDistributionChangeListener", "IPushEntityDeletedListener", "IPushMomentUserListener", "IPushNewCommentUpdateListener", "IPushNewPostUpdateListener", "IPushPostEntityListener", "IPushPostStatusChangeListener", "IPushReactionListener", "IPushShareCountChangeListener", "IPushUserFollowChangeListener", "SingletonHolder", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.a.a */
public final class MomentsPush {

    /* renamed from: n */
    public static final MomentsPush f120014n = SingletonHolder.f120085a.mo167175a();

    /* renamed from: o */
    public static final Companion f120015o = new Companion(null);

    /* renamed from: a */
    public final List<IPushEntityDeletedListener> f120016a;

    /* renamed from: b */
    public final List<IPushUserFollowChangeListener> f120017b;

    /* renamed from: c */
    public final List<IPushPostStatusChangeListener> f120018c;

    /* renamed from: d */
    public final List<IPushMomentUserListener> f120019d;

    /* renamed from: e */
    public final List<IPushReactionListener> f120020e;

    /* renamed from: f */
    public final List<IPushCommentStatusChangeListener> f120021f;

    /* renamed from: g */
    public final List<IPushCommentSetChangeListener> f120022g;

    /* renamed from: h */
    public final List<IPushShareCountChangeListener> f120023h;

    /* renamed from: i */
    public final List<IPushDistributionChangeListener> f120024i;

    /* renamed from: j */
    public final List<IPushBroadcastChangeListener> f120025j;

    /* renamed from: k */
    public final List<IPushNewPostUpdateListener> f120026k;

    /* renamed from: l */
    public final List<IPushNewCommentUpdateListener> f120027l;

    /* renamed from: m */
    public final CopyOnWriteArrayList<IPushPostEntityListener> f120028m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushBroadcastChangeListener;", "", "onPushBroadcastChange", "", "postId", "", "isBroadcast", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$b */
    public interface IPushBroadcastChangeListener {
        /* renamed from: a */
        void mo167162a(String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentSetChangeListener;", "", "onPushCommentSetChange", "", "postId", "", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$c */
    public interface IPushCommentSetChangeListener {
        /* renamed from: a */
        void mo167163a(String str, CommentSet commentSet);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentStatusChangeListener;", "", "onPushCommentStatusChange", "", "localCommentId", "", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$d */
    public interface IPushCommentStatusChangeListener {
        /* renamed from: a */
        void mo167164a(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushDistributionChangeListener;", "", "onPushDistributionChange", "", "postId", "", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$e */
    public interface IPushDistributionChangeListener {
        /* renamed from: a */
        void mo167165a(String str, Post.PostDistributionType postDistributionType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushEntityDeletedListener;", "", "onPushEntityDeleted", "", "entityId", "", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$f */
    public interface IPushEntityDeletedListener {
        /* renamed from: a */
        void mo167166a(String str, EntityType entityType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushMomentUserListener;", "", "onPushMomentUser", "", "momentUser", "", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$g */
    public interface IPushMomentUserListener {
        /* renamed from: a */
        void mo167167a(Map<String, MomentUser> map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewCommentUpdateListener;", "", "onPushNewCommentUpdateListener", "", "commentId", "", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$h */
    public interface IPushNewCommentUpdateListener {
        /* renamed from: a */
        void mo167168a(String str, Entities entities);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewPostUpdateListener;", "", "onPushNewPostUpdateListener", "", "postId", "", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$i */
    public interface IPushNewPostUpdateListener {
        /* renamed from: a */
        void mo167169a(String str, Entities entities);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostEntityListener;", "", "onPushPostEntity", "", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$j */
    public interface IPushPostEntityListener {
        /* renamed from: a */
        void mo167170a(Post post, Entities entities);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostStatusChangeListener;", "", "onPushPostStatusChange", "", "localPostId", "", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "errorMessage", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$k */
    public interface IPushPostStatusChangeListener {
        /* renamed from: a */
        void mo167171a(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushReactionListener;", "", "onPushReaction", "", "id", "", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$l */
    public interface IPushReactionListener {
        /* renamed from: a */
        void mo167172a(String str, ReactionSet reactionSet, Map<String, MomentUser> map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushShareCountChangeListener;", "", "onPushShareCountChange", "", "postId", "", "shareCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$m */
    public interface IPushShareCountChangeListener {
        /* renamed from: a */
        void mo167173a(String str, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushUserFollowChangeListener;", "", "onPushUserFollow", "", "userId", "", "isFollow", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$n */
    public interface IPushUserFollowChangeListener {
        /* renamed from: a */
        void mo167174a(String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$Companion;", "", "()V", "LOG_TAG", "", "instance", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush;", "getInstance", "()Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final MomentsPush mo167147a() {
            return MomentsPush.f120014n;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$SingletonHolder;", "", "()V", "HOLDER", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush;", "getHOLDER", "()Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$o */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f120085a = new SingletonHolder();

        /* renamed from: b */
        private static final MomentsPush f120086b = new MomentsPush(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final MomentsPush mo167175a() {
            return f120086b;
        }
    }

    /* renamed from: a */
    public final void mo167121a(IPushUserFollowChangeListener nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "listener");
        C53246j.m205910a(this.f120017b, nVar, new C47560aa(this));
    }

    /* renamed from: b */
    public final void mo167135b(IPushUserFollowChangeListener nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "listener");
        C53246j.m205911b(this.f120017b, nVar, az.f120084a);
    }

    /* renamed from: a */
    public final void mo167118a(IPushPostStatusChangeListener kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "listener");
        C53246j.m205910a(this.f120018c, kVar, new C47587x(this));
    }

    /* renamed from: b */
    public final void mo167132b(IPushPostStatusChangeListener kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "listener");
        C53246j.m205911b(this.f120018c, kVar, aw.f120081a);
    }

    /* renamed from: a */
    public final void mo167119a(IPushReactionListener lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "listener");
        C53246j.m205910a(this.f120020e, lVar, new C47589y(this));
    }

    /* renamed from: b */
    public final void mo167133b(IPushReactionListener lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "listener");
        C53246j.m205911b(this.f120020e, lVar, ax.f120082a);
    }

    /* renamed from: a */
    public final void mo167120a(IPushShareCountChangeListener mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "listener");
        C53246j.m205910a(this.f120023h, mVar, new C47591z(this));
    }

    /* renamed from: b */
    public final void mo167134b(IPushShareCountChangeListener mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "listener");
        C53246j.m205911b(this.f120023h, mVar, ay.f120083a);
    }

    /* renamed from: a */
    public final void mo167116a(IPushNewPostUpdateListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "listener");
        C53246j.m205910a(this.f120026k, iVar, new C47583v(this));
    }

    /* renamed from: a */
    public final void mo167115a(IPushNewCommentUpdateListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        C53246j.m205910a(this.f120027l, hVar, new C47581u(this));
    }

    /* renamed from: b */
    public final void mo167131b(IPushPostEntityListener jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "listener");
        this.f120028m.remove(jVar);
    }

    /* renamed from: a */
    public final void mo167122a(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushNewPostUpdate");
        try {
            PushNewPostUpdatedNotification decode = PushNewPostUpdatedNotification.ADAPTER.decode(bArr);
            String str2 = decode.post_id;
            Entities entities = decode.entities;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC47569ai(this, str2, entities));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public final void mo167136b(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushNewCommentUpdate");
        try {
            PushNewCommentUpdatedNotification decode = PushNewCommentUpdatedNotification.ADAPTER.decode(bArr);
            String str2 = decode.comment_id;
            Entities entities = decode.entities;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC47568ah(this, str2, entities));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ao */
    public static final class ao implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final ao f120073a = new ao();

        ao() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_POST_IS_BROADCAST_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ap */
    public static final class ap implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final ap f120074a = new ap();

        ap() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_COMMENT_SET_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$aq */
    public static final class aq implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final aq f120075a = new aq();

        aq() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_COMMENT_CREATE_STATUS_CHANGE_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ar */
    public static final class ar implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final ar f120076a = new ar();

        ar() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_ENTITY_DELETED_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$as */
    public static final class as implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final as f120077a = new as();

        as() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_MOMENT_USERS_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$at */
    public static final class C47570at implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C47570at f120078a = new C47570at();

        C47570at() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_NEW_COMMENT_UPDATED_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$au */
    public static final class au implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final au f120079a = new au();

        au() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_NEW_POST_UPDATED_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$av */
    public static final class av implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final av f120080a = new av();

        av() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_POST_DISTRIBUTION_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$aw */
    public static final class aw implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final aw f120081a = new aw();

        aw() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_POST_CREATE_STATUS_CHANGE_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ax */
    public static final class ax implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final ax f120082a = new ax();

        ax() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_REACTION_SET_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ay */
    public static final class ay implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final ay f120083a = new ay();

        ay() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_SHARE_COUNT_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$az */
    public static final class az implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final az f120084a = new az();

        az() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_USER_FOLLOWING_CHANGE_LOCAL_NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$aa */
    public static final class C47560aa implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120029a;

        C47560aa(MomentsPush aVar) {
            this.f120029a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_USER_FOLLOWING_CHANGE_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120029a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47560aa.C475611 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushUserFollow";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushUserFollow([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167143i(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ab */
    public static final class RunnableC47562ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120030a;

        /* renamed from: b */
        final /* synthetic */ Post f120031b;

        /* renamed from: c */
        final /* synthetic */ Entities f120032c;

        RunnableC47562ab(MomentsPush aVar, Post post, Entities entities) {
            this.f120030a = aVar;
            this.f120031b = post;
            this.f120032c = entities;
        }

        public final void run() {
            Iterator<T> it = this.f120030a.f120028m.iterator();
            while (it.hasNext()) {
                it.next().mo167170a(this.f120031b, this.f120032c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$p */
    public static final class C47571p implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120087a;

        C47571p(MomentsPush aVar) {
            this.f120087a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_POST_IS_BROADCAST_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120087a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47571p.C475721 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushBroadcastChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushBroadcastChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167140f(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$q */
    public static final class C47573q implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120088a;

        C47573q(MomentsPush aVar) {
            this.f120088a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_COMMENT_SET_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120088a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47573q.C475741 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushCommentSetChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushCommentSetChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167139e(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$r */
    public static final class C47575r implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120089a;

        C47575r(MomentsPush aVar) {
            this.f120089a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_COMMENT_CREATE_STATUS_CHANGE_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120089a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47575r.C475761 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushCommentStatusChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushCommentStatusChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167145k(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$s */
    public static final class C47577s implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120090a;

        C47577s(MomentsPush aVar) {
            this.f120090a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_ENTITY_DELETED_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120090a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47577s.C475781 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushEntityDeleted";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushEntityDeleted([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167146l(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$t */
    public static final class C47579t implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120091a;

        C47579t(MomentsPush aVar) {
            this.f120091a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_MOMENT_USERS_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120091a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47579t.C475801 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushMomentUser";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushMomentUser([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167142h(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$u */
    public static final class C47581u implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120092a;

        C47581u(MomentsPush aVar) {
            this.f120092a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_NEW_COMMENT_UPDATED_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120092a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47581u.C475821 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushNewCommentUpdate";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushNewCommentUpdate([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167136b(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$v */
    public static final class C47583v implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120093a;

        C47583v(MomentsPush aVar) {
            this.f120093a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_NEW_POST_UPDATED_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120093a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47583v.C475841 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushNewPostUpdate";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushNewPostUpdate([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167122a(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$w */
    public static final class C47585w implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120094a;

        C47585w(MomentsPush aVar) {
            this.f120094a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_POST_DISTRIBUTION_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120094a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47585w.C475861 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushPostDistributionChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushPostDistributionChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167137c(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$x */
    public static final class C47587x implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120095a;

        C47587x(MomentsPush aVar) {
            this.f120095a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_POST_CREATE_STATUS_CHANGE_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120095a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47587x.C475881 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushPostStatusChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushPostStatusChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167144j(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$y */
    public static final class C47589y implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120096a;

        C47589y(MomentsPush aVar) {
            this.f120096a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_REACTION_SET_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120096a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47589y.C475901 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushReaction";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushReaction([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167141g(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$z */
    public static final class C47591z implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120097a;

        C47591z(MomentsPush aVar) {
            this.f120097a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_SHARE_COUNT_LOCAL_NOTIFICATION, new C47593b(new Function4<byte[], String, Boolean, Boolean, Unit>(this.f120097a) {
                /* class com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.C47591z.C475921 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onPushShareCountChange";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(MomentsPush.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onPushShareCountChange([BLjava/lang/String;ZZ)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function4
                public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
                    invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
                    Intrinsics.checkParameterIsNotNull(bArr, "p1");
                    Intrinsics.checkParameterIsNotNull(str, "p2");
                    ((MomentsPush) this.receiver).mo167138d(bArr, str, z, z2);
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ac */
    public static final class RunnableC47563ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120033a;

        /* renamed from: b */
        final /* synthetic */ String f120034b;

        /* renamed from: c */
        final /* synthetic */ Boolean f120035c;

        RunnableC47563ac(MomentsPush aVar, String str, Boolean bool) {
            this.f120033a = aVar;
            this.f120034b = str;
            this.f120035c = bool;
        }

        public final void run() {
            Iterator<T> it = this.f120033a.f120025j.iterator();
            while (it.hasNext()) {
                String str = this.f120034b;
                Intrinsics.checkExpressionValueIsNotNull(str, "postId");
                Boolean bool = this.f120035c;
                Intrinsics.checkExpressionValueIsNotNull(bool, "isBroadCast");
                it.next().mo167162a(str, bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ad */
    public static final class RunnableC47564ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120036a;

        /* renamed from: b */
        final /* synthetic */ String f120037b;

        /* renamed from: c */
        final /* synthetic */ CommentSet f120038c;

        RunnableC47564ad(MomentsPush aVar, String str, CommentSet commentSet) {
            this.f120036a = aVar;
            this.f120037b = str;
            this.f120038c = commentSet;
        }

        public final void run() {
            Iterator<T> it = this.f120036a.f120022g.iterator();
            while (it.hasNext()) {
                String str = this.f120037b;
                Intrinsics.checkExpressionValueIsNotNull(str, "postId");
                it.next().mo167163a(str, this.f120038c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ae */
    public static final class RunnableC47565ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120039a;

        /* renamed from: b */
        final /* synthetic */ String f120040b;

        /* renamed from: c */
        final /* synthetic */ Comment f120041c;

        /* renamed from: d */
        final /* synthetic */ Entities f120042d;

        /* renamed from: e */
        final /* synthetic */ Comment.CreateStatus f120043e;

        /* renamed from: f */
        final /* synthetic */ String f120044f;

        RunnableC47565ae(MomentsPush aVar, String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
            this.f120039a = aVar;
            this.f120040b = str;
            this.f120041c = comment;
            this.f120042d = entities;
            this.f120043e = createStatus;
            this.f120044f = str2;
        }

        public final void run() {
            Iterator<T> it = this.f120039a.f120021f.iterator();
            while (it.hasNext()) {
                String str = this.f120040b;
                Intrinsics.checkExpressionValueIsNotNull(str, "localCommentId");
                Comment comment = this.f120041c;
                Entities entities = this.f120042d;
                Comment.CreateStatus createStatus = this.f120043e;
                Intrinsics.checkExpressionValueIsNotNull(createStatus, UpdateKey.STATUS);
                it.next().mo167164a(str, comment, entities, createStatus, this.f120044f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$af */
    public static final class RunnableC47566af implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120045a;

        /* renamed from: b */
        final /* synthetic */ String f120046b;

        /* renamed from: c */
        final /* synthetic */ EntityType f120047c;

        RunnableC47566af(MomentsPush aVar, String str, EntityType entityType) {
            this.f120045a = aVar;
            this.f120046b = str;
            this.f120047c = entityType;
        }

        public final void run() {
            Iterator<T> it = this.f120045a.f120016a.iterator();
            while (it.hasNext()) {
                String str = this.f120046b;
                Intrinsics.checkExpressionValueIsNotNull(str, "entityId");
                EntityType entityType = this.f120047c;
                Intrinsics.checkExpressionValueIsNotNull(entityType, "entityType");
                it.next().mo167166a(str, entityType);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ag */
    public static final class RunnableC47567ag implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120048a;

        /* renamed from: b */
        final /* synthetic */ Map f120049b;

        RunnableC47567ag(MomentsPush aVar, Map map) {
            this.f120048a = aVar;
            this.f120049b = map;
        }

        public final void run() {
            Iterator<T> it = this.f120048a.f120019d.iterator();
            while (it.hasNext()) {
                Map<String, MomentUser> map = this.f120049b;
                Intrinsics.checkExpressionValueIsNotNull(map, "map");
                it.next().mo167167a(map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ah */
    public static final class RunnableC47568ah implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120050a;

        /* renamed from: b */
        final /* synthetic */ String f120051b;

        /* renamed from: c */
        final /* synthetic */ Entities f120052c;

        RunnableC47568ah(MomentsPush aVar, String str, Entities entities) {
            this.f120050a = aVar;
            this.f120051b = str;
            this.f120052c = entities;
        }

        public final void run() {
            Iterator<T> it = this.f120050a.f120027l.iterator();
            while (it.hasNext()) {
                String str = this.f120051b;
                Intrinsics.checkExpressionValueIsNotNull(str, "commentId");
                it.next().mo167168a(str, this.f120052c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ai */
    public static final class RunnableC47569ai implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120053a;

        /* renamed from: b */
        final /* synthetic */ String f120054b;

        /* renamed from: c */
        final /* synthetic */ Entities f120055c;

        RunnableC47569ai(MomentsPush aVar, String str, Entities entities) {
            this.f120053a = aVar;
            this.f120054b = str;
            this.f120055c = entities;
        }

        public final void run() {
            Iterator<T> it = this.f120053a.f120026k.iterator();
            while (it.hasNext()) {
                String str = this.f120054b;
                Intrinsics.checkExpressionValueIsNotNull(str, "postId");
                it.next().mo167169a(str, this.f120055c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$aj */
    public static final class aj implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120056a;

        /* renamed from: b */
        final /* synthetic */ String f120057b;

        /* renamed from: c */
        final /* synthetic */ Post.PostDistributionType f120058c;

        aj(MomentsPush aVar, String str, Post.PostDistributionType postDistributionType) {
            this.f120056a = aVar;
            this.f120057b = str;
            this.f120058c = postDistributionType;
        }

        public final void run() {
            Iterator<T> it = this.f120056a.f120024i.iterator();
            while (it.hasNext()) {
                String str = this.f120057b;
                Intrinsics.checkExpressionValueIsNotNull(str, "postId");
                Post.PostDistributionType postDistributionType = this.f120058c;
                Intrinsics.checkExpressionValueIsNotNull(postDistributionType, ShareHitPoint.f121869d);
                it.next().mo167165a(str, postDistributionType);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$al */
    public static final class al implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120065a;

        /* renamed from: b */
        final /* synthetic */ PushReactionSetLocalNotification f120066b;

        al(MomentsPush aVar, PushReactionSetLocalNotification pushReactionSetLocalNotification) {
            this.f120065a = aVar;
            this.f120066b = pushReactionSetLocalNotification;
        }

        public final void run() {
            Map<String, MomentUser> map;
            for (T t : this.f120065a.f120020e) {
                String str = this.f120066b.entity_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "notification.entity_id");
                ReactionSet reactionSet = this.f120066b.reaction_set;
                Entities entities = this.f120066b.entities;
                if (entities != null) {
                    map = entities.users;
                } else {
                    map = null;
                }
                t.mo167172a(str, reactionSet, map);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$am */
    public static final class am implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120067a;

        /* renamed from: b */
        final /* synthetic */ String f120068b;

        /* renamed from: c */
        final /* synthetic */ Integer f120069c;

        am(MomentsPush aVar, String str, Integer num) {
            this.f120067a = aVar;
            this.f120068b = str;
            this.f120069c = num;
        }

        public final void run() {
            Iterator<T> it = this.f120067a.f120023h.iterator();
            while (it.hasNext()) {
                String str = this.f120068b;
                Intrinsics.checkExpressionValueIsNotNull(str, "postId");
                Integer num = this.f120069c;
                Intrinsics.checkExpressionValueIsNotNull(num, "shareCount");
                it.next().mo167173a(str, num.intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$an */
    public static final class an implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120070a;

        /* renamed from: b */
        final /* synthetic */ String f120071b;

        /* renamed from: c */
        final /* synthetic */ Boolean f120072c;

        an(MomentsPush aVar, String str, Boolean bool) {
            this.f120070a = aVar;
            this.f120071b = str;
            this.f120072c = bool;
        }

        public final void run() {
            Iterator<T> it = this.f120070a.f120017b.iterator();
            while (it.hasNext()) {
                String str = this.f120071b;
                Intrinsics.checkExpressionValueIsNotNull(str, "userId");
                Boolean bool = this.f120072c;
                Intrinsics.checkExpressionValueIsNotNull(bool, "isFollow");
                it.next().mo167174a(str, bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.a$ak */
    public static final class ak implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPush f120059a;

        /* renamed from: b */
        final /* synthetic */ Post.CreateStatus f120060b;

        /* renamed from: c */
        final /* synthetic */ String f120061c;

        /* renamed from: d */
        final /* synthetic */ Post f120062d;

        /* renamed from: e */
        final /* synthetic */ Entities f120063e;

        /* renamed from: f */
        final /* synthetic */ String f120064f;

        ak(MomentsPush aVar, Post.CreateStatus createStatus, String str, Post post, Entities entities, String str2) {
            this.f120059a = aVar;
            this.f120060b = createStatus;
            this.f120061c = str;
            this.f120062d = post;
            this.f120063e = entities;
            this.f120064f = str2;
        }

        public final void run() {
            Application application = LarkContext.getApplication();
            if (this.f120060b == Post.CreateStatus.SUCCESS) {
                Application application2 = application;
                LKUIToast.show(application2, UIUtils.getString(application2, R.string.Lark_Community_PostedToast, 3500));
            } else if (this.f120060b == Post.CreateStatus.ERROR || this.f120060b == Post.CreateStatus.FAILED) {
                Application application3 = application;
                LKUIToast.show(application3, UIUtils.getString(application3, R.string.Lark_Community_UnableToPostToast, 3500));
            }
            Iterator<T> it = this.f120059a.f120018c.iterator();
            while (it.hasNext()) {
                String str = this.f120061c;
                Intrinsics.checkExpressionValueIsNotNull(str, "localPostId");
                Post post = this.f120062d;
                Entities entities = this.f120063e;
                Post.CreateStatus createStatus = this.f120060b;
                Intrinsics.checkExpressionValueIsNotNull(createStatus, UpdateKey.STATUS);
                it.next().mo167171a(str, post, entities, createStatus, this.f120064f);
            }
        }
    }

    private MomentsPush() {
        this.f120016a = new CopyOnWriteArrayList();
        this.f120017b = new CopyOnWriteArrayList();
        this.f120018c = new CopyOnWriteArrayList();
        this.f120019d = new CopyOnWriteArrayList();
        this.f120020e = new CopyOnWriteArrayList();
        this.f120021f = new CopyOnWriteArrayList();
        this.f120022g = new CopyOnWriteArrayList();
        this.f120023h = new CopyOnWriteArrayList();
        this.f120024i = new CopyOnWriteArrayList();
        this.f120025j = new CopyOnWriteArrayList();
        this.f120026k = new CopyOnWriteArrayList();
        this.f120027l = new CopyOnWriteArrayList();
        this.f120028m = new CopyOnWriteArrayList<>();
    }

    public /* synthetic */ MomentsPush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo167117a(IPushPostEntityListener jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "listener");
        this.f120028m.add(jVar);
    }

    /* renamed from: b */
    public final void mo167123b(IPushBroadcastChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C53246j.m205911b(this.f120025j, bVar, ao.f120073a);
    }

    /* renamed from: a */
    public final void mo167109a(IPushBroadcastChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C53246j.m205910a(this.f120025j, bVar, new C47571p(this));
    }

    /* renamed from: b */
    public final void mo167124b(IPushCommentSetChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        C53246j.m205911b(this.f120022g, cVar, ap.f120074a);
    }

    /* renamed from: b */
    public final void mo167125b(IPushCommentStatusChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        C53246j.m205911b(this.f120021f, dVar, aq.f120075a);
    }

    /* renamed from: a */
    public final void mo167110a(IPushCommentSetChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        C53246j.m205910a(this.f120022g, cVar, new C47573q(this));
    }

    /* renamed from: b */
    public final void mo167126b(IPushDistributionChangeListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        C53246j.m205911b(this.f120024i, eVar, av.f120080a);
    }

    /* renamed from: a */
    public final void mo167111a(IPushCommentStatusChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        C53246j.m205910a(this.f120021f, dVar, new C47575r(this));
    }

    /* renamed from: b */
    public final void mo167127b(IPushEntityDeletedListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        C53246j.m205911b(this.f120016a, fVar, ar.f120076a);
    }

    /* renamed from: a */
    public final void mo167112a(IPushDistributionChangeListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        C53246j.m205910a(this.f120024i, eVar, new C47585w(this));
    }

    /* renamed from: b */
    public final void mo167128b(IPushMomentUserListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        C53246j.m205911b(this.f120019d, gVar, as.f120077a);
    }

    /* renamed from: a */
    public final void mo167113a(IPushEntityDeletedListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        C53246j.m205910a(this.f120016a, fVar, new C47577s(this));
    }

    /* renamed from: b */
    public final void mo167129b(IPushNewCommentUpdateListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        C53246j.m205911b(this.f120027l, hVar, C47570at.f120078a);
    }

    /* renamed from: a */
    public final void mo167114a(IPushMomentUserListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        C53246j.m205910a(this.f120019d, gVar, new C47579t(this));
    }

    /* renamed from: b */
    public final void mo167130b(IPushNewPostUpdateListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "listener");
        C53246j.m205911b(this.f120026k, iVar, au.f120079a);
    }

    /* renamed from: a */
    public final void mo167108a(Post post, Entities entities) {
        Intrinsics.checkParameterIsNotNull(post, "post");
        Intrinsics.checkParameterIsNotNull(entities, "entities");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC47562ab(this, post, entities));
    }

    /* renamed from: c */
    public final void mo167137c(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushPostDistributionChange");
        try {
            PushPostDistributionLocalNotification decode = PushPostDistributionLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.post_id;
            Post.PostDistributionType postDistributionType = decode.distribution_type;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new aj(this, str2, postDistributionType));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public final void mo167138d(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushPostVisibilityChange");
        try {
            PushShareCountLocalNotification decode = PushShareCountLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.post_id;
            Integer num = decode.share_count;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new am(this, str2, num));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public final void mo167139e(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushCommentSetChange");
        try {
            PushCommentSetLocalNotification decode = PushCommentSetLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.entity_id;
            CommentSet commentSet = decode.comment_set;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC47564ad(this, str2, commentSet));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: f */
    public final void mo167140f(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushBroadcastChange");
        try {
            PushPostIsBroadcastLocalNotification decode = PushPostIsBroadcastLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.post_id;
            Boolean bool = decode.is_broadcast;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC47563ac(this, str2, bool));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public final void mo167141g(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushReaction");
        try {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new al(this, PushReactionSetLocalNotification.ADAPTER.decode(bArr)));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: h */
    public final void mo167142h(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushMomentUser");
        try {
            Map<String, MomentUser> map = PushMomentUsersLocalNotification.ADAPTER.decode(bArr).moment_users;
            if (CollectionUtils.isNotEmpty(map)) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new RunnableC47567ag(this, map));
            }
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: i */
    public final void mo167143i(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushUserFollow");
        try {
            PushUserFollowingChangeLocalNotification decode = PushUserFollowingChangeLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.target_user_id;
            Boolean bool = decode.is_current_user_following;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new an(this, str2, bool));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: j */
    public final void mo167144j(byte[] bArr, String str, boolean z, boolean z2) {
        String str2;
        Log.m165389i("MomentsPush", "onPushPostStatusChange");
        try {
            PushPostCreateStatusChangeLocalNotification decode = PushPostCreateStatusChangeLocalNotification.ADAPTER.decode(bArr);
            String str3 = decode.local_post_id;
            Post post = decode.success_server_post;
            Entities entities = decode.entities;
            Post.CreateStatus createStatus = decode.create_status;
            LarkError larkError = decode.error;
            if (larkError != null) {
                str2 = larkError.display_message;
            } else {
                str2 = null;
            }
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new ak(this, createStatus, str3, post, entities, str2));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: k */
    public final void mo167145k(byte[] bArr, String str, boolean z, boolean z2) {
        String str2;
        Log.m165389i("MomentsPush", "onPushCommentStatusChange");
        try {
            PushCommentCreateStatusChangeLocalNotification decode = PushCommentCreateStatusChangeLocalNotification.ADAPTER.decode(bArr);
            String str3 = decode.local_comment_id;
            Comment comment = decode.success_server_comment;
            Entities entities = decode.entities;
            Comment.CreateStatus createStatus = decode.create_status;
            LarkError larkError = decode.error;
            if (larkError != null) {
                str2 = larkError.display_message;
            } else {
                str2 = null;
            }
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC47565ae(this, str3, comment, entities, createStatus, str2));
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }

    /* renamed from: l */
    public final void mo167146l(byte[] bArr, String str, boolean z, boolean z2) {
        Log.m165389i("MomentsPush", "onPushEntityDeleted");
        try {
            PushEntityDeletedLocalNotification decode = PushEntityDeletedLocalNotification.ADAPTER.decode(bArr);
            String str2 = decode.entity_id;
            EntityType entityType = decode.entity_type;
            if (!TextUtils.isEmpty(str2) && entityType != EntityType.UNKNOWN) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new RunnableC47566af(this, str2, entityType));
            }
        } catch (Exception e) {
            Log.m165384e("MomentsPush", e.getMessage(), e);
        }
    }
}
