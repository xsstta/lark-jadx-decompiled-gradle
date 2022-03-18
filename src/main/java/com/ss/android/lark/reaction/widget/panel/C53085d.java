package com.ss.android.lark.reaction.widget.panel;

import android.graphics.drawable.Drawable;

/* renamed from: com.ss.android.lark.reaction.widget.panel.d */
public class C53085d {

    /* renamed from: a */
    public String f131251a;

    /* renamed from: b */
    public AbstractC53086a f131252b;

    /* renamed from: c */
    public int f131253c = -1;

    /* renamed from: d */
    public int f131254d = -1;

    /* renamed from: e */
    public int f131255e = -1;

    /* renamed from: f */
    public int f131256f = -1;

    /* renamed from: g */
    public int f131257g = -1;

    /* renamed from: h */
    public Drawable f131258h;

    /* renamed from: i */
    public boolean f131259i = true;

    /* renamed from: com.ss.android.lark.reaction.widget.panel.d$a */
    public interface AbstractC53086a {
        void onMenuItemClick();
    }

    public C53085d(String str, int i, AbstractC53086a aVar) {
        this.f131251a = str;
        this.f131257g = i;
        this.f131252b = aVar;
    }

    public C53085d(String str, Drawable drawable, AbstractC53086a aVar) {
        this.f131251a = str;
        this.f131258h = drawable;
        this.f131252b = aVar;
    }
}
