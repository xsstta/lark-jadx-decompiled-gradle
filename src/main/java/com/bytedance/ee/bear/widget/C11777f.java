package com.bytedance.ee.bear.widget;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.at.AbstractC4226a;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.widget.AtFinderView;
import com.bytedance.ee.bear.widgets.MaxHeightLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.widget.f */
public class C11777f extends AbstractC4226a implements AbstractC10549e {

    /* renamed from: d */
    public View f31664d;

    /* renamed from: e */
    private final int f31665e;

    /* renamed from: f */
    private MaxHeightLayout f31666f;

    /* renamed from: g */
    private Activity f31667g;

    /* renamed from: h */
    private View f31668h;

    /* renamed from: i */
    private PopupWindow f31669i;

    /* renamed from: j */
    private AbstractC10550f f31670j;

    /* renamed from: k */
    private int f31671k;

    /* renamed from: l */
    private int f31672l;

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: b */
    public boolean mo16642b() {
        return this.f31669i.isShowing();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: d */
    public void mo16644d() {
        m48837c(this.f31670j.mo39934h());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m48838g() {
        C13479a.m54772d("AtWindowPopWindowImp", "AtWindowPopupImp dismiss");
        mo16645e();
        if (this.f12740a != null) {
            this.f12740a.mo16651a(false);
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: e */
    public void mo16645e() {
        this.f31670j.mo39928b(this);
        PopupWindow popupWindow = this.f31669i;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f31669i.dismiss();
        }
        this.f12741b.mo16790c();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: f */
    public void mo16646f() {
        if (this.f12742c != null) {
            this.f12742c.mo16799b();
        } else {
            C13479a.m54758a("AtWindowPopWindowImp", "closeFindView(): findView is null");
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: c */
    public void mo16643c() {
        if (this.f31667g == null || this.f31669i.isShowing()) {
            return;
        }
        if (this.f31667g.isFinishing()) {
            C13479a.m54775e("AtWindowPopWindowImp", "show: at fail casue activity.isFinishing");
            return;
        }
        if (this.f12740a != null) {
            this.f12740a.mo16651a(true);
        }
        this.f12741b.mo16786a(true);
        this.f31669i.showAtLocation(this.f31667g.getWindow().getDecorView(), 48, 0, this.f31671k);
        m48837c(this.f31670j.mo39934h());
        C4227b.m17589b().mo16658a((FrameLayout) this.f31664d);
        this.f31670j.mo39924a(this);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c, com.bytedance.ee.bear.at.AbstractC4226a
    /* renamed from: a */
    public void mo16627a(int i) {
        this.f31671k = i;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c, com.bytedance.ee.bear.at.AbstractC4226a
    /* renamed from: b */
    public void mo16634b(int i) {
        this.f31672l = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m48836b(View view) {
        this.f31669i.dismiss();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c, com.bytedance.ee.bear.at.AbstractC4226a
    /* renamed from: a */
    public void mo16628a(View view) {
        this.f31668h = view;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16641a(String str) {
        C13479a.m54772d("AtWindowPopWindowImp", "search: ");
        this.f12741b.mo16791c(str);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16640a(final AbstractC4230c.AbstractC4231a aVar) {
        C13479a.m54772d("AtWindowPopWindowImp", "setSelectedCallback: ");
        this.f12741b.mo16782a(new AbstractC4269d() {
            /* class com.bytedance.ee.bear.widget.C11777f.C117802 */

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16703a() {
                C13479a.m54772d("AtWindowPopWindowImp", "onClosedView: ");
                C11777f.this.mo16645e();
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16705a(String str) {
                aVar.mo16648a(str);
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: b */
            public void mo16706b(String str) {
                aVar.mo16649b(str);
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16704a(AtFinderResultList atFinderResultList) {
                C13479a.m54772d("AtWindowPopWindowImp", "onSelectData: ");
                C11777f.this.f12741b.mo16790c();
                List<AtObject> result_list = atFinderResultList.getData().getResult_list();
                if (result_list.size() > 0) {
                    AtObject atObject = result_list.get(0);
                    String content = atObject.getContent();
                    aVar.mo16647a(new C4517a.C4518a().mo17391a(0).mo17395b(content.length()).mo17398c(atObject.getType()).mo17392a(atObject.getToken()).mo17396b(atObject.getUrl()).mo17399c(content).mo17402d(atObject.getName()).mo17404e(atObject.getEn_name()).mo17405f(atObject.getCn_name()).mo17401d(atObject.getSequenceNum()).mo17403e(atObject.getIcon_type()).mo17407h(atObject.getIcon_key()).mo17406g(atObject.getIcon_fsunit()).mo17397b(atObject.isNot_notify()).mo17400c(atObject.isExternal()).mo17409j(atObject.getUnion_id()).mo17410k(atObject.getDepartment()).mo17394a(), C11777f.this.f12741b.mo16792d());
                }
            }
        });
    }

    /* renamed from: c */
    private void m48837c(int i) {
        Rect rect = new Rect();
        this.f31667g.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int a = m48835a(rect, i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31664d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        this.f31666f.setMaxHeight(a);
        layoutParams.height = a;
        this.f31664d.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private int m48835a(Rect rect, int i) {
        int i2;
        int i3;
        int i4 = this.f31665e;
        if (C13749l.m55763g(this.f31667g)) {
            i4 = 0;
        }
        int i5 = this.f31672l;
        if (i5 == 0 && this.f31668h != null) {
            i2 = rect.height() - this.f31671k;
            i3 = this.f31668h.getHeight();
        } else if (i5 != 0) {
            i2 = rect.height() - this.f31671k;
            i3 = this.f31672l;
        } else {
            i2 = rect.height();
            i3 = this.f31671k;
        }
        return ((i2 - i3) + i4) - i;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        if (this.f31669i.isShowing()) {
            m48837c(i);
        }
    }

    public C11777f(FragmentActivity fragmentActivity, View view, MaxHeightLayout maxHeightLayout, final AtFinderView atFinderView, C4233d dVar) {
        this.f31667g = fragmentActivity;
        this.f31664d = view;
        this.f31666f = maxHeightLayout;
        this.f12742c = atFinderView;
        this.f31670j = AbstractC10550f.AbstractC10551a.m43717b(fragmentActivity);
        C4520c cVar = new C4520c(dVar.f12754c, dVar.f12753b, dVar.f12755d, dVar.f12756e, "");
        cVar.mo17413a(dVar.f12760i);
        mo16630a(dVar);
        this.f12741b = this.f12742c.mo45016a(fragmentActivity, mo16626a(), cVar);
        PopupWindow popupWindow = new PopupWindow(this.f31667g);
        this.f31669i = popupWindow;
        popupWindow.setWidth(-1);
        this.f31669i.setHeight(-2);
        this.f31669i.setBackgroundDrawable(new ColorDrawable(fragmentActivity.getResources().getColor(R.color.space_kit_trans)));
        this.f31669i.setFocusable(false);
        this.f31669i.setOutsideTouchable(false);
        this.f31669i.setClippingEnabled(false);
        this.f31669i.setContentView(this.f31664d);
        this.f31669i.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.bytedance.ee.bear.widget.$$Lambda$f$WrVw8g1bHxke4Pkaj8F1W4cDu3Q */

            public final void onDismiss() {
                C11777f.this.m48838g();
            }
        });
        this.f31665e = C13746i.m55722a(fragmentActivity.getApplicationContext());
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.widget.$$Lambda$f$yK_Yo8QQluyQwctIPjTRNaAe0 */

            public final void onClick(View view) {
                C11777f.this.m48836b((C11777f) view);
            }
        });
        this.f12742c.setContentHeightChangeCallback(new AtFinderView.AbstractC11761b() {
            /* class com.bytedance.ee.bear.widget.C11777f.C117781 */

            @Override // com.bytedance.ee.bear.widget.AtFinderView.AbstractC11761b
            public void onHeightChange() {
                final ViewGroup.LayoutParams layoutParams = C11777f.this.f31664d.getLayoutParams();
                atFinderView.post(new Runnable() {
                    /* class com.bytedance.ee.bear.widget.C11777f.C117781.RunnableC117791 */

                    public void run() {
                        if (layoutParams != null && C11777f.this.f12740a != null) {
                            C11777f.this.f12740a.mo16650a(layoutParams.height, atFinderView.getHeight());
                        }
                    }
                });
            }
        });
    }
}
