package com.bytedance.lynx.tasm.ui.imageloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lynx.tasm.ui.imageloader.C19899c;
import com.bytedance.lynx.tasm.ui.imageloader.C19908e;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.image.C26785a;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.p1216a.C26550f;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Map;

public class UIImage<T extends C19908e> extends LynxUI<T> {

    /* renamed from: a */
    private boolean f48611a;

    /* renamed from: b */
    private boolean f48612b;

    /* renamed from: c */
    private View.OnAttachStateChangeListener f48613c;

    /* renamed from: f */
    protected String f48614f;

    /* renamed from: g */
    String f48615g;

    /* renamed from: h */
    public String f48616h = "";

    /* renamed from: i */
    protected final String f48617i = "_lynx_";

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C19899c.AbstractC19906c mo53300d() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void U_() {
        super.U_();
        mo53304h();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: j */
    public void mo53306j() {
        super.mo53306j();
        mo53304h();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        ((C19908e) this.f66253Z).setPadding(this.f66245z, this.f66196B, this.f66195A, this.f66197C);
        ((C19908e) this.f66253Z).mo67435a((float) this.f66203I, (float) this.f66202H, (float) this.f66204J, (float) this.f66205K);
    }

    /* renamed from: h */
    public void mo53304h() {
        if (TextUtils.isEmpty(this.f48614f)) {
            ((C19908e) this.f66253Z).setBitmap(null);
            this.f48616h = "";
        } else if (!this.f48614f.equals(this.f48616h)) {
            m72599i();
        }
    }

    /* renamed from: i */
    private void m72599i() {
        C19899c.AbstractC19905b bVar;
        if (((C19908e) this.f66253Z).getWidth() > 0 && ((C19908e) this.f66253Z).getHeight() > 0 && (bVar = C19899c.f48629a) != null) {
            float T = (float) ((((mo94937T() - this.f66245z) - this.f66203I) - this.f66195A) - this.f66204J);
            float U = (float) ((((mo94938U() - this.f66196B) - this.f66202H) - this.f66197C) - this.f66205K);
            final String str = this.f48614f;
            bVar.mo53858a(((C19908e) this.f66253Z).getContext(), mo53301e(), this.f48614f, T, U, mo53300d(), new C19899c.AbstractC19904a() {
                /* class com.bytedance.lynx.tasm.ui.imageloader.UIImage.C198952 */

                @Override // com.bytedance.lynx.tasm.ui.imageloader.C19899c.AbstractC19904a
                /* renamed from: a */
                public void mo67403a(final Drawable drawable, Throwable th) {
                    if (UIImage.this.f48614f == null) {
                        if (str != null) {
                            return;
                        }
                    } else if (!UIImage.this.f48614f.equals(str)) {
                        return;
                    }
                    if (drawable != null) {
                        UIImage.this.mo67412f();
                    }
                    if (th != null) {
                        UIImage.this.mo67411a(th.getMessage());
                    }
                    RunnableC198961 r4 = new Runnable() {
                        /* class com.bytedance.lynx.tasm.ui.imageloader.UIImage.C198952.RunnableC198961 */

                        public void run() {
                            String str;
                            ((C19908e) UIImage.this.f66253Z).setDrawable(drawable);
                            UIImage uIImage = UIImage.this;
                            if (drawable == null) {
                                str = "";
                            } else {
                                str = str;
                            }
                            uIImage.f48616h = str;
                        }
                    };
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        r4.run();
                    } else {
                        ((C19908e) UIImage.this.f66253Z).post(r4);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo53301e() {
        return mo94937T() + "_lynx_" + mo94938U() + "_lynx_" + this.f66203I + "_lynx_" + this.f66202H + "_lynx_" + this.f66204J + "_lynx_" + this.f66205K + "_lynx_" + this.f66245z + "_lynx_" + this.f66196B + "_lynx_" + this.f66195A + "_lynx_" + this.f66197C;
    }

    /* renamed from: f */
    public void mo67412f() {
        int i;
        if (this.f48611a) {
            C26547c cVar = new C26547c(mo94576q(), "load");
            int i2 = 0;
            if (((C19908e) this.f66253Z).f48633a != null) {
                i2 = ((C19908e) this.f66253Z).f48633a.getIntrinsicHeight();
                i = ((C19908e) this.f66253Z).f48633a.getIntrinsicWidth();
            } else {
                i = 0;
            }
            cVar.mo94347a("height", Integer.valueOf(i2));
            cVar.mo94347a("width", Integer.valueOf(i));
            mo95039u().mo94687i().mo94075a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo33942b(Context context) {
        return (T) new C19908e(context);
    }

    public UIImage(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "src")
    public void setSource(String str) {
        this.f48614f = C26785a.m97218a(mo95039u(), str);
        mo53304h();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        if (map != null) {
            this.f48611a = map.containsKey("load");
            this.f48612b = map.containsKey("error");
        }
        super.mo53260a(map);
    }

    @LynxProp(name = "enable-detach-clear")
    public void setEnableDetachedClear(boolean z) {
        if (z) {
            if (this.f48613c == null) {
                this.f48613c = new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.lynx.tasm.ui.imageloader.UIImage.View$OnAttachStateChangeListenerC198941 */

                    public void onViewAttachedToWindow(View view) {
                        if (((C19908e) UIImage.this.f66253Z).f48633a == null) {
                            UIImage.this.mo53304h();
                        }
                    }

                    public void onViewDetachedFromWindow(View view) {
                        ((C19908e) UIImage.this.f66253Z).setBitmap(null);
                        UIImage.this.f48616h = "";
                    }
                };
            }
            ((C19908e) this.f66253Z).addOnAttachStateChangeListener(this.f48613c);
            return;
        }
        ((C19908e) this.f66253Z).removeOnAttachStateChangeListener(this.f48613c);
        this.f48613c = null;
        mo53304h();
    }

    @LynxProp(name = "mode")
    public void setObjectFit(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "none")) {
            ((C19908e) this.f66253Z).setScaleType("scaleToFill");
            return;
        }
        this.f48615g = str;
        ((C19908e) this.f66253Z).setScaleType(str);
    }

    /* renamed from: a */
    public void mo67411a(String str) {
        if (this.f48612b) {
            C26547c cVar = new C26547c(mo94576q(), "error");
            cVar.mo94347a(ApiHandler.API_CALLBACK_ERRMSG, str);
            mo95039u().mo94687i().mo94075a(cVar);
            mo95039u().mo94687i().mo94076a(new C26550f(mo94576q(), 0));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBorderRadius(int i, String str) {
        super.setBorderRadius(i, str);
        ((C19908e) this.f66253Z).setBorderRadius(aA().mo95538e());
    }
}
