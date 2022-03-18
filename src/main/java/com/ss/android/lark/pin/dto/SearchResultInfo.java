package com.ss.android.lark.pin.dto;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/pin/dto/SearchResultInfo;", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "searchResult", "Lcom/ss/android/lark/pin/dto/SearchResult;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Lcom/ss/android/lark/pin/dto/SearchResult;Lcom/ss/android/lark/chat/entity/message/Message;)V", "getSearchResult", "()Lcom/ss/android/lark/pin/dto/SearchResult;", "isContentSame", "", "diffable", "isItemSame", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.dto.d */
public final class SearchResultInfo extends PinInfo {

    /* renamed from: a */
    private final SearchResult f128114a;

    /* renamed from: a */
    public final SearchResult mo177283a() {
        return this.f128114a;
    }

    @Override // com.ss.android.lark.pin.impl.entity.PinInfo
    /* renamed from: a */
    public boolean isContentSame(PinInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "diffable");
        if (bVar instanceof SearchResultInfo) {
            return this.f128114a.isContentSame(((SearchResultInfo) bVar).f128114a);
        }
        return false;
    }

    @Override // com.ss.android.lark.pin.impl.entity.PinInfo
    /* renamed from: b */
    public boolean isItemSame(PinInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "diffable");
        if (bVar instanceof SearchResultInfo) {
            return this.f128114a.isItemSame(((SearchResultInfo) bVar).f128114a);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultInfo(SearchResult cVar, Message message) {
        super(message, null, cVar.mo177265a(), cVar.mo177281g(), cVar.mo177282h());
        Intrinsics.checkParameterIsNotNull(cVar, "searchResult");
        Intrinsics.checkParameterIsNotNull(message, "message");
        this.f128114a = cVar;
    }
}
