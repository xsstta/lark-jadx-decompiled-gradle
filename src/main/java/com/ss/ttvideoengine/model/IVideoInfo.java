package com.ss.ttvideoengine.model;

import com.ss.ttvideoengine.Resolution;
import java.util.Map;
import org.json.JSONObject;

public interface IVideoInfo {
    MediaBitrateFitterInfo getBitrateFitterInfo();

    int getMediatype();

    Resolution getResolution();

    boolean getValueBool(int i);

    float getValueFloat(int i);

    int getValueInt(int i);

    long getValueLong(int i);

    String getValueStr(int i);

    String[] getValueStrArr(int i);

    JSONObject toBashJsonObject();

    Map toMediaInfo();
}
