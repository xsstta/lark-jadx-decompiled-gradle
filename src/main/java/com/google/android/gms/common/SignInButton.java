package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C21755l;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private int f52543a;

    /* renamed from: b */
    private int f52544b;

    /* renamed from: c */
    private View f52545c;

    /* renamed from: d */
    private View.OnClickListener f52546d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.buttonSize, R.attr.colorScheme, R.attr.scopeUris}, 0, 0);
        try {
            this.f52543a = obtainStyledAttributes.getInt(0, 0);
            this.f52544b = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            mo73168a(this.f52543a, this.f52544b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSize(int i) {
        mo73168a(i, this.f52544b);
    }

    public final void setColorScheme(int i) {
        mo73168a(this.f52543a, i);
    }

    public final void setScopes(Scope[] scopeArr) {
        mo73168a(this.f52543a, this.f52544b);
    }

    /* renamed from: a */
    public final void mo73168a(int i, int i2) {
        this.f52543a = i;
        this.f52544b = i2;
        Context context = getContext();
        View view = this.f52545c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f52545c = C21755l.m79005a(context, this.f52543a, this.f52544b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f52543a;
            int i4 = this.f52544b;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.mo73657a(context.getResources(), i3, i4);
            this.f52545c = signInButtonImpl;
        }
        addView(this.f52545c);
        this.f52545c.setEnabled(isEnabled());
        this.f52545c.setOnClickListener(this);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f52546d = onClickListener;
        View view = this.f52545c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f52545c.setEnabled(z);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f52546d;
        if (onClickListener != null && view == this.f52545c) {
            onClickListener.onClick(this);
        }
    }
}
