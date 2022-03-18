package com.ss.android.lark.widget;

public interface ILifeCycleEventObserve {

    public enum Event {
        FIRST_CONTENT_SHOWED,
        FIRST_FRAME_SHOWED,
        FIRST_DATA_LOADED
    }

    /* renamed from: com.ss.android.lark.widget.ILifeCycleEventObserve$a */
    public interface AbstractC58308a {
        /* renamed from: a */
        void mo103142a(Event event);
    }

    /* renamed from: a */
    void mo129675a(AbstractC58308a aVar);

    /* renamed from: b */
    void mo129678b(AbstractC58308a aVar);
}
