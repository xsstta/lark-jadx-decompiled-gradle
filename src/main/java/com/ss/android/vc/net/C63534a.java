package com.ss.android.vc.net;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.sdk.AbstractC19831c;
import com.bytedance.lark.sdk.Sdk;
import com.bytedance.lark.sdk.StreamDataSource;
import com.ss.android.lark.sdk.C53253l;

/* renamed from: com.ss.android.vc.net.a */
public class C63534a {
    /* renamed from: a */
    public static void m248978a(Object obj, byte[] bArr, String str, AbstractC19831c cVar, StreamDataSource streamDataSource) {
        Sdk.invokeAsync((Command) obj, bArr, str, cVar, null);
    }

    /* renamed from: a */
    public static void m248979a(Object obj, byte[] bArr, String str, AbstractC19831c cVar, StreamDataSource streamDataSource, C53253l lVar) {
        Sdk.invokePassTroughAsync(((com.ss.android.lark.pb.improto.Command) obj).getValue(), bArr, str, cVar, streamDataSource, lVar);
    }
}
