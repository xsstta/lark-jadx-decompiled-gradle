package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 è\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002è\u0001B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010ã\u0001\u001a\u00030ä\u00012\b\u0010å\u0001\u001a\u00030æ\u00012\u0007\u0010ç\u0001\u001a\u00020DH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR4\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R4\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R4\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118F@FX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R4\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R$\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR4\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R$\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR$\u0010/\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR$\u00102\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR$\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR$\u00108\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR$\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR$\u0010>\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR$\u0010A\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR$\u0010E\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D8V@VX\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR$\u0010M\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D8V@VX\u000e¢\u0006\f\u001a\u0004\bN\u0010G\"\u0004\bO\u0010IR(\u0010P\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR$\u0010T\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020S8V@VX\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8V@VX\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b`\u0010\u000b\"\u0004\ba\u0010\rR$\u0010b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR$\u0010e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\bf\u0010\u000b\"\u0004\bg\u0010\rR$\u0010h\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020S8V@VX\u000e¢\u0006\f\u001a\u0004\bi\u0010V\"\u0004\bj\u0010XR$\u0010k\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D8V@VX\u000e¢\u0006\f\u001a\u0004\bl\u0010G\"\u0004\bm\u0010IR$\u0010n\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020S8V@VX\u000e¢\u0006\f\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR$\u0010q\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8V@VX\u000e¢\u0006\f\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^R$\u0010t\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D8V@VX\u000e¢\u0006\f\u001a\u0004\bu\u0010G\"\u0004\bv\u0010IR$\u0010w\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8V@VX\u000e¢\u0006\f\u001a\u0004\bx\u0010\\\"\u0004\by\u0010^R$\u0010z\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020S8V@VX\u000e¢\u0006\f\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR$\u0010}\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8V@VX\u000e¢\u0006\f\u001a\u0004\b~\u0010\\\"\u0004\b\u0010^R'\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR'\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR'\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR+\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0007\u001a\u00030\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0007\u001a\u00030\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0007\u001a\u00030\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0007\u001a\u00030\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0007\u001a\u00030\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR+\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR7\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0014\"\u0005\b \u0001\u0010\u0016R'\u0010¡\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b¢\u0001\u0010\u000b\"\u0005\b£\u0001\u0010\rR+\u0010¤\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b¥\u0001\u0010\u000b\"\u0005\b¦\u0001\u0010\rR'\u0010§\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b¨\u0001\u0010\u000b\"\u0005\b©\u0001\u0010\rR+\u0010ª\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b«\u0001\u0010\u000b\"\u0005\b¬\u0001\u0010\rR+\u0010­\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\b®\u0001\u0010\u000b\"\u0005\b¯\u0001\u0010\rR+\u0010±\u0001\u001a\u00030°\u00012\u0007\u0010\u0007\u001a\u00030°\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R+\u0010¶\u0001\u001a\u00030°\u00012\u0007\u0010\u0007\u001a\u00030°\u00018V@VX\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010³\u0001\"\u0006\b¸\u0001\u0010µ\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bº\u0001\u0010\u000b\"\u0005\b»\u0001\u0010\rR3\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00118V@VX\u000e¢\u0006\u000e\u001a\u0005\b½\u0001\u0010\u0014\"\u0005\b¾\u0001\u0010\u0016R'\u0010¿\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÀ\u0001\u0010\u000b\"\u0005\bÁ\u0001\u0010\rR'\u0010Â\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÃ\u0001\u0010\u000b\"\u0005\bÄ\u0001\u0010\rR'\u0010Å\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÆ\u0001\u0010\u000b\"\u0005\bÇ\u0001\u0010\rR'\u0010È\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÉ\u0001\u0010\u000b\"\u0005\bÊ\u0001\u0010\rR'\u0010Ë\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÌ\u0001\u0010\u000b\"\u0005\bÍ\u0001\u0010\rR'\u0010Î\u0001\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÏ\u0001\u0010G\"\u0005\bÐ\u0001\u0010IR7\u0010Ñ\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118V@VX\u000e¢\u0006\u000e\u001a\u0005\bÒ\u0001\u0010\u0014\"\u0005\bÓ\u0001\u0010\u0016R'\u0010Ô\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÕ\u0001\u0010\u000b\"\u0005\bÖ\u0001\u0010\rR'\u0010×\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bØ\u0001\u0010\u000b\"\u0005\bÙ\u0001\u0010\rR3\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00118V@VX\u000e¢\u0006\u000e\u001a\u0005\bÛ\u0001\u0010\u0014\"\u0005\bÜ\u0001\u0010\u0016R'\u0010Ý\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bÞ\u0001\u0010\u000b\"\u0005\bß\u0001\u0010\rR'\u0010à\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\u000e\u001a\u0005\bá\u0001\u0010\u000b\"\u0005\bâ\u0001\u0010\r¨\u0006é\u0001"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "kEffect", "Lcom/ss/ugc/effectplatform/model/Effect;", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "value", "", "adRawData", "getAdRawData", "()Ljava/lang/String;", "setAdRawData", "(Ljava/lang/String;)V", "ad_raw_data", "getAd_raw_data", "setAd_raw_data", "", "bindIds", "getBindIds", "()Ljava/util/List;", "setBindIds", "(Ljava/util/List;)V", "bind_ids", "getBind_ids", "setBind_ids", "challenge", "getChallenge", "setChallenge", "childEffects", "getChildEffects", "setChildEffects", "child_effects", "getChild_effects", "setChild_effects", "children", "getChildren", "setChildren", "composerParams", "getComposerParams", "setComposerParams", "composerPath", "getComposerPath", "setComposerPath", "composer_params", "getComposer_params", "setComposer_params", "designerEncryptedId", "getDesignerEncryptedId", "setDesignerEncryptedId", "designerId", "getDesignerId", "setDesignerId", "designer_encrypted_id", "getDesigner_encrypted_id", "setDesigner_encrypted_id", "designer_id", "getDesigner_id", "setDesigner_id", "devicePlatform", "getDevicePlatform", "setDevicePlatform", "device_platform", "getDevice_platform", "setDevice_platform", "effectId", "getEffectId", "setEffectId", "", "effectType", "getEffectType", "()I", "setEffectType", "(I)V", "effect_id", "getEffect_id", "setEffect_id", "effect_type", "getEffect_type", "setEffect_type", "extra", "getExtra", "setExtra", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "fileUrl", "getFileUrl", "()Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "setFileUrl", "(Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;)V", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "file_url", "getFile_url", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setFile_url", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "gradeKey", "getGradeKey", "setGradeKey", "grade_key", "getGrade_key", "setGrade_key", "hint", "getHint", "setHint", "hintFile", "getHintFile", "setHintFile", "hintFileFormat", "getHintFileFormat", "setHintFileFormat", "hintIcon", "getHintIcon", "setHintIcon", "hint_file", "getHint_file", "setHint_file", "hint_file_format", "getHint_file_format", "setHint_file_format", "hint_icon", "getHint_icon", "setHint_icon", "iconUrl", "getIconUrl", "setIconUrl", "icon_url", "getIcon_url", "setIcon_url", "id", "getId", "setId", "iopId", "getIopId", "setIopId", "iop_id", "getIop_id", "setIop_id", "", "isBusiness", "()Z", "setBusiness", "(Z)V", "isDownloaded", "setDownloaded", "isIsIop", "setIsIop", "is_busi", "set_busi", "is_iop", "set_iop", "getKEffect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "modelNames", "getModelNames", "setModelNames", "model_names_sec", "getModel_names_sec", "setModel_names_sec", "music", "getMusic", "setMusic", "name", "getName", "setName", "original_effect_id", "getOriginal_effect_id", "setOriginal_effect_id", "panel", "getPanel", "setPanel", "parent", "getParent", "setParent", "parentId", "getParentId", "setParentId", "", "ptime", "getPtime", "()J", "setPtime", "(J)V", "publishTime", "getPublishTime", "setPublishTime", "recId", "getRecId", "setRecId", "requirements", "getRequirements", "setRequirements", "resourceId", "getResourceId", "setResourceId", "resource_id", "getResource_id", "setResource_id", "schema", "getSchema", "setSchema", "sdkExtra", "getSdkExtra", "setSdkExtra", "sdk_extra", "getSdk_extra", "setSdk_extra", ShareHitPoint.f121868c, "getSource", "setSource", "tags", "getTags", "setTags", "tagsUpdatedAt", "getTagsUpdatedAt", "setTagsUpdatedAt", "tags_updated_at", "getTags_updated_at", "setTags_updated_at", "types", "getTypes", "setTypes", "unzipPath", "getUnzipPath", "setUnzipPath", "zipPath", "getZipPath", "setZipPath", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class Effect extends EffectTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<Effect> CREATOR = new C60620b();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.Effect kEffect;

    public Effect() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/Effect$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.Effect$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/effect/model/Effect$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.Effect$b */
    public static final class C60620b implements Parcelable.Creator<Effect> {
        C60620b() {
        }

        /* renamed from: a */
        public Effect[] newArray(int i) {
            return new Effect[i];
        }

        /* renamed from: a */
        public Effect createFromParcel(Parcel parcel) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            com.ss.ugc.effectplatform.model.Effect effect = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.Effect)) {
                    obj = null;
                }
                effect = (com.ss.ugc.effectplatform.model.Effect) obj;
            } catch (Exception e) {
                EPLog.m235177a("createFromParcel", "get creator failed!", e);
            }
            return new Effect(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public com.ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getAdRawData() {
        return super.getAdRawData();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public List<String> getBindIds() {
        return super.getBindIds();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getComposerParams() {
        return super.getComposerParams();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerEncryptedId() {
        return super.getDesignerEncryptedId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerId() {
        return super.getDesignerId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDevicePlatform() {
        return super.getDevicePlatform();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getEffectId() {
        return super.getEffectId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getEffectType() {
        return super.getEffectType();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getGradeKey() {
        return super.getGradeKey();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintFile() {
        return super.getHintFile();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getHintFileFormat() {
        return super.getHintFileFormat();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintIcon() {
        return super.getHintIcon();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getIconUrl() {
        return super.getIconUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getIopId() {
        return super.getIopId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getModelNames() {
        return super.getModelNames();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getParentId() {
        return super.getParentId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public long getPublishTime() {
        return super.getPublishTime();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getResourceId() {
        return super.getResourceId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getSdkExtra() {
        return super.getSdkExtra();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getTagsUpdatedAt() {
        return super.getTagsUpdatedAt();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isBusiness() {
        return super.isBusiness();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isIsIop() {
        return super.isIsIop();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getEffect_type() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getEffect_type();
        }
        return super.getEffect_type();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getHint_file_format() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public long getPtime() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getPtime();
        }
        return super.getPtime();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getSource() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getSource();
        }
        return super.getSource();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean isDownloaded() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.isDownloaded();
        }
        return super.isDownloaded();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean is_busi() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_busi();
        }
        return super.is_busi();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean is_iop() {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_iop();
        }
        return super.is_iop();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getAd_raw_data() {
        String ad_raw_data;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (ad_raw_data = kEffect2.getAd_raw_data()) == null) {
            return super.getAd_raw_data();
        }
        return ad_raw_data;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getBind_ids() {
        List<String> bind_ids;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (bind_ids = kEffect2.getBind_ids()) == null) {
            return super.getBind_ids();
        }
        return bind_ids;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getChallenge() {
        List<String> challenge;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (challenge = kEffect2.getChallenge()) == null) {
            return super.getChallenge();
        }
        return challenge;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<com.ss.ugc.effectplatform.model.Effect> getChild_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> child_effects;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (child_effects = kEffect2.getChild_effects()) == null) {
            return super.getChild_effects();
        }
        return child_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getChildren() {
        List<String> children;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (children = kEffect2.getChildren()) == null) {
            return super.getChildren();
        }
        return children;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getComposerPath() {
        List<String> composerPath;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composerPath = kEffect2.getComposerPath()) == null) {
            return super.getComposerPath();
        }
        return composerPath;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getComposer_params() {
        String composer_params;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composer_params = kEffect2.getComposer_params()) == null) {
            return super.getComposer_params();
        }
        return composer_params;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDesigner_encrypted_id() {
        String designer_encrypted_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_encrypted_id = kEffect2.getDesigner_encrypted_id()) == null) {
            return super.getDesigner_encrypted_id();
        }
        return designer_encrypted_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDesigner_id() {
        String designer_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_id = kEffect2.getDesigner_id()) == null) {
            return super.getDesigner_id();
        }
        return designer_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDevice_platform() {
        String device_platform;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (device_platform = kEffect2.getDevice_platform()) == null) {
            return super.getDevice_platform();
        }
        return device_platform;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getEffect_id() {
        String effect_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (effect_id = kEffect2.getEffect_id()) == null) {
            return super.getEffect_id();
        }
        return effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (extra = kEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getFile_url() {
        com.ss.ugc.effectplatform.model.UrlModel file_url;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (file_url = kEffect2.getFile_url()) == null) {
            return super.getFile_url();
        }
        return file_url;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getGrade_key() {
        String grade_key;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (grade_key = kEffect2.getGrade_key()) == null) {
            return super.getGrade_key();
        }
        return grade_key;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getHint() {
        String hint;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint = kEffect2.getHint()) == null) {
            return super.getHint();
        }
        return hint;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getHint_file() {
        com.ss.ugc.effectplatform.model.UrlModel hint_file;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint_file = kEffect2.getHint_file()) == null) {
            return super.getHint_file();
        }
        return hint_file;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getHint_icon() {
        com.ss.ugc.effectplatform.model.UrlModel hint_icon;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint_icon = kEffect2.getHint_icon()) == null) {
            return super.getHint_icon();
        }
        return hint_icon;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getIcon_url() {
        com.ss.ugc.effectplatform.model.UrlModel icon_url;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (icon_url = kEffect2.getIcon_url()) == null) {
            return super.getIcon_url();
        }
        return icon_url;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (id = kEffect2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getIop_id() {
        String iop_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (iop_id = kEffect2.getIop_id()) == null) {
            return super.getIop_id();
        }
        return iop_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getModel_names_sec() {
        String model_names_sec;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (model_names_sec = kEffect2.getModel_names_sec()) == null) {
            return super.getModel_names_sec();
        }
        return model_names_sec;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getMusic() {
        List<String> music;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (music = kEffect2.getMusic()) == null) {
            return super.getMusic();
        }
        return music;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (name = kEffect2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getOriginal_effect_id() {
        String original_effect_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (original_effect_id = kEffect2.getOriginal_effect_id()) == null) {
            return super.getOriginal_effect_id();
        }
        return original_effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (panel = kEffect2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getParent() {
        String parent;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (parent = kEffect2.getParent()) == null) {
            return super.getParent();
        }
        return parent;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getRecId() {
        String recId;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (recId = kEffect2.getRecId()) == null) {
            return super.getRecId();
        }
        return recId;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getRequirements() {
        List<String> requirements;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (requirements = kEffect2.getRequirements()) == null) {
            return super.getRequirements();
        }
        return requirements;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getResource_id() {
        String resource_id;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (resource_id = kEffect2.getResource_id()) == null) {
            return super.getResource_id();
        }
        return resource_id;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getSchema() {
        String schema;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (schema = kEffect2.getSchema()) == null) {
            return super.getSchema();
        }
        return schema;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getSdk_extra() {
        String sdk_extra;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (sdk_extra = kEffect2.getSdk_extra()) == null) {
            return super.getSdk_extra();
        }
        return sdk_extra;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags = kEffect2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags_updated_at = kEffect2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getTypes() {
        List<String> types;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (types = kEffect2.getTypes()) == null) {
            return super.getTypes();
        }
        return types;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getUnzipPath() {
        String unzipPath;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (unzipPath = kEffect2.getUnzipPath()) == null) {
            return super.getUnzipPath();
        }
        return unzipPath;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getZipPath() {
        String zipPath;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (zipPath = kEffect2.getZipPath()) == null) {
            return super.getZipPath();
        }
        return zipPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getChildEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.Effect.getChildEffects():java.util.List");
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBindIds(List<String> list) {
        super.setBindIds(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBusiness(boolean z) {
        super.setBusiness(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectType(int i) {
        super.setEffectType(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFileFormat(int i) {
        super.setHintFileFormat(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIsIop(boolean z) {
        super.setIsIop(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setModelNames(String str) {
        super.setModelNames(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setParentId(String str) {
        super.setParentId(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setPublishTime(long j) {
        super.setPublishTime(j);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setAdRawData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setAdRawData(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setBind_ids(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setBind_ids(list);
        }
        super.setBind_ids(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChallenge(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChallenge(list);
        }
        super.setChallenge(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChildren(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChildren(list);
        }
        super.setChildren(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setComposerParams(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setComposerParams(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setComposerPath(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setComposerPath(list);
        }
        super.setComposerPath(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerEncryptedId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setDesignerEncryptedId(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setDesignerId(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDevicePlatform(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setDevicePlatform(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDownloaded(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDownloaded(z);
        }
        super.setDownloaded(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setEffectId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setEffect_type(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setEffect_type(i);
        }
        super.setEffect_type(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setFileUrl(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        super.setFileUrl(urlModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setGradeKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setGradeKey(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFile(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        super.setHintFile(urlModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintIcon(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        super.setHintIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_file_format(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file_format(i);
        }
        super.setHint_file_format(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIconUrl(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        super.setIconUrl(urlModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIopId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setIopId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setModel_names_sec(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setModel_names_sec(str);
        }
        super.setModel_names_sec(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setMusic(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setMusic(list);
        }
        super.setMusic(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setOriginal_effect_id(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setOriginal_effect_id(str);
        }
        super.setOriginal_effect_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setParent(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setParent(str);
        }
        super.setParent(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setPtime(long j) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setPtime(j);
        }
        super.setPtime(j);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setRecId(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setResourceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setResourceId(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setSdkExtra(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setSdkExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSource(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSource(i);
        }
        super.setSource(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTags(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTags(list);
        }
        super.setTags(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setTagsUpdatedAt(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setTagsUpdatedAt(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void set_busi(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.set_busi(z);
        }
        super.set_busi(z);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void set_iop(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.set_iop(z);
        }
        super.set_iop(z);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setAd_raw_data(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setAd_raw_data(str);
        }
        super.setAd_raw_data(str);
    }

    public final void setChildEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChild_effects(list);
        }
        super.setChild_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChild_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChild_effects(list);
        }
        super.setChild_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setComposer_params(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setComposer_params(str);
        }
        super.setComposer_params(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDesigner_encrypted_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDesigner_encrypted_id(str);
        }
        super.setDesigner_encrypted_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDesigner_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDesigner_id(str);
        }
        super.setDesigner_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDevice_platform(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDevice_platform(str);
        }
        super.setDevice_platform(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setEffect_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setEffect_id(str);
        }
        super.setEffect_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setFile_url(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setFile_url(urlModel);
        }
        super.setFile_url(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setGrade_key(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setGrade_key(str);
        }
        super.setGrade_key(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint(str);
        }
        super.setHint(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_file(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file(urlModel);
        }
        super.setHint_file(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_icon(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_icon(urlModel);
        }
        super.setHint_icon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setIcon_url(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIcon_url(urlModel);
        }
        super.setIcon_url(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setIop_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIop_id(str);
        }
        super.setIop_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setPanel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setPanel(str);
        }
        super.setPanel(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setRequirements(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setRequirements(list);
        }
        super.setRequirements(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setResource_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setResource_id(str);
        }
        super.setResource_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSchema(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSchema(str);
        }
        super.setSchema(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSdk_extra(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSdk_extra(str);
        }
        super.setSdk_extra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTags_updated_at(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTypes(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTypes(list);
        }
        super.setTypes(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setUnzipPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setUnzipPath(str);
        }
        super.setUnzipPath(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setZipPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setZipPath(str);
        }
        super.setZipPath(str);
    }

    public Effect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
        com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            String ad_raw_data = kEffect2.getAd_raw_data();
            if (ad_raw_data != null) {
                super.setAd_raw_data(ad_raw_data);
            }
            List<String> bind_ids = kEffect2.getBind_ids();
            if (bind_ids != null) {
                super.setBind_ids(bind_ids);
            }
            List<String> challenge = kEffect2.getChallenge();
            if (challenge != null) {
                super.setChallenge(challenge);
            }
            List<com.ss.ugc.effectplatform.model.Effect> child_effects = kEffect2.getChild_effects();
            if (child_effects != null) {
                super.setChild_effects(child_effects);
            }
            List<String> children = kEffect2.getChildren();
            if (children != null) {
                super.setChildren(children);
            }
            List<String> composerPath = kEffect2.getComposerPath();
            if (composerPath != null) {
                super.setComposerPath(composerPath);
            }
            String composer_params = kEffect2.getComposer_params();
            if (composer_params != null) {
                super.setComposer_params(composer_params);
            }
            String designer_encrypted_id = kEffect2.getDesigner_encrypted_id();
            if (designer_encrypted_id != null) {
                super.setDesigner_encrypted_id(designer_encrypted_id);
            }
            String designer_id = kEffect2.getDesigner_id();
            if (designer_id != null) {
                super.setDesigner_id(designer_id);
            }
            String device_platform = kEffect2.getDevice_platform();
            if (device_platform != null) {
                super.setDevice_platform(device_platform);
            }
            String effect_id = kEffect2.getEffect_id();
            if (effect_id != null) {
                super.setEffect_id(effect_id);
            }
            super.setEffect_type(kEffect2.getEffect_type());
            String extra = kEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            com.ss.ugc.effectplatform.model.UrlModel file_url = kEffect2.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String grade_key = kEffect2.getGrade_key();
            if (grade_key != null) {
                super.setGrade_key(grade_key);
            }
            String hint = kEffect2.getHint();
            if (hint != null) {
                super.setHint(hint);
            }
            com.ss.ugc.effectplatform.model.UrlModel hint_file = kEffect2.getHint_file();
            if (hint_file != null) {
                super.setHint_file(hint_file);
            }
            super.setHint_file_format(kEffect2.getHint_file_format());
            com.ss.ugc.effectplatform.model.UrlModel hint_icon = kEffect2.getHint_icon();
            if (hint_icon != null) {
                super.setHint_icon(hint_icon);
            }
            com.ss.ugc.effectplatform.model.UrlModel icon_url = kEffect2.getIcon_url();
            if (icon_url != null) {
                super.setIcon_url(icon_url);
            }
            String id = kEffect2.getId();
            if (id != null) {
                super.setId(id);
            }
            String iop_id = kEffect2.getIop_id();
            if (iop_id != null) {
                super.setIop_id(iop_id);
            }
            super.setDownloaded(kEffect2.isDownloaded());
            super.set_busi(kEffect2.is_busi());
            super.set_iop(kEffect2.is_iop());
            String model_names = kEffect2.getModel_names();
            if (model_names != null) {
                super.setModel_names(model_names);
            }
            String model_names_sec = kEffect2.getModel_names_sec();
            if (model_names_sec != null) {
                super.setModel_names_sec(model_names_sec);
            }
            List<String> music = kEffect2.getMusic();
            if (music != null) {
                super.setMusic(music);
            }
            String name = kEffect2.getName();
            if (name != null) {
                super.setName(name);
            }
            String original_effect_id = kEffect2.getOriginal_effect_id();
            if (original_effect_id != null) {
                super.setOriginal_effect_id(original_effect_id);
            }
            String panel = kEffect2.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            String parent = kEffect2.getParent();
            if (parent != null) {
                super.setParent(parent);
            }
            super.setPtime(kEffect2.getPtime());
            String recId = kEffect2.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            List<String> requirements = kEffect2.getRequirements();
            if (requirements != null) {
                super.setRequirements(requirements);
            }
            List<String> requirements_sec = kEffect2.getRequirements_sec();
            if (requirements_sec != null) {
                super.setRequirements_sec(requirements_sec);
            }
            String resource_id = kEffect2.getResource_id();
            if (resource_id != null) {
                super.setResource_id(resource_id);
            }
            String schema = kEffect2.getSchema();
            if (schema != null) {
                super.setSchema(schema);
            }
            String sdk_extra = kEffect2.getSdk_extra();
            if (sdk_extra != null) {
                super.setSdk_extra(sdk_extra);
            }
            super.setSource(kEffect2.getSource());
            List<String> tags = kEffect2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kEffect2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            List<String> types = kEffect2.getTypes();
            if (types != null) {
                super.setTypes(types);
            }
            List<String> types_sec = kEffect2.getTypes_sec();
            if (types_sec != null) {
                super.setTypes_sec(types_sec);
            }
            String unzipPath = kEffect2.getUnzipPath();
            if (unzipPath != null) {
                super.setUnzipPath(unzipPath);
            }
            String zipPath = kEffect2.getZipPath();
            if (zipPath != null) {
                super.setZipPath(zipPath);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        if (getKEffect() != null) {
            com.ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Effect(com.ss.ugc.effectplatform.model.Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
