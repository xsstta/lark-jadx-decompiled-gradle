package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.Structure;
import com.bytedance.ee.plugin.common.ttpdfreader.Bookmark;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0002J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eR*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R6\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutline;", "", "outline", "", "Lcom/bytedance/ee/plugin/common/ttpdfreader/Bookmark;", "(Ljava/util/List;)V", "bookmarks", "Ljava/util/HashMap;", "", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutline$PDFBookmark;", "Lkotlin/collections/HashMap;", "relations", "rootHash", "dftFlat", "", "hash", "paragraphs", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/structure/Structure$Paragraph;", "Lkotlin/collections/ArrayList;", "fillBookmarks", "parentHash", "parent", "level", "", "findBookmark", "setCollapseStatus", "collapse", "", "toParagraphStructure", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/structure/Structure;", "Companion", "PDFBookmark", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.c */
public final class PDFOutline {

    /* renamed from: a */
    public static final Companion f20145a = new Companion(null);

    /* renamed from: b */
    private final String f20146b = "/";

    /* renamed from: c */
    private final HashMap<String, PDFBookmark> f20147c;

    /* renamed from: d */
    private final HashMap<String, List<String>> f20148d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutline$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutline$PDFBookmark;", "Lcom/bytedance/ee/plugin/common/ttpdfreader/Bookmark;", "hash", "", "collapse", "", "level", "", "title", "pageIdx", "", "children", "", "(Ljava/lang/String;ZILjava/lang/String;JLjava/util/List;)V", "getCollapse", "()Z", "setCollapse", "(Z)V", "getHash", "()Ljava/lang/String;", "getLevel", "()I", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.c$b */
    public static final class PDFBookmark extends Bookmark {

        /* renamed from: a */
        private final String f20149a;

        /* renamed from: b */
        private boolean f20150b;

        /* renamed from: c */
        private final int f20151c;

        /* renamed from: a */
        public final String mo29167a() {
            return this.f20149a;
        }

        /* renamed from: b */
        public final boolean mo29169b() {
            return this.f20150b;
        }

        /* renamed from: c */
        public final int mo29170c() {
            return this.f20151c;
        }

        /* renamed from: a */
        public final void mo29168a(boolean z) {
            this.f20150b = z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PDFBookmark(String str, boolean z, int i, String str2, long j, List<? extends Bookmark> list) {
            super(list, str2, j);
            Intrinsics.checkParameterIsNotNull(str, "hash");
            Intrinsics.checkParameterIsNotNull(str2, "title");
            Intrinsics.checkParameterIsNotNull(list, "children");
            this.f20149a = str;
            this.f20150b = z;
            this.f20151c = i;
        }
    }

    /* renamed from: a */
    public final Structure mo29164a() {
        ArrayList<Structure.Paragraph> arrayList = new ArrayList<>();
        m29871a(this.f20146b, arrayList);
        Structure structure = new Structure();
        structure.paragraphs = (Structure.Paragraph[]) arrayList.toArray(new Structure.Paragraph[0]);
        return structure;
    }

    /* renamed from: a */
    public final Bookmark mo29165a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hash");
        return this.f20147c.get(str);
    }

    public PDFOutline(List<? extends Bookmark> list) {
        Intrinsics.checkParameterIsNotNull(list, "outline");
        HashMap<String, PDFBookmark> hashMap = new HashMap<>();
        this.f20147c = hashMap;
        this.f20148d = new HashMap<>();
        PDFBookmark bVar = new PDFBookmark("/", false, 0, "", 0, list);
        hashMap.put(bVar.mo29167a(), bVar);
        m29870a("/", bVar, bVar.mo29170c());
    }

    /* renamed from: a */
    public final void mo29166a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "hash");
        PDFBookmark bVar = this.f20147c.get(str);
        if (bVar != null) {
            bVar.mo29168a(z);
        }
    }

    /* renamed from: a */
    private final void m29871a(String str, ArrayList<Structure.Paragraph> arrayList) {
        PDFBookmark bVar = this.f20147c.get(str);
        if (bVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(bVar, "bookmarks[hash] ?: return");
            if (!TextUtils.equals(str, this.f20146b)) {
                arrayList.add(new Structure.Paragraph(bVar.mo29167a(), bVar.getTitle(), bVar.mo29170c(), 0, true, !C13657b.m55421a(bVar.getChildren()), bVar.mo29169b()));
            }
            if (!(bVar.mo29169b() || this.f20148d.get(str) == null)) {
                List<String> list = this.f20148d.get(str);
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                for (String str2 : list) {
                    m29871a(str2, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m29870a(String str, Bookmark bookmark, int i) {
        if (!C13657b.m55421a(bookmark.getChildren())) {
            for (Bookmark bookmark2 : bookmark.getChildren()) {
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkExpressionValueIsNotNull(bookmark2, "child");
                sb.append(bookmark2.getTitle());
                sb.append(bookmark2.getPageIdx());
                sb.append(i2);
                String a = C13602d.m55222a(sb.toString());
                Intrinsics.checkExpressionValueIsNotNull(a, "childHash");
                String title = bookmark2.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "child.title");
                long pageIdx = bookmark2.getPageIdx();
                List<Bookmark> children = bookmark2.getChildren();
                Intrinsics.checkExpressionValueIsNotNull(children, "child.children");
                this.f20147c.put(a, new PDFBookmark(a, false, i2, title, pageIdx, children));
                List<String> list = this.f20148d.get(str);
                if (!(list instanceof ArrayList)) {
                    list = null;
                }
                ArrayList arrayList = (ArrayList) list;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f20148d.put(str, arrayList);
                }
                arrayList.add(a);
                m29870a(a, bookmark2, i2);
            }
        }
    }
}
