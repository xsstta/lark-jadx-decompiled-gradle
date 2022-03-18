package com.bytedance.ee.lark.infra.sandbox.context;

public interface IBaseService {
    IAppContext getAppContext();

    void release();
}
