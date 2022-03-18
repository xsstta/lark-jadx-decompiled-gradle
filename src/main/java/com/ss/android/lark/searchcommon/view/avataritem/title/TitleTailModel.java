package com.ss.android.lark.searchcommon.view.avataritem.title;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleTailModel;", "", "tailText", "", "color", "", "(Ljava/lang/String;I)V", "getColor", "()I", "getTailText", "()Ljava/lang/String;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.g.d */
public final class TitleTailModel {

    /* renamed from: a */
    private final String f133548a;

    /* renamed from: b */
    private final int f133549b;

    public TitleTailModel() {
        this(null, 0, 3, null);
    }

    /* renamed from: a */
    public final String mo184738a() {
        return this.f133548a;
    }

    /* renamed from: b */
    public final int mo184739b() {
        return this.f133549b;
    }

    public TitleTailModel(String str, int i) {
        this.f133548a = str;
        this.f133549b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TitleTailModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? R.color.text_placeholder : i);
    }
}
