package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.VCMeetingAbbrInfo;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.vc.entity.response.m */
public class C60979m {

    /* renamed from: a */
    public String f152700a;

    /* renamed from: b */
    public IDTypeEntity f152701b;

    /* renamed from: c */
    public List<String> f152702c;

    /* renamed from: d */
    public Boolean f152703d;

    /* renamed from: e */
    public VCMeetingAbbrInfo f152704e;

    /* renamed from: f */
    public Boolean f152705f;

    /* renamed from: g */
    public VCMeetingAbbrInfo f152706g;

    /* renamed from: h */
    public Long f152707h;

    /* renamed from: i */
    public String f152708i;

    public C60979m() {
    }

    public C60979m(String str, IDTypeEntity iDTypeEntity, List<String> list, Boolean bool, VCMeetingAbbrInfo sVar, Boolean bool2, VCMeetingAbbrInfo sVar2, Long l) {
        this(str, iDTypeEntity, list, bool, sVar, bool2, sVar2, l, ByteString.EMPTY);
    }

    public C60979m(String str, IDTypeEntity iDTypeEntity, List<String> list, Boolean bool, VCMeetingAbbrInfo sVar, Boolean bool2, VCMeetingAbbrInfo sVar2, Long l, ByteString byteString) {
        this.f152700a = str;
        this.f152701b = iDTypeEntity;
        this.f152702c = list;
        this.f152703d = bool;
        this.f152704e = sVar;
        this.f152705f = bool2;
        this.f152706g = sVar2;
        this.f152707h = l;
    }
}
