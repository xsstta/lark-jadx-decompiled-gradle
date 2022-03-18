package com.bytedance.ee.android.file.picker.lib.page;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.android.file.picker.lib.base.FragmentInfo;
import com.bytedance.ee.android.file.picker.lib.page.AbstractC4112f;
import com.bytedance.ee.android.file.picker.lib.page.PickerMenuView;
import com.bytedance.ee.android.file.picker.lib.statistics.FilePickerHitPoint;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

/* renamed from: com.bytedance.ee.android.file.picker.lib.page.e */
public class C4105e implements AbstractC4112f.AbstractC4114b {

    /* renamed from: a */
    public final Context f12433a;

    /* renamed from: b */
    public final List<FragmentInfo> f12434b;

    /* renamed from: c */
    MagicIndicator f12435c;

    /* renamed from: d */
    ViewPager f12436d;

    /* renamed from: e */
    CommonTitleBar f12437e;

    /* renamed from: f */
    ViewGroup f12438f;

    /* renamed from: g */
    public boolean f12439g;

    /* renamed from: h */
    public Drawable f12440h;

    /* renamed from: i */
    public Drawable f12441i;

    /* renamed from: j */
    public AbstractC4111a f12442j;

    /* renamed from: k */
    private final int f12443k;

    /* renamed from: l */
    private final String f12444l;

    /* renamed from: m */
    private long f12445m = 200;

    /* renamed from: n */
    private long f12446n;

    /* renamed from: o */
    private PickerMenuView f12447o;

    /* renamed from: p */
    private boolean f12448p;

    /* renamed from: q */
    private AbstractC4112f.AbstractC4114b.AbstractC4115a f12449q;

    /* renamed from: r */
    private FragmentManager f12450r;

