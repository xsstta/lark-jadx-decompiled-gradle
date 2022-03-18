package com.larksuite.component.webview.container.impl;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.larksuite.component.webview.container.impl.e */
public class C25861e implements IActionTitlebar {

    /* renamed from: a */
    CommonTitleBar f63978a;

    /* renamed from: b */
    WebTitleBar f63979b;

    /* renamed from: b */
    private boolean m93568b() {
        if (this.f63978a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void removeAllActions() {
        if (m93568b()) {
            this.f63978a.removeAllActions();
        } else {
            this.f63979b.removeAllActions();
        }
    }

    /* renamed from: a */
    public boolean mo91964a() {
        if (m93568b()) {
            if (this.f63978a.getVisibility() == 0) {
                return true;
            }
            return false;
        } else if (this.f63979b.getVisibility() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public C25861e(WebTitleBar webTitleBar) {
        this.f63979b = webTitleBar;
        webTitleBar.setVisibility(0);
    }

    /* renamed from: a */
    public void mo91957a(float f) {
        if (!m93568b()) {
            this.f63979b.setRate(f);
        }
    }

    /* renamed from: b */
    public void mo91965b(int i) {
        if (m93568b()) {
            this.f63978a.setMainTitleColor(i);
        }
    }

    /* renamed from: c */
    public void mo91971c(boolean z) {
        if (m93568b()) {
            this.f63978a.setLeftVisible(z);
        }
    }

    /* renamed from: d */
    public void mo91973d(boolean z) {
        if (m93568b()) {
            this.f63978a.setRightVisible(z);
        }
    }

    /* renamed from: e */
    public void mo91974e(int i) {
        if (m93568b()) {
            this.f63978a.updateTitleBarWidth(i);
        }
    }

    public C25861e(CommonTitleBar commonTitleBar) {
        this.f63978a = commonTitleBar;
        commonTitleBar.setVisibility(0);
    }

    /* renamed from: a */
    public void mo91958a(int i) {
        if (m93568b()) {
            this.f63978a.setBackgroundColor(i);
        } else {
            this.f63979b.setBackgroundColor(i);
        }
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public View addAction(IActionTitlebar.Action action) {
        if (m93568b()) {
            return this.f63978a.addAction(action);
        }
        return this.f63979b.addAction(action);
    }

    /* renamed from: b */
    public void mo91966b(ColorStateList colorStateList) {
        if (m93568b()) {
            this.f63978a.setSecLeftTextColor(colorStateList);
        }
    }

    /* renamed from: c */
    public void mo91970c(int i) {
        if (m93568b()) {
            this.f63978a.setLeftImageDrawable(C57582a.m223617e(this.f63978a.getContext(), i));
        }
    }

    /* renamed from: d */
    public void mo91972d(int i) {
        if (m93568b()) {
            this.f63978a.getBackground().setAlpha(i);
        } else {
            this.f63979b.getBackground().setAlpha(i);
        }
    }

    /* renamed from: e */
    public void mo91975e(boolean z) {
        int i = 0;
        if (m93568b()) {
            CommonTitleBar commonTitleBar = this.f63978a;
            if (!z) {
                i = 8;
            }
            commonTitleBar.setVisibility(i);
            return;
        }
        WebTitleBar webTitleBar = this.f63979b;
        if (!z) {
            i = 8;
        }
        webTitleBar.setVisibility(i);
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void setTitle(CharSequence charSequence) {
        if (m93568b()) {
            this.f63978a.setTitle(charSequence);
        } else {
            this.f63979b.setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public void mo91959a(ColorStateList colorStateList) {
        if (m93568b()) {
            this.f63978a.setLeftTextColor(colorStateList);
        }
    }

    /* renamed from: b */
    public void mo91967b(View.OnClickListener onClickListener) {
        if (m93568b()) {
            this.f63978a.setSecLeftClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public void mo91960a(Drawable drawable) {
        if (m93568b()) {
            this.f63978a.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    public void mo91968b(String str) {
        if (m93568b()) {
            this.f63978a.setSecLeftText(str);
        }
    }

    /* renamed from: a */
    public void mo91961a(View.OnClickListener onClickListener) {
        if (m93568b()) {
            this.f63978a.setLeftClickListener(onClickListener);
        }
    }

    /* renamed from: b */
    public void mo91969b(boolean z) {
        if (m93568b()) {
            this.f63978a.setSecLeftVisible(z);
        }
    }

    /* renamed from: a */
    public void mo91962a(String str) {
        if (m93568b()) {
            this.f63978a.setLeftText(str);
        }
    }

    /* renamed from: a */
    public void mo91963a(boolean z) {
        if (m93568b()) {
            this.f63978a.setDividerVisible(z);
        }
    }
}
