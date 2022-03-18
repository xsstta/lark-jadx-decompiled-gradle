package com.ss.lark.android.passport.biz.compat.v2.http.common;

import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import java.util.ArrayList;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.d */
public class C64524d {
    /* renamed from: c */
    public static ArrayList<AbstractC64511a> m253499c() {
        ArrayList<AbstractC64511a> arrayList = new ArrayList<>();
        arrayList.add(new AlertCodeHandler());
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<AbstractC64511a> m253497a() {
        ArrayList<AbstractC64511a> arrayList = new ArrayList<>();
        arrayList.add(new AlertJumpCodeHandler());
        arrayList.add(new NeedCaptChaIdCodeHandler());
        return arrayList;
    }

    /* renamed from: b */
    public static ArrayList<AbstractC64511a> m253498b() {
        ArrayList<AbstractC64511a> arrayList = new ArrayList<>();
        arrayList.add(new FormCodeHandler());
        arrayList.add(new ToastCodeHandler());
        return arrayList;
    }
}
