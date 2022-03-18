package com.bytedance.ee.bear.lark.selector;

import com.larksuite.component.ui.avatar.ImageKeyType;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DocSelectorViewData implements Serializable {
    public final List<String> descHitTerms;
    public final DocType docType;
    public final String docUrl;
    public final Icon icon;
    public final boolean isFooter;
    public final boolean isShowCrossTenantTag;
    public final List<String> nameHitTerms;
    public final String ownerId;
    public final String ownerName;
    public final String title;
    public final long updateTime;
    public final DocType wikiSubType;

    public static C8067a newBuilder() {
        return new C8067a();
    }

    public int hashCode() {
        return Objects.hashCode(this.docUrl);
    }

    /* renamed from: com.bytedance.ee.bear.lark.selector.DocSelectorViewData$a */
    public static final class C8067a {

        /* renamed from: a */
        public String f21597a;

        /* renamed from: b */
        public String f21598b;

        /* renamed from: c */
        public String f21599c;

        /* renamed from: d */
        public String f21600d;

        /* renamed from: e */
        public DocType f21601e;

        /* renamed from: f */
        public DocType f21602f;

        /* renamed from: g */
        public long f21603g;

        /* renamed from: h */
        public boolean f21604h;

        /* renamed from: i */
        public List<String> f21605i;

        /* renamed from: j */
        public List<String> f21606j;

        /* renamed from: k */
        public boolean f21607k;

        /* renamed from: l */
        public Icon f21608l;

        private C8067a() {
            this.f21605i = new ArrayList();
            this.f21606j = new ArrayList();
        }

        /* renamed from: a */
        public DocSelectorViewData mo31193a() {
            return new DocSelectorViewData(this);
        }

        /* renamed from: a */
        public C8067a mo31187a(long j) {
            this.f21603g = j;
            return this;
        }

        /* renamed from: b */
        public C8067a mo31194b(DocType docType) {
            this.f21602f = docType;
            return this;
        }

        /* renamed from: c */
        public C8067a mo31198c(String str) {
            this.f21599c = str;
            return this;
        }

        /* renamed from: d */
        public C8067a mo31199d(String str) {
            this.f21600d = str;
            return this;
        }

        /* renamed from: a */
        public C8067a mo31188a(DocType docType) {
            this.f21601e = docType;
            return this;
        }

        /* renamed from: b */
        public C8067a mo31195b(String str) {
            this.f21598b = str;
            return this;
        }

        /* renamed from: a */
        public C8067a mo31189a(Icon icon) {
            this.f21608l = icon;
            return this;
        }

        /* renamed from: b */
        public C8067a mo31196b(List<String> list) {
            if (list != null) {
                this.f21606j = list;
            }
            return this;
        }

        /* renamed from: a */
        public C8067a mo31190a(String str) {
            this.f21597a = str;
            return this;
        }

        /* renamed from: b */
        public C8067a mo31197b(boolean z) {
            this.f21607k = z;
            return this;
        }

        /* renamed from: a */
        public C8067a mo31191a(List<String> list) {
            if (list != null) {
                this.f21605i = list;
            }
            return this;
        }

        /* renamed from: a */
        public C8067a mo31192a(boolean z) {
            this.f21604h = z;
            return this;
        }
    }

    public ImageKeyType getImageKeyType() {
        Icon icon2 = this.icon;
        if (icon2 == null || icon2.getType() != ImageKeyType.IMAGE.getValue()) {
            return ImageKeyType.UNKOWN;
        }
        return ImageKeyType.IMAGE;
    }

    private DocSelectorViewData(C8067a aVar) {
        this.docUrl = aVar.f21597a;
        this.ownerId = aVar.f21598b;
        this.title = aVar.f21600d;
        this.updateTime = aVar.f21603g;
        this.ownerName = aVar.f21599c;
        this.docType = aVar.f21601e;
        this.wikiSubType = aVar.f21602f;
        this.nameHitTerms = aVar.f21605i;
        this.descHitTerms = aVar.f21606j;
        this.isFooter = aVar.f21604h;
        this.isShowCrossTenantTag = aVar.f21607k;
        this.icon = aVar.f21608l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocSelectorViewData docSelectorViewData = (DocSelectorViewData) obj;
        String str = this.docUrl;
        if (str == null || !str.equals(docSelectorViewData.docUrl)) {
            return false;
        }
        return true;
    }
}
