package com.bytedance.ee.bear.search.lark.space;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.lark.p414b.AbstractC7996i;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.universe_design.loading.UDLoadingDrawable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.searchfilter.FilterView;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.lark.space.b */
public class C10865b {

    /* renamed from: m */
    static String f29167m = "filter.my.own";

    /* renamed from: n */
    static String f29168n = "filter.type";

    /* renamed from: o */
    static String f29169o = "filter.member.own";

    /* renamed from: p */
    static String f29170p = "filter.chat.own";

    /* renamed from: q */
    static String f29171q = "filter.folder";

    /* renamed from: A */
    String f29172A = "";

    /* renamed from: a */
    Context f29173a;

    /* renamed from: b */
    ViewGroup f29174b;

    /* renamed from: c */
    View f29175c;

    /* renamed from: d */
    View f29176d;

    /* renamed from: e */
    ImageView f29177e;

    /* renamed from: f */
    UDLoadingDrawable f29178f;

    /* renamed from: g */
    SmartRefreshLayout f29179g;

    /* renamed from: h */
    RecyclerView f29180h;

    /* renamed from: i */
    SpaceEmptyState f29181i;

    /* renamed from: j */
    FilterView f29182j;

    /* renamed from: k */
    TextView f29183k;

    /* renamed from: l */
    List<SpaceFilterData> f29184l = new ArrayList(5);

    /* renamed from: r */
    SpaceFilterData f29185r = new SpaceFilterData(f29167m);

    /* renamed from: s */
    SpaceFilterData f29186s = new SpaceFilterData(f29168n);

    /* renamed from: t */
    SpaceFilterData f29187t = new SpaceFilterData(f29169o);

    /* renamed from: u */
    SpaceFilterData f29188u = new SpaceFilterData(f29170p);

    /* renamed from: v */
    SpaceFilterData f29189v = new SpaceFilterData(f29171q);

    /* renamed from: w */
    String f29190w = "";

    /* renamed from: x */
    String f29191x = "";

    /* renamed from: y */
    String f29192y = "";

