package com.ss.android.lark.integrator.im.oncall;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import com.ss.android.lark.integrator.im.dependency.AbstractC39573p;
import com.ss.android.lark.integrator.im.dependency.AbstractC39579v;
import com.ss.android.lark.oncall.OnCallModule;
import com.ss.android.lark.oncall.dependency.IOnCallModuleDependency;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/integrator/im/oncall/OnCallModuleProvider;", "", "()V", "Companion", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.n.a */
public final class OnCallModuleProvider {

    /* renamed from: a */
    public static final Companion f101287a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/integrator/im/oncall/OnCallModuleProvider$Companion;", "", "()V", "module", "Lcom/ss/android/lark/oncall/OnCallModule;", "getModule", "()Lcom/ss/android/lark/oncall/OnCallModule;", "getDependency", "Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "SingletonHolder", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.im.n.a$a */
    public static final class Companion {

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/im/oncall/OnCallModuleProvider$Companion$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "getHolder", "()Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.im.n.a$a$a */
        public static final class SingletonHolder {

            /* renamed from: a */
            public static final SingletonHolder f101288a = new SingletonHolder();

            /* renamed from: b */
            private static final IOnCallModuleDependency f101289b = OnCallModuleProvider.f101287a.mo143991b();

            private SingletonHolder() {
            }

            /* renamed from: a */
            public final IOnCallModuleDependency mo143992a() {
                return f101289b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J4\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016¨\u0006\u0019"}, d2 = {"com/ss/android/lark/integrator/im/oncall/OnCallModuleProvider$Companion$getDependency$1", "Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "getContactPageTag", "", "getFeiShuMiniAppLink", "getUserId", "isOverseaTenantBrand", "", "openByAppLink", "", "context", "Landroid/content/Context;", "appLink", "openChat", "chatId", "preloadMiniApp", "searchHelpDesks", "queryKey", "begin", "", "end", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.im.n.a$a$b */
        public static final class C39740b implements IOnCallModuleDependency {
            C39740b() {
            }

            @Override // com.ss.android.lark.oncall.dependency.IOnCallModuleDependency
            /* renamed from: a */
            public String mo143993a() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                String b = passportDependency.mo143668b();
                Intrinsics.checkExpressionValueIsNotNull(b, "IMModule.getDependency().passportDependency.userId");
                return b;
            }

            @Override // com.ss.android.lark.oncall.dependency.IOnCallModuleDependency
            /* renamed from: b */
            public String mo143996b() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39572n coreDependency = a.getCoreDependency();
                Intrinsics.checkExpressionValueIsNotNull(coreDependency, "IMModule.getDependency().coreDependency");
                String A = coreDependency.mo143375A();
                Intrinsics.checkExpressionValueIsNotNull(A, "IMModule.getDependency()…Dependency.contactPageTag");
                return A;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/im/oncall/OnCallModuleProvider$Companion$getDependency$1$searchHelpDesks$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchResponse", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.integrator.im.n.a$a$b$a */
            public static final class C39741a implements IGetDataCallback<SearchResponse> {

                /* renamed from: a */
                final /* synthetic */ IGetDataCallback f101290a;

                C39741a(IGetDataCallback iGetDataCallback) {
                    this.f101290a = iGetDataCallback;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f101290a.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(SearchResponse searchResponse) {
                    Intrinsics.checkParameterIsNotNull(searchResponse, "searchResponse");
                    List<SearchBaseInfo> infoList = searchResponse.getInfoList();
                    ArrayList arrayList = new ArrayList();
                    if (infoList != null) {
                        Iterator it = ((ArrayList) infoList).iterator();
                        while (it.hasNext()) {
                            SearchHelpDeskInfo searchHelpDeskInfo = (SearchHelpDeskInfo) it.next();
                            OnCall onCall = new OnCall();
                            Intrinsics.checkExpressionValueIsNotNull(searchHelpDeskInfo, "searchInfo");
                            arrayList.add(onCall.setId(searchHelpDeskInfo.getId()).setName(searchHelpDeskInfo.getTitle()).setDescription(searchHelpDeskInfo.getSubTitle()).setAvatarKey(searchHelpDeskInfo.getAvatarKey()));
                        }
                        this.f101290a.onSuccess(arrayList);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo>");
                }
            }

            @Override // com.ss.android.lark.oncall.dependency.IOnCallModuleDependency
            /* renamed from: a */
            public void mo143994a(Context context, String str) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(str, "chatId");
                AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("contact_home").mo105923a(ChatBundle.SourceType.PROFILE).mo105933c("help_desk").mo105929a());
            }

            @Override // com.ss.android.lark.oncall.dependency.IOnCallModuleDependency
            /* renamed from: a */
            public void mo143995a(String str, int i, int i2, IGetDataCallback<List<OnCall>> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(str, "queryKey");
                Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                a.getCoreDependency().mo143484a(str, i, i2, new C39741a(iGetDataCallback));
            }
        }

        private Companion() {
        }

        /* renamed from: b */
        public final IOnCallModuleDependency mo143991b() {
            return new C39740b();
        }

        /* renamed from: a */
        public final OnCallModule mo143990a() {
            return new OnCallModule(SingletonHolder.f101288a.mo143992a());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
