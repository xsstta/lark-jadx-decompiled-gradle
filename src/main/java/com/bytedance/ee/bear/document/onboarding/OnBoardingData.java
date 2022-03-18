package com.bytedance.ee.bear.document.onboarding;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class OnBoardingData implements NonProguard {
    public String action;
    public Integer currentIndex;
    public boolean isLast;
    public String nextID;
    public Position position;
    public boolean shouldCheckDependencies = true;
    public Integer totalCount;

    public String getAction() {
        String str = this.action;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void transformPositionsIfNeed() {
        Position position2 = this.position;
        if (position2 != null) {
            position2.transform();
        }
    }

    public static class Position implements NonProguard {
        public float height;
        public float width;

        /* renamed from: x */
        public float f16905x;

        /* renamed from: y */
        public float f16906y;

        public String toString() {
            return String.format("Position[%s,%s] width: %s, height: %s", Float.valueOf(this.f16905x), Float.valueOf(this.f16906y), Float.valueOf(this.width), Float.valueOf(this.height));
        }

        public void transform() {
            float f = this.f16905x;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                this.width += f;
                this.f16905x = BitmapDescriptorFactory.HUE_RED;
            }
            float f2 = this.f16906y;
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                this.height += f2;
                this.f16906y = BitmapDescriptorFactory.HUE_RED;
            }
            this.f16905x = (float) C13749l.m55737a(this.f16905x);
            this.f16906y = (float) C13749l.m55737a(this.f16906y);
            this.width = (float) C13749l.m55737a(this.width);
            this.height = (float) C13749l.m55737a(this.height);
            if (this.f16905x + this.width > ((float) C13749l.m55736a())) {
                this.width = ((float) C13749l.m55736a()) - this.f16905x;
            }
            if (this.f16906y + this.height > ((float) C13749l.m55748b())) {
                this.height = ((float) C13749l.m55748b()) - this.f16906y;
            }
        }
    }

    public String toString() {
        return "OnBoardingData{action='" + this.action + '\'' + ", currentIndex=" + this.currentIndex + ", totalCount=" + this.totalCount + ", nextID='" + this.nextID + '\'' + ", isLast=" + this.isLast + ", shouldCheckDependencies=" + this.shouldCheckDependencies + ", position=" + this.position + '}';
    }
}
