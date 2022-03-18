package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b */
public class C69628b extends FrameLayout implements AbstractC69622b {

    /* renamed from: a */
    private AbstractC69630b f174070a;

    /* renamed from: b */
    private AbstractC69629a f174071b;

    /* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b$a */
    public interface AbstractC69629a {
        /* renamed from: a */
        int mo243252a();

        /* renamed from: b */
        int mo243253b();

        /* renamed from: c */
        int mo243254c();

        /* renamed from: d */
        int mo243255d();
    }

    /* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b$b */
    public interface AbstractC69630b {
        /* renamed from: a */
        void mo16699a(int i, int i2);

        /* renamed from: a */
        void mo16700a(int i, int i2, float f, boolean z);

        /* renamed from: b */
        void mo16701b(int i, int i2);

        /* renamed from: b */
        void mo16702b(int i, int i2, float f, boolean z);
    }

    public AbstractC69629a getContentPositionDataProvider() {
        return this.f174071b;
    }

    public AbstractC69630b getOnPagerTitleChangeListener() {
        return this.f174070a;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentBottom() {
        AbstractC69629a aVar = this.f174071b;
        if (aVar != null) {
            return aVar.mo243255d();
        }
        return getBottom();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentLeft() {
        AbstractC69629a aVar = this.f174071b;
        if (aVar != null) {
            return aVar.mo243252a();
        }
        return getLeft();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentRight() {
        AbstractC69629a aVar = this.f174071b;
        if (aVar != null) {
            return aVar.mo243254c();
        }
        return getRight();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentTop() {
        AbstractC69629a aVar = this.f174071b;
        if (aVar != null) {
            return aVar.mo243253b();
        }
        return getTop();
    }

    public C69628b(Context context) {
        super(context);
    }

    public void setContentPositionDataProvider(AbstractC69629a aVar) {
        this.f174071b = aVar;
    }

    public void setOnPagerTitleChangeListener(AbstractC69630b bVar) {
        this.f174070a = bVar;
    }

    public void setContentView(View view) {
        mo243245a(view, (FrameLayout.LayoutParams) null);
    }

    public void setContentView(int i) {
        mo243245a(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null), (FrameLayout.LayoutParams) null);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31041a(int i, int i2) {
        AbstractC69630b bVar = this.f174070a;
        if (bVar != null) {
            bVar.mo16699a(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31043b(int i, int i2) {
        AbstractC69630b bVar = this.f174070a;
        if (bVar != null) {
            bVar.mo16701b(i, i2);
        }
    }

    /* renamed from: a */
    public void mo243245a(View view, FrameLayout.LayoutParams layoutParams) {
        removeAllViews();
        if (view != null) {
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31042a(int i, int i2, float f, boolean z) {
        AbstractC69630b bVar = this.f174070a;
        if (bVar != null) {
            bVar.mo16700a(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31044b(int i, int i2, float f, boolean z) {
        AbstractC69630b bVar = this.f174070a;
        if (bVar != null) {
            bVar.mo16702b(i, i2, f, z);
        }
    }
}
