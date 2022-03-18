package com.ss.android.lark.mm.module.minifloatwindow;

import android.view.View;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46529d;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.b */
public class C46509b {

    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.b$a */
    public interface AbstractC46515a {

        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.b$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC46515a aVar) {
            }

            public static void $default$a(AbstractC46515a aVar, boolean z) {
            }
        }

        /* renamed from: a */
        void mo149312a();

        /* renamed from: a */
        void mo149313a(boolean z);

        void onCreatedResultCallBack(boolean z);
    }

    /* renamed from: a */
    public void mo163402a() {
        C46529d.m183984a().mo163450b();
    }

    /* renamed from: b */
    public MiniType mo163404b() {
        return C46529d.m183984a().mo163452c();
    }

    /* renamed from: c */
    public boolean mo163405c() {
        return C46529d.m183984a().mo163453d();
    }

    /* renamed from: a */
    private void m183917a(View view, boolean z, final AbstractC46515a aVar) {
        if (C46529d.m183984a().mo163452c() == MiniType.LIVE) {
            C45855f.m181664c("VcInnoFloatWindowManager", "try to show podcast float window and force to dismiss live float window");
            C46529d.m183984a().mo163449a(view, MiniType.MINUTES_PODCAST, z, new C46531e.AbstractC46536a() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.C46509b.C465101 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163406a() {
                    aVar.mo149312a();
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: b */
                public void mo163408b(boolean z) {
                    aVar.mo149313a(z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163407a(boolean z) {
                    aVar.onCreatedResultCallBack(z);
                }
            });
        } else if (C46529d.m183984a().mo163454e()) {
            C45855f.m181664c("VcInnoFloatWindowManager", "can not show podcast float window since the showing float window is " + C46529d.m183984a().mo163452c().toString());
            aVar.onCreatedResultCallBack(false);
        } else {
            C45855f.m181664c("VcInnoFloatWindowManager", "try to show podcast float window");
            C46529d.m183984a().mo163451b(view, MiniType.MINUTES_PODCAST, z, new C46531e.AbstractC46536a() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.C46509b.C465112 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163406a() {
                    aVar.mo149312a();
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: b */
                public void mo163408b(boolean z) {
                    aVar.mo149313a(z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163407a(boolean z) {
                    aVar.onCreatedResultCallBack(z);
                }
            });
        }
    }

    /* renamed from: b */
    private void m183918b(View view, boolean z, final AbstractC46515a aVar) {
        if (C46529d.m183984a().mo163454e()) {
            C45855f.m181664c("VcInnoFloatWindowManager", "can not show recording float window since the showing float window is " + C46529d.m183984a().mo163452c().toString());
            aVar.onCreatedResultCallBack(false);
            return;
        }
        C45855f.m181664c("VcInnoFloatWindowManager", "try to show recording float window");
        C46529d.m183984a().mo163451b(view, MiniType.MINUTES_RECORDING, z, new C46531e.AbstractC46536a() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.C46509b.C465123 */

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
            /* renamed from: a */
            public void mo163406a() {
                aVar.mo149312a();
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
            /* renamed from: b */
            public void mo163408b(boolean z) {
                aVar.mo149313a(z);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
            /* renamed from: a */
            public void mo163407a(boolean z) {
                aVar.onCreatedResultCallBack(z);
            }
        });
    }

    /* renamed from: c */
    private void m183919c(View view, boolean z, final AbstractC46515a aVar) {
        if (C46529d.m183984a().mo163452c() == MiniType.MINUTES_PODCAST) {
            C45855f.m181664c("VcInnoFloatWindowManager", "try to show live float window and force to dismiss podcast float window");
            C46529d.m183984a().mo163449a(view, MiniType.LIVE, z, new C46531e.AbstractC46536a() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.C46509b.C465134 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163406a() {
                    aVar.mo149312a();
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: b */
                public void mo163408b(boolean z) {
                    aVar.mo149313a(z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163407a(boolean z) {
                    aVar.onCreatedResultCallBack(z);
                }
            });
        } else if (C46529d.m183984a().mo163454e()) {
            C45855f.m181664c("VcInnoFloatWindowManager", "can not show live float window since the showing float window is " + C46529d.m183984a().mo163452c().toString());
            aVar.onCreatedResultCallBack(false);
        } else {
            C45855f.m181664c("VcInnoFloatWindowManager", "try to show live float window");
            C46529d.m183984a().mo163451b(view, MiniType.LIVE, z, new C46531e.AbstractC46536a() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.C46509b.C465145 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163406a() {
                    aVar.mo149312a();
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: b */
                public void mo163408b(boolean z) {
                    aVar.mo149313a(z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163407a(boolean z) {
                    aVar.onCreatedResultCallBack(z);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo163403a(View view, MiniType miniType, boolean z, AbstractC46515a aVar) {
        if (miniType == MiniType.LIVE) {
            m183919c(view, z, aVar);
        } else if (miniType == MiniType.MINUTES_PODCAST) {
            m183917a(view, z, aVar);
        } else if (miniType == MiniType.MINUTES_RECORDING) {
            m183918b(view, z, aVar);
        }
    }
}
