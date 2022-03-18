package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import pl.droidsonroids.gif.C70155e;

public class GifImageButton extends ImageButton {

    /* renamed from: a */
    private boolean f175227a;

    public Parcelable onSaveInstanceState() {
        Drawable drawable;
        Drawable drawable2 = null;
        if (this.f175227a) {
            drawable = getDrawable();
        } else {
            drawable = null;
        }
        if (this.f175227a) {
            drawable2 = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawable, drawable2);
    }

    public GifImageButton(Context context) {
        super(context);
    }

    public void setFreezesAnimation(boolean z) {
        this.f175227a = z;
    }

    public void setBackgroundResource(int i) {
        if (!C70155e.m268950a(this, false, i)) {
            super.setBackgroundResource(i);
        }
    }

    public void setImageResource(int i) {
        if (!C70155e.m268950a(this, true, i)) {
            super.setImageResource(i);
        }
    }

    public void setImageURI(Uri uri) {
        if (!C70155e.m268949a(this, uri)) {
            super.setImageURI(uri);
        }
    }

    /* renamed from: a */
    private void m268878a(C70155e.C70156a aVar) {
        this.f175227a = aVar.f175274c;
        if (aVar.f175272a > 0) {
            super.setImageResource(aVar.f175272a);
        }
        if (aVar.f175273b > 0) {
            super.setBackgroundResource(aVar.f175273b);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        gifViewSavedState.mo247257a(getDrawable(), 0);
        gifViewSavedState.mo247257a(getBackground(), 1);
    }

    public GifImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m268878a(C70155e.m268947a(this, attributeSet, 0, 0));
    }

    public GifImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m268878a(C70155e.m268947a(this, attributeSet, i, 0));
    }
}
