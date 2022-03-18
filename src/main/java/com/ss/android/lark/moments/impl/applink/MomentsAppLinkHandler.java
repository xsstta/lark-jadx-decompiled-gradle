package com.ss.android.lark.moments.impl.applink;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.personal.MomentsProfileActivity;
import com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J=\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015H\u0001J)\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\tH\u0001¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/moments/impl/applink/MomentsAppLinkHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "Lcom/ss/android/lark/moments/impl/privatechat/IMomentsSecretChatHandler;", "()V", "acceptSecretChat", "", "context", "Landroid/content/Context;", "token", "", "canOpen", "", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "needHandleLinkByIPC", "observeRequestResult", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onInputDialogShowListener", "Lkotlin/Function0;", "onInputDialogDismissListener", "requestSecretChat", "postId", "commentId", "anonymousName", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.b.b */
public final class MomentsAppLinkHandler extends AbstractC29186b implements IMomentsSecretChatHandler {

    /* renamed from: a */
    public static final Companion f119005a = new Companion(null);

    /* renamed from: b */
    private final /* synthetic */ MomentsSecretChatHandler f119006b = new MomentsSecretChatHandler();

    /* renamed from: a */
    public void mo165906a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f119006b.mo166878a(context, str);
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void observeRequestResult(LifecycleOwner lifecycleOwner, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f119006b.observeRequestResult(lifecycleOwner, context, function0, function02);
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void requestSecretChat(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
        this.f119006b.requestSecretChat(str, str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/applink/MomentsAppLinkHandler$Companion;", "", "()V", "LOG_TAG", "", "getMomentsAppLinkHandlerMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "Lkotlin/collections/HashMap;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final HashMap<String, AbstractC29186b> mo165909a() {
            MomentsAppLinkHandler bVar = new MomentsAppLinkHandler();
            HashMap<String, AbstractC29186b> hashMap = new HashMap<>();
            hashMap.put("/client/moments/detail", bVar);
            hashMap.put("/client/moments/user", bVar);
            hashMap.put("/client/moments/home", bVar);
            hashMap.put("/client/moments/category", bVar);
            hashMap.put("/client/moments/hashtag", bVar);
            hashMap.put("/client/moments/anonymousChat", bVar);
            return hashMap;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        String a;
        String queryParameter;
        Log.m165389i("MomentsAppLinkHandler", "handle context=" + context + " applink=" + appLink);
        if (!(context == null || appLink == null || (a = appLink.mo103435a()) == null)) {
            Uri parse = Uri.parse(a);
            String str = a;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/detail", false, 2, (Object) null)) {
                String queryParameter2 = parse.getQueryParameter("postId");
                if (queryParameter2 == null) {
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter2, "uri.getQueryParameter(PA…_POST_ID) ?: return false");
                String queryParameter3 = parse.getQueryParameter("commentId");
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter3, "uri.getQueryParameter(PARAMS_COMMENT_ID) ?: \"\"");
                String queryParameter4 = parse.getQueryParameter(ShareHitPoint.f121868c);
                if (queryParameter4 == null) {
                    queryParameter4 = "share_chat";
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter4, "uri.getQueryParameter(PA…f.Value.SOURCE_SHARE_CHAT");
                MomentsDetailLauncher.m187945a(MomentsDetailLauncher.f119660a, context, queryParameter2, false, queryParameter3, queryParameter4, true, false, 68, (Object) null);
                return true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/user", false, 2, (Object) null)) {
                String queryParameter5 = parse.getQueryParameter("userId");
                if (queryParameter5 == null) {
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter5, "uri.getQueryParameter(PA…_USER_ID) ?: return false");
                MomentsHitPoint.f119720a.mo166850g("lark_profile");
                MomentsProfileActivity.Companion.m188998a(MomentsProfileActivity.f120464g, queryParameter5, context, null, 4, null);
                return true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/home", false, 2, (Object) null)) {
                if (!MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments")) {
                    Log.m165383e("MomentsAppLinkHandler", "moments tab disable");
                    return false;
                }
                IMainModuleDependency mainDependency = MomentsDependencyHolder.f118998b.mo165899a().mainDependency();
                Bundle bundle = new Bundle();
                bundle.putString("arguments_key_from", "from_app_link");
                bundle.putBoolean("arguments_key_need_refresh", Intrinsics.areEqual(parse.getQueryParameter("action"), "refresh"));
                mainDependency.mo144717a(context, "moments", bundle);
                return true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/category", false, 2, (Object) null)) {
                String queryParameter6 = parse.getQueryParameter("categoryId");
                if (queryParameter6 == null) {
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter6, "uri.getQueryParameter(PA…EGORY_ID) ?: return false");
                MomentsCategoryDetailActivity.Companion.m187067a(MomentsCategoryDetailActivity.f119067d, context, queryParameter6, null, null, 12, null);
                return true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/hashtag", false, 2, (Object) null)) {
                String queryParameter7 = parse.getQueryParameter("hashtagId");
                if (queryParameter7 == null) {
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter7, "uri.getQueryParameter(PA…SHTAG_ID) ?: return false");
                MomentsHashTagFeedActivity.Companion.m188636a(MomentsHashTagFeedActivity.f120187c, context, queryParameter7, null, 4, null);
                return true;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "/client/moments/anonymousChat", false, 2, (Object) null) && (queryParameter = parse.getQueryParameter("token")) != null) {
                Intrinsics.checkExpressionValueIsNotNull(queryParameter, "uri.getQueryParameter(PA…MS_TOKEN) ?: return false");
                mo165906a(context, queryParameter);
                return true;
            }
        }
        return false;
    }
}
