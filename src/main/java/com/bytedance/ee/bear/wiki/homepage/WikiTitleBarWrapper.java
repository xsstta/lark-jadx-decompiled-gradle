package com.bytedance.ee.bear.wiki.homepage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.C8506d;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.homepage.WikiTitleBarWrapper;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13751m;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public final class WikiTitleBarWrapper {

    /* renamed from: a */
    public FragmentActivity f32317a;

    /* renamed from: b */
    public ImageView f32318b;

    /* renamed from: c */
    private Fragment f32319c;

    /* renamed from: d */
    private C10917c f32320d;

    /* renamed from: e */
    private AbstractC8505c f32321e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.WikiTitleBarWrapper$a */
    public class C11958a implements AbstractC8505c {

        /* renamed from: a */
        public AbstractC5226b.AbstractC5227a f32323a;

        /* renamed from: b */
        public C11959a f32324b;

        /* renamed from: d */
        private ITitleController f32326d;

        /* renamed from: e */
        private C8506d f32327e;

        /* renamed from: f */
        private int f32328f;

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        /* renamed from: a */
        public void mo33175a() {
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public View getCreateView() {
            return null;
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public int getTitleType() {
            return 0;
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        /* renamed from: k */
        public void mo33198k() {
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public void setSearchViewClickListener(View.OnClickListener onClickListener) {
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public void setTitle(String str) {
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.wiki.homepage.WikiTitleBarWrapper$a$a */
        public class C11959a implements ITitleInfo {

            /* renamed from: b */
            private List<AbstractC44545b> f32330b;

            /* renamed from: c */
            private boolean f32331c;

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: f */
            public ITitleInfo.AbstractC44542a mo33260f() {
                return null;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: g */
            public ITitleInfo.C44543b mo33261g() {
                return null;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: c */
            public ITitleInfo.IconStyle mo33257c() {
                return ITitleInfo.IconStyle.Hide;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: d */
            public List<AbstractC44545b> mo33258d() {
                return this.f32330b;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: e */
            public ITitleInfo.Status mo33259e() {
                return ITitleInfo.Status.Normal;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: a */
            public boolean mo33255a() {
                return this.f32331c;
            }

            @Override // com.ss.android.lark.maincore.ITitleInfo
            /* renamed from: b */
            public String mo33256b() {
                return WikiTitleBarWrapper.this.f32317a.getString(R.string.Doc_Wiki_Home_Title);
            }

            /* renamed from: a */
            public void mo45903a(boolean z) {
                this.f32331c = z;
            }

            /* renamed from: a */
            public void mo45902a(AbstractC44545b bVar) {
                this.f32330b.add(bVar);
            }

            private C11959a() {
                this.f32330b = new ArrayList();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ View m49540c() {
            return WikiTitleBarWrapper.this.f32318b;
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public int getTitleBarHeight() {
            return this.f32326d.mo99189a();
        }

        /* renamed from: b */
        private void m49539b() {
            C11959a aVar = new C11959a();
            this.f32324b = aVar;
            aVar.mo45903a(true);
            this.f32324b.mo45902a(new AbstractC44545b() {
                /* class com.bytedance.ee.bear.wiki.homepage.$$Lambda$WikiTitleBarWrapper$a$FSBHmwxYnT7dznV5Xa3NR3lQTkc */

                @Override // com.ss.android.lark.maincore.AbstractC44545b
                public final View getContentView() {
                    return WikiTitleBarWrapper.C11958a.this.m49540c();
                }
            });
            this.f32326d.mo99191a(this.f32324b);
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        /* renamed from: a */
        public void mo33176a(int i, int i2) {
            int a = this.f32327e.mo33245a(this.f32328f, i2);
            this.f32328f = a;
            float a2 = this.f32327e.mo33244a(a);
            boolean a3 = this.f32327e.mo33247a(a2);
            C13479a.m54772d("WikiTitleBarWrapper", "onScrollBy, height:" + this.f32328f + ", alpha:" + a2 + ", visible:" + a3);
            if (a3) {
                this.f32324b.mo45903a(true);
                this.f32326d.mo99192a(true);
                return;
            }
            this.f32324b.mo45903a(false);
            this.f32326d.mo99194b(true);
        }

        public C11958a(ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar) {
            this.f32326d = iTitleController;
            this.f32323a = aVar;
            int a = iTitleController.mo99189a();
            this.f32328f = a;
            this.f32327e = new C8506d(a, a);
            m49539b();
        }
    }

    public static class WikiTitleBar extends HomeMainTitleBar {
        @Override // com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar
        public void setCreateViewEnable(boolean z) {
        }

        @Override // com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar, com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
        public int getTitleBarHeight() {
            return getResources().getDimensionPixelSize(R.dimen.wiki_title_bar_height_min);
        }

        public WikiTitleBar(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public WikiTitleBar(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* renamed from: b */
    private void m49536b() {
        ImageView imageView = new ImageView(this.f32317a);
        this.f32318b = imageView;
        C13751m.m55764a(imageView, this.f32317a.getResources(), R.drawable.ud_icon_search_outlined, null, this.f32317a.getResources().getColor(R.color.icon_n1));
        this.f32318b.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.wiki.homepage.WikiTitleBarWrapper.C119571 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C13479a.m54764b("WikiTitleBarWrapper", "iv searchWiki click. ");
                WikiTitleBarWrapper.this.mo45901a();
            }
        });
    }

    /* renamed from: a */
    public void mo45901a() {
        C13479a.m54764b("WikiTitleBarWrapper", "startSearch");
        C11933b.m49481a("search", "navigation_bar", -1, -1);
        AbstractC8505c cVar = this.f32321e;
        if (cVar instanceof C11958a) {
            AbstractC5226b.AbstractC5227a aVar = ((C11958a) cVar).f32323a;
            if (aVar != null) {
                aVar.onClickSearchBtn();
                return;
            }
            return;
        }
        RouteBean routeBean = new RouteBean();
        routeBean.mo40622h("/search/activity");
        routeBean.mo40623i("wiki");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a("/search/activity", routeBean);
    }

    /* renamed from: a */
    public static ITitleInfo m49534a(AbstractC8505c cVar) {
        if (cVar instanceof C11958a) {
            return ((C11958a) cVar).f32324b;
        }
        return null;
    }

    /* renamed from: a */
    private void m49535a(ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (iTitleController == null || iTitleController.mo99193b() != ITitleController.Style.New) {
            WikiTitleBar wikiTitleBar = (WikiTitleBar) LayoutInflater.from(this.f32317a).inflate(R.layout.wiki_main_tab_home_title_bar, viewGroup, false);
            wikiTitleBar.mo33183d();
            wikiTitleBar.setTitle(this.f32317a.getString(R.string.Doc_Wiki_Home_Title));
            wikiTitleBar.mo33177a(this.f32318b);
            viewGroup2.addView(wikiTitleBar, viewGroup2.getChildCount());
            this.f32321e = wikiTitleBar;
            return;
        }
        this.f32321e = new C11958a(iTitleController, aVar);
    }

    private WikiTitleBarWrapper(FragmentActivity fragmentActivity, Fragment fragment, C10917c cVar, ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f32317a = fragmentActivity;
        this.f32319c = fragment;
        this.f32320d = cVar;
        m49536b();
        m49535a(iTitleController, aVar, viewGroup, viewGroup2);
    }

    /* renamed from: a */
    public static AbstractC8505c m49533a(ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar, FragmentActivity fragmentActivity, Fragment fragment, C10917c cVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        return new WikiTitleBarWrapper(fragmentActivity, fragment, cVar, iTitleController, aVar, viewGroup, viewGroup2).f32321e;
    }
}
