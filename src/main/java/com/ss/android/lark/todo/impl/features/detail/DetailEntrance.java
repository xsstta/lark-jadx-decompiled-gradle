package com.ss.android.lark.todo.impl.features.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import com.ss.android.lark.todo.impl.framework.hitpoint.appreciable.TodoAppreciableHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.b */
public final class DetailEntrance {

    /* renamed from: a */
    public static final DetailEntrance f139694a = new DetailEntrance();

    private DetailEntrance() {
    }

    /* renamed from: a */
    public final void mo192300a(Context context, BlockEntity blockEntity, BlockExtra blockExtra) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
        String str5 = null;
        String sourceMeta = blockEntity.getSourceMeta();
        if (sourceMeta != null) {
            if (sourceMeta.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(sourceMeta);
                    str4 = jSONObject.get("chat_id").toString();
                    try {
                        str5 = jSONObject.get("message_id").toString();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str4 = str5;
                }
                str3 = str5;
                str5 = str4;
            } else {
                str3 = str5;
            }
            str2 = str5;
            str = str3;
        } else {
            str2 = str5;
            str = str2;
        }
        m220106a(this, context, blockEntity.getBlockID(), str2, str, blockExtra, true, false, 64, (Object) null);
    }

    /* renamed from: a */
    public final void mo192299a(Activity activity, String str, String str2, TodoSceneType todoSceneType) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(todoSceneType, "todoSceneType");
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i("DetailEntrance", cVar.mo191765a("goCreateDetail blockId:" + str));
        TodoAppreciableHitPoint.f141058a.mo194141d();
        Intent intent = new Intent();
        intent.setClass(activity, TodoDetailActivity.class);
        intent.putExtra("todo_detail_key_is_create", true);
        intent.putExtra("todo_detail_key_block_id", str);
        intent.putExtra("todo_detail_key_chat_id", str2);
        intent.putExtra("todo_detail_key_main_scene_type", todoSceneType);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo192301a(Context context, String str, String str2, String str3, BlockExtra blockExtra, boolean z, boolean z2) {
        BlockExtra.SceneType sceneType;
        RichTextMessage richTextMessage;
        MultiMessage multiMessage;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Log.m165389i("DetailEntrance", LogMessageUtil.f139260a.mo191765a("goCreateDetail blockId:" + str + ", chatId: " + str2));
        TodoAppreciableHitPoint.f141058a.mo194141d();
        Intent intent = new Intent();
        intent.setClass(context, TodoDetailActivity.class);
        intent.putExtra("todo_detail_key_is_create", true);
        intent.putExtra("todo_detail_key_block_id", str);
        intent.putExtra("todo_detail_key_chat_id", str2);
        intent.putExtra("todo_detail_key_message_id", str3);
        String str4 = null;
        if (blockExtra != null) {
            sceneType = blockExtra.sceneType;
        } else {
            sceneType = null;
        }
        intent.putExtra("todo_detail_key_message_scene_type", sceneType);
        if (blockExtra != null) {
            richTextMessage = blockExtra.richTextMessage;
        } else {
            richTextMessage = null;
        }
        intent.putExtra("todo_detail_key_message_rich_text", richTextMessage);
        if (blockExtra != null) {
            multiMessage = blockExtra.multiMessage;
        } else {
            multiMessage = null;
        }
        intent.putExtra("todo_detail_key_multi_message", multiMessage);
        intent.putExtra("todo_detail_key_horizontal_animation", z2);
        if (blockExtra != null) {
            str4 = blockExtra.parentMsgSenderId;
        }
        intent.putExtra("todo_detail_key_parent_sender_id", str4);
        if (!z || !(context instanceof Activity)) {
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        ((Activity) context).startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public final void mo192302a(Context context, String str, boolean z, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "cardChatId");
        LogMessageUtil cVar = LogMessageUtil.f139260a;
        Log.m165389i("DetailEntrance", cVar.mo191765a("showTodoDetail guid:" + str + ", isFromTab: " + z));
        TodoAppreciableHitPoint.f141058a.mo194141d();
        Intent intent = new Intent();
        intent.setClass(context, TodoDetailActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("todo_detail_key_is_create", false);
        intent.putExtra("todo_detail_key_guid", str);
        intent.putExtra("todo_detail_key_from_todo_tab", z);
        intent.putExtra("todo_detail_key_card_chat_id", str2);
        intent.putExtra("todo_detail_key_message_id", str3);
        intent.putExtra("todo_detail_key_auth_scene", str4);
        intent.putExtra("todo_detail_key_auth_id", str5);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static /* synthetic */ void m220106a(DetailEntrance bVar, Context context, String str, String str2, String str3, BlockExtra blockExtra, boolean z, boolean z2, int i, Object obj) {
        String str4;
        String str5;
        String str6;
        BlockExtra blockExtra2;
        boolean z3;
        if ((i & 2) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            blockExtra2 = null;
        } else {
            blockExtra2 = blockExtra;
        }
        boolean z4 = false;
        if ((i & 32) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 64) == 0) {
            z4 = z2;
        }
        bVar.mo192301a(context, str4, str5, str6, blockExtra2, z3, z4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m220107a(DetailEntrance bVar, Context context, String str, boolean z, String str2, String str3, String str4, String str5, int i, Object obj) {
        boolean z2;
        String str6;
        String str7;
        String str8;
        String str9;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            str9 = "";
        } else {
            str9 = str5;
        }
        bVar.mo192302a(context, str, z2, str6, str7, str8, str9);
    }
}
