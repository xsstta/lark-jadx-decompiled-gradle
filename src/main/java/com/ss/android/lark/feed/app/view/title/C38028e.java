package com.ss.android.lark.feed.app.view.title;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.guide.C37609c;
import com.ss.android.lark.feed.app.view.title.FeedListTitle;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.ITitleInfoWithCustomStatus;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.view.title.e */
public class C38028e implements AbstractC38026b {

    /* renamed from: a */
    public boolean f97665a = true;

    /* renamed from: b */
    public String f97666b;

    /* renamed from: c */
    public ITitleInfo.IconStyle f97667c;

    /* renamed from: d */
    public ITitleInfo.Status f97668d;

    /* renamed from: e */
    public FeedListTitle.AbstractC38019a f97669e;

    /* renamed from: f */
    public List<AbstractC44545b> f97670f;

    /* renamed from: g */
    public ITitleInfo.C44543b f97671g;

    /* renamed from: h */
    public View f97672h;

    /* renamed from: i */
    public ITitleInfo.AbstractC44542a f97673i;

    /* renamed from: j */
    private Context f97674j;

    /* renamed from: k */
    private ITitleController f97675k;

    /* renamed from: l */
    private ITitleInfo f97676l;

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139096a(int i) {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139098a(FeedListTitle.C38020b bVar) {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: d */
    public void mo139104d() {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: e */
    public void mo139105e() {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: f */
    public void mo139106f() {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getOriginSearchLayoutHeight() {
        return 0;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: j */
    public void mo139116j() {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: k */
    public void mo139117k() {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public ITitleInfo getTitleInfo() {
        return this.f97676l;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getTitleHeight() {
        return this.f97675k.mo99189a();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public Bitmap getTitleLayoutBitmap() {
        return this.f97675k.mo99195c();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: c */
    public boolean mo139103c() {
        View view = this.f97672h;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public float getAlpha() {
        View view = this.f97672h;
        if (view == null) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getCurrentHeight() {
        View view = this.f97672h;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    /* renamed from: a */
    public List<AbstractC44545b> mo139150a() {
        ArrayList arrayList = new ArrayList();
        final ImageView imageView = new ImageView(this.f97674j);
        imageView.setImageResource(R.drawable.icon_top_navigation_search_entrance);
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380324 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C38028e.this.f97669e != null) {
                    C38028e.this.f97669e.mo137048a();
                }
            }
        });
        arrayList.add(new AbstractC44545b() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380335 */

            @Override // com.ss.android.lark.maincore.AbstractC44545b
            public View getContentView() {
                return imageView;
            }
        });
        final ImageView imageView2 = new ImageView(this.f97674j);
        imageView2.setTag(R.id.feed_title_function_btn_tag, "function_btn_more");
        imageView2.setImageDrawable(UIUtils.getDrawable(this.f97674j, R.drawable.ic_svg_feed_title_add));
        imageView2.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380346 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C38028e.this.f97669e != null) {
                    C38028e.this.f97669e.mo137050b();
                }
            }
        });
        imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.View$OnAttachStateChangeListenerC380357 */

            public void onViewDetachedFromWindow(View view) {
            }

            public void onViewAttachedToWindow(View view) {
                C37609c.m147867a("more_btn", imageView2);
            }
        });
        arrayList.add(new AbstractC44545b() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380368 */

            @Override // com.ss.android.lark.maincore.AbstractC44545b
            public View getContentView() {
                return imageView2;
            }
        });
        return arrayList;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public void setOnTitleClickListener(FeedListTitle.AbstractC38019a aVar) {
        this.f97669e = aVar;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public int mo139094a(FeedCard.FeedType feedType) {
        return this.f97675k.mo99189a();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139097a(final View view) {
        this.f97674j = view.getContext();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.ViewTreeObserver$OnGlobalLayoutListenerC380313 */

            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C38028e.this.f97672h = view.getRootView().findViewById(R.id.main_title);
            }
        });
    }

    public C38028e(ITitleController iTitleController) {
        ITitleInfo.IconStyle iconStyle;
        if (FeedFgUtils.m146773b()) {
            iconStyle = ITitleInfo.IconStyle.Hide;
        } else {
            iconStyle = ITitleInfo.IconStyle.Down;
        }
        this.f97667c = iconStyle;
        this.f97668d = ITitleInfo.Status.Normal;
        this.f97673i = new ITitleInfo.AbstractC44542a() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380291 */

            @Override // com.ss.android.lark.maincore.ITitleInfo.AbstractC44542a
            /* renamed from: a */
            public void mo99210a() {
            }
        };
        this.f97676l = new ITitleInfoWithCustomStatus() {
            /* class com.ss.android.lark.feed.app.view.title.C38028e.C380302 */

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: a */
            public boolean mo33255a() {
                return C38028e.this.f97665a;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: b */
            public String mo33256b() {
                return C38028e.this.f97666b;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: c */
            public ITitleInfo.IconStyle mo33257c() {
                return C38028e.this.f97667c;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: e */
            public ITitleInfo.Status mo33259e() {
                return C38028e.this.f97668d;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: f */
            public ITitleInfo.AbstractC44542a mo33260f() {
                return C38028e.this.f97673i;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: g */
            public ITitleInfo.C44543b mo33261g() {
                return C38028e.this.f97671g;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: d */
            public List<AbstractC44545b> mo33258d() {
                if (CollectionUtils.isEmpty(C38028e.this.f97670f)) {
                    C38028e eVar = C38028e.this;
                    eVar.f97670f = eVar.mo139150a();
                }
                return C38028e.this.f97670f;
            }
        };
        this.f97675k = iTitleController;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139099a(boolean z) {
        this.f97665a = z;
        if (z) {
            this.f97675k.mo99192a(true);
        } else {
            this.f97675k.mo99194b(true);
        }
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: c */
    public void mo139102c(int i) {
        if (FeedFgUtils.m146773b()) {
            this.f97666b = this.f97674j.getApplicationContext().getResources().getString(R.string.Lark_Feed_Messages);
            this.f97668d = ITitleInfo.Status.Normal;
            this.f97675k.mo99191a(this.f97676l);
            return;
        }
        if (i == 0) {
            this.f97668d = ITitleInfo.Status.Loading;
        } else if (i == 1) {
            this.f97666b = this.f97674j.getApplicationContext().getResources().getString(R.string.Lark_Legacy_FeedInboxHead);
            this.f97668d = ITitleInfo.Status.Normal;
        } else if (i == 2) {
            this.f97666b = this.f97674j.getApplicationContext().getResources().getString(R.string.Lark_Legacy_FeedDrawerDoneLabel);
            this.f97668d = ITitleInfo.Status.Normal;
        }
        this.f97675k.mo99191a(this.f97676l);
    }
}
