package com.bytedance.ee.bear.drive.loader.model;

public enum InfoCode {
    OnAttach,
    OnDetach,
    LoadStart,
    PreFetchFileInfo,
    FileInfoSuccess,
    Generating,
    GenerateFinished,
    GenerateFailed,
    SummitDownloadTask,
    HitCache,
    FileNotChange,
    DownloadSuccess,
    WPS_PREVIEW
}
