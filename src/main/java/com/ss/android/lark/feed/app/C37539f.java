package com.ss.android.lark.feed.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;
import com.bytedance.lark.sdk.Sdk;
import com.google.gson.Gson;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26251ab;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.eetroublecapture.C36969b;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.C37569g;
import com.ss.android.lark.feed.app.C37613i;
import com.ss.android.lark.feed.app.FeedListView;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.conversationbox.C37435d;
import com.ss.android.lark.feed.app.conversationbox.ConversationBoxActivity;
import com.ss.android.lark.feed.app.delayed.C37493c;
import com.ss.android.lark.feed.app.delayed.DelayedFeedActivity;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.guide.FeedTipGuideHelper;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.C37758g;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.p1849b.C37306c;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.statistics.main.MainHitPoint;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.statistics.other.MoreMenuHitPoint;
import com.ss.android.lark.feed.statistics.other.PermissionHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57858o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.f */
public class C37539f extends BaseFragment implements AbstractC36982d {

    /* renamed from: a */
    public C37613i.AbstractC37622b f96249a;

    /* renamed from: b */
    public View f96250b;

    /* renamed from: c */
    public AbstractC38037a.AbstractC38044d f96251c = C37268c.m146766b().mo139201t();

    /* renamed from: d */
    AbstractC38037a.AbstractC38041ac f96252d = C37262a.m146726a().mo139164K().mo139288a(this);

