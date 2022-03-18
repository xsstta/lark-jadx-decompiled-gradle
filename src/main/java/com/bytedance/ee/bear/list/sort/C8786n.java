package com.bytedance.ee.bear.list.sort;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;

/* renamed from: com.bytedance.ee.bear.list.sort.n */
public class C8786n extends AbstractC1142af {
    private final C1177w<Integer> sortAndFilterMenuState = new C1177w<>();
    private final C1177w<FolderSortStrategy> sortStrategy = new C1177w<>();

    public LiveData<Integer> getSortAndFilterMenuStateLiveData() {
        return this.sortAndFilterMenuState;
    }

    public LiveData<FolderSortStrategy> getSortStrategyLiveData() {
        return this.sortStrategy;
    }

    public void postSortStrategy(FolderSortStrategy folderSortStrategy) {
        this.sortStrategy.mo5926a(folderSortStrategy);
    }

    public void setSortStrategy(FolderSortStrategy folderSortStrategy) {
        this.sortStrategy.mo5929b(folderSortStrategy);
    }

    public void setSortAndFilterMenuState(int i) {
        this.sortAndFilterMenuState.mo5929b(Integer.valueOf(i));
    }
}
