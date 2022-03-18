package com.larksuite.component.openplatform.core.loader.abs;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import java.io.File;

/* renamed from: com.larksuite.component.openplatform.core.loader.abs.a */
public abstract class AbstractC24506a implements AbstractC24509c {

    /* renamed from: a */
    protected File f60445a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo87363a();

    public AbstractC24506a(File file) {
        this.f60445a = file;
    }

    @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c
    /* renamed from: a */
    public byte[] mo87364a(String str) {
        if (this.f60445a == null) {
            AppBrandLogger.m52829e("AbsFileReader", "loadByteFromStream,root dir is not set!");
            return null;
        }
        if (!TextUtils.isEmpty(mo87363a())) {
            str = mo87363a() + File.separator + str;
        }
        File file = new File(this.f60445a, str);
        if (file.exists()) {
            return IOUtils.readBytes(file.getAbsolutePath());
        }
        AppBrandLogger.m52829e("AbsFileReader", "loadByteFromStream  error,file not exist:", file.getAbsolutePath());
        return null;
    }

    @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c
    /* renamed from: b */
    public String mo87365b(String str) {
        if (this.f60445a == null) {
            AppBrandLogger.m52829e("AbsFileReader", "loadStringFromStream,root dir is not set!");
            return null;
        }
        if (!TextUtils.isEmpty(mo87363a())) {
            str = mo87363a() + File.separator + str;
        }
        File file = new File(this.f60445a, str);
        if (file.exists()) {
            return IOUtils.readString(file.getAbsolutePath(), "utf-8");
        }
        AppBrandLogger.m52829e("AbsFileReader", "loadStringFromStream error,file not exist:", file.getAbsolutePath());
        return null;
    }
}
