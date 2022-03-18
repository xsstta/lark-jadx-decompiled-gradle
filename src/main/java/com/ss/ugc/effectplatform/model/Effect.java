package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.C65500c;
import com.ss.ugc.effectplatform.EffectPlatformEncryptor;
import com.ss.ugc.effectplatform.IEffectPlatformEncryptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\bx\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B¯\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\b\b\u0002\u00100\u001a\u00020$\u0012\b\b\u0002\u00101\u001a\u00020\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00106J\n\u0010 \u0001\u001a\u00020\u0010HÖ\u0001J\u0016\u0010¡\u0001\u001a\u00020$2\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0002J\t\u0010¤\u0001\u001a\u00020\u0010H\u0016J\t\u0010¥\u0001\u001a\u00020\u0003H\u0016J\u001e\u0010¦\u0001\u001a\u00030§\u00012\b\u0010¨\u0001\u001a\u00030©\u00012\u0007\u0010ª\u0001\u001a\u00020\u0010HÖ\u0001R\u0010\u00103\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\u001a\u0010\"\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00108\"\u0004\bH\u0010:R\u001a\u0010\u001b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R\u001a\u0010\u001a\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\u001a\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00108\"\u0004\bP\u0010:R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010+\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00108\"\u0004\b\\\u0010:R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00108\"\u0004\b^\u0010:R\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010R\"\u0004\bb\u0010TR\u001a\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010X\"\u0004\bd\u0010ZR\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00108\"\u0004\bh\u0010:R\u001a\u0010%\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R\u001a\u00100\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010k\"\u0004\bl\u0010mR\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010k\"\u0004\bn\u0010mR\u001a\u0010&\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010k\"\u0004\bo\u0010mR*\u0010q\u001a\u0004\u0018\u00010\u00032\b\u0010p\u001a\u0004\u0018\u00010\u00038F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00108\"\u0004\bs\u0010:R\u001c\u00104\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00108\"\u0004\bu\u0010:R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010<\"\u0004\bw\u0010>R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00108\"\u0004\by\u0010:R\u001c\u00105\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u00108\"\u0004\b{\u0010:R\u001a\u00101\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u00108\"\u0004\b}\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u00108\"\u0004\b\u0010:R\u001e\u0010)\u001a\u00020*X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001e\u00102\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R5\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058V@VX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010>R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010>R\u001c\u0010'\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R\u001c\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R\u001c\u0010 \u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R\u001c\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010R\"\u0005\b\u0001\u0010TR$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010>R\u001c\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R5\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058V@VX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010>R$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010>R\u001c\u0010/\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R\u001c\u0010.\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:¨\u0006«\u0001"}, d2 = {"Lcom/ss/ugc/effectplatform/model/Effect;", "Lcom/ss/ugc/effectplatform/model/AndroidParcelable;", "name", "", "_requirements", "", "requirements_sec", "hint", "id", "effect_id", "file_url", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "icon_url", "hint_icon", "hint_file", "hint_file_format", "", "_type", "types_sec", "tags", "tags_updated_at", "children", "child_effects", "parent", "effect_type", ShareHitPoint.f121868c, "designer_id", "designer_encrypted_id", "device_platform", "schema", "music", "extra", "sdk_extra", "ad_raw_data", "composer_params", "is_busi", "", "iop_id", "is_iop", "resource_id", "bind_ids", "ptime", "", "grade_key", "challenge", "composerPath", "zipPath", "unzipPath", "isDownloaded", "panel", "recId", "_model_names", "model_names_sec", "original_effect_id", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/UrlModel;Lcom/ss/ugc/effectplatform/model/UrlModel;Lcom/ss/ugc/effectplatform/model/UrlModel;Lcom/ss/ugc/effectplatform/model/UrlModel;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAd_raw_data", "()Ljava/lang/String;", "setAd_raw_data", "(Ljava/lang/String;)V", "getBind_ids", "()Ljava/util/List;", "setBind_ids", "(Ljava/util/List;)V", "getChallenge", "setChallenge", "getChild_effects", "setChild_effects", "getChildren", "setChildren", "getComposerPath", "setComposerPath", "getComposer_params", "setComposer_params", "getDesigner_encrypted_id", "setDesigner_encrypted_id", "getDesigner_id", "setDesigner_id", "getDevice_platform", "setDevice_platform", "getEffect_id", "setEffect_id", "getEffect_type", "()I", "setEffect_type", "(I)V", "getExtra", "setExtra", "getFile_url", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setFile_url", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "getGrade_key", "setGrade_key", "getHint", "setHint", "getHint_file", "setHint_file", "getHint_file_format", "setHint_file_format", "getHint_icon", "setHint_icon", "getIcon_url", "setIcon_url", "getId", "setId", "getIop_id", "setIop_id", "()Z", "setDownloaded", "(Z)V", "set_busi", "set_iop", "value", "model_names", "getModel_names", "setModel_names", "getModel_names_sec", "setModel_names_sec", "getMusic", "setMusic", "getName", "setName", "getOriginal_effect_id", "setOriginal_effect_id", "getPanel", "setPanel", "getParent", "setParent", "getPtime", "()J", "setPtime", "(J)V", "getRecId", "setRecId", "requirements", "getRequirements", "setRequirements", "getRequirements_sec", "setRequirements_sec", "getResource_id", "setResource_id", "getSchema", "setSchema", "getSdk_extra", "setSdk_extra", "getSource", "setSource", "getTags", "setTags", "getTags_updated_at", "setTags_updated_at", "types", "getTypes", "setTypes", "getTypes_sec", "setTypes_sec", "getUnzipPath", "setUnzipPath", "getZipPath", "setZipPath", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class Effect implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C65512a();
    private String _model_names;
    private List<String> _requirements;
    private List<String> _type;
    private String ad_raw_data;
    private List<String> bind_ids;
    private List<String> challenge;
    private List<? extends Effect> child_effects;
    private List<String> children;
    private List<String> composerPath;
    private String composer_params;
    private String designer_encrypted_id;
    private String designer_id;
    private String device_platform;
    private String effect_id;
    private int effect_type;
    private String extra;
    private UrlModel file_url;
    private String grade_key;
    private String hint;
    private UrlModel hint_file;
    private int hint_file_format;
    private UrlModel hint_icon;
    private UrlModel icon_url;
    private String id;
    private String iop_id;
    private boolean isDownloaded;
    private boolean is_busi;
    private boolean is_iop;
    private String model_names;
    private String model_names_sec;
    private List<String> music;
    private String name;
    private String original_effect_id;
    private String panel;
    private String parent;
    private long ptime;
    private String recId;
    private List<String> requirements;
    private List<String> requirements_sec;
    private String resource_id;
    private String schema;
    private String sdk_extra;
    private int source;
    private List<String> tags;
    private String tags_updated_at;
    private List<String> types;
    private List<String> types_sec;
    private String unzipPath;
    private String zipPath;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.Effect$a */
    public static class C65512a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel2 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel3 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            UrlModel urlModel4 = (UrlModel) parcel.readParcelable(Effect.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((Effect) parcel.readParcelable(Effect.class.getClassLoader()));
                readInt2--;
                createStringArrayList3 = createStringArrayList3;
            }
            return new Effect(readString, createStringArrayList, createStringArrayList2, readString2, readString3, readString4, urlModel, urlModel2, urlModel3, urlModel4, readInt, createStringArrayList3, createStringArrayList4, createStringArrayList5, readString5, createStringArrayList6, arrayList, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Effect[i];
        }
    }

    public Effect() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeStringList(this._requirements);
        parcel.writeStringList(this.requirements_sec);
        parcel.writeString(this.hint);
        parcel.writeString(this.id);
        parcel.writeString(this.effect_id);
        parcel.writeParcelable(this.file_url, i);
        parcel.writeParcelable(this.icon_url, i);
        parcel.writeParcelable(this.hint_icon, i);
        parcel.writeParcelable(this.hint_file, i);
        parcel.writeInt(this.hint_file_format);
        parcel.writeStringList(this._type);
        parcel.writeStringList(this.types_sec);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_updated_at);
        parcel.writeStringList(this.children);
        List<? extends Effect> list = this.child_effects;
        parcel.writeInt(list.size());
        for (Effect effect : list) {
            parcel.writeParcelable(effect, i);
        }
        parcel.writeString(this.parent);
        parcel.writeInt(this.effect_type);
        parcel.writeInt(this.source);
        parcel.writeString(this.designer_id);
        parcel.writeString(this.designer_encrypted_id);
        parcel.writeString(this.device_platform);
        parcel.writeString(this.schema);
        parcel.writeStringList(this.music);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.ad_raw_data);
        parcel.writeString(this.composer_params);
        parcel.writeInt(this.is_busi ? 1 : 0);
        parcel.writeString(this.iop_id);
        parcel.writeInt(this.is_iop ? 1 : 0);
        parcel.writeString(this.resource_id);
        parcel.writeStringList(this.bind_ids);
        parcel.writeLong(this.ptime);
        parcel.writeString(this.grade_key);
        parcel.writeStringList(this.challenge);
        parcel.writeStringList(this.composerPath);
        parcel.writeString(this.zipPath);
        parcel.writeString(this.unzipPath);
        parcel.writeInt(this.isDownloaded ? 1 : 0);
        parcel.writeString(this.panel);
        parcel.writeString(this.recId);
        parcel.writeString(this._model_names);
        parcel.writeString(this.model_names_sec);
        parcel.writeString(this.original_effect_id);
    }

    public String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public List<String> getBind_ids() {
        return this.bind_ids;
    }

    public List<String> getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getChild_effects() {
        return this.child_effects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getComposer_params() {
        return this.composer_params;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public String getDevice_platform() {
        return this.device_platform;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public int getEffect_type() {
        return this.effect_type;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getFile_url() {
        return this.file_url;
    }

    public String getGrade_key() {
        return this.grade_key;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHint_file() {
        return this.hint_file;
    }

    public int getHint_file_format() {
        return this.hint_file_format;
    }

    public UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public UrlModel getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.id;
    }

    public String getIop_id() {
        return this.iop_id;
    }

    public String getModel_names_sec() {
        return this.model_names_sec;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginal_effect_id() {
        return this.original_effect_id;
    }

    public String getPanel() {
        return this.panel;
    }

    public String getParent() {
        return this.parent;
    }

    public long getPtime() {
        return this.ptime;
    }

    public String getRecId() {
        return this.recId;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdk_extra() {
        return this.sdk_extra;
    }

    public int getSource() {
        return this.source;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public boolean is_busi() {
        return this.is_busi;
    }

    public boolean is_iop() {
        return this.is_iop;
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + getEffect_id().hashCode()) * 31) + getResource_id().hashCode();
    }

    public final String getModel_names() {
        boolean z;
        boolean z2;
        String str;
        String str2 = this._model_names;
        boolean z3 = false;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String model_names_sec2 = getModel_names_sec();
            if (model_names_sec2 == null || StringsKt.isBlank(model_names_sec2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                IEffectPlatformEncryptor a = EffectPlatformEncryptor.f164860a.mo227729a();
                if (a != null) {
                    str = a.mo207361a(getModel_names_sec());
                } else {
                    str = null;
                }
                this._model_names = str;
            }
        }
        String str3 = this._model_names;
        if (str3 == null || StringsKt.isBlank(str3)) {
            z3 = true;
        }
        if (z3) {
            return this.model_names;
        }
        return this._model_names;
    }

    public List<String> getRequirements() {
        boolean z;
        List<String> list;
        List<String> list2;
        List<String> list3 = this.requirements_sec;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((list = this.requirements_sec) == null || list.size() != this._requirements.size())) {
            IEffectPlatformEncryptor a = EffectPlatformEncryptor.f164860a.mo227729a();
            if (a == null || (list2 = C65500c.m256757a(a, this.requirements_sec)) == null) {
                list2 = CollectionsKt.emptyList();
            }
            this._requirements = list2;
        }
        if (this._requirements.isEmpty()) {
            return this.requirements;
        }
        return this._requirements;
    }

    public List<String> getTypes() {
        boolean z;
        List<String> list;
        List<String> list2;
        List<String> list3 = this.types_sec;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((list = this.types_sec) == null || list.size() != this._type.size())) {
            IEffectPlatformEncryptor a = EffectPlatformEncryptor.f164860a.mo227729a();
            if (a == null || (list2 = C65500c.m256757a(a, this.types_sec)) == null) {
                list2 = CollectionsKt.emptyList();
            }
            this._type = list2;
        }
        if (this._type.isEmpty()) {
            return this.types;
        }
        return this._type;
    }

    public String toString() {
        return "Effect(name='" + getName() + "', _requirements=" + this._requirements + ", " + "requirements_sec=" + this.requirements_sec + ", hint='" + getHint() + "', id='" + getId() + "', original_effect_id='" + getOriginal_effect_id() + "', " + "effect_id='" + getEffect_id() + "', file_url=" + getFile_url() + ", icon_url=" + getIcon_url() + ", " + "hint_icon=" + getHint_icon() + ", hint_file=" + getHint_file() + ", hint_file_format=" + getHint_file_format() + ", " + "_type=" + this._type + ", types_sec=" + this.types_sec + ", tags=" + getTags() + ", tags_updated_at='" + getTags_updated_at() + "'," + " children=" + getChildren() + ", child_effects=" + getChild_effects() + ", parent=" + getParent() + ", " + "effect_type=" + getEffect_type() + ", source=" + getSource() + ", designer_id='" + getDesigner_id() + "', " + "designer_encrypted_id='" + getDesigner_encrypted_id() + "', device_platform='" + getDevice_platform() + "', " + "schema='" + getSchema() + "', music=" + getMusic() + ", extra='" + getExtra() + "', sdk_extra='" + getSdk_extra() + "', " + "ad_raw_data='" + getAd_raw_data() + "', composer_params='" + getComposer_params() + "', is_busi=" + is_busi() + ", " + "iop_id='" + getIop_id() + "', is_iop=" + is_iop() + ", resource_id='" + getResource_id() + "', bind_ids=" + getBind_ids() + ", " + "publish_time=" + getPtime() + ", grade_key='" + getGrade_key() + "', composerPath=" + getComposerPath() + ", " + "zipPath='" + getZipPath() + "', unzipPath='" + getUnzipPath() + "', isDownloaded=" + isDownloaded() + ", " + "panel='" + getPanel() + "', recId=" + getRecId() + ", _model_names=" + this._model_names + ", model_names_sec='" + getModel_names_sec() + "')";
    }

    public void setBind_ids(List<String> list) {
        this.bind_ids = list;
    }

    public void setChallenge(List<String> list) {
        this.challenge = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public void setEffect_type(int i) {
        this.effect_type = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHint_file_format(int i) {
        this.hint_file_format = i;
    }

    public void setModel_names_sec(String str) {
        this.model_names_sec = str;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setOriginal_effect_id(String str) {
        this.original_effect_id = str;
    }

    public void setParent(String str) {
        this.parent = str;
    }

    public void setPtime(long j) {
        this.ptime = j;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public final void setRequirements_sec(List<String> list) {
        this.requirements_sec = list;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTypes_sec(List<String> list) {
        this.types_sec = list;
    }

    public void set_busi(boolean z) {
        this.is_busi = z;
    }

    public void set_iop(boolean z) {
        this.is_iop = z;
    }

    public void setAd_raw_data(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ad_raw_data = str;
    }

    public void setChild_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.child_effects = list;
    }

    public void setComposer_params(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.composer_params = str;
    }

    public void setDesigner_encrypted_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.designer_id = str;
    }

    public void setDevice_platform(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.device_platform = str;
    }

    public void setEffect_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.effect_id = str;
    }

    public void setFile_url(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "<set-?>");
        this.file_url = urlModel;
    }

    public void setGrade_key(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.grade_key = str;
    }

    public void setHint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.hint = str;
    }

    public void setHint_file(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "<set-?>");
        this.hint_file = urlModel;
    }

    public void setHint_icon(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "<set-?>");
        this.hint_icon = urlModel;
    }

    public void setIcon_url(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "<set-?>");
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public void setIop_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.iop_id = str;
    }

    public final void setModel_names(String str) {
        this._model_names = str;
        this.model_names = str;
    }

    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public void setPanel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.panel = str;
    }

    public void setResource_id(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.resource_id = str;
    }

    public void setSchema(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.schema = str;
    }

    public void setSdk_extra(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.sdk_extra = str;
    }

    public void setTags_updated_at(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.tags_updated_at = str;
    }

    public void setUnzipPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.unzipPath = str;
    }

    public void setZipPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.zipPath = str;
    }

    public void setRequirements(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this._requirements = list;
        this.requirements = list;
    }

    public void setTypes(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.types = list;
        this._type = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        if (!(!Intrinsics.areEqual(getId(), effect.getId())) && !(!Intrinsics.areEqual(getEffect_id(), effect.getEffect_id())) && !(!Intrinsics.areEqual(getResource_id(), effect.getResource_id()))) {
            return true;
        }
        return false;
    }

    public Effect(String str, List<String> list, List<String> list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List<String> list3, List<String> list4, List<String> list5, String str5, List<String> list6, List<? extends Effect> list7, String str6, int i2, int i3, String str7, String str8, String str9, String str10, List<String> list8, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, String str16, List<String> list9, long j, String str17, List<String> list10, List<String> list11, String str18, String str19, boolean z3, String str20, String str21, String str22, String str23, String str24) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(list, "_requirements");
        Intrinsics.checkParameterIsNotNull(str2, "hint");
        Intrinsics.checkParameterIsNotNull(str3, "id");
        Intrinsics.checkParameterIsNotNull(str4, "effect_id");
        Intrinsics.checkParameterIsNotNull(urlModel, "file_url");
        Intrinsics.checkParameterIsNotNull(urlModel2, "icon_url");
        Intrinsics.checkParameterIsNotNull(urlModel3, "hint_icon");
        Intrinsics.checkParameterIsNotNull(urlModel4, "hint_file");
        Intrinsics.checkParameterIsNotNull(list3, "_type");
        Intrinsics.checkParameterIsNotNull(str5, "tags_updated_at");
        Intrinsics.checkParameterIsNotNull(list7, "child_effects");
        Intrinsics.checkParameterIsNotNull(str7, "designer_id");
        Intrinsics.checkParameterIsNotNull(str8, "designer_encrypted_id");
        Intrinsics.checkParameterIsNotNull(str9, "device_platform");
        Intrinsics.checkParameterIsNotNull(str10, "schema");
        Intrinsics.checkParameterIsNotNull(str12, "sdk_extra");
        Intrinsics.checkParameterIsNotNull(str13, "ad_raw_data");
        Intrinsics.checkParameterIsNotNull(str14, "composer_params");
        Intrinsics.checkParameterIsNotNull(str15, "iop_id");
        Intrinsics.checkParameterIsNotNull(str16, "resource_id");
        Intrinsics.checkParameterIsNotNull(str17, "grade_key");
        Intrinsics.checkParameterIsNotNull(str18, "zipPath");
        Intrinsics.checkParameterIsNotNull(str19, "unzipPath");
        Intrinsics.checkParameterIsNotNull(str20, "panel");
        this.name = str;
        this._requirements = list;
        this.requirements_sec = list2;
        this.hint = str2;
        this.id = str3;
        this.effect_id = str4;
        this.file_url = urlModel;
        this.icon_url = urlModel2;
        this.hint_icon = urlModel3;
        this.hint_file = urlModel4;
        this.hint_file_format = i;
        this._type = list3;
        this.types_sec = list4;
        this.tags = list5;
        this.tags_updated_at = str5;
        this.children = list6;
        this.child_effects = list7;
        this.parent = str6;
        this.effect_type = i2;
        this.source = i3;
        this.designer_id = str7;
        this.designer_encrypted_id = str8;
        this.device_platform = str9;
        this.schema = str10;
        this.music = list8;
        this.extra = str11;
        this.sdk_extra = str12;
        this.ad_raw_data = str13;
        this.composer_params = str14;
        this.is_busi = z;
        this.iop_id = str15;
        this.is_iop = z2;
        this.resource_id = str16;
        this.bind_ids = list9;
        this.ptime = j;
        this.grade_key = str17;
        this.challenge = list10;
        this.composerPath = list11;
        this.zipPath = str18;
        this.unzipPath = str19;
        this.isDownloaded = z3;
        this.panel = str20;
        this.recId = str21;
        this._model_names = str22;
        this.model_names_sec = str23;
        this.original_effect_id = str24;
        this.requirements = new ArrayList();
        this.types = new ArrayList();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Effect(java.lang.String r47, java.util.List r48, java.util.List r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, com.ss.ugc.effectplatform.model.UrlModel r53, com.ss.ugc.effectplatform.model.UrlModel r54, com.ss.ugc.effectplatform.model.UrlModel r55, com.ss.ugc.effectplatform.model.UrlModel r56, int r57, java.util.List r58, java.util.List r59, java.util.List r60, java.lang.String r61, java.util.List r62, java.util.List r63, java.lang.String r64, int r65, int r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.util.List r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, boolean r76, java.lang.String r77, boolean r78, java.lang.String r79, java.util.List r80, long r81, java.lang.String r83, java.util.List r84, java.util.List r85, java.lang.String r86, java.lang.String r87, boolean r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, int r94, int r95, kotlin.jvm.internal.DefaultConstructorMarker r96) {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.Effect.<init>(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, int, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.util.List, long, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
