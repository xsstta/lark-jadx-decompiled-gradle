package com.bytedance.ee.bear.document.toolbar.media;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.toolbar.media.impl.SelectedMediaItem;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.toolbar.media.b */
public interface AbstractC6232b {
    /* renamed from: a */
    FragmentActivity mo25168a();

    /* renamed from: a */
    Disposable mo25169a(List<SelectedMediaItem> list);

    /* renamed from: a */
    void mo25170a(String str, JSONObject jSONObject);

    /* renamed from: b */
    boolean mo25171b();
}
