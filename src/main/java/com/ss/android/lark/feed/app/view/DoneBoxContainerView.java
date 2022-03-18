package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.p1849b.C37306c;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.app.view.p1870a.C37963a;
import com.ss.android.lark.feed.app.view.title.AbstractC38026b;
import com.ss.android.lark.feed.app.view.title.AbstractC38027d;
import com.ss.android.lark.feed.app.view.title.C38024a;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

public class DoneBoxContainerView extends FrameLayout {

    /* renamed from: a */
    C37963a f97262a;

    /* renamed from: b */
    RecyclerView f97263b;

    /* renamed from: c */
    public C38024a f97264c;

    /* renamed from: d */
    public C37982f f97265d;

    /* renamed from: e */
    public AbstractC37921b f97266e;

    /* renamed from: f */
    public AbstractC37920a f97267f;

    /* renamed from: g */
    private LinearLayoutManager f97268g;

    /* renamed from: h */
    private C23289c f97269h;

    /* renamed from: i */
    private RecyclerView.Adapter f97270i;

    /* renamed from: j */
    private LKUIStatus f97271j;

    /* renamed from: k */
    private FrameLayout f97272k;

    /* renamed from: com.ss.android.lark.feed.app.view.DoneBoxContainerView$a */
    public interface AbstractC37920a {
        /* renamed from: a */
        int mo137045a();

        /* renamed from: b */
        int mo137046b();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.DoneBoxContainerView$b */
    public interface AbstractC37921b {
        /* renamed from: a */
        void mo137078a(View view, UIFeedCard uIFeedCard);

        /* renamed from: a */
        void mo137079a(FeedPreview feedPreview, boolean z);

        /* renamed from: b */
        void mo137080b(FeedPreview feedPreview, boolean z);

        /* renamed from: c */
        void mo137081c(FeedPreview feedPreview, boolean z);
    }

    /* renamed from: b */
    public void mo138861b() {
        C37982f fVar = this.f97265d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public void mo138866g() {
        this.f97271j.mo89837a();
    }

    /* renamed from: h */
    public void mo138867h() {
        this.f97271j.mo89847d();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo138856a();
    }

    /* renamed from: c */
    public void mo138862c() {
        this.f97262a.mo139020a(new C37963a.AbstractC37964a() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379101 */

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: a */
            public void mo138872a() {
            }

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: a */
            public void mo138873a(FeedFilter feedFilter) {
            }

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: d */
            public void mo138876d() {
            }

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: b */
            public void mo138874b() {
                DoneBoxContainerView.this.f97264c.mo139137c();
            }

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: c */
            public int mo138875c() {
                return DoneBoxContainerView.this.f97267f.mo137046b();
            }

            @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
            /* renamed from: a */
            public int mo138871a(int i) {
                if (i == 0) {
                    return 0;
                }
                return DoneBoxContainerView.this.f97267f.mo137045a();
            }
        }, false, false);
    }

    /* renamed from: d */
    public void mo138863d() {
        C38024a aVar = this.f97264c;
        if (aVar == null) {
            Log.m165383e("FeedModule_DoneContainerView", "done forget int Scroll Helper! ");
        } else {
            aVar.mo139134a();
        }
    }

    /* renamed from: e */
    public void mo138864e() {
        LKUIStatus lKUIStatus = this.f97271j;
        if (lKUIStatus != null) {
            lKUIStatus.mo89849f();
        }
        C37982f fVar = this.f97265d;
        if (fVar != null) {
            fVar.mo138941k();
        }
    }

    /* renamed from: f */
    public void mo138865f() {
        this.f97263b.getLayoutManager().scrollToPosition(0);
        this.f97264c.mo139137c();
    }

    /* renamed from: a */
    public void mo138856a() {
        this.f97263b = (RecyclerView) findViewById(R.id.feed_done_recycler_view);
        m149161j();
        m149160i();
    }

