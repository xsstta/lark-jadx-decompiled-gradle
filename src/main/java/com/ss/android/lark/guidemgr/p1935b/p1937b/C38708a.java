package com.ss.android.lark.guidemgr.p1935b.p1937b;

import android.app.Activity;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ImageDialogConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.guidemgr.b.b.a */
public class C38708a {

    /* renamed from: a */
    private final WeakReference<Activity> f99577a;

    /* renamed from: b */
    private final TextBubbleConfig f99578b;

    /* renamed from: c */
    private final ButtonBubbleConfig f99579c;

    /* renamed from: d */
    private final ImageDialogConfig f99580d;

    /* renamed from: e */
    private final List<ButtonBubbleConfig> f99581e;

    /* renamed from: f */
    private final WeakReference<AbstractC38707a> f99582f;

    /* renamed from: a */
    public WeakReference<Activity> mo141861a() {
        return this.f99577a;
    }

    /* renamed from: c */
    public TextBubbleConfig mo141863c() {
        return this.f99578b;
    }

    /* renamed from: d */
    public ButtonBubbleConfig mo141864d() {
        return this.f99579c;
    }

    /* renamed from: e */
    public ImageDialogConfig mo141865e() {
        return this.f99580d;
    }

    /* renamed from: f */
    public List<ButtonBubbleConfig> mo141866f() {
        return this.f99581e;
    }

    /* renamed from: b */
    public AbstractC38707a mo141862b() {
        WeakReference<AbstractC38707a> weakReference = this.f99582f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C38708a(Activity activity, AbstractC38707a aVar) {
        this(activity, aVar, null, null, null, new ArrayList());
    }

    public C38708a(Activity activity, AbstractC38707a aVar, ButtonBubbleConfig dVar) {
        this(activity, aVar, null, dVar, null, new ArrayList());
    }

    public C38708a(Activity activity, AbstractC38707a aVar, TextBubbleConfig kVar) {
        this(activity, aVar, kVar, null, null, new ArrayList());
    }

    private C38708a(Activity activity, AbstractC38707a aVar, TextBubbleConfig kVar, ButtonBubbleConfig dVar, ImageDialogConfig iVar, List<ButtonBubbleConfig> list) {
        this.f99577a = new WeakReference<>(activity);
        this.f99582f = new WeakReference<>(aVar);
        this.f99578b = kVar;
        this.f99579c = dVar;
        this.f99580d = iVar;
        this.f99581e = list;
    }
}
