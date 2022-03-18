package com.bytedance.geckox;

import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.HashMap;
import java.util.Map;

public class OptionCheckUpdateParams {
    private Map<String, Map<String, Object>> customParam = new HashMap();
    private boolean enableDownloadAutoRetry = true;
    private boolean enableRetry = true;
    private boolean enableThrottle = true;
    private boolean lazyUpdate;
    private AbstractC14267a listener;
    private LoopInterval.LoopLevel loopLevel;
    private int updatePriority = 1;

    public interface ChannelUpdatePriority {
    }

    public interface CustomValue {
        Object getValue();
    }

    public int getChannelUpdatePriority() {
        return this.updatePriority;
    }

    public Map<String, Map<String, Object>> getCustomParam() {
        return this.customParam;
    }

    public AbstractC14267a getListener() {
        return this.listener;
    }

    public LoopInterval.LoopLevel getLoopLevel() {
        return this.loopLevel;
    }

    public boolean isEnableDownloadAutoRetry() {
        return this.enableDownloadAutoRetry;
    }

    public boolean isEnableRetry() {
        return this.enableRetry;
    }

    public boolean isEnableThrottle() {
        return this.enableThrottle;
    }

    public boolean isLazyUpdate() {
        return this.lazyUpdate;
    }

    public OptionCheckUpdateParams setChannelUpdatePriority(int i) {
        this.updatePriority = i;
        return this;
    }

    public OptionCheckUpdateParams setCustomParam(Map<String, Map<String, Object>> map) {
        this.customParam = map;
        return this;
    }

    public OptionCheckUpdateParams setEnableDownloadAutoRetry(boolean z) {
        this.enableDownloadAutoRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableRetry(boolean z) {
        this.enableRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableThrottle(boolean z) {
        this.enableThrottle = z;
        return this;
    }

    public OptionCheckUpdateParams setLazyUpdate(boolean z) {
        this.lazyUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setListener(AbstractC14267a aVar) {
        this.listener = aVar;
        return this;
    }

    public OptionCheckUpdateParams setLoopLevel(LoopInterval.LoopLevel loopLevel2) {
        this.loopLevel = loopLevel2;
        return this;
    }
}
