package com.ss.android.lark.moments.impl.applink;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/moments/impl/applink/AppLinkUtils;", "", "()V", "AND", "", "APP_LINK_MOMENTS_CATEGORY", "APP_LINK_MOMENTS_DETAIL", "APP_LINK_MOMENTS_HASHTAG", "APP_LINK_MOMENTS_HOME", "APP_LINK_MOMENTS_SECRET_CHAT", "APP_LINK_MOMENTS_USER", "APP_LINK_PREFIX", "PARAMS_ACTION", "PARAMS_CATEGORY_ID", "PARAMS_COMMENT_ID", "PARAMS_HASHTAG_ID", "PARAMS_POST_ID", "PARAMS_SOURCE", "PARAMS_TOKEN", "PARAMS_USER_ID", "QUEST", "VALUE_COPY", "VALUE_REFRESH", "VALUE_SHARE", "getCategoryAppLink", "categoryId", "getHashtagAppLink", "hashtagId", "getPostDetailAppLink", "postId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.b.a */
public final class AppLinkUtils {

    /* renamed from: a */
    public static final AppLinkUtils f119003a = new AppLinkUtils();

    /* renamed from: b */
    private static final String f119004b = ("https://applink." + MomentsDependencyHolder.f118998b.mo165899a().dynamicDependency().mo144709a());

    private AppLinkUtils() {
    }

    /* renamed from: a */
    public final String mo165904a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        StringBuilder sb = new StringBuilder();
        sb.append(f119004b);
        sb.append("/client/moments/detail");
        sb.append("?");
        sb.append("postId=" + str);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("source=copy");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply {\n…PY\")\n        }.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String mo165905b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hashtagId");
        StringBuilder sb = new StringBuilder();
        sb.append(f119004b);
        sb.append("/client/moments/hashtag");
        sb.append("?");
        sb.append("hashtagId=" + str);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("source=copy");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply {\n…PY\")\n        }.toString()");
        return sb2;
    }
}