    /* renamed from: e */
    C37569g.AbstractC37582a f96253e = new C37569g.AbstractC37582a() {
        /* class com.ss.android.lark.feed.app.C37539f.C375422 */

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: a */
        public void mo137773a() {
            if (C37539f.this.f96249a != null) {
                C37539f.this.f96249a.mo138005a();
            }
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: b */
        public void mo137776b() {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37539f.C375422.RunnableC375442 */

                public void run() {
                    FragmentActivity activity = C37539f.this.getActivity();
                    if (activity != null) {
                        PermissionHitPoint.m149827a(C26251ab.m94986a(activity));
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: c */
        public void mo137778c() {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                if (DesktopUtil.m144301a((Context) activity)) {
                    C37539f.this.mo137764a(new C37493c(), "DelayedFeed");
                    return;
                }
                C57858o.m224559a(DelayedFeedActivity.class).mo196064a(activity);
            }
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: d */
        public void mo137779d() {
            List<Fragment> fragments;
            if (!(!DesktopUtil.m144307b() || (fragments = C37539f.this.getChildFragmentManager().getFragments()) == null || fragments.size() == 0)) {
                FragmentTransaction beginTransaction = C37539f.this.getChildFragmentManager().beginTransaction();
                for (Fragment fragment : fragments) {
                    beginTransaction.remove(fragment);
                }
                beginTransaction.commitAllowingStateLoss();
            }
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: b */
        public void mo137777b(int i) {
            if (C37539f.this.f96249a != null) {
                C37539f.this.f96249a.mo138006a(i);
            }
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: a */
        public void mo137774a(int i) {
            C37539f.this.f96251c.mo139227a(i);
            if (C37268c.m146766b().mo139185d()) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37539f.C375422.RunnableC375431 */

                    public void run() {
                        Context context = C37539f.this.getContext();
                        if (context != null) {
                            C37539f.this.f96251c.mo139228a(context);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.C37569g.AbstractC37582a
        /* renamed from: a */
        public void mo137775a(boolean z) {
            if (C37539f.this.f96249a != null) {
                C37539f.this.f96249a.mo138007a(z);
            }
        }
    };

    /* renamed from: f */
    private C37569g f96254f;

    /* renamed from: g */
    private AbstractC44548e f96255g;

    /* renamed from: h */
    private ITitleController f96256h;

    /* renamed from: i */
    private boolean f96257i;

    /* renamed from: j */
    private FeedListView.AbstractC37282a f96258j = new FeedListView.AbstractC37282a() {
        /* class com.ss.android.lark.feed.app.C37539f.C375401 */

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137097a(String str, ChatFeedPreview chatFeedPreview, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
            AbstractC38037a.AbstractC38047g A = C37268c.m146766b().mo139154A();
            if (chatFeedPreview.getChatType() == Chat.Type.P2P && !chatFeedPreview.isBotChat() && chatFeedPreview.getMutexMarkType() == FeedPreview.MutexMarkType.READ) {
                A.mo139240a(str, chatFeedPreview.getLastMessageId());
            } else {
                A.mo139240a(str, (String) null);
            }
            if (C37539f.this.getActivity() != null) {
                A.mo139236a(C37539f.this.getActivity(), str, chatFeedPreview.getChatMode(), chatFeedPreview.isSecret(), "feed", z ? "quick_switcher" : "feed", iGetDataCallback);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137096a(String str, int i) {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139154A().mo139237a(activity, str, true, i);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: i */
        public void mo137105i() {
            C37539f.this.mo137769b();
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: j */
        public AbstractC38037a.AbstractC38041ac mo137106j() {
            return C37539f.this.f96252d;
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: c */
        public void mo137099c() {
            C37268c.m146766b().mo139158E().mo139213a(C37539f.this.mContext);
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: d */
        public void mo137100d() {
            C37268c.m146766b().mo139158E().mo139215b(C37539f.this.mContext);
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: h */
        public void mo137104h() {
            C37268c.m146766b().mo139173a(2);
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137088a() {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139162I().mo139290b(activity);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: b */
        public void mo137098b() {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139156C().mo139242a(activity);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: e */
        public void mo137101e() {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139158E().mo139212a((Activity) activity);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: f */
        public void mo137102f() {
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139207z().mo139253a(activity);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: g */
        public void mo137103g() {
            AbstractC38037a.AbstractC38052l q = C37268c.m146766b().mo139198q();
            boolean a = q.mo139256a("invite.tenant.total.enable");
            boolean a2 = q.mo139256a("invite.tenant.gift.enable");
            FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C37268c.m146766b().mo139159F().mo139278a(activity, a, a2, a2);
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137090a(FeedListView feedListView) {
            ButterKnife.bind(feedListView, C37539f.this.f96250b);
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137091a(SubscriptionsFeedPreview subscriptionsFeedPreview) {
            C37268c.m146766b().mo139178a(subscriptionsFeedPreview.getId(), subscriptionsFeedPreview.getSchema(), "");
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137092a(DocFeedPreview docFeedPreview) {
            C37268c.m146766b().mo139196o().mo139416a();
            String docUrl = docFeedPreview.getDocUrl();
            AbstractC38037a.AbstractC38051k z = C37268c.m146766b().mo139207z();
            if (z != null) {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(docFeedPreview.getId())) {
                    hashMap.put("docId", docFeedPreview.getId());
                }
                docUrl = z.mo139252a(docFeedPreview.getDocUrl(), docFeedPreview.buildQuerys());
            }
            AbstractC38037a.AbstractC38046f u = C37268c.m146766b().mo139202u();
            Context context = C37539f.this.getContext();
            if (context != null) {
                u.mo139233a(context, docUrl, "docs_feed", docFeedPreview.buildExtra());
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137093a(LittleAppFeedPreview littleAppFeedPreview) {
            if (littleAppFeedPreview.getType() == FeedCard.Type.OPEN_APP_CHAT) {
                C37268c.m146766b().mo139179a(littleAppFeedPreview.getId(), littleAppFeedPreview.getId(), littleAppFeedPreview.getSchema(), littleAppFeedPreview.getLastAppNotificationId());
            } else {
                C37268c.m146766b().mo139178a(littleAppFeedPreview.getId(), littleAppFeedPreview.getSchema(), littleAppFeedPreview.getLastAppNotificationId());
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137094a(AbstractC51324c cVar) {
            final FragmentActivity activity = C37539f.this.getActivity();
            if (activity != null) {
                C57805b.m224331b(activity, new C57805b.AbstractC57809a() {
                    /* class com.ss.android.lark.feed.app.C37539f.C375401.C375411 */

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public void permissionGranted(boolean z) {
                        if (z) {
                            MoreMenuHitPoint.f97737a.mo139414a();
                            C37268c.m146766b().mo139162I().mo139289a(activity);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137095a(String str) {
            if (!DesktopUtil.m144307b()) {
                FragmentActivity activity = C37539f.this.getActivity();
                if (activity != null) {
                    C57858o.m224559a(ConversationBoxActivity.class).mo196058a("parent_card_id", str).mo196064a(activity);
                    return;
                }
                return;
            }
            C37435d dVar = new C37435d();
            Bundle bundle = new Bundle();
            bundle.putString("parent_card_id", str);
            dVar.setArguments(bundle);
            C37539f.this.mo137764a(dVar, "ConversationBox");
        }

        @Override // com.ss.android.lark.feed.app.FeedListView.AbstractC37282a
        /* renamed from: a */
        public void mo137089a(Bitmap bitmap, int i) {
            al.m95028a().mo93366a("key_feed_search_title", bitmap);
            C37268c.m146766b().mo139176a(C37539f.this.mContext, "key_feed_search_title", i);
            MainHitPoint.f97023a.mo138604a();
        }
    };

    /* renamed from: k */
    private AbstractC44552i.AbstractC44554b f96259k = new AbstractC44552i.AbstractC44554b() {
        /* class com.ss.android.lark.feed.app.C37539f.C375453 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44554b
        /* renamed from: a */
        public void mo137782a() {
            C37539f.this.mo137763a();
        }
    };

    /* renamed from: l */
    private FragmentManager.AbstractC1010b f96260l;

    /* renamed from: d */
    public AbstractC44552i.AbstractC44554b mo137771d() {
        return this.f96259k;
    }

    /* renamed from: a */
    public void mo137763a() {
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.mo137907d();
        }
    }

    /* renamed from: c */
    public void mo137770c() {
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.mo137905c();
        }
    }

    /* renamed from: e */
    public ITitleInfo mo137772e() {
        C37569g gVar = this.f96254f;
        if (gVar == null) {
            return null;
        }
        return gVar.mo137908e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165389i("FeedModule_FeedListFragment", "onResume");
        mo137768a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f96260l != null) {
            getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this.f96260l);
            this.f96260l = null;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Log.m165389i("FeedModule_FeedListFragment", "onStart");
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.mo137904b(FeedCard.FeedType.ALL);
        }
        FeedHitPointNew.m148845a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.m165389i("FeedModule_FeedListFragment", "onStop");
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.mo137906c(FeedCard.FeedType.ALL);
        }
    }

    public C37539f() {
    }

    /* renamed from: f */
    private void m147611f() {
        C37569g gVar = new C37569g(new FeedListView(this.f96258j, getActivity(), this.f96256h, this.f96255g, getChildFragmentManager()), new C37758g(C37731d.m148488a()), this.f96253e);
        this.f96254f = gVar;
        gVar.create();
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        try {
            List<Map<String, String>> b = C36969b.m145958b(getView().findViewById(R.id.feed_inbox_recycler_view));
            String str = "user screenshot accompanying infos:" + new Gson().toJson(b);
            Sdk.log("screenshot", str);
            Log.m165389i("FeedModule_FeedListFragment", str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.m165389i("FeedModule_FeedListFragment", "onDestroyView : mvp = " + this.f96254f);
        super.onDestroyView();
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.destroy();
        }
    }

    /* renamed from: b */
    public void mo137769b() {
        if (DesktopUtil.m144307b()) {
            C36529b bVar = new C36529b();
            Bundle bundle = new Bundle();
            bundle.putInt("holder", R.drawable.empty_default_icon);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
            EventBus.getDefault().trigger(new ChatStartEvent(null));
        }
    }

    /* renamed from: a */
    public void mo137765a(String str) {
        mo137765a(str);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public void mo137768a(boolean z) {
        C37569g gVar = this.f96254f;
        if (gVar != null) {
            gVar.mo137902a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f96252d.mo139220a(z);
        if (z) {
            FeedHitPointNew.m148845a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean a = UDUiModeUtils.m93320a(configuration);
        if (this.f96257i != a) {
            this.f96257i = a;
            C37306c.m146953a().mo137142c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Log.m165389i("FeedModule_FeedListFragment", "onWindowFocusChanged");
        if (C37713d.f96671a) {
            mo137768a(false);
        }
    }

    /* renamed from: a */
    public void mo137764a(Fragment fragment, String str) {
        if (getChildFragmentManager().findFragmentByTag(str) == null) {
            if (this.f96260l == null) {
                this.f96260l = new FragmentManager.AbstractC1010b() {
                    /* class com.ss.android.lark.feed.app.C37539f.C375464 */

                    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
                    /* renamed from: f */
                    public void mo5412f(FragmentManager fragmentManager, Fragment fragment) {
                        super.mo5412f(fragmentManager, fragment);
                        C37539f.this.mo137767a(fragment.getTag(), false);
                    }

                    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
                    /* renamed from: b */
                    public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                        super.mo5406b(fragmentManager, fragment, bundle);
                        C37539f.this.mo137767a(fragment.getTag(), true);
                    }
                };
                getChildFragmentManager().registerFragmentLifecycleCallbacks(this.f96260l, false);
            }
            mo137769b();
            getChildFragmentManager().beginTransaction().add(R.id.inbox_container, fragment, str).commitAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public void mo137766a(String str, String str2) {
        C37569g gVar;
        boolean equals = TextUtils.equals(str2, "conversation");
        if (!equals) {
            FeedTipGuideHelper.m147851a().mo137986b();
        } else {
            FeedTipGuideHelper.m147851a().mo137987c();
        }
        if (equals && !TextUtils.equals(str, str2) && (gVar = this.f96254f) != null) {
            gVar.mo137902a(false);
        }
    }

    /* renamed from: a */
    public void mo137767a(String str, boolean z) {
        int i;
        if (DesktopUtil.m144307b() && this.f96254f != null) {
            if ("ConversationBox".equals(str) || "DelayedFeed".equals(str)) {
                C37569g gVar = this.f96254f;
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                gVar.mo137897a(i);
            }
        }
    }

    public C37539f(AbstractC44548e eVar, ITitleController iTitleController, C37613i.AbstractC37622b bVar) {
        this.f96255g = eVar;
        this.f96256h = iTitleController;
        this.f96249a = bVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C37268c.m146766b().mo139195n().mo139355a("feed_create_view", null);
        View view = this.f96250b;
        if (view == null) {
            View b = C37306c.m146953a().mo137140b();
            if (b != null) {
                this.f96250b = b;
                Log.m165389i("FeedModule_FeedListFragment", "onCreateView: loadView From Cache");
            } else {
                this.f96250b = layoutInflater.inflate(R.layout.activity_chatlist, (ViewGroup) null);
                Log.m165389i("FeedModule_FeedListFragment", "onCreateView: loadView From LocalXml");
            }
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f96250b.getParent()).removeView(this.f96250b);
            Log.m165389i("FeedModule_FeedListFragment", "onCreateView: reused not detach view");
        }
        m147611f();
        C37262a.m146726a().mo139181b().mo139257a();
        C37480d.m147447a().mo137462k();
        ShortCutStausManager.m148791a().mo138567a(getContext());
        C37268c.m146766b().mo139195n().mo139354a();
        this.f96257i = UDUiModeUtils.m93319a(getContext());
        return this.f96250b;
    }
}
