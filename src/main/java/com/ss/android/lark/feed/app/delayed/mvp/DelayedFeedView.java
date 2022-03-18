package com.ss.android.lark.feed.app.delayed.mvp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
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
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.C37631m;
import com.ss.android.lark.feed.app.delayed.C37487a;
import com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.C37985g;
import com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.Map;

public class DelayedFeedView implements AbstractC37532c.AbstractC37535b {

    /* renamed from: a */
    TextView f96163a;

    /* renamed from: b */
    public C37487a f96164b;

    /* renamed from: c */
    public C23289c f96165c;

    /* renamed from: d */
    public Activity f96166d;

    /* renamed from: e */
    public AbstractC37506a f96167e;

    /* renamed from: f */
    public AbstractC37532c.AbstractC37535b.AbstractC37536a f96168f;

    /* renamed from: g */
    private RecyclerView.Adapter f96169g;

    /* renamed from: h */
    private LKUIStatus f96170h;
    @BindView(6288)
    ViewGroup mContentFl;
    @BindView(6198)
    CommonRecyclerView mDelayedFeedRV;
    @BindView(6321)
    DesktopSecondaryTitleView mDesktopTitleBar;
    @BindView(6274)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView$a */
    public interface AbstractC37506a {
        /* renamed from: a */
        void mo137480a();

        /* renamed from: a */
        void mo137481a(DelayedFeedView delayedFeedView);

        /* renamed from: a */
        void mo137482a(DocFeedPreview docFeedPreview);

        /* renamed from: a */
        void mo137483a(LittleAppFeedPreview littleAppFeedPreview);

        /* renamed from: a */
        void mo137484a(String str, int i);

        /* renamed from: a */
        void mo137485a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo137486b();

