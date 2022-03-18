package com.bytedance.ee.bear.debug.doctest;

import android.widget.TextView;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020\u001bJ\b\u0010)\u001a\u0004\u0018\u00010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010\n¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/DocCounter;", "", "mView", "Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl;", "(Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl;)V", "checkId", "", "getCheckId", "()Ljava/lang/String;", "setCheckId", "(Ljava/lang/String;)V", "value", "", "current", "getCurrent", "()I", "setCurrent", "(I)V", "docs", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "getDocs", "()Ljava/util/ArrayList;", "setDocs", "(Ljava/util/ArrayList;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "lastLabel", "getLastLabel", "setLastLabel", "getMView", "()Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl;", "nextId", "getNextId", "setNextId", "hasNext", "nextDoc", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.a */
public final class DocCounter {

    /* renamed from: a */
    private int f15115a;

    /* renamed from: b */
    private ArrayList<Document> f15116b = new ArrayList<>();

    /* renamed from: c */
    private String f15117c = "";

    /* renamed from: d */
    private String f15118d = "";

    /* renamed from: e */
    private String f15119e = "";

    /* renamed from: f */
    private boolean f15120f = true;

    /* renamed from: g */
    private final PopWindowImpl f15121g;

    /* renamed from: a */
    public final ArrayList<Document> mo21238a() {
        return this.f15116b;
    }

    /* renamed from: b */
    public final String mo21242b() {
        return this.f15117c;
    }

    /* renamed from: c */
    public final String mo21244c() {
        return this.f15118d;
    }

    /* renamed from: d */
    public final String mo21246d() {
        return this.f15119e;
    }

    /* renamed from: e */
    public final boolean mo21247e() {
        return this.f15120f;
    }

    /* renamed from: f */
    public final boolean mo21248f() {
        if (this.f15115a + 1 >= this.f15116b.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Document mo21249g() {
        if (this.f15116b.size() == 0) {
            return null;
        }
        int i = this.f15115a;
        if (i < 0) {
            mo21239a(0);
        } else {
            mo21239a(i + 1);
        }
        if (this.f15115a >= this.f15116b.size()) {
            return null;
        }
        return this.f15116b.get(this.f15115a);
    }

    /* renamed from: a */
    public final void mo21240a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15117c = str;
    }

    /* renamed from: b */
    public final void mo21243b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15118d = str;
    }

    /* renamed from: c */
    public final void mo21245c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15119e = str;
    }

    /* renamed from: a */
    public final void mo21241a(boolean z) {
        this.f15120f = z;
    }

    public DocCounter(PopWindowImpl hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "mView");
        this.f15121g = hVar;
    }

    /* renamed from: a */
    public final void mo21239a(int i) {
        TextView c = this.f15121g.mo21255c();
        c.setText("总共" + this.f15116b.size() + "篇文档");
        TextView d = this.f15121g.mo21256d();
        d.setText("已经打开过" + i + "篇文档");
        this.f15115a = i;
    }
}
