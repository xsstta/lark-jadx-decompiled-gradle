package com.ss.android.lark.chat.utils;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/utils/MessageCellUtils;", "", "()V", "getCellRadius", "", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "roundRadius", "", "defaultRadius", "isRTLDisplayContent", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.n */
public final class MessageCellUtils {

    /* renamed from: a */
    public static final MessageCellUtils f88694a = new MessageCellUtils();

    @JvmStatic
    /* renamed from: a */
    public static final float[] m133195a(OpenMessageVO<?> cVar) {
        return m133198a(cVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final float[] m133196a(OpenMessageVO<?> cVar, float f) {
        return m133198a(cVar, f, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    private MessageCellUtils() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m133199b(OpenMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$isRTLDisplayContent");
        if (!(cVar instanceof ChatMessageVO) || !((ChatMessageVO) cVar).ag()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final float[] m133197a(OpenMessageVO<?> cVar, float f, float f2) {
        float f3;
        Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        int m = cVar.mo121705m();
        if (m == 1 || m == 2) {
            f3 = f2;
        } else {
            f3 = f;
        }
        if (m == 1 || m == 0) {
            f2 = f;
        }
        float[] fArr = new float[4];
        for (int i = 0; i < 4; i++) {
            fArr[i] = f;
        }
        if (m133199b(cVar)) {
            fArr[2] = f2;
            fArr[3] = f3;
        } else {
            fArr[0] = f2;
            fArr[1] = f3;
        }
        return fArr;
    }

    /* renamed from: a */
    public static /* synthetic */ float[] m133198a(OpenMessageVO cVar, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 2.0f;
        }
        return m133197a(cVar, f, f2);
    }
}
