package com.ss.android.lark.moments.impl.feed;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/AppBarStateChangeListener;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "()V", "mCurrentState", "Lcom/ss/android/lark/moments/impl/feed/AppBarStateChangeListener$State;", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "i", "", "onStateChanged", "state", "State", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class AppBarStateChangeListener implements AppBarLayout.AbstractC22134b {

    /* renamed from: a */
    private State f119749a = State.IDLE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/AppBarStateChangeListener$State;", "", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "IDLE", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum State {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    /* renamed from: a */
    public abstract void mo165980a(AppBarLayout appBarLayout, State state);

    @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (appBarLayout == null) {
            return;
        }
        if (i == 0) {
            if (this.f119749a != State.EXPANDED) {
                mo165980a(appBarLayout, State.EXPANDED);
            }
            this.f119749a = State.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.f119749a != State.COLLAPSED) {
                mo165980a(appBarLayout, State.COLLAPSED);
            }
            this.f119749a = State.COLLAPSED;
        } else {
            if (this.f119749a != State.IDLE) {
                mo165980a(appBarLayout, State.IDLE);
            }
            this.f119749a = State.IDLE;
        }
    }
}
