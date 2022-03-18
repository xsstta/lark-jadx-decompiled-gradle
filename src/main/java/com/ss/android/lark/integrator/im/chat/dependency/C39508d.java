package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a;
import com.ss.android.lark.ai.p1327a.C28523a;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.biz.core.api.resource.ResourceRequestBaseSet;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionFactory;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.p1595b.AbstractC32811a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36452ab;
import com.ss.android.lark.dependency.AbstractC36454ac;
import com.ss.android.lark.dependency.AbstractC36455ad;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.dependency.AbstractC36458af;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36462ai;
import com.ss.android.lark.dependency.AbstractC36470d;
import com.ss.android.lark.dependency.AbstractC36471e;
import com.ss.android.lark.dependency.AbstractC36472f;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.dependency.AbstractC36495k;
import com.ss.android.lark.dependency.AbstractC36496l;
import com.ss.android.lark.dependency.AbstractC36497m;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.AbstractC36506t;
import com.ss.android.lark.dependency.AbstractC36507u;
import com.ss.android.lark.dependency.AbstractC36508v;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.dependency.AbstractC36511z;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.dependency.ICalendarDependency;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dependency.IContainerDependency;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dependency.IHelpdeskDependency;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dependency.ITeamDependency;
import com.ss.android.lark.dependency.IWatermarkDependency;
import com.ss.android.lark.dependency.aj;
import com.ss.android.lark.dependency.ak;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.dependency.an;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.dependency.ap;
import com.ss.android.lark.dependency.ar;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.dto.p1812a.C36864a;
import com.ss.android.lark.dto.p1814c.C36867a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.favorite.C37081c;
import com.ss.android.lark.favorite.p1836b.C37080a;
import com.ss.android.lark.favorite.p1837c.AbstractC37082a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.dependency.C39508d;
import com.ss.android.lark.integrator.im.container.ExtensionManager;
import com.ss.android.lark.integrator.im.p2025e.C39583a;
import com.ss.android.lark.integrator.im.p2033l.p2034a.C39712a;
import com.ss.android.lark.integrator.im.p2035m.C39718b;
import com.ss.android.lark.integrator.im.p2037o.C39742a;
import com.ss.android.lark.integrator.im.p2039q.C39763a;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.more.DocPlusItemWrapper;
import com.ss.android.lark.keyboard.plugin.tool.preview.IScreenshotCallBack;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.C44854a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.p2392o.AbstractC48705o;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import com.ss.android.lark.widget.select.SelectableView;
import dagger.AbstractC68108a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import org.json.JSONArray;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.d */
public class C39508d implements AbstractC36474h {

    /* renamed from: a */
    C39503af f100933a;

    /* renamed from: b */
    AbstractC36474h.AbstractC36480f f100934b;
    @Inject

    /* renamed from: c */
    AbstractC68108a<C37081c> f100935c;

