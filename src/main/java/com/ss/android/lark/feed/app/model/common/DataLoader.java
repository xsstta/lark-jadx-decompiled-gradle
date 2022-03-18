package com.ss.android.lark.feed.app.model.common;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a;

public class DataLoader<T extends C37728b, D extends AbstractC37726a> {

    /* renamed from: a */
    LoadStatus f96741a = LoadStatus.UNKNOWN;

    /* renamed from: com.ss.android.lark.feed.app.model.common.DataLoader$a */
    public interface AbstractC37726a<D> {
        /* renamed from: a */
        void mo137409a(ErrorResult errorResult);

        /* renamed from: a */
        void mo137411a(D d);
    }

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
    public synchronized LoadStatus mo138354a() {
        return this.f96741a;
    }

    /* renamed from: c */
    public synchronized void mo138357c() {
        if (mo138354a() != LoadStatus.USER_STOP) {
            mo138355a(LoadStatus.FAILED);
        }
    }

    /* renamed from: d */
    public synchronized void mo138358d() {
        if (mo138354a() != LoadStatus.USER_STOP) {
            mo138355a(LoadStatus.SUCCESS);
        }
    }

    /* renamed from: b */
    public synchronized boolean mo138356b() {
        if (mo138354a() == LoadStatus.USER_STOP) {
            return false;
        }
        if (mo138354a() == LoadStatus.LOADING) {
            return false;
        }
        mo138355a(LoadStatus.LOADING);
        return true;
    }

    /* renamed from: a */
    public synchronized void mo138355a(LoadStatus loadStatus) {
        this.f96741a = loadStatus;
    }
}
