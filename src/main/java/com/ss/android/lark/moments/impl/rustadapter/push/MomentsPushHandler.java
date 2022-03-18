package com.ss.android.lark.moments.impl.rustadapter.push;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0002\u0014\u001b\u0018\u00002\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler;", "", "listener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "(Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;)V", "mEntityDeletedListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushEntityDeletedListener;", "mPushBroadcastListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushBroadcastChangeListener;", "mPushCommentSetListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentSetChangeListener;", "mPushCommentStatusListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentStatusChangeListener;", "mPushDistributionListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushDistributionChangeListener;", "mPushMomentUserListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushMomentUserListener;", "mPushNewCommentUpdateListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewCommentUpdateListener;", "mPushNewPostUpdateListener", "com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushNewPostUpdateListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushNewPostUpdateListener$1;", "mPushPostEntityListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostEntityListener;", "mPushPostStatusListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostStatusChangeListener;", "mPushPreviewUpdatedListener", "com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushPreviewUpdatedListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushPreviewUpdatedListener$1;", "mPushReactionListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushReactionListener;", "mPushShareCountListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushShareCountChangeListener;", "mPushUserFollowListener", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushUserFollowChangeListener;", "registerPush", "", "unregisterPush", "IMomentsPushListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.a.c */
public final class MomentsPushHandler {

    /* renamed from: a */
    private final MomentsPush.IPushEntityDeletedListener f120099a;

    /* renamed from: b */
    private final MomentsPush.IPushUserFollowChangeListener f120100b;

    /* renamed from: c */
    private final MomentsPush.IPushMomentUserListener f120101c;

    /* renamed from: d */
    private final MomentsPush.IPushPostStatusChangeListener f120102d;

    /* renamed from: e */
    private final MomentsPush.IPushReactionListener f120103e;

    /* renamed from: f */
    private final MomentsPush.IPushCommentStatusChangeListener f120104f;

    /* renamed from: g */
    private final MomentsPush.IPushCommentSetChangeListener f120105g;

    /* renamed from: h */
    private final MomentsPush.IPushShareCountChangeListener f120106h;

    /* renamed from: i */
    private final MomentsPush.IPushDistributionChangeListener f120107i;

    /* renamed from: j */
    private final MomentsPush.IPushBroadcastChangeListener f120108j;

    /* renamed from: k */
    private final MomentsPush.IPushPostEntityListener f120109k;

    /* renamed from: l */
    private final C47602i f120110l;

    /* renamed from: m */
    private final MomentsPush.IPushNewCommentUpdateListener f120111m;

    /* renamed from: n */
    private final C47605l f120112n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J6\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J6\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010$2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020(2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010)\u001a\u00020\u00032 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+0\u001d\u0018\u00010\u001dH\u0016J0\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0007H\u0016¨\u00066"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$IMomentsPushListener;", "", "onPushBroadcastChanged", "", "postId", "", "isBroadcast", "", "onPushCommentSetChanged", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "onPushCommentStatusChanged", "localCommentId", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "onPushDistributionChanged", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "onPushEntityDeleted", "entityId", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "onPushMomentUser", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "onPushNewCommentUpdate", "commentId", "onPushNewPostUpdate", "onPushPostEntityChanged", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "onPushPostStatusChanged", "localPostId", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "onPushPreviewChanged", "updateMaps", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "onPushReaction", "id", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "onPushShareCountChanged", "shareCount", "", "onPushUserFollow", "userId", "isFollow", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$a */
    public interface IMomentsPushListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.g.a.c$a$a */
        public static final class C47594a {
            /* renamed from: a */
            public static void m188461a(IMomentsPushListener aVar, Post post, Entities entities) {
                Intrinsics.checkParameterIsNotNull(post, "post");
                Intrinsics.checkParameterIsNotNull(entities, "entities");
            }

            /* renamed from: a */
            public static void m188462a(IMomentsPushListener aVar, String str, int i) {
                Intrinsics.checkParameterIsNotNull(str, "postId");
            }

            /* renamed from: a */
            public static void m188463a(IMomentsPushListener aVar, String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "localCommentId");
                Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
            }

