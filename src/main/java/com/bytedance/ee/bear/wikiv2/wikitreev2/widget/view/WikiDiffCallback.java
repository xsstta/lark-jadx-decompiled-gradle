package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.text.TextUtils;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12478g;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiUIList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "olds", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "news", "oldFocus", "", "newFocus", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;Ljava/lang/String;Ljava/lang/String;)V", "getNewFocus", "()Ljava/lang/String;", "getNews", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "getOldFocus", "getOlds", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.d */
public final class WikiDiffCallback extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private final WikiUIList f33681a;

    /* renamed from: b */
    private final WikiUIList f33682b;

    /* renamed from: c */
    private final String f33683c;

    /* renamed from: d */
    private final String f33684d;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        return this.f33681a.mo47593a().size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        return this.f33682b.mo47593a().size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        return Intrinsics.areEqual(this.f33681a.mo47593a().get(i).f33440b, this.f33682b.mo47593a().get(i2).f33440b);
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        C12478g gVar = this.f33681a.mo47593a().get(i);
        C12478g gVar2 = this.f33682b.mo47593a().get(i2);
        if ((TextUtils.isEmpty(this.f33683c) || !TextUtils.equals(this.f33683c, gVar2.f33440b)) && ((TextUtils.isEmpty(this.f33684d) || !TextUtils.equals(this.f33684d, gVar2.f33440b)) && Intrinsics.areEqual(gVar.f33439a, gVar2.f33439a) && Intrinsics.areEqual(gVar.f33440b, gVar2.f33440b) && Intrinsics.areEqual(gVar.f33441c, gVar2.f33441c) && gVar.f33442d == gVar2.f33442d && Intrinsics.areEqual(gVar.f33443e, gVar2.f33443e) && Intrinsics.areEqual(gVar.f33444f, gVar2.f33444f) && gVar.f33445g == gVar2.f33445g && gVar.f33446h == gVar2.f33446h && Intrinsics.areEqual(gVar.f33447i, gVar2.f33447i) && Intrinsics.areEqual(gVar.f33448j, gVar2.f33448j) && Intrinsics.areEqual(gVar.f33450l, gVar2.f33450l) && gVar.f33451m == gVar2.f33451m && gVar.f33452n == gVar2.f33452n && gVar.f33453o == gVar2.f33453o)) {
            return true;
        }
        return false;
    }

    public WikiDiffCallback(WikiUIList kVar, WikiUIList kVar2, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(kVar, "olds");
        Intrinsics.checkParameterIsNotNull(kVar2, "news");
        this.f33681a = kVar;
        this.f33682b = kVar2;
        this.f33683c = str;
        this.f33684d = str2;
    }
}
