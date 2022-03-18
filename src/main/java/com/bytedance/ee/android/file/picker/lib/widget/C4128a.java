package com.bytedance.ee.android.file.picker.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.android.file.picker.lib.widget.a */
public class C4128a {
    /* renamed from: a */
    public static int m17188a() {
        return m17189a(15);
    }

    /* renamed from: b */
    public static int m17192b() {
        return m17189a(9);
    }

    /* renamed from: a */
    public static int m17189a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static void m17191a(TextView textView) {
        textView.setTextColor(textView.getResources().getColor(R.color.file_picker_lkui_grey_8));
        textView.setSingleLine();
        textView.setGravity(16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    public static View m17190a(Context context, AbstractC4130c.AbstractC4131a aVar) {
        ImageView imageView;
        if (aVar instanceof AbstractC4130c.C4133c) {
            ImageView imageView2 = new ImageView(context);
            AbstractC4130c.C4133c cVar = (AbstractC4130c.C4133c) aVar;
            if (cVar.mo16194d() != null) {
                imageView2.setImageDrawable(cVar.mo16194d());
                imageView = imageView2;
            } else {
                imageView2.setImageResource(aVar.mo16192b());
                imageView = imageView2;
            }
        } else if (aVar instanceof AbstractC4130c.C4134d) {
            AbstractC4130c.C4134d dVar = (AbstractC4130c.C4134d) aVar;
            TextView textView = new TextView(context);
            m17191a(textView);
            textView.setText(aVar.mo16190a());
            textView.setTextSize((float) dVar.mo16196e());
            if (dVar.mo16195d() != -1) {
                textView.setTextColor(context.getResources().getColorStateList(dVar.mo16195d()));
            } else {
                textView.setTextColor(context.getResources().getColorStateList(R.color.file_picker_black_c2_c3_selector));
            }
            imageView = textView;
        } else if (aVar instanceof AbstractC4130c.C4135e) {
            imageView = ((AbstractC4130c.C4135e) aVar).mo16197d();
        } else {
            imageView = null;
        }
        if (aVar.mo16193c() != 0) {
            imageView.setBackgroundResource(aVar.mo16193c());
        }
        imageView.setPadding(m17192b(), 0, m17188a(), 0);
        return imageView;
    }
}
