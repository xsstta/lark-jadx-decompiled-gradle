package com.bytedance.ee.bear.wiki.search;

import android.content.Context;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.wiki.search.WikiSearchPuller;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.search.a */
public class C12031a {

    /* renamed from: a */
    private Context f32471a;

    public C12031a(Context context) {
        this.f32471a = context;
    }

    /* renamed from: a */
    private String m49833a(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null) {
            return spacesInfo.space_name;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo is null");
        return null;
    }

    /* renamed from: b */
    private String m49836b(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null) {
            return spacesInfo.description;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo is null");
        return null;
    }

    /* renamed from: c */
    private boolean m49838c(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null) {
            return spacesInfo.is_star;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo is null");
        return false;
    }

    /* renamed from: d */
    private int m49839d(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null) {
            return spacesInfo.attr;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo is null");
        return -1;
    }

    /* renamed from: e */
    private String m49842e(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null) {
            return spacesInfo.space_id;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo is null");
        return null;
    }

    /* renamed from: a */
    private WikiSearchPuller.Data.C12011Entity.ObjsBean.WikiInfo m49831a(WikiSearchPuller.Data.C12011Entity.ObjsBean objsBean) {
        if (objsBean.wiki_infos == null) {
            C13479a.m54758a("WikiSearchTAG", "objsBean.wiki_infos == null");
            return null;
        } else if (objsBean.wiki_infos.get(0) != null) {
            return objsBean.wiki_infos.get(0);
        } else {
            C13479a.m54758a("WikiSearchTAG", "wiki_info == null");
            return null;
        }
    }

    /* renamed from: f */
    private String m49844f(WikiSearchPuller.Data.SpacesInfo spacesInfo) {
        if (spacesInfo != null && spacesInfo.home_page != null) {
            return spacesInfo.home_page.wiki_token;
        }
        C13479a.m54758a("WikiSearchTAG", "spacesInfo == null or spacesInfo.home_page == null");
        return null;
    }

    /* renamed from: a */
    private String m49834a(String str) {
        if (str == null) {
            C13479a.m54758a("WikiSearchTAG", "parentNameFromServer == null");
            str = "";
        }
        if ("".equals(str)) {
            return ".../".concat(this.f32471a.getResources().getString(R.string.Doc_Wiki_UntitledPage));
        }
        return ".../".concat(str);
    }

    /* renamed from: a */
    private String m49832a(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean g = m49845g(entity, str);
        if (g != null) {
            return g.title;
        }
        C13479a.m54758a("WikiSearchTAG", "objsBean == null");
        return null;
    }

    /* renamed from: b */
    private int m49835b(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean g = m49845g(entity, str);
        if (g != null) {
            return g.type;
        }
        C13479a.m54758a("WikiSearchTAG", "objsBean == null");
        return -1;
    }

    /* renamed from: c */
    private String m49837c(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean.WikiInfo f = m49843f(entity, str);
        if (f != null) {
            return f.wiki_token;
        }
        C13479a.m54758a("WikiSearchTAG", "wikiInfo == null");
        return null;
    }

    /* renamed from: d */
    private String m49840d(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean.WikiInfo f = m49843f(entity, str);
        if (f != null) {
            return f.space_id;
        }
        C13479a.m54758a("WikiSearchTAG", "wikiInfo == null");
        return null;
    }

    /* renamed from: f */
    private WikiSearchPuller.Data.C12011Entity.ObjsBean.WikiInfo m49843f(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean g = m49845g(entity, str);
        if (g != null) {
            return m49831a(g);
        }
        C13479a.m54758a("WikiSearchTAG", "objsBean == null");
        return null;
    }

    /* renamed from: e */
    private String m49841e(WikiSearchPuller.Data.C12011Entity entity, String str) {
        WikiSearchPuller.Data.C12011Entity.ObjsBean.WikiInfo f = m49843f(entity, str);
        if (f == null) {
            C13479a.m54758a("WikiSearchTAG", "wikiInfo == null");
            return null;
        }
        List<String> list = f.main_path;
        if (CollectionUtils.isEmpty(list)) {
            C13479a.m54764b("WikiSearchTAG", "parentPath == null || parentPath size 0");
            return this.f32471a.getResources().getString(R.string.Doc_Wiki_SearchResult_ParentInfo);
        } else if (list.size() == 1) {
            return m49834a(list.get(0));
        } else {
            if (list.size() == 2) {
                return m49834a(list.get(1));
            }
            return m49834a("");
        }
    }

    /* renamed from: g */
    private WikiSearchPuller.Data.C12011Entity.ObjsBean m49845g(WikiSearchPuller.Data.C12011Entity entity, String str) {
        if (entity.objs == null) {
            C13479a.m54758a("WikiSearchTAG", "entity.objs == null docToken = " + C13598b.m55197d(str));
            return null;
        }
        WikiSearchPuller.Data.C12011Entity.ObjsBean objsBean = entity.objs.get(str);
        if (objsBean != null) {
            return objsBean;
        }
        C13479a.m54758a("WikiSearchTAG", "objBean == null docToken = " + C13598b.m55197d(str));
        return null;
    }

    /* renamed from: a */
    public List<C12033c> mo46043a(WikiSearchPuller.Data data, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (data == null) {
            C13479a.m54758a("WikiSearchTAG", "serverData == null ...");
            return arrayList;
        }
        if (!z) {
            if (CollectionUtils.isEmpty(data.tokens) || data.entities == null) {
                C13479a.m54758a("WikiSearchTAG", "wiki tree search result from server is null");
            } else {
                for (String str2 : data.tokens) {
                    String a = m49832a(data.entities, str2);
                    int b = m49835b(data.entities, str2);
                    String c = m49837c(data.entities, str2);
                    String d = m49840d(data.entities, str2);
                    String e = m49841e(data.entities, str2);
                    if (!(a == null || c == null || d == null || e == null)) {
                        arrayList.add(new C12033c(str, a, c, d, e, data.has_more, b));
                    }
                }
            }
        } else if (CollectionUtils.isEmpty(data.spaces)) {
            C13479a.m54758a("WikiSearchTAG", "wiki space search result from server is null");
        } else {
            for (WikiSearchPuller.Data.SpacesInfo spacesInfo : data.spaces) {
                String e2 = m49842e(spacesInfo);
                String a2 = m49833a(spacesInfo);
                String b2 = m49836b(spacesInfo);
                int d2 = m49839d(spacesInfo);
                boolean c2 = m49838c(spacesInfo);
                String f = m49844f(spacesInfo);
                if (!(e2 == null || a2 == null || b2 == null || f == null)) {
                    arrayList.add(new C12033c(str, a2, e2, f, b2, c2, data.has_more, d2));
                }
            }
        }
        return arrayList;
    }
}
