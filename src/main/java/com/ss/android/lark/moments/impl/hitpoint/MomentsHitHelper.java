package com.ss.android.lark.moments.impl.hitpoint;

import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitHelper;", "", "()V", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.e.b */
public final class MomentsHitHelper {

    /* renamed from: a */
    public static String f119702a;

    /* renamed from: b */
    public static String f119703b = "lark_tab";

    /* renamed from: c */
    public static String f119704c = "feed_page";

    /* renamed from: d */
    public static String f119705d = "btn";

    /* renamed from: e */
    public static String f119706e = "post";

    /* renamed from: f */
    public static String f119707f = "input_box";

    /* renamed from: g */
    public static String f119708g = "detail_page";

    /* renamed from: h */
    public static HashSet<String> f119709h = new HashSet<>();

    /* renamed from: i */
    public static HashSet<String> f119710i = new HashSet<>();

    /* renamed from: j */
    public static String f119711j = "interaction";

    /* renamed from: k */
    public static String f119712k = "none";

    /* renamed from: l */
    public static int f119713l;

    /* renamed from: m */
    public static String f119714m = "none";

    /* renamed from: n */
    public static String f119715n = "none";

    /* renamed from: o */
    public static String f119716o = "none";

    /* renamed from: p */
    public static String f119717p;

    /* renamed from: q */
    public static Boolean f119718q;

    /* renamed from: r */
    public static final Companion f119719r = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040F2\b\u0010G\u001a\u0004\u0018\u00010HJ.\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QJ(\u0010!\u001a\u00020\u00042\u0006\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020-2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J.\u0010R\u001a\u00020-2\u0006\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QJ\u0006\u0010S\u001a\u00020JJ\b\u0010T\u001a\u00020JH\u0007J\u0006\u0010U\u001a\u00020JJ\u0014\u0010V\u001a\u00020J2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0XJ\u0010\u0010Z\u001a\u00020J2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u000e\u0010[\u001a\u00020J2\u0006\u0010?\u001a\u00020\u0004J\u0016\u0010\\\u001a\u00020J2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004J\u0018\u0010^\u001a\u00020J2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007J\u001c\u0010_\u001a\u00020J2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010FR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0017j\b\u0012\u0004\u0012\u00020\u0004`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0017j\b\u0012\u0004\u0012\u00020\u0004`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001a\u00109\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001a\u0010<\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001a\u0010?\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001a\u0010B\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\t¨\u0006a"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsHitHelper$Companion;", "", "()V", "MOMENTS_CIRCLE_ID", "", "action", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "circleId", "getCircleId", "setCircleId", "currentPage", "getCurrentPage", "setCurrentPage", "detailCategoryId", "getDetailCategoryId", "setDetailCategoryId", "detailPageId", "getDetailPageId", "setDetailPageId", "feedPostSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getFeedPostSet", "()Ljava/util/HashSet;", "setFeedPostSet", "(Ljava/util/HashSet;)V", "notificationPage", "getNotificationPage", "setNotificationPage", "pageDetail", "getPageDetail", "setPageDetail", "pageId", "getPageId", "setPageId", "pageType", "", "getPageType", "()I", "setPageType", "(I)V", "profileCurrentUserFollowed", "", "getProfileCurrentUserFollowed", "()Ljava/lang/Boolean;", "setProfileCurrentUserFollowed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "profilePostSet", "getProfilePostSet", "setProfilePostSet", "profileUserId", "getProfileUserId", "setProfileUserId", "reactionAction", "getReactionAction", "setReactionAction", "reactionType", "getReactionType", "setReactionType", ShareHitPoint.f121868c, "getSource", "setSource", "tabSource", "getTabSource", "setTabSource", "calculateDetailHitPointId", "Lkotlin/Pair;", "postVM", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsPostVM;", "calculateFeedHitPointParam", "", "isHashTag", "isMainTab", "pageEntityId", "hashTagOrder", "Lcom/bytedance/lark/pb/moments/v1/ListHashtagPostsRequest$HashtagPostOrder;", "feedOrder", "Lcom/bytedance/lark/pb/moments/v1/FeedOrder;", "isCurrentPage", "resetProfileHitPointParam", "resetReplyActionSource", "resetTabSource", "sendFeedCardView", "dataList", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "setGlobalCircleId", "setPageSource", "setReactionActionAndType", ShareHitPoint.f121869d, "setReplyActionSource", "updateDetailHitPointId", "idPair", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo166789a() {
            return MomentsHitHelper.f119702a;
        }

        /* renamed from: b */
        public final String mo166798b() {
            return MomentsHitHelper.f119703b;
        }

        /* renamed from: c */
        public final String mo166802c() {
            return MomentsHitHelper.f119704c;
        }

        /* renamed from: d */
        public final String mo166804d() {
            return MomentsHitHelper.f119705d;
        }

        /* renamed from: e */
        public final String mo166806e() {
            return MomentsHitHelper.f119706e;
        }

        /* renamed from: f */
        public final String mo166808f() {
            return MomentsHitHelper.f119707f;
        }

        /* renamed from: g */
        public final String mo166810g() {
            return MomentsHitHelper.f119708g;
        }

        /* renamed from: h */
        public final HashSet<String> mo166812h() {
            return MomentsHitHelper.f119709h;
        }

        /* renamed from: i */
        public final HashSet<String> mo166814i() {
            return MomentsHitHelper.f119710i;
        }

        /* renamed from: j */
        public final String mo166816j() {
            return MomentsHitHelper.f119711j;
        }

        /* renamed from: m */
        public final String mo166822m() {
            return MomentsHitHelper.f119712k;
        }

        /* renamed from: n */
        public final int mo166824n() {
            return MomentsHitHelper.f119713l;
        }

        /* renamed from: o */
        public final String mo166826o() {
            return MomentsHitHelper.f119714m;
        }

        /* renamed from: p */
        public final String mo166828p() {
            return MomentsHitHelper.f119715n;
        }

        /* renamed from: q */
        public final String mo166829q() {
            return MomentsHitHelper.f119716o;
        }

        /* renamed from: r */
        public final String mo166830r() {
            return MomentsHitHelper.f119717p;
        }

        /* renamed from: s */
        public final Boolean mo166831s() {
            return MomentsHitHelper.f119718q;
        }

        /* renamed from: k */
        public final void mo166818k() {
            mo166799b("lark_tab");
        }

        @JvmStatic
        /* renamed from: l */
        public final void mo166820l() {
            Companion aVar = this;
            aVar.mo166809f("input_box");
            aVar.mo166811g("detail_page");
        }

        /* renamed from: t */
        public final void mo166832t() {
            Companion aVar = this;
            aVar.mo166827o(null);
            aVar.mo166792a((Boolean) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo166791a(int i) {
            MomentsHitHelper.f119713l = i;
        }

        /* renamed from: b */
        public final void mo166799b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119703b = str;
        }

        /* renamed from: c */
        public final void mo166803c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119704c = str;
        }

        /* renamed from: d */
        public final void mo166805d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119705d = str;
        }

        /* renamed from: e */
        public final void mo166807e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119706e = str;
        }