    /* renamed from: z */
    String f29193z = "";

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo41033k() {
        this.f29182j.mo200819a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo41034l() {
        this.f29182j.mo200822b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41023b() {
        this.f29178f.stop();
        this.f29176d.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41025c() {
        this.f29183k.setVisibility(0);
        this.f29182j.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41026d() {
        this.f29184l.add(2, this.f29187t);
        this.f29182j.mo200823b(this.f29184l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41027e() {
        this.f29184l.remove(this.f29187t);
        this.f29182j.mo200823b(this.f29184l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo41028f() {
        this.f29184l.remove(this.f29189v);
        this.f29182j.mo200823b(this.f29184l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo41032j() {
        this.f29182j.setVisibility(0);
        this.f29183k.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41018a() {
        this.f29176d.setVisibility(0);
        this.f29178f.start();
        this.f29179g.setVisibility(8);
        this.f29181i.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<String> mo41029g() {
        ArrayList arrayList = new ArrayList();
        for (OwnerInfo ownerInfo : this.f29187t.mo41015b()) {
            arrayList.add(ownerInfo.getOwnerId());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<String> mo41030h() {
        ArrayList arrayList = new ArrayList();
        for (ChatInfo chatInfo : this.f29188u.mo41016c()) {
            arrayList.add(chatInfo.getChatId());
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo41031i() {
        this.f29185r.mo200844b(false);
        this.f29186s.mo200844b(false);
        this.f29186s.mo200843a(this.f29191x);
        this.f29186s.mo41013a((SearchByTypeAdapter.TypeItem) null);
        this.f29187t.mo200844b(false);
        this.f29187t.mo200848g().clear();
        this.f29187t.mo41015b().clear();
        this.f29188u.mo200844b(false);
        this.f29188u.mo200848g().clear();
        this.f29188u.mo41016c().clear();
        this.f29189v.mo200844b(false);
        this.f29189v.mo200843a(this.f29172A);
        this.f29189v.mo41014a((SearchRecord.Folder) null);
        if (!this.f29184l.contains(this.f29187t)) {
            this.f29184l.add(2, this.f29187t);
        }
        this.f29182j.mo200823b(this.f29184l);
    }

    /* renamed from: a */
    public void mo41019a(SearchByTypeAdapter.TypeItem typeItem) {
        this.f29186s.mo41013a(typeItem);
        if (typeItem != null) {
            this.f29186s.mo200844b(true);
            this.f29186s.mo200843a(this.f29173a.getString(typeItem.nameId));
        } else {
            this.f29186s.mo200844b(false);
            this.f29186s.mo200843a(this.f29173a.getString(R.string.Doc_Search_Type));
        }
        this.f29182j.mo200820a(this.f29186s);
    }

    /* renamed from: a */
    public void mo41020a(String str) {
        try {
            List parseArray = JSONObject.parseArray(str, OwnerInfo.class);
            int i = 0;
            if (parseArray == null || parseArray.size() <= 0) {
                this.f29187t.mo200844b(false);
                this.f29187t.mo200848g().clear();
                this.f29187t.mo41015b().clear();
                this.f29182j.mo200820a(this.f29187t);
                return;
            }
            this.f29187t.mo41015b().clear();
            this.f29187t.mo41015b().addAll(parseArray);
            this.f29187t.mo200844b(true);
            this.f29187t.mo200848g().clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (i < parseArray.size() && i < 3) {
                OwnerInfo ownerInfo = (OwnerInfo) parseArray.get(i);
                if (!TextUtils.isEmpty(ownerInfo.getAvatarKey())) {
                    arrayList.add(ownerInfo.getAvatarKey());
                    arrayList2.add(ownerInfo.getOwnerId());
                }
                i++;
            }
            ((AbstractC7996i) KoinJavaComponent.m268610a(AbstractC7996i.class)).mo30997a(arrayList, arrayList2, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new IGetDataCallback<List<Bitmap>>() {
                /* class com.bytedance.ee.bear.search.lark.space.C10865b.C108661 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (C13726a.m55674a(C10865b.this.f29173a)) {
                        C10865b.this.f29182j.mo200820a(C10865b.this.f29187t);
                    }
                }

                /* renamed from: a */
                public void onSuccess(List<Bitmap> list) {
                    if (C13726a.m55674a(C10865b.this.f29173a)) {
                        C10865b.this.f29187t.mo200848g().addAll(list);
                        C10865b.this.f29182j.mo200820a(C10865b.this.f29187t);
                    }
                }
            });
        } catch (Exception e) {
            C13479a.m54758a("lark.searchSpaceSearchViewHolder", "select owner info parse json error:" + e.getMessage() + ", origin json:" + str);
        }
    }

    /* renamed from: b */
    public void mo41024b(String str) {
        try {
            List parseArray = JSONObject.parseArray(str, ChatInfo.class);
            int i = 0;
            if (parseArray == null || parseArray.size() <= 0) {
                this.f29188u.mo200844b(false);
                this.f29188u.mo200848g().clear();
                this.f29188u.mo41016c().clear();
                this.f29182j.mo200820a(this.f29188u);
                return;
            }
            this.f29188u.mo41016c().clear();
            this.f29188u.mo41016c().addAll(parseArray);
            this.f29188u.mo200844b(true);
            this.f29188u.mo200848g().clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (i < parseArray.size() && i < 3) {
                ChatInfo chatInfo = (ChatInfo) parseArray.get(i);
                if (!TextUtils.isEmpty(chatInfo.getAvatarKey())) {
                    arrayList.add(chatInfo.getAvatarKey());
                    if (chatInfo.getChatType() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                        arrayList2.add(chatInfo.getChatId());
                    } else {
                        arrayList2.add(chatInfo.getP2pChatterId());
                    }
                }
                i++;
            }
            ((AbstractC7996i) KoinJavaComponent.m268610a(AbstractC7996i.class)).mo30997a(arrayList, arrayList2, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new IGetDataCallback<List<Bitmap>>() {
                /* class com.bytedance.ee.bear.search.lark.space.C10865b.C108672 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (C13726a.m55674a(C10865b.this.f29173a)) {
                        C10865b.this.f29182j.mo200820a(C10865b.this.f29188u);
                    }
                }

                /* renamed from: a */
                public void onSuccess(List<Bitmap> list) {
                    if (C13726a.m55674a(C10865b.this.f29173a)) {
                        C10865b.this.f29188u.mo200848g().addAll(list);
                        C10865b.this.f29182j.mo200820a(C10865b.this.f29188u);
                    }
                }
            });
        } catch (Exception e) {
            C13479a.m54758a("lark.searchSpaceSearchViewHolder", "select chat info parse json error:" + e.getMessage() + ", json:" + str);
        }
    }

    /* renamed from: a */
    public void mo41021a(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            this.f29189v.mo200844b(false);
            this.f29189v.mo200843a(this.f29172A);
        } else {
            SearchRecord.Folder folder = new SearchRecord.Folder();
            folder.setName(str);
            folder.setToken(str2);
            this.f29189v.mo200844b(true);
            this.f29189v.mo41014a(folder);
            this.f29189v.mo200843a(folder.getName());
        }
        this.f29182j.mo200820a(this.f29189v);
    }

    C10865b(Context context, View view) {
        this.f29173a = context;
        this.f29174b = (ViewGroup) view.findViewById(R.id.search_root);
        this.f29175c = view.findViewById(R.id.search_container_layout);
        this.f29176d = view.findViewById(R.id.search_loading);
        this.f29177e = (ImageView) view.findViewById(R.id.loading_img);
        UDLoadingDrawable aVar = new UDLoadingDrawable(context);
        this.f29178f = aVar;
        aVar.mo7701a(C57582a.m223616d(context, R.color.primary_pri_500));
        this.f29177e.setImageDrawable(this.f29178f);
        this.f29179g = (SmartRefreshLayout) view.findViewById(R.id.search_refresh_layout);
        this.f29180h = (RecyclerView) view.findViewById(R.id.search_result_recycler);
        this.f29181i = (SpaceEmptyState) view.findViewById(R.id.search_space_not_found_empty_state);
        this.f29182j = (FilterView) view.findViewById(R.id.search_filter_view);
        this.f29183k = (TextView) view.findViewById(R.id.search_offline_title);
        C13749l.m55752b(this.f29181i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41022a(boolean z, FilterView.IOnFilterItemClick bVar, FilterView.IOnResetClick cVar) {
        if (!z) {
            this.f29183k.setVisibility(0);
            this.f29182j.setVisibility(8);
        }
        SpaceFilterData aVar = this.f29185r;
        String string = this.f29173a.getString(R.string.Doc_Search_MyContent);
        this.f29190w = string;
        aVar.mo200843a(string);
        this.f29184l.add(this.f29185r);
        SpaceFilterData aVar2 = this.f29186s;
        String string2 = this.f29173a.getString(R.string.Doc_Search_Type);
        this.f29191x = string2;
        aVar2.mo200843a(string2);
        this.f29184l.add(this.f29186s);
        SpaceFilterData aVar3 = this.f29187t;
        String string3 = this.f29173a.getString(R.string.Doc_Share_ShareOwner);
        this.f29192y = string3;
        aVar3.mo200843a(string3);
        this.f29184l.add(this.f29187t);
        SpaceFilterData aVar4 = this.f29188u;
        String string4 = this.f29173a.getString(R.string.Doc_Search_SharedInChat);
        this.f29193z = string4;
        aVar4.mo200843a(string4);
        this.f29184l.add(this.f29188u);
        SpaceFilterData aVar5 = this.f29189v;
        String string5 = this.f29173a.getString(R.string.Doc_Search_Folder);
        this.f29172A = string5;
        aVar5.mo200843a(string5);
        this.f29184l.add(this.f29189v);
        this.f29182j.mo200821a(this.f29184l);
        this.f29182j.setOnFilterItemClick(bVar);
        this.f29182j.setOnResetClick(cVar);
        this.f29182j.mo200819a();
    }
}
