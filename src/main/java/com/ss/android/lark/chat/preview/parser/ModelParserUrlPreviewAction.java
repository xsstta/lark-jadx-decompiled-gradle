package com.ss.android.lark.chat.preview.parser;

import com.bytedance.lark.pb.basic.v1.URL;
import com.bytedance.lark.pb.basic.v1.UrlPreviewAction;
import com.ss.android.lark.chat.entity.preview.Parameters;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J*\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/preview/parser/ModelParserUrlPreviewAction;", "", "()V", "parseParametersFromPb", "Lcom/ss/android/lark/chat/entity/preview/Parameters;", "pbParameters", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewAction$Parameters;", "parseURLFromPb", "Lcom/ss/android/lark/chat/entity/preview/Url;", "pbUrl", "Lcom/bytedance/lark/pb/basic/v1/URL;", "parseUrlPreviewActionFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "pbAction", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewAction;", "parseUrlPreviewActionsFromPb", "", "", "pbActions", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.c.b */
public final class ModelParserUrlPreviewAction {

    /* renamed from: a */
    public static final ModelParserUrlPreviewAction f88126a = new ModelParserUrlPreviewAction();

    private ModelParserUrlPreviewAction() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Parameters m132268a(UrlPreviewAction.Parameters parameters) {
        if (parameters == null) {
            return null;
        }
        Map<String, String> map = parameters.parameters;
        Intrinsics.checkExpressionValueIsNotNull(map, "pbParameters.parameters");
        return new Parameters(map, parameters.user_id, parameters.source_id, parameters.preview_id);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Url m132269a(URL url) {
        if (url == null) {
            return null;
        }
        return new Url(url.url, url.ios, url.f175430android, url.pc, url.web);
    }

    @JvmStatic
    /* renamed from: a */
    public static final com.ss.android.lark.chat.entity.preview.UrlPreviewAction m132270a(UrlPreviewAction urlPreviewAction) {
        Intrinsics.checkParameterIsNotNull(urlPreviewAction, "pbAction");
        String str = urlPreviewAction.url;
        Intrinsics.checkExpressionValueIsNotNull(str, "pbAction.url");
        UrlPreviewAction.Method.Companion aVar = UrlPreviewAction.Method.Companion;
        UrlPreviewAction.Method method = urlPreviewAction.method;
        Intrinsics.checkExpressionValueIsNotNull(method, "pbAction.method");
        UrlPreviewAction.Method a = aVar.mo125828a(method.getValue());
        Parameters a2 = m132268a(urlPreviewAction.parameters);
        Integer num = urlPreviewAction.cmd;
        Intrinsics.checkExpressionValueIsNotNull(num, "pbAction.cmd");
        return new com.ss.android.lark.chat.entity.preview.UrlPreviewAction(str, a, a2, num.intValue(), urlPreviewAction.packet, m132269a(urlPreviewAction.open_url), urlPreviewAction.fallback_action_id);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, com.ss.android.lark.chat.entity.preview.UrlPreviewAction> m132271a(Map<String, com.bytedance.lark.pb.basic.v1.UrlPreviewAction> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, com.bytedance.lark.pb.basic.v1.UrlPreviewAction> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), m132270a(entry.getValue()));
            }
        }
        return linkedHashMap;
    }
}
