package com.larksuite.framework.palette.delegate;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import com.larksuite.framework.palette.colour.BaseColour;
import com.larksuite.framework.palette.di.IInnerColourFactory;
import com.larksuite.framework.palette.di.PaletteDI;
import com.larksuite.framework.palette.di.PaletteLogger;
import com.larksuite.framework.palette.param.ComputeScrollParam;
import com.larksuite.framework.palette.param.DispatchDrawParam;
import com.larksuite.framework.palette.param.OnAnimationEndParam;
import com.larksuite.framework.palette.param.OnAnimationStartParam;
import com.larksuite.framework.palette.param.OnAttachedToWindowParam;
import com.larksuite.framework.palette.param.OnConfigurationChangedParam;
import com.larksuite.framework.palette.param.OnDetachedFromWindowParam;
import com.larksuite.framework.palette.param.OnDrawParam;
import com.larksuite.framework.palette.param.OnFinishInflateParam;
import com.larksuite.framework.palette.param.OnFocusChangedParam;
import com.larksuite.framework.palette.param.OnLayoutParam;
import com.larksuite.framework.palette.param.OnMeasureParam;
import com.larksuite.framework.palette.param.OnNestedScrollParam;
import com.larksuite.framework.palette.param.OnScrollChangedParam;
import com.larksuite.framework.palette.param.OnSizeChangedParam;
import com.larksuite.framework.palette.param.ScrollByParam;
import com.larksuite.framework.palette.param.ScrollToParam;
import com.larksuite.framework.palette.param.SetGravityParam;
import com.larksuite.framework.palette.param.SetHorizontalGravityParam;
import com.larksuite.framework.palette.param.SetPaddingParam;
import com.larksuite.framework.palette.param.SetVerticalGravityParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J-\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0002\u0010\u001dJ'\u0010\u001e\u001a\u0004\u0018\u0001H\u001f\"\b\b\u0000\u0010\u001f*\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!H\u0016¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020+H\u0016J2\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000203H\u0016J-\u00104\u001a\u00020\u00182\b\u00105\u001a\u0004\u0018\u0001062\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020=H\u0016J-\u0010>\u001a\u00020\u00182\b\u00105\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0002\u0010\u001dJ-\u0010?\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010@\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020IH\u0016JM\u0010J\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u000e2\u0006\u0010M\u001a\u00020\u000b2\"\u0010\u001b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180NH\u0016¢\u0006\u0002\u0010OJ-\u0010P\u001a\u00020\u00182\b\u00105\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0002\u0010\u001dJ%\u0010Q\u001a\u0002H\u001f\"\b\b\u0000\u0010\u001f*\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!H\u0016¢\u0006\u0002\u0010\"J\b\u0010R\u001a\u00020\u0012H\u0002J\u0010\u0010S\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020^H\u0016J \u0010_\u001a\u00020\u0012\"\b\b\u0000\u0010\u001f*\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/larksuite/framework/palette/delegate/DefaultPalette;", "Lcom/larksuite/framework/palette/delegate/IPalette;", "()V", "colourList", "", "Lcom/larksuite/framework/palette/colour/BaseColour;", "mAttrs", "Landroid/util/AttributeSet;", "mContext", "Landroid/content/Context;", "mDefStyleAttr", "", "mDefStyleRes", "mView", "Landroid/view/View;", "tag", "", "computeScroll", "", "param", "Lcom/larksuite/framework/palette/param/ComputeScrollParam;", "dispatchDraw", "Lcom/larksuite/framework/palette/param/DispatchDrawParam;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getColour", "T", "colourClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/larksuite/framework/palette/colour/BaseColour;", "getColourList", "onAnimationEnd", "Lcom/larksuite/framework/palette/param/OnAnimationEndParam;", "onAnimationStart", "Lcom/larksuite/framework/palette/param/OnAnimationStartParam;", "onAttachedToWindow", "Lcom/larksuite/framework/palette/param/OnAttachedToWindowParam;", "onConfigurationChanged", "Lcom/larksuite/framework/palette/param/OnConfigurationChangedParam;", "onConstructor", "view", "context", "attrs", "defStyleAttr", "defStyleRes", "onDetachedFromWindow", "Lcom/larksuite/framework/palette/param/OnDetachedFromWindowParam;", "onDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onDraw", "Lcom/larksuite/framework/palette/param/OnDrawParam;", "onFinishInflate", "Lcom/larksuite/framework/palette/param/OnFinishInflateParam;", "onFocusChanged", "Lcom/larksuite/framework/palette/param/OnFocusChangedParam;", "onInterceptHoverEvent", "onInterceptTouchEvent", "onLayout", "Lcom/larksuite/framework/palette/param/OnLayoutParam;", "onMeasure", "Lcom/larksuite/framework/palette/param/OnMeasureParam;", "onNestedScroll", "Lcom/larksuite/framework/palette/param/OnNestedScrollParam;", "onScrollChanged", "Lcom/larksuite/framework/palette/param/OnScrollChangedParam;", "onSizeChanged", "Lcom/larksuite/framework/palette/param/OnSizeChangedParam;", "onStartNestedScroll", "child", "target", "nestedScrollAxes", "Lkotlin/Function3;", "(Landroid/view/View;Landroid/view/View;ILkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "onTouchEvent", "paint", "parseInnerColours", "scrollBy", "Lcom/larksuite/framework/palette/param/ScrollByParam;", "scrollTo", "Lcom/larksuite/framework/palette/param/ScrollToParam;", "setGravity", "Lcom/larksuite/framework/palette/param/SetGravityParam;", "setHorizontalGravity", "Lcom/larksuite/framework/palette/param/SetHorizontalGravityParam;", "setPadding", "Lcom/larksuite/framework/palette/param/SetPaddingParam;", "setVerticalGravity", "Lcom/larksuite/framework/palette/param/SetVerticalGravityParam;", "unPaint", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.b.a */
public final class DefaultPalette {

