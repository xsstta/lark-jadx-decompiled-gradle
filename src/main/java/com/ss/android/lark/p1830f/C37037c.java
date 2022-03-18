package com.ss.android.lark.p1830f;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.by.inflate_lib.p099a.C2600a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.f.c */
public class C37037c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.f.c$a */
    public class C37038a {

        /* renamed from: a */
        float f95156a;

        /* renamed from: b */
        float f95157b;

        C37038a() {
        }
    }

    /* renamed from: a */
    private C37038a m146110a(View view) {
        C37038a aVar = (C37038a) view.getTag(R.id.tag_translate_param);
        if (aVar != null) {
            return aVar;
        }
        C37038a aVar2 = new C37038a();
        view.setTag(R.id.tag_translate_param, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public void mo136560a(TextView textView, ViewGroup.LayoutParams layoutParams) {
        Drawable background;
        ColorStateList textColors;
        C37038a aVar = (C37038a) textView.getTag(R.id.tag_translate_param);
        if (aVar != null) {
            if (!(aVar.f95156a == BitmapDescriptorFactory.HUE_RED || (textColors = textView.getTextColors()) == null)) {
                textView.setTextColor(textColors.withAlpha((int) (aVar.f95156a * 255.0f)));
            }
            if (aVar.f95157b != BitmapDescriptorFactory.HUE_RED && (background = textView.getBackground()) != null) {
                background.mutate().setAlpha((int) (aVar.f95157b * 255.0f));
                textView.setBackground(background);
            }
        }
    }

    /* renamed from: a */
    public boolean mo136561a(String str, C2600a aVar, TextView textView, ViewGroup.LayoutParams layoutParams) {
        str.hashCode();
        if (str.equals("app:backgroundAlpha")) {
            m146110a(textView).f95157b = C37039d.m146113a(aVar);
            return true;
        } else if (!str.equals("app:textColorAlpha")) {
            return false;
        } else {
            m146110a(textView).f95156a = C37039d.m146113a(aVar);
            return true;
        }
    }
}
