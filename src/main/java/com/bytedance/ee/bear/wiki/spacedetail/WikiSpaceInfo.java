package com.bytedance.ee.bear.wiki.spacedetail;

import com.bytedance.ee.util.io.NonProguard;

public class WikiSpaceInfo implements NonProguard {
    private SpaceBean spaceBean;
    private RoleBean userRole;

    public SpaceBean getSpaceBean() {
        return this.spaceBean;
    }

    public RoleBean getUserRole() {
        return this.userRole;
    }

    public WikiSpaceInfo(SpaceBean spaceBean2, RoleBean roleBean) {
        this.spaceBean = spaceBean2;
        this.userRole = roleBean;
    }
}
