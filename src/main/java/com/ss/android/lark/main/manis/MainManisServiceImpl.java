package com.ss.android.lark.main.manis;

import android.content.Context;
import com.ss.android.lark.main.interfaces.IMainManisService;
import com.ss.android.lark.main.router.C44507b;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IMainManisService.class)
public class MainManisServiceImpl implements IMainManisService {
    private Context mContext;

    public MainManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.main.interfaces.IMainManisService
    public void openLostPage(String str) {
        new C44507b().mo157954a(this.mContext, str);
    }
}
