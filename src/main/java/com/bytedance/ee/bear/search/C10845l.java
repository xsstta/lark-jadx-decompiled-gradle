package com.bytedance.ee.bear.search;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.AbstractC10782a;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.search.l */
public class C10845l extends AbstractC10782a {

    /* renamed from: A */
    private int f29080A;

    /* renamed from: B */
    private SearchHistoryResponse.SearchHistory f29081B;

    /* renamed from: C */
    private Disposable f29082C;

    /* renamed from: u */
    protected C10851a f29083u;

    /* renamed from: v */
    public boolean f29084v;

    /* renamed from: w */
    public String f29085w;

    /* renamed from: x */
    public int f29086x;

    /* renamed from: y */
    protected String f29087y = "";

    /* renamed from: z */
    private View f29088z;

    /* renamed from: com.bytedance.ee.bear.search.l$a */
    public static class C10851a {

        /* renamed from: a */
        ViewGroup f29094a;

        /* renamed from: b */
        ImageView f29095b;

        /* renamed from: c */
        SpaceEditText f29096c;

        /* renamed from: d */
        protected ImageView f29097d;

        /* renamed from: e */
        ImageView f29098e;

        /* renamed from: f */
        TextView f29099f;

        /* renamed from: g */
        View f29100g;

        /* renamed from: h */
        View f29101h;

        /* renamed from: i */
        TextView f29102i;

        /* renamed from: j */
        TextView f29103j;

        /* renamed from: k */
        View f29104k;

        /* renamed from: l */
        View f29105l;

