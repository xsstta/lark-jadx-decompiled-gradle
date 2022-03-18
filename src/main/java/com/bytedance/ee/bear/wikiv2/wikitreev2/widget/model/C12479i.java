package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.report.WikiDevReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoFavoriteEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoMakeCopyEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.FocusChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.TitleChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CreateNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.FavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePermPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetRelationPuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.UnfavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12457a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceUserPerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.AddV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.DelV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.DesV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.LocalPush;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.MovV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.ReaV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.UdeNodePermV3;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.UdeV3;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.atomic.AtomicReference;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.i */
public final class C12479i extends AbstractC1142af implements AbstractC12476b, LocalPush.ILocalPushHandler, C12509b.AbstractC12510a {
    private String TAG = "Wiki_WikiTreeModel@";
    private Function<TreeNode, Boolean> dataFilter;
    private final C68289a disposables = new C68289a();
    private boolean favoriteEnable = true;
    private String focusToken;
    private LocalPush localPush;
    final NetService netService = ((NetService) KoinJavaComponent.m268610a(NetService.class));
    private boolean pushEnable;
    final String synergyUuid = String.valueOf(System.currentTimeMillis());
    private String tagSuffix = "";
    private final C1177w<Result> wikiList = new C1177w<>();
    private C12509b wikiPush;
    volatile C12504l workspace = C12504l.f33511a;

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.LocalPush.ILocalPushHandler
    public void onDoMakeCopy(DoMakeCopyEvent bVar) {
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public LiveData<Result> getWikiUIList() {
        return this.wikiList;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public String getRootToken() {
        return this.workspace.mo47632k();
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public SpaceInfo getSpaceInfo() {
        return this.workspace.mo47623g();
    }

    public void clears() {
        C13479a.m54764b(this.TAG, "clears");
        onCleared();
    }

    private void unRegisterPush() {
        if (this.wikiPush != null) {
            C13479a.m54764b(this.TAG, "WikiTreeModel.unRegisterPush. ");
            this.wikiPush.mo47652b();
            this.wikiPush = null;
            this.localPush.mo47645b();
            this.localPush = null;
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public String getFocus() {
        if (!this.workspace.mo47626h(this.focusToken)) {
            this.focusToken = "";
        }
        return this.focusToken;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public C12504l getWorkspace() {
        if (this.workspace.mo47622f()) {
            return this.workspace.mo47634m();
        }
        return null;
    }

    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        C13479a.m54764b(this.TAG, "onCleared. ");
        unRegisterPush();
        C68289a aVar = this.disposables;
        if (aVar != null) {
            aVar.mo237935a();
        }
        if (this.workspace != null) {
            this.workspace.mo47633l();
            this.workspace = C12504l.f33511a;
        }
    }

    private WikiUIList provideUiList() {
        SpaceUserPerm h = this.workspace.mo47625h();
        if (!this.favoriteEnable || (h != null && !h.view_wiki_info)) {
            return new WikiUIList(this.workspace.mo47612b());
        }
        return new WikiUIList(this.workspace.mo47612b(), this.workspace.mo47614c());
    }

    private void registerPush() {
        if (this.workspace.mo47622f() && this.wikiPush == null) {
            C13479a.m54764b(this.TAG, "WikiTreeModel.registerPush. ");
            C12509b bVar = new C12509b(this.workspace.mo47627i(), this, this.synergyUuid, this.tagSuffix);
            this.wikiPush = bVar;
            bVar.mo47651a();
            LocalPush aVar = new LocalPush(this);
            this.localPush = aVar;
            aVar.mo47644a();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void setDataFilter(Function<TreeNode, Boolean> function) {
        this.dataFilter = function;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void setFavoriteEnable(boolean z) {
        this.favoriteEnable = z;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void setFocus(String str) {
        this.focusToken = str;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void setPushEnable(boolean z) {
        this.pushEnable = z;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public TreeNode getNode(String str) {
        return this.workspace.mo47611b(str);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public boolean isFavorite(String str) {
        return this.workspace.mo47624g(str);
    }

    public /* synthetic */ void lambda$null$1$i(Boolean bool) {
        C13479a.m54764b(this.TAG, "WikiTreeModel.loadInternal, load favorite ok. ");
    }

    public /* synthetic */ void lambda$null$2$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.loadInternal, load favorite fail. ", th);
    }

    private static AbstractC68307f<Boolean> fromCallable(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        return AbstractC68307f.m265083a((Object) true);
    }

    public /* synthetic */ void lambda$favorite$20$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.FAVORITE));
    }

    public /* synthetic */ void lambda$insert$10$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.ADD));
    }

    public /* synthetic */ void lambda$moveTo$16$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.MOV));
    }

    public /* synthetic */ void lambda$remove$13$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.DEL));
    }

    public /* synthetic */ void lambda$shortcutTo$28$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.SHORTCUT));
    }

    public /* synthetic */ void lambda$unfavorite$24$i(AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(WikiAction.UNFAVORITE));
    }

    public static AbstractC12476b newInstance(ViewModelStoreOwner viewModelStoreOwner) {
        return (AbstractC12476b) new C1144ai(viewModelStoreOwner, new C1144ai.C1148d()).mo6005a(C12479i.class);
    }

    public boolean isSameSpace(String str) {
        if (!this.workspace.mo47622f() || !TextUtils.equals(this.workspace.mo47627i(), str)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$favorite$22$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.favorite, favorite fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.FAVORITE, th));
    }

    public /* synthetic */ void lambda$insert$11$i(String str) {
        Ok a = Result.m51906a(WikiAction.ADD, provideUiList());
        a.mo47490b(str);
        this.wikiList.mo5929b(a);
    }

    public /* synthetic */ void lambda$insert$12$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.insert, insert fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.ADD, th));
    }

    public /* synthetic */ void lambda$moveTo$18$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.moveTo, moveTo fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.MOV, th));
    }

    public /* synthetic */ void lambda$remove$14$i(String str) {
        Ok a = Result.m51906a(WikiAction.DEL, provideUiList());
        a.mo47492c(str);
        this.wikiList.mo5929b(a);
    }

    public /* synthetic */ void lambda$remove$15$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.remove, remove fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.DEL, th));
    }

    public /* synthetic */ void lambda$shortcutTo$30$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.shortcutTo, shortcutTo fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.SHORTCUT, th));
    }

    public /* synthetic */ void lambda$unfavorite$26$i(Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.unfavorite, unfavorite fail. ", th);
        this.wikiList.mo5929b(Result.m51904a(WikiAction.UNFAVORITE, th));
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onReaV3(ReaV3 reaV3) {
        AddV3 addV3 = new AddV3();
        addV3.space_id = reaV3.space_id;
        addV3.wiki_token = reaV3.wiki_token;
        addV3.parent_wiki_token = reaV3.parent_wiki_token;
        onAddV3(addV3);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void setTagSuffix(String str) {
        this.tagSuffix = str;
        this.TAG += str;
    }

    private Pair<TreeNode, Throwable> reverseGetNode(String str) {
        Exception e;
        TreeNode treeNode = null;
        try {
            treeNode = C12455c.m51795f(this.netService).pull(new GetNodePuller.Params(this.workspace.mo47627i(), str)).mo238023d();
            e = null;
        } catch (Exception e2) {
            e = e2;
            C13479a.m54759a(this.TAG, "WikiTreeModel.reverseGetNode, pull node fail. ", e);
        }
        return new Pair<>(treeNode, e);
    }

    public /* synthetic */ void lambda$favorite$21$i(Boolean bool) {
        if (this.workspace.mo47620e()) {
            this.wikiList.mo5929b(Result.m51906a(WikiAction.FAVORITE, provideUiList()));
        } else {
            this.wikiList.mo5929b(Result.m51906a(WikiAction.FAVORITE, (WikiUIList) null));
        }
    }

    public /* synthetic */ void lambda$unfavorite$25$i(Boolean bool) {
        if (this.workspace.mo47620e()) {
            this.wikiList.mo5929b(Result.m51906a(WikiAction.UNFAVORITE, provideUiList()));
        } else {
            this.wikiList.mo5929b(Result.m51906a(WikiAction.UNFAVORITE, (WikiUIList) null));
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onDesV3(DesV3 desV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.onDesV3, desV3: " + desV3);
        this.wikiList.mo5926a(Result.m51904a(WikiAction.PUSH_DES, new Throwable()));
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.LocalPush.ILocalPushHandler
    public void onTitleChange(TitleChangeEvent eVar) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.onTitleChange. spaceId: %s, wikiToken: %s", C13721c.m55650d(eVar.mo47303a()), C13721c.m55650d(eVar.mo47304b())));
        if (isSameSpace(eVar.mo47303a())) {
            updateTitle(eVar.mo47304b(), eVar.mo47305c());
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void collapse(String str) {
        String b = C12457a.C12458a.m51812b(str);
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.collapse, wikiToken: %s, uid: %s", C13721c.m55650d(b), C13721c.m55650d(str)));
        if (!this.workspace.mo47626h(b)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.collapse, node not found. ");
            return;
        }
        this.workspace.mo47613b(b, str);
        this.wikiList.mo5929b(Result.m51906a(WikiAction.COLLAPSE, provideUiList()));
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void expand(String str) {
        String b = C12457a.C12458a.m51812b(str);
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.expand, wikiToken: %s, uid: %s", C13721c.m55650d(b), C13721c.m55650d(str)));
        if (!this.workspace.mo47626h(b)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.expand, node not found. ");
            return;
        }
        AtomicReference atomicReference = new AtomicReference(false);
        this.disposables.mo237937a(C12480j.m51925a(this, b).mo238014c(new Function(b, str) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$J67HQQKJ2LVZ23umiDPJJJAB4 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12479i.this.lambda$expand$6$i(this.f$1, this.f$2, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(str) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$L_cdh7trKr8Zt9wzhOIYPOjkBs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$expand$7$i(this.f$1, (AbstractC70022d) obj);
            }
        }).mo238001b(new Consumer(str, atomicReference) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$0ETldgQ6JpDPyp7cAdUMMJewzsI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AtomicReference f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$expand$8$i(this.f$1, this.f$2, (Boolean) obj);
            }
        }, new Consumer(atomicReference, str) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$mT0HGWLE_gtalo7vfFbl5vJG_ww */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$expand$9$i(this.f$1, this.f$2, (Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void favorite(String str) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.favorite, wikiToken: %s", C13721c.m55650d(str)));
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.favorite, node not found. ");
        } else {
            this.disposables.mo237937a(C12455c.m51801l(this.netService).pull(new FavoritePuller.Params(this.workspace.mo47627i(), str)).mo238020d(new Function(str) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$CotEX2Hp4teMkiDEyBzUtmF8doc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12479i.this.lambda$favorite$19$i(this.f$1, (Boolean) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$1CK9hLN1x8hH28EWaLq0YMiNe9k */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$favorite$20$i((AbstractC70022d) obj);
                }
            }).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$mxM5yQX6BDD7EJRPC3xnga12tYM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$favorite$21$i((Boolean) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$chgQqKj5XJyOBhZPfvJ4XF429g */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$favorite$22$i((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onAddV3(AddV3 addV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.onAddV3, addV3: " + addV3);
        if (!this.workspace.mo47626h(addV3.parent_wiki_token) || this.workspace.mo47626h(addV3.wiki_token)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onAddV3, node not found. ");
            return;
        }
        TreeNode treeNode = (TreeNode) reverseGetNode(addV3.wiki_token).first;
        if (treeNode == null) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onAddV3, reverse fail. ");
            return;
        }
        C12480j.m51930a(this, addV3.parent_wiki_token, treeNode, false, "");
        Ok a = Result.m51906a(WikiAction.PUSH_ADD, provideUiList());
        a.mo47490b(addV3.wiki_token);
        this.wikiList.mo5926a(a);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onDelV3(DelV3 delV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.onDelV3, delV3: " + delV3);
        if (!this.workspace.mo47626h(delV3.wiki_token)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onDelV3, node not found. ");
        } else if (!TextUtils.equals(this.workspace.mo47611b(delV3.wiki_token).parent_wiki_token, delV3.parent_wiki_token)) {
            C13479a.m54764b(this.TAG, "WikiTreeModel.onDelV3, parent not the same. ");
        } else {
            C12480j.m51938c(this, delV3.wiki_token);
            Ok a = Result.m51906a(WikiAction.PUSH_DEL, provideUiList());
            a.mo47492c(delV3.parent_wiki_token);
            this.wikiList.mo5926a(a);
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.LocalPush.ILocalPushHandler
    public void onDoFavorite(DoFavoriteEvent aVar) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.onDoFavorite. spaceId: %s, wikiToken: %s", C13721c.m55650d(aVar.mo47239a()), C13721c.m55650d(aVar.mo47240b())));
        if (isSameSpace(aVar.mo47239a())) {
            if (!aVar.mo47241c() || this.workspace.mo47624g(aVar.mo47240b())) {
                C12480j.m51940e(this, aVar.mo47240b());
            } else {
                C12480j.m51939d(this, aVar.mo47240b());
            }
            if (this.workspace.mo47620e()) {
                this.wikiList.mo5929b(Result.m51906a(WikiAction.FAVORITE, provideUiList()));
            } else {
                this.wikiList.mo5929b(Result.m51906a(WikiAction.FAVORITE, (WikiUIList) null));
            }
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.LocalPush.ILocalPushHandler
    public void onFocusChange(FocusChangeEvent cVar) {
        C12504l a;
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.onFocusChange. spaceId: %s, wikiToken: %s", C13721c.m55650d(cVar.mo47269a()), C13721c.m55650d(cVar.mo47270b())));
        WikiDevReportV2.f32880a = null;
        if (isSameSpace(cVar.mo47269a()) && (a = WikiTreeObserver.f33320a.mo47308a()) != null && isSameSpace(a.mo47627i())) {
            String b = cVar.mo47270b();
            if (a.mo47626h(b) && !C12459b.m51818b(a.mo47632k()) && !TextUtils.equals(this.focusToken, b)) {
                this.focusToken = b;
                load(a, b, true);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onUdeV3(UdeV3 udeV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.onUdeV3, udeV3: " + udeV3);
        if (!this.workspace.mo47626h(udeV3.wiki_token)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onUdeV3, node not found. ");
            return;
        }
        TreeNode treeNode = (TreeNode) reverseGetNode(udeV3.wiki_token).first;
        if (treeNode == null) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onUdeV3, reverse fail. ");
            return;
        }
        updateTitle(udeV3.wiki_token, treeNode.title);
        OfflineRenameData offlineRenameData = new OfflineRenameData();
        offlineRenameData.setNewName(treeNode.title);
        offlineRenameData.setObjToken(treeNode.obj_token);
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31495a(offlineRenameData);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void remove(String str) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.remove, wikiToken: %s", C13721c.m55650d(str)));
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.remove, node not found. ");
        } else {
            this.disposables.mo237937a(C12480j.m51934b(this, str).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$O4GZtFYqMlvkc8MjdPo6lJRVo_o */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$remove$13$i((AbstractC70022d) obj);
                }
            }).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$dZtKmEhtbGaPtc6RZSXmaEjb7Hw */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$remove$14$i((String) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$McdUQuiKQWiJ4tAFixQdoBCVcQ */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$remove$15$i((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public AbstractC68307f<WikNodePerm> requestNodePerm(String str) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.getNodePerm, wikiToken: %s", C13721c.m55650d(str)));
        TreeNode b = this.workspace.mo47611b(str);
        if (b == null) {
            return AbstractC68307f.m265084a(new Throwable("node not found. "));
        }
        if (b.perm != null) {
            return AbstractC68307f.m265083a(b.perm);
        }
        return C12455c.m51797h(this.netService).pull(new GetNodePermPuller.Params(this.workspace.mo47627i(), str)).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$XNOi2bhxJHhV3iddeWGc1oIVa4Q */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12479i.lambda$requestNodePerm$31(TreeNode.this, (WikNodePerm) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void unfavorite(String str) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.unfavorite, wikiToken: %s", C13721c.m55650d(str)));
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.unfavorite, node not found. ");
        } else {
            this.disposables.mo237937a(C12455c.m51800k(this.netService).pull(new UnfavoritePuller.Params(this.workspace.mo47627i(), str)).mo238020d(new Function(str) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$h0tXCxTzs5zznXzfqnsSjX6ZNJc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12479i.this.lambda$unfavorite$23$i(this.f$1, (Boolean) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$LbKABuUqjszV6Fju0RUGQbseEV4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$unfavorite$24$i((AbstractC70022d) obj);
                }
            }).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$nCS4FYs5NrHpV32ymPcwDN5dD5M */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$unfavorite$25$i((Boolean) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$CkBTk8U3qnAkoa9oywQOyqYh0 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$unfavorite$26$i((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onUdeNodePermV3(UdeNodePermV3 udeNodePermV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.UdeNodePermV3, UdeNodePermV3: " + udeNodePermV3);
        if (!udeNodePermV3.effect()) {
            C13479a.m54764b(this.TAG, "WikiTreeModel.UdeNodePermV3, not effect. return. ");
        } else if (!this.workspace.mo47626h(udeNodePermV3.parent) || !this.workspace.mo47628i(udeNodePermV3.parent)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.UdeNodePermV3, parent not found. ");
        } else {
            Pair<TreeNode, Throwable> reverseGetNode = reverseGetNode(udeNodePermV3.wiki_token);
            TreeNode treeNode = (TreeNode) reverseGetNode.first;
            Throwable th = (Throwable) reverseGetNode.second;
            TreeNode b = this.workspace.mo47611b(udeNodePermV3.wiki_token);
            if (treeNode != null) {
                if (b != null) {
                    b.perm = null;
                    return;
                }
                C12480j.m51930a(this, udeNodePermV3.parent, treeNode, false, "");
                this.wikiList.mo5926a(Result.m51906a(WikiAction.PUSH_UDE_NODE_PERM, provideUiList()));
            } else if (th == null || !C12477f.m51913a(th)) {
                C13479a.m54759a(this.TAG, "WikiTreeModel.UdeNodePermV3, reverse fail. ", th);
            } else if (b != null) {
                C12480j.m51938c(this, udeNodePermV3.wiki_token);
                this.wikiList.mo5926a(Result.m51906a(WikiAction.PUSH_UDE_NODE_PERM, provideUiList()));
            }
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.C12509b.AbstractC12510a
    public void onMovV3(MovV3 movV3) {
        String str = this.TAG;
        C13479a.m54764b(str, "WikiTreeModel.onMovV3, movV3: " + movV3);
        if (!this.workspace.mo47622f()) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onMovV3, space not init. ");
            return;
        }
        TreeNode b = this.workspace.mo47611b(movV3.from);
        TreeNode b2 = this.workspace.mo47611b(movV3.to);
        TreeNode b3 = this.workspace.mo47611b(movV3.wiki_token);
        if (b3 != null && !TextUtils.isEmpty(b3.parent_wiki_token) && !TextUtils.equals(b3.parent_wiki_token, movV3.from)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onMovV3, treeNode.parent and fromNode.parent no equals. return. ");
        } else if (!TextUtils.equals(movV3.new_space_id, this.workspace.mo47627i())) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onMovV3, moveNode out of origin space. return. ");
            C12480j.m51938c(this, movV3.wiki_token);
            Ok a = Result.m51906a(WikiAction.PUSH_MOV, provideUiList());
            a.mo47496e(movV3.wiki_token);
            a.mo47500g(movV3.new_space_id);
            a.mo47502h(this.focusToken);
            this.wikiList.mo5926a(a);
        } else if (b == null && b2 == null) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.onMovV3, fromNode and destNode both not found. return. ");
        } else {
            Pair<TreeNode, Throwable> reverseGetNode = reverseGetNode(movV3.wiki_token);
            TreeNode treeNode = (TreeNode) reverseGetNode.first;
            Throwable th = (Throwable) reverseGetNode.second;
            if (treeNode != null) {
                boolean c = this.workspace.mo47616c(this.focusToken, movV3.wiki_token);
                WikiRelation wikiRelation = null;
                if (c && (b2 == null || !this.workspace.mo47628i(b2.wiki_token))) {
                    try {
                        wikiRelation = C12455c.m51796g(this.netService).pull(new GetRelationPuller.Params(this.workspace.mo47627i(), movV3.to)).mo238023d();
                    } catch (Exception e) {
                        C13479a.m54765b(this.TAG, "WikiTreeModel.onMovV3, destNode not found, pull destNode fail. return. ", e);
                        if (C12477f.m51913a(e) && b3 != null) {
                            C12480j.m51938c(this, movV3.wiki_token);
                            Ok a2 = Result.m51906a(WikiAction.PUSH_MOV, provideUiList());
                            a2.mo47496e(movV3.wiki_token);
                            a2.mo47500g(movV3.new_space_id);
                            this.wikiList.mo5926a(a2);
                            return;
                        }
                        return;
                    }
                }
                C12480j.m51932a(this, movV3.wiki_token, movV3.from, movV3.to, treeNode.sort_id, c, this.focusToken, treeNode, wikiRelation);
                Ok a3 = Result.m51906a(WikiAction.PUSH_MOV, provideUiList());
                a3.mo47496e(movV3.wiki_token);
                a3.mo47500g(movV3.new_space_id);
                this.wikiList.mo5926a(a3);
            } else if (th != null && C12477f.m51913a(th)) {
                C13479a.m54773d(this.TAG, "WikiTreeModel.onMovV3, moveNode not found, pull moveNode fail. return. ", th);
                if (this.workspace.mo47626h(movV3.wiki_token)) {
                    C12480j.m51938c(this, movV3.wiki_token);
                    Ok a4 = Result.m51906a(WikiAction.PUSH_MOV, provideUiList());
                    a4.mo47496e(movV3.wiki_token);
                    a4.mo47500g(movV3.new_space_id);
                    this.wikiList.mo5926a(a4);
                }
            }
        }
    }

    public /* synthetic */ Boolean lambda$favorite$19$i(String str, Boolean bool) {
        C12480j.m51939d(this, str);
        return bool;
    }

    public /* synthetic */ Boolean lambda$unfavorite$23$i(String str, Boolean bool) {
        C12480j.m51940e(this, str);
        return bool;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public boolean isContainInParent(String str, String str2) {
        return this.workspace.mo47616c(str, str2);
    }

    public /* synthetic */ void lambda$null$5$i(String str, String str2) {
        this.workspace.mo47607a(str, str2);
    }

    public /* synthetic */ TreeNode lambda$shortcutTo$27$i(String str, TreeNode treeNode) {
        C12480j.m51930a(this, str, treeNode, false, "");
        return treeNode;
    }

    public /* synthetic */ void lambda$expand$7$i(String str, AbstractC70022d dVar) {
        Loading a = Result.m51905a(WikiAction.EXPAND);
        a.mo47504i(str);
        this.wikiList.mo5929b(a);
    }

    public /* synthetic */ void lambda$loadInternal$0$i(WikiAction wikiAction, AbstractC70022d dVar) {
        this.wikiList.mo5929b(Result.m51905a(wikiAction));
    }

    public /* synthetic */ void lambda$shortcutTo$29$i(String str, TreeNode treeNode) {
        Ok a = Result.m51906a(WikiAction.SHORTCUT, provideUiList());
        a.mo47498f(treeNode.wiki_token);
        a.mo47500g(str);
        this.wikiList.mo5929b(a);
    }

    public void updateTitle(String str, String str2) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.updateTitle, wikiToken: %s, newTitle: %s", C13721c.m55650d(str), C13721c.m55650d(str2)));
        if (this.workspace.mo47626h(str)) {
            C12480j.m51937b(this, str, str2);
            Ok a = Result.m51906a(WikiAction.PUSH_UDE_NAME, (WikiUIList) null);
            a.mo47494d(str);
            this.wikiList.mo5926a(a);
        }
    }

    public /* synthetic */ AbstractC70020b lambda$expand$6$i(String str, String str2, Boolean bool) {
        return fromCallable(new Runnable(str, str2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$meIUYLGd4LRXxUD9N1wEvHewHPg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C12479i.this.lambda$null$5$i(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$moveTo$17$i(String str, String str2, Boolean bool) {
        Ok a = Result.m51906a(WikiAction.MOV, provideUiList());
        a.mo47496e(str);
        a.mo47500g(str2);
        a.mo47502h(this.focusToken);
        this.wikiList.mo5929b(a);
    }

    public /* synthetic */ void lambda$expand$8$i(String str, AtomicReference atomicReference, Boolean bool) {
        if (bool.booleanValue()) {
            Ok a = Result.m51906a(WikiAction.EXPAND, provideUiList());
            a.mo47504i(str);
            this.wikiList.mo5929b(a);
            atomicReference.set(true);
        }
    }

    public /* synthetic */ void lambda$expand$9$i(AtomicReference atomicReference, String str, Throwable th) {
        C13479a.m54759a(this.TAG, "WikiTreeModel.expand, expand fail. ", th);
        if (!((Boolean) atomicReference.get()).booleanValue()) {
            Err a = Result.m51904a(WikiAction.EXPAND, th);
            a.mo47504i(str);
            this.wikiList.mo5929b(a);
        }
    }

    public /* synthetic */ void lambda$loadInternal$4$i(WikiAction wikiAction, AtomicReference atomicReference, Throwable th) {
        String str = this.TAG;
        C13479a.m54759a(str, "WikiTreeModel.loadInternal, load fail, action: " + wikiAction.name() + ", showing: " + atomicReference.get(), th);
        if (!((Boolean) atomicReference.get()).booleanValue()) {
            this.wikiList.mo5929b(Result.m51904a(wikiAction, th));
        }
    }

    public void load(C12504l lVar, String str, boolean z) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.load, workspace: %s, wikiToken: %s", C13721c.m55650d(lVar.mo47627i()), C13721c.m55650d(str)));
        this.workspace = lVar;
        this.workspace.mo47604a(this.dataFilter);
        if (TextUtils.isEmpty(str)) {
            str = lVar.mo47632k();
        }
        this.workspace.mo47610a(str, z);
        Ok a = Result.m51906a(WikiAction.INIT_LOAD, provideUiList());
        a.mo47488a(str);
        this.wikiList.mo5929b(a);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void load(String str, String str2, boolean z) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.load, spaceId: %s, wikiToken: %s", C13721c.m55650d(str), C13721c.m55650d(str2)));
        if (!isSameSpace(str) || !this.workspace.mo47626h(str2)) {
            loadInternal(str, str2, z, WikiAction.INIT_LOAD);
            return;
        }
        this.workspace.mo47610a(str2, z);
        Ok a = Result.m51906a(WikiAction.INIT_LOAD, provideUiList());
        a.mo47488a(str2);
        this.wikiList.mo5929b(a);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void shortcutTo(String str, String str2, String str3) {
        String str4;
        C13479a.m54775e(this.TAG, String.format("WikiTreeModel.shortcutTo, srcToken: %s, destParentToken: %s", C13721c.m55650d(str), C13721c.m55650d(str3)));
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.shortcutTo, node not found. ");
            return;
        }
        TreeNode b = this.workspace.mo47611b(str);
        if (b.isShortcut()) {
            str4 = b.origin_wiki_token;
        } else {
            str4 = b.wiki_token;
        }
        this.disposables.mo237937a(C12455c.m51768a(this.netService).pull(new CreateNodePuller.Params(str2, str3, b.title, str4, this.synergyUuid)).mo237985a(C11678b.m48478b()).mo238020d(new Function(str3) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$MaPyf7ee3JlU4vkRdg04vjLzhHE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12479i.this.lambda$shortcutTo$27$i(this.f$1, (TreeNode) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$iTjER6HdSO0VP5FfL2DsYIJo0J8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$shortcutTo$28$i((AbstractC70022d) obj);
            }
        }).mo238001b(new Consumer(str2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$U0f1ooRZnvbfOE6f0JhBadpYMc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$shortcutTo$29$i(this.f$1, (TreeNode) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$QHQ4wHj1906CTysm88NKtZVOkRw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$shortcutTo$30$i((Throwable) obj);
            }
        }));
    }

    private void loadInternal(String str, String str2, boolean z, WikiAction wikiAction) {
        if (!isSameSpace(str)) {
            unRegisterPush();
        }
        if (str2 == null) {
            str2 = "";
        }
        AtomicReference atomicReference = new AtomicReference(str2);
        AtomicReference atomicReference2 = new AtomicReference(false);
        this.disposables.mo237937a(C12480j.m51927a(this, str, (String) atomicReference.get()).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(wikiAction) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$yhhCRjMqH2uMipGFYtFFnpDCLNk */
            public final /* synthetic */ WikiAction f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$loadInternal$0$i(this.f$1, (AbstractC70022d) obj);
            }
        }).mo238001b(new Consumer(atomicReference, z, wikiAction, atomicReference2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$YJyKEjq3Z_OxK1VEjmJKSmwGIvc */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ WikiAction f$3;
            public final /* synthetic */ AtomicReference f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$loadInternal$3$i(this.f$1, this.f$2, this.f$3, this.f$4, (Boolean) obj);
            }
        }, new Consumer(wikiAction, atomicReference2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$i1h40Es1FcpoaKnnZwv2W4frxag */
            public final /* synthetic */ WikiAction f$1;
            public final /* synthetic */ AtomicReference f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$loadInternal$4$i(this.f$1, this.f$2, (Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void insert(String str, int i, boolean z, String str2) {
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.insert, parentToken: %s, forceExpand: %s", C13721c.m55650d(str), String.valueOf(z)));
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.insert, node not found. ");
        } else {
            this.disposables.mo237937a(C12480j.m51926a(this, str, i, z, str2).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$qMPd52AgH33zVdEeQbKD_ZH2_fs */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$insert$10$i((AbstractC70022d) obj);
                }
            }).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$lzmdxMgn3KqS8wdUSil_IewBdww */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$insert$11$i((String) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$G8NzvoIIitCRErtmG0tF1vEIpG4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12479i.this.lambda$insert$12$i((Throwable) obj);
                }
            }));
        }
    }

    public /* synthetic */ void lambda$loadInternal$3$i(AtomicReference atomicReference, boolean z, WikiAction wikiAction, AtomicReference atomicReference2, Boolean bool) {
        if (bool.booleanValue()) {
            if (TextUtils.isEmpty((CharSequence) atomicReference.get())) {
                atomicReference.set(this.workspace.mo47632k());
            }
            this.workspace.mo47604a(this.dataFilter);
            this.workspace.mo47610a((String) atomicReference.get(), z);
            Ok a = Result.m51906a(wikiAction, provideUiList());
            a.mo47488a((String) atomicReference.get());
            this.wikiList.mo5929b(a);
            atomicReference2.set(true);
            if (this.pushEnable) {
                registerPush();
            }
            if (!this.workspace.f33512b && this.favoriteEnable) {
                this.disposables.mo237937a(C12480j.m51924a(this).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$j3SpbMWnywBTyKb3Y8z4MpQt9w */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C12479i.this.lambda$null$1$i((Boolean) obj);
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$MTQ_Pz0UvMwB2VkpYXH9Me4wJ6Q */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C12479i.this.lambda$null$2$i((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b
    public void moveTo(String str, String str2, String str3, boolean z, String str4) {
        if (!this.workspace.mo47626h(str)) {
            C13479a.m54775e(this.TAG, "WikiTreeModel.moveTo, node not found. ");
            return;
        }
        boolean isSameSpace = isSameSpace(str2);
        C13479a.m54764b(this.TAG, String.format("WikiTreeModel.moveTo, srcToken: %s, destSpaceId: %s, destParentToken: %s, forceExpand: %s, isSameSpace: %s", C13721c.m55650d(str), C13721c.m55650d(str2), C13721c.m55650d(str3), Boolean.valueOf(z), Boolean.valueOf(isSameSpace)));
        this.disposables.mo237937a(C12480j.m51928a(this, str, str2, str3, z, str4).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$03rJJVXdqoitDYgK8C6FgdtTAM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$moveTo$16$i((AbstractC70022d) obj);
            }
        }).mo238001b(new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$mypd9_4a3ia_6MYSjruH4CpREJw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$moveTo$17$i(this.f$1, this.f$2, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$i$x9mSeChMNEMWubyC8NztBAtQPM8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12479i.this.lambda$moveTo$18$i((Throwable) obj);
            }
        }));
    }
}
