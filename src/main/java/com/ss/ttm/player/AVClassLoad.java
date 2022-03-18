package com.ss.ttm.player;

class AVClassLoad {
    AVClassLoad() {
    }

    static Object getClassLoader() {
        return AVClassLoad.class.getClassLoader();
    }
}
