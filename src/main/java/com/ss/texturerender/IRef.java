package com.ss.texturerender;

public interface IRef {
    int addRef();

    int decRef();

    int refCnt();
}
