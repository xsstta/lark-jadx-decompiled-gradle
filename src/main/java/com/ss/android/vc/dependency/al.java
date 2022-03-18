package com.ss.android.vc.dependency;

import android.util.SparseArray;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.net.request.VcBizTask;
import java.util.Map;

public interface al {
    /* renamed from: a */
    RichText mo208736a(com.ss.android.lark.widget.richtext.RichText richText);

    /* renamed from: a */
    com.ss.android.lark.widget.richtext.RichText mo208737a(RichText richText);

    /* renamed from: a */
    Map<String, OpenChatter> mo208738a(Map<String, Chatter> map);

    /* renamed from: a */
    void mo208739a(ErrorResult errorResult, VcBizTask.onErrorCallback onerrorcallback, Object obj, String str);

    /* renamed from: a */
    boolean mo208740a();

    /* renamed from: a */
    boolean mo208741a(Participant participant);

    /* renamed from: b */
    boolean mo208742b();

    /* renamed from: c */
    String mo208743c();

    /* renamed from: d */
    String mo208744d();

    /* renamed from: e */
    SparseArray<Integer> mo208745e();
}
