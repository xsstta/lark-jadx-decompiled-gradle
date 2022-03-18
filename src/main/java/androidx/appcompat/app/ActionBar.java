package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0297b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface AbstractC0217a {
        /* renamed from: a */
        void mo713a(boolean z);
    }

    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class AbstractC0218b {
        /* renamed from: a */
        public abstract Drawable mo714a();

        /* renamed from: b */
        public abstract CharSequence mo715b();

        /* renamed from: c */
        public abstract View mo716c();

        /* renamed from: d */
        public abstract void mo717d();

        /* renamed from: e */
        public abstract CharSequence mo718e();
    }

    /* renamed from: a */
    public abstract int mo692a();

    /* renamed from: a */
    public AbstractC0297b mo693a(AbstractC0297b.AbstractC0298a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo695a(int i) {
    }

    /* renamed from: a */
    public void mo696a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo697a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo698a(boolean z);

    /* renamed from: a */
    public boolean mo699a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo700a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo701b() {
        return null;
    }

    /* renamed from: b */
    public void mo702b(CharSequence charSequence) {
    }

    /* renamed from: b */
    public void mo703b(boolean z) {
    }

    /* renamed from: c */
    public boolean mo705c() {
        return false;
    }

    /* renamed from: d */
    public void mo706d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo707d() {
        return false;
    }

    /* renamed from: e */
    public void mo708e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo709e() {
        return false;
    }

    /* renamed from: f */
    public void mo710f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo711f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo712g() {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f476a;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f476a = layoutParams.f476a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f476a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931});
            this.f476a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo694a(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: c */
    public void mo704c(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }
}
