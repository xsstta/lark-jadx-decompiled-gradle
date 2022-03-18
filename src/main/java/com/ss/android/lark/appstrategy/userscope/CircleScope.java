package com.ss.android.lark.appstrategy.userscope;

import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import java.io.Serializable;

public class CircleScope implements Serializable {
    private SimpleLocation location;
    private int radius;

    public CircleScope() {
    }

    public SimpleLocation getLocation() {
        return this.location;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setLocation(SimpleLocation simpleLocation) {
        this.location = simpleLocation;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public CircleScope(int i, SimpleLocation simpleLocation) {
        this.radius = i;
        this.location = simpleLocation;
    }
}
