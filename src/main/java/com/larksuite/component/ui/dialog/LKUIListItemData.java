package com.larksuite.component.ui.dialog;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/ui/dialog/LKUIListItemData;", "", "content", "", "(Ljava/lang/CharSequence;)V", "iconRes", "", "(Ljava/lang/CharSequence;I)V", "()V", "getContent", "()Ljava/lang/CharSequence;", "setContent", "getIconRes", "()I", "setIconRes", "(I)V", "selectable", "", "getSelectable", "()Z", "setSelectable", "(Z)V", "selected", "getSelected", "setSelected", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.n */
public class LKUIListItemData {

    /* renamed from: a */
    private CharSequence f62606a;

    /* renamed from: b */
    private int f62607b;

    /* renamed from: c */
    private int f62608c;

    /* renamed from: d */
    private int f62609d;

    /* renamed from: a */
    public final CharSequence mo89285a() {
        return this.f62606a;
    }

    /* renamed from: b */
    public final int mo89288b() {
        return this.f62608c;
    }

    public LKUIListItemData() {
        this.f62606a = "";
        this.f62607b = -1;
        this.f62609d = -1;
    }

    /* renamed from: a */
    public final void mo89286a(int i) {
        this.f62607b = i;
    }

    /* renamed from: b */
    public final void mo89289b(int i) {
        this.f62608c = i;
    }

    /* renamed from: a */
    public final void mo89287a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f62606a = charSequence;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LKUIListItemData(CharSequence charSequence) {
        this();
        Intrinsics.checkParameterIsNotNull(charSequence, "content");
        this.f62606a = charSequence;
    }
}
