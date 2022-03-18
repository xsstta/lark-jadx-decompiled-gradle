package com.ss.ttvideoengine;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SubDesInfoModel implements SubDesInfoModelProvider {
    private final ArrayList<SubModelProvider> mSubModelList = new ArrayList<>();

    public ArrayList<SubModelProvider> getSubModelList() {
        return this.mSubModelList;
    }

    @Override // com.ss.ttvideoengine.SubDesInfoModelProvider
    public int subtitleCount() {
        return this.mSubModelList.size();
    }

    @Override // com.ss.ttvideoengine.SubDesInfoModelProvider
    public String toString() {
        if (this.mSubModelList.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.mSubModelList.size(); i++) {
                JSONObject json = this.mSubModelList.get(i).toJson();
                if (json != null && json.has("url") && json.has("language_id") && json.has("format") && json.has("sub_id")) {
                    jSONArray.put(json);
                }
            }
            try {
                jSONObject.putOpt("list", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                TTVideoEngineLog.m256501d(e);
            }
        }
        return null;
    }

    public SubDesInfoModel(ArrayList<SubModelProvider> arrayList) {
        SubModelProvider subModelProvider;
        JSONObject json;
        if (arrayList.size() > 0) {
            int i = 0;
            while (i < arrayList.size() && (json = (subModelProvider = arrayList.get(i)).toJson()) != null) {
                if (json.has("url") && json.has("language_id") && json.has("format") && json.has("sub_id")) {
                    this.mSubModelList.add(subModelProvider);
                }
                i++;
            }
        }
    }

    public SubDesInfoModel(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject.has("list") && (optJSONArray = jSONObject.optJSONArray("list")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has("language_id") && optJSONObject.has("format") && optJSONObject.has("url") && optJSONObject.has("sub_id")) {
                    this.mSubModelList.add(new SubModel(optJSONObject));
                }
            }
        }
    }
}
