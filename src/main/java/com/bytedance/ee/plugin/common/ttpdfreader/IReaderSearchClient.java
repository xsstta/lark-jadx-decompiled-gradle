package com.bytedance.ee.plugin.common.ttpdfreader;

public interface IReaderSearchClient {
    void onCurrentSelectedChanged(int i);

    void onSearchResultsChanged(int i);
}
