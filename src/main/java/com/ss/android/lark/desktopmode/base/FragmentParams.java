package com.ss.android.lark.desktopmode.base;

import java.io.Serializable;

public class FragmentParams implements Serializable {
    protected final ContainerType containerType;
    protected boolean needBringToFront;

    public ContainerType getContainerType() {
        return this.containerType;
    }

    public boolean isBringToFront() {
        return this.needBringToFront;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.FragmentParams$a */
    public static abstract class AbstractC36568a<T extends AbstractC36568a, S extends FragmentParams> {

        /* renamed from: j */
        protected ContainerType f94125j;

        /* renamed from: k */
        protected boolean f94126k;

        /* renamed from: b */
        public abstract S mo134930b();

        /* renamed from: b */
        public AbstractC36568a<T, S> mo134953b(boolean z) {
            this.f94126k = z;
            return this;
        }

        public AbstractC36568a(ContainerType containerType) {
            this.f94125j = containerType;
        }
    }

    protected FragmentParams(ContainerType containerType2, boolean z) {
        this.containerType = containerType2;
        this.needBringToFront = z;
    }
}
