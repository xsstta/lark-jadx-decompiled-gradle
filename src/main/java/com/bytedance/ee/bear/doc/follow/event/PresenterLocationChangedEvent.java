package com.bytedance.ee.bear.doc.follow.event;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;

public class PresenterLocationChangedEvent implements ContentEvent {
    public Location follower;
    public Location presenter;

    public static class Location implements NonProguard {
        public String space;

        /* renamed from: x */
        public double f15478x;

        /* renamed from: y */
        public double f15479y;

        public String getSpace() {
            return this.space;
        }

        public double getX() {
            return this.f15478x;
        }

        public double getY() {
            return this.f15479y;
        }

        public String toString() {
            return "Location{x=" + this.f15478x + ", y=" + this.f15479y + ", space='" + C13598b.m55197d(this.space) + '\'' + '}';
        }

        public void setSpace(String str) {
            this.space = str;
        }

        public void setX(double d) {
            this.f15478x = d;
        }

        public void setY(double d) {
            this.f15479y = d;
        }
    }

    public Location getFollower() {
        return this.follower;
    }

    public Location getPresenter() {
        return this.presenter;
    }

    public String toString() {
        return "PresenterLocationChangedEvent{presenter=" + this.presenter.toString() + ", follower=" + this.follower.toString() + '}';
    }

    public void setFollower(Location location) {
        this.follower = location;
    }

    public void setPresenter(Location location) {
        this.presenter = location;
    }
}
