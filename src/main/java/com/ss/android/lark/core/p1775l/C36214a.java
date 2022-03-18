package com.ss.android.lark.core.p1775l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.p1734c.AbstractC35385c;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1763a.C36084a;
import com.ss.android.lark.core.p1765c.C36096a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.core.p1775l.C36214a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.impl.p1961a.C38844c;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.AddFriendPush;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatChatter;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.entity.WorkStatus;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b;
import com.ss.android.lark.profile.statistics.p2549a.AbstractC52912a;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.l.a */
public class C36214a implements IProfileModuleDependency {

    /* renamed from: a */
    public final Map<AbstractC52240a, AbstractC35385c> f93485a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<AbstractC52241b, AbstractC29627s> f93486b = new ConcurrentHashMap();

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: t */
    public IProfileModuleDependency.AbstractC52245b mo133590t() {
        return $$Lambda$a$TRg5zMmWm4KQJ2KxNcact0w4bE8.INSTANCE;
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public boolean mo133561a(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133558a(final IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback) {
        C57532a.m223304a().getService().getInviteNewMemberUrl("", new IGetDataCallback<GetInvitationLinkResponse>() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362151 */

            /* renamed from: a */
            public void onSuccess(GetInvitationLinkResponse getInvitationLinkResponse) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(getInvitationLinkResponse);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public String mo133546a(String str, String str2) {
        return C36083a.m141486a().getIMDependency().mo132810a(str, str2);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133550a(Context context, String str) {
        BrowserModuleProvider.m200667a().mo106850a("messenger", "messenger_profile");
        BrowserModuleProvider.m200667a().mo106844a(context, str, UrlParams.m108857a().mo105523a(), C36083a.m141486a().getCCMDependency().mo132717c());
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133557a(Context context, String str, boolean z) {
        C36083a.m141486a().getOpenPlatformDependency().mo133013a(context, str, z);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public boolean mo133560a(long j) {
        return SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186554a(j);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133551a(Context context, String str, String str2, View view) {
        C36084a.m141488a().mo222593a(context, str, str2, view);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133553a(Context context, String str, String str2, View view, String str3, int i) {
        C36084a.m141488a().mo222595a(context, str, str2, view, str3, i);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133547a(Activity activity, ImageView imageView, int i) {
        C36084a.m141488a().mo222592a(activity, imageView, i);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133552a(Context context, String str, String str2, View view, int i) {
        C36084a.m141488a().mo222594a(context, str, str2, view, i);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133559a(String str, boolean z, boolean z2, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
        C36083a.m141486a().getVideoConferenceDependency().mo133137a(str, z, z2, iVCLaunchCallback);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133555a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
        C36083a.m141486a().getIMDependency().mo132832a(context, str, list, str2, str3, aVar);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133556a(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar) {
        C36083a.m141486a().getIMDependency().mo132833a(context, str, list, str2, str3, z, aVar);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133554a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
        C36083a.m141486a().getIMDependency().mo132830a(context, str, list, i, aVar);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133548a(Context context) {
        C36149a.m142162a().mo157098b().mo105706b(context, "conversation");
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo133549a(Context context, Contact contact, ContactSource contactSource, String str) {
        C36096a.m141510a().mo130101a(context, new IInitBuilder(contact, contactSource, str) {
            /* class com.ss.android.lark.core.p1775l.$$Lambda$a$uC09dg_qyEQj4_SDSJJ1wB_Wlfc */
            public final /* synthetic */ Contact f$1;
            public final /* synthetic */ ContactSource f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
            public final void init(IInitBuilder.IDialogBuilder cVar) {
                C36214a.this.m142565a((C36214a) this.f$1, (Contact) this.f$2, (ContactSource) this.f$3, (String) ((IInitBuilder.IApplyCollabDialogBuilder) cVar));
            }
        });
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: b */
    public Context mo133562b() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: c */
    public AbstractC52912a mo133565c() {
        return new AbstractC52912a() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362286 */

            @Override // com.ss.android.lark.profile.statistics.p2549a.AbstractC52912a
            /* renamed from: a */
            public void mo133649a() {
                C51997c.m201743a("key_chatwindow", ChatBundle.SourceType.PROFILE);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: l */
    public IProfileModuleDependency.AbstractC52250e mo133582l() {
        return new IProfileModuleDependency.AbstractC52250e() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362297 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: b */
            public void mo133658b(IGetDataCallback<String> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130285c(iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133654a(IGetDataCallback<String> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130281b(iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133653a(Context context, ProfileContent profileContent) {
                C51838a.m200992a().mo140412a(context, profileContent);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: c */
            public void mo133660c(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130282b(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: b */
            public void mo133659b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130288e(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133655a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130278a(str, true, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133651a(Activity activity, String str, int i) {
                C36099a.m141515a().mo130130b().mo130268a(activity, str, i);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133657a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130283b(str, z, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133652a(Activity activity, String str, String str2, int i) {
                C36099a.m141515a().mo130130b().mo130269a(activity, str, str2, i);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133650a(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i) {
                C36083a.m141486a().getIMDependency().mo132817a(activity, aVar, str, chat, z, i);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52250e
            /* renamed from: a */
            public void mo133656a(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback) {
                ContactSource contactSource2;
                if (contactSource != null) {
                    contactSource2 = new ContactSource();
                    contactSource2.setSender(contactSource.getSender());
                    contactSource2.setSenderId(contactSource.getSenderId());
                    contactSource2.setSourceName(contactSource.getSourceName());
                    contactSource2.setSourceId(contactSource.getSourceId());
                    contactSource2.setSourceType(contactSource.getSourceType());
                    contactSource2.setSubSourceType(contactSource.getSubSourceType());
                } else {
                    contactSource2 = null;
                }
                C36099a.m141515a().mo130136e().mo130277a(str2, str, str3, str4, str5, contactSource2, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: m */
    public IProfileModuleDependency.AbstractC52248d mo133583m() {
        return new IProfileModuleDependency.AbstractC52248d() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362308 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52248d
            /* renamed from: a */
            public void mo133661a(Context context, IProfileModuleDependency.AbstractC52248d.AbstractC52249a aVar) {
                C36083a.m141486a().getIMDependency().mo132824a(context, ChatSettingApplyWay.SELF_APPLY, new AbstractC29611c() {
                    /* class com.ss.android.lark.core.p1775l.$$Lambda$a$8$nuLcLZ0y9MU69h6lTbx0tWRrA6Q */

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29611c
                    public final void onClick(View view, String str) {
                        C36214a.C362308.m142695a(IProfileModuleDependency.AbstractC52248d.AbstractC52249a.this, view, str);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m142695a(IProfileModuleDependency.AbstractC52248d.AbstractC52249a aVar, View view, String str) {
                if (aVar != null) {
                    aVar.mo178830a(view, str);
                }
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: n */
    public IProfileModuleDependency.AbstractC52257k mo133584n() {
        return new IProfileModuleDependency.AbstractC52257k() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362319 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: a */
            public void mo133662a(Activity activity, String str) {
                C36083a.m141486a().getIMDependency().mo132908c(activity, str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: b */
            public void mo133666b(Activity activity, String str) {
                C36083a.m141486a().getIMDependency().mo132917d(activity, str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: c */
            public void mo133667c(Activity activity, String str) {
                C36083a.m141486a().getIMDependency().mo132926e(activity, str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: a */
            public void mo133665a(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132888b((Activity) context, str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: a */
            public void mo133663a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132819a(activity, str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52257k
            /* renamed from: a */
            public void mo133664a(Activity activity, String str, String str2) {
                C36083a.m141486a().getIMDependency().mo132820a(activity, str, str2);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: o */
    public IProfileModuleDependency.AbstractC52251f mo133585o() {
        return new IProfileModuleDependency.AbstractC52251f() {
            /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass10 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f
            /* renamed from: a */
            public int mo133595a(Context context) {
                return C38844c.m153339a().mo142339a(context);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f
            /* renamed from: a */
            public void mo133596a(Context context, ImageView imageView, String str, String str2, ProfileLoadParams profileLoadParams) {
                C51854a.m201094a().mo142158a(context, imageView, str, str2, new LoadParams().mo105413a(profileLoadParams.mo178888a()).mo105422b(profileLoadParams.mo178893b()).mo105419a(profileLoadParams.mo178899c()).mo105414a(profileLoadParams.mo178900d()).mo105423b(profileLoadParams.mo178901e()).mo105425b(!profileLoadParams.mo178902f()).mo105427c(profileLoadParams.mo178903g()).mo105424b(profileLoadParams.mo178905i()).mo105420a(profileLoadParams.mo178904h()));
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52251f
            /* renamed from: a */
            public void mo133597a(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, final IProfileModuleDependency.AbstractC52251f.AbstractC52252a aVar) {
                ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i2, i).noop(z).isOnlyLocal(z2).build()).downloadOnly(new C38818i<File>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass10.C362161 */

                    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                    /* renamed from: a */
                    public void mo49247a(Drawable drawable) {
                        super.mo49247a(drawable);
                        aVar.mo178831a(null);
                    }

                    /* renamed from: a */
                    public void mo49248a(File file) {
                        super.mo49248a((Object) file);
                        aVar.mo178831a(file);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: p */
    public IProfileModuleDependency.AbstractC52246c mo133586p() {
        return new IProfileModuleDependency.AbstractC52246c() {
            /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133605a(final IGetDataCallback<ProfileChatter> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132891b(new IGetDataCallback<Chatter>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362171 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chatter chatter) {
                        iGetDataCallback.onSuccess(C36214a.m142563a(chatter));
                    }
                });
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133606a(String str, final IGetDataCallback<ProfileChatter> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132912c(str, new IGetDataCallback<Chatter>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362182 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chatter chatter) {
                        iGetDataCallback.onSuccess(C36214a.m142563a(chatter));
                    }
                });
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133608a(String str, String str2, String str3, final IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132865a(str, str2, str3, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362193 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        iGetDataCallback.onSuccess(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133603a(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105933c("profile").mo105929a());
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133604a(Context context, String str, ContactSource contactSource, String str2) {
                C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105931b(str).mo105933c(str2).mo105923a(ChatBundle.SourceType.PROFILE).mo105933c("profile").mo105924a(m142627a(contactSource)).mo105929a());
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133610a(String str, String str2, String str3, String str4, AddChatChatterApply.Ways ways, IGetDataCallback<Boolean> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132861a(str, ways, Collections.singletonList(C36083a.m141486a().getPassportDependency().mo133085d()), str2, str3, str4, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133611a(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132901b(str, list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133609a(String str, String str2, String str3, ProfileContent profileContent, IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132851a(((C29634z.C29636a) ((C29634z.C29636a) ((C29634z.C29636a) C29634z.m109576a().mo125332j(str)).mo125330h(str2)).mo125331i(str3)).mo106779a(profileContent.getId()).mo106780a(), iGetDataCallback);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public ProfileChatter mo133600a() {
                return C36214a.m142563a(C36083a.m141486a().getIMDependency().mo132961v());
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: b */
            public String mo133612b(String str) {
                return m142628a(str, ChatterNameDisplayRule.NAME);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: d */
            public Chat mo133614d(String str) {
                return C36083a.m141486a().getIMDependency().mo132947k(str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: e */
            public void mo133615e(String str) {
                C36083a.m141486a().getIMDependency().mo132950l(str);
            }

            /* renamed from: a */
            private ChatBundle.C29592c m142627a(ContactSource contactSource) {
                return new ChatBundle.C29592c(contactSource.getSourceType(), contactSource.getSenderId(), contactSource.getSourceId(), contactSource.getSourceName());
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: c */
            public ProfileChat mo133613c(String str) {
                return C36214a.m142561a(C36083a.m141486a().getIMDependency().mo132930f(str));
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public Chatter mo133599a(String str) {
                return C36083a.m141486a().getIMDependency().mo132923e(str);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public String mo133602a(Chatter chatter) {
                return C36083a.m141486a().getIMDependency().mo132808a(chatter, ChatterNameDisplayRule.NAME);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public void mo133607a(String str, IProfileModuleDependency.AbstractC52246c.AbstractC52247a aVar) {
                m142629a(str, ChatterNameDisplayRule.NAME, aVar);
            }

            /* renamed from: a */
            private String m142628a(String str, ChatterNameDisplayRule chatterNameDisplayRule) {
                return C36083a.m141486a().getIMDependency().mo132808a(C36083a.m141486a().getIMDependency().mo132943i(str), chatterNameDisplayRule);
            }

            /* renamed from: a */
            private void m142629a(final String str, final ChatterNameDisplayRule chatterNameDisplayRule, final IProfileModuleDependency.AbstractC52246c.AbstractC52247a aVar) {
                C57865c.m224574a(new C57865c.AbstractC57873d<Chatter>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362204 */

                    /* renamed from: a */
                    public Chatter produce() {
                        return C36083a.m141486a().getIMDependency().mo132923e(str);
                    }
                }, new C57865c.AbstractC57871b<Chatter>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362215 */

                    /* renamed from: a */
                    public void consume(Chatter chatter) {
                        aVar.mo178829a(C36083a.m141486a().getIMDependency().mo132808a(chatter, chatterNameDisplayRule));
                    }
                });
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c
            /* renamed from: a */
            public Observable<ProfileChat> mo133601a(boolean z, String str, ContactSource contactSource) {
                return Observable.create(new ObservableOnSubscribe(z, str, contactSource) {
                    /* class com.ss.android.lark.core.p1775l.$$Lambda$a$11$25yFgcTucvZoOaUE8GcSygkZhCs */
                    public final /* synthetic */ boolean f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ ContactSource f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        C36214a.AnonymousClass11.this.m142630a((C36214a.AnonymousClass11) this.f$1, (boolean) this.f$2, (String) this.f$3, (ContactSource) observableEmitter);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m142630a(boolean z, String str, ContactSource contactSource, final ObservableEmitter observableEmitter) throws Exception {
                C36083a.m141486a().getIMDependency().mo132879a(z, str, m142627a(contactSource), new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass11.C362226 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        observableEmitter.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        observableEmitter.onNext(C36214a.m142561a(chat));
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: q */
    public IProfileModuleDependency.AbstractC52253g mo133587q() {
        return new IProfileModuleDependency.AbstractC52253g() {
            /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass12 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: a */
            public String mo133622a() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: c */
            public String mo133624c() {
                return C36083a.m141486a().getPassportDependency().mo133088g();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: g */
            public boolean mo133628g() {
                return C36083a.m141486a().getPassportDependency().mo133104w();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: b */
            public boolean mo133623b() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172429j();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: d */
            public String mo133625d() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getTenantName();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: e */
            public String mo133626e() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getUserName();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52253g
            /* renamed from: f */
            public String mo133627f() {
                for (TenantInfo tenantInfo : C36083a.m141486a().getPassportDependency().mo133106y()) {
                    if (tenantInfo.getTenantTag() == 2) {
                        return tenantInfo.getTenantId();
                    }
                }
                return null;
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: r */
    public IProfileModuleDependency.AbstractC52258l mo133588r() {
        return new IProfileModuleDependency.AbstractC52258l() {
            /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass13 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: a */
            public void mo133629a(IPushAddFriendListener afVar) {
                if (afVar != null) {
                    AddFriendPush.f129608a.mo178906a(afVar);
                }
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: b */
            public void mo133632b(IPushAddFriendListener afVar) {
                if (afVar != null) {
                    AddFriendPush.f129608a.mo178908b(afVar);
                }
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: a */
            public void mo133630a(final AbstractC52240a aVar) {
                C362231 r0 = new AbstractC35385c() {
                    /* class com.ss.android.lark.core.p1775l.C36214a.AnonymousClass13.C362231 */

                    @Override // com.ss.android.lark.contact.p1734c.AbstractC35385c
                    /* renamed from: a */
                    public void mo130262a(String str) {
                        AbstractC52240a aVar;
                        if (!TextUtils.isEmpty(str) && (aVar = aVar) != null) {
                            aVar.mo178826a(str);
                        }
                    }
                };
                C36214a.this.f93485a.put(aVar, r0);
                C36099a.m141515a().mo130129a(r0);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: b */
            public void mo133633b(AbstractC52240a aVar) {
                AbstractC35385c remove = C36214a.this.f93485a.remove(aVar);
                if (remove != null) {
                    C36099a.m141515a().mo130133b(remove);
                }
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: a */
            public void mo133631a(AbstractC52241b bVar) {
                $$Lambda$a$13$zaG2eFLj6Z1rlR2AdOd_wGUUe7Q r0 = new AbstractC29627s() {
                    /* class com.ss.android.lark.core.p1775l.$$Lambda$a$13$zaG2eFLj6Z1rlR2AdOd_wGUUe7Q */

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                    public final void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                        C36214a.AnonymousClass13.m142661a(AbstractC52241b.this, chatter, chat);
                    }
                };
                C36214a.this.f93486b.put(bVar, r0);
                C36083a.m141486a().getIMDependency().mo132848a(r0);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52258l
            /* renamed from: b */
            public void mo133634b(AbstractC52241b bVar) {
                AbstractC29627s remove = C36214a.this.f93486b.remove(bVar);
                if (remove != null) {
                    C36083a.m141486a().getIMDependency().mo132896b(remove);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m142661a(AbstractC52241b bVar, Chatter chatter, Chat chat) {
                ProfileChatter a = C36214a.m142563a(chatter);
                if (a != null) {
                    bVar.mo178827a(a);
                }
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: s */
    public IProfileModuleDependency.AbstractC52244a mo133589s() {
        return new IProfileModuleDependency.AbstractC52244a() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362242 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52244a
            /* renamed from: a */
            public int mo133635a() {
                return C36083a.m141486a().getIMDependency().mo132789K();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52244a
            /* renamed from: b */
            public int mo133637b() {
                return C36083a.m141486a().getIMDependency().mo132788J();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52244a
            /* renamed from: c */
            public int mo133638c() {
                return C36083a.m141486a().getIMDependency().mo132791M();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52244a
            /* renamed from: d */
            public String mo133639d() {
                return C36083a.m141486a().getIMDependency().mo132790L();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52244a
            /* renamed from: a */
            public void mo133636a(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132828a(context, str, (DialogInterface.OnDismissListener) null);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: u */
    public IProfileModuleDependency.AbstractC52256j mo133591u() {
        return new IProfileModuleDependency.AbstractC52256j() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362253 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52256j
            /* renamed from: a */
            public String mo133640a() {
                return C36083a.m141486a().getPassportDependency().mo133088g();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52256j
            /* renamed from: b */
            public List<TenantInfo> mo133641b() {
                return C36083a.m141486a().getPassportDependency().mo133106y();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52256j
            /* renamed from: c */
            public String mo133642c() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: v */
    public IProfileModuleDependency.AbstractC52254h mo133592v() {
        return new IProfileModuleDependency.AbstractC52254h() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362264 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52254h
            /* renamed from: a */
            public boolean mo133647a() {
                return C36187a.m142438a().mo160274e();
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52254h
            /* renamed from: a */
            public Chatter.ChatterCustomStatus mo133643a(List<Chatter.ChatterCustomStatus> list) {
                return C36187a.m142438a().mo160263a(list);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52254h
            /* renamed from: a */
            public void mo133645a(Context context, int i) {
                C36187a.m142438a().mo160265a(context, i);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52254h
            /* renamed from: a */
            public String mo133644a(Context context, Long l) {
                return C45616s.m180942a(l.longValue(), context);
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52254h
            /* renamed from: a */
            public void mo133646a(Context context, Fragment fragment, ChatterDescription chatterDescription, int i) {
                C36187a.m142438a().mo160266a(context, fragment, chatterDescription, i);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: w */
    public IProfileModuleDependency.AbstractC52255i mo133593w() {
        return new IProfileModuleDependency.AbstractC52255i() {
            /* class com.ss.android.lark.core.p1775l.C36214a.C362275 */

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52255i
            /* renamed from: a */
            public Fragment mo133648a(String str) {
                return C36083a.m141486a().getMomentsDependency().mo132985a(str);
            }
        };
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: f */
    public Activity mo133573f() {
        return C29410a.m108289c().mo104289c();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: g */
    public boolean mo133575g() {
        return C37239a.m146648b().mo136951a("suite_report");
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: h */
    public Locale mo133577h() {
        return C36235a.m142710a().mo148282c().mo148303f();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: j */
    public boolean mo133580j() {
        return C36083a.m141486a().getIMDependency().mo132958s();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: k */
    public boolean mo133581k() {
        return C51677a.m200443a().mo148570d();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: d */
    public boolean mo133569d() {
        return C36083a.m141486a().getVideoConferenceDependency().mo133146d();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: i */
    public String mo133579i() {
        return C36235a.m142710a().mo148282c().mo148296b(mo133577h());
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: e */
    public boolean mo133572e() {
        return C36083a.m141486a().getPassportDependency().mo133089h();
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public String mo133545a() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_REPORT);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: c */
    public void mo133567c(String str) {
        C57480a.m223132a().mo141830f(str);
    }

    /* renamed from: a */
    public static ProfileChatter m142563a(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        if (chatter == null) {
            return null;
        }
        if (chatter instanceof ChatChatter) {
            return m142562a((ChatChatter) chatter);
        }
        return m142566b(chatter);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: b */
    public String mo133563b(String str) {
        return C36882a.m145556a() + String.format("/suite/passport/page/add_contact/?token=%s", str);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: e */
    public void mo133571e(String str) {
        C36083a.m141486a().getIMDependency().mo132860a(str, FeedCard.Type.CHAT);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: f */
    public void mo133574f(String str) {
        C36083a.m141486a().getVideoConferenceDependency().mo133141b(str);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: g */
    public boolean mo133576g(String str) {
        if (!mo133561a("invite.myqrcode.new.enable")) {
            return true;
        }
        C57532a.m223304a().openInviteExternalPage(LarkContext.getApplication(), str, true);
        return false;
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: h */
    public boolean mo133578h(String str) {
        AppConfig.FeatureConfig b = C51804b.m200825a().mo148365b().mo148372b(str);
        if (b == null) {
            return true;
        }
        return b.isOn();
    }

    /* renamed from: a */
    private ContactSource m142560a(ContactSource contactSource) {
        if (contactSource == null) {
            return null;
        }
        ContactSource contactSource2 = new ContactSource();
        contactSource2.setSender(contactSource.getSender());
        contactSource2.setSenderId(contactSource.getSenderId());
        contactSource2.setSourceName(contactSource.getSourceName());
        contactSource2.setSourceId(contactSource.getSourceId());
        contactSource2.setSourceType(contactSource.getSourceType());
        contactSource2.setSubSourceType(contactSource.getSubSourceType());
        return contactSource2;
    }

    /* renamed from: i */
    private Uri m142568i(String str) {
        if (!str.startsWith("lark://client/profile")) {
            return Uri.parse(str);
        }
        return Uri.parse(str + "&fromProfile=true");
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: d */
    public boolean mo133570d(String str) {
        return C57480a.m223132a().mo141828e(str);
    }

    /* renamed from: a */
    public static ProfileChat m142561a(Chat chat) {
        if (chat == null) {
            return null;
        }
        return new ProfileChat(chat.getId(), chat.getOwnerId(), chat.getUserCount(), chat.getName(), chat.getDescription(), chat.getAvatarKey(), chat.isP2PChat(), chat.isPublic(), chat.isCrossTenant(), ProfileChat.AddMemberApply.forNumber(chat.getAddMemberApply().getNumber()));
    }

    /* renamed from: b */
    private static ProfileChatter m142566b(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        ProfileChatter.ChatterType chatterType = null;
        if (chatter == null) {
            return null;
        }
        String id = chatter.getId();
        if (chatter.getType() != null) {
            chatterType = ProfileChatter.ChatterType.forNumber(chatter.getType().getNumber());
        }
        return new ProfileChatter(id, chatterType, m142564a(chatter.getWorkStatus()), chatter.getAvatarKey(), chatter.getTenantId(), chatter.getAlias(), chatter.isProfileEnable(), chatter.isDimission(), chatter.isCustomer(), chatter.getZenModeEndTime(), chatter.getAvatarMedal());
    }

    /* renamed from: a */
    private static ProfileChatChatter m142562a(ChatChatter chatChatter) {
        ProfileChatter.ChatterType chatterType = null;
        if (chatChatter == null) {
            return null;
        }
        String id = chatChatter.getId();
        if (chatChatter.getType() != null) {
            chatterType = ProfileChatter.ChatterType.forNumber(chatChatter.getType().getNumber());
        }
        return new ProfileChatChatter(id, chatterType, m142564a(chatChatter.getWorkStatus()), chatChatter.getAvatarKey(), chatChatter.getTenantId(), chatChatter.getAlias(), chatChatter.isProfileEnable(), chatChatter.getNickName(), chatChatter.isDimission(), chatChatter.isCustomer(), chatChatter.getZenModeEndTime(), chatChatter.getAvatarMedal());
    }

    /* renamed from: a */
    public static WorkStatus m142564a(com.ss.android.lark.chat.entity.chatter.WorkStatus workStatus) {
        WorkStatus.Status status = null;
        if (workStatus == null) {
            return null;
        }
        if (workStatus.status != null) {
            status = WorkStatus.Status.valueOf(workStatus.status.getNumber());
        }
        return new WorkStatus(status, workStatus.description, workStatus.startTime, workStatus.endTime, workStatus.isCrossTenant);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m142567e(Context context, String str) {
        BrowserModuleProvider.m200667a().mo106842a(LarkContext.getApplication(), str);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: d */
    public void mo133568d(Context context, String str) {
        C36149a.m142162a().mo157084a(context, m142568i(str));
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: b */
    public void mo133564b(Context context, String str) {
        BrowserModuleProvider.m200667a().mo106850a("messenger", "messenger_profile");
        BrowserModuleProvider.m200667a().mo106842a(context, str);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: c */
    public void mo133566c(Context context, String str) {
        for (TenantInfo tenantInfo : C36083a.m141486a().getPassportDependency().mo133106y()) {
            if (TextUtils.equals(str, tenantInfo.getTenantId())) {
                C36083a.m141486a().getPassportDependency().mo133058a(context, tenantInfo);
                return;
            }
        }
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public Bitmap mo133543a(Context context, Bitmap bitmap, int i) {
        return ImageUtils.m224129a(context, bitmap, i);
    }

    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency
    /* renamed from: a */
    public Bitmap mo133544a(String str, int i, int i2, int i3) {
        return C51931a.m201432a().mo180837a(str, i, i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m142565a(Contact contact, ContactSource contactSource, String str, IInitBuilder.IApplyCollabDialogBuilder aVar) {
        IInitBuilder.IApplyCollabDialogBuilder aVar2 = (IInitBuilder.IApplyCollabDialogBuilder) aVar.mo105548a(contact).mo105547a(m142560a(contactSource)).mo105555d(str);
    }
}
