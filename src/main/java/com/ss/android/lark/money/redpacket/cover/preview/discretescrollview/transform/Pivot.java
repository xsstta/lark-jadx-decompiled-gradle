package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Pivot {

    /* renamed from: a */
    private int f121057a;

    /* renamed from: b */
    private int f121058b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot$X */
    public enum EnumC48085X {
        LEFT {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48085X
            public Pivot create() {
                return new Pivot(0, 0);
            }
        },
        CENTER {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48085X
            public Pivot create() {
                return new Pivot(0, -1);
            }
        },
        RIGHT {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48085X
            public Pivot create() {
                return new Pivot(0, -2);
            }
        };

        public abstract Pivot create();
    }

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot$Y */
    public enum EnumC48089Y {
        TOP {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48089Y
            public Pivot create() {
                return new Pivot(1, 0);
            }
        },
        CENTER {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48089Y
            public Pivot create() {
                return new Pivot(1, -1);
            }
        },
        BOTTOM {
            @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot.EnumC48089Y
            public Pivot create() {
                return new Pivot(1, -2);
            }
        };

        public abstract Pivot create();
    }

    /* renamed from: a */
    public void mo168394a(View view) {
        int i = this.f121057a;
        if (i == 0) {
            int i2 = this.f121058b;
            if (i2 == -2) {
                view.setPivotX((float) view.getWidth());
            } else if (i2 != -1) {
                view.setPivotX((float) i2);
            } else {
                view.setPivotX(((float) view.getWidth()) * 0.5f);
            }
        } else if (i == 1) {
            int i3 = this.f121058b;
            if (i3 == -2) {
                view.setPivotY((float) view.getHeight());
            } else if (i3 != -1) {
                view.setPivotY((float) i3);
            } else {
                view.setPivotY(((float) view.getHeight()) * 0.5f);
            }
        }
    }

    public Pivot(int i, int i2) {
        this.f121057a = i;
        this.f121058b = i2;
    }
}
