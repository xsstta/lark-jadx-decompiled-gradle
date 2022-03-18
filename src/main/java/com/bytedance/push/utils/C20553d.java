package com.bytedance.push.utils;

import android.util.Base64;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.utils.d */
public class C20553d {
    /* renamed from: a */
    public static JSONObject m74854a(byte[] bArr, boolean z) throws DataFormatException, IOException {
        String str;
        byte[] bArr2 = new byte[65536];
        char c = (char) bArr[0];
        if (c == 'a') {
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService getMessage", "uncopress message");
            }
            str = new String(bArr, 1, bArr.length - 1);
        } else if (c == 'c') {
            Inflater inflater = new Inflater();
            if (z) {
                inflater.setInput(Base64.decode(bArr, 1, bArr.length - 1, 0));
            } else {
                inflater.setInput(bArr, 1, bArr.length - 1);
            }
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService getMessage", "copress message");
            }
            synchronized (bArr2) {
                int inflate = inflater.inflate(bArr2);
                inflater.end();
                if (inflate <= 0 || inflate >= 65536) {
                    str = null;
                } else {
                    str = new String(bArr2, 0, inflate, "UTF-8");
                }
            }
        } else {
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService", "onMessage : " + new String(bArr, 0, bArr.length));
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            if (!C20552c.m74848a()) {
                return null;
            }
            C20552c.m74845a("PushService", "onMessage : " + new String(bArr, 0, bArr.length));
            return null;
        }
    }
}
