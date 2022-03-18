package com.ss.android.lark.appstrategy.userscope;

import java.io.Serializable;
import java.util.List;

public class AppStrategyUserScope implements Serializable {
    private List<CircleScope> circleScopes;
    private boolean hasLocationScope;
    private boolean hasWifiScope;
    private List<PolygonScope> polygonScopes;
    private String snapshotId;

    public AppStrategyUserScope() {
    }

    public List<CircleScope> getCircleScopes() {
        return this.circleScopes;
    }

    public List<PolygonScope> getPolygonScopes() {
        return this.polygonScopes;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public boolean isHasLocationScope() {
        return this.hasLocationScope;
    }

    public boolean isHasWifiScope() {
        return this.hasWifiScope;
    }

    public void setCircleScopes(List<CircleScope> list) {
        this.circleScopes = list;
    }

    public void setHasLocationScope(boolean z) {
        this.hasLocationScope = z;
    }

    public void setHasWifiScope(boolean z) {
        this.hasWifiScope = z;
    }

    public void setPolygonScopes(List<PolygonScope> list) {
        this.polygonScopes = list;
    }

    public void setSnapshotId(String str) {
        this.snapshotId = str;
    }

    public AppStrategyUserScope(boolean z, boolean z2, List<CircleScope> list, List<PolygonScope> list2, String str) {
        this.hasLocationScope = z;
        this.hasWifiScope = z2;
        this.circleScopes = list;
        this.polygonScopes = list2;
        this.snapshotId = str;
    }
}
