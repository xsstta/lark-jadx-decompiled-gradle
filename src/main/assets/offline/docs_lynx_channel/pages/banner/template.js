{ü   asm0.2.0.0image1.41.4card  í.space-icon-style18px84px70pxspace-icon-style1.space-icon-style212px28px80pxspace-icon-style2.space-close-style1absolute3pxcenterspace-close-style1.space-close-style26pxspace-close-style2.space-subtitle-style24pxspace-subtitle-style2.space-button-text-style1space-button-text-style1.space-button-style124px92px4px 8pxmax-contentspace-button-style1.space-title16pxboldellipsisspace-title.space-close-svg14pxspace-close-svg.space-text-container-style11columnspace-text-container-style1.space-button-text-style2space-button-text-style2.space-text-container-style2space-text-container-style2.space-container-style1100%86px4px 16px 8pxflexspace-container-style1.space-button-style2space-button-style2.space-subtitle-style15pxspace-subtitle-style1.space-container-style2112pxspace-container-style2.closeclose	.subtitle34pxsubtitle.title18px#1F2329title
.close-svg	close-svg
.container	container!.template-item-front-image-style188px74px0px 2px 12px rgba(0,0,0,0.05) template-item-front-image-style1.template-item-title-style2#0F11140template-item-title-style2!.template-item-front-image-style29px template-item-front-image-style2 .template-item-back-image-style3170px122pxtemplate-item-back-image-style3 .template-item-back-image-style290pxtemplate-item-back-image-style2%.template-item-image-container-style21px99px$template-item-image-container-style2!.template-item-front-image-style332px template-item-front-image-style3.template-item-title-style110pxtemplate-item-title-style1.template-item-container-style215px20px125pxtemplate-item-container-style2.template-item-container-style3template-item-container-style3.template-item-container-style194pxtemplate-item-container-style1.template-item-title-style3template-item-title-style3/app-service.jsÀ(function(){"use strict";var t=new Function("return this;")();var e=!1;function r(r){if(!e){e=!0,t.__bundle__holder=void 0;var tt=r.tt;tt.__sourcemap__release__="069d6b20bc8f4d4dee85043dbe9fe95a",tt.define("app-service.js",(function(t,e,r,n,setTimeout,setInterval,clearInterval,clearTimeout,NativeModules,tt,console,o,a,nativeAppId,Behavior,LynxJSBI,lynx,window,document,frames,self,location,navigator,localStorage,history,Caches,screen,alert,confirm,prompt,fetch,XMLHttpRequest,WebSocket,webkit,Reporter,print,global){(lynx=lynx||{}).__cardVersion="unknown",lynx._switches={asyncSetState:0,fixMergeOrder:1};var i="object"===typeof globalThis?globalThis:(0,eval)("this");var s=("object"===typeof lynx?lynx.Promise:null)||i.Promise;s=i.getPromise&&i.getPromise({setTimeout:setTimeout,clearTimeout:clearTimeout,onUnhandled:function(t,e){console.error("unhandled rejection:",e&&e.message,e&&e.stack)}})||s;var l=["propsId","children"];function c(t,e){var r=Object.keys(t);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(t);e&&(n=n.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),r.push.apply(r,n)}return r}function p(t){for(var e=1;e<arguments.length;e++){var r=null!=arguments[e]?arguments[e]:{};e%2?c(Object(r),!0).forEach((function(e){_(t,e,r[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(r)):c(Object(r)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(r,e))}))}return t}function _(t,e,r){return e in t?Object.defineProperty(t,e,{value:r,enumerable:!0,configurable:!0,writable:!0}):t[e]=r,t}function u(t,e){if(!(t instanceof e))throw new TypeError("Cannot call a class as a function")}function d(t,e){for(var r=0;r<e.length;r++){var n=e[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(t,n.key,n)}}function v(t,e,r){return e&&d(t.prototype,e),r&&d(t,r),t}function m(t,e){if("function"!==typeof e&&null!==e)throw new TypeError("Super expression must either be null or a function");t.prototype=Object.create(e&&e.prototype,{constructor:{value:t,writable:!0,configurable:!0}}),e&&h(t,e)}function h(t,e){return(h=Object.setPrototypeOf||function(t,e){return t.__proto__=e,t})(t,e)}function f(t){var e=function(){if("undefined"===typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if("function"===typeof Proxy)return!0;try{return Boolean.prototype.valueOf.call(Reflect.construct(Boolean,[],(function(){}))),!0}catch(t){return!1}}();return function(){var r,n=b(t);if(e){var o=b(this).constructor;r=Reflect.construct(n,arguments,o)}else r=n.apply(this,arguments);return y(this,r)}}function y(self,t){if(t&&("object"===g(t)||"function"===typeof t))return t;if(void 0!==t)throw new TypeError("Derived constructors may only return object or undefined");return function(self){if(void 0===self)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return self}(self)}function b(t){return(b=Object.setPrototypeOf?Object.getPrototypeOf:function(t){return t.__proto__||Object.getPrototypeOf(t)})(t)}function g(t){return(g="function"===typeof Symbol&&"symbol"===typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"===typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t})(t)}function N(t,e){var r="undefined"!==typeof Symbol&&t[Symbol.iterator]||t["@@iterator"];if(!r){if(Array.isArray(t)||(r=E(t))||e&&t&&"number"===typeof t.length){r&&(t=r);var n=0;var o=function(){};return{s:o,n:function(){return n>=t.length?{done:!0}:{done:!1,value:t[n++]}},e:function(t){throw t},f:o}}throw new TypeError("Invalid attempt to iterate non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}var a,i=!0,s=!1;return{s:function(){r=r.call(t)},n:function(){var t=r.next();return i=t.done,t},e:function(t){s=!0,a=t},f:function(){try{i||null==r.return||r.return()}finally{if(s)throw a}}}}function k(t,e){if(null==t)return{};var r=function(t,e){if(null==t)return{};var r={};var n=Object.keys(t);var o,a;for(a=0;a<n.length;a++)o=n[a],e.indexOf(o)>=0||(r[o]=t[o]);return r}(t,e);var n,o;if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(t);for(o=0;o<a.length;o++)n=a[o],e.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(t,n)&&(r[n]=t[n])}return r}function I(t,e){return function(t){if(Array.isArray(t))return t}(t)||function(t,e){var r=null==t?null:"undefined"!==typeof Symbol&&t[Symbol.iterator]||t["@@iterator"];if(null==r)return;var n=[];var o=!0;var a=!1;var i,s;try{for(r=r.call(t);!(o=(i=r.next()).done)&&(n.push(i.value),!e||n.length!==e);o=!0);}catch(l){a=!0,s=l}finally{try{o||null==r.return||r.return()}finally{if(a)throw s}}return n}(t,e)||E(t,e)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function E(t,e){if(t){if("string"===typeof t)return C(t,e);var r=Object.prototype.toString.call(t).slice(8,-1);return"Object"===r&&t.constructor&&(r=t.constructor.name),"Map"===r||"Set"===r?Array.from(t):"Arguments"===r||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(r)?C(t,e):void 0}}function C(t,e){(null==e||e>t.length)&&(e=t.length);for(var r=0,n=new Array(e);r<e;r++)n[r]=t[r];return n}function O(t,e,r){return t[e]=r}function P(t){if(t.startsWith("on")){var e=t.match(/Catch$/)?(t=t.slice(0,-5),"catch"):"bind";var r=t.match(/^onClick/)?"tap":t.slice(2).toLowerCase();return["".concat(e,"Event"),r]}var n=t.match(/^(bind|catch)([A-Za-z]+)$/);if(n)return["".concat(n[1],"Event"),n[2]]}function S(t,e,r,n){return t.$refs.push({ref:e,refId:r,type:n}),r}function w(t){return t}function T(t){var e={__MAGIC_TYPE__:"JSXElement",_value:t,path:"ReactLynxContext",Consumer:null,Provider:null};return e.Consumer=e,e.Provider={__MAGIC_TYPE__:"JSXElement",path:"ReactLynxProvider",_context:e},e}a.__mountEvent=O,a.__handleSpreadProps=function(t,e,r,n,o,a){var i={};for(var s in e){var l=P(s);if(l&&"function"===typeof e[s]){var c=e[s];var p=I(l,2),_=p[0],u=p[1];var d="__id_"+r+"_"+s+"_"+n;O(t,d,c),i[s]={__MAGIC_TYPE__:"Event",eventName:u,eventType:_,handlerName:d},lynx.reportError(new Error('Using JSXSpread with event "'.concat(s,'" inside is not supported because of SDK bugs.')))}else if("ref"===s){var v=e[s];i["react-ref"]=S(t,v,"$reactRefId_"+r+"_"+o,a?"com":"native")}else i[s]=e[s]}return i},a.__push=function(t,e,r){t[e]||(t[e]=[]);return t[e].push(r),r},a.__trav=function t(e){if(null==e)return;if(Array.isArray(e)){var r,n=N(e);try{for(n.s();!(r=n.n()).done;){var o=r.value;t(o)}}catch(u){n.e(u)}finally{n.f()}return}var a=e.props,i=e.type;if(null==a)return;var s=a.children,l=void 0===s?[]:s;if("object"===g(i))if("ReactLynxProvider"===i.path)i._context._value=a.value;else if("ReactLynxContext"===i.path)return void t(l[0](i._value));var c,p=N(l);try{for(p.s();!(c=p.n()).done;){var _=c.value;t(_)}}catch(u){p.e(u)}finally{p.f()}},a.__putIntoPropsMap=function(t,e){var r=e.propsId,n=(e.children,k(e,l));return t.propsMap.set(n,r),e},a.__putIntoRefs=S,a.createContext=T,a.__runInJS=w,a.__pureObj=function(t){return t};var L=Object.defineProperty;var x;var j;var R;var U;var A;var K;var M;var Y;var D;var F;var W;var B;(function(t,e){for(var r in function(t){L(t,"__esModule",{value:!0})}(t),e)L(t,r,{get:e[r],enumerable:!0})})(r,{"default":function(){return Q}}),(j=x||(x={})).OldSpaceTopBanner="oldSpaceTopBanner",j.OldTemplateBanner="oldTemplateBanner",(U=R||(R={}))[U.UNKNOWN=0]="UNKNOWN",U[U.PLAIN=1]="PLAIN",U[U.HTML=2]="HTML",(K=A||(A={}))[K.UNKNOWN=0]="UNKNOWN",K[K.RAW_BYTES=1]="RAW_BYTES",K[K.ENCRYPTED_BYTES=2]="ENCRYPTED_BYTES",K[K.RAW_CDN_URL=3]="RAW_CDN_URL",K[K.ENCRYPTED_CDN_URL=4]="ENCRYPTED_CDN_URL",(Y=M||(M={}))[Y.UNKNOWN=0]="UNKNOWN",Y[Y.NORMAL=1]="NORMAL",Y[Y.TEMPLATE=2]="TEMPLATE",Y[Y.CAROUSEL=3]="CAROUSEL",Y[Y.SIDEBAR=4]="SIDEBAR",Y[Y.CUSTOM=5]="CUSTOM",(F=D||(D={}))[F.UNKNOWN=0]="UNKNOWN",F[F.STYLE1=1]="STYLE1",F[F.STYLE2=2]="STYLE2",(B=W||(W={}))[B.UNKNOWN=0]="UNKNOWN",B[B.STYLE1=1]="STYLE1",B[B.STYLE2=2]="STYLE2",B[B.STYLE3=3]="STYLE3",B[B.STYLE4=4]="STYLE4";var Component=a.ReactComponent;var T=a.createContext;var w=a.__runInJS;a.useState;a.useReducer;a.useEffect;a.useMemo;a.useCallback;a.useInstance;a.lazy;function $(t){return'<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M7.9999 7.05716L13.1449 1.91215C13.2751 1.78197 13.4861 1.78197 13.6163 1.91215L14.0877 2.38355C14.2179 2.51372 14.2179 2.72478 14.0877 2.85495L8.94271 7.99996L14.0877 13.145C14.2179 13.2752 14.2179 13.4862 14.0877 13.6164L13.6163 14.0878C13.4861 14.218 13.2751 14.218 13.1449 14.0878L7.9999 8.94277L2.85489 14.0878C2.72472 14.218 2.51366 14.218 2.38349 14.0878L1.91208 13.6164C1.78191 13.4862 1.78191 13.2752 1.91208 13.145L7.05709 7.99996L1.91208 2.85495C1.78191 2.72478 1.78191 2.51372 1.91208 2.38355L2.38349 1.91215C2.51366 1.78197 2.72472 1.78197 2.85489 1.91215L7.9999 7.05716Z" fill="'+(null!==t&&void 0!==t?t:"#646A73")+'"/></svg>'}function H(t){if("dark"!==lynx.__globalProps.brightness||9!==(null===t||void 0===t?void 0:t.length))return t;var e=parseInt(t.substring(1,3),16);var r=parseInt(t.substring(3,5),16);var n=parseInt(t.substring(5,7),16);var o=parseInt(t.substring(7,9),16);var a=255-224*(255-o)/255;return"rgba( "+Math.round(e*o*224/(255*a))+","+Math.round(r*o*224/(255*a))+","+Math.round(n*o*224/(255*a))+","+(a/=255)+")"}function J(t){if(t&&0!==t.length)return"#"+t}var G=function(t){m(r,t);var e=f(r);function r(t){return u(this,r),e.call(this,t)}return v(r,[{key:"render",value:function(){var t,e;var r;return this.props.type===W.STYLE1?(null!==(t=this.props.frontPicUrl)&&void 0!==t&&t.length&&(r=this.props.frontPicUrl),null!==(e=this.props.backPicUrl)&&void 0!==e&&e.length&&(r=this.props.backPicUrl),{type:"view",props:{"__static_className":["template-item-container-style1"],"catchtap":a.__mountEvent(this,"__id_58354000_catchtap_"+this.__eventId__N_named.catchtap[58354e3]++,this.props.click),"style":p({},this.props.style),children:[{type:"view",props:{children:[{type:"image",props:{"__static_className":["template-item-front-image-style1"],"mode":"scaleToFill","src":r},id:58354002}]},id:58354001},this.props.title&&{type:"text",props:{"__static_className":["template-item-title-style1"],children:[this.props.title]},id:58354003}]},id:58354e3}):this.props.type===W.STYLE2?{type:"view",props:{"__static_className":["template-item-container-style2"],"catchtap":a.__mountEvent(this,"__id_58354004_catchtap_"+this.__eventId__N_named.catchtap[58354004]++,this.props.click),"style":p(p({},this.props.style),{},{backgroundColor:null!==(n=this.props.backgroundColor)&&void 0!==n?n:"transparent",borderColor:null!==(o=this.props.borderColor)&&void 0!==o?o:"transparent",borderWidth:this.props.borderColor?"1px":"0px"}),children:[{type:"view",props:{"__static_className":["template-item-image-container-style2"],children:[this.props.backPicUrl&&{type:"image",props:{"__static_className":["template-item-back-image-style2"],"mode":"aspectFit","src":this.props.backPicUrl},id:58354006},this.props.frontPicUrl&&{type:"image",props:{"__static_className":["template-item-front-image-style2"],"mode":"aspectFit","src":this.props.frontPicUrl},id:58354007}]},id:58354005},this.props.title&&{type:"text",props:{"__static_className":["template-item-title-style2"],children:[this.props.title]},id:58354008}]},id:58354004}:{type:"view",props:{"__static_className":["template-item-container-style3"],"catchtap":a.__mountEvent(this,"__id_58354009_catchtap_"+this.__eventId__N_named.catchtap[58354009]++,this.props.click),"style":p(p({},this.props.style),{},{backgroundColor:null!==(i=this.props.backgroundColor)&&void 0!==i?i:"transparent",borderColor:null!==(s=this.props.borderColor)&&void 0!==s?s:"transparent",borderWidth:this.props.borderColor?"1px":"0px"}),children:[{type:"view",props:{children:[this.props.backPicUrl&&{type:"image",props:{"__static_className":["template-item-back-image-style3"],"mode":"aspectFit","src":this.props.backPicUrl},id:58354011},this.props.frontPicUrl&&{type:"image",props:{"__static_className":["template-item-front-image-style3"],"mode":"aspectFit","src":this.props.frontPicUrl},id:58354012}]},id:58354010},this.props.title&&{type:"text",props:{"__static_className":["template-item-title-style3"],children:[this.props.title]},id:58354013}]},id:58354009};var n,o;var i,s}},{key:"_createData",value:function(){this.__eventId__N_named={"catchtap":{58354e3:0,58354004:0,58354009:0}},this.__eventId__N={},this.__propsId__N={},this.__refId__N={},this.$refs=[],this.__storedListEventHandlers={},this.__tempKeys={},Object.assign(this.__tempKeys,{}),Object.assign(this.__tempKeys,{});var t=this.render();return a.__trav(t),this.__tempKeys}}]),r}(Component);globComponentRegistPath="src/pages/ee/components/template/item/template_item-TemplateItem",o(G);var X=function(){function t(){u(this,t)}return v(t,null,[{key:"debuggable",value:function(){return"true"===lynx.__globalProps.appIsDebug}},{key:"containerId",value:function(){return lynx.__globalProps.containerId}}]),t}();var z=function(){function t(){u(this,t)}return v(t,null,[{key:"sendEvent",value:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};NativeModules.bridge.call("ccm.sendContainerEvent",{data:{"eventName":t,"params":e,"containerID":X.containerId()}},(function(){}))}}]),t}();var Z=function(){function t(){u(this,t)}return v(t,null,[{key:"d",value:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"lynx-banner";this.log("debug",t,e)}},{key:"i",value:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"lynx-banner";this.log("info",t,e)}},{key:"w",value:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"lynx-banner";this.log("warn",t,e)}},{key:"e",value:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"lynx-banner";this.log("error",t,e)}},{key:"log",value:function(t,e,r){X.debuggable()&&console.log(r+": "+e),NativeModules.bridge.call("ccm.log",{data:{"level":t,"message":e,"tag":r}},(function(){}))}}]),t}();var q=function(t){m(r,t);var e=f(r);function r(t){return u(this,r),e.call(this,t)}return v(r,[{key:"click",value:function(t){Z.i("  Template click"),z.sendEvent("onClick",{"url":t,"name":this.props.name})}},{key:"clickClose",value:function(){Z.i("  Template clickClose"),z.sendEvent("closeContainer")}},{key:"render",value:function(){var t,e,r,n,o=this;var i=null===(t=this.props.data.mtemplate_categories)||void 0===t?void 0:t.map((function(t){var e,r,n,i;var s;var l=null===(e=t.mfront_pic)||void 0===e||null===(r=e.mcdn_image)||void 0===r?void 0:r.murl;var c=null===(n=t.mcategory_name)||void 0===n?void 0:n.mcontent;var p;null!==(i=t.mdym_pics)&&void 0!==i&&i.length&&(s=null===(p=t.mdym_pics[0].mcdn_image)||void 0===p?void 0:p.murl);var _=J(t.mbackground_color);var u=J(t.mframe_color);return{type:G,props:a.__putIntoPropsMap(a,{"title":c,"backPicUrl":s,"frontPicUrl":l,"click":function(){var e;return o.click(null===(e=t.mlink)||void 0===e?void 0:e.mcontent)},"backgroundColor":_,"borderColor":u,"type":o.props.data.mlayout,"propsId":o.props.propsId+"-22956000-"+o.__propsId__N[22956e3]++}),id:22956e3}}));var s,l,c,p,_,u,d;var v=null===(s=this.props.data.mtemplate_more)||void 0===s||null===(l=s.mcontent_pic)||void 0===l||null===(c=l.mcdn_image)||void 0===c?void 0:c.murl;var m=null===(p=this.props.data.mtemplate_more)||void 0===p||null===(_=p.mname)||void 0===_?void 0:_.mcontent;var h=J(null===(u=this.props.data.mtemplate_more)||void 0===u?void 0:u.mbackground_color);var f=J(null===(d=this.props.data.mtemplate_more)||void 0===d?void 0:d.mframe_color);null===i||void 0===i||i.push({type:G,props:a.__putIntoPropsMap(a,{"style":{marginRight:"12px"},"title":m,"backPicUrl":v,"click":function(){var t,e;return o.click(null===(t=o.props.data.mtemplate_more)||void 0===t||null===(e=t.mlink)||void 0===e?void 0:e.mcontent)},"backgroundColor":h,"borderColor":f,"type":this.props.data.mlayout,"propsId":this.props.propsId+"-22956001-"+this.__propsId__N[22956001]++}),id:22956001});var y=H(J(this.props.data.mbackground_color));var b=J(this.props.data.mframe_color);var g=J(this.props.data.mtitle_color);var N=J(this.props.data.msub_title_color);return{type:"view",props:{"__static_className":["container"],"style":{backgroundColor:null!==y&&void 0!==y?y:"transparent",borderColor:null!==b&&void 0!==b?b:"transparent",borderWidth:b?"1px":"0px"},children:[{type:"text",props:{"__static_className":["title"],"style":{color:null!==g&&void 0!==g?g:"#1F2329"},children:[null===(e=this.props.data.mtitle)||void 0===e?void 0:e.mcontent," "]},id:22956003},(null===(r=this.props.data.msub_title)||void 0===r?void 0:r.mcontent)&&{type:"text",props:{"__static_className":["subtitle"],"style":{color:null!==N&&void 0!==N?N:"#646A73"},children:[null===(n=this.props.data.msub_title)||void 0===n?void 0:n.mcontent," "]},id:22956004},this.props.data.mbanner_closeable&&{type:"view",props:{"__static_className":["close"],"catchtap":this.clickClose,children:[{type:"svg",props:{"__static_className":["close-svg"],"content":$(J(this.props.data.mbanner_closeable_color))},id:22956006}]},id:22956005},{type:"scroll-view",props:{"__static_className":["list"],"scroll-x":!0,children:[i]},id:22956007}]},id:22956002}}},{key:"_createData",value:function(){this.__eventId__N_named={},this.__eventId__N={},this.__propsId__N={},this.__refId__N={},this.__propsId__N[22956e3]=0,this.__propsId__N[22956001]=0,this.$refs=[],this.__storedListEventHandlers={},this.__tempKeys={},Object.assign(this.__tempKeys,{}),Object.assign(this.__tempKeys,{});var t=this.render();return a.__trav(t),this.__tempKeys}}]),r}(Component);globComponentRegistPath="src/pages/ee/components/template/template-Template",o(q);var V=function(t){m(r,t);var e=f(r);function r(t){return u(this,r),e.call(this,t)}return v(r,[{key:"click",value:function(t){Z.i(" space click"),z.sendEvent("onClick",{"url":t,"name":this.props.name})}},{key:"clickClose",value:function(){Z.i(" space clickClose"),z.sendEvent("closeContainer")}},{key:"render",value:function(){var t,e,r=this;var n=null===(t=this.props.data.mbackground_pic)||void 0===t||null===(e=t.mcdn_image)||void 0===e?void 0:e.murl;var o;if(n&&n.length>0)o="transparent";else{var i=J(this.props.data.mbackground_color);o=H(null!==i&&void 0!==i?i:"#E1EAFFFF")}var s=J(this.props.data.mframe_color);var l=J(this.props.data.mtitle_color);l||(l="#1F2329");var c=J(this.props.data.msub_title_color);c||(c="#646A73");var p=J(this.props.data.mcta_background_color);p||(p="#3370FF");var _=J(this.props.data.mcta_title_color);var u,d,v,m,h,f,y;return _||(_="#FFFFFF"),this.props.data.mlayout===D.STYLE1?{type:"view",props:{"__static_className":["space-container-style1"],"catchtap":a.__mountEvent(this,"__id_2569000_catchtap_"+this.__eventId__N_named.catchtap[2569e3]++,(function(){var t;return r.click(null===(t=r.props.data.mbutton_link)||void 0===t?void 0:t.mcontent)})),"style":{backgroundColor:o,backgroundImage:n,borderColor:null!==s&&void 0!==s?s:"transparent",borderWidth:s?"0.5px":"0px"},children:[(null===(u=this.props.data.mbanner_icon)||void 0===u||null===(d=u.mcdn_image)||void 0===d?void 0:d.murl)&&{type:"image",props:{"__static_className":["space-icon-style1"],"src":null===(v=this.props.data.mbanner_icon)||void 0===v||null===(m=v.mcdn_image)||void 0===m?void 0:m.murl,"mode":"aspectFit"},id:2569001},{type:"view",props:{"__static_className":["space-text-container-style1"],children:[{type:"text",props:{"__static_className":["space-title"],"style":{color:l},children:[null===(h=this.props.data.mtitle)||void 0===h?void 0:h.mcontent," "]},id:2569003},{type:"text",props:{"__static_className":["space-subtitle-style1"],"style":{color:c},children:[null===(f=this.props.data.msub_title)||void 0===f?void 0:f.mcontent," "]},id:2569004},{type:"view",props:{"__static_className":["space-button-style1"],"style":{backgroundColor:p}},id:2569005}]},id:2569002},{type:"text",props:{"__static_className":["space-button-text-style1"],"style":{color:_},children:[null===(y=this.props.data.mcta_title)||void 0===y?void 0:y.mcontent]},id:2569006},this.props.data.mbanner_closeable&&{type:"view",props:{"__static_className":["space-close-style1"],"catchtap":this.clickClose,children:[{type:"svg",props:{"__static_className":["space-close-svg"],"content":$(J(this.props.data.mbanner_closeable_color))},id:2569008}]},id:2569007}]},id:2569e3}:{type:"view",props:{"__static_className":["space-container-style2"],"catchtap":a.__mountEvent(this,"__id_2569009_catchtap_"+this.__eventId__N_named.catchtap[2569009]++,(function(){var t;return r.click(null===(t=r.props.data.mbutton_link)||void 0===t?void 0:t.mcontent)})),"style":{backgroundColor:o,backgroundImage:n,borderColor:null!==s&&void 0!==s?s:"transparent",borderWidth:s?"0.5px":"0px"},children:[{type:"view",props:{"__static_className":["space-text-container-style2"],children:[{type:"text",props:{"__static_className":["space-title"],"style":{color:l},children:[null===(b=this.props.data.mtitle)||void 0===b?void 0:b.mcontent," "]},id:2569011},{type:"text",props:{"__static_className":["space-subtitle-style2"],"style":{color:c},children:[null===(g=this.props.data.msub_title)||void 0===g?void 0:g.mcontent," "]},id:2569012},{type:"view",props:{"__static_className":["space-button-style2"],"style":{backgroundColor:p},children:[{type:"text",props:{"__static_className":["space-button-text-style2"],"style":{color:_},children:[null===(N=this.props.data.mcta_title)||void 0===N?void 0:N.mcontent]},id:2569014}]},id:2569013}]},id:2569010},this.props.data.mbanner_closeable&&{type:"view",props:{"__static_className":["space-close-style2"],"catchtap":this.clickClose,children:[{type:"svg",props:{"__static_className":["space-close-svg"],"content":$(J(this.props.data.mbanner_closeable_color))},id:2569016}]},id:2569015},(null===(k=this.props.data.mbanner_icon)||void 0===k||null===(I=k.mcdn_image)||void 0===I?void 0:I.murl)&&{type:"image",props:{"__static_className":["space-icon-style2"],"src":null===(E=this.props.data.mbanner_icon)||void 0===E||null===(C=E.mcdn_image)||void 0===C?void 0:C.murl,"mode":"aspectFit"},id:2569017}]},id:2569009};var b,g,N,k,I,E,C}},{key:"_createData",value:function(){this.__eventId__N_named={"catchtap":{2569e3:0,2569009:0}},this.__eventId__N={},this.__propsId__N={},this.__refId__N={},this.$refs=[],this.__storedListEventHandlers={},this.__tempKeys={},Object.assign(this.__tempKeys,{}),Object.assign(this.__tempKeys,{});var t=this.render();return a.__trav(t),this.__tempKeys}}]),r}(Component);globComponentRegistPath="src/pages/ee/components/space/space-Space",o(V);var Q=function(t){m(r,t);var e=f(r);function r(t){var n;return u(this,r),n=e.call(this,t),Z.d("Banner constructor"),z.sendEvent("onShow"),Z.i(n.state.toString()),n}return v(r,[{key:"render",value:function(){var t,e;var r;return(null===(t=this.state.data)||void 0===t?void 0:t.mbanner_type)===M.NORMAL&&null!=this.state.data.mnormal_banner?(a.__push(this.__tempKeys,"__temp0",Z.i("space")),r={type:V,props:a.__putIntoPropsMap(a,{"data":this.state.data.mnormal_banner,"name":this.state.data.mbanner_name,"propsId":this.props.propsId+"-60157000-"+this.__propsId__N[60157e3]++}),id:60157e3}):(null===(e=this.state.data)||void 0===e?void 0:e.mbanner_type)===M.TEMPLATE&&null!=this.state.data.mtemplate_banner?(a.__push(this.__tempKeys,"__temp1",Z.i("template")),r={type:q,props:a.__putIntoPropsMap(a,{"data":this.state.data.mtemplate_banner,"name":this.state.data.mbanner_name,"propsId":this.props.propsId+"-60157001-"+this.__propsId__N[60157001]++}),id:60157001}):a.__push(this.__tempKeys,"__temp2",Z.e("unknown layout")),r}},{key:"_createData",value:function(){this.__eventId__N_named={},this.__eventId__N={},this.__propsId__N={},this.__refId__N={},this.__propsId__N[60157e3]=0,this.__propsId__N[60157001]=0,this.$refs=[],this.__storedListEventHandlers={},this.__tempKeys={},Object.assign(this.__tempKeys,{}),this.props.propsId="app",Object.assign(this.__tempKeys,{});var t=this.render();return a.__trav(t),this.__tempKeys}}],[{key:"getDerivedStateFromProps",value:function(t,e){return e.isInit?null:(console.log("getDerivedStateFromProps"),{data:e.dataStr?JSON.parse(e.dataStr):void 0,isInit:!0,dataStr:void 0})}}]),r}(Component);globComponentRegistPath="src/pages/ee/banner/index-Banner",n(Q)})),tt.require("app-service.js")}}if(t&&t.bundleSupportLoadScript){var n={init:r};return t.__bundle__holder=n,n}r({"tt":tt})})();
//# sourceMappingURL=./app-service.js.mapTemplateLayoutSTYLE1STYLE2UNKNOWNSTYLE3324STYLE4SpaceLayout src/pages/ee/banner/index-Banner
BannerTypeCUSTOMCAROUSELTEMPLATENORMALSIDEBAR5consolealogassertreportlogerrordebuginfowarnStringlengthsubstrindexOfMathtanroundrandomatanmaxfloorexpasinsqrtacoscosminceilpowabssin$kTemplateAssemblertopleftrightbottomposition	boxSizing
box-sizingbackgroundColorbackground-colorborderLeftColorborder-left-colorborderRightColorborder-right-colorborderTopColorborder-top-colorborderBottomColorborder-bottom-colorborderRadiusborder-radiusborderTopLeftRadiusborder-top-left-radiusborderBottomLeftRadiusborder-bottom-left-radiusborderTopRightRadiusborder-top-right-radiusborderBottomRightRadiusborder-bottom-right-radiusborderWidthborder-widthborderLeftWidthborder-left-widthborderRightWidthborder-right-widthborderTopWidthborder-top-widthborderBottomWidthborder-bottom-widthcoloropacitydisplayoverflowheightwidthmaxWidth	max-widthminWidth	min-width	maxHeight
max-height	minHeight
min-heightpaddingpaddingLeftpadding-leftpaddingRightpadding-right
paddingToppadding-toppaddingBottompadding-bottommargin
marginLeftmargin-leftmarginRightmargin-right	marginTop
margin-topmarginBottommargin-bottom
whiteSpacewhite-spaceletterSpacingletter-spacing	textAlign
text-align
lineHeightline-heighttextOverflowtext-overflowfontSize	font-size
fontWeightfont-weightflexGrow	flex-grow
flexShrinkflex-shrink	flexBasis
flex-basisflexDirectionflex-directionflexWrap	flex-wrap
alignItemsalign-items	alignSelf
align-selfalignContentalign-contentjustifyContentjustify-content
backgroundborderColorborder-color
fontFamilyfont-family	fontStyle
font-style	transform	animationanimationNameanimation-nameanimationDurationanimation-durationanimationTimingFunctionanimation-timing-functionanimationDelayanimation-delayanimationIterationCountanimation-iteration-countanimationDirectionanimation-directionanimationFillModeanimation-fill-modeanimationPlayStateanimation-play-statelineSpacingline-spacingborderStyleborder-styleorder	boxShadow
box-shadowtransformOrigintransform-originlinearOrientationlinear-orientationlinearWeightSumlinear-weight-sumlinearWeightlinear-weightlinearGravitylinear-gravitylinearLayoutGravitylinear-layout-gravitylayoutAnimationCreateDuration layout-animation-create-duration#layoutAnimationCreateTimingFunction'layout-animation-create-timing-functionlayoutAnimationCreateDelaylayout-animation-create-delaylayoutAnimationCreateProperty layout-animation-create-propertylayoutAnimationDeleteDuration layout-animation-delete-duration#layoutAnimationDeleteTimingFunction'layout-animation-delete-timing-functionlayoutAnimationDeleteDelaylayout-animation-delete-delaylayoutAnimationDeleteProperty layout-animation-delete-propertylayoutAnimationUpdateDuration layout-animation-update-duration#layoutAnimationUpdateTimingFunction'layout-animation-update-timing-functionlayoutAnimationUpdateDelaylayout-animation-update-delayadaptFontSizeadapt-font-sizeaspectRatioaspect-ratiotextDecorationtext-decoration
textShadowtext-shadowbackgroundImagebackground-imagebackgroundPositionbackground-positionbackgroundOriginbackground-originbackgroundRepeatbackground-repeatbackgroundSizebackground-sizeborder
visibilityborderRightborder-right
borderLeftborder-left	borderTop
border-topborderBottomborder-bottom
transitiontransitionPropertytransition-propertytransitionDurationtransition-durationtransitionDelaytransition-delaytransitionTimingFunctiontransition-timing-functioncontentborderLeftStyleborder-left-styleborderRightStyleborder-right-styleborderTopStyleborder-top-styleborderBottomStyleborder-bottom-styleimplicitAnimationimplicit-animation	overflowX
overflow-x	overflowY
overflow-y	wordBreak
word-breakbackgroundClipbackground-clipoutlineoutlineColoroutline-coloroutlineStyleoutline-styleoutlineWidthoutline-widthverticalAlignvertical-align
caretColorcaret-color	direction
relativeIdrelative-idrelativeAlignToprelative-align-toprelativeAlignRightrelative-align-rightrelativeAlignBottomrelative-align-bottomrelativeAlignLeftrelative-align-leftrelativeTopOfrelative-top-ofrelativeRightOfrelative-right-ofrelativeBottomOfrelative-bottom-ofrelativeLeftOfrelative-left-ofrelativeLayoutOncerelative-layout-oncerelativeCenterrelative-centerenterTransitionNameenter-transition-nameexitTransitionNameexit-transition-namepauseTransitionNamepause-transition-nameresumeTransitionNameresume-transition-name __globalPropsTemplateItemgetDerivedStateFromPropspath@src/pages/ee/components/template/item/template_item-TemplateItemshouldComponentUpdaterendertidupdateComponentInfoTemplate2src/pages/ee/components/template/template-TemplateSpace)src/pages/ee/components/space/space-SpaceBanner$$__function_id__$$__func_name__<anonymous>push_IsArray__emptyArraylaststringobjectkeys: ;__stringifyStyle$stylePropsnumberjoin __classNames__MAGIC_TYPE__
JSXElementtypepropsheaderchildrenfooterlist-rowblockdefault__flattenListChildrenReactLynxFragment	classNameclass__static_classNamestyle__static_styleiddataSetdata-set	substringdata-sliceEvent	eventType	eventNamehandlerName_HandlePropscomptypevaluename
renderList__plugParent
__isInText	undefinedbooleanlistListtextinline-textimageinline-imageReactLynxProvider_context_valuecontext-_idReactLynxContextisDynamicComponentslotNameSlotmapchild_raw-textsequenceExpressionConsumerProvidercreateContext__contextIDcontainer is not Array, it is __pop: array empty__pop#
parseColor
brightnessdarkrgba( ,)adaptBannerBgDarkModeColorlynx¸<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M7.9999 7.05716L13.1449 1.91215C13.2751 1.78197 13.4861 1.78197 13.6163 1.91215L14.0877 2.38355C14.2179 2.51372 14.2179 2.72478 14.0877 2.85495L8.94271 7.99996L14.0877 13.145C14.2179 13.2752 14.2179 13.4862 14.0877 13.6164L13.6163 14.0878C13.4861 14.218 13.2751 14.218 13.1449 14.0878L7.9999 8.94277L2.85489 14.0878C2.72472 14.218 2.51366 14.218 2.38349 14.0878L1.91208 13.6164C1.78191 13.4862 1.78191 13.2752 1.91208 13.145L7.05709 7.99996L1.91208 2.85495C1.78191 2.72478 1.78191 2.51372 1.91208 2.38355L2.38349 1.91215C2.51366 1.78197 2.72472 1.78197 2.85489 1.91215L7.9999 7.05716Z" fill="#646A73	"/></svg>getCloseSvgstatefrontPicUrl
backPicUrlmodescaleToFillsrcviewassigncatchtap__id_58354000_catchtap_tap
catchEvent	aspectFit0pxtransparent__id_58354004_catchtap___id_58354009_catchtap_$renderComponent1__renderComponentsdatamtemplate_categoriesmtemplate_moremcontent_pic
mcdn_imagemurlmnamemcontentmbackground_colormframe_colormlayoutclickpropsId
-22956001-mtitle_colormsub_title_colormtitle
msub_titlembanner_closeablembanner_closeable_colorsvg
clickClosescroll-xscroll-view
mfront_picmcategory_name	mdym_pics
-22956000-$renderComponent2mbackground_pic	#E1EAFFFFmcta_background_color#3370FFmcta_title_color#FFFFFFmbanner_icon
mcta_title0.5px__id_2569000_catchtap___id_2569009_catchtap_$renderComponent0isInitdataStrparsembanner_typemnormal_banner__temp0
-60157000-mbanner_namemtemplate_banner__temp1
-60157001-__temp2
SystemInfoapptheme-appThemeincludeslocalelynx-rtllynx-ltrltr$renderPage0$page.{"dsl":1,"bundleModuleMode":1,"cli":"unknown"} ª­¶ªÌ¶Ì     (&) (')	
7:
7:('//,	() 7:#/0. !"##$"%1&&'5'(%)/#,*)+1&&'5',+-./%0712-3() 7:435(6$/758.9%071:8 ;7:<;=('>&/?=@(A&'>/0BC@D##EDF.%015'GF HIJLKLHM/0NOPMQ.RSQTUVWTXUYZX[\].5'7^[_.`a_b/c0BOdbe(f)R&gUh5'7iej\()#&U5'7kjl(A)A&Im5'7nlo /0Npo      qr n n  2src/pages/ee/components/template/template-Template2src/pages/ee/components/template/template-Templates
t
u
v
 w
xwyuz{{
&tOv  @src/pages/ee/components/template/item/template_item-TemplateItem@src/pages/ee/components/template/item/template_item-TemplateItem |yut
&tu
v
 Ov  )src/pages/ee/components/space/space-Space)src/pages/ee/components/space/space-Space }   ×æ  ~
x



v
 yz&Ov  ¡¢£­¤
¥
¦
§
¨
©
ª«
¬­
®¯
	°±

²³
´µ
¶·
¸¹
º»
¼½
¾¿
ÀÁ
ÂÃ
ÄÅ
ÆÇ
ÈÉ
Ê
Ë
Ì
Í
Î
Ï
ÐÑ
ÒÓ
ÔÕ
Ö×
 Ø
!ÙÚ
"ÛÜ
#ÝÞ
$ßà
%á
&âã
'äå
(æç
)èé
*êë
+ìí
,îï
-ðñ
.òó
/ôõ
0ö1
1÷
2øù
3úû
4üý
5þÿ
6
7
8
9
:
;
<
=
>
?
@
A
B
C
D
E
F
G 
H¡¢
I£¤
J¥¦
K§
L¨©
Mª«
N¬­
O®¯
P°±
Q²³
R´µ
S¶·
T¸¹
Uº»
V¼½
W¾¿
XÀÁ
YÂÃ
ZÄÅ
[ÆÇ
\ÈÉ
]ÊË
^ÌÍ
_ÎÏ
`ÐÑ
aÒÓ
bÔÕ
cÖ×
dØÙ
eÚÛ
fÜÝ
gÞ
hß
iàá
jâã
käå
læç
mè
néê
oëì
píî
qïð
rñ
sòó
tôõ
uö÷
vøù
wúû
xüý
yþÿ
z
{
|
}
~












 ¡
¢£
¤¥
¦§
¨©
ª«
¬­®
 ¯°±²³´µ¶·¸¹º»}¼
 ½¾ýð¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø ¡¨ø¢£¤¨ø¥¦§¨ø¨©ª¨ø«¬­¨ø®¯°¨ø±²³¨ø´µ¶¨ø·¸¹¨øº»º¨ø¼½¼¨ø¾¿¾¨øÀÁÀ¨øÂÃÂ¨øÄÅÄ¨øÆÇÈ¨øÉÊË¨øÌÍÎ¨øÏÐÑ¨øÒÓÒ¨øÔÕÖ¨ø×ØÙ¨øÚÛÜ¨øÝÞß¨øàáà¨øâãä¨øåæç¨øèéê¨øëìí¨øîïð¨øñòó¨øôõö¨ø÷øù¨øúûü¨øýþÿ¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø ¡ ¨ø¢£¤¨ø¥¦§¨ø¨©ª¨ø«¬«¨ø­®­¨ø¯°±¨ø²³´¨øµ¶·¨ø¸¹º¨ø»¼½¨ø¾¿À¨øÁÂÃ¨øÄÅÆ¨øÇÈÉ¨øÊËÌ¨øÍÎÍ¨øÏÐÑ¨øÒÓÔ¨øÕÖ×¨øØÙÚ¨øÛÜÝ¨øÞßà¨øáâã¨øäåæ¨øçèé¨øêëì¨øíîï¨øðñò¨øóôõ¨øö÷ø¨øùúû¨øüýþ¨øÿ¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø ¡ ¨ø¢£¢¨ø¤¥¦¨ø§¨©¨øª«¬¨ø­®¯¨ø°±°¨ø²³´¨øµ¶·¨ø¸¹º¨ø»¼½¨ø¾¿¾¨øÀÁÂ¨øÃÄÅ¨øÆÇÈ¨øÉÊË¨øÌÍÎ¨øÏÐÑ¨øÒÓÔ¨øÕÖ×¨øØÙÚ¨øÛÜÛ¨øÝÞß¨øàáâ¨øãäå¨øæçè¨øéêë¨øìíì¨øîïð¨øñòó¨øôõö¨ø÷øù¨øúûü¨øýþÿ¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨ø¨øðøð¨@ @¤@¨@¬@°@´@¸@¼@ÀÄ@È@Ì@Ð@Ô@ØÜàðäè²àø ä¡è²àø¢äè²àø£äè@²àø¤äè²àø®ØøØ@àä°Ü¥àä@°ÜøÜ¦àäðèì´äø è§ì´äø¢èì´äø£èì@´äø¤èì´äø°ÜøÜ@ä¦è²à¥äè@²àøà¨äèðìð¶èø ì©ð¶èø¢ìð¶èø£ìð@¶èø¤ìð¶èø²àøà@è¨ì´ä¥èì@´äøäèìðôøªüñA¢Âù «¢Âù¢	¢Âù£A¢Âù¤	¢Âù ¾øøø@ª¡Àü¥A¡Àüø©11ª¦Ê¥ÈI11I11¾ I  ¿ ¼
½ÀX ÀXP``PÁ  
¼
½ÂP   
ÃÄ­
 Å
ÆÇ¼
½È2¸ÀXP`¸À¤X° H ¤ÀX ° ´¬°¨¬¤¬°¨ ¤èÿ`P`PÉ   ­Ã
 Ê¿ÄÅËÌ¼
½ÍkpXP`¸ÀXP`¨ÀÏXÈX¸¤¨ À X`¨¬¤ÀX¤¬¨¬°¨H³`¨ ¬¨H X¬ °¬H¨¨X°¸´¸¼´H`¢`¨¬¤À¤X¨¸°¼´¸´H´¼À¸°À°X¸¼´¼À¸¸XÀÈ ÄÈ ÌÄH`¨ëÿ```­ÿ`HPÀÍ
  
 ÎÏÐÑÒÓ¿ÔÕÖ×¼
½Ø¬pXP`  HX ¨¬¤ÀX¤¨ ¬ °´¸¼À¬Hïÿ`P` ÀX  ¤¤¨ À X¨¬¤¨¨X¬´¼À¸°À°X¸¼´¼ÄÀÄÈÀH¬ðÿ``ã`¨¬¤À¤X¬°¨¬¬X°¸ÀÄ ¼´À´X¼À¸ÀÈ ÄÈ ÌÄH°ðÿ``Æ`¬°¨À ¨X°´¬°°X´¼ÄÈ¢À¸À¸XÀÄ ¼ÄÌ¢ÈÌ¢ÐÈHÄÌ¢ÈÌ¢ÐÈH´êÿ``£`´¸ °À°X¬`¸¼´À¬¬X´¸°¼ ÀÄÈÌÐ¼H`´¼¸¼À¸H´¼¸¼À¸H`ÀØÙ  
 ÅÚÛÜÝÃÄ
ÆÇÓÞßàáâ
ãäÎåæçèÏ¼
½é° H ¤ÀX  ¤¨¬¤À¤X `¬°¨À  X¬0°¼ À¼H¬Hù`¨¬¤À¤X¨°¸¼´¬À¬X´¸°¼0ÀÄ¼H¨òÿ`ä`¬°¨À¹¨X°°¸´¬À¬X¸0¼À¸H®`´´È°`¼¼¸À¸À°¤°X´Ä°È¢ÀÄÀHÀÈÌ¤Ä ¼À¼XÄÈ¢ÀÈ Ì¤ÄÐ0Ôì  ð¶èì´äè²à¢ä°Üà®ØÐH´åÿ``¨`°´¬À¬X£`´¸°À°X´¼ÄÈ¢À¸À¸XÀÄ ¼È0ÌÔØªÐØÜ¬ÔÈH´íÿ``¸¼´À´XÀ0ÄÈÀH`ÀÄ ¼À¼X¸`ÄÈ¢ÀÀ ¸¸X¼Ì°Ð¦ÈÌÈHÈ ÐÔ¨Ì¤ÄÀÄX ÌÐ¦ÈÔ0Ø¤Üä¤è²àÔH¼ïÿ`Ü`ÄÌ¢ÈÌÐ¢ÔÈHÄ ¼À¼XÈ0ÌÔÜªØÜªàØHÔÈHÇ`ÌÌ¸Ð¦ÈÀÈÈ¤Ä`Ì¦ÄÄÈ¢À`ÐÔ¨ÌÐ¦ÈÀ¤ÀÀXÌ0ÐØÜ¬ÔÜà®Øàä°ÜÌH§`ÐÐÈ¨Ì`ØØ¸Ü¬ÔÀªÌÌÈ¦È`Ð¨ÈÈÈ¤Ä`ÔØªÐÔ¨ÌÀ¦ÄÄX`ÈÈXÔ0ØÜàÔH`Ô0ØÜàÔHéý`Í
É   
 ÄÎÏÐÑ±ÅÝÚÛßêå¿ëèìçæâ
ãäÖÓ¼
½íÝpXP` HX ¤ÀX ¤ ¨¬°¤Hñÿ`P`¸ÀÈ` À²X¸ ÀX ¤ ¤¨¬°ð´¨¸ð¼Ì°Ð¦ÈÌÈHÈ ÐÔ¨Ì¤ÄÀìÄX ÌÐ¦ÈÐ¤Ô¨Ì¤ÔØªÐÀÐXÜ ¦àÜHª Û`¤Üà®ØÀØX¬Ô`¤àä°ÜÀ®ÔÔXà ¦äàH¬¨Ë`¤Üà®ØÀØX¦Ü®¤Ä`¤àä°ÜÀÜX¦à°¬½`¦èè¸ì´äÀäÈ²à`¦ðô¸ìð¶èÀ´ààXèð´ìððô¦ü ¾øºðøô¦ü ¾øºðøô¦ü ¾øºðø´ôìH`¤ìô¶ðôø¶üðHì´äÀäXè¤ðø¸ôø¸üôH¦ð¶èø`è¤ì¦ð¶èø¼ÿ`£Ä0ÈÌÐÔØÜàäèìÄH`¤¨  À X`¨¬¤ÀX¤¨ ¤¤X° ´¸¼°H```ÀíÈ	Í
Ù  .îïðñ
 ÄÎÏÐÑßÓÖòó
 ÒÔôõö÷Ã±øëùúûüýµþ¶´ÅÿÊ¼
½´Å ¨¬¤À¤X `¬¬¸°¨À  X`¨¨¸¬¤ÀX   P`¤ ¨¤HX ¨°´¬¤À¤X¬°¨´ ¸¼ÀÄðÈÌ¤ÄøÈÌ¤Äø´H êÿ`   P`¤¤¸¨ À È`¬°¨¬¤ÀÃX¤¨ ¨¬¤¬°¨°´¬¸¼ ´À´X°`¼À¸À°°X´´È`À ÄÈÌÐðÔØªÐøÔØªÐøÀH´ ´P`¸¼´À´X°`¼À¸À°á°X¢¼0À0ÄÈ¼HÀ ÄÈÌÀH¸¨¼¨À¨Ä¨ÈÈXÌ¦ÔÜà®ØªÐÀÐXØ¦Ü¬Ôà ªäèì ð¢ôàHÌïÿ``È¤ÐØÜ¬Ô¨ÌÀÌXÔ¤ØªÐÜ à¨äèÜHÈñÿ`È¤Ð ØÜ¬Ô¨ÌÀÌXØ Ü ä¤è²à¢è¤ì´äØHÈðÿ`È¤ÐØÜ¬Ô¨ÌÀÌXÔ¤ØªÐÜ à¨äèÜHÈñÿ`Ð0ÔØÐHÈ ÈP`´¸°À±°X¼0ÄÄXÀ`ÀÄ¼HÀ ÄÈÌÀHÀ0ÄÈÀH¸¸X¼ÄÌÐ¦È¢ÀÀÀXÈÌ¤ÄÐ Ô¢ØÜàðäè²àøäè²àøÐH¼êÿ``¸ ¸P`´¸°À±°X¼0ÄÄXÀ`ÀÄ¼HÀ ÄÈÌÀHÀ0ÄÈÀH¸¸X¼ÄÌÐ¦È¢ÀÀÀXÈÌ¤ÄÐ Ô¢ØÜàðäè²àøäè²àøÐH¼êÿ``¸ ¸P`´´¸¸°À­°X¼0ÀÄ¼HÀ ÄÈÌÀHÀ0ÄÈÀH¸¸X¼ÄÌÐ¦È¢ÀÀÀXÈÌ¤ÄÐ Ô¢ØÜàðäè²àøäè²àøÐH¼êÿ``¸ ¸P`´´¸¸°À°X¼À¸¼´À³´X¼À¸ÀÄ ¼ÀÄÈ¢ÀøÈ0ÌÔÜ à®ØªÐÔÈHÀÀXÄ¢ÌÔØªÐ¦ÈÀÈXÐ¢Ô¨ÌØ Ü¦àäèðìð¶èøìð¶èøØHÄêÿ``À ÀP¯`ÀÄ ¼¡À¸À©¸XÀ Ä ¼ÀÈÌ¤ÄØÄX«Ð0ÔØÐH¤À`«Ð0ÔØÐH¤ÀÈÐ¤Ì Ð¤ÔÌHÐ Ô¢ØÜàðäè²àøäè²àøÐH ÈP`¸¼´¼À¸À¢Ä ¼Ä£È¢ÀÈ¤Ì¤ÄÌ¥Ð¦ÈÌ ÐÐX¦Ü0àä0èìÜHªÌ¦ÔÔpÔXØ ØP``Ü0àä0èìðÜHªÌØ ¦ÜàäØHÐà°¦ä°ÜàÜH¨Üªäè²à®ØÀ¨ØXªà¨ä°Üä®è²à°ììÈ¶è`°ôô¸øºðÀ¸èèÈ´ä`°ôøºðô¸ìÀ¶ääXð0¦ô®øüð§®¡Àüø¨¡ÀüøðH`ÐÔÿ`Ð¨ÔÔXà0¦äèð©ø¸ôø@¸üôHàH`Ü0à¦äÜH¬Ü0¦àÜHÔªÔXà0¦äàH ØØX§ä0èì0¦ðü0¦üH1¦IüäH`¢ä¦èäHä ¦è¤ô1¦I1¦IôHðôðøü¼ôøøü¼ôøäH`Ôä°¦è²àäàHªà¬èì´ä°ÜÀ°ÜX¬äªè²àè°ì´ä²ððÈ¸ì`²øø¸ü¼ôÀºììÈ¶è`²øü¼ôøºðÀ¸èèXô0°øôHø ¶ü²ñ¤Æù¤ÆùøHø0¦ü¶øH`ÔÌÿ`Ô·ÔXØ¬àèì´ä°ÜÀ¯ÜXä¬è²à°ììÈ¶è`°ôô¸øºðÀ¸èèÈ´ä`°ôøºðô¸ìÀ¶ääXð0ªø¬ü¼ôðHô ´ø°üñ£Äù£ÄùôHô0¦ø´üôH`ØÍÿ``Ü à¨äèìððô¸ìøðô¸ìøÜHÔ ÔP``¤¤¸¨ À X`¨¨¸«¬¤ÀX¨0¬¬°°h¨H¬0°´¸¬H¬0°´¬H`¤¤¸¨ À È`¬°¨¨¬¤ÀX¨0°§´¬¨H¬0°´¬H` À´ÙéØí ÄÎÏÿ¿¼
	½­-È`¸À¢XÀXð øøP`ÀX¨  ¤HP``P   ¼

½P   	±ýüúùø¼
½#ðøøø (øøøðøøøP  ¼
½& HpXØX0  ¤¤¸H`P`pX0HP`PÀ  
 ¼
½pX`ÀXP`P   ®
	â





ÿ
¼
½ ¸X`ÐX`¸XP÷`°  ¤¨HH°¤ ¤¨¬ HH° ¨¤¨¬°¤H H°¤¬¨¬°´¨H¤H¬°¨°´¬¤¨ ¨0¬¤´¸°¸¼´¬´¸°¨¤H¬0°¨¸¼´¼À¸°¸¼´¬¨H°0´¬¼À¸ÀÄ ¼´¼À¸°¬H¬°¨ÈÌ¤ÄÈ¢ÀÄ ¼À¸¼´¸°´¬°¨¨P  ¼
½ØX`P   s
 ®Ñ´¼
½­.ð ¤ øð ¤¨ ø ¤¨ ø ¤¨@ ø¤¬¨¬¨H  P ® AÑÐtß
ÐÒéÓ
ÑÒé
ÒÒéÜLöÎÏC
ÓÒédôÝ ¡è¢ç£æ¤ånu
ÔÒé
ÕÒé
ÖÒé¥Z
×ÒéS^
ØÒéP¿\¦§«¨i
ÙÒé
ÚÒé
ÛÒéW
ÜÒéa
ÝÒép©k¼
½­¨¨À³X¤¨¨ ¤ØÈ` X¨ `¤¨¨ ¤ØÈ` X¨ `ðøð¤ð¨¬¤ø¨¬ð°¸ð¼À¸ø¼ÀðÄÈ¢ÀøÄÈ¢ÀøÄÌÈ¨¢Àø¸ø¼À¸ø¼À¸ø´¨¬ø¤ø¨¬¤ø¨¬¤ø´¨¸°´¬¬È¨`°ð´¸°ø´¸ð¼Ì¨Ð¦ÈÌ¤ÄÀ¨¸ø¼ÄÀ¨¸ø°ø´¸°ø´¸°ø¨ ¨ø¬°°¨¬ð¸¨¼´¸°¨Hø ð¤¬´¨°´´°¨ ø¤¨ ø¤ ¨ ø¤¡¨ øø¢¤ ¨øøøøPÆ`¨¨£ÀáXð¤øð¤ð¨¥¬¤ø¨¬ð°Ä¨È¢ÀÄ ¼¼È¸`ÀðÄ¦È¢ÀøÄÈðÌ§Ð¦ÈøÌØ¨Ü¬ÔØªÐ¦ÈøÌ¨ÔÐ¨¦Èø¢ÀøÄÈ¢ÀøÄÈ¢Àø ¸È¨Ì¤ÄÈ¢ÀÀÈ ¼`ÄðÈ©Ì¤ÄøÈÌðÐ§Ô¨ÌøÐÜ¨à®ØÜ¬Ô¨ÌøÐªØÔ¨¨Ìø¤ÄøÈÌ¤ÄøÈÌ¤Äø¢¼´¨¬ø°«¸´¨¬ø¤ø¨¬¤ø¨¬¤ø´¨¸°´¬¬È¨`°ð´¬¸°ø´¸ð¼Ì¨Ð¦ÈÌ¤ÄÀ¨¸ø¼­ÄÀ¨¸ø°ø´¸°ø´¸°ø¨ ¨ø¬°°¨¬ð¸¨¼´¸°´ð®¸È¨Ì¤Ä¯È¢ÀÀX°¼`±¼´ø¯¸Ð¨Ô¨Ì¯Ð¦È¤¤ÄÈ¢ÀØÀX¼`²¼´ø³¸Ð¨Ô¨Ì³Ð¦È¤¤ÄÈ¢ÀØÀX¼`²¼´ø¨Hø ð¤´¬´¨°´´°¨ ø¤¨ ø¤ ¨ ø¤¡¨ øøµ¤ ¨øøøøPÜ`ð¶øð¤ð¨·¬¤ø¨¬ð°Ä¨È¢ÀÄ ¼¼È¸`ÀðÄ¸È¢ÀøÄÈðÌ§Ð¦ÈøÌØ¨Ü¬ÔØªÐ¦ÈøÌ¹ÔÐ¨¦Èø¢ÀøÄÈ¢ÀøÄÈ¢Àø ¸È¨Ì¤ÄÈ¢ÀÀÈ ¼`ÄðÈºÌ¤ÄøÈÌðÐ§Ô¨ÌøÐÜ¨à®ØÜ¬Ô¨ÌøÐ»ØÔ¨¨Ìø¤ÄøÈÌ¤ÄøÈÌ¤Äø¢¼´¨¬ø¤ø¨¬¤ø¨¬¤ø´¨¸°´¬¬È¨`°ð´¼¸°ø´¸ð¼Ì¨Ð¦ÈÌ¤ÄÀ¨¸ø¼½ÄÀ¨¸ø°ø´¸°ø´¸°ø¨ ¨ø¬°°¨¬ð¸¨¼´¸°´ð®¸È¨Ì¤Ä¯È¢ÀÀX°¼`±¼´ø¯¸Ð¨Ô¨Ì¯Ð¦È¤¤ÄÈ¢ÀØÀX¼`²¼´ø³¸Ð¨Ô¨Ì³Ð¦È¤¤ÄÈ¢ÀØÀX¼`²¼´ø¨Hø ð¤¾¬´¨°´´°¨ ø¤¨ ø¤ ¨ ø¤¡¨ øø¿¤ ¨øøøøP   ¯¶´ï î¼
½ª   H ¬ °¤¬¨¬°´¨H¤¨ð¬°¨ø¬°¨øH«´«  ¼
½­    
 ®Ñ´¼
½­(ð øð ø ø @ø¤ ¤ H P ®« IÑ¬­®¯°±²³´µ¿ß
áù
Ð¶·«¸¹CÝã¯ÎÏº»
âù
Ó
ãù
¼ÌÉBÜô½
äù
?¾
åù

æù
ð¿EÀ¡èÁç£æ¤å<
çù
ÂòÃ¿\¦§G¼
½­ÿ¨¨¬¤¨ ¤ÐX`@ H ¤¨¬È¨Ì¤ÄÈ¢ÀÄ ¼¸¼´Ð´X°`ÀÄ ¼¸¼´Ð´X°`ÀÄ ¼¸¼´Ð´X°`´¸°Ì¨Ð¦ÈÌ¤ÄÈ¢À   ¼À¸Ð¸X´`ÄÈ¢À ¤ ¼À¸Ð¸X´`¸¼´À Ü¨à®ØÜ¬ÔØªÐ¨¨¨ÌÐ¦ÈÐÈXÄ`ÈÌ¤ÄÀHÄ à¨ä°Üà®ØÜ¬Ôª¬ªÐÔ¨ÌÐÌXÈ`ÌÐ¦ÈÄHÄÈ¢ÀÐÀXüÁ`ÄÌ¢ÈÌðÐÔ¨ÌøÐÔðØè¨ì´äè²àä°Ü¬ÔøØÜ¬ÔøØÜ¬ÔøØÜ¬ÔøØÜ¬ÔøØì¨ð¶èì´äè²àè¨´äèè°°Ü¬ÔøØÜ¬ÔøØÜðàä°Üø¬Ôø¨ÌøÐØ Ü¬Ô¨ÌøÐÔ¨Ìø¢ÐÈH ¨ ¸¨¼´¸°´¬¨HH  °¨´¬°¨¬¤ H¤ ´¨¸°´¬°¨¤H¨ ¸¨¼´¸°´¬¨H¤ð¨ ¬¤ø¨¬ð¡°¸ð¼¢À¸ø¼Àð¡Ää¨è²àä°Ü£à®Ø¬¬ÔØªÐÐÐXÌ`ÐÔ¨Ì¤ÐÈ¨¢ÀøÄÈð¥ÌØÜ¬ÔØÔXÐ`¦Ð¦Èø¢Àø§ÄÌÈ¨¢Àø¸ø¼¨À¸ø¼À¸øØ¨Ü¬ÔØªÐ©Ô¨Ì¦¦ÈÌ¤ÄÐÄXÀ`ÄÈ¢ÀÀÈ ¼´`ÄðÈªÌ¤ÄøÈÌð¡Ðð¨ô¸ìð¶è©ì´ä²²àä°ÜÐÜXØ`Üà®Ø¤ÜÔ¨¨ÌøÐÔð¥Øäè²àØàXÜ`«Ü¬Ôø¨Ìø§Ð¬ØÔ¨¨Ìø¤ÄøÈ¨Ì¤ÄøÈÌ¤Äø¢¼Ð¨Ô¨ÌÐ¦È­Ì¤ÄÄÈ¢ÀÃ`ÈðÌ®Ð¦ÈøÌÐð¡ÔÜðà¯ä°Üøàäð°èô !©¥È¤Æ±£ÄIôH´äø§è²ðì¨´äø°Üøà³ä°Üøàä°ÜøØ¨ªÐø´ÔØðµÜ¶à®Øø·Ü¸à®Øø¹Üºà®ØøÜ»à®ØøªÐø§Ô¼ÜØ¨ªÐø¦ÈøÌ½Ð¦ÈøÌÐ¦Èø¤ÀÄðÈ¾Ì¤ÄøÈÌð¡ÐØÔ¨¨Ìø¿ÐÀÔ¨Ìø§ÐÁØÔ¨¨Ìø¤ÄøÈÂÌ¤ÄøÈÌ¤Äø´¨¬ø°´ðÃ¸ÀÀXÄ¼`Å¼´ø¸ÄÈ¢ÀØÀX¼`Æ¼´ø¸ÄÈ¢ÀØÀX¼`Æ¼´ø¬ø§°Ç¸´¨¬ø¤ø¨½¬¤ø¨¬¤ø¤P «           Ä°±Å³Æ
 ´µß
àù
ÑÐ¬¶·«¸ÇC¯ÎÏ¼
½­¨¬¤ ¤ÐX`¨¬¤ ¤ÐX` ¬°¨¤¨ Ð X` ¤°´¬¨¬¤Ø¤È `¬°¨  X¤ÀÄ ¼À¸¼´¤°´¬Ð¬X¨`¬°¨`¨ °´¬¨H¬ ´¸°¬H¨ð¬°¨ø¬°ð´Ä¨È¢ÀÄ ¼À¸°ø´¸°ø´¸°ø´¸°ø´¸°ø´¸°ø´È¨Ì¤ÄÈ¢ÀÄ ¼Ä¨¢ÀÄÄ°¸°ø´¸°ø¨ø¬´ ¸°¨ø¬°¨ø¨P    «   ·¶´ï î¼
½È   H ¬ °¤¬¨¬°´¨H¤¨ð¬°¨ø¬°¨øH«´«  ²
¼
½­	 0  ¤¨Hª  |
 ®Ñ´¼
½­,ð  øð ¤ø ¤ø ¤@ø ¨¤¨¤H P ® `Ñ¬É°±
 §´ÊµºB»ËÌÍÎ¶tß
¨æÓÏ
©æ¥ÜÐöÎÏ
ªæ
«æ¼³ÌÝÉ!ô
¬æ½7
­æ«(
®æÐ¾
¯æ
°æð¿$À¡èÁç£æ¤å¿Ñ¦ÓÒ2
±æ
²æ
³æ
´æ
µæ
¶æ*4,
·æ
¸æ
¹æ	Ó:¼
½­º ¨¤ ÐX`ÐX`È` ¤ ÈX` ¬¨°¨¬¤¨ H  ¬°¨Ø¨X¤`¤ H ¨¨¬¤¨ ¤H ¬¨°¨¬¤¨ HpX`  °¨´¬°¨¬¤ HpX `¤ ´¨¸°´¬°¨¤H  p X¤`¨ ¸¨¼´¸°´¬¨H¤¤p¤X¨ `´¨¸°´¬°¨°¨´¬¤À¤X¨¬°´¸¼ÀÄðÈÌ¤ÄøÈÌðÐô¨øºðô¸ìð¶è´¨´äè²àÐàXÜ`ìð¶è´¬´äè²àÐàXÜ`àä°ÜÜÈ®Ø³`àðäè²àøäèðìð¶èøì©£Ä¢Â¡Àü¾°¾øü¼ôÐôXð`¡Àü¾´¾øü¼ôÐôXð`ôøºð¶èøìôð¨¶èø²àøä è²àø¡ä¢è²àø°ØÜðà£ä°Üøàäðèððô¤øºðøôøðü© ¨Î§Ì¥¦ÊÈ¸È	¤ÆÑY	`¦£Ä§© ¾øø¨üñ©¢Âù ¾øøüª© ¾øøºðøô«øºðø¡ô¢øºðøôðø¬ü¼ôøøüð ©¤©Ð ¨Î­§ÌÊ¼Ê	¥ÈÑY	`¦¤Æ§©¡Àüø¨ñ©£Äù¡Àüø®©¡Àüø¼ôøø«ü¼ôø¡ø¢ü¼ôøøðü¯ ¾øøüñ¨ñ°¤Æù¢Âù±©¢Âù ¾øøü² ¾øø¡ü¢ ¾øøì¨´äøè³ðì¨´äø°Üøà²ä°Üø¡à¢ä°Üøàðä´è²àøäèðì©¤Æ£Äµ¢ÂÀÀÀü	 ¾øÐøXô` ø¦ü¼ôð¨¶èø¨ìðð©ôøºðø¶èøì¶ôð¨¶èø²àøä«è²àø¡ä¢è²àøô¨øºðô¸ì·ð¶èèÈ´äÃ`ìðð¸ô¸ìøðôðøñ¹¢Âùñº!¤!´©¸®Ú°´­Ø¬»°¬Ö¨§¤I¤I¤Æù¼©¤Æù¢Âù½¢Âù¡¢¢Âùü¨¼ôø¾øüð¿À¡ÀüøÁÂ¡ÀüøÃÄ¡Àüø¡Å¡Àüø¼ôøøÆü¨¼ôø¸ìøð²ô¸ìø¡ð¢ô¸ìø¶äÔ¨¨Ìø¨ÐÔðÇØààXÈÜ`ÉÜ¬ÔøÊØäè²àØàXÜ`Ü¬ÔøËØÜ¬Ôø°ØÜ¬Ôø¨Ìø¾ÐÔð¿ØÌàè¨´äèè°°Ü¬ÔøÁØÂÜ¬ÔøÃØÄÜ¬Ôø¡ØÅÜ¬Ôø¨ÌøÐÍØÔ¨¨Ìø¤ÄøÈ²Ì¤Äø¡È¢Ì¤ÄøÄP`¨¬°´¸¼ÀÄðÈÎÌ¤ÄøÈÌðÐØðÜÏà®ØøÜàðäìððÐô¸ìøðôðø©§Ì¦Ê¥¥ÈÆ¨Æ	£ÄÑY	`¦¢Â§ü¨¼ôø¨øüð©¡Àüø¼ôøøªü¨¼ôø¸ìøð«ô¸ìø¡ð¢ô¸ìøððôÑøºðøôøðü© ¨Î§Ì­¦ÊÈ¬È	¤ÆÑY	`¦£Ä§© ¾øø¨üñ©¢Âù ¾øøüÒ© ¾øøºðøô«øºðø¡ô¢øºðøôðøÓü¼ôøøüðñÔ¤Æùñ´©¸®Ú°´­Ø¬µ°¬Ö¨Ô°Ô¤¨	ªÒ Ñ Y	` ¦¤©Ð©¦Êù¨ñ© ¨Îù¦ÊùÕ©¦Êù¤Æù«¤Æù¡¢¤Æù©¡Àüø¨ñ°£Äù¡ÀüøÖ©¡Àüø¼ôøø²ü¼ôø¡ø¢ü¼ôøè¨²àøä×ìè¨²àø®ØøÜ²à®Øø¡Ü¢à®Øøì¨ð¶èì´ä·è²ààÈ°ÜÃ`äðèØì´äøèìððøðüÙ ¾øøüñº!!¬©°¬Ö¨¬«Ô¤»¨ªÒ ¥I¢I¢Âù¼©¢Âù ¾øøü½ ¾øø¡ü¢ ¾øøô¨¸ìø¾ðôð¿øÀü¼ôøÁøÂü¼ôøÃøÄü¼ôø¡øÅü¼ôø¸ìøðÚøô¨¸ìø´äøè²ì´äø¡è¢ì´äø²Üü¨ ¾øü¼ôøºð¸´¸ìð¶èÐèXä`ôøºð¸¸¸ìð¶èÐèXä`èì´ääÈ²à³`èðìÛð¶èøìððôøºðøô©¥È¤Æ£ÄÂ¼Â	¡ÀüÐüXø`£ÄÂÀÂ	¡ÀüÐüXø` ü ¾øºðøôÜüø¨ºðø¶èøì ð¶èø¡ì¢ð¶èø´àÔ¨¨Ìø¨ÐÔðÇØààXÈÜ`ÉÜ¬ÔøÊØäè²àØàXÜ`Ü¬ÔøËØÜ¬Ôø°ØÜ¬Ôø¨Ìø¾ÐÔð¿ØÝàè¨´äèè°°Ü¬ÔøÁØÂÜ¬ÔøÃØÄÜ¬Ôø¡ØÅÜ¬Ôø¨ÌøÐÞØÔ¨¨Ìø¤ÄøÈ²Ì¤Äø¡È¢Ì¤ÄøÄP
            ¹¶´ï î¼
½Ô   H ¬ °¤¬¨¬°´¨H¤¨ð¬°¨ø¬°¨øH«´«  ¼
½­    ®°¼
½­ð øð@ø HP® Õ°Ö¬×¼
½­$pX0Hðøø X °¤¤¨ H`øP`P   
 ®Ñ´¼
½­. ð¤¨  ø ð ¤¨¬¤ø ¤¨¬¤ø ¤¨¬@¤ø ¨°¬°¬H ¤P ®~« ¬ØÙÚß
ÈØ×Ñ¸ÛìÜÐ¹ÎÏÝÞ
ÉØ×ß·à¼
 ½­Ê¨¨¬¤¨  ÐX`  ÀÈ`¤¨¨ ¤ Ø½X ¤¨¨ ¤¤¨ ¤¤°Hðøð°¨´¬°¨¬¤¬¨¨¬¬° ø¬¨°¨¬¤¨ ø¬¨°¨¬¤¨ øø  øøé`¬¨°¨¬¤ ¤ÐX`   ¤ÀÈ`¨¨¬¤¨ ¤ Ø½X ¨¨¬¤¨ ¨¨¤¨¨°Hðøð ´¨¸°´¬°¨°¨¬°°°¤ø °¨´¬°¨¬¤ø °¨´¬°¨¬¤øø  ¤øø` ¨¨¬¤¨ ¨¨¤¨¨°HP~  « ~   ®àÚÞ¬á¸âãäåæç
èé»¶´ï î¼
!½êd  øð ø ø ø ø ø øðø0¤¬ °¨ H¨ ¤ ¨ ¤HX¤0¨ ¤¬ °¨ H 0¤¨¬ H`¤0¨ ¤¬ °¨ H 0¤¨¬ H  ¤  ¤H  ° ´¨°¬°´¸¬H¨¬ð°´¬ø°´¬øH	®àÚÞ¬á«´  º
 ¸
¼
"½­ 0  ¤¨H 0  ¤¨HÔÈ   ëê~Þ¬È´ØªÀÍ
ÔÉ ÁíéáÂÙ«à®ÚÈ	ì