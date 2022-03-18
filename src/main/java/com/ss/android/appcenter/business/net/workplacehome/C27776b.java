package com.ss.android.appcenter.business.net.workplacehome;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.common.util.C28182f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.net.workplacehome.b */
public class C27776b {
    @SerializedName("id")

    /* renamed from: a */
    private String f69389a;
    @SerializedName("name")

    /* renamed from: b */
    private String f69390b;
    @SerializedName("showTagHeader")

    /* renamed from: c */
    private boolean f69391c;
    @SerializedName("children")

    /* renamed from: d */
    private List<TagChild> f69392d;
    @SerializedName("isMainTag")

    /* renamed from: e */
    private boolean f69393e;
    @SerializedName("subTags")

    /* renamed from: f */
    private List<C27777a> f69394f;
    @SerializedName("hasMore")

    /* renamed from: g */
    private boolean f69395g;

    /* renamed from: com.ss.android.appcenter.business.net.workplacehome.b$a */
    public static class C27777a {
        @SerializedName("tagId")

        /* renamed from: a */
        private int f69396a;
        @SerializedName("tagName")

        /* renamed from: b */
        private String f69397b;

        /* renamed from: a */
        public int mo99141a() {
            return this.f69396a;
        }

        /* renamed from: b */
        public String mo99142b() {
            return this.f69397b;
        }
    }

    /* renamed from: a */
    public String mo99130a() {
        return this.f69389a;
    }

    /* renamed from: b */
    public String mo99133b() {
        return this.f69390b;
    }

    /* renamed from: c */
    public boolean mo99135c() {
        return this.f69391c;
    }

    /* renamed from: e */
    public boolean mo99137e() {
        return this.f69393e;
    }

    /* renamed from: f */
    public List<C27777a> mo99138f() {
        return this.f69394f;
    }

    /* renamed from: g */
    public boolean mo99139g() {
        return this.f69395g;
    }

    /* renamed from: d */
    public List<TagChild> mo99136d() {
        if (this.f69392d == null) {
            this.f69392d = new ArrayList();
        }
        return this.f69392d;
    }

    /* renamed from: h */
    public boolean mo99140h() {
        return !C28182f.m103238c(this.f69394f);
    }

    /* renamed from: i */
    private int m101508i() {
        for (int i = 0; i < this.f69392d.size(); i++) {
            if (this.f69392d.get(i).isAddApp()) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo99132a(String str) {
        List<TagChild> list = this.f69392d;
        if (!(list == null || str == null)) {
            for (TagChild tagChild : list) {
                if (tagChild.compareId(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo99134b(String str) {
        List<TagChild> list = this.f69392d;
        if (list != null && str != null) {
            TagChild tagChild = null;
            Iterator<TagChild> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TagChild next = it.next();
                if (next.compareId(str)) {
                    tagChild = next;
                    break;
                }
            }
            if (tagChild != null) {
                this.f69392d.remove(tagChild);
            }
        }
    }

    /* renamed from: a */
    public void mo99131a(ItemInfo itemInfo) {
        String str;
        if (this.f69392d != null && itemInfo != null && !mo99132a(itemInfo.getItemId())) {
            TagChild tagChild = new TagChild();
            tagChild.setItemId(itemInfo.getItemId());
            if (mo99137e()) {
                tagChild.setSubType("common");
            } else {
                tagChild.setSubType("available");
            }
            boolean isWidget = itemInfo.isWidget();
            boolean isBlock = itemInfo.isBlock();
            if (isWidget) {
                str = "widget";
            } else {
                str = "icon";
            }
            if (isBlock) {
                str = "block";
            }
            tagChild.setType(str);
            if (isWidget) {
                this.f69392d.add(tagChild);
                return;
            }
            int i = m101508i();
            if (i < 0) {
                this.f69392d.add(tagChild);
            } else {
                this.f69392d.add(i, tagChild);
            }
        }
    }
}
