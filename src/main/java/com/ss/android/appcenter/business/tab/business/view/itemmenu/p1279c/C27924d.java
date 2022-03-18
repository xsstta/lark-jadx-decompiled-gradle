package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appsort.AppSortActivity;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.p1271b.C27720a;
import com.ss.android.appcenter.business.tab.business.blockit.BlockLogFragment;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.c.d */
public class C27924d implements AbstractC27922b {

    /* renamed from: a */
    public View.OnClickListener f69825a;

    /* renamed from: b */
    private int f69826b;

    /* renamed from: c */
    private int f69827c;

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.c.d$a */
    public interface AbstractC27927a {
        /* renamed from: a */
        void mo99555a();

        /* renamed from: b */
        void mo99556b();

        /* renamed from: c */
        void mo99557c();
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.c.d$b */
    public static class C27928b implements AbstractC27927a {
        @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
        /* renamed from: a */
        public void mo99555a() {
        }

        @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
        /* renamed from: b */
        public void mo99556b() {
        }

        @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
        /* renamed from: c */
        public void mo99557c() {
        }
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public boolean mo99546a() {
        return false;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: b */
    public View.OnClickListener mo99547b() {
        return this.f69825a;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public void mo99545a(LKUIRoundedImageView2 lKUIRoundedImageView2) {
        lKUIRoundedImageView2.setImageTintList(UDColorUtils.getColorStateList(lKUIRoundedImageView2.getContext(), mo99546a() ? R.color.icon_disable : R.color.icon_n2));
        lKUIRoundedImageView2.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        lKUIRoundedImageView2.setImageResource(this.f69826b);
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: c */
    public String mo99548c(Context context) {
        return context.getString(this.f69827c);
    }

    /* renamed from: a */
    public static AbstractC27922b m101942a(Context context, AbstractC27927a aVar) {
        return new C27924d(R.drawable.ud_icon_navigate_outlined, R.string.OpenPlatform_AppCenter_SortAppBttn, new View.OnClickListener(context) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.$$Lambda$d$gkfYAu1vUNaFOHoGjT36JGwmk */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27924d.m101948a(C27924d.AbstractC27927a.this, this.f$1, view);
            }
        });
    }

    /* renamed from: a */
    public static AbstractC27922b m101943a(Context context, String str) {
        return new C27924d(R.drawable.ud_icon_setting_outlined, R.string.OpenPlatform_Workplace_BlcSettings, new View.OnClickListener(context, str) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.$$Lambda$d$rZPrlUmPLLdjVXFgpDLZbCJ5i8 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27924d.m101946a(this.f$0, this.f$1, view);
            }
        });
    }

    /* renamed from: a */
    public static AbstractC27922b m101945a(Fragment fragment, String str) {
        return new C27924d(R.drawable.ud_icon_platform_outlined, R.string.OpenPlatform_Workplace_BlcConsole, new View.OnClickListener(str) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.$$Lambda$d$T2N4LiTTzpljD4oDDn7ZcxJ3cMA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27924d.m101947a(Fragment.this, this.f$1, view);
            }
        });
    }

    public C27924d(int i, int i2, View.OnClickListener onClickListener) {
        this.f69826b = i;
        this.f69827c = i2;
        this.f69825a = onClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101948a(AbstractC27927a aVar, Context context, View view) {
        aVar.mo99556b();
        AppSortActivity.m101111a(context);
        C27710b.m101326z("sort");
    }

    /* renamed from: a */
    public static AbstractC27922b m101944a(Context context, String str, AbstractC27927a aVar) {
        return new C27924d(R.drawable.ud_icon_no_outlined, R.string.OpenPlatform_AppCenter_RemoveFrqBttn, new View.OnClickListener(str, context) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.$$Lambda$d$64V7ZaaVXxEg2HgxNi7mjChax_0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C27924d.m101949a(C27924d.AbstractC27927a.this, this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101946a(Context context, String str, View view) {
        C27548m.m100547m().mo98222f().mo98206c(context, str);
        C27710b.m101326z("blockSetting");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101947a(Fragment fragment, String str, View view) {
        if (fragment != null) {
            try {
                BlockLogFragment.f69538b.mo99301a(fragment.getActivity(), str);
                C27710b.m101326z("blockConsole");
            } catch (Exception e) {
                C27700a.m101236a("getConsole", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101949a(final AbstractC27927a aVar, String str, final Context context, View view) {
        aVar.mo99555a();
        C27720a.m101370b(str, new C27720a.AbstractC27723a() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C279251 */

            @Override // com.ss.android.appcenter.business.net.p1271b.C27720a.AbstractC27723a
            /* renamed from: a */
            public void mo98302a(boolean z) {
                if (z) {
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C279251.RunnableC279261 */

                        public void run() {
                            UDToast.show(context, context.getString(R.string.OpenPlatform_AppCenter_RemoveFrqSuccessToast), (int) R.drawable.appcenter_ok_img);
                        }
                    });
                    aVar.mo99557c();
                    C27710b.m101326z("remove");
                }
            }
        });
    }
}
