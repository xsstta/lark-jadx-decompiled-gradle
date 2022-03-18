package com.ss.android.vc.p3069b;

import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.vc.b.f */
public class C60683f implements AbstractC60659a {

    /* renamed from: a */
    private C60674c f151804a = new C60674c();

    /* renamed from: b */
    private int f151805b;

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: b */
    public C60674c mo208204b() {
        return this.f151804a.mo208227a(this.f151805b);
    }

    @Override // com.ss.android.vc.p3069b.AbstractC60659a
    /* renamed from: a */
    public C60674c mo208203a() {
        double c = (double) m235789c();
        if (c > 0.0d) {
            this.f151804a.mo208232a(c);
            this.f151805b++;
        }
        C60674c cVar = new C60674c();
        cVar.f151774a = c;
        return cVar;
    }

    /* renamed from: c */
    private float m235789c() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("top -n 1");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int i = -1;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        int a = m235788a(trim);
                        if (a != -1) {
                            i = a;
                        } else if (!trim.startsWith(String.valueOf(Process.myPid()))) {
                            continue;
                        } else if (i != -1) {
                            String[] split = trim.split("\\s+");
                            if (split.length > i) {
                                String str = split[i];
                                if (str.endsWith("%")) {
                                    str = str.substring(0, str.lastIndexOf("%"));
                                }
                                float parseFloat = Float.parseFloat(str);
                                if (process != null) {
                                    process.destroy();
                                }
                                return parseFloat;
                            }
                        }
                    }
                } else if (process == null) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (0 == 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                process.destroy();
            }
            throw th;
        }
        process.destroy();
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    private int m235788a(String str) {
        if (!str.contains("CPU")) {
            return -1;
        }
        if (!str.startsWith("PID")) {
            str = str.substring(str.indexOf("PID"));
        }
        String[] split = str.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("CPU")) {
                if (split[i].contains("[")) {
                    return i + 1;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
}
