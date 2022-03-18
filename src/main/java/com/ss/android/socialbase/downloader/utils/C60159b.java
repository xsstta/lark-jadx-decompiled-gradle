package com.ss.android.socialbase.downloader.utils;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.android.socialbase.downloader.utils.b */
public class C60159b {
    /* renamed from: a */
    public static String m233739a(int i) {
        if (i == 449) {
            return "Retry With";
        }
        if (i == 451) {
            return "Unavailable For Legal Reasons";
        }
        if (i == 600) {
            return "Unparseable Response Headers";
        }
        if (i == 509) {
            return "Bandwidth Limit Exceeded";
        }
        if (i == 510) {
            return "Not Extended";
        }
        switch (i) {
            case 100:
                return "Continue";
            case 101:
                return "Switching Protocols";
            case 102:
                return "Processing";
            default:
                switch (i) {
                    case LocationRequest.PRIORITY_HD_ACCURACY:
                        return "OK";
                    case 201:
                        return "Created";
                    case 202:
                        return "Accepted";
                    case SmEvents.EVENT_HBRESET /*{ENCODED_INT: 203}*/:
                        return "Non-Authoritative Information";
                    case 204:
                        return "No Content";
                    case SmEvents.EVENT_HB_NOTICE_DISCONNECT /*{ENCODED_INT: 205}*/:
                        return "Reset Content";
                    case SmEvents.EVENT_NONET /*{ENCODED_INT: 206}*/:
                        return "Partial Content";
                    case 207:
                        return "Multi-Status";
                    default:
                        switch (i) {
                            case LocationRequest.PRIORITY_INDOOR:
                                return "Multiple Choices";
                            case 301:
                                return "Moved Permanently";
                            case 302:
                                return "Move Temporarily";
                            case 303:
                                return "See Other";
                            case 304:
                                return "Not Modified";
                            case 305:
                                return "Use Proxy";
                            case 306:
                                return "Switch Proxy";
                            case 307:
                                return "Temporary Redirect";
                            default:
                                switch (i) {
                                    case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL /*{ENCODED_INT: 400}*/:
                                        return "Bad Request";
                                    case 401:
                                        return "Unauthorized";
                                    case 402:
                                        return "Payment Required";
                                    case 403:
                                        return "Forbidden";
                                    case 404:
                                        return "Not Found";
                                    case 405:
                                        return "Method Not Allowed";
                                    case 406:
                                        return "Not Acceptable";
                                    case 407:
                                        return "Proxy Authentication Required";
                                    case 408:
                                        return "Request Timeout";
                                    case 409:
                                        return "Conflict";
                                    case 410:
                                        return "Gone";
                                    case TTVideoEngine.PLAYER_OPTION_USE_THREAD_POOL /*{ENCODED_INT: 411}*/:
                                        return "Length Required";
                                    case TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC /*{ENCODED_INT: 412}*/:
                                        return "Precondition Failed";
                                    case TTVideoEngine.PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO /*{ENCODED_INT: 413}*/:
                                        return "Request Entity Too Large";
                                    case TTVideoEngine.PLAYER_OPTION_DEFAULT_RENDER_TYPE /*{ENCODED_INT: 414}*/:
                                        return "Request-URI Too Long";
                                    case 415:
                                        return "Unsupported Media Type";
                                    case 416:
                                        return "Requested Range Not Satisfiable";
                                    case 417:
                                        return "Expectation Failed";
                                    case 418:
                                        return "I'm a teapot";
                                    default:
                                        switch (i) {
                                            case 421:
                                                return "Too Many Connections";
                                            case 422:
                                                return "Unprocessable Entity";
                                            case 423:
                                                return "Locked";
                                            case 424:
                                                return "Failed Dependency";
                                            case 425:
                                                return "Unordered Collection";
                                            case 426:
                                                return "Upgrade Required";
                                            default:
                                                switch (i) {
                                                    case ParticipantRepo.f117150c:
                                                        return "Internal Server Error";
                                                    case 501:
                                                        return "Not Implemented";
                                                    case 502:
                                                        return "Bad Gateway";
                                                    case 503:
                                                        return "Service Unavailable";
                                                    case 504:
                                                        return "Gateway Timeout";
                                                    case 505:
                                                        return "HTTP Version Not Supported";
                                                    case 506:
                                                        return "Variant Also Negotiates";
                                                    case 507:
                                                        return "Insufficient Storage";
                                                    default:
                                                        return "";
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