            /* renamed from: a */
            public static void m188464a(IMomentsPushListener aVar, String str, CommentSet commentSet) {
                Intrinsics.checkParameterIsNotNull(str, "postId");
            }

            /* renamed from: a */
            public static void m188465a(IMomentsPushListener aVar, String str, Entities entities) {
                Intrinsics.checkParameterIsNotNull(str, "postId");
            }

            /* renamed from: a */
            public static void m188466a(IMomentsPushListener aVar, String str, Post.PostDistributionType postDistributionType) {
                Intrinsics.checkParameterIsNotNull(str, "postId");
                Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
            }

            /* renamed from: a */
            public static void m188467a(IMomentsPushListener aVar, String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "localPostId");
                Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
            }

            /* renamed from: a */
            public static void m188468a(IMomentsPushListener aVar, String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
                Intrinsics.checkParameterIsNotNull(str, "id");
            }

            /* renamed from: a */
            public static void m188469a(IMomentsPushListener aVar, String str, boolean z) {
                Intrinsics.checkParameterIsNotNull(str, "userId");
            }

            /* renamed from: a */
            public static void m188470a(IMomentsPushListener aVar, Map<String, MomentUser> map) {
                Intrinsics.checkParameterIsNotNull(map, "userMap");
            }

            /* renamed from: b */
            public static void m188471b(IMomentsPushListener aVar, String str, Entities entities) {
                Intrinsics.checkParameterIsNotNull(str, "commentId");
            }

            /* renamed from: b */
            public static void m188472b(IMomentsPushListener aVar, String str, boolean z) {
                Intrinsics.checkParameterIsNotNull(str, "postId");
            }
        }

        void onPushBroadcastChanged(String str, boolean z);

        void onPushCommentSetChanged(String str, CommentSet commentSet);

        void onPushCommentStatusChanged(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2);

        void onPushDistributionChanged(String str, Post.PostDistributionType postDistributionType);

        void onPushEntityDeleted(String str, EntityType entityType);

        void onPushMomentUser(Map<String, MomentUser> map);

        void onPushNewCommentUpdate(String str, Entities entities);

        void onPushNewPostUpdate(String str, Entities entities);

        void onPushPostEntityChanged(Post post, Entities entities);

        void onPushPostStatusChanged(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2);

        void onPushPreviewChanged(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map);

        void onPushReaction(String str, ReactionSet reactionSet, Map<String, MomentUser> map);

        void onPushShareCountChanged(String str, int i);

        void onPushUserFollow(String str, boolean z);
    }

    /* renamed from: a */
    public final void mo167187a() {
        MomentsPush.f120015o.mo167147a().mo167113a(this.f120099a);
        MomentsPush.f120015o.mo167147a().mo167121a(this.f120100b);
        MomentsPush.f120015o.mo167147a().mo167114a(this.f120101c);
        MomentsPush.f120015o.mo167147a().mo167118a(this.f120102d);
        MomentsPush.f120015o.mo167147a().mo167119a(this.f120103e);
        MomentsPush.f120015o.mo167147a().mo167111a(this.f120104f);
        MomentsPush.f120015o.mo167147a().mo167110a(this.f120105g);
        MomentsPush.f120015o.mo167147a().mo167120a(this.f120106h);
        MomentsPush.f120015o.mo167147a().mo167112a(this.f120107i);
        MomentsPush.f120015o.mo167147a().mo167109a(this.f120108j);
        MomentsPush.f120015o.mo167147a().mo167117a(this.f120109k);
        MomentsPush.f120015o.mo167147a().mo167116a(this.f120110l);
        MomentsPush.f120015o.mo167147a().mo167115a(this.f120111m);
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144700a(this.f120112n);
    }

    /* renamed from: b */
    public final void mo167188b() {
        MomentsPush.f120015o.mo167147a().mo167127b(this.f120099a);
        MomentsPush.f120015o.mo167147a().mo167135b(this.f120100b);
        MomentsPush.f120015o.mo167147a().mo167128b(this.f120101c);
        MomentsPush.f120015o.mo167147a().mo167132b(this.f120102d);
        MomentsPush.f120015o.mo167147a().mo167133b(this.f120103e);
        MomentsPush.f120015o.mo167147a().mo167125b(this.f120104f);
        MomentsPush.f120015o.mo167147a().mo167124b(this.f120105g);
        MomentsPush.f120015o.mo167147a().mo167134b(this.f120106h);
        MomentsPush.f120015o.mo167147a().mo167126b(this.f120107i);
        MomentsPush.f120015o.mo167147a().mo167123b(this.f120108j);
        MomentsPush.f120015o.mo167147a().mo167131b(this.f120109k);
        MomentsPush.f120015o.mo167147a().mo167130b(this.f120110l);
        MomentsPush.f120015o.mo167147a().mo167129b(this.f120111m);
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144705b(this.f120112n);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mEntityDeletedListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushEntityDeletedListener;", "onPushEntityDeleted", "", "entityId", "", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$b */
    public static final class C47595b implements MomentsPush.IPushEntityDeletedListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120113a;

        C47595b(IMomentsPushListener aVar) {
            this.f120113a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushEntityDeletedListener
        /* renamed from: a */
        public void mo167166a(String str, EntityType entityType) {
            Intrinsics.checkParameterIsNotNull(str, "entityId");
            Intrinsics.checkParameterIsNotNull(entityType, "entityType");
            this.f120113a.onPushEntityDeleted(str, entityType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushBroadcastListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushBroadcastChangeListener;", "onPushBroadcastChange", "", "postId", "", "isBroadcast", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$c */
    public static final class C47596c implements MomentsPush.IPushBroadcastChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120114a;

        C47596c(IMomentsPushListener aVar) {
            this.f120114a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushBroadcastChangeListener
        /* renamed from: a */
        public void mo167162a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            this.f120114a.onPushBroadcastChanged(str, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushCommentSetListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentSetChangeListener;", "onPushCommentSetChange", "", "postId", "", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$d */
    public static final class C47597d implements MomentsPush.IPushCommentSetChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120115a;

        C47597d(IMomentsPushListener aVar) {
            this.f120115a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushCommentSetChangeListener
        /* renamed from: a */
        public void mo167163a(String str, CommentSet commentSet) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            this.f120115a.onPushCommentSetChanged(str, commentSet);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushCommentStatusListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushCommentStatusChangeListener;", "onPushCommentStatusChange", "", "localCommentId", "", "newComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "errorMessage", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$e */
    public static final class C47598e implements MomentsPush.IPushCommentStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120116a;

        C47598e(IMomentsPushListener aVar) {
            this.f120116a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushCommentStatusChangeListener
        /* renamed from: a */
        public void mo167164a(String str, Comment comment, Entities entities, Comment.CreateStatus createStatus, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "localCommentId");
            Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
            this.f120116a.onPushCommentStatusChanged(str, comment, entities, createStatus, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushDistributionListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushDistributionChangeListener;", "onPushDistributionChange", "", "postId", "", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$f */
    public static final class C47599f implements MomentsPush.IPushDistributionChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120117a;

        C47599f(IMomentsPushListener aVar) {
            this.f120117a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushDistributionChangeListener
        /* renamed from: a */
        public void mo167165a(String str, Post.PostDistributionType postDistributionType) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
            this.f120117a.onPushDistributionChanged(str, postDistributionType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushMomentUserListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushMomentUserListener;", "onPushMomentUser", "", "momentUser", "", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$g */
    public static final class C47600g implements MomentsPush.IPushMomentUserListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120118a;

        C47600g(IMomentsPushListener aVar) {
            this.f120118a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushMomentUserListener
        /* renamed from: a */
        public void mo167167a(Map<String, MomentUser> map) {
            Intrinsics.checkParameterIsNotNull(map, "momentUser");
            this.f120118a.onPushMomentUser(map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushNewCommentUpdateListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewCommentUpdateListener;", "onPushNewCommentUpdateListener", "", "commentId", "", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$h */
    public static final class C47601h implements MomentsPush.IPushNewCommentUpdateListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120119a;

        C47601h(IMomentsPushListener aVar) {
            this.f120119a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushNewCommentUpdateListener
        /* renamed from: a */
        public void mo167168a(String str, Entities entities) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
            this.f120119a.onPushNewCommentUpdate(str, entities);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushNewPostUpdateListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushNewPostUpdateListener;", "onPushNewPostUpdateListener", "", "postId", "", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$i */
    public static final class C47602i implements MomentsPush.IPushNewPostUpdateListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120120a;

        C47602i(IMomentsPushListener aVar) {
            this.f120120a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushNewPostUpdateListener
        /* renamed from: a */
        public void mo167169a(String str, Entities entities) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            this.f120120a.onPushNewPostUpdate(str, entities);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushPostEntityListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostEntityListener;", "onPushPostEntity", "", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$j */
    public static final class C47603j implements MomentsPush.IPushPostEntityListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120121a;

        C47603j(IMomentsPushListener aVar) {
            this.f120121a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushPostEntityListener
        /* renamed from: a */
        public void mo167170a(Post post, Entities entities) {
            Intrinsics.checkParameterIsNotNull(post, "post");
            Intrinsics.checkParameterIsNotNull(entities, "entities");
            this.f120121a.onPushPostEntityChanged(post, entities);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushPostStatusListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushPostStatusChangeListener;", "onPushPostStatusChange", "", "localPostId", "", "newPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "errorMessage", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$k */
    public static final class C47604k implements MomentsPush.IPushPostStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120122a;

        C47604k(IMomentsPushListener aVar) {
            this.f120122a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushPostStatusChangeListener
        /* renamed from: a */
        public void mo167171a(String str, Post post, Entities entities, Post.CreateStatus createStatus, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "localPostId");
            Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
            this.f120122a.onPushPostStatusChanged(str, post, entities, createStatus, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushPreviewUpdatedListener$1", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency$PreviewCacheObserver;", "onCacheChanged", "", "updateMaps", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$l */
    public static final class C47605l implements IChatModuleDependency.PreviewCacheObserver {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120123a;

        C47605l(IMomentsPushListener aVar) {
            this.f120123a = aVar;
        }

        @Override // com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency.PreviewCacheObserver
        /* renamed from: a */
        public void mo165894a(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
            this.f120123a.onPushPreviewChanged(map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushReactionListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushReactionListener;", "onPushReaction", "", "id", "", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$m */
    public static final class C47606m implements MomentsPush.IPushReactionListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120124a;

        C47606m(IMomentsPushListener aVar) {
            this.f120124a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushReactionListener
        /* renamed from: a */
        public void mo167172a(String str, ReactionSet reactionSet, Map<String, MomentUser> map) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            this.f120124a.onPushReaction(str, reactionSet, map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushShareCountListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushShareCountChangeListener;", "onPushShareCountChange", "", "postId", "", "shareCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$n */
    public static final class C47607n implements MomentsPush.IPushShareCountChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120125a;

        C47607n(IMomentsPushListener aVar) {
            this.f120125a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushShareCountChangeListener
        /* renamed from: a */
        public void mo167173a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            this.f120125a.onPushShareCountChanged(str, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/rustadapter/push/MomentsPushHandler$mPushUserFollowListener$1", "Lcom/ss/android/lark/moments/impl/rustadapter/push/MomentsPush$IPushUserFollowChangeListener;", "onPushUserFollow", "", "userId", "", "isFollow", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.a.c$o */
    public static final class C47608o implements MomentsPush.IPushUserFollowChangeListener {

        /* renamed from: a */
        final /* synthetic */ IMomentsPushListener f120126a;

        C47608o(IMomentsPushListener aVar) {
            this.f120126a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.rustadapter.push.MomentsPush.IPushUserFollowChangeListener
        /* renamed from: a */
        public void mo167174a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            this.f120126a.onPushUserFollow(str, z);
        }
    }

    public MomentsPushHandler(IMomentsPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120099a = new C47595b(aVar);
        this.f120100b = new C47608o(aVar);
        this.f120101c = new C47600g(aVar);
        this.f120102d = new C47604k(aVar);
        this.f120103e = new C47606m(aVar);
        this.f120104f = new C47598e(aVar);
        this.f120105g = new C47597d(aVar);
        this.f120106h = new C47607n(aVar);
        this.f120107i = new C47599f(aVar);
        this.f120108j = new C47596c(aVar);
        this.f120109k = new C47603j(aVar);
        this.f120110l = new C47602i(aVar);
        this.f120111m = new C47601h(aVar);
        this.f120112n = new C47605l(aVar);
    }
}
