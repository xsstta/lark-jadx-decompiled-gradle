package com.ss.android.lark.core.p1763a;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.core.a.a */
public class C36084a {

    /* renamed from: com.ss.android.lark.core.a.a$a */
    public static class C36092a {

        /* renamed from: a */
        public static final IAvatarModuleDependency f93276a = C36084a.m141489b();
    }

    /* renamed from: a */
    public static AvatarModule m141488a() {
        return new AvatarModule(C36092a.f93276a);
    }

    /* renamed from: b */
    public static IAvatarModuleDependency m141489b() {
        return new IAvatarModuleDependency() {
            /* class com.ss.android.lark.core.p1763a.C36084a.C360851 */

            /* renamed from: a */
            final Map<IGetDataCallback<PhotoItem>, AbstractC29627s> f93262a = Collections.synchronizedMap(new ArrayMap());

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: a */
            public IAvatarModuleDependency.IPushAvatarRegistry mo132670a() {
                return new IAvatarModuleDependency.IPushAvatarRegistry() {
                    /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360883 */

                    @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency.IPushAvatarRegistry
                    /* renamed from: a */
                    public void mo132682a(final IGetDataCallback<PhotoItem> iGetDataCallback) {
                        C360891 r0 = new AbstractC29627s() {
                            /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360883.C360891 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                            public void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                                String avatarKey = chatter.getAvatarKey();
                                C360851.this.mo132674a(chatter.getId(), chatter.getAvatarKey());
                                PhotoItem photoItem = PhotoItem.getPhotoItemsByUrls(Collections.singletonList(avatarKey)).get(0);
                                photoItem.setImageKey(avatarKey);
                                photoItem.setType(4);
                                photoItem.setEntityId(chatter.getId());
                                iGetDataCallback.onSuccess(photoItem);
                            }
                        };
                        C360851.this.f93262a.put(iGetDataCallback, r0);
                        C36083a.m141486a().getIMDependency().mo132848a(r0);
                    }

                    @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency.IPushAvatarRegistry
                    /* renamed from: b */
                    public void mo132683b(IGetDataCallback<PhotoItem> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132896b(C360851.this.f93262a.remove(iGetDataCallback));
                    }
                };
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: b */
            public IAvatarModuleDependency.IFeatureGatingService mo132676b() {
                return new IAvatarModuleDependency.IFeatureGatingService() {
                    /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360904 */

                    @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency.IFeatureGatingService
                    /* renamed from: a */
                    public boolean mo132684a(String str, boolean z) {
                        return C37239a.m146648b().mo136952a(str, z);
                    }
                };
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: c */
            public boolean mo132679c() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: a */
            public void mo132671a(Context context, IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getOpenPlatformDependency().mo133010a(context, iGetDataCallback);
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: a */
            public void mo132672a(Context context, String str) {
                BrowserModuleProvider.m200667a().mo106844a(context, str, UrlParams.m108857a().mo105518a(UrlParams.Source.APP).mo105523a(), new ArrayMap());
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: b */
            public void mo132677b(final String str, final IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132898b(str, new IGetDataCallback<Chatter>() {
                    /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360861 */

                    /* renamed from: a */
                    public void onSuccess(Chatter chatter) {
                        iGetDataCallback.onSuccess(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("IUpdateAvatarAPI", "uploadChatterAvatarCallback onError: " + errorResult);
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: c */
            public void mo132678c(final String str, final IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getCalendarDependency().mo132751c(str, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360915 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        Log.m165389i("AvatarModuleProvider", "updateMomentsProfileBackground onSuccess: " + str);
                        iGetDataCallback.onSuccess(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("AvatarModuleProvider", "updateMomentsProfileBackground onError: " + errorResult);
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: a */
            public void mo132673a(String str, IGetDataCallback<String> iGetDataCallback) {
                AbstractC36232b.m142703a().mo178820a(str, iGetDataCallback);
            }

            /* renamed from: a */
            public void mo132674a(String str, String str2) {
                C36083a.m141486a().getPassportDependency().mo133081b(str, str2);
            }

            @Override // com.ss.lark.android.avatar.dependency.IAvatarModuleDependency
            /* renamed from: a */
            public void mo132675a(String str, final String str2, final IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132863a(str, str2, new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.core.p1763a.C36084a.C360851.C360872 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("IUpdateAvatarAPI", "uploadGroupAvatarCallback onError: " + errorResult);
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        Log.m165389i("IUpdateAvatarAPI", "uploadGroupAvatarCallback onSuccess: " + chat.getAvatarKey());
                        iGetDataCallback.onSuccess(str2);
                    }
                });
            }
        };
    }
}