    /* renamed from: a */
    private final String f64450a = "DefaultPalette";

    /* renamed from: b */
    private final List<BaseColour> f64451b = new ArrayList();

    /* renamed from: c */
    private View f64452c;

    /* renamed from: d */
    private Context f64453d;

    /* renamed from: e */
    private AttributeSet f64454e;

    /* renamed from: f */
    private int f64455f;

    /* renamed from: g */
    private int f64456g;

    /* renamed from: a */
    public List<BaseColour> mo92618a() {
        return this.f64451b;
    }

    /* renamed from: a */
    public void mo92631a(OnMeasureParam mVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(mVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnMeasureParam a = OnMeasureParam.m94371a(mVar, 0, 0, null, 7, null);
                it.next().mo92572a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            mVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92630a(OnLayoutParam lVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(lVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnLayoutParam a = OnLayoutParam.m94368a(lVar, false, 0, 0, 0, 0, null, 63, null);
                it.next().mo92571a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            lVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92627a(OnDrawParam iVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnDrawParam a = OnDrawParam.m94359a(iVar, null, null, 3, null);
                it.next().mo92568a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            iVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92621a(DispatchDrawParam cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                DispatchDrawParam a = DispatchDrawParam.m94341a(cVar, null, null, 3, null);
                it.next().mo92562a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            cVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92624a(OnAttachedToWindowParam fVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnAttachedToWindowParam a = OnAttachedToWindowParam.m94350a(fVar, null, 1, null);
                it.next().mo92565a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            fVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92626a(OnDetachedFromWindowParam hVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnDetachedFromWindowParam a = OnDetachedFromWindowParam.m94356a(hVar, null, 1, null);
                it.next().mo92567a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            hVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92628a(OnFinishInflateParam jVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(jVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnFinishInflateParam a = OnFinishInflateParam.m94362a(jVar, null, 1, null);
                it.next().mo92569a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            jVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92629a(OnFocusChangedParam kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(kVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnFocusChangedParam a = OnFocusChangedParam.m94365a(kVar, false, 0, null, null, 15, null);
                it.next().mo92570a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            kVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92625a(OnConfigurationChangedParam gVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(gVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnConfigurationChangedParam a = OnConfigurationChangedParam.m94353a(gVar, null, null, 3, null);
                it.next().mo92566a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            gVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92634a(OnSizeChangedParam pVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(pVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnSizeChangedParam a = OnSizeChangedParam.m94380a(pVar, 0, 0, 0, 0, null, 31, null);
                it.next().mo92575a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            pVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92639a(SetPaddingParam uVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(uVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                SetPaddingParam a = SetPaddingParam.m94395a(uVar, 0, 0, 0, 0, null, 31, null);
                it.next().mo92580a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            uVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92637a(SetGravityParam sVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(sVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                SetGravityParam a = SetGravityParam.m94389a(sVar, 0, null, 3, null);
                it.next().mo92578a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            sVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92638a(SetHorizontalGravityParam tVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                SetHorizontalGravityParam a = SetHorizontalGravityParam.m94392a(tVar, 0, null, 3, null);
                it.next().mo92579a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            tVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92640a(SetVerticalGravityParam vVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(vVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                SetVerticalGravityParam a = SetVerticalGravityParam.m94398a(vVar, 0, null, 3, null);
                it.next().mo92581a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            vVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92623a(OnAnimationStartParam eVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(eVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnAnimationStartParam a = OnAnimationStartParam.m94347a(eVar, null, 1, null);
                it.next().mo92564a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            eVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92622a(OnAnimationEndParam dVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(dVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnAnimationEndParam a = OnAnimationEndParam.m94344a(dVar, null, 1, null);
                it.next().mo92563a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            dVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92633a(OnScrollChangedParam oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(oVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnScrollChangedParam a = OnScrollChangedParam.m94377a(oVar, 0, 0, 0, 0, null, 31, null);
                it.next().mo92574a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            oVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92636a(ScrollToParam rVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(rVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ScrollToParam a = ScrollToParam.m94386a(rVar, 0, 0, null, 7, null);
                it.next().mo92577a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            rVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92635a(ScrollByParam qVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(qVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ScrollByParam a = ScrollByParam.m94383a(qVar, 0, 0, null, 7, null);
                it.next().mo92576a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            qVar.mo92653a();
        }
    }

    /* renamed from: a */
    public void mo92632a(OnNestedScrollParam nVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(nVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                OnNestedScrollParam a = OnNestedScrollParam.m94374a(nVar, null, 0, 0, 0, 0, null, 63, null);
                it.next().mo92573a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            nVar.mo92653a();
        }
    }

    /* renamed from: b */
    private final void m94295b() {
        Class<? extends BaseColour> cls;
        IInnerColourFactory a = PaletteDI.f64457a.mo92650a();
        if (a != null) {
            Context context = this.f64453d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f64454e, a.mo92645a(), this.f64455f, this.f64456g);
            Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "mContext.obtainStyledAtt…DefStyleRes\n            )");
            int i = obtainStyledAttributes.getInt(a.mo92646b(), 0);
            for (Integer num : a.mo92647c().keySet()) {
                int intValue = num.intValue();
                if ((i & intValue) == intValue && (cls = a.mo92647c().get(Integer.valueOf(intValue))) != null) {
                    mo92614a(cls);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public <T extends BaseColour> T mo92641b(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "colourClass");
        Iterator<BaseColour> it = this.f64451b.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (Intrinsics.areEqual(t.getClass(), cls)) {
                if (t != null) {
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        return null;
    }

    /* renamed from: a */
    public <T extends BaseColour> T mo92614a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "colourClass");
        T t = (T) mo92641b(cls);
        if (t == null) {
            t = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            View view = this.f64452c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            }
            Context context = this.f64453d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            t.mo92560a(view, context, this.f64454e, this.f64455f, this.f64456g);
            List<BaseColour> list = this.f64451b;
            Intrinsics.checkExpressionValueIsNotNull(t, "colour");
            list.add(t);
        }
        PaletteLogger dVar = PaletteLogger.f64459a;
        String str = this.f64450a;
        dVar.mo92651a(str, "paint " + cls.getSimpleName() + " success");
        return t;
    }

    /* renamed from: a */
    public void mo92620a(ComputeScrollParam bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "param");
        Iterator<BaseColour> it = this.f64451b.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ComputeScrollParam a = ComputeScrollParam.m94338a(bVar, null, 1, null);
                it.next().mo92561a(a);
                if (z || a.mo92655c()) {
                    z = true;
                }
            }
        }
        if (!z) {
            bVar.mo92653a();
        }
    }

    /* renamed from: c */
    public Boolean mo92643c(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean d = aVar.mo92584d(motionEvent, function1);
            if (d != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the onTouchEvent return");
                return d;
            }
        }
        return function1.invoke(motionEvent);
    }

    /* renamed from: d */
    public Boolean mo92644d(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean b = aVar.mo92582b(motionEvent, function1);
            if (b != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the onInterceptHoverEvent return");
                return b;
            }
        }
        return function1.invoke(motionEvent);
    }

    /* renamed from: a */
    public Boolean mo92615a(DragEvent dragEvent, Function1<? super DragEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean a = aVar.mo92557a(dragEvent, function1);
            if (a != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the onDragEvent return");
                return a;
            }
        }
        return function1.invoke(dragEvent);
    }

    /* renamed from: b */
    public Boolean mo92642b(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean c = aVar.mo92583c(motionEvent, function1);
            if (c != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the onInterceptTouchEvent return");
                return c;
            }
        }
        return function1.invoke(motionEvent);
    }

    /* renamed from: a */
    public Boolean mo92616a(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean a = aVar.mo92558a(motionEvent, function1);
            if (a != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the dispatchTouchEvent return");
                return a;
            }
        }
        return function1.invoke(motionEvent);
    }

    /* renamed from: a */
    public Boolean mo92617a(View view, View view2, int i, Function3<? super View, ? super View, ? super Integer, Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        for (BaseColour aVar : this.f64451b) {
            Boolean a = aVar.mo92559a(view, view2, i, oVar);
            if (a != null) {
                PaletteLogger dVar = PaletteLogger.f64459a;
                String str = this.f64450a;
                dVar.mo92652b(str, aVar.getClass().getSimpleName() + " win the onStartNestedScroll return");
                return a;
            }
        }
        return oVar.invoke(view, view2, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo92619a(View view, Context context, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        PaletteLogger dVar = PaletteLogger.f64459a;
        String str = this.f64450a;
        dVar.mo92651a(str, view.getClass().getSimpleName() + " onConstructor");
        this.f64452c = view;
        this.f64453d = context;
        this.f64454e = attributeSet;
        this.f64455f = i;
        this.f64456g = i2;
        m94295b();
    }
}
