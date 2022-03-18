package com.ss.android.lark.reaction.p2557b.p2558a;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.p2556a.C52975c;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.reaction.b.a.b */
public class C52983b implements AbstractC38809a<InputStream> {

    /* renamed from: a */
    private final String f130895a = "ReactionResourceFetcher";

    /* renamed from: b */
    private String f130896b;

    /* renamed from: c */
    private InputStream f130897c;

    /* renamed from: d */
    private volatile boolean f130898d;

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: b */
    public void mo142218b() {
        this.f130898d = true;
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
        m205205a(this.f130897c);
    }

    public C52983b(String str) {
        this.f130896b = str;
    }

    /* renamed from: a */
    private final void m205205a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        Log.m165379d("ReactionResourceFetcher", th.toString());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142217a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar) {
        Log.m165379d("ReactionResourceFetcher", "load reaction：" + this.f130896b);
        if (this.f130898d) {
            aVar.mo142221a(new Exception("request is canceled：" + this.f130896b));
            return;
        }
        try {
            String a = C52975c.m205187a().mo180989b().mo102747a(this.f130896b);
            if (TextUtils.isEmpty(a)) {
                Log.m165383e("ReactionResourceFetcher", "load reaction failed, key is:" + this.f130896b);
                aVar.mo142221a(new Exception("load reaction failed, key is:" + this.f130896b));
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(a);
            this.f130897c = fileInputStream;
            aVar.mo142222a(fileInputStream);
        } catch (Exception e) {
            aVar.mo142221a(e);
            e.printStackTrace();
        }
    }
}
