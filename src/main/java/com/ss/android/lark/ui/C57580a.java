package com.ss.android.lark.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.IActionTitlebar;

/* renamed from: com.ss.android.lark.ui.a */
public class C57580a {
    /* renamed from: a */
    public static int m223594a() {
        return m223595a(15);
    }

    /* renamed from: b */
    public static int m223598b() {
        return m223595a(9);
    }

    /* renamed from: a */
    public static int m223595a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static void m223597a(TextView textView) {
        textView.setTextColor(textView.getResources().getColor(R.color.lkui_N900));
        textView.setSingleLine();
        textView.setGravity(16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    public static View m223596a(Context context, IActionTitlebar.Action action) {
        ImageView imageView;
        if (action instanceof IActionTitlebar.C57573a) {
            final ImageView imageView2 = new ImageView(context);
            IActionTitlebar.C57573a aVar = (IActionTitlebar.C57573a) action;
            if (aVar.mo195540b() != null) {
                imageView2.setImageDrawable(aVar.mo195540b());
            } else {
                imageView2.setImageDrawable(C0215a.m655b(context, action.getDrawableRes()));
            }
            int a = aVar.mo195537a();
            if (a != 0) {
                imageView2.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(context, a)));
            }
            aVar.mo195539a(new IActionTitlebar.C57573a.AbstractC57574a() {
                /* class com.ss.android.lark.ui.C57580a.C575811 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.C57573a.AbstractC57574a
                /* renamed from: a */
                public void mo195541a(int i) {
                    if (i != 0) {
                        imageView2.setImageResource(i);
                    } else {
                        imageView2.setImageDrawable(null);
                    }
                }
            });
            imageView = imageView2;
        } else if (action instanceof IActionTitlebar.TextAction) {
            IActionTitlebar.TextAction textAction = (IActionTitlebar.TextAction) action;
            TextView textView = new TextView(context);
            m223597a(textView);
            textView.setText(action.getText());
            textView.setTextSize((float) textAction.getTextSize());
            if (textAction.getColor() != -1) {
                textView.setTextColor(context.getResources().getColorStateList(textAction.getColor()));
            } else {
                textView.setTextColor(context.getResources().getColorStateList(R.color.black_c2_c3_selector));
            }
            imageView = textView;
        } else if (action instanceof IActionTitlebar.C57575b) {
            imageView = ((IActionTitlebar.C57575b) action).mo195542a();
        } else {
            imageView = null;
        }
        if (action.getBackground() != 0) {
            imageView.setBackgroundResource(action.getBackground());
        }
        imageView.setPadding(m223598b(), 0, m223594a(), 0);
        return imageView;
    }
}
