package com.ss.android.common.applog;

public interface IClient {
    void getEstrFromAPI();

    String readEstrFromSharedPreference();

    void writeEstrToSharedPreference(String str);
}
