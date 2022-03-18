package com.ss.android.lark.feed.app.model.common;

import java.util.concurrent.atomic.AtomicBoolean;

public class LoadState {

    /* renamed from: a */
    private AtomicBoolean f96742a;

    /* renamed from: b */
    private AtomicBoolean f96743b;

    /* renamed from: c */
    private AtomicBoolean f96744c;

    public enum LoadType {
        UNKNOWN(-1),
        LOCAL(0),
        NET(1),
        CONNECT(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static LoadType valueOf(int i) {
            return forNumber(i);
        }

        public static LoadType forNumber(int i) {
            if (i == 0) {
                return LOCAL;
            }
            if (i == 1) {
                return NET;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return CONNECT;
        }

        private LoadType(int i) {
            this.value = i;
        }
    }

    public LoadState() {
        this(false, false, false);
    }

    /* renamed from: a */
    public boolean mo138361a() {
        return this.f96744c.get();
    }

    /* renamed from: b */
    public boolean mo138362b() {
        return this.f96743b.get();
    }

    /* renamed from: c */
    public boolean mo138363c() {
        return this.f96742a.get();
    }

    /* renamed from: a */
    public void mo138360a(LoadType loadType, boolean z) {
        if (loadType == LoadType.NET) {
            this.f96742a.set(z);
        } else if (loadType == LoadType.LOCAL) {
            this.f96743b.set(z);
        } else {
            this.f96744c.set(z);
        }
    }

    public LoadState(boolean z, boolean z2, boolean z3) {
        this.f96742a = new AtomicBoolean(z);
        this.f96743b = new AtomicBoolean(z2);
        this.f96744c = new AtomicBoolean(z3);
    }
}
