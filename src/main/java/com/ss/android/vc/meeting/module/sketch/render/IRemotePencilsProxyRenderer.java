package com.ss.android.vc.meeting.module.sketch.render;

import java.util.List;

public interface IRemotePencilsProxyRenderer {
    void removePencil(String str);

    void removePencilsNotInList(List<String> list);
}