        /* renamed from: f */
        public final void mo166809f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119707f = str;
        }

        /* renamed from: g */
        public final void mo166811g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119708g = str;
        }

        /* renamed from: h */
        public final void mo166813h(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119711j = str;
        }

        /* renamed from: k */
        public final void mo166819k(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119712k = str;
        }

        /* renamed from: l */
        public final void mo166821l(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119714m = str;
        }

        /* renamed from: m */
        public final void mo166823m(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119715n = str;
        }

        /* renamed from: n */
        public final void mo166825n(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119716o = str;
        }

        /* renamed from: o */
        public final void mo166827o(String str) {
            MomentsHitHelper.f119717p = str;
        }

        /* renamed from: a */
        public final void mo166792a(Boolean bool) {
            MomentsHitHelper.f119718q = bool;
        }

        /* renamed from: i */
        public final void mo166815i(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            mo166803c(str);
        }

        /* renamed from: a */
        public final void mo166793a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MomentsHitHelper.f119702a = str;
        }

        /* renamed from: j */
        public final void mo166817j(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo166793a(str);
                C57744a.m224104a().putString("moments_circle_id", str);
            }
        }

        /* renamed from: a */
        public final Pair<String, String> mo166790a(MomentsPostVM fVar) {
            String str;
            boolean z;
            List<String> list;
            RichText richText;
            Map<String, RichTextElement> map;
            RichTextElement richTextElement;
            RichTextElement.PropertySet propertySet;
            RichTextElement.MentionProperty mentionProperty;
            RichTextElement.MentionItem mentionItem;
            Post.PostContent b;
            RichText richText2;
            Category L;
            String str2 = null;
            if (fVar == null || (L = fVar.mo166427L()) == null) {
                str = null;
            } else {
                str = L.category_id;
            }
            String str3 = str;
            boolean z2 = false;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Companion aVar = this;
                aVar.mo166823m(str);
                aVar.mo166825n(str);
                return new Pair<>(str, str);
            }
            Companion aVar2 = this;
            aVar2.mo166823m("none");
            if (fVar == null || (b = fVar.mo166438b()) == null || (richText2 = b.content) == null) {
                list = null;
            } else {
                list = richText2.mention_ids;
            }
            if (list != null && list.size() == 1) {
                Post.PostContent b2 = fVar.mo166438b();
                if (!(b2 == null || (richText = b2.content) == null || (map = richText.elements) == null || (richTextElement = map.get(list.get(0))) == null || (propertySet = richTextElement.property) == null || (mentionProperty = propertySet.mention) == null || (mentionItem = mentionProperty.item) == null)) {
                    str2 = mentionItem.id;
                }
                String str4 = str2;
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    aVar2.mo166825n(str2);
                    return new Pair<>("none", str2);
                }
            }
            aVar2.mo166825n("none");
            return new Pair<>("none", "none");
        }

        /* renamed from: a */
        public final void mo166795a(List<? extends IMomentsItemBase> list) {
            HashSet<String> hashSet;
            Intrinsics.checkParameterIsNotNull(list, "dataList");
            Companion aVar = this;
            if (Intrinsics.areEqual(aVar.mo166802c(), "community_profile")) {
                hashSet = aVar.mo166814i();
            } else {
                hashSet = aVar.mo166812h();
            }
            for (T t : list) {
                if ((t instanceof MomentsPostVM) && !hashSet.contains(t.mo166379a())) {
                    MomentsHitPoint.f119720a.mo166836a(t.mo166379a(), MomentsHitHelper.f119719r.mo166802c());
                    hashSet.add(t.mo166379a());
                }
            }
        }

        /* renamed from: a */
        public final void mo166796a(Pair<String, String> pair) {
            if (pair != null) {
                Companion aVar = this;
                aVar.mo166823m(pair.getFirst());
                aVar.mo166825n(pair.getSecond());
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo166800b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            MomentsHitHelper.f119719r.mo166809f(str);
            MomentsHitHelper.f119719r.mo166811g(str2);
        }

        /* renamed from: a */
        public final void mo166794a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "action");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            Companion aVar = this;
            aVar.mo166805d(str);
            aVar.mo166807e(str2);
        }

        /* renamed from: a */
        private final String m188042a(boolean z, boolean z2, ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder, FeedOrder feedOrder) {
            if (z && hashtagPostOrder == ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                return "hashtag_hot";
            }
            if (z && hashtagPostOrder == ListHashtagPostsRequest.HashtagPostOrder.CREATE_TIME_DESC) {
                return "hashtag_new";
            }
            if (z && hashtagPostOrder == ListHashtagPostsRequest.HashtagPostOrder.RECOMMEND) {
                return "hashtag_recommend";
            }
            if (!z2 && feedOrder == FeedOrder.LAST_REPLIED) {
                return "category_comment";
            }
            if (!z2 && feedOrder == FeedOrder.LAST_PUBLISH) {
                return "category_post";
            }
            if (z2 || feedOrder != FeedOrder.RECOMMEND) {
                return "none";
            }
            return "category_recommend";
        }

        /* renamed from: b */
        public final boolean mo166801b(boolean z, boolean z2, String str, ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder, FeedOrder feedOrder) {
            Intrinsics.checkParameterIsNotNull(str, "pageEntityId");
            Intrinsics.checkParameterIsNotNull(hashtagPostOrder, "hashTagOrder");
            Intrinsics.checkParameterIsNotNull(feedOrder, "feedOrder");
            Companion aVar = this;
            if (!Intrinsics.areEqual(aVar.mo166822m(), str) || !Intrinsics.areEqual(aVar.mo166826o(), aVar.m188042a(z, z2, hashtagPostOrder, feedOrder))) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo166797a(boolean z, boolean z2, String str, ListHashtagPostsRequest.HashtagPostOrder hashtagPostOrder, FeedOrder feedOrder) {
            int i;
            Intrinsics.checkParameterIsNotNull(str, "pageEntityId");
            Intrinsics.checkParameterIsNotNull(hashtagPostOrder, "hashTagOrder");
            Intrinsics.checkParameterIsNotNull(feedOrder, "feedOrder");
            Companion aVar = this;
            aVar.mo166819k(str);
            if (z) {
                i = 5;
            } else if (Intrinsics.areEqual(str, String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.ordinal()))) {
                i = 1;
            } else if (Intrinsics.areEqual(str, String.valueOf(Tab.FeedTabId.FEED_FOLLOWING.ordinal()))) {
                i = 2;
            } else {
                i = 3;
            }
            aVar.mo166791a(i);
            aVar.mo166821l(aVar.m188042a(z, z2, hashtagPostOrder, feedOrder));
        }
    }

    static {
        String string = C57744a.m224104a().getString("moments_circle_id", "none");
        if (string == null) {
            string = "none";
        }
        f119702a = string;
    }
}
