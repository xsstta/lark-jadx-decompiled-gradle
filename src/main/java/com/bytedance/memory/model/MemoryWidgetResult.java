package com.bytedance.memory.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MemoryWidgetResult implements Serializable {
    private static final long serialVersionUID = 5865887187300488157L;
    private List<ResultLeakNode> mActivityLeakNodes = new ArrayList();
    private List<ResultLeakNode> mBigObjLeakNodes = new ArrayList();
    private List<ResultLeakNode> mBitmapLeakNodes = new ArrayList();
    private List<ClassNumber> mClassNumbers = new ArrayList();
    private MemoryWidgetMonitor mMemoryWidgetMonitor = new MemoryWidgetMonitor();

    public static class MemoryWidgetMonitor implements Serializable {
        private static final long serialVersionUID = -5276649811675595534L;
        private int appHeapInstanceSize;
        private long gcDurationMs;
        private long heapDumpDurationMs;
        private String heapDumpFilePath;
        private long heapDumpFileSize;
        private boolean isDebug;
        private int leakTraceSize;
        private String referenceName;
        private String stepTrace;
        private long watchDurationMs;

        public int getAppHeapInstanceSize() {
            return this.appHeapInstanceSize;
        }

        public long getGcDurationMs() {
            return this.gcDurationMs;
        }

        public long getHeapDumpDurationMs() {
            return this.heapDumpDurationMs;
        }

        public String getHeapDumpFilePath() {
            return this.heapDumpFilePath;
        }

        public long getHeapDumpFileSize() {
            return this.heapDumpFileSize;
        }

        public int getLeakTraceSize() {
            return this.leakTraceSize;
        }

        public String getReferenceName() {
            return this.referenceName;
        }

        public String getStepTrace() {
            return this.stepTrace;
        }

        public long getWatchDurationMs() {
            return this.watchDurationMs;
        }

        public boolean isDebug() {
            return this.isDebug;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appHeapInstanceSize", getAppHeapInstanceSize());
                jSONObject.put("gcDurationMs", getGcDurationMs());
                jSONObject.put("heapDumpDurationMs", getHeapDumpDurationMs());
                jSONObject.put("heapDumpFilePath", getHeapDumpFilePath());
                jSONObject.put("heapDumpFileSize", getHeapDumpFileSize());
                jSONObject.put("leakTraceSize", getLeakTraceSize());
                jSONObject.put("referenceName", getReferenceName());
                jSONObject.put("stepTrace", getStepTrace());
                jSONObject.put("watchDurationMs", getWatchDurationMs());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }

        public void setAppHeapInstanceSize(int i) {
            this.appHeapInstanceSize = i;
        }

        public void setDebug(boolean z) {
            this.isDebug = z;
        }

        public void setGcDurationMs(long j) {
            this.gcDurationMs = j;
        }

        public void setHeapDumpDurationMs(long j) {
            this.heapDumpDurationMs = j;
        }

        public void setHeapDumpFilePath(String str) {
            this.heapDumpFilePath = str;
        }

        public void setHeapDumpFileSize(long j) {
            this.heapDumpFileSize = j;
        }

        public void setLeakTraceSize(int i) {
            this.leakTraceSize = i;
        }

        public void setReferenceName(String str) {
            this.referenceName = str;
        }

        public void setStepTrace(String str) {
            this.stepTrace = str;
        }

        public void setWatchDurationMs(long j) {
            this.watchDurationMs = j;
        }
    }

    public static class ResultLeakNode implements Serializable {
        private static final long serialVersionUID = -3143585016293965793L;
        private String leakClass;
        private String leakTrace;
        private double retainedHeapSize;

        public String getLeakClass() {
            return this.leakClass;
        }

        public String getLeakTrace() {
            return this.leakTrace;
        }

        public double getRetainedHeapSize() {
            return this.retainedHeapSize;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("object_class", getLeakClass());
                jSONObject.put("object_trace", getLeakTrace());
                jSONObject.put("retained_heap_size", getRetainedHeapSize());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }

        public void setLeakClass(String str) {
            this.leakClass = str;
        }

        public void setLeakTrace(String str) {
            this.leakTrace = str;
        }

        public void setRetainedHeapSize(double d) {
            this.retainedHeapSize = d;
        }
    }

    public List<ResultLeakNode> getActivityLeakNodes() {
        return this.mActivityLeakNodes;
    }

    public List<ResultLeakNode> getBigObjLeakNodes() {
        return this.mBigObjLeakNodes;
    }

    public List<ResultLeakNode> getBitmapLeakNodes() {
        return this.mBitmapLeakNodes;
    }

    public List<ClassNumber> getClassNumbers() {
        return this.mClassNumbers;
    }

    public MemoryWidgetMonitor getMemoryWidgetMonitor() {
        return this.mMemoryWidgetMonitor;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        for (ResultLeakNode resultLeakNode : this.mBigObjLeakNodes) {
            try {
                jSONArray.put(new JSONObject(resultLeakNode.toString()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (ResultLeakNode resultLeakNode2 : this.mActivityLeakNodes) {
            try {
                jSONArray2.put(new JSONObject(resultLeakNode2.toString()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        for (ResultLeakNode resultLeakNode3 : this.mBitmapLeakNodes) {
            try {
                jSONArray3.put(new JSONObject(resultLeakNode3.toString()));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        for (ClassNumber classNumber : this.mClassNumbers) {
            try {
                jSONArray4.put(new JSONObject(classNumber.toString()));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        wrapToJson(jSONObject, jSONArray, jSONArray2, jSONArray3, jSONArray4);
        return jSONObject.toString();
    }

    public void setActivityLeakNodes(List<ResultLeakNode> list) {
        this.mActivityLeakNodes = list;
    }

    public void setBigObjLeakNodes(List<ResultLeakNode> list) {
        this.mBigObjLeakNodes = list;
    }

    public void setBitmapLeakNodes(List<ResultLeakNode> list) {
        this.mBitmapLeakNodes = list;
    }

    public void setClassNumbers(List<ClassNumber> list) {
        this.mClassNumbers = list;
    }

    public void setMemoryWidgetMonitor(MemoryWidgetMonitor memoryWidgetMonitor) {
        this.mMemoryWidgetMonitor = memoryWidgetMonitor;
    }

    private void transformLeakNodes(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            ResultLeakNode resultLeakNode = new ResultLeakNode();
            try {
                resultLeakNode.setRetainedHeapSize(jSONArray.getJSONObject(0).optDouble("retainedHeapSize"));
                resultLeakNode.setLeakClass(jSONArray.getJSONObject(0).optString("leakClass"));
                resultLeakNode.setLeakTrace(jSONArray.getJSONObject(0).optString("leakTrace"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mBigObjLeakNodes.add(resultLeakNode);
        }
    }

    private void transformMonitor(JSONObject jSONObject) {
        this.mMemoryWidgetMonitor.setAppHeapInstanceSize(jSONObject.optInt("appHeapInstanceSize"));
        this.mMemoryWidgetMonitor.setLeakTraceSize(jSONObject.optInt("LeakTraceSize"));
        this.mMemoryWidgetMonitor.setHeapDumpFilePath(jSONObject.optString("heapDumpFilePath"));
        this.mMemoryWidgetMonitor.setHeapDumpFileSize((long) jSONObject.optInt("heapDumpFileSize"));
        this.mMemoryWidgetMonitor.setReferenceName(jSONObject.optString("referenceName"));
        this.mMemoryWidgetMonitor.setDebug(jSONObject.optBoolean("isDebug"));
        this.mMemoryWidgetMonitor.setWatchDurationMs((long) jSONObject.optInt("watchDurationMs"));
        this.mMemoryWidgetMonitor.setGcDurationMs((long) jSONObject.optInt("gcDurationMs"));
        this.mMemoryWidgetMonitor.setHeapDumpDurationMs((long) jSONObject.optInt("heapDumpDurationMs"));
    }

    public void transForm(JSONArray jSONArray, JSONObject jSONObject) {
        transformLeakNodes(jSONArray);
        transformMonitor(jSONObject);
    }

    private void wrapToJson(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        try {
            jSONObject.put("object_node", jSONArray);
            jSONObject.put("activity_node", jSONArray2);
            jSONObject.put("bitmap_node", jSONArray3);
            jSONObject.put("instance_count_node", jSONArray4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
