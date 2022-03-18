"use strict";function _typeof(e){return(_typeof="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e})(e)}function asyncGeneratorStep(e,t,n,r,o,i,a){try{var s=e[i](a),c=s.value}catch(e){return void n(e)}s.done?t(c):Promise.resolve(c).then(r,o)}function _asyncToGenerator(s){return function(){var e=this,a=arguments;return new Promise(function(t,n){var r=s.apply(e,a);function o(e){asyncGeneratorStep(r,t,n,o,i,"next",e)}function i(e){asyncGeneratorStep(r,t,n,o,i,"throw",e)}o(void 0)})}}function _defineProperty(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function ownKeys(t,e){var n=Object.keys(t);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(t);e&&(r=r.filter(function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable})),n.push.apply(n,r)}return n}function _objectSpread2(t){for(var e=1;e<arguments.length;e++){var n=null!=arguments[e]?arguments[e]:{};e%2?ownKeys(Object(n),!0).forEach(function(e){_defineProperty(t,e,n[e])}):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(n)):ownKeys(Object(n)).forEach(function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(n,e))})}return t}function _objectWithoutPropertiesLoose(e,t){if(null==e)return{};var n,r,o={},i=Object.keys(e);for(r=0;r<i.length;r++)n=i[r],0<=t.indexOf(n)||(o[n]=e[n]);return o}function _objectWithoutProperties(e,t){if(null==e)return{};var n,r,o=_objectWithoutPropertiesLoose(e,t);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);for(r=0;r<i.length;r++)n=i[r],0<=t.indexOf(n)||Object.prototype.propertyIsEnumerable.call(e,n)&&(o[n]=e[n])}return o}var isAndroid=Boolean(window.jsObj),isIOS=Boolean(window.webkit&&window.webkit.messageHandlers&&window.webkit.messageHandlers.jsObj),isNative=Boolean(isAndroid||isIOS);function parseNativeData(e){try{return safelyParseJSON(decodeURIComponent(escape(window.atob(e))))}catch(e){return console.error("parse native data error",e),{}}}function sendMessageToNative(e){var t=String(e.method),n="object"===_typeof(e.params)?JSON.stringify(e.params):void 0!==e.params?String(e.params):"";isAndroid?window.jsObj[t]&&window.jsObj[t](n):isIOS&&window.webkit.messageHandlers.jsObj.postMessage({method:t,params:n})}function safelyParseJSON(e){try{return JSON.parse(e)}catch(e){return console.error("parse json error",e),{}}}function unwrapExports(e){return e&&e.__esModule&&Object.prototype.hasOwnProperty.call(e,"default")?e.default:e}function createCommonjsModule(e,t){return e(t={exports:{}},t.exports),t.exports}var runtime_1=createCommonjsModule(function(e){var t=function(a){var c,e=Object.prototype,l=e.hasOwnProperty,t="function"==typeof Symbol?Symbol:{},o=t.iterator||"@@iterator",n=t.asyncIterator||"@@asyncIterator",r=t.toStringTag||"@@toStringTag";function s(e,t,n,r){var o=t&&t.prototype instanceof m?t:m,i=Object.create(o.prototype),a=new x(r||[]);return i._invoke=function(i,a,s){var c=u;return function(e,t){if(c===f)throw new Error("Generator is already running");if(c===h){if("throw"===e)throw t;return _()}for(s.method=e,s.arg=t;;){var n=s.delegate;if(n){var r=j(n,s);if(r){if(r===v)continue;return r}}if("next"===s.method)s.sent=s._sent=s.arg;else if("throw"===s.method){if(c===u)throw c=h,s.arg;s.dispatchException(s.arg)}else"return"===s.method&&s.abrupt("return",s.arg);c=f;var o=p(i,a,s);if("normal"===o.type){if(c=s.done?h:d,o.arg===v)continue;return{value:o.arg,done:s.done}}"throw"===o.type&&(c=h,s.method="throw",s.arg=o.arg)}}}(e,n,a),i}function p(e,t,n){try{return{type:"normal",arg:e.call(t,n)}}catch(e){return{type:"throw",arg:e}}}a.wrap=s;var u="suspendedStart",d="suspendedYield",f="executing",h="completed",v={};function m(){}function i(){}function b(){}var y={};y[o]=function(){return this};var g=Object.getPrototypeOf,w=g&&g(g(C([])));w&&w!==e&&l.call(w,o)&&(y=w);var O=b.prototype=m.prototype=Object.create(y);function k(e){["next","throw","return"].forEach(function(t){e[t]=function(e){return this._invoke(t,e)}})}function S(c,u){var t;this._invoke=function(n,r){function e(){return new u(function(e,t){!function t(e,n,r,o){var i=p(c[e],c,n);if("throw"!==i.type){var a=i.arg,s=a.value;return s&&"object"===_typeof(s)&&l.call(s,"__await")?u.resolve(s.__await).then(function(e){t("next",e,r,o)},function(e){t("throw",e,r,o)}):u.resolve(s).then(function(e){a.value=e,r(a)},function(e){return t("throw",e,r,o)})}o(i.arg)}(n,r,e,t)})}return t=t?t.then(e,e):e()}}function j(e,t){var n=e.iterator[t.method];if(n===c){if(t.delegate=null,"throw"===t.method){if(e.iterator.return&&(t.method="return",t.arg=c,j(e,t),"throw"===t.method))return v;t.method="throw",t.arg=new TypeError("The iterator does not provide a 'throw' method")}return v}var r=p(n,e.iterator,t.arg);if("throw"===r.type)return t.method="throw",t.arg=r.arg,t.delegate=null,v;var o=r.arg;return o?o.done?(t[e.resultName]=o.value,t.next=e.nextLoc,"return"!==t.method&&(t.method="next",t.arg=c),t.delegate=null,v):o:(t.method="throw",t.arg=new TypeError("iterator result is not an object"),t.delegate=null,v)}function E(e){var t={tryLoc:e[0]};1 in e&&(t.catchLoc=e[1]),2 in e&&(t.finallyLoc=e[2],t.afterLoc=e[3]),this.tryEntries.push(t)}function P(e){var t=e.completion||{};t.type="normal",delete t.arg,e.completion=t}function x(e){this.tryEntries=[{tryLoc:"root"}],e.forEach(E,this),this.reset(!0)}function C(t){if(t){var e=t[o];if(e)return e.call(t);if("function"==typeof t.next)return t;if(!isNaN(t.length)){var n=-1,r=function e(){for(;++n<t.length;)if(l.call(t,n))return e.value=t[n],e.done=!1,e;return e.value=c,e.done=!0,e};return r.next=r}}return{next:_}}function _(){return{value:c,done:!0}}return i.prototype=O.constructor=b,b.constructor=i,b[r]=i.displayName="GeneratorFunction",a.isGeneratorFunction=function(e){var t="function"==typeof e&&e.constructor;return!!t&&(t===i||"GeneratorFunction"===(t.displayName||t.name))},a.mark=function(e){return Object.setPrototypeOf?Object.setPrototypeOf(e,b):(e.__proto__=b,r in e||(e[r]="GeneratorFunction")),e.prototype=Object.create(O),e},a.awrap=function(e){return{__await:e}},k(S.prototype),S.prototype[n]=function(){return this},a.AsyncIterator=S,a.async=function(e,t,n,r,o){void 0===o&&(o=Promise);var i=new S(s(e,t,n,r),o);return a.isGeneratorFunction(t)?i:i.next().then(function(e){return e.done?e.value:i.next()})},k(O),O[r]="Generator",O[o]=function(){return this},O.toString=function(){return"[object Generator]"},a.keys=function(n){var r=[];for(var e in n)r.push(e);return r.reverse(),function e(){for(;r.length;){var t=r.pop();if(t in n)return e.value=t,e.done=!1,e}return e.done=!0,e}},a.values=C,x.prototype={constructor:x,reset:function(e){if(this.prev=0,this.next=0,this.sent=this._sent=c,this.done=!1,this.delegate=null,this.method="next",this.arg=c,this.tryEntries.forEach(P),!e)for(var t in this)"t"===t.charAt(0)&&l.call(this,t)&&!isNaN(+t.slice(1))&&(this[t]=c)},stop:function(){this.done=!0;var e=this.tryEntries[0].completion;if("throw"===e.type)throw e.arg;return this.rval},dispatchException:function(n){if(this.done)throw n;var r=this;function e(e,t){return i.type="throw",i.arg=n,r.next=e,t&&(r.method="next",r.arg=c),!!t}for(var t=this.tryEntries.length-1;0<=t;--t){var o=this.tryEntries[t],i=o.completion;if("root"===o.tryLoc)return e("end");if(o.tryLoc<=this.prev){var a=l.call(o,"catchLoc"),s=l.call(o,"finallyLoc");if(a&&s){if(this.prev<o.catchLoc)return e(o.catchLoc,!0);if(this.prev<o.finallyLoc)return e(o.finallyLoc)}else if(a){if(this.prev<o.catchLoc)return e(o.catchLoc,!0)}else{if(!s)throw new Error("try statement without catch or finally");if(this.prev<o.finallyLoc)return e(o.finallyLoc)}}}},abrupt:function(e,t){for(var n=this.tryEntries.length-1;0<=n;--n){var r=this.tryEntries[n];if(r.tryLoc<=this.prev&&l.call(r,"finallyLoc")&&this.prev<r.finallyLoc){var o=r;break}}o&&("break"===e||"continue"===e)&&o.tryLoc<=t&&t<=o.finallyLoc&&(o=null);var i=o?o.completion:{};return i.type=e,i.arg=t,o?(this.method="next",this.next=o.finallyLoc,v):this.complete(i)},complete:function(e,t){if("throw"===e.type)throw e.arg;return"break"===e.type||"continue"===e.type?this.next=e.arg:"return"===e.type?(this.rval=this.arg=e.arg,this.method="return",this.next="end"):"normal"===e.type&&t&&(this.next=t),v},finish:function(e){for(var t=this.tryEntries.length-1;0<=t;--t){var n=this.tryEntries[t];if(n.finallyLoc===e)return this.complete(n.completion,n.afterLoc),P(n),v}},catch:function(e){for(var t=this.tryEntries.length-1;0<=t;--t){var n=this.tryEntries[t];if(n.tryLoc===e){var r=n.completion;if("throw"===r.type){var o=r.arg;P(n)}return o}}throw new Error("illegal catch attempt")},delegateYield:function(e,t,n){return this.delegate={iterator:C(e),resultName:t,nextLoc:n},"next"===this.method&&(this.arg=c),v}},a}(e.exports);try{regeneratorRuntime=t}catch(e){Function("r","regeneratorRuntime = r")(t)}}),lib=createCommonjsModule(function(e,t){function P(e){return(P="function"==typeof Symbol&&"symbol"==_typeof(Symbol.iterator)?function(e){return _typeof(e)}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":_typeof(e)})(e)}Object.defineProperty(t,"__esModule",{value:!0});var m=function(){return(m=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)};var A=function(){return(A=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)};function L(e,a,s,c){return new(s=s||Promise)(function(n,t){function r(e){try{i(c.next(e))}catch(e){t(e)}}function o(e){try{i(c.throw(e))}catch(e){t(e)}}function i(e){var t;e.done?n(e.value):((t=e.value)instanceof s?t:new s(function(e){e(t)})).then(r,o)}i((c=c.apply(e,a||[])).next())})}function N(n,r){var o,i,a,e,s={label:0,sent:function(){if(1&a[0])throw a[1];return a[1]},trys:[],ops:[]};return e={next:t(0),throw:t(1),return:t(2)},"function"==typeof Symbol&&(e[Symbol.iterator]=function(){return this}),e;function t(t){return function(e){return function(t){if(o)throw new TypeError("Generator is already executing.");for(;s;)try{if(o=1,i&&(a=2&t[0]?i.return:t[0]?i.throw||((a=i.return)&&a.call(i),0):i.next)&&!(a=a.call(i,t[1])).done)return a;switch(i=0,a&&(t=[2&t[0],a.value]),t[0]){case 0:case 1:a=t;break;case 4:return s.label++,{value:t[1],done:!1};case 5:s.label++,i=t[1],t=[0];continue;case 7:t=s.ops.pop(),s.trys.pop();continue;default:if(!(a=0<(a=s.trys).length&&a[a.length-1])&&(6===t[0]||2===t[0])){s=0;continue}if(3===t[0]&&(!a||t[1]>a[0]&&t[1]<a[3])){s.label=t[1];break}if(6===t[0]&&s.label<a[1]){s.label=a[1],a=t;break}if(a&&s.label<a[2]){s.label=a[2],s.ops.push(t);break}a[2]&&s.ops.pop(),s.trys.pop();continue}t=r.call(n,s)}catch(e){t=[6,e],i=0}finally{o=a=0}if(5&t[0])throw t[1];return{value:t[0]?t[1]:void 0,done:!0}}([t,e])}}}var M=(n.add=function(e){n.HANDLE_LIST.push(e),window.addEventListener("message",e,!1)},n.remove=function(e){var t=n.HANDLE_LIST.indexOf(e);0<=t&&n.HANDLE_LIST.splice(t,1),window.removeEventListener("message",e,!1)},n.empty=function(){for(;n.HANDLE_LIST.length;)window.removeEventListener("message",n.HANDLE_LIST.shift(),!1)},n.parse=function(t){try{return"object"==P(t)?t:t?JSON.parse(t):t}catch(e){return console.log("Message.parse Error:",e),t}},n.HANDLE_LIST=[],n);function n(){}function x(e){return"[object Function]"==={}.toString.call(e)}var F,o,C,r,i,a,s,c,_={origin:""};function u(e){return _[e]}function B(e){return u("origin")!==e.origin}(c=F=F||{}).unknown="unknown",c.spreadsheet="s",c.writer="w",c.presentation="p",c.pdf="f",(s=o=o||{}).wps="w",s.et="s",s.presentation="p",s.pdf="f",(a=C=C||{}).nomal="nomal",a.simple="simple",(i=r=r||{})[i.requestFullscreen=1]="requestFullscreen",i[i.exitFullscreen=0]="exitFullscreen";function I(e,t,n){void 0===n&&(n=!0);var r=t;if(!p){var o=function t(n){var e=n.clientHeight,r=n.clientWidth;0!==e||0!==r||d?0===e&&0===r||!d||(d.disconnect(),d=null):window.ResizeObserver&&(d=new ResizeObserver(function(e){t(n)})).observe(n),p.style.cssText+="height: "+e+"px; width: "+r+"px"}.bind(null,r);(p=document.createElement("iframe")).classList.add("web-office-iframe");var i={id:"office-iframe",src:e,scrolling:"no",frameborder:"0",allowfullscreen:"allowfullscreen",webkitallowfullscreen:"true",mozallowfullscreen:"true"};for(var a in r?(i.style="width: "+r.clientWidth+"px; height: "+r.clientHeight+"px;",n&&window.addEventListener("resize",o)):((r=document.createElement("div")).classList.add("web-office-default-container"),function(){var e=document.createElement("style");document.head.appendChild(e);var t=e.sheet;t.insertRule(".web-office-default-container {position: absolute; padding: 0;  margin: 0; width: 100vw; height: 100vh; left: 0; top: 0;}",t.cssRules.length)}(),document.body.appendChild(r),i.style="width: 100vw; height: 100vh;"),i)p.setAttribute(a,i[a]);r.appendChild(p),p.destroy=function(){p.parentNode.removeChild(p),p=null,window.removeEventListener("resize",o),d&&(d.disconnect(),d=null)}}return p}var l,p,d,b=(l=0,function(){return l+=1}),D=function(e){I().contentWindow.postMessage(JSON.stringify(e),u("origin"))};function T(e,t,i){return new Promise(function(r){var o=b();M.add(function e(t){if(!B(t)){var n=M.parse(t.data);n.eventName===i&&n.msgId===o&&(r(n.data),M.remove(e))}}),D({data:e,msgId:o,eventName:t})})}function W(e){return T(e,"api.basic","api.basic.reply")}var R={idMap:{}};function y(p){return L(this,void 0,void 0,function(){var t,n,r,o,i,a,s,c,u,l;return N(this,function(e){switch(e.label){case 0:return B(p)?[2]:(t=M.parse(p.data),n=t.eventName,r=t.callbackId,o=t.data,r&&(i=R.idMap[r])?(a=i.split(":"),s=a[0],c=a[1],"api.callback"===n&&R[s]&&R[s][c]?[4,(l=R[s][c]).callback.apply(l,o.args)]:[3,2]):[3,2]);case 1:u=e.sent(),D({result:u,callbackId:r,eventName:"api.callback.reply"}),e.label=2;case 2:return[2]}})})}var H=function(d,f,h,v){return L(void 0,void 0,void 0,function(){var a,s,c,o,u,i,l,p;return N(this,function(e){switch(e.label){case 0:return a=b(),o=new Promise(function(e,t){s=e,c=t}),u={},f.args?[4,g(f.args)]:[3,2];case 1:i=e.sent(),l=i[0],p=i[1],f.args=l,u=p,e.label=2;case 2:return"api.setter"!==d?[3,4]:[4,function(p){return L(void 0,void 0,void 0,function(){function t(){return Object.keys(R.idMap).find(function(e){return R.idMap[e]===r+":"+n})}var n,r,o,i,a,s,c,u,l;return N(this,function(e){switch(e.label){case 0:return n=p.prop,r=p.parentObjId,[4,g([o=p.value])];case 1:return i=e.sent(),a=i[0],s=i[1],p.value=a[0],c=Object.keys(s)[0],u=R[r],null===o&&u&&u[n]&&((l=t())&&delete R.idMap[l],delete u[n],Object.keys(u).length||delete R[r],Object.keys(R.idMap).length||M.remove(y)),c&&(Object.keys(R.idMap).length||M.add(y),R[r]||(R[r]={}),R[r][n]={callbackId:c,callback:s[c]},(l=t())&&delete R.idMap[l],R.idMap[c]=r+":"+n),[2]}})})}(f)];case 3:e.sent(),e.label=4;case 4:return r=(t=[{eventName:d,data:f,msgId:a},function(){var e=this;return M.add(function o(i){return L(e,void 0,void 0,function(){var t,n,r;return N(this,function(e){switch(e.label){case 0:return B(i)?[2]:"api.callback"===(t=M.parse(i.data)).eventName&&t.callbackId&&u[t.callbackId]?[4,u[t.callbackId].apply(u,t.data.args)]:[3,2];case 1:n=e.sent(),D({result:n,eventName:"api.callback.reply",callbackId:t.callbackId}),e.label=2;case 2:return t.eventName===d+".reply"&&t.msgId===a&&(t.error?((r=new Error("")).stack=t.error+"\n"+h,v&&v(),c(r)):s(t.result),M.remove(o)),[2]}})})}),o}])[1],"function"==typeof(n=A({},n=t[0])).data&&(n.data=n.data()),r(),D(n),[2,o]}var t,n,r})})};function g(d){return L(this,void 0,void 0,function(){var t,n,r,o,i,a,s,c,u,l,p;return N(this,function(e){switch(e.label){case 0:t={},n=[],r=d.slice(0),e.label=1;case 1:return r.length?(o=void 0,[4,r.shift()]):[3,13];case 2:return(i=e.sent())&&i.done?[4,i.done()]:[3,4];case 3:e.sent(),e.label=4;case 4:if(!function(e){if(!e)return!1;for(var t=e;null!==Object.getPrototypeOf(t);)t=Object.getPrototypeOf(t);return Object.getPrototypeOf(e)===t}(o))return[3,11];for(s in o={},a=[],i)a.push(s);c=0,e.label=5;case 5:return c<a.length?(u=a[c],l=i[u],/^[A-Z]/.test(u)?l&&l.done?[4,l.done()]:[3,7]:[3,8]):[3,10];case 6:e.sent(),e.label=7;case 7:l&&l.objId?l={objId:l.objId}:"function"==typeof l&&(p=b(),t[p]=l,l={callbackId:p}),e.label=8;case 8:o[u]=l,e.label=9;case 9:return c++,[3,5];case 10:return[3,12];case 11:o=i&&i.objId?{objId:i.objId}:"function"==typeof i&&void 0===i.objId?(p=b(),t[p]=i,{callbackId:p}):i,e.label=12;case 12:return n.push(o),[3,1];case 13:return[2,[n,t]]}})})}var V=function(e){void 0===e&&(e="");var t="";if(!t&&e){var n=e.toLowerCase();-1!==n.indexOf("/office/s/")&&(t=F.spreadsheet),-1!==n.indexOf("/office/w/")&&(t=F.writer),-1!==n.indexOf("/office/p/")&&(t=F.presentation),-1!==n.indexOf("/office/f/")&&(t=F.pdf)}if(!t){var r=e.match(/[\?&]type=([a-z]+)/)||[];t=o[r[1]]||""}return t};function G(e,t){void 0===t&&(t=!0);var n=e.map(function(e){var t=e.attributes;if(!Array.isArray(t)){var n=[];for(var r in t)if(t.hasOwnProperty(r)){var o={name:r,value:t[r]};n.push(o)}e.attributes=n}return e});return t&&D({data:n,eventName:"setCommandBars"}),n}var f=window.navigator.userAgent.toLowerCase(),U=/Android|webOS|iPhone|iPod|BlackBerry|iPad/i.test(f),K=function(){try{return-1!==window._parent.location.search.indexOf("from=wxminiprogram")}catch(e){return!1}}();function z(){var e={status:r.requestFullscreen},t=document,n=t.fullscreenElement||t.webkitFullscreenElement||t.mozFullScreenElement;e.status=n?r.requestFullscreen:r.exitFullscreen,D({data:e,eventName:"fullscreenchange"})}var q=0,J=new Set;function Y(e){return q+=1,e||(t=q,J.forEach(function(e){return e(t)})),q;var t}function Q(){var e=new Error("");return(e.stack||e.message||"").split("\n").slice(2).join("\n")}var Z=["ExportAsFixedFormat","GetOperatorsInfo","ImportDataIntoFields","ReplaceText","ReplaceBookmark","GetBookmarkText","GetComments"];function X(e,n,t,r,o,i){var a,s=(e.done?e.done():Promise.resolve()).then(function(){return a=a||H(t,r,o,i)});n.done=function(){return s},n.then=function(e,t){return 0<=r.objId?(n.then=null,n.catch=null,s.then(function(){e(n)}).catch(function(e){return t(e)})):s.then(e,t)},n.catch=function(e){return s.catch(e)},n.Destroy=function(){return H("api.free",{objId:n.objId},"")}}var $=null,ee={fileOpen:"fileOpen",tabSwitch:"tabSwitch",fileSaved:"fileSaved",fileStatus:"fileStatus",fullscreenChange:"fullscreenChange",error:"error",stage:"stage"},te={getToken:"api.getToken",onToast:"event.toast",onHyperLinkOpen:"event.hyperLinkOpen",getClipboardData:"api.getClipboardData"};function ne(E,P,x,C,_,I,T){var e=this;void 0===x&&(x={}),M.add(function(j){return L(e,void 0,void 0,function(){var i,a,s,c,u,l,p,d,f,h,v,m,b,y,g,w,O,k,S;return N(this,function(e){switch(e.label){case 0:return B(j)?[2]:(i=M.parse(j.data),a=i.eventName,s=void 0===a?"":a,c=i.data,u=void 0===c?null:c,l=i.url,p=void 0===l?null:l,-1!==["wps.jssdk.api"].indexOf(s)?[2]:"ready"!==s?[3,1]:(D({eventName:"setConfig",data:A(A({},x),{version:E.version})}),E.tokenData&&E.setToken(A(A({},E.tokenData),{hasRefreshTokenConfig:!!x.refreshToken})),_.apiReadySended&&D({eventName:"api.ready"}),E.iframeReady=!0,[3,17]));case 1:return"error"!==s?[3,2]:(P.emit(ee.error,u),[3,17]);case 2:return"open.result"!==s?[3,3]:(void 0!==(null===(O=null==u?void 0:u.fileInfo)||void 0===O?void 0:O.officeVersion)&&(E.mainVersion=u.fileInfo.officeVersion,console.log("WebOfficeSDK Main Version: V"+E.mainVersion)),P.emit(ee.fileOpen,u),[3,17]);case 3:return"file.saved"!==s?[3,4]:(P.emit(ee.fileStatus,u),P.emit(ee.fileSaved,u),[3,17]);case 4:return"tab.switch"!==s?[3,5]:(P.emit(ee.tabSwitch,u),[3,17]);case 5:return"api.scroll"!==s?[3,6]:(window.scrollTo(u.x,u.y),[3,17]);case 6:if(s!==te.getToken)return[3,11];d={token:!1},e.label=7;case 7:return e.trys.push([7,9,,10]),[4,_.refreshToken()];case 8:return d=e.sent(),[3,10];case 9:return f=e.sent(),console.error("refreshToken: "+(f||"fail to get")),[3,10];case 10:return D({eventName:te.getToken+".reply",data:d}),[3,17];case 11:if(s!==te.getClipboardData)return[3,16];h={text:"",html:""},e.label=12;case 12:return e.trys.push([12,14,,15]),[4,_.getClipboardData()];case 13:return h=e.sent(),[3,15];case 14:return v=e.sent(),console.error("getClipboardData: "+(v||"fail to get")),[3,15];case 15:return D({eventName:te.getClipboardData+".reply",data:h}),[3,17];case 16:s===te.onToast?_.onToast(u):s===te.onHyperLinkOpen?_.onHyperLinkOpen(u):"stage"===s?P.emit(ee.stage,u):"event.callback"===s?(m=u.eventName,b=u.data,"fullScreenChange"===(y=m)&&(y=ee.fullscreenChange),((null===(k=x.commonOptions)||void 0===k?void 0:k.isBrowserViewFullscreen)||(null===(S=x.commonOptions)||void 0===S?void 0:S.isParentFullscreen))&&"fullscreenchange"===y&&(g=b.status,w=b.isDispatchEvent,x.commonOptions.isBrowserViewFullscreen?(n=I,r=T,o=w,0===(t=g)?n.style="position: static; width: "+r.width+"; height: "+r.height:1===t&&(n.style="position: absolute; width: 100%; height: 100%"),o&&function(t){["fullscreen","fullscreenElement"].forEach(function(e){Object.defineProperty(document,e,{get:function(){return!!t.status},configurable:!0})});var e=new CustomEvent("fullscreenchange");document.dispatchEvent(e)}({status:t})):x.commonOptions.isParentFullscreen&&function(e,t,n){var r=document.querySelector(n),o=r&&1===r.nodeType?r:t;if(0===e){var i=document;(i.exitFullscreen||i.mozCancelFullScreen||i.msExitFullscreen||i.webkitCancelFullScreen||i.webkitExitFullscreen).call(document)}else 1===e&&(o.requestFullscreen||o.mozRequestFullScreen||o.msRequestFullscreen||o.webkitRequestFullscreen).call(o)}(g,I,x.commonOptions.isParentFullscreen)),P.emit(y,b)):"api.ready"===s&&function(t,e){var n,r=this,o=e.Events,i=e.Enum,a=e.Props,s=a[0],c=a[1],u={objId:q};switch(function s(c,e,u){for(var t=e.slice(0),n=function(){var a=t.shift();!a.alias&&~Z.indexOf(a.prop)&&t.push(A(A({},a),{alias:a.prop+"Async"})),Object.defineProperty(c,a.alias||a.prop,{get:function(){var e=this,t=1===a.cache,n=t&&this["__"+a.prop+"CacheValue"];if(n)return n;function r(){for(var e,t=[],n=0;n<arguments.length;n++)t[n]=arguments[n];return void 0!==a.caller?function s(c,e,u){for(var t=e.slice(0),n=function(){var a=t.shift();!a.alias&&~Z.indexOf(a.prop)&&t.push(A(A({},a),{alias:a.prop+"Async"})),Object.defineProperty(c,a.alias||a.prop,{get:function(){var e=this,t=1===a.cache,n=t&&this["__"+a.prop+"CacheValue"];if(n)return n;function r(){for(var e,t=[],n=0;n<arguments.length;n++)t[n]=arguments[n];return void 0!==a.caller?s(e={objId:Y()},u[a.caller],u):e={},X(r,e,"api.caller",{obj:r,args:t,parentObjId:c.objId,objId:e.objId,prop:a.prop},o),e}var o=Q(),i=Y(t);return r.objId=-1,void 0!==a.getter&&(r.objId=i,s(r,u[a.getter],u)),X(c,r,"api.getter",{parentObjId:c.objId,objId:r.objId,prop:a.prop},o,function(){delete e["__"+a.prop+"CacheValue"]}),t&&(this["__"+a.prop+"CacheValue"]=r),r},set:function(e){var t=Q();return X(c,{},"api.setter",{value:e,parentObjId:c.objId,objId:-1,prop:a.prop},t)}})};t.length;)n()}(e={objId:Y()},u[a.caller],u):e={},X(r,e,"api.caller",{obj:r,args:t,parentObjId:c.objId,objId:e.objId,prop:a.prop},o),e}var o=Q(),i=Y(t);return r.objId=-1,void 0!==a.getter&&(r.objId=i,s(r,u[a.getter],u)),X(c,r,"api.getter",{parentObjId:c.objId,objId:r.objId,prop:a.prop},o,function(){delete e["__"+a.prop+"CacheValue"]}),t&&(this["__"+a.prop+"CacheValue"]=r),r},set:function(e){var t=Q();return X(c,{},"api.setter",{value:e,parentObjId:c.objId,objId:-1,prop:a.prop},t)}})};t.length;)n()}(u,s,c),u.Events=o,u.Enum=i,t.Enum=u.Enum,t.Events=u.Events,t.Props=a,V(t.url)){case F.writer:t.WordApplication=t.WpsApplication=function(){return u};break;case F.spreadsheet:t.ExcelApplication=t.EtApplication=function(){return u};break;case F.presentation:t.PPTApplication=t.WppApplication=function(){return u};break;case F.pdf:t.PDFApplication=function(){return u}}t.Application=u,t.Free=function(e){return H("api.free",{objId:e},"")},t.Stack=u.Stack=(n=function(e){t&&t.Free(e)},function(){function e(e){t.push(e)}var t=[];return J.add(e),{End:function(){n(t),J.delete(e)}}});var l={};function p(e){var t=o[e];Object.defineProperty(u.Sub,t,{set:function(e){l[t]=e,D({eventName:"api.event.register",data:{eventName:t,register:!!e,objId:q+=1}})}})}for(var d in M.add(function(a){return L(r,void 0,void 0,function(){var t,n,r,o,i;return N(this,function(e){switch(e.label){case 0:return B(a)?[2]:"api.event"===(t=M.parse(a.data)).eventName&&t.data?(n=t.data,r=n.eventName,o=n.data,(i=l[r])?[4,i(o)]:[3,2]):[3,2];case 1:e.sent(),e.label=2;case 2:return[2]}})})}),u.Sub={},o)p(d)}(E,u),e.label=17;case 17:return"function"==typeof C[s]&&C[s](E,p||u),[2]}var t,n,r,o})})})}function re(r){return new Promise(function(n){M.add(function e(t){B(t)||M.parse(t.data).eventName===r&&(n(),M.remove(e))})})}function h(e){void 0===e&&(e={}),$&&$.destroy();try{var t=function(e,n){function r(e,t){e.subscribe&&"function"==typeof e.subscribe&&(e.callback=t,s[t]=e.subscribe,n&&delete e.subscribe)}void 0===n&&(n=!0);var t=A({},e),o=t.headers,i=void 0===o?{}:o,a=t.subscriptions,s=void 0===a?{}:a,c=t.mode,u=void 0===c?C.nomal:c,l=t.commonOptions,p=i.backBtn,d=void 0===p?{}:p,f=i.shareBtn,h=void 0===f?{}:f,v=i.otherMenuBtn,m=void 0===v?{}:v;if(r(d,"wpsconfig_back_btn"),r(h,"wpsconfig_share_btn"),r(m,"wpsconfig_other_menu_btn"),m.items&&Array.isArray(m.items)){var b=[];m.items.forEach(function(e,t){switch(void 0===e&&(e={}),e.type){case"export_img":e.type=1,e.callback="export_img";break;case"export_pdf":e.type=1,e.callback="export_pdf";break;case"save_version":e.type=1,e.callback="save_version";break;case"about_wps":e.type=1,e.callback="about_wps";break;case"split_line":e.type=2;break;case"custom":e.type=3,r(e,"wpsconfig_other_menu_btn_"+t),b.push(e)}}),b.length&&(U||K)&&(m.items=b)}t.url=t.url||t.wpsUrl;var y=[];if((u===C.simple||l&&!1===l.isShowTopArea)&&y.push("simple","hidecmb"),t.debug&&y.push("debugger"),t.url&&y.length&&(t.url=t.url+(0<=t.url.indexOf("?")?"&":"?")+y.join("&")),l&&(l.isParentFullscreen||l.isBrowserViewFullscreen)&&(document.addEventListener("fullscreenchange",z),document.addEventListener("webkitfullscreenchange",z),document.addEventListener("mozfullscreenchange",z)),t.wordOptions&&(t.wpsOptions=t.wordOptions),t.excelOptions&&(t.etOptions=t.excelOptions),t.pptOptions&&(t.wppOptions=t.pptOptions),"object"==P(s.print)){var g="wpsconfig_print";"function"==typeof s.print.subscribe&&(s[g]=s.print.subscribe,t.print={callback:g},void 0!==s.print.custom&&(t.print.custom=s.print.custom)),delete s.print}return"function"==typeof s.exportPdf&&(s[g="wpsconfig_export_pdf"]=s.exportPdf,t.exportPdf={callback:g},delete s.exportPdf),t.commandBars&&G(t.commandBars,!1),A(A({},t),{subscriptions:s})}(e),n=t.subscriptions,r=void 0===n?{}:n,o=t.mount,i=void 0===o?null:o,a=t.url,s=t.refreshToken,c=t.onToast,u=t.onHyperLinkOpen,l=t.getClipboardData;E=(a.match(/https*:\/\/[^\/]+/g)||[])[0],_.origin=E;var p=I(a,i),d=re("ready"),f=re("open.result"),h=re("api.ready"),v=i?{width:i.clientWidth+"px",height:i.clientHeight+"px"}:{width:"100vw",height:"100vh"};delete t.mount,a&&delete t.url,delete t.subscriptions;var m=(j=j||Object.create(null),{on:function(e,t){(j[e]||(j[e]=[])).push(t)},off:function(e,t){j[e]&&j[e].splice(j[e].indexOf(t)>>>0,1)},emit:function(t,n){(j[t]||[]).slice().map(function(e){e(n)}),(j["*"]||[]).slice().map(function(e){e(t,n)})}}),b={apiReadySended:!1};return $={url:a,iframe:p,version:"1.1.13",iframeReady:!1,tokenData:null,commandBars:null,tabs:{getTabs:function(){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),[2,W({api:"tab.getTabs"})]}})})},switchTab:function(t){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),[2,W({api:"tab.switchTab",args:{tabKey:t}})]}})})}},setCooperUserColor:function(t){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),[2,W({api:"setCooperUserColor",args:t})]}})})},setToken:function(t){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),$.tokenData=t,D({eventName:"setToken",data:t}),[2]}})})},ready:function(){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return b.apiReadySended?[3,2]:[4,f];case 1:e.sent(),b.apiReadySended=!0,D({eventName:"api.ready"}),e.label=2;case 2:return[4,h];case 3:return e.sent(),[2,new Promise(function(e){return setTimeout(function(){return e(null==$?void 0:$.Application)},0)})]}})})},destroy:function(){p.destroy(),M.empty(),$=null,J=new Set,q=0,document.removeEventListener("fullscreenchange",z),R.idMap={}},save:function(){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),[2,function(e){return T(e,"wps.jssdk.api","wps.api.reply")}({api:"save"})]}})})},setCommandBars:function(t){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),G(t),[2]}})})},updateConfig:function(t){return void 0===t&&(t={}),L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),t.commandBars?(console.warn("Deprecated: `updateConfig()` 方法即将废弃，请使用`setCommandBars()`代替`updateConfig()`更新`commandBars`配置。"),[4,G(t.commandBars)]):[3,3];case 2:e.sent(),e.label=3;case 3:return[2]}})})},executeCommandBar:function(t){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),G([{cmbId:t,attributes:[{name:"click",value:!0}]}]),[2]}})})},on:function(n,r){return L(this,void 0,void 0,function(){var t;return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),(t=n)===ee.fileSaved&&console.warn("fileSaved事件监听即将弃用， 推荐使用fileStatus进行文件状态的监听"),n===ee.fullscreenChange&&(t="fullscreenchange"),oe(t,"on"),m.on(n,r),[2]}})})},off:function(t,n){return L(this,void 0,void 0,function(){return N(this,function(e){switch(e.label){case 0:return[4,d];case 1:return e.sent(),oe(t,"off"),m.off(t,n),[2]}})})}},y=t,w=c,O=u,k=b,S=l,(g=s)&&x(g)&&(k.refreshToken=g,y.refreshToken={eventName:te.getToken}),S&&x(S)&&(k.getClipboardData=S,y.getClipboardData={eventName:te.getClipboardData}),w&&x(w)&&(k.onToast=w,y.onToast={eventName:te.onToast}),O&&x(O)&&(k.onHyperLinkOpen=O,y.onHyperLinkOpen={eventName:te.onHyperLinkOpen}),ne($,m,t,r,b,p,v),$}catch(e){console.error(e)}var y,g,w,O,k,S,j,E}function oe(e,t){var n=e;["error","fileOpen"].includes(n)||("fileSaved"===n&&(n="fileStatus"),D({eventName:"basic.event",data:{eventName:n,action:t}}))}console.log("WebOfficeSDK JS-SDK V1.1.13");var v=Object.freeze({__proto__:null,listener:ne,config:h});window.WPS=v;var w={config:h},O=(k.prototype.initCommandBarOptions=function(e,t){return function(){for(var e=0,t=0,n=arguments.length;t<n;t++)e+=arguments[t].length;var r=Array(e),o=0;for(t=0;t<n;t++)for(var i=arguments[t],a=0,s=i.length;a<s;a++,o++)r[o]=i[a];return r}(this.genCommandBarsOptions(e,"hide"),this.genCommandBarsOptions(t,"disabled"))},k.prototype.genCommandBarsOptions=function(e,t){return void 0===e&&(e=[]),e.map(function(e){switch(t){case"hide":return{cmbId:e,attributes:{visible:!1}};case"disable":default:return{cmbId:e,attributes:{enable:!1}}}})},k.prototype.ready=function(){return function(e,a,s,c){return new(s=s||Promise)(function(n,t){function r(e){try{i(c.next(e))}catch(e){t(e)}}function o(e){try{i(c.throw(e))}catch(e){t(e)}}function i(e){var t;e.done?n(e.value):((t=e.value)instanceof s?t:new s(function(e){e(t)})).then(r,o)}i((c=c.apply(e,a||[])).next())})}(this,void 0,void 0,function(){return function(n,r){var o,i,a,e,s={label:0,sent:function(){if(1&a[0])throw a[1];return a[1]},trys:[],ops:[]};return e={next:t(0),throw:t(1),return:t(2)},"function"==typeof Symbol&&(e[Symbol.iterator]=function(){return this}),e;function t(t){return function(e){return function(t){if(o)throw new TypeError("Generator is already executing.");for(;s;)try{if(o=1,i&&(a=2&t[0]?i.return:t[0]?i.throw||((a=i.return)&&a.call(i),0):i.next)&&!(a=a.call(i,t[1])).done)return a;switch(i=0,a&&(t=[2&t[0],a.value]),t[0]){case 0:case 1:a=t;break;case 4:return s.label++,{value:t[1],done:!1};case 5:s.label++,i=t[1],t=[0];continue;case 7:t=s.ops.pop(),s.trys.pop();continue;default:if(!(a=0<(a=s.trys).length&&a[a.length-1])&&(6===t[0]||2===t[0])){s=0;continue}if(3===t[0]&&(!a||t[1]>a[0]&&t[1]<a[3])){s.label=t[1];break}if(6===t[0]&&s.label<a[1]){s.label=a[1],a=t;break}if(a&&s.label<a[2]){s.label=a[2],s.ops.push(t);break}a[2]&&s.ops.pop(),s.trys.pop();continue}t=r.call(n,s)}catch(e){t=[6,e],i=0}finally{o=a=0}if(5&t[0])throw t[1];return{value:t[0]?t[1]:void 0,done:!0}}([t,e])}}}(this,function(e){switch(e.label){case 0:return[4,this.sdk.ready()];case 1:return e.sent(),[2]}})})},k.prototype.setSdkToken=function(e){this.sdk.setToken(e)},k.prototype.onSDKError=function(e){this.sdk.on("error",e)},k.prototype.onSDKFileOpen=function(e){this.sdk.on("fileOpen",e)},k.prototype.onFileStatusChanged=function(e){this.sdk.on("fileStatus",e)},k);function k(e){var t=e.isCooperUsersAvatarVisible,n=void 0!==t&&t,r=e.cooperUsersColor,o=void 0===r?[]:r,i=e.isShowTopArea,a=void 0===i||i,s=e.isShowHeader,c=void 0===s||s,u=e.isParentFullscreen,l=void 0===u||u,p=e.isExitPlayByEsc,d=void 0===p||p,f=e.hiddenCommandBarOptions,h=e.disabledCommandBarOptions,v=function(e,t){var n={};for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&t.indexOf(r)<0&&(n[r]=e[r]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols){var o=0;for(r=Object.getOwnPropertySymbols(e);o<r.length;o++)t.indexOf(r[o])<0&&Object.prototype.propertyIsEnumerable.call(e,r[o])&&(n[r[o]]=e[r[o]])}return n}(e,["isCooperUsersAvatarVisible","cooperUsersColor","isShowTopArea","isShowHeader","isParentFullscreen","isExitPlayByEsc","hiddenCommandBarOptions","disabledCommandBarOptions"]);this.sdk=w.config(m({commandBars:this.initCommandBarOptions(f,h),cooperUserAttribute:{isCooperUsersAvatarVisible:n,cooperUsersColor:o},commonOptions:{isShowTopArea:a,isShowHeader:c,isParentFullscreen:l},pptOptions:{isExitPlayByEsc:d}},v))}t.WpsSdkClass=O});unwrapExports(lib);var currentApplication,WPS,lib_1=lib.WpsSdkClass,IFRAME_EVENT={LOAD_START:"loadStart",CUSTOM_ERROR:"customError"},PROMISE_MAP={},defaultHiddenCommandBarArray=["HeaderLeft","HeaderRight","FloatQuickHelp","CooperationPanelOwnerInfo","Logo","Cooperation","More","Print","CheckCellHistory","HistoryVersion","HistoryRecord","HistoryVersionDivider","ContextMenuConvene","Comment","WPPPcCommentButton","WPPMobileCommentButton","WPPMobileMarkButton","MobileHeader"];function checkMessage(e,t){return!!(e&&e.source&&t&&t.contentWindow)&&("object"===_typeof(e.data)&&e.source===t.contentWindow)}function handleError(e,t){sendMessageToNative({method:"wpsError",params:{errorType:e,errorMsg:t}})}function handleIframeMessage(e){if(e.data&&"initData"===e.data.key)handleInitialDataGot(e.data.value);else if(checkMessage(e,WPS.iframeElement)){var t=e.data;if(t.key)switch(t.key){case IFRAME_EVENT.CUSTOM_ERROR:handleError("WPS_CUSTOM_ERROR",t.value.errorType)}}}function handleRefreshAuthToken(e){PROMISE_MAP.resolveAuthToken(e.authToken)}function handleInitialDataGot(e){e&&e.wpsIframeUrl?handleWpsLoaded(e):console.error("[Preview Sdk] Init failed, Missing required parameters: ",e)}function tryTriggerWpsApi(e){var t=e.fileType,n=e.command,r=e.params,o=e.commandType;if(t&&n){for(var i=currentApplication,a=n.split("."),s=0;s<a.length;s++)if(!(i=i[a[s]]))return;if("write"!==o)(r?i(r):i()).then(function(e){handleWpsCallback(!0,e)}).catch(function(){handleWpsCallback(!1)});else i=r}}function handleWpsCallback(e,t){sendMessageToNative({method:"wpsApiCallback",params:{isSuccess:e,data:t}})}function prepareApplication(){WPS&&WPS.sdk&&(WPS.sdk.WordApplication?currentApplication=WPS.sdk.WordApplication():WPS.sdk.PPTApplication?((currentApplication=WPS.sdk.PPTApplication()).Sub.SlideShowBegin=function(){return handleSlideShowChange("begin")},currentApplication.Sub.SlideShowEnd=function(){return handleSlideShowChange("end")}):WPS.sdk.ExcelApplication&&((currentApplication=WPS.sdk.ExcelApplication()).CommandBars("ContextMenuCellHistory").Visible=!1,currentApplication.CommandBars("ViewTabCellHistory").Visible=!1),sendMessageToNative({method:"wpsApplicationReady"}))}function onSDKFileOpen(e){sendMessageToNative({method:"wpsLoadStatus",params:{isSuccess:e.success}}),e&&!e.success&&e.reason&&handleError(e.reason,e.reason)}function onSDKError(e){handleError(e.reason,e.reason)}function onFileStatusChanged(e){e&&"number"==typeof e.status&&sendMessageToNative({method:"wpsFileStatus",params:{status:e.status}})}function handleSlideShowChange(e){sendMessageToNative({method:"slideShowStatusChanged",params:{status:e}})}function tryRefreshAuthToken(){return sendMessageToNative({method:"getAuthToken"}),PROMISE_MAP?new Promise(function(t){PROMISE_MAP.resolveAuthToken=function(e){t({token:e.token,timeout:1e3*e.expire})}}):null}function onHyperLinkOpen(e){var t=e.linkUrl;t&&sendMessageToNative({method:"onHyperLinkOpen",params:{linkUrl:t}})}function initSdk(e){return _initSdk.apply(this,arguments)}function _initSdk(){return(_initSdk=_asyncToGenerator(regeneratorRuntime.mark(function e(t){var n,r,o,i,a,s,c,u,l,p;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.prev=0,n=t.wpsIframeUrl,r=t.authToken,o=t.wpsOptions,i=void 0===o?{}:o,a=r.expire,s=r.token,c=i.disabledCommandBarOptions,u=i.hiddenCommandBarOptions,l=i.mode,p=_objectWithoutProperties(i,["disabledCommandBarOptions","hiddenCommandBarOptions","mode"]),(WPS=new lib_1(_objectSpread2({url:n,mount:document.getElementById("wpsContainer"),mode:l||"simple",isCooperUsersAvatarVisible:!1,cooperUsersColor:[],isShowTopArea:!0,isShowHeader:!1,isParentFullscreen:!0,isExitPlayByEsc:!0,refreshToken:tryRefreshAuthToken,onHyperLinkOpen:onHyperLinkOpen,disabledCommandBarOptions:c||[],hiddenCommandBarOptions:u||defaultHiddenCommandBarArray},p))).setSdkToken({token:s,timeout:1e3*a}),WPS.onSDKFileOpen(onSDKFileOpen),WPS.onSDKError(onSDKError),e.next=10,WPS.ready();case 10:WPS.onFileStatusChanged(onFileStatusChanged),window.setTimeout(prepareApplication,0),e.next=17;break;case 14:e.prev=14,e.t0=e.catch(0),console.log(e.t0);case 17:case"end":return e.stop()}},e,null,[[0,14]])}))).apply(this,arguments)}function handleWpsLoaded(e){return _handleWpsLoaded.apply(this,arguments)}function _handleWpsLoaded(){return(_handleWpsLoaded=_asyncToGenerator(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,initSdk(t);case 2:case"end":return e.stop()}},e)}))).apply(this,arguments)}function loadStart(){!0!==isNative||sendMessageToNative({method:"getInitialData"})}window.addEventListener("message",handleIframeMessage,!1),window.triggerJSEvent=function(e){try{var t=parseNativeData(e);switch(t.key){case"setInitialData":handleInitialDataGot(t.value);break;case"refreshAuthToken":handleRefreshAuthToken(t.value);case"triggerWpsApi":tryTriggerWpsApi(t.value)}}catch(e){console.error("triggerJSEvent function error",e)}},loadStart();