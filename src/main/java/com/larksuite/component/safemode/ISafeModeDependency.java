package com.larksuite.component.safemode;

import kotlin.Metadata;
import org.json.JSONArray;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/safemode/ISafeModeDependency;", "", "getPatchInfos", "Lorg/json/JSONArray;", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.a */
public interface ISafeModeDependency {
    JSONArray getPatchInfos();
}
