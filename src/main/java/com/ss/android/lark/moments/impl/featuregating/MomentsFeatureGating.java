package com.ss.android.lark.moments.impl.featuregating;

import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.p2337b.p2338a.AbstractC47178j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/featuregating/MomentsFeatureGating;", "", "()V", "fgDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IFeatureGatingDependency;", "disableFollowFeature", "", "enableCategoryAuthOperation", "isMomentsBadgeNewPostEnable", "isNewProfileEnable", "isNewReactionEnabled", "isPublishBindCategory", "useRecommendOrder", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.d.a */
public final class MomentsFeatureGating {

    /* renamed from: a */
    public static final Companion f119490a = new Companion(null);

    /* renamed from: b */
    private final AbstractC47178j f119491b = MomentsDependencyHolder.f118998b.mo165899a().featureGatingDependency();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/featuregating/MomentsFeatureGating$Companion;", "", "()V", "FEATURE_KEY_CATEGORY_AUTH", "", "FEATURE_KEY_CATEGORY_RECOMMEND", "FEATURE_KEY_FOLLOW_DISABLE", "FEATURE_KEY_MOMENTS_BADGE_NEW_POST", "FEATURE_KEY_NEW_REACTION_VIEW", "FEATURE_KEY_PROFILE_NEW_STRUCTURE", "FEATURE_KEY_PUBLISH_BIND_CATEGORY", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo166489a() {
        return this.f119491b.mo144711b("moments.badge.new_post", false);
    }

    /* renamed from: b */
    public final boolean mo166490b() {
        return this.f119491b.mo144710a("messenger.profile.new_structure", false);
    }

    /* renamed from: c */
    public final boolean mo166491c() {
        return this.f119491b.mo144710a("lark.feed.reaction.optimize", false);
    }

    /* renamed from: d */
    public final boolean mo166492d() {
        return this.f119491b.mo144711b("moments.publish.bind_category", false);
    }

    /* renamed from: e */
    public final boolean mo166493e() {
        return this.f119491b.mo144710a("moments.category.recommend", false);
    }

    /* renamed from: f */
    public final boolean mo166494f() {
        return this.f119491b.mo144710a("moments.follow.disable", false);
    }

    /* renamed from: g */
    public final boolean mo166495g() {
        return this.f119491b.mo144710a("moments.category.auth", false);
    }
}
