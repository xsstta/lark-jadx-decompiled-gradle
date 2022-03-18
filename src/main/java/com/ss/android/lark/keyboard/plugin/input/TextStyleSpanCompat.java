package com.ss.android.lark.keyboard.plugin.input;

import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.span.C59152b;
import com.ss.android.lark.widget.span.C59156f;
import com.ss.android.lark.widget.span.C59179o;
import com.ss.android.lark.widget.span.C59181q;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/TextStyleSpanCompat;", "", "()V", "copy", "Lcom/ss/android/lark/widget/linked_emojicon/TextStyleSpan;", "origin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.i */
public final class TextStyleSpanCompat {

    /* renamed from: a */
    public static final TextStyleSpanCompat f103506a = new TextStyleSpanCompat();

    private TextStyleSpanCompat() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final C58514h m161236a(C58514h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "origin");
        if (hVar instanceof C59152b) {
            return new C59152b(((C59152b) hVar).mo198353a());
        }
        if (hVar instanceof C59156f) {
            return new C59156f(((C59156f) hVar).mo198353a());
        }
        if (hVar instanceof C59181q) {
            return new C59181q(((C59181q) hVar).mo198353a());
        }
        if (hVar instanceof C59179o) {
            return new C59179o(((C59179o) hVar).mo198353a());
        }
        return null;
    }
}
