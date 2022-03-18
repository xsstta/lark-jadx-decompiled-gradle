package com.ss.android.lark.ding.service.impl.controller;

public class DataLoader {

    /* renamed from: a */
    LoadStatus f94334a = LoadStatus.UNKNOWN;

    public enum LoadStatus {
        UNKNOWN(0),
        SUCCESS(1),
        LOADING(2),
        FAILED(3),
        USER_STOP(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static LoadStatus valueOf(int i) {
            return forNumber(i);
        }

        public static LoadStatus forNumber(int i) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return LOADING;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return FAILED;
        }

        private LoadStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public synchronized LoadStatus mo135312a() {
        return this.f94334a;
    }

    /* renamed from: e */
    public synchronized void mo135317e() {
        mo135313a(LoadStatus.UNKNOWN);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public synchronized void mo135315c() {
        if (mo135312a() != LoadStatus.USER_STOP) {
            mo135313a(LoadStatus.FAILED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public synchronized void mo135316d() {
        if (mo135312a() != LoadStatus.USER_STOP) {
            mo135313a(LoadStatus.SUCCESS);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized boolean mo135314b() {
        if (mo135312a() == LoadStatus.USER_STOP) {
            return false;
        }
        if (mo135312a() == LoadStatus.LOADING) {
            return false;
        }
        mo135313a(LoadStatus.LOADING);
        return true;
    }

    /* renamed from: a */
    public synchronized void mo135313a(LoadStatus loadStatus) {
        this.f94334a = loadStatus;
    }
}
