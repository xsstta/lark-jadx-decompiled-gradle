package com.bytedance.ee.bear.contract;

import androidx.lifecycle.LiveData;

public interface ConnectionService {
    /* renamed from: a */
    LiveData<NetworkState> mo20037a();

    /* renamed from: b */
    NetworkState mo20038b();

    /* renamed from: c */
    String mo20039c();

    public static class NetworkState {

        /* renamed from: a */
        private final int f14767a;

        public @interface NetworkType {
        }

        /* renamed from: a */
        public int mo20040a() {
            return this.f14767a;
        }

        /* renamed from: c */
        public boolean mo20042c() {
            if (this.f14767a == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo20041b() {
            if (this.f14767a != 6) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo20043d() {
            int i = this.f14767a;
            if (i < 2 || i > 5) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "NetworkState{type=" + this.f14767a + '}';
        }

        public NetworkState(int i) {
            this.f14767a = i;
        }
    }
}
