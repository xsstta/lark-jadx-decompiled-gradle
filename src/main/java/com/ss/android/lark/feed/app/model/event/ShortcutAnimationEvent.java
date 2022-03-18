package com.ss.android.lark.feed.app.model.event;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.feed.app.shortcut.AbstractC37803a;

public class ShortcutAnimationEvent extends BaseEvent {

    /* renamed from: a */
    private AnimationStatus f96796a;

    /* renamed from: b */
    private float f96797b;

    /* renamed from: c */
    private AbstractC37803a f96798c;

    /* renamed from: a */
    public AbstractC37803a mo138458a() {
        return this.f96798c;
    }

    /* renamed from: b */
    public float mo138460b() {
        return this.f96797b;
    }

    /* renamed from: c */
    public AnimationStatus mo138461c() {
        return this.f96796a;
    }

    public ShortcutAnimationEvent(AnimationStatus animationStatus) {
        this.f96796a = animationStatus;
    }

    /* renamed from: a */
    public void mo138459a(AbstractC37803a aVar) {
        this.f96798c = aVar;
    }

    public ShortcutAnimationEvent(AnimationStatus animationStatus, float f) {
        this.f96796a = animationStatus;
        this.f96797b = f;
    }

    public enum AnimationStatus {
        OPEN(1),
        OPENDING(2),
        CLOSE(3),
        TOUCH_UP(4),
        ROTATE_BTN(5),
        BADGE_ALPHA(6),
        UPDATE_SHORTCUT(7),
        GET_FEED_ITEM(8),
        GET_SHORTCUT_ITEM(9),
        BTN_TEXT(10),
        TENANT_CHANGE(11),
        CLOSE_SILENT(12);
        
        private final int value;

        private AnimationStatus(int i) {
            this.value = i;
        }
    }
}
