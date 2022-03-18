package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13235c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.g */
public class DialogC13250g extends Dialog {

    /* renamed from: a */
    private C13243f f35097a;

    /* renamed from: b */
    private IAppContext f35098b;

    /* renamed from: a */
    public void mo49458a() {
        this.f35097a.getTool().mo49340b(0);
        this.f35097a.mo49443e();
    }

    /* renamed from: b */
    private void m53998b() {
        this.f35097a.setFocusable(true);
        this.f35097a.requestFocus();
        this.f35097a.setFocusableInTouchMode(true);
        this.f35097a.requestFocusFromTouch();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m53995a(DialogInterface dialogInterface) {
        this.f35097a.mo49444f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m53996a(getContext(), motionEvent)) {
            this.f35097a.mo49449k();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m53999b(RichTextData richTextData) {
        this.f35097a = new C13243f(this.f35098b.getCurrentActivity(), richTextData, this.f35098b);
        getWindow().setGravity(80);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setSoftInputMode(21);
        getWindow().setContentView(this.f35097a);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: a */
    public void mo49460a(RichTextData richTextData) {
        this.f35097a.mo49438a(richTextData);
    }

    /* renamed from: a */
    public void mo49461a(C13243f.AbstractC13249a aVar) {
        IAppContext iAppContext = this.f35098b;
        if (iAppContext != null && iAppContext.getCurrentActivity() != null && !this.f35098b.getCurrentActivity().isFinishing()) {
            this.f35097a.setListener(aVar);
            getWindow().setContentView(this.f35097a);
            m53998b();
            setOnShowListener(new DialogInterface.OnShowListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.$$Lambda$g$AOTHmfxwjJ1_9I7Tmbf8G2t7cA4 */

                public final void onShow(DialogInterface dialogInterface) {
                    DialogC13250g.this.m53995a((DialogC13250g) dialogInterface);
                }
            });
            setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.$$Lambda$g$CD3g0kyvXBnEHB16_0AaPnfXug */

                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return DialogC13250g.this.m53997a(dialogInterface, i, keyEvent);
                }
            });
            show();
        }
    }

    /* renamed from: a */
    public void mo49462a(List<C13235c> list) {
        this.f35097a.mo49440a(list);
        this.f35097a.mo49443e();
    }

    public DialogC13250g(IAppContext iAppContext, RichTextData richTextData) {
        super(iAppContext.getCurrentActivity());
        this.f35098b = iAppContext;
        m53999b(richTextData);
    }

    /* renamed from: a */
    private boolean m53996a(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        if (x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo49459a(Bitmap bitmap, String str) {
        this.f35097a.mo49436a(bitmap, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m53997a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
            return false;
        }
        this.f35097a.mo49449k();
        return false;
    }
}