        /* renamed from: c */
        void mo137487c();
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: c */
    public void mo137497c() {
        C37487a aVar = this.f96164b;
        if (aVar != null) {
            aVar.mo138944n();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C37487a aVar = this.f96164b;
        if (aVar != null) {
            aVar.mo138941k();
        }
    }

    /* renamed from: d */
    private void m147510d() {
        m147511e();
        m147512f();
        m147513g();
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137488a() {
        this.mDelayedFeedRV.setVisibility(8);
        this.f96170h.mo89845c();
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: b */
    public void mo137495b() {
        RecyclerView.Adapter adapter = this.f96169g;
        if (adapter instanceof C23299i) {
            ((C23299i) adapter).mo80859d();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC37506a aVar = this.f96167e;
        if (aVar != null) {
            aVar.mo137481a(this);
            m147510d();
        }
    }

    /* renamed from: f */
    private void m147512f() {
        this.f96170h = new LKUIStatus.C25680a(this.mContentFl).mo89862c(R.drawable.illustration_placeholder_common_default).mo89863c(UIHelper.getString(R.string.Lark_Legacy_CurrentPageEmpty)).mo89859a();
    }

    /* renamed from: e */
    private void m147511e() {
        this.f96164b = new C37487a();
        this.mDelayedFeedRV.setLayoutManager(new StableLinearLayoutManager(this.f96166d, 1, false));
        C23289c cVar = new C23289c();
        this.f96165c = cVar;
        this.f96169g = cVar.mo80800a(this.f96164b);
        this.f96165c.mo80804a(this.mDelayedFeedRV);
        this.mDelayedFeedRV.setAdapter(this.f96169g);
        C37266b.m146757a(this.mDelayedFeedRV);
        this.mDelayedFeedRV.mo200038c();
        this.f96164b.mo138936a(new FeedListAdapter.AbstractC37936k() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C375027 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37936k
            /* renamed from: a */
            public void mo137381a(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
                if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) uIFeedCard;
                    if (chatFeedPreview.isBotChat()) {
                        DelayedFeedView.this.f96167e.mo137487c();
                    }
                    DelayedFeedView.this.f96168f.mo137529a(chatFeedPreview);
                } else if (uIFeedCard.getType() == FeedCard.Type.DOC) {
                    DelayedFeedView.this.f96167e.mo137482a((DocFeedPreview) uIFeedCard);
                } else if (uIFeedCard.getType() == FeedCard.Type.THREAD || uIFeedCard.getType() == FeedCard.Type.TOPIC) {
                    DelayedFeedView.this.f96167e.mo137484a(uIFeedCard.getId(), uIFeedCard.getType().getNumber());
                } else if (uIFeedCard.getType() == FeedCard.Type.APP) {
                    DelayedFeedView.this.f96167e.mo137483a((LittleAppFeedPreview) uIFeedCard);
                }
            }
        });
        this.f96164b.mo138928a(new FeedListAdapter.AbstractC37926a() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C375038 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: a */
            public void mo137382a(UpdateRecord updateRecord) {
            }

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: b */
            public void mo137383b(UpdateRecord updateRecord) {
            }
        });
        this.f96164b.mo138935a(new FeedListAdapter.AbstractC37933h() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C375049 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37933h
            /* renamed from: a */
            public void mo137384a(final FeedPreview feedPreview) {
                feedPreview.setSwipedLeftPinned(false);
                DelayedFeedView.this.f96164b.notifyItemChanged(feedPreview);
                DelayedFeedView.this.mDelayedFeedRV.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C375049.RunnableC375051 */

                    public void run() {
                        AbstractC37532c.AbstractC37535b.AbstractC37536a aVar = DelayedFeedView.this.f96168f;
                        FeedPreview feedPreview = feedPreview;
                        aVar.mo137530a(feedPreview, !feedPreview.isDelayed());
                        if (feedPreview.getId().equals(DelayedFeedView.this.f96164b.mo138945o())) {
                            DelayedFeedView.this.f96167e.mo137486b();
                        }
                    }
                }, 300);
            }
        });
        this.f96164b.mo138930a(new FeedListAdapter.AbstractC37928c() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AnonymousClass10 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37928c
            /* renamed from: a */
            public void mo137371a(FeedPreview feedPreview) {
                DelayedFeedView.this.f96168f.mo137533c(feedPreview, !feedPreview.isInChatBox());
            }
        });
        this.f96164b.mo138937a(new FeedListAdapter.AbstractC37935j() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AnonymousClass11 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37935j
            /* renamed from: a */
            public void mo137372a(FeedPreview feedPreview) {
                DelayedFeedView.this.f96168f.mo137532b(feedPreview, !feedPreview.isShortCut());
            }
        });
        this.f96164b.mo139049a(new C37985g.AbstractC37988a() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AnonymousClass12 */

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: a */
            public void mo137499a() {
                C37266b.m146760c(DelayedFeedView.this.mDelayedFeedRV);
            }

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: b */
            public void mo137501b() {
                C37266b.m146761d(DelayedFeedView.this.mDelayedFeedRV);
            }

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: a */
            public void mo137500a(C37968c cVar, UIFeedCard uIFeedCard, boolean z, boolean z2) {
                DelayedFeedView.this.f96168f.mo137531a(uIFeedCard);
                if (z) {
                    DelayedFeedView.this.f96167e.mo137486b();
                }
                if (C37631m.m148018a(uIFeedCard)) {
                    C37631m.m148017a(DelayedFeedView.this.f96166d);
                }
                C37266b.m146762e(DelayedFeedView.this.mDelayedFeedRV);
            }
        });
        this.f96164b.mo138931a(new FeedListAdapter.AbstractC37929d() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.AnonymousClass13 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37929d
            /* renamed from: a */
            public void mo137502a(C37968c cVar) {
                DelayedFeedView.this.f96165c.mo80808a(cVar, 4);
            }
        });
        this.mDelayedFeedRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C374962 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (DelayedFeedView.this.f96164b != null) {
                    DelayedFeedView.this.f96164b.mo139057r();
                }
                if (i != 0) {
                    DelayedFeedView.this.mDelayedFeedRV.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C374962.RunnableC374971 */

                        public void run() {
                            DelayedFeedView.this.f96164b.mo139057r();
                        }
                    }, 300);
                }
            }
        });
    }

    /* renamed from: g */
    private void m147513g() {
        if (!DesktopUtil.m144301a((Context) this.f96166d)) {
            this.mDesktopTitleBar.setVisibility(8);
            this.mTitleBar.setVisibility(0);
            TextView centerText = this.mTitleBar.getCenterText();
            centerText.setCompoundDrawablesWithIntrinsicBounds(this.f96166d.getResources().getDrawable(R.drawable.feed_list_mark_latter_flag_yellow), (Drawable) null, (Drawable) null, (Drawable) null);
            centerText.setCompoundDrawablePadding(UIHelper.dp2px(4.8f));
            centerText.setText(R.string.Lark_Legacy_MarkLater);
            LinearLayout leftLayout = this.mTitleBar.getLeftLayout();
            leftLayout.removeAllViews();
            LayoutInflater.from(this.f96166d).inflate(R.layout.convesationbox_titlebar_left_layout, (ViewGroup) leftLayout, true);
            this.f96163a = (TextView) leftLayout.findViewById(R.id.new_message_text);
            View$OnClickListenerC374983 r1 = new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.View$OnClickListenerC374983 */

                public void onClick(View view) {
                    DelayedFeedView.this.f96167e.mo137480a();
                }
            };
            leftLayout.findViewById(R.id.back).setOnClickListener(r1);
            this.f96163a.setOnClickListener(r1);
            this.mTitleBar.getLeftText().setOnClickListener(r1);
            this.mTitleBar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.View$OnClickListenerC374994 */

                public void onClick(View view) {
                }
            });
            return;
        }
        this.mDesktopTitleBar.setVisibility(0);
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setOnBackListener(new DesktopSecondaryTitleView.OnClickBackListener() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.C375005 */

            @Override // com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView.OnClickBackListener
            /* renamed from: a */
            public void mo137378a() {
                DelayedFeedView.this.f96167e.mo137480a();
            }
        });
        this.mDesktopTitleBar.setLabelText(UIHelper.getString(R.string.Lark_Legacy_MarkLater));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC37532c.AbstractC37535b.AbstractC37536a aVar) {
        this.f96168f = aVar;
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137489a(int i) {
        LKUIToast.show(this.f96166d, i);
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137491a(final FeedPreview feedPreview) {
        CommonRecyclerView commonRecyclerView;
        if (this.f96164b != null && (commonRecyclerView = this.mDelayedFeedRV) != null) {
            commonRecyclerView.post(new Runnable() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.RunnableC374951 */

                public void run() {
                    DelayedFeedView.this.f96164b.notifyItemChanged(feedPreview);
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: b */
    public void mo137496b(final int i) {
        CommonRecyclerView commonRecyclerView;
        if (this.f96164b != null && (commonRecyclerView = this.mDelayedFeedRV) != null) {
            commonRecyclerView.post(new Runnable() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView.RunnableC375016 */

                public void run() {
                    DelayedFeedView.this.f96164b.mo138940b(i);
                }
            });
        }
    }

    /* renamed from: b */
    private void m147508b(Map<Integer, Integer> map) {
        if (map != null) {
            int intValue = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            if (intValue <= 0) {
                this.mDesktopTitleBar.setLabelText(UIHelper.getString(R.string.Lark_Legacy_MarkForLater));
                return;
            }
            this.mDesktopTitleBar.setLabelText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MarkForLaterHeader, "count", String.valueOf(Math.min(intValue, 999))));
        }
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137492a(UpdateRecord updateRecord) {
        this.mDelayedFeedRV.setVisibility(0);
        this.f96170h.mo89847d();
        this.f96164b.mo138927a(updateRecord);
    }

    /* renamed from: c */
    private void m147509c(Map<Integer, Integer> map) {
        if (map != null) {
            int intValue = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            if (intValue <= 0) {
                this.f96163a.setVisibility(8);
            } else if (intValue > 999) {
                this.f96163a.setVisibility(0);
                this.f96163a.setText("");
                this.f96163a.setBackgroundResource(R.drawable.feed_conversion_box_badge);
            } else {
                this.f96163a.setVisibility(0);
                this.f96163a.setText(String.valueOf(intValue));
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137494a(Map<Integer, Integer> map) {
        if (DesktopUtil.m144307b()) {
            m147508b(map);
        } else {
            m147509c(map);
        }
    }

    public DelayedFeedView(Activity activity, AbstractC37506a aVar) {
        this.f96166d = activity;
        this.f96167e = aVar;
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b
    /* renamed from: a */
    public void mo137493a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback) {
        this.f96167e.mo137485a(str, chatFeedPreview, iGetDataCallback);
    }
}
