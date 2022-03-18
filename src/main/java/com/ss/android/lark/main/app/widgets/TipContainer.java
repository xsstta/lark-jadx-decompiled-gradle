package com.ss.android.lark.main.app.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class TipContainer extends FrameLayout {

    /* renamed from: a */
    private Map<String, WeakReference<View>> f112715a = new HashMap();

    /* renamed from: b */
    private String f112716b;

    /* renamed from: c */
    private AbstractC44415a f112717c;

    /* renamed from: com.ss.android.lark.main.app.widgets.TipContainer$a */
    public interface AbstractC44415a {
        /* renamed from: a */
        void mo157776a(String str);

        /* renamed from: b */
        void mo157777b(String str);
    }

    public void setTipChangeListener(AbstractC44415a aVar) {
        this.f112717c = aVar;
    }

    public TipContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo157778a(String str) {
        if (this.f112715a.containsKey(str)) {
            removeView(this.f112715a.get(str).get());
            this.f112715a.remove(str);
            if (this.f112717c != null && this.f112715a.get(str) == null) {
                this.f112717c.mo157776a(str);
            }
        }
    }

    /* renamed from: b */
    public void mo157780b(String str) {
        this.f112716b = str;
        for (Map.Entry<String, WeakReference<View>> entry : this.f112715a.entrySet()) {
            String key = entry.getKey();
            View view = entry.getValue().get();
            AbstractC44415a aVar = this.f112717c;
            if (aVar != null) {
                if (view == null) {
                    aVar.mo157776a(str);
                } else {
                    aVar.mo157777b(str);
                }
            }
            if (view != null) {
                if (key.equals(str)) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
            }
        }
    }

    public TipContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo157779a(String str, View view) {
        if (this.f112715a.containsKey(str)) {
            removeView(this.f112715a.get(str).get());
        }
        addView(view);
        this.f112715a.put(str, new WeakReference<>(view));
        if (!(this.f112717c == null || this.f112715a.get(str) == null)) {
            this.f112717c.mo157777b(str);
        }
        if (DesktopUtil.m144301a(getContext())) {
            view.setVisibility(0);
        } else if (TextUtils.equals(this.f112716b, str)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public TipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
