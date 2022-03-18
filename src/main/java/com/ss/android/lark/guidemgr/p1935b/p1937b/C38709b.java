package com.ss.android.lark.guidemgr.p1935b.p1937b;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.BubbleConfig;
import com.ss.android.lark.guide.ui.config.BubbleListener;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageDialogConfig;
import com.ss.android.lark.guidemgr.p1935b.C38702a;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.ss.android.lark.guidemgr.b.b.b */
public class C38709b {

    /* renamed from: a */
    private static GuideDelegate f99583a = null;

    /* renamed from: b */
    private static String f99584b = "";

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m152900a(String str) {
        C38702a.m152865f().mo141852c(str);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static void m152904a(C38708a aVar, String str) {
        if (!TextUtils.equals(str, f99584b)) {
            if (aVar == null || aVar.mo141861a() == null) {
                Log.m165397w("GuideUIUtil", "onShowGuide: config or activity is null," + aVar);
                return;
            }
            Activity activity = aVar.mo141861a().get();
            if (activity != null) {
                boolean z = false;
                if (aVar.mo141862b() != null) {
                    aVar.mo141862b().mo129838b(str);
                }
                View view = null;
                if (aVar.mo141863c() != null) {
                    m152902a(aVar.mo141863c(), str, aVar.mo141863c().mo141760c());
                    view = (View) aVar.mo141863c().mo141783d().mo141746a().get();
                    f99583a = GuideComponent.f99382a.mo141642a(activity, aVar.mo141863c());
                } else if (aVar.mo141865e() != null) {
                    m152903a(aVar.mo141865e(), str, aVar.mo141865e().mo141777a());
                    f99583a = GuideComponent.f99382a.mo141641a(activity, aVar.mo141865e());
                } else if (aVar.mo141864d() != null) {
                    m152902a(aVar.mo141864d(), str, aVar.mo141864d().mo141760c());
                    view = (View) aVar.mo141864d().mo141761d().mo141746a().get();
                    f99583a = GuideComponent.f99382a.mo141645b(activity, aVar.mo141864d());
                } else if (aVar.mo141866f() != null && !aVar.mo141866f().isEmpty()) {
                    GuideComponent.f99382a.mo141644a(activity, aVar.mo141866f(), new Function0(str) {
                        /* class com.ss.android.lark.guidemgr.p1935b.p1937b.$$Lambda$b$Gc5K5YQbJpY3elomxzfNfTwikA */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C38709b.m152900a(this.f$0);
                        }
                    });
                }
                GuideDelegate gVar = f99583a;
                if (gVar != null) {
                    m152901a(activity, view, gVar);
                    z = !f99583a.mo141658a();
                }
                f99584b = str;
                if (aVar.mo141862b() != null) {
                    aVar.mo141862b().mo129839c(str);
                    if (z) {
                        C38702a.m152865f().mo141854d(str);
                        return;
                    }
                    return;
                }
                Log.m165397w("GuideUIUtil", "onShowGuide: config callback is null");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m152906a(String str, BubbleListener bVar) {
        C38702a.m152865f().mo141852c(str);
        if (bVar != null) {
            bVar.onDismiss();
        }
        if (TextUtils.equals(str, f99584b)) {
            f99584b = "";
        }
    }

    /* renamed from: a */
    public static boolean m152907a(String str, C38708a aVar) {
        boolean equals = TextUtils.equals(f99584b, str);
        if (!TextUtils.isEmpty(str)) {
            GuideDelegate gVar = f99583a;
            if (gVar != null && gVar.mo141658a()) {
                f99583a.mo141659b();
            } else if (!(f99583a != null || aVar == null || aVar.mo141862b() == null)) {
                aVar.mo141862b().mo129837a(str);
            }
        }
        f99584b = "";
        return equals;
    }

    /* renamed from: a */
    private static void m152901a(Activity activity, final View view, GuideDelegate gVar) {
        final WeakReference weakReference = new WeakReference(gVar);
        if (view != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.lark.guidemgr.p1935b.p1937b.C38709b.View$OnAttachStateChangeListenerC387101 */

                public void onViewAttachedToWindow(View view) {
                }

                public void onViewDetachedFromWindow(View view) {
                    GuideDelegate gVar = (GuideDelegate) weakReference.get();
                    if (gVar != null) {
                        gVar.mo141659b();
                    }
                    view.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m152902a(BubbleConfig aVar, String str, BubbleListener bVar) {
        aVar.mo141756a(new BubbleListener(str, bVar) {
            /* class com.ss.android.lark.guidemgr.p1935b.p1937b.$$Lambda$b$Q2Bf0DC7FSI_L6PdEyvTpj4S7gE */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ BubbleListener f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onDismiss() {
                C38709b.m152906a(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private static void m152903a(ImageDialogConfig iVar, String str, DialogInterface.OnDismissListener onDismissListener) {
        iVar.mo141778a(new DialogInterface.OnDismissListener(str, onDismissListener) {
            /* class com.ss.android.lark.guidemgr.p1935b.p1937b.$$Lambda$b$l8RbMKZMuqP1IVnrSL2KDnIwVtc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ DialogInterface.OnDismissListener f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C38709b.m152905a(this.f$0, this.f$1, dialogInterface);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m152905a(String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        C38702a.m152865f().mo141852c(str);
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        if (TextUtils.equals(str, f99584b)) {
            f99584b = "";
        }
    }
}
