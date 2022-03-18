package com.bytedance.ee.bear.search.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.search.adapter.C10802a;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class SearchFilterView extends FrameLayout {

    /* renamed from: A */
    private View f29289A;

    /* renamed from: B */
    private C10802a f29290B;

    /* renamed from: C */
    private View f29291C;

    /* renamed from: D */
    private ImageView f29292D;

    /* renamed from: E */
    private TextView f29293E;

    /* renamed from: F */
    private Button f29294F;

    /* renamed from: G */
    private Button f29295G;

    /* renamed from: H */
    private boolean f29296H;

    /* renamed from: a */
    public AnimatorSet f29297a;

    /* renamed from: b */
    public AbstractC10892b f29298b;

    /* renamed from: c */
    public int f29299c;

    /* renamed from: d */
    public int f29300d;

    /* renamed from: e */
    public List<OwnerInfo> f29301e;

    /* renamed from: f */
    public List<ChatInfo> f29302f;

    /* renamed from: g */
    public List<SearchResponse.Data.SpaceData> f29303g;

    /* renamed from: h */
    public SearchRecord.Folder f29304h;

    /* renamed from: i */
    private View f29305i;

    /* renamed from: j */
    private View f29306j;

    /* renamed from: k */
    private View f29307k;

    /* renamed from: l */
    private ImageView f29308l;

    /* renamed from: m */
    private TextView f29309m;

    /* renamed from: n */
    private View f29310n;

    /* renamed from: o */
    private View f29311o;

    /* renamed from: p */
    private ImageView f29312p;

    /* renamed from: q */
    private TextView f29313q;

    /* renamed from: r */
    private View f29314r;

    /* renamed from: s */
    private View f29315s;

    /* renamed from: t */
    private ImageView f29316t;

    /* renamed from: u */
    private UDAvatarList f29317u;

    /* renamed from: v */
    private View f29318v;

    /* renamed from: w */
    private C10802a f29319w;

    /* renamed from: x */
    private View f29320x;

    /* renamed from: y */
    private ImageView f29321y;

    /* renamed from: z */
    private UDAvatarList f29322z;

    /* renamed from: com.bytedance.ee.bear.search.widget.SearchFilterView$b */
    public interface AbstractC10892b {
        /* renamed from: a */
        void mo40940a(int i, int i2, List<OwnerInfo> list, List<ChatInfo> list2, List<SearchResponse.Data.SpaceData> list3, SearchRecord.Folder folder);

        /* renamed from: b */
        void mo40823b(boolean z);

        /* renamed from: c */
        void mo40824c();

        /* renamed from: d */
        void mo40827d();

        /* renamed from: e */
        void mo40828e();

        /* renamed from: f */
        void mo40829f();

        /* renamed from: g */
        void mo40830g();

        /* renamed from: h */
        void mo40831h();

        /* renamed from: w */
        void mo40944w();

        /* renamed from: x */
        void mo40945x();
    }

    /* renamed from: com.bytedance.ee.bear.search.widget.SearchFilterView$a */
    private static class C10891a implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        private C10891a() {
        }
    }

    public SearchRecord.Folder getFolder() {
        return this.f29304h;
    }

    public List<OwnerInfo> getOwnerInfoList() {
        return this.f29301e;
    }

    /* renamed from: a */
    public void mo41401a() {
        m45266b(true);
    }

    /* renamed from: b */
    public void mo41405b() {
        m45266b(false);
    }

    /* renamed from: d */
    public void mo41407d() {
        this.f29295G.performClick();
    }

    /* renamed from: h */
    public void mo41415h() {
        this.f29291C.setVisibility(8);
    }

    /* renamed from: i */
    public void mo41416i() {
        this.f29291C.setVisibility(0);
    }

    /* renamed from: l */
    public ArrayList<OwnerInfo> mo41419l() {
        return new ArrayList<>(this.f29301e);
    }

    /* renamed from: r */
    private void m45272r() {
        this.f29316t.setVisibility(0);
        this.f29317u.setVisibility(8);
    }

    /* renamed from: s */
    private void m45273s() {
        this.f29321y.setVisibility(0);
        this.f29322z.setVisibility(8);
    }

    /* renamed from: t */
    private void m45274t() {
        this.f29309m.setVisibility(8);
        this.f29308l.setVisibility(0);
    }

    /* renamed from: u */
    private void m45275u() {
        this.f29313q.setVisibility(4);
        this.f29312p.setVisibility(0);
    }

    /* renamed from: c */
    public boolean mo41406c() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo41408e() {
        this.f29315s.setVisibility(8);
        this.f29318v.setVisibility(8);
    }

    /* renamed from: f */
    public void mo41409f() {
        this.f29315s.setVisibility(0);
        this.f29318v.setVisibility(0);
    }

    /* renamed from: g */
    public void mo41410g() {
        this.f29307k.setVisibility(8);
        this.f29310n.setVisibility(8);
    }

    /* renamed from: j */
    public void mo41417j() {
        this.f29320x.setVisibility(8);
        this.f29289A.setVisibility(8);
    }

    public ArrayList<String> getChatIdList() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (ChatInfo chatInfo : this.f29302f) {
            arrayList.add(chatInfo.getChatId());
        }
        return arrayList;
    }

    public ArrayList<String> getOwnerIdList() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (OwnerInfo ownerInfo : this.f29301e) {
            arrayList.add(ownerInfo.getOwnerId());
        }
        return arrayList;
    }

    /* renamed from: k */
    public SearchRecord.Folder mo41418k() {
        if (this.f29304h == null) {
            return null;
        }
        SearchRecord.Folder folder = new SearchRecord.Folder();
        folder.setToken(this.f29304h.getToken());
        folder.setName(this.f29304h.getName());
        return folder;
    }

    /* renamed from: o */
    private void m45269o() {
        View view = new View(getContext());
        this.f29306j = view;
        view.setId(R.id.gray_layer);
        this.f29306j.setBackgroundResource(R.color.color_transparent_30_percent_black);
        addView(this.f29306j, new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: q */
    private void m45271q() {
        boolean z;
        if (this.f29296H || this.f29299c != -1 || this.f29300d != -1 || !CollectionUtils.isEmpty(this.f29301e) || !CollectionUtils.isEmpty(this.f29302f) || !CollectionUtils.isEmpty(this.f29303g) || this.f29304h != null) {
            z = true;
        } else {
            z = false;
        }
        setResetBtnStatus(z);
        AbstractC10892b bVar = this.f29298b;
        if (bVar != null) {
            bVar.mo40823b(z);
        }
    }

    /* renamed from: m */
    public void mo41420m() {
        this.f29299c = -1;
        this.f29300d = -1;
        this.f29296H = false;
        this.f29301e.clear();
        this.f29302f.clear();
        this.f29303g.clear();
        m45275u();
        m45274t();
        m45272r();
        m45273s();
        setFolder(null);
        setResetBtnStatus(false);
        AbstractC10892b bVar = this.f29298b;
        if (bVar != null) {
            bVar.mo40944w();
            this.f29298b.mo40823b(false);
        }
    }

    /* renamed from: p */
    private void m45270p() {
        this.f29307k.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108831 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40824c();
                }
            }
        });
        this.f29311o.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108842 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40945x();
                }
            }
        });
        this.f29315s.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108853 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40828e();
                }
            }
        });
        this.f29320x.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108864 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40827d();
                }
            }
        });
        this.f29291C.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108875 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40830g();
                }
            }
        });
        this.f29294F.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108886 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SearchFilterView.this.mo41420m();
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40829f();
                }
            }
        });
        C108897 r0 = new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108897 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SearchFilterView.this.f29298b != null) {
                    SearchFilterView.this.f29298b.mo40831h();
                    SearchFilterView.this.f29298b.mo40940a(SearchFilterView.this.f29299c, SearchFilterView.this.f29300d, SearchFilterView.this.f29301e, SearchFilterView.this.f29302f, SearchFilterView.this.f29303g, SearchFilterView.this.f29304h);
                }
            }
        };
        this.f29295G.setOnClickListener(r0);
        this.f29306j.setOnClickListener(r0);
    }

    /* renamed from: n */
    private void m45268n() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        m45269o();
        LayoutInflater.from(getContext()).inflate(R.layout.search_filter_view, this);
        this.f29305i = findViewById(R.id.search_filter_view_root);
        this.f29307k = findViewById(R.id.search_filter_type_item);
        this.f29308l = (ImageView) findViewById(R.id.search_filter_type_add_icon);
        this.f29309m = (TextView) findViewById(R.id.search_filter_type_txt);
        this.f29310n = findViewById(R.id.search_filter_type_item_divider);
        this.f29311o = findViewById(R.id.search_wiki_item);
        this.f29312p = (ImageView) findViewById(R.id.search_filter_wiki_add_icon);
        this.f29313q = (TextView) findViewById(R.id.search_filter_wiki_text);
        this.f29314r = findViewById(R.id.search_filter_wiki_item_divider);
        this.f29315s = findViewById(R.id.search_filter_owner_item);
        this.f29316t = (ImageView) findViewById(R.id.search_filter_owner_add_icon);
        this.f29317u = (UDAvatarList) findViewById(R.id.search_filter_owner_avatar);
        this.f29318v = findViewById(R.id.search_filter_owner_item_divider);
        this.f29320x = findViewById(R.id.search_filter_chat_item);
        this.f29321y = (ImageView) findViewById(R.id.search_filter_chat_add_icon);
        this.f29322z = (UDAvatarList) findViewById(R.id.search_filter_chat_avatar);
        this.f29289A = findViewById(R.id.search_filter_chat_item_divider);
        this.f29291C = findViewById(R.id.search_filter_folder_item);
        this.f29292D = (ImageView) findViewById(R.id.search_filter_folder_add_icon);
        this.f29293E = (TextView) findViewById(R.id.search_filter_folder_txt);
        this.f29294F = (Button) findViewById(R.id.search_filter_reset_btn);
        this.f29295G = (Button) findViewById(R.id.search_filter_confirm_btn);
        C10802a aVar = new C10802a();
        this.f29319w = aVar;
        this.f29317u.setAdapter(aVar);
        C10802a aVar2 = new C10802a();
        this.f29290B = aVar2;
        this.f29322z.setAdapter(aVar2);
        setResetBtnStatus(false);
    }

    public void setListener(AbstractC10892b bVar) {
        this.f29298b = bVar;
    }

    public SearchFilterView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private SearchResponse.Data.SpaceData m45264a(List<SearchRecord.Space> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        SearchRecord.Space space = list.get(0);
        return new SearchResponse.Data.SpaceData(space.space_id_str, space.space_name);
    }

    /* renamed from: b */
    private void m45265b(List<OwnerInfo> list) {
        this.f29316t.setVisibility(8);
        this.f29317u.setVisibility(0);
        this.f29319w.mo40893b(list);
    }

    /* renamed from: c */
    private void m45267c(List<ChatInfo> list) {
        this.f29321y.setVisibility(8);
        this.f29322z.setVisibility(0);
        this.f29290B.mo40892a(list);
    }

    private void setResetBtnStatus(boolean z) {
        Resources resources;
        int i;
        this.f29294F.setEnabled(z);
        if (z) {
            resources = getResources();
            i = R.color.text_title;
        } else {
            resources = getResources();
            i = R.color.text_disable;
        }
        this.f29294F.setTextColor(resources.getColor(i));
    }

    /* renamed from: a */
    public void mo41404a(boolean z) {
        int i;
        View view = this.f29311o;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f29314r;
        if (!z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    public void setChatList(String str) {
        List<ChatInfo> list;
        try {
            list = JSONObject.parseArray(str, ChatInfo.class);
        } catch (Exception e) {
            C13479a.m54758a("SearchFilterView", "select chat info parse json error:" + e.getMessage() + ", json:" + str);
            list = null;
        }
        setChatList(list);
    }

    public void setFolder(SearchRecord.Folder folder) {
        this.f29304h = folder;
        if (folder != null) {
            this.f29293E.setVisibility(0);
            this.f29292D.setVisibility(8);
            this.f29293E.setText(this.f29304h.getName());
        } else {
            this.f29293E.setVisibility(4);
            this.f29292D.setVisibility(0);
        }
        m45271q();
    }

    public void setOwnerList(String str) {
        List<OwnerInfo> list;
        try {
            list = JSONObject.parseArray(str, OwnerInfo.class);
        } catch (Exception e) {
            C13479a.m54758a("SearchFilterView", "select owner info parse json error:" + e.getMessage() + ", origin json:" + str);
            list = null;
        }
        setOwnerList(list);
    }

    public void setTypeItem(SearchByTypeAdapter.TypeItem typeItem) {
        boolean z;
        int i;
        if (typeItem.isFile) {
            this.f29300d = typeItem.typeId;
            this.f29299c = -1;
        } else {
            if (typeItem.typeId == 9999) {
                z = true;
            } else {
                z = false;
            }
            this.f29296H = z;
            if (z) {
                i = -1;
            } else {
                i = typeItem.typeId;
            }
            this.f29299c = i;
            this.f29300d = -1;
        }
        this.f29308l.setVisibility(8);
        this.f29309m.setVisibility(0);
        this.f29309m.setText(typeItem.nameId);
        m45271q();
    }

    public void setChatList(List<ChatInfo> list) {
        this.f29302f.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f29302f.addAll(list);
            this.f29321y.setVisibility(8);
            this.f29322z.setVisibility(0);
            this.f29290B.mo40892a(list);
        } else {
            this.f29321y.setVisibility(0);
            this.f29322z.setVisibility(8);
        }
        m45271q();
    }

    public void setOwnerList(List<OwnerInfo> list) {
        this.f29301e.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f29301e.addAll(list);
            this.f29316t.setVisibility(8);
            this.f29317u.setVisibility(0);
            this.f29319w.mo40893b(list);
        } else {
            this.f29316t.setVisibility(0);
            this.f29317u.setVisibility(8);
        }
        m45271q();
    }

    public void setWikiSpace(SearchResponse.Data.SpaceData spaceData) {
        this.f29303g.clear();
        if (spaceData != null) {
            this.f29303g.add(spaceData);
        }
        if (!CollectionUtils.isEmpty(this.f29303g)) {
            this.f29312p.setVisibility(8);
            this.f29313q.setVisibility(0);
            this.f29313q.setText(this.f29303g.get(0).getSpace_name());
        } else {
            this.f29312p.setVisibility(4);
            this.f29313q.setVisibility(8);
        }
        m45271q();
    }

    /* renamed from: b */
    private void m45266b(final boolean z) {
        float f;
        float f2;
        if (z != mo41406c()) {
            if (z) {
                setVisibility(0);
            }
            float f3 = 1.0f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (!z) {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f29306j, "alpha", f, f3);
            int height = this.f29305i.getHeight();
            if (height == 0) {
                this.f29305i.measure(View.MeasureSpec.makeMeasureSpec(C13749l.m55736a(), 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
                height = this.f29305i.getMeasuredHeight();
            }
            if (z) {
                f2 = (float) (-height);
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (!z) {
                f4 = (float) (-height);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f29305i, "translationY", f2, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f29297a = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.f29297a.setDuration(200L);
            this.f29297a.addListener(new C10891a() {
                /* class com.bytedance.ee.bear.search.widget.SearchFilterView.C108908 */

                @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.C10891a
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        SearchFilterView.this.setVisibility(8);
                    }
                    SearchFilterView.this.f29297a = null;
                }
            });
            this.f29297a.start();
        }
    }

    public SearchFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo41403a(String str, String str2) {
        SearchRecord.Folder folder = new SearchRecord.Folder();
        folder.setName(str);
        folder.setToken(str2);
        setFolder(folder);
    }

    public SearchFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29299c = -1;
        this.f29300d = -1;
        this.f29301e = new ArrayList();
        this.f29302f = new ArrayList();
        this.f29303g = new ArrayList();
        this.f29296H = false;
        m45268n();
        m45270p();
    }

    /* renamed from: a */
    public void mo41402a(int i, int i2, List<OwnerInfo> list, List<ChatInfo> list2, SearchRecord.Folder folder, List<SearchRecord.Space> list3) {
        int i3;
        boolean isEmpty = CollectionUtils.isEmpty(list);
        boolean isEmpty2 = CollectionUtils.isEmpty(list2);
        this.f29299c = i;
        this.f29300d = i2;
        if (i == -1 && i2 == -1) {
            this.f29309m.setVisibility(8);
            this.f29308l.setVisibility(0);
        } else {
            this.f29309m.setVisibility(0);
            this.f29308l.setVisibility(8);
            int i4 = this.f29300d;
            if (i4 == -1) {
                if (this.f29299c == C8275a.f22371d.mo32555b()) {
                    i3 = R.string.Doc_Facade_Document;
                } else if (this.f29299c == C8275a.f22372e.mo32555b()) {
                    i3 = R.string.Doc_Facade_CreateSheet;
                } else if (this.f29299c == C8275a.f22374g.mo32555b()) {
                    i3 = R.string.Doc_Facade_MindNote;
                } else if (this.f29299c == C8275a.f22373f.mo32555b()) {
                    i3 = R.string.Doc_Facade_Bitable;
                } else if (this.f29299c == C8275a.f22376i.mo32555b()) {
                    i3 = R.string.Doc_Facade_Slide;
                } else if (this.f29299c == C8275a.f22375h.mo32555b()) {
                    i3 = R.string.Doc_Facade_UploadFile;
                } else if (this.f29299c == C8275a.f22370c.mo32555b()) {
                    i3 = R.string.Doc_Facade_Folder;
                } else {
                    i3 = R.string.Doc_Search_All;
                }
                this.f29309m.setText(i3);
            } else if (i4 == 2) {
                this.f29309m.setText(R.string.Doc_Search_Videos);
            } else if (i4 == 3) {
                this.f29309m.setText(R.string.Doc_Search_Audio);
            } else if (i4 == 4) {
                this.f29309m.setText(R.string.Doc_Search_Images);
            } else if (i4 == 5) {
                this.f29309m.setText(R.string.Doc_Search_PDFS);
            } else if (i4 == 99) {
                this.f29309m.setText(R.string.Doc_Search_Other);
            }
        }
        this.f29301e.clear();
        this.f29302f.clear();
        if (isEmpty) {
            m45272r();
        } else {
            this.f29301e.addAll(list);
            m45265b(this.f29301e);
        }
        if (isEmpty2) {
            m45273s();
        } else {
            this.f29302f.addAll(list2);
            m45267c(this.f29302f);
        }
        setWikiSpace(m45264a(list3));
        this.f29304h = folder;
        setFolder(folder);
        m45271q();
    }
}
