package com.bytedance.ee.bear.list.sort;

import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.h */
public interface AbstractC8769h {

    /* renamed from: com.bytedance.ee.bear.list.sort.h$a */
    public interface AbstractC8770a extends IModel {
        /* renamed from: a */
        List<SortType> mo32742a();

        /* renamed from: a */
        void mo33802a(FolderSortStrategy folderSortStrategy);
    }

    /* renamed from: com.bytedance.ee.bear.list.sort.h$b */
    public interface AbstractC8771b extends IView<AbstractC8772a> {

        /* renamed from: com.bytedance.ee.bear.list.sort.h$b$a */
        public interface AbstractC8772a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo33820a();

            /* renamed from: a */
            void mo33821a(FolderSortStrategy folderSortStrategy);
        }

        /* renamed from: a */
        void mo33818a(FolderSortStrategy folderSortStrategy);

        /* renamed from: a */
        void mo33819a(List<SortType> list);
    }
}
