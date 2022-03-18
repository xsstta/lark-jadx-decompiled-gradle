package com.ss.ttvideoengine.selector;

import com.ss.ttvideoengine.model.IVideoModel;
import java.util.Map;

public interface Selector {
    SelectedInfo select(IVideoModel iVideoModel, Map<Integer, Object> map);
}
