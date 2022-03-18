package com.ss.ttvideoengine.abr;

import com.huawei.hms.location.LocationRequest;
import com.ss.ttvideoengine.utils.TTHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SegmentInfo {
    private static boolean loadClassFailed;
    private static Method sidxGetBitRate;
    private static Method sidxGetEndIndex;
    private static Method sidxGetFileId;
    private static Method sidxGetItem;
    private static Method sidxGetMediaType;
    private static Method sidxGetStartIndex;
    private static Method sidxGetTotalNum;
    private static Class<?> sidxListObjectClass;
    private boolean loadObjectSucceed;
    private Long mBitrate;
    private Integer mEndIndex;
    private String mFileId;
    private Integer mMediaType;
    private Integer mStartIndex;
    private Integer mTotalNum;
    private Object playerSidxList;

    public long getBitrate() {
        Method method;
        Long l = this.mBitrate;
        if (l != null) {
            return l.longValue();
        }
        if (!this.loadObjectSucceed || (method = sidxGetBitRate) == null) {
            return -1;
        }
        try {
            Long l2 = (Long) method.invoke(this.playerSidxList, new Object[0]);
            this.mBitrate = l2;
            return l2.longValue();
        } catch (Exception unused) {
            this.mBitrate = -1L;
            return -1;
        }
    }

    public int getEndIndex() {
        Method method;
        Integer num = this.mEndIndex;
        if (num != null) {
            return num.intValue();
        }
        if (!this.loadObjectSucceed || (method = sidxGetEndIndex) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) method.invoke(this.playerSidxList, new Object[0]);
            this.mEndIndex = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public String getFileId() {
        Method method;
        String str = this.mFileId;
        if (str != null) {
            return str;
        }
        if (this.loadObjectSucceed && (method = sidxGetFileId) != null) {
            try {
                this.mFileId = (String) method.invoke(this.playerSidxList, new Object[0]);
            } catch (Exception unused) {
                this.mFileId = null;
            }
        }
        return this.mFileId;
    }

    public List<? extends Object> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!this.loadObjectSucceed || sidxGetItem == null) {
            return arrayList;
        }
        for (int i = 0; getStartIndex() + i <= getEndIndex(); i++) {
            try {
                arrayList.add(new SegmentItem(sidxGetItem.invoke(this.playerSidxList, Integer.valueOf(i))));
            } catch (Exception unused) {
                return null;
            }
        }
        return arrayList;
    }

    public int getMediaType() {
        Method method;
        Integer num = this.mMediaType;
        if (num != null) {
            return num.intValue();
        }
        if (!this.loadObjectSucceed || (method = sidxGetMediaType) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) method.invoke(this.playerSidxList, new Object[0]);
            this.mMediaType = num2;
            return num2.intValue();
        } catch (Exception unused) {
            this.mMediaType = -1;
            return -1;
        }
    }

    public int getStartIndex() {
        Method method;
        Integer num = this.mStartIndex;
        if (num != null) {
            return num.intValue();
        }
        if (!this.loadObjectSucceed || (method = sidxGetStartIndex) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) method.invoke(this.playerSidxList, new Object[0]);
            this.mStartIndex = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getTotalNum() {
        Method method;
        Integer num = this.mTotalNum;
        if (num != null) {
            return num.intValue();
        }
        if (!this.loadObjectSucceed || (method = sidxGetTotalNum) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) method.invoke(this.playerSidxList, new Object[0]);
            this.mTotalNum = num2;
            return num2.intValue();
        } catch (Exception unused) {
            this.mTotalNum = -1;
            return -1;
        }
    }

    public SegmentInfo(Object obj) {
        this.playerSidxList = obj;
        Class<?> cls = sidxListObjectClass;
        if (cls == null && !loadClassFailed) {
            try {
                Class<?> clzUsingPluginLoader = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.SidxListObject");
                sidxListObjectClass = clzUsingPluginLoader;
                sidxGetMediaType = clzUsingPluginLoader.getMethod("getMediaType", new Class[0]);
                sidxGetTotalNum = sidxListObjectClass.getMethod("getTotalNum", new Class[0]);
                sidxGetStartIndex = sidxListObjectClass.getMethod("getStartIndex", new Class[0]);
                sidxGetEndIndex = sidxListObjectClass.getMethod("getEndIndex", new Class[0]);
                sidxGetBitRate = sidxListObjectClass.getMethod("getBitrate", new Class[0]);
                sidxGetFileId = sidxListObjectClass.getMethod("getFileId", new Class[0]);
                sidxGetItem = sidxListObjectClass.getMethod("getItem", Integer.TYPE);
            } catch (Exception unused) {
                this.playerSidxList = null;
                loadClassFailed = true;
            }
        } else if (cls == null) {
            this.playerSidxList = null;
        }
        Object obj2 = this.playerSidxList;
        if (obj2 != null && obj2.getClass().equals(sidxListObjectClass)) {
            this.loadObjectSucceed = true;
        }
    }
}
