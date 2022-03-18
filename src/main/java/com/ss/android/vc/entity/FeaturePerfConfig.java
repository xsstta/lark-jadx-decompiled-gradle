package com.ss.android.vc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FeaturePerfConfig implements Serializable {
    @JSONField(name = "dynamic")
    public Dynamic dynamic = new Dynamic();
    @JSONField(name = "static")
    public Static sstatic = new Static();

    public static class DEffect implements Serializable {
        @JSONField(name = "detection")
        public Detection detection;
        @JSONField(name = "range")
        public Range range;
    }

    public static class Detection implements Serializable {
        @JSONField(name = "action_interval")
        public int actionInterval;
        @JSONField(name = "entry_meeting_duration")
        public int entryMeetingDuration;
        @JSONField(name = "overload_duration")
        public int overloadDuration;
        @JSONField(name = "overload_rules")
        public List<Rule> overloadRules = Collections.emptyList();
    }

    public static class Dynamic implements Serializable {
        @JSONField(name = "effect")
        public List<DEffect> effect = Collections.emptyList();
    }

    public static class Range implements Serializable {
        @JSONField(name = "max")
        public int max;
        @JSONField(name = "min")
        public int min;
    }

    public static class Rule implements Serializable {
        @JSONField(name = "app_cpu")
        public int appCpu;
        @JSONField(name = "system_cpu")
        public int systemCpu;
    }

    public static class Static implements Serializable {
        @JSONField(name = "effect")
        public List<Effect> effect = Collections.emptyList();
    }

    public boolean isValid() {
        return true;
    }

    public static class Effect implements Serializable {
        @JSONField(name = "cpu_cores")
        public int cpuCores = 4;
        @JSONField(name = "cpu_frequency")
        public float cpuFrequency = 1.59f;
        @JSONField(name = "cpu_threads")
        public int cpuThreads;
        @JSONField(name = "memory")
        public int memory = 2;

        public String toString() {
            return "Effect{cpuFrequency=" + this.cpuFrequency + ", memory=" + this.memory + ", cpuCores=" + this.cpuCores + ", cpuThreads=" + this.cpuThreads + '}';
        }
    }

    public static FeaturePerfConfig createDefault() {
        FeaturePerfConfig featurePerfConfig = new FeaturePerfConfig();
        featurePerfConfig.sstatic = new Static();
        featurePerfConfig.dynamic = new Dynamic();
        featurePerfConfig.sstatic.effect = new ArrayList();
        featurePerfConfig.sstatic.effect.add(new Effect());
        return featurePerfConfig;
    }
}
