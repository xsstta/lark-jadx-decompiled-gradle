package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category;

import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.Group;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.ViewType;
import com.ss.android.appcenter.common.util.C28182f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryGroupData extends C27999a {

    /* renamed from: a */
    public static int f70088a = -1;

    /* renamed from: b */
    private C28011a f70089b;

    /* renamed from: c */
    private List<C28011a> f70090c;

    /* renamed from: d */
    private List<String> f70091d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagStatus {
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: b */
    public boolean mo99785b() {
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: d */
    public boolean mo99787d() {
        return true;
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.CategoryGroupData$a */
    public static class C28011a {

        /* renamed from: a */
        public List<ItemInfo> f70092a;

        /* renamed from: b */
        private int f70093b;

        /* renamed from: c */
        private int f70094c;

        /* renamed from: d */
        private String f70095d;

        /* renamed from: e */
        private boolean f70096e;

        /* renamed from: f */
        public int mo99851f() {
            return this.f70094c;
        }

        /* renamed from: g */
        public String mo99852g() {
            return this.f70095d;
        }

        /* renamed from: h */
        public boolean mo99853h() {
            return this.f70096e;
        }

        public C28011a() {
            this.f70093b = 2;
        }

        /* renamed from: b */
        public boolean mo99847b() {
            if (this.f70093b == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public int mo99856k() {
            if (this.f70093b == 4) {
                return 1;
            }
            return 4;
        }

        /* renamed from: a */
        public boolean mo99846a() {
            return !C28182f.m103238c(this.f70092a);
        }

        /* renamed from: c */
        public boolean mo99848c() {
            if (this.f70093b == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo99849d() {
            if (this.f70093b == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo99850e() {
            if (this.f70093b == 3) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public List<ItemInfo> mo99854i() {
            if (this.f70092a == null) {
                this.f70092a = new ArrayList();
            }
            return this.f70092a;
        }

        /* renamed from: l */
        public int mo99857l() {
            if (this.f70093b == 4) {
                return mo99854i().size();
            }
            return 1;
        }

        /* renamed from: j */
        public int mo99855j() {
            int i = this.f70093b;
            if (i == 1) {
                return ViewType.CHILD_CATEGORY_LOADING.getViewTypeValue();
            }
            if (i == 2) {
                return ViewType.CHILD_CATEGORY_ERROR.getViewTypeValue();
            }
            if (i == 3) {
                return ViewType.CHILD_CATEGORY_GUIDE.getViewTypeValue();
            }
            return ViewType.CHILD_CATEGORY_ICON.getViewTypeValue();
        }

        /* renamed from: a */
        public void mo99843a(int i) {
            this.f70093b = i;
        }

        /* renamed from: a */
        public void mo99845a(boolean z) {
            this.f70096e = z;
        }

        /* renamed from: a */
        public void mo99844a(List<ItemInfo> list) {
            if (C28182f.m103238c(list)) {
                list = new ArrayList<>();
            }
            this.f70092a = list;
            if (list.size() > 0) {
                mo99843a(4);
            } else {
                mo99843a(3);
            }
        }

        public C28011a(int i, int i2, String str) {
            this.f70093b = i;
            this.f70094c = i2;
            this.f70095d = str;
        }
    }

    /* renamed from: o */
    public List<String> mo99834o() {
        return this.f70091d;
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: c */
    public int mo99786c() {
        return ViewType.HEADER_CATEGORY.getViewTypeValue();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: e */
    public int mo99788e() {
        return ViewType.FOOTER_CATEGORY.getViewTypeValue();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: f */
    public int mo99789f() {
        return this.f70089b.mo99855j();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: g */
    public int mo99790g() {
        return this.f70089b.mo99856k();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: j */
    public int mo99793j() {
        return this.f70089b.mo99857l();
    }

    /* renamed from: p */
    public boolean mo99835p() {
        return this.f70089b.mo99847b();
    }

    /* renamed from: q */
    public boolean mo99836q() {
        return this.f70089b.mo99849d();
    }

    /* renamed from: r */
    public boolean mo99837r() {
        return this.f70089b.mo99848c();
    }

    /* renamed from: s */
    public boolean mo99838s() {
        return this.f70089b.mo99850e();
    }

    /* renamed from: t */
    public void mo99839t() {
        this.f70089b.mo99843a(1);
    }

    /* renamed from: u */
    public List<ItemInfo> mo99840u() {
        return this.f70089b.mo99854i();
    }

    /* renamed from: v */
    public boolean mo99841v() {
        return this.f70089b.mo99853h();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: i */
    public List<ItemInfo> mo99792i() {
        C28011a aVar = this.f70089b;
        if (aVar == null || aVar.f70092a == null) {
            return super.mo99792i();
        }
        return this.f70089b.f70092a;
    }

    /* renamed from: w */
    public synchronized void mo99842w() {
        HashMap hashMap = new HashMap();
        for (C28011a aVar : this.f70090c) {
            if (!C28182f.m103238c(aVar.mo99854i())) {
                hashMap.put(Integer.valueOf(aVar.mo99851f()), aVar.mo99854i());
            }
        }
        C28012a.m102378a(hashMap);
    }

    /* renamed from: a */
    public C28011a mo99831a(int i) {
        return (C28011a) C28182f.m103235a(this.f70090c, i, null);
    }

    /* renamed from: b */
    public void mo99833b(int i) {
        f70088a = i;
        this.f70089b = (C28011a) C28182f.m103235a(this.f70090c, i, new C28011a());
    }

    /* renamed from: a */
    public void mo99832a(Map<Integer, List<ItemInfo>> map) {
        for (C28011a aVar : this.f70090c) {
            if (!aVar.mo99846a()) {
                List<ItemInfo> list = map.get(Integer.valueOf(aVar.mo99851f()));
                if (!C28182f.m103238c(list)) {
                    aVar.mo99844a(list);
                }
            } else {
                aVar.mo99843a(4);
            }
        }
    }

    public CategoryGroupData(List<C28011a> list) {
        super(Group.CATEGORY);
        this.f70090c = list;
        if (f70088a == -1) {
            f70088a = 0;
        }
        this.f70089b = (C28011a) C28182f.m103235a(list, f70088a, new C28011a());
        this.f70091d = new ArrayList();
        for (C28011a aVar : this.f70090c) {
            this.f70091d.add(aVar.mo99852g());
        }
    }
}