    /* renamed from: s */
    private AbstractC69621a f12451s = new AbstractC69621a() {
        /* class com.bytedance.ee.android.file.picker.lib.page.C4105e.C41061 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return C4105e.this.f12434b.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(context);
            aVar.setColors(Integer.valueOf(UIHelper.f12487a.mo16123b(C4105e.this.f12433a, R.color.file_picker_lkui_blue_6)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.f12487a.mo16121a(C4105e.this.f12433a, 2.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69627a aVar = new C69627a(context);
            aVar.setTextSize(16.0f);
            aVar.setNormalColor(UIHelper.f12487a.mo16123b(C4105e.this.f12433a, R.color.file_picker_lkui_grey_6));
            aVar.setSelectedColor(UIHelper.f12487a.mo16123b(C4105e.this.f12433a, R.color.file_picker_lkui_blue_6));
            aVar.setText(C4105e.this.f12434b.get(i).mo15850b());
            aVar.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.page.C4105e.C41061.View$OnClickListenerC41071 */

                public void onClick(View view) {
                    C4105e.this.f12436d.setCurrentItem(i);
                }
            });
            return aVar;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.e$a */
    public interface AbstractC4111a {
        /* renamed from: a */
        void mo16047a();

        /* renamed from: a */
        void mo16048a(C4105e eVar);

        /* renamed from: b */
        void mo16049b();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    /* renamed from: c */
    public void mo15856c() {
        this.f12449q = null;
        this.f12442j = null;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    public void j_() {
        m17094a(this.f12443k);
    }

    /* renamed from: a */
    private void m17093a() {
        if (this.f12448p) {
            PickerMenuView gVar = new PickerMenuView(this.f12433a);
            this.f12447o = gVar;
            if (this.f12444l != null) {
                gVar.getLarkFileBtn().setText(this.f12444l);
            }
            this.f12447o.setStorageBtnListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.page.$$Lambda$e$z0y_s3VUH7HphVR5BAT0dlhZu7o */

                public final void onClick(View view) {
                    C4105e.this.m17097b((C4105e) view);
                }
            });
            this.f12447o.setMenuViewListener(new PickerMenuView.MenuViewListener() {
                /* class com.bytedance.ee.android.file.picker.lib.page.C4105e.C41093 */

                @Override // com.bytedance.ee.android.file.picker.lib.page.PickerMenuView.MenuViewListener
                /* renamed from: a */
                public void mo16059a() {
                    C4105e.this.f12439g = true;
                    C4105e.this.f12437e.getCenterText().setCompoundDrawables(null, null, C4105e.this.f12441i, null);
                }

                @Override // com.bytedance.ee.android.file.picker.lib.page.PickerMenuView.MenuViewListener
                /* renamed from: b */
                public void mo16060b() {
                    C4105e.this.f12439g = false;
                    C4105e.this.f12437e.getCenterText().setCompoundDrawables(null, null, C4105e.this.f12440h, null);
                }
            });
            this.f12438f.addView(this.f12447o);
        }
    }

    /* renamed from: a */
    public void mo15864a(AbstractC4112f.AbstractC4114b.AbstractC4115a aVar) {
        this.f12449q = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17097b(View view) {
        FilePickerHitPoint.f12299a.mo15889a();
        this.f12442j.mo16049b();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.page.AbstractC4112f.AbstractC4114b
    /* renamed from: a */
    public void mo16053a(String str) {
        LKUIToast.show(this.f12433a, str);
    }

    @Override // com.bytedance.ee.android.file.picker.lib.page.AbstractC4112f.AbstractC4114b
    /* renamed from: b */
    public void mo16054b(String str) {
        new C25639g(this.f12433a).mo89242c(str).mo89256o(R.color.text_title).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Lark_Legacy_DialogOk).mo89271d(R.color.primary_pri_500)).mo89233b().show();
    }

    /* renamed from: a */
    private void m17094a(int i) {
        this.f12442j.mo16048a(this);
        m17093a();
        m17096b(i);
        this.f12436d.setAdapter(new FragmentPagerAdapter(this.f12450r) {
            /* class com.bytedance.ee.android.file.picker.lib.page.C4105e.C41082 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return C4105e.this.f12434b.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return C4105e.this.f12434b.get(i).mo15849a();
            }
        });
        if (this.f12434b.size() > 1) {
            this.f12435c.setVisibility(0);
            C69619a aVar = new C69619a(this.f12433a);
            aVar.setAdjustMode(true);
            aVar.setAdapter(this.f12451s);
            this.f12435c.setNavigator(aVar);
            this.f12435c.setBackgroundColor(UIHelper.f12487a.mo16123b(this.f12433a, R.color.bg_body));
            C69634c.m267483a(this.f12435c, this.f12436d);
            return;
        }
        this.f12435c.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17095a(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f12446n >= this.f12445m) {
            this.f12446n = uptimeMillis;
            if (!this.f12439g) {
                this.f12447o.mo16062a();
            } else {
                this.f12447o.mo16063b();
            }
        }
    }

    /* renamed from: b */
    private void m17096b(int i) {
        this.f12437e.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.f12437e.setLeftImageDrawable(null);
        String str = this.f12444l;
        if (str != null) {
            this.f12437e.setTitle(str);
        } else {
            this.f12437e.setTitle(R.string.Lark_Message_File_defTitle);
        }
        if (this.f12448p) {
            this.f12440h = UIUtils.getDrawable(this.f12433a, R.drawable.file_picker_icon_expand_down_filled);
            this.f12441i = UIUtils.getDrawable(this.f12433a, R.drawable.file_picker_icon_expand_up_filled);
            Rect rect = new Rect(0, 0, UIUtils.dp2px(this.f12433a, 12.0f), UIUtils.dp2px(this.f12433a, 12.0f));
            this.f12440h.setBounds(rect);
            this.f12441i.setBounds(rect);
            this.f12437e.getCenterText().setCompoundDrawables(null, null, this.f12440h, null);
            this.f12437e.getCenterText().setCompoundDrawablePadding(UIUtils.dp2px(this.f12433a, 4.0f));
            this.f12437e.getCenterText().setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.page.$$Lambda$e$CuWnYpMCdJKxDpPfGM_Wsurbc8 */

                public final void onClick(View view) {
                    C4105e.this.m17095a((C4105e) view);
                }
            });
        }
        this.f12437e.setDividerVisible(false);
        this.f12437e.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.android.file.picker.lib.page.C4105e.View$OnClickListenerC41104 */

            public void onClick(View view) {
                C4105e.this.f12442j.mo16047a();
            }
        });
    }

    C4105e(Context context, FragmentManager fragmentManager, List<FragmentInfo> list, AbstractC4111a aVar, int i, String str, boolean z) {
        this.f12433a = context;
        this.f12450r = fragmentManager;
        this.f12434b = list;
        this.f12442j = aVar;
        this.f12443k = i;
        this.f12444l = str;
        this.f12448p = z;
    }
}
