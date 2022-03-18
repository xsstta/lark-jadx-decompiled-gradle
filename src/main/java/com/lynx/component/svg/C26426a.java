package com.lynx.component.svg;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;
import com.lynx.component.svg.parser.C26476d;
import com.lynx.component.svg.parser.SVG;

/* renamed from: com.lynx.component.svg.a */
public class C26426a extends PictureDrawable {

    /* renamed from: a */
    private SVG f65273a;

    /* renamed from: b */
    private C26476d f65274b;

    /* renamed from: c */
    private C26428c f65275c;

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        SVG svg = this.f65273a;
        if (svg != null) {
            svg.mo93819a(canvas, this.f65274b, this.f65275c);
        } else if (getPicture() != null) {
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.drawPicture(getPicture());
        }
        canvas.restore();
    }

    public C26426a(SVG svg, C26476d dVar, C26428c cVar) {
        super(null);
        if (Build.VERSION.SDK_INT >= 18) {
            setPicture(svg.mo93817a(dVar, cVar));
            return;
        }
        this.f65273a = svg;
        this.f65274b = dVar;
        this.f65275c = cVar;
    }
}
