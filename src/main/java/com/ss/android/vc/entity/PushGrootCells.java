package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class PushGrootCells implements Serializable {
    private static final long serialVersionUID = 1;
    public List<GrootCell> cells;
    public ChannelMeta channel_meta;

    public String toString() {
        return "PushGrootCells{channel_meta=" + this.channel_meta + ", cells=" + this.cells + '}';
    }
}
