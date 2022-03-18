package com.ss.android.appcenter.business.tab.business.view.itemmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27918c;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28190k;
import com.ss.android.appcenter.common.util.C28209p;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.b */
public class C27913b extends PopupWindow implements ItemMenuAdapter.AbstractC27932a {

    /* renamed from: a */
    public FrameLayout f69785a;

    /* renamed from: b */
    private Activity f69786b;

    /* renamed from: c */
    private C27918c f69787c;

    /* renamed from: d */
    private boolean f69788d;

    /* renamed from: e */
    private boolean f69789e;

    /* renamed from: f */
    private boolean f69790f;

    /* renamed from: g */
    private String f69791g;

    /* renamed from: h */
    private ItemInfo f69792h;

    /* renamed from: i */
    private boolean f69793i;

    /* renamed from: j */
    private boolean f69794j;

    /* renamed from: k */
    private boolean f69795k;

    /* renamed from: l */
    private ItemMenuAdapter.AbstractC27933b f69796l;

    /* renamed from: m */
    private AbstractC27915a f69797m;

    /* renamed from: n */
    private int f69798n;

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.b$a */
    public interface AbstractC27915a {
        void onDismiss();
    }

    /* renamed from: a */
    public void mo99512a() {
        this.f69793i = true;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27932a
    /* renamed from: c */
    public void mo99508c() {
        dismiss();
    }

    /* renamed from: a */
    public void mo99519a(int[] iArr) {
        Rect targetRect = this.f69787c.getTargetRect();
        targetRect.left -= iArr[0];
        targetRect.right -= iArr[0];
        targetRect.top -= iArr[1];
        targetRect.bottom -= iArr[1];
        boolean a = m101887a(this.f69787c.getTargetView());
        C28184h.m103250d("ItemMenu", "targetRect:" + targetRect + " showInBottom:" + a);
        this.f69798n = m101894f();
        if (this.f69793i) {
            m101886a(targetRect, a);
        } else if (this.f69794j) {
            m101889b(targetRect, a);
        }
    }

    /* renamed from: a */
    public void mo99517a(String str) {
        this.f69791g = str;
    }

    /* renamed from: a */
    public void mo99518a(boolean z) {
        this.f69788d = z;
    }

    /* renamed from: b */
    public void mo99520b() {
        this.f69794j = true;
    }

    public void dismiss() {
        super.dismiss();
        m101896h();
        AbstractC27915a aVar = this.f69797m;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    /* renamed from: h */
    private void m101896h() {
        ((ViewGroup) this.f69786b.getWindow().getDecorView()).removeView(this.f69787c);
    }

    /* renamed from: e */
    private RecyclerView m101893e() {
        RecyclerView recyclerView = new RecyclerView(this.f69786b);
        recyclerView.setAdapter(ItemMenuAdapter.m101961a(this, this.f69788d, this.f69789e, this.f69793i, this.f69790f, this.f69795k, this.f69791g, this.f69792h, this.f69796l));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f69786b));
        recyclerView.setBackgroundResource(R.drawable.workplace_item_menu_shape);
        int a = C28209p.m103293a((Context) this.f69786b, 8.0f);
        recyclerView.setPadding(1, a, 1, a);
        recyclerView.setOverScrollMode(2);
        return recyclerView;
    }

    /* renamed from: g */
    private void m101895g() {
        ViewGroup viewGroup = (ViewGroup) this.f69786b.getWindow().getDecorView();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        this.f69787c.mo99532a(iArr[0], iArr[1]);
        viewGroup.addView(this.f69787c, -1, -1);
    }

