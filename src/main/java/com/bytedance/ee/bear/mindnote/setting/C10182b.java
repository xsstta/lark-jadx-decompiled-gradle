package com.bytedance.ee.bear.mindnote.setting;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.mindnote.setting.b */
public class C10182b extends AbstractC1142af {
    private C1177w<MindNoteSettingData> mData = new C1177w<>();
    private AbstractC10183a mDelegate;

    /* renamed from: com.bytedance.ee.bear.mindnote.setting.b$a */
    public interface AbstractC10183a {
        void processOnClick(String str, String str2);
    }

    public LiveData<MindNoteSettingData> getData() {
        return this.mData;
    }

    public void setDelegate(AbstractC10183a aVar) {
        this.mDelegate = aVar;
    }

    public void setData(MindNoteSettingData mindNoteSettingData) {
        this.mData.mo5929b(mindNoteSettingData);
    }

    public void processOnClick(String str, String str2) {
        AbstractC10183a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.processOnClick(str, str2);
        }
    }
}
