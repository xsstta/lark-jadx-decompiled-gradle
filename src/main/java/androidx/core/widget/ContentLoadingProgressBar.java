package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    long f3485a;

    /* renamed from: b */
    boolean f3486b;

    /* renamed from: c */
    boolean f3487c;

    /* renamed from: d */
    boolean f3488d;

    /* renamed from: e */
    private final Runnable f3489e;

    /* renamed from: f */
    private final Runnable f3490f;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4444a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4444a();
    }

    /* renamed from: a */
    private void m4444a() {
        removeCallbacks(this.f3489e);
        removeCallbacks(this.f3490f);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3485a = -1;
        this.f3489e = new Runnable() {
            /* class androidx.core.widget.ContentLoadingProgressBar.RunnableC09301 */

            public void run() {
                ContentLoadingProgressBar.this.f3486b = false;
                ContentLoadingProgressBar.this.f3485a = -1;
                ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.f3490f = new Runnable() {
            /* class androidx.core.widget.ContentLoadingProgressBar.RunnableC09312 */

            public void run() {
                ContentLoadingProgressBar.this.f3487c = false;
                if (!ContentLoadingProgressBar.this.f3488d) {
                    ContentLoadingProgressBar.this.f3485a = System.currentTimeMillis();
                    ContentLoadingProgressBar.this.setVisibility(0);
                }
            }
        };
    }
}
