package com.bytedance.ee.bear.bitable.card.view.cell;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.a */
public abstract class AbstractC4565a {

    /* renamed from: a */
    protected Dialog f13457a;

    /* renamed from: b */
    public View f13458b;

    /* renamed from: c */
    public AbstractC4569b f13459c;

    /* renamed from: d */
    protected Map<String, String> f13460d = new HashMap();

    /* renamed from: e */
    public int f13461e;

    /* renamed from: f */
    private Context f13462f;

    /* renamed from: g */
    private CellEditDragView f13463g;

    /* renamed from: h */
    private AbstractC4568a f13464h;

    /* renamed from: i */
    private FrameLayout.LayoutParams f13465i;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.a$a */
    public interface AbstractC4568a {
        void onDismiss();
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.a$b */
    public interface AbstractC4569b<V> {
        /* renamed from: a */
        void mo17986a(V v);

        /* renamed from: a */
        void mo17987a(String str, Map<String, String> map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo17972a(Context context);

    /* renamed from: e */
    public Context mo17981e() {
        return this.f13462f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17979c() {
        AbstractC4568a aVar = this.f13464h;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    /* renamed from: i */
    private void mo18174i() {
        if (this.f13457a == null) {
            mo18173h();
        }
    }

    /* renamed from: d */
    public boolean mo17980d() {
        Dialog dialog = this.f13457a;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo17982f() {
        C10548d.m43697a(mo17972a(this.f13462f));
    }

    /* renamed from: a */
    public void mo17973a() {
        mo18174i();
        Dialog dialog = this.f13457a;
        if (dialog == null) {
            C13479a.m54758a("BaseCellEditPanel", "dialog has not been initialized");
        } else {
            dialog.show();
        }
    }

    /* renamed from: b */
    public void mo17978b() {
        CellEditDragView cellEditDragView = this.f13463g;
        if (!(cellEditDragView == null || cellEditDragView.getHeight() == 0)) {
            this.f13463g.mo17961a(BitmapDescriptorFactory.HUE_RED, false);
        }
        Dialog dialog = this.f13457a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: g */
    public int mo17983g() {
        View a = mo17972a(this.f13462f);
        int i = 0;
        if (!(a instanceof ViewGroup)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) a;
            if (i >= viewGroup.getChildCount()) {
                return i2;
            }
            i2 += viewGroup.getChildAt(i).getHeight();
            i++;
        }
    }

    /* renamed from: h */
    private void mo18173h() {
        if (mo17972a(this.f13462f) == null) {
            C13479a.m54758a("BaseCellEditPanel", "content view can not be null");
            return;
        }
        this.f13457a = new Dialog(this.f13462f, R.style.TransparentBackgroundDialogStyle);
        FrameLayout frameLayout = new FrameLayout(this.f13462f);
        if (this.f13465i == null) {
            this.f13465i = new FrameLayout.LayoutParams(-1, -2);
        }
        this.f13465i.gravity = 80;
        frameLayout.addView(mo17972a(this.f13462f), this.f13465i);
        this.f13457a.setContentView(frameLayout);
        Window window = this.f13457a.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.y = C13655e.m55412a(this.f13462f);
            attributes.gravity = 80;
            attributes.dimAmount = BitmapDescriptorFactory.HUE_RED;
            attributes.windowAnimations = R.style.ActionSheetDialogAnimation;
            window.setAttributes(attributes);
            if (mo17972a(this.f13462f) instanceof FrameLayout) {
                final FrameLayout frameLayout2 = (FrameLayout) mo17972a(this.f13462f);
                int i = 0;
                while (true) {
                    if (i >= frameLayout2.getChildCount()) {
                        break;
                    }
                    View childAt = frameLayout2.getChildAt(i);
                    if (childAt instanceof CellEditDragView) {
                        this.f13463g = (CellEditDragView) childAt;
                        break;
                    }
                    i++;
                }
                CellEditDragView cellEditDragView = this.f13463g;
                if (cellEditDragView != null) {
                    cellEditDragView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        /* class com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.View$OnLayoutChangeListenerC45661 */

                        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = i4 - i2;
                            if (frameLayout2.getHeight() != i9) {
                                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                layoutParams.height = i9;
                                frameLayout2.setLayoutParams(layoutParams);
                            }
                        }
                    });
                }
                mo17972a(this.f13462f).post(new Runnable(frameLayout2) {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$a$QvKEucDdcXbxj3iPECMxFLWPhfk */
                    public final /* synthetic */ FrameLayout f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        AbstractC4565a.lambda$QvKEucDdcXbxj3iPECMxFLWPhfk(this.f$0);
                    }
                });
                window.findViewById(16908290).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.C45672 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        AbstractC4565a.this.mo17978b();
                    }
                });
            } else {
                throw new RuntimeException("Content view type must be FrameLayout!");
            }
        }
        this.f13457a.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.$$Lambda$a$U5Awb5W_ryQJakkBttsUdPnZrSU */

            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC4565a.lambda$U5Awb5W_ryQJakkBttsUdPnZrSU(AbstractC4565a.this, dialogInterface);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18967a(DialogInterface dialogInterface) {
        mo17979c();
    }

    public AbstractC4565a(Context context) {
        this.f13462f = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18968a(FrameLayout frameLayout) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a(frameLayout);
    }

    /* renamed from: a */
    public void mo17974a(int i) {
        this.f13461e = i;
    }

    /* renamed from: a */
    public void mo17975a(FrameLayout.LayoutParams layoutParams) {
        this.f13465i = layoutParams;
    }

    /* renamed from: a */
    public void mo17976a(AbstractC4568a aVar) {
        this.f13464h = aVar;
    }

    /* renamed from: a */
    public void mo17977a(AbstractC4569b bVar) {
        this.f13459c = bVar;
    }
}
