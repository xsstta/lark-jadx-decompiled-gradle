package com.ss.ttvideoengine.selector.shift;

import android.text.TextUtils;
import android.util.Pair;
import com.ss.ttvideoengine.model.IVideoInfo;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.selector.SelectedInfo;
import com.ss.ttvideoengine.selector.Selector;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpeedShiftSelector implements Selector {
    protected IAutoBitrateSet autoBitrateSet;
    protected List<? extends IBandwidthSet> bandwidthSets;
    protected final IGearConfig gearConfig;
    protected List<? extends IGearSet> gearSets;
    private Shift[] mShifts;

    public static class Params {
        private double mSpeed;

        public Map<Integer, Object> build() {
            HashMap hashMap = new HashMap();
            hashMap.put(1, Double.valueOf(this.mSpeed));
            return hashMap;
        }

        public Params speed(double d) {
            this.mSpeed = d;
            return this;
        }
    }

    public SpeedShiftSelector(SpeedShiftConfig speedShiftConfig) {
        if (speedShiftConfig != null) {
            this.gearConfig = speedShiftConfig.getIGearConfig();
            this.gearSets = speedShiftConfig.getIGearSets();
            this.bandwidthSets = speedShiftConfig.getIBandwidthSets();
            this.autoBitrateSet = speedShiftConfig.getIAutoBitrateSet();
        } else {
            this.gearConfig = null;
        }
        initShifts(this.gearSets);
    }

    private BitrateInfo calculateBitrateInfoByGearSet(double d) {
        Shift[] shiftArr;
        if (d > 0.0d && (shiftArr = this.mShifts) != null) {
            double d2 = Double.MAX_VALUE;
            Shift shift = null;
            for (Shift shift2 : shiftArr) {
                double abs = Math.abs(shift2.getMedianThreshold() - d);
                if (abs < d2) {
                    shift = shift2;
                    d2 = abs;
                }
            }
            if (shift != null) {
                return new BitrateInfo(shift.mRate, false);
            }
        }
        return null;
    }

    private BitrateInfo calculateBitrateInfoByAutoBitrateSet(double d) {
        IAutoBitrateSet iAutoBitrateSet;
        if (d <= 0.0d || (iAutoBitrateSet = this.autoBitrateSet) == null) {
            return null;
        }
        return new BitrateInfo(Math.max((iAutoBitrateSet.getFirstParam() * d * d * d) + (this.autoBitrateSet.getSecondParam() * d * d) + (this.autoBitrateSet.getThirdParam() * d) + this.autoBitrateSet.getFourthParam(), this.autoBitrateSet.getMinBitrate()), true);
    }

    private BitrateInfo calculateBitrateInfoByBandwidthSet(double d) {
        List<? extends IBandwidthSet> list;
        IBandwidthSet iBandwidthSet;
        if (d <= 0.0d || (list = this.bandwidthSets) == null || list.size() == 0) {
            return null;
        }
        Iterator<? extends IBandwidthSet> it = this.bandwidthSets.iterator();
        while (true) {
            if (!it.hasNext()) {
                iBandwidthSet = null;
                break;
            }
            iBandwidthSet = (IBandwidthSet) it.next();
            if (iBandwidthSet != null && d <= iBandwidthSet.getSpeed()) {
                break;
            }
        }
        if (iBandwidthSet == null) {
            List<? extends IBandwidthSet> list2 = this.bandwidthSets;
            iBandwidthSet = (IBandwidthSet) list2.get(list2.size() - 1);
        }
        if (iBandwidthSet == null) {
            return null;
        }
        return new BitrateInfo(iBandwidthSet.getBitrate(), true);
    }

    private void initShifts(List<? extends IGearSet> list) {
        if (!(list == null || list.isEmpty())) {
            this.mShifts = new Shift[list.size()];
            for (int i = 0; i < list.size(); i++) {
                IGearSet iGearSet = (IGearSet) list.get(i);
                this.mShifts[i] = new Shift((double) iGearSet.getBitRate(), ((double) iGearSet.getNetworkLower()) * 8000.0d, 8000.0d * ((double) iGearSet.getNetworkUpper()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public <T extends IVideoInfo> T getDefaultBitrate(List<T> list) throws BitrateNotMatchException {
        String defaultGearName = this.gearConfig.getDefaultGearName();
        double defaultBitrate = this.gearConfig.getDefaultBitrate();
        if (defaultBitrate <= 0.0d) {
            for (T t : list) {
                if (TextUtils.equals(t.getValueStr(7), defaultGearName)) {
                    return t;
                }
            }
            throw new BitrateNotMatchException(4, "defaultGearName = " + defaultGearName + " bitrates = " + list.toString());
        }
        double d = Double.MAX_VALUE;
        T t2 = null;
        for (T t3 : list) {
            double abs = Math.abs(((double) t3.getValueInt(3)) - defaultBitrate);
            if (d > abs) {
                t2 = t3;
                d = abs;
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public <T extends IVideoInfo> List<T> filter(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.gearConfig != null && !list.isEmpty()) {
            Pair<Double, Double> bitrateInterval = this.gearConfig.getBitrateInterval();
            Set<String> gearGroup = this.gearConfig.getGearGroup();
            if (bitrateInterval == null || this.gearConfig.getDefaultBitrate() <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
            for (T t : list) {
                if (z) {
                    double valueInt = (double) t.getValueInt(3);
                    if (valueInt >= ((Double) bitrateInterval.first).doubleValue() && valueInt <= ((Double) bitrateInterval.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (gearGroup != null && gearGroup.contains(t.getValueStr(7))) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 == null || Math.abs(((double) t3.getValueInt(3)) - this.gearConfig.getDefaultBitrate()) < Math.abs(((double) t2.getValueInt(3)) - this.gearConfig.getDefaultBitrate())) {
                            t2 = t3;
                        }
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(list.get(0));
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.ttvideoengine.selector.Selector
    public SelectedInfo select(IVideoModel iVideoModel, Map<Integer, Object> map) {
        if (iVideoModel == null) {
            return new SelectedInfo(new Error("kTTVideoSelector", -7999, "null video model"));
        }
        return select(iVideoModel.getVideoInfoList(), map);
    }

    private <T extends IVideoInfo> T findBitRate(BitrateInfo bitrateInfo, List<T> list) throws BitrateNotMatchException {
        if (bitrateInfo != null) {
            List<T> filter = filter(list);
            if (filter != null && !filter.isEmpty()) {
                return bitrateInfo.maxBitrate ? (T) findMaxBitrate(bitrateInfo.bitrate, filter) : (T) findNearestBitrate(bitrateInfo.bitrate, filter);
            }
            throw new BitrateNotMatchException(5, "Intersection bitrate list is empty.");
        } else if (this.gearConfig != null) {
            return (T) getDefaultBitrate(list);
        } else {
            throw new BitrateNotMatchException(6, "gear config is null");
        }
    }

    private <T extends IVideoInfo> T findMaxBitrate(double d, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    if (((double) t.getValueInt(3)) > d) {
                        if (t2.getValueInt(3) >= t.getValueInt(3)) {
                        }
                    } else if (d >= ((double) t2.getValueInt(3))) {
                        if (t2.getValueInt(3) < t.getValueInt(3)) {
                        }
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    private <T extends IVideoInfo> T findNearestBitrate(double d, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t == null || Math.abs(((double) t2.getValueInt(3)) - d) < Math.abs(((double) t.getValueInt(3)) - d)) {
                    t = t2;
                }
            }
        }
        return t;
    }

    private SelectedInfo select(List<? extends IVideoInfo> list, Map<Integer, Object> map) {
        boolean z;
        BitrateInfo bitrateInfo;
        Error error;
        Object obj;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return new SelectedInfo(new Error("kTTVideoSelector", -7999, "bitrate list is empty..."));
        }
        double d = -1.0d;
        if (!(map == null || (obj = map.get(1)) == null)) {
            try {
                d = ((Double) obj).doubleValue();
            } catch (ClassCastException e) {
                TTVideoEngineLog.m256503e("Selector", e.getMessage());
            }
        }
        if (this.autoBitrateSet != null) {
            bitrateInfo = calculateBitrateInfoByAutoBitrateSet(d);
        } else if (this.bandwidthSets != null) {
            bitrateInfo = calculateBitrateInfoByBandwidthSet(d);
        } else {
            bitrateInfo = calculateBitrateInfoByGearSet(d);
        }
        IVideoInfo iVideoInfo = null;
        try {
            error = null;
            iVideoInfo = findBitRate(bitrateInfo, list);
        } catch (BitrateNotMatchException e2) {
            error = new Error("kTTVideoSelector", -7998, e2.getMessage());
        }
        if (iVideoInfo == null) {
            iVideoInfo = (IVideoInfo) list.get(0);
        }
        SelectedInfo selectedInfo = new SelectedInfo(iVideoInfo, error);
        if (bitrateInfo != null) {
            selectedInfo.setDoubleValue(0, bitrateInfo.bitrate);
        }
        return selectedInfo;
    }
}
