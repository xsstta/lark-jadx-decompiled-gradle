package com.bytedance.ee.bear.drive.cache;

import com.bytedance.ee.bear.contract.drive.DriveCache;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.cache.b */
public interface AbstractC6882b {

    /* renamed from: a */
    public static final String f18659a;

    /* renamed from: b */
    public static final String f18660b;

    /* renamed from: a */
    int mo27098a(long j);

    /* renamed from: a */
    int mo27099a(long j, long j2);

    /* renamed from: a */
    int mo27100a(Long l);

    /* renamed from: a */
    DriveCache mo27101a(String str, boolean z);

    /* renamed from: a */
    List<DriveCache> mo27102a();

    /* renamed from: a */
    List<DriveCache> mo27103a(int i, int i2);

    /* renamed from: a */
    List<DriveCache> mo27104a(int i, int i2, long j, String str, String str2);

    /* renamed from: a */
    boolean mo27105a(int i);

    /* renamed from: a */
    boolean mo27106a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2);

    /* renamed from: a */
    boolean mo27107a(String str);

    /* renamed from: a */
    boolean mo27108a(String str, int i, int i2);

    /* renamed from: a */
    boolean mo27109a(String str, String str2);

    /* renamed from: a */
    boolean mo27110a(List<String> list);

    /* renamed from: b */
    long mo27111b(int i);

    /* renamed from: b */
    boolean mo27112b();

    /* renamed from: c */
    long mo27113c();

    /* renamed from: d */
    int mo27114d();

    static {
        String str = "drive" + File.separator;
        f18659a = str;
        f18660b = str + "offline";
    }
}
