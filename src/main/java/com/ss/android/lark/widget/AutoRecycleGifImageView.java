package com.ss.android.lark.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import java.io.File;
import java.io.IOException;
import pl.droidsonroids.gif.C70149c;
import pl.droidsonroids.gif.GifImageView;

public class AutoRecycleGifImageView extends GifImageView {

    /* renamed from: a */
    private static boolean f143330a = C37030f.m146093a().mo103027a("lark_gifimageview_glide_load");

    /* renamed from: b */
    private C70149c f143331b;

    /* renamed from: c */
    private File f143332c;

    /* renamed from: d */
    private int f143333d;

    /* renamed from: e */
    private int f143334e;

    /* renamed from: f */
    private int f143335f;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m226058a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C70149c cVar = this.f143331b;
        if (cVar != null && !cVar.mo247273b()) {
            this.f143331b.mo247270a();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m226058a() {
        int i;
        if (this.f143332c != null) {
            try {
                C70149c cVar = new C70149c(this.f143332c);
                this.f143331b = cVar;
                setImageDrawable(cVar);
            } catch (IOException e) {
                Log.m165389i("AutoRecycleGifImageView", "init called. occur a exception：" + e);
                if (f143330a) {
                    Log.m165389i("AutoRecycleGifImageView", "glide load enable.");
                    ImageLoader.with(getContext()).load(this.f143332c).override(this.f143333d, this.f143334e).error(this.f143335f).into(this);
                    return;
                }
                Bitmap a = C57820d.m224433a(this.f143332c.getPath(), this.f143333d * this.f143334e);
                if (a != null || (i = this.f143335f) == -1) {
                    setImageDrawable(new BitmapDrawable(a));
                } else {
                    setImageResource(i);
                }
            }
        }
    }

    public AutoRecycleGifImageView(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Exception e) {
            Log.m165387e("GifImageView draw failed", (Throwable) e, true);
        }
    }

    public AutoRecycleGifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoRecycleGifImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo197415a(File file, int i, int i2, int i3) {
        this.f143332c = file;
        this.f143333d = i;
        this.f143334e = i2;
        this.f143335f = i3;
        m226058a();
    }
}