    /* renamed from: com.ss.android.lark.integrator.im.chat.dependency.d$a */
    private static class C39523a implements AbstractC36508v {
        private C39523a() {
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: b */
        public boolean mo134722b(String str) {
            return C39603g.m157159a().getCoreDependency().mo143559b(str);
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: c */
        public boolean mo134723c(String str) {
            return C39603g.m157159a().getCoreDependency().mo143611r(str);
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: d */
        public boolean mo134724d(String str) {
            C39603g.m157159a().getCoreDependency().mo143613s(str);
            return true;
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: a */
        public boolean mo134720a(String str) {
            return C39603g.m157159a().getCoreDependency().mo143501a(str);
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: a */
        public void mo134718a(View view, int i) {
            C39603g.m157159a().getCoreDependency().mo143456a(view, i);
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: a */
        public void mo134719a(String str, boolean z) {
            C39603g.m157159a().getCoreDependency().mo143501a(str);
        }

        @Override // com.ss.android.lark.dependency.AbstractC36508v
        /* renamed from: a */
        public boolean mo134721a(String str, C38708a aVar) {
            return C39603g.m157159a().getCoreDependency().mo143502a(str, aVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134538a(Context context, Chatter chatter, String str, String str2) {
        AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
        if (chatter.isBot()) {
            E.mo105585c(context, chatter.getId());
        } else {
            E.mo105573a(context, chatter.getId(), str, new ContactSource.C29531a().mo104729b(str2).mo104726a(2).mo104728a());
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134544a(AbstractC48705o oVar) {
        C39603g.m157159a().getMigrateTempDependency().mo143633a(oVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134543a(Chat chat, Chatter chatter, AbstractC36474h.AbstractC36487m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C39603g.m157159a().getCCMDependency().mo143289a(LarkContext.getApplication(), chat));
        mVar.mo127097a(arrayList);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public boolean mo134548a(Context context, String str) {
        if (!C39603g.m157159a().getCoreDependency().mo143558b(context, str, 0)) {
            return false;
        }
        C39603g.m157159a().getCoreDependency().mo143565c(context, str, 0);
        return true;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134546a(final String str, String str2, int i, final IGetDataCallback<String> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ResourceRequestBaseSet(str, str2));
        C39603g.m157159a().getCoreDependency().mo143377C().mo105875a(arrayList, i, new IGetDataCallback<Map<String, Resource>>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Resource> map) {
                String str;
                Resource resource = map.get(str);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (resource == null) {
                    str = null;
                } else {
                    str = resource.mo105845b();
                }
                iGetDataCallback.onSuccess(str);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134547a(Set<String> set, String str, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : set) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(new ResourceRequestBaseSet(str2, str));
            }
        }
        C39603g.m157159a().getCoreDependency().mo143377C().mo105875a(arrayList, -99, new IGetDataCallback<Map<String, Resource>>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass18 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Resource> map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Resource> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().mo105845b());
                    }
                }
                iGetDataCallback.onSuccess(hashMap);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134545a(String str, Activity activity) {
        C39603g.m157159a().getCoreDependency().mo143485a(str, activity);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134539a(Context context, String str, Message.Type type, String str2, ArrayList<String> arrayList, boolean z) {
        C39763a.m157849a().mo181351a(context, str, type, str2, arrayList, z);
    }

    /* renamed from: a */
    public void mo143361a(Context context, List<PhotoItem> list, int i, View view, ActivityTransitionLauncher.LocationInfo locationInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, Scene scene, int i2) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165382e("gotoPreviewPhotos urls is empty, return");
            return;
        }
        if (i < 0) {
            Log.m165382e("gotoPreviewPhotos curPosition < 0");
        }
        C58630d.m227364a().mo198658a(view).mo198667a((ArrayList) list).mo198657a(i).mo198673b(z4).mo198674c(false).mo198675d(z).mo198676e(z2).mo198678g(z3).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198664a(onDialogMenuClickListener).mo198665a(onLoadMoreListener).mo198666a("").mo198662a(locationInfo).mo198677f(z5).mo198679h(z6).mo198680i(z7).mo198659a(Biz.Messenger).mo198660a(scene).mo198672b(i2).mo198671a((Activity) context, Biz.Messenger, scene, i2);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134542a(Context context, List<PhotoItem> list, int i, View view, ActivityTransitionLauncher.LocationInfo locationInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, OnChatAlbumClickListener onChatAlbumClickListener, Scene scene, int i2) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ChatModuleDependency", "gotoPreviewPhotos urls is empty, return");
            return;
        }
        if (i < 0) {
            Log.m165383e("ChatModuleDependency", "gotoPreviewPhotos curPosition < 0");
        }
        C58630d.m227364a().mo198658a(view).mo198667a((ArrayList) list).mo198657a(i).mo198673b(z4).mo198674c(false).mo198675d(z).mo198676e(z2).mo198678g(z3).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198664a(onDialogMenuClickListener).mo198665a(onLoadMoreListener).mo198666a("").mo198662a(locationInfo).mo198677f(z5).mo198679h(z6).mo198680i(z7).mo198685n(z8).mo198663a(onChatAlbumClickListener).mo198659a(Biz.Messenger).mo198660a(scene).mo198672b(i2).mo198671a((Activity) context, Biz.Messenger, scene, i2);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134541a(Context context, List<PhotoItem> list, int i, View view, ActivityTransitionLauncher.LocationInfo locationInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, Scene scene, int i2) {
        mo143361a(context, list, i, view, locationInfo, z, z2, z3, z4, z5, z6, false, onDialogMenuClickListener, onLoadMoreListener, scene, i2);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134540a(Context context, String str, String str2, String str3, LKUIRoundedImageView lKUIRoundedImageView) {
        C39603g.m157159a().getCoreDependency().mo143449a(context, str, str2, str3, lKUIRoundedImageView);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: A */
    public IStickerDependency mo134502A() {
        return new C39497ad();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: C */
    public AbstractC36472f mo134504C() {
        return new C39488a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: E */
    public IForwardDependency mo134506E() {
        return new ForwardDependency();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: F */
    public AbstractC36458af mo134507F() {
        return new C39553x();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: G */
    public AbstractC32811a mo134508G() {
        return new C39542q();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: H */
    public AbstractC36459ag mo134509H() {
        return new C39554y();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: I */
    public AbstractC36506t mo134510I() {
        return new C39535m();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: J */
    public AbstractC36497m mo134511J() {
        return new C39529i();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: K */
    public AbstractC36504r mo134512K() {
        return new C39534l();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: M */
    public AbstractC36495k mo134514M() {
        return new C39528h();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: N */
    public AbstractC36450aa mo134515N() {
        return new C39543r();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: T */
    public AbstractC36507u mo134521T() {
        return new C39536n();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: U */
    public AbstractC36474h.AbstractC36481g mo134522U() {
        return new AbstractC36474h.AbstractC36481g() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass19 */

            /* renamed from: a */
            final AbstractC37082a f100952a;

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36481g
            /* renamed from: a */
            public List<FavoriteMessageInfo> mo134617a(FavoriteMessageInfo favoriteMessageInfo) {
                return this.f100952a.mo136710a(favoriteMessageInfo);
            }

            {
                this.f100952a = C39508d.this.f100935c.mo237032b().mo136709b();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36481g
            /* renamed from: a */
            public void mo134619a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
                this.f100952a.mo136713a(list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36481g
            /* renamed from: a */
            public void mo134618a(long j, int i, final IGetDataCallback<C36864a> iGetDataCallback) {
                this.f100952a.mo136711a(j, i, new IGetDataCallback<C37080a>() {
                    /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass19.C395111 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(C37080a aVar) {
                        C36864a aVar2 = new C36864a(aVar.mo136705a(), aVar.mo136706b(), aVar.mo136707c());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(aVar2);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36481g
            /* renamed from: a */
            public void mo134620a(List<String> list, String str, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
                this.f100952a.mo136714a(list, str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36481g
            /* renamed from: a */
            public void mo134621a(List<String> list, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
                this.f100952a.mo136715a(list, str, str2, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: V */
    public AbstractC36461ah mo134523V() {
        return new C39555z();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: X */
    public AbstractC36474h.AbstractC36489o mo134525X() {
        return new AbstractC36474h.AbstractC36489o() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass20 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36489o
            /* renamed from: a */
            public void mo134640a(Activity activity, String str) {
                C39742a.m157747a().mo176939c(activity, str);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36489o
            /* renamed from: a */
            public void mo134641a(Context context, String str) {
                C39742a.m157747a().mo176937b((Activity) context, str);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: Y */
    public AbstractC36474h.AbstractC36490p mo134526Y() {
        return new AbstractC36474h.AbstractC36490p() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass21 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36490p
            /* renamed from: a */
            public void mo134643a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143495a(str, str2, strArr, ContentType.TEXT_CONTENT_TYPE, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36490p
            /* renamed from: a */
            public Dialog mo134642a(Context context, String str, String str2, String str3, String str4, String str5) {
                return C28523a.m104540a().mo101548c().mo101872a(context, str, str2, str3, str4, str5);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public Context mo134528a() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36476b aa() {
        return new AbstractC36474h.AbstractC36476b() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass23 */

            /* renamed from: a */
            final AbstractC29417b f100963a = C29410a.m108289c();

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36476b
            /* renamed from: a */
            public boolean mo134606a() {
                return this.f100963a.mo104288b();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36476b
            /* renamed from: b */
            public Activity mo134607b() {
                return this.f100963a.mo104289c();
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36475a ab() {
        return new AbstractC36474h.AbstractC36475a() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395122 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: d */
            public String mo134605d() {
                return C39603g.m157159a().getCoreDependency().mo143620z();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: a */
            public String mo134599a() {
                C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                if (v == null) {
                    return null;
                }
                return v.mo105624a("office-to-doc");
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: c */
            public String mo134604c() {
                return C39603g.m157159a().getCoreDependency().mo143619y();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: b */
            public C36867a mo134601b() {
                C36867a aVar = new C36867a();
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.PASSPORT);
                Map<Integer, String> l = C39603g.m157159a().getCoreDependency().mo143616v().mo105657l();
                aVar.mo136027a(a);
                aVar.mo136028a(l);
                return aVar;
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: a */
            public boolean mo134600a(String str) {
                return C39603g.m157159a().getCoreDependency().mo143586f(str);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: c */
            public UniversalUserSetting mo134603c(String str) {
                return C39603g.m157159a().getCoreDependency().mo143591h(str);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36475a
            /* renamed from: b */
            public String mo134602b(String str) {
                AppConfig.FeatureConfig g = C39603g.m157159a().getCoreDependency().mo143587g(str);
                if (g == null) {
                    return null;
                }
                return g.getTraits();
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36477c ac() {
        return new AbstractC36474h.AbstractC36477c() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395143 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36477c
            /* renamed from: a */
            public int mo134608a() {
                return C39603g.m157159a().getCoreDependency().mo143391Q();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36477c
            /* renamed from: a */
            public void mo134609a(Notification notification, int i) {
                C39603g.m157159a().getCoreDependency().mo143420a(notification, i);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36477c
            /* renamed from: a */
            public void mo134610a(Context context, int i) {
                C39603g.m157159a().getCoreDependency().mo143563c(context, i);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36486l ad() {
        return new AbstractC36474h.AbstractC36486l() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395154 */

            /* renamed from: d */
            private String m156220d(int i) {
                return i != 2 ? "normal_v2" : "at_v2";
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: b */
            public void mo134633b() {
                C39603g.m157159a().getCoreDependency().mo143400Z();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: a */
            public AbstractNotification.AbstractC48496c<Notice> mo134630a() {
                return C39603g.m157159a().getCoreDependency().mo143399Y();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: b */
            public boolean mo134634b(int i) {
                return C39603g.m157159a().getCoreDependency().mo143578d(m156220d(i));
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: c */
            public String mo134635c(int i) {
                return C39603g.m157159a().getCoreDependency().mo143580e(m156220d(i));
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: a */
            public boolean mo134632a(int i) {
                return C39603g.m157159a().getCoreDependency().mo143571c(m156220d(i));
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: a */
            public PendingIntent mo134629a(Message message, boolean z, boolean z2) {
                return C39603g.m157159a().getCoreDependency().mo143401a(message, z, z2);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36486l
            /* renamed from: a */
            public void mo134631a(String str, String str2, String str3, String str4) {
                C39603g.m157159a().getCoreDependency().mo143552b(str, str2, System.currentTimeMillis(), str3, str4);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public ak ae() {
        return new C39495ab();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36502p af() {
        return new AbstractC36502p() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395165 */

            /* renamed from: a */
            final AbstractC37250a f100967a = C37239a.m146648b();

            @Override // com.ss.android.lark.dependency.AbstractC36502p
            /* renamed from: a */
            public boolean mo134683a() {
                return this.f100967a.mo136951a("suite_translation");
            }

            @Override // com.ss.android.lark.dependency.AbstractC36502p
            /* renamed from: b */
            public boolean mo134684b() {
                return this.f100967a.mo136951a("suite_voice2text");
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36482h ag() {
        return new AbstractC36474h.AbstractC36482h() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395198 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36482h
            /* renamed from: a */
            public void mo134622a(final IScreenshotCallBack eVar) {
                C39712a.m157640a().mo149465a(C39508d.this.mo134528a(), LKPType.ScreenShot, new com.ss.android.lark.biz.im.api.IScreenshotCallBack() {
                    /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395198.C395201 */

                    @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
                    /* renamed from: a */
                    public void mo106758a(int i) {
                        IScreenshotCallBack eVar = eVar;
                        if (eVar != null) {
                            eVar.mo147492a(i);
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
                    /* renamed from: a */
                    public void mo106759a(String str) {
                        IScreenshotCallBack eVar = eVar;
                        if (eVar != null) {
                            eVar.mo147493a(str);
                        }
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36493i ah() {
        return new AbstractC36493i() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395219 */

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: a */
            public UserRelationResponse mo134645a(String str) {
                return C39603g.m157159a().getCoreDependency().mo143592i(str);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: b */
            public void mo134649b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143497a(str, true, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: c */
            public void mo134650c(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143553b(str, false, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: d */
            public void mo134651d(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143486a(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: e */
            public void mo134652e(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143497a(str, false, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: a */
            public void mo134648a(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback) {
                C39603g.m157159a().getCoreDependency().mo143550b(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: a */
            public void mo134646a(Context context, String str, int i) {
                C39603g.m157159a().getCoreDependency().mo143447a(context, "", str, "", i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m156236a(String str, String str2, ArrayList arrayList, final AbstractC36493i.AbstractC36494a aVar, IInitBuilder.IApplyCollabDialogBuilder aVar2) {
                IInitBuilder.IApplyCollabDialogBuilder aVar3 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar2.mo105553b(str)).mo105555d(str2)).mo105550a(arrayList).mo105551a(new IInitBuilder.IDialogBuilder.IDialogCallback() {
                    /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395219.C395221 */

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: a */
                    public void mo105556a() {
                        AbstractC36493i.AbstractC36494a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo134653a();
                        }
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: b */
                    public void mo105558b() {
                        AbstractC36493i.AbstractC36494a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo134655b();
                        }
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: a */
                    public void mo105557a(boolean z, String str) {
                        AbstractC36493i.AbstractC36494a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo134654a(z, str);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.dependency.AbstractC36493i
            /* renamed from: a */
            public void mo134647a(Context context, String str, String str2, ArrayList<Contact> arrayList, AbstractC36493i.AbstractC36494a aVar) {
                C39603g.m157159a().getCoreDependency().mo143427a(context, new IInitBuilder(str, str2, arrayList, aVar) {
                    /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$d$9$t0sCSjD5_J0EURrZrHlke6bevs */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ ArrayList f$3;
                    public final /* synthetic */ AbstractC36493i.AbstractC36494a f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                    public final void init(IInitBuilder.IDialogBuilder cVar) {
                        C39508d.C395219.this.m156236a((C39508d.C395219) this.f$1, this.f$2, (String) this.f$3, (ArrayList) this.f$4, (AbstractC36493i.AbstractC36494a) ((IInitBuilder.IApplyCollabDialogBuilder) cVar));
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36488n ai() {
        return new AbstractC36474h.AbstractC36488n() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass10 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36488n
            /* renamed from: a */
            public boolean mo134639a() {
                return C39603g.m157159a().getOpenPlatformDependency().mo143655d();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36488n
            /* renamed from: a */
            public void mo134637a(Chat chat) {
                C39603g.m157159a().getOpenPlatformDependency().mo143648a(chat);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36488n
            /* renamed from: a */
            public void mo134638a(Chat chat, AbstractC33975a aVar) {
                C39603g.m157159a().getOpenPlatformDependency().mo143649a(chat, aVar);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36488n
            /* renamed from: a */
            public void mo134636a(Context context, String str, List<String> list, List<Integer> list2) {
                C39603g.m157159a().getOpenPlatformDependency().mo143646a(context, str, list, list2);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36470d aj() {
        return new AbstractC36470d() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass12 */

            @Override // com.ss.android.lark.dependency.AbstractC36470d
            /* renamed from: a */
            public boolean mo134486a() {
                return C28523a.m104540a().mo101550e();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36470d
            /* renamed from: a */
            public IComposeController mo134484a(String str, IComposeController.ConvoType convoType, IComposeController.EditorType editorType) {
                return C28523a.m104540a().mo101545a(str, convoType, editorType);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36470d
            /* renamed from: a */
            public AbstractC28621d mo134485a(Chat chat, ViewGroup viewGroup, KeyBoard fVar, ISmartReplyInterface iSmartReplyInterface) {
                return C28523a.m104540a().mo101546a(chat, viewGroup, fVar, iSmartReplyInterface);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36452ab al() {
        return new C39544s();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36484j am() {
        return new MiraDependency();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public ITeamDependency an() {
        return new TeamDependency();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36483i ao() {
        return new AbstractC36474h.AbstractC36483i() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass15 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36483i
            /* renamed from: a */
            public boolean mo134625a() {
                return C39603g.m157159a().getMeegoDependency().mo143630a();
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36483i
            /* renamed from: a */
            public IPlusItem mo134623a(Chat chat) {
                return C39603g.m157159a().getMeegoDependency().mo143628a(chat);
            }

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36483i
            /* renamed from: a */
            public void mo134624a(String str, Chat chat, JSONArray jSONArray) {
                C39603g.m157159a().getMeegoDependency().mo143629a(str, chat, jSONArray);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public IContainerDependency ap() {
        return new IContainerDependency() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass16 */

            @Override // com.ss.android.lark.dependency.IContainerDependency
            /* renamed from: a */
            public List<ChatWindowObserver> mo134656a(ChatContext cVar) {
                ArrayList arrayList = new ArrayList();
                for (ExtensionFactory<ChatContext, ChatWindowObserver> eVar : ExtensionManager.f101030a.mo143621a()) {
                    arrayList.add(eVar.mo106814a(cVar));
                }
                return arrayList;
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public IWatermarkDependency aq() {
        return new IWatermarkDependency() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass17 */

            @Override // com.ss.android.lark.dependency.IWatermarkDependency
            /* renamed from: a */
            public void mo134479a(Activity activity) {
                C39603g.m157159a().getCoreDependency().mo143573d(activity);
            }

            @Override // com.ss.android.lark.dependency.IWatermarkDependency
            /* renamed from: b */
            public void mo134480b(Activity activity) {
                C39603g.m157159a().getCoreDependency().mo143582e(activity);
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36496l ar() {
        return new AbstractC36496l() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395176 */

            @Override // com.ss.android.lark.dependency.AbstractC36496l
            /* renamed from: a */
            public void mo134661a(Context context) {
                if (NetworkUtils.isNetworkAvailable(context)) {
                    C39583a.m157071a().mo141221b().mo141227a(context, new Params(Params.ReferType.LarkMine), null);
                } else {
                    LKUIToast.show(context, UIUtils.getString(context, R.string.Lark_Legacy_NetworkErrorRetry));
                }
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public aj as() {
        return new aj() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395187 */

            @Override // com.ss.android.lark.dependency.aj
            /* renamed from: a */
            public long mo134457a() {
                return C39603g.m157159a().getCoreDependency().mo143384J();
            }

            @Override // com.ss.android.lark.dependency.aj
            /* renamed from: b */
            public long mo134458b() {
                return C39603g.m157159a().getCoreDependency().mo143385K();
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36485k av() {
        return new AbstractC36474h.AbstractC36485k() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass13 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36485k
            /* renamed from: a */
            public AbstractC36474h.AbstractC36491q mo134628a(Fragment fragment) {
                final as a = C39603g.m157159a().getCoreDependency().mo143405a(fragment);
                return new AbstractC36474h.AbstractC36491q() {
                    /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass13.C395101 */

                    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36491q
                    /* renamed from: a */
                    public void mo134644a(View view) {
                        C39603g.m157159a().getCoreDependency().mo143461a(a.mo105604a(), view);
                    }
                };
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public AbstractC36474h.AbstractC36478d aw() {
        return new AbstractC36474h.AbstractC36478d() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass14 */

            @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36478d
            /* renamed from: a */
            public boolean mo134611a() {
                if (C36808a.m145211c() == 1) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: k */
    public AbstractC36508v mo134583k() {
        return new C39523a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: l */
    public AbstractC36462ai mo134584l() {
        return new C39489aa();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: m */
    public ar mo134585m() {
        return new C39504ag();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: n */
    public AbstractC36503q mo134586n() {
        return new C39533k();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: o */
    public AbstractC36510y mo134587o() {
        return new C39541p();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: q */
    public AbstractC36455ad mo134589q() {
        return new C39547u();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: s */
    public AbstractC36501o mo134591s() {
        return new C39530j();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: t */
    public AbstractC36454ac mo134592t() {
        return new C39546t();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: u */
    public IBrowserDependency mo134593u() {
        return new C39507c();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: v */
    public AbstractC36473g mo134594v() {
        return new C39506b();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: w */
    public IChatSettingDependency mo134595w() {
        return new C39526g();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: x */
    public al mo134596x() {
        return new C39496ac();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: y */
    public AbstractC36509x mo134597y() {
        return new C39537o();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: z */
    public AbstractC36456ae mo134598z() {
        return new C39548w();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: B */
    public AbstractC36474h.AbstractC36479e mo134503B() {
        return C39603g.m157159a().getCCMDependency().mo143306f();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: L */
    public AbstractC36498n mo134513L() {
        return C39603g.m157159a().getCCMDependency().mo143304d();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: O */
    public ap mo134516O() {
        return C39603g.m157159a().getVideoConferenceDependency().mo143693a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: P */
    public ICalendarDependency mo134517P() {
        return C39603g.m157159a().getCalendarDependency().mo143316b();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: Q */
    public IHelpdeskDependency mo134518Q() {
        return C39603g.m157159a().getHelpdeskDependency().mo143626a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: R */
    public ao mo134519R() {
        return C39603g.m157159a().getCalendarDependency().mo143319c();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: S */
    public AbstractC36505s mo134520S() {
        return C39603g.m157159a().getMigrateTempDependency().mo143631a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: W */
    public an mo134524W() {
        if (this.f100933a == null) {
            this.f100933a = new C39503af();
        }
        return this.f100933a;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: Z */
    public AbstractC36474h.AbstractC36480f mo134527Z() {
        if (this.f100934b == null) {
            this.f100934b = new AbstractC36474h.AbstractC36480f() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass22 */

                /* renamed from: a */
                final C28557a f100959a = C28523a.m104540a().mo101549d();

                /* renamed from: a */
                private void m156213a(View view, float f, RectF rectF) {
                    Layout layout;
                    if (view instanceof SelectableView) {
                        layout = ((SelectableView) view).getLayout();
                    } else if (view instanceof TextView) {
                        layout = ((TextView) view).getLayout();
                    } else {
                        layout = null;
                    }
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical((int) f);
                        int lineTop = layout.getLineTop(lineForVertical);
                        int lineBottom = layout.getLineBottom(lineForVertical);
                        rectF.top = (float) lineTop;
                        rectF.bottom = (float) lineBottom;
                    }
                }

                @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36480f
                /* renamed from: a */
                public void mo134616a(String str, String str2, String str3, float f, float f2, View view, String str4, final AbstractC28533c cVar, String str5) {
                    RectF rectF = new RectF(f, f2, f, f2);
                    m156213a(view, f2, rectF);
                    this.f100959a.mo101690a(str, str2, str3, rectF, view, str4, GetEnterpriseTopicRequest.Scene.MESSENGER, new IGetDataCallback<Object>() {
                        /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.AnonymousClass22.C395131 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                        public void onSuccess(Object obj) {
                            if (obj instanceof PopupWindow) {
                                cVar.mo101580a((PopupWindow) obj);
                            } else if (obj instanceof Dialog) {
                                cVar.mo101579a((Dialog) obj);
                            }
                        }
                    }, (String) null, (IGetDataCallback<String>) null, str5);
                }
            };
        }
        return this.f100934b;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public C24062d ak() {
        return C39603g.m157159a().getOpenPlatformDependency().mo143640a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public boolean at() {
        return C37239a.m146648b().mo136951a("tt_pay");
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public boolean ax() {
        return C39603g.m157159a().getCoreDependency().al();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: c */
    public boolean mo134575c() {
        return C39603g.m157159a().getPassportDependency().mo143675f();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: d */
    public String mo134576d() {
        return C39603g.m157159a().getEnvDependency().mo143624a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: e */
    public AbstractC32812c mo134577e() {
        return C39603g.m157159a().getCoreDependency().aj();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: f */
    public String mo134578f() {
        return C39603g.m157159a().getPassportDependency().mo143676g();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: h */
    public boolean mo134580h() {
        return C39603g.m157159a().getCoreDependency().mo143605o();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: i */
    public boolean mo134581i() {
        return C39603g.m157159a().getCoreDependency().mo143607p();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: j */
    public AbstractC25990b mo134582j() {
        return C39603g.m157159a().getCoreDependency().ah();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: p */
    public AbstractC36511z mo134588p() {
        return C39603g.m157159a().getOpenPlatformDependency().mo143654c();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: r */
    public AbstractC36471e mo134590r() {
        return C39603g.m157159a().getOpenPlatformDependency().mo143652b();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: D */
    public AbstractC36474h.C36492r mo134505D() {
        Profile I = C39603g.m157159a().getCoreDependency().mo143383I();
        if (I == null) {
            return null;
        }
        return new AbstractC36474h.C36492r(I.getEmail(), m156101a(I));
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    public boolean au() {
        return C39603g.m157159a().getCoreDependency().mo143616v().mo105652g();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: b */
    public boolean mo134574b() {
        return C39603g.m157160b().isUsPackage();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: g */
    public boolean mo134579g() {
        if (C39603g.m157159a().getCoreDependency().mo143616v() == null || !C39603g.m157159a().getCoreDependency().mo143616v().mo105650f()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public Chatter.ChatterCustomStatus mo134529a(List<Chatter.ChatterCustomStatus> list) {
        return C39603g.m157159a().getCoreDependency().mo143404a(list);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: b */
    public void mo134573b(AbstractC48705o oVar) {
        C39603g.m157159a().getMigrateTempDependency().mo143635b(oVar);
    }

    /* renamed from: a */
    private boolean m156101a(Profile profile) {
        if (!profile.getIsTopicGroupAdmin() || !mo134586n().mo134685a("group.admin.content.manage")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134532a(Activity activity) {
        C39603g.m157159a().getCoreDependency().mo143562c(activity);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134534a(Context context) {
        C39603g.m157159a().getCoreDependency().mo143422a(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134533a(Activity activity, View view) {
        StatusBarUtil.setTransparentForImageView(activity, view);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134535a(Context context, View view) {
        C39603g.m157159a().getCoreDependency().mo143531b(view);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public AbstractC34033a mo134530a(Activity activity, Chat chat, com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        return C39603g.m157159a().getVideoConferenceDependency().mo143692a(activity, chat, chatter);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public String mo134531a(String str, int i, int i2) {
        return C39603g.m157159a().getCoreDependency().mo143412a(str, i, i2);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134537a(Context context, Chat chat, com.ss.android.lark.chat.entity.chatter.Chatter chatter, final AbstractC36474h.AbstractC36487m mVar) {
        ArrayList arrayList = new ArrayList();
        IPlusItem a = C39603g.m157159a().getCCMDependency().mo143289a(context, chat);
        if (a != null) {
            arrayList.add(new DocPlusItemWrapper(chat, a));
        }
        mo134586n();
        if (!DesktopUtil.m144301a(context)) {
            arrayList.add(C39718b.m157699a().mo149709a(chat));
        }
        arrayList.add(C39603g.m157159a().getCoreDependency().mo143406a(chat));
        if (chat != null && !chat.isSecret()) {
            C39603g.m157159a().getOpenPlatformDependency().mo143649a(chat, new AbstractC33975a() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.C39508d.C395091 */

                @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
                /* renamed from: a */
                public void mo123762a(List<IPlusItem> list) {
                    mVar.mo127097a(list);
                }

                @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
                /* renamed from: a */
                public void mo123763a(List<IPlusItem> list, List<IPlusItem> list2) {
                    mVar.mo127098a(list, list2);
                }
            });
        }
        if (C44854a.m177786b(chat)) {
            arrayList.add(C39603g.m157159a().getMeegoDependency().mo143628a(chat));
        }
        mVar.mo127097a(arrayList);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h
    /* renamed from: a */
    public void mo134536a(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3) {
        LarkPhotoEditorModule.m199350a(context, fragment, str, str2, i, "from_preview", z, z2, str3);
    }
}
