package com.tt.miniapp;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a;
import com.larksuite.component.openplatform.core.plugin.container.C24692p;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.AddTabItemModel;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3331t.AbstractC66881b;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.AppbrandFragmentTabHost;
import com.tt.miniapp.view.TabHost;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.C67533i;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.p3255a.C65678c;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.q */
public class C66661q extends AbstractC66881b implements TabHost.AbstractC67145d {

    /* renamed from: a */
    public AppbrandFragmentTabHost f168264a;

    /* renamed from: b */
    private AbstractC24460a f168265b;

    /* renamed from: c */
    private IAppContext f168266c;

    /* renamed from: d */
    private int f168267d = 1;

    /* renamed from: e */
    private View f168268e;

    /* renamed from: f */
    private List<C66665a> f168269f = new ArrayList();

    /* renamed from: g */
    private C66675b f168270g;

    /* renamed from: h */
    private AppbrandApplicationImpl.AbstractC65696b f168271h;

    /* renamed from: i */
    private boolean f168272i = false;

    /* renamed from: j */
    private volatile Runnable f168273j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.q$b */
    public static class C66675b {

        /* renamed from: a */
        public int f168319a = -1;

        /* renamed from: b */
        public int f168320b = -1;

        /* renamed from: c */
        public int f168321c = -1;

        /* renamed from: d */
        public String f168322d = "black";

        C66675b() {
        }

        /* renamed from: a */
        public static C66675b m260420a(IAppContext iAppContext) {
            AppConfig.C65691f fVar;
            C66675b bVar = new C66675b();
            AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
            if (appConfig != null) {
                fVar = appConfig.mo230041b();
            } else {
                fVar = null;
            }
            if (fVar == null) {
                return bVar;
            }
            if (!TextUtils.isEmpty(fVar.f165537c)) {
                bVar.f168322d = fVar.f165537c;
            }
            bVar.f168319a = C67590h.m263069a(fVar.f165535a, "#000000");
            bVar.f168320b = C67590h.m263069a(fVar.f165536b, "#DC4050");
            bVar.f168321c = C67590h.m263069a(fVar.f165539e, "#ffffff");
            if (TextUtils.equals(fVar.f165537c, "white") || TextUtils.equals(fVar.f165537c, "black")) {
                bVar.f168322d = fVar.f165537c;
            }
            return bVar;
        }
    }

