package com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.b */
public class C13220b extends LinearLayout {

    /* renamed from: a */
    public AbstractC13222a f35040a;

    /* renamed from: b */
    private CheckBox[] f35041b;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.b$a */
    public interface AbstractC13222a {
        /* renamed from: a */
        void mo49360a(int i);
    }

    public C13220b(Context context) {
        super(context);
    }

    public void setListener(AbstractC13222a aVar) {
        this.f35040a = aVar;
    }

    /* renamed from: b */
    public void mo49357b(int i) {
        int i2 = 0;
        while (true) {
            CheckBox[] checkBoxArr = this.f35041b;
            if (i2 < checkBoxArr.length) {
                if (i2 != i) {
                    checkBoxArr[i2].setChecked(false);
                }
                i2++;
            } else {
                checkBoxArr[i].setChecked(true);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo49356a(int i) {
        this.f35041b = new CheckBox[i];
        for (int i2 = 0; i2 < i; i2++) {
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setBackgroundResource(R.drawable.lark_brand_indicate_item);
            checkBox.setButtonDrawable((Drawable) null);
            int a = C13264d.m54034a(getContext(), 7.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
            if (i2 != 0) {
                layoutParams.leftMargin = C13264d.m54034a(getContext(), 10.0f);
            }
            addView(checkBox, layoutParams);
            if (i2 == 0) {
                checkBox.setChecked(true);
            }
            checkBox.setTag(Integer.valueOf(i2));
            checkBox.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13220b.View$OnClickListenerC132211 */

                public void onClick(View view) {
                    if (C13220b.this.f35040a != null) {
                        C13220b.this.f35040a.mo49360a(((Integer) view.getTag()).intValue());
                    }
                    C13220b.this.mo49357b(((Integer) view.getTag()).intValue());
                }
            });
            this.f35041b[i2] = checkBox;
        }
    }
}
