package com.ss.android.lark.p2719t.p2721b;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.t.b.b */
public class C55250b implements AbstractC38809a<InputStream> {

    /* renamed from: a */
    private final String f136352a = "EmojiResourceDataFetcher";

    /* renamed from: b */
    private String f136353b;

    /* renamed from: c */
    private InputStream f136354c;

    /* renamed from: d */
    private volatile boolean f136355d;

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: b */
    public void mo142218b() {
        this.f136355d = true;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: c */
    public Class<InputStream> mo142219c() {
        return InputStream.class;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: d */
    public DataSource mo142220d() {
        return DataSource.REMOTE;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142216a() {
        m214303a(this.f136354c);
    }

    public C55250b(String str) {
        this.f136353b = str;
    }

    /* renamed from: a */
    private final void m214303a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        Log.m165379d("EmojiResourceDataFetcher", th.toString());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142217a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar) {
        Log.m165379d("EmojiResourceDataFetcher", "load emoji image：" + this.f136353b);
        if (this.f136355d) {
            aVar.mo142221a(new Exception("request is canceled：" + this.f136353b));
            return;
        }
        try {
            String a = LarkEmojiModuleDependency.m214269a().mo43820a(this.f136353b);
            if (TextUtils.isEmpty(a)) {
                Log.m165383e("EmojiResourceDataFetcher", "load emoji image failed, key is:" + this.f136353b);
                aVar.mo142221a(new Exception("load emoji image failed, key is:" + this.f136353b));
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(a);
            this.f136354c = fileInputStream;
            aVar.mo142222a(fileInputStream);
        } catch (Exception e) {
            aVar.mo142221a(e);
            e.printStackTrace();
        }
    }
}
