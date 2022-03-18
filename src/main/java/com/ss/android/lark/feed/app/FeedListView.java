package com.ss.android.lark.feed.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.internal.DebouncingOnClickListener;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.C37623j;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.conversationbox.C37434c;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.guide.C37609c;
import com.ss.android.lark.feed.app.guide.TenantSwitchGuideAgent;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.feed.app.p1849b.C37306c;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPoint;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.team.feed.TeamFeedFragment;
import com.ss.android.lark.feed.app.view.DoneBoxContainerView;
import com.ss.android.lark.feed.app.view.InboxContainerView;
import com.ss.android.lark.feed.app.view.title.AbstractC38026b;
import com.ss.android.lark.feed.app.view.title.AbstractC38027d;
import com.ss.android.lark.feed.app.view.title.C38028e;
import com.ss.android.lark.feed.app.view.title.FeedListTitle;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.statistics.chatbox.ChatBoxHitPoint;
import com.ss.android.lark.feed.statistics.invite.InviteHitPoint;
import com.ss.android.lark.feed.statistics.shortcut.ShortcutHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58544e;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class FeedListView implements C37623j.AbstractC37626b {

    /* renamed from: a */
    FeedListTitle f95688a;

    /* renamed from: b */
    View f95689b;

    /* renamed from: c */
    TextView f95690c;

    /* renamed from: d */
    ViewStub f95691d;

    /* renamed from: e */
    DoneBoxContainerView f95692e;

    /* renamed from: f */
    public final Activity f95693f;

    /* renamed from: g */
    public final AbstractC37282a f95694g;

    /* renamed from: h */
    public final AbstractC44548e f95695h;

    /* renamed from: i */
    public AbstractC38026b f95696i;

    /* renamed from: j */
    public C37623j.AbstractC37626b.AbstractC37627a f95697j;

    /* renamed from: k */
    public FeedCard.FeedType f95698k = FeedCard.FeedType.INBOX;

    /* renamed from: l */
    public final FragmentManager f95699l;

    /* renamed from: m */
    private boolean f95700m;
    @BindView(6491)
    InboxContainerView mInboxContainer;
    @BindView(6633)
    FrameLayout mMainContentContainer;
    @BindView(6402)
    ViewGroup mRootView;
    @BindView(6970)
    View mStatusBarBlur;
    @BindView(6971)
    View mStatusBarBlurV2;

    /* renamed from: n */
    private final ITitleController f95701n;

    /* renamed from: o */
    private ITitleController.Style f95702o;

    /* renamed from: p */
    private AbstractC38027d f95703p;

    /* renamed from: q */
    private boolean f95704q;

    /* renamed from: r */
    private final FeedFgUtils.OnInitReadyCallback f95705r = new FeedFgUtils.OnInitReadyCallback() {
        /* class com.ss.android.lark.feed.app.FeedListView.C372721 */

        @Override // com.ss.android.lark.feed.common.FeedFgUtils.OnInitReadyCallback
        /* renamed from: a */
        public void mo136996a(boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.FeedListView.C372721.RunnableC372731 */

                public void run() {
                    FeedListView.this.mInboxContainer = null;
                    FeedListView.this.mMainContentContainer.removeAllViews();
                    FeedListView.this.mInboxContainer = (InboxContainerView) LayoutInflater.from(FeedListView.this.f95693f).inflate(R.layout.activity_chatlist_inbox, (ViewGroup) null, false);
                    FeedListView.this.mMainContentContainer.addView(FeedListView.this.mInboxContainer, new FrameLayout.LayoutParams(-1, -1));
                    FeedListView.this.mo137029e();
                    FeedListView.this.mo137023c(FeedCard.FeedType.INBOX);
                }
            });
        }
    };

    /* renamed from: com.ss.android.lark.feed.app.FeedListView$a */
    public interface AbstractC37282a {
        /* renamed from: a */
        void mo137088a();

        /* renamed from: a */
        void mo137089a(Bitmap bitmap, int i);

        /* renamed from: a */
        void mo137090a(FeedListView feedListView);

        /* renamed from: a */
        void mo137091a(SubscriptionsFeedPreview subscriptionsFeedPreview);

        /* renamed from: a */
        void mo137092a(DocFeedPreview docFeedPreview);

        /* renamed from: a */
        void mo137093a(LittleAppFeedPreview littleAppFeedPreview);

        /* renamed from: a */
        void mo137094a(AbstractC51324c cVar);

        /* renamed from: a */
        void mo137095a(String str);

        /* renamed from: a */
        void mo137096a(String str, int i);

        /* renamed from: a */
        void mo137097a(String str, ChatFeedPreview chatFeedPreview, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo137098b();

        /* renamed from: c */
        void mo137099c();

        /* renamed from: d */
        void mo137100d();

        /* renamed from: e */
        void mo137101e();

        /* renamed from: f */
        void mo137102f();

        /* renamed from: g */
        void mo137103g();

        /* renamed from: h */
        void mo137104h();

        /* renamed from: i */
        void mo137105i();

        /* renamed from: j */
        AbstractC38037a.AbstractC38041ac mo137106j();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137009a(UpdateRecord updateRecord) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138962a(updateRecord);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137005a(FeedCard.FeedType feedType, boolean z, boolean z2) {
        if (this.f95698k == feedType) {
            if (z2) {
                this.f95696i.mo139102c(3);
            } else if (z) {
                this.f95696i.mo139102c(0);
            } else {
                m146785d(feedType);
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137013a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
        String str;
        TenantInfo tenantInfo;
        Iterator<TenantInfo> it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                tenantInfo = null;
                break;
            }
            tenantInfo = it.next();
            if (tenantInfo.isCurrentUser()) {
                break;
            }
        }
        if (tenantInfo != null) {
            if (list.size() >= 2) {
                str = tenantInfo.getTenantName();
            }
            this.f95696i.mo139098a(new FeedListTitle.C38020b(tenantInfo.getUserId(), tenantInfo.getChatterAvatarKey(), str));
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137014a(boolean z) {
        if (z) {
            this.f95696i.mo139105e();
        } else {
            this.f95696i.mo139117k();
        }
    }

    /* renamed from: a */
    public void mo137007a(UIFeedCard uIFeedCard) {
        if (!TextUtils.isEmpty(uIFeedCard.getParentCardId()) && !uIFeedCard.getParentCardId().equals("0") && uIFeedCard.getType() == FeedCard.Type.CHAT) {
            String a = new C37434c().mo137351a((ChatFeedPreview) uIFeedCard);
            if (!TextUtils.isEmpty(a)) {
                ChatBoxHitPoint.f97733a.mo139411a(a, "quickswitcher");
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137012a(String str, ChatFeedPreview chatFeedPreview, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f95694g.mo137097a(str, chatFeedPreview, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137011a(String str) {
        LKUIToast.show(this.f95693f, str);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137006a(FeedPreview feedPreview) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138961a(feedPreview);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137010a(StrongGuideInfo dVar) {
        AbstractC38037a.AbstractC38055o y = C37262a.m146726a().mo139206y();
        if (dVar.mo139398b()) {
            y.mo139269b(this.f95693f, "feed_menu", dVar);
        } else {
            y.mo139265a(this.f95693f, "feed_menu", dVar);
        }
        FeedHitPointNew.m148856a(dVar.mo139399c(), Integer.toString(dVar.mo139401e()));
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: g */
    public void mo137031g() {
        this.f95694g.mo137098b();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: h */
    public void mo137032h() {
        this.f95694g.mo137099c();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: i */
    public void mo137033i() {
        this.f95694g.mo137100d();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: j */
    public void mo137034j() {
        this.f95694g.mo137101e();
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: l */
    public void mo137036l() {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138979g();
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: n */
    public void mo137038n() {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138970c();
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: o */
    public void mo137039o() {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138958a();
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo136998a() {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138980h();
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138861b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC37282a aVar = this.f95694g;
        if (aVar != null) {
            aVar.mo137090a(this);
            mo137021c();
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: p */
    public void mo137040p() {
        C37262a.m146726a().mo139157D().mo139306a(this.f95693f);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: q */
    public ITitleInfo mo137041q() {
        AbstractC38026b bVar = this.f95696i;
        if (bVar == null) {
            return null;
        }
        return bVar.getTitleInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo137021c() {
        m146790v();
        m146787s();
        mo137029e();
        mo137023c(FeedCard.FeedType.INBOX);
        FeedFgUtils.m146774c(this.f95705r);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo137026d();
        C37306c.m146953a().mo137142c();
        C37711b.m148269a().mo138228b();
    }

    /* renamed from: r */
    private FeedListTitle m146786r() {
        if (this.f95688a == null) {
            FeedListTitle feedListTitle = new FeedListTitle(this.mRootView.getContext());
            feedListTitle.setId(R.id.titlebar);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10);
            feedListTitle.setOrientation(1);
            feedListTitle.setPadding(0, 0, 0, UIHelper.dp2px(2.5f));
            this.mRootView.addView(feedListTitle, layoutParams);
            this.f95688a = feedListTitle;
        }
        return this.f95688a;
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public UIFeedCard mo137015b() {
        DoneBoxContainerView doneBoxContainerView;
        if (this.f95698k == FeedCard.FeedType.INBOX) {
            InboxContainerView inboxContainerView = this.mInboxContainer;
            if (inboxContainerView != null) {
                return inboxContainerView.mo138956a((Boolean) false);
            }
            return null;
        } else if (this.f95698k != FeedCard.FeedType.DONE || (doneBoxContainerView = this.f95692e) == null) {
            return null;
        } else {
            doneBoxContainerView.mo138862c();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo137026d() {
        this.f95696i.mo139104d();
        this.mInboxContainer.mo138978f();
        FeedFgUtils.m146776d(this.f95705r);
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138864e();
        }
    }

    /* renamed from: e */
    public void mo137029e() {
        this.mInboxContainer.mo138960a(this.f95693f);
        this.mInboxContainer.mo138963a(this.f95696i, this.f95703p);
        this.mInboxContainer.setInboxContainerListener(new InboxContainerView.AbstractC37958c() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass29 */

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137057a() {
                FeedListView.this.f95697j.mo137972j();
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: c */
            public void mo137069c() {
                FeedListView.this.f95697j.mo137974l();
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: b */
            public boolean mo137068b() {
                return FeedListView.this.f95697j.mo137973k();
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137060a(FeedFilter feedFilter) {
                if (feedFilter == FeedFilter.TEAM) {
                    FeedListView.this.mInboxContainer.mo138974d(true);
                    return;
                }
                FeedListView.this.mInboxContainer.mo138974d(false);
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137956a(feedFilter);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137061a(FeedPreview feedPreview) {
                Log.m165389i("FeedModule_FeedListView", "onInBoxItemDone() called with: feedPreview = [" + feedPreview.getId() + "]");
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137957a(feedPreview);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137065a(List<UIFeedCard> list) {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137961a(list);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137058a(int i, UIFeedCard uIFeedCard) {
                if (uIFeedCard instanceof FeedPreview) {
                    FeedListView.this.f95697j.mo137953a(FeedCard.FeedType.INBOX, i, (FeedPreview) uIFeedCard);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: b */
            public void mo137067b(FeedPreview feedPreview, boolean z) {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137963b(feedPreview, z);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: c */
            public void mo137070c(FeedPreview feedPreview, boolean z) {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137965c(feedPreview, z);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137059a(View view, UIFeedCard uIFeedCard) {
                FeedListView.this.mo137002a(view, uIFeedCard);
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: b */
            public void mo137066b(View view, UIFeedCard uIFeedCard) {
                ShortcutHitPoint.m149836a(uIFeedCard);
                boolean z = true;
                if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
                    C37268c.m146766b().mo139196o().mo139418c();
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) uIFeedCard;
                    if (chatFeedPreview.isBotChat()) {
                        FeedListView.this.f95694g.mo137104h();
                    }
                    FeedListView.this.mo137001a((View) null, chatFeedPreview, true);
                    FeedListView.this.mo137007a(uIFeedCard);
                } else if (uIFeedCard.getType() == FeedCard.Type.DOC) {
                    FeedListView.this.f95694g.mo137092a((DocFeedPreview) uIFeedCard);
                } else if (uIFeedCard.getType() == FeedCard.Type.APP) {
                    FeedListView.this.f95694g.mo137093a((LittleAppFeedPreview) uIFeedCard);
                } else if (uIFeedCard.getType() == FeedCard.Type.SUBSCRIPTION) {
                    FeedListView.this.f95694g.mo137091a((SubscriptionsFeedPreview) uIFeedCard);
                }
                String id = uIFeedCard.getId();
                if (uIFeedCard.getType() != FeedCard.Type.DOC) {
                    z = false;
                }
                FeedHitPointNew.m148855a(id, z);
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137062a(FeedPreview feedPreview, boolean z) {
                Log.m165389i("FeedModule_FeedListView", "InboxItemMarkLatter:" + feedPreview.getId() + " markLatter:" + z);
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137958a(feedPreview, z);
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137063a(UIFeedCard uIFeedCard, int i) {
                Log.m165389i("FeedModule_FeedListView", "ShortcutItemMove:" + uIFeedCard.getId() + " position:" + i);
                FeedListView.this.f95697j.mo137960a(uIFeedCard, i);
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37958c
            /* renamed from: a */
            public void mo137064a(UIFeedCard uIFeedCard, boolean z) {
                Log.m165389i("FeedModule_FeedListView", "InboxItemSwiped:" + uIFeedCard.getId());
                FeedListView.this.f95697j.mo137959a(uIFeedCard);
                if (z) {
                    FeedListView.this.f95694g.mo137105i();
                }
                if (C37631m.m148018a(uIFeedCard)) {
                    C37631m.m148017a(FeedListView.this.f95693f);
                }
            }
        });
        this.mInboxContainer.setFirstPageViewListener(new InboxContainerView.AbstractC37957b() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass30 */

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37957b
            /* renamed from: a */
            public void mo137072a() {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137970h();
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37957b
            /* renamed from: b */
            public void mo137073b() {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137971i();
                }
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37957b
            /* renamed from: c */
            public void mo137074c() {
                if (FeedListView.this.f95697j != null) {
                    FeedListView.this.f95697j.mo137962b();
                }
            }
        });
        this.mInboxContainer.setBoxContainerDependency(new InboxContainerView.AbstractC37956a() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass31 */

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37956a
            /* renamed from: a */
            public int mo137075a() {
                return FeedListView.this.f95696i.mo139094a(FeedCard.FeedType.INBOX);
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37956a
            /* renamed from: b */
            public int mo137077b() {
                if (!FeedListView.this.f95696i.mo139103c()) {
                    return 0;
                }
                return FeedListView.this.f95696i.getCurrentHeight();
            }

            @Override // com.ss.android.lark.feed.app.view.InboxContainerView.AbstractC37956a
            /* renamed from: a */
            public void mo137076a(int i, TeamFeedFragment cVar) {
                FragmentTransaction beginTransaction = FeedListView.this.f95699l.beginTransaction();
                beginTransaction.add(i, cVar, "team");
                beginTransaction.commitNowAllowingStateLoss();
            }
        });
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: k */
    public void mo137035k() {
        ITitleController.Style style;
        ITitleController iTitleController = this.f95701n;
        if (iTitleController == null) {
            style = ITitleController.Style.Old;
        } else {
            style = iTitleController.mo99193b();
        }
        this.f95702o = style;
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138977e();
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138865f();
        }
        m146787s();
        this.mInboxContainer.mo138963a(this.f95696i, this.f95703p);
        DoneBoxContainerView doneBoxContainerView2 = this.f95692e;
        if (doneBoxContainerView2 != null) {
            doneBoxContainerView2.mo138859a(this.f95696i, this.f95703p);
        }
        AbstractC38026b bVar = this.f95696i;
        bVar.mo139096a(bVar.getOriginSearchLayoutHeight());
    }

    /* renamed from: s */
    private void m146787s() {
        ITitleController iTitleController = this.f95701n;
        if (iTitleController == null || iTitleController.mo99193b() == ITitleController.Style.Old) {
            this.f95696i = m146786r();
            this.f95688a.setVisibility(0);
            C37609c.C37610a.m147869a(ITitleController.Style.Old);
        } else {
            AbstractC38026b bVar = this.f95696i;
            if (bVar == null || !(bVar instanceof C38028e)) {
                this.f95696i = new C38028e(this.f95701n);
            }
            FeedListTitle feedListTitle = this.f95688a;
            if (feedListTitle != null) {
                feedListTitle.setVisibility(8);
            }
            C37609c.C37610a.m147869a(ITitleController.Style.New);
        }
        this.f95696i.mo139097a(this.mRootView);
        this.f95703p = new AbstractC38027d() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass12 */

            @Override // com.ss.android.lark.feed.app.view.title.AbstractC38027d
            /* renamed from: a */
            public void mo137044a(boolean z, int i, FeedCard.FeedType feedType) {
                if (feedType == FeedListView.this.f95698k) {
                    if (!z) {
                        FeedListView.this.f95696i.mo139099a(false);
                        FeedListView.this.mo137025c(true);
                    } else {
                        FeedListView.this.mo137025c(false);
                        FeedListView.this.f95696i.mo139099a(true);
                    }
                    FeedListView.this.f95696i.mo139096a(i);
                }
            }
        };
        this.f95696i.setOnTitleClickListener(new FeedListTitle.AbstractC38019a() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass23 */

            @Override // com.ss.android.lark.feed.app.view.title.FeedListTitle.AbstractC38019a
            /* renamed from: c */
            public void mo137051c() {
                if (FeedListView.this.f95695h != null) {
                    FeedListView.this.f95695h.aS_();
                }
            }

            @Override // com.ss.android.lark.feed.app.view.title.FeedListTitle.AbstractC38019a
            /* renamed from: b */
            public void mo137050b() {
                Log.m165389i("FeedModule_FeedListView", "onClick: showMoreMenu");
                FeedListView.this.mo137030f();
                FeedHitPointNew.m148852a(FeedHitPointNew.NavigationTopClickParam.FEED_PLUS);
            }

            @Override // com.ss.android.lark.feed.app.view.title.FeedListTitle.AbstractC38019a
            /* renamed from: a */
            public void mo137048a() {
                Log.m165389i("FeedModule_FeedListView", "onClick: startSearchActivity");
                FeedListView.this.f95694g.mo137089a(FeedListView.this.f95696i.getTitleLayoutBitmap(), FeedListView.this.f95696i.getTitleHeight());
                FeedHitPointNew.m148852a(FeedHitPointNew.NavigationTopClickParam.SEARCH);
            }

            @Override // com.ss.android.lark.feed.app.view.title.FeedListTitle.AbstractC38019a
            /* renamed from: a */
            public void mo137049a(View view) {
                FeedListView.this.mo137000a(view);
            }
        });
    }

    /* renamed from: t */
    private void m146788t() {
        String str;
        ViewStub viewStub = (ViewStub) this.f95693f.findViewById(R.id.done_box_stub);
        this.f95691d = viewStub;
        if (viewStub != null) {
            viewStub.setVisibility(0);
        }
        if (this.f95692e == null) {
            DoneBoxContainerView doneBoxContainerView = (DoneBoxContainerView) this.f95693f.findViewById(R.id.done_box_container);
            this.f95692e = doneBoxContainerView;
            doneBoxContainerView.mo138859a(this.f95696i, this.f95703p);
            DoneBoxContainerView doneBoxContainerView2 = this.f95692e;
            if (doneBoxContainerView2 == null) {
                if (("inflateDoneBoxContainerView failed: DoneBoxViewStub is " + this.f95691d) == null) {
                    str = "null";
                } else {
                    str = "not null";
                }
                Log.m165383e("FeedModule_FeedListView", str);
                return;
            }
            doneBoxContainerView2.setDoneBoxContainerListener(new DoneBoxContainerView.AbstractC37921b() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass34 */

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37921b
                /* renamed from: a */
                public void mo137078a(View view, UIFeedCard uIFeedCard) {
                    FeedListView.this.mo137002a(view, uIFeedCard);
                }

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37921b
                /* renamed from: a */
                public void mo137079a(FeedPreview feedPreview, boolean z) {
                    if (FeedListView.this.f95697j != null) {
                        FeedListView.this.f95697j.mo137958a(feedPreview, z);
                    }
                }

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37921b
                /* renamed from: b */
                public void mo137080b(FeedPreview feedPreview, boolean z) {
                    if (FeedListView.this.f95697j != null) {
                        FeedListView.this.f95697j.mo137963b(feedPreview, z);
                    }
                }

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37921b
                /* renamed from: c */
                public void mo137081c(FeedPreview feedPreview, boolean z) {
                    if (FeedListView.this.f95697j != null) {
                        FeedListView.this.f95697j.mo137965c(feedPreview, z);
                    }
                }
            });
            this.f95692e.setBoxContainerDependency(new DoneBoxContainerView.AbstractC37920a() {
                /* class com.ss.android.lark.feed.app.FeedListView.C372742 */

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37920a
                /* renamed from: a */
                public int mo137045a() {
                    return FeedListView.this.f95696i.mo139094a(FeedCard.FeedType.DONE);
                }

                @Override // com.ss.android.lark.feed.app.view.DoneBoxContainerView.AbstractC37920a
                /* renamed from: b */
                public int mo137046b() {
                    if (!FeedListView.this.f95696i.mo139103c()) {
                        return 0;
                    }
                    return FeedListView.this.f95696i.getCurrentHeight();
                }
            });
        }
    }

    /* renamed from: u */
    private void m146789u() {
        ViewStub viewStub = (ViewStub) this.f95693f.findViewById(R.id.ding_pocket_btn_stub);
        if (viewStub != null) {
            viewStub.setVisibility(0);
        }
        if (this.f95689b == null) {
            View findViewById = this.f95693f.findViewById(R.id.ding_pocket_btn);
            this.f95689b = findViewById;
            if (findViewById == null) {
                Log.m165383e("FeedModule_FeedListView", "inflateDingPocket Failed!!!!!");
                return;
            }
            findViewById.setOnClickListener(new AbstractView$OnClickListenerC58544e(1.1f) {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass22 */

                @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58544e
                /* renamed from: a */
                public void mo137047a(View view) {
                    FeedListView.this.f95697j.mo137951a();
                }
            });
            this.f95690c = (TextView) this.f95689b.findViewById(R.id.ding_count_text);
        }
    }

    /* renamed from: v */
    private void m146790v() {
        boolean z = true;
        if (!C37262a.m146726a().mo139181b().mo139260a("mobile_switch_team_guidance_v2") || !C37262a.m146726a().mo139181b().mo139260a("pc_multi_tenant") || C37262a.m146726a().mo139200s().mo139324c() <= 1 || !C37262a.m146726a().mo139198q().mo139256a("mobile_switch_team_guidance")) {
            z = false;
        }
        this.f95704q = z;
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: m */
    public void mo137037m() {
        if (!this.mInboxContainer.mo138965a(FeedFilter.DELAYED)) {
            new C25639g(this.f95693f).mo89254m(R.string.Lark_Feed_MarkForLaterDirection).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Feed_MarkForLaterDirectioButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass27 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C37268c.m146766b().mo139174a(FeedListView.this.f95693f, FeedFilter.DELAYED.getValue());
                    FeedHitPoint.m148863a(true);
                    FeedHitPointNew.m148846a(FeedHitPointNew.FeedDelayedPopupClickParam.OPEN);
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Feed_GotIt, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass26 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    FeedHitPoint.m148863a(false);
                    FeedHitPointNew.m148846a(FeedHitPointNew.FeedDelayedPopupClickParam.ESC);
                }
            }).mo89239c();
            FeedHitPoint.m148872h();
            FeedHitPointNew.m148859c();
        }
    }

    /* renamed from: f */
    public void mo137030f() {
        int i;
        Drawable drawable;
        View inflate = LayoutInflater.from(this.f95693f).inflate(R.layout.activity_chatlist_popupwindow, (ViewGroup) null);
        final Dialog a = C57811b.m224342a((Context) this.f95693f, inflate, (int) R.style.feedPlusDialog, true);
        if (DesktopUtil.m144301a((Context) this.f95693f)) {
            m146783a(inflate, a);
        } else {
            C57810a.m224337a(this.f95693f, a, new float[]{BitmapDescriptorFactory.HUE_RED, 13.0f});
            FeedHitPointNew.m148857b();
        }
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.View$OnClickListenerC372753 */

            public void onClick(View view) {
                a.dismiss();
            }
        });
        final AbstractC38037a.AbstractC38039aa E = C37268c.m146766b().mo139158E();
        E.mo139214a();
        final View findViewById = inflate.findViewById(R.id.layout_local_share);
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372764 */

            /* renamed from: a */
            public Boolean produce() {
                return Boolean.valueOf(E.mo139214a());
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372775 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                if (bool.booleanValue()) {
                    UIUtils.show(findViewById);
                } else {
                    UIUtils.hide(findViewById);
                }
            }
        });
        E.mo139216b();
        final View findViewById2 = inflate.findViewById(R.id.layout_join_meeting);
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372786 */

            /* renamed from: a */
            public Boolean produce() {
                return Boolean.valueOf(E.mo139216b());
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372797 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                if (bool.booleanValue()) {
                    UIUtils.show(findViewById2);
                } else {
                    UIUtils.hide(findViewById2);
                }
            }
        });
        E.mo139217c();
        final View findViewById3 = inflate.findViewById(R.id.layout_create_meeting);
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372808 */

            /* renamed from: a */
            public Boolean produce() {
                return Boolean.valueOf(E.mo139217c());
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.feed.app.FeedListView.C372819 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                if (bool.booleanValue()) {
                    UIUtils.show(findViewById3);
                } else {
                    UIUtils.hide(findViewById3);
                }
            }
        });
        AbstractC38037a.AbstractC38052l q = C37268c.m146766b().mo139198q();
        View findViewById4 = inflate.findViewById(R.id.layout_add_member);
        boolean c = C37262a.m146726a().mo139206y().mo139273c();
        if (c) {
            findViewById4.setVisibility(0);
            findViewById4.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass10 */

                public void onClick(View view) {
                    C37262a.m146726a().mo139206y().mo139268b(FeedListView.this.f95693f);
                    a.dismiss();
                    InviteHitPoint.m149824a();
                }
            });
        } else {
            findViewById4.setVisibility(8);
        }
        m146784a(c, inflate, a);
        inflate.findViewById(R.id.btn_scan_qrcode).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                a.dismiss();
                if (!DesktopUtil.m144301a((Context) FeedListView.this.f95693f)) {
                    FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.SCAN_QR_CODE);
                    FeedListView.this.f95694g.mo137094a((AbstractC51324c) null);
                    return;
                }
                FeedListView.this.f95694g.mo137088a();
            }
        });
        inflate.findViewById(R.id.layout_local_share).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.SHARE_SCREEN);
                FeedListView.this.f95697j.mo137967e();
            }
        });
        inflate.findViewById(R.id.layout_join_meeting).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass14 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.JOIN_MEETING);
                FeedListView.this.f95697j.mo137968f();
            }
        });
        inflate.findViewById(R.id.layout_create_meeting).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.NEW_MEETING);
                FeedListView.this.f95697j.mo137969g();
            }
        });
        inflate.findViewById(R.id.btn_create_group).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.GROUP_CREATE);
                FeedListView.this.f95697j.mo137964c();
            }
        });
        View findViewById5 = inflate.findViewById(R.id.layout_create_team);
        if (C37268c.m146766b().mo139157D().mo139310a()) {
            findViewById5.setVisibility(0);
            findViewById5.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass17 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.CREATE_TEAM);
                    a.dismiss();
                    FeedListView.this.f95697j.mo137966d();
                }
            });
        } else {
            findViewById5.setVisibility(8);
            findViewById5.setOnClickListener(null);
        }
        inflate.findViewById(R.id.btn_create_doc).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass18 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.CREATE_DOCS);
                FeedListView.this.f95694g.mo137102f();
            }
        });
        View findViewById6 = inflate.findViewById(R.id.layout_invite_new_tenant);
        if (q.mo139256a("invite.tenant.enable")) {
            findViewById6.setVisibility(0);
            TextView textView = (TextView) findViewById6.findViewById(R.id.invite_new_tenant_tv);
            ImageView imageView = (ImageView) findViewById6.findViewById(R.id.invite_new_tenant_iv);
            final boolean a2 = q.mo139256a("invite.tenant.gift.enable");
            if (a2) {
                i = R.string.Lark_UserGrowth_InviteTenantWithReward;
            } else {
                i = R.string.Lark_UserGrowth_InviteTenantWithoutReward;
            }
            textView.setText(UIHelper.mustacheFormat(i));
            if (a2) {
                FeedHitPoint.m148866c();
                drawable = C0215a.m655b(this.f95693f, R.drawable.ud_icon_gift_outlined);
            } else {
                FeedHitPoint.m148868d();
                drawable = C0215a.m655b(this.f95693f, R.drawable.ic_svg_home_more_invite_no_gift);
            }
            imageView.setImageDrawable(drawable);
            findViewById6.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass19 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    Dialog dialog = a;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    FeedListView.this.f95694g.mo137103g();
                    if (a2) {
                        FeedHitPoint.m148861a();
                    } else {
                        FeedHitPoint.m148864b();
                    }
                }
            });
            return;
        }
        findViewById6.setVisibility(8);
    }

    /* renamed from: a */
    public void setViewDelegate(C37623j.AbstractC37626b.AbstractC37627a aVar) {
        this.f95697j = aVar;
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo136999a(int i) {
        this.f95688a.mo139101b(i);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public void mo137018b(FeedPreview feedPreview) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138967b(feedPreview);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: c */
    public void mo137024c(UpdateRecord updateRecord) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138968b(updateRecord);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: d */
    public void mo137027d(UpdateRecord updateRecord) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138971c(updateRecord);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public void mo137019b(UpdateRecord updateRecord) {
        if (this.f95700m) {
            m146788t();
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138858a(updateRecord);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: c */
    public void mo137022c(int i) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138959a(i);
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138857a(i);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: d */
    public void mo137028d(boolean z) {
        InboxContainerView inboxContainerView = this.mInboxContainer;
        if (inboxContainerView != null) {
            inboxContainerView.mo138969b(z);
        }
    }

    /* renamed from: d */
    private void m146785d(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            this.f95696i.mo139102c(1);
        } else if (feedType == FeedCard.FeedType.DONE) {
            this.f95696i.mo139102c(2);
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public void mo137017b(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            InboxContainerView inboxContainerView = this.mInboxContainer;
            if (inboxContainerView != null) {
                inboxContainerView.mo138982j();
                return;
            }
            return;
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138867h();
        }
    }

    /* renamed from: a */
    public void mo137000a(View view) {
        if (!TenantSwitchGuideAgent.f96449a.mo137998a() && this.f95704q && view.getWidth() > 0 && view.getHeight() > 0) {
            C37262a.m146726a().mo139181b().mo139259a(view, this.f95693f, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_NewTeamGuide), UIHelper.getString(R.string.Lark_Legacy_Next), new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass28 */

                public void onClick(View view) {
                    if (FeedListView.this.f95695h != null) {
                        FeedListView.this.f95695h.aS_();
                    }
                }
            });
            FeedHitPoint.m148869e();
        }
    }

    /* renamed from: c */
    public void mo137023c(FeedCard.FeedType feedType) {
        this.f95698k = feedType;
        if (feedType == FeedCard.FeedType.INBOX) {
            this.mInboxContainer.setVisibility(0);
            this.mInboxContainer.mo138973d();
            DoneBoxContainerView doneBoxContainerView = this.f95692e;
            if (doneBoxContainerView != null) {
                doneBoxContainerView.setVisibility(8);
            }
        } else if (feedType == FeedCard.FeedType.DONE) {
            this.mInboxContainer.setVisibility(8);
            this.f95700m = true;
            m146788t();
            DoneBoxContainerView doneBoxContainerView2 = this.f95692e;
            if (doneBoxContainerView2 != null) {
                doneBoxContainerView2.mo138863d();
                this.f95692e.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public void mo137016b(int i) {
        if (!DesktopUtil.m144301a((Context) this.f95693f)) {
            if (i > 0) {
                m146789u();
                View view = this.f95689b;
                if (view != null) {
                    view.setVisibility(0);
                    if (i > 99) {
                        i = 99;
                    }
                    this.f95690c.setText(String.valueOf(i));
                    this.f95694g.mo137106j().mo139219a(this.f95689b);
                    return;
                }
                return;
            }
            View view2 = this.f95689b;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public void mo137025c(boolean z) {
        int i;
        if (FeedFgUtils.m146773b()) {
            this.mStatusBarBlur.setVisibility(8);
            return;
        }
        View view = this.mStatusBarBlur;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.mStatusBarBlurV2.setVisibility(8);
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: b */
    public void mo137020b(boolean z) {
        if (z) {
            this.f95696i.mo139106f();
        } else {
            this.f95696i.mo139116j();
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137003a(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            InboxContainerView inboxContainerView = this.mInboxContainer;
            if (inboxContainerView != null) {
                inboxContainerView.mo138981i();
                return;
            }
            return;
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138866g();
        }
    }

    /* renamed from: a */
    private void m146783a(View view, Dialog dialog) {
        boolean z;
        AbstractC38037a.AbstractC38052l q = C37268c.m146766b().mo139198q();
        view.setBackgroundResource(R.drawable.feed_menu_desktop_bg);
        view.findViewById(R.id.chatlist_popup_content).setBackground(null);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.findViewById(R.id.btn_scan_qrcode).setBackgroundResource(R.drawable.dialog_list_top_item_selector);
        view.findViewById(R.id.btn_create_group).setBackgroundResource(R.drawable.dialog_list_center_item_selector);
        view.findViewById(R.id.btn_create_doc).setBackgroundResource(R.drawable.dialog_list_center_item_selector);
        view.findViewById(R.id.layout_add_contact).setBackgroundResource(R.drawable.dialog_list_center_item_selector);
        view.findViewById(R.id.layout_create_meeting).setBackgroundResource(R.drawable.dialog_list_center_item_selector);
        view.findViewById(R.id.layout_join_meeting).setBackgroundResource(R.drawable.dialog_list_bottom_item_selector);
        if (!q.mo139256a("lark.android.lkp.scan_code") || !RomUtils.m94953h()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            view.findViewById(R.id.btn_scan_qrcode).getLayoutParams().height = 0;
            view.findViewById(R.id.btn_create_group).setBackgroundResource(R.drawable.dialog_list_top_item_selector);
        }
        if (q.mo139256a("invite.tenant.enable")) {
            view.findViewById(R.id.layout_join_meeting).setBackgroundResource(R.drawable.dialog_list_center_item_selector);
            view.findViewById(R.id.layout_invite_new_tenant).setBackgroundResource(R.drawable.dialog_list_bottom_item_selector);
        }
        float[] fArr = {((float) UIUtils.px2dp(this.f95693f, ((float) C36512a.m144041a().mo134753a(ContainerType.Left).right) - (((float) view.getMeasuredWidth()) / 2.0f))) - 32.0f, 65.0f};
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass24 */

            public void onShow(DialogInterface dialogInterface) {
                ImageView imageView = (ImageView) FeedListView.this.mRootView.findViewById(R.id.more);
                if (imageView != null) {
                    imageView.setColorFilter(ContextCompat.getColor(FeedListView.this.mRootView.getContext(), R.color.lkui_B500), PorterDuff.Mode.SRC_ATOP);
                }
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass25 */

            public void onDismiss(DialogInterface dialogInterface) {
                ImageView imageView = (ImageView) FeedListView.this.mRootView.findViewById(R.id.more);
                if (imageView != null) {
                    imageView.setColorFilter((ColorFilter) null);
                }
            }
        });
        C57810a.m224338b(this.f95693f, dialog, fArr);
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setDimAmount(BitmapDescriptorFactory.HUE_RED);
        dialog.getWindow().setWindowAnimations(-1);
    }

    /* renamed from: a */
    public void mo137002a(View view, UIFeedCard uIFeedCard) {
        if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
            C37268c.m146766b().mo139196o().mo139417b();
            ChatFeedPreview chatFeedPreview = (ChatFeedPreview) uIFeedCard;
            if (chatFeedPreview.isBotChat()) {
                this.f95694g.mo137104h();
            }
            mo137001a(view, chatFeedPreview, false);
        } else if (uIFeedCard.getType() == FeedCard.Type.DOC) {
            DocFeedPreview docFeedPreview = (DocFeedPreview) uIFeedCard;
            this.f95694g.mo137092a(docFeedPreview);
            this.f95697j.mo137955a(docFeedPreview);
        } else if (uIFeedCard.getType() == FeedCard.Type.BOX) {
            this.f95694g.mo137095a(((BoxFeedPreview) uIFeedCard).getId());
        } else if (uIFeedCard.getType() == FeedCard.Type.THREAD || uIFeedCard.getType() == FeedCard.Type.TOPIC) {
            this.f95694g.mo137096a(uIFeedCard.getId(), uIFeedCard.getType().getNumber());
        } else if (uIFeedCard instanceof BannerPreview) {
            this.f95697j.mo137954a((BannerPreview) uIFeedCard);
        } else if (uIFeedCard.getType() == FeedCard.Type.APP) {
            this.f95694g.mo137093a((LittleAppFeedPreview) uIFeedCard);
        } else if (uIFeedCard.getType() == FeedCard.Type.SUBSCRIPTION) {
            this.f95694g.mo137091a((SubscriptionsFeedPreview) uIFeedCard);
        }
        String id = uIFeedCard.getId();
        String lowerCase = uIFeedCard.getType().name().toLowerCase(Locale.ROOT);
        if (uIFeedCard.getType() == FeedCard.Type.DOC) {
            FeedHitPointNew.m148848a(FeedHitPointNew.FeedMainClickParam.FEED_LEFTCLICK_DOC, new HashMap<String, String>(id) {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass32 */
                private static final long serialVersionUID = -3129242441886905660L;
                final /* synthetic */ String val$id;

                {
                    this.val$id = r2;
                    put("file_id", r2);
                }
            });
        } else {
            FeedHitPointNew.m148848a(FeedHitPointNew.FeedMainClickParam.FEED_LEFTCLICK_CHAT, new HashMap<String, String>(id, lowerCase) {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass33 */
                private static final long serialVersionUID = 9072973575359491305L;
                final /* synthetic */ String val$feedType;
                final /* synthetic */ String val$id;

                {
                    this.val$id = r2;
                    this.val$feedType = r3;
                    put("chat_id", r2);
                    put("feed_type", r3);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b
    /* renamed from: a */
    public void mo137004a(FeedCard.FeedType feedType, boolean z) {
        if (feedType == FeedCard.FeedType.INBOX) {
            InboxContainerView inboxContainerView = this.mInboxContainer;
            if (inboxContainerView != null) {
                inboxContainerView.mo138972c(z);
                return;
            }
            return;
        }
        DoneBoxContainerView doneBoxContainerView = this.f95692e;
        if (doneBoxContainerView != null) {
            doneBoxContainerView.mo138860a(z);
        }
    }

    /* renamed from: a */
    public void mo137001a(View view, ChatFeedPreview chatFeedPreview, boolean z) {
        C37623j.AbstractC37626b.AbstractC37627a aVar = this.f95697j;
        if (aVar != null) {
            aVar.mo137952a(view, chatFeedPreview, z);
        }
    }

    /* renamed from: a */
    private void m146784a(final boolean z, View view, final Dialog dialog) {
        View findViewById = view.findViewById(R.id.layout_add_contact);
        if (!C37262a.m146726a().mo139206y().mo139275e()) {
            UIUtils.hide(findViewById);
            return;
        }
        UIUtils.show(findViewById);
        TextView textView = (TextView) view.findViewById(R.id.add_friend_tv);
        final AbstractC38037a.AbstractC38055o y = C37262a.m146726a().mo139206y();
        if (y.mo139267a()) {
            final boolean b = y.mo139271b();
            if (C37262a.m146726a().mo139156C().mo139243a() && y.mo139274d()) {
                textView.setText(y.mo139277g());
            } else if (b) {
                textView.setText(R.string.Lark_UserGrowth_InvitePeopleEntry);
            } else {
                textView.setText(y.mo139277g());
            }
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass20 */

                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View view) {
                    dialog.dismiss();
                    y.mo139272c(FeedListView.this.f95693f);
                    if (z) {
                        InviteHitPoint.m149825a(2);
                    } else if (b) {
                        InviteHitPoint.m149825a(1);
                    } else {
                        InviteHitPoint.m149825a(0);
                    }
                    FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.IM_CONTACT_ADD_EXTERNAL_VIEW);
                }
            });
            return;
        }
        textView.setText(y.mo139277g());
        findViewById.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.feed.app.FeedListView.AnonymousClass21 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                dialog.dismiss();
                y.mo139264a(FeedListView.this.f95693f, "feed_menu");
                FeedHitPointNew.m148851a(FeedHitPointNew.FeedPlusClickParam.IM_CONTACT_ADD_EXTERNAL_VIEW);
            }
        });
    }

    public FeedListView(AbstractC37282a aVar, Activity activity, ITitleController iTitleController, AbstractC44548e eVar, FragmentManager fragmentManager) {
        ITitleController.Style style;
        this.f95701n = iTitleController;
        this.f95694g = aVar;
        this.f95693f = activity;
        if (iTitleController == null) {
            style = ITitleController.Style.Old;
        } else {
            style = iTitleController.mo99193b();
        }
        this.f95702o = style;
        this.f95695h = eVar;
        this.f95699l = fragmentManager;
    }
}
