package com.ss.android.lark.mediapicker.preview.base;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.b */
public interface AbstractC44726b {

    /* renamed from: com.ss.android.lark.mediapicker.preview.base.b$a */
    public interface AbstractC44727a {
        /* renamed from: a */
        List<LocalMedia> mo158428a();

        /* renamed from: a */
        void mo158429a(EditInfo editInfo);

        /* renamed from: a */
        void mo158430a(C44733f fVar);

        /* renamed from: a */
        boolean mo158431a(int i);

        /* renamed from: a */
        boolean mo158432a(int i, AbstractC44615a aVar);

        /* renamed from: b */
        C44733f mo158433b();

        /* renamed from: b */
        boolean mo158434b(int i);

        /* renamed from: c */
        List<LocalMedia> mo158435c();

        /* renamed from: c */
        boolean mo158436c(int i);

        /* renamed from: d */
        LocalMedia mo158437d(int i);

        /* renamed from: e */
        int mo158438e(int i);
    }

    /* renamed from: com.ss.android.lark.mediapicker.preview.base.b$b */
    public interface AbstractC44728b {

        /* renamed from: com.ss.android.lark.mediapicker.preview.base.b$b$a */
        public interface AbstractC44729a {
            /* renamed from: a */
            void mo158439a(int i);

            /* renamed from: a */
            void mo158440a(EditInfo editInfo);

            /* renamed from: a */
            void mo158441a(boolean z);

            /* renamed from: b */
            boolean mo158442b(int i);

            /* renamed from: c */
            void mo158443c(int i);

            /* renamed from: d */
            LocalMedia mo158444d(int i);

            /* renamed from: e */
            int mo158445e(int i);
        }

        /* renamed from: a */
        void mo158414a(int i);

        /* renamed from: a */
        void mo158402a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo158415a(FragmentActivity fragmentActivity, MediaPickerConfig mediaPickerConfig);

        /* renamed from: a */
        void mo158416a(EditInfo editInfo);

        /* renamed from: a */
        void mo158417a(AbstractC44729a aVar);

        /* renamed from: a */
        void mo158418a(List<LocalMedia> list);

        /* renamed from: a */
        void mo158419a(List<LocalMedia> list, List<LocalMedia> list2);

        /* renamed from: a */
        void mo158420a(boolean z);

        /* renamed from: b */
        void mo158421b(C44733f fVar);

        /* renamed from: b */
        void mo158422b(boolean z);

        /* renamed from: c */
        void mo158423c(boolean z);

        /* renamed from: c */
        boolean mo158424c();

        /* renamed from: d */
        boolean mo158426d();
    }
}