        /* renamed from: b */
        public void mo40982b() {
            this.f29095b.setVisibility(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40985c() {
            this.f29095b.setVisibility(8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40978a() {
            this.f29101h.setVisibility(8);
            this.f29105l.setVisibility(8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40979a(int i) {
            this.f29103j.setText(i);
        }

        /* renamed from: d */
        public void mo40987d(int i) {
            this.f29096c.setHint(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40983b(int i) {
            this.f29103j.setTextColor(i);
        }

        /* renamed from: c */
        public void mo40986c(int i) {
            this.f29097d.setImageResource(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40984b(Resources resources) {
            this.f29102i.setVisibility(8);
            this.f29104k.setVisibility(8);
            this.f29103j.setTextColor(resources.getColor(R.color.text_title));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40980a(Resources resources) {
            this.f29102i.setVisibility(0);
            this.f29104k.setVisibility(0);
            this.f29102i.setTextColor(resources.getColor(R.color.primary_pri_500));
            this.f29103j.setTextColor(resources.getColor(R.color.text_caption));
        }

        C10851a(View view) {
            this.f29094a = (ViewGroup) view.findViewById(R.id.search_bar_layout);
            this.f29095b = (ImageView) view.findViewById(R.id.search_bar_back);
            this.f29096c = (SpaceEditText) view.findViewById(R.id.search_bar_item_search_bar);
            this.f29098e = (ImageView) view.findViewById(R.id.search_bar_item_clear_icon);
            this.f29099f = (TextView) view.findViewById(R.id.search_bar_item_cancel_button);
            this.f29097d = (ImageView) view.findViewById(R.id.search_bar_item_icon_hint);
            this.f29100g = view.findViewById(R.id.search_container_layout);
            this.f29101h = view.findViewById(R.id.search_filter_group);
            this.f29102i = (TextView) view.findViewById(R.id.search_result_all_txt);
            this.f29103j = (TextView) view.findViewById(R.id.search_result_subtype);
            this.f29104k = view.findViewById(R.id.vertical_divider);
            this.f29105l = view.findViewById(R.id.horizontal_divider);
            this.f29096c.requestFocus();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40981a(Resources resources, boolean z) {
            int i;
            int color = resources.getColor(R.color.primary_pri_500);
            int color2 = resources.getColor(R.color.text_caption);
            TextView textView = this.f29102i;
            if (z) {
                i = color;
            } else {
                i = color2;
            }
            textView.setTextColor(i);
            TextView textView2 = this.f29103j;
            if (z) {
                color = color2;
            }
            textView2.setTextColor(color);
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: x */
    public void mo40945x() {
        C13479a.m54764b("SearchSubFragment", "onSelectWikiSpaceClick()...");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: j */
    public void mo40833j() {
        super.mo40833j();
        if (!this.f28879f) {
            this.f28887n.f29075o = 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f29082C;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: l */
    public void mo40835l() {
        super.mo40835l();
        this.f28876c.getSearchHistory(mo40838q());
        this.f28878e.mo40852k();
        mo40942u();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    public AbstractC10782a.C10786a G_() {
        return new AbstractC10782a.C10786a(this.f29088z, this.f29083u.f29094a, this.f29083u.f29095b, this.f29083u.f29096c, this.f29083u.f29098e, this.f29083u.f29099f, this.f29083u.f29100g);
    }

    /* renamed from: v */
    public void mo40943v() {
        if (getActivity() != null) {
            mo40836o();
            if (this.f29086x == 8) {
                this.f29083u.mo40985c();
            }
            if (!this.f28879f) {
                this.f29083u.mo40985c();
                getActivity().finish();
                getActivity().overridePendingTransition(R.anim.facade_hold, R.anim.facade_hold);
                C10839j.m44943a().mo40958c();
                return;
            }
            getActivity().finish();
        }
    }

    /* renamed from: z */
    private void m44988z() {
        this.f29083u.f29095b.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10845l.C108461 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10845l.this.mo40943v();
            }
        });
        this.f29083u.f29099f.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10845l.C108472 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10845l.this.getActivity() != null) {
                    C10845l.this.mo40836o();
                    C10845l.this.f29083u.mo40985c();
                    C10845l.this.f29083u.f29096c.setText("");
                    C10845l.this.getActivity().finish();
                    if (C10845l.this.f29086x != 5 && C10845l.this.f29086x != 4 && C10845l.this.f29086x != 8) {
                        if (!C10845l.this.f29084v) {
                            C10845l.this.getActivity().overridePendingTransition(R.anim.facade_hold, R.anim.facade_hold);
                        }
                        C10839j.m44943a().mo40958c();
                    }
                }
            }
        });
        this.f29083u.f29098e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10845l.C108483 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10845l.this.f29083u.f29096c.setText("");
                C10845l.this.f29083u.f29098e.setVisibility(8);
                C10845l.this.f28885l.setQuery("");
            }
        });
        this.f29082C = C13716b.m55614a(this.f29083u.f29096c).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$l$bfsPZvlI1ta3sIVwDsUVPtBUnWc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10845l.this.m44983a((C10845l) ((CharSequence) obj));
            }
        }, $$Lambda$l$jjseFf7mPMLpFjyeD_vGZXudNaE.INSTANCE);
        this.f29083u.f29096c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.search.$$Lambda$l$QHoxp9prTytuR_8ekpcKlDs0zJA */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return C10845l.this.m44986a(textView, i, keyEvent);
            }
        });
        this.f29083u.f29102i.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10845l.C108494 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (!C10845l.this.f28881h) {
                    C10845l.this.f28881h = true;
                    C10845l.this.f29083u.mo40981a(C10845l.this.getResources(), true);
                    C10845l.this.f28887n.mo40972a();
                    C10845l lVar = C10845l.this;
                    lVar.f29087y = lVar.f28887n.f29061a;
                    C10845l.this.f28887n.f29061a = C10845l.this.f29083u.f29096c.getText().toString().trim();
                    C10845l.this.f28878e.mo40845d();
                    if (C10845l.this.f29086x == 5) {
                        C10845l.this.f28887n.f29071k = false;
                    } else if (C10845l.this.f29086x == 4) {
                        C10845l.this.f28887n.f29070j.clear();
                    } else if (C10845l.this.f29086x == 6) {
                        C10845l.this.f28887n.f29064d.clear();
                        C10845l.this.f28885l.setOwn_by_user(false);
                        C10845l.this.f28885l.getOwner().clear();
                    }
                    C10845l.this.f28889p = "all";
                    C10845l.this.mo40942u();
                }
            }
        });
        this.f29083u.f29103j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10845l.C108505 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10845l.this.f28881h) {
                    C10845l.this.f28881h = false;
                    C10845l.this.f29083u.mo40981a(C10845l.this.getResources(), false);
                    C10845l.this.f28878e.mo40846e();
                    C10845l.this.f28878e.f28916h.mo41420m();
                    if (C10845l.this.f29086x == 5) {
                        C10845l.this.f28887n.f29071k = true;
                        C10845l.this.f28889p = "favorites";
                    } else if (C10845l.this.f29086x == 4) {
                        C10845l.this.f28887n.f29070j.add(C10845l.this.f29085w);
                        C10845l.this.f28889p = "current_folder";
                    } else if (C10845l.this.f29086x == 6) {
                        if (C10845l.this.f28877d != null) {
                            C10845l.this.f28887n.f29067g.add(C10845l.this.f28877d.f14584a);
                            C10845l.this.f28885l.getOwner().add(SearchRecord.account2Owner(C10845l.this.f28877d));
                            C10845l.this.f28885l.setOwn_by_user(true);
                        }
                        C10845l.this.f28889p = "mycontent";
                    }
                    C10845l.this.mo40942u();
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: w */
    public void mo40944w() {
        if (this.f29086x != 7) {
            this.f28887n.f29064d.clear();
            this.f28887n.f29065e.clear();
            this.f28885l.getObj_types().clear();
            this.f28885l.getFile_types().clear();
        }
        if (this.f29086x != 1) {
            this.f28887n.f29067g.clear();
            this.f28885l.getOwner().clear();
        }
        this.f28887n.f29068h.clear();
        this.f28887n.f29069i.clear();
        this.f28887n.f29070j.clear();
        this.f28887n.f29066f.clear();
        this.f28885l.getGroup().clear();
        this.f28885l.getFolder().clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo40942u() {
        SearchTypeEnv searchTypeEnv;
        boolean z;
        int i = this.f29086x;
        boolean z2 = true;
        if (!(i == 6 || i == 8 || this.f29080A == C8275a.f22370c.mo32555b())) {
            int i2 = 2;
            if (this.f29086x == 2) {
                z = true;
            } else {
                z = false;
            }
            C10841k.C10844a aVar = this.f28887n;
            if (!z) {
                i2 = 1;
            }
            aVar.f29074n = i2;
            this.f28887n.f29073m = System.currentTimeMillis();
        }
        this.f28887n.f29062b = 0;
        if (this.f28879f) {
            searchTypeEnv = SearchTypeEnv.NET;
        } else {
            searchTypeEnv = SearchTypeEnv.CACHE;
        }
        this.f28884k = searchTypeEnv;
        this.f28878e.mo40841a();
        if (this.f29086x != 8) {
            z2 = false;
        }
        if (this.f28879f) {
            if (!z2) {
                this.f28878e.mo40852k();
            }
            this.f28876c.search(this.f28886m, this.f28887n);
        } else if (mo40840s()) {
            if (!z2) {
                this.f28878e.mo40851j();
            }
            if (this.f28883j) {
                this.f28878e.f28923o.setVisibility(8);
            }
            this.f28876c.searchFromCache(this.f28887n.f29061a);
        } else {
            this.f28878e.mo40844c();
        }
    }

    /* renamed from: y */
    private void m44987y() {
        int i;
        if (!CollectionUtils.isEmpty(this.f29081B.getObj_types())) {
            this.f29080A = this.f29081B.getObj_types().get(0).intValue();
            this.f28887n.f29064d.add(Integer.valueOf(this.f29080A));
        }
        if (CollectionUtils.isEmpty(this.f29081B.getFile_types())) {
            i = -1;
        } else {
            i = this.f29081B.getFile_types().get(0).intValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SearchRecord.Folder folder = null;
        if (!CollectionUtils.isEmpty(this.f29081B.getOwner()) && this.f29081B.getMain_page_option() != 1 && !this.f29081B.isOwn_by_user()) {
            for (SearchRecord.Owner owner : this.f29081B.getOwner()) {
                arrayList.add(SearchRecord.owner2OwnerInfo(owner));
                this.f28887n.f29067g.add(owner.getUser_id_str());
            }
        }
        if (!CollectionUtils.isEmpty(this.f29081B.getGroup())) {
            for (SearchRecord.Group group : this.f29081B.getGroup()) {
                arrayList2.add(SearchRecord.group2ChaInfo(group));
                if (group.getOwner_type() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                    this.f28887n.f29068h.add(group.getGroup_id_str());
                } else {
                    this.f28887n.f29069i.add(group.getGroup_id_str());
                }
            }
        }
        if (!CollectionUtils.isEmpty(this.f29081B.getFolder())) {
            folder = this.f29081B.getFolder().get(0);
            this.f28887n.f29070j.add(folder.getToken());
        }
        List<SearchRecord.Space> space = this.f29081B.getSpace();
        if (!CollectionUtils.isEmpty(space)) {
            for (SearchRecord.Space space2 : space) {
                this.f28887n.mo40973a(space2.space_id_str);
            }
        }
        this.f28878e.f28916h.mo41402a(this.f29080A, i, arrayList, arrayList2, folder, space);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo40941t() {
        if (this.f29086x == 6) {
            SearchHistoryResponse.SearchHistory searchHistory = this.f29081B;
            if (searchHistory == null) {
                C13479a.m54758a("SearchSubFragment", "searchHistory == null");
            } else {
                this.f28885l = SearchHistoryResponse.searchHistory2SearchRecord(searchHistory);
                if (this.f29081B.getMain_page_option() == 0) {
                    this.f29086x = 6;
                } else if (this.f29081B.getMain_page_option() == 1) {
                    this.f29086x = 1;
                } else if (this.f29081B.getMain_page_option() == 2) {
                    this.f29086x = 2;
                } else if (this.f29081B.getMain_page_option() == 3) {
                    this.f29086x = 3;
                } else if (this.f29081B.getMain_page_option() == 4) {
                    this.f29086x = 7;
                }
                m44987y();
                this.f29083u.f29098e.setVisibility(0);
                String query = this.f29081B.getQuery();
                this.f29083u.f29096c.setText(query);
                this.f29083u.f29096c.setSelection(query.length());
                this.f28887n.f29061a = query;
                this.f28882i = false;
            }
        }
        String str = "mycontent";
        switch (this.f29086x) {
            case 1:
                this.f29083u.mo40984b(getResources());
                this.f29083u.mo40979a(R.string.Doc_Search_MyContent);
                this.f29083u.mo40983b(getResources().getColor(R.color.text_title));
                this.f29083u.mo40982b();
                this.f28878e.mo40850i();
                this.f28881h = false;
                if (this.f28877d != null && !this.f28887n.f29067g.contains(this.f28877d.f14584a)) {
                    this.f28887n.f29067g.add(this.f28877d.f14584a);
                    this.f28885l.getOwner().add(SearchRecord.account2Owner(this.f28877d));
                }
                this.f28885l.setMain_page_option(1);
                this.f28889p = str;
                return;
            case 2:
                this.f29083u.mo40984b(getResources());
                this.f29083u.mo40979a(R.string.Doc_Search_RecentlyModified);
                this.f29083u.mo40983b(getResources().getColor(R.color.text_title));
                this.f29083u.mo40982b();
                this.f28881h = false;
                this.f28885l.setMain_page_option(2);
                this.f28889p = "recently_modified";
                return;
            case 3:
                this.f29083u.mo40984b(getResources());
                this.f29083u.mo40979a(R.string.Doc_Search_RecentlyOpen);
                this.f29083u.mo40983b(getResources().getColor(R.color.text_title));
                this.f29083u.mo40982b();
                this.f28881h = false;
                this.f28885l.setMain_page_option(3);
                this.f28889p = "recently_opened";
                this.f28874a.mo40902b(true);
                return;
            case 4:
                this.f29083u.mo40980a(getResources());
                this.f29083u.mo40979a(R.string.Doc_Search_InThisFolder);
                this.f29083u.mo40985c();
                this.f29083u.mo40981a(getResources(), false);
                this.f28878e.mo40846e();
                this.f28881h = false;
                this.f28887n.f29070j.add(this.f29085w);
                this.f28880g = false;
                this.f28889p = "current_folder";
                this.f28887n.f29076p = "search_docs_folder";
                return;
            case 5:
                this.f29083u.mo40980a(getResources());
                this.f29083u.mo40981a(getResources(), false);
                this.f29083u.mo40979a(R.string.Doc_List_MainTabHomeFavorite);
                this.f29083u.mo40985c();
                this.f28878e.mo40846e();
                this.f28881h = false;
                this.f28887n.f29071k = true;
                this.f28880g = false;
                this.f28889p = "favorites";
                this.f28887n.f29076p = "search_docs_favorite";
                return;
            case 6:
                this.f29083u.mo40980a(getResources());
                this.f29083u.mo40979a(R.string.Doc_Search_MyContent);
                this.f29083u.mo40982b();
                this.f28881h = !this.f29081B.isOwn_by_user();
                this.f29083u.mo40981a(getResources(), this.f28881h);
                if (this.f29081B.isOwn_by_user() && this.f28877d != null) {
                    this.f28887n.f29067g.add(this.f28877d.f14584a);
                    this.f28885l.getOwner().add(SearchRecord.account2Owner(this.f28877d));
                    this.f28885l.setOwn_by_user(true);
                    this.f28878e.mo40846e();
                }
                if (this.f28881h) {
                    str = "all";
                }
                this.f28889p = str;
                this.f28885l.setMain_page_option(0);
                return;
            case 7:
                this.f29083u.mo40984b(getResources());
                this.f29083u.mo40981a(getResources(), false);
                this.f29083u.mo40983b(getResources().getColor(R.color.text_title));
                this.f29083u.mo40982b();
                this.f28878e.mo40849h();
                this.f28881h = false;
                int i = this.f29080A;
                int i2 = R.string.Doc_Search_All;
                if (i != -1) {
                    if (i == C8275a.f22371d.mo32555b()) {
                        i2 = R.string.Doc_Facade_Document;
                    } else if (this.f29080A == C8275a.f22372e.mo32555b()) {
                        i2 = R.string.Doc_Facade_CreateSheet;
                    } else if (this.f29080A == C8275a.f22374g.mo32555b()) {
                        i2 = R.string.Doc_Facade_MindNote;
                    } else if (this.f29080A == C8275a.f22373f.mo32555b()) {
                        i2 = R.string.Doc_Facade_Bitable;
                    } else if (this.f29080A == C8275a.f22376i.mo32555b()) {
                        i2 = R.string.Doc_Facade_Slide;
                    } else if (this.f29080A == C8275a.f22375h.mo32555b()) {
                        i2 = R.string.Doc_Facade_UploadFile;
                    } else if (this.f29080A == C8275a.f22370c.mo32555b()) {
                        i2 = R.string.Doc_Facade_Folder;
                    }
                    this.f29083u.mo40979a(i2);
                    this.f28887n.f29064d.add(Integer.valueOf(this.f29080A));
                    this.f28885l.getObj_types().add(Integer.valueOf(this.f29080A));
                    this.f28889p = "";
                    if (this.f29080A == C8275a.f22371d.mo32555b()) {
                        this.f28889p = "doc";
                    } else if (this.f29080A == C8275a.f22372e.mo32555b()) {
                        this.f28889p = "sheet";
                    } else if (this.f29080A == C8275a.f22373f.mo32555b()) {
                        this.f28889p = "bitable";
                    } else if (this.f29080A == C8275a.f22374g.mo32555b()) {
                        this.f28889p = "mindnote";
                    } else if (this.f29080A == C8275a.f22376i.mo32555b()) {
                        this.f28889p = "slide";
                    } else if (this.f29080A == C8275a.f22375h.mo32555b()) {
                        this.f28889p = "file";
                    } else if (this.f29080A == C8275a.f22370c.mo32555b()) {
                        this.f28889p = "folder";
                    }
                } else {
                    this.f29083u.mo40979a(R.string.Doc_Search_All);
                }
                this.f28885l.setMain_page_option(4);
                return;
            case 8:
                this.f29083u.mo40978a();
                this.f29083u.mo40982b();
                this.f28878e.mo40846e();
                this.f28881h = false;
                this.f28887n.f29075o = 0;
                this.f28887n.f29064d.add(Integer.valueOf(C8275a.f22370c.mo32555b()));
                this.f28880g = false;
                this.f28887n.f29076p = "search_docs_filter";
                this.f28889p = "filter_folder";
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44983a(CharSequence charSequence) throws Exception {
        m44984a(charSequence.toString());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40819a(boolean z) {
        super.mo40819a(z);
        this.f28883j = false;
        this.f28887n.f29067g.clear();
        this.f28887n.f29075o = 2;
        if (z) {
            mo40942u();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: c */
    public boolean mo40826c(boolean z) {
        if (z) {
            return true;
        }
        if (this.f28887n.f29074n == 3) {
            return false;
        }
        int i = this.f29086x;
        if (i != 1 && i != 7 && i != 5 && i != 4) {
            return false;
        }
        this.f28887n.f29074n = 3;
        return true;
    }

    /* renamed from: a */
    private void m44984a(String str) {
        int i;
        String str2;
        C13479a.m54764b("SearchSubFragment", "textChangeSearch");
        if (TextUtils.isEmpty(str)) {
            C10820e.m44875a().mo40919c();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageView imageView = this.f29083u.f29098e;
        if (isEmpty) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        this.f29087y = this.f28887n.f29061a;
        this.f28887n.f29061a = str.trim();
        mo40942u();
        this.f28885l.setQuery(this.f28887n.f29061a);
        if (!this.f28891r) {
            if (TextUtils.isEmpty(str)) {
                str2 = "none";
            } else {
                str2 = "search";
            }
            this.f28890q = str2;
        }
        this.f28891r = false;
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f29086x = arguments.getInt("KEY_SEARCH_SUB_PAGE_TYPE", -1);
            mo40941t();
            mo40820b();
            m44988z();
            mo40837p();
        }
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        String str;
        if (this.f28879f) {
            str = this.f28889p;
        } else {
            str = "offline";
        }
        this.f28889p = str;
        this.f28888o.mo40923a(this.f28886m, document, this.f28889p, i, this.f28876c.getRequestId(), this.f28890q, this.f28887n.f29076p);
        if (this.f29086x == 8) {
            Intent intent = new Intent();
            if (getActivity() != null) {
                getActivity().setResult(-1, intent);
                getActivity().finish();
                return;
            }
            return;
        }
        super.mo40815a(document, i);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40817a(SearchResponse.Data.Candidates candidates, int i) {
        super.mo40817a(candidates, i);
        this.f28887n.mo40972a();
        this.f28887n.f29067g.add(candidates.getOwner_id());
        this.f28887n.f29075o = 0;
        this.f29083u.f29096c.setText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m44986a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return true;
        }
        this.f29087y = this.f28887n.f29061a;
        this.f28887n.f29061a = this.f29083u.f29096c.getText().toString().trim();
        mo40942u();
        mo40836o();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.fragment_search_sub, viewGroup, false);
        this.f29088z = inflate;
        this.f29083u = new C10851a(inflate);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return this.f29088z;
        }
        this.f29084v = arguments.getBoolean("KEY_FROM_LARK", false);
        this.f29080A = arguments.getInt("KEY_SEARCH_OBJ_TYPE");
        this.f29085w = arguments.getString("KEY_FOLDER_TOKEN");
        this.f29081B = (SearchHistoryResponse.SearchHistory) arguments.getSerializable("KEY_SEARCH_HISTORY");
        this.f28887n.f29061a = "";
        this.f28885l.setOwn_by_user(false);
        C10841k.C10844a aVar = this.f28887n;
        if (this.f29084v) {
            str = "search_lark_index";
        } else {
            str = "search_docs_pri";
        }
        aVar.f29076p = str;
        return this.f29088z;
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: a */
    public void mo40940a(int i, int i2, List<OwnerInfo> list, List<ChatInfo> list2, List<SearchResponse.Data.SpaceData> list3, SearchRecord.Folder folder) {
        this.f28888o.mo40936g(this.f28886m, this.f28889p);
        mo40944w();
        if (this.f29086x != 7) {
            if (i != -1) {
                this.f28887n.f29064d.add(Integer.valueOf(i));
                this.f28885l.getObj_types().add(Integer.valueOf(i));
            } else if (i2 != -1) {
                this.f28887n.f29064d.add(Integer.valueOf(C8275a.f22375h.mo32555b()));
                this.f28887n.f29065e.add(Integer.valueOf(i2));
                this.f28885l.getObj_types().add(Integer.valueOf(C8275a.f22375h.mo32555b()));
                this.f28885l.getFile_types().add(Integer.valueOf(i2));
            }
        }
        if (this.f29086x != 1 && !CollectionUtils.isEmpty(list)) {
            for (OwnerInfo ownerInfo : list) {
                if (!this.f28887n.f29067g.contains(ownerInfo.getOwnerId())) {
                    this.f28887n.f29067g.add(ownerInfo.getOwnerId());
                }
                SearchRecord.Owner ownerInfo2Owner = SearchRecord.ownerInfo2Owner(ownerInfo);
                if (!this.f28885l.getOwner().contains(ownerInfo2Owner)) {
                    this.f28885l.getOwner().add(ownerInfo2Owner);
                }
            }
        }
        if (!CollectionUtils.isEmpty(list2)) {
            for (ChatInfo chatInfo : list2) {
                if (chatInfo.getChatType() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                    this.f28887n.f29068h.add(chatInfo.getChatId());
                } else {
                    this.f28887n.f29069i.add(chatInfo.getChatId());
                }
                this.f28885l.getGroup().add(SearchRecord.chatInfo2Group(chatInfo));
            }
        }
        if (folder != null) {
            this.f28887n.f29070j.add(folder.getToken());
            this.f28885l.getFolder().add(folder);
        }
        if (list3 != null && !list3.isEmpty()) {
            for (SearchResponse.Data.SpaceData spaceData : list3) {
                this.f28887n.mo40973a(spaceData.getSpace_id());
            }
        }
        mo40942u();
    }
}