    /* renamed from: i */
    private void m149160i() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.done_load_layout);
        this.f97272k = frameLayout;
        this.f97271j = new LKUIStatus.C25680a(frameLayout).mo89862c(R.drawable.illustration_placeholder_common_default).mo89863c(UIHelper.getString(R.string.Lark_Legacy_CurrentPageEmpty)).mo89859a();
    }

    /* renamed from: j */
    private void m149161j() {
        this.f97268g = new StableLinearLayoutManager(getContext(), 1, false);
        this.f97265d = new C37982f();
        C23289c cVar = new C23289c();
        this.f97269h = cVar;
        this.f97270i = cVar.mo80800a(this.f97265d);
        this.f97262a = new C37963a(this.f97265d, this.f97263b);
        this.f97263b.setLayoutManager(this.f97268g);
        this.f97263b.setAdapter(this.f97270i);
        C37266b.m146759b(this.f97263b);
        this.f97269h.mo80804a(this.f97263b);
        this.f97263b.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379112 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (DoneBoxContainerView.this.f97265d != null) {
                    DoneBoxContainerView.this.f97265d.mo137349j();
                }
                if (i != 0) {
                    DoneBoxContainerView.this.f97263b.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379112.RunnableC379121 */

                        public void run() {
                            DoneBoxContainerView.this.f97265d.mo137349j();
                        }
                    }, 300);
                }
            }
        });
        this.f97265d.mo138936a(new FeedListAdapter.AbstractC37936k() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379133 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37936k
            /* renamed from: a */
            public void mo137381a(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
                Log.m165389i("FeedModule_DoneContainerView", "onItemClick" + uIFeedCard.getId());
                if (DoneBoxContainerView.this.f97266e != null) {
                    DoneBoxContainerView.this.f97266e.mo137078a(viewHolder.itemView, uIFeedCard);
                }
            }
        });
        this.f97265d.mo138926a(C37306c.m146953a());
        this.f97265d.mo138928a(new FeedListAdapter.AbstractC37926a() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379144 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: a */
            public void mo137382a(UpdateRecord updateRecord) {
            }

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: b */
            public void mo137383b(UpdateRecord updateRecord) {
                if (DoneBoxContainerView.this.f97264c != null) {
                    DoneBoxContainerView.this.f97264c.mo139136b();
                }
            }
        });
        this.f97265d.mo138935a(new FeedListAdapter.AbstractC37933h() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379155 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37933h
            /* renamed from: a */
            public void mo137384a(final FeedPreview feedPreview) {
                feedPreview.setSwipedLeftPinned(false);
                DoneBoxContainerView.this.f97265d.notifyItemChanged(feedPreview);
                DoneBoxContainerView.this.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379155.RunnableC379161 */

                    public void run() {
                        if (feedPreview.isDelayed()) {
                            DoneBoxContainerView.this.f97266e.mo137079a(feedPreview, false);
                        } else {
                            DoneBoxContainerView.this.f97266e.mo137079a(feedPreview, true);
                        }
                    }
                }, 300);
            }
        });
        this.f97265d.mo138930a(new FeedListAdapter.AbstractC37928c() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379176 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37928c
            /* renamed from: a */
            public void mo137371a(FeedPreview feedPreview) {
                DoneBoxContainerView.this.f97266e.mo137081c(feedPreview, !feedPreview.isInChatBox());
            }
        });
        this.f97265d.mo138937a(new FeedListAdapter.AbstractC37935j() {
            /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379187 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37935j
            /* renamed from: a */
            public void mo137372a(final FeedPreview feedPreview) {
                feedPreview.setSwipedLeftPinned(false);
                DoneBoxContainerView.this.f97265d.notifyItemChanged(feedPreview);
                DoneBoxContainerView.this.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.DoneBoxContainerView.C379187.RunnableC379191 */

                    public void run() {
                        AbstractC37921b bVar = DoneBoxContainerView.this.f97266e;
                        FeedPreview feedPreview = feedPreview;
                        bVar.mo137080b(feedPreview, !feedPreview.isShortCut());
                    }
                }, 300);
            }
        });
    }

    public DoneBoxContainerView(Context context) {
        super(context);
    }

    public void setBoxContainerDependency(AbstractC37920a aVar) {
        this.f97267f = aVar;
    }

    public void setDoneBoxContainerListener(AbstractC37921b bVar) {
        this.f97266e = bVar;
    }

    /* renamed from: a */
    public void mo138857a(int i) {
        C37982f fVar = this.f97265d;
        if (fVar != null) {
            fVar.mo138940b(i);
        }
    }

    /* renamed from: a */
    public void mo138858a(UpdateRecord updateRecord) {
        C37982f fVar = this.f97265d;
        if (fVar != null) {
            fVar.mo138927a(updateRecord);
        }
    }

    /* renamed from: a */
    public void mo138860a(boolean z) {
        if (z) {
            this.f97271j.mo89845c();
        } else {
            this.f97271j.mo89847d();
        }
    }

    public DoneBoxContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo138859a(AbstractC38026b bVar, AbstractC38027d dVar) {
        C38024a aVar = this.f97264c;
        if (aVar != null) {
            aVar.mo139137c();
            this.f97264c.mo139138d();
            this.f97264c = null;
        }
        this.f97264c = new C38024a(FeedCard.FeedType.DONE, bVar, dVar, this.f97263b, this.f97265d);
        this.f97265d.mo138924a(bVar.mo139094a(FeedCard.FeedType.DONE));
    }

    public DoneBoxContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
