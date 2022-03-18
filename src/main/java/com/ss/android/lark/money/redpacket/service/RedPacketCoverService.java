package com.ss.android.lark.money.redpacket.service;

import com.bytedance.lark.pb.basic.v1.Cipher;
import com.bytedance.lark.pb.basic.v1.SerCrypto;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverList;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverTheme;
import com.ss.android.lark.pb.entities.Crypto;
import com.ss.android.lark.pb.entities.HongbaoCover;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.pb.hongbao.PullHongbaoCoverListRequest;
import com.ss.android.lark.pb.hongbao.PullHongbaoCoverListResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0002J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001e*\u0004\u0018\u00010\u001fH\u0002¨\u0006 "}, d2 = {"Lcom/ss/android/lark/money/redpacket/service/RedPacketCoverService;", "", "()V", "getRedPacketCoverList", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "toCipher", "Lcom/bytedance/lark/pb/basic/v1/Cipher;", "Lcom/ss/android/lark/pb/entities/Cipher;", "toCoverType", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover$CoverType;", "Lcom/ss/android/lark/pb/entities/HongbaoCover$CoverType;", "toCrypto", "Lcom/bytedance/lark/pb/basic/v1/SerCrypto;", "Lcom/ss/android/lark/pb/entities/Crypto;", "toPassThroughImage", "Lcom/ss/android/lark/image/entity/PassThroughImage;", "Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;", "toRedPacketCover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "Lcom/ss/android/lark/pb/entities/HongbaoCover;", "toRedPacketCoverCategory", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverTheme;", "Lcom/ss/android/lark/pb/hongbao/PullHongbaoCoverListResponse$Category;", "toRedPacketCoverList", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverList;", "Lcom/ss/android/lark/pb/hongbao/PullHongbaoCoverListResponse$CoverList;", "toType", "Lcom/bytedance/lark/pb/basic/v1/SerCrypto$Type;", "Lcom/ss/android/lark/pb/entities/Crypto$Type;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.b.b */
public final class RedPacketCoverService {

    /* renamed from: a */
    public static final RedPacketCoverService f120931a = new RedPacketCoverService();

    private RedPacketCoverService() {
    }

    /* renamed from: a */
    public final void mo168228a(IGetDataCallback<RedPacketCoverListResponse> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(Command.PULL_HONGBAO_COVER_LIST, new PullHongbaoCoverListRequest.Builder(), iGetDataCallback, C48038a.f120932a);
    }

    /* renamed from: a */
    public final RedPacketCoverTheme mo168227a(PullHongbaoCoverListResponse.Category category) {
        Long l = category.mid;
        Intrinsics.checkExpressionValueIsNotNull(l, "this.mid");
        long longValue = l.longValue();
        String str = category.mname;
        Intrinsics.checkExpressionValueIsNotNull(str, "this.mname");
        Integer num = category.morder;
        Intrinsics.checkExpressionValueIsNotNull(num, "this.morder");
        return new RedPacketCoverTheme(longValue, str, num.intValue());
    }

    /* renamed from: a */
    private final Cipher m189590a(com.ss.android.lark.pb.entities.Cipher cipher) {
        if (cipher != null) {
            return new Cipher.Builder().secret(cipher.msecret).nonce(cipher.mnonce).additional_data(cipher.madditional_data).build();
        }
        return null;
    }

    /* renamed from: a */
    private final SerCrypto.Type m189591a(Crypto.Type type) {
        if (type != null) {
            switch (C48039c.f120934b[type.ordinal()]) {
                case 1:
                    return SerCrypto.Type.AES_256_GCM;
                case 2:
                    return SerCrypto.Type.AES_CTR;
                case 3:
                    return SerCrypto.Type.CRYPTO_SDK_UNIFIED;
                case 4:
                    return SerCrypto.Type.CRYPTO_SDK_DOWNGRADE;
                case 5:
                    return SerCrypto.Type.CRYPTO_SDK_THIRDPARTY;
                case 6:
                    return SerCrypto.Type.SM4_128;
            }
        }
        return SerCrypto.Type.UNKNOWN;
    }

