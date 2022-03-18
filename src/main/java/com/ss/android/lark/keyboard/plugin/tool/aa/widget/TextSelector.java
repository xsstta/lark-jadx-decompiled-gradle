package com.ss.android.lark.keyboard.plugin.tool.aa.widget;

import android.text.Editable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;", "", "()V", "<set-?>", "", "end", "getEnd", "()I", "start", "getStart", "target", "Landroid/text/Editable;", "getTarget", "()Landroid/text/Editable;", "setTarget", "(Landroid/text/Editable;)V", "count", "hasTextSelected", "", "isValid", "reset", "", "select", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.d */
public final class TextSelector {

    /* renamed from: a */
    private int f103735a = -1;

    /* renamed from: b */
    private int f103736b = -1;

    /* renamed from: c */
    private Editable f103737c;

    /* renamed from: a */
    public final int mo147354a() {
        return this.f103735a;
    }

    /* renamed from: b */
    public final int mo147357b() {
        return this.f103736b;
    }

    /* renamed from: c */
    public final Editable mo147358c() {
        return this.f103737c;
    }

    /* renamed from: d */
    public final void mo147359d() {
        this.f103735a = -1;
        this.f103736b = -1;
    }

    /* renamed from: e */
    public final int mo147360e() {
        return this.f103736b - this.f103735a;
    }

    /* renamed from: f */
    public final boolean mo147361f() {
        if (mo147360e() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo147362g() {
        if (this.f103735a == -1 || this.f103736b == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo147356a(Editable editable) {
        this.f103737c = editable;
    }

    /* renamed from: a */
    public final void mo147355a(int i, int i2) {
        this.f103735a = i;
        this.f103736b = i2;
    }
}
