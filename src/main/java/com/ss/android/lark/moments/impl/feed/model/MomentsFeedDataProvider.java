package com.ss.android.lark.moments.impl.feed.model;

import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionList;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0004!\"#$B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002J(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002JD\u0010\u0012\u001a6\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u000b0\u0013j\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u000b`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J8\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\fJ\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider;", "", "()V", "mDataProvider", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$IDataProvider;", "Lkotlin/collections/ArrayList;", "bindDataProvider", "", "provider", "cloneCommentMap", "", "", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "commentMap", "cloneUserMap", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "userMap", "collectPreviewMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "Lkotlin/collections/HashMap;", "postVM", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "collectRelateUsers", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "getInitData", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$MomentDetailInitData;", "postId", "getPostById", "getRelateUserMap", "unbind", "Companion", "Helper", "IDataProvider", "MomentDetailInitData", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b */
public final class MomentsFeedDataProvider {

    /* renamed from: a */
    public static final Companion f119940a = new Companion(null);

    /* renamed from: b */
    private ArrayList<IDataProvider> f119941b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$IDataProvider;", "", "getPostById", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "postId", "", "getRelateUserMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.b$c */
    public interface IDataProvider {
        IMomentsPost getPostById(String str);

        Map<String, MomentUser> getRelateUserMap();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$Companion;", "", "()V", "getInstance", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final MomentsFeedDataProvider mo167033a() {
            return Helper.f119942a.mo167034a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$Helper;", "", "()V", "instance", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider;", "getInstance", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.b$b */
    public static final class Helper {

        /* renamed from: a */
        public static final Helper f119942a = new Helper();

        /* renamed from: b */
        private static final MomentsFeedDataProvider f119943b = new MomentsFeedDataProvider();

        private Helper() {
        }

        /* renamed from: a */
        public final MomentsFeedDataProvider mo167034a() {
            return f119943b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J#\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005\u0018\u00010\u0005HÆ\u0003Jo\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\"\b\u0002\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedDataProvider$MomentDetailInitData;", "", "post", "Lcom/bytedance/lark/pb/moments/v1/Post;", "userMap", "", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "commentMap", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "previews", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "(Lcom/bytedance/lark/pb/moments/v1/Post;Ljava/util/Map;Ljava/util/Map;Lcom/bytedance/lark/pb/moments/v1/Category;Ljava/util/Map;)V", "getCategory", "()Lcom/bytedance/lark/pb/moments/v1/Category;", "getCommentMap", "()Ljava/util/Map;", "getPost", "()Lcom/bytedance/lark/pb/moments/v1/Post;", "getPreviews", "getUserMap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.model.b$d */
    public static final class MomentDetailInitData {

        /* renamed from: a */
        private final Post f119944a;

        /* renamed from: b */
        private final Map<String, MomentUser> f119945b;

        /* renamed from: c */
        private final Map<String, Comment> f119946c;

        /* renamed from: d */
        private final Category f119947d;

        /* renamed from: e */
        private final Map<String, Map<String, PreviewHangPoint>> f119948e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MomentDetailInitData)) {
                return false;
            }
            MomentDetailInitData dVar = (MomentDetailInitData) obj;
            return Intrinsics.areEqual(this.f119944a, dVar.f119944a) && Intrinsics.areEqual(this.f119945b, dVar.f119945b) && Intrinsics.areEqual(this.f119946c, dVar.f119946c) && Intrinsics.areEqual(this.f119947d, dVar.f119947d) && Intrinsics.areEqual(this.f119948e, dVar.f119948e);
        }

        public int hashCode() {
            Post post = this.f119944a;
            int i = 0;
            int hashCode = (post != null ? post.hashCode() : 0) * 31;
            Map<String, MomentUser> map = this.f119945b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, Comment> map2 = this.f119946c;
            int hashCode3 = (hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
            Category category = this.f119947d;
            int hashCode4 = (hashCode3 + (category != null ? category.hashCode() : 0)) * 31;
            Map<String, Map<String, PreviewHangPoint>> map3 = this.f119948e;
            if (map3 != null) {
                i = map3.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "MomentDetailInitData(post=" + this.f119944a + ", userMap=" + this.f119945b + ", commentMap=" + this.f119946c + ", category=" + this.f119947d + ", previews=" + this.f119948e + ")";
        }

        /* renamed from: a */
        public final Post mo167037a() {
            return this.f119944a;
        }

        /* renamed from: b */
        public final Map<String, MomentUser> mo167038b() {
            return this.f119945b;
        }

        /* renamed from: c */
        public final Map<String, Comment> mo167039c() {
            return this.f119946c;
        }

        /* renamed from: d */
        public final Category mo167040d() {
            return this.f119947d;
        }

        /* renamed from: e */
        public final Map<String, Map<String, PreviewHangPoint>> mo167041e() {
            return this.f119948e;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.ss.android.lark.chat.entity.preview.PreviewHangPoint>> */
        /* JADX WARN: Multi-variable type inference failed */
        public MomentDetailInitData(Post post, Map<String, MomentUser> map, Map<String, Comment> map2, Category category, Map<String, ? extends Map<String, PreviewHangPoint>> map3) {
            Intrinsics.checkParameterIsNotNull(post, "post");
            Intrinsics.checkParameterIsNotNull(map, "userMap");
            Intrinsics.checkParameterIsNotNull(map2, "commentMap");
            this.f119944a = post;
            this.f119945b = map;
            this.f119946c = map2;
            this.f119947d = category;
            this.f119948e = map3;
        }
    }

    /* renamed from: a */
    private final Map<String, MomentUser> m188339a() {
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.f119941b.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().getRelateUserMap());
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo167030a(IDataProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "provider");
        this.f119941b.add(cVar);
    }

    /* renamed from: b */
    public final void mo167032b(IDataProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "provider");
        this.f119941b.remove(cVar);
    }

