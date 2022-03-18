package com.bytedance.ee.bear.sheet.actionsheet;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "", "id", "text", "", "enabled", "", "(Ljava/lang/Object;Ljava/lang/String;Z)V", "getEnabled", "()Z", "getId", "()Ljava/lang/Object;", "setId", "(Ljava/lang/Object;)V", "leftIcon", "Lcom/bytedance/ee/bear/sheet/actionsheet/LeftIcon;", "getLeftIcon", "()Lcom/bytedance/ee/bear/sheet/actionsheet/LeftIcon;", "setLeftIcon", "(Lcom/bytedance/ee/bear/sheet/actionsheet/LeftIcon;)V", "rightIcons", "", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "getRightIcons", "()Ljava/util/List;", "setRightIcons", "(Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textTintColorRes", "", "getTextTintColorRes", "()Ljava/lang/Integer;", "setTextTintColorRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.a.c */
public class ActionSheetItem {

    /* renamed from: a */
    private Integer f29663a;

    /* renamed from: b */
    private LeftIcon f29664b;

    /* renamed from: c */
    private List<RightIcon> f29665c;

    /* renamed from: d */
    private Object f29666d;

    /* renamed from: e */
    private String f29667e;

    /* renamed from: f */
    private final boolean f29668f;

    /* renamed from: a */
    public final Integer mo42034a() {
        return this.f29663a;
    }

    /* renamed from: b */
    public final LeftIcon mo42037b() {
        return this.f29664b;
    }

    /* renamed from: c */
    public final List<RightIcon> mo42038c() {
        return this.f29665c;
    }

    /* renamed from: d */
    public final Object mo42039d() {
        return this.f29666d;
    }

    /* renamed from: e */
    public final String mo42040e() {
        return this.f29667e;
    }

    /* renamed from: f */
    public final boolean mo42041f() {
        return this.f29668f;
    }

    /* renamed from: a */
    public final void mo42035a(LeftIcon gVar) {
        this.f29664b = gVar;
    }

    /* renamed from: a */
    public final void mo42036a(Integer num) {
        this.f29663a = num;
    }

    public ActionSheetItem(Object obj, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(obj, "id");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f29666d = obj;
        this.f29667e = str;
        this.f29668f = z;
    }
}
