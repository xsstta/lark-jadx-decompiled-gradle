package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import net.lucode.hackware.magicindicator.buildins.C69618b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.c */
public class C69633c extends TextView implements AbstractC69622b {

    /* renamed from: b */
    protected int f174079b;

    /* renamed from: c */
    protected int f174080c;

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31042a(int i, int i2, float f, boolean z) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31044b(int i, int i2, float f, boolean z) {
    }

    public int getNormalColor() {
        return this.f174080c;
    }

    public int getSelectedColor() {
        return this.f174079b;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((float) (getHeight() / 2)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((float) (getHeight() / 2)) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentLeft() {
        Rect rect = new Rect();
        getPaint().getTextBounds(getText().toString(), 0, getText().length(), rect);
        return (getLeft() + (getWidth() / 2)) - (rect.width() / 2);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentRight() {
        Rect rect = new Rect();
        getPaint().getTextBounds(getText().toString(), 0, getText().length(), rect);
        return getLeft() + (getWidth() / 2) + (rect.width() / 2);
    }

    public void setNormalColor(int i) {
        this.f174080c = i;
    }

    public void setSelectedColor(int i) {
        this.f174079b = i;
    }

    public C69633c(Context context) {
        super(context, null);
        m267478a(context);
    }

    /* renamed from: a */
    private void m267478a(Context context) {
        setGravity(17);
        int a = C69618b.m267418a(context, 10.0d);
        setPadding(a, 0, a, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31041a(int i, int i2) {
        setTextColor(this.f174079b);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31043b(int i, int i2) {
        setTextColor(this.f174080c);
    }
}