    /* renamed from: a */
    private final HashMap<String, Map<String, PreviewHangPoint>> m188338a(IMomentsPost bVar) {
        HashMap<String, Map<String, PreviewHangPoint>> hashMap = new HashMap<>();
        Map<String, PreviewHangPoint> K = bVar.mo166426K();
        if (K != null) {
            hashMap.put(bVar.mo166379a(), K);
        }
        List<IMomentsComment> I = bVar.mo166424I();
        if (I != null) {
            for (T t : I) {
                Map<String, PreviewHangPoint> A = t.mo166372A();
                if (A != null) {
                    hashMap.put(t.mo166379a(), A);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private final Map<String, MomentUser> m188342b(Map<String, MomentUser> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, MomentUser> entry : map.entrySet()) {
            String key = entry.getKey();
            MomentUser a = entry.getValue().newBuilder().build();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.value.newBuilder().build()");
            hashMap.put(key, a);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final IMomentsPost mo167031b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Iterator<T> it = this.f119941b.iterator();
        while (it.hasNext()) {
            IMomentsPost postById = it.next().getPostById(str);
            if (postById != null) {
                return postById;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final Map<String, Comment> m188341a(Map<String, Comment> map) {
        ReactionSet reactionSet;
        ReactionSet.C18530a newBuilder;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Comment> entry : map.entrySet()) {
            HashMap hashMap2 = hashMap;
            String key = entry.getKey();
            Comment.C18338a newBuilder2 = entry.getValue().newBuilder();
            ReactionSet reactionSet2 = entry.getValue().reaction_set;
            if (reactionSet2 == null || (newBuilder = reactionSet2.newBuilder()) == null) {
                reactionSet = null;
            } else {
                reactionSet = newBuilder.build();
            }
            Comment a = newBuilder2.mo63458a(reactionSet).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.value.newBuilder().re…ilder()?.build()).build()");
            hashMap2.put(key, a);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final MomentDetailInitData mo167029a(String str) {
        IMomentsPost b;
        ReactionSet.C18530a newBuilder;
        Intrinsics.checkParameterIsNotNull(str, "postId");
        ReactionSet reactionSet = null;
        if (this.f119941b.isEmpty() || (b = mo167031b(str)) == null) {
            return null;
        }
        Map<String, MomentUser> a = m188339a();
        HashMap hashMap = new HashMap();
        List<IMomentsComment> I = b.mo166424I();
        if (I != null) {
            for (T t : I) {
                HashMap hashMap2 = hashMap;
                hashMap2.put(t.mo166379a(), t.mo166412w());
                Comment D = t.mo166375D();
                if (D != null) {
                    String str2 = D.id;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.id");
                    hashMap2.put(str2, D);
                }
            }
        }
        Post F = b.mo166421F();
        Map<String, MomentUser> a2 = m188340a(F, b, a);
        HashMap<String, Map<String, PreviewHangPoint>> a3 = m188338a(b);
        Post.C18496a newBuilder2 = F.newBuilder();
        ReactionSet reactionSet2 = F.reaction_set;
        if (!(reactionSet2 == null || (newBuilder = reactionSet2.newBuilder()) == null)) {
            reactionSet = newBuilder.build();
        }
        Post a4 = newBuilder2.mo63860a(reactionSet).build();
        Intrinsics.checkExpressionValueIsNotNull(a4, "post.newBuilder().reacti…ilder()?.build()).build()");
        return new MomentDetailInitData(a4, m188342b(a2), m188341a(hashMap), b.mo166427L(), a3);
    }

    /* renamed from: a */
    private final Map<String, MomentUser> m188340a(Post post, IMomentsPost bVar, Map<String, MomentUser> map) {
        String c;
        HashSet hashSet = new HashSet();
        hashSet.add(post.user_id);
        ReactionSet reactionSet = post.reaction_set;
        if (reactionSet != null) {
            List<ReactionList> list = reactionSet.reactions;
            Intrinsics.checkExpressionValueIsNotNull(list, "it.reactions");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().first_page_user_ids);
            }
        }
        List<IMomentsComment> I = bVar.mo166424I();
        if (I != null) {
            for (T t : I) {
                IMomentsUser y = t.mo166414y();
                if (!(y == null || (c = y.mo166364c()) == null)) {
                    hashSet.add(c);
                }
                Iterator<T> it2 = t.mo166415z().iterator();
                while (it2.hasNext()) {
                    List<DetailUserInfo> userInfoList = it2.next().getUserInfoList();
                    Intrinsics.checkExpressionValueIsNotNull(userInfoList, "reactionDetailVM.userInfoList");
                    for (T t2 : userInfoList) {
                        Intrinsics.checkExpressionValueIsNotNull(t2, "userInfo");
                        hashSet.add(t2.getUserId());
                    }
                }
                MomentUser C = t.mo166374C();
                if (C != null) {
                    hashSet.add(C.user_id);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MomentUser> entry : map.entrySet()) {
            if (hashSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
