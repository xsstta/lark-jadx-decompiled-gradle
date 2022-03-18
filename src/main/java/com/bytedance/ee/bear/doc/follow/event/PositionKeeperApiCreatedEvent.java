package com.bytedance.ee.bear.doc.follow.event;

public class PositionKeeperApiCreatedEvent implements ContentEvent {
    public AbstractC5429a positionKeeperApi;

    /* renamed from: com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent$a */
    public interface AbstractC5429a {
        /* renamed from: a */
        void mo21691a();

        /* renamed from: b */
        void mo21692b();

        /* renamed from: c */
        void mo21693c();
    }

    public PositionKeeperApiCreatedEvent(AbstractC5429a aVar) {
        this.positionKeeperApi = aVar;
    }
}
