package com.tt.miniapp.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.view.b */
public class C67160b {

    /* renamed from: a */
    public static final Rect f169355a = new Rect();

    /* renamed from: b */
    private HashMap<View, Boolean> f169356b = new HashMap<>();

    /* renamed from: c */
    private ViewGroup f169357c;

    /* renamed from: d */
    private AbstractC67162a f169358d;

    /* renamed from: com.tt.miniapp.view.b$a */
    public interface AbstractC67162a {
        /* renamed from: a */
        void mo230766a(View view, boolean z);
    }

    /* renamed from: a */
    public void mo233530a() {
        ViewGroup viewGroup = this.f169357c;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo233534c(this.f169357c.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    public void mo233532a(AbstractC67162a aVar) {
        this.f169358d = aVar;
    }

    public C67160b(ViewGroup viewGroup) {
        this.f169357c = viewGroup;
    }

    /* renamed from: d */
    public static boolean m261797d(View view) {
        if (view != null && view.getVisibility() == 0) {
            return view.getLocalVisibleRect(f169355a);
        }
        return false;
    }

    /* renamed from: b */
    public void mo233533b(View view) {
        Boolean remove;
        AbstractC67162a aVar;
        if (view != null && (remove = this.f169356b.remove(view)) != null && remove.booleanValue() && (aVar = this.f169358d) != null) {
            aVar.mo230766a(view, false);
        }
    }

    /* renamed from: a */
    public void mo233531a(final View view) {
        if (view != null) {
            boolean d = m261797d(view);
            this.f169356b.put(view, Boolean.valueOf(d));
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class com.tt.miniapp.view.C67160b.View$OnLayoutChangeListenerC671611 */

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    C67160b.this.mo233534c(view);
                }
            });
            AbstractC67162a aVar = this.f169358d;
            if (aVar != null) {
                aVar.mo230766a(view, d);
            }
        }
    }

    /* renamed from: c */
    public void mo233534c(View view) {
        Boolean bool;
        boolean d;
        if (view != null && (bool = this.f169356b.get(view)) != null && (d = m261797d(view)) != bool.booleanValue()) {
            this.f169356b.put(view, Boolean.valueOf(d));
            AbstractC67162a aVar = this.f169358d;
            if (aVar != null) {
                aVar.mo230766a(view, d);
            }
        }
    }
}
