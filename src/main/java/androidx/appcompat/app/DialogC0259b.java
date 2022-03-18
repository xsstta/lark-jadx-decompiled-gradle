package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0297b;
import androidx.core.view.KeyEventDispatcher;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.app.b */
public class DialogC0259b extends Dialog implements AppCompatCallback {
    private AppCompatDelegate mDelegate;
    private final KeyEventDispatcher.Component mKeyDispatcher;

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(AbstractC0297b bVar) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(AbstractC0297b bVar) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public AbstractC0297b onWindowStartingSupportActionMode(AbstractC0297b.AbstractC0298a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo822f();
    }

    public void dismiss() {
        super.dismiss();
        getDelegate().mo823g();
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.m726a(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo801a();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo819d();
    }

    public DialogC0259b(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        getDelegate().mo817c(i);
    }

    /* access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m4006a(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo813b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo807a(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo810a(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo820d(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getDelegate().mo825i();
        super.onCreate(bundle);
        getDelegate().mo806a(bundle);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo810a(getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo815b(view, layoutParams);
    }

    public DialogC0259b(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new KeyEventDispatcher.Component() {
            /* class androidx.appcompat.app.DialogC0259b.C02601 */

            @Override // androidx.core.view.KeyEventDispatcher.Component
            public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC0259b.this.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        delegate.mo803a(getThemeResId(context, i));
        delegate.mo806a((Bundle) null);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo808a(view, layoutParams);
    }

    protected DialogC0259b(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new KeyEventDispatcher.Component() {
            /* class androidx.appcompat.app.DialogC0259b.C02601 */

            @Override // androidx.core.view.KeyEventDispatcher.Component
            public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC0259b.this.superDispatchKeyEvent(keyEvent);
            }
        };
    }
}
