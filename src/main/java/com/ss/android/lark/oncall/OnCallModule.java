package com.ss.android.lark.oncall;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.HomeOnCallInfo;
import com.ss.android.lark.oncall.dependency.IOnCallModuleDependency;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.service.OnCallService;
import com.ss.android.lark.oncall.ui.LarkOnCallActivity;
import com.ss.android.lark.oncall.util.OnCallShowAvatarUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ$\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ4\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ.\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ8\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ@\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006#"}, d2 = {"Lcom/ss/android/lark/oncall/OnCallModule;", "", "dependency", "Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "(Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;)V", "getDependency", "()Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "getHomePageOnCall", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/biz/im/api/HomeOnCallInfo;", "getOnCallChatId", "userId", "", "oncallId", "longitude", "", "latitude", "extra", "faqId", "gotoOnCallActivity", "context", "Landroid/content/Context;", "appreciableKey", "showOnCallAvatarInImageView", "avatarKey", "entityId", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "Companion", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.oncall.a */
public final class OnCallModule {

    /* renamed from: a */
    public static volatile IOnCallModuleDependency f122433a;

    /* renamed from: b */
    public static final Companion f122434b = new Companion(null);

    /* renamed from: c */
    private final IOnCallModuleDependency f122435c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/oncall/OnCallModule$Companion;", "", "()V", "sDependency", "Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "getDependency", "setDependency", "", "dependency", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.oncall.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final IOnCallModuleDependency mo169922a() {
            return OnCallModule.f122433a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo169923a(IOnCallModuleDependency aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "dependency");
            OnCallModule.f122433a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/oncall/OnCallModule$getHomePageOnCall$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "oncallList", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.oncall.a$b */
    public static final class C48708b implements IGetDataCallback<List<? extends OnCall>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f122436a;

        C48708b(IGetDataCallback iGetDataCallback) {
            this.f122436a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f122436a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends OnCall> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (T t : list) {
                    arrayList.add(new HomeOnCallInfo(t.getId(), t.getAvatarKey(), t.getId(), t.getName(), t.getPhoneNumber(), t.isNeedReportLocation()));
                }
            }
            this.f122436a.onSuccess(arrayList);
        }
    }

    public OnCallModule(IOnCallModuleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f122435c = aVar;
        f122434b.mo169923a(aVar);
    }

    /* renamed from: a */
    public final void mo169917a(IGetDataCallback<List<HomeOnCallInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        OnCallService.f122440a.mo169960b(new C48708b(iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo169915a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LarkOnCallActivity.m191964a(context, str);
    }

    /* renamed from: a */
    public final void mo169919a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "oncallId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        OnCallService.f122440a.mo169956a(str, str2, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo169920a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "oncallId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        OnCallService.f122440a.mo169958a(str, str2, str3, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo169918a(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "oncallId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        OnCallService.f122440a.mo169957a(str, str2, f, f2, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo169921a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "oncallId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        OnCallService.f122440a.mo169959a(str, str2, str3, str4, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo169916a(Context context, String str, String str2, String str3, ImageView imageView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "oncallId");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        OnCallShowAvatarUtils.f122439a.mo169928a(context, str, str2, str3, imageView, i, i2);
    }
}
