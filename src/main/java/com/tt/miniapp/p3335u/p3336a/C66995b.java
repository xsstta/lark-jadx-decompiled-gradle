package com.tt.miniapp.p3335u.p3336a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.tt.miniapp.p3335u.C66997b;
import com.tt.miniapp.util.C67043j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.u.a.b */
public class C66995b {

    /* renamed from: a */
    private final C66996c f168934a;

    /* renamed from: b */
    private View f168935b;

    /* renamed from: c */
    private ImageView f168936c;

    /* renamed from: d */
    private TextView f168937d;

    C66995b(C66996c cVar) {
        this.f168934a = cVar;
    }

    /* renamed from: a */
    public void mo233032a(int i) {
        Drawable a;
        View view = this.f168935b;
        if (view != null) {
            Context context = view.getContext();
            C66997b c = this.f168934a.mo233037c();
            if (c != null) {
                String b = m261111b(context, c.f168943a);
                if (!TextUtils.isEmpty(b) && (a = m261109a(context, c.f168943a)) != null) {
                    this.f168936c.setImageDrawable(a);
                    this.f168937d.setText(b);
                    AppBrandLogger.m52828d("MenuItemHelper", "update state: " + i);
                    return;
                }
            }
            this.f168935b.setVisibility(8);
        }
    }

    /* renamed from: a */
    private Drawable m261109a(Context context, int i) {
        if (12 == i) {
            return ContextCompat.getDrawable(context, R.drawable.microapp_m_secrecy_location_dialog);
        }
        if (13 == i) {
            return ContextCompat.getDrawable(context, R.drawable.microapp_m_secrecy_microphone_dialog);
        }
        return null;
    }

    /* renamed from: b */
    private String m261111b(Context context, int i) {
        String str;
        if (12 == i) {
            str = context.getString(R.string.OpenPlatform_AppActions_UseLocationDesc);
        } else if (13 == i) {
            str = context.getString(R.string.OpenPlatform_AppActions_UseMicDesc);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return CharacterUtils.empty();
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo233033a(RelativeLayout relativeLayout, int i, int i2) {
        Drawable a;
        Context context = relativeLayout.getContext();
        C66997b c = this.f168934a.mo233037c();
        if (c != null) {
            String b = m261111b(context, c.f168943a);
            if (!TextUtils.isEmpty(b) && (a = m261109a(context, c.f168943a)) != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) LayoutInflater.from(context).inflate(R.layout.microapp_secrecy_tip_menu, (ViewGroup) relativeLayout, false);
                this.f168935b = linearLayoutCompat;
                this.f168936c = (ImageView) linearLayoutCompat.findViewById(R.id.iv_icon);
                this.f168937d = (TextView) this.f168935b.findViewById(R.id.tv_text);
                this.f168936c.setImageDrawable(a);
                m261110a(context, this.f168937d, (TextView) relativeLayout.findViewById(i2), c);
                this.f168937d.setText(b);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(21);
                layoutParams.setMarginEnd(C57582a.m223600a(20));
                layoutParams.addRule(6, i);
                layoutParams.addRule(8, i);
                relativeLayout.addView(this.f168935b, layoutParams);
            }
        }
    }

    /* renamed from: a */
    private void m261110a(Context context, TextView textView, TextView textView2, C66997b bVar) {
        List<C66997b> b = this.f168934a.mo233036b();
        if (b == null || b.isEmpty()) {
            b = new ArrayList<>();
            b.add(bVar);
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        String str = "";
        for (C66997b bVar2 : b) {
            if (12 == bVar2.f168943a) {
                str = context.getString(R.string.OpenPlatform_AppActions_UseLocationDesc);
            } else if (13 == bVar2.f168943a) {
                str = context.getString(R.string.OpenPlatform_AppActions_UseMicDesc);
            }
            float measureText = textView.getPaint().measureText(str);
            if (measureText > f) {
                f = measureText;
            }
        }
        int b2 = C67043j.m261275b(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_icon_marginLeft);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_drawable_size);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_menu_title_name_marginLeft);
        CharSequence text = textView2.getText();
        int floor = (int) Math.floor((double) textView2.getPaint().measureText(text, 0, text.length()));
        int a = ((((b2 - dimensionPixelOffset) - dimensionPixelOffset2) - dimensionPixelOffset3) - floor) - C57582a.m223600a(56);
        int a2 = (floor + a) - C57582a.m223600a(44);
        AppBrandLogger.m52830i("MenuItemHelper", "screen width " + b2 + "  rightMinWidth: " + a);
        if (((float) a) > f) {
            textView.setMaxWidth((int) Math.floor((double) f));
        } else if (((float) a2) >= f) {
            int floor2 = (int) Math.floor((double) f);
            textView.setMaxWidth(floor2);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.width = C57582a.m223600a(44) + (a2 - floor2);
            textView2.setLayoutParams(layoutParams);
        } else {
            textView.setMaxLines(2);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            layoutParams2.width = a2;
            textView.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            layoutParams3.width = C57582a.m223600a(44);
            textView2.setLayoutParams(layoutParams3);
        }
    }
}
