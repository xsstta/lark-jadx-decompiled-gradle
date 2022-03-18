package com.ss.android.common.applog;

public interface IAnticheat {
    void onUpdateEstrFromApiFail(Exception exc);

    void onUpdateEstrFromApiSuccess(EstrBean estrBean);

    void updateEstr(String str);
}
