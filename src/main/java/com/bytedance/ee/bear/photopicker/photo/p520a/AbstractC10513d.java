package com.bytedance.ee.bear.photopicker.photo.p520a;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.photopicker.photo.ErrorResult;
import com.bytedance.ee.bear.photopicker.photo.p520a.C10501b;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d */
public interface AbstractC10513d {

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$a */
    public interface AbstractC10514a {

        /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$a$a */
        public interface AbstractC10515a {
            /* renamed from: a */
            void mo39882a(ErrorResult errorResult);
        }

        /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$a$b */
        public interface AbstractC10516b {
            /* renamed from: a */
            void mo39878a(List<Photo> list, List<Photo> list2);
        }

        /* renamed from: a */
        List<Photo> mo39861a();

        /* renamed from: a */
        List<Photo> mo39862a(List<Photo> list);

        /* renamed from: a */
        void mo39863a(Context context, AbstractC10516b bVar);

        /* renamed from: a */
        void mo39864a(FileSelectConfig fileSelectConfig, ArrayList<Photo> arrayList);

        /* renamed from: a */
        boolean mo39866a(Photo photo, AbstractC10515a aVar);

        /* renamed from: b */
        void mo39867b();

        /* renamed from: b */
        void mo39868b(Context context, AbstractC10516b bVar);
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$b */
    public interface AbstractC10517b {

        /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$b$a */
        public interface AbstractC10518a {
            /* renamed from: a */
            void mo39879a();

            /* renamed from: a */
            boolean mo39880a(Photo photo);

            /* renamed from: b */
            void mo39881b();
        }

        /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.d$b$b */
        public interface AbstractC10519b {
            /* renamed from: a */
            View mo39820a();

            /* renamed from: a */
            void mo39822a(FileSelectConfig fileSelectConfig, List<Photo> list);

            /* renamed from: a */
            void mo39823a(List<Photo> list, List<Photo> list2, int i, boolean z, FileSelectConfig fileSelectConfig, View view);

            /* renamed from: a */
            void mo39824a(List<Photo> list, boolean z);

            /* renamed from: b */
            void mo39825b();

            /* renamed from: c */
            void mo39826c();
        }

        /* renamed from: a */
        void mo39885a();

        /* renamed from: a */
        void mo39886a(Context context, AbstractC10519b bVar, FileSelectConfig fileSelectConfig);

        /* renamed from: a */
        void mo39887a(ErrorResult.CheckMediaError checkMediaError);

        /* renamed from: a */
        void mo39888a(C10501b.C10504b bVar);

        /* renamed from: a */
        void mo39889a(List<Photo> list);

        /* renamed from: a */
        void mo39890a(List<Photo> list, List<Photo> list2);

        /* renamed from: a */
        void mo39892a(boolean z);

        /* renamed from: b */
        void mo39893b(List<Photo> list);

        /* renamed from: b */
        boolean mo39894b();
    }
}
