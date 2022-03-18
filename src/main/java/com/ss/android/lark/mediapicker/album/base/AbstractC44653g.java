package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.view.View;
import androidx.loader.p045a.AbstractC1181a;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.C44627b;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.g */
public interface AbstractC44653g {

    /* renamed from: com.ss.android.lark.mediapicker.album.base.g$a */
    public interface AbstractC44654a {
        /* renamed from: a */
        List<LocalMedia> mo158163a();

        /* renamed from: a */
        void mo158164a(AbstractC1181a aVar, Context context, AbstractC44658h hVar);

        /* renamed from: a */
        void mo158165a(MediaPickerConfig mediaPickerConfig, ArrayList<LocalMedia> arrayList);

        /* renamed from: a */
        void mo158166a(EditInfo editInfo);

        /* renamed from: a */
        boolean mo158169a(LocalMedia localMedia, AbstractC44615a aVar);

        /* renamed from: b */
        List<LocalMedia> mo158170b();

        /* renamed from: b */
        List<LocalMedia> mo158171b(List<LocalMedia> list);

        /* renamed from: b */
        void mo158172b(AbstractC1181a aVar, Context context, AbstractC44658h hVar);

        /* renamed from: c */
        List<LocalMedia> mo158173c();

        /* renamed from: d */
        void mo158174d();
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.base.g$b */
    public interface AbstractC44655b {

        /* renamed from: com.ss.android.lark.mediapicker.album.base.g$b$a */
        public interface AbstractC44656a {
            /* renamed from: a */
            void mo158189a();

            /* renamed from: a */
            boolean mo158190a(LocalMedia localMedia);

            /* renamed from: b */
            void mo158191b();
        }

        /* renamed from: com.ss.android.lark.mediapicker.album.base.g$b$b */
        public interface AbstractC44657b {
            /* renamed from: a */
            View mo158154a();

            /* renamed from: a */
            void mo158155a(MediaPickerConfig mediaPickerConfig, List<LocalMedia> list);

            /* renamed from: a */
            void mo158156a(List<LocalMedia> list, List<LocalMedia> list2, int i, boolean z, MediaPickerConfig mediaPickerConfig);

            /* renamed from: a */
            void mo158157a(List<LocalMedia> list, List<LocalMedia> list2, boolean z);

            /* renamed from: b */
            void mo158158b();

            /* renamed from: c */
            void mo158159c();

            /* renamed from: d */
            void mo158160d();
        }

        /* renamed from: a */
        void mo158142a(int i);

        /* renamed from: a */
        void mo158218a(Context context, AbstractC44657b bVar, MediaPickerConfig mediaPickerConfig);

        /* renamed from: a */
        void mo158219a(C44627b.C44630b bVar);

        /* renamed from: a */
        void mo158220a(List<LocalMedia> list);

        /* renamed from: a */
        void mo158221a(List<LocalMedia> list, List<LocalMedia> list2);

        /* renamed from: a */
        void mo158223a(List<LocalMediaFolder> list, List<LocalMedia> list2, List<LocalMedia> list3);

        /* renamed from: a */
        void mo158224a(boolean z);

        /* renamed from: b */
        void mo158225b();

        /* renamed from: b */
        void mo158226b(List<LocalMedia> list);

        /* renamed from: b */
        void mo158227b(List<LocalMedia> list, List<LocalMedia> list2);

        /* renamed from: c */
        boolean mo158228c();
    }
}
