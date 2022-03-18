package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.b */
public class C0435b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1594a;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C0435b(ActionBarContainer actionBarContainer) {
        this.f1594a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f1594a.f1176d) {
            if (this.f1594a.f1173a != null) {
                this.f1594a.f1173a.draw(canvas);
            }
            if (this.f1594a.f1174b != null && this.f1594a.f1177e) {
                this.f1594a.f1174b.draw(canvas);
            }
        } else if (this.f1594a.f1175c != null) {
            this.f1594a.f1175c.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f1594a.f1176d) {
            if (this.f1594a.f1175c != null) {
                this.f1594a.f1175c.getOutline(outline);
            }
        } else if (this.f1594a.f1173a != null) {
            this.f1594a.f1173a.getOutline(outline);
        }
    }
}
