package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.p1216a.C26545a;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.shadow.text.e */
public class C26718e extends ClickableSpan implements AbstractC26623a {

    /* renamed from: a */
    private int f66136a;

    /* renamed from: b */
    private AbstractC26623a f66137b;

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: a */
    public void mo53295a(boolean z, boolean z2) {
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: m */
    public boolean mo53309m() {
        return false;
    }

    public void onClick(View view) {
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: s */
    public Map<String, C26545a> mo94578s() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: t */
    public boolean mo94579t() {
        return false;
    }

    public void updateDrawState(TextPaint textPaint) {
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: q */
    public int mo94576q() {
        return this.f66136a;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: r */
    public AbstractC26623a mo94577r() {
        return this.f66137b;
    }

    public C26718e(int i) {
        this.f66136a = i;
    }
}
