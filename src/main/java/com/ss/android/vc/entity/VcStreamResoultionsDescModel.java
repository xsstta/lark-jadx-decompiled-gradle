package com.ss.android.vc.entity;

import com.ss.android.vc.irtc.StreamDescription;
import java.io.Serializable;
import java.util.List;

public class VcStreamResoultionsDescModel implements Serializable {
    public int float_window;
    public int full_screen;
    public int half_screen;
    public int quater_screen;
    public List<StreamDescription> resolutions;
}
