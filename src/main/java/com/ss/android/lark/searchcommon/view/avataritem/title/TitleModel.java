package com.ss.android.lark.searchcommon.view.avataritem.title;

import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B9\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleModel;", "", "title", "", "isSelectable", "", "highLightKeys", "", "", "highLightColor", "", "(Ljava/lang/CharSequence;ZLjava/util/List;I)V", "getHighLightColor", "()I", "getHighLightKeys", "()Ljava/util/List;", "()Z", "getTitle", "()Ljava/lang/CharSequence;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.g.b */
public final class TitleModel {

    /* renamed from: a */
    private final CharSequence f133543a;

    /* renamed from: b */
    private final boolean f133544b;

    /* renamed from: c */
    private final List<String> f133545c;

    /* renamed from: d */
    private final int f133546d;

    public TitleModel() {
        this(null, false, null, 0, 15, null);
    }

    /* renamed from: a */
    public final CharSequence mo184732a() {
        return this.f133543a;
    }

    /* renamed from: b */
    public final boolean mo184733b() {
        return this.f133544b;
    }

    /* renamed from: c */
    public final List<String> mo184734c() {
        return this.f133545c;
    }

    /* renamed from: d */
    public final int mo184735d() {
        return this.f133546d;
    }

    public TitleModel(CharSequence charSequence, boolean z, List<String> list, int i) {
        this.f133543a = charSequence;
        this.f133544b = z;
        this.f133545c = list;
        this.f133546d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TitleModel(CharSequence charSequence, boolean z, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : charSequence, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? R.color.primary_pri_500 : i);
    }
}
