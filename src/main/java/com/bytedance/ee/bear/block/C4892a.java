package com.bytedance.ee.bear.block;

import android.app.Activity;
import com.bytedance.ee.bear.block.jira.JiraPlugin;
import com.bytedance.ee.bear.block.jira.JiraUtil;

/* renamed from: com.bytedance.ee.bear.block.a */
public class C4892a implements AbstractC4896c {
    @Override // com.bytedance.ee.bear.block.AbstractC4896c
    /* renamed from: a */
    public boolean mo19203a(String str) {
        return JiraUtil.m20229a(str);
    }

    @Override // com.bytedance.ee.bear.block.AbstractC4896c
    /* renamed from: a */
    public boolean mo19204a(String str, Activity activity) {
        return JiraPlugin.interceptJiraUrl(str, activity);
    }
}