    /* renamed from: f */
    public Fragment mo232397f() {
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null) {
            return null;
        }
        return appbrandFragmentTabHost.getCurrentFragment();
    }

    /* renamed from: com.tt.miniapp.q$a */
    public static class C66665a {

        /* renamed from: a */
        public View f168281a;

        /* renamed from: b */
        public C66675b f168282b;

        /* renamed from: c */
        public ImageView f168283c;

        /* renamed from: d */
        public String f168284d;

        /* renamed from: e */
        public TextView f168285e;

        /* renamed from: f */
        public View f168286f;

        /* renamed from: g */
        public AppConfig.C65691f.C65692a f168287g;

        /* renamed from: h */
        public Bitmap f168288h;

        /* renamed from: i */
        public Bitmap f168289i;

        /* renamed from: j */
        public boolean f168290j;

        /* renamed from: k */
        public boolean f168291k;

        /* renamed from: l */
        public int f168292l;

        /* renamed from: m */
        public boolean f168293m;

        /* renamed from: n */
        public IAppContext f168294n;

        /* renamed from: o */
        public AddTabItemModel f168295o;

        /* renamed from: p */
        private ImageView f168296p;

        /* renamed from: q */
        private TextView f168297q;

        /* renamed from: r */
        private View f168298r;

        /* renamed from: s */
        private View f168299s;

        /* renamed from: t */
        private Context f168300t;

        /* renamed from: h */
        private GradientDrawable m260406h() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234532l()));
            return gradientDrawable;
        }

        /* renamed from: f */
        public void mo232413f() {
            this.f168293m = true;
            this.f168285e.setTextColor(this.f168282b.f168320b);
            Bitmap bitmap = this.f168288h;
            if (bitmap != null) {
                this.f168283c.setImageBitmap(bitmap);
            } else {
                m260407i();
            }
        }

        /* renamed from: g */
        public void mo232414g() {
            this.f168293m = false;
            this.f168285e.setTextColor(this.f168282b.f168319a);
            Bitmap bitmap = this.f168289i;
            if (bitmap != null) {
                this.f168283c.setImageBitmap(bitmap);
            } else {
                mo232412e();
            }
        }

        /* renamed from: c */
        public void mo232410c() {
            byte[] loadByteFromStream;
            if (this.f168290j && (loadByteFromStream = StreamLoader.loadByteFromStream(this.f168287g.f165542b, this.f168294n)) != null && loadByteFromStream.length > 0) {
                this.f168289i = C67070z.m261385a(loadByteFromStream);
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.C66661q.C66665a.RunnableC666749 */

                    public void run() {
                        if (!C66665a.this.f168291k || !C66665a.this.f168293m) {
                            C66665a.this.f168283c.setImageBitmap(C66665a.this.f168289i);
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo232409b() {
            byte[] loadByteFromStream;
            if (this.f168291k && (loadByteFromStream = StreamLoader.loadByteFromStream(this.f168287g.f165543c, this.f168294n)) != null && loadByteFromStream.length > 0) {
                this.f168288h = C67070z.m261385a(loadByteFromStream);
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.C66661q.C66665a.RunnableC666738 */

                    public void run() {
                        if (C66665a.this.f168293m) {
                            C66665a.this.f168283c.setImageBitmap(C66665a.this.f168288h);
                        }
                    }
                });
            }
        }

        /* renamed from: d */
        public void mo232411d() {
            AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168294n).getAppConfig();
            if (appConfig != null) {
                AppConfig.C65691f b = appConfig.mo230041b();
                String str = b.f165539e;
                if (TextUtils.isEmpty(str)) {
                    str = "#ffffff";
                }
                this.f168281a.setBackgroundColor(C67590h.m263069a(str, "#ffffff"));
                try {
                    if (!TextUtils.isEmpty(b.f165538d)) {
                        AppBrandLogger.m52830i("tma_TabFragment", "set tab bar border color with custom : " + b.f165538d);
                        this.f168286f.setBackgroundColor(Color.parseColor(b.f165538d));
                    } else if (TextUtils.equals(b.f165537c, "white")) {
                        this.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.microapp_m_tab_diver_white));
                    } else if (TextUtils.equals(C25529d.m91164e(this.f168294n), "dark")) {
                        this.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.line_divider_default));
                    } else {
                        this.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.microapp_m_tab_diver_black));
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_TabFragment", e);
                }
            }
        }

        /* renamed from: i */
        private void m260407i() {
            AddTabItemModel addTabItemModel = this.f168295o;
            if (addTabItemModel != null && addTabItemModel.darkIcon != null && this.f168295o.lightIcon != null && this.f168295o.darkIcon.selectedIconPath != null && this.f168295o.lightIcon.selectedIconPath != null) {
                this.f168283c.setImageTintList(ContextCompat.getColorStateList(this.f168294n.getApplicationContext(), R.color.fill_img_mask));
                this.f168283c.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
                if (TextUtils.equals(C25529d.m91164e(this.f168294n), "dark")) {
                    if (this.f168295o.darkIcon.selectedIconPath.startsWith("http:") || this.f168295o.darkIcon.selectedIconPath.startsWith("https:")) {
                        try {
                            final C65678c a = new C65678c(Uri.parse(this.f168295o.darkIcon.selectedIconPath)).mo229919a(R.drawable.microapp_m_tab_selected_default_night).mo229924b(R.drawable.microapp_m_tab_selected_default_night).mo229922a(this.f168283c);
                            C67866g.m264027a(new Runnable() {
                                /* class com.tt.miniapp.C66661q.C66665a.RunnableC666672 */

                                public void run() {
                                    HostDependManager.getInst().loadImage(C66665a.this.f168294n.getApplicationContext(), a);
                                }
                            });
                        } catch (Exception e) {
                            AppBrandLogger.eWithThrowable("tma_TabFragment", "loadSelectedIcon", e);
                        }
                    } else {
                        byte[] loadByteFromStream = StreamLoader.loadByteFromStream(this.f168295o.darkIcon.selectedIconPath, this.f168294n);
                        if (loadByteFromStream == null || loadByteFromStream.length <= 0) {
                            this.f168283c.setImageResource(R.drawable.microapp_m_tab_selected_default_night);
                            return;
                        }
                        this.f168288h = C67070z.m261385a(loadByteFromStream);
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.C66661q.C66665a.RunnableC666683 */

                            public void run() {
                                if (C66665a.this.f168293m) {
                                    C66665a.this.f168283c.setImageBitmap(C66665a.this.f168288h);
                                }
                            }
                        });
                    }
                } else if (this.f168295o.lightIcon.selectedIconPath.startsWith("http:") || this.f168295o.lightIcon.selectedIconPath.startsWith("https:")) {
                    try {
                        final C65678c a2 = new C65678c(Uri.parse(this.f168295o.lightIcon.selectedIconPath)).mo229919a(R.drawable.microapp_m_tab_selected_default_light).mo229924b(R.drawable.microapp_m_tab_selected_default_light).mo229922a(this.f168283c);
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.C66661q.C66665a.RunnableC666694 */

                            public void run() {
                                HostDependManager.getInst().loadImage(C66665a.this.f168294n.getApplicationContext(), a2);
                            }
                        });
                    } catch (Exception e2) {
                        AppBrandLogger.eWithThrowable("tma_TabFragment", "loadSelectedIcon", e2);
                    }
                } else {
                    byte[] loadByteFromStream2 = StreamLoader.loadByteFromStream(this.f168295o.lightIcon.selectedIconPath, this.f168294n);
                    if (loadByteFromStream2 == null || loadByteFromStream2.length <= 0) {
                        this.f168283c.setImageResource(R.drawable.microapp_m_tab_selected_default_light);
                        return;
                    }
                    this.f168288h = C67070z.m261385a(loadByteFromStream2);
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.C66661q.C66665a.RunnableC666705 */

                        public void run() {
                            if (C66665a.this.f168293m) {
                                C66665a.this.f168283c.setImageBitmap(C66665a.this.f168288h);
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo232403a() {
            this.f168283c = (ImageView) this.f168281a.findViewById(R.id.microapp_m_tab_icon);
            this.f168285e = (TextView) this.f168281a.findViewById(R.id.microapp_m_tab_tv);
            this.f168286f = this.f168281a.findViewById(R.id.microapp_m_diver);
            ImageView imageView = (ImageView) this.f168281a.findViewById(R.id.microapp_m_red_dot);
            this.f168296p = imageView;
            imageView.setBackground(m260406h());
            this.f168297q = (TextView) this.f168281a.findViewById(R.id.microapp_m_red_dot_number);
            this.f168298r = this.f168281a.findViewById(R.id.microapp_m_red_dot_number_more);
            this.f168299s = this.f168281a.findViewById(R.id.microapp_m_tab_icon_layout);
            AppConfig.C65691f.C65692a aVar = this.f168287g;
            if (aVar != null) {
                AppBrandLogger.m52828d("tma_TabFragment", "iconPath ", aVar.f165542b, " unSelectPath ", this.f168287g.f165543c);
                if (!TextUtils.isEmpty(this.f168287g.f165542b) && StreamLoader.findFile(this.f168287g.f165542b, this.f168294n) != null) {
                    this.f168290j = true;
                }
                if (this.f168290j && !TextUtils.isEmpty(this.f168287g.f165543c) && StreamLoader.findFile(this.f168287g.f165543c, this.f168294n) != null) {
                    this.f168291k = true;
                }
                if (TextUtils.isEmpty(this.f168287g.f165544d)) {
                    this.f168285e.setVisibility(8);
                } else {
                    this.f168285e.setVisibility(0);
                    this.f168285e.setText(m260403a(this.f168287g.f165544d.toCharArray()));
                }
            } else if (TextUtils.isEmpty(this.f168295o.text)) {
                this.f168285e.setVisibility(8);
            } else {
                this.f168285e.setVisibility(0);
                this.f168285e.setText(m260403a(this.f168295o.text.toCharArray()));
            }
            final GestureDetector gestureDetector = new GestureDetector(this.f168300t, new GestureDetector.SimpleOnGestureListener() {
                /* class com.tt.miniapp.C66661q.C66665a.C666661 */

                public boolean onDoubleTap(MotionEvent motionEvent) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("index", C66665a.this.f168292l);
                        if (C66665a.this.f168287g != null) {
                            jSONObject.put("pagePath", C66665a.this.f168287g.f165541a);
                            jSONObject.put("text", C66665a.this.f168287g.f165544d);
                        } else {
                            jSONObject.put("pagePath", C66665a.this.f168295o.pagePath);
                            jSONObject.put("text", C66665a.this.f168295o.text);
                        }
                        AppBrandLogger.m52828d("onTabbarDoubleClicked", jSONObject.toString());
                        C67432a.m262319a(C66665a.this.f168294n).getJsBridge().sendMsgToJsCore("onTabbarDoubleTap", jSONObject.toString());
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("onTabbarDoubleClicked", "send msg to jscore: onTabbarDoubleTap", e);
                    }
                    return super.onDoubleTap(motionEvent);
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("index", C66665a.this.f168292l);
                        if (C66665a.this.f168287g != null) {
                            jSONObject.put("pagePath", C66665a.this.f168287g.f165541a);
                            jSONObject.put("text", C66665a.this.f168287g.f165544d);
                        } else {
                            jSONObject.put("pagePath", C66665a.this.f168295o.pagePath);
                            jSONObject.put("text", C66665a.this.f168295o.text);
                        }
                        C67432a.m262319a(C66665a.this.f168294n).getJsBridge().sendMsgToJsCore("onTabItemTap", jSONObject.toString());
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("tma_TabFragment", "send msg to jscore: onTabItemTap", e);
                    }
                    return super.onSingleTapConfirmed(motionEvent);
                }
            });
            this.f168281a.setOnTouchListener(new View.OnTouchListener() {
                /* class com.tt.miniapp.C66661q.C66665a.View$OnTouchListenerC666716 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C66665a.this.f168293m || !gestureDetector.onTouchEvent(motionEvent)) {
                        return false;
                    }
                    return true;
                }
            });
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.C66661q.C66665a.C666727 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    if (C66665a.this.f168287g == null) {
                        C66665a.this.mo232411d();
                        if (C66665a.this.f168282b != null) {
                            C66665a.this.f168285e.setTextColor(C66665a.this.f168282b.f168319a);
                        }
                        C66665a.this.mo232412e();
                    } else if (C66665a.this.f168290j || C66665a.this.f168291k) {
                        C66665a.this.mo232409b();
                        C66665a.this.mo232410c();
                    }
                }
            }, Schedulers.longIO());
        }

        /* renamed from: e */
        public void mo232412e() {
            AddTabItemModel addTabItemModel = this.f168295o;
            if (addTabItemModel != null && addTabItemModel.darkIcon != null && this.f168295o.lightIcon != null && this.f168295o.darkIcon.iconPath != null && this.f168295o.lightIcon.iconPath != null) {
                this.f168283c.setImageTintList(ContextCompat.getColorStateList(this.f168294n.getApplicationContext(), R.color.fill_img_mask));
                this.f168283c.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
                if (TextUtils.equals(C25529d.m91164e(this.f168294n), "dark")) {
                    if (this.f168295o.darkIcon.iconPath.startsWith("http:") || this.f168295o.darkIcon.iconPath.startsWith("https:")) {
                        try {
                            final C65678c a = new C65678c(Uri.parse(this.f168295o.darkIcon.iconPath)).mo229919a(R.drawable.microapp_m_tab_icon_default_night).mo229924b(R.drawable.microapp_m_tab_icon_default_night).mo229922a(this.f168283c);
                            C67866g.m264027a(new Runnable() {
                                /* class com.tt.miniapp.C66661q.C66665a.AnonymousClass10 */

                                public void run() {
                                    HostDependManager.getInst().loadImage(C66665a.this.f168294n.getApplicationContext(), a);
                                }
                            });
                        } catch (Exception e) {
                            AppBrandLogger.eWithThrowable("tma_TabFragment", "loadUnSelectIcon", e);
                        }
                    } else {
                        byte[] loadByteFromStream = StreamLoader.loadByteFromStream(this.f168295o.darkIcon.iconPath, this.f168294n);
                        if (loadByteFromStream == null || loadByteFromStream.length <= 0) {
                            this.f168283c.setImageResource(R.drawable.microapp_m_tab_icon_default_night);
                            return;
                        }
                        this.f168289i = C67070z.m261385a(loadByteFromStream);
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.C66661q.C66665a.AnonymousClass11 */

                            public void run() {
                                if (!C66665a.this.f168291k || !C66665a.this.f168293m) {
                                    C66665a.this.f168283c.setImageBitmap(C66665a.this.f168289i);
                                }
                            }
                        });
                    }
                } else if (this.f168295o.lightIcon.iconPath.startsWith("http") || this.f168295o.lightIcon.iconPath.startsWith("https:")) {
                    try {
                        final C65678c a2 = new C65678c(Uri.parse(this.f168295o.lightIcon.iconPath)).mo229919a(R.drawable.microapp_m_tab_icon_default_light).mo229924b(R.drawable.microapp_m_tab_icon_default_light).mo229922a(this.f168283c);
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.C66661q.C66665a.AnonymousClass12 */

                            public void run() {
                                HostDependManager.getInst().loadImage(C66665a.this.f168294n.getApplicationContext(), a2);
                            }
                        });
                    } catch (Exception e2) {
                        AppBrandLogger.eWithThrowable("tma_TabFragment", "loadUnSelectIcon", e2);
                    }
                } else {
                    byte[] loadByteFromStream2 = StreamLoader.loadByteFromStream(this.f168295o.lightIcon.iconPath, this.f168294n);
                    if (loadByteFromStream2 == null || loadByteFromStream2.length <= 0) {
                        this.f168283c.setImageResource(R.drawable.microapp_m_tab_icon_default_light);
                        return;
                    }
                    this.f168289i = C67070z.m261385a(loadByteFromStream2);
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.C66661q.C66665a.AnonymousClass13 */

                        public void run() {
                            if (!C66665a.this.f168291k || !C66665a.this.f168293m) {
                                C66665a.this.f168283c.setImageBitmap(C66665a.this.f168289i);
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo232404a(AddTabItemModel addTabItemModel) {
            this.f168295o = addTabItemModel;
        }

        /* renamed from: a */
        public void mo232405a(C66675b bVar) {
            this.f168282b = bVar;
        }

        /* renamed from: a */
        private int m260401a(String str) {
            char[] charArray;
            int i = 0;
            for (char c : str.toCharArray()) {
                if (c > 127) {
                    i += 2;
                } else {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: a */
        private GradientDrawable m260402a(Context context) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234532l()));
            gradientDrawable.setCornerRadius(C67590h.m263065a(context, 8.0f));
            return gradientDrawable;
        }

        /* renamed from: b */
        private GradientDrawable m260404b(Context context) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234532l()));
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.microapp_m_launch_red_circle_height);
            gradientDrawable.setSize(dimensionPixelOffset, dimensionPixelOffset);
            return gradientDrawable;
        }

        /* renamed from: a */
        private String m260403a(char[] cArr) {
            if (cArr.length <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < cArr.length; i2++) {
                if (cArr[i2] > 255) {
                    i += 2;
                } else {
                    i++;
                }
                if (i >= 12) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                sb.append(cArr[i2]);
            }
            if (!z) {
                return sb.toString();
            }
            sb.append("...");
            return sb.toString();
        }

        /* renamed from: b */
        private void m260405b(boolean z) {
            if (z) {
                this.f168298r.setVisibility(0);
                this.f168297q.setVisibility(8);
                return;
            }
            this.f168298r.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f168297q.getLayoutParams();
            layoutParams.width = -2;
            this.f168297q.setLayoutParams(layoutParams);
            this.f168297q.setVisibility(0);
        }

        /* renamed from: a */
        public void mo232407a(boolean z) {
            if (z) {
                this.f168296p.setVisibility(0);
                this.f168297q.setVisibility(8);
                this.f168298r.setVisibility(8);
                return;
            }
            this.f168296p.setVisibility(8);
        }

        /* renamed from: a */
        public void mo232408a(boolean z, String str) {
            if (!z) {
                this.f168297q.setVisibility(8);
                this.f168298r.setVisibility(8);
            } else if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52830i("tma_TabFragment", "text is null");
                m260405b(true);
            } else {
                mo232407a(false);
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= 0 && parseInt < 10) {
                        m260405b(false);
                        this.f168297q.setText(str);
                        this.f168297q.setBackground(m260404b(this.f168300t));
                    } else if (parseInt < 10 || parseInt > 99) {
                        m260405b(true);
                    } else {
                        m260405b(false);
                        this.f168297q.setText(str);
                        this.f168297q.setBackground(m260402a(this.f168300t));
                    }
                } catch (NumberFormatException unused) {
                    int a = m260401a(str);
                    if (a == 1) {
                        m260405b(false);
                        this.f168297q.setText(str);
                        this.f168297q.setBackground(m260404b(this.f168300t));
                    } else if (a == 2) {
                        m260405b(false);
                        this.f168297q.setBackground(m260402a(this.f168300t));
                        this.f168297q.setText(str);
                    } else {
                        m260405b(true);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo232406a(String str, Bitmap bitmap, Bitmap bitmap2, String str2) {
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52830i("tma_TabFragment", "setTabBarItem text is empty");
            } else if (str.trim().isEmpty()) {
                this.f168285e.setVisibility(8);
            } else {
                this.f168285e.setVisibility(0);
                this.f168285e.setText(str);
            }
            if (bitmap != null) {
                this.f168289i = bitmap;
            } else {
                AppBrandLogger.m52828d("tma_TabFragment", "mUnSelectDrawable not exists");
            }
            if (bitmap2 != null) {
                this.f168288h = bitmap2;
            } else {
                AppBrandLogger.m52830i("tma_TabFragment", "selectDrawable not exists");
            }
            if (TextUtils.equals(str2, this.f168284d)) {
                Bitmap bitmap3 = this.f168288h;
                if (bitmap3 != null) {
                    this.f168283c.setImageBitmap(bitmap3);
                } else {
                    m260407i();
                }
            } else {
                Bitmap bitmap4 = this.f168289i;
                if (bitmap4 != null) {
                    this.f168283c.setImageBitmap(bitmap4);
                } else {
                    mo232412e();
                }
            }
        }

        public C66665a(String str, View view, AppConfig.C65691f.C65692a aVar, C66675b bVar, int i, IAppContext iAppContext) {
            this.f168281a = view;
            this.f168287g = aVar;
            this.f168284d = str;
            this.f168282b = bVar;
            this.f168292l = i;
            this.f168300t = view.getContext();
            this.f168294n = iAppContext;
        }
    }

    /* renamed from: c */
    public String mo232393c() {
        AppbrandFragment appbrandFragment;
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null || (appbrandFragment = (AppbrandFragment) appbrandFragmentTabHost.getCurrentFragment()) == null) {
            return "";
        }
        return appbrandFragment.getPage();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        Runnable runnable;
        super.onStart();
        synchronized (this) {
            this.f168272i = true;
            runnable = this.f168273j;
            this.f168273j = null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public String mo232396e() {
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost != null) {
            AppbrandFragment appbrandFragment = (AppbrandFragment) appbrandFragmentTabHost.getCurrentFragment();
            if (appbrandFragment != null) {
                return appbrandFragment.getPagePath();
            }
            return "";
        }
        AppBrandLogger.m52829e("tma_TabFragment", " mTabHost is null ");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.m52830i("tma_TabFragment", "tabFragment onDestroy");
        AppbrandApplicationImpl.getInst(this.f168266c).unRegisterConfigurationChangeListener(this.f168271h);
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost != null) {
            appbrandFragmentTabHost.mo233423a();
            this.f168264a = null;
        }
        this.f168271h = null;
        this.f168266c = null;
    }

    /* renamed from: a */
    public ArrayList<AppConfig.C65691f.C65692a> mo232383a() {
        AppConfig.C65691f b;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168266c).getAppConfig();
        if (appConfig == null || (b = appConfig.mo230041b()) == null) {
            return null;
        }
        return b.f165540f;
    }

    /* renamed from: d */
    public String mo232395d() {
        Fragment currentFragment = this.f168264a.getCurrentFragment();
        if (!(currentFragment instanceof AppbrandFragment)) {
            return null;
        }
        if (((AppbrandFragment) currentFragment).isWebViewFragment()) {
            return "webview";
        }
        return "mp_native";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo232388b() {
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168266c).getAppConfig();
        if (appConfig != null) {
            AppConfig.C65691f b = appConfig.mo230041b();
            String str = b.f165539e;
            if (TextUtils.isEmpty(str)) {
                str = "#ffffff";
            }
            AppBrandLogger.m52828d("tma_TabFragment", "tabBackgroundColor ", str);
            for (C66665a aVar : this.f168269f) {
                aVar.f168281a.setBackgroundColor(C67590h.m263069a(str, "#ffffff"));
                try {
                    if (!TextUtils.isEmpty(b.f165538d)) {
                        AppBrandLogger.m52830i("tma_TabFragment", "set tab bar border color with custom : " + b.f165538d);
                        aVar.f168286f.setBackgroundColor(Color.parseColor(b.f165538d));
                    } else if (TextUtils.equals(b.f165537c, "white")) {
                        aVar.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.microapp_m_tab_diver_white));
                    } else if (TextUtils.equals(C25529d.m91164e(this.f168266c), "dark")) {
                        aVar.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.line_divider_default));
                    } else {
                        aVar.f168286f.setBackgroundColor(AppbrandContext.getInst().getApplicationContext().getResources().getColor(R.color.microapp_m_tab_diver_black));
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_TabFragment", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public void mo232387a(boolean z) {
        int i;
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            appbrandFragmentTabHost.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m260381a(Configuration configuration) {
        if (this.f168264a != null && this.f168267d != configuration.orientation) {
            this.f168267d = configuration.orientation;
            this.f168264a.mo233478c();
        }
    }

    /* renamed from: b */
    public void mo232389b(String str) {
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null) {
            AppBrandLogger.m52829e("tma_TabFragment", "mTabHost == null");
            return;
        }
        AppbrandFragment appbrandFragment = (AppbrandFragment) appbrandFragmentTabHost.getCurrentFragment();
        if (appbrandFragment != null) {
            appbrandFragment.setOpenType(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AppBrandLogger.m52828d("tma_TabFragment", "onActivityCreated ");
    }

    /* renamed from: d */
    private void m260382d(String str) {
        for (C66665a aVar : this.f168269f) {
            if (TextUtils.equals(str, aVar.f168284d)) {
                aVar.mo232413f();
            } else {
                aVar.mo232414g();
            }
        }
    }

    /* renamed from: a */
    public C66665a mo232382a(int i) {
        if (i < 0 || i >= this.f168269f.size()) {
            return null;
        }
        return this.f168269f.get(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        AppBrandLogger.m52828d("tma_TabFragment", "TabFragment onHiddenChanged ", Boolean.valueOf(z));
        if (this.f168264a.getCurrentFragment() != null) {
            this.f168264a.getCurrentFragment().onHiddenChanged(z);
        }
    }

    /* renamed from: b */
    public void mo232391b(boolean z) {
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null) {
            return;
        }
        if (z) {
            if (appbrandFragmentTabHost.getVisibility() == 8) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.microapp_i_bottom_slide_in);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.tt.miniapp.C66661q.animationAnimation$AnimationListenerC666643 */

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        C66661q.this.f168264a.setVisibility(0);
                    }
                });
                this.f168264a.startAnimation(loadAnimation);
            }
        } else if (appbrandFragmentTabHost.getVisibility() == 0) {
            this.f168264a.setVisibility(8);
            this.f168264a.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.microapp_i_bottom_slide_out));
        }
    }

    @Override // com.tt.miniapp.view.TabHost.AbstractC67145d
    /* renamed from: a */
    public void mo232384a(String str) {
        AppBrandLogger.m52830i("tma_TabFragment", "onTabChanged tabId ", str);
        AppbrandFragment appbrandFragment = (AppbrandFragment) this.f168264a.getCurrentFragment();
        if (appbrandFragment != null) {
            appbrandFragment.setOpenType("switchTab");
        }
        m260382d(str);
    }

    /* renamed from: c */
    public Pair<Integer, String> mo232392c(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("tma_TabFragment", "no page path");
            return new Pair<>(-10006, "no page path");
        }
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null) {
            AppBrandLogger.m52829e("tma_TabFragment", "no tab host");
            return new Pair<>(-10007, "no tab host");
        } else if (TextUtils.equals(str, appbrandFragmentTabHost.getCurrentTabTag())) {
            AppBrandLogger.m52829e("tma_TabFragment", "can not remove the current tab");
            return new Pair<>(-10008, "can not remove the current tab");
        } else if (this.f168264a.getTabCount() <= 2) {
            AppBrandLogger.m52829e("tma_TabFragment", "at least 2 tabs should be remained");
            return new Pair<>(-10009, "at least 2 tabs should be remained");
        } else if (!this.f168264a.mo233427b(str)) {
            return new Pair<>(-10010, "remove target tab fail, cannot find target tab");
        } else {
            AppBrandLogger.m52830i("tma_TabFragment", "remove tab item : " + str);
            List<C66665a> list = this.f168269f;
            if (list != null && !list.isEmpty()) {
                while (true) {
                    if (i >= this.f168269f.size()) {
                        break;
                    }
                    C66665a aVar = this.f168269f.get(i);
                    if (aVar != null && TextUtils.equals(str, aVar.f168284d)) {
                        this.f168269f.remove(i);
                        break;
                    }
                    i++;
                }
            }
            return new Pair<>(Integer.valueOf((int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT), "remove target tab successfully");
        }
    }

    /* renamed from: a */
    public Pair<Integer, String> mo232381a(AddTabItemModel addTabItemModel) {
        AppbrandFragmentTabHost appbrandFragmentTabHost = this.f168264a;
        if (appbrandFragmentTabHost == null) {
            AppBrandLogger.m52829e("tma_TabFragment", "no tab host");
            return new Pair<>(-20004, "no tab host");
        } else if (appbrandFragmentTabHost.getTabCount() >= 5) {
            AppBrandLogger.m52829e("tma_TabFragment", "at most 5 tabs should be remained");
            return new Pair<>(-10010, "at most 5 tabs should be remained");
        } else if (addTabItemModel.index < 0 || addTabItemModel.index >= this.f168264a.getTabCount() + 1) {
            AppBrandLogger.m52829e("tma_TabFragment", "index is invalid");
            return new Pair<>(-10011, "index is invalid");
        } else {
            for (TabHost.C67147f fVar : this.f168264a.getTabSpecs()) {
                if (addTabItemModel.pagePath.equals(fVar.mo233500a())) {
                    AppBrandLogger.m52829e("tma_TabFragment", "this tab already exists");
                    return new Pair<>(-10012, "this tab already exists");
                }
            }
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_diver_height) + getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_item_height);
            int d = C67590h.m263090d(getContext()) / (this.f168264a.getTabCount() + 1);
            TabHost.C67147f c = this.f168264a.mo233477c(addTabItemModel.pagePath);
            View preloadedView = ((PreloadManager) AppbrandApplicationImpl.getInst(this.f168266c).getService(PreloadManager.class)).getPreloadedView(4);
            preloadedView.setLayoutParams(new LinearLayout.LayoutParams(d, dimensionPixelOffset));
            c.mo233498a(preloadedView);
            Bundle bundle = new Bundle();
            bundle.putString("page_url", addTabItemModel.pagePath);
            bundle.putString("open_type", "switchTab");
            if (!this.f168264a.mo233426a(c, bundle, addTabItemModel.index)) {
                return new Pair<>(-20005, "add target tab fail, cannot find target tab");
            }
            C66665a aVar = new C66665a(addTabItemModel.pagePath, preloadedView, null, this.f168270g, addTabItemModel.index, this.f168266c);
            aVar.mo232404a(addTabItemModel);
            aVar.mo232403a();
            if (addTabItemModel.index >= this.f168269f.size()) {
                this.f168269f.add(aVar);
            } else {
                this.f168269f.add(addTabItemModel.index, aVar);
            }
            return new Pair<>(Integer.valueOf((int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT), "add target tab successfully");
        }
    }

    /* renamed from: d */
    private boolean m260383d(String str, String str2) {
        return TextUtils.equals(AppConfig.m257573a(str2.split("\\?")[0]), AppConfig.m257573a(str.split("\\?")[0]));
    }

    public C66661q(AbstractC24460a aVar, IAppContext iAppContext) {
        this.f168266c = iAppContext;
        this.f168265b = aVar;
        this.f168268e = ((PreloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(PreloadManager.class)).getPreloadedView(2);
    }

    /* renamed from: c */
    public void mo232394c(String str, String str2) {
        if (this.f168264a == null) {
            AppBrandLogger.m52830i("tma_TabFragment", " mTabHost is null, can not show tab");
            return;
        }
        TimeLogger.getInstance(this.f168266c).logTimeDuration("TabFragment_showTab");
        AppbrandFragment appbrandFragment = (AppbrandFragment) this.f168264a.getCurrentFragment();
        if (appbrandFragment != null) {
            appbrandFragment.setOpenType(str2);
        }
        int indexOf = str.indexOf("?");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        this.f168264a.setCurrentTabByTag(str);
        AppBrandLogger.m52828d("tma_TabFragment", "showTab ", str);
    }

    /* renamed from: b */
    public void mo232390b(String str, String str2) {
        AppConfig.C65691f b;
        ArrayList<AppConfig.C65691f.C65692a> arrayList;
        int i = 1;
        char c = 0;
        Object[] objArr = {"doShowTabs, type: " + str2};
        String str3 = "tma_TabFragment";
        AppBrandLogger.m52830i(str3, objArr);
        if (this.f168264a == null) {
            AppBrandLogger.m52829e(str3, "tabHost is null");
            return;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168266c).getAppConfig();
        this.f168270g = C66675b.m260420a(this.f168266c);
        if (!(appConfig == null || (b = appConfig.mo230041b()) == null || (arrayList = b.f165540f) == null)) {
            int size = arrayList.size();
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_diver_height) + getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_item_height);
            int d = C67590h.m263090d(getContext()) / size;
            int i2 = 0;
            while (i2 < size) {
                AppConfig.C65691f.C65692a aVar = arrayList.get(i2);
                Object[] objArr2 = new Object[i];
                objArr2[c] = "add tab: " + aVar;
                AppBrandLogger.m52830i(str3, objArr2);
                TabHost.C67147f c2 = this.f168264a.mo233477c(aVar.f165541a);
                View preloadedView = ((PreloadManager) AppbrandApplicationImpl.getInst(this.f168266c).getService(PreloadManager.class)).getPreloadedView(4);
                preloadedView.setLayoutParams(new LinearLayout.LayoutParams(d, dimensionPixelOffset));
                C66665a aVar2 = new C66665a(aVar.f165541a, preloadedView, aVar, this.f168270g, i2, this.f168266c);
                aVar2.mo232404a((AddTabItemModel) null);
                aVar2.mo232403a();
                this.f168269f.add(aVar2);
                c2.mo233498a(preloadedView);
                Bundle bundle = new Bundle();
                if (m260383d(str, aVar.f165541a)) {
                    bundle.putString("page_url", str);
                    bundle.putString("open_type", str2);
                } else {
                    bundle.putString("page_url", aVar.f165541a);
                    bundle.putString("open_type", "switchTab");
                }
                this.f168264a.mo233425a(c2, bundle);
                i2++;
                arrayList = arrayList;
                str3 = str3;
                size = size;
                i = 1;
                c = 0;
            }
        }
        C24692p.m89749b(this.f168266c);
        String b2 = AppConfig.m257578b(str);
        this.f168264a.setCurrentTabByTag(b2);
        m260382d(b2);
        this.f168264a.setOnTabChangedListener(this);
        mo232388b();
    }

    /* renamed from: a */
    public void mo232385a(final String str, final String str2) {
        boolean z = true;
        if (!this.f168272i) {
            synchronized (this) {
                if (!this.f168272i) {
                    this.f168273j = new Runnable() {
                        /* class com.tt.miniapp.C66661q.RunnableC666621 */

                        public void run() {
                            C66661q.this.mo232390b(str, str2);
                        }
                    };
                    z = false;
                }
            }
        }
        if (z) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.C66661q.RunnableC666632 */

                public void run() {
                    C66661q.this.mo232390b(str, str2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppbrandFragmentTabHost appbrandFragmentTabHost = (AppbrandFragmentTabHost) this.f168268e.findViewById(R.id.microapp_m_tabhost);
        this.f168264a = appbrandFragmentTabHost;
        appbrandFragmentTabHost.setAppContext(this.f168266c);
        this.f168264a.setHideWhenTabChanged(true);
        this.f168264a.mo233424a(getActivity(), getChildFragmentManager(), R.id.microapp_m_realtabcontent, this.f168265b);
        IAppContext iAppContext = this.f168266c;
        if (!(iAppContext == null || iAppContext.getCurrentActivity() == null)) {
            this.f168267d = this.f168266c.getCurrentActivity().getResources().getConfiguration().orientation;
        }
        this.f168271h = new AppbrandApplicationImpl.AbstractC65696b() {
            /* class com.tt.miniapp.$$Lambda$q$Ji1ZBT4KxcRlO58pKvixVXUWtvs */

            @Override // com.tt.miniapp.AppbrandApplicationImpl.AbstractC65696b
            public final void onConfigurationChange(Configuration configuration) {
                C66661q.this.m260381a((C66661q) configuration);
            }
        };
        AppbrandApplicationImpl.getInst(this.f168266c).registerConfigurationChangeListener(this.f168271h);
        return this.f168268e;
    }

    /* renamed from: a */
    public void mo232386a(String str, String str2, String str3, String str4, String str5) {
        AppConfig.C65691f b;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f168266c).getAppConfig();
        if (!(appConfig == null || (b = appConfig.mo230041b()) == null)) {
            if (!TextUtils.isEmpty(str)) {
                b.f165535a = C67070z.m261388a(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                b.f165536b = C67070z.m261388a(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                b.f165539e = C67070z.m261388a(str3);
            }
            if (TextUtils.equals(str4, "black") || TextUtils.equals(str4, "white")) {
                b.f165537c = str4;
            }
            if (!TextUtils.isEmpty(str5)) {
                b.f165538d = C67070z.m261388a(str5);
            }
        }
        this.f168270g = C66675b.m260420a(this.f168266c);
        String e = mo232396e();
        if (!TextUtils.isEmpty(e)) {
            for (C66665a aVar : this.f168269f) {
                aVar.mo232405a(this.f168270g);
                if (TextUtils.equals(e, aVar.f168284d)) {
                    aVar.mo232413f();
                } else {
                    aVar.mo232414g();
                }
            }
        }
        mo232388b();
    }
}
