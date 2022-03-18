package com.larksuite.component.universe_design.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.badge.UDBadgeDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u0004\u0018\u000100J\b\u00101\u001a\u0004\u0018\u00010-J\u0012\u00102\u001a\u0004\u0018\u0001032\b\u0010'\u001a\u0004\u0018\u00010&J\u0012\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u00104\u001a\u00020\u0015J\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u0002062\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002062\u0006\u00108\u001a\u000209J\u0015\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>J\u000e\u0010?\u001a\u0002062\u0006\u00108\u001a\u000209J\b\u0010@\u001a\u000206H\u0002J\b\u0010A\u001a\u000206H\u0002J\b\u0010B\u001a\u000206H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0007\u001a\u0004\u0018\u00010 @FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020&@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006D"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTab;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "value", "Landroid/graphics/drawable/Drawable;", "icon", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "parent", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "getParent$universe_ui_tab_release", "()Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "setParent$universe_ui_tab_release", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;)V", "<set-?>", "", "position", "getPosition", "()I", "setPosition$universe_ui_tab_release", "(I)V", "tag", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "", "title", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/view/View;", "view", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "findBoldTitleView", "Landroid/widget/TextView;", "findBoldTitleView$universe_ui_tab_release", "findIconImageView", "Landroid/widget/ImageView;", "findTitleTextView", "obtainBadgeOn", "Lcom/larksuite/component/universe_design/badge/UDBadgeDrawable;", "viewId", "select", "", "setBackgroundColors", "colors", "Landroid/content/res/ColorStateList;", "setIconColors", "setSelectedInternal", "isSelected", "", "setSelectedInternal$universe_ui_tab_release", "setTitleColors", "setUpIcon", "setUpTitle", "setUpView", "Companion", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.tab.b */
public final class UDTab {

    /* renamed from: a */
    public static final Companion f63618a = new Companion(null);

    /* renamed from: b */
    private UDTabLayout f63619b;

    /* renamed from: c */
    private Object f63620c;

    /* renamed from: d */
    private CharSequence f63621d;

    /* renamed from: e */
    private Drawable f63622e;

    /* renamed from: f */
    private View f63623f;

    /* renamed from: g */
    private int f63624g = -1;

    /* renamed from: h */
    private final Context f63625h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTab$Companion;", "", "()V", "NO_POSITION", "", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Object mo91329a() {
        return this.f63620c;
    }

    /* renamed from: b */
    public final CharSequence mo91339b() {
        return this.f63621d;
    }

    /* renamed from: c */
    public final View mo91341c() {
        return this.f63623f;
    }

    /* renamed from: d */
    public final int mo91343d() {
        return this.f63624g;
    }

    /* renamed from: i */
    public final Context mo91348i() {
        return this.f63625h;
    }

    /* renamed from: j */
    private final void m93010j() {
        m93011k();
        m93012l();
    }

    /* renamed from: e */
    public final void mo91344e() {
        UDTabLayout uDTabLayout = this.f63619b;
        if (uDTabLayout != null) {
            uDTabLayout.selectTab(this);
        }
    }

    /* renamed from: f */
    public final TextView mo91345f() {
        return (TextView) this.f63623f.findViewById(R.id.ud_tab_title);
    }

    /* renamed from: g */
    public final ImageView mo91346g() {
        return (ImageView) this.f63623f.findViewById(R.id.ud_tab_icon);
    }

    /* renamed from: h */
    public final TextView mo91347h() {
        return (TextView) this.f63623f.findViewById(R.id.ud_tab_title_bold);
    }

    /* renamed from: l */
    private final void m93012l() {
        ImageView g = mo91346g();
        if (g != null) {
            Drawable drawable = this.f63622e;
            if (drawable == null) {
                g.setVisibility(8);
            } else {
                g.setImageDrawable(drawable);
                g.setVisibility(0);
            }
            UDTabLayout uDTabLayout = this.f63619b;
            if (uDTabLayout != null) {
                uDTabLayout.invaliIndicator$universe_ui_tab_release();
            }
        }
    }

    /* renamed from: k */
    private final void m93011k() {
        TextView f = mo91345f();
        if (f != null) {
            TextView h = mo91347h();
            CharSequence charSequence = this.f63621d;
            if (charSequence == null) {
                f.setVisibility(8);
                if (h != null) {
                    h.setVisibility(8);
                }
            } else {
                f.setText(charSequence);
                f.setVisibility(0);
                if (h != null) {
                    h.setText(this.f63621d);
                }
                if (h != null) {
                    h.setVisibility(4);
                }
            }
            UDTabLayout uDTabLayout = this.f63619b;
            if (uDTabLayout != null) {
                uDTabLayout.invaliIndicator$universe_ui_tab_release();
            }
        }
    }

    /* renamed from: a */
    public final void mo91330a(int i) {
        this.f63624g = i;
    }

    /* renamed from: a */
    public final void mo91332a(Drawable drawable) {
        this.f63622e = drawable;
        m93012l();
    }

    /* renamed from: b */
    public final UDBadgeDrawable mo91338b(View view) {
        if (view == null) {
            return null;
        }
        return UDBadgeDrawable.f63069a.mo90271a(view, 0);
    }

    /* renamed from: c */
    public final void mo91342c(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        this.f63623f.setBackgroundTintList(colorStateList);
        this.f63623f.invalidate();
    }

    public UDTab(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63625h = context;
        UDTabView eVar = new UDTabView(context);
        eVar.setTab$universe_ui_tab_release(this);
        this.f63623f = eVar;
    }

    /* renamed from: a */
    public final void mo91331a(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        TextView f = mo91345f();
        if (f != null) {
            f.setTextColor(colorStateList);
            TextView h = mo91347h();
            if (h != null) {
                h.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: b */
    public final void mo91340b(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        ImageView g = mo91346g();
        if (g != null) {
            g.setImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public final void mo91333a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "value");
        this.f63623f = view;
        m93010j();
    }

    /* renamed from: a */
    public final void mo91334a(UDTabLayout uDTabLayout) {
        this.f63619b = uDTabLayout;
    }

    /* renamed from: a */
    public final void mo91335a(CharSequence charSequence) {
        this.f63621d = charSequence;
        m93011k();
    }

    /* renamed from: a */
    public final void mo91336a(Object obj) {
        this.f63620c = obj;
    }

    /* renamed from: a */
    public final void mo91337a(boolean z) {
        this.f63623f.setSelected(z);
        TextView f = mo91345f();
        if (f == null) {
            return;
        }
        if (z) {
            f.setTypeface(null, 1);
        } else {
            f.setTypeface(null, 0);
        }
    }
}
