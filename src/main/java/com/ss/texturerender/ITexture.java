package com.ss.texturerender;

public interface ITexture extends IRef {
    int getTexTarget();

    int lock();

    int tryLock(int i);

    void unlock();
}