    /* renamed from: a */
    private final SerCrypto m189592a(Crypto crypto) {
        Cipher cipher;
        SerCrypto.Type type = null;
        if (crypto == null) {
            return null;
        }
        SerCrypto.Builder builder = new SerCrypto.Builder();
        com.ss.android.lark.pb.entities.Cipher cipher2 = crypto.mcipher;
        if (cipher2 != null) {
            cipher = m189590a(cipher2);
        } else {
            cipher = null;
        }
        SerCrypto.Builder cipher3 = builder.cipher(cipher);
        Crypto.Type type2 = crypto.mtype;
        if (type2 != null) {
            type = m189591a(type2);
        }
        return cipher3.type(type).build();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.b.b$a */
    public static final class C48038a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C48038a f120932a = new C48038a();

        C48038a() {
        }

        /* renamed from: a */
        public final RedPacketCoverListResponse parse(byte[] bArr) {
            PullHongbaoCoverListResponse decode = PullHongbaoCoverListResponse.ADAPTER.decode(bArr);
            List<PullHongbaoCoverListResponse.Category> list = decode.mcategory_list;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.mcategory_list");
            List<PullHongbaoCoverListResponse.Category> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                RedPacketCoverService bVar = RedPacketCoverService.f120931a;
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(bVar.mo168227a((PullHongbaoCoverListResponse.Category) t));
            }
            ArrayList arrayList2 = arrayList;
            Map<Long, PullHongbaoCoverListResponse.CoverList> map = decode.mcovers;
            Intrinsics.checkExpressionValueIsNotNull(map, "response.mcovers");
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (T t2 : map.entrySet()) {
                Object key = t2.getKey();
                RedPacketCoverService bVar2 = RedPacketCoverService.f120931a;
                Object value = t2.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                linkedHashMap.put(key, bVar2.mo168226a((PullHongbaoCoverListResponse.CoverList) value));
            }
            List<HongbaoCover> list3 = decode.mrecommend_covers;
            Intrinsics.checkExpressionValueIsNotNull(list3, "response.mrecommend_covers");
            List<HongbaoCover> list4 = list3;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (T t3 : list4) {
                RedPacketCoverService bVar3 = RedPacketCoverService.f120931a;
                Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                arrayList3.add(bVar3.mo168225a((HongbaoCover) t3));
            }
            return new RedPacketCoverListResponse(arrayList2, linkedHashMap, arrayList3);
        }
    }

    /* renamed from: a */
    private final RedPacketCover.CoverType m189593a(HongbaoCover.CoverType coverType) {
        if (coverType != null) {
            int i = C48039c.f120933a[coverType.ordinal()];
            if (i == 1) {
                return RedPacketCover.CoverType.TEMPLATE;
            }
            if (i == 2) {
                return RedPacketCover.CoverType.CUSTOMIZE;
            }
        }
        return RedPacketCover.CoverType.UNKNOWN;
    }

    /* renamed from: a */
    private final PassThroughImage m189594a(ImageSetPassThrough imageSetPassThrough) {
        SerCrypto serCrypto = null;
        if (imageSetPassThrough == null) {
            return null;
        }
        String str = imageSetPassThrough.mkey;
        String str2 = imageSetPassThrough.mfs_unit;
        Crypto crypto = imageSetPassThrough.mcrypto;
        if (crypto != null) {
            serCrypto = m189592a(crypto);
        }
        return new PassThroughImage(str, str2, serCrypto);
    }

    /* renamed from: a */
    public final RedPacketCover mo168225a(HongbaoCover hongbaoCover) {
        PassThroughImage passThroughImage;
        PassThroughImage passThroughImage2;
        PassThroughImage passThroughImage3;
        PassThroughImage passThroughImage4;
        Long l = hongbaoCover.mid;
        Intrinsics.checkExpressionValueIsNotNull(l, "this.mid");
        long longValue = l.longValue();
        String str = hongbaoCover.mname;
        Intrinsics.checkExpressionValueIsNotNull(str, "this.mname");
        RedPacketCover.CoverType a = m189593a(hongbaoCover.mcover_type);
        ImageSetPassThrough imageSetPassThrough = hongbaoCover.mmain_cover;
        if (imageSetPassThrough != null) {
            passThroughImage = m189594a(imageSetPassThrough);
        } else {
            passThroughImage = null;
        }
        ImageSetPassThrough imageSetPassThrough2 = hongbaoCover.mmessage_cover;
        if (imageSetPassThrough2 != null) {
            passThroughImage2 = m189594a(imageSetPassThrough2);
        } else {
            passThroughImage2 = null;
        }
        ImageSetPassThrough imageSetPassThrough3 = hongbaoCover.mhead_cover;
        if (imageSetPassThrough3 != null) {
            passThroughImage3 = m189594a(imageSetPassThrough3);
        } else {
            passThroughImage3 = null;
        }
        ImageSetPassThrough imageSetPassThrough4 = hongbaoCover.mcompany_logo;
        if (imageSetPassThrough4 != null) {
            passThroughImage4 = m189594a(imageSetPassThrough4);
        } else {
            passThroughImage4 = null;
        }
        return new RedPacketCover(longValue, str, a, passThroughImage, passThroughImage2, passThroughImage3, passThroughImage4);
    }

    /* renamed from: a */
    public final RedPacketCoverList mo168226a(PullHongbaoCoverListResponse.CoverList coverList) {
        Long l = coverList.mcategory_id;
        Intrinsics.checkExpressionValueIsNotNull(l, "this.mcategory_id");
        long longValue = l.longValue();
        List<HongbaoCover> list = coverList.mcovers;
        Intrinsics.checkExpressionValueIsNotNull(list, "this.mcovers");
        List<HongbaoCover> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            RedPacketCoverService bVar = f120931a;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(bVar.mo168225a((HongbaoCover) t));
        }
        return new RedPacketCoverList(longValue, arrayList);
    }
}
