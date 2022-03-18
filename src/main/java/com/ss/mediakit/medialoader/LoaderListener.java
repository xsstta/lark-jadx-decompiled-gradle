package com.ss.mediakit.medialoader;

public interface LoaderListener {
    void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskStart(LoaderEventInfo loaderEventInfo);
}
