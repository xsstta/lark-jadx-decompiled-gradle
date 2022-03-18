package com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.C28067a;
import com.ss.android.appcenter.business.view.DrawerLayout;
import com.ss.android.appcenter.common.util.C28190k;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.d.a */
public class C28067a {

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.d.a$a */
    public interface AbstractC28069a {
        void onSelected(int i, String str);
    }

    /* renamed from: a */
    public static void m102586a(TabLayout tabLayout, int i) {
        try {
            TabLayout.C22451f a = tabLayout.mo78227a(i);
            Method declaredMethod = TabLayout.class.getDeclaredMethod(C60375c.f150914a, TabLayout.C22451f.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(tabLayout, a);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m102583a(View view, AbstractC28069a aVar, C28070b bVar, String str) {
        view.findViewById(R.id.category_click_wrapper).setOnClickListener(new View.OnClickListener(view, bVar, aVar, view.getContext(), str) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.$$Lambda$a$LABlqO0uw8qyNUBLNpK3K_QgVDY */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ C28070b f$1;
            public final /* synthetic */ C28067a.AbstractC28069a f$2;
            public final /* synthetic */ Context f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onClick(View view) {
                C28067a.m102584a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m102584a(View view, C28070b bVar, AbstractC28069a aVar, Context context, String str, View view2) {
        new DrawerLayout(view.getContext(), bVar.mo99918b(), new DrawerLayout.AbstractC28103b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.$$Lambda$a$Q7wAI0TUdjfGbN8mJpMyUQ_YfsQ */

            @Override // com.ss.android.appcenter.business.view.DrawerLayout.AbstractC28103b
            public final void onTabSelected(int i) {
                C28067a.AbstractC28069a.this.onSelected(i, "internal");
            }
        }, bVar.mo99920c(), context.getString(R.string.OpenPlatform_Workplace_AllCategoriesTtl)).mo100027a(view2);
        C27710b.m101324x(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m102585a(View view, List list, AbstractC28069a aVar, C28070b bVar, Context context, String str, View view2) {
        new DrawerLayout(view.getContext(), list, new DrawerLayout.AbstractC28103b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.$$Lambda$a$8lYpX_uH_55pe1lV4idOFESOWS0 */

            @Override // com.ss.android.appcenter.business.view.DrawerLayout.AbstractC28103b
            public final void onTabSelected(int i) {
                C28067a.AbstractC28069a.this.onSelected(i, "internal");
            }
        }, bVar.mo99920c(), context.getString(R.string.OpenPlatform_Workplace_AllCategoriesTtl)).mo100027a(view2);
        C27710b.m101324x(str);
    }

    /* renamed from: a */
    public static void m102587a(TabLayout tabLayout, View view, C28070b bVar, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z, final AbstractC28069a aVar, String str2) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Context context = tabLayout.getContext();
        tabLayout.mo78228a();
        tabLayout.mo78248d();
        int a = C28209p.m103291a(28.0f) + i + i2;
        if (TextUtils.equals(str, "Large")) {
            i10 = C28209p.m103291a(22.0f);
            i9 = C28209p.m103291a(16.0f);
            i8 = -C28209p.m103291a(3.0f);
            i7 = C28209p.m103291a(30.0f);
        } else {
            i10 = C28209p.m103291a(20.0f);
            i9 = C28209p.m103291a(14.0f);
            i8 = -C28209p.m103291a(2.0f);
            i7 = C28209p.m103291a(28.0f);
        }
        List<String> b = bVar.mo99918b();
        int b2 = C28190k.m103260b(tabLayout.getContext()) - i6;
        int size = b.size();
        int i13 = 0;
        int i14 = 0;
        boolean z2 = true;
        while (i13 < size) {
            TabLayout.C22451f a2 = tabLayout.mo78242b().mo78311a(R.layout.workplace_template_applist_tab_item);
            View a3 = a2.mo78310a();
            a3.setPadding(0, i, 0, i2);
            C28209p.m103299a(a3, a);
            TextView textView = (TextView) a3.findViewById(R.id.tab_name);
            if (z) {
                i12 = a;
                textView.setBackgroundResource(R.drawable.workplace_template_tab_item_bg);
            } else {
                i12 = a;
                textView.setBackgroundResource(R.drawable.workplace_template_tab_item_bg_alt);
            }
            textView.setText(b.get(i13));
            textView.setTextSize(0, (float) i9);
            if (!TextUtils.isEmpty(b.get(i13))) {
                i14 += (int) textView.getPaint().measureText(b.get(i13));
            }
            C28209p.m103299a(textView, i7);
            C28209p.m103301a(textView, 0, i8, 0, 0);
            if (i13 == 0) {
                a3.findViewById(R.id.tab_name_wrapper).setPadding(0, 0, C28209p.m103291a(14.0f), 0);
                i14 += C28209p.m103291a(14.0f);
                textView.getPaint().setFakeBoldText(true);
            } else if (i13 < size - 1) {
                a3.findViewById(R.id.tab_name_wrapper).setPadding(C28209p.m103291a(14.0f), 0, C28209p.m103291a(14.0f), 0);
                i14 += C28209p.m103291a(28.0f);
            } else {
                int a4 = i14 + C28209p.m103291a(14.0f);
                if (a4 > b2) {
                    a3.findViewById(R.id.tab_name_wrapper).setPadding(C28209p.m103291a(14.0f), 0, C28209p.m103291a(14.0f), 0);
                    i14 = a4;
                    z2 = false;
                } else {
                    a3.findViewById(R.id.tab_name_wrapper).setPadding(C28209p.m103291a(14.0f), 0, 0, 0);
                    i14 = a4;
                    z2 = true;
                }
            }
            tabLayout.mo78234a(a2);
            i13++;
            context = context;
            i10 = i10;
            a = i12;
            i9 = i9;
        }
        View findViewById = view.findViewById(R.id.category_click_wrapper);
        if (z) {
            findViewById.setBackgroundResource(R.color.bg_float);
        } else {
            findViewById.setBackgroundResource(R.color.bg_body);
        }
        if (z2) {
            view.setVisibility(8);
            C28209p.m103301a(tabLayout, i3, 0, i3, i5);
            i11 = a;
        } else {
            view.setVisibility(0);
            C28209p.m103301a(tabLayout, i3, 0, C28209p.m103291a(24.0f) + i3, i5);
            view.setPadding(0, i, 0, i2);
            C28209p.m103301a(view, 0, 0, 0, i5);
            i11 = a;
            C28209p.m103299a(view, i11);
            C28209p.m103301a(view.findViewById(R.id.category_icon_wrapper), C28209p.m103291a(4.0f), 0, i4, 0);
            C28209p.m103300a(view.findViewById(R.id.category_icon), i10, i10);
            findViewById.setOnClickListener(new View.OnClickListener(view, b, aVar, bVar, context, str2) {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.$$Lambda$a$52_N8XMrZJmHri95vtfs7FGWNlY */
                public final /* synthetic */ View f$0;
                public final /* synthetic */ List f$1;
                public final /* synthetic */ C28067a.AbstractC28069a f$2;
                public final /* synthetic */ C28070b f$3;
                public final /* synthetic */ Context f$4;
                public final /* synthetic */ String f$5;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void onClick(View view) {
                    C28067a.m102585a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view);
                }
            });
        }
        C28209p.m103299a(tabLayout, i11);
        tabLayout.mo78233a(new TabLayout.AbstractC22446c() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.C28067a.C280681 */

            @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
            /* renamed from: c */
            public void mo78294c(TabLayout.C22451f fVar) {
            }

            @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
            /* renamed from: b */
            public void mo78293b(TabLayout.C22451f fVar) {
                ((TextView) fVar.mo78310a().findViewById(R.id.tab_name)).getPaint().setFakeBoldText(false);
            }

            @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
            /* renamed from: a */
            public void mo78292a(TabLayout.C22451f fVar) {
                AbstractC28069a aVar = aVar;
                if (aVar != null) {
                    aVar.onSelected(fVar.mo78318c(), "external");
                }
                ((TextView) fVar.mo78310a().findViewById(R.id.tab_name)).getPaint().setFakeBoldText(true);
            }
        });
    }
}
