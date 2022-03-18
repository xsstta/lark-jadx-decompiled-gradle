package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.fontface.C26890b;
import java.util.List;

public class InlineTextShadowNode extends BaseTextShadowNode {

    /* renamed from: a */
    private int f66116a;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: g */
    public boolean mo94804g() {
        return true;
    }

    @LynxProp(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.f66116a = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public void mo94830a(int i, int i2, List<BaseTextShadowNode.C26711b> list) {
        super.mo94830a(i, i2, list);
        list.add(new BaseTextShadowNode.C26711b(i, i2, new ForegroundColorSpan(mo67399a().f66142c)));
        list.add(new BaseTextShadowNode.C26711b(i, i2, new BackgroundColorSpan(this.f66116a)));
        list.add(new BaseTextShadowNode.C26711b(i, i2, new C26718e(mo94808k())));
        if (this.f66116a != 0) {
            list.add(new BaseTextShadowNode.C26711b(i, i2, new BackgroundColorSpan(this.f66116a)));
        }
        if (mo67399a().f66152m != 1.0E21f) {
            list.add(new BaseTextShadowNode.C26711b(i, i2, new AbsoluteSizeSpan(Math.round(mo67399a().f66152m))));
        }
        if (!TextUtils.isEmpty(mo67399a().f66155p)) {
            String str = mo67399a().f66155p;
            int b = mo94833b();
            Typeface a = C26734o.m96870a(mo94810m(), str, b);
            if (a == null) {
                C26890b.m97746a().mo95697a(mo94810m(), str, b, new TextShadowNode.C26713a(this));
                a = Typeface.defaultFromStyle(mo94833b());
            }
            list.add(new BaseTextShadowNode.C26711b(i, i2, new C26719f(a)));
        }
        if (mo67399a().f66145f == 1 || mo67399a().f66146g == 2) {
            list.add(new BaseTextShadowNode.C26711b(i, i2, new StyleSpan(mo94833b())));
        }
    }
}
