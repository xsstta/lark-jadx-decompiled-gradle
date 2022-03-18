package com.ss.android.lark.watermark;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import java.io.File;

public interface IWatermarkModuleDependency {

    public interface ILoginDependency {

        public @interface LoginType {
        }

        /* renamed from: a */
        String mo177775a();

        /* renamed from: b */
        int mo177776b();
    }

    /* renamed from: com.ss.android.lark.watermark.IWatermarkModuleDependency$a */
    public interface AbstractC58208a {
        /* renamed from: a */
        boolean mo177774a(String str);
    }

    /* renamed from: com.ss.android.lark.watermark.IWatermarkModuleDependency$b */
    public interface AbstractC58209b {
        /* renamed from: a */
        void mo177777a(Context context, File file, IGetDataCallback<File> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.watermark.IWatermarkModuleDependency$c */
    public interface AbstractC58210c {
        /* renamed from: a */
        String mo177772a();

        /* renamed from: b */
        String mo177773b();
    }

    /* renamed from: com.ss.android.lark.watermark.IWatermarkModuleDependency$d */
    public interface AbstractC58211d {
        /* renamed from: a */
        int mo177770a();

        /* renamed from: b */
        boolean mo177771b();
    }

    /* renamed from: a */
    Context mo177764a();

    /* renamed from: b */
    AbstractC58211d mo177765b();

    /* renamed from: c */
    AbstractC58210c mo177766c();

    /* renamed from: d */
    AbstractC58208a mo177767d();

    /* renamed from: e */
    ILoginDependency mo177768e();

    /* renamed from: f */
    AbstractC58209b mo177769f();
}
