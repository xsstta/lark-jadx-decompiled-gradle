package com.bytedance.lark.webview.container.impl.menu;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.webview.container.dto.C25835f;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* renamed from: com.bytedance.lark.webview.container.impl.menu.d */
public class C19885d {

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.d$a */
    public interface AbstractC19888a {
        /* renamed from: a */
        void mo67391a();
    }

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.d$c */
    public interface AbstractC19890c {
        void onMenuItemClick();
    }

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.d$b */
    public static class C19889b {

        /* renamed from: a */
        public int f48582a;

        /* renamed from: b */
        public String f48583b;

        /* renamed from: c */
        public AbstractC19890c f48584c;

        /* renamed from: d */
        public int f48585d = -1;

        /* renamed from: e */
        public int f48586e = -1;

        /* renamed from: f */
        public int f48587f = -1;

        /* renamed from: g */
        public int f48588g = -1;

        /* renamed from: h */
        public int f48589h = -1;

        /* renamed from: i */
        public boolean f48590i = true;

        /* renamed from: j */
        public boolean f48591j = true;

        /* renamed from: k */
        public boolean f48592k;

        /* renamed from: l */
        public int f48593l = -1;

        /* renamed from: m */
        public int f48594m = -1;

        /* renamed from: n */
        private boolean f48595n;

        /* renamed from: a */
        public boolean mo67394a() {
            return this.f48595n;
        }

        /* renamed from: a */
        public void mo67392a(int i) {
            this.f48587f = i;
        }

        /* renamed from: b */
        public C19889b mo67395b(int i) {
            this.f48589h = i;
            return this;
        }

        /* renamed from: a */
        public void mo67393a(boolean z) {
            this.f48595n = z;
        }

        /* renamed from: b */
        public C19889b mo67396b(boolean z) {
            this.f48592k = z;
            return this;
        }

        public C19889b(String str, AbstractC19890c cVar) {
            this.f48583b = str;
            this.f48584c = cVar;
        }

        public C19889b(int i, String str, AbstractC19890c cVar) {
            this.f48582a = i;
            this.f48583b = str;
            this.f48584c = cVar;
        }
    }

    /* renamed from: a */
    public static int m72572a(String str, float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        return (int) paint.measureText(str);
    }

    /* renamed from: a */
    public static void m72576a(Context context, Dialog dialog) {
        if (!(context instanceof Activity) || C57582a.m223607a((Activity) context)) {
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = context.getResources().getDisplayMetrics().widthPixels;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            if (DesktopUtil.m144301a(context)) {
                window.setWindowAnimations(R.style.AnimFadeInFadeOut);
            } else {
                window.setWindowAnimations(R.style.AnimBottom);
            }
            dialog.show();
        }
    }

    /* renamed from: a */
    public static void m72577a(Context context, List<C19889b> list, C25835f fVar) {
        m72578b(context, list, fVar, null);
    }

    /* renamed from: a */
    private static MagicIndicator m72575a(Context context, View view, ViewPager viewPager) {
        int i;
        C19877a aVar = new C19877a(context);
        if (viewPager.getAdapter() == null) {
            i = 0;
        } else {
            i = viewPager.getAdapter().getCount();
        }
        aVar.setCircleCount(i);
        final MagicIndicator magicIndicator = (MagicIndicator) view.findViewById(R.id.web_menu_indicator);
        magicIndicator.setNavigator(aVar);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.bytedance.lark.webview.container.impl.menu.C19885d.C198872 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                magicIndicator.mo243175b(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                magicIndicator.mo243173a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                magicIndicator.mo243174a(i, f, i2);
            }
        });
        return magicIndicator;
    }

    /* renamed from: a */
    private static String m72574a(Context context, TextView textView, String str) {
        int screenWidth = (DeviceUtils.getScreenWidth(context) - (UIUtils.dp2px(context, 24.0f) * 2)) - m72572a(UIHelper.mustacheFormat((int) R.string.OpenPlatform_AppActions_DisplayDomainDesc, "root_domain", ""), UIUtils.sp2px(context, 12.0f));
        int a = (screenWidth - m72572a("...", UIUtils.sp2px(context, 12.0f))) / m72572a(AbstractC60044a.f149675a, UIUtils.sp2px(context, 12.0f));
        int length = str.length() - a;
        if (length <= 0) {
            return str;
        }
        int i = 3;
        if (length <= 3) {
            i = 1;
        }
        return str.substring(0, a + i) + "...";
    }

    /* renamed from: b */
    public static void m72578b(Context context, List<C19889b> list, C25835f fVar, AbstractC19888a aVar) {
        m72576a(context, m72573a(context, list, fVar, aVar));
    }

    /* renamed from: a */
    public static Dialog m72573a(Context context, List<C19889b> list, C25835f fVar, final AbstractC19888a aVar) {
        final BaseDialog baseDialog = new BaseDialog(context, R.style.UDDialog);
        View inflate = LayoutInflater.from(context).inflate(R.layout.web_dialog_icon_list, (ViewGroup) null);
        WebViewPager webViewPager = (WebViewPager) inflate.findViewById(R.id.web_recyclerView_icon_menu);
        TextView textView = (TextView) inflate.findViewById(R.id.web_menu_title_web);
        View findViewById = inflate.findViewById(R.id.web_menu_title_webapp);
        if (fVar != null && fVar.mo91911e() == 1) {
            textView.setText(UIHelper.mustacheFormat((int) R.string.OpenPlatform_AppActions_DisplayDomainDesc, "root_domain", m72574a(context, textView, fVar.mo91910d())));
            textView.setVisibility(0);
            findViewById.setVisibility(8);
        } else if (fVar != null && fVar.mo91911e() == 2) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.web_menu_title_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.web_menu_title_text);
            if (!TextUtils.isEmpty(fVar.mo91908b())) {
                ImageLoader.with(context).asBitmap().load(fVar.mo91908b()).placeholder(R.drawable.web_menu_title_default).error(R.drawable.web_menu_title_default).into(imageView);
            } else {
                imageView.setVisibility(8);
                try {
                    ((RelativeLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = context.getResources().getDimensionPixelSize(R.dimen.web_only_title_left);
                } catch (Throwable th) {
                    Log.m165384e("WebMenuUtils", "Throwable", th);
                }
            }
            textView2.setText(fVar.mo91909c());
            textView.setVisibility(8);
            findViewById.setVisibility(0);
        }
        C19883c cVar = new C19883c(context, list, baseDialog);
        webViewPager.setAdapter(cVar);
        MagicIndicator a = m72575a(context, inflate, webViewPager);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) webViewPager.getLayoutParams();
        if (cVar.getCount() > 1) {
            a.setVisibility(0);
            layoutParams.bottomMargin = UIUtils.dp2px(context, 4.0f);
        } else {
            a.setVisibility(8);
            layoutParams.bottomMargin = UIUtils.dp2px(context, 12.0f);
        }
        inflate.findViewById(R.id.web_layout_cancel).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.lark.webview.container.impl.menu.C19885d.View$OnClickListenerC198861 */

            public void onClick(View view) {
                AbstractC19888a aVar = aVar;
                if (aVar != null) {
                    aVar.mo67391a();
                }
                if (baseDialog.isShowing()) {
                    baseDialog.dismiss();
                }
            }
        });
        baseDialog.setContentView(inflate);
        baseDialog.setCanceledOnTouchOutside(true);
        return baseDialog;
    }
}
