package com.ss.android.lark.inno.player.layer;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.layer.AbstractC39018d;

/* renamed from: com.ss.android.lark.inno.player.layer.b */
public abstract class AbstractC39016b<T extends AbstractC39018d> extends FrameLayout {

    /* renamed from: a */
    private T f100216a;

    public T getDepend() {
        return this.f100216a;
    }

    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo142588b() {
        setVisibility(8);
    }

    public AbstractC39016b(Context context) {
        super(context);
    }

    public void setDepend(T t) {
        this.f100216a = t;
    }
}
