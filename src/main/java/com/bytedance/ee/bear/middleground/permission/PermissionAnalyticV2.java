package com.bytedance.ee.bear.middleground.permission;

import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\b\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u00042\u0006\u0010Z\u001a\u00020S2\b\u0010[\u001a\u0004\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u00042\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010]\u001a\u0004\u0018\u00010\u00042\u0006\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00042\b\u0010`\u001a\u0004\u0018\u00010\u00042\b\u0010a\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020KH\u0002J\u0018\u0010b\u001a\u00020V2\u0006\u0010c\u001a\u00020\u00042\u0006\u0010W\u001a\u00020XH\u0002J\u0018\u0010d\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010e\u001a\u00020SH\u0002J\b\u0010f\u001a\u00020VH\u0007J8\u0010g\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010h\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u0004H\u0002J(\u0010j\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J@\u0010k\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J(\u0010p\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J(\u0010q\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J\u0012\u0010r\u001a\u00020V2\b\u0010s\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010t\u001a\u00020VH\u0007JH\u0010u\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0007JZ\u0010w\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\u0006\u0010x\u001a\u00020S2\b\u0010s\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010y\u001a\u00020VH\u0007J\u0018\u0010z\u001a\u00020V2\u0006\u0010{\u001a\u00020n2\u0006\u0010x\u001a\u00020SH\u0007J`\u0010|\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010x\u001a\u00020S2\u0006\u0010s\u001a\u00020\u00042\u0006\u0010}\u001a\u00020K2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J@\u0010~\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010x\u001a\u00020S2\u0006\u0010}\u001a\u00020KH\u0007J(\u0010\u001a\u00020V2\u0006\u0010s\u001a\u00020\u00042\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J\u0011\u0010\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020nH\u0007J9\u0010\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010}\u001a\u00020KH\u0007JQ\u0010\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010}\u001a\u00020K2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J!\u0010\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J\u0012\u0010\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020KH\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J\u0007\u0010\u0001\u001a\u00020VJ\u001d\u0010\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020KH\u0007J\u0007\u0010\u0001\u001a\u00020VJ\u0007\u0010\u0001\u001a\u00020VJ\u0010\u0010\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020KJ\u001f\u0010\u0001\u001a\u00020V2\t\b\u0002\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020SH\u0007J\u001f\u0010\u0001\u001a\u00020V2\t\b\u0002\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020SH\u0007J'\u0010\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020n2\t\b\u0002\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020SH\u0007J+\u0010\u0001\u001a\u00020V2\u0006\u0010h\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020SH\u0002J\u001f\u0010\u0001\u001a\u00020V2\t\b\u0002\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020SH\u0007J=\u0010\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J\t\u0010\u0001\u001a\u00020VH\u0007J&\u0010\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010\u0001\u001a\u00020KH\u0007J4\u0010 \u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J\u001b\u0010¡\u0001\u001a\u00020V2\u0007\u0010¢\u0001\u001a\u00020\u00042\u0007\u0010£\u0001\u001a\u00020KH\u0007J#\u0010¡\u0001\u001a\u00020V2\u0007\u0010¢\u0001\u001a\u00020\u00042\u0007\u0010£\u0001\u001a\u00020K2\u0006\u0010{\u001a\u00020nH\u0007J\u0012\u0010¤\u0001\u001a\u00020V2\u0007\u0010¢\u0001\u001a\u00020\u0004H\u0007J\u001a\u0010¤\u0001\u001a\u00020V2\u0007\u0010¢\u0001\u001a\u00020\u00042\u0006\u0010{\u001a\u00020nH\u0007J\u0012\u0010¥\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020KH\u0007J\u001a\u0010¦\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020n2\u0007\u0010§\u0001\u001a\u00020SH\u0007J\u001a\u0010¦\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020n2\u0007\u0010¨\u0001\u001a\u00020\u0004H\u0002J\u0011\u0010©\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020nH\u0007J\u0011\u0010ª\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020nH\u0007J\u0011\u0010«\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020nH\u0007J\t\u0010¬\u0001\u001a\u00020VH\u0007J\t\u0010­\u0001\u001a\u00020VH\u0007JI\u0010®\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0007J)\u0010¯\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J9\u0010°\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010h\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u0004H\u0002JA\u0010±\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J)\u0010²\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J)\u0010³\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J)\u0010´\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J\t\u0010µ\u0001\u001a\u00020VH\u0007J*\u0010¶\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`o2\u0007\u0010·\u0001\u001a\u00020KH\u0007J\t\u0010¸\u0001\u001a\u00020VH\u0007J)\u0010¹\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J+\u0010º\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020KH\u0007J+\u0010»\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020KH\u0007J\t\u0010¼\u0001\u001a\u00020VH\u0007J\t\u0010½\u0001\u001a\u00020VH\u0007J\u0012\u0010¾\u0001\u001a\u00020V2\u0007\u0010¿\u0001\u001a\u00020KH\u0007JI\u0010À\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0007J\t\u0010Á\u0001\u001a\u00020VH\u0007J\u0011\u0010Â\u0001\u001a\u00020V2\u0006\u0010c\u001a\u00020\u0004H\u0002J#\u0010Ã\u0001\u001a\u00020V2\u0006\u0010c\u001a\u00020\u00042\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KH\u0002J#\u0010Æ\u0001\u001a\u00020V2\u0006\u0010c\u001a\u00020\u00042\u0007\u0010Ç\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KH\u0002J#\u0010È\u0001\u001a\u00020V2\u0006\u0010c\u001a\u00020\u00042\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Ç\u0001\u001a\u00020KH\u0002J\u0007\u0010É\u0001\u001a\u00020VJ\u0007\u0010Ê\u0001\u001a\u00020VJ\u0007\u0010Ë\u0001\u001a\u00020VJ\u0007\u0010Ì\u0001\u001a\u00020VJ\u0007\u0010Í\u0001\u001a\u00020VJ\u0019\u0010Î\u0001\u001a\u00020V2\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KJ\u0019\u0010Ï\u0001\u001a\u00020V2\u0007\u0010Ç\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KJ\u0019\u0010Ð\u0001\u001a\u00020V2\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Ç\u0001\u001a\u00020KJ\u0010\u0010Ñ\u0001\u001a\u00020V2\u0007\u0010\u0001\u001a\u00020KJ\u0007\u0010Ò\u0001\u001a\u00020VJ\u0007\u0010Ó\u0001\u001a\u00020VJ\u0019\u0010Ô\u0001\u001a\u00020V2\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KJ\u0019\u0010Õ\u0001\u001a\u00020V2\u0007\u0010Ç\u0001\u001a\u00020K2\u0007\u0010Å\u0001\u001a\u00020KJ\u0019\u0010Ö\u0001\u001a\u00020V2\u0007\u0010Ä\u0001\u001a\u00020K2\u0007\u0010Ç\u0001\u001a\u00020KJ\u0007\u0010×\u0001\u001a\u00020VJ\u0012\u0010Ø\u0001\u001a\u00020V2\u0007\u0010Ù\u0001\u001a\u00020SH\u0007J\u0012\u0010Ú\u0001\u001a\u00020V2\u0007\u0010Û\u0001\u001a\u00020SH\u0007J\t\u0010Ü\u0001\u001a\u00020VH\u0007J\u001b\u0010Ý\u0001\u001a\u00020V2\u0007\u0010Þ\u0001\u001a\u00020S2\u0007\u0010ß\u0001\u001a\u00020KH\u0007J\u0012\u0010à\u0001\u001a\u00020V2\u0007\u0010¿\u0001\u001a\u00020KH\u0007J\u0007\u0010á\u0001\u001a\u00020VJ\"\u0010â\u0001\u001a\u00020V2\u0007\u0010£\u0001\u001a\u00020K2\u0007\u0010ã\u0001\u001a\u00020\u00042\u0007\u0010ä\u0001\u001a\u00020KJ)\u0010å\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J)\u0010æ\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0007J\t\u0010ç\u0001\u001a\u00020VH\u0007J>\u0010è\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`o2\u0007\u0010·\u0001\u001a\u00020K2\u0007\u0010é\u0001\u001a\u00020K2\t\b\u0002\u0010ê\u0001\u001a\u00020KH\u0007J!\u0010ë\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J\u0012\u0010ì\u0001\u001a\u00020V2\u0007\u0010£\u0001\u001a\u00020KH\u0007J\t\u0010í\u0001\u001a\u00020VH\u0007J\t\u0010î\u0001\u001a\u00020VH\u0007J\t\u0010ï\u0001\u001a\u00020VH\u0007J)\u0010ð\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`o2\u0006\u0010s\u001a\u00020\u0004H\u0007J!\u0010ñ\u0001\u001a\u00020V2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020n0mj\b\u0012\u0004\u0012\u00020n`oH\u0007J%\u0010ò\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020n2\u0007\u0010\u0001\u001a\u00020K2\t\b\u0002\u0010ó\u0001\u001a\u00020KH\u0007J\u0012\u0010ô\u0001\u001a\u00020V2\u0007\u0010õ\u0001\u001a\u00020KH\u0007J\u0019\u0010ö\u0001\u001a\u00020V2\u0006\u0010h\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u0004H\u0002J\t\u0010÷\u0001\u001a\u00020VH\u0007J\t\u0010ø\u0001\u001a\u00020VH\u0007J\t\u0010ù\u0001\u001a\u00020VH\u0007J4\u0010ú\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020K2\u0007\u0010û\u0001\u001a\u00020KH\u0007J+\u0010ü\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020KH\u0007J\u0011\u0010ý\u0001\u001a\u00020V2\u0006\u0010{\u001a\u00020nH\u0007JI\u0010þ\u0001\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010v\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0004H\u0007J\u0012\u0010ÿ\u0001\u001a\u00020V2\u0007\u0010£\u0001\u001a\u00020KH\u0007J\t\u0010\u0002\u001a\u00020VH\u0007J\u0011\u0010\u0002\u001a\u00020V2\u0006\u0010c\u001a\u00020\u0004H\u0002J[\u0010\u0002\u001a\u00020V2\b\u0010Q\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020S2\b\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010T\u001a\u00020\u00042\b\u0010N\u001a\u0004\u0018\u00010\u00042\u0006\u0010J\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0002\u001a\u00020V2\t\u0010\u0002\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020KX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/PermissionAnalyticV2;", "", "()V", "EVENT_ADD_COLLABORATOR_CLICK", "", "EVENT_ADD_COLLABORATOR_SET_CLICK", "EVENT_ADD_COLLABORATOR_SET_VIEW", "EVENT_ADD_COLLABORATOR_VIEW", "EVENT_ASK_OWNER_CLICK", "EVENT_ASK_OWNER_TYPE_CLICK", "EVENT_ASK_OWNER_TYPE_VIEW", "EVENT_ASK_OWNER_VIEW", "EVENT_COMMENT_WITHOUT_PERMISSION_CLICK", "EVENT_COMMENT_WITHOUT_PERMISSION_VIEW", "EVENT_FILE_COMMENT_SET_CLICK", "EVENT_FILE_COMMENT_SET_VIEW", "EVENT_FILE_SECURITY_SET_CLICK", "EVENT_FILE_SECURITY_SET_VIEW", "EVENT_LOCK_CLICK", "EVENT_LOCK_VIEW", "EVENT_MANAGEMENT_COLLABORATOR_CLICK", "EVENT_MANAGEMENT_COLLABORATOR_LIST_CLICK", "EVENT_MANAGEMENT_COLLABORATOR_LIST_VIEW", "EVENT_MANAGEMENT_COLLABORATOR_SET_OWNER_CLICK", "EVENT_MANAGEMENT_COLLABORATOR_SET_OWNER_VIEW", "EVENT_MANAGEMENT_COLLABORATOR_VIEW", "EVENT_ORGANIZATION_AUTHORIZE_CLICK", "EVENT_ORGANIZATION_AUTHORIZE_SEARCH_VIEW", "EVENT_ORGANIZATION_AUTHORIZE_SEND_NOTICE_CLICK", "EVENT_ORGANIZATION_AUTHORIZE_SEND_NOTICE_VIEW", "EVENT_ORGANIZATION_AUTHORIZE_VIEW", "EVENT_OWNER_TURNED_OFF_PROMPT_CLICK", "EVENT_OWNER_TURNED_OFF_PROMPT_VIEW", "EVENT_PERMISSION_CHANGE_CLICK", "EVENT_PERMISSION_CHANGE_VIEW", "EVENT_PROMPT_CLICK", "EVENT_PROMPT_VIEW", "EVENT_READ_WITHOUT_EDIT_CLICK", "EVENT_READ_WITHOUT_EDIT_VIEW", "EVENT_RESTORE_CLICK", "EVENT_RESTORE_VIEW", "EVENT_SCOPE_CHANGE_CLICK", "EVENT_SCOPE_CHANGE_VIEW", "EVENT_SEARCH_COLLABORATOR_CLICK", "EVENT_SEARCH_COLLABORATOR_VIEW", "EVENT_SELECT_CONTACT_CLICK", "EVENT_SELECT_CONTACT_VIEW", "EVENT_SEND_LINK_CLICK", "EVENT_SEND_LINK_VIEW", "EVENT_SET_CLICK", "EVENT_SET_VIEW", "EVENT_SHARE_ASK_OWNER_CLICK", "EVENT_SHARE_ASK_OWNER_TYPE_CLICK", "EVENT_SHARE_ASK_OWNER_TYPE_VIEW", "EVENT_SHARE_ASK_OWNER_VIEW", "EVENT_SHARE_AT_PEOPLE_CLICK", "EVENT_SHARE_AT_PEOPLE_VIEW", "EVENT_SHARE_CLICK", "EVENT_SHARE_ENCRYPTED_LINK_CLICK", "EVENT_SHARE_ENCRYPTED_LINK_VIEW", "EVENT_SHARE_PUBLIC_ACCESS_CLICK", "EVENT_SHARE_PUBLIC_ACCESS_VIEW", "EVENT_UNABLE_TO_APPLY_CLICK", "EVENT_UNABLE_TO_APPLY_VIEW", "EVENT_WITHOUT_PERMISSION_CLICK", "EVENT_WITHOUT_PERMISSION_VIEW", "FORM_VC", "LOCK_REASON_EXTERNAL_SWITCH", "LOCK_REASON_REDUCE_COLLABORATORS", "LOCK_REASON_REDUCE_PERMISSIONS", "LOCK_REASON_REDUCE_SHARELINK", "PARAM_NULL", "TAG", "TARGET_NONE", "isFromVc", "", "isWiki", "module", "publicPerm", "subModule", "subType", "token", ShareHitPoint.f121869d, "", "userPerm", "appendCommonParams", "", "params", "Lorg/json/JSONObject;", "file_id", "file_type", "app_form", "sub_file_type", "sub_module", "user_permission", "file_permission", "container_id", "container_type", "doReport", "eventName", "getUserPermStr", "userPermission", "reportAddCollaborateView", "reportAddCollaboratorClick", "click", "target", "reportAddCollaboratorCloseClick", "reportAddCollaboratorNextClick", "userInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "reportAddCollaboratorOrganizationClick", "reportAddCollaboratorSearchClick", "reportApplyEditPermissionClick", "notes", "reportApplyEditPermissionView", "reportApplyPermissionBackClick", "fromVc", "reportApplyPermissionSendRequestClick", "selectPerm", "reportAskOwnerBackClick", "reportAskOwnerEditPermClick", "userInfo", "reportAskOwnerPanelSendRequestClick", "fromChat", "reportAskOwnerPanelTypeClick", "reportAskOwnerSendRequestClick", "reportAskOwnerTypeView", "reportAskOwnerView", "reportAtAuthorizeCloseClick", "reportAtAuthorizeSendClick", "sendNotice", "reportAtAuthorizeView", "reportAtWithoutPermissionClick", "reportAtWithoutPermissionView", "reportClickComment", "reportClickExternalAccessSwitch", "isChecked", "showSelectPerm", "reportClickManagerCollaborator", "reportClickSecurity", "reportClickShareSwitch", "reportCollaborateManagerAddClick", "hasPageCollaborator", "index", "reportCollaborateManagerBackClick", "reportCollaborateManagerChangePermissionClick", "permType", "reportCollaborateManagerClick", "reportCollaborateManagerUnlockClick", "reportExternalSharePrivacyDialogClick", "confirm", "from", "reportInviteCollaboratorClick", "reportLinkShareBackClick", "reportLinkShareItemClick", "linkShareEntity", "isV2", "showSelect", "reportLinkShareTipDialogView", "reportLockTipDialogClick", "lockReason", "isConfirm", "reportLockTipDialogView", "reportManagementCollaborateView", "reportManagementCollaboratorListClick", "newPermission", "permSetAfter", "reportManagementCollaboratorListView", "reportManagementCollaboratorRemoveClick", "reportManagementCollaboratorTransferClick", "reportManagerCollaboratorClick", "reportNewPermissionSetBackClick", "reportNoPermissionView", "reportOrganizationAuthorizeBackClick", "reportOrganizationAuthorizeClick", "reportOrganizationAuthorizeNextClick", "reportOrganizationAuthorizeNextLevelClick", "reportOrganizationAuthorizeSearchClick", "reportOrganizationAuthorizeSearchView", "reportOrganizationAuthorizeSendNoticeCancelClick", "reportOrganizationAuthorizeSendNoticeConfirmClick", "hasNotes", "reportOrganizationAuthorizeSendNoticeView", "reportOrganizationAuthorizeView", "reportOwnerTurnedOffPromptClick", "reportOwnerTurnedOffPromptView", "reportPasswordChangeClick", "reportPasswordCopyClick", "reportPasswordSwitchClick", "isOpen", "reportPermForbiddenClick", "reportPermSetClick", "reportPermSetClickBack", "reportPermSetClickEdit", "isFa", "isRead", "reportPermSetClickFa", "isEdit", "reportPermSetClickRead", "reportPermSetCommentClickBack", "reportPermSetCommentClickEdit", "reportPermSetCommentClickRead", "reportPermSetCommentView", "reportPermSetManagerCollaboratorClickBack", "reportPermSetManagerCollaboratorClickEdit", "reportPermSetManagerCollaboratorClickFa", "reportPermSetManagerCollaboratorClickRead", "reportPermSetManagerCollaboratorClickSwitch", "reportPermSetManagerCollaboratorView", "reportPermSetSecurityClickBack", "reportPermSetSecurityClickEdit", "reportPermSetSecurityClickFa", "reportPermSetSecurityClickRead", "reportPermSetSecurityView", "reportPermissionCommentSetClick", "commentEntity", "reportPermissionSecuritySetClick", "securityEntity", "reportPermissionSetBackClick", "reportPermissionShareSetClick", "shareEntity", "inviteExternal", "reportPermissionSwitchSetClick", "reportScopeChangeView", "reportScopeClick", "location", "willLock", "reportSearchCollaboratorClearQueryClick", "reportSearchCollaboratorView", "reportSelectContactBack", "reportSelectContactInvite", "isSendNotice", "allowChildAccess", "reportSelectContactView", "reportSelfPermissionChangeClick", "reportSelfPermissionChangeView", "reportSendLinkBackClick", "reportSendLinkDeleteClick", "reportSendLinkSendRequestClick", "reportSendLinkView", "reportSetOwnerClick", "isInsideTransfer", "reportSetView", "isNew", "reportShareClick", "reportShareLinkClick", "reportShareLinkView", "reportSharePanelUnlockClick", "reportSharePublicAccessClick", "turnOn", "reportSharePublicAccessView", "reportTransferOwnerTipDialogView", "reportUnableApplyPermView", "reportUnlockTipDialogClick", "reportUnlockTipDialogView", "reportViewEvent", "setCommonParams", "updatePublicPerm", "newPublicPerm", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.c */
public final class PermissionAnalyticV2 {

