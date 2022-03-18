package com.ss.android.lark.feed.app.shortcut;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;

public class ShortcutBtnItemView extends ShortcutItemView implements AbstractC37803a {
    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37803a
    /* renamed from: a */
    public boolean mo138584a() {
        if (getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView$1 */
    static /* synthetic */ class C378021 {

        /* renamed from: a */
        static final /* synthetic */ int[] f96980a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus[] r0 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView.C378021.f96980a = r0
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.ROTATE_BTN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView.C378021.f96980a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.BADGE_ALPHA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView.C378021.f96980a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.GET_SHORTCUT_ITEM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView.C378021.f96980a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent$AnimationStatus r1 = com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent.AnimationStatus.BTN_TEXT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView.C378021.<clinit>():void");
        }
    }

    public ShortcutBtnItemView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37803a
    /* renamed from: a */
    public void mo138583a(ShortcutAnimationEvent shortcutAnimationEvent) {
        int i = C378021.f96980a[shortcutAnimationEvent.mo138461c().ordinal()];
        boolean z = true;
        if (i == 1) {
            this.f96984d.setRotation(shortcutAnimationEvent.mo138460b() * 180.0f);
        } else if (i != 2) {
            if (i == 3) {
                shortcutAnimationEvent.mo138459a(this);
            } else if (i == 4) {
                if (shortcutAnimationEvent.mo138460b() == BitmapDescriptorFactory.HUE_RED) {
                    this.f96981a.setText(getContext().getString(R.string.Lark_Feed_QuickSwitcherUnfold));
                } else {
                    this.f96981a.setText(getContext().getString(R.string.Lark_Feed_QuickSwitcherFold));
                }
            }
            z = false;
        } else {
            this.f96983c.setAlpha(1.0f - shortcutAnimationEvent.mo138460b());
        }
        if (z) {
            this.f96984d.invalidate();
        }
    }

    public ShortcutBtnItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShortcutBtnItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
