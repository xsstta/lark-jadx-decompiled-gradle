package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.ee.android.file.picker.lib.callback.IGetDataCallback;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.mvp.IModel;
import com.bytedance.ee.android.file.picker.lib.mvp.IView;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.b */
public interface AbstractC4060b {

    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.b$a */
    public interface AbstractC4061a extends IModel {
        /* renamed from: a */
        List<Uri> mo15948a();

        /* renamed from: a */
        List<BaseFileEntry> mo15949a(List<BaseFileEntry> list);

        /* renamed from: a */
        void mo15950a(long j);

        /* renamed from: a */
        void mo15951a(Context context, AbstractC1181a aVar, IGetDataCallback<List<BaseFileEntry>> fVar);

        /* renamed from: a */
        void mo15952a(Context context, IGetDataCallback<List<BaseFileEntry>> fVar);

        /* renamed from: a */
        boolean mo15953a(Uri uri);

        /* renamed from: b */
        List<Uri> mo15954b();

        /* renamed from: b */
        void mo15955b(long j);

        /* renamed from: b */
        void mo15956b(Context context, AbstractC1181a aVar, IGetDataCallback<List<BaseFileEntry>> fVar);

        /* renamed from: b */
        boolean mo15957b(Uri uri);

        long i_();
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.b$b */
    public interface AbstractC4062b extends IView<AbstractC4063a> {

        /* renamed from: com.bytedance.ee.android.file.picker.lib.local.b$b$a */
        public interface AbstractC4063a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo15970a();

            /* renamed from: a */
            void mo15971a(Context context, boolean z, BaseFileEntry baseFileEntry);
        }

        /* renamed from: a */
        void mo15959a();

        /* renamed from: a */
        void mo15960a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo15961a(BaseFileEntry baseFileEntry);

        /* renamed from: a */
        void mo15962a(String str);

        /* renamed from: a */
        void mo15963a(List<BaseFileEntry> list, List<Uri> list2);

        /* renamed from: a */
        void mo15964a(boolean z, List<Uri> list);

        /* renamed from: b */
        void mo15965b();

        /* renamed from: b */
        void mo15966b(BaseFileEntry baseFileEntry);

        /* renamed from: b */
        void mo15967b(String str);

        /* renamed from: b */
        void mo15968b(List<BaseFileEntry> list, List<Uri> list2);

        /* renamed from: c */
        void mo15969c(List<BaseFileEntry> list, List<Uri> list2);
    }
}
