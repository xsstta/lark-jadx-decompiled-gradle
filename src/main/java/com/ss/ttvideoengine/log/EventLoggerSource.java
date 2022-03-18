package com.ss.ttvideoengine.log;

import java.util.ArrayList;
import java.util.Map;

public interface EventLoggerSource {
    Map batteryInfo();

    Map bytesInfo();

    ArrayList forebackSwitchList();

    float getLogValueFloat(int i);

    int getLogValueInt(int i);

    long getLogValueLong(int i);

    String getLogValueStr(int i);

    String getMediaLoaderInfo();

    void onInfo(int i, Map map);

    Map versionInfo();
}
