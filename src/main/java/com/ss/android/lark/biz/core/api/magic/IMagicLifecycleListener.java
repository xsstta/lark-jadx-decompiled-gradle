package com.ss.android.lark.biz.core.api.magic;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J,\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&J4\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/biz/core/api/magic/IMagicLifecycleListener;", "", "onCancelOpen", "", "uniqueTag", "", "scenarioId", "taskId", "onChecked", "success", "", "errorInfo", "Lcom/ss/android/lark/biz/core/api/magic/ErrorInfo;", "onClosed", "submitted", "onOpened", "onOpening", "onPreCheck", "onPreOpen", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.c.b */
public interface IMagicLifecycleListener {
    /* renamed from: a */
    void mo105687a(String str, String str2);

    /* renamed from: a */
    void mo105688a(String str, String str2, String str3);

    /* renamed from: a */
    void mo105689a(String str, String str2, String str3, boolean z);

    /* renamed from: a */
    void mo105690a(String str, String str2, String str3, boolean z, ErrorInfo aVar);

    /* renamed from: a */
    void mo105691a(String str, String str2, boolean z, ErrorInfo aVar);

    /* renamed from: b */
    void mo105692b(String str, String str2, String str3);

    /* renamed from: c */
    void mo105693c(String str, String str2, String str3);
}
