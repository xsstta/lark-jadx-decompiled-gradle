package com.ss.android.lark.feed.app.shortcut;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.view.FeedListAdapter;

/* renamed from: com.ss.android.lark.feed.app.shortcut.f */
public class C37815f {

    /* renamed from: a */
    private final FeedListAdapter f97017a;

    /* renamed from: b */
    private final RecyclerView f97018b;

    /* renamed from: c */
    private final ShortcutAnimationEvent f97019c;

    /* renamed from: d */
    private final AbstractC37816a f97020d;

    /* renamed from: e */
    private boolean f97021e = true;

    /* renamed from: f */
    private final PointF f97022f;

    /* renamed from: com.ss.android.lark.feed.app.shortcut.f$a */
    public interface AbstractC37816a {
        /* renamed from: a */
        boolean mo138603a();
    }

    /* renamed from: a */
    private void m148832a(ShortcutAnimationEvent shortcutAnimationEvent) {
        ShortcutAnimationEvent shortcutAnimationEvent2 = this.f97019c;
        if (shortcutAnimationEvent2 == null || shortcutAnimationEvent2.mo138458a() == null) {
            EventBus.getDefault().trigger(shortcutAnimationEvent);
        } else {
            this.f97019c.mo138458a().mo138583a(shortcutAnimationEvent);
        }
    }

    /* renamed from: a */
    public boolean mo138602a(View view, MotionEvent motionEvent) {
        this.f97021e = this.f97020d.mo138603a();
        ShortcutAnimationEvent shortcutAnimationEvent = this.f97019c;
        if (shortcutAnimationEvent == null || shortcutAnimationEvent.mo138458a() == null || !this.f97019c.mo138458a().mo138584a()) {
            this.f97019c.mo138459a(null);
            EventBus.getDefault().trigger(this.f97019c);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f97022f.x = motionEvent.getRawX();
            this.f97022f.y = motionEvent.getRawY();
            return false;
        } else if (action == 1) {
            if (!ShortCutStausManager.m148791a().mo138573b()) {
                m148832a(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.TOUCH_UP));
            }
            this.f97022f.y = BitmapDescriptorFactory.HUE_RED;
            this.f97022f.x = BitmapDescriptorFactory.HUE_RED;
            return false;
        } else if (action != 2) {
            return false;
        } else {
            if (this.f97022f.y != BitmapDescriptorFactory.HUE_RED) {
                int rawY = (int) (motionEvent.getRawY() - this.f97022f.y);
                int rawX = (int) (motionEvent.getRawX() - this.f97022f.x);
                if (this.f97021e) {
                    if (!ShortCutStausManager.m148791a().mo138573b() && Math.abs(rawY) > Math.abs(rawX) && (ShortCutStausManager.m148791a().mo138578e() || ShortCutStausManager.m148791a().mo138575c())) {
                        m148832a(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.OPENDING, (float) rawY));
                    }
                    if (ShortCutStausManager.m148791a().mo138575c()) {
                        this.f97022f.y = motionEvent.getRawY();
                        this.f97022f.x = motionEvent.getRawX();
                        return true;
                    }
                }
            }
            this.f97022f.x = motionEvent.getRawX();
            this.f97022f.y = motionEvent.getRawY();
            return false;
        }
    }

    public C37815f(FeedListAdapter feedListAdapter, RecyclerView recyclerView, AbstractC37816a aVar) {
        this.f97017a = feedListAdapter;
        this.f97018b = recyclerView;
        this.f97020d = aVar;
        this.f97019c = new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.GET_FEED_ITEM);
        this.f97022f = new PointF();
    }
}
