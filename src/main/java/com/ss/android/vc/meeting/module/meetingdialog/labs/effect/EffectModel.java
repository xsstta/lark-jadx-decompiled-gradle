package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EffectModel implements Serializable {
    String category;
    Effect effect;
    public boolean isDisabled;
    String panel;
    List<TagModel> tags;

    public boolean isAnimoji() {
        return false;
    }

    public boolean isBeautify() {
        return false;
    }

    public boolean isBeautifyStyle() {
        return false;
    }

    public enum BeautifyStyle {
        UNKNOWN(-1),
        ORIGINAL(0),
        AUTO(1),
        CUSTOMIZE(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        private BeautifyStyle(int i) {
            this.value = i;
        }
    }

    public static class TagModel implements Serializable {
        int defaultValue;
        int max;
        int min;
        String name;
        String tag;
        int userValue;

        public int getDefaultValue() {
            return this.defaultValue;
        }

        public int getMax() {
            return this.max;
        }

        public int getMin() {
            return this.min;
        }

        public String getName() {
            return this.name;
        }

        public String getTag() {
            return this.tag;
        }

        public int getUserValue() {
            return this.userValue;
        }

        public void setUserValue(int i) {
            this.userValue = i;
        }
    }

    private EffectModel() {
    }

    public String getCategory() {
        return this.category;
    }

    public String getPanel() {
        return this.panel;
    }

    public static EffectModel newDisabledAnimoji() {
        AnimojiEffect animojiEffect = new AnimojiEffect("default", "online335-980", null);
        animojiEffect.isDisabled = true;
        return animojiEffect;
    }

    public static EffectModel newDisabledFilter() {
        FilterEffect filterEffect = new FilterEffect("vc-beautyandfilter", "beautyfilter", null);
        filterEffect.isDisabled = true;
        return filterEffect;
    }

    public String getEffectId() {
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return "";
        }
        return effect2.getEffectId();
    }

    public String getName() {
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return "";
        }
        return effect2.getName();
    }

    public String getResourceId() {
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return "";
        }
        return effect2.getResourceId();
    }

    public String getUnzipPath() {
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return "";
        }
        return effect2.getUnzipPath();
    }

    public boolean hasTags() {
        getTags();
        return !this.tags.isEmpty();
    }

    public int getTagMaxValue() {
        getTags();
        if (this.tags.isEmpty()) {
            return 0;
        }
        return this.tags.get(0).max;
    }

    public int getTagMinValue() {
        getTags();
        if (this.tags.isEmpty()) {
            return 0;
        }
        return this.tags.get(0).min;
    }

    public int getTagUserValue() {
        getTags();
        if (this.tags.isEmpty()) {
            return 0;
        }
        return this.tags.get(0).userValue;
    }

    public String getIconUrl() {
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return "";
        }
        for (String str : effect2.getIconUrl().getUrlList()) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public int getTagDefaultValue() {
        getTags();
        if (this.tags.isEmpty() || this.tags.get(0) == null) {
            return 0;
        }
        return this.tags.get(0).defaultValue;
    }

    public synchronized List<TagModel> getTags() {
        List<TagModel> list = this.tags;
        if (list != null) {
            return list;
        }
        List<TagModel> emptyList = Collections.emptyList();
        this.tags = emptyList;
        Effect effect2 = this.effect;
        if (effect2 == null) {
            return emptyList;
        }
        String extra = effect2.getExtra();
        if (TextUtils.isEmpty(extra)) {
            return this.tags;
        }
        try {
            String optString = new JSONObject(extra).optString("vc_says_effect");
            if (TextUtils.isEmpty(optString)) {
                return this.tags;
            }
            JSONArray optJSONArray = new JSONObject(optString).optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return this.tags;
            }
            this.tags = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                TagModel tagModel = new TagModel();
                tagModel.tag = jSONObject.optString("tag");
                tagModel.name = jSONObject.optString("name");
                tagModel.min = jSONObject.optInt("min");
                tagModel.max = jSONObject.optInt("max");
                tagModel.defaultValue = jSONObject.getInt("value");
                tagModel.userValue = tagModel.defaultValue;
                this.tags.add(tagModel);
            }
            return this.tags;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setTagDefaultValue(int i) {
        getTags();
        List<TagModel> list = this.tags;
        if (list != null) {
            for (TagModel tagModel : list) {
                tagModel.defaultValue = i;
            }
        }
    }

    public void setTagUserValue(int i) {
        getTags();
        List<TagModel> list = this.tags;
        if (list != null) {
            for (TagModel tagModel : list) {
                tagModel.setUserValue(i);
            }
        }
    }

    public static BeautifyEffect newBeautifyEffectModel(EffectModel effectModel, int i) {
        BeautifyEffect beautifyEffect = new BeautifyEffect(effectModel.panel, effectModel.category, effectModel.effect);
        ArrayList arrayList = new ArrayList();
        if (effectModel.getTags() != null) {
            for (TagModel tagModel : effectModel.getTags()) {
                TagModel tagModel2 = new TagModel();
                tagModel2.tag = tagModel.tag;
                tagModel2.name = tagModel.name;
                tagModel2.min = tagModel.min;
                tagModel2.max = tagModel.max;
                tagModel2.defaultValue = effectModel.getTagDefaultValue();
                tagModel2.userValue = i;
                arrayList.add(tagModel2);
            }
        }
        beautifyEffect.tags = arrayList;
        return beautifyEffect;
    }

    public EffectModel(String str, String str2, Effect effect2) {
        this.panel = str;
        this.category = str2;
        this.effect = effect2;
    }
}
