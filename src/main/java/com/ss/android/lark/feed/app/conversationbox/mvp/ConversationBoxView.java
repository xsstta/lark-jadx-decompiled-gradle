package com.ss.android.lark.feed.app.conversationbox.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23299i;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.conversationbox.C37431b;
import com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.Map;

public class ConversationBoxView implements AbstractC37475c.AbstractC37478b {

    /* renamed from: a */
    C37431b f96041a;

    /* renamed from: b */
    TextView f96042b;

    /* renamed from: c */
    public VelocityTracker f96043c;

    /* renamed from: d */
    public AbstractC37448a f96044d;

    /* renamed from: e */
    public AbstractC37475c.AbstractC37478b.AbstractC37479a f96045e;

    /* renamed from: f */
    private Context f96046f;

    /* renamed from: g */
    private C23289c f96047g;

    /* renamed from: h */
    private RecyclerView.Adapter f96048h;

    /* renamed from: i */
    private LKUIStatus f96049i;
    @BindView(6198)
    CommonRecyclerView mBoxFeedRV;
    @BindView(6292)
    LinearLayout mBoxLayout;
    @BindView(6288)
    ViewGroup mContentFl;
    @BindView(6321)
    DesktopSecondaryTitleView mDesktopTitleBar;
    @BindView(6274)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView$a */
    public interface AbstractC37448a {
        /* renamed from: a */
        void mo137354a();

        /* renamed from: a */
        void mo137355a(ConversationBoxView conversationBoxView);