    /* renamed from: d */
    private void m101892d() {
        FrameLayout frameLayout = new FrameLayout(this.f69786b);
        this.f69785a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f69785a.setBackgroundResource(R.color.transparent);
        this.f69785a.setClipChildren(false);
        this.f69785a.setClipToPadding(false);
        this.f69785a.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.$$Lambda$b$ZeLnpo9XFME5Aa_pEvvzUVbaWAo */

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C27913b.this.m101888a(view, i, keyEvent);
            }
        });
        this.f69785a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.$$Lambda$b$nxBxlCN_d85xAltac3ngrMuXOA */

            public final void onClick(View view) {
                C27913b.this.m101890b((C27913b) view);
            }
        });
        this.f69785a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b.ViewTreeObserver$OnGlobalLayoutListenerC279141 */

            public void onGlobalLayout() {
                C27913b.this.f69785a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                C27913b.this.f69785a.getLocationOnScreen(iArr);
                C28184h.m103250d("ItemMenuPopupWindow", "windowLocation x:" + iArr[0] + " y:" + iArr[1]);
                C27913b.this.mo99519a(iArr);
            }
        });
        setContentView(this.f69785a);
    }

    /* renamed from: f */
    private int m101894f() {
        Paint paint = new Paint();
        paint.setTextSize((float) C28209p.m103293a((Context) this.f69786b, 16.0f));
        float measureText = paint.measureText(this.f69786b.getString(R.string.OpenPlatform_AppCenter_SetFrqBttn));
        float measureText2 = paint.measureText(this.f69786b.getString(R.string.OpenPlatform_AppCenter_RemoveFrqBttn));
        float measureText3 = paint.measureText(this.f69786b.getString(R.string.OpenPlatform_AppCenter_SortAppBttn));
        float measureText4 = paint.measureText(this.f69786b.getString(R.string.OpenPlatform_Share_WorkplaceAppShareBttn));
        if (this.f69788d || this.f69789e) {
            measureText = measureText2;
        }
        return Math.min(C28209p.m103293a((Context) this.f69786b, 230.0f), Math.max(C28209p.m103293a((Context) this.f69786b, 140.0f), (int) (((float) C28209p.m103293a((Context) this.f69786b, 64.0f)) + Math.max(Math.max(measureText, measureText3), measureText4))));
    }

    /* renamed from: d */
    public void mo99523d(boolean z) {
        this.f69795k = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101890b(View view) {
        dismiss();
    }

    /* renamed from: a */
    public void mo99513a(ItemInfo itemInfo) {
        this.f69792h = itemInfo;
    }

    /* renamed from: c */
    public void mo99522c(boolean z) {
        this.f69790f = z;
    }

    /* renamed from: a */
    private int m101884a(int i) {
        return (int) this.f69786b.getResources().getDimension(i);
    }

    /* renamed from: a */
    private boolean m101887a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] < C28190k.m103259a(this.f69786b) / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo99521b(boolean z) {
        this.f69789e = z;
    }

    public C27913b(Activity activity) {
        super(activity);
        this.f69786b = activity;
        m101892d();
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.transparent)));
        setSoftInputMode(32);
        setWidth(-1);
        setHeight(-1);
    }

    /* renamed from: a */
    public void mo99514a(AbstractC27915a aVar) {
        this.f69797m = aVar;
    }

    /* renamed from: a */
    public void mo99515a(C27918c cVar) {
        this.f69787c = cVar;
        m101895g();
        showAtLocation(this.f69786b.getWindow().getDecorView(), 8388611, 0, 0);
    }

    /* renamed from: a */
    public void mo99516a(ItemMenuAdapter.AbstractC27933b bVar) {
        this.f69796l = bVar;
    }

    /* renamed from: b */
    private void m101889b(Rect rect, boolean z) {
        m101891c(rect, z);
    }

    /* renamed from: a */
    private void m101886a(Rect rect, boolean z) {
        RecyclerView e = m101893e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f69798n + C28209p.m103293a((Context) this.f69786b, 32.0f), -2);
        layoutParams.topMargin = m101885a(rect, z, e);
        layoutParams.rightMargin = C28209p.m103293a((Context) this.f69786b, 16.0f);
        layoutParams.gravity = 5;
        UDShadowLayout uDShadowLayout = new UDShadowLayout(this.f69786b);
        uDShadowLayout.addView(e, new UDShadowLayout.LayoutParams(-1, -2));
        uDShadowLayout.setShadowRadius(new UDDimension.Dp(8));
        uDShadowLayout.mo91199a(2131887167);
        this.f69785a.addView(uDShadowLayout, layoutParams);
    }

    /* renamed from: c */
    private void m101891c(Rect rect, boolean z) {
        RecyclerView e = m101893e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (rect.left < C28190k.m103260b(this.f69786b) / 4) {
            layoutParams.gravity = 3;
            layoutParams.leftMargin = C28209p.m103293a((Context) this.f69786b, 16.0f);
        } else if (rect.left > (C28190k.m103260b(this.f69786b) * 3) / 4) {
            layoutParams.gravity = 5;
            layoutParams.rightMargin = C28209p.m103293a((Context) this.f69786b, 16.0f);
        } else {
            layoutParams.leftMargin = (rect.left + C28209p.m103293a((Context) this.f69786b, 24.0f)) - (this.f69798n / 2);
        }
        layoutParams.topMargin = m101885a(rect, z, e);
        UDShadowLayout uDShadowLayout = new UDShadowLayout(this.f69786b);
        uDShadowLayout.addView(e, new UDShadowLayout.LayoutParams(this.f69798n, -2));
        uDShadowLayout.setShadowRadius(new UDDimension.Dp(8));
        uDShadowLayout.mo91199a(2131887167);
        this.f69785a.addView(uDShadowLayout, layoutParams);
    }

    /* renamed from: a */
    private int m101885a(Rect rect, boolean z, RecyclerView recyclerView) {
        if (z) {
            return rect.bottom + C28209p.m103293a(this.f69786b, (float) BitmapDescriptorFactory.HUE_RED);
        }
        int a = m101884a(R.dimen.workplace_item_menu_height);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int a2 = C28209p.m103293a((Context) this.f69786b, 36.0f);
        return rect.top - ((((a * itemCount) + ((itemCount - 1) * 1)) + C28209p.m103293a(this.f69786b, (float) BitmapDescriptorFactory.HUE_RED)) + a2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m101888a(View view, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dismiss();
        return true;
    }
}
