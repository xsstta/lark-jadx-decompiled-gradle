package com.ss.android.vc.meeting.module.sketch.dto;

import com.ss.android.vc.meeting.module.sketch.dto.comet.CometConfig;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilConfig;

public class GlobalShapeConfig {
    public CometConfig cometConfig;
    public PencilConfig pencilConfig;

    public String toString() {
        return "GlobalShapeConfig: {pencilConfig: " + this.pencilConfig + ", cometConfig: " + this.cometConfig + " }";
    }

    public GlobalShapeConfig(PencilConfig pencilConfig2, CometConfig cometConfig2) {
        this.pencilConfig = pencilConfig2;
        this.cometConfig = cometConfig2;
    }
}