        /* renamed from: a */
        void mo137356a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: b */
    public void mo137365b() {
        this.f96049i.mo89837a();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: c */
    public void mo137366c() {
        this.f96049i.mo89847d();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: d */
    public void mo137367d() {
        this.f96049i.mo89845c();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: e */
    public void mo137368e() {
        this.f96049i.mo89847d();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: f */
    public void mo137369f() {
        C37431b bVar = this.f96041a;
        if (bVar != null) {
            bVar.mo138944n();
        }
    }

    /* renamed from: h */
    private void m147330h() {
        m147331i();
        m147332j();
        m147333k();
        m147334l();
    }

    /* renamed from: a */
    public void mo137357a() {
        if (this.f96045e.mo137424a()) {
            this.f96045e.mo137425b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC37448a aVar = this.f96044d;
        if (aVar != null) {
            aVar.mo137355a(this);
            m147330h();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        LKUIStatus lKUIStatus = this.f96049i;
        if (lKUIStatus != null) {
            lKUIStatus.mo89849f();
        }
        C37431b bVar = this.f96041a;
        if (bVar != null) {
            bVar.mo138941k();
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: g */
    public void mo137370g() {
        RecyclerView.Adapter adapter = this.f96048h;
        if (adapter instanceof C23299i) {
            ((C23299i) adapter).mo80859d();
        }
    }

    /* renamed from: i */
    private void m147331i() {
        if (DesktopUtil.m144301a(this.f96046f)) {
            this.mBoxLayout.setBackgroundColor(this.f96046f.getResources().getColor(R.color.lkui_N100));
        }
    }

    /* renamed from: k */
    private void m147333k() {
        this.f96049i = new LKUIStatus.C25680a(this.mContentFl).mo89862c(R.drawable.illustration_placeholder_common_default).mo89863c(UIHelper.getString(R.string.Lark_Legacy_CurrentPageEmpty)).mo89859a();
    }

    /* renamed from: l */
    private void m147334l() {
        if (!DesktopUtil.m144301a(this.f96046f)) {
            this.mDesktopTitleBar.setVisibility(8);
            LinearLayout leftLayout = this.mTitleBar.getLeftLayout();
            this.mTitleBar.getLeftText().setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.View$OnClickListenerC374392 */

                public void onClick(View view) {
                    ConversationBoxView.this.f96044d.mo137354a();
                }
            });
            leftLayout.removeAllViews();
            LayoutInflater.from(this.f96046f).inflate(R.layout.convesationbox_titlebar_left_layout, (ViewGroup) leftLayout, true);
            this.f96042b = (TextView) leftLayout.findViewById(R.id.new_message_text);
            this.mTitleBar.setTitle(R.string.Lark_Legacy_ChatBox);
            this.mTitleBar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.View$OnClickListenerC374403 */

                public void onClick(View view) {
                }
            });
            return;
        }
        this.mDesktopTitleBar.setVisibility(0);
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setOnBackListener(new DesktopSecondaryTitleView.OnClickBackListener() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374414 */

            @Override // com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView.OnClickBackListener
            /* renamed from: a */
            public void mo137378a() {
                ConversationBoxView.this.f96044d.mo137354a();
            }
        });
        this.mDesktopTitleBar.setLabelText(UIUtils.getString(this.f96046f, R.string.Lark_Legacy_ChatBox));
    }

    /* renamed from: j */
    private void m147332j() {
        this.f96041a = new C37431b() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374371 */

            @Override // com.ss.android.lark.feed.app.conversationbox.C37431b, com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
            /* renamed from: a */
            public int mo80756a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
                if (viewHolder instanceof C37968c) {
                    C37968c cVar = (C37968c) viewHolder;
                    if (C58996h.m228976a(cVar.mo80851k(), i2, i3) && cVar.mo139037l()) {
                        if (((UIFeedCard) getItem(i)).isSwipedLeftPinned()) {
                            return 8194;
                        }
                        return 2;
                    }
                }
                return 0;
            }
        };
        final StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(this.f96046f, 1, false);
        this.mBoxFeedRV.setLayoutManager(stableLinearLayoutManager);
        C23289c cVar = new C23289c();
        this.f96047g = cVar;
        this.f96048h = cVar.mo80800a(this.f96041a);
        this.f96047g.mo80804a(this.mBoxFeedRV);
        this.mBoxFeedRV.setAdapter(this.f96048h);
        C37266b.m146759b(this.mBoxFeedRV);
        this.mBoxFeedRV.mo200038c();
        this.f96041a.mo138936a(new FeedListAdapter.AbstractC37936k() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374447 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37936k
            /* renamed from: a */
            public void mo137381a(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
                if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
                    C37268c.m146766b().mo139196o().mo139417b();
                    ConversationBoxView.this.f96045e.mo137421a((ChatFeedPreview) uIFeedCard);
                } else if (uIFeedCard.getType() == FeedCard.Type.OPEN_APP_CHAT && (uIFeedCard instanceof LittleAppFeedPreview)) {
                    LittleAppFeedPreview littleAppFeedPreview = (LittleAppFeedPreview) uIFeedCard;
                    C37268c.m146766b().mo139179a(uIFeedCard.getId(), uIFeedCard.getId(), littleAppFeedPreview.getSchema(), littleAppFeedPreview.getLastAppNotificationId());
                } else if (uIFeedCard.getType() != FeedCard.Type.APP || !(uIFeedCard instanceof LittleAppFeedPreview)) {
                    Log.m165383e("ConversationBoxView", "onItemThrottleClick: no click handler, id=" + uIFeedCard.getId());
                } else {
                    LittleAppFeedPreview littleAppFeedPreview2 = (LittleAppFeedPreview) uIFeedCard;
                    C37268c.m146766b().mo139178a(uIFeedCard.getId(), littleAppFeedPreview2.getSchema(), littleAppFeedPreview2.getLastAppNotificationId());
                }
            }
        });
        this.f96041a.mo138928a(new FeedListAdapter.AbstractC37926a() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374458 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: a */
            public void mo137382a(UpdateRecord updateRecord) {
            }

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: b */
            public void mo137383b(UpdateRecord updateRecord) {
            }
        });
        this.f96041a.mo138935a(new FeedListAdapter.AbstractC37933h() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374469 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37933h
            /* renamed from: a */
            public void mo137384a(final FeedPreview feedPreview) {
                feedPreview.setSwipedLeftPinned(false);
                ConversationBoxView.this.f96041a.notifyItemChanged(feedPreview);
                ConversationBoxView.this.mBoxFeedRV.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.C374469.RunnableC374471 */

                    public void run() {
                        AbstractC37475c.AbstractC37478b.AbstractC37479a aVar = ConversationBoxView.this.f96045e;
                        FeedPreview feedPreview = feedPreview;
                        aVar.mo137423a(feedPreview, !feedPreview.isDelayed());
                    }
                }, 300);
            }
        });
        this.f96041a.mo138930a(new FeedListAdapter.AbstractC37928c() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass10 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37928c
            /* renamed from: a */
            public void mo137371a(FeedPreview feedPreview) {
                ConversationBoxView.this.f96045e.mo137422a(feedPreview);
            }
        });
        this.f96041a.mo138937a(new FeedListAdapter.AbstractC37935j() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass11 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37935j
            /* renamed from: a */
            public void mo137372a(FeedPreview feedPreview) {
                ConversationBoxView.this.f96045e.mo137426b(feedPreview, !feedPreview.isShortCut());
            }
        });
        this.mBoxFeedRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass12 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (ConversationBoxView.this.f96041a != null) {
                    ConversationBoxView.this.f96041a.mo137349j();
                }
                if (i != 0) {
                    ConversationBoxView.this.mBoxFeedRV.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass12.RunnableC374381 */

                        public void run() {
                            ConversationBoxView.this.f96041a.mo137349j();
                        }
                    }, 300);
                } else if (stableLinearLayoutManager.getItemCount() < stableLinearLayoutManager.findLastVisibleItemPosition() + 20) {
                    ConversationBoxView.this.mo137357a();
                }
            }
        });
        this.f96041a.mo138929a(new FeedListAdapter.AbstractC37927b() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass13 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37927b
            /* renamed from: a */
            public void mo137374a(int i, UIFeedCard uIFeedCard) {
                ConversationBoxView.this.f96043c.computeCurrentVelocity(1);
            }
        });
        this.f96043c = VelocityTracker.obtain();
        this.mBoxFeedRV.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.AnonymousClass14 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ConversationBoxView.this.f96043c.addMovement(motionEvent);
                return false;
            }
        });
        C48211b.m190251a().mo168687a(this.mBoxFeedRV);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC37475c.AbstractC37478b.AbstractC37479a aVar) {
        this.f96045e = aVar;
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137361a(UpdateRecord updateRecord) {
        this.f96041a.mo138927a(updateRecord);
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137358a(final int i) {
        CommonRecyclerView commonRecyclerView;
        if (this.f96041a != null && (commonRecyclerView = this.mBoxFeedRV) != null) {
            commonRecyclerView.post(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.RunnableC374436 */

                public void run() {
                    ConversationBoxView.this.f96041a.mo138940b(i);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137360a(final FeedPreview feedPreview) {
        CommonRecyclerView commonRecyclerView;
        if (this.f96041a != null && (commonRecyclerView = this.mBoxFeedRV) != null) {
            commonRecyclerView.post(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView.RunnableC374425 */

                public void run() {
                    ConversationBoxView.this.f96041a.notifyItemChanged(feedPreview);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137362a(String str) {
        LKUIToast.show(this.f96046f, str);
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137364a(Map<Integer, Integer> map) {
        if (!DesktopUtil.m144307b() && map != null) {
            int intValue = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            if (intValue <= 0) {
                this.f96042b.setVisibility(8);
            } else if (intValue > 999) {
                this.f96042b.setVisibility(0);
                this.f96042b.setText("");
                this.f96042b.setBackgroundResource(R.drawable.feed_conversion_box_badge);
            } else {
                this.f96042b.setVisibility(0);
                this.f96042b.setText(String.valueOf(intValue));
            }
        }
    }

    public ConversationBoxView(Context context, AbstractC37448a aVar) {
        this.f96046f = context;
        this.f96044d = aVar;
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b
    /* renamed from: a */
    public void mo137363a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback) {
        this.f96044d.mo137356a(str, chatFeedPreview, iGetDataCallback);
    }
}
