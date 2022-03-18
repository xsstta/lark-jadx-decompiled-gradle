package com.ss.android.lark.p1830f;

import android.view.View;
import android.view.ViewGroup;
import com.by.inflate_lib.p099a.C2600a;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.f.a */
public class C37034a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.f.a$a */
    public class C37035a {

        /* renamed from: a */
        int f95148a;

        /* renamed from: b */
        int f95149b;

        /* renamed from: c */
        int f95150c;

        /* renamed from: d */
        int f95151d;

        /* renamed from: e */
        int f95152e;

        /* renamed from: f */
        int f95153f;

        /* renamed from: g */
        float f95154g;

        C37035a() {
        }
    }

    /* renamed from: a */
    private C37035a m146105a(View view) {
        C37035a aVar = (C37035a) view.getTag(R.id.tag_translate_param);
        if (aVar != null) {
            return aVar;
        }
        C37035a aVar2 = new C37035a();
        view.setTag(R.id.tag_translate_param, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public void mo136556a(LKUIButton lKUIButton, ViewGroup.LayoutParams layoutParams) {
        C37035a aVar = (C37035a) lKUIButton.getTag(R.id.tag_translate_param);
        if (aVar != null) {
            lKUIButton.setBackground(C37039d.m146116a(aVar.f95148a, C25653b.m91893a(aVar.f95149b, aVar.f95154g), aVar.f95150c, aVar.f95151d, aVar.f95152e, aVar.f95153f));
        }
    }

    /* renamed from: a */
    public boolean mo136557a(String str, C2600a aVar, LKUIButton lKUIButton, ViewGroup.LayoutParams layoutParams) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1066519632:
                if (str.equals("app:button_stroke_color")) {
                    c = 0;
                    break;
                }
                break;
            case -1048235501:
                if (str.equals("app:button_stroke_width")) {
                    c = 1;
                    break;
                }
                break;
            case -963051183:
                if (str.equals("app:button_pressed_color_alpha")) {
                    c = 2;
                    break;
                }
                break;
            case -327845089:
                if (str.equals("app:button_normal_color")) {
                    c = 3;
                    break;
                }
                break;
            case 244569272:
                if (str.equals("app:button_disable_color")) {
                    c = 4;
                    break;
                }
                break;
            case 805997352:
                if (str.equals("app:button_corner_radius")) {
                    c = 5;
                    break;
                }
                break;
            case 1461455474:
                if (str.equals("app:button_pressed_color")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m146105a(lKUIButton).f95152e = C37039d.m146114a(lKUIButton.getContext(), aVar);
                return true;
            case 1:
                m146105a(lKUIButton).f95153f = (int) C37039d.m146117b(lKUIButton.getContext(), aVar);
                return true;
            case 2:
                m146105a(lKUIButton).f95154g = C37039d.m146113a(aVar);
                return true;
            case 3:
                m146105a(lKUIButton).f95148a = C37039d.m146114a(lKUIButton.getContext(), aVar);
                return true;
            case 4:
                m146105a(lKUIButton).f95150c = C37039d.m146114a(lKUIButton.getContext(), aVar);
                return true;
            case 5:
                m146105a(lKUIButton).f95151d = (int) C37039d.m146117b(lKUIButton.getContext(), aVar);
                return true;
            case 6:
                m146105a(lKUIButton).f95149b = C37039d.m146114a(lKUIButton.getContext(), aVar);
                return true;
            default:
                return false;
        }
    }
}
