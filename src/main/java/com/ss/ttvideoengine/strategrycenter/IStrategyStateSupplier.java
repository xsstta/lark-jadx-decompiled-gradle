package com.ss.ttvideoengine.strategrycenter;

import java.util.Map;

public interface IStrategyStateSupplier {

    /* renamed from: com.ss.ttvideoengine.strategrycenter.IStrategyStateSupplier$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Incorrect args count in method signature: (Lcom/ss/ttvideoengine/strategrycenter/StrategyMediaParam;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>; */
        public static Map $default$selectBitrate(IStrategyStateSupplier iStrategyStateSupplier, StrategyMediaParam strategyMediaParam) {
            return null;
        }
    }

    double getNetworkSpeed();

    Map<String, Object> mediaInfo(String str);

    Map<String, Integer> selectBitrate(StrategyMediaParam strategyMediaParam);

    Map<String, Integer> selectBitrate(String str, int i);
}
