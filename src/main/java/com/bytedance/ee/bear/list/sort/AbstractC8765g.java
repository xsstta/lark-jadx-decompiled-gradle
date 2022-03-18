package com.bytedance.ee.bear.list.sort;

import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.g */
public interface AbstractC8765g {

    /* renamed from: com.bytedance.ee.bear.list.sort.g$a */
    public interface AbstractC8766a extends IModel {
        /* renamed from: a */
        List<SortType> mo32811a();

        /* renamed from: a */
        void mo33801a(FolderSortStrategy folderSortStrategy);

        /* renamed from: b */
        List<FilterType> mo33058b();
    }

    /* renamed from: com.bytedance.ee.bear.list.sort.g$b */
    public interface AbstractC8767b extends IView<AbstractC8768a> {

        /* renamed from: com.bytedance.ee.bear.list.sort.g$b$a */
        public interface AbstractC8768a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo33815a();

            /* renamed from: a */
            void mo33816a(FolderSortStrategy folderSortStrategy);

            /* renamed from: b */
            void mo33817b(FolderSortStrategy folderSortStrategy);
        }

        /* renamed from: a */
        void mo33813a(FolderSortStrategy folderSortStrategy);

        /* renamed from: a */
        void mo33814a(List<FilterType> list, List<SortType> list2);
    }
}