    /* renamed from: a */
    public static final PermissionAnalyticV2 f25731a = new PermissionAnalyticV2();

    /* renamed from: b */
    private static String f25732b = "";

    /* renamed from: c */
    private static String f25733c = "";

    /* renamed from: d */
    private static boolean f25734d;

    /* renamed from: e */
    private static String f25735e = "none";

    /* renamed from: f */
    private static String f25736f = "none";

    /* renamed from: g */
    private static String f25737g = "";

    /* renamed from: h */
    private static int f25738h;

    /* renamed from: i */
    private static String f25739i = "";

    /* renamed from: j */
    private static boolean f25740j;

    @JvmStatic
    /* renamed from: a */
    public static final void m39595a(int i, boolean z) {
        m39597a(i, z, false, 4, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39599a(UserInfo userInfo) {
        m39604a(userInfo, false, 0, 6, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39602a(UserInfo userInfo, boolean z) {
        m39606a(userInfo, z, false, 4, (Object) null);
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m39685j() {
        m39637a(false, 0, 3, (Object) null);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m39687k() {
        m39652b(false, 0, 3, (Object) null);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m39689l() {
        m39662c(false, 0, 3, (Object) null);
    }

    private PermissionAnalyticV2() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39613a(String str, int i, String str2, boolean z, String str3, String str4, boolean z2, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str3, "userPerm");
        String str7 = "";
        if (str == null) {
            str = str7;
        }
        f25737g = str;
        f25738h = i;
        if (str2 == null) {
            str2 = str7;
        }
        f25739i = str2;
        f25740j = z;
        f25732b = str3;
        if (str4 == null) {
            str4 = str7;
        }
        f25733c = str4;
        f25734d = z2;
        f25735e = str5 != null ? str5 : str7;
        if (str6 != null) {
            str7 = str6;
        }
        f25736f = str7;
        C13479a.m54764b("PermissionAnalyticV2", "setCommonParams()...userPerm:" + str3 + ", " + "isFromVc:" + z2 + ", " + "module:" + str5 + ", " + "subModule: " + str6);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39607a(String str) {
        if (str == null) {
            str = "";
        }
        f25733c = str;
        C13479a.m54764b("PermissionAnalyticV2", "updatePublicPerm()....");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if ((r8.length() > 0) == true) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39634a(org.json.JSONObject r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2.m39634a(org.json.JSONObject, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private final void m39625a(String str, JSONObject jSONObject) {
        try {
            C5234y.m21391b().mo21081a(str, jSONObject, "");
            C13479a.m54772d("PermissionAnalyticV2", "eventName:" + str + ", params : " + jSONObject);
        } catch (Throwable th) {
            C13479a.m54759a("PermissionAnalyticV2", "doReport()...failed", th);
        }
    }

    /* renamed from: a */
    private final void m39622a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        m39625a("ccm_permission_share_click", jSONObject);
    }

    /* renamed from: a */
    private final void m39612a(String str, int i, String str2, boolean z, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", str3);
        jSONObject.put("target", str4);
        m39625a("ccm_permission_add_collaborator_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39608a(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", "close");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_add_collaborator_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39616a(String str, int i, String str2, boolean z, ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", "next");
        jSONObject.put("num", arrayList.size());
        C8275a aVar = C8275a.f22380m;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.BITABLE_FORM");
        jSONObject.put("target", i == aVar.mo32555b() ? "ccm_bitable_form_permission_select_contact_view" : "ccm_permission_select_contact_view");
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(i, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_add_collaborator_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39646b(String str, int i, String str2, boolean z, ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", "next");
        jSONObject.put("target", "ccm_permission_select_contact_view");
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(i, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_organization_authorize_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39629a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_select_contact_view", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39633a(ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z3 = true;
        }
        m39632a(arrayList, z, z2, z3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39632a(ArrayList<UserInfo> arrayList, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "invite");
        jSONObject.put("is_add_notes", z);
        jSONObject.put("is_send_notice", z2);
        jSONObject.put("is_allow_child_access", z3 ? "true" : "false");
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("target", "none");
        f25731a.m39625a("ccm_permission_select_contact_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39631a(ArrayList<UserInfo> arrayList, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "send");
        jSONObject.put("is_add_notes", String.valueOf(z));
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("target", "none");
        f25731a.m39625a("ccm_permission_organization_authorize_send_notice_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39635a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("is_has_page_collaborator", z ? "true" : "false");
        cVar.m39625a("ccm_permission_management_collaborator_view", jSONObject);
    }

    /* renamed from: a */
    private final void m39623a(String str, String str2, boolean z, int i) {
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        jSONObject.put("is_has_page_collaborator", z ? "true" : "false");
        jSONObject.put("view_title", i == 0 ? "current_and_child_page" : "current_page");
        m39625a("ccm_permission_management_collaborator_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39637a(boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        m39636a(z, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39636a(boolean z, int i) {
        f25731a.m39623a("restore", "ccm_permission_lock_restore_view", z, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39652b(boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        m39651b(z, i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39604a(UserInfo userInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        m39603a(userInfo, z, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39603a(UserInfo userInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "change_permission");
        jSONObject.put("target", "ccm_permission_management_collaborator_list_view");
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        jSONObject.put("is_has_page_collaborator", z ? "true" : "false");
        jSONObject.put("view_title", i == 1 ? "current_and_child_page" : "current_page");
        cVar.m39625a("ccm_permission_management_collaborator_click", jSONObject);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39662c(boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        m39661c(z, i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39650b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", z ? "confirm" : "cancel");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_change_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39606a(UserInfo userInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        m39605a(userInfo, z, z2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39605a(UserInfo userInfo, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", z ? "transfer" : "cancel");
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        jSONObject.put("is_inside_transfer", z2);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_management_collaborator_set_owner_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39609a(String str, int i, String str2, boolean z, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str3, "from");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("from_scene", str3);
        cVar.m39625a("ccm_permission_prompt_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39618a(String str, int i, String str2, boolean z, boolean z2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str3, "from");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", z2 ? "confirm" : "cancel");
        jSONObject.put("from_scene", str3);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_prompt_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39617a(String str, int i, String str2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, f25734d ? "vc" : "none", str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", z2 ? "turn_on" : "maybe_later");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_public_access_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo36685a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        String str = "none";
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "is_share_outside");
        String str2 = "false";
        jSONObject.put("perm_set_before", z ? str2 : "true");
        if (z) {
            str2 = "true";
        }
        jSONObject.put("perm_set_after", str2);
        if (z2) {
            str = "ccm_permission_scope_change_view";
        }
        jSONObject.put("target", str);
        m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: a */
    private final void m39628a(String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "full_access");
        jSONObject.put("target", "none");
        jSONObject.put("perm_set_before", z ? "edit" : z2 ? "read" : "full_access");
        jSONObject.put("perm_set_after", "full_access");
        m39625a(str, jSONObject);
    }

    /* renamed from: b */
    private final void m39648b(String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "edit");
        jSONObject.put("target", "none");
        jSONObject.put("perm_set_before", z ? "full_access" : z2 ? "read" : "edit");
        jSONObject.put("perm_set_after", "edit");
        m39625a(str, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39621a(String str, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(str, "lockReason");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("reason", str);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        cVar.m39625a("ccm_permission_lock_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39626a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "lockReason");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", z ? "confirm" : "cancel");
        jSONObject.put("reason", str);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_lock_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39627a(String str, boolean z, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(str, "lockReason");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", z ? "confirm" : "cancel");
        jSONObject.put("reason", str);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_lock_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39619a(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "userPerm");
        Intrinsics.checkParameterIsNotNull(str5, "publicPerm");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, z ? "vc" : "none", str2, str3, "", str4, str5, "none", "none", z2);
        cVar.m39625a("ccm_permission_without_permission_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39647b(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "userPerm");
        Intrinsics.checkParameterIsNotNull(str5, "publicPerm");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, z ? "vc" : "none", str2, str3, "", str4, str5, "none", "none", z2);
        cVar.m39625a("ccm_permission_unable_to_apply_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39620a(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, String str5, int i2, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "userPerm");
        Intrinsics.checkParameterIsNotNull(str5, "publicPerm");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, z ? "vc" : "none", str2, str3, "", str4, str5, "none", "none", z2);
        jSONObject.put("click", "apply_permission");
        String str7 = "read";
        if (i2 != 1 && i2 == 4) {
            str7 = "edit";
        }
        jSONObject.put("apply_list", str7);
        String str8 = str6;
        jSONObject.put("is_add_notes", !(str8 == null || str8.length() == 0));
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_without_permission_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39615a(String str, int i, String str2, boolean z, String str3, boolean z2, ArrayList<UserInfo> arrayList) {
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        String str5 = "none";
        if (!z2 && f25734d) {
            str5 = "vc";
        }
        if (z2) {
            str4 = "";
        } else {
            str4 = f25732b;
        }
        f25731a.m39634a(jSONObject, str, i, str5, str2, str3, "", str4, f25733c, "none", "none", z);
        jSONObject.put("from_scene", z2 ? "im_card" : "add_collaborator");
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(i, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_ask_owner_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39614a(String str, int i, String str2, boolean z, String str3, boolean z2) {
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        JSONObject jSONObject = new JSONObject();
        String str5 = "none";
        if (!z2 && f25734d) {
            str5 = "vc";
        }
        if (z2) {
            str4 = "";
        } else {
            str4 = f25732b;
        }
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, str5, str2, str3, "", str4, f25733c, "none", "none", z);
        jSONObject.put("from_scene", z2 ? "im_card" : "add_collaborator");
        cVar.m39625a("ccm_permission_ask_owner_type_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39610a(String str, int i, String str2, boolean z, String str3, int i2, String str4, boolean z2, ArrayList<UserInfo> arrayList) {
        String str5;
        String str6;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "notes");
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        if (!z2 && f25734d) {
            str5 = "vc";
        } else {
            str5 = "none";
        }
        if (z2) {
            str6 = "";
        } else {
            str6 = f25732b;
        }
        f25731a.m39634a(jSONObject, str, i, str5, str2, str3, "", str6, f25733c, "none", "none", z);
        String str7 = "read";
        if (i2 != 1 && i2 == 4) {
            str7 = "edit";
        }
        jSONObject.put("list_type", str7);
        jSONObject.put("is_leave_message", !(str4.length() == 0));
        jSONObject.put("from_scene", z2 ? "im_card" : "add_collaborator");
        jSONObject.put("target", "none");
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(i, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("click", "send_request");
        f25731a.m39625a("ccm_permission_ask_owner_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39611a(String str, int i, String str2, boolean z, String str3, int i2, boolean z2) {
        String str4;
        String str5;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        JSONObject jSONObject = new JSONObject();
        if (!z2 && f25734d) {
            str4 = "vc";
        } else {
            str4 = "none";
        }
        if (z2) {
            str5 = "";
        } else {
            str5 = f25732b;
        }
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39634a(jSONObject, str, i, str4, str2, str3, "", str5, f25733c, "none", "none", z);
        jSONObject.put("click", i2 != 1 ? i2 != 4 ? "cancel" : "edit" : "read");
        jSONObject.put("from_scene", z2 ? "im_card" : "add_collaborator");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_ask_owner_type_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39649b(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_share_ask_owner_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39624a(String str, ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "send_request");
        jSONObject.put("is_add_notes", !(str.length() == 0));
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("target", "none");
        f25731a.m39625a("ccm_permission_share_ask_owner_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39630a(ArrayList<UserInfo> arrayList, String str) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        Intrinsics.checkParameterIsNotNull(str, "notes");
        JSONObject jSONObject = new JSONObject();
        f25731a.m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "send_link");
        jSONObject.put("is_add_notes", !(str.length() == 0));
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        jSONObject.put("target", "none");
        f25731a.m39625a("ccm_permission_send_link_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo36684a(boolean z, String str, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "location");
        JSONObject jSONObject = new JSONObject();
        m39634a(jSONObject, f25737g, f25738h, f25734d ? "vc" : "none", f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", z ? "confirm" : "cancel");
        jSONObject.put("trigger_location", str);
        jSONObject.put("is_lock_notify", z2 ? "true" : "false");
        jSONObject.put("target", "none");
        m39625a("ccm_permission_comment_without_permission_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m39674f() {
        f25731a.m39665d("ccm_permission_add_collaborator_view");
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m39691m() {
        f25731a.m39665d("ccm_permission_change_view");
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m39693n() {
        f25731a.m39665d("ccm_permission_share_encrypted_link_view");
    }

    /* renamed from: A */
    public final void mo36679A() {
        m39665d("ccm_permission_file_comment_set_view");
    }

    /* renamed from: B */
    public final void mo36680B() {
        m39671e("ccm_permission_file_comment_set_click");
    }

    /* renamed from: C */
    public final void mo36681C() {
        m39648b("ccm_permission_file_comment_set_click", false, true);
    }

    /* renamed from: D */
    public final void mo36682D() {
        m39658c("ccm_permission_file_comment_set_click", false, true);
    }

    /* renamed from: N */
    public final void mo36683N() {
        m39665d("ccm_permission_scope_change_view");
    }

    /* renamed from: w */
    public final void mo36697w() {
        m39665d("ccm_permission_add_collaborator_set_view");
    }

    /* renamed from: x */
    public final void mo36698x() {
        m39671e("ccm_permission_add_collaborator_set_click");
    }

    /* renamed from: y */
    public final void mo36699y() {
        m39665d("ccm_permission_file_security_set_view");
    }

    /* renamed from: z */
    public final void mo36700z() {
        m39671e("ccm_permission_file_security_set_click");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39593a() {
        f25731a.m39622a("restore", "ccm_permission_lock_restore_view");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39638b() {
        f25731a.m39622a("invite_collaborator", "ccm_permission_add_collaborator_view");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39653c() {
        f25731a.m39622a("manage_collaborator", "ccm_permission_management_collaborator_view");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m39663d() {
        f25731a.m39622a("share_link", "ccm_permission_share_encrypted_link_view");
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m39669e() {
        f25731a.m39622a("set", "ccm_permission_set_view");
    }

    @JvmStatic
    /* renamed from: E */
    public static final void m39583E() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        cVar.m39625a("ccm_permission_lock_restore_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: F */
    public static final void m39584F() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        cVar.m39625a("ccm_permission_read_without_edit_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: G */
    public static final void m39585G() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_ask_owner_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: H */
    public static final void m39586H() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_send_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: I */
    public static final void m39587I() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "delete");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_send_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: J */
    public static final void m39588J() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        cVar.m39625a("ccm_permission_share_at_people_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: K */
    public static final void m39589K() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "close");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_at_people_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: L */
    public static final void m39590L() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        cVar.m39625a("ccm_permission_comment_without_permission_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: M */
    public static final void m39591M() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "true");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_comment_without_permission_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m39677g() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_select_contact_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m39679h() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        cVar.m39625a("ccm_permission_organization_authorize_send_notice_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m39682i() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "cancel");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_organization_authorize_send_notice_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m39694o() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_encrypted_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m39695p() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "change_password");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_encrypted_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m39696q() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "copy_link_and_password");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_encrypted_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: r */
    public static final void m39697r() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: s */
    public static final void m39698s() {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "return");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: t */
    public final void mo36694t() {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "add_collaborator_set");
        jSONObject.put("target", "ccm_permission_add_collaborator_set_view");
        m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: u */
    public final void mo36695u() {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "file_security_set");
        jSONObject.put("target", "ccm_permission_file_security_set_view");
        m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: v */
    public final void mo36696v() {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "file_comment_set");
        jSONObject.put("target", "ccm_permission_file_comment_set_view");
        m39625a("ccm_permission_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39654c(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        f25731a.m39601a(userInfo, "remove");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m39664d(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        f25731a.m39601a(userInfo, "set_owner");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39643b(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "lockReason");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        cVar.m39634a(jSONObject, str3, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("reason", str);
        cVar.m39625a("ccm_permission_lock_view", jSONObject);
    }

    /* renamed from: d */
    private final void m39665d(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        m39634a(jSONObject, str3, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        m39625a(str, jSONObject);
    }

    /* renamed from: e */
    private final void m39671e(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        m39634a(jSONObject, str3, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "return");
        jSONObject.put("target", "ccm_permission_set_view");
        m39625a(str, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39594a(int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i2 = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i2, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "comment_set");
        String str3 = "read";
        if (i != 0 && i == 1) {
            str3 = "edit";
        }
        jSONObject.put("list_type", str3);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39639b(int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i2 = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i2, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "security_set");
        String str3 = "read";
        if (i != 0 && i == 1) {
            str3 = "edit";
        }
        jSONObject.put("list_type", str3);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39655c(String str) {
        String str2;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        cVar.m39634a(jSONObject, str3, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "apply");
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("is_add_notes", !z);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_read_without_edit_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m39670e(UserInfo userInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        cVar.m39625a("ccm_permission_management_collaborator_set_owner_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m39675f(UserInfo userInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        cVar.m39625a("ccm_permission_share_ask_owner_type_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m39681h(boolean z) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str3, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        if (z) {
            str2 = "confirm";
        } else {
            str2 = "cancel";
        }
        jSONObject.put("click", str2);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_lock_restore_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m39684i(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "confirm");
        jSONObject.put("is_send_notice", z);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_at_people_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m39673e(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "switch");
        jSONObject.put("is_share_outside_organization", z);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: f */
    public final void mo36690f(boolean z) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        m39634a(jSONObject, str3, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "is_only_fa_share_outside");
        String str4 = "false";
        if (z) {
            str2 = str4;
        } else {
            str2 = "true";
        }
        jSONObject.put("perm_set_before", str2);
        if (z) {
            str4 = "true";
        }
        jSONObject.put("perm_set_after", str4);
        jSONObject.put("target", "none");
        m39625a("ccm_permission_set_click", jSONObject);
    }

    /* renamed from: g */
    public final void mo36692g(boolean z) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        m39634a(jSONObject, str3, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "only_inside_organization");
        String str4 = "false";
        if (z) {
            str2 = str4;
        } else {
            str2 = "true";
        }
        jSONObject.put("perm_set_before", str2);
        if (z) {
            str4 = "true";
        }
        jSONObject.put("perm_set_after", str4);
        jSONObject.put("target", "none");
        m39625a("ccm_permission_add_collaborator_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39641b(UserInfo userInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        cVar.m39625a("ccm_permission_management_collaborator_list_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m39668d(boolean z) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str3, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        jSONObject.put("is_new_set_menu", str2);
        cVar.m39625a("ccm_permission_set_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39659c(ArrayList<UserInfo> arrayList) {
        String str;
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            jSONObject2.put("collaborate_type", next.getOwnerType());
            jSONObject2.put("object_uid", C13598b.m55197d(next.getId()));
            jSONObject2.put("list_type", f25731a.m39592a(f25738h, next.getPermission()));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("user_list", jSONArray.toString());
        f25731a.m39625a("ccm_permission_send_link_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39660c(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "open_password");
        jSONObject.put("open_password_type", z);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_encrypted_link_click", jSONObject);
    }

    /* renamed from: b */
    public final void mo36686b(boolean z, boolean z2) {
        m39628a("ccm_permission_add_collaborator_set_click", z, z2);
    }

    /* renamed from: c */
    public final void mo36687c(boolean z, boolean z2) {
        m39648b("ccm_permission_add_collaborator_set_click", z, z2);
    }

    /* renamed from: d */
    public final void mo36688d(boolean z, boolean z2) {
        m39658c("ccm_permission_add_collaborator_set_click", z, z2);
    }

    /* renamed from: e */
    public final void mo36689e(boolean z, boolean z2) {
        m39628a("ccm_permission_file_security_set_click", z, z2);
    }

    /* renamed from: g */
    public final void mo36693g(boolean z, boolean z2) {
        m39658c("ccm_permission_file_security_set_click", z, z2);
    }

    /* renamed from: f */
    public final void mo36691f(boolean z, boolean z2) {
        m39648b("ccm_permission_file_security_set_click", z, z2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39651b(boolean z, int i) {
        f25731a.m39623a("back", "none", z, i);
    }

    /* renamed from: a */
    private final String m39592a(int i, int i2) {
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        if (i == aVar.mo32555b()) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return "no_permission";
                    }
                    return "full_access";
                }
            }
            return "read";
        }
        if (!DocUserPermission.Companion.mo38041g(i2)) {
            if (!DocUserPermission.Companion.mo38037c(i2)) {
                if (!DocUserPermission.Companion.mo38035a(i2)) {
                    return "no_permission";
                }
                return "read";
            }
        }
        return "full_access";
        return "edit";
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39640b(int i, boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str2 = f25737g;
        int i2 = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str2, i2, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "share_set");
        String str3 = "myself";
        if (i != 0) {
            if (i == 1) {
                str3 = z ? "anyone_lark" : "inside_organization";
            } else if (i == 2) {
                str3 = "all";
            }
        }
        jSONObject.put("list_type", str3);
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_set_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39642b(UserInfo userInfo, int i) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        String str3 = f25737g;
        int i2 = f25738h;
        if (f25734d) {
            str = "vc";
        } else {
            str = "none";
        }
        cVar.m39634a(jSONObject, str3, i2, str, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        if (i == 1) {
            str2 = "read";
        } else if (i != 4) {
            str2 = "delete";
        } else {
            str2 = "edit";
        }
        jSONObject.put("click", str2);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("list_type", cVar.m39592a(f25738h, userInfo.getPermission()));
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_share_ask_owner_type_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39600a(UserInfo userInfo, int i) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        PermissionAnalyticV2 cVar = f25731a;
        cVar.m39601a(userInfo, cVar.m39592a(f25738h, i));
    }

    /* renamed from: a */
    private final void m39601a(UserInfo userInfo, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        String str3 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        m39634a(jSONObject, str3, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "option_list");
        jSONObject.put("perm_set_before", m39592a(f25738h, userInfo.getPermission()));
        jSONObject.put("perm_set_after", str);
        jSONObject.put("collaborate_type", userInfo.getOwnerType());
        jSONObject.put("object_uid", C13598b.m55197d(userInfo.getId()));
        jSONObject.put("target", "none");
        m39625a("ccm_permission_management_collaborator_list_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39661c(boolean z, int i) {
        f25731a.m39623a("add_collaborator", "ccm_permission_add_collaborator_view", z, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r17 == com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission.Companion.mo38736a(r18)) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m39596a(int r17, boolean r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2.m39596a(int, boolean, boolean):void");
    }

    /* renamed from: c */
    private final void m39658c(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        String str4 = f25737g;
        int i = f25738h;
        if (f25734d) {
            str2 = "vc";
        } else {
            str2 = "none";
        }
        m39634a(jSONObject, str4, i, str2, f25739i, f25735e, f25736f, f25732b, f25733c, "none", "none", f25740j);
        jSONObject.put("click", "read");
        jSONObject.put("target", "none");
        if (z2) {
            str3 = "edit";
        } else if (z) {
            str3 = "full_access";
        } else {
            str3 = "read";
        }
        jSONObject.put("perm_set_before", str3);
        jSONObject.put("perm_set_after", "read");
        m39625a(str, jSONObject);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m39672e(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f25731a.m39612a(str, i, str2, z, "organization", "ccm_permission_organization_authorize_view");
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m39680h(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f25731a.m39645b(str, i, str2, z, "back", "none");
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m39683i(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f25731a.m39645b(str, i, str2, z, "search", "ccm_permission_organization_authorize_search_view");
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m39686j(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f25731a.m39645b(str, i, str2, z, "next_level", "none");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39656c(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f25731a.m39612a(str, i, str2, z, "search", "none");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m39676f(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        cVar.m39625a("ccm_permission_organization_authorize_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m39688k(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        cVar.m39625a("ccm_permission_share_public_access_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m39690l(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        cVar.m39625a("ccm_permission_owner_turned_off_prompt_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m39666d(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", "delete");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_search_collaborator_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m39678g(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        cVar.m39625a("ccm_permission_organization_authorize_search_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m39692m(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", "got_it");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_owner_turned_off_prompt_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39644b(String str, int i, String str2, boolean z) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (f25734d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str3, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        cVar.m39625a("ccm_permission_search_collaborator_view", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39597a(int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        m39596a(i, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39598a(PermissionAnalyticV2 cVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        cVar.mo36685a(z, z2);
    }

    /* renamed from: b */
    private final void m39645b(String str, int i, String str2, boolean z, String str3, String str4) {
        String str5;
        JSONObject jSONObject = new JSONObject();
        if (f25734d) {
            str5 = "vc";
        } else {
            str5 = "none";
        }
        m39634a(jSONObject, str, i, str5, str2, f25735e, f25736f, f25732b, f25733c, "none", "none", z);
        jSONObject.put("click", str3);
        jSONObject.put("target", str4);
        m39625a("ccm_permission_organization_authorize_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39657c(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        String str6;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "userPerm");
        Intrinsics.checkParameterIsNotNull(str5, "publicPerm");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (z) {
            str6 = "vc";
        } else {
            str6 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str6, str2, str3, "", str4, str5, "none", "none", z2);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_without_permission_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m39667d(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        String str6;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "userPerm");
        Intrinsics.checkParameterIsNotNull(str5, "publicPerm");
        JSONObject jSONObject = new JSONObject();
        PermissionAnalyticV2 cVar = f25731a;
        if (z) {
            str6 = "vc";
        } else {
            str6 = "none";
        }
        cVar.m39634a(jSONObject, str, i, str6, str2, str3, "", str4, str5, "none", "none", z2);
        jSONObject.put("click", "back");
        jSONObject.put("target", "none");
        cVar.m39625a("ccm_permission_unable_to_apply_click", jSONObject);
    }
}
