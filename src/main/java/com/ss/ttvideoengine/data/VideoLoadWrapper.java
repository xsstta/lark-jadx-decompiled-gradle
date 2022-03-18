package com.ss.ttvideoengine.data;

import com.ss.ttvideoengine.LibraryLoaderProxy;

public class VideoLoadWrapper {
    private static String TAG = "VideoLoadWrapper";
    private volatile boolean isInited;
    private volatile boolean isProxyLibraryLoaded;
    private volatile LibraryLoaderProxy mProxy;

    public synchronized int init() {
        return -1;
    }

    public synchronized boolean loadLibrary() {
        return false;
    }

    public synchronized int release() {
        return -1;
    }

    /* access modifiers changed from: private */
    public static class VideoLoadWrapperSingletonHolder {
        public static final VideoLoadWrapper instance = new VideoLoadWrapper();

        private VideoLoadWrapperSingletonHolder() {
        }
    }

    private VideoLoadWrapper() {
    }

    public static VideoLoadWrapper getInstance() {
        return VideoLoadWrapperSingletonHolder.instance;
    }

    public synchronized String getSDKVersion() {
        return "";
    }

    public synchronized void forbidP2P(String str) {
    }

    public synchronized void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
    }

    public synchronized void setLogEnable(int i) {
    }

    public synchronized void stopTask(String str) {
    }

    public synchronized String getLoadInfo(String str) {
        return "";
    }

    public synchronized String getReWriteUrl(String str, int i) {
        return null;
    }

    public synchronized void setPlayPos(String str, long j) {
    }

    public synchronized void videoStalled(String str, int i) {
    }

    public synchronized void setPlayInfo(String str, int i, long j) {
    }
}
