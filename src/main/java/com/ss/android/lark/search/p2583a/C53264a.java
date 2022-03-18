package com.ss.android.lark.search.p2583a;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2488i.C51816a;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.platform.p2498r.C51947a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53342a;
import com.ss.android.lark.search.impl.p2599c.p2602c.AbstractC53363a;
import com.ss.android.lark.search.p2583a.C53264a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.C53893b;
import com.ss.android.lark.searchcommon.dto.SearchImageHistory;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.search.a.a */
public class C53264a {

    /* renamed from: com.ss.android.lark.search.a.a$a */
    public static class C53279a {

        /* renamed from: a */
        public static final ISearchModuleDependency f131660a = C53264a.m205975a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C53258a m205974a() {
        return new C53258a(C53279a.f131660a);
    }

    /* renamed from: a */
    public static ISearchModuleDependency m205975a(final Context context) {
        return new ISearchModuleDependency() {
            /* class com.ss.android.lark.search.p2583a.C53264a.C532651 */

            /* renamed from: b */
            private final Map<AbstractC53342a, AbstractC29626r> f131630b = new ConcurrentHashMap();

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: b */
            public boolean mo181749b() {
                return true;
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: c */
            public Context mo181750c() {
                return context;
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: s */
            public ISearchModuleDependency.AbstractC53313a mo181770s() {
                return $$Lambda$a$1$G9pvxnTe1OTBmNH1lJnMfbVy8.INSTANCE;
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181741a(String str, Context context) {
                C51931a.m201432a().mo180844a(str, context);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181742a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132899b(str, str2, iGetDataCallback);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public boolean mo181745a(String str) {
                return C37239a.m146648b().mo136955b(str, C37239a.m146645a(str).booleanValue());
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181743a(String str, boolean z) {
                mo181744a(str, z, -1);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181744a(String str, boolean z, int i) {
                C36083a.m141486a().getOpenPlatformDependency().mo133022a(str, z, i);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: d */
            public AbstractC53363a mo181752d() {
                return new AbstractC53363a() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532778 */

                    @Override // com.ss.android.lark.search.impl.p2599c.p2602c.AbstractC53363a
                    /* renamed from: a */
                    public void mo181830a() {
                        C51997c.m201743a("key_chatwindow", ChatBundle.SourceType.SEARCH);
                    }

                    @Override // com.ss.android.lark.search.impl.p2599c.p2602c.AbstractC53363a
                    /* renamed from: b */
                    public void mo181831b() {
                        C51997c.m201743a("key_doc", ChatBundle.SourceType.SEARCH);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: e */
            public ISearchModuleDependency.AbstractC53315c mo181754e() {
                return new ISearchModuleDependency.AbstractC53315c() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass10 */

                    /* renamed from: b */
                    private final C29638a f131633b = BrowserModuleProvider.m200667a();

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53315c
                    /* renamed from: a */
                    public void mo181774a(Context context, String str) {
                        this.f131633b.mo106844a(context, str, UrlParams.m108857a().mo105523a(), C36083a.m141486a().getCCMDependency().mo132713b());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53315c
                    /* renamed from: b */
                    public void mo181775b(Context context, String str) {
                        this.f131633b.mo106844a(context, str, UrlParams.m108857a().mo105523a(), C36083a.m141486a().getCCMDependency().mo132701a());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53315c
                    /* renamed from: c */
                    public void mo181776c(Context context, String str) {
                        BrowserModuleProvider.m200667a().mo106850a("messenger", "messenger_search_link");
                        this.f131633b.mo106842a(context, str);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: f */
            public ISearchModuleDependency.AbstractC53317e mo181756f() {
                return new ISearchModuleDependency.AbstractC53317e() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass11 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181787a(String str, List<String> list, final IGetDataCallback<Void> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132867a(str, list, new IGetDataCallback<Chat>() {
                            /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass11.C532671 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Chat chat) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(null);
                                }
                            }
                        });
                    }

                    /* renamed from: a */
                    public void mo181788a(String str, boolean z, int i) {
                        C36083a.m141486a().getIMDependency().mo132826a(context, new C29604ae.C29606a().mo106670b(str).mo106679h(z).mo106662a(i).mo106671b(true).mo106674d("search").mo106668a());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181786a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132861a(str, AddChatChatterApply.Ways.VIA_SEARCH, Collections.singletonList(C36083a.m141486a().getPassportDependency().mo133085d()), str2, (String) null, (String) null, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181789a(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132922d(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public void mo181792b(String str) {
                        mo181795b(str, false);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public Chatter mo181777a(String str) {
                        return C36083a.m141486a().getIMDependency().mo132923e(str);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public Map<String, Chatter> mo181791b(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132814a(list);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: c */
                    public Map<String, Message> mo181798c(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132907c(list);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: d */
                    public void mo181800d(String str) {
                        C36083a.m141486a().getIMDependency().mo132950l(str);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public String mo181778a(Chat chat) {
                        return C36083a.m141486a().getIMDependency().mo132807a(chat);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public String mo181779a(Chatter chatter) {
                        return C36083a.m141486a().getIMDependency().mo132808a(chatter, ChatterNameDisplayRule.ALIAS_NAME);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: c */
                    public void mo181799c(String str) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105931b(str).mo105933c("search").mo105923a(ChatBundle.SourceType.SEARCH).mo105941h(true).mo105929a());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public Map<String, Chat> mo181781a(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132887b(list);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181782a(String str, int i) {
                        mo181788a(str, false, i);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public void mo181794b(String str, final IGetDataCallback<Chat> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132858a(str, new IGetDataCallback<Chat>() {
                            /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass11.C532682 */

                            /* renamed from: a */
                            public void onSuccess(Chat chat) {
                                iGetDataCallback.onSuccess(chat);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public String mo181780a(String str, boolean z) {
                        Chat chat;
                        if (z) {
                            chat = C36083a.m141486a().getIMDependency().mo132904c(str, C36083a.m141486a().getPassportDependency().mo133085d());
                        } else {
                            chat = C36083a.m141486a().getIMDependency().mo132935g(str);
                        }
                        if (chat != null) {
                            return chat.getId();
                        }
                        return "";
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public void mo181793b(String str, int i) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105933c("search").mo105923a(ChatBundle.SourceType.SEARCH).mo105941h(true).mo105929a());
                    }

                    /* renamed from: b */
                    public void mo181795b(String str, boolean z) {
                        C36083a.m141486a().getIMDependency().mo132826a(context, new C29604ae.C29606a().mo106679h(z).mo106670b(str).mo106674d("search").mo106668a());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181783a(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132941h(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public void mo181796b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132929e(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: b */
                    public List<ImageSet> mo181790b(String str, String str2, int i) {
                        ImageHistoryResponse.Direction direction = ImageHistoryResponse.Direction.AFTER;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ImageHistoryResponse.ResourceType.IMAGE);
                        ImageHistoryResponse a = C36083a.m141486a().getIMDependency().mo132801a(str, str2, direction, arrayList, i);
                        if (a == null) {
                            return new ArrayList();
                        }
                        return a.getImageSetList();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: c */
                    public List<ImageSet> mo181797c(String str, String str2, int i) {
                        ImageHistoryResponse.Direction direction = ImageHistoryResponse.Direction.BEFORE;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ImageHistoryResponse.ResourceType.IMAGE);
                        ImageHistoryResponse a = C36083a.m141486a().getIMDependency().mo132801a(str, str2, direction, arrayList, i);
                        if (a == null) {
                            return new ArrayList();
                        }
                        return a.getImageSetList();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181784a(String str, String str2, int i) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("search").mo105920a(i).mo105929a());
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53317e
                    /* renamed from: a */
                    public void mo181785a(String str, String str2, int i, boolean z, final IGetDataCallback<SearchImageHistory> iGetDataCallback) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ImageHistoryResponse.ResourceType.IMAGE);
                        if (z) {
                            arrayList.add(ImageHistoryResponse.ResourceType.VIDEO);
                        }
                        C36083a.m141486a().getIMDependency().mo132864a(str, str2, ImageHistoryResponse.Direction.BEFORE, arrayList, i, new IGetDataCallback<ImageHistoryResponse>() {
                            /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass11.C532693 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(ImageHistoryResponse imageHistoryResponse) {
                                if (imageHistoryResponse == null) {
                                    iGetDataCallback.onSuccess(null);
                                } else {
                                    iGetDataCallback.onSuccess(new SearchImageHistory(imageHistoryResponse.isHasMoreBefore(), imageHistoryResponse.getImageSetList()));
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: g */
            public ISearchModuleDependency.AbstractC53327m mo181758g() {
                return new ISearchModuleDependency.AbstractC53327m() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass12 */

                    /* renamed from: b */
                    private final C38792a f131642b = C51854a.m201094a();

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m206053a(IGetDataCallback iGetDataCallback, List list) throws Exception {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(list);
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m206052a(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
                        }
                    }

                    /* renamed from: a */
                    private Bitmap m206050a(String str, String str2, int i, int i2) throws Exception {
                        return ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i, i2).build()).asBitmap().centerCrop().error(R.drawable.kb_avatar_bg).getBitmap(i, i2);
                    }

                    /* renamed from: a */
                    private List<Bitmap> m206051a(List<String> list, List<String> list2, int i, int i2) throws Exception {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            Bitmap a = m206050a(list.get(i3), list2.get(i3), i, i2);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        return arrayList;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m206054a(List list, List list2, int i, int i2, ObservableEmitter observableEmitter) throws Exception {
                        observableEmitter.onNext(m206051a(list, list2, i, i2));
                        observableEmitter.onComplete();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53327m
                    /* renamed from: a */
                    public void mo181807a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
                        C68296b.create(new ObservableOnSubscribe(list, list2, i, i2) {
                            /* class com.ss.android.lark.search.p2583a.$$Lambda$a$1$12$lYuU6a_UlIzQcVfwd4LWPu6xvbA */
                            public final /* synthetic */ List f$1;
                            public final /* synthetic */ List f$2;
                            public final /* synthetic */ int f$3;
                            public final /* synthetic */ int f$4;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                            }

                            @Override // io.reactivex.ObservableOnSubscribe
                            public final void subscribe(ObservableEmitter observableEmitter) {
                                C53264a.C532651.AnonymousClass12.this.m206054a((C53264a.C532651.AnonymousClass12) this.f$1, this.f$2, (List) this.f$3, this.f$4, (int) observableEmitter);
                            }
                        }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
                            /* class com.ss.android.lark.search.p2583a.$$Lambda$a$1$12$FMytY0QWNBGK0WLGJCSMxFQhywQ */

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C53264a.C532651.AnonymousClass12.m206053a(IGetDataCallback.this, (List) obj);
                            }
                        }, new Consumer() {
                            /* class com.ss.android.lark.search.p2583a.$$Lambda$a$1$12$mzr114imHPbBwT8FLkdFc8V_0Is */

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C53264a.C532651.AnonymousClass12.m206052a(IGetDataCallback.this, (Throwable) obj);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53327m
                    /* renamed from: a */
                    public void mo181805a(Context context, String str, ImageView imageView, String str2, int i, int i2) {
                        this.f131642b.mo142158a(context, imageView, str, str2, new LoadParams().mo105413a(UIUtils.dp2px(context, (float) i)).mo105422b(UIUtils.dp2px(context, (float) i2)));
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53327m
                    /* renamed from: a */
                    public void mo181806a(Context context, String str, Object obj, int i, int i2, final IGetDataCallback<String> iGetDataCallback) {
                        this.f131642b.mo142161a(context, str, obj, i, i2, new IGetDataCallback<File>() {
                            /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass12.C532701 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(File file) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(file.getPath());
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53327m
                    /* renamed from: a */
                    public void mo181804a(Context context, ImageView imageView, Image image, Drawable drawable, Drawable drawable2, int i, int i2, boolean z, ImageView.ScaleType scaleType, boolean z2, boolean z3, boolean z4) {
                        Scene scene;
                        C38792a aVar = this.f131642b;
                        String key = image.getKey();
                        LoadParams a = new LoadParams().mo105414a(drawable).mo105423b(drawable2).mo105413a(i).mo105422b(i2).mo105415a(scaleType);
                        ListenerParams.Builder a2 = new ListenerParams.Builder().mo105401a(z).mo105405b(z2).mo105396a(Biz.Messenger);
                        if (z4) {
                            scene = Scene.Thread;
                        } else {
                            scene = Scene.Chat;
                        }
                        aVar.mo142157a(context, imageView, key, a.mo105416a(a2.mo105397a(scene).mo105404b(image.getKey()).mo105398a(ListenerParams.FromType.CHAT_HISTORY).mo105402a()).mo105425b(!z3));
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: h */
            public ISearchModuleDependency.AbstractC53321h mo181759h() {
                return new ISearchModuleDependency.AbstractC53321h() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass13 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53321h
                    /* renamed from: a */
                    public int mo181809a(int i) {
                        return C36083a.m141486a().getCCMDependency().mo132698a(i);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53321h
                    /* renamed from: a */
                    public ISearchModuleDependency.AbstractC53321h.AbstractC53322a mo181810a(boolean z) {
                        return C36083a.m141486a().getCCMDependency().mo132712b(z);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: i */
            public ISearchModuleDependency.AbstractC53324j mo181760i() {
                return new ISearchModuleDependency.AbstractC53324j() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass14 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53324j
                    /* renamed from: a */
                    public List<C53893b> mo181811a() {
                        List<FeedPreviewInfo> a = C36083a.m141486a().getIMDependency().mo132802a(FeedCard.FeedType.INBOX, FeedCard.Type.CHAT).mo106727a(FeedCard.FeedType.INBOX);
                        Collections.sort(a);
                        return mo181812a(a);
                    }

                    /* renamed from: a */
                    public List<C53893b> mo181812a(List<FeedPreviewInfo> list) {
                        ArrayList arrayList = new ArrayList();
                        if (CollectionUtils.isEmpty(list)) {
                            return arrayList;
                        }
                        for (FeedPreviewInfo feedPreviewInfo : list) {
                            C53893b bVar = new C53893b();
                            bVar.mo183894a(feedPreviewInfo.mo106098p());
                            bVar.mo183900c(feedPreviewInfo.mo106105s());
                            bVar.mo183896b(feedPreviewInfo.mo106104r());
                            bVar.mo183893a(feedPreviewInfo.mo106051c());
                            bVar.mo183897b(feedPreviewInfo.mo105984H());
                            bVar.mo183903d(feedPreviewInfo.mo105979C());
                            bVar.mo183895a(feedPreviewInfo.mo106079i());
                            bVar.mo183901c(feedPreviewInfo.mo105980D());
                            bVar.mo183905e(feedPreviewInfo.mo105998V());
                            bVar.mo183892a(feedPreviewInfo.mo106058d());
                            arrayList.add(bVar);
                        }
                        return arrayList;
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53324j
                    /* renamed from: a */
                    public void mo181813a(Chat chat, String str) {
                        C36083a.m141486a().getIMDependency().mo132852a(chat, str);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53324j
                    /* renamed from: a */
                    public void mo181814a(String str, SearchCommonConstants.FeedType feedType) {
                        C36083a.m141486a().getIMDependency().mo132860a(str, FeedCard.Type.forNumber(feedType.getNumber()));
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: j */
            public ISearchModuleDependency.AbstractC53328n mo181761j() {
                return new ISearchModuleDependency.AbstractC53328n() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass15 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53328n
                    /* renamed from: a */
                    public String mo181815a() {
                        return C36083a.m141486a().getPassportDependency().mo133085d();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53328n
                    /* renamed from: b */
                    public String mo181816b() {
                        LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                        if (a == null) {
                            return "";
                        }
                        return a.getTenantId();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53328n
                    /* renamed from: c */
                    public boolean mo181817c() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172429j();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53328n
                    /* renamed from: d */
                    public boolean mo181818d() {
                        if (C36083a.m141486a().getPassportDependency().mo133094m().mo172421b().getTenantTag() != 0) {
                            return true;
                        }
                        return false;
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: k */
            public ISearchModuleDependency.AbstractC53318f mo181762k() {
                return new ISearchModuleDependency.AbstractC53318f() {
                    /* class com.ss.android.lark.search.p2583a.$$Lambda$a$1$PokqLxGPc8KdVpRa95p0QIKl0nI */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53318f
                    public final void showApplyDialog(Context context, ISearchModuleDependency.AbstractC53318f.AbstractC53319a aVar) {
                        C53264a.C532651.this.m205976a((C53264a.C532651) context, (Context) aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: l */
            public ISearchModuleDependency.AbstractC53326l mo181763l() {
                return new ISearchModuleDependency.AbstractC53326l() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532661 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53326l
                    /* renamed from: a */
                    public List<ChatChatter> mo181771a(Intent intent) {
                        ArrayList arrayList = new ArrayList();
                        List list = (List) intent.getSerializableExtra("result_key_checked_chatters");
                        if (CollectionUtils.isNotEmpty(list)) {
                            arrayList.addAll(list);
                        }
                        return arrayList;
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53326l
                    /* renamed from: a */
                    public void mo181773a(BaseFragment baseFragment, String str, List<String> list, int i) {
                        C36083a.m141486a().getIMDependency().mo132837a(baseFragment, str, list, i);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53326l
                    /* renamed from: a */
                    public void mo181772a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
                        C36083a.m141486a().getIMDependency().mo132830a(context, str, list, i, aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: m */
            public ISearchModuleDependency.ISettingServiceDependency mo181764m() {
                return new ISearchModuleDependency.ISettingServiceDependency() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532712 */

                    /* renamed from: b */
                    private final AbstractC54603d f131651b = SettingModuleProvider.f129183h.mo178263a().mo185219e();

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.ISettingServiceDependency
                    /* renamed from: a */
                    public int mo181819a() {
                        if (this.f131651b.mo186572e() != null) {
                            return this.f131651b.mo186572e().mo105510a().getNumber();
                        }
                        Log.m165383e("SearchModuleProvider", "getLocalTimeFormat failed: result is null");
                        return TimeFormatSetting.TimeFormat.UNKNOWN.getNumber();
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.ISettingServiceDependency
                    /* renamed from: a */
                    public boolean mo181820a(long j) {
                        return this.f131651b.mo186554a(j);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: n */
            public ISearchModuleDependency.AbstractC53316d mo181765n() {
                return new ISearchModuleDependency.AbstractC53316d() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532723 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53316d
                    /* renamed from: a */
                    public void mo181821a(Context context, String str, String str2) {
                        C36083a.m141486a().getCalendarDependency().mo132736a(context, str, str2);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53316d
                    /* renamed from: a */
                    public void mo181822a(String str, String str2, IGetDataCallback<SearchResponse> iGetDataCallback) {
                        C36083a.m141486a().getCalendarDependency().mo132740a(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53316d
                    /* renamed from: a */
                    public void mo181823a(String str, String str2, Long l, Context context, Long l2, Long l3) {
                        C36083a.m141486a().getCalendarDependency().mo132741a(str, str2, l, context, l2, l3);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: o */
            public ISearchModuleDependency.AbstractC53325k mo181766o() {
                return new ISearchModuleDependency.AbstractC53325k() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532734 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53325k
                    /* renamed from: a */
                    public void mo181824a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i) {
                        C51838a.m200992a().mo140416a(context, aVar, chat, arrayList, false, "", i);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53325k
                    /* renamed from: b */
                    public void mo181825b(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i) {
                        C51838a.m200992a().mo140413a(context, aVar, chat, arrayList, i, "");
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: p */
            public ISearchModuleDependency.AbstractC53320g mo181767p() {
                return new ISearchModuleDependency.AbstractC53320g() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532767 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53320g
                    /* renamed from: a */
                    public boolean mo181829a() {
                        if (C36808a.m145211c() == 1) {
                            return true;
                        }
                        return false;
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: q */
            public ISearchModuleDependency.AbstractC53323i mo181768q() {
                return new ISearchModuleDependency.AbstractC53323i() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532745 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53323i
                    /* renamed from: a */
                    public void mo181826a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback) {
                        C51816a.m200873a().mo135982a().mo105838b(context, str, str2, str3, i, str4, str5, iGetDataCallback, null);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: r */
            public ISearchModuleDependency.AbstractC53314b mo181769r() {
                return new ISearchModuleDependency.AbstractC53314b() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532756 */

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53314b
                    /* renamed from: a */
                    public void mo181827a(String str) {
                        C36083a.m141486a().getIMDependency().mo132952m(str);
                    }

                    @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53314b
                    /* renamed from: a */
                    public boolean mo181828a(String str, boolean z) {
                        return C36083a.m141486a().getIMDependency().mo132882a(str, z);
                    }
                };
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public Locale mo181733a() {
                return C36235a.m142710a().mo148281b().mo105659a();
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181739a(ImageView imageView) {
                ImageLoader.clear(imageView);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181735a(Dialog dialog) {
                C51689a.m200461a().mo197363a(dialog);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ boolean m205977b(String str) {
                return C51804b.m200825a().mo148365b().mo148371a(str);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: b */
            public void mo181747b(AbstractC53342a aVar) {
                AbstractC29626r rVar = this.f131630b.get(aVar);
                this.f131630b.remove(aVar);
                if (rVar != null) {
                    C36083a.m141486a().getIMDependency().mo132895b(rVar);
                }
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181740a(final AbstractC53342a aVar) {
                C532789 r0 = new AbstractC29626r() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.C532789 */

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
                    /* renamed from: a */
                    public void mo106748a(PushMessageReactions pushMessageReactions) {
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
                    /* renamed from: a */
                    public void mo106749a(PushMessageReadStates pushMessageReadStates) {
                    }

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
                    /* renamed from: a */
                    public void mo106750a(C29598aa aaVar) {
                        aVar.onPushMessage(aaVar.mo106644a());
                    }
                };
                this.f131630b.put(aVar, r0);
                C36083a.m141486a().getIMDependency().mo132847a(r0);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: d */
            public void mo181753d(Context context, String str) {
                AbstractC36232b.m142703a().mo178821b().mo105582b(context, str);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: e */
            public boolean mo181755e(Context context, String str) {
                return C51707a.m200495a().mo103469a(context, str, 0);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: f */
            public void mo181757f(Context context, String str) {
                C51707a.m200495a().mo103471b(context, str, 0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m205976a(Context context, final ISearchModuleDependency.AbstractC53318f.AbstractC53319a aVar) {
                C36083a.m141486a().getIMDependency().mo132824a(context, ChatSettingApplyWay.SELF_APPLY, new AbstractC29611c() {
                    /* class com.ss.android.lark.search.p2583a.C53264a.C532651.AnonymousClass16 */

                    @Override // com.ss.android.lark.biz.im.api.AbstractC29611c
                    public void onClick(View view, String str) {
                        ISearchModuleDependency.AbstractC53318f.AbstractC53319a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo181955a(view, str);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: b */
            public void mo181746b(Context context, String str) {
                C36083a.m141486a().getOpenPlatformDependency().mo133011a(context, str);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: c */
            public void mo181751c(Context context, String str) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(0);
                AbstractC36232b.m142703a().mo178821b().mo105573a(context, str, (String) null, contactSource);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181734a(int i, ImageView imageView) {
                ImageLoader.with(context).load(Integer.valueOf(i)).into(imageView);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: b */
            public void mo181748b(String str, boolean z) {
                C36083a.m141486a().getOpenPlatformDependency().mo133021a(str, z);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181737a(Context context, String str) {
                C36149a.m142162a().mo157098b().mo105706b(context, str);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public String mo181732a(String str, int i, int i2) {
                return C51947a.m201491a().mo181472a().mo105864a(str, i, i2);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181736a(Context context, FileContent fileContent, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
                C36083a.m141486a().getMigrateTempDependency().mo132978a(context, fileContent, str, str2, i, z, z2, z3);
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency
            /* renamed from: a */
            public void mo181738a(Context context, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, long j) {
                C36083a.m141486a().getMigrateTempDependency().mo132980a(context, str, str2, str3, str4, str5, i, z, z2, j);
            }
        };
    }
}
