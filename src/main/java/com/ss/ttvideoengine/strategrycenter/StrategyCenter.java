package com.ss.ttvideoengine.strategrycenter;

import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import com.bytedance.vcloud.networkpredictor.AbstractC20887b;
import com.bytedance.vcloud.networkpredictor.AbstractC20890e;
import com.bytedance.vcloud.networkpredictor.AbstractC20891f;
import com.bytedance.vcloud.networkpredictor.C20885a;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Locale;
import java.util.Map;

public class StrategyCenter {
    private static MLComponentManager sComponentManager;
    private static Map sConfigInfo;
    public static AbstractC20887b sNetAbrSpeedPredictor;
    public static AbstractC20887b sNetSpeedPredictor;
    private static AbstractC20890e speedPredictorListener;
    private static AbstractC20891f speedPredictorMlConfig;

    private static class StrategyCenterHolder {
        public static final StrategyCenter instance = new StrategyCenter();

        private StrategyCenterHolder() {
        }
    }

    private StrategyCenter() {
    }

    public static StrategyCenter getInstance() {
        return StrategyCenterHolder.instance;
    }

    public static void closeNewStartAndSelectGearSpeedPredictor() {
        sNetSpeedPredictor.mo70593d();
    }

    public static void setConfigInfo(Map map) {
        sConfigInfo = map;
    }

    public static void setSpeedPredictorListener(AbstractC20890e eVar) {
        speedPredictorListener = eVar;
    }

    public static void setSpeedPredictorMLComponent(MLComponentManager mLComponentManager) {
        sComponentManager = mLComponentManager;
    }

    public static void setSpeedPredictorMlConfig(AbstractC20891f fVar) {
        speedPredictorMlConfig = fVar;
    }

    public static void setSpeedQueueSize(int i) {
        AbstractC20887b bVar = sNetSpeedPredictor;
        if (bVar != null) {
            bVar.mo70592c(i);
        }
    }

    public static void createNewStartAndSelectGearSpeedPredictor(int i) {
        if (sNetSpeedPredictor == null) {
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[IESSpeedPredictor] start new speed predictor, type:%d", Integer.valueOf(i)));
            DefaultSpeedPredictor defaultSpeedPredictor = new DefaultSpeedPredictor(i);
            sNetSpeedPredictor = defaultSpeedPredictor;
            defaultSpeedPredictor.mo70588a(sConfigInfo);
            sNetSpeedPredictor.mo70585a(sComponentManager);
            sNetSpeedPredictor.mo70596g();
            sNetSpeedPredictor.mo70597h();
        }
    }

    public static void createSpeedPredictor(int i) {
        if (sNetSpeedPredictor == null) {
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[IESSpeedPredictor] start speed predictor, type:%d", Integer.valueOf(i)));
            if (i == 1 || i == 0 || i == 2 || i == 3) {
                sNetSpeedPredictor = new DefaultSpeedPredictor(i);
                return;
            }
            try {
                C20885a aVar = new C20885a(speedPredictorListener);
                sNetSpeedPredictor = aVar;
                aVar.mo70602a(i, speedPredictorMlConfig);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void createAbrSpeedPredictor(int i, int i2) {
        if (sNetAbrSpeedPredictor == null) {
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[ABR] start speed predictor, type:%d，intervalMs:%d", Integer.valueOf(i), Integer.valueOf(i2)));
            sNetAbrSpeedPredictor = new DefaultSpeedPredictor(i);
        }
    }
}
